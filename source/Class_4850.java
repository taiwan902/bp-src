/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_4850
extends Class_3529 {
    public static final Class_5034 Field_4851;
    public static final Class_4173 Field_4852;
    public static final Class_5011 Field_4853;
    protected Random Field_4854 = new Random();

    public void Method_4855(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Random random) {
        if (!class_283.Field_306) {
            this.Method_4873(class_283, class_4751);
        }
    }

    public int Method_4856(Class_283 class_283) {
        return 5124 & -29812;
    }

    protected Class_4850() {
        super(Class_3713.Field_3721);
        this.\u0000strictfp(this.\u0000strictfp.Method_3867().Method_3437(Field_4853, (Comparable)((Object)Class_4595.Field_4598)).Method_3437(Field_4852, Boolean.valueOf((1158 & 2577) != 0)));
        this.\u0000strictfp(Class_3987.Field_3998);
    }

    private static String Method_4857(String string) {
        int n = 29858;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_4850.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public boolean Method_4858(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Class_626 class_626, Class_4595 class_4595, float f, float f2, float f3) {
        if (class_283.Field_306) {
            return (16529 & 12841) != 0;
        }
        Class_4879 class_4879 = class_283.Method_429(class_4751);
        if (class_4879 instanceof Class_4933) {
            class_626.Method_800((Class_4933)class_4879);
            if (class_4879 instanceof Class_23694) {
                class_626.Method_750(Class_19863.Field_19915);
            } else {
                class_626.Method_750(Class_19863.Field_19884);
            }
        }
        return (17153 & 231) != 0;
    }

    public void Method_4859(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436) {
        Class_4879 class_4879 = class_283.Method_429(class_4751);
        if (class_4879 instanceof Class_4933) {
            Class_24128.Method_24131(class_283, class_4751, (Class_4933)class_4879);
            class_283.Method_520(class_4751, this);
        }
        super.Method_3531(class_283, class_4751, class_3436);
    }

    public Class_3436 Method_4860(Class_283 class_283, Class_4751 class_4751, Class_4595 class_4595, float f, float f2, float f3, int n, Class_859 class_859) {
        return this.\u0000strictfp().Method_3685(Field_4853, (Comparable)((Object)Class_5257.Method_5267(class_283, class_4751, class_859))).Method_3437(Field_4852, Boolean.valueOf((-31200 & 144) != 0));
    }

    public void Method_4861(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Class_859 class_859, Class_23823 class_23823) {
        Class_4879 class_4879;
        class_283.Method_462(class_4751, class_3436.Method_3437(Field_4853, (Comparable)((Object)Class_5257.Method_5267(class_283, class_4751, class_859))), 21590 & 8363);
        if (class_23823.Method_23851() && (class_4879 = class_283.Method_429(class_4751)) instanceof Class_4933) {
            ((Class_4933)class_4879).Method_4954(class_23823.Method_23899());
        }
    }

    protected Class_5046 Method_4862(Class_23823 class_23823) {
        return (Class_5046)Field_4851.Method_5037(class_23823 == null ? null : class_23823.Method_23844());
    }

    protected Class_3855 Method_4863() {
        Class_3538[] arrclass_3538 = new Class_3538[806 & -32757];
        arrclass_3538[2052 & 13824] = Field_4853;
        arrclass_3538[1 & 5793] = Field_4852;
        return new Class_3855(this, arrclass_3538);
    }

    public int Method_4864(Class_3436 class_3436) {
        int n = 8449 & -28128;
        n |= ((Class_4595)((Object)class_3436.Method_3440(Field_4853))).Method_4648();
        if (((Boolean)class_3436.Method_3440(Field_4852)).booleanValue()) {
            n |= 4232 & 9292;
        }
        return n;
    }

    public int Method_4865(Class_283 class_283, Class_4751 class_4751) {
        return Class_8295.Method_8323(class_283.Method_429(class_4751));
    }

    public boolean Method_4866() {
        return (20889 & -32763) != 0;
    }

    public static Class_4997 Method_4867(Class_5001 class_5001) {
        Class_4595 class_4595 = Class_4850.Method_4869(class_5001.Method_5007());
        double d = class_5001.Method_5005() + 3.376470588235294 * 0.2073170731707317 * (double)class_4595.Method_4654();
        double d2 = class_5001.Method_5002() + 4.333333333333333 * 0.16153846153846155 * (double)class_4595.Method_4633();
        double d3 = class_5001.Method_5004() + 5.75 * 0.1217391304347826 * (double)class_4595.Method_4656();
        return new Class_33578(d, d2, d3);
    }

    private void Method_4868() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public static Class_4595 Method_4869(int n) {
        return Class_4595.Method_4637(n & (18199 & 8327));
    }

    public int Method_4870() {
        return 1155 & 4659;
    }

    static {
        Field_4853 = Class_5011.Method_5013(Class_4850.Method_4857("\u0b00\u0b03\u0b01\u0b0b\u0b0c\u0b05"));
        Field_4852 = Class_4173.Method_4177(Class_4850.Method_4876("\u8300\u8305\u830f\u8302\u8301\u8300\u8306\u8302\u8300"));
        Field_4851 = new Class_5034(new Class_5038());
    }

    public Class_4879 Method_4871(Class_283 class_283, int n) {
        return new Class_4933();
    }

    public void Method_4872(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Class_3238 class_3238) {
        int n = class_283.Method_414(class_4751) || class_283.Method_414(class_4751.Method_4769()) ? 5787 & 1 : 1122 & 16;
        boolean bl = (Boolean)class_3436.Method_3440(Field_4852);
        if (n != 0 && !bl) {
            class_283.Method_441(class_4751, this, this.Method_4856(class_283));
            class_283.Method_462(class_4751, class_3436.Method_3437(Field_4852, Boolean.valueOf((10305 & 16947) != 0)), -15284 & 12420);
        } else if (n == 0 && bl) {
            class_283.Method_462(class_4751, class_3436.Method_3437(Field_4852, Boolean.valueOf((512 & 2312) != 0)), -31964 & 85);
        }
    }

    protected void Method_4873(Class_283 class_283, Class_4751 class_4751) {
        Class_37324 class_37324 = new Class_37324(class_283, class_4751);
        Class_4933 class_4933 = (Class_4933)class_37324.Method_37331();
        if (class_4933 != null) {
            int n = class_4933.Method_4949();
            if (n < 0) {
                class_283.Method_502(6125 & 27627, class_4751, 521 & 24598);
            } else {
                Class_23823 class_23823 = class_4933.Method_4939(n);
                Class_5046 class_5046 = this.Method_4862(class_23823);
                if (class_5046 != Class_5046.Field_5047) {
                    Class_23823 class_238232 = class_5046.Method_5048(class_37324, class_23823);
                    class_4933.Method_4956(n, class_238232.Field_23826 <= 0 ? null : class_238232);
                }
            }
        }
    }

    public void Method_4874(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436) {
        super.\u0000, `(class_283, class_4751, class_3436);
        this.Method_4878(class_283, class_4751, class_3436);
    }

    public Class_3436 Method_4875(int n) {
        return this.\u0000strictfp().Method_3685(Field_4853, (Comparable)((Object)Class_4850.Method_4869(n))).Method_3437(Field_4852, Boolean.valueOf(((n & (267 & -27572)) > 0 ? 1025 & -24427 : -31616 & 8465) != 0));
    }

    private static String Method_4876(String string) {
        int n = 11942;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_4850.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_3436 Method_4877(Class_3436 class_3436) {
        return this.\u0000strictfp().Method_3685(Field_4853, (Comparable)((Object)Class_4595.Field_4613));
    }

    private void Method_4878(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436) {
        if (!class_283.Field_306) {
            Class_4595 class_4595 = (Class_4595)((Object)class_3436.Method_3440(Field_4853));
            boolean bl = class_283.Method_375(class_4751.Method_4778()).Method_3442().Method_3381();
            boolean bl2 = class_283.Method_375(class_4751.Method_4784()).Method_3442().Method_3381();
            if (class_4595 == Class_4595.Field_4598 && bl && !bl2) {
                class_4595 = Class_4595.Field_4613;
            } else if (class_4595 == Class_4595.Field_4613 && bl2 && !bl) {
                class_4595 = Class_4595.Field_4598;
            } else {
                boolean bl3 = class_283.Method_375(class_4751.Method_4771()).Method_3442().Method_3381();
                boolean bl4 = class_283.Method_375(class_4751.Method_4770()).Method_3442().Method_3381();
                if (class_4595 == Class_4595.Field_4602 && bl3 && !bl4) {
                    class_4595 = Class_4595.Field_4603;
                } else if (class_4595 == Class_4595.Field_4603 && bl4 && !bl3) {
                    class_4595 = Class_4595.Field_4602;
                }
            }
            class_283.Method_462(class_4751, class_3436.Method_3437(Field_4853, (Comparable)((Object)class_4595)).Method_3437(Field_4852, Boolean.valueOf((8232 & 3651) != 0)), 1026 & 194);
        }
    }
}

