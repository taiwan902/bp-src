/*
 * Decompiled with CFR 0.145.
 */
import java.io.File;
import java.io.FilenameFilter;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_25720
implements FilenameFilter {
    final Class_31083 Field_25721;

    public boolean Method_25722(File file, String string) {
        return string.endsWith(".mcr");
    }

    Class_25720(Class_31083 class_31083) {
        this.Field_25721 = class_31083;
    }

    private void Method_25723() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

