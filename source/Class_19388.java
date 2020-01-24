/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  internal.org.lwjgl.opengl.GL11
 */
import internal.org.lwjgl.opengl.GL11;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_19388
extends Class_11681 {
    private static final Class_2080 Field_19389 = new Class_2080(Class_19388.Method_19391("\u2004\u2004\u2002\u2006\u2000\u2006\u2002\u2004\u200e\u200c\u200c\u200e\u200c\u2008\u200e\u2008\u2002\u2000\u2004\u2004\u2002\u2004\u2000\u2000"));
    private final Class_37645 Field_19390 = new Class_37645();

    private static String Method_19391(String string) {
        int n = 8214;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19388.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_19392(Class_33614 class_33614, double d, double d2, double d3, float f, int n) {
        Class_3238 class_3238 = class_33614.\u0000strictfp();
        Class_16867.Method_16961();
        float f2 = 4.52381f * 0.14736842f;
        if (class_3238 == Class_9265.Field_9367) {
            Class_16867.Method_16943((float)d + 1.0f * 0.5f, (float)d2 + 0.4375f * 1.7142857f * f2, (float)d3 + 0.27857143f * 1.7948718f);
            float f3 = (float)(class_33614.\u0000, `() * (-32276 & 10088)) / (13.013333f * 1.2295082f);
            Class_16867.Method_16940(-f3, 0.0f, 1.0f, 0.0f);
            this.Field_19390.Field_37646.Field_31967 = 4101 & 9305;
        } else {
            int n2 = class_33614.\u0000, `();
            float f4 = 0.0f;
            if (n2 == (214 & -28669)) {
                f4 = 1.3333334f * 135.0f;
            }
            if (n2 == (3141 & -24428)) {
                f4 = 0.21348314f * 421.57895f;
            }
            if (n2 == (261 & 4661)) {
                f4 = -26.024097f * 3.4583333f;
            }
            Class_16867.Method_16943((float)d + 1.5749999f * 0.31746033f, (float)d2 + 0.053333335f * 14.0625f * f2, (float)d3 + 0.45833334f * 1.0909091f);
            Class_16867.Method_16940(-f4, 0.0f, 1.0f, 0.0f);
            Class_16867.Method_16943(0.0f, 1.5348837f * -0.20359848f, -0.11805556f * 3.7058823f);
            this.Field_19390.Field_37646.Field_31967 = 66 & 2688;
        }
        if (n >= 0) {
            this.\u0000strictfp(\u0000strictfp[n]);
            Class_16867.Method_16934(5955 & 22294);
            Class_16867.Method_16961();
            Class_16867.Method_16973(0.63414633f * 6.3076925f, 2.0f, 1.0f);
            Class_16867.Method_16943(0.037247475f * 1.6779661f, 0.09469697f * 0.66f, 0.0037313432f * 16.75f);
            Class_16867.Method_16934(5888 & 30471);
        } else {
            this.\u0000strictfp(Field_19389);
        }
        Class_16867.Method_16957();
        Class_16867.Method_16961();
        Class_16867.Method_16973(f2, -f2, -f2);
        this.Field_19390.Method_37649();
        Class_16867.Method_16945();
        if (!Class_19426.Method_19570() || !Class_12440.Field_12441) {
            Class_28636 class_28636 = this.\u0000strictfp();
            Class_28636 class_286362 = Class_18.Field_89.Field_27;
            float f5 = 0.007978723f * 1.9583334f * f2;
            Class_16867.Method_16943(0.0f, 0.36263737f * 1.3787879f * f2, 0.78846157f * 0.088780485f * f2);
            Class_16867.Method_16973(f5, -f5, f5);
            GL11.glNormal3f((float)0.0f, (float)0.0f, (float)(0.33333334f * -3.0f * f5));
            Class_16867.Method_16930((4352 & 164) != 0);
            int n3 = 8842 & 37;
            if (n < 0) {
                class_286362.Method_28712();
                for (int i = -32256 & 392; i < class_33614.Field_33615.length; ++i) {
                    if (class_33614.Field_33615[i] == null) continue;
                    String string = class_33614.Field_33616[i];
                    if (string == null) {
                        Class_1782 class_1782 = class_33614.Field_33615[i];
                        List list = Class_17908.Method_17911(class_1782, 12900 & -30492, class_28636, (-20670 & 20484) != 0, (345 & 17445) != 0);
                        class_33614.Field_33616[i] = string = list != null && list.size() > 0 ? ((Class_1782)list.get(-25504 & 512)).Method_1783() : "";
                    }
                    if (i == class_33614.Field_33618) {
                        string = "> " + string + " <";
                        class_286362.Method_28708(string, -class_286362.Method_28715(string) / (4618 & 11362), i * (22670 & 8283) - class_33614.Field_33615.length * (2061 & 4261), n3);
                        continue;
                    }
                    class_286362.Method_28708(string, -class_286362.Method_28715(string) / (19786 & 178), i * (527 & -31350) - class_33614.Field_33615.length * (22679 & -32763), n3);
                }
                class_286362.Method_28728();
            }
            Class_16867.Method_16930((-20343 & 595) != 0);
        }
        Class_16867.Method_16945();
        Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 1.0f);
        if (n >= 0) {
            Class_16867.Method_16934(-10349 & 7938);
            Class_16867.Method_16945();
            Class_16867.Method_16934(14088 & -26862);
        }
    }

    private void Method_19393() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_19394(Class_4879 class_4879, double d, double d2, double d3, float f, int n) {
        this.Method_19392((Class_33614)class_4879, d, d2, d3, f, n);
    }
}

