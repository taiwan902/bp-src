/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_42412
extends Class_1551 {
    private static final Class_2080 Field_42413 = new Class_2080(Class_42412.Method_42424("\u846c\u847c\u8460\u846d\u8469\u846d\u8479\u846c\u8435\u847c\u846d\u8470\u8431\u847c\u847d\u8475\u8461\u846c\u847c\u846c\u8461\u8468\u8460\u8479\u8425\u8468\u8469\u8461\u8465\u8468\u8478\u8468\u8455\u845c\u8454\u844d\u8461\u845d\u845d\u845c\u8451\u845c\u8448\u8454\u8449\u8451\u8458\u8411\u8458\u8445\u844d"));
    private String Field_42414;
    private Class_18 Field_42415;
    private int Field_42416;
    private int Field_42417;
    private boolean Field_42418;
    private Class_44252 Field_42419;
    private String Field_42420;
    private long Field_42421;
    private Class_14225 Field_42422;

    private void Method_42423() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private static String Method_42424(String string) {
        int n = 28163;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_42412.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_42425() {
        Class_16867.Method_16910(-20032 & 2602, 17685 & 4744, this.Field_42415.Field_80, this.Field_42415.Field_44);
        Class_16867.Method_16934(-10423 & 6069);
        Class_16867.Method_16962();
        Class_16867.Method_16934(8036 & 6024);
        Class_16867.Method_16962();
        this.Field_42416 = this.Field_42415.Field_80;
        this.Field_42417 = this.Field_42415.Field_44;
        Class_31566 class_31566 = new Class_31566(this.Field_42415);
        this.Field_42416 = class_31566.Method_31574();
        this.Field_42417 = class_31566.Method_31575();
        Class_16867.Method_16983(25354 & 2405);
        Class_16867.Method_16934(6023 & 32593);
        Class_16867.Method_16962();
        Class_16867.Method_16911(0.0, this.Field_42416, this.Field_42417, 0.0, 5.388888888888889 * 185.56701030927834, 8689.655172413793 * 0.34523809523809523);
        Class_16867.Method_16934(14092 & 6003);
        Class_16867.Method_16962();
        Class_16867.Method_16943(0.0f, 0.0f, 1.115942f * -1792.2079f);
    }

    public void Method_42426() {
        if (this.Field_42422 != null && this.Field_42421 != (314937351L & -2905027596428099104L) && Class_18.Field_89.Field_48 != null) {
            double d = (double)(Class_18.Method_207() - this.Field_42421) / (0.9175257731958762 * 3269.6629213483147);
            if (!this.Field_42418) {
                if (d < 0.0 || d > 1.0) {
                    this.Field_42421 = 7123187516141731892L & 17895624L;
                    return;
                }
            } else if (d > 0.4453125 * 1.1228070175438596) {
                d = 0.38888888888888884 * 1.2857142857142858;
            }
            this.Method_42425();
            Class_16867.Method_16944();
            Class_16867.Method_16930((-28652 & 16642) != 0);
            double d2 = d * (0.7804878048780488 * 2.5625);
            if (d2 > 1.0) {
                d2 = 0.967391304347826 * 2.067415730337079 - d2;
            }
            d2 *= 0.6666666666666666 * 6.0;
            if ((d2 = 1.0 - d2) < 0.0) {
                d2 = 0.0;
            }
            d2 *= d2;
            d2 *= d2;
            int n = this.Field_42416 - (676 & 8435);
            int n2 = (-23294 & 209) - (int)(d2 * (37.21348314606742 * 0.967391304347826));
            Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 1.0f);
            Class_16867.Method_16965();
            this.Field_42415.Method_253().Method_34707(Field_42413);
            Class_16867.Method_16931();
            this.\u0000strictfp(n, n2, 6249 & 992, -13878 & 1242, 416 & 10417, 9768 & 2400);
            if (this.Field_42418) {
                this.Field_42415.Field_27.Method_28688(this.Field_42420, n + (2398 & -16322), n2 + (8311 & 5263), 3452 & -19847, -1 & -1);
            } else {
                this.Field_42415.Field_27.Method_28692(this.Field_42414, n + (9631 & 2110), n2 + (4303 & 263), -256 & -217);
                this.Field_42415.Field_27.Method_28692(this.Field_42420, n + (11935 & 30), n2 + (18 & 24214), -1 & -1);
            }
            Class_39477.Method_39485();
            Class_16867.Method_16931();
            Class_16867.Method_16957();
            Class_16867.Method_16950();
            Class_16867.Method_16918();
            this.Field_42419.Method_44287(this.Field_42422.Field_14229, n + (1032 & 459), n2 + (136 & -27064));
            Class_16867.Method_16931();
            Class_16867.Method_16930((20801 & 2177) != 0);
            Class_16867.Method_16927();
        }
    }

    public void Method_42427() {
        this.Field_42422 = null;
        this.Field_42421 = 2373777171583934464L & -2373777172092251552L;
    }

    public Class_42412(Class_18 class_18) {
        this.Field_42415 = class_18;
        this.Field_42419 = class_18.Method_270();
    }

    public void Method_42428(Class_14225 class_14225) {
        this.Field_42414 = class_14225.Method_14242().Method_1788();
        this.Field_42420 = class_14225.Method_14241();
        this.Field_42421 = Class_18.Method_207() + (8441633980072073677L & -8441633981849301562L);
        this.Field_42422 = class_14225;
    }

    public void Method_42429(Class_14225 class_14225) {
        this.Field_42414 = Class_9802.Method_9806("achievement.get", new Object[8256 & 7436]);
        this.Field_42420 = class_14225.Method_14242().Method_1788();
        this.Field_42421 = Class_18.Method_207();
        this.Field_42422 = class_14225;
        this.Field_42418 = 14598 & 1152;
    }
}

