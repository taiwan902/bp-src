/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_15873
extends IllegalStateException {
    public Class_15873(int n) {
        this("refCnt: " + n);
    }

    public Class_15873(String string) {
        super(string);
    }

    public Class_15873(int n, int n2) {
        this("refCnt: " + n + ", " + (n2 > 0 ? "increment: " + n2 : "decrement: " + -n2));
    }

    public Class_15873() {
    }

    private void Method_15874() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

