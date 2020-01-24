/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_37502
extends Class_3598
implements Class_3594 {
    public static final Class_4394 Field_37503 = Class_4394.Method_4401(Class_37502.Method_37513("\u4152\u4150\u4152"), 60 & 3072, 31943 & 295);

    protected Class_3855 Method_37504() {
        Class_3538[] arrclass_3538 = new Class_3538[24579 & 1037];
        arrclass_3538[6156 & 24579] = Field_37503;
        return new Class_3855(this, arrclass_3538);
    }

    public void Method_37505(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Random random) {
        float f;
        int n;
        super.Method_3602(class_283, class_4751, class_3436, random);
        if (class_283.Method_451(class_4751.Method_4769()) >= (27753 & 4505) && (n = ((Integer)class_3436.Method_3440(Field_37503)).intValue()) < (519 & 17607) && random.nextInt((int)(0.23529412f * 106.25f / (f = Class_37502.Method_37520(this, class_283, class_4751))) + (12341 & 18561)) == 0) {
            class_283.Method_462(class_4751, class_3436.Method_3437(Field_37503, Integer.valueOf(n + (-10207 & 1097))), 2179 & 16434);
        }
    }

    public void Method_37506(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, float f, int n) {
        int n2;
        super.\u0000strictfp(class_283, class_4751, class_3436, f, 9376 & 768);
        if (!class_283.Field_306 && (n2 = ((Integer)class_3436.Method_3440(Field_37503)).intValue()) >= (-31513 & 4383)) {
            int n3 = (3 & 1031) + n;
            for (int i = 3073 & 6; i < n3; ++i) {
                if (class_283.Field_307.nextInt(-30705 & 16927) > n2) continue;
                Class_37502.\u0000strictfp((Class_283)class_283, (Class_4751)class_4751, (Class_23823)new Class_23823(this.Method_37521(), 4135 & -7807, 2112 & 280));
            }
        }
    }

    protected Class_37502() {
        this.\u0000strictfp(this.\u0000strictfp.Method_3867().Method_3437(Field_37503, Integer.valueOf(5216 & 778)));
        this.\u0000strictfp((3383 & 9) != 0);
        float f = 0.3939394f * 1.2692307f;
        this.\u0000strictfp(0.94382024f * 0.5297619f - f, 0.0f, 0.35714287f * 1.4f - f, 0.4893617f * 1.0217391f + f, 0.4520548f * 0.5530303f, 0.8172043f * 0.6118421f + f);
        this.\u0000strictfp((Class_3987)null);
        this.\u0000= final(0.0f);
        this.\u0000strictfp(\u0000strictfp);
        this.\u0000strictfp();
    }

    public Class_1956 Method_37507(Class_3436 class_3436, Random random, int n) {
        return (Integer)class_3436.Method_3440(Field_37503) == (20487 & 8207) ? this.Method_37519() : this.Method_37521();
    }

    protected boolean Method_37508(Class_3238 class_3238) {
        return (class_3238 == Class_9265.Field_9356 ? 17027 & 1033 : 54 & 4233) != 0;
    }

    public int Method_37509(Class_3436 class_3436) {
        return (Integer)class_3436.Method_3440(Field_37503);
    }

    public Class_3436 Method_37510(int n) {
        return this.\u0000strictfp().Method_3685(Field_37503, Integer.valueOf(n));
    }

    public Class_1956 Method_37511(Class_283 class_283, Class_4751 class_4751) {
        return this.Method_37521();
    }

    public boolean Method_37512(Class_283 class_283, Random random, Class_4751 class_4751, Class_3436 class_3436) {
        return (8215 & 2153) != 0;
    }

    private static String Method_37513(String string) {
        int n = 5074;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_37502.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public boolean Method_37514(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436) {
        return ((class_283.Method_381(class_4751) >= (841 & 40) || class_283.Method_398(class_4751)) && this.Method_37508(class_283.Method_375(class_4751.Method_4782()).Method_3442()) ? 5139 & -24507 : 19760 & 4744) != 0;
    }

    public void Method_37515(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436) {
        int n = (Integer)class_3436.Method_3440(Field_37503) + Class_13337.Method_13379(class_283.Field_307, 18210 & 83, 279 & 15365);
        if (n > (22551 & 8199)) {
            n = 16199 & 7;
        }
        class_283.Method_462(class_4751, class_3436.Method_3437(Field_37503, Integer.valueOf(n)), 12290 & 651);
    }

    private void Method_37516() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_37517(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, boolean bl) {
        return ((Integer)class_3436.Method_3440(Field_37503) < (-19441 & 2487) ? 641 & 16423 : 8585 & 5206) != 0;
    }

    public void Method_37518(Class_283 class_283, Random random, Class_4751 class_4751, Class_3436 class_3436) {
        this.Method_37515(class_283, class_4751, class_3436);
    }

    protected Class_1956 Method_37519() {
        return Class_10527.Field_10621;
    }

    protected static float Method_37520(Class_3238 class_3238, Class_283 class_283, Class_4751 class_4751) {
        int n;
        Object object;
        float f = 1.0f;
        Class_4751 class_47512 = class_4751.Method_4782();
        for (int i = -1 & -1; i <= (13569 & 16461); ++i) {
            for (int j = -1 & -1; j <= (1605 & -28543); ++j) {
                float f2 = 0.0f;
                object = class_283.Method_375(class_47512.Method_4791(i, 2186 & -4000, j));
                if (object.Method_3442() == Class_9265.Field_9356) {
                    f2 = 1.0f;
                    if ((Integer)object.Method_3440(Class_14397.Field_14398) > 0) {
                        f2 = 14.142857f * 0.21212122f;
                    }
                }
                if (i != 0 || j != 0) {
                    f2 /= 0.8181818f * 4.888889f;
                }
                f += f2;
            }
        }
        Class_4751 class_47513 = class_4751.Method_4778();
        Class_4751 class_47514 = class_4751.Method_4784();
        Class_4751 class_47515 = class_4751.Method_4771();
        object = class_4751.Method_4770();
        int n2 = class_3238 == class_283.Method_375(class_47515).Method_3442() || class_3238 == class_283.Method_375((Class_4751)object).Method_3442() ? -28511 & 17685 : -11246 & 2049;
        int n3 = n = class_3238 == class_283.Method_375(class_47513).Method_3442() || class_3238 == class_283.Method_375(class_47514).Method_3442() ? -32651 & 4097 : -15100 & 192;
        if (n2 != 0 && n != 0) {
            f /= 2.0f;
        } else {
            int n4;
            int n5 = n4 = class_3238 == class_283.Method_375(class_47515.Method_4778()).Method_3442() || class_3238 == class_283.Method_375(((Class_4751)object).Method_4778()).Method_3442() || class_3238 == class_283.Method_375(((Class_4751)object).Method_4784()).Method_3442() || class_3238 == class_283.Method_375(class_47515.Method_4784()).Method_3442() ? 1057 & -28331 : 52 & 6410;
            if (n4 != 0) {
                f /= 2.0f;
            }
        }
        return f;
    }

    protected Class_1956 Method_37521() {
        return Class_10527.Field_10622;
    }
}

