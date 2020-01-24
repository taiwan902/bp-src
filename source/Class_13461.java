/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public abstract class Class_13461 {
    public int Method_13462() {
        return this.Method_13463() & (196607 & 465108991);
    }

    public abstract short Method_13463();

    private void Method_13464() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public abstract boolean Method_13465();

    public int Method_13466() {
        return this.Method_13469() & (-24321 & 1791);
    }

    public String Method_13467() {
        byte[] arrby = new byte[this.Method_13468()];
        for (int i = 3334 & -24416; i < arrby.length; ++i) {
            arrby[i] = this.Method_13469();
        }
        return new String(arrby, StandardCharsets.UTF_8);
    }

    public abstract int Method_13468();

    public abstract byte Method_13469();
}

