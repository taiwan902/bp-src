/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_40529
extends Class_40019 {
    private static final Class_2080 Field_40530;
    private static final Class_2080 Field_40531;
    private static final Class_2080 Field_40532;
    private static final Class_2080 Field_40533;
    private static final Class_2080 Field_40534;
    private static final Class_2080 Field_40535;

    protected void Method_40536(Class_43334 class_43334, float f) {
        float f2 = 0.025316456f * 37.03125f;
        if (class_43334.\u0000strictfp() < 0) {
            f2 = (float)((double)f2 * (1.3148148148148149 * 0.38028169014084506));
            this.\u0000, ` = 0.16935484f * 1.4761904f;
        } else {
            this.\u0000, ` = 1.5428572f * 0.32407406f;
        }
        Class_16867.Method_16973(f2, f2, f2);
    }

    private static String Method_40537(String string) {
        int n = 32631;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_40529.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_40538(String string) {
        int n = 31675;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_40529.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_40539(String string) {
        int n = 8820;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_40529.class, 6);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    protected Class_2080 Method_40540(Class_1061 class_1061) {
        return this.Method_40544((Class_43334)class_1061);
    }

    protected void Method_40541(Class_859 class_859, float f) {
        this.Method_40536((Class_43334)class_859, f);
    }

    private void Method_40542() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_39261 Method_40543() {
        return (Class_39261)super.\u0000strictfp();
    }

    public Class_40529(Class_8491 class_8491) {
        super(class_8491, new Class_39261(0.0f), 0.42857143f * 1.1666666f);
    }

    protected Class_2080 Method_40544(Class_43334 class_43334) {
        switch (class_43334.Method_43355()) {
            case 0: {
                return Field_40530;
            }
            case 1: {
                return Field_40531;
            }
            case 2: {
                return Field_40532;
            }
            case 3: {
                return Field_40533;
            }
            case 4: {
                return Field_40534;
            }
        }
        return Field_40535;
    }

    private static String Method_40545(String string) {
        int n = 1871;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_40529.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_40546(String string) {
        int n = 1140;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_40529.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    static {
        Field_40535 = new Class_2080(Class_40529.Method_40545("\u140d\u140d\u1401\u140c\u1408\u140c\u1408\u140d\u1404\u140d\u1405\u140c\u1404\u1408\u1404\u1401\u140d\u1401\u1405\u1404\u140c\u1409\u1408\u140c\u1404\u140c\u1400\u1404\u1401\u140d\u1408\u1409\u1429\u1424\u1429\u1424\u1428"));
        Field_40530 = new Class_2080(Class_40529.Method_40537("\u6c18\u6c08\u6c10\u6c18\u6c1c\u6c1c\u6c0c\u6c1c\u6c00\u6c08\u6c00\u6c18\u6c04\u6c1c\u6c14\u6c04\u6c18\u6c00\u6c00\u6c00\u6c0c\u6c0c\u6c0c\u6c1c\u6c00\u6c08\u6c08\u6c18\u6c04\u6c0c\u6c1c\u6c04\u6c18\u6c00\u6c08"));
        Field_40531 = new Class_2080(Class_40529.Method_40538("\u8271\u8261\u8277\u8272\u8270\u8274\u8262\u8277\u8228\u8269\u826b\u827a\u826c\u8278\u827e\u822b\u8271\u8265\u8263\u8262\u8264\u8261\u8262\u8276\u8228\u8268\u826e\u826e\u827d\u826d\u827f\u826f\u8244\u8240\u8203\u8256\u8241\u8241"));
        Field_40532 = new Class_2080(Class_40529.Method_40546("\u2084\u2085\u2080\u2084\u2081\u2086\u2081\u2087\u208f\u208d\u208e\u208c\u208d\u2088\u208d\u208b\u2096\u2091\u2094\u2094\u2095\u2093\u2091\u2096\u209f\u2098\u209a\u2099\u2099\u209f\u2098\u209a\u2080\u2086\u2087"));
        Field_40533 = new Class_2080(Class_40529.Method_40548("\u2201\u2211\u2209\u2200\u2204\u2204\u2214\u2205\u2210\u2219\u2211\u2208\u2214\u220c\u2204\u2215\u2211\u2209\u2209\u2208\u2204\u2205\u2204\u2214\u2200\u2219\u2200\u2201\u221d\u2204\u2205\u221c\u2239\u2231"));
        Field_40534 = new Class_2080(Class_40529.Method_40539("\u4022\u4022\u402c\u4021\u4023\u4025\u4021\u4026\u4061\u402a\u4022\u4029\u4027\u402b\u4025\u4062\u4020\u402e\u4028\u4029\u4027\u4020\u4021\u4027\u4061\u402d\u4029\u4029\u402d\u4027\u4029\u402f\u4068\u4027\u402a\u4022"));
    }

    public Class_33781 Method_40547() {
        return this.Method_40543();
    }

    private static String Method_40548(String string) {
        int n = 18930;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_40529.class, 5);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }
}

