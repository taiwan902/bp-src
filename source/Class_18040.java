/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.apache.commons.io.IOUtils
 */
import java.io.InputStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.net.URL;
import java.net.URLConnection;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import org.apache.commons.io.IOUtils;

public final class Class_18040
extends Thread {
    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void Method_18041() {
        try {
            URLConnection uRLConnection = new URL("https://sessionserver.mojang.com/blockedservers").openConnection();
            List list = IOUtils.readLines((InputStream)uRLConnection.getInputStream());
            Set set = Class_38936.Field_38938;
            synchronized (set) {
                Class_38936.Field_38938.addAll(list);
            }
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }

    private void Method_18042() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_18040() {
    }
}

