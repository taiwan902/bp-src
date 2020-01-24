/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  \u0000volatile ? native | 8 ] } static return void throws private native * 4 1 ] short goto " double 2 break 9 int package + { ~ % native instanceof default false 7 import ~ goto for 5 case % final transient ^ * ! new ^ 
 *  \u0000volatile ? native | 8 ] } static return void throws private native * 4 1 ] short goto " double 2 break 9 int package + { ~ % native instanceof default false 7 import ~ goto for 5 case % final transient ^ * ! new ^ $ native private ` final ] 2 extends float ? boolean
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_28499
implements Class_16661 {
    private int Field_28500;
    private int Field_28501;
    private int Field_28502;
    private int Field_28503;
    public static final String[] Field_28504;
    private Class_30305[] Field_28505;
    public String Field_28506;
    private String Field_28507;
    public String Field_28508;
    private int[] Field_28509;
    private int Field_28510;
    private int Field_28511;

    private int Method_28512(Class_17281 class_17281, Class_4751 class_4751) {
        int n = class_17281.Field_17343;
        int n2 = class_4751.\u0000, `() - this.Field_28503;
        if (this.Field_28510 > 0) {
            int n3 = class_4751.\u0000= final() << (16720 & 2577) + class_4751.\u0000strictfp();
            int n4 = Class_19426.Method_19522(n3);
            int n5 = this.Field_28510 * (19714 & 8302) + (45 & 1537);
            int n6 = (n4 & (16895 & -24321)) % n5 - this.Field_28510;
            n2 += n6;
        }
        return this.Method_28518(n, n2);
    }

    private static String Method_28513(String string) {
        int n = 18864;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_28499.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_28514(String string) {
        int n = 30926;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_28499.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_28515(String string) {
        int n = 19158;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_28499.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public int Method_28516(Class_17281 class_17281, Class_4751 class_4751) {
        return this.Field_28511 == 0 ? this.Method_28519(class_17281, class_4751) : (this.Field_28511 == (-31743 & 147) ? this.Method_28512(class_17281, class_4751) : this.Field_28501);
    }

    private void Method_28517() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    static {
        String[] arrstring = new String[1247 & 12835];
        arrstring[16648 & 710] = Class_28499.Method_28515("\u0123\u0131\u013b\u0139\u0139\u0138\u0130");
        arrstring[247 & -19967] = Class_28499.Method_28514("\u0860\u0860\u0862\u0862");
        arrstring[5122 & -16142] = Class_28499.Method_28513("\u0742\u074c\u075c\u0740\u0740");
        Field_28504 = arrstring;
    }

    public int Method_28518(int n, int n2) {
        n = Class_19426.Method_19606(n, 8194 & -31708, this.Field_28502 - (2083 & 16401));
        n2 = Class_19426.Method_19606(n2, 2312 & -22880, this.Field_28500 - (12327 & 1025));
        return this.Field_28509[n2 * this.Field_28502 + n] & (-1056964609 & 100663295);
    }

    private int Method_28519(Class_17281 class_17281, Class_4751 class_4751) {
        double d = Class_13337.Method_13360(class_17281.Method_17407(class_4751), 0.0f, 1.0f);
        double d2 = Class_13337.Method_13360(class_17281.Method_17414(), 0.0f, 1.0f);
        int n = (int)((1.0 - d) * (double)(this.Field_28502 - (5765 & 16449)));
        int n2 = (int)((1.0 - (d2 *= d)) * (double)(this.Field_28500 - (25 & 4257)));
        return this.Method_28518(n, n2);
    }

    public int Method_28520(Class_561 class_561, Class_4751 class_4751) {
        Class_17281 class_17281 = Class_10433.Method_10489(class_561, class_4751);
        return this.Method_28516(class_17281, class_4751);
    }

    public String Method_28521() {
        return "" + this.Field_28508 + "/" + this.Field_28506 + ", blocks: " + Class_19426.Method_19555(this.Field_28505) + ", source: " + this.Field_28507;
    }

    public int Method_28522(Class_561 class_561, double d, double d2, double d3, int n) {
        int n2;
        int n3;
        int n4;
        if (this.Field_28511 == (-16342 & 14998)) {
            return this.Field_28501;
        }
        int n5 = Class_13337.Method_13371(d);
        int n6 = Class_13337.Method_13371(d2);
        int n7 = Class_13337.Method_13371(d3);
        int n8 = 513 & 16386;
        int n9 = 2896 & -32768;
        int n10 = 2242 & -11256;
        int n11 = 516 & -32703;
        \u0000volatile ? native | 8 ] } static return void throws private native * 4 1 ] short goto " double 2 break 9 int package + { ~ % native instanceof default false 7 import ~ goto for 5 case % final transient ^ * ! new ^ . native private ` final ] 2 extends float ? boolean  native private ` final ] 2 extends float ? boolean2 = new \u0000volatile ? native | 8 ] } static return void throws private native * 4 1 ] short goto " double 2 break 9 int package + { ~ % native instanceof default false 7 import ~ goto for 5 case % final transient ^ * ! new ^ . native private ` final ] 2 extends float ? boolean(129 & -32452, 16523 & 4208, -32747 & 25664);
        for (n4 = n5 - n; n4 <= n5 + n; ++n4) {
            for (n2 = n7 - n; n2 <= n7 + n; ++n2) {
                 native private ` final ] 2 extends float ? boolean2.\u0000strictfp(n4, n6, n2);
                n3 = this.Method_28520(class_561, (Class_4751) native private ` final ] 2 extends float ? boolean2);
                n8 += n3 >> (528 & 30834) & (3327 & -32513);
                n9 += n3 >> (1784 & 24842) & (8447 & 1023);
                n10 += n3 & (-23809 & 3327);
                ++n11;
            }
        }
        n4 = n8 / n11;
        n2 = n9 / n11;
        n3 = n10 / n11;
        return n4 << (18265 & -32748) | n2 << (1324 & 24665) | n3;
    }
}

