/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_31111
extends Class_1956 {
    public static final String[] Field_31112;

    public void Method_31113(Class_23823 class_23823, Class_283 class_283, Class_626 class_626, int n) {
        int n2;
        int n3 = n2 = class_626.Field_694.Method_18094() || Class_29642.Method_29662(Class_30635.Field_30643.Field_30638, class_23823) > 0 ? -19951 & 1089 : 4624 & 17409;
        if (n2 != 0 || class_626.Field_628.Method_37831(Class_10527.Field_10568)) {
            int n4;
            int n5;
            int n6 = this.Method_31118(class_23823) - n;
            float f = (float)n6 / (0.6976744f * 28.666668f);
            if ((double)(f = (f * f + f * 2.0f) / (1.0f * 3.0f)) < 0.35000000000000003 * 0.2857142857142857) {
                return;
            }
            if (f > 1.0f) {
                f = 1.0f;
            }
            Class_41498 class_41498 = new Class_41498(class_283, class_626, f * 2.0f);
            if (f == 1.0f) {
                class_41498.Method_41513((269 & -8175) != 0);
            }
            if ((n4 = Class_29642.Method_29662(Class_30635.Field_30664.Field_30638, class_23823)) > 0) {
                class_41498.Method_41514(class_41498.Method_41516() + (double)n4 * (0.359375 * 1.391304347826087) + 1.0 * 0.5);
            }
            if ((n5 = Class_29642.Method_29662(Class_30635.Field_30646.Field_30638, class_23823)) > 0) {
                class_41498.Method_41527(n5);
            }
            if (Class_29642.Method_29662(Class_30635.Field_30661.Field_30638, class_23823) > 0) {
                class_41498.\u0000, for(6372 & 8295);
            }
            class_23823.Method_23883(-25341 & 16485, class_626);
            class_283.Method_519(class_626, "random.bow", 1.0f, 1.0f / (\u0000strictfp.nextFloat() * (0.8043478f * 0.49729732f) + 3.5076923f * 0.34210527f) + f * (1.1666666f * 0.42857143f));
            if (n2 != 0) {
                class_41498.Field_41511 = 8498 & -27570;
            } else {
                class_626.Field_628.Method_37826(Class_10527.Field_10568);
            }
            class_626.Method_750(Class_19863.Field_19917[Class_1956.Method_1986(this)]);
            if (!class_283.Field_306) {
                class_283.Method_350(class_41498);
            }
        }
    }

    public Class_23823 Method_31114(Class_23823 class_23823, Class_283 class_283, Class_626 class_626) {
        return class_23823;
    }

    private static String Method_31115(String string) {
        int n = 9432;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_31111.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public int Method_31116() {
        return 4097 & 8225;
    }

    public Class_23823 Method_31117(Class_23823 class_23823, Class_283 class_283, Class_626 class_626) {
        if (class_626.Field_694.Method_18094() || class_626.Field_628.Method_37831(Class_10527.Field_10568)) {
            class_626.Method_848(class_23823, this.Method_31118(class_23823));
        }
        return class_23823;
    }

    public int Method_31118(Class_23823 class_23823) {
        return -2011489855 & 39919464;
    }

    public Class_31111() {
        this.\u0000strictfp = 901 & -12287;
        this.\u0000strictfp(-14852 & 386);
        this.\u0000strictfp(Class_3987.Field_4004);
    }

    private static String Method_31119(String string) {
        int n = 156;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_31111.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_25567 Method_31120(Class_23823 class_23823) {
        return Class_25567.Field_25573;
    }

    private static String Method_31121(String string) {
        int n = 27542;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_31111.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_31122() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    static {
        String[] arrstring = new String[-32637 & 22063];
        arrstring[-32508 & 3072] = Class_31111.Method_31119("\u0542\u0543\u054a\u054b\u054e\u054d\u0544\u054d\u0502");
        arrstring[4099 & 17713] = Class_31111.Method_31115("\u0211\u0210\u0201\u0201\u0204\u0205\u0204\u0214\u0250");
        arrstring[-31213 & 162] = Class_31111.Method_31121("\u8841\u8841\u8849\u8848\u884c\u884e\u8846\u886f\u8803");
        Field_31112 = arrstring;
    }
}

