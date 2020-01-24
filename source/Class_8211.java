/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_8211
extends Class_3529 {
    public static final Class_5011 Field_8212 = Class_5011.Method_5012(Class_8211.Method_8228("\u81a0\u81a1\u81a2\u81ab\u81ac\u81a5"), Class_4662.Field_4663);

    public boolean Method_8213(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Class_626 class_626, Class_4595 class_4595, float f, float f2, float f3) {
        Class_47024 class_47024 = class_626.Method_787();
        Class_4879 class_4879 = class_283.Method_429(class_4751);
        if (class_47024 != null && class_4879 instanceof Class_39196) {
            if (class_283.Method_375(class_4751.Method_4769()).Method_3442().Method_3400()) {
                return (1665 & 77) != 0;
            }
            if (class_283.Field_306) {
                return (2051 & 25281) != 0;
            }
            class_47024.Method_47031((Class_39196)class_4879);
            class_626.Method_800(class_47024);
            class_626.Method_750(Class_19863.Field_19867);
            return (3463 & -28591) != 0;
        }
        return (12305 & 16911) != 0;
    }

    protected Class_3855 Method_8214() {
        Class_3538[] arrclass_3538 = new Class_3538[2145 & 26113];
        arrclass_3538[1160 & 10256] = Field_8212;
        return new Class_3855(this, arrclass_3538);
    }

    public int Method_8215() {
        return 24834 & 82;
    }

    public void Method_8216(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Class_859 class_859, Class_23823 class_23823) {
        class_283.Method_462(class_4751, class_3436.Method_3437(Field_8212, (Comparable)((Object)class_859.\u0000, `().Method_4660())), -12277 & 11334);
    }

    public Class_1956 Method_8217(Class_3436 class_3436, Random random, int n) {
        return Class_1956.Method_1981(Class_9265.Field_9445);
    }

    public int Method_8218(Random random) {
        return 17770 & 520;
    }

    public int Method_8219(Class_3436 class_3436) {
        return ((Class_4595)((Object)class_3436.Method_3440(Field_8212))).Method_4648();
    }

    public boolean Method_8220() {
        return (-32763 & 104) != 0;
    }

    public Class_4879 Method_8221(Class_283 class_283, int n) {
        return new Class_39196();
    }

    private void Method_8222() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_8223() {
        return (-25539 & 16450) != 0;
    }

    public void Method_8224(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Random random) {
        for (int i = -20923 & 32; i < (435 & 8707); ++i) {
            int n = random.nextInt(2259 & 290) * (17799 & -32766) - (-5871 & 1547);
            int n2 = random.nextInt(4102 & 17411) * (-32637 & 9794) - (-24439 & 7);
            double d = (double)class_4751.\u0000= final() + 1.14 * 0.4385964912280702 + 0.37890625 * 0.6597938144329897 * (double)n;
            double d2 = (float)class_4751.\u0000, `() + random.nextFloat();
            double d3 = (double)class_4751.\u0000strictfp() + 0.42424242424242425 * 1.1785714285714286 + 0.3333333333333333 * 0.75 * (double)n2;
            double d4 = random.nextFloat() * (float)n;
            double d5 = ((double)random.nextFloat() - 0.3392857142857143 * 1.4736842105263157) * (0.4418604651162791 * 0.28289473684210525);
            double d6 = random.nextFloat() * (float)n2;
            class_283.Method_407(Class_40274.Field_40307, d, d2, d3, d4, d5, d6, new int[-31166 & 6168]);
        }
    }

    protected boolean Method_8225() {
        return (-30133 & 20657) != 0;
    }

    protected Class_8211() {
        super(Class_3713.Field_3721);
        this.\u0000strictfp(this.\u0000strictfp.Method_3867().Method_3437(Field_8212, (Comparable)((Object)Class_4595.Field_4598)));
        this.\u0000strictfp(Class_3987.Field_3995);
        this.\u0000strictfp(0.26666668f * 0.23437499f, 0.0f, 0.19642858f * 0.3181818f, 0.4522059f * 2.0731707f, 1.0f * 0.875f, 0.868421f * 1.0795455f);
    }

    public Class_3436 Method_8226(int n) {
        Class_4595 class_4595 = Class_4595.Method_4637(n);
        if (class_4595.Method_4640() == Class_4565.Field_4569) {
            class_4595 = Class_4595.Field_4598;
        }
        return this.\u0000strictfp().Method_3685(Field_8212, (Comparable)((Object)class_4595));
    }

    public Class_3436 Method_8227(Class_283 class_283, Class_4751 class_4751, Class_4595 class_4595, float f, float f2, float f3, int n, Class_859 class_859) {
        return this.\u0000strictfp().Method_3685(Field_8212, (Comparable)((Object)class_859.\u0000, `().Method_4660()));
    }

    private static String Method_8228(String string) {
        int n = 2146;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_8211.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }
}

