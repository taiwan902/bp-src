/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  internal.org.lwjgl.opengl.GL11
 */
import internal.org.lwjgl.opengl.GL11;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_6918 {
    private float Field_6919;
    private final Class_44252 Field_6920;
    private static final Class_2080 Field_6921;
    private Class_23823 Field_6922;
    private final Class_8491 Field_6923;
    private float Field_6924;
    private final Class_18 Field_6925;
    private int Field_6926 = -1 & -1;
    private static final Class_2080 Field_6927;

    public void Method_6928() {
        this.Method_6933();
    }

    public Class_6918(Class_18 class_18) {
        this.Field_6925 = class_18;
        this.Field_6923 = class_18.Method_266();
        this.Field_6920 = class_18.Method_270();
    }

    public void Method_6929() {
        this.Field_6924 = 0.0f;
    }

    private void Method_6930(Class_32090 class_32090) {
        Class_16867.Method_16961();
        Class_16867.Method_16940(8.363636f * 11.0f, 0.0f, 1.0f, 0.0f);
        Class_16867.Method_16940(3.107143f * 14.4827585f, 1.0f, 0.0f, 0.0f);
        Class_16867.Method_16940(111.28571f * 0.36842105f, 0.0f, 0.0f, 1.0f);
        Class_16867.Method_16943(0.8181818f * -0.36666667f, -1.8027779f * 0.6101695f, 1.4230769f * 0.31621623f);
        class_32090.Method_32109(this.Field_6925.Field_48, 0.0f);
        Class_16867.Method_16945();
    }

    static {
        Field_6927 = new Class_2080(Class_6918.Method_6952("\u2545\u2554\u2549\u2545\u2544\u2543\u2554\u2542\u251e\u255c\u2550\u2541\u251e\u255c\u2550\u2541\u254e\u2553\u2550\u2552\u255a\u2556\u2543\u255e\u2544\u255f\u2555\u251f\u2541\u255f\u2556"));
        Field_6921 = new Class_2080(Class_6918.Method_6945("\u0a11\u0a00\u0a19\u0a11\u0a14\u0a15\u0a04\u0a14\u0a48\u0a08\u0a08\u0a10\u0a04\u0a4c\u0a14\u0a0d\u0a01\u0a00\u0a11\u0a10\u0a04\u0a15\u0a04\u0a15\u0a49\u0a11\u0a09\u0a00"));
    }

    private void Method_6931(float f, float f2) {
        Class_16867.Method_16961();
        Class_16867.Method_16940(f, 1.0f, 0.0f, 0.0f);
        Class_16867.Method_16940(f2, 0.0f, 1.0f, 0.0f);
        Class_39477.Method_39482();
        Class_16867.Method_16945();
    }

    private void Method_6932(Class_1456 class_1456) {
        this.Field_6925.Method_253().Method_34707(class_1456.Method_1471());
        Class_27380 class_27380 = this.Field_6923.Method_8516(this.Field_6925.Field_48);
        Class_32090 class_32090 = (Class_32090)class_27380;
        if (!class_1456.\u0000= ?()) {
            Class_16867.Method_16969();
            this.Method_6948(class_32090);
            this.Method_6930(class_32090);
            Class_16867.Method_16979();
        }
    }

    public void Method_6933() {
        float f;
        int n;
        float f2;
        float f3;
        this.Field_6919 = this.Field_6924;
        Class_1378 class_1378 = this.Field_6925.Field_48;
        Class_23823 class_23823 = class_1378.Field_628.Method_37821();
        int n2 = n = this.Field_6926 == class_1378.Field_628.Field_37782 && class_23823 == this.Field_6922 ? -30603 & 257 : 5124 & -30160;
        if (this.Field_6922 == null && class_23823 == null) {
            n = -24447 & 2061;
        }
        if (class_23823 != null && this.Field_6922 != null && class_23823 != this.Field_6922 && class_23823.Method_23844() == this.Field_6922.Method_23844() && class_23823.Method_23853() == this.Field_6922.Method_23853()) {
            this.Field_6922 = class_23823;
            n = 8193 & 5579;
        }
        if ((f = (f3 = n != 0 ? 1.0f : 0.0f) - this.Field_6924) < -(f2 = 0.63f * 0.63492066f)) {
            f = -f2;
        }
        if (f > f2) {
            f = f2;
        }
        this.Field_6924 += f;
        if (this.Field_6924 < 0.23076923f * 0.43333334f) {
            if (Class_19426.Method_19570()) {
                Class_12440.Method_12792(class_23823);
            }
            this.Field_6922 = class_23823;
            this.Field_6926 = class_1378.Field_628.Field_37782;
        }
    }

    private void Method_6934(float f) {
        Class_7644 class_7644 = Class_7644.Method_7649();
        Class_22385 class_22385 = class_7644.Method_7648();
        Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 1.2173913f * 0.7392857f);
        Class_16867.Method_16936(26183 & 2735);
        Class_16867.Method_16930((-23420 & 2058) != 0);
        Class_16867.Method_16947();
        Class_16867.Method_16984(803 & 986, 17271 & -23805, -31991 & 71, -12215 & 784);
        float f2 = 1.0f;
        for (int i = 16681 & 2112; i < (17930 & 6); ++i) {
            Class_16867.Method_16961();
            Class_11372 class_11372 = this.Field_6925.Method_189().Method_24109("minecraft:blocks/fire_layer_1");
            this.Field_6925.Method_253().Method_34707(Class_24069.Field_24084);
            float f3 = class_11372.Method_11420();
            float f4 = class_11372.Method_11444();
            float f5 = class_11372.Method_11437();
            float f6 = class_11372.Method_11429();
            float f7 = (0.0f - f2) / 2.0f;
            float f8 = f7 + f2;
            float f9 = 0.0f - f2 / 2.0f;
            float f10 = f9 + f2;
            float f11 = 96.0f * -0.0052083335f;
            Class_16867.Method_16943((float)(-(i * (8226 & 1034) - (16443 & 7425))) * (1.2777778f * 0.18782608f), 1.0806452f * -0.27761194f, 0.0f);
            Class_16867.Method_16940((float)(i * (814 & 21651) - (-32597 & 2113)) * (0.47252747f * 21.16279f), 0.0f, 1.0f, 0.0f);
            class_22385.Method_22417(3527 & -32761, Class_29585.Field_29598);
            class_22385.Method_22443(f7, f9, f11).Method_22433(f4, f6).Method_22451();
            class_22385.Method_22443(f8, f9, f11).Method_22433(f3, f6).Method_22451();
            class_22385.Method_22443(f8, f10, f11).Method_22433(f3, f5).Method_22451();
            class_22385.Method_22443(f7, f10, f11).Method_22433(f4, f5).Method_22451();
            class_7644.Method_7647();
            Class_16867.Method_16945();
        }
        Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 1.0f);
        Class_16867.Method_16952();
        Class_16867.Method_16930((20359 & 65) != 0);
        Class_16867.Method_16936(4611 & 27279);
    }

    private void Method_6935(float f) {
        float f2 = -1.52f * 0.2631579f * Class_13337.Method_13370(Class_13337.Method_13388(f) * (3.9560797f * 0.7941176f));
        float f3 = 0.10989011f * 1.82f * Class_13337.Method_13370(Class_13337.Method_13388(f) * (0.6904762f * 4.549893f) * 2.0f);
        float f4 = -0.712f * 0.28089887f * Class_13337.Method_13370(f * (4.5553093f * 0.6896552f));
        Class_16867.Method_16943(f2, f3, f4);
    }

    private void Method_6936(float f, float f2) {
        if (this.Field_6925 != null && ((Boolean)this.Field_6925.Field_84.Field_39732.Field_8883.\u0000strictfp()).booleanValue() && this.Field_6925.Field_48 != null && this.Field_6925.Field_48.\u0000, `() != null && this.Field_6925.Field_48.\u0000, `().Method_23844() != null && Class_1956.Method_1986(this.Field_6925.Field_48.\u0000, `().Method_23844()) == (-23163 & 4429)) {
            Class_16867.Method_16943(-0.0144262295f * 0.6931818f, 0.026530612f * 1.8846154f, 0.8f * -0.074999996f);
        }
        if (this.Field_6925 != null && ((Boolean)this.Field_6925.Field_84.Field_39732.Field_8880.\u0000strictfp()).booleanValue() && this.Field_6925.Field_48 != null && this.Field_6925.Field_48.\u0000= final() != null && this.Field_6925.Field_48.\u0000= final().Method_23844() != null && Class_1956.Method_1986(this.Field_6925.Field_48.\u0000= final().Method_23844()) == (862 & 4571)) {
            Class_16867.Method_16943(0.061666667f * 1.2972972f, 0.9508197f * -0.028396552f, 0.11111111f * -2.97f);
            Class_16867.Method_16973(0.9796f * 0.9493671f, 1.0f, 1.0f);
        }
        if (this.Field_6925 != null && ((Boolean)this.Field_6925.Field_84.Field_39732.Field_8880.\u0000strictfp()).booleanValue() && this.Field_6925.Field_48 != null && this.Field_6925.Field_48.\u0000= final() != null && this.Field_6925.Field_48.\u0000= final().Method_23844() != null && Class_1956.Method_1986(this.Field_6925.Field_48.\u0000= final().Method_23844()) == (926 & -5682)) {
            Class_16867.Method_16943(2.2571428f * 0.035443038f, -0.0581087f * 0.46464646f, 1.75f * -0.18857144f);
            Class_16867.Method_16973(3.3076923f * 0.2811628f, 1.0f, 1.0f);
        }
        if (this.Field_6925 != null && ((Boolean)this.Field_6925.Field_84.Field_39732.Field_8876.\u0000strictfp()).booleanValue() && this.Field_6925.Field_48 != null && this.Field_6925.Field_48.\u0000break && this.Field_6925.Field_48.\u0000= final() != null && !this.Field_6925.Field_48.\u0000= static() && !this.Field_6925.Field_48.\u0000= #()) {
            Class_16867.Method_16973(0.65217394f * 1.3033333f, 1.0103774f * 0.84126985f, 1.0232558f * 0.83068186f);
            Class_16867.Method_16943(1.372549f * -0.05682857f, 2.0f * 0.0015f, 0.11627907f * 0.43f);
        }
        Class_16867.Method_16943(0.56f * 1.0f, -0.31594935f * 1.6458334f, -0.6942857f * 1.037037f);
        Class_16867.Method_16943(0.0f, f * (-0.76438355f * 0.78494626f), 0.0f);
        Class_16867.Method_16940(6.714286f * 6.7021275f, 0.0f, 1.0f, 0.0f);
        float f3 = Class_13337.Method_13370(f2 * f2 * (7.888889f * 0.39823008f));
        float f4 = Class_13337.Method_13370(Class_13337.Method_13388(f2) * (42.411503f * 0.074074075f));
        Class_16867.Method_16940(f3 * (-6.349206f * 3.15f), 0.0f, 1.0f, 0.0f);
        Class_16867.Method_16940(f4 * (0.41025642f * -48.75f), 0.0f, 0.0f, 1.0f);
        Class_16867.Method_16940(f4 * (0.6043956f * -132.36363f), 1.0f, 0.0f, 0.0f);
        Class_16867.Method_16973(5.647059f * 0.07083333f, 1.0f * 0.4f, 0.2238806f * 1.7866666f);
    }

    private void Method_6937() {
        Class_16867.Method_16943(0.071428575f * -6.9999995f, 3.1818182f * 0.06285714f, 0.0f);
        Class_16867.Method_16940(0.17391305f * 172.5f, 0.0f, 1.0f, 0.0f);
        Class_16867.Method_16940(-39.466663f * 2.0270271f, 1.0f, 0.0f, 0.0f);
        Class_16867.Method_16940(1.7692307f * 33.913044f, 0.0f, 1.0f, 0.0f);
    }

    private void Method_6938(Class_1456 class_1456) {
        int n = this.Field_6925.Field_72.\u0000strictfp(class_1456.\u0000= package, class_1456.\u0000, for() + (double)class_1456.\u0000, for(), class_1456.\u0000= switch, 8264 & -28544);
        float f = n & (-1038548993 & 201392127);
        float f2 = n >> (13084 & 16);
        Class_32876.Method_32943(Class_32876.Field_32911, f, f2);
    }

    public void Method_6939() {
        this.Field_6924 = 0.0f;
    }

    private void Method_6940(Class_1456 class_1456, float f, float f2, float f3) {
        float f4 = 1.6304348f * -0.18400002f * Class_13337.Method_13370(Class_13337.Method_13388(f2) * (1.7889625f * 1.7560976f));
        float f5 = 0.9714286f * 0.4117647f * Class_13337.Method_13370(Class_13337.Method_13388(f2) * (1.3089969f * 2.4f) * 2.0f);
        float f6 = -2.95f * 0.13559322f * Class_13337.Method_13370(f2 * (4.168652f * 0.7536232f));
        Class_16867.Method_16943(f4, f5, f6);
        Class_16867.Method_16943(2.48f * 0.25806454f, -11.25f * 0.053333335f, 0.02173913f * -33.12f);
        Class_16867.Method_16943(0.0f, f * (0.9310345f * -0.64444447f), 0.0f);
        Class_16867.Method_16940(0.08f * 562.5f, 0.0f, 1.0f, 0.0f);
        float f7 = Class_13337.Method_13370(f2 * f2 * (17.6f * 0.17849958f));
        float f8 = Class_13337.Method_13370(Class_13337.Method_13388(f2) * (1.9860643f * 1.5818182f));
        Class_16867.Method_16940(f8 * (247.69232f * 0.2826087f), 0.0f, 1.0f, 0.0f);
        Class_16867.Method_16940(f7 * (0.29166666f * -68.571434f), 0.0f, 0.0f, 1.0f);
        this.Field_6925.Method_253().Method_34707(class_1456.Method_1471());
        Class_16867.Method_16943(0.75f * -1.3333334f, 2.0181818f * 1.7837838f, 8.6f * 0.40697673f);
        Class_16867.Method_16940(17.142857f * 7.0f, 0.0f, 0.0f, 1.0f);
        Class_16867.Method_16940(75.0f * 2.6666667f, 1.0f, 0.0f, 0.0f);
        Class_16867.Method_16940(1.8163265f * -74.32584f, 0.0f, 1.0f, 0.0f);
        Class_16867.Method_16973(1.0f, 1.0f, 1.0f);
        Class_16867.Method_16943(5.6f * 1.0f, 0.0f, 0.0f);
        Class_27380 class_27380 = this.Field_6923.Method_8516(this.Field_6925.Field_48);
        Class_16867.Method_16969();
        Class_32090 class_32090 = (Class_32090)class_27380;
        class_32090.Method_32107(this.Field_6925.Field_48, f3);
        Class_16867.Method_16979();
    }

    private void Method_6941() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private void Method_6942(float f, Class_1456 class_1456) {
        Class_16867.Method_16940(1.7234043f * -10.444445f, 0.0f, 0.0f, 1.0f);
        Class_16867.Method_16940(-3.6923077f * 3.25f, 0.0f, 1.0f, 0.0f);
        Class_16867.Method_16940(-14.044444f * 0.56962025f, 1.0f, 0.0f, 0.0f);
        Class_16867.Method_16943(0.7282609f * -1.2358209f, 1.296875f * 0.15421687f, 0.0f);
        float f2 = (float)this.Field_6922.Method_23861() - ((float)class_1456.\u0000strictfp() - f + 1.0f);
        float f3 = f2 / (20.615383f * 0.9701493f);
        f3 = (f3 * f3 + f3 * 2.0f) / (2.148148f * 1.3965517f);
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        if (f3 > 0.067857146f * 1.4736842f) {
            float f4 = Class_13337.Method_13370((f2 - 0.10879121f * 0.9191919f) * (0.41666666f * 3.12f));
            float f5 = f3 - 0.5507246f * 0.18157895f;
            float f6 = f4 * f5;
            Class_16867.Method_16943(f6 * 0.0f, f6 * (0.92941177f * 0.010759493f), f6 * 0.0f);
        }
        Class_16867.Method_16943(f3 * 0.0f, f3 * 0.0f, f3 * (1.1470588f * 0.08717949f));
        Class_16867.Method_16973(1.0f, 1.0f, 1.0f + f3 * (0.03773585f * 5.3f));
    }

    private void Method_6943(float f) {
        if (!Class_19426.Method_19570() || Class_12440.Method_12921()) {
            this.Field_6925.Method_253().Method_34707(Field_6921);
            Class_7644 class_7644 = Class_7644.Method_7649();
            Class_22385 class_22385 = class_7644.Method_7648();
            float f2 = this.Field_6925.Field_48.\u0000strictfp(f);
            Class_16867.Method_16924(f2, f2, f2, 0.1969697f * 2.5384614f);
            Class_16867.Method_16947();
            Class_16867.Method_16984(-31998 & 26583, 967 & 827, -30463 & 149, 404 & -7128);
            Class_16867.Method_16961();
            float f3 = -this.Field_6925.Field_48.\u0000= ? / (4.2352943f * 15.111111f);
            float f4 = this.Field_6925.Field_48.\u0000= float / (0.37634408f * 170.05714f);
            class_22385.Method_22417(4719 & 1047, Class_29585.Field_29598);
            class_22385.Method_22443(-2.8285714285714287 * 0.35353535353535354, -1.5384615384615383 * 0.65, -0.45454545454545453 * 1.1).Method_22433(2.7333333f * 1.4634147f + f3, 0.21875f * 18.285715f + f4).Method_22451();
            class_22385.Method_22443(1.0, -20.25 * 0.04938271604938271, 1.054054054054054 * -0.4743589743589744).Method_22433(0.0f + f3, 2.857143f * 1.4f + f4).Method_22451();
            class_22385.Method_22443(1.0, 1.0, -0.15 * 3.3333333333333335).Method_22433(0.0f + f3, 0.0f + f4).Method_22451();
            class_22385.Method_22443(-1.75 * 0.5714285714285714, 1.0, 1.5294117647058822 * -0.3269230769230769).Method_22433(1.24f * 3.2258065f + f3, 0.0f + f4).Method_22451();
            class_7644.Method_7647();
            Class_16867.Method_16945();
            Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 1.0f);
            Class_16867.Method_16952();
        }
    }

    private boolean Method_6944(Class_3238 class_3238) {
        return (class_3238 != null && class_3238.Method_3286() == Class_17531.Field_17537 ? 9257 & 257 : 9368 & 16386) != 0;
    }

    private static String Method_6945(String string) {
        int n = 32155;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_6918.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_6946(float f) {
        Class_16867.Method_16985();
        if (this.Field_6925.Field_48.\u0000+()) {
            Class_3436 class_3436 = this.Field_6925.Field_72.\u0000strictfp(new Class_4751(this.Field_6925.Field_48));
            Class_1378 class_1378 = this.Field_6925.Field_48;
            for (int i = 4397 & 2626; i < (14492 & 42); ++i) {
                double d = class_1378.\u0000= package + (double)(((float)((i >> (8192 & 16649)) % (8198 & 21219)) - 0.53521127f * 0.93421054f) * class_1378.\u0000= int() * (0.427907f * 1.8695652f));
                double d2 = class_1378.\u0000, for() + (double)(((float)((i >> (28681 & 743)) % (1298 & 2563)) - 0.5697674f * 0.8775511f) * (0.7631579f * 0.13103448f));
                double d3 = class_1378.\u0000= switch + (double)(((float)((i >> (518 & 25699)) % (3347 & -7670)) - 0.47540984f * 1.0517242f) * class_1378.\u0000= int() * (1.4109092f * 0.5670103f));
                Class_4751 class_4751 = new Class_4751(d, d2 + (double)class_1378.Method_837(), d3);
                Class_3436 class_34362 = this.Field_6925.Field_72.\u0000strictfp(class_4751);
                if (!class_34362.Method_3442().Method_3421()) continue;
                class_3436 = class_34362;
            }
            if (class_3436.Method_3442().Method_3316() != (-1 & -1)) {
                this.Method_6947(f, this.Field_6925.Method_214().Method_36716().Method_36437(class_3436));
            }
        }
        if (!this.Field_6925.Field_48.\u0000c_()) {
            if (this.Field_6925.Field_48.\u0000strictfp(Class_3713.Field_3734)) {
                this.Method_6943(f);
            }
            if (this.Field_6925.Field_48.\u0000, 2()) {
                this.Method_6934(f);
            }
        }
        Class_16867.Method_16913();
    }

    private void Method_6947(float f, Class_11372 class_11372) {
        this.Field_6925.Method_253().Method_34707(Class_24069.Field_24084);
        Class_7644 class_7644 = Class_7644.Method_7649();
        Class_22385 class_22385 = class_7644.Method_7648();
        Class_16867.Method_16924(0.405f * 0.24691358f, 0.38181818f * 0.26190478f, 0.3275862f * 0.30526316f, 1.6724138f * 0.29896906f);
        Class_16867.Method_16961();
        float f2 = class_11372.Method_11420();
        float f3 = class_11372.Method_11444();
        float f4 = class_11372.Method_11437();
        float f5 = class_11372.Method_11429();
        class_22385.Method_22417(271 & -20329, Class_29585.Field_29598);
        class_22385.Method_22443(-0.06666666666666667 * 15.0, -0.1935483870967742 * 5.166666666666667, -0.45384615384615384 * 1.1016949152542372).Method_22433(f3, f5).Method_22451();
        class_22385.Method_22443(1.0, -2.586206896551724 * 0.38666666666666666, -0.07692307692307693 * 6.5).Method_22433(f2, f5).Method_22451();
        class_22385.Method_22443(1.0, 1.0, 2.9166666666666665 * -0.17142857142857143).Method_22433(f2, f4).Method_22451();
        class_22385.Method_22443(0.3125 * -3.2, 1.0, 0.8356164383561644 * -0.5983606557377049).Method_22433(f3, f4).Method_22451();
        class_7644.Method_7647();
        Class_16867.Method_16945();
        Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 1.0f);
    }

    private void Method_6948(Class_32090 class_32090) {
        Class_16867.Method_16961();
        Class_16867.Method_16940(409.49997f * 0.13186814f, 0.0f, 1.0f, 0.0f);
        Class_16867.Method_16940(210.28572f * 0.3043478f, 1.0f, 0.0f, 0.0f);
        Class_16867.Method_16940(-93.0f * 0.6666667f, 0.0f, 0.0f, 1.0f);
        Class_16867.Method_16943(0.26262626f * 0.9519231f, 1.625f * -0.52307695f, 3.8863637f * 0.19298245f);
        class_32090.Method_32107(this.Field_6925.Field_48, 0.0f);
        Class_16867.Method_16945();
    }

    private float Method_6949(float f) {
        float f2 = 1.0f - f / (26.024097f * 1.7291666f) + 1.6122448f * 0.06202532f;
        f2 = Class_13337.Method_13360(f2, 0.0f, 1.0f);
        f2 = -Class_13337.Method_13350(f2 * (2.8076923f * 1.1189234f)) * (0.4469697f * 1.1186441f) + 0.55f * 0.9090909f;
        return f2;
    }

    public void Method_6950(float f) {
        float f2 = 1.0f - (this.Field_6919 + (this.Field_6924 - this.Field_6919) * f);
        Class_1378 class_1378 = this.Field_6925.Field_48;
        float f3 = class_1378.\u0000, for(f);
        float f4 = class_1378.\u0000, 2 + (class_1378.\u0000= float - class_1378.\u0000, 2) * f;
        float f5 = class_1378.\u0000switch + (class_1378.\u0000= ? - class_1378.\u0000switch) * f;
        this.Method_6931(f4, f5);
        this.Method_6938(class_1378);
        this.Method_6953(class_1378, f);
        Class_16867.Method_16957();
        Class_16867.Method_16961();
        if (((Boolean)this.Field_6925.Field_84.Field_39732.Field_8877.\u0000strictfp()).booleanValue()) {
            GL11.glScaled((double)(-3.0434782608695654 * 0.32857142857142857), (double)1.0, (double)1.0);
            Class_16867.Method_16969();
        }
        if (this.Field_6922 != null) {
            if (this.Field_6922.Method_23844() == Class_10527.Field_10701) {
                this.Method_6954(class_1378, f4, f2, f3);
            } else if (class_1378.\u0000strictfp() > 0) {
                Class_25567 class_25567 = this.Field_6922.Method_23872();
                float f6 = 0.0f;
                if (((Boolean)this.Field_6925.Field_84.Field_39732.Field_8896.\u0000strictfp()).booleanValue()) {
                    f6 = f3;
                }
                switch (Class_22152.Field_22153[class_25567.ordinal()]) {
                    case 1: {
                        this.Method_6936(f2, 0.0f);
                        break;
                    }
                    case 2: 
                    case 3: {
                        this.Method_6955(class_1378, f);
                        this.Method_6936(f2, f6);
                        if (!((Boolean)this.Field_6925.Field_84.Field_39732.Field_8858.\u0000strictfp()).booleanValue()) break;
                        Class_16867.Method_16973(0.74712646f * 1.0707692f, 1.0f, 1.0f);
                        GL11.glTranslatef((float)(0.93406594f * -0.21411765f), (float)(1.9090909f * -0.052380953f), (float)0.0f);
                        break;
                    }
                    case 4: {
                        this.Method_6936(f2, f6);
                        this.Method_6937();
                        break;
                    }
                    case 5: {
                        this.Method_6936(f2, f6);
                        this.Method_6942(f, class_1378);
                    }
                }
            } else {
                this.Method_6935(f3);
                this.Method_6936(f2, f3);
            }
            this.Method_6951(class_1378, this.Field_6922, Class_7673.Field_7681);
        } else if (!class_1378.\u0000= ?()) {
            this.Method_6940(class_1378, f2, f3, f);
        }
        Class_16867.Method_16945();
        Class_16867.Method_16942();
        Class_39477.Method_39484();
    }

    public void Method_6951(Class_859 class_859, Class_23823 class_23823, Class_7673 class_7673) {
        if (class_23823 != null) {
            Class_1956 class_1956 = class_23823.Method_23844();
            Class_3238 class_3238 = Class_3238.Method_3345(class_1956);
            Class_16867.Method_16961();
            if (this.Field_6920.Method_44285(class_23823)) {
                Class_16867.Method_16973(2.0f, 2.0f, 2.0f);
                if (!(!this.Method_6944(class_3238) || Class_19426.Method_19570() && Class_12440.Field_12676)) {
                    Class_16867.Method_16930((3137 & -24320) != 0);
                }
            }
            this.Field_6920.Method_44270(class_23823, class_859, class_7673);
            if (this.Method_6944(class_3238)) {
                Class_16867.Method_16930((8211 & 16393) != 0);
            }
            Class_16867.Method_16945();
        }
    }

    private static String Method_6952(String string) {
        int n = 15514;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_6918.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_6953(Class_1378 class_1378, float f) {
        float f2 = class_1378.Field_1392 + (class_1378.Field_1391 - class_1378.Field_1392) * f;
        float f3 = class_1378.Field_1383 + (class_1378.Field_1393 - class_1378.Field_1383) * f;
        Class_16867.Method_16940((class_1378.\u0000= float - f2) * (0.118421055f * 0.84444445f), 1.0f, 0.0f, 0.0f);
        Class_16867.Method_16940((class_1378.\u0000= ? - f3) * (0.013186813f * 7.5833335f), 0.0f, 1.0f, 0.0f);
    }

    private void Method_6954(Class_1456 class_1456, float f, float f2, float f3) {
        float f4 = 0.40425533f * -0.9894737f * Class_13337.Method_13370(Class_13337.Method_13388(f3) * (24.504421f * 0.12820514f));
        float f5 = 0.82978725f * 0.24102564f * Class_13337.Method_13370(Class_13337.Method_13388(f3) * (1.5283424f * 2.0555556f) * 2.0f);
        float f6 = 1.745098f * -0.114606746f * Class_13337.Method_13370(f3 * (5.301438f * 0.5925926f));
        Class_16867.Method_16943(f4, f5, f6);
        float f7 = this.Method_6949(f);
        Class_16867.Method_16943(0.0f, 0.10769231f * 0.37142855f, -0.26109892f * 2.7575758f);
        Class_16867.Method_16943(0.0f, f2 * (0.9714286f * -1.2352942f), 0.0f);
        Class_16867.Method_16943(0.0f, f7 * (1.6666666f * -0.3f), 0.0f);
        Class_16867.Method_16940(223.63637f * 0.40243903f, 0.0f, 1.0f, 0.0f);
        Class_16867.Method_16940(f7 * (22.5f * -3.7777777f), 0.0f, 0.0f, 1.0f);
        Class_16867.Method_16940(0.0f, 1.0f, 0.0f, 0.0f);
        this.Method_6932(class_1456);
        float f8 = Class_13337.Method_13370(f3 * f3 * (1.5967742f * 1.9674621f));
        float f9 = Class_13337.Method_13370(Class_13337.Method_13388(f3) * (0.90625f * 3.4665852f));
        Class_16867.Method_16940(f8 * (-1.8181819f * 11.0f), 0.0f, 1.0f, 0.0f);
        Class_16867.Method_16940(f9 * (-15.254237f * 1.3111111f), 0.0f, 0.0f, 1.0f);
        Class_16867.Method_16940(f9 * (0.89411765f * -89.47369f), 1.0f, 0.0f, 0.0f);
        Class_16867.Method_16973(3.5357144f * 0.107474744f, 0.6785714f * 0.56f, 1.97125f * 0.19277108f);
        Class_16867.Method_16940(3.0769231f * 29.25f, 0.0f, 1.0f, 0.0f);
        Class_16867.Method_16940(1.025f * 175.60976f, 0.0f, 0.0f, 1.0f);
        Class_16867.Method_16940(0.0f, 1.0f, 0.0f, 0.0f);
        Class_16867.Method_16943(-0.15625f * 6.4f, -2.0f * 0.5f, 0.0f);
        Class_16867.Method_16973(1.6363636f * 0.009548611f, 0.027138159f * 0.57575756f, 0.008698454f * 1.7962962f);
        this.Field_6925.Method_253().Method_34707(Field_6927);
        Class_7644 class_7644 = Class_7644.Method_7649();
        Class_22385 class_22385 = class_7644.Method_7648();
        GL11.glNormal3f((float)0.0f, (float)0.0f, (float)(-20.25f * 0.049382716f));
        class_22385.Method_22417(25735 & 783, Class_29585.Field_29598);
        class_22385.Method_22443(0.9125 * -7.671232876712329, 62.608695652173914 * 2.15625, 0.0).Method_22433(0.0, 1.0).Method_22451();
        class_22385.Method_22443(0.4942528735632184 * 273.1395348837209, 213.54545454545453 * 0.632183908045977, 0.0).Method_22433(1.0, 1.0).Method_22451();
        class_22385.Method_22443(105.65217391304348 * 1.2777777777777777, -11.558139534883722 * 0.6056338028169014, 0.0).Method_22433(1.0, 0.0).Method_22451();
        class_22385.Method_22443(1.2857142857142858 * -5.444444444444444, 2.909090909090909 * -2.40625, 0.0).Method_22433(0.0, 0.0).Method_22451();
        class_7644.Method_7647();
        Class_33760 class_33760 = Class_10527.Field_10701.Method_40868(this.Field_6922, this.Field_6925.Field_72);
        if (class_33760 != null) {
            this.Field_6925.Field_58.Method_22954().Method_10047(class_33760, (-30968 & 8192) != 0);
        }
    }

    private void Method_6955(Class_1456 class_1456, float f) {
        float f2 = (float)class_1456.\u0000strictfp() - f + 1.0f;
        float f3 = f2 / (float)this.Field_6922.Method_23861();
        float f4 = Class_13337.Method_13369(Class_13337.Method_13350(f2 / (0.72527474f * 5.5151515f) * (4.6633015f * 0.67368424f)) * (0.71428573f * 0.14f));
        if (f3 >= 1.6956521f * 0.4717949f) {
            f4 = 0.0f;
        }
        Class_16867.Method_16943(0.0f, f4, 0.0f);
        float f5 = 1.0f - (float)Math.pow(f3, 31.9390243902439 * 0.845360824742268);
        Class_16867.Method_16943(f5 * (0.02727273f * 22.0f), f5 * (1.1891892f * -0.42045453f), f5 * 0.0f);
        Class_16867.Method_16940(f5 * (223.7143f * 0.40229884f), 0.0f, 1.0f, 0.0f);
        Class_16867.Method_16940(f5 * (1.4117646f * 7.0833335f), 1.0f, 0.0f, 0.0f);
        Class_16867.Method_16940(f5 * (1.3387097f * 22.409637f), 0.0f, 0.0f, 1.0f);
    }
}

