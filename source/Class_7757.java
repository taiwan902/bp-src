/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_7757
implements Class_7380 {
    private final Class_42962 Field_7758;
    private static final Class_2080 Field_7759 = new Class_2080(Class_7757.Method_7761("\u0001\u0011\u0001\u0000\u0004\u0006\u0014\u0007\u001a\u0019\u001b\b\u001c\f\f\u001f\u0010\u0012\u0011\u0011\u0007\u0015\u0014\u0016\u001a\u0019\u001b\u0018\u001c\u000e\u001c\u001d\u0013#\u0010\u0001\u0014\u0007\u0017\u0004\u001b\u001b"));

    private void Method_7760() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private static String Method_7761(String string) {
        int n = 19882;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_7757.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public boolean Method_7762() {
        return (-20224 & 1570) != 0;
    }

    public void Method_7763(Class_46025 class_46025, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.Field_7758.\u0000strictfp(Field_7759);
        Class_16867.Method_16947();
        Class_16867.Method_16985();
        Class_16867.Method_16951(4363 & -32767, -8055 & 805);
        Class_16867.Method_16931();
        Class_16867.Method_16930((!class_46025.\u0000= ?() ? 555 & 193 : 2140 & 8451) != 0);
        int n = 278458613 & -1452805896;
        int n2 = n % (170328065 & 26281072);
        int n3 = n / (19366568 & -1409198015);
        Class_32876.Method_32943(Class_32876.Field_32911, (float)n2 / 1.0f, (float)n3 / 1.0f);
        Class_16867.Method_16918();
        Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 1.0f);
        if (Class_19426.Method_19570()) {
            Class_12440.Method_12759();
        }
        this.Field_7758.\u0000strictfp().Method_33794(class_46025, f, f2, f4, f5, f6, f7);
        if (Class_19426.Method_19570()) {
            Class_12440.Method_12974();
        }
        this.Field_7758.\u0000strictfp((Class_34093)class_46025, f3);
        Class_16867.Method_16930((17929 & 10533) != 0);
        Class_16867.Method_16952();
        Class_16867.Method_16913();
    }

    public Class_7757(Class_42962 class_42962) {
        this.Field_7758 = class_42962;
    }

    public void Method_7764(Class_859 class_859, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.Method_7763((Class_46025)class_859, f, f2, f3, f4, f5, f6, f7);
    }
}

