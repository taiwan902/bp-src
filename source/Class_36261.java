/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_36261
extends Class_27380 {
    private static final Class_2080 Field_36262 = new Class_2080(Class_36261.Method_36267("\u7cc8\u7cc9\u7cc6\u7ccb\u7ccc\u7ccb\u7cce\u7cc9\u7c82\u7cc9\u7cc0\u7ccb\u7cc0\u7ccd\u7cc2\u7c85\u7cd8\u7cd5\u7cde\u7cdb\u7cda\u7cd1\u7cde\u7cd5\u7cde\u7cd9\u7cd0\u7cd1\u7cda\u7cdb\u7c94\u7cdb\u7ce2\u7ceb"));

    public void Method_36263(Class_3481 class_3481, double d, double d2, double d3, float f, float f2) {
        Class_16867.Method_16961();
        Class_16867.Method_16943((float)d, (float)d2, (float)d3);
        this.\u0000, `((Class_1061)class_3481);
        int n = class_3481.Method_3503();
        float f3 = (float)(n % (16580 & 295) * (2066 & 9809) + (17164 & 98)) / (0.8f * 80.0f);
        float f4 = (float)(n % (8324 & 2308) * (153 & -31630) + (-30958 & 16)) / (0.4871795f * 131.36842f);
        float f5 = (float)(n / (10246 & 1797) * (54 & 12304) + (277 & 32)) / (54.068966f * 1.1836735f);
        float f6 = (float)(n / (4 & -7676) * (209 & -13548) + (17429 & 12368)) / (64.0f * 1.0f);
        float f7 = 1.0f;
        float f8 = 1.3285714f * 0.37634408f;
        float f9 = 1.3387097f * 0.18674698f;
        int n2 = class_3481.Method_3498(f2);
        int n3 = n2 % (86529 & 1767188614);
        int n4 = n2 / (-2127468496 & 33619975);
        Class_32876.Method_32943(Class_32876.Field_32911, (float)n3 / 1.0f, (float)n4 / 1.0f);
        Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 1.0f);
        float f10 = 985.22723f * 0.25882354f;
        float f11 = ((float)class_3481.Field_3487 + f2) / 2.0f;
        n4 = (int)((Class_13337.Method_13370(f11 + 0.0f) + 1.0f) * (0.75f * 0.6666667f) * (12.75f * 20.0f));
        int n5 = -21761 & 16639;
        int n6 = (int)((Class_13337.Method_13370(f11 + 7.818182f * 0.5357755f) + 1.0f) * (1.0f * 0.1f) * (0.8f * 318.75f));
        Class_16867.Method_16940(2.7692308f * 65.0f - this.\u0000strictfp.Field_8492, 0.0f, 1.0f, 0.0f);
        Class_16867.Method_16940(-this.\u0000strictfp.Field_8499, 1.0f, 0.0f, 0.0f);
        float f12 = 5.3250003f * 0.056338027f;
        Class_16867.Method_16973(0.09545455f * 3.142857f, 0.7340425f * 0.4086957f, 0.75f * 0.4f);
        Class_7644 class_7644 = Class_7644.Method_7649();
        Class_22385 class_22385 = class_7644.Method_7648();
        class_22385.Method_22417(-23505 & 71, Class_29585.Field_29593);
        class_22385.Method_22443(0.0f - f8, 0.0f - f9, 0.0).Method_22433(f3, f6).Method_22424(n4, 255 & -23297, n6, 7620 & 130).Method_22446(0.0f, 1.0f, 0.0f).Method_22451();
        class_22385.Method_22443(f7 - f8, 0.0f - f9, 0.0).Method_22433(f4, f6).Method_22424(n4, 25855 & 4351, n6, -30524 & 409).Method_22446(0.0f, 1.0f, 0.0f).Method_22451();
        class_22385.Method_22443(f7 - f8, 1.0f - f9, 0.0).Method_22433(f4, f5).Method_22424(n4, 16639 & 2815, n6, 10402 & 16537).Method_22446(0.0f, 1.0f, 0.0f).Method_22451();
        class_22385.Method_22443(0.0f - f8, 1.0f - f9, 0.0).Method_22433(f3, f5).Method_22424(n4, 1023 & -23297, n6, 448 & 17060).Method_22446(0.0f, 1.0f, 0.0f).Method_22451();
        class_7644.Method_7647();
        Class_16867.Method_16952();
        Class_16867.Method_16942();
        Class_16867.Method_16945();
        super.Method_27403(class_3481, d, d2, d3, f, f2);
    }

    private void Method_36264() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected Class_2080 Method_36265(Class_3481 class_3481) {
        return Field_36262;
    }

    protected Class_2080 Method_36266(Class_1061 class_1061) {
        return this.Method_36265((Class_3481)class_1061);
    }

    private static String Method_36267(String string) {
        int n = 28271;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_36261.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_36261(Class_8491 class_8491) {
        super(class_8491);
        this.\u0000, ` = 0.011392405f * 13.166667f;
        this.\u0000strictfp = 0.44117644f * 1.7f;
    }

    public void Method_36268(Class_1061 class_1061, double d, double d2, double d3, float f, float f2) {
        this.Method_36263((Class_3481)class_1061, d, d2, d3, f, f2);
    }
}

