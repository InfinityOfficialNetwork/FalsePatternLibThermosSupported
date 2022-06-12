package com.falsepattern.lib.internal.proxy;

import com.falsepattern.lib.internal.FalsePatternLib;
import com.falsepattern.lib.internal.Tags;
import com.falsepattern.lib.updates.UpdateChecker;
import com.falsepattern.lib.util.AsyncUtil;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import lombok.val;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.util.IChatComponent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

@SideOnly(Side.CLIENT)
public class ClientProxy extends CommonProxy {
    private Future<List<IChatComponent>> chatFuture;

    @Override
    public void preInit(FMLPreInitializationEvent e) {
        super.preInit(e);
        MinecraftForge.EVENT_BUS.register(this);
    }

    @Override
    public void postInit(FMLPostInitializationEvent e) {
        super.postInit(e);
        chatFuture = AsyncUtil.asyncWorker.submit(new Callable<List<IChatComponent>>() {
            @Override
            public List<IChatComponent> call() throws Exception {
                //Deadlock avoidance
                if (updatesFuture == null || updatesFuture.isCancelled()) {
                    chatFuture = null;
                    return null;
                }
                if (!updatesFuture.isDone()) {
                    chatFuture = AsyncUtil.asyncWorker.submit(this);
                    return null;
                }
                val updates = updatesFuture.get();
                return UpdateChecker.updateListToChatMessages(Tags.MODNAME, updates);
            }
        });
    }

    @SubscribeEvent
    public void onSinglePlayer(EntityJoinWorldEvent e) {
        if (chatFuture == null ||
            !(e.entity instanceof EntityPlayerSP)) return;
        val player = (EntityPlayerSP) e.entity;
        try {
            for (val line: chatFuture.get(1, TimeUnit.SECONDS)) {
                player.addChatMessage(line);
            }
            chatFuture = null;
        } catch (Exception ex) {
            FalsePatternLib.getLog().warn(ex);
        }
    }
}