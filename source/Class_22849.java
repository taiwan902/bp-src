/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.base.Predicates
 *  com.google.gson.JsonSyntaxException
 *  internal.org.lwjgl.input.Mouse
 *  internal.org.lwjgl.opengl.ContextCapabilities
 *  internal.org.lwjgl.opengl.Display
 *  internal.org.lwjgl.opengl.GL11
 *  internal.org.lwjgl.opengl.GLContext
 *  internal.org.lwjgl.util.glu.GLU
 *  internal.org.lwjgl.util.glu.Project
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.gson.JsonSyntaxException;
import internal.org.lwjgl.input.Mouse;
import internal.org.lwjgl.opengl.ContextCapabilities;
import internal.org.lwjgl.opengl.Display;
import internal.org.lwjgl.opengl.GL11;
import internal.org.lwjgl.opengl.GLContext;
import internal.org.lwjgl.util.glu.GLU;
import internal.org.lwjgl.util.glu.Project;
import java.io.IOException;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.Callable;
import net.minecraft.util.Vec3;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class_22849
implements Class_2045 {
    private Class_18 Field_22850;
    private float Field_22851;
    private Class_283 Field_22852 = null;
    public float Field_22853;
    public boolean Field_22854;
    private int Field_22855 = -22175 & 16384;
    private float Field_22856;
    private static Class_2190 Field_22857;
    private final int[] Field_22858;
    private Class_11701 Field_22859 = new Class_11701();
    private float Field_22860;
    private float Field_22861;
    private boolean Field_22862 = 640 & 9234;
    private Random Field_22863 = new Random();
    public float Field_22864;
    private boolean Field_22865;
    public float Field_22866;
    public Class_6918 Field_22867;
    private boolean Field_22868 = 4128 & 25096;
    private float Field_22869;
    private long Field_22870;
    public boolean Field_22871 = 26624 & 524;
    private int Field_22872 = -16204 & 2;
    public static boolean Field_22873;
    private float Field_22874;
    private double Field_22875;
    private int Field_22876 = 28742 & -30544;
    private float Field_22877 = 0.0f;
    private long Field_22878 = 1152993568L & 33562630L;
    private float Field_22879;
    private float Field_22880;
    private final Class_2080 Field_22881;
    private float Field_22882;
    private boolean Field_22883 = -13632 & 5122;
    public static final int Field_22884;
    private static final Logger Field_22885;
    private int Field_22886 = Field_22884;
    private float[] Field_22887 = new float[-23150 & 5185];
    private boolean Field_22888 = 24899 & -26611;
    private boolean Field_22889;
    public static int Field_22890;
    private static final Class_2080 Field_22891;
    private int Field_22892 = 3265 & -32254;
    private float Field_22893;
    private float Field_22894;
    private long Field_22895 = Class_18.Method_207();
    private float Field_22896;
    private float Field_22897 = 4.8f * 0.8333333f;
    private FloatBuffer Field_22898 = Class_11552.Method_11553(88 & 17168);
    private long Field_22899 = -6958322248985607935L & 675973232L;
    public float Field_22900;
    private boolean Field_22901 = 8965 & -27606;
    private double Field_22902;
    private float Field_22903 = 52.148148f * 2.4545455f;
    private float Field_22904;
    private final Class_10040 Field_22905;
    private final Class_279 Field_22906;
    private float[] Field_22907 = new float[17536 & 11288];
    private Class_1061 Field_22908;
    private float Field_22909;
    private final Class_47630 Field_22910;
    private int Field_22911;
    private Class_26345 Field_22912;
    private static final Class_2080 Field_22913;
    public float Field_22914;
    private int Field_22915;
    private float Field_22916;
    private Class_11701 Field_22917 = new Class_11701();
    private Class_26345[] Field_22918 = new Class_26345[-24354 & 6186];
    private float Field_22919 = 1.106383f * 3.6153846f;
    private static final Class_2080[] Field_22920;
    private float Field_22921;
    private double Field_22922 = 1.0;
    public int Field_22923 = 2281 & -24316;
    private boolean Field_22924 = 4673 & -23167;
    private float Field_22925 = 0.0f;

    private static String Method_22926(String string) {
        int n = 5227;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_22849.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_22927() {
        if (!this.Field_22868) {
            Class_21583.Method_21607();
            Class_35633.Method_35639();
            if (Class_19426.Method_19540() == (105 & 10322) && Class_19426.Method_19520() == (-9998 & 9504)) {
                Class_19426.Method_19490((8721 & 5221) != 0);
            }
            this.Field_22868 = -24441 & 5121;
        }
        Class_19426.Method_19572();
        Class_19426.Method_19524();
        Class_570 class_570 = this.Field_22850.Field_72;
        if (class_570 != null && Class_19426.Method_19479()) {
            Class_19426.Method_19490((-32767 & 3106) != 0);
            Class_2840 class_2840 = new Class_2840("You can install \u00a7e64-bit Java\u00a7f to increase performance");
            this.Field_22850.Field_105.Method_45458().Method_41188(class_2840);
        }
        if (this.Field_22850.Field_36 instanceof Class_1578) {
            this.Method_22991((Class_1578)this.Field_22850.Field_36);
        }
        if (this.Field_22852 != class_570) {
            Class_24158.Method_24187(this.Field_22852, class_570);
            Class_19426.Method_19601();
            this.Field_22899 = 539099200L & 138479024L;
            this.Field_22876 = 17412 & -26192;
            this.Field_22852 = class_570;
        }
        if (!this.Method_22982(Class_12440.Field_12617)) {
            Class_12440.Field_12617 = 4384 & -31616;
        }
    }

    public Class_26345 Method_22928() {
        return this.Field_22912;
    }

    private static String Method_22929(String string) {
        int n = 25073;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_22849.class, 21);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_22930(String string) {
        int n = 18430;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_22849.class, 16);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_22931(int n, float f) {
        Class_1061 class_1061 = this.Field_22850.Method_246();
        int n2 = 928 & 18440;
        this.Field_22871 = 0 & 29972;
        if (class_1061 instanceof Class_626) {
            n2 = ((Class_626)class_1061).Field_694.Method_18094() ? 1 : 0;
        }
        GL11.glFog((int)(-17561 & 19454), (FloatBuffer)this.Method_22953(this.Field_22866, this.Field_22853, this.Field_22914, 1.0f));
        GL11.glNormal3f((float)0.0f, (float)(0.53571427f * -1.8666667f), (float)0.0f);
        Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 1.0f);
        Class_3238 class_3238 = Class_41473.Method_41484(this.Field_22850.Field_72, class_1061, f);
        if (class_1061 instanceof Class_859 && ((Class_859)class_1061).Method_1039(Class_8338.Field_8346)) {
            float f2 = 0.3f * 16.666666f;
            int n3 = ((Class_859)class_1061).Method_1034(Class_8338.Field_8346).Method_25251();
            if (n3 < (18038 & 6164)) {
                f2 = 2.8947368f * 1.7272727f + (this.Field_22880 - 16.666666f * 0.3f) * (1.0f - (float)n3 / (13.506493f * 1.4807693f));
            }
            if (Class_19426.Method_19570()) {
                Class_12440.Method_12892(-18815 & 10017);
            } else {
                Class_16867.Method_16956(9889 & 13893);
            }
            if (n == (-1 & -1)) {
                Class_16867.Method_16949(0.0f);
                Class_16867.Method_16914(f2 * (1.0896552f * 0.73417723f));
            } else {
                Class_16867.Method_16949(f2 * (0.6666667f * 0.375f));
                Class_16867.Method_16914(f2);
            }
            if (GLContext.getCapabilities().GL_NV_fog_distance && Class_19426.Method_19521()) {
                GL11.glFogi((int)(51939327 & -2147056294), (int)(169641339 & -1333676709));
            }
        } else if (this.Field_22865) {
            if (Class_19426.Method_19570()) {
                Class_12440.Method_12892(3008 & -2048);
            } else {
                Class_16867.Method_16956(-30718 & 10752);
            }
            Class_16867.Method_16916(0.042105265f * 2.375f);
        } else if (class_3238.Method_3373() == Class_3713.Field_3734) {
            if (Class_19426.Method_19570()) {
                Class_12440.Method_12892(-22008 & 2198);
            } else {
                Class_16867.Method_16956(2560 & -12926);
            }
            if (class_1061 instanceof Class_859 && ((Class_859)class_1061).Method_1039(Class_8338.Field_8376)) {
                Class_16867.Method_16916(0.004107143f * 2.4347825f);
            } else {
                Class_16867.Method_16916(0.47368422f * 0.21111111f - (float)Class_29642.Method_29648(class_1061) * (0.85294116f * 0.035172414f));
            }
            if (Class_19426.Method_19607()) {
                GL11.glFogf((int)(3051 & 19302), (float)(1.0454545f * 0.019130435f));
            }
        } else if (class_3238.Method_3373() == Class_3713.Field_3750) {
            if (Class_19426.Method_19570()) {
                Class_12440.Method_12892(10244 & -30718);
            } else {
                Class_16867.Method_16956(-29152 & 2248);
            }
            Class_16867.Method_16916(2.0f);
        } else {
            float f3 = this.Field_22880;
            this.Field_22871 = 22073 & -32377;
            if (Class_19426.Method_19570()) {
                Class_12440.Method_12892(9833 & -4603);
            } else {
                Class_16867.Method_16956(9769 & -20987);
            }
            if (n == (-1 & -1)) {
                Class_16867.Method_16949(0.0f);
                Class_16867.Method_16914(f3);
            } else {
                Class_16867.Method_16949(f3 * Class_19426.Method_19613());
                Class_16867.Method_16914(f3);
            }
            if (GLContext.getCapabilities().GL_NV_fog_distance) {
                if (Class_19426.Method_19521()) {
                    GL11.glFogi((int)(-668952614 & 609256799), (int)(135439711 & 295816539));
                }
                if (Class_19426.Method_19537()) {
                    GL11.glFogi((int)(1347792218 & 186202), (int)(-2146769572 & 285315039));
                }
            }
            if (this.Field_22850.Field_72.\u0000strictfp.Method_18361((int)class_1061.Field_1130, (int)class_1061.Field_1106)) {
                Class_16867.Method_16949(f3 * (0.042142857f * 1.1864407f));
                Class_16867.Method_16914(f3);
            }
        }
        Class_16867.Method_16950();
        Class_16867.Method_16978();
        Class_16867.Method_16953(9692 & 7174, 21152 & 12826);
    }

    private void Method_22932(Class_24997 class_24997, float f, int n) {
        if (this.Field_22850.Field_84.Field_39801 >= (17572 & 2885) && !Class_19426.Method_19582() && Class_12440.Method_12780(this.Field_22850.Field_84)) {
            this.Field_22850.Field_25.Method_2783("clouds");
            Class_16867.Method_16934(14085 & -26679);
            Class_16867.Method_16962();
            Project.gluPerspective((float)this.Method_22959(f, (1673 & -8159) != 0), (float)((float)this.Field_22850.Field_80 / (float)this.Field_22850.Field_44), (float)(0.1076087f * 0.46464646f), (float)(this.Field_22903 * (0.95555556f * 4.1860466f)));
            Class_16867.Method_16934(22272 & 5896);
            Class_16867.Method_16961();
            this.Method_22931(3136 & 4867, f);
            class_24997.Method_25131(f, n);
            Class_16867.Method_16954();
            Class_16867.Method_16945();
            Class_16867.Method_16934(8025 & 5889);
            Class_16867.Method_16962();
            Project.gluPerspective((float)this.Method_22959(f, (6441 & 8199) != 0), (float)((float)this.Field_22850.Field_80 / (float)this.Field_22850.Field_44), (float)(0.9777778f * 0.051136363f), (float)this.Field_22903);
            Class_16867.Method_16934(16277 & 5960);
        }
    }

    private void Method_22933(float f, int n) {
        this.Method_22987(f, n, (16587 & 2101) != 0, (-27647 & 2081) != 0, (1284 & 8296) != 0);
    }

    public void Method_22934(int n, int n2) {
        if (Class_32876.Field_32906) {
            if (this.Field_22912 != null) {
                this.Field_22912.Method_26368(n, n2);
            }
            this.Field_22850.Field_33.Method_25095(n, n2);
        }
    }

    private void Method_22935() {
        long l;
        if (this.Field_22850.Field_72 != null && (l = System.currentTimeMillis()) > this.Field_22878 + (4921885672261922708L & -4921885673983166703L)) {
            this.Field_22878 = l;
            int n = GL11.glGetError();
            if (n != 0) {
                String string = GLU.gluErrorString((int)n);
                Class_2840 class_2840 = new Class_2840("\u00a7eOpenGL Error\u00a7f: " + n + " (" + string + ")");
                this.Field_22850.Field_105.Method_45458().Method_41188(class_2840);
            }
        }
    }

    public void Method_22936(Class_1061 class_1061) {
        if (Class_32876.Field_32906) {
            if (this.Field_22912 != null) {
                this.Field_22912.Method_26366();
            }
            this.Field_22912 = null;
            if (class_1061 instanceof Class_43073) {
                this.Method_22984(new Class_2080("shaders/post/creeper.json"));
            } else if (class_1061 instanceof Class_44290) {
                this.Method_22984(new Class_2080("shaders/post/spider.json"));
            } else if (class_1061 instanceof Class_46025) {
                this.Method_22984(new Class_2080("shaders/post/invert.json"));
            }
        }
    }

    private static String Method_22937(String string) {
        int n = 17314;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_22849.class, 5);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_22938(float f) {
        Class_1061 class_1061 = this.Field_22850.Method_246();
        if (class_1061 != null && this.Field_22850.Field_72 != null) {
            this.Field_22850.Field_25.Method_2789("pick");
            this.Field_22850.Field_50 = null;
            double d = this.Field_22850.Field_61.Method_11751().Method_3850();
            this.Field_22850.Field_57 = class_1061.Method_1246(d, f);
            Vec3 vec3 = class_1061.Method_1219(f);
            int n = -32704 & 3204;
            int n2 = 2067 & -28091;
            double d2 = d;
            if (this.Field_22850.Field_61.Method_11762()) {
                d = 50.57142857142857 * 0.11864406779661017;
                d2 = 1.0909090909090908 * 5.5;
            } else if (d > Field_22857.Method_2199()) {
                n = -29693 & 12681;
            }
            if (this.Field_22850.Field_57 != null) {
                d2 = this.Field_22850.Field_57.Field_37115.\u0000, `(vec3);
            }
            Vec3 vec32 = class_1061.Method_1296(f);
            Vec3 vec33 = vec3.\u0000strictfp(vec32.\u0000= final * d, vec32.\u0000strictfp * d, vec32.\u0000, ` * d);
            this.Field_22908 = null;
            Vec3 vec34 = null;
            float f2 = 1.0f;
            ArrayList arrayList = this.Field_22850.Field_72.\u0000strictfp(class_1061, class_1061.Method_1315().Method_11005(vec32.\u0000= final * d, vec32.\u0000strictfp * d, vec32.\u0000, ` * d).Method_11017(f2, f2, f2), Predicates.and((Predicate)Class_28857.Field_28860, (Predicate)new Class_33119(this)));
            double d3 = d2;
            for (int i = 9312 & 536; i < arrayList.size(); ++i) {
                double d4;
                Class_1061 class_10612 = (Class_1061)arrayList.get(i);
                float f3 = class_10612.Method_1265();
                Class_10997 class_10997 = class_10612.Method_1315().Method_11017(f3, f3, f3);
                Class_37110 class_37110 = class_10997.Method_11007(vec3, vec33);
                if (class_10997.Method_11014(vec3)) {
                    if (!(d3 >= 0.0)) continue;
                    this.Field_22908 = class_10612;
                    vec34 = class_37110 == null ? vec3 : class_37110.Field_37115;
                    d3 = 0.0;
                    continue;
                }
                if (class_37110 == null || !((d4 = vec3.\u0000, `(class_37110.Field_37115)) < d3) && d3 != 0.0) continue;
                int n3 = 2592 & 8388;
                if (Class_14610.Field_14626.Method_13570()) {
                    n3 = Class_14610.Method_14674(class_10612, Class_14610.Field_14626, new Object[16898 & -28652]) ? 1 : 0;
                }
                if (class_10612 == class_1061.Field_1095 && n3 == 0) {
                    if (d3 != 0.0) continue;
                    this.Field_22908 = class_10612;
                    vec34 = class_37110.Field_37115;
                    continue;
                }
                this.Field_22908 = class_10612;
                vec34 = class_37110.Field_37115;
                d3 = d4;
            }
            if (this.Field_22908 != null && n != 0 && !(vec3.\u0000, `(vec34) < Field_22857.Method_2199() + 0.125 * 0.25)) {
                this.Field_22908 = null;
                this.Field_22850.Field_57 = new Class_37110(Class_7192.Field_7194, vec34, null, new Class_4751(vec34));
            }
            if (this.Field_22908 != null && (d3 < d2 || this.Field_22850.Field_57 == null)) {
                this.Field_22850.Field_57 = new Class_37110(this.Field_22908, vec34);
                if (this.Field_22908 instanceof Class_859 || this.Field_22908 instanceof Class_36512) {
                    this.Field_22850.Field_50 = this.Field_22908;
                }
            }
            this.Field_22850.Field_25.Method_2790();
        }
    }

    public void Method_22939() {
        if (this.Field_22912 != null) {
            this.Field_22912.Method_26366();
        }
        this.Field_22912 = null;
        this.Field_22886 = Field_22884;
    }

    private void Method_22940(float f) {
        if (this.Field_22850.Method_246() instanceof Class_626) {
            Class_626 class_626 = (Class_626)this.Field_22850.Method_246();
            float f2 = class_626.\u0000abstract - class_626.\u0000= `;
            float f3 = -(class_626.\u0000abstract + f2 * f);
            float f4 = class_626.Field_634 + (class_626.Field_657 - class_626.Field_634) * f;
            float f5 = class_626.\u0000, if + (class_626.\u0000= | - class_626.\u0000, if) * f;
            Class_16867.Method_16943(Class_13337.Method_13370(f3 * (3.0689654f * 1.0236651f)) * f4 * (0.83870965f * 0.59615386f), -Math.abs(Class_13337.Method_13350(f3 * (152.36725f * 0.020618556f)) * f4), 0.0f);
            Class_16867.Method_16940(Class_13337.Method_13370(f3 * (0.167106f * 18.8f)) * f4 * (6.9f * 0.4347826f), 0.0f, 0.0f, 1.0f);
            Class_16867.Method_16940(Math.abs(Class_13337.Method_13350(f3 * (2.792527f * 1.125f) - 0.13239436f * 1.5106384f) * f4) * (1.0f * 5.0f), 1.0f, 0.0f, 0.0f);
            Class_16867.Method_16940(f5, 1.0f, 0.0f, 0.0f);
        }
    }

    private void Method_22941() {
        this.Field_22904 = (float)((double)this.Field_22904 + (Math.random() - Math.random()) * Math.random() * Math.random());
        this.Field_22904 = (float)((double)this.Field_22904 * (1.125 * 0.8));
        this.Field_22874 += (this.Field_22904 - this.Field_22874) * 1.0f;
        this.Field_22889 = 17539 & 4365;
    }

    private void Method_22942() {
        float f = 1.0f;
        if (this.Field_22850.Method_246() instanceof Class_1456) {
            Class_1456 class_1456 = (Class_1456)this.Field_22850.Method_246();
            f = class_1456.Method_1464();
        }
        this.Field_22856 = this.Field_22851;
        this.Field_22851 += (f - this.Field_22851) * (1.2028985f * 0.41566268f);
        if (this.Field_22851 > 3.6818182f * 0.4074074f) {
            this.Field_22851 = 2.6454546f * 0.5670103f;
        }
        if (this.Field_22851 < 0.25357142f * 0.3943662f) {
            this.Field_22851 = 2.3913043f * 0.041818183f;
        }
    }

    private static String Method_22943(String string) {
        int n = 21330;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_22849.class, 18);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_22944(String string) {
        int n = 22089;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_22849.class, 22);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_22945(String string) {
        int n = 4693;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_22849.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    static Class_18 Method_22946(Class_22849 class_22849) {
        return class_22849.Field_22850;
    }

    static {
        Field_22885 = LogManager.getLogger();
        Field_22891 = new Class_2080(Class_22849.Method_22945("\u3a9b\u3a8a\u3a91\u3a99\u3a9e\u3a9d\u3a8c\u3a9e\u3ac8\u3a82\u3a8b\u3a93\u3a8e\u3a95\u3a8e\u3a8f\u3a82\u3a8a\u3a83\u3a99\u3ac4\u3a9d\u3a8c\u3a84\u3a89\u3ac9\u3a91\u3a8b\u3a84"));
        Field_22913 = new Class_2080(Class_22849.Method_22950("\u1800\u1800\u1804\u1801\u1801\u1805\u1801\u1804\u1801\u1800\u1800\u1801\u1805\u1805\u1801\u1801\u1811\u1810\u1810\u1811\u1811\u1814\u1810\u1810\u1811\u1811\u1814\u1811\u1811"));
        Class_2080[] arrclass_2080 = new Class_2080[-31717 & 4696];
        arrclass_2080[6146 & -15184] = new Class_2080(Class_22849.Method_22960("\u0485\u0486\u0487\u0482\u0483\u0484\u0485\u0481\u048e\u0489\u048d\u048a\u0489\u0488\u0489\u048a\u0485\u0486\u0480\u0484\u0485\u0481\u0480"));
        arrclass_2080[4135 & -24367] = new Class_2080(Class_22849.Method_22926("\u2089\u2080\u2089\u208c\u2089\u208c\u208d\u20c1\u2080\u208d\u2081\u2084\u20c9\u2080\u208c\u2085\u2089\u20c4\u2080\u2089\u2081\u2080"));
        arrclass_2080[-30398 & 4610] = new Class_2080(Class_22849.Method_22937("\u0428\u0421\u0428\u0429\u042c\u042d\u042c\u0424\u0429\u0420\u0428\u0429\u0424\u042c\u042d\u042d\u0421\u0421\u0428\u0420\u0425"));
        arrclass_2080[-30077 & 4107] = new Class_2080(Class_22849.Method_22978("\u1070\u1060\u1060\u1060\u1060\u1070\u1070\u1020\u1070\u1060\u1070\u1070\u1020\u1060\u1070\u1060\u1060\u1060\u1030\u1070\u1060\u1070\u1070"));
        arrclass_2080[18100 & -32700] = new Class_2080(Class_22849.Method_22955("\u8200\u8200\u8200\u8204\u8204\u8200\u8200\u8205\u8209\u820d\u8208\u820c\u820c\u8208\u820d\u820d\u8211\u8211\u8211\u8214\u8211\u8211\u8214\u8214"));
        arrclass_2080[-32763 & 12381] = new Class_2080(Class_22849.Method_22989("\ub58c\ub585\ub58e\ub58b\ub58c\ub589\ub58a\ub5c7\ub58c\ub581\ub58e\ub58b\ub5c4\ub589\ub58e\ub587\ub59c\ub595\ub592\ub5d3\ub590\ub599\ub596\ub597"));
        arrclass_2080[-32490 & 8206] = new Class_2080(Class_22849.Method_22971("\u4007\u4005\u4007\u4003\u4005\u4003\u4001\u4004\u4004\u4002\u4005\u4003\u4007\u4002\u4005\u4007\u4013\u4017\u4011\u4014\u4017\u4017\u4014\u4014\u4010\u4013\u4013\u4011\u4012\u4012\u4015\u4015"));
        arrclass_2080[103 & -13305] = new Class_2080(Class_22849.Method_22962("\u6e21\u6e31\u6e31\u6e31\u6e35\u6e25\u6e25\u6e74\u6e28\u6e38\u6e29\u6e29\u6e7d\u6e3d\u6e3d\u6e3c\u6e31\u6e31\u6e20\u6e30\u6e24\u6e34\u6e35\u6e75\u6e38\u6e28\u6e39\u6e39"));
        arrclass_2080[9004 & -12200] = new Class_2080(Class_22849.Method_22969("\ub90e\ub905\ub90c\ub909\ub908\ub90f\ub90e\ub942\ub905\ub90a\ub906\ub901\ub94a\ub903\ub909\ub90c\ub91d\ub953\ub917\ub91e\ub912\ub913"));
        arrclass_2080[12553 & -30487] = new Class_2080(Class_22849.Method_22947("\u4900\u4908\u4902\u4902\u4904\u4904\u4906\u490e\u4908\u4900\u490a\u490a\u4904\u4904\u4906\u490e\u4910\u4910\u4912\u491a\u491c\u4914\u491e\u491e"));
        arrclass_2080[10506 & 618] = new Class_2080(Class_22849.Method_22975("\u8800\u8813\u8810\u8811\u8812\u8801\u8802\u8812\u880b\u8818\u880a\u8809\u8818\u8819\u8809\u880a\u8810\u8811\u8813\u8802\u8810\u8811"));
        arrclass_2080[523 & 4111] = new Class_2080(Class_22849.Method_22966("\u4008\u4010\u4018\u4018\u4018\u4008\u4008\u4010\u4008\u4010\u4008\u4008\u4010\u4010\u4008\u4008\u4010\u4010\u4010\u4018\u4010\u4010\u4008\u4010\u4010"));
        arrclass_2080[8732 & 1325] = new Class_2080(Class_22849.Method_22957("\u3221\u3229\u3221\u3225\u3225\u3221\u3221\u326c\u3228\u3224\u3229\u322d\u3265\u3229\u3220\u3224\u3221\u3221\u3228\u322c\u3220\u326d\u3228\u3220\u3225\u3225"));
        arrclass_2080[16399 & 4717] = new Class_2080(Class_22849.Method_22930("\u3060\u3068\u3060\u3060\u3064\u3064\u3064\u302c\u3068\u3060\u3068\u3068\u3024\u306c\u306c\u306c\u3068\u3048\u3060\u3068\u306c\u3064\u3064\u3064\u3060\u3060\u3060\u3060\u3024\u3064\u306c\u3064\u3068"));
        arrclass_2080[1071 & 30814] = new Class_2080(Class_22849.Method_22970("\u0338\u0323\u032a\u032b\u032e\u033d\u033c\u0364\u033b\u0320\u0338\u033b\u0364\u033c\u0324\u032d\u033a\u0333\u0371\u0331\u032c\u0334\u0335"));
        arrclass_2080[95 & -32593] = new Class_2080(Class_22849.Method_22943("\u0264\u026c\u0264\u0260\u0260\u0264\u0264\u0228\u026c\u0260\u026c\u0268\u0220\u026c\u0264\u0268\u0264\u0228\u026c\u0264\u0268\u0268"));
        arrclass_2080[-19405 & 16724] = new Class_2080(Class_22849.Method_22994("\u0500\u051b\u0512\u0517\u0512\u0505\u0504\u0518\u0503\u051c\u0500\u0507\u0518\u0513\u0512\u0504\u0512\u0507\u0506\u0501\u0516\u0503\u0512\u0519\u0519\u0500\u051c\u051d"));
        arrclass_2080[-32583 & 2641] = new Class_2080(Class_22849.Method_22951("\u4803\u4810\u4813\u4816\u4811\u4806\u4805\u4811\u4800\u4817\u4801\u4806\u4813\u4813\u4804\u4813\u4815\u4816\u4814\u4810\u4807\u4813\u4810"));
        arrclass_2080[1586 & -32737] = new Class_2080(Class_22849.Method_22929("\u4a0a\u4a10\u4a18\u4a18\u4a1c\u4a0e\u4a0e\u4a57\u4a01\u4a1b\u4a02\u4a00\u4a5e\u4a16\u4a1d\u4a05\u4a0b\u4a52\u4a13\u4a0b\u4a16\u4a16"));
        arrclass_2080[6835 & 275] = new Class_2080(Class_22849.Method_22944("\u2000\u201b\u2012\u2013\u2012\u2001\u2000\u2018\u200b\u2010\u2008\u200b\u2010\u2008\u2010\u2019\u2001\u200b\u2002\u2009\u2009\u2010\u2008\u2009"));
        arrclass_2080[-28524 & 10582] = new Class_2080(Class_22849.Method_22995("\u13a3\u13a0\u13a1\u13a4\u13a5\u13a2\u13a3\u13a7\u13a0\u13a7\u13a3\u13a4\u13a7\u13a2\u13a4\u13a7\u13a2\u13a3\u13a6\u13a2\u13a3\u13a7\u13a6"));
        arrclass_2080[2077 & 24725] = new Class_2080(Class_22849.Method_22956("\u4104\u410f\u4106\u4103\u4106\u4101\u4100\u410d\u4106\u4109\u4104\u4103\u410c\u4103\u410c\u4107\u411e\u4117\u411a\u411f\u4112\u4111\u411c\u4119\u4114\u4119\u4118"));
        arrclass_2080[11926 & -16322] = new Class_2080(Class_22849.Method_22986("\u0204\u0204\u0204\u0200\u0200\u0204\u0204\u0200\u020c\u0208\u020c\u0208\u0208\u020c\u020c\u0208\u0200\u0204\u0200\u0204\u0200\u0204\u0204\u0200\u0208"));
        arrclass_2080[18519 & 311] = new Class_2080(Class_22849.Method_22952("\u8007\u8004\u8007\u8002\u8005\u8002\u8001\u8005\u8004\u8003\u8005\u8002\u8007\u8003\u8002\u8003\u8000\u8001\u8004\u8000\u8002\u8003\u8005\u8004"));
        Field_22920 = arrclass_2080;
        Field_22884 = Field_22920.length;
        Field_22857 = new Class_2190(Class_2263.Method_2285(), Class_2205.Field_2212);
    }

    private static String Method_22947(String string) {
        int n = 4412;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_22849.class, 12);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_22948() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_22949(float f, int n) {
        float f2;
        this.Field_22880 = this.Field_22850.Field_84.Field_39801 * (17560 & 4660);
        if (Class_19426.Method_19521()) {
            this.Field_22880 *= 3.717391f * 0.25555557f;
        }
        if (Class_19426.Method_19537()) {
            this.Field_22880 *= 1.097561f * 0.7562222f;
        }
        Class_16867.Method_16934(14243 & 22337);
        Class_16867.Method_16962();
        float f3 = 1.264151f * 0.055373132f;
        if (this.Field_22850.Field_84.Field_39747) {
            Class_16867.Method_16943((float)(-(n * (16674 & 4622) - (-30191 & 5121))) * f3, 0.0f, 0.0f);
        }
        this.Field_22903 = this.Field_22880 * 2.0f;
        if (this.Field_22903 < 0.64893615f * 266.59018f) {
            this.Field_22903 = 599.3215f * 0.28865978f;
        }
        if (this.Field_22850.Field_72.\u0000strictfp.Method_18379() == (1059 & 10241)) {
            this.Field_22903 = 2.631579f * 97.28f;
        }
        if (this.Field_22922 != 1.0) {
            Class_16867.Method_16943((float)this.Field_22902, (float)(-this.Field_22875), 0.0f);
            Class_16867.Method_16958(this.Field_22922, this.Field_22922, 1.0);
        }
        Project.gluPerspective((float)this.Method_22959(f, (641 & -11991) != 0), (float)((float)this.Field_22850.Field_80 / (float)this.Field_22850.Field_44), (float)(0.018000001f * 2.7777777f), (float)this.Field_22903);
        Class_16867.Method_16934(5888 & 6056);
        Class_16867.Method_16962();
        if (this.Field_22850.Field_84.Field_39747) {
            Class_16867.Method_16943((float)(n * (194 & 8254) - (1031 & -21919)) * (0.026582278f * 3.7619047f), 0.0f, 0.0f);
        }
        this.Method_22967(f);
        if (this.Field_22850.Field_84.Field_39756) {
            this.Method_22940(f);
        }
        if ((f2 = this.Field_22850.Field_48.Field_1397 + (this.Field_22850.Field_48.Field_1396 - this.Field_22850.Field_48.Field_1397) * f) > 0.0f) {
            int n2 = 5652 & 2206;
            if (this.Field_22850.Field_48.\u0000strictfp(Class_8338.Field_8372)) {
                n2 = 6727 & 295;
            }
            float f4 = 0.44776118f * 11.166667f / (f2 * f2 + 0.42666668f * 11.71875f) - f2 * (0.078461535f * 0.50980395f);
            f4 *= f4;
            Class_16867.Method_16940(((float)this.Field_22911 + f) * (float)n2, 0.0f, 1.0f, 1.0f);
            Class_16867.Method_16973(1.0f / f4, 1.0f, 1.0f);
            Class_16867.Method_16940(-((float)this.Field_22911 + f) * (float)n2, 0.0f, 1.0f, 1.0f);
        }
        this.Method_22972(f);
        if (this.Field_22862) {
            switch (this.Field_22872) {
                case 0: {
                    Class_16867.Method_16940(32.53012f * 2.7666667f, 0.0f, 1.0f, 0.0f);
                    break;
                }
                case 1: {
                    Class_16867.Method_16940(0.52380955f * 343.63635f, 0.0f, 1.0f, 0.0f);
                    break;
                }
                case 2: {
                    Class_16867.Method_16940(-111.64558f * 0.8061224f, 0.0f, 1.0f, 0.0f);
                    break;
                }
                case 3: {
                    Class_16867.Method_16940(3.4f * 26.470587f, 1.0f, 0.0f, 0.0f);
                    break;
                }
                case 4: {
                    Class_16867.Method_16940(-52.727272f * 1.7068965f, 1.0f, 0.0f, 0.0f);
                }
            }
        }
    }

    private static String Method_22950(String string) {
        int n = 7448;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_22849.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_22951(String string) {
        int n = 26878;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_22849.class, 20);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_22952(String string) {
        int n = 24413;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_22849.class, 26);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private FloatBuffer Method_22953(float f, float f2, float f3, float f4) {
        if (Class_19426.Method_19570()) {
            Class_12440.Method_12939(f, f2, f3);
        }
        this.Field_22898.clear();
        this.Field_22898.put(f).put(f2).put(f3).put(f4);
        this.Field_22898.flip();
        return this.Field_22898;
    }

    public Class_10040 Method_22954() {
        return this.Field_22905;
    }

    private static String Method_22955(String string) {
        int n = 17264;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_22849.class, 7);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_22956(String string) {
        int n = 26181;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_22849.class, 24);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_22957(String string) {
        int n = 27812;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_22849.class, 15);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_22958() {
        float f;
        float f2;
        if (Class_32876.Field_32906 && Class_7359.Method_7363() == null) {
            Class_7359.Method_7367();
        }
        this.Method_22942();
        this.Method_22941();
        this.Field_22860 = this.Field_22882;
        this.Field_22919 = this.Field_22897;
        if (this.Field_22850.Field_84.Field_39711) {
            f = this.Field_22850.Field_84.Field_39839 * (3.642857f * 0.16470589f) + 0.21463415f * 0.9318182f;
            f2 = f * f * f * (12.923077f * 0.61904764f);
            this.Field_22921 = this.Field_22859.Method_11706(this.Field_22896, 0.051315792f * 0.974359f * f2);
            this.Field_22869 = this.Field_22917.Method_11706(this.Field_22894, 0.02215909f * 2.2564104f * f2);
            this.Field_22909 = 0.0f;
            this.Field_22896 = 0.0f;
            this.Field_22894 = 0.0f;
        } else {
            this.Field_22921 = 0.0f;
            this.Field_22869 = 0.0f;
            this.Field_22859.Method_11705();
            this.Field_22917.Method_11705();
        }
        if (this.Field_22850.Method_246() == null) {
            this.Field_22850.Method_228(this.Field_22850.Field_48);
        }
        f = this.Field_22850.Field_72.\u0000strictfp(new Class_4751(this.Field_22850.Method_246()));
        f2 = (float)this.Field_22850.Field_84.Field_39801 / (1.0652174f * 30.040817f);
        float f3 = f * (1.0f - f2) + f2;
        this.Field_22882 += (f3 - this.Field_22882) * (0.61538464f * 0.1625f);
        this.Field_22911 += 8385 & -32765;
        this.Field_22867.Method_6928();
        this.Method_22965();
        this.Field_22916 = this.Field_22893;
        if (Class_14453.Field_14457) {
            this.Field_22893 += 0.47619048f * 0.105000004f;
            if (this.Field_22893 > 1.0f) {
                this.Field_22893 = 1.0f;
            }
            Class_14453.Field_14457 = 4736 & -31478;
        } else if (this.Field_22893 > 0.0f) {
            this.Field_22893 -= 0.29032257f * 0.043055557f;
        }
    }

    private float Method_22959(float f, boolean bl) {
        Object object;
        if (this.Field_22862) {
            return 684.0f * 0.13157895f;
        }
        Class_1061 class_1061 = this.Field_22850.Method_246();
        float f2 = 0.50877196f * 137.5862f;
        if (bl) {
            f2 = this.Field_22850.Field_84.Field_39823;
            if (Class_19426.Method_19489()) {
                f2 *= this.Field_22856 + (this.Field_22851 - this.Field_22856) * f;
            }
        }
        int n = 528 & 69;
        if (this.Field_22850.Field_36 == null) {
            object = this.Field_22850.Field_84;
            n = Class_39702.Method_39906(this.Field_22850.Field_84.Field_39710) ? 1 : 0;
        }
        Class_19426.Field_19457 = 1.0f;
        if (n != 0) {
            if (!Class_19426.Field_19432) {
                Class_19426.Field_19432 = 1795 & 26821;
                this.Field_22850.Field_84.Field_39711 = 16643 & 10261;
            }
            if (Class_19426.Field_19432) {
                Class_19426.Field_19457 = 3.5932202f * 1.1132076f;
            }
        } else if (Class_19426.Field_19432) {
            Class_19426.Field_19432 = 3456 & 28756;
            this.Field_22850.Field_84.Field_39711 = -31099 & 18720;
            this.Field_22859 = new Class_11701();
            this.Field_22917 = new Class_11701();
            this.Field_22850.Field_33.Field_25078 = -12087 & 10545;
        }
        Class_19426.Field_19427 = (float)((double)Class_19426.Field_19427 * (2.6774193548387095 * 0.11204819277108434));
        if ((double)Math.abs(Class_19426.Field_19427 = (float)((double)Class_19426.Field_19427 + this.Field_22850.Field_127.Field_2172 * (double)(Class_19426.Field_19457 - Class_19426.Field_19464) * (0.06896551724137931 * 2.9000000000000004))) > 0.075 * 0.013333333333333334) {
            this.Field_22850.Field_33.Field_25078 = 1063 & 24585;
        }
        Class_19426.Field_19464 += Class_19426.Field_19427;
        f2 /= Class_19426.Field_19457;
        if (class_1061 instanceof Class_859 && ((Class_859)class_1061).Method_961() <= 0.0f) {
            float f3 = (float)((Class_859)class_1061).Field_928 + f;
            f2 /= (1.0f - 521.978f * 0.95789474f / (f3 + 105.26316f * 4.75f)) * 2.0f + 1.0f;
        }
        if (((Class_3238)(object = Class_41473.Method_41484(this.Field_22850.Field_72, class_1061, f))).Method_3373() == Class_3713.Field_3734) {
            f2 = f2 * (1.0588236f * 56.666664f) / (0.21518987f * 325.29413f);
        }
        return f2;
    }

    private static String Method_22960(String string) {
        int n = 7923;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_22849.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_22961() {
        Class_31566 class_31566 = new Class_31566(this.Field_22850);
        Class_16867.Method_16983(12548 & 1408);
        Class_16867.Method_16934(32591 & 5921);
        Class_16867.Method_16962();
        Class_16867.Method_16911(0.0, class_31566.Method_31573(), class_31566.Method_31577(), 0.0, 0.2653061224489796 * 3769.230769230769, 1279.4117647058824 * 2.3448275862068964);
        Class_16867.Method_16934(5969 & 5898);
        Class_16867.Method_16962();
        Class_16867.Method_16943(0.0f, 0.0f, 11.5f * -173.91304f);
    }

    private static String Method_22962(String string) {
        int n = 14599;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_22849.class, 10);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_22963() {
        this.Field_22855 = -32000 & 104;
        if (Class_19426.Method_19608() && Class_19426.Method_19510()) {
            Class_3013 class_3013;
            if (this.Field_22850.Method_251() && (class_3013 = this.Field_22850.Method_180()) != null) {
                boolean bl = this.Field_22850.Method_169();
                if (!bl && !(this.Field_22850.Field_36 instanceof Class_20573)) {
                    if (this.Field_22892 > 0) {
                        Class_9967.Field_9986.Method_35684();
                        Class_19426.Method_19514(this.Field_22892);
                        Class_9967.Field_9986.Method_35682();
                        this.Field_22855 = this.Field_22892;
                    }
                    long l = System.nanoTime() / (270484032L & 1995577020453444552L);
                    if (this.Field_22899 != (12632088L & -5909804441606809212L) && this.Field_22876 != 0) {
                        long l2 = l - this.Field_22899;
                        if (l2 < (7484830578051793937L & -7484830579213467508L)) {
                            this.Field_22899 = l;
                            l2 = 548008714607527936L & -548008715678969421L;
                        }
                        if (l2 >= (1241661618L & 2102643L)) {
                            this.Field_22899 = l;
                            int n = class_3013.\u0000, #();
                            int n2 = n - this.Field_22876;
                            if (n2 < 0) {
                                this.Field_22876 = n;
                                n2 = 4128 & 11335;
                            }
                            if (n2 < (49 & 8449) && this.Field_22892 < (16487 & 612)) {
                                this.Field_22892 += 8450 & -15802;
                            }
                            if (n2 > (1033 & 3011) && this.Field_22892 > 0) {
                                this.Field_22892 -= 4363 & -32159;
                            }
                            this.Field_22876 = n;
                        }
                    } else {
                        this.Field_22899 = l;
                        this.Field_22876 = class_3013.\u0000, #();
                        this.Field_22925 = 1.0f;
                        this.Field_22877 = 0.52272725f * 95.652176f;
                    }
                } else {
                    if (this.Field_22850.Field_36 instanceof Class_20573) {
                        Class_19426.Method_19514(255378220780617854L & -255378222575770348L);
                    }
                    this.Field_22899 = 274860104L & 134317060L;
                    this.Field_22876 = -23488 & 18433;
                }
            }
        } else {
            this.Field_22899 = 705284116L & 1096941954L;
            this.Field_22876 = 1664 & -20381;
        }
    }

    public void Method_22964(float f, long l) {
        Class_19426.Field_19458 = f;
        this.Method_22927();
        boolean bl = Display.isActive();
        if (!(bl || !this.Field_22850.Field_84.Field_39734 || this.Field_22850.Field_84.Field_39870 && Mouse.isButtonDown((int)(16403 & -31839)))) {
            if (Class_18.Method_207() - this.Field_22895 > (1967392254L & 3966136679906943476L)) {
                this.Field_22850.Method_195();
            }
        } else {
            this.Field_22895 = Class_18.Method_207();
        }
        if (!this.Field_22850.Field_67) {
            Field_22873 = this.Field_22850.Field_84.Field_39747;
            Class_31566 class_31566 = new Class_31566(this.Field_22850);
            int n = class_31566.Method_31574();
            int n2 = class_31566.Method_31575();
            int n3 = Mouse.getX() * n / this.Field_22850.Field_80;
            int n4 = n2 - Mouse.getY() * n2 / this.Field_22850.Field_44 - (-32459 & 9859);
            int n5 = this.Field_22850.Field_84.Field_39840;
            if (this.Field_22850.Field_72 != null) {
                this.Field_22850.Field_25.Method_2789("level");
                int n6 = Math.min(Class_18.Method_256(), n5);
                n6 = Math.max(n6, -32580 & 4735);
                long l2 = System.nanoTime() - l;
                long l3 = Math.max((long)((2145054520 & -1147417984) / n6 / (532 & 27726)) - l2, 8886727601784300064L & -8886727602780469246L);
                this.Method_22980(f, System.nanoTime() + l3);
                if (Class_32876.Field_32906) {
                    this.Field_22850.Field_33.Method_25143();
                    if (this.Field_22912 != null && this.Field_22901) {
                        Class_16867.Method_16934(-26874 & 32611);
                        Class_16867.Method_16961();
                        Class_16867.Method_16962();
                        this.Field_22912.Method_26367(f);
                        Class_16867.Method_16945();
                    }
                    this.Field_22850.Method_164().Method_19152((977 & 10249) != 0);
                }
                this.Field_22870 = System.nanoTime();
                this.Field_22850.Field_25.Method_2783("gui");
                if (!this.Field_22850.Field_84.Field_39731 || this.Field_22850.Field_36 != null) {
                    Class_16867.Method_16967(10854 & -32123, 0.8414634f * 0.11884058f);
                    this.Field_22850.Field_105.Method_45453(f);
                    if (this.Field_22850.Field_84.Field_39709 && !this.Field_22850.Field_84.Field_39781) {
                        Class_19426.Method_19583();
                    }
                    if (this.Field_22850.Field_84.Field_39781) {
                        Class_9967.Method_9999(class_31566);
                    }
                }
                this.Field_22850.Field_25.Method_2790();
            } else {
                Class_16867.Method_16910(13334 & -16119, -10655 & 4, this.Field_22850.Field_80, this.Field_22850.Field_44);
                Class_16867.Method_16934(5985 & -26735);
                Class_16867.Method_16962();
                Class_16867.Method_16934(22281 & 16128);
                Class_16867.Method_16962();
                this.Method_22961();
                this.Field_22870 = System.nanoTime();
            }
            if (this.Field_22850.Field_36 != null) {
                Class_16867.Method_16983(2867 & -28416);
                try {
                    this.Field_22850.Field_36.Method_1545(n3, n4, f);
                }
                catch (Throwable throwable) {
                    Class_13268 class_13268 = Class_13268.Method_13285(throwable, "Rendering screen");
                    Class_13220 class_13220 = class_13268.Method_13280("Screen render details");
                    class_13220.Method_13232("Screen name", new Class_17276(this));
                    class_13220.Method_13232("Mouse location", new Class_11991(this, n3, n4));
                    class_13220.Method_13232("Screen size", new Class_23737(this, class_31566));
                    throw new Class_1809(class_13268);
                }
            }
        }
        this.Method_22935();
        this.Method_22963();
        Class_9967.Method_10001();
        if (this.Field_22850.Field_84.Field_39865) {
            this.Field_22850.Field_84.Field_39822 = -28391 & 8807;
        }
    }

    private void Method_22965() {
        float f = this.Field_22850.Field_72.\u0000, for(1.0f);
        if (!Class_19426.Method_19484()) {
            f /= 2.0f;
        }
        if (f != 0.0f && Class_19426.Method_19531()) {
            this.Field_22863.setSeed((long)this.Field_22911 * (1565724253379616511L & -1565724254292947105L));
            Class_1061 class_1061 = this.Field_22850.Method_246();
            Class_570 class_570 = this.Field_22850.Field_72;
            Class_4751 class_4751 = new Class_4751(class_1061);
            int n = 170 & -13746;
            double d = 0.0;
            double d2 = 0.0;
            double d3 = 0.0;
            int n2 = 676 & -6135;
            int n3 = (int)(1.1481482f * 87.09677f * f * f);
            if (this.Field_22850.Field_84.Field_39779 == (1 & -28435)) {
                n3 >>= 6489 & 8229;
            } else if (this.Field_22850.Field_84.Field_39779 == (23170 & 35)) {
                n3 = 1216 & 2567;
            }
            for (int i = -16128 & 1152; i < n3; ++i) {
                Class_4751 class_47512 = class_570.\u0000, `(class_4751.Method_4791(this.Field_22863.nextInt(n) - this.Field_22863.nextInt(n), 9897 & 80, this.Field_22863.nextInt(n) - this.Field_22863.nextInt(n)));
                Class_17281 class_17281 = class_570.\u0000strictfp(class_47512);
                Class_4751 class_47513 = class_47512.Method_4782();
                Class_3238 class_3238 = class_570.\u0000strictfp(class_47513).Method_3442();
                if (class_47512.\u0000, `() > class_4751.\u0000, `() + n || class_47512.\u0000, `() < class_4751.\u0000, `() - n || !class_17281.Method_17400() || !(class_17281.Method_17407(class_47512) >= 0.14620253f * 1.025974f)) continue;
                double d4 = this.Field_22863.nextDouble();
                double d5 = this.Field_22863.nextDouble();
                if (class_3238.Method_3373() == Class_3713.Field_3750) {
                    this.Field_22850.Field_72.\u0000strictfp(Class_40274.Field_40283, (double)class_47512.\u0000= final() + d4, (double)((float)class_47512.\u0000, `() + 0.0065789474f * 15.2f) - class_3238.Method_3324(), (double)class_47512.\u0000strictfp() + d5, 0.0, 0.0, 0.0, new int[-23626 & 16456]);
                    continue;
                }
                if (class_3238.Method_3373() == Class_3713.Field_3718) continue;
                class_3238.Method_3382(class_570, class_47513);
                if (this.Field_22863.nextInt(++n2) == 0) {
                    d = (double)class_47513.\u0000= final() + d4;
                    d2 = (double)((float)class_47513.\u0000, `() + 1.12f * 0.08928572f) + class_3238.Method_3337() - 1.0;
                    d3 = (double)class_47513.\u0000strictfp() + d5;
                }
                this.Field_22850.Field_72.\u0000strictfp(Class_40274.Field_40282, (double)class_47513.\u0000= final() + d4, (double)((float)class_47513.\u0000, `() + 0.825f * 0.121212125f) + class_3238.Method_3337(), (double)class_47513.\u0000strictfp() + d5, 0.0, 0.0, 0.0, new int[-32384 & 16961]);
            }
            if (n2 > 0) {
                int n4 = this.Field_22915;
                this.Field_22915 = n4 + (-29693 & 4417);
                if (this.Field_22863.nextInt(-32749 & 5031) < n4) {
                    this.Field_22915 = 642 & 9224;
                    if (d2 > (double)(class_4751.\u0000, `() + (11045 & 1)) && class_570.\u0000, `(class_4751).\u0000, `() > Class_13337.Method_13377(class_4751.\u0000, `())) {
                        this.Field_22850.Field_72.Method_589(d, d2, d3, "ambient.weather.rain", 0.026086958f * 3.8333333f, 0.53846157f * 0.9285714f, (16516 & 10048) != 0);
                    } else {
                        this.Field_22850.Field_72.Method_589(d, d2, d3, "ambient.weather.rain", 0.23294118f * 0.85858583f, 1.0f, (17 & 16960) != 0);
                    }
                }
            }
        }
    }

    private static String Method_22966(String string) {
        int n = 20769;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_22849.class, 14);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_22967(float f) {
        if (this.Field_22850.Method_246() instanceof Class_859) {
            float f2;
            Class_859 class_859 = (Class_859)this.Field_22850.Method_246();
            float f3 = (float)class_859.Field_872 - f;
            if (class_859.Method_961() <= 0.0f) {
                f2 = (float)class_859.Field_928 + f;
                Class_16867.Method_16940(0.77272725f * 51.764706f - 4000.0f * 2.0f / (f2 + 4.714286f * 42.42424f), 0.0f, 0.0f, 1.0f);
            }
            if (f3 < 0.0f) {
                return;
            }
            f3 /= (float)class_859.Field_881;
            f3 = Class_13337.Method_13370(f3 * f3 * f3 * f3 * (2.951193f * 1.0645162f));
            f2 = class_859.Field_876;
            Class_16867.Method_16940(-f2, 0.0f, 1.0f, 0.0f);
            Class_16867.Method_16940(-f3 * (7.1749997f * 1.9512196f), 0.0f, 0.0f, 1.0f);
            Class_16867.Method_16940(f2, 0.0f, 1.0f, 0.0f);
        }
    }

    public void Method_22968() {
        this.Field_22901 = !this.Field_22901 ? 16981 & 8193 : -31664 & 10786;
    }

    private static String Method_22969(String string) {
        int n = 7713;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_22849.class, 11);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_22970(String string) {
        int n = 30511;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_22849.class, 17);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_22971(String string) {
        int n = 23806;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_22849.class, 9);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_22972(float f) {
        Object object;
        Class_1061 class_1061 = this.Field_22850.Method_246();
        float f2 = class_1061.Method_1289(f);
        double d = class_1061.Method_1255() + (class_1061.Field_1130 - class_1061.Method_1255()) * (double)f;
        double d2 = class_1061.Method_1170() + (class_1061.Method_1324() - class_1061.Method_1170()) * (double)f + (double)f2;
        double d3 = class_1061.Method_1271() + (class_1061.Field_1106 - class_1061.Method_1271()) * (double)f;
        if (class_1061 instanceof Class_859 && ((Class_859)class_1061).Method_1017()) {
            f2 = (float)((double)f2 + 1.0);
            Class_16867.Method_16943(0.0f, 0.27558142f * 1.0886075f, 0.0f);
            if (!this.Field_22850.Field_84.Field_39864) {
                Class_4751 class_4751 = new Class_4751(class_1061);
                object = this.Field_22850.Field_72.\u0000strictfp(class_4751);
                Class_3238 class_3238 = object.Method_3442();
                if (class_3238 == Class_9265.Field_9441) {
                    int n = ((Class_4595)((Object)object.Method_3440(Class_5108.\u0000strictfp))).Method_4619();
                    Class_16867.Method_16940(n * (6234 & 18266), 0.0f, 1.0f, 0.0f);
                }
                Class_16867.Method_16940(class_1061.Method_1179(f) + 0.9375f * 192.0f, 0.0f, -0.7882353f * 1.2686567f, 0.0f);
                Class_16867.Method_16940(class_1061.Method_1160(f), -0.7108434f * 1.4067796f, 0.0f, 0.0f);
            }
        } else if (this.Field_22850.Field_84.Field_39802 > 0 || this.Field_22854) {
            double d4 = this.Field_22919 + (this.Field_22897 - this.Field_22919) * f;
            if (this.Field_22850.Field_84.Field_39864) {
                Class_16867.Method_16943(0.0f, 0.0f, (float)(-d4));
            } else {
                float f3;
                float f4 = class_1061.Method_1179(0.0f);
                float f5 = class_1061.Method_1160(0.0f);
                this.Field_22861 = f4;
                this.Field_22879 = f5;
                if (this.Field_22850.Field_84.Field_39802 == (14466 & 16386)) {
                    f5 += 63.692307f * 2.826087f;
                }
                double d5 = (double)(-Class_13337.Method_13370(f4 / (1152.0f * 0.15625f) * (59.0f * 0.053247336f)) * Class_13337.Method_13350(f5 / (121.62162f * 1.48f) * (1.6538461f * 1.8995677f))) * d4;
                double d6 = (double)(Class_13337.Method_13350(f4 / (0.93846154f * 191.80328f) * (1.1794872f * 2.6635242f)) * Class_13337.Method_13350(f5 / (1.0909091f * 165.0f) * (0.022988506f * 136.65929f))) * d4;
                double d7 = (double)(-Class_13337.Method_13370(f5 / (80.76923f * 2.2285714f) * (0.032608695f * 96.34218f))) * d4;
                for (int i = 17600 & 2092; i < (-11160 & 520); ++i) {
                    double d8;
                    Class_37110 class_37110;
                    f3 = (i & (-32363 & 4609)) * (5506 & -14289) - (537 & -6783);
                    float f6 = (i >> (-15531 & 5281) & (-24047 & 7)) * (2570 & 8502) - (625 & 17667);
                    float f7 = (i >> (-13133 & 8194) & (3781 & 257)) * (28690 & 194) - (17 & 4419);
                    if ((class_37110 = this.Field_22850.Field_72.\u0000strictfp(new Vec3(d + (double)(f3 *= 0.19047621f * 0.525f), d2 + (double)(f6 *= 4.75f * 0.021052632f), d3 + (double)(f7 *= 0.09113924f * 1.0972222f)), new Vec3(d - d5 + (double)f3 + (double)f7, d2 - d7 + (double)f6, d3 - d6 + (double)f7))) == null || !((d8 = class_37110.Field_37115.\u0000, `(new Vec3(d, d2, d3))) < d4)) continue;
                    d4 = d8;
                }
                if (this.Field_22850.Field_84.Field_39802 == (1799 & -22334)) {
                    Class_16867.Method_16940(1.945946f * 92.5f, 0.0f, 1.0f, 0.0f);
                }
                float f8 = class_1061.Method_1179(0.0f);
                f3 = class_1061.Method_1160(0.0f);
                Class_16867.Method_16940(f3 - f5, 1.0f, 0.0f, 0.0f);
                Class_16867.Method_16940(f8 - f4, 0.0f, 1.0f, 0.0f);
                Class_16867.Method_16943(0.0f, 0.0f, (float)(-d4));
                Class_16867.Method_16940(f4 - f8, 0.0f, 1.0f, 0.0f);
                Class_16867.Method_16940(f5 - f3, 1.0f, 0.0f, 0.0f);
            }
        } else {
            Class_16867.Method_16943(0.0f, 0.0f, 2.903226f * -0.034444444f);
        }
        if (!this.Field_22850.Field_84.Field_39864) {
            float f9 = class_1061.Method_1160(f);
            Class_16867.Method_16940(f9, 1.0f, 0.0f, 0.0f);
            if (class_1061 instanceof Class_43406) {
                object = (Class_43406)class_1061;
                Class_16867.Method_16940(((Class_43406)object).\u0000interface + (((Class_43406)object).\u0000= # - ((Class_43406)object).\u0000interface) * f + 216.0f * 0.8333333f, 0.0f, 1.0f, 0.0f);
            } else {
                float f10 = class_1061.Method_1179(f) + 1.5882353f * 113.333336f;
                Class_16867.Method_16940(f10, 0.0f, 1.0f, 0.0f);
            }
        }
        Class_16867.Method_16943(0.0f, -f2, 0.0f);
        d = class_1061.Method_1255() + (class_1061.Field_1130 - class_1061.Method_1255()) * (double)f;
        d2 = class_1061.Method_1170() + (class_1061.Method_1324() - class_1061.Method_1170()) * (double)f + (double)f2;
        d3 = class_1061.Method_1271() + (class_1061.Field_1106 - class_1061.Method_1271()) * (double)f;
        this.Field_22865 = this.Field_22850.Field_33.Method_25134(d, d2, d3, f);
    }

    public void Method_22973(Class_279 class_279) {
        if (this.Field_22912 != null) {
            this.Field_22912.Method_26366();
        }
        this.Field_22912 = null;
        if (this.Field_22886 != Field_22884) {
            this.Method_22984(Field_22920[this.Field_22886]);
        } else {
            this.Method_22936(this.Field_22850.Method_246());
        }
    }

    private boolean Method_22974() {
        int n;
        if (!this.Field_22924) {
            return (30721 & -31616) != 0;
        }
        Class_1061 class_1061 = this.Field_22850.Method_246();
        int n2 = n = class_1061 instanceof Class_626 && !this.Field_22850.Field_84.Field_39731 ? 2053 & 17849 : -32704 & 2720;
        if (n != 0 && !((Class_626)class_1061).Field_694.Field_18083) {
            Class_23823 class_23823 = ((Class_626)class_1061).Method_792();
            if (this.Field_22850.Field_57 != null && this.Field_22850.Field_57.Field_37112 == Class_7192.Field_7193) {
                Class_4751 class_4751 = this.Field_22850.Field_57.Method_37118();
                Class_3238 class_3238 = this.Field_22850.Field_72.\u0000strictfp(class_4751).Method_3442();
                if (this.Field_22850.Field_61.Method_11771() == Class_35650.Field_35654) {
                    boolean bl;
                    if (Class_14610.Field_14613.Method_13570()) {
                        Class_3436 class_3436 = this.Field_22850.Field_72.\u0000strictfp(class_4751);
                        Object[] arrobject = new Object[-28527 & 3625];
                        arrobject[12433 & 256] = class_3436;
                        bl = Class_14610.Method_14674(class_3238, Class_14610.Field_14613, arrobject);
                    } else {
                        bl = class_3238.Method_3339();
                    }
                    n = bl && this.Field_22850.Field_72.\u0000strictfp(class_4751) instanceof Class_4961 ? 7313 & -15515 : -26472 & 1858;
                } else {
                    n = class_23823 != null && (class_23823.Method_23876(class_3238) || class_23823.Method_23889(class_3238)) ? 16393 & 1345 : -28462 & 16645;
                }
            }
        }
        return n != 0;
    }

    private static String Method_22975(String string) {
        int n = 19842;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_22849.class, 13);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_22976() {
        Class_16867.Method_16960(Class_32876.Field_32911);
        Class_16867.Method_16934(-24766 & 14234);
        Class_16867.Method_16962();
        float f = 0.0029761905f * 1.3125f;
        Class_16867.Method_16973(f, f, f);
        Class_16867.Method_16943(1.5774647f * 5.071429f, 24.4f * 0.32786885f, 11.764706f * 0.68f);
        Class_16867.Method_16934(16192 & 22417);
        this.Field_22850.Method_253().Method_34707(this.Field_22881);
        GL11.glTexParameteri((int)(3561 & -28701), (int)(10369 & 14439), (int)(-6365 & 9741));
        GL11.glTexParameteri((int)(32739 & 3557), (int)(11362 & -22008), (int)(-22653 & 26117));
        GL11.glTexParameteri((int)(11745 & 7657), (int)(14406 & 11666), (int)(-5815 & 16132));
        GL11.glTexParameteri((int)(3569 & 11751), (int)(10755 & 26651), (int)(27080 & 10497));
        Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 1.0f);
        Class_16867.Method_16965();
        Class_16867.Method_16960(Class_32876.Field_32931);
        if (Class_19426.Method_19570()) {
            Class_12440.Method_12914();
        }
    }

    protected void Method_22977(float f) {
        float f2;
        Object object;
        if (Class_14610.Field_14622.Method_13570()) {
            Class_18343 class_18343 = this.Field_22850.Field_72.\u0000strictfp;
            object = Class_14610.Method_14650(class_18343, Class_14610.Field_14622, new Object[-29052 & 20545]);
        }
        if ((f2 = this.Field_22850.Field_72.\u0000, for(f)) > 0.0f) {
            if (Class_19426.Method_19473()) {
                return;
            }
            this.Method_22976();
            object = this.Field_22850.Method_246();
            Class_570 class_570 = this.Field_22850.Field_72;
            int n = Class_13337.Method_13371(((Class_1061)object).Field_1130);
            int n2 = Class_13337.Method_13371(((Class_1061)object).Method_1324());
            int n3 = Class_13337.Method_13371(((Class_1061)object).Field_1106);
            Class_7644 class_7644 = Class_7644.Method_7649();
            Class_22385 class_22385 = class_7644.Method_7648();
            Class_16867.Method_16969();
            GL11.glNormal3f((float)0.0f, (float)1.0f, (float)0.0f);
            Class_16867.Method_16947();
            Class_16867.Method_16984(-23741 & 1826, 9071 & 899, -27629 & 16521, 2065 & 10);
            Class_16867.Method_16967(28180 & 516, 0.82894737f * 0.12063492f);
            double d = ((Class_1061)object).Field_1126 + (((Class_1061)object).Field_1130 - ((Class_1061)object).Field_1126) * (double)f;
            double d2 = ((Class_1061)object).Field_1102 + (((Class_1061)object).Method_1324() - ((Class_1061)object).Field_1102) * (double)f;
            double d3 = ((Class_1061)object).Field_1125 + (((Class_1061)object).Field_1106 - ((Class_1061)object).Field_1125) * (double)f;
            int n4 = Class_13337.Method_13371(d2);
            int n5 = 5725 & 2309;
            if (Class_19426.Method_19484()) {
                n5 = 1226 & 26;
            }
            int n6 = -1 & -1;
            float f3 = (float)this.Field_22911 + f;
            class_22385.Method_22444(-d, -d2, -d3);
            if (Class_19426.Method_19484()) {
                n5 = 10542 & 16474;
            }
            Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 1.0f);
            Class_4810 class_4810 = new Class_4810();
            for (int i = n3 - n5; i <= n3 + n5; ++i) {
                for (int j = n - n5; j <= n + n5; ++j) {
                    double d4;
                    double d5;
                    double d6;
                    int n7 = (i - n3 + (10612 & 20626)) * (2472 & -20382) + j - n + (11289 & 16530);
                    double d7 = (double)this.Field_22907[n7] * (4.916666666666667 * 0.10169491525423728);
                    double d8 = (double)this.Field_22887[n7] * (2.090909090909091 * 0.2391304347826087);
                    class_4810.Method_4814(j, -32128 & 25671, i);
                    Class_17281 class_17281 = class_570.\u0000strictfp((Class_4751)class_4810);
                    if (!class_17281.Method_17400() && !class_17281.Method_17383()) continue;
                    int n8 = class_570.\u0000, `((Class_4751)class_4810).\u0000, `();
                    int n9 = n2 - n5;
                    int n10 = n2 + n5;
                    if (n9 < n8) {
                        n9 = n8;
                    }
                    if (n10 < n8) {
                        n10 = n8;
                    }
                    int n11 = n8;
                    if (n8 < n4) {
                        n11 = n4;
                    }
                    if (n9 == n10) continue;
                    this.Field_22863.setSeed(j * j * (19763 & 3189) + j * (116575167 & 1118988987) ^ i * i * (67593207 & -2144967785) + i * (15825 & -18997));
                    class_4810.Method_4814(j, n9, i);
                    float f4 = class_17281.Method_17407(class_4810);
                    if (class_570.\u0000strictfp().Method_31928(f4, n8) >= 0.14634146f * 1.0250001f) {
                        if (n6 != 0) {
                            if (n6 >= 0) {
                                class_7644.Method_7647();
                            }
                            n6 = -26571 & 25090;
                            this.Field_22850.Method_253().Method_34707(Field_22891);
                            class_22385.Method_22417(-24561 & 17927, Class_29585.Field_29605);
                        }
                        d6 = ((double)(this.Field_22911 + j * j * (20019 & 3249) + j * (1790339835 & -2081170501) + i * i * (8842135 & 36070303) + i * (13761 & 15825) & (1055 & 31)) + (double)f) / (63.0 * 0.5079365079365079) * (1.1688311688311688 * 2.566666666666667 + this.Field_22863.nextDouble());
                        d5 = (double)((float)j + 0.74285716f * 0.6730769f) - ((Class_1061)object).Field_1130;
                        d4 = (double)((float)i + 0.23456791f * 2.131579f) - ((Class_1061)object).Field_1106;
                        float f5 = Class_13337.Method_13347(d5 * d5 + d4 * d4) / (float)n5;
                        float f6 = ((1.0f - f5 * f5) * (9.75f * 0.051282052f) + 1.325f * 0.37735847f) * f2;
                        class_4810.Method_4814(j, n11, i);
                        int n12 = class_570.\u0000strictfp((Class_4751)class_4810, 16898 & 8476);
                        int n13 = n12 >> (16945 & -27632) & (302448639 & -2134310913);
                        int n14 = n12 & (755564543 & 1115881471);
                        class_22385.Method_22443((double)j - d7 + 0.38144329896907214 * 1.310810810810811, n9, (double)i - d8 + 6.5 * 0.07692307692307693).Method_22433(0.0, (double)n9 * (0.07352941176470588 * 3.4) + d6).Method_22427(1.0f, 1.0f, 1.0f, f6).Method_22418(n13, n14).Method_22451();
                        class_22385.Method_22443((double)j + d7 + 0.6 * 0.8333333333333334, n9, (double)i + d8 + 2.037037037037037 * 0.24545454545454543).Method_22433(1.0, (double)n9 * (0.6792452830188679 * 0.3680555555555556) + d6).Method_22427(1.0f, 1.0f, 1.0f, f6).Method_22418(n13, n14).Method_22451();
                        class_22385.Method_22443((double)j + d7 + 8.4 * 0.05952380952380952, n10, (double)i + d8 + 0.0625 * 8.0).Method_22433(1.0, (double)n10 * (0.004464285714285714 * 56.0) + d6).Method_22427(1.0f, 1.0f, 1.0f, f6).Method_22418(n13, n14).Method_22451();
                        class_22385.Method_22443((double)j - d7 + 0.20618556701030927 * 2.4250000000000003, n10, (double)i - d8 + 0.5185185185185185 * 0.9642857142857143).Method_22433(0.0, (double)n10 * (6.25 * 0.04) + d6).Method_22427(1.0f, 1.0f, 1.0f, f6).Method_22418(n13, n14).Method_22451();
                        continue;
                    }
                    if (n6 != (321 & 24585)) {
                        if (n6 >= 0) {
                            class_7644.Method_7647();
                        }
                        n6 = 8601 & -30717;
                        this.Field_22850.Method_253().Method_34707(Field_22913);
                        class_22385.Method_22417(839 & 14479, Class_29585.Field_29605);
                    }
                    d6 = ((float)(this.Field_22911 & (4607 & -32257)) + f) / (4.1764708f * 122.591545f);
                    d5 = this.Field_22863.nextDouble() + (double)f3 * (6.0 * 0.0016666666666666668) * (double)((float)this.Field_22863.nextGaussian());
                    d4 = this.Field_22863.nextDouble() + (double)(f3 * (float)this.Field_22863.nextGaussian()) * (1.2179487179487178 * 8.210526315789474E-4);
                    double d9 = (double)((float)j + 8.571428f * 0.058333334f) - ((Class_1061)object).Field_1130;
                    double d10 = (double)((float)i + 0.984127f * 0.5080645f) - ((Class_1061)object).Field_1106;
                    float f7 = Class_13337.Method_13347(d9 * d9 + d10 * d10) / (float)n5;
                    float f8 = ((1.0f - f7 * f7) * (7.6666665f * 0.039130438f) + 0.11764706f * 4.25f) * f2;
                    class_4810.Method_4814(j, n11, i);
                    int n15 = (class_570.\u0000strictfp((Class_4751)class_4810, -23706 & 9) * (4223 & -20733) + (301122296 & 619708658)) / (140 & 3877);
                    int n16 = n15 >> (2995 & -20464) & (1074855935 & -1878917121);
                    int n17 = n15 & (-938934273 & 314048511);
                    class_22385.Method_22443((double)j - d7 + 3.928571428571429 * 0.12727272727272726, n9, (double)i - d8 + 0.26785714285714285 * 1.8666666666666667).Method_22433(0.0 + d5, (double)n9 * (0.25 * 1.0) + d6 + d4).Method_22427(1.0f, 1.0f, 1.0f, f8).Method_22418(n16, n17).Method_22451();
                    class_22385.Method_22443((double)j + d7 + 0.10240963855421686 * 4.882352941176471, n9, (double)i + d8 + 0.02197802197802198 * 22.75).Method_22433(1.0 + d5, (double)n9 * (0.06052631578947369 * 4.130434782608695) + d6 + d4).Method_22427(1.0f, 1.0f, 1.0f, f8).Method_22418(n16, n17).Method_22451();
                    class_22385.Method_22443((double)j + d7 + 0.611111111111111 * 0.8181818181818182, n10, (double)i + d8 + 0.367816091954023 * 1.359375).Method_22433(1.0 + d5, (double)n10 * (0.2717391304347826 * 0.92) + d6 + d4).Method_22427(1.0f, 1.0f, 1.0f, f8).Method_22418(n16, n17).Method_22451();
                    class_22385.Method_22443((double)j - d7 + 0.6794871794871795 * 0.7358490566037735, n10, (double)i - d8 + 0.6956521739130435 * 0.71875).Method_22433(0.0 + d5, (double)n10 * (1.2727272727272727 * 0.19642857142857142) + d6 + d4).Method_22427(1.0f, 1.0f, 1.0f, f8).Method_22418(n16, n17).Method_22451();
                }
            }
            if (n6 >= 0) {
                class_7644.Method_7647();
            }
            class_22385.Method_22444(0.0, 0.0, 0.0);
            Class_16867.Method_16979();
            Class_16867.Method_16952();
            Class_16867.Method_16967(5892 & -15849, 0.128f * 0.78125f);
            this.Method_22979();
        }
    }

    private static String Method_22978(String string) {
        int n = 20404;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_22849.class, 6);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_22979() {
        Class_16867.Method_16960(Class_32876.Field_32911);
        Class_16867.Method_16922();
        Class_16867.Method_16960(Class_32876.Field_32931);
        if (Class_19426.Method_19570()) {
            Class_12440.Method_12966();
        }
    }

    public void Method_22980(float f, long l) {
        this.Method_22996(f);
        if (this.Field_22850.Method_246() == null) {
            this.Field_22850.Method_228(this.Field_22850.Field_48);
        }
        this.Method_22938(f);
        if (Class_19426.Method_19570()) {
            Class_12440.Method_12999(this.Field_22850, f, l);
        }
        Class_16867.Method_16927();
        Class_16867.Method_16913();
        Class_16867.Method_16967(25349 & 4622, 0.060416665f * 1.6551725f);
        this.Field_22850.Field_25.Method_2789("center");
        if (this.Field_22850.Field_84.Field_39747) {
            Field_22890 = 10532 & 16401;
            Class_16867.Method_16923((480 & -7663) != 0, (595 & 9345) != 0, (1089 & 10291) != 0, (1288 & 16566) != 0);
            this.Method_22992(6146 & 10061, f, l);
            Field_22890 = 8449 & 2119;
            Class_16867.Method_16923((24721 & -25535) != 0, (8192 & 7688) != 0, (19504 & 260) != 0, (10279 & -31360) != 0);
            this.Method_22992(-28559 & 8323, f, l);
            Class_16867.Method_16923((26275 & 2073) != 0, (16899 & 2305) != 0, (-15099 & 4137) != 0, (1028 & 16385) != 0);
        } else {
            this.Method_22992(2178 & -30909, f, l);
        }
        this.Field_22850.Field_25.Method_2790();
    }

    public float Method_22981(Class_859 class_859, float f) {
        int n = class_859.Method_1034(Class_8338.Field_8356).Method_25251();
        return n > (4317 & 2280) ? 1.0f : 0.105000004f * 6.6666665f + Class_13337.Method_13370(((float)n - f) * (0.20833333f * 15.079645f) * (0.53424656f * 0.37435898f)) * (0.50793654f * 0.590625f);
    }

    public boolean Method_22982(int n) {
        if (!Class_32876.Method_32948()) {
            return (22660 & 2) != 0;
        }
        if (this.Field_22912 != null && this.Field_22912 != this.Field_22918[-32314 & 2] && this.Field_22912 != this.Field_22918[3020 & -11227]) {
            return (11009 & -31691) != 0;
        }
        if (n != (-17530 & 16435) && n != (2127 & 8196)) {
            if (this.Field_22912 == null) {
                return (1061 & -29999) != 0;
            }
            this.Field_22912.Method_26366();
            this.Field_22912 = null;
            return (22733 & 513) != 0;
        }
        if (this.Field_22912 != null && this.Field_22912 == this.Field_22918[n]) {
            return (3401 & 8227) != 0;
        }
        if (this.Field_22850.Field_72 == null) {
            return (24583 & -31863) != 0;
        }
        this.Method_22984(new Class_2080("shaders/post/fxaa_of_" + n + "x.json"));
        this.Field_22918[n] = this.Field_22912;
        return this.Field_22901;
    }

    private void Method_22983(float f, float f2) {
        if (this.Field_22854) {
            this.Field_22864 -= f2 * (0.17205884f * 0.8717949f);
            this.Field_22900 += f * (0.019607844f * 7.65f);
        } else {
            this.Field_22850.Field_48.\u0000
            (f, f2);
        }
    }

    private void Method_22984(Class_2080 class_2080) {
        try {
            this.Field_22912 = new Class_26345(this.Field_22850.Method_253(), this.Field_22906, this.Field_22850.Method_164(), class_2080);
            this.Field_22912.Method_26368(this.Field_22850.Field_80, this.Field_22850.Field_44);
            this.Field_22901 = 4903 & -31663;
        }
        catch (IOException iOException) {
            Field_22885.warn("Failed to load shader: " + class_2080, (Throwable)iOException);
            this.Field_22886 = Field_22884;
            this.Field_22901 = 2081 & 4674;
        }
        catch (JsonSyntaxException jsonSyntaxException) {
            Field_22885.warn("Failed to load shader: " + class_2080, (Throwable)jsonSyntaxException);
            this.Field_22886 = Field_22884;
            this.Field_22901 = 70 & -6783;
        }
    }

    public boolean Method_22985() {
        return (Class_32876.Field_32906 && this.Field_22912 != null ? 1 & 1191 : 2310 & -32768) != 0;
    }

    private static String Method_22986(String string) {
        int n = 31809;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_22849.class, 25);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_22987(float f, int n, boolean bl, boolean bl2, boolean bl3) {
        if (!this.Field_22862) {
            Class_16867.Method_16934(30531 & 8097);
            Class_16867.Method_16962();
            float f2 = 0.016153846f * 4.3333335f;
            if (this.Field_22850.Field_84.Field_39747) {
                Class_16867.Method_16943((float)(-(n * (-32766 & 21846) - (18977 & 9289))) * f2, 0.0f, 0.0f);
            }
            if (Class_19426.Method_19570()) {
                Class_12440.Method_12736();
            }
            Project.gluPerspective((float)this.Method_22959(f, (-16384 & 2048) != 0), (float)((float)this.Field_22850.Field_80 / (float)this.Field_22850.Field_44), (float)(0.41111112f * 0.12162162f), (float)(this.Field_22880 * 2.0f));
            Class_16867.Method_16934(7944 & -26799);
            Class_16867.Method_16962();
            if (this.Field_22850.Field_84.Field_39747) {
                Class_16867.Method_16943((float)(n * (12806 & 17771) - (-28663 & 581)) * (19.0f * 0.005263158f), 0.0f, 0.0f);
            }
            int n2 = 8272 & 2218;
            if (bl) {
                Class_16867.Method_16961();
                this.Method_22967(f);
                if (this.Field_22850.Field_84.Field_39756) {
                    this.Method_22940(f);
                }
                int n3 = n2 = this.Field_22850.Method_246() instanceof Class_859 && ((Class_859)this.Field_22850.Method_246()).Method_1017() ? -31423 & 24579 : 29209 & 32;
                if (!(this.Field_22850.Field_84.Field_39802 != 0 || this.Field_22854 || n2 != 0 || this.Field_22850.Field_84.Field_39731 || this.Field_22850.Field_61.Method_11755())) {
                    this.Method_22976();
                    if (Class_19426.Method_19570()) {
                        Class_25377.Method_25384(this.Field_22867, f, bl3);
                    } else {
                        this.Field_22867.Method_6950(f);
                    }
                    this.Method_22979();
                }
                Class_16867.Method_16945();
            }
            if (!bl2) {
                return;
            }
            if (this.Field_22850.Field_84.Field_39802 == 0 && n2 == 0) {
                this.Field_22867.Method_6946(f);
                this.Method_22967(f);
            }
            if (this.Field_22850.Field_84.Field_39756) {
                this.Method_22940(f);
            }
        }
    }

    public void Method_22988() {
        this.Field_22850.Field_25.Method_2789("mouse");
        boolean bl = Display.isActive();
        if (bl && Class_18.Field_124 && this.Field_22850.Field_28 && !Mouse.isInsideWindow()) {
            Mouse.setGrabbed((-32729 & 10776) != 0);
            Mouse.setCursorPosition((int)(Display.getWidth() / (8218 & 1027)), (int)(Display.getHeight() / (13058 & 2)));
            Mouse.setGrabbed((-11935 & 1153) != 0);
        }
        if (this.Field_22850.Field_28 && bl) {
            Display.processMessages();
            Mouse.poll();
            this.Field_22850.Field_132.Method_12349();
            float f = this.Field_22850.Field_84.Field_39839 * (18.199999f * 0.032967035f) + 0.21212122f * 0.94285715f;
            float f2 = f * f * f * (1.6296296f * 4.909091f);
            float f3 = (float)this.Field_22850.Field_132.Field_12344 * f2;
            float f4 = (float)this.Field_22850.Field_132.Field_12345 * f2;
            int n = 593 & 6409;
            if (this.Field_22850.Field_84.Field_39748) {
                n = -1 & -1;
            }
            if (this.Field_22850.Field_84.Field_39711) {
                this.Field_22896 += f3;
                this.Field_22894 += f4;
                float f5 = (float)this.Field_22850.Field_127.Field_2172;
                f3 = this.Field_22921 * f5;
                f4 = this.Field_22869 * f5;
                this.Method_22983(f3, f4 * (float)n);
            } else {
                this.Field_22896 = 0.0f;
                this.Field_22894 = 0.0f;
                this.Method_22983(f3, f4 * (float)n);
            }
        }
        this.Field_22850.Field_25.Method_2790();
    }

    private static String Method_22989(String string) {
        int n = 3347;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_22849.class, 8);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_22990(float f) {
        float f2;
        Object object;
        Object object2;
        float f3;
        float f4;
        Class_570 class_570 = this.Field_22850.Field_72;
        Class_1061 class_1061 = this.Field_22850.Method_246();
        float f5 = 5.6f * 0.04464286f + 16.875f * 0.044444446f * (float)this.Field_22850.Field_84.Field_39801 / (4.1666665f * 7.6800003f);
        f5 = 1.0f - (float)Math.pow(f5, 0.17708333333333334 * 1.4117647058823528);
        Vec3 vec3 = class_570.\u0000strictfp(this.Field_22850.Method_246(), f);
        vec3 = Class_10125.Method_10186(vec3, class_570, this.Field_22850.Method_246(), f);
        float f6 = (float)vec3.\u0000= final;
        float f7 = (float)vec3.\u0000strictfp;
        float f8 = (float)vec3.\u0000, `;
        Vec3 vec32 = class_570.\u0000strictfp(f);
        vec32 = Class_10125.Method_10162(vec32, class_570, this.Field_22850.Method_246(), f);
        this.Field_22866 = (float)vec32.\u0000= final;
        this.Field_22853 = (float)vec32.\u0000strictfp;
        this.Field_22914 = (float)vec32.\u0000, `;
        if (this.Field_22850.Field_84.Field_39801 >= (852 & -23516)) {
            double d = -1.0 * 1.0;
            object2 = Class_13337.Method_13370(class_570.\u0000%(f)) > 0.0f ? new Vec3(d, 0.0, 0.0) : new Vec3(1.0, 0.0, 0.0);
            f4 = (float)class_1061.Method_1296(f).\u0000= final((Vec3)object2);
            if (f4 < 0.0f) {
                f4 = 0.0f;
            }
            if (f4 > 0.0f && (object = class_570.\u0000strictfp.Method_18368(class_570.\u0000
            (f), f)) != null) {
                this.Field_22866 = this.Field_22866 * (1.0f - (f4 *= object[3111 & 12803])) + object[1536 & 29093] * f4;
                this.Field_22853 = this.Field_22853 * (1.0f - f4) + object[2565 & 4131] * f4;
                this.Field_22914 = this.Field_22914 * (1.0f - f4) + object[2590 & 8578] * f4;
            }
        }
        this.Field_22866 += (f6 - this.Field_22866) * f5;
        this.Field_22853 += (f7 - this.Field_22853) * f5;
        this.Field_22914 += (f8 - this.Field_22914) * f5;
        float f9 = class_570.\u0000, for(f);
        if (f9 > 0.0f) {
            f3 = 1.0f - f9 * (0.55813956f * 0.8958333f);
            float f10 = 1.0f - f9 * (0.3025641f * 1.3220339f);
            this.Field_22866 *= f3;
            this.Field_22853 *= f3;
            this.Field_22914 *= f10;
        }
        if ((f3 = class_570.\u0000= final(f)) > 0.0f) {
            float f11 = 1.0f - f3 * (35.5f * 0.014084507f);
            this.Field_22866 *= f11;
            this.Field_22853 *= f11;
            this.Field_22914 *= f11;
        }
        object2 = Class_41473.Method_41484(this.Field_22850.Field_72, class_1061, f);
        if (this.Field_22865) {
            Vec3 vec33 = class_570.\u0000, `(f);
            this.Field_22866 = (float)vec33.\u0000= final;
            this.Field_22853 = (float)vec33.\u0000strictfp;
            this.Field_22914 = (float)vec33.\u0000, `;
        } else if (((Class_3238)object2).Method_3373() == Class_3713.Field_3734) {
            f4 = (float)Class_29642.Method_29648(class_1061) * (2.1f * 0.095238104f);
            if (class_1061 instanceof Class_859 && ((Class_859)class_1061).Method_1039(Class_8338.Field_8376)) {
                f4 = f4 * (2.2790697f * 0.13163267f) + 0.7096774f * 0.84545463f;
            }
            this.Field_22866 = 0.025853658f * 0.7735849f + f4;
            this.Field_22853 = 0.029411763f * 0.68f + f4;
            this.Field_22914 = 0.17179488f * 1.1641791f + f4;
            object = Class_10125.Method_10153(this.Field_22850.Field_72, this.Field_22850.Method_246().Field_1130, this.Field_22850.Method_246().Method_1324() + 1.0, this.Field_22850.Method_246().Field_1106);
            if (object != null) {
                this.Field_22866 = (float)object.\u0000= final;
                this.Field_22853 = (float)object.\u0000strictfp;
                this.Field_22914 = (float)object.\u0000, `;
            }
        } else if (((Class_3238)object2).Method_3373() == Class_3713.Field_3750) {
            this.Field_22866 = 1.3243244f * 0.45306122f;
            this.Field_22853 = 2.5833333f * 0.038709678f;
            this.Field_22914 = 0.0f;
        }
        float f12 = this.Field_22860 + (this.Field_22882 - this.Field_22860) * f;
        this.Field_22866 *= f12;
        this.Field_22853 *= f12;
        this.Field_22914 *= f12;
        double d = class_570.\u0000strictfp.Method_18377();
        double d2 = (class_1061.Field_1102 + (class_1061.Method_1324() - class_1061.Field_1102) * (double)f) * d;
        if (class_1061 instanceof Class_859 && ((Class_859)class_1061).Method_1039(Class_8338.Field_8346)) {
            int n = ((Class_859)class_1061).Method_1034(Class_8338.Field_8346).Method_25251();
            d2 = n < (16692 & 10910) ? (d2 *= (double)(1.0f - (float)n / (208.0f * 0.09615385f))) : 0.0;
        }
        if (d2 < 1.0) {
            if (d2 < 0.0) {
                d2 = 0.0;
            }
            d2 *= d2;
            this.Field_22866 = (float)((double)this.Field_22866 * d2);
            this.Field_22853 = (float)((double)this.Field_22853 * d2);
            this.Field_22914 = (float)((double)this.Field_22914 * d2);
        }
        if (this.Field_22893 > 0.0f) {
            float f13 = this.Field_22916 + (this.Field_22893 - this.Field_22916) * f;
            this.Field_22866 = this.Field_22866 * (1.0f - f13) + this.Field_22866 * (1.05f * 0.6666667f) * f13;
            this.Field_22853 = this.Field_22853 * (1.0f - f13) + this.Field_22853 * (0.2888889f * 2.0769231f) * f13;
            this.Field_22914 = this.Field_22914 * (1.0f - f13) + this.Field_22914 * (1.1f * 0.54545456f) * f13;
        }
        if (class_1061 instanceof Class_859 && ((Class_859)class_1061).Method_1039(Class_8338.Field_8356)) {
            float f14 = this.Method_22981((Class_859)class_1061, f);
            f2 = 1.0f / this.Field_22866;
            if (f2 > 1.0f / this.Field_22853) {
                f2 = 1.0f / this.Field_22853;
            }
            if (f2 > 1.0f / this.Field_22914) {
                f2 = 1.0f / this.Field_22914;
            }
            this.Field_22866 = this.Field_22866 * (1.0f - f14) + this.Field_22866 * f2 * f14;
            this.Field_22853 = this.Field_22853 * (1.0f - f14) + this.Field_22853 * f2 * f14;
            this.Field_22914 = this.Field_22914 * (1.0f - f14) + this.Field_22914 * f2 * f14;
        }
        if (this.Field_22850.Field_84.Field_39747) {
            float f15 = (this.Field_22866 * (0.083333336f * 360.0f) + this.Field_22853 * (107.588234f * 0.5483871f) + this.Field_22914 * (90.44444f * 0.12162162f)) / (0.16666667f * 600.0f);
            f2 = (this.Field_22866 * (1.3333334f * 22.5f) + this.Field_22853 * (0.6296296f * 111.176476f)) / (6.5f * 15.384615f);
            float f16 = (this.Field_22866 * (28.163265f * 1.0652174f) + this.Field_22914 * (0.33333334f * 210.0f)) / (33.333332f * 3.0f);
            this.Field_22866 = f15;
            this.Field_22853 = f2;
            this.Field_22914 = f16;
        }
        Class_12440.Method_12787(this.Field_22866, this.Field_22853, this.Field_22914, 0.0f);
    }

    public Class_22849(Class_18 class_18, Class_279 class_279) {
        this.Field_22850 = class_18;
        this.Field_22906 = class_279;
        this.Field_22867 = class_18.Method_252();
        this.Field_22905 = new Class_10040(class_18.Method_253());
        this.Field_22910 = new Class_47630(18550 & 9744, -28623 & 26644);
        this.Field_22881 = class_18.Method_253().Method_34708("lightMap", this.Field_22910);
        this.Field_22858 = this.Field_22910.Method_47637();
        this.Field_22912 = null;
        for (int i = 4208 & 26115; i < (24608 & 7472); ++i) {
            for (int j = 30 & 13377; j < (553 & -2896); ++j) {
                float f = j - (1176 & 4371);
                float f2 = i - (-26052 & 8336);
                float f3 = Class_13337.Method_13388(f * f + f2 * f2);
                this.Field_22907[i << (197 & 3591) | j] = -f2 / f3;
                this.Field_22887[i << (8871 & 6165) | j] = f / f3;
            }
        }
    }

    private void Method_22991(Class_1578 class_1578) {
        try {
            String string = null;
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(new Date());
            int n = calendar.get(1285 & -7643);
            int n2 = calendar.get(-32409 & 1538) + (1 & 12421);
            if (n == (10714 & 1544) && n2 == (868 & -28540)) {
                string = "Happy birthday, OptiFine!";
            }
            if (n == (8238 & 8079) && n2 == (3023 & -16360)) {
                string = "Happy birthday, sp614x!";
            }
            if (string == null) {
                return;
            }
            Field[] arrfield = Class_1578.class.getDeclaredFields();
            for (int i = 258 & 2144; i < arrfield.length; ++i) {
                if (arrfield[i].getType() != String.class) continue;
                arrfield[i].setAccessible((2075 & 1029) != 0);
                arrfield[i].set(class_1578, string);
                break;
            }
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }

    private void Method_22992(int n, float f, long l) {
        Class_626 class_626;
        boolean bl = Class_19426.Method_19570();
        if (bl) {
            Class_12440.Method_12983(n, f, l);
        }
        Class_24997 class_24997 = this.Field_22850.Field_33;
        Class_27551 class_27551 = this.Field_22850.Field_129;
        boolean bl2 = this.Method_22974();
        Class_16867.Method_16979();
        this.Field_22850.Field_25.Method_2783("clear");
        if (bl) {
            Class_12440.Method_12870(25098 & -31439, 1476 & 21016, this.Field_22850.Field_80, this.Field_22850.Field_44);
        } else {
            Class_16867.Method_16910(1418 & 576, -20224 & 19552, this.Field_22850.Field_80, this.Field_22850.Field_44);
        }
        this.Method_22990(f);
        if (this.Field_22850.Field_51 > 0) {
            Class_16867.Method_16983(258 & -15920);
            this.Field_22850.Field_51 -= -30059 & 28675;
        } else {
            Class_16867.Method_16983(22328 & -7803);
        }
        if (bl) {
            Class_12440.Method_12812();
        }
        this.Field_22850.Field_25.Method_2783("camera");
        if (n == 0 || n == (4114 & 16451)) {
            this.Method_22988();
        }
        this.Method_22949(f, n);
        if (bl) {
            Class_12440.Method_12742(f);
        }
        Class_41473.Method_41487(this.Field_22850.Field_48, (this.Field_22850.Field_84.Field_39802 == (11011 & 1250) ? 15873 & 319 : 2073 & 4544) != 0, f);
        this.Field_22850.Field_25.Method_2783("frustum");
        Class_42892.Method_42897();
        this.Field_22850.Field_25.Method_2783("culling");
        Class_34375 class_34375 = new Class_34375();
        Class_1061 class_1061 = this.Field_22850.Method_246();
        double d = class_1061.Field_1126 + (class_1061.Field_1130 - class_1061.Field_1126) * (double)f;
        double d2 = class_1061.Field_1102 + (class_1061.Method_1324() - class_1061.Field_1102) * (double)f;
        double d3 = class_1061.Field_1125 + (class_1061.Field_1106 - class_1061.Field_1125) * (double)f;
        if (bl) {
            Class_25377.Method_25392(class_34375, d, d2, d3);
        } else {
            class_34375.Method_34387(d, d2, d3);
        }
        if ((Class_19426.Method_19589() || Class_19426.Method_19485() || Class_19426.Method_19591()) && !Class_12440.Field_12441) {
            this.Method_22931(-1 & -1, f);
            this.Field_22850.Field_25.Method_2783("sky");
            Class_16867.Method_16934(-26861 & 5893);
            Class_16867.Method_16962();
            Project.gluPerspective((float)this.Method_22959(f, (-13727 & 4237) != 0), (float)((float)this.Field_22850.Field_80 / (float)this.Field_22850.Field_44), (float)(0.013218391f * 3.7826087f), (float)this.Field_22903);
            Class_16867.Method_16934(7955 & 30540);
            if (bl) {
                Class_12440.Method_12778();
            }
            class_24997.Method_25149(f, n);
            if (bl) {
                Class_12440.Method_12729();
            }
            Class_16867.Method_16934(7957 & -10463);
            Class_16867.Method_16962();
            Project.gluPerspective((float)this.Method_22959(f, (65 & -23237) != 0), (float)((float)this.Field_22850.Field_80 / (float)this.Field_22850.Field_44), (float)(0.71428573f * 0.07f), (float)this.Field_22903);
            Class_16867.Method_16934(-16568 & 5888);
        } else {
            Class_16867.Method_16952();
        }
        this.Method_22931(-32509 & 10756, f);
        Class_16867.Method_16972(7425 & 15617);
        if (class_1061.Method_1324() + (double)class_1061.Method_1357() < 0.275 * 465.45454545454544 + (double)(this.Field_22850.Field_84.Field_39730 * (1.0105263f * 126.66667f))) {
            this.Method_22932(class_24997, f, n);
        }
        this.Field_22850.Field_25.Method_2783("prepareterrain");
        this.Method_22931(1804 & 28672, f);
        this.Field_22850.Method_253().Method_34707(Class_24069.Field_24084);
        Class_39477.Method_39484();
        this.Field_22850.Field_25.Method_2783("terrain_setup");
        if (bl) {
            int n2 = this.Field_22923;
            this.Field_22923 = n2 + (1221 & -28159);
            Class_25377.Method_25395(class_24997, class_1061, f, class_34375, n2, this.Field_22850.Field_48.\u0000c_());
        } else {
            int n3 = this.Field_22923;
            this.Field_22923 = n3 + (28709 & 3731);
            class_24997.Method_25093(class_1061, f, class_34375, n3, this.Field_22850.Field_48.\u0000c_());
        }
        if (n == 0 || n == (10323 & 16770)) {
            this.Field_22850.Field_25.Method_2783("updatechunks");
            Class_9967.Field_9973.Method_35684();
            this.Field_22850.Field_33.Method_25137(l);
            Class_9967.Field_9973.Method_35682();
        }
        this.Field_22850.Field_25.Method_2783("terrain");
        Class_9967.Field_9972.Method_35684();
        if (this.Field_22850.Field_84.Field_39725 && n > 0) {
            GL11.glFinish();
        }
        Class_16867.Method_16934(8048 & 6021);
        Class_16867.Method_16961();
        long l2 = System.nanoTime();
        long l3 = l2 - class_24997.Field_25066;
        if (!((Boolean)this.Field_22850.Field_84.Field_39732.Field_8887.\u0000strictfp()).booleanValue() || l3 > (7653731789949174816L & -7653731790432882674L) && l3 < (804874049L & 6324447984452710278L)) {
            Class_15030.Field_15035 = -3196806799973703648L & 3196806798514865415L;
            class_24997.Field_25078 = -30143 & 8341;
        } else {
            Class_15030.Field_15035 = l2;
        }
        Class_16867.Method_16985();
        if (bl) {
            Class_25377.Method_25399();
        }
        class_24997.Method_25099(Class_17531.Field_17532, f, n, class_1061);
        Class_16867.Method_16913();
        if (bl) {
            Class_25377.Method_25400();
        }
        class_24997.Method_25099(Class_17531.Field_17539, f, n, class_1061);
        this.Field_22850.Method_253().Method_34709(Class_24069.Field_24084).Method_2065((1071 & -14256) != 0, (-32244 & 18464) != 0);
        if (bl) {
            Class_25377.Method_25393();
        }
        class_24997.Method_25099(Class_17531.Field_17538, f, n, class_1061);
        this.Field_22850.Method_253().Method_34709(Class_24069.Field_24084).Method_2067();
        if (bl) {
            Class_25377.Method_25380();
        }
        Class_9967.Field_9972.Method_35682();
        Class_16867.Method_16972(7587 & 15616);
        Class_16867.Method_16967(516 & -22780, 0.009677419f * 10.333333f);
        if (!this.Field_22862) {
            Class_16867.Method_16934(5888 & -10460);
            Class_16867.Method_16945();
            Class_16867.Method_16961();
            Class_39477.Method_39482();
            this.Field_22850.Field_25.Method_2783("entities");
            class_24997.Method_25112(class_1061, class_34375, f);
            Class_39477.Method_39484();
            this.Method_22979();
            Class_16867.Method_16934(7976 & -18543);
            Class_16867.Method_16945();
            Class_16867.Method_16961();
            if (this.Field_22850.Field_57 != null && class_1061.Method_1336(Class_3713.Field_3734) && bl2) {
                class_626 = (Class_626)class_1061;
                this.Field_22850.Field_25.Method_2783("outline");
                if (!this.Field_22850.Field_84.Field_39731) {
                    if (Class_19426.Method_19570()) {
                        Class_25377.Method_25401();
                    }
                    this.Field_22850.Method_253().Method_34707(Class_24069.Field_24084);
                    class_24997.Method_25136(class_626, this.Field_22850.Field_57, -6144 & 776, f);
                    if (Class_19426.Method_19570()) {
                        Class_25377.Method_25387();
                    }
                }
            }
        }
        Class_16867.Method_16934(22404 & 14104);
        Class_16867.Method_16945();
        if (bl2 && this.Field_22850.Field_57 != null && !class_1061.Method_1336(Class_3713.Field_3734)) {
            class_626 = (Class_626)class_1061;
            this.Field_22850.Field_25.Method_2783("outline");
            if (!this.Field_22850.Field_84.Field_39731) {
                if (Class_19426.Method_19570()) {
                    Class_25377.Method_25401();
                }
                this.Field_22850.Method_253().Method_34707(Class_24069.Field_24084);
                class_24997.Method_25136(class_626, this.Field_22850.Field_57, 390 & -29096, f);
                if (Class_19426.Method_19570()) {
                    Class_25377.Method_25387();
                }
            }
        }
        this.Field_22850.Field_25.Method_2783("destroyProgress");
        Class_16867.Method_16947();
        Class_16867.Method_16984(25410 & 770, 16503 & 8321, 29 & 11393, 26660 & 4616);
        this.Field_22850.Method_253().Method_34709(Class_24069.Field_24084).Method_2065((650 & 8192) != 0, (16384 & 1310) != 0);
        class_24997.Method_25107(Class_7644.Method_7649(), Class_7644.Method_7649().Method_7648(), class_1061, f);
        this.Field_22850.Method_253().Method_34709(Class_24069.Field_24084).Method_2067();
        Class_16867.Method_16952();
        if (!this.Field_22862) {
            this.Method_22976();
            this.Field_22850.Field_25.Method_2783("litParticles");
            if (bl) {
                Class_12440.Method_12878();
            }
            class_27551.Method_27578(class_1061, f);
            Class_39477.Method_39484();
            this.Method_22931(17065 & 12370, f);
            this.Field_22850.Field_25.Method_2783("particles");
            if (bl) {
                Class_12440.Method_12899();
            }
            class_27551.Method_27575(class_1061, f);
            if (bl) {
                Class_12440.Method_12743();
            }
            this.Method_22979();
        }
        Class_16867.Method_16930((4240 & -32509) != 0);
        Class_16867.Method_16979();
        this.Field_22850.Field_25.Method_2783("weather");
        if (bl) {
            Class_12440.Method_12744();
        }
        this.Method_22977(f);
        if (bl) {
            Class_12440.Method_12926();
        }
        Class_16867.Method_16930((27 & 8769) != 0);
        class_24997.Method_25088(class_1061, f);
        if (bl) {
            Class_25377.Method_25386(this, f, n);
            Class_12440.Method_12719();
        }
        Class_16867.Method_16952();
        Class_16867.Method_16979();
        Class_16867.Method_16984(814 & 3906, 21391 & -22765, 4737 & 67, 18440 & 4545);
        Class_16867.Method_16967(8710 & 17348, 0.12195122f * 0.82f);
        this.Method_22931(7208 & 130, f);
        Class_16867.Method_16947();
        Class_16867.Method_16930((-14308 & 4098) != 0);
        this.Field_22850.Method_253().Method_34707(Class_24069.Field_24084);
        Class_16867.Method_16972(7505 & 23939);
        this.Field_22850.Field_25.Method_2783("translucent");
        if (bl) {
            Class_12440.Method_12739();
        }
        class_24997.Method_25099(Class_17531.Field_17537, f, n, class_1061);
        if (bl) {
            Class_12440.Method_12982();
        }
        Class_16867.Method_16972(7936 & 32129);
        Class_16867.Method_16930((-15869 & 385) != 0);
        Class_16867.Method_16979();
        Class_16867.Method_16952();
        Class_16867.Method_16954();
        if (class_1061.Method_1324() + (double)class_1061.Method_1357() >= 131.3684210526316 * 0.9743589743589743 + (double)(this.Field_22850.Field_84.Field_39730 * (2.5f * 51.2f))) {
            this.Field_22850.Field_25.Method_2783("aboveClouds");
            this.Method_22932(class_24997, f, n);
        }
        this.Field_22850.Field_25.Method_2783("hand");
        if (this.Field_22888 && !Class_12440.Field_12441) {
            if (bl) {
                Class_25377.Method_25381(this, f, n);
                Class_12440.Method_12987();
            }
            Class_16867.Method_16983(-32316 & 6411);
            if (bl) {
                Class_25377.Method_25388(this, f, n);
            } else {
                this.Method_22933(f, n);
            }
            this.Method_22993(f);
        }
        if (bl) {
            Class_12440.Method_12965();
        }
    }

    private void Method_22993(float f) {
        if (this.Field_22850.Field_84.Field_39781 && !this.Field_22850.Field_84.Field_39731 && !this.Field_22850.Field_48.\u0000= instanceof() && !this.Field_22850.Field_84.Field_39879) {
            Class_1061 class_1061 = this.Field_22850.Method_246();
            Class_16867.Method_16947();
            Class_16867.Method_16984(1874 & -15614, 13067 & 787, 16531 & 1025, 5157 & 576);
            GL11.glLineWidth((float)1.0f);
            Class_16867.Method_16922();
            Class_16867.Method_16930((-14316 & 1152) != 0);
            Class_16867.Method_16961();
            Class_16867.Method_16934(14280 & -26880);
            Class_16867.Method_16962();
            this.Method_22972(f);
            Class_16867.Method_16943(0.0f, class_1061.Method_1289(f), 0.0f);
            Class_24997.Method_25139(new Class_10997(0.0, 0.0, 0.0, 0.004919354838709677 * 1.0163934426229508, 2.1111111111111113E-4 * 0.47368421052631576, 1.6129032258064516E-6 * 62.0), 12543 & 20223, 18444 & 4096, -24512 & 23687, -24321 & 21503);
            Class_24997.Method_25139(new Class_10997(0.0, 0.0, 0.0, 1.5217391304347827 * 6.571428571428571E-5, 1.666666666666667E-4 * 0.6, 0.0575 * 0.08695652173913043), -32764 & 161, 16384 & 0, 5375 & 27647, -32513 & 767);
            Class_24997.Method_25139(new Class_10997(0.0, 0.0, 0.0, 0.6363636363636364 * 1.5714285714285716E-4, 0.02702702702702703 * 0.12209999999999999, 8.333333333333334E-5 * 1.2), 900 & -32696, 16895 & 4863, 816 & 6221, 17663 & 4351);
            Class_16867.Method_16945();
            Class_16867.Method_16930((-26607 & 24879) != 0);
            Class_16867.Method_16965();
            Class_16867.Method_16952();
        }
    }

    private static String Method_22994(String string) {
        int n = 31903;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_22849.class, 19);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_22995(String string) {
        int n = 22948;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_22849.class, 23);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_22996(float f) {
        if (this.Field_22889) {
            this.Field_22850.Field_25.Method_2789("lightTex");
            Class_570 class_570 = this.Field_22850.Field_72;
            if (class_570 != null) {
                if (Class_10125.Method_10160(class_570, this.Field_22874, this.Field_22858, this.Field_22850.Field_48.\u0000strictfp(Class_8338.Field_8356))) {
                    this.Field_22910.Method_47635();
                    this.Field_22889 = 2528 & 16922;
                    this.Field_22850.Field_25.Method_2790();
                    return;
                }
                float f2 = class_570.\u0000strictfp(1.0f);
                float f3 = f2 * (4.9473686f * 0.19202127f) + 0.285f * 0.1754386f;
                for (int i = 11602 & 4; i < (16688 & 1415); ++i) {
                    float f4;
                    float f5;
                    float f6 = class_570.\u0000strictfp.Method_18375()[i / (209 & -5584)] * f3;
                    float f7 = class_570.\u0000strictfp.Method_18375()[i % (-22512 & 209)] * (this.Field_22874 * (0.003896104f * 25.666666f) + 0.44594595f * 3.3636363f);
                    if (class_570.\u0000
                    () > 0) {
                        f6 = class_570.\u0000strictfp.Method_18375()[i / (-28400 & 2265)];
                    }
                    float f8 = f6 * (f2 * (1.2428571f * 0.5229885f) + 0.34210527f * 1.0230769f);
                    float f9 = f6 * (f2 * (0.027659573f * 23.5f) + 0.7910448f * 0.44245282f);
                    float f10 = f7 * ((f7 * (0.1f * 6.0f) + 2.6f * 0.15384616f) * (0.74545455f * 0.80487806f) + 0.35555556f * 1.125f);
                    float f11 = f7 * (f7 * f7 * (0.5433963f * 1.1041666f) + 0.29032257f * 1.3777778f);
                    float f12 = f8 + f7;
                    float f13 = f9 + f10;
                    float f14 = f6 + f11;
                    f12 = f12 * (1.3863636f * 0.692459f) + 0.03f * 1.0f;
                    f13 = f13 * (0.22441559f * 4.2777777f) + 1.2f * 0.024999999f;
                    f14 = f14 * (0.31958762f * 3.003871f) + 0.030394737f * 0.987013f;
                    if (this.Field_22893 > 0.0f) {
                        f5 = this.Field_22916 + (this.Field_22893 - this.Field_22916) * f;
                        f12 = f12 * (1.0f - f5) + f12 * (1.2957448f * 0.54022986f) * f5;
                        f13 = f13 * (1.0f - f5) + f13 * (98.0f * 0.0061224494f) * f5;
                        f14 = f14 * (1.0f - f5) + f14 * (0.27272728f * 2.2f) * f5;
                    }
                    if (class_570.\u0000strictfp.Method_18379() == (24741 & 275)) {
                        f12 = 2.0454545f * 0.10755556f + f7 * (0.3f * 2.5f);
                        f13 = 1.125f * 0.2488889f + f10 * (0.92537314f * 0.8104839f);
                        f14 = 0.33035713f * 0.7567568f + f11 * (0.4090909f * 1.8333334f);
                    }
                    if (this.Field_22850.Field_48.\u0000strictfp(Class_8338.Field_8356)) {
                        f5 = this.Method_22981(this.Field_22850.Field_48, f);
                        f4 = 1.0f / f12;
                        if (f4 > 1.0f / f13) {
                            f4 = 1.0f / f13;
                        }
                        if (f4 > 1.0f / f14) {
                            f4 = 1.0f / f14;
                        }
                        f12 = f12 * (1.0f - f5) + f12 * f4 * f5;
                        f13 = f13 * (1.0f - f5) + f13 * f4 * f5;
                        f14 = f14 * (1.0f - f5) + f14 * f4 * f5;
                    }
                    if (f12 > 1.0f) {
                        f12 = 1.0f;
                    }
                    if (f13 > 1.0f) {
                        f13 = 1.0f;
                    }
                    if (f14 > 1.0f) {
                        f14 = 1.0f;
                    }
                    f5 = this.Field_22850.Field_84.Field_39869;
                    f4 = 1.0f - f12;
                    float f15 = 1.0f - f13;
                    float f16 = 1.0f - f14;
                    f4 = 1.0f - f4 * f4 * f4 * f4;
                    f15 = 1.0f - f15 * f15 * f15 * f15;
                    f16 = 1.0f - f16 * f16 * f16 * f16;
                    f12 = f12 * (1.0f - f5) + f4 * f5;
                    f13 = f13 * (1.0f - f5) + f15 * f5;
                    f14 = f14 * (1.0f - f5) + f16 * f5;
                    f12 = f12 * (1.1372308f * 0.84415585f) + 0.18666667f * 0.16071428f;
                    f13 = f13 * (0.06521739f * 14.72f) + 0.66f * 0.045454543f;
                    f14 = f14 * (3.5217392f * 0.27259257f) + 0.051282052f * 0.585f;
                    if (f12 > 1.0f) {
                        f12 = 1.0f;
                    }
                    if (f13 > 1.0f) {
                        f13 = 1.0f;
                    }
                    if (f14 > 1.0f) {
                        f14 = 1.0f;
                    }
                    if (f12 < 0.0f) {
                        f12 = 0.0f;
                    }
                    if (f13 < 0.0f) {
                        f13 = 0.0f;
                    }
                    if (f14 < 0.0f) {
                        f14 = 0.0f;
                    }
                    int n = 16895 & -32001;
                    int n2 = (int)(f12 * (997.82605f * 0.25555557f));
                    int n3 = (int)(f13 * (1343.0f * 0.18987341f));
                    int n4 = (int)(f14 * (2.7894738f * 91.41509f));
                    this.Field_22858[i] = n << (16665 & -25064) | n2 << (2233 & -8176) | n3 << (8 & 18472) | n4;
                }
                this.Field_22910.Method_47635();
                this.Field_22889 = 18444 & 13394;
            }
            this.Field_22850.Field_25.Method_2790();
        }
    }
}

