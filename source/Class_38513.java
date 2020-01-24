/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_38513
extends Class_5164 {
    public static final Class_3957 Field_38514 = Class_3957.Method_3963(Class_38513.Method_38515("\u2402\u2410\u2412\u2402\u2410"), Class_5183.class);

    private static String Method_38515(String string) {
        int n = 25079;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_38513.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    protected Class_3855 Method_38516() {
        Class_3538[] arrclass_3538 = new Class_3538[16707 & -28151];
        arrclass_3538[-15680 & 1324] = Field_38514;
        return new Class_3855(this, arrclass_3538);
    }

    protected Class_38513() {
        super((1026 & 10304) != 0);
        this.\u0000strictfp(this.\u0000strictfp.Method_3867().Method_3437(Field_38514, (Comparable)((Object)Class_5183.Field_5185)));
    }

    public Class_3436 Method_38517(int n) {
        return this.\u0000strictfp().Method_3685(Field_38514, (Comparable)((Object)Class_5183.Method_5210(n)));
    }

    public int Method_38518(Class_3436 class_3436) {
        return ((Class_5183)((Object)class_3436.Method_3440(Field_38514))).Method_5215();
    }

    public Class_3538 Method_38519() {
        return Field_38514;
    }

    private void Method_38520() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected void Method_38521(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Class_3238 class_3238) {
        if (class_3238.Method_3322() && new Class_13316(this, class_283, class_4751, class_3436).Method_13324() == (18707 & 579)) {
            this.\u0000strictfp(class_283, class_4751, class_3436, (640 & 9233) != 0);
        }
    }
}

