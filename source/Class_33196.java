/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_33196
extends Class_30635 {
    private static final int[] Field_33197;
    private static final String[] Field_33198;
    private static final int[] Field_33199;
    private static final int[] Field_33200;
    public final int Field_33201;

    public int Method_33202(int n) {
        return this.Method_33212(n) + Field_33197[this.Field_33201];
    }

    static {
        String[] arrstring = new String[-22523 & 20493];
        arrstring[-7804 & 5138] = Class_33196.Method_33215("\u00b0\u00b5\u00b5");
        arrstring[6947 & -32763] = Class_33196.Method_33210("\u408e\u4081\u408a\u408d");
        arrstring[-23550 & 18954] = Class_33196.Method_33205("\u4402\u4400\u4408\u4408");
        arrstring[16931 & 6355] = Class_33196.Method_33213("\u20b0\u20ad\u20a4\u20b9\u20b8\u20a5\u20bc\u20b9\u20b8");
        arrstring[-32729 & 16388] = Class_33196.Method_33209("\u4189\u4189\u4186\u4183\u418c\u4188\u418f\u4182\u418d\u4184");
        Field_33198 = arrstring;
        int[] arrn = new int[1581 & -32379];
        arrn[544 & -32512] = 289 & -12085;
        arrn[8709 & 467] = 2059 & 29770;
        arrn[16518 & 338] = -19323 & 16421;
        arrn[21579 & 2595] = -30715 & 4871;
        arrn[1157 & 24678] = 375 & 12299;
        Field_33199 = arrn;
        int[] arrn2 = new int[-26987 & 18445];
        arrn2[6761 & 4] = -32501 & 6319;
        arrn2[8233 & -28413] = 13 & 17802;
        arrn2[34 & 18262] = 20486 & 782;
        arrn2[24591 & 2243] = 3144 & 8250;
        arrn2[-32699 & 29580] = 294 & -23026;
        Field_33200 = arrn2;
        int[] arrn3 = new int[4245 & 17159];
        arrn3[552 & -12203] = 535 & 26740;
        arrn3[-31743 & 17031] = 14860 & -14964;
        arrn3[-32749 & 16838] = 11 & -31170;
        arrn3[-19261 & 31] = 15 & 25292;
        arrn3[580 & 20492] = 25615 & -28561;
        Field_33197 = arrn3;
    }

    public Class_33196(int n, Class_2080 class_2080, int n2, int n3) {
        super(n, class_2080, n2, Class_4067.Field_4076);
        this.Field_33201 = n3;
        if (n3 == (5078 & 2)) {
            this.\u0000strictfp = Class_4067.Field_4074;
        }
    }

    public boolean Method_33203(Class_30635 class_30635) {
        if (class_30635 instanceof Class_33196) {
            Class_33196 class_33196 = (Class_33196)class_30635;
            return (class_33196.Field_33201 == this.Field_33201 ? 408 & 2566 : (this.Field_33201 == (2 & 24642) || class_33196.Field_33201 == (74 & 9238) ? 5233 & 10243 : 22080 & 2)) != 0;
        }
        return super.Method_30690(class_30635);
    }

    public String Method_33204() {
        return "enchantment.protect." + Field_33198[this.Field_33201];
    }

    private static String Method_33205(String string) {
        int n = 27539;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_33196.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static int Method_33206(Class_1061 class_1061, int n) {
        int n2 = Class_29642.Method_29651(Class_30635.Field_30641.Field_30638, class_1061.Method_1165());
        if (n2 > 0) {
            n -= Class_13337.Method_13377((float)n * (float)n2 * (14.700001f * 0.010204081f));
        }
        return n;
    }

    public int Method_33207() {
        return 1055 & 28932;
    }

    public int Method_33208(int n, Class_32797 class_32797) {
        if (class_32797.Method_32864()) {
            return 4609 & 282;
        }
        float f = (float)((278 & 518) + n * n) / (0.2f * 15.0f);
        return this.Field_33201 == 0 ? Class_13337.Method_13377(f * (2.5108697f * 0.2987013f)) : (this.Field_33201 == (22723 & 9) && class_32797.Method_32837() ? Class_13337.Method_13377(f * (0.4473684f * 2.7941177f)) : (this.Field_33201 == (22 & 1058) && class_32797 == Class_32797.Field_32813 ? Class_13337.Method_13377(f * (2.2916665f * 1.0909091f)) : (this.Field_33201 == (1091 & -10093) && class_32797.Method_32854() ? Class_13337.Method_13377(f * (0.6145833f * 2.4406781f)) : (this.Field_33201 == (11276 & -32620) && class_32797.Method_32832() ? Class_13337.Method_13377(f * (0.45918366f * 3.2666667f)) : -13304 & 544))));
    }

    private static String Method_33209(String string) {
        int n = 31279;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_33196.class, 5);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_33210(String string) {
        int n = 30099;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_33196.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_33211() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public int Method_33212(int n) {
        return Field_33199[this.Field_33201] + (n - (2065 & 35)) * Field_33200[this.Field_33201];
    }

    private static String Method_33213(String string) {
        int n = 25564;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_33196.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static double Method_33214(Class_1061 class_1061, double d) {
        int n = Class_29642.Method_29651(Class_30635.Field_30650.Field_30638, class_1061.Method_1165());
        if (n > 0) {
            d -= (double)Class_13337.Method_13371(d * (double)((float)n * (0.13448277f * 1.1153846f)));
        }
        return d;
    }

    private static String Method_33215(String string) {
        int n = 2709;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_33196.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }
}

