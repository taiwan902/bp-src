/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_36494
extends Class_30635 {
    private static final int[] Field_36495;
    private static final String[] Field_36496;
    private static final int[] Field_36497;
    private static final int[] Field_36498;
    public final int Field_36499;

    public Class_36494(int n, Class_2080 class_2080, int n2, int n3) {
        super(n, class_2080, n2, Class_4067.Field_4079);
        this.Field_36499 = n3;
    }

    static {
        String[] arrstring = new String[1111 & 16931];
        arrstring[8248 & -11263] = Class_36494.Method_36506("\uc644\uc640\uc642");
        arrstring[21015 & -32383] = Class_36494.Method_36508("\u9031\u9020\u9020\u9021\u9021\u9020");
        arrstring[13410 & -32126] = Class_36494.Method_36504("\u9882\u9881\u9881\u9889\u9885\u988c\u9885\u988e\u988b\u9888");
        Field_36496 = arrstring;
        int[] arrn = new int[5703 & 16443];
        arrn[23 & 5376] = 19063 & -23415;
        arrn[-11135 & 89] = 4231 & 3101;
        arrn[8266 & 2050] = 3909 & -8059;
        Field_36498 = arrn;
        int[] arrn2 = new int[-13117 & 11];
        arrn2[-16364 & 6984] = 5163 & 24607;
        arrn2[2753 & 16651] = -28662 & 393;
        arrn2[8215 & -26454] = -14136 & 301;
        Field_36497 = arrn2;
        int[] arrn3 = new int[255 & 20995];
        arrn3[2570 & 64] = 4892 & 24596;
        arrn3[1305 & 2049] = 13495 & 20;
        arrn3[29026 & 1026] = -30699 & 1308;
        Field_36495 = arrn3;
    }

    private void Method_36500() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_36501(Class_30635 class_30635) {
        return (!(class_30635 instanceof Class_36494) ? 711 & 1281 : 642 & 32004) != 0;
    }

    public float Method_36502(int n, Class_40173 class_40173) {
        return this.Field_36499 == 0 ? (float)n * (3.1696427f * 0.3943662f) : (this.Field_36499 == (4097 & -31197) && class_40173 == Class_40173.Field_40177 ? (float)n * (3.108108f * 0.8043478f) : (this.Field_36499 == (-32641 & 24962) && class_40173 == Class_40173.Field_40175 ? (float)n * (0.08695652f * 28.75f) : 0.0f));
    }

    public boolean Method_36503(Class_23823 class_23823) {
        return (class_23823.Method_23844() instanceof Class_41324 ? 18489 & -32511 : (int)(super.Method_30697(class_23823) ? 1 : 0)) != 0;
    }

    private static String Method_36504(String string) {
        int n = 1910;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_36494.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_36505(Class_859 class_859, Class_1061 class_1061, int n) {
        if (class_1061 instanceof Class_859) {
            Class_859 class_8592 = (Class_859)class_1061;
            if (this.Field_36499 == (1026 & 6) && class_8592.Method_1029() == Class_40173.Field_40175) {
                int n2 = (16564 & -31977) + class_859.Method_986().nextInt((90 & -5745) * n);
                class_8592.Method_995(new Class_25240(Class_8338.Field_8357.Field_8364, n2, 7243 & -23789));
            }
        }
    }

    private static String Method_36506(String string) {
        int n = 10650;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_36494.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public String Method_36507() {
        return "enchantment.damage." + Field_36496[this.Field_36499];
    }

    private static String Method_36508(String string) {
        int n = 27936;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_36494.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public int Method_36509() {
        return 8613 & 1557;
    }

    public int Method_36510(int n) {
        return this.Method_36511(n) + Field_36495[this.Field_36499];
    }

    public int Method_36511(int n) {
        return Field_36498[this.Field_36499] + (n - (-32683 & 7177)) * Field_36497[this.Field_36499];
    }
}

