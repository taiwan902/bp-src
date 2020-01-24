/*
 * Decompiled with CFR 0.145.
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_24588
implements Class_20084 {
    private File Field_24589;

    private void Method_24590() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public InputStream Method_24591(String string) {
        try {
            File file = new File(this.Field_24589, string);
            if (!file.exists()) {
                file = new File(string);
            }
            return new FileInputStream(file);
        }
        catch (IOException iOException) {
            return null;
        }
    }

    public Class_24588(File file) {
        this.Field_24589 = file;
    }
}

