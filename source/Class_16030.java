/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_16030
extends Class_3529 {
    public static final Class_5011 Field_16031 = Class_5011.Method_5012(Class_16030.Method_16049("\u0102\u0101\u0102\u0101\u0102\u0103"), Class_4662.Field_4663);
    private static boolean Field_16032;
    private final boolean Field_16033;

    private void Method_16034(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436) {
        if (!class_283.Field_306) {
            Class_3238 class_3238 = class_283.Method_375(class_4751.Method_4778()).Method_3442();
            Class_3238 class_32382 = class_283.Method_375(class_4751.Method_4784()).Method_3442();
            Class_3238 class_32383 = class_283.Method_375(class_4751.Method_4771()).Method_3442();
            Class_3238 class_32384 = class_283.Method_375(class_4751.Method_4770()).Method_3442();
            Class_4595 class_4595 = (Class_4595)((Object)class_3436.Method_3440(Field_16031));
            if (class_4595 == Class_4595.Field_4598 && class_3238.Method_3381() && !class_32382.Method_3381()) {
                class_4595 = Class_4595.Field_4613;
            } else if (class_4595 == Class_4595.Field_4613 && class_32382.Method_3381() && !class_3238.Method_3381()) {
                class_4595 = Class_4595.Field_4598;
            } else if (class_4595 == Class_4595.Field_4602 && class_32383.Method_3381() && !class_32384.Method_3381()) {
                class_4595 = Class_4595.Field_4603;
            } else if (class_4595 == Class_4595.Field_4603 && class_32384.Method_3381() && !class_32383.Method_3381()) {
                class_4595 = Class_4595.Field_4602;
            }
            class_283.Method_462(class_4751, class_3436.Method_3437(Field_16031, (Comparable)((Object)class_4595)), 2074 & 2);
        }
    }

    public Class_1956 Method_16035(Class_3436 class_3436, Random random, int n) {
        return Class_1956.Method_1981(Class_9265.Field_9354);
    }

    public Class_3436 Method_16036(Class_283 class_283, Class_4751 class_4751, Class_4595 class_4595, float f, float f2, float f3, int n, Class_859 class_859) {
        return this.\u0000strictfp().Method_3685(Field_16031, (Comparable)((Object)class_859.\u0000, `().Method_4660()));
    }

    protected Class_16030(boolean bl) {
        super(Class_3713.Field_3721);
        this.\u0000strictfp(this.\u0000strictfp.Method_3867().Method_3437(Field_16031, (Comparable)((Object)Class_4595.Field_4598)));
        this.Field_16033 = bl;
    }

    public void Method_16037(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Random random) {
        if (this.Field_16033) {
            Class_4595 class_4595 = (Class_4595)((Object)class_3436.Method_3440(Field_16031));
            double d = (double)class_4751.\u0000= final() + 1.325 * 0.37735849056603776;
            double d2 = (double)class_4751.\u0000, `() + random.nextDouble() * (8.533333333333333 * 0.703125) / (0.2786885245901639 * 57.411764705882355);
            double d3 = (double)class_4751.\u0000strictfp() + 0.2682926829268293 * 1.8636363636363635;
            double d4 = 1.0621276595744682 * 0.4895833333333333;
            double d5 = random.nextDouble() * (3.4285714285714284 * 0.17500000000000002) - 0.8387096774193549 * 0.35769230769230764;
            switch (Class_14842.Field_14843[class_4595.ordinal()]) {
                case 1: {
                    class_283.Method_407(Class_40274.Field_40283, d - d4, d2, d3 + d5, 0.0, 0.0, 0.0, new int[-30560 & 9744]);
                    class_283.Method_407(Class_40274.Field_40318, d - d4, d2, d3 + d5, 0.0, 0.0, 0.0, new int[19209 & 8228]);
                    break;
                }
                case 2: {
                    class_283.Method_407(Class_40274.Field_40283, d + d4, d2, d3 + d5, 0.0, 0.0, 0.0, new int[33 & 3136]);
                    class_283.Method_407(Class_40274.Field_40318, d + d4, d2, d3 + d5, 0.0, 0.0, 0.0, new int[-27264 & 24624]);
                    break;
                }
                case 3: {
                    class_283.Method_407(Class_40274.Field_40283, d + d5, d2, d3 - d4, 0.0, 0.0, 0.0, new int[9234 & 2336]);
                    class_283.Method_407(Class_40274.Field_40318, d + d5, d2, d3 - d4, 0.0, 0.0, 0.0, new int[260 & 4113]);
                    break;
                }
                case 4: {
                    class_283.Method_407(Class_40274.Field_40283, d + d5, d2, d3 + d4, 0.0, 0.0, 0.0, new int[-32747 & 12258]);
                    class_283.Method_407(Class_40274.Field_40318, d + d5, d2, d3 + d4, 0.0, 0.0, 0.0, new int[14346 & 17088]);
                }
            }
        }
    }

    public void Method_16038(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436) {
        Class_4879 class_4879;
        if (!Field_16032 && (class_4879 = class_283.Method_429(class_4751)) instanceof Class_44437) {
            Class_24128.Method_24131(class_283, class_4751, (Class_44437)class_4879);
            class_283.Method_520(class_4751, this);
        }
        super.Method_3531(class_283, class_4751, class_3436);
    }

    protected Class_3855 Method_16039() {
        Class_3538[] arrclass_3538 = new Class_3538[-15327 & 261];
        arrclass_3538[6704 & -24512] = Field_16031;
        return new Class_3855(this, arrclass_3538);
    }

    public boolean Method_16040() {
        return (16001 & -32415) != 0;
    }

    public int Method_16041(Class_283 class_283, Class_4751 class_4751) {
        return Class_8295.Method_8323(class_283.Method_429(class_4751));
    }

    public Class_3436 Method_16042(Class_3436 class_3436) {
        return this.\u0000strictfp().Method_3685(Field_16031, (Comparable)((Object)Class_4595.Field_4613));
    }

    public Class_3436 Method_16043(int n) {
        Class_4595 class_4595 = Class_4595.Method_4637(n);
        if (class_4595.Method_4640() == Class_4565.Field_4569) {
            class_4595 = Class_4595.Field_4598;
        }
        return this.\u0000strictfp().Method_3685(Field_16031, (Comparable)((Object)class_4595));
    }

    public void Method_16044(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436) {
        this.Method_16034(class_283, class_4751, class_3436);
    }

    public static void Method_16045(boolean bl, Class_283 class_283, Class_4751 class_4751) {
        Class_3436 class_3436 = class_283.Method_375(class_4751);
        Class_4879 class_4879 = class_283.Method_429(class_4751);
        Field_16032 = 4903 & 10369;
        if (bl) {
            class_283.Method_462(class_4751, Class_9265.Field_9425.Method_3293().Method_3685(Field_16031, class_3436.Method_3440(Field_16031)), 527 & 10371);
            class_283.Method_462(class_4751, Class_9265.Field_9425.Method_3293().Method_3685(Field_16031, class_3436.Method_3440(Field_16031)), 11415 & -32245);
        } else {
            class_283.Method_462(class_4751, Class_9265.Field_9354.Method_3293().Method_3685(Field_16031, class_3436.Method_3440(Field_16031)), 1027 & 27343);
            class_283.Method_462(class_4751, Class_9265.Field_9354.Method_3293().Method_3685(Field_16031, class_3436.Method_3440(Field_16031)), 3335 & -12149);
        }
        Field_16032 = -28668 & 714;
        if (class_4879 != null) {
            class_4879.Method_4904();
            class_283.Method_409(class_4751, class_4879);
        }
    }

    public int Method_16046() {
        return -26617 & 16419;
    }

    public int Method_16047(Class_3436 class_3436) {
        return ((Class_4595)((Object)class_3436.Method_3440(Field_16031))).Method_4648();
    }

    private void Method_16048() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private static String Method_16049(String string) {
        int n = 31916;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_16030.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public boolean Method_16050(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Class_626 class_626, Class_4595 class_4595, float f, float f2, float f3) {
        if (class_283.Field_306) {
            return (-32727 & 9297) != 0;
        }
        Class_4879 class_4879 = class_283.Method_429(class_4751);
        if (class_4879 instanceof Class_44437) {
            class_626.Method_800((Class_44437)class_4879);
            class_626.Method_750(Class_19863.Field_19898);
        }
        return (1541 & 6289) != 0;
    }

    public void Method_16051(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Class_859 class_859, Class_23823 class_23823) {
        Class_4879 class_4879;
        class_283.Method_462(class_4751, class_3436.Method_3437(Field_16031, (Comparable)((Object)class_859.\u0000, `().Method_4660())), 16774 & 531);
        if (class_23823.Method_23851() && (class_4879 = class_283.Method_429(class_4751)) instanceof Class_44437) {
            ((Class_44437)class_4879).Method_44477(class_23823.Method_23899());
        }
    }

    public Class_4879 Method_16052(Class_283 class_283, int n) {
        return new Class_44437();
    }

    public Class_1956 Method_16053(Class_283 class_283, Class_4751 class_4751) {
        return Class_1956.Method_1981(Class_9265.Field_9354);
    }
}

