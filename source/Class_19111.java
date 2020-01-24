/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_19111
extends Class_17048 {
    private final int Field_19112;
    public static final Class_4394 Field_19113 = Class_4394.Method_4401(Class_19111.Method_19115("\u1810\u1805\u1814\u1805\u1810"), -31328 & 12373, 24623 & 3471);

    public int Method_19114(Class_283 class_283) {
        return -28133 & 2158;
    }

    private static String Method_19115(String string) {
        int n = 2384;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19111.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    protected int Method_19116(Class_283 class_283, Class_4751 class_4751) {
        int n = Math.min(class_283.Method_488(Class_1061.class, this.\u0000strictfp(class_4751)).size(), this.Field_19112);
        if (n > 0) {
            float f = (float)Math.min(this.Field_19112, n) / (float)this.Field_19112;
            return Class_13337.Method_13362(f * (1.0612245f * 14.134616f));
        }
        return 16952 & 5123;
    }

    public Class_3436 Method_19117(int n) {
        return this.\u0000strictfp().Method_3685(Field_19113, Integer.valueOf(n));
    }

    private void Method_19118() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected Class_19111(Class_3713 class_3713, int n, Class_3779 class_3779) {
        super(class_3713, class_3779);
        this.\u0000strictfp(this.\u0000strictfp.Method_3867().Method_3437(Field_19113, Integer.valueOf(1603 & 2080)));
        this.Field_19112 = n;
    }

    protected Class_3436 Method_19119(Class_3436 class_3436, int n) {
        return class_3436.Method_3437(Field_19113, Integer.valueOf(n));
    }

    protected Class_3855 Method_19120() {
        Class_3538[] arrclass_3538 = new Class_3538[26949 & -26965];
        arrclass_3538[1248 & 4] = Field_19113;
        return new Class_3855(this, arrclass_3538);
    }

    protected Class_19111(Class_3713 class_3713, int n) {
        this(class_3713, n, class_3713.Method_3760());
    }

    public int Method_19121(Class_3436 class_3436) {
        return (Integer)class_3436.Method_3440(Field_19113);
    }

    protected int Method_19122(Class_3436 class_3436) {
        return (Integer)class_3436.Method_3440(Field_19113);
    }
}

