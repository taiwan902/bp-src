/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_15690
implements Class_7380 {
    private static final Class_2080 Field_15691 = new Class_2080(Class_15690.Method_15697("\uc200\uc200\uc206\uc203\uc201\uc205\uc203\uc206\uc241\uc200\uc202\uc203\uc205\uc201\uc207\uc242\uc201\uc201\uc202\uc202\uc204\uc201\uc206\uc206\uc201\uc200\uc202\uc242\uc200\uc205\uc207\uc202\uc201\uc201\uc203\uc202\uc205\uc200\uc207\uc243\uc204\uc201\uc203"));
    private final Class_42177 Field_15692;

    public Class_15690(Class_42177 class_42177) {
        this.Field_15692 = class_42177;
    }

    private void Method_15693() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_15694(Class_34590 class_34590, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.Field_15692.\u0000strictfp(Field_15691);
        Class_16867.Method_16947();
        Class_16867.Method_16985();
        Class_16867.Method_16951(18535 & 641, 16497 & 8585);
        Class_16867.Method_16931();
        Class_16867.Method_16936(-31997 & 26186);
        int n = 272167160 & 96728305;
        int n2 = n % (1090587410 & -1341571072);
        int n3 = n / (-1039725424 & 539033932);
        Class_32876.Method_32943(Class_32876.Field_32911, (float)n2 / 1.0f, (float)n3 / 1.0f);
        Class_16867.Method_16918();
        Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 1.0f);
        if (Class_19426.Method_19570()) {
            Class_12440.Method_12759();
        }
        this.Field_15692.\u0000strictfp().Method_33794(class_34590, f, f2, f4, f5, f6, f7);
        if (Class_19426.Method_19570()) {
            Class_12440.Method_12974();
        }
        this.Field_15692.\u0000strictfp((Class_34093)class_34590, f3);
        Class_16867.Method_16952();
        Class_16867.Method_16913();
        Class_16867.Method_16936(9783 & 587);
    }

    public boolean Method_15695() {
        return (-6656 & 140) != 0;
    }

    public void Method_15696(Class_859 class_859, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.Method_15694((Class_34590)class_859, f, f2, f3, f4, f5, f6, f7);
    }

    private static String Method_15697(String string) {
        int n = 24498;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_15690.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }
}

