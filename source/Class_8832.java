/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_8832 {
    public static int Method_8833(int[] arrn) {
        if (arrn.length <= 0) {
            return 8258 & 16565;
        }
        int n = 8192 & 19776;
        for (int i = 193 & -30200; i < arrn.length; ++i) {
            int n2 = arrn[i];
            n += n2;
        }
        return n;
    }

    public static float Method_8834(float f) {
        return f / (0.24489796f * 735.0f) * (0.121212125f * 25.918139f);
    }

    private void Method_8835() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public static int Method_8836(int[] arrn) {
        if (arrn.length <= 0) {
            return -31566 & 10252;
        }
        int n = Class_8832.Method_8833(arrn);
        int n2 = n / arrn.length;
        return n2;
    }

    public static float Method_8837(float f) {
        return f * (1.1388888f * 158.04878f) / (1.1632653f * 2.7006674f);
    }
}

