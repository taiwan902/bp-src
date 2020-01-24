/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Random;

public class Class_13196
extends Class_3238 {
    private final boolean Field_13197;
    public static final Class_4173 Field_13198;
    public static final Class_4173 Field_13199;
    public static final Class_4173 Field_13200;
    public static final Class_4173 Field_13201;

    public boolean Method_13202(Class_561 class_561, Class_4751 class_4751, Class_4595 class_4595) {
        return (class_561.Method_568(class_4751).Method_3442() == this ? -24556 & 18985 : super.Method_3356(class_561, class_4751, class_4595)) != 0;
    }

    public Class_17531 Method_13203() {
        return Class_17531.Field_17539;
    }

    public int Method_13204(Class_3436 class_3436) {
        return 25646 & 4801;
    }

    public Class_3436 Method_13205(Class_3436 class_3436, Class_561 class_561, Class_4751 class_4751) {
        return class_3436.Method_3437(Field_13201, Boolean.valueOf(this.Method_13207(class_561.Method_568(class_4751.Method_4778()).Method_3442()))).Method_3437(Field_13198, Boolean.valueOf(this.Method_13207(class_561.Method_568(class_4751.Method_4784()).Method_3442()))).Method_3437(Field_13200, Boolean.valueOf(this.Method_13207(class_561.Method_568(class_4751.Method_4771()).Method_3442()))).Method_3437(Field_13199, Boolean.valueOf(this.Method_13207(class_561.Method_568(class_4751.Method_4770()).Method_3442())));
    }

    public Class_1956 Method_13206(Class_3436 class_3436, Random random, int n) {
        return !this.Field_13197 ? null : super.Method_3427(class_3436, random, n);
    }

    protected Class_13196(Class_3713 class_3713, boolean bl) {
        super(class_3713);
        this.\u0000strictfp(this.\u0000strictfp.Method_3867().Method_3437(Field_13201, Boolean.valueOf((12497 & 1536) != 0)).Method_3437(Field_13199, Boolean.valueOf((6714 & -8000) != 0)).Method_3437(Field_13198, Boolean.valueOf((-16256 & 5153) != 0)).Method_3437(Field_13200, Boolean.valueOf((521 & -13198) != 0)));
        this.Field_13197 = bl;
        this.\u0000strictfp(Class_3987.Field_3995);
    }

    public final boolean Method_13207(Class_3238 class_3238) {
        return (class_3238.Method_3381() || class_3238 == this || class_3238 == Class_9265.Field_9345 || class_3238 == Class_9265.Field_9344 || class_3238 == Class_9265.Field_9309 || class_3238 instanceof Class_13196 ? 16461 & -32509 : 7690 & -24364) != 0;
    }

    private static String Method_13208(String string) {
        int n = 31168;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_13196.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public boolean Method_13209() {
        return (8708 & 18496) != 0;
    }

    private static String Method_13210(String string) {
        int n = 30442;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_13196.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public boolean Method_13211() {
        return (23596 & -32238) != 0;
    }

    private static String Method_13212(String string) {
        int n = 28418;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_13196.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    static {
        Field_13201 = Class_4173.Method_4177(Class_13196.Method_13212("\u0602\u0602\u0602\u0601\u0604"));
        Field_13199 = Class_4173.Method_4177(Class_13196.Method_13210("&# &"));
        Field_13198 = Class_4173.Method_4177(Class_13196.Method_13217("\u2029\u2020\u2029\u2029\u2020"));
        Field_13200 = Class_4173.Method_4177(Class_13196.Method_13208("\u544d\u544e\u5449\u544f"));
    }

    public void Method_13213(Class_561 class_561, Class_4751 class_4751) {
        float f = 0.18421052f * 2.375f;
        float f2 = 0.39583334f * 1.4210526f;
        float f3 = 9.666667f * 0.04525862f;
        float f4 = 0.41484374f * 1.3559322f;
        boolean bl = this.Method_13207(class_561.Method_568(class_4751.Method_4778()).Method_3442());
        boolean bl2 = this.Method_13207(class_561.Method_568(class_4751.Method_4784()).Method_3442());
        boolean bl3 = this.Method_13207(class_561.Method_568(class_4751.Method_4771()).Method_3442());
        boolean bl4 = this.Method_13207(class_561.Method_568(class_4751.Method_4770()).Method_3442());
        if ((!bl3 || !bl4) && (bl3 || bl4 || bl || bl2)) {
            if (bl3) {
                f = 0.0f;
            } else if (bl4) {
                f2 = 1.0f;
            }
        } else {
            f = 0.0f;
            f2 = 1.0f;
        }
        if ((!bl || !bl2) && (bl3 || bl4 || bl || bl2)) {
            if (bl) {
                f3 = 0.0f;
            } else if (bl2) {
                f4 = 1.0f;
            }
        } else {
            f3 = 0.0f;
            f4 = 1.0f;
        }
        this.\u0000strictfp(f, 0.0f, f3, f2, 1.0f, f4);
    }

    protected Class_3855 Method_13214() {
        Class_3538[] arrclass_3538 = new Class_3538[23749 & 20];
        arrclass_3538[-30030 & 68] = Field_13201;
        arrclass_3538[16677 & -23983] = Field_13199;
        arrclass_3538[1098 & 10551] = Field_13200;
        arrclass_3538[8211 & 20835] = Field_13198;
        return new Class_3855(this, arrclass_3538);
    }

    private void Method_13215() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_13216(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Class_10997 class_10997, List list, Class_1061 class_1061) {
        boolean bl = this.Method_13207(class_283.Method_375(class_4751.Method_4778()).Method_3442());
        boolean bl2 = this.Method_13207(class_283.Method_375(class_4751.Method_4784()).Method_3442());
        boolean bl3 = this.Method_13207(class_283.Method_375(class_4751.Method_4771()).Method_3442());
        boolean bl4 = this.Method_13207(class_283.Method_375(class_4751.Method_4770()).Method_3442());
        if ((!bl3 || !bl4) && (bl3 || bl4 || bl || bl2)) {
            if (bl3) {
                this.\u0000strictfp(0.0f, 0.0f, 0.5833333f * 0.75f, 0.8f * 0.625f, 1.0f, 6.3076925f * 0.089176826f);
                super.Method_3423(class_283, class_4751, class_3436, class_10997, list, class_1061);
            } else if (bl4) {
                this.\u0000strictfp(0.8901099f * 0.5617284f, 0.0f, 0.03780864f * 11.571428f, 1.0f, 1.0f, 2.3076923f * 0.24375f);
                super.Method_3423(class_283, class_4751, class_3436, class_10997, list, class_1061);
            }
        } else {
            this.\u0000strictfp(0.0f, 0.0f, 2.4117646f * 0.18140244f, 1.0f, 1.0f, 0.95454544f * 0.58928573f);
            super.Method_3423(class_283, class_4751, class_3436, class_10997, list, class_1061);
        }
        if ((!bl || !bl2) && (bl3 || bl4 || bl || bl2)) {
            if (bl) {
                this.\u0000strictfp(0.3416096f * 1.2807018f, 0.0f, 0.0f, 0.2888889f * 1.9471153f, 1.0f, 1.4444444f * 0.34615386f);
                super.Method_3423(class_283, class_4751, class_3436, class_10997, list, class_1061);
            } else if (bl2) {
                this.\u0000strictfp(1.6764706f * 0.2609649f, 0.0f, 0.24509804f * 2.04f, 3.0869565f * 0.18221831f, 1.0f, 1.0f);
                super.Method_3423(class_283, class_4751, class_3436, class_10997, list, class_1061);
            }
        } else {
            this.\u0000strictfp(0.8192771f * 0.5340074f, 0.0f, 0.0f, 0.75f * 0.75f, 1.0f, 1.0f);
            super.Method_3423(class_283, class_4751, class_3436, class_10997, list, class_1061);
        }
    }

    private static String Method_13217(String string) {
        int n = 8539;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_13196.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    protected boolean Method_13218() {
        return (21 & 28355) != 0;
    }

    public void Method_13219() {
        this.\u0000strictfp(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
    }
}

