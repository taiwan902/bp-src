/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.mojang.authlib.GameProfile
 */
import com.google.common.base.Predicate;
import com.mojang.authlib.GameProfile;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Random;

public class Class_11917
extends Class_3529 {
    public static final Class_4173 Field_11918;
    private Class_22266 Field_11919;
    public static final Class_5011 Field_11920;
    private static final Predicate Field_11921;
    private Class_22266 Field_11922;

    public void Method_11923(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436) {
        if (!class_283.Field_306) {
            Class_4879 class_4879;
            if (!((Boolean)class_3436.Method_3440(Field_11918)).booleanValue() && (class_4879 = class_283.Method_429(class_4751)) instanceof Class_37700) {
                Class_37700 class_37700 = (Class_37700)class_4879;
                Class_23823 class_23823 = new Class_23823(Class_10527.Field_10702, -32639 & 6145, this.Method_11936(class_283, class_4751));
                if (class_37700.Method_37710() == (35 & 6915) && class_37700.Method_37708() != null) {
                    class_23823.Method_23869(new Class_1699());
                    Class_1699 class_1699 = new Class_1699();
                    Class_25852.Method_25855(class_1699, class_37700.Method_37708());
                    class_23823.Method_23845().Method_1744("SkullOwner", class_1699);
                }
                Class_11917.\u0000strictfp((Class_283)class_283, (Class_4751)class_4751, (Class_23823)class_23823);
            }
            super.Method_3531(class_283, class_4751, class_3436);
        }
    }

    public boolean Method_11924(Class_283 class_283, Class_4751 class_4751, Class_23823 class_23823) {
        return (class_23823.Method_23843() == (-2039 & 165) && class_4751.\u0000, `() >= (1474 & -32761) && class_283.Method_487() != Class_26801.Field_26803 && !class_283.Field_306 ? (this.Method_11929().Method_22273(class_283, class_4751) != null ? 993 & 23 : 930 & 12369) : 896 & -32756) != 0;
    }

    static {
        Field_11920 = Class_5011.Method_5013(Class_11917.Method_11942("\u0000\u0001\u0002\u000b\b\u0001"));
        Field_11918 = Class_4173.Method_4177(Class_11917.Method_11932("\u4834\u4834\u4834\u4820\u4834\u4820"));
        Field_11921 = new Class_28495();
    }

    protected Class_3855 Method_11925() {
        Class_3538[] arrclass_3538 = new Class_3538[258 & 1062];
        arrclass_3538[14860 & 96] = Field_11920;
        arrclass_3538[5379 & 26749] = Field_11918;
        return new Class_3855(this, arrclass_3538);
    }

    public Class_3436 Method_11926(int n) {
        return this.\u0000strictfp().Method_3685(Field_11920, (Comparable)((Object)Class_4595.Method_4637(n & (17943 & 8455)))).Method_3437(Field_11918, Boolean.valueOf(((n & (-9206 & 8)) > 0 ? -31687 & 18627 : 8206 & 16625) != 0));
    }

    public boolean Method_11927() {
        return (19458 & -28632) != 0;
    }

    public void Method_11928(Class_561 class_561, Class_4751 class_4751) {
        switch (Class_35567.Field_35568[((Class_4595)((Object)class_561.Method_568(class_4751).Method_3440(Field_11920))).ordinal()]) {
            default: {
                this.\u0000strictfp(0.015822785f * 15.8f, 0.0f, 0.3529412f * 0.7083333f, 6.125f * 0.12244898f, 2.5555556f * 0.19565217f, 49.0f * 0.015306123f);
                break;
            }
            case 2: {
                this.\u0000strictfp(0.21031746f * 1.1886792f, 1.3870968f * 0.18023255f, 3.3043478f * 0.1513158f, 0.36363637f * 2.0625f, 2.79f * 0.26881722f, 1.0f);
                break;
            }
            case 3: {
                this.\u0000strictfp(13.666667f * 0.018292682f, 3.68f * 0.06793478f, 0.0f, 1.4705882f * 0.51f, 1.4285715f * 0.525f, 2.347826f * 0.21296297f);
                break;
            }
            case 4: {
                this.\u0000strictfp(0.25f * 2.0f, 0.033333335f * 7.5f, 2.7777777f * 0.09f, 1.0f, 0.7708333f * 0.972973f, 0.0952381f * 7.875f);
                break;
            }
            case 5: {
                this.\u0000strictfp(0.0f, 0.05120482f * 4.882353f, 0.109375f * 2.2857144f, 0.5f * 1.0f, 0.7258065f * 1.0333333f, 0.11111111f * 6.75f);
            }
        }
    }

    protected Class_22266 Method_11929() {
        if (this.Field_11919 == null) {
            String[] arrstring = new String[-32373 & 26739];
            arrstring[-23024 & 68] = "   ";
            arrstring[20611 & 10257] = "###";
            arrstring[-32765 & 5638] = "~#~";
            this.Field_11919 = Class_19639.Method_19650().Method_19651(arrstring).Method_19646((char)(-29313 & 35), Class_7692.Method_7701(Class_7506.Method_7511(Class_9265.Field_9363))).Method_19646((char)(5246 & 382), Class_7692.Method_7701(Class_7506.Method_7511(Class_9265.Field_9351))).Method_19648();
        }
        return this.Field_11919;
    }

    private void Method_11930() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_11931(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Class_626 class_626) {
        if (class_626.Field_694.Method_18094()) {
            class_3436 = class_3436.Method_3437(Field_11918, Boolean.valueOf((315 & 1) != 0));
            class_283.Method_462(class_4751, class_3436, 8334 & 17428);
        }
        super.\u0000strictfp(class_283, class_4751, class_3436, class_626);
    }

    protected Class_11917() {
        super(Class_3713.Field_3751);
        this.\u0000strictfp(this.\u0000strictfp.Method_3867().Method_3437(Field_11920, (Comparable)((Object)Class_4595.Field_4598)).Method_3437(Field_11918, Boolean.valueOf((-11176 & 2434) != 0)));
        this.\u0000strictfp(0.22950819f * 1.0892857f, 0.0f, 0.8831169f * 0.28308824f, 1.7826087f * 0.4207317f, 1.1224489f * 0.44545457f, 0.046875f * 16.0f);
    }

    private static String Method_11932(String string) {
        int n = 10332;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_11917.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_4879 Method_11933(Class_283 class_283, int n) {
        return new Class_37700();
    }

    public boolean Method_11934() {
        return (16385 & 800) != 0;
    }

    public void Method_11935(Class_283 class_283, Class_4751 class_4751, Class_37700 class_37700) {
        Class_9702 class_9702;
        Class_22266 class_22266;
        if (class_37700.Method_37710() == (25859 & -30703) && class_4751.\u0000, `() >= (1170 & -32498) && class_283.Method_487() != Class_26801.Field_26803 && !class_283.Field_306 && (class_9702 = (class_22266 = this.Method_11941()).Method_22273(class_283, class_4751)) != null) {
            Object object;
            int n;
            Object object2;
            int n2;
            for (n = 1993 & -20448; n < (16427 & 643); ++n) {
                object = class_9702.Method_9716(n, 516 & 24608, 8320 & -28605);
                class_283.Method_462(((Class_7692)object).Method_7702(), ((Class_7692)object).Method_7699().Method_3437(Field_11918, Boolean.valueOf((-15353 & 2945) != 0)), 774 & 10419);
            }
            for (n = 1568 & 12363; n < class_22266.Method_22274(); ++n) {
                for (int i = -32256 & 12440; i < class_22266.Method_22271(); ++i) {
                    object2 = class_9702.Method_9716(n, i, 16388 & -24448);
                    class_283.Method_462(((Class_7692)object2).Method_7702(), Class_9265.Field_9351.Method_3293(), 4230 & 9219);
                }
            }
            Class_4751 class_47512 = class_9702.Method_9716(20901 & 3585, 9472 & -26611, 27648 & -32212).Method_7702();
            object = new Class_42901(class_283);
            object2 = class_9702.Method_9716(4357 & -31599, -26302 & 550, 16546 & 4621).Method_7702();
            object.\u0000, `((double)object2.\u0000= final() + 0.7419354838709677 * 0.6739130434782609, (double)object2.\u0000, `() + 0.05176470588235295 * 10.625, (double)object2.\u0000strictfp() + 0.05714285714285714 * 8.75, class_9702.Method_9712().Method_4640() == Class_4565.Field_4566 ? 0.0f : 0.98734176f * 91.15385f, 0.0f);
            ((Class_42901)object).\u0000super = class_9702.Method_9712().Method_4640() == Class_4565.Field_4566 ? 0.0f : 14.693877f * 6.125f;
            ((Class_42901)object).Method_42923();
            for (Class_626 class_626 : class_283.Method_488(Class_626.class, object.\u0000, `().Method_11017(1.3555555555555556 * 36.885245901639344, 113.33333333333334 * 0.4411764705882353, 58.46153846153846 * 0.8552631578947368))) {
                class_626.Method_750(Class_21905.Field_21937);
            }
            class_283.Method_350((Class_1061)object);
            for (n2 = -31423 & 20608; n2 < (120 & -32648); ++n2) {
                class_283.Method_407(Class_40274.Field_40298, (double)class_47512.\u0000= final() + class_283.Field_307.nextDouble(), (double)(class_47512.\u0000, `() - (6146 & -16249)) + class_283.Field_307.nextDouble() * (3.142857142857143 * 1.240909090909091), (double)class_47512.\u0000strictfp() + class_283.Field_307.nextDouble(), 0.0, 0.0, 0.0, new int[16392 & -23481]);
            }
            for (n2 = 920 & 18528; n2 < class_22266.Method_22274(); ++n2) {
                for (int i = -6143 & 5160; i < class_22266.Method_22271(); ++i) {
                    Class_7692 class_7692 = class_9702.Method_9716(n2, i, 1024 & -8159);
                    class_283.Method_457(class_7692.Method_7702(), Class_9265.Field_9351);
                }
            }
        }
    }

    public int Method_11936(Class_283 class_283, Class_4751 class_4751) {
        Class_4879 class_4879 = class_283.Method_429(class_4751);
        return class_4879 instanceof Class_37700 ? ((Class_37700)class_4879).Method_37710() : super.\u0000strictfp(class_283, class_4751);
    }

    public Class_1956 Method_11937(Class_283 class_283, Class_4751 class_4751) {
        return Class_10527.Field_10702;
    }

    public int Method_11938(Class_3436 class_3436) {
        int n = 24848 & -32254;
        n |= ((Class_4595)((Object)class_3436.Method_3440(Field_11920))).Method_4648();
        if (((Boolean)class_3436.Method_3440(Field_11918)).booleanValue()) {
            n |= 2152 & 1032;
        }
        return n;
    }

    public String Method_11939() {
        return Class_7594.Method_7602("tile.skull.skeleton.name");
    }

    public Class_3436 Method_11940(Class_283 class_283, Class_4751 class_4751, Class_4595 class_4595, float f, float f2, float f3, int n, Class_859 class_859) {
        return this.\u0000strictfp().Method_3685(Field_11920, (Comparable)((Object)class_859.\u0000, `())).Method_3437(Field_11918, Boolean.valueOf((5316 & -32760) != 0));
    }

    protected Class_22266 Method_11941() {
        if (this.Field_11922 == null) {
            String[] arrstring = new String[6259 & 519];
            arrstring[16576 & 12296] = "^^^";
            arrstring[33 & 4107] = "###";
            arrstring[-32630 & 10759] = "~#~";
            this.Field_11922 = Class_19639.Method_19650().Method_19651(arrstring).Method_19646((char)(35 & 22691), Class_7692.Method_7701(Class_7506.Method_7511(Class_9265.Field_9363))).Method_19646((char)(1630 & 2398), Field_11921).Method_19646((char)(8318 & 126), Class_7692.Method_7701(Class_7506.Method_7511(Class_9265.Field_9351))).Method_19648();
        }
        return this.Field_11922;
    }

    private static String Method_11942(String string) {
        int n = 13274;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_11917.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_1956 Method_11943(Class_3436 class_3436, Random random, int n) {
        return Class_10527.Field_10702;
    }

    public void Method_11944(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, float f, int n) {
    }

    public Class_10997 Method_11945(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436) {
        this.Method_11928(class_283, class_4751);
        return super.\u0000strictfp(class_283, class_4751, class_3436);
    }
}

