/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public abstract class Class_4555
extends Class_4561 {
    public static final Class_3957 Field_4556 = Class_3957.Method_3963(Class_4555.Method_4557("\u0709\u0710\u0703\u071b"), Class_4679.class);

    private static String Method_4557(String string) {
        int n = 27045;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_4555.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_4555() {
        super(Class_3713.Field_3723);
        this.\u0000strictfp(Class_3987.Field_3993);
        this.\u0000= final(2.0f);
        this.\u0000strictfp(\u0000= `);
    }

    public void Method_4558(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436) {
        int n = -32746 & 7300;
        int n2 = n + (4133 & 131);
        if (class_283.Method_365(class_4751.Method_4791(-n2, -n2, -n2), class_4751.Method_4791(n2, n2, n2))) {
            for (Class_4751 class_47512 : Class_4751.Method_4779(class_4751.Method_4791(-n, -n, -n), class_4751.Method_4791(n, n, n))) {
                Class_3436 class_34362 = class_283.Method_375(class_47512);
                if (class_34362.Method_3442().Method_3373() != Class_3713.Field_3729 || ((Boolean)class_34362.Method_3440(Class_4720.Field_4725)).booleanValue()) continue;
                class_283.Method_462(class_47512, class_34362.Method_3437(Class_4720.Field_4725, Boolean.valueOf((-5069 & 513) != 0)), 7493 & 532);
            }
        }
    }

    private void Method_4559() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_3436 Method_4560(Class_283 class_283, Class_4751 class_4751, Class_4595 class_4595, float f, float f2, float f3, int n, Class_859 class_859) {
        return super.\u0000strictfp(class_283, class_4751, class_4595, f, f2, f3, n, class_859).Method_3437(Field_4556, (Comparable)((Object)Class_4679.Method_4689(class_4595.Method_4640())));
    }
}

