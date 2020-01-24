/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_27372 {
    public static void Method_27373(int n, int n2, int n3) {
        if (n2 < 0) {
            throw new ArrayIndexOutOfBoundsException("Start index (" + n2 + ") is negative");
        }
        if (n2 > n3) {
            throw new IllegalArgumentException("Start index (" + n2 + ") is greater than end index (" + n3 + ")");
        }
        if (n3 > n) {
            throw new ArrayIndexOutOfBoundsException("End index (" + n3 + ") is greater than array length (" + n + ")");
        }
    }

    private void Method_27374() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

