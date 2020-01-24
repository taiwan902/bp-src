/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  internal.org.lwjgl.util.glu.Project
 */
import com.google.common.collect.Lists;
import internal.org.lwjgl.util.glu.Project;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Class_28746
extends Class_1906 {
    private final Class_4977 Field_28747;
    public float Field_28748;
    public int Field_28749;
    private Random Field_28750 = new Random();
    private static final Class_2080 Field_28751;
    Class_23823 Field_28752;
    private static final Class_2080 Field_28753;
    public float Field_28754;
    public float Field_28755;
    public float Field_28756;
    private Class_15363 Field_28757;
    public float Field_28758;
    public float Field_28759;
    private static final Class_36556 Field_28760;
    private final Class_37781 Field_28761;

    private static String Method_28762(String string) {
        int n = 23904;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_28746.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_28763(int n, int n2, float f) {
        super.Method_1948(n, n2, f);
        boolean bl = this.\u0000strictfp.Field_48.\u0000strictfp.Method_18094();
        int n3 = this.Field_28757.Method_15378();
        for (int i = -8192 & 208; i < (515 & 35); ++i) {
            String string;
            int n4 = this.Field_28757.Field_15366[i];
            int n5 = this.Field_28757.Field_15368[i];
            int n6 = i + (-4003 & 673);
            if (!this.\u0000strictfp(19260 & 1084, (4238 & 12110) + (-31213 & 55) * i, 381 & 4204, -31723 & 16667, n, n2) || n4 <= 0 || n5 < 0) continue;
            ArrayList arrayList = Lists.newArrayList();
            if (n5 >= 0 && Class_30635.Method_30685(n5 & (13055 & 2303)) != null) {
                string = Class_30635.Method_30685(n5 & (10495 & -11009)).Method_30706((n5 & (143064832 & 130816)) >> (1672 & 10248));
                Object[] arrobject = new Object[-30951 & 165];
                arrobject[4841 & 0] = string;
                arrayList.add(Class_5478.Field_5491.Method_5540() + Class_5478.Field_5495.Method_5540() + Class_9802.Method_9806("container.enchant.clue", arrobject));
            }
            if (!bl) {
                if (n5 >= 0) {
                    arrayList.add("");
                }
                if (this.\u0000strictfp.Field_48.\u0000= final < n4) {
                    arrayList.add(Class_5478.Field_5505.Method_5540() + "Level Requirement: " + this.Field_28757.Field_15366[i]);
                } else {
                    string = "";
                    if (n6 == (2177 & -31899)) {
                        string = Class_9802.Method_9806("container.enchant.lapis.one", new Object[8458 & 21632]);
                    } else {
                        Object[] arrobject = new Object[-24183 & 1079];
                        arrobject[20740 & 8339] = n6;
                        string = Class_9802.Method_9806("container.enchant.lapis.many", arrobject);
                    }
                    if (n3 >= n6) {
                        arrayList.add(Class_5478.Field_5480.Method_5540() + "" + string);
                    } else {
                        arrayList.add(Class_5478.Field_5505.Method_5540() + "" + string);
                    }
                    if (n6 == (777 & -13215)) {
                        string = Class_9802.Method_9806("container.enchant.level.one", new Object[17344 & 6163]);
                    } else {
                        Object[] arrobject = new Object[-24445 & 5377];
                        arrobject[1174 & 0] = n6;
                        string = Class_9802.Method_9806("container.enchant.level.many", arrobject);
                    }
                    arrayList.add(Class_5478.Field_5480.Method_5540() + "" + string);
                }
            }
            this.\u0000strictfp((List)arrayList, n, n2);
            break;
        }
    }

    private void Method_28764() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private static String Method_28765(String string) {
        int n = 11890;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_28746.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    static {
        Field_28753 = new Class_2080(Class_28746.Method_28762("\u0c64\u0c75\u0c60\u0c65\u0c60\u0c65\u0c70\u0c65\u0c3c\u0c7d\u0c6c\u0c79\u0c38\u0c7d\u0c78\u0c79\u0c64\u0c71\u0c70\u0c75\u0c70\u0c65\u0c30\u0c71\u0c7c\u0c79\u0c78\u0c79\u0c78\u0c69\u0c7c\u0c79\u0c74\u0c45\u0c64\u0c71\u0c74\u0c71\u0c70\u0c31\u0c68\u0c7d\u0c7c"));
        Field_28751 = new Class_2080(Class_28746.Method_28765("\u3128\u3128\u3122\u312a\u3128\u3128\u312a\u312a\u3128\u3120\u312a\u3122\u3128\u3120\u312a\u312a\u3128\u3120\u312a\u3122\u3128\u3120\u312a\u3122\u3128\u3120\u310a\u3122\u3120\u3120\u312a\u3122\u3100\u3128\u3122\u3122\u3120\u3120\u312a\u3122\u3120"));
        Field_28760 = new Class_36556();
    }

    public void Method_28766() {
        super.Method_1942();
        this.Method_28768();
    }

    protected void Method_28767(float f, int n, int n2) {
        Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 1.0f);
        this.\u0000strictfp.Method_253().Method_34707(Field_28753);
        int n3 = (this.\u0000= final - this.\u0000, for) / (16931 & 2);
        int n4 = (this.\u0000, ` - this.\u0000= int) / (-32714 & 2690);
        this.\u0000strictfp(n3, n4, 4096 & 8192, -31962 & 29896, this.\u0000, for, this.\u0000= int);
        Class_16867.Method_16961();
        Class_16867.Method_16934(5889 & 22285);
        Class_16867.Method_16961();
        Class_16867.Method_16962();
        Class_31566 class_31566 = new Class_31566(this.\u0000strictfp);
        Class_16867.Method_16910((class_31566.Method_31574() - (29141 & 1376)) / (546 & -27642) * class_31566.Method_31572(), (class_31566.Method_31575() - (4340 & 8434)) / (194 & 12306) * class_31566.Method_31572(), (352 & 5978) * class_31566.Method_31572(), (20979 & -32016) * class_31566.Method_31572());
        Class_16867.Method_16943(0.4852941f * -0.7006061f, 0.047735848f * 4.818182f, 0.0f);
        Project.gluPerspective((float)(12.20339f * 7.375f), (float)(0.06896552f * 19.333334f), (float)(3.1034482f * 2.9f), (float)(0.46875f * 170.66667f));
        float f2 = 1.0f;
        Class_16867.Method_16934(-26744 & 30535);
        Class_16867.Method_16962();
        Class_39477.Method_39482();
        Class_16867.Method_16943(0.0f, 3.826087f * 0.86249995f, 2.5833333f * -6.1935487f);
        Class_16867.Method_16973(f2, f2, f2);
        float f3 = 2.6595745f * 1.88f;
        Class_16867.Method_16973(f3, f3, f3);
        Class_16867.Method_16940(120.731705f * 1.4909091f, 0.0f, 0.0f, 1.0f);
        this.\u0000strictfp.Method_253().Method_34707(Field_28751);
        Class_16867.Method_16940(384.0f * 0.052083332f, 1.0f, 0.0f, 0.0f);
        float f4 = this.Field_28748 + (this.Field_28755 - this.Field_28748) * f;
        Class_16867.Method_16943((1.0f - f4) * (1.7333333f * 0.115384616f), (1.0f - f4) * (0.03766234f * 2.6551723f), (1.0f - f4) * (0.3515625f * 0.7111111f));
        Class_16867.Method_16940(-(1.0f - f4) * (1.1022727f * 81.64948f) - 297.93103f * 0.30208334f, 0.0f, 1.0f, 0.0f);
        Class_16867.Method_16940(3.1818182f * 56.571426f, 1.0f, 0.0f, 0.0f);
        float f5 = this.Field_28756 + (this.Field_28759 - this.Field_28756) * f + 0.6712329f * 0.37244898f;
        float f6 = this.Field_28756 + (this.Field_28759 - this.Field_28756) * f + 2.1463416f * 0.3494318f;
        f5 = (f5 - (float)Class_13337.Method_13375(f5)) * (1.0588236f * 1.511111f) - 0.05263158f * 5.7000003f;
        f6 = (f6 - (float)Class_13337.Method_13375(f6)) * (1.2363636f * 1.2941177f) - 0.3814286f * 0.78651685f;
        if (f5 < 0.0f) {
            f5 = 0.0f;
        }
        if (f6 < 0.0f) {
            f6 = 0.0f;
        }
        if (f5 > 1.0f) {
            f5 = 1.0f;
        }
        if (f6 > 1.0f) {
            f6 = 1.0f;
        }
        Class_16867.Method_16957();
        Field_28760.Method_36564(null, 0.0f, f5, f6, f4, 0.0f, 1.3181819f * 0.047413792f);
        Class_16867.Method_16942();
        Class_39477.Method_39484();
        Class_16867.Method_16934(5925 & 22409);
        Class_16867.Method_16910(2289 & -7424, 6368 & -16116, this.\u0000strictfp.Field_80, this.\u0000strictfp.Field_44);
        Class_16867.Method_16945();
        Class_16867.Method_16934(5896 & -2255);
        Class_16867.Method_16945();
        Class_39477.Method_39484();
        Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 1.0f);
        Class_9959.Method_9965().Method_9966(this.Field_28757.Field_15364);
        int n5 = this.Field_28757.Method_15378();
        for (int i = 10242 & 16785; i < (3707 & 135); ++i) {
            int n6 = n3 + (1212 & -22465);
            int n7 = n6 + (14940 & -15337);
            int n8 = 9334 & 598;
            String string = Class_9959.Method_9965().Method_9963();
            this.\u0000strictfp = 0.0f;
            this.\u0000strictfp.Method_253().Method_34707(Field_28753);
            int n9 = this.Field_28757.Field_15366[i];
            Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 1.0f);
            if (n9 == 0) {
                this.\u0000strictfp(n6, n4 + (-24562 & 16910) + (275 & 25683) * i, 128 & 16681, 4541 & -4871, -16020 & 8959, 16531 & -29861);
                continue;
            }
            String string2 = "" + n9;
            Class_28636 class_28636 = this.\u0000strictfp.Field_70;
            int n10 = 1080974922 & 66649946;
            if (!(n5 >= i + (-32219 & 6209) && this.\u0000strictfp.Field_48.\u0000= final >= n9 || this.\u0000strictfp.Field_48.\u0000strictfp.Method_18094())) {
                this.\u0000strictfp(n6, n4 + (111 & -32242) + (-20461 & 2643) * i, -3192 & 1121, -32071 & 9465, -31235 & 12398, 23 & 21523);
                this.\u0000strictfp(n6 + (5 & 18577), n4 + (-11873 & 8207) + (-8813 & 639) * i, (-31726 & 8432) * i, 1791 & 31215, -32176 & 4114, 671 & -16368);
                class_28636.Method_28688(string, n7, n4 + (-31080 & 84) + (-8173 & 1055) * i, n8, (n10 & (1224736766 & -1828782338)) >> (22145 & 121));
                n10 = -1564180720 & 1078165400;
            } else {
                int n11 = n - (n3 + (-32580 & 25917));
                int n12 = n2 - (n4 + (-31346 & 14350) + (6815 & 8275) * i);
                if (n11 >= 0 && n12 >= 0 && n11 < (748 & -30611) && n12 < (-26509 & 1439)) {
                    this.\u0000strictfp(n6, n4 + (142 & 31278) + (4123 & -6541) * i, 10512 & -14688, 9934 & 2285, 7020 & 124, 471 & 24603);
                    n10 = 83885969 & 553648064;
                } else {
                    this.\u0000strictfp(n6, n4 + (8207 & 19918) + (-31333 & 6163) * i, 17830 & 4161, 943 & 28902, 366 & 20733, 26259 & 27);
                }
                this.\u0000strictfp(n6 + (28675 & 1553), n4 + (17423 & -21745) + (11351 & 155) * i, (21845 & 8344) * i, 1247 & 8447, 9048 & 22544, -32174 & 16400);
                class_28636.Method_28688(string, n7, n4 + (20496 & 9243) + (-15849 & 12731) * i, n8, n10);
                n10 = 276889450 & -1065287776;
            }
            class_28636 = this.\u0000strictfp.Field_27;
            class_28636.Method_28729(string2, n7 + (7926 & 8543) - class_28636.Method_28715(string2), n4 + (17 & 10320) + (699 & 1367) * i + (4887 & 2247), n10);
        }
    }

    public Class_28746(Class_37781 class_37781, Class_283 class_283, Class_4977 class_4977) {
        super(new Class_15363(class_37781, class_283));
        this.Field_28761 = class_37781;
        this.Field_28757 = (Class_15363)this.\u0000strictfp;
        this.Field_28747 = class_4977;
    }

    public void Method_28768() {
        Class_23823 class_23823 = this.\u0000strictfp.Method_8324(4608 & 30).Method_26430();
        if (!Class_23823.Method_23880(class_23823, this.Field_28752)) {
            this.Field_28752 = class_23823;
            do {
                this.Field_28754 += (float)(this.Field_28750.nextInt(18438 & -32684) - this.Field_28750.nextInt(62 & 4));
            } while (!(this.Field_28759 > this.Field_28754 + 1.0f) && !(this.Field_28759 < this.Field_28754 - 1.0f));
        }
        this.Field_28749 += 15459 & 521;
        this.Field_28756 = this.Field_28759;
        this.Field_28748 = this.Field_28755;
        int n = 20521 & 400;
        for (int i = 8960 & 23609; i < (18563 & 4867); ++i) {
            if (this.Field_28757.Field_15366[i] == 0) continue;
            n = 1025 & 10785;
        }
        this.Field_28755 = n != 0 ? (this.Field_28755 += 0.42857143f * 0.46666667f) : (this.Field_28755 -= 0.95454544f * 0.20952381f);
        this.Field_28755 = Class_13337.Method_13360(this.Field_28755, 0.0f, 1.0f);
        float f = (this.Field_28754 - this.Field_28759) * (0.09122807f * 4.3846154f);
        float f2 = 1.1791044f * 0.16962026f;
        f = Class_13337.Method_13360(f, -f2, f2);
        this.Field_28758 += (f - this.Field_28758) * (1.7142857f * 0.525f);
        this.Field_28759 += this.Field_28758;
    }

    protected void Method_28769(int n, int n2, int n3) {
        super.Method_1952(n, n2, n3);
        int n4 = (this.\u0000= final - this.\u0000, for) / (34 & -24573);
        int n5 = (this.\u0000, ` - this.\u0000= int) / (-8122 & 4491);
        for (int i = 177 & 17990; i < (-32701 & 9659); ++i) {
            int n6 = n - (n4 + (-1988 & 60));
            int n7 = n2 - (n5 + (1198 & -26354) + (9139 & -30689) * i);
            if (n6 < 0 || n7 < 0 || n6 >= (24684 & -25876) || n7 >= (1559 & 25043) || !this.Field_28757.Method_15373(this.\u0000strictfp.Field_48, i)) continue;
            this.\u0000strictfp.Field_61.Method_11748(this.Field_28757.\u0000strictfp, i);
        }
    }

    protected void Method_28770(int n, int n2) {
        this.\u0000strictfp.Method_28692(this.Field_28747.Method_4978().Method_1788(), 16428 & 2060, 4165 & 26645, 139477196 & 1415725633);
        this.\u0000strictfp.Method_28692(this.Field_28761.Method_37811().Method_1788(), 8232 & 3082, this.\u0000= int - (17380 & 99) + (16775 & -30110), 1819571776 & 46285124);
    }
}

