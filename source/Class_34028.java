/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_34028
extends Class_3529 {
    public static final Class_4394 Field_34029;
    public static final Class_5011 Field_34030;

    public Class_10997 Method_34031(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436) {
        return null;
    }

    private void Method_34032() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_4879 Method_34033(Class_283 class_283, int n) {
        return new Class_39935();
    }

    public void Method_34034(Class_283 class_283, Class_626 class_626, Class_4751 class_4751, Class_3436 class_3436, Class_4879 class_4879) {
        if (class_4879 instanceof Class_39935) {
            Class_39935 class_39935 = (Class_39935)class_4879;
            Class_23823 class_23823 = new Class_23823(Class_10527.Field_10711, 261 & -14335, ((Class_39935)class_4879).Method_39943());
            Class_1699 class_1699 = new Class_1699();
            Class_39935.Method_39956(class_1699, class_39935.Method_39943(), class_39935.Method_39948());
            class_23823.Method_23879("BlockEntityTag", class_1699);
            Class_34028.\u0000strictfp((Class_283)class_283, (Class_4751)class_4751, (Class_23823)class_23823);
        } else {
            super.\u0000strictfp(class_283, class_626, class_4751, class_3436, (Class_4879)null);
        }
    }

    protected Class_34028() {
        super(Class_3713.Field_3723);
        float f = 0.9746835f * 0.2564935f;
        float f2 = 1.0f;
        this.\u0000strictfp(7.2f * 0.06944445f - f, 0.0f, 0.5648148f * 0.8852459f - f, 0.37931034f * 1.3181819f + f, f2, 2.6551723f * 0.1883117f + f);
    }

    public boolean Method_34035() {
        return (2300 & 8451) != 0;
    }

    private static String Method_34036(String string) {
        int n = 22589;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_34028.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_10997 Method_34037(Class_283 class_283, Class_4751 class_4751) {
        this.\u0000strictfp((Class_561)class_283, class_4751);
        return super.\u0000strictfp(class_283, class_4751);
    }

    public boolean Method_34038(Class_283 class_283, Class_4751 class_4751) {
        return (!this.\u0000= final(class_283, class_4751) && super.\u0000, `(class_283, class_4751) ? 9603 & 2625 : 2216 & 70) != 0;
    }

    public void Method_34039(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, float f, int n) {
        Class_4879 class_4879 = class_283.Method_429(class_4751);
        if (class_4879 instanceof Class_39935) {
            Class_23823 class_23823 = new Class_23823(Class_10527.Field_10711, 28971 & 3201, ((Class_39935)class_4879).Method_39943());
            Class_1699 class_1699 = new Class_1699();
            class_4879.Method_4929(class_1699);
            class_1699.Method_1740("x");
            class_1699.Method_1740("y");
            class_1699.Method_1740("z");
            class_1699.Method_1740("id");
            class_23823.Method_23879("BlockEntityTag", class_1699);
            Class_34028.\u0000strictfp((Class_283)class_283, (Class_4751)class_4751, (Class_23823)class_23823);
        } else {
            super.\u0000strictfp(class_283, class_4751, class_3436, f, n);
        }
    }

    public boolean Method_34040(Class_561 class_561, Class_4751 class_4751) {
        return (-5525 & 4113) != 0;
    }

    public Class_1956 Method_34041(Class_3436 class_3436, Random random, int n) {
        return Class_10527.Field_10711;
    }

    public boolean Method_34042() {
        return (-19935 & 18889) != 0;
    }

    private static String Method_34043(String string) {
        int n = 21269;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_34028.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_1956 Method_34044(Class_283 class_283, Class_4751 class_4751) {
        return Class_10527.Field_10711;
    }

    public String Method_34045() {
        return Class_7594.Method_7602("item.banner.white.name");
    }

    static {
        Field_34030 = Class_5011.Method_5012(Class_34028.Method_34043("\ud454\ud452\ud453\ud458\ud458\ud450"), Class_4662.Field_4663);
        Field_34029 = Class_4394.Method_4401(Class_34028.Method_34036("\u1308\u1301\u130a\u130b\u130c\u1305\u1306\u1307"), 4360 & 660, 4431 & 1167);
    }

    public boolean Method_34046() {
        return (16452 & 3105) != 0;
    }
}

