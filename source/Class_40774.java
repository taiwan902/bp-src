/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_40774
extends Class_40019 {
    private static final Class_2080 Field_40775 = new Class_2080(Class_40774.Method_40776("\u1140\u1140\u1146\u1143\u1141\u1145\u1143\u1146\u1101\u1140\u1142\u1143\u1145\u1141\u1147\u1102\u1155\u1155\u1153\u1153\u1151\u1150\u1153\u1153\u1151\u1150\u1112\u1157\u1150\u1150"));

    private static String Method_40776(String string) {
        int n = 15258;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_40774.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_40777() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_40774(Class_8491 class_8491) {
        super(class_8491, new Class_45068(), 0.7777778f * 0.64285713f);
        this.\u0000strictfp((Class_7380)new Class_26632(this));
    }

    protected Class_2080 Method_40778(Class_45624 class_45624) {
        return Field_40775;
    }

    protected void Method_40779(Class_45624 class_45624, float f, float f2, float f3) {
        super.\u0000strictfp((Class_859)class_45624, f, f2, f3);
        if ((double)class_45624.\u0000, ! >= 0.001891891891891892 * 5.285714285714286) {
            float f4 = 1.3076923f * 9.941176f;
            float f5 = class_45624.\u0000= " - class_45624.\u0000, ! * (1.0f - f3) + 0.925f * 6.4864864f;
            float f6 = (Math.abs(f5 % f4 - f4 * (0.39285716f * 1.2727273f)) - f4 * (4.0f * 0.0625f)) / (f4 * (1.2647059f * 0.19767442f));
            Class_16867.Method_16940(1.0f * 6.5f * f6, 0.0f, 0.0f, 1.0f);
        }
    }

    protected void Method_40780(Class_859 class_859, float f, float f2, float f3) {
        this.Method_40779((Class_45624)class_859, f, f2, f3);
    }

    protected Class_2080 Method_40781(Class_1061 class_1061) {
        return this.Method_40778((Class_45624)class_1061);
    }
}

