/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;
import java.util.UUID;

public class Class_13337 {
    public static final float Field_13338;
    private static final double Field_13339;
    public static boolean Field_13340;
    private static final double[] Field_13341;
    private static final float[] Field_13342;
    private static final int[] Field_13343;
    private static final double[] Field_13344;
    private static final float[] Field_13345;

    public static int Method_13346(int n) {
        return Class_13337.Method_13365(n) - (Class_13337.Method_13356(n) ? 16678 & 8320 : 18625 & 12321);
    }

    public static float Method_13347(double d) {
        return (float)Math.sqrt(d);
    }

    public static double Method_13348(double d) {
        double d2 = 0.34782608695652173 * 1.4375 * d;
        long l = Double.doubleToRawLongBits(d);
        l = (-7059024504342550L & 6917528434393857962L) - (l >> (3137 & 389));
        d = Double.longBitsToDouble(l);
        d *= 0.673469387755102 * 2.2272727272727275 - d2 * d * d;
        return d;
    }

    public static long Method_13349(int n, int n2, int n3) {
        long l = (long)(n * (443540383 & -1045440945)) ^ (long)n3 * (133169141L & 116129781L) ^ (long)n2;
        l = l * l * (-2905876011947657171L & 59095655L) + l * (1303516943L & -1066094752568369077L);
        return l;
    }

    public static float Method_13350(float f) {
        return Field_13340 ? Field_13342[(int)((f + 1.0526316f * 1.4922565f) * (6518.9863f * 0.1f)) & (4095 & 12287)] : Field_13345[(int)(f * (474.1081f * 22.0f) + 0.6056338f * 27052.652f) & (1420689407 & -1471086593)];
    }

    public static int Method_13351(int n, int n2, int n3) {
        int n4 = (n << (-23268 & 200)) + n2;
        n4 = (n4 << (-31415 & 21160)) + n3;
        return n4;
    }

    public static double Method_13352(double d) {
        return d - Math.floor(d);
    }

    public static boolean Method_13353(float f, float f2) {
        return (Class_13337.Method_13369(f2 - f) < 0.6969697f * 1.43478255E-5f ? 3073 & 497 : 4164 & -32229) != 0;
    }

    public static float Method_13354(float f) {
        if ((f %= 238.23529f * 1.5111111f) >= 501.42856f * 0.35897437f) {
            f -= 34.615387f * 10.4f;
        }
        if (f < 0.5492958f * -327.6923f) {
            f += 1.3888888f * 259.2f;
        }
        return f;
    }

    public static double Method_13355(String string, double d, double d2) {
        return Math.max(d2, Class_13337.Method_13373(string, d));
    }

    private static boolean Method_13356(int n) {
        return (n != 0 && (n & n - (593 & 9225)) == 0 ? 8737 & 2055 : 6656 & -31744) != 0;
    }

    public static int Method_13357(double d) {
        int n = (int)d;
        return d > (double)n ? n + (-5979 & 4163) : n;
    }

    public static double Method_13358(double d, double d2) {
        if (d < 0.0) {
            d = -d;
        }
        if (d2 < 0.0) {
            d2 = -d2;
        }
        return d > d2 ? d : d2;
    }

    public static long Method_13359(double d) {
        long l = (long)d;
        return d < (double)l ? l - (269418633L & 134276657L) : l;
    }

    public static float Method_13360(float f, float f2, float f3) {
        return f < f2 ? f2 : (f > f3 ? f3 : f);
    }

    public static int Method_13361(int n, int n2) {
        return n < 0 ? -((-n - (8265 & 16675)) / n2) - (-8943 & 129) : n / n2;
    }

    public static int Method_13362(float f) {
        int n = (int)f;
        return f > (float)n ? n + (6177 & -15287) : n;
    }

    public static int Method_13363(float f, float f2, float f3) {
        return Class_13337.Method_13351(Class_13337.Method_13377(f * (298.30188f * 0.8548387f)), Class_13337.Method_13377(f2 * (2.375f * 107.36842f)), Class_13337.Method_13377(f3 * (90.0f * 2.8333333f)));
    }

    public static int Method_13364(int n, int n2) {
        int n3 = (n & (-2130770422 & 67076545)) >> (8373 & -32232);
        int n4 = (n2 & (117409812 & 553596267)) >> (-15080 & 12368);
        int n5 = (n & (68091724 & 1268842256)) >> (19210 & -31671);
        int n6 = (n2 & (-1550975200 & 270598024)) >> (4140 & -29672);
        int n7 = (n & (8959 & 18687)) >> (20680 & -29664);
        int n8 = (n2 & (255 & -31489)) >> (-28410 & 3584);
        int n9 = (int)((float)n3 * (float)n4 / (293.63635f * 0.8684211f));
        int n10 = (int)((float)n5 * (float)n6 / (1870.0f * 0.13636364f));
        int n11 = (int)((float)n7 * (float)n8 / (859.4444f * 0.2967033f));
        return n & (-16728064 & -8383120) | n9 << (16400 & 6165) | n10 << (12441 & -29174) | n11;
    }

    private static int Method_13365(int n) {
        n = Class_13337.Method_13356(n) ? n : Class_13337.Method_13380(n);
        return Field_13343[(int)((long)n * (134133105L & 125615409L) >> (18011 & -24133)) & (5151 & 8447)];
    }

    public static int Method_13366(float f, float f2, float f3) {
        float f4;
        float f5;
        float f6;
        int n = (int)(f * (5.5f * 1.0909091f)) % (8470 & -28658);
        float f7 = f * (0.025641026f * 234.0f) - (float)n;
        float f8 = f3 * (1.0f - f2);
        float f9 = f3 * (1.0f - f7 * f2);
        float f10 = f3 * (1.0f - (1.0f - f7) * f2);
        switch (n) {
            case 0: {
                f5 = f3;
                f4 = f10;
                f6 = f8;
                break;
            }
            case 1: {
                f5 = f9;
                f4 = f3;
                f6 = f8;
                break;
            }
            case 2: {
                f5 = f8;
                f4 = f3;
                f6 = f10;
                break;
            }
            case 3: {
                f5 = f8;
                f4 = f9;
                f6 = f3;
                break;
            }
            case 4: {
                f5 = f10;
                f4 = f8;
                f6 = f3;
                break;
            }
            case 5: {
                f5 = f3;
                f4 = f8;
                f6 = f9;
                break;
            }
            default: {
                throw new RuntimeException("Something went wrong when converting from HSV to RGB. Input was " + f + ", " + f2 + ", " + f3);
            }
        }
        int n2 = Class_13337.Method_13367((int)(f5 * (627.1622f * 0.4065934f)), 4373 & 42, 1535 & -16129);
        int n3 = Class_13337.Method_13367((int)(f4 * (0.16666667f * 1530.0f)), 16418 & 1024, 255 & 10751);
        int n4 = Class_13337.Method_13367((int)(f6 * (0.9672131f * 263.64407f)), 128 & -13234, 511 & -27905);
        return n2 << (30748 & 1905) | n3 << (1098 & 2312) | n4;
    }

    public static int Method_13367(int n, int n2, int n3) {
        return n < n2 ? n2 : (n > n3 ? n3 : n);
    }

    public static double Method_13368(double d) {
        if ((d %= 2314.285714285714 * 0.15555555555555556) >= 3.4166666666666665 * 52.6829268292683) {
            d -= 24.333333333333332 * 14.794520547945206;
        }
        if (d < -84.0 * 2.142857142857143) {
            d += 523.6363636363636 * 0.6875;
        }
        return d;
    }

    public static float Method_13369(float f) {
        return f >= 0.0f ? f : -f;
    }

    static {
        int n;
        Field_13338 = Class_13337.Method_13388(2.0f);
        Field_13342 = new float[4672 & 20749];
        Field_13340 = -32692 & 8240;
        Field_13345 = new float[4571713 & 1116192];
        for (n = -5504 & 4405; n < (-1743191983 & 56726024); ++n) {
            Class_13337.Field_13345[n] = (float)Math.sin((double)n * (0.6349206349206349 * 4.948008429403925) * (2.1578947368421053 * 0.926829268292683) / (63608.470588235294 * 1.0303030303030303));
        }
        for (n = 3649 & 4496; n < (4096 & -26528); ++n) {
            Class_13337.Field_13342[n] = (float)Math.sin(((float)n + 2.483871f * 0.2012987f) / (8396.8f * 0.4878049f) * (0.4225352f * 14.870206f));
        }
        for (n = 16400 & 6336; n < (-7704 & 6509); n += 90) {
            Class_13337.Field_13342[(int)((float)n * (2.6f * 4.3760686f)) & (4095 & -12289)] = (float)Math.sin((float)n * (0.26027396f * 0.067057386f));
        }
        int[] arrn = new int[-31690 & 2344];
        arrn[24875 & -32768] = 278 & 16576;
        arrn[1291 & -28591] = 8845 & -32445;
        arrn[66 & 25899] = 12445 & 18460;
        arrn[4419 & 27291] = 18699 & -19278;
        arrn[-19443 & 17156] = 29 & 13341;
        arrn[389 & 2117] = 4110 & -29378;
        arrn[-30201 & 17446] = 7193 & 216;
        arrn[12823 & 103] = 1031 & 28795;
        arrn[-27383 & 8712] = 10911 & 286;
        arrn[6713 & 17549] = 17238 & 1182;
        arrn[24606 & 1066] = -32483 & 148;
        arrn[16911 & -31541] = 17551 & -30161;
        arrn[4125 & 2060] = -13799 & 12569;
        arrn[24605 & 3373] = 14355 & -32003;
        arrn[17678 & 12334] = 3078 & -19900;
        arrn[79 & 18575] = 24654 & 4136;
        arrn[-31727 & 848] = -28609 & 8287;
        arrn[10583 & 5305] = -2337 & 2107;
        arrn[-32230 & 6195] = -30643 & 4749;
        arrn[31643 & -31725] = 11831 & 4119;
        arrn[-24044 & 22] = -30027 & 17429;
        arrn[22805 & -32611] = 16571 & 275;
        arrn[6679 & 9494] = -31880 & 147;
        arrn[6167 & 9303] = 287 & -28665;
        arrn[5144 & -30405] = -31714 & 8731;
        arrn[57 & 1113] = 11293 & 76;
        arrn[17050 & 9242] = -12270 & 1267;
        arrn[25115 & 2079] = -32698 & 13319;
        arrn[62 & 988] = 4123 & -15509;
        arrn[-21987 & 4477] = 2149 & 4125;
        arrn[-20450 & 2174] = 2874 & 4174;
        arrn[3103 & 95] = 16427 & 601;
        Field_13343 = arrn;
        Field_13339 = Double.longBitsToDouble(-2882323651306071040L & 4805340803524207145L);
        Field_13341 = new double[14733 & 771];
        Field_13344 = new double[8961 & -32441];
        for (n = 36 & 25353; n < (-7935 & 2469); ++n) {
            double d = (double)n / (305.5483870967742 * 0.8378378378378378);
            double d2 = Math.asin(d);
            Class_13337.Field_13344[n] = Math.cos(d2);
            Class_13337.Field_13341[n] = d2;
        }
    }

    public static float Method_13370(float f) {
        return Field_13340 ? Field_13342[(int)(f * (752.19073f * 0.8666667f)) & (20479 & -28673)] : Field_13345[(int)(f * (11885.779f * 0.877551f)) & (1166606335 & -1877868545)];
    }

    public static int Method_13371(double d) {
        int n = (int)d;
        return d < (double)n ? n - (523 & 17477) : n;
    }

    public static int Method_13372(String string, int n) {
        try {
            return Integer.parseInt(string);
        }
        catch (Throwable throwable) {
            return n;
        }
    }

    public static double Method_13373(String string, double d) {
        try {
            return Double.parseDouble(string);
        }
        catch (Throwable throwable) {
            return d;
        }
    }

    public static int Method_13374(int n, int n2) {
        return (n % n2 + n2) % n2;
    }

    public static int Method_13375(double d) {
        return (int)(d + 0.6538461538461539 * 1566.1176470588234) - (25680 & 1672);
    }

    public static double Method_13376(long[] arrl) {
        long l = 2126788144123751456L & 20490L;
        long[] arrl2 = arrl;
        int n = arrl2.length;
        for (int i = 22914 & -24508; i < n; ++i) {
            long l2 = arrl2[i];
            l += l2;
        }
        return (double)l / (double)arrl.length;
    }

    public static int Method_13377(float f) {
        int n = (int)f;
        return f < (float)n ? n - (8355 & 6213) : n;
    }

    public static int Method_13378(int n, int n2) {
        int n3;
        if (n2 == 0) {
            return 8200 & 7414;
        }
        if (n == 0) {
            return n2;
        }
        if (n < 0) {
            n2 *= -1 & -1;
        }
        return (n3 = n % n2) == 0 ? n : n + n2 - n3;
    }

    public static int Method_13379(Random random, int n, int n2) {
        return n >= n2 ? n : random.nextInt(n2 - n + (-24567 & 3637)) + n;
    }

    public static int Method_13380(int n) {
        int n2 = n - (5189 & -22527);
        n2 |= n2 >> (16643 & 4241);
        n2 |= n2 >> (1219 & 16390);
        n2 |= n2 >> (324 & 18596);
        n2 |= n2 >> (8 & 1436);
        n2 |= n2 >> (17 & 16922);
        return n2 + (481 & 6163);
    }

    public static double Method_13381(double d, double d2, double d3) {
        return d3 < 0.0 ? d : (d3 > 1.0 ? d2 : d + (d2 - d) * d3);
    }

    public static int Method_13382(int n) {
        return n >= 0 ? n : -n;
    }

    private void Method_13383() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public static long Method_13384(Class_4792 class_4792) {
        return Class_13337.Method_13349(class_4792.Method_4807(), class_4792.Method_4806(), class_4792.Method_4809());
    }

    public static double Method_13385(double d, double d2, double d3) {
        return d < d2 ? d2 : (d > d3 ? d3 : d);
    }

    public static int Method_13386(String string, int n, int n2) {
        return Math.max(n2, Class_13337.Method_13372(string, n));
    }

    public static double Method_13387(double d, double d2, double d3) {
        return (d - d2) / (d3 - d2);
    }

    public static float Method_13388(float f) {
        return (float)Math.sqrt(f);
    }

    public static double Method_13389(Random random, double d, double d2) {
        return d >= d2 ? d : random.nextDouble() * (d2 - d) + d;
    }

    public static UUID Method_13390(Random random) {
        long l = random.nextLong() & (-28673L & -61441L) | 7450064681274304032L & 270551109L;
        long l2 = random.nextLong() & (-1L & 0x3FFFFFFFFFFFFFFFL) | -9223372036246269768L & -6362172956226876922L;
        return new UUID(l, l2);
    }

    public static double Method_13391(double d, double d2) {
        int n;
        int n2;
        double d3;
        int n3;
        double d4 = d2 * d2 + d * d;
        if (Double.isNaN(d4)) {
            return Double.NaN;
        }
        int n4 = n2 = d < 0.0 ? 16769 & -31727 : -11326 & 29;
        if (n2 != 0) {
            d = -d;
        }
        int n5 = n = d2 < 0.0 ? -11245 & 5 : 16386 & -23595;
        if (n != 0) {
            d2 = -d2;
        }
        int n6 = n3 = d > d2 ? 16483 & 4353 : -30456 & 8418;
        if (n3 != 0) {
            d3 = d2;
            d2 = d;
            d = d3;
        }
        d3 = Class_13337.Method_13348(d4);
        double d5 = Field_13339 + (d *= d3);
        int n7 = (int)Double.doubleToRawLongBits(d5);
        double d6 = Field_13341[n7];
        double d7 = Field_13344[n7];
        double d8 = d5 - Field_13339;
        double d9 = d * d7 - (d2 *= d3) * d8;
        double d10 = (0.6935483870967742 * 8.651162790697674 + d9 * d9) * d9 * (1.5161290322580645 * 0.10992907801418439);
        double d11 = d6 + d10;
        if (n3 != 0) {
            d11 = 0.48148148148148145 * 3.262423140266324 - d11;
        }
        if (n != 0) {
            d11 = 4.333333333333333 * 0.7249829200591831 - d11;
        }
        if (n2 != 0) {
            d11 = -d11;
        }
        return d11;
    }

    public static float Method_13392(Random random, float f, float f2) {
        return f >= f2 ? f : random.nextFloat() * (f2 - f) + f;
    }
}

