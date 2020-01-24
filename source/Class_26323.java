/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_26323
implements Class_7380 {
    private final Class_41699 Field_26324;
    private static final Class_2080 Field_26325 = new Class_2080(Class_26323.Method_26328("\u3010\u3001\u301a\u3013\u3014\u3017\u3006\u3015\u3002\u3009\u3000\u301b\u3004\u301d\u3016\u3005\u3002\u3019\u3012\u3013\u3004\u301f\u3004\u301f\u3018\u3019\u300a\u3001\u301e\u300d\u300c\u3015\u3030\u302b\u3020"));
    private final Class_47470 Field_26326 = new Class_47470();

    public boolean Method_26327() {
        return (8353 & -11771) != 0;
    }

    public Class_26323(Class_41699 class_41699) {
        this.Field_26324 = class_41699;
    }

    private static String Method_26328(String string) {
        int n = 10547;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_26323.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_26329() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_26330(Class_46658 class_46658, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        if (!class_46658.Method_46685() && !class_46658.\u0000= ?()) {
            this.Field_26324.\u0000strictfp(Field_26325);
            if (class_46658.\u0000strictfp() && "jeb_".equals(class_46658.\u0000= int())) {
                int n = 93 & -14055;
                int n2 = class_46658.\u0000= package / (-31591 & 30747) + class_46658.\u0000, `();
                int n3 = Class_5393.Method_5464().length;
                int n4 = n2 % n3;
                int n5 = (n2 + (241 & 8709)) % n3;
                float f8 = ((float)(class_46658.\u0000= package % (10781 & 21625)) + f3) / (6.5f * 3.8461537f);
                float[] arrf = Class_46658.Method_46680(Class_5393.Method_5446(n4));
                float[] arrf2 = Class_46658.Method_46680(Class_5393.Method_5446(n5));
                Class_16867.Method_16919(arrf[-8192 & 520] * (1.0f - f8) + arrf2[5633 & 24740] * f8, arrf[9315 & 20997] * (1.0f - f8) + arrf2[8203 & 257] * f8, arrf[8198 & 7251] * (1.0f - f8) + arrf2[13350 & 922] * f8);
            } else {
                float[] arrf = Class_46658.Method_46680(class_46658.Method_46687());
                Class_16867.Method_16919(arrf[16714 & -28539], arrf[-20985 & 16425], arrf[354 & -24554]);
            }
            this.Field_26326.\u0000strictfp(this.Field_26324.\u0000strictfp());
            this.Field_26326.Method_47472(class_46658, f, f2, f3);
            this.Field_26326.\u0000strictfp((Class_1061)class_46658, f, f2, f4, f5, f6, f7);
        }
    }

    public void Method_26331(Class_859 class_859, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.Method_26330((Class_46658)class_859, f, f2, f3, f4, f5, f6, f7);
    }
}

