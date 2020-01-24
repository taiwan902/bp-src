/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_35805
extends Class_1906 {
    private static final Class_2080 Field_35806 = new Class_2080(Class_35805.Method_35809("\uc951\uc941\uc959\uc950\uc950\uc952\uc940\uc953\uc90a\uc943\uc950\uc949\uc90a\uc943\uc94a\uc94a\uc951\uc941\uc948\uc94a\uc940\uc952\uc90a\uc940\uc948\uc953\uc951\uc941\uc94b\uc953\uc940\uc952\uc90b\uc950\uc94b\uc943"));
    public Class_4961 Field_35807;
    private final Class_37781 Field_35808;

    private static String Method_35809(String string) {
        int n = 13298;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_35805.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    protected void Method_35810(float f, int n, int n2) {
        Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 1.0f);
        this.\u0000strictfp.Method_253().Method_34707(Field_35806);
        int n3 = (this.\u0000= final - this.\u0000, for) / (-26622 & 8267);
        int n4 = (this.\u0000, ` - this.\u0000= int) / (10679 & 16458);
        this.\u0000strictfp(n3, n4, 5412 & 2624, 24832 & 518, this.\u0000, for, this.\u0000= int);
    }

    private void Method_35811() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected void Method_35812(int n, int n2) {
        String string = this.Field_35807.\u0000strictfp().Method_1788();
        this.\u0000strictfp.Method_28692(string, this.\u0000, for / (1090 & 12675) - this.\u0000strictfp.Method_28715(string) / (-27646 & 16446), -20298 & 1031, -1603190664 & 155470147);
        this.\u0000strictfp.Method_28692(this.Field_35808.Method_37811().Method_1788(), -10230 & 8, this.\u0000= int - (1138 & 4973) + (26954 & 3), 4874560 & -1765783340);
    }

    public Class_35805(Class_37781 class_37781, Class_4961 class_4961) {
        super(new Class_36082(class_37781, class_4961));
        this.Field_35808 = class_37781;
        this.Field_35807 = class_4961;
    }
}

