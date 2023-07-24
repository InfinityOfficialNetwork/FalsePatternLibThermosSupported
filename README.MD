THIS PROJECT IS DEAD UNTIL THE FOLLOWING ISSUE IS FIXED!

`[09:25:59] [main/ERROR]: Error transforming cpw.mods.fml.common.registry.GameData with FmlRegistry: can't find 4095 constant in any method
[09:25:59] [main/INFO]: [java.lang.Throwable$WrappedPrintStream:println:748]: java.lang.reflect.InvocationTargetException
[09:25:59] [main/INFO]: [java.lang.Throwable$WrappedPrintStream:println:748]: 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
[09:25:59] [main/INFO]: [java.lang.Throwable$WrappedPrintStream:println:748]: 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
[09:25:59] [main/INFO]: [java.lang.Throwable$WrappedPrintStream:println:748]: 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
[09:25:59] [main/INFO]: [java.lang.Throwable$WrappedPrintStream:println:748]: 	at java.lang.reflect.Method.invoke(Method.java:497)
[09:25:59] [main/INFO]: [java.lang.Throwable$WrappedPrintStream:println:748]: 	at cpw.mods.fml.relauncher.ServerLaunchWrapper.run(ServerLaunchWrapper.java:43)
[09:25:59] [main/INFO]: [java.lang.Throwable$WrappedPrintStream:println:748]: 	at cpw.mods.fml.relauncher.ServerLaunchWrapper.main(ServerLaunchWrapper.java:12)
[09:25:59] [main/INFO]: [java.lang.Throwable$WrappedPrintStream:println:748]: Caused by: java.lang.NoClassDefFoundError: cpw/mods/fml/common/registry/GameData
[09:25:59] [main/INFO]: [java.lang.Throwable$WrappedPrintStream:println:748]: 	at java.lang.Class.getDeclaredMethods0(Native Method)
[09:25:59] [main/INFO]: [java.lang.Throwable$WrappedPrintStream:println:748]: 	at java.lang.Class.privateGetDeclaredMethods(Class.java:2701)
[09:25:59] [main/INFO]: [java.lang.Throwable$WrappedPrintStream:println:748]: 	at java.lang.Class.privateGetMethodRecursive(Class.java:3048)
[09:25:59] [main/INFO]: [java.lang.Throwable$WrappedPrintStream:println:748]: 	at java.lang.Class.getMethod0(Class.java:3018)
[09:25:59] [main/INFO]: [java.lang.Throwable$WrappedPrintStream:println:748]: 	at java.lang.Class.getMethod(Class.java:1784)
[09:25:59] [main/INFO]: [java.lang.Throwable$WrappedPrintStream:println:748]: 	at cpw.mods.fml.common.launcher.FMLDeobfTweaker.injectIntoClassLoader(FMLDeobfTweaker.java:40)
[09:25:59] [main/INFO]: [java.lang.Throwable$WrappedPrintStream:println:748]: 	at net.minecraft.launchwrapper.Launch.launch(Launch.java:115)
[09:25:59] [main/INFO]: [java.lang.Throwable$WrappedPrintStream:println:748]: 	at net.minecraft.launchwrapper.Launch.main(Launch.java:28)
[09:25:59] [main/INFO]: [java.lang.Throwable$WrappedPrintStream:println:748]: 	... 6 more
[09:25:59] [main/INFO]: [java.lang.Throwable$WrappedPrintStream:println:748]: Caused by: java.lang.ClassNotFoundException: cpw.mods.fml.common.registry.GameData
[09:25:59] [main/INFO]: [java.lang.Throwable$WrappedPrintStream:println:748]: 	at net.minecraft.launchwrapper.LaunchClassLoader.findClass(LaunchClassLoader.java:191)
[09:25:59] [main/INFO]: [java.lang.Throwable$WrappedPrintStream:println:748]: 	at java.lang.ClassLoader.loadClass(ClassLoader.java:424)
[09:25:59] [main/INFO]: [java.lang.Throwable$WrappedPrintStream:println:748]: 	at java.lang.ClassLoader.loadClass(ClassLoader.java:357)
[09:25:59] [main/INFO]: [java.lang.Throwable$WrappedPrintStream:println:748]: 	... 14 more
[09:25:59] [main/INFO]: [java.lang.Throwable$WrappedPrintStream:println:748]: Caused by: com.falsepattern.endlessids.asm.AsmTransformException: can't find 4095 constant in any method
[09:25:59] [main/INFO]: [java.lang.Throwable$WrappedPrintStream:println:748]: 	at com.falsepattern.endlessids.asm.transformer.FmlRegistry.transform(FmlRegistry.java:36)
[09:25:59] [main/INFO]: [java.lang.Throwable$WrappedPrintStream:println:748]: 	at com.falsepattern.endlessids.asm.IETransformer.transform(IETransformer.java:74)
[09:25:59] [main/INFO]: [java.lang.Throwable$WrappedPrintStream:println:748]: 	at net.minecraft.launchwrapper.LaunchClassLoader.runTransformers(LaunchClassLoader.java:279)
[09:25:59] [main/INFO]: [java.lang.Throwable$WrappedPrintStream:println:748]: 	at net.minecraft.launchwrapper.LaunchClassLoader.findClass(LaunchClassLoader.java:176)
[09:25:59] [main/INFO]: [java.lang.Throwable$WrappedPrintStream:println:748]: 	... 16 more`



A library for 1.7.10 with lots of useful stuff, licensed under the LGPLv3 license.

| Package                                                         | Contents / Purpose                                                                                                                      |
|-----------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------|
| [asm](src/main/java/com/falsepattern/lib/asm)                   | ASM helper code                                                                                                                         |
| [compat](src/main/java/com/falsepattern/lib/compat)             | Code backported from vanilla 1.12.2                                                                                                     |
| [config](src/main/java/com/falsepattern/lib/config)             | 1.12.2-style annotation-based config library                                                                                            |
| [dependencies](src/main/java/com/falsepattern/lib/dependencies) | Runtime dependency loader which uses Maven (DEPRECATED, see [The new data-driven dependency format](src/main/resources/DEPENDENCIES.md) |
| [mapping](src/main/java/com/falsepattern/lib/mapping)           | Notch-SRG-MCP name mapping helper code                                                                                                  |
| [mixin](src/main/java/com/falsepattern/lib/mixin)               | Mixin loader plugin boilerplate code                                                                                                    |
| [text](src/main/java/com/falsepattern/lib/text)                 | Better Chat and GUI text processing                                                                                                     |
| [toasts](src/main/java/com/falsepattern/lib/toasts)             | The toast system from newer versions, with some extras                                                                                  |
| [updates](src/main/java/com/falsepattern/lib/updates)           | Helper code for update checking                                                                                                         |
| [util](src/main/java/com/falsepattern/lib/util)                 | Additional utilities that do not fit the above categories, see below for more information                                               |

The contents of the [util](src/main/java/com/falsepattern/lib/util) package so far:

| Class                                                                        | Purpose                                                                                                                           |
|------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------|
| [FileUtil](src/main/java/com/falsepattern/lib/util/FileUtil.java)            | Directory and file utilities.                                                                                                     |
| [LangUtil](src/main/java/com/falsepattern/lib/util/LangUtil.java)            | Utility for having default language values defined inside code instead of lang files                                              |
| [MathUtil](src/main/java/com/falsepattern/lib/util/MathUtil.java)            | Miscellaneous math helper code                                                                                                    |
| [ReflectionUtl](src/main/java/com/falsepattern/lib/util/ReflectionUtil.java) | Reflection helper code                                                                                                            |
| [RenderUtil](src/main/java/com/falsepattern/lib/util/RenderUtil.java)        | Rendering tools. Currently, the only thing implemented is a way to grab the current partial tick time from the minecraft instance |
| [ResourceUtil](src/main/java/com/falsepattern/lib/util/ResourceUtil.java)    | Methods for efficiently retrieving resources from SPECIFIC jar files instead of the entire classpath                              |

See the [@StableAPI](src/main/java/com/falsepattern/lib/StableAPI.java) annotation's javadoc for more information about
API stability.

The update checker module and the library downloader module can be toggled with the `ENABLE_UPDATE_CHECKER` and 
`ENABLE_LIBRARY_DOWNLOADS` booleans in the `falsepatternlib.cfg` config file respectively.
