/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_27914 {
    private static final Integer[] Field_27915 = new Integer[-1608187905 & 1114111];

    static {
        int n = Field_27915.length;
        for (int i = 1352 & 22688; i < n; ++i) {
            Class_27914.Field_27915[i] = i;
        }
    }

    public static Integer Method_27916(int n) {
        return n > 0 && n < Field_27915.length ? Field_27915[n] : Integer.valueOf(n);
    }

    private void Method_27917() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

