/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_46770
extends Class_3598 {
    public static final Class_4394 Field_46771 = Class_4394.Method_4401(Class_46770.Method_46776("\u5142\u5145\u5146"), 18440 & -24032, 15 & 21299);

    public int Method_46772(Random random) {
        return -21340 & 4419;
    }

    public Class_1956 Method_46773(Class_3436 class_3436, Random random, int n) {
        return null;
    }

    public Class_3436 Method_46774(int n) {
        return this.\u0000strictfp().Method_3685(Field_46771, Integer.valueOf(n));
    }

    protected Class_3855 Method_46775() {
        Class_3538[] arrclass_3538 = new Class_3538[10629 & 20489];
        arrclass_3538[4360 & -13279] = Field_46771;
        return new Class_3855(this, arrclass_3538);
    }

    private static String Method_46776(String string) {
        int n = 30457;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_46770.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_46777() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_1956 Method_46778(Class_283 class_283, Class_4751 class_4751) {
        return Class_10527.Field_10675;
    }

    public int Method_46779(Class_3436 class_3436) {
        return (Integer)class_3436.Method_3440(Field_46771);
    }

    public void Method_46780(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Random random) {
        int n = (Integer)class_3436.Method_3440(Field_46771);
        if (n < (-20925 & 35) && random.nextInt(842 & 170) == 0) {
            class_3436 = class_3436.Method_3437(Field_46771, Integer.valueOf(n + (1 & -17205)));
            class_283.Method_462(class_4751, class_3436, 16450 & 8222);
        }
        super.Method_3602(class_283, class_4751, class_3436, random);
    }

    public void Method_46781(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, float f, int n) {
        if (!class_283.Field_306) {
            int n2 = 9177 & 1059;
            if ((Integer)class_3436.Method_3440(Field_46771) >= (16771 & -27085)) {
                n2 = (-31474 & 19) + class_283.Field_307.nextInt(3183 & 28675);
                if (n > 0) {
                    n2 += class_283.Field_307.nextInt(n + (8197 & -29263));
                }
            }
            for (int i = -16352 & 782; i < n2; ++i) {
                Class_46770.\u0000strictfp((Class_283)class_283, (Class_4751)class_4751, (Class_23823)new Class_23823(Class_10527.Field_10675));
            }
        }
    }

    public boolean Method_46782(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436) {
        return this.Method_46783(class_283.Method_375(class_4751.Method_4782()).Method_3442());
    }

    protected boolean Method_46783(Class_3238 class_3238) {
        return (class_3238 == Class_9265.Field_9363 ? 4363 & 641 : 32 & -13696) != 0;
    }

    protected Class_46770() {
        super(Class_3713.Field_3736, Class_3779.Field_3790);
        this.\u0000strictfp(this.\u0000strictfp.Method_3867().Method_3437(Field_46771, Integer.valueOf(16416 & 6657)));
        this.\u0000strictfp((11799 & 4545) != 0);
        float f = 12.25f * 0.040816326f;
        this.\u0000strictfp(0.48979592f * 1.0208334f - f, 0.0f, 0.23333333f * 2.142857f - f, 0.072463766f * 6.9f + f, 0.8333333f * 0.3f, 0.48333335f * 1.0344827f + f);
        this.\u0000strictfp((Class_3987)null);
    }
}

