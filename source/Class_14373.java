/*
 * Decompiled with CFR 0.145.
 */
import java.io.File;
import java.io.FileFilter;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public final class Class_14373
implements FileFilter {
    private void Method_14374() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_14373() {
    }

    public boolean Method_14375(File file) {
        int n = file.isFile() && file.getName().endsWith(".zip") ? 805 & 17625 : 1065 & 2178;
        int n2 = file.isDirectory() && new File(file, "pack.mcmeta").isFile() ? -19183 & 581 : 5440 & 17065;
        return (n != 0 || n2 != 0 ? 2305 & -14603 : 130 & 7696) != 0;
    }
}

