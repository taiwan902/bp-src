/*
 * Decompiled with CFR 0.145.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_12143
extends FileNotFoundException {
    public Class_12143(File file, String string) {
        Object[] arrobject = new Object[4098 & 9610];
        arrobject[145 & -31710] = string;
        arrobject[16389 & 2323] = file;
        super(String.format("'%s' in ResourcePack '%s'", arrobject));
    }

    private void Method_12144() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

