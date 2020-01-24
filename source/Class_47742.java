/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.nio.ByteBuffer;

public abstract class Class_47742
extends Class_34813 {
    public final boolean Method_47743() {
        return this.unwrap().release();
    }

    public Class_21482 Method_47744() {
        return this.Method_47748();
    }

    public ByteBuffer Method_47745(int n, int n2) {
        return this.unwrap().Method_22614(n, n2);
    }

    public ByteBuffer Method_47746(int n, int n2) {
        return this.Method_47745(n, n2);
    }

    private void Method_47747() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public final Class_22553 Method_47748() {
        this.unwrap().Method_22637();
        return this;
    }

    public final int Method_47749() {
        return this.unwrap().refCnt();
    }

    protected Class_47742(int n) {
        super(n);
    }
}

