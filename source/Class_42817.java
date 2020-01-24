/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_42817
extends Class_1906 {
    private static final Class_2080 Field_42818 = new Class_2080(Class_42817.Method_42821("\u2424\u2425\u2420\u2425\u2420\u2427\u2420\u2427\u246e\u242f\u242c\u2429\u246a\u242f\u242a\u242b\u2424\u2421\u2420\u2427\u2420\u2427\u2462\u2423\u242c\u242b\u242e\u2429\u242e\u2429\u246a\u242d\u2406\u2407"));
    private final Class_37781 Field_42819;
    private Class_4961 Field_42820;

    public Class_42817(Class_37781 class_37781, Class_4961 class_4961) {
        super(new Class_25657(class_37781, class_4961));
        this.Field_42819 = class_37781;
        this.Field_42820 = class_4961;
    }

    private static String Method_42821(String string) {
        int n = 19087;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_42817.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    protected void Method_42822(float f, int n, int n2) {
        int n3;
        Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 1.0f);
        this.\u0000strictfp.Method_253().Method_34707(Field_42818);
        int n4 = (this.\u0000= final - this.\u0000, for) / (20834 & 8206);
        int n5 = (this.\u0000, ` - this.\u0000= int) / (50 & 11267);
        this.\u0000strictfp(n4, n5, 20678 & -30160, 4144 & 2123, this.\u0000, for, this.\u0000= int);
        if (Class_44437.Method_44463(this.Field_42820)) {
            n3 = this.Method_42826(24589 & 5519);
            this.\u0000strictfp(n4 + (-5064 & 56), n5 + (19812 & -19931) + (26764 & 4685) - n3, 6392 & 8368, (4236 & -16116) - n3, 414 & -26097, n3 + (-31731 & 29155));
        }
        n3 = this.Method_42824(-22504 & 698);
        this.\u0000strictfp(n4 + (20079 & 4559), n5 + (6563 & 8226), -32016 & 2229, 24591 & 2254, n3 + (14755 & 9), 10290 & 4116);
    }

    private void Method_42823() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private int Method_42824(int n) {
        int n2 = this.Field_42820.Method_4973(11 & 2370);
        int n3 = this.Field_42820.Method_4973(26631 & -31725);
        return n3 != 0 && n2 != 0 ? n2 * n / n3 : 17492 & 650;
    }

    protected void Method_42825(int n, int n2) {
        String string = this.Field_42820.\u0000strictfp().Method_1788();
        this.\u0000strictfp.Method_28692(string, this.\u0000, for / (8418 & 2) - this.\u0000strictfp.Method_28715(string) / (2066 & 17635), 10391 & 5638, 81969472 & -1051692978);
        this.\u0000strictfp.Method_28692(this.Field_42819.Method_37811().Method_1788(), 16778 & 11788, this.\u0000= int - (1123 & -32412) + (6 & -14974), 73623752 & 1111511872);
    }

    private int Method_42826(int n) {
        int n2 = this.Field_42820.Method_4973(449 & -11227);
        if (n2 == 0) {
            n2 = 492 & 3275;
        }
        return this.Field_42820.Method_4973(4 & -28720) * n / n2;
    }
}

