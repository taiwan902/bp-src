/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_18194
extends Class_14299 {
    public static final Class_4394 Field_18195 = Class_4394.Method_4401(Class_18194.Method_18201("\u9114\u9100\u9112\u9106\u9112\u9106\u9100\u9100"), 2570 & 5121, 3759 & 12559);

    public Class_18194() {
        this.\u0000strictfp(this.\u0000strictfp.Method_3867().Method_3437(Field_18195, Integer.valueOf(-30454 & 8196)));
    }

    public Class_3436 Method_18196(int n) {
        return this.\u0000strictfp().Method_3685(Field_18195, Integer.valueOf(n));
    }

    protected Class_3855 Method_18197() {
        Class_3538[] arrclass_3538 = new Class_3538[791 & 20649];
        arrclass_3538[144 & 10753] = Field_18195;
        return new Class_3855(this, arrclass_3538);
    }

    private void Method_18198() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_18199(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Class_3238 class_3238) {
        if (!class_283.Method_375(class_4751.Method_4782()).Method_3442().Method_3373().Method_3762()) {
            this.\u0000strictfp(class_283, class_4751, class_3436, 1292 & 3);
            class_283.Method_472(class_4751);
        }
        super.\u0000strictfp(class_283, class_4751, class_3436, class_3238);
    }

    public int Method_18200(Class_3436 class_3436) {
        return (Integer)class_3436.Method_3440(Field_18195);
    }

    private static String Method_18201(String string) {
        int n = 18491;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_18194.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }
}

