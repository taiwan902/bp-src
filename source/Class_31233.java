/*
 * Decompiled with CFR 0.145.
 */
import java.io.InputStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_31233
implements Class_19214 {
    public void Method_31234() {
    }

    public InputStream Method_31235(String string) {
        return Class_31233.class.getResourceAsStream(string);
    }

    public String Method_31236() {
        return Class_12440.Field_12576;
    }

    public boolean Method_31237(String string) {
        return (224 & 10257) != 0;
    }

    private void Method_31238() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

