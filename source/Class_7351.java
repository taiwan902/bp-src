/*
 * Decompiled with CFR 0.145.
 */
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_7351
extends InputStream {
    private boolean Field_7352 = -23650 & 4096;
    private final String Field_7353;
    private final InputStream Field_7354;

    public Class_7351(InputStream inputStream, Class_2080 class_2080, String string) {
        this.Field_7354 = inputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        new Exception().printStackTrace(new PrintStream(byteArrayOutputStream));
        this.Field_7353 = "Leaked resource: '" + class_2080 + "' loaded from pack: '" + string + "'\n" + byteArrayOutputStream.toString();
    }

    private void Method_7355() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public int Method_7356() {
        return this.Field_7354.read();
    }

    protected void Method_7357() {
        if (!this.Field_7352) {
            Class_37389.Method_37400().warn(this.Field_7353);
        }
        Object.super.finalize();
    }

    public void Method_7358() {
        this.Field_7354.close();
        this.Field_7352 = 805 & 8265;
    }
}

