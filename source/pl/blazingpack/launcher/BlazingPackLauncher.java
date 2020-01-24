/*
 * Decompiled with CFR 0.145.
 */
package pl.blazingpack.launcher;

import java.io.File;
import java.lang.reflect.Method;
import java.net.URI;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.CodeSource;
import java.security.ProtectionDomain;

public class BlazingPackLauncher {
    public static boolean isUpdating = false;

    public static void main(String[] args) throws Throwable {
        do {
            File d = Paths.get(BlazingPackLauncher.class.getProtectionDomain().getCodeSource().getLocation().toURI()).toFile().getParentFile();
            File u = new File(d, String.valueOf(d.getName()) + "App.jar.new");
            File o = new File(d, String.valueOf(d.getName()) + "App.jar");
            if (u.exists()) {
                Files.delete(o.toPath());
                u.renameTo(o);
            }
            URLClassLoader ucl = new URLClassLoader(new URL[]{o.toURI().toURL()}, BlazingPackLauncher.class.getClassLoader());
            ucl.loadClass("net.minecraft.client.main.Main").getDeclaredMethod("main", String[].class).invoke(null, new Object[]{args});
            ucl.close();
        } while (isUpdating);
    }
}

