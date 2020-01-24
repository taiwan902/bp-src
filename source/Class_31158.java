/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  internal.org.lwjgl.opengl.GL11
 */
import internal.org.lwjgl.opengl.GL11;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_31158
extends Class_27380 {
    private final Class_41302 Field_31159 = new Class_41302("item_frame", "map");
    private final Class_41302 Field_31160 = new Class_41302("item_frame", "normal");
    private final Class_18 Field_31161 = Class_18.Field_89;
    private static final Class_2080 Field_31162 = new Class_2080(Class_31158.Method_31167("\u6051\u6040\u6053\u6053\u6050\u6051\u6042\u6052\u6000\u6040\u6042\u6053\u6000\u6040\u6042\u6053\u6040\u6051\u6052\u6052\u6050\u6050\u6043\u6052\u6040\u6051\u6053\u6013\u6041\u6051\u6052"));
    private Class_44252 Field_31163;

    private void Method_31164() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private void Method_31165(Class_36512 class_36512) {
        Class_23823 class_23823 = class_36512.Method_36514();
        if (class_23823 != null) {
            Class_3443 class_3443 = new Class_3443(class_36512.\u0000strictfp, 0.0, 0.0, 0.0, class_23823);
            Class_1956 class_1956 = class_3443.Method_3478().Method_23844();
            class_3443.Method_3478().Field_23826 = -24447 & 5649;
            class_3443.Field_3448 = 0.0f;
            Class_16867.Method_16961();
            Class_16867.Method_16931();
            int n = class_36512.Method_36516();
            if (class_1956 == Class_10527.Field_10701) {
                n = n % (26629 & 68) * (11274 & -28574);
            }
            Class_16867.Method_16940((float)n * (2.9285715f * 122.92683f) / (8.533334f * 0.9375f), 0.0f, 0.0f, 1.0f);
            if (class_1956 == Class_10527.Field_10701) {
                this.\u0000strictfp.Field_8506.Method_34707(Field_31162);
                Class_16867.Method_16940(3.625f * 49.655174f, 0.0f, 0.0f, 1.0f);
                float f = 0.33333334f * 0.0234375f;
                Class_16867.Method_16973(f, f, f);
                Class_16867.Method_16943(0.15625f * -409.6f, -24.103897f * 2.6551723f, 0.0f);
                Class_33760 class_33760 = Class_10527.Field_10701.Method_40868(class_3443.Method_3478(), class_36512.\u0000strictfp);
                Class_16867.Method_16943(0.0f, 0.0f, -0.31578946f * 3.1666667f);
                if (class_33760 != null) {
                    this.Field_31161.Field_58.Method_22954().Method_10047(class_33760, (25297 & 2049) != 0);
                }
            } else {
                Class_11372 class_11372 = null;
                if (class_1956 == Class_10527.Field_10633) {
                    class_11372 = this.Field_31161.Method_189().Method_24109(Class_16023.Field_16025);
                    if (Class_19426.Method_19570()) {
                        Class_8049.Method_8080(this.Field_31161.Method_253(), Class_24069.Field_24084);
                    } else {
                        this.Field_31161.Method_253().Method_34707(Class_24069.Field_24084);
                    }
                    if (class_11372 instanceof Class_16023) {
                        Class_16023 class_16023 = (Class_16023)class_11372;
                        double d = class_16023.Field_16024;
                        double d2 = class_16023.Field_16026;
                        class_16023.Field_16024 = 0.0;
                        class_16023.Field_16026 = 0.0;
                        class_16023.Method_16029(class_36512.\u0000strictfp, class_36512.\u0000= package, class_36512.\u0000= switch, Class_13337.Method_13354((-31564 & 2742) + class_36512.\u0000, `.Method_4619() * (607 & 122)), (4402 & 3073) != 0, (6181 & -23487) != 0);
                        class_16023.Field_16024 = d;
                        class_16023.Field_16026 = d2;
                    } else {
                        class_11372 = null;
                    }
                }
                Class_16867.Method_16973(0.72727275f * 0.6875f, 2.0f * 0.25f, 0.93333334f * 0.53571427f);
                if (!this.Field_31163.Method_44285(class_3443.Method_3478()) || class_1956 instanceof Class_20646) {
                    Class_16867.Method_16940(7.3333335f * 24.545454f, 0.0f, 1.0f, 0.0f);
                }
                Class_16867.Method_16966();
                Class_39477.Method_39482();
                this.Field_31163.Method_44281(class_3443.Method_3478(), Class_7673.Field_7680);
                Class_39477.Method_39484();
                Class_16867.Method_16974();
                if (class_11372 != null && class_11372.Method_11414() > 0) {
                    class_11372.Method_11415();
                }
            }
            Class_16867.Method_16918();
            Class_16867.Method_16945();
        }
    }

    public void Method_31166(Class_1061 class_1061, double d, double d2, double d3, float f, float f2) {
        this.Method_31168((Class_36512)class_1061, d, d2, d3, f, f2);
    }

    private static String Method_31167(String string) {
        int n = 17095;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_31158.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_31158(Class_8491 class_8491, Class_44252 class_44252) {
        super(class_8491);
        this.Field_31163 = class_44252;
    }

    public void Method_31168(Class_36512 class_36512, double d, double d2, double d3, float f, float f2) {
        Class_16867.Method_16961();
        Class_4751 class_4751 = class_36512.\u0000, `();
        double d4 = (double)class_4751.\u0000= final() - class_36512.\u0000= package + d;
        double d5 = (double)class_4751.\u0000, `() - class_36512.\u0000, for() + d2;
        double d6 = (double)class_4751.\u0000strictfp() - class_36512.\u0000= switch + d3;
        Class_16867.Method_16928(d4 + 1.1538461538461537 * 0.43333333333333335, d5 + 0.48823529411764705 * 1.0240963855421688, d6 + 0.5161290322580645 * 0.96875);
        Class_16867.Method_16940(453.91302f * 0.39655173f - class_36512.\u0000= ?, 0.0f, 1.0f, 0.0f);
        this.\u0000strictfp.Field_8506.Method_34707(Class_24069.Field_24084);
        Class_36704 class_36704 = this.Field_31161.Method_214();
        Class_39372 class_39372 = class_36704.Method_36716().Method_36443();
        Class_31211 class_31211 = class_36512.Method_36514() != null && class_36512.Method_36514().Method_23844() == Class_10527.Field_10701 ? class_39372.Method_39380(this.Field_31159) : class_39372.Method_39380(this.Field_31160);
        Class_16867.Method_16961();
        Class_16867.Method_16943(-0.4642857f * 1.0769231f, 0.55f * -0.9090909f, 2.25f * -0.22222222f);
        class_36704.Method_36713().Method_36547(class_31211, 1.0f, 1.0f, 1.0f, 1.0f);
        Class_16867.Method_16945();
        Class_16867.Method_16943(0.0f, 0.0f, 0.9459459f * 0.4625f);
        this.Method_31165(class_36512);
        Class_16867.Method_16945();
        this.Method_31170(class_36512, d + (double)((float)class_36512.\u0000, `.Method_4654() * (0.6526316f * 0.45967743f)), d2 - 0.9390243902439024 * 0.26623376623376627, d3 + (double)((float)class_36512.\u0000, `.Method_4656() * (0.014285715f * 21.0f)));
    }

    protected Class_2080 Method_31169(Class_1061 class_1061) {
        return this.Method_31171((Class_36512)class_1061);
    }

    protected void Method_31170(Class_36512 class_36512, double d, double d2, double d3) {
        if (Class_18.Method_138() && class_36512.Method_36514() != null && class_36512.Method_36514().Method_23851() && this.\u0000strictfp.Field_8494 == class_36512) {
            float f;
            float f2 = 1.2862746f * 1.2439024f;
            float f3 = 1.6666666f * 0.010000001f * f2;
            double d4 = class_36512.\u0000strictfp(this.\u0000strictfp.Field_8510);
            float f4 = f = class_36512.\u0000%() ? 704.0f * 0.045454547f : 0.7625f * 83.934425f;
            if (d4 < (double)(f * f)) {
                String string = class_36512.Method_36514().Method_23899();
                if (class_36512.\u0000%()) {
                    Class_28636 class_28636 = this.\u0000strictfp();
                    Class_16867.Method_16961();
                    Class_16867.Method_16943((float)d + 0.0f, (float)d2 + class_36512.\u0000= switch() + 0.4326923f * 1.1555556f, (float)d3);
                    GL11.glNormal3f((float)0.0f, (float)1.0f, (float)0.0f);
                    Class_16867.Method_16940(-this.\u0000strictfp.Field_8492, 0.0f, 1.0f, 0.0f);
                    Class_16867.Method_16940(this.\u0000strictfp.Field_8499, 1.0f, 0.0f, 0.0f);
                    Class_16867.Method_16973(-f3, -f3, f3);
                    Class_16867.Method_16931();
                    Class_16867.Method_16943(0.0f, 0.4919355f * 0.5081967f / f3, 0.0f);
                    Class_16867.Method_16930((1577 & 16384) != 0);
                    Class_16867.Method_16947();
                    Class_16867.Method_16951(4883 & 810, 20235 & 803);
                    Class_7644 class_7644 = Class_7644.Method_7649();
                    Class_22385 class_22385 = class_7644.Method_7648();
                    int n = class_28636.Method_28715(string) / (16386 & 6482);
                    Class_16867.Method_16922();
                    class_22385.Method_22417(7 & -16793, Class_29585.Field_29601);
                    class_22385.Method_22443(-n - (-32735 & 1281), 0.4166666666666667 * -2.4, 0.0).Method_22427(0.0f, 0.0f, 0.0f, 0.1935484f * 1.2916666f).Method_22451();
                    class_22385.Method_22443(-n - (9649 & 16449), 1.0465116279069768 * 7.644444444444444, 0.0).Method_22427(0.0f, 0.0f, 0.0f, 2.7f * 0.09259259f).Method_22451();
                    class_22385.Method_22443(n + (345 & -31613), 2.6666666666666665 * 3.0, 0.0).Method_22427(0.0f, 0.0f, 0.0f, 5.0f * 0.05f).Method_22451();
                    class_22385.Method_22443(n + (8225 & 265), 2.857142857142857 * -0.35, 0.0).Method_22427(0.0f, 0.0f, 0.0f, 16.8f * 0.014880953f).Method_22451();
                    class_7644.Method_7647();
                    Class_16867.Method_16965();
                    Class_16867.Method_16930((1549 & -7999) != 0);
                    class_28636.Method_28692(string, -class_28636.Method_28715(string) / (16526 & -20222), 2616 & 70, 1660944383 & 822083583);
                    Class_16867.Method_16918();
                    Class_16867.Method_16952();
                    Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 1.0f);
                    Class_16867.Method_16945();
                } else {
                    this.\u0000strictfp((Class_1061)class_36512, string, d, d2, d3, -15550 & 6232);
                }
            }
        }
    }

    protected Class_2080 Method_31171(Class_36512 class_36512) {
        return null;
    }

    protected void Method_31172(Class_1061 class_1061, double d, double d2, double d3) {
        this.Method_31170((Class_36512)class_1061, d, d2, d3);
    }
}

