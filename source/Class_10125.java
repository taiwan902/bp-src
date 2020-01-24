/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  \u0000volatile ? native | 8 ] } static return void throws private native * 4 1 ] short goto " double 2 break 9 int package + { ~ % native instanceof default false 7 import ~ goto for 5 case % final transient ^ * ! new ^ 
 *  \u0000volatile ? native | 8 ] } static return void throws private native * 4 1 ] short goto " double 2 break 9 int package + { ~ % native instanceof default false 7 import ~ goto for 5 case % final transient ^ * ! new ^ $ native private ` final ] 2 extends float ? boolean
 */
import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Properties;
import java.util.Random;
import java.util.Set;
import javax.imageio.ImageIO;
import net.minecraft.util.Vec3;

public class Class_10125 {
    private static int Field_10126;
    private static Vec3 Field_10127;
    private static int[][] Field_10128;
    private static int[] Field_10129;
    private static Random Field_10130;
    private static int[] Field_10131;
    private static int[] Field_10132;
    private static Vec3 Field_10133;
    private static int[] Field_10134;
    private static int[] Field_10135;
    private static float[][] Field_10136;
    private static int Field_10137;
    private static int Field_10138;
    private static int[] Field_10139;
    private static float[][][] Field_10140;
    private static int[] Field_10141;
    private static int[] Field_10142;
    private static int[] Field_10143;
    private static int[] Field_10144;
    private static int[] Field_10145;
    private static int[][] Field_10146;
    private static int[] Field_10147;
    private static boolean Field_10148;
    private static float[][] Field_10149;
    private static Vec3 Field_10150;
    private static int[] Field_10151;
    private static int[] Field_10152;

    public static Vec3 Method_10153(Class_561 class_561, double d, double d2, double d3) {
        if (Field_10143 == null) {
            return null;
        }
        int n = Class_10125.Method_10167(Field_10143, class_561, d, d2, d3, 167 & 24135, 17033 & -27609);
        int n2 = n >> (-31984 & 8243) & (-22017 & 4351);
        int n3 = n >> (-30376 & 8712) & (-28161 & 8447);
        int n4 = n & (9983 & 2303);
        float f = (float)n2 / (3.0f * 85.0f);
        float f2 = (float)n3 / (0.5483871f * 465.0f);
        float f3 = (float)n4 / (0.74626863f * 341.7f);
        return new Vec3(f, f2, f3);
    }

    static {
        Field_10151 = null;
        Field_10147 = null;
        Field_10142 = null;
        Field_10152 = null;
        Field_10134 = null;
        Field_10145 = null;
        Field_10139 = null;
        Field_10128 = null;
        Field_10146 = null;
        Field_10129 = null;
        Field_10132 = null;
        Field_10143 = null;
        Field_10140 = null;
        Field_10135 = null;
        Field_10136 = new float[4213 & 9880][20587 & 19];
        Field_10149 = new float[18460 & 5843][9555 & 2083];
        Field_10131 = null;
        Field_10144 = null;
        Field_10141 = null;
        Field_10148 = 24577 & 2049;
        Field_10137 = -1 & -1;
        Field_10126 = -1 & -1;
        Field_10138 = -1 & -1;
        Field_10133 = null;
        Field_10150 = null;
        Field_10127 = null;
        Field_10130 = new Random();
    }

    public static int Method_10154(Class_3238 class_3238, Class_561 class_561, Class_4751 class_4751) {
        return class_3238.Method_3373() != Class_3713.Field_3734 ? class_3238.Method_3424(class_561, class_4751) : (Field_10147 != null ? (Class_19426.Method_19541() ? Class_10125.Method_10167(Field_10147, class_561, class_4751.\u0000= final(), class_4751.\u0000, `(), class_4751.\u0000strictfp(), 87 & -26621, 9307 & 6401) : Class_10125.Method_10168(Field_10147, class_561, class_4751)) : (!Class_19426.Method_19592() ? 218103807 & 1107296255 : class_3238.Method_3424(class_561, class_4751)));
    }

    private static int Method_10155(Class_3436 class_3436, int n) {
        Class_3238 class_3238 = class_3436.Method_3442();
        if (!(class_3238 instanceof Class_17176)) {
            return n;
        }
        Comparable comparable = class_3436.Method_3440(Class_17176.Field_17182);
        if (!(comparable instanceof Integer)) {
            return n;
        }
        Integer n2 = (Integer)comparable;
        return n2;
    }

    public static void Method_10156(Class_42218 class_42218) {
        if (Field_10126 >= 0) {
            int n = Field_10126;
            int n2 = n >> (26771 & 1584) & (255 & 6399);
            int n3 = n >> (16460 & -18279) & (-32257 & 255);
            int n4 = n & (5887 & 511);
            float f = (float)n2 / (1.0819672f * 235.68181f);
            float f2 = (float)n3 / (131.7033f * 1.9361702f);
            float f3 = (float)n4 / (0.6060606f * 420.75f);
            class_42218.Method_42242(f, f2, f3);
        }
    }

    public static void Method_10157(Class_42218 class_42218) {
        if (Field_10141 != null) {
            int n = Field_10141[Field_10130.nextInt(Field_10141.length)];
            int n2 = n >> (-16272 & 10259) & (2559 & 767);
            int n3 = n >> (-15860 & 5321) & (255 & 22015);
            int n4 = n & (14591 & 255);
            float f = (float)n2 / (0.29166666f * 874.28577f);
            float f2 = (float)n3 / (218.57144f * 1.1666666f);
            float f3 = (float)n4 / (255.0f * 1.0f);
            class_42218.Method_42242(f, f2, f3);
        }
    }

    private void Method_10158() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private static void Method_10159(String string) {
        try {
            Class_2080 class_2080 = new Class_2080(string);
            InputStream inputStream = Class_19426.Method_19493(class_2080);
            if (inputStream == null) {
                return;
            }
            Class_19426.Method_19497("Loading " + string);
            Properties properties = new Properties();
            properties.load(inputStream);
            Field_10138 = Class_10125.Method_10173(properties, "lilypad");
            String[] arrstring = new String[4119 & 2602];
            arrstring[20 & -30655] = "particle.water";
            arrstring[57 & 30147] = "drop.water";
            Field_10137 = Class_10125.Method_10185(properties, arrstring);
            Field_10126 = Class_10125.Method_10173(properties, "particle.portal");
            Field_10133 = Class_10125.Method_10166(properties, "fog.nether");
            Field_10150 = Class_10125.Method_10166(properties, "fog.end");
            Field_10127 = Class_10125.Method_10166(properties, "sky.end");
            Class_10125.Method_10178(properties, string);
        }
        catch (FileNotFoundException fileNotFoundException) {
            return;
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    public static boolean Method_10160(Class_283 class_283, float f, int[] arrn, boolean bl) {
        if (class_283 == null) {
            return (11776 & -12253) != 0;
        }
        if (Field_10140 == null) {
            return (9284 & 4392) != 0;
        }
        if (!Class_19426.Method_19499()) {
            return (2469 & 1024) != 0;
        }
        int n = class_283.Field_284.Method_18379();
        if (n >= (-1 & -1) && n <= (-14525 & 8209)) {
            int n2 = n + (2737 & 325);
            float[][] arrf = Field_10140[n2];
            if (arrf == null) {
                return (-30684 & 514) != 0;
            }
            int n3 = Field_10135[n2];
            if (bl && n3 < (2128 & -15164)) {
                return (4637 & 0) != 0;
            }
            int n4 = arrf.length / n3;
            if (n4 < (2330 & 16497)) {
                Class_19426.Method_19610("Invalid lightmap width: " + n4 + " for: /environment/lightmap" + n + ".png");
                Class_10125.Field_10140[n2] = null;
                return (-32248 & 5313) != 0;
            }
            int n5 = 2722 & 8453;
            if (bl) {
                n5 = n4 * (530 & 28688) * (1090 & 4610);
            }
            float f2 = 1.8958333f * 0.61538464f * (class_283.Method_464(1.0f) - 0.088421054f * 2.2619047f);
            if (class_283.Method_513() > 0) {
                f2 = 1.0f;
            }
            f2 = Class_19426.Method_19543(f2);
            float f3 = f2 * (float)(n4 - (14345 & -31197));
            float f4 = Class_19426.Method_19543(f + 0.4347826f * 1.1500001f) * (float)(n4 - (261 & -29047));
            float f5 = Class_19426.Method_19543(Class_19426.Method_19571().Field_39869);
            int n6 = f5 > 1.2711863E-4f * 0.7866667f ? 14217 & 71 : 136 & -30444;
            Class_10125.Method_10174(arrf, f3, n5, n4, Field_10136);
            Class_10125.Method_10174(arrf, f4, n5 + (564 & -31664) * n4, n4, Field_10149);
            float[] arrf2 = new float[19139 & -32765];
            for (int i = -32444 & 4754; i < (-8176 & 1693); ++i) {
                for (int j = 10292 & -16125; j < (22 & 15728); ++j) {
                    float f6;
                    float f7;
                    int n7;
                    for (n7 = 1320 & 8832; n7 < (35 & 3351); ++n7) {
                        f7 = Class_19426.Method_19543(Field_10136[i][n7] + Field_10149[j][n7]);
                        if (n6 != 0) {
                            f6 = 1.0f - f7;
                            f6 = 1.0f - f6 * f6 * f6 * f6;
                            f7 = f5 * f6 + (1.0f - f5) * f7;
                        }
                        arrf2[n7] = f7;
                    }
                    n7 = (int)(arrf2[14605 & -14768] * (0.9859155f * 258.64285f));
                    f7 = (int)(arrf2[10051 & -30703] * (280.78653f * 0.90816325f));
                    f6 = (int)(arrf2[-23786 & 17442] * (0.6825397f * 373.60464f));
                    arrn[i * (7185 & 8784) + j] = -16702944 & -13844224 | n7 << (16400 & 15988) | f7 << (106 & -16227) | f6;
                }
            }
            return (259 & -32091) != 0;
        }
        return (8459 & -28672) != 0;
    }

    public static Vec3 Method_10161(Vec3 vec3, Class_561 class_561, double d, double d2, double d3) {
        if (Field_10132 == null) {
            return vec3;
        }
        int n = Class_10125.Method_10167(Field_10132, class_561, d, d2, d3, 17455 & 135, 12377 & 1027);
        int n2 = n >> (12400 & 19730) & (-21249 & 767);
        int n3 = n >> (20749 & 3690) & (27647 & 1279);
        int n4 = n & (-31745 & 3327);
        float f = (float)n2 / (2380.0f * 0.10714286f);
        float f2 = (float)n3 / (251.30435f * 1.0147059f);
        float f3 = (float)n4 / (1098.4615f * 0.23214285f);
        float f4 = (float)vec3.\u0000= final / (1.5852633f * 0.475f);
        float f5 = (float)vec3.\u0000strictfp / (7.25f * 0.11684138f);
        float f6 = (float)vec3.\u0000, `;
        return new Vec3(f *= f4, f2 *= f5, f3 *= f6);
    }

    public static Vec3 Method_10162(Vec3 vec3, Class_570 class_570, Class_1061 class_1061, float f) {
        int n = class_570.\u0000strictfp.Method_18379();
        switch (n) {
            case -1: {
                vec3 = Class_10125.Method_10177(vec3);
                break;
            }
            case 0: {
                Class_18 class_18 = Class_18.Field_89;
                vec3 = Class_10125.Method_10161(vec3, class_18.Field_72, class_1061.Field_1130, class_1061.Method_1324() + 1.0, class_1061.Field_1106);
                break;
            }
            case 1: {
                vec3 = Class_10125.Method_10165(vec3);
            }
        }
        return vec3;
    }

    public static int Method_10163(int n) {
        return Field_10131 == null ? -1 & -1 : (n >= 0 && n <= (559 & -32689) ? Field_10131[n] & (-2130706433 & 301989887) : -1 & -1);
    }

    public static Vec3 Method_10164(Vec3 vec3, Class_561 class_561, double d, double d2, double d3) {
        if (Field_10129 == null) {
            return vec3;
        }
        int n = Class_10125.Method_10167(Field_10129, class_561, d, d2, d3, 2439 & 16423, 65 & 3625);
        int n2 = n >> (-28323 & 176) & (-15617 & 255);
        int n3 = n >> (-31576 & 18954) & (-32513 & 5375);
        int n4 = n & (767 & 29951);
        float f = (float)n2 / (0.6756757f * 377.4f);
        float f2 = (float)n3 / (21.702127f * 11.75f);
        float f3 = (float)n4 / (171.46552f * 1.4871795f);
        float f4 = (float)vec3.\u0000= final / (1.84f * 0.27173913f);
        float f5 = (float)vec3.\u0000strictfp / (9.142858f * 0.07248828f);
        float f6 = (float)vec3.\u0000, `;
        return new Vec3(f *= f4, f2 *= f5, f3 *= f6);
    }

    public static Vec3 Method_10165(Vec3 vec3) {
        return Field_10150 == null ? vec3 : Field_10150;
    }

    private static Vec3 Method_10166(Properties properties, String string) {
        int n = Class_10125.Method_10173(properties, string);
        if (n < 0) {
            return null;
        }
        int n2 = n >> (2580 & 144) & (17407 & -31489);
        int n3 = n >> (-28024 & 9323) & (255 & 20735);
        int n4 = n & (15615 & 511);
        float f = (float)n2 / (127.5f * 2.0f);
        float f2 = (float)n3 / (5.428571f * 46.973686f);
        float f3 = (float)n4 / (0.5443038f * 468.4884f);
        return new Vec3(f, f2, f3);
    }

    public static int Method_10167(int[] arrn, Class_561 class_561, double d, double d2, double d3, int n, int n2) {
        int n3;
        int n4;
        int n5;
        if (arrn == null) {
            return -1 & -1;
        }
        int n6 = Class_13337.Method_13371(d);
        int n7 = Class_13337.Method_13371(d2);
        int n8 = Class_13337.Method_13371(d3);
        int n9 = n * n2 / (-32734 & 16526);
        int n10 = 280 & 24612;
        int n11 = 2441 & 5120;
        int n12 = 11353 & 512;
        int n13 = 9858 & -16368;
        \u0000volatile ? native | 8 ] } static return void throws private native * 4 1 ] short goto " double 2 break 9 int package + { ~ % native instanceof default false 7 import ~ goto for 5 case % final transient ^ * ! new ^ . native private ` final ] 2 extends float ? boolean  native private ` final ] 2 extends float ? boolean2 = new \u0000volatile ? native | 8 ] } static return void throws private native * 4 1 ] short goto " double 2 break 9 int package + { ~ % native instanceof default false 7 import ~ goto for 5 case % final transient ^ * ! new ^ . native private ` final ] 2 extends float ? boolean(272 & 26693, 18440 & -20378, -24558 & 4549);
        for (n5 = n6 - n9; n5 <= n6 + n9; n5 += n2) {
            for (n4 = n8 - n9; n4 <= n8 + n9; n4 += n2) {
                 native private ` final ] 2 extends float ? boolean2.\u0000strictfp(n5, n7, n4);
                n3 = Class_10125.Method_10168(arrn, class_561, (Class_4751) native private ` final ] 2 extends float ? boolean2);
                n10 += n3 >> (19283 & 9244) & (1279 & -24321);
                n11 += n3 >> (10 & -15976) & (-30465 & 767);
                n12 += n3 & (767 & 13567);
                ++n13;
            }
        }
        n5 = n10 / n13;
        n4 = n11 / n13;
        n3 = n12 / n13;
        return n5 << (1042 & 4116) | n4 << (9450 & 9) | n3;
    }

    private static int Method_10168(int[] arrn, Class_561 class_561, Class_4751 class_4751) {
        Class_17281 class_17281 = class_561.Method_567(class_4751);
        double d = Class_13337.Method_13360(class_17281.Method_17407(class_4751), 0.0f, 1.0f);
        double d2 = Class_13337.Method_13360(class_17281.Method_17414(), 0.0f, 1.0f);
        int n = (int)((1.0 - d) * (9.0 * 28.333333333333332));
        int n2 = (int)((1.0 - (d2 *= d)) * (0.16417910447761194 * 1553.1818181818182));
        return arrn[n2 << (1294 & 72) | n] & (150994943 & -1795162113);
    }

    public static Vec3 Method_10169(Vec3 vec3) {
        return Field_10127 == null ? vec3 : Field_10127;
    }

    private static int Method_10170(String string, int n) {
        try {
            InputStream inputStream = Class_19426.Method_19493(new Class_2080(string));
            if (inputStream == null) {
                return n;
            }
            BufferedImage bufferedImage = ImageIO.read(inputStream);
            return bufferedImage == null ? n : bufferedImage.getHeight();
        }
        catch (IOException iOException) {
            return n;
        }
    }

    public static int Method_10171(Class_14461 class_14461, Class_3238 class_3238, Class_561 class_561, Class_4751 class_4751, Class_29859 class_29859) {
        int n;
        int n2;
        int n3;
        if (Field_10148) {
            return -1 & -1;
        }
        int[] arrn = null;
        int[] arrn2 = null;
        if (Field_10128 != null) {
            n3 = class_29859.Method_29874();
            if (n3 >= 0 && n3 < (9473 & -32350)) {
                int[] arrn3 = Field_10128[n3];
                n = -1 & -1;
                if (arrn3.length > (2073 & 257)) {
                    n2 = class_29859.Method_29885();
                    n = arrn3[n2];
                } else {
                    n = arrn3[9232 & 4354];
                }
                if (n >= 0) {
                    arrn = Field_10146[n];
                }
            }
            if (arrn != null) {
                if (Class_19426.Method_19541()) {
                    return Class_10125.Method_10176(class_3238, class_561, class_4751, arrn, arrn, 6656 & -15360, 2568 & -15983, class_29859);
                }
                return Class_10125.Method_10168(arrn, class_561, class_4751);
            }
        }
        if (!class_14461.Method_14474()) {
            return -1 & -1;
        }
        if (class_3238 == Class_9265.Field_9303) {
            return Class_10125.Method_10181(class_561, class_4751);
        }
        if (class_3238 instanceof Class_43717) {
            return Class_10125.Method_10172(class_3238, class_561, class_4751, class_29859);
        }
        n3 = Class_19426.Method_19592() ? 1 : 0;
        int n4 = 5446 & -16248;
        n = 5120 & 2065;
        n2 = 8257 & 2480;
        if (class_3238 != Class_9265.Field_9319 && class_3238 != Class_9265.Field_9278) {
            if (class_3238 == Class_9265.Field_9421) {
                n = 782 & -16254;
                n4 = Class_19426.Method_19541() ? 1 : 0;
                n2 = class_29859.Method_29885();
                if ((n2 & (135 & 5147)) == (1155 & 24629)) {
                    arrn = Field_10152;
                } else if ((n2 & (-9981 & 8707)) == (21558 & 66)) {
                    arrn = Field_10134;
                } else {
                    arrn = Field_10142;
                    arrn2 = n3 != 0 ? Field_10145 : arrn;
                }
            } else if (class_3238 == Class_9265.Field_9323) {
                n = 2434 & 17930;
                n4 = Class_19426.Method_19541() ? 1 : 0;
                arrn = Field_10142;
                arrn2 = n3 != 0 ? Field_10145 : arrn;
            }
        } else {
            n = 20495 & -20927;
            n4 = Class_19426.Method_19541() ? 1 : 0;
            arrn = Field_10151;
            arrn2 = n3 != 0 ? Field_10139 : arrn;
        }
        if (n4 != 0) {
            return Class_10125.Method_10176(class_3238, class_561, class_4751, arrn, arrn2, n, n2, class_29859);
        }
        if (arrn2 != arrn && class_561.Method_567(class_4751) == Class_17281.Field_17337) {
            arrn = arrn2;
        }
        return arrn != null ? Class_10125.Method_10168(arrn, class_561, class_4751) : -1 & -1;
    }

    public static int Method_10172(Class_3238 class_3238, Class_561 class_561, Class_4751 class_4751, Class_29859 class_29859) {
        if (Field_10144 == null) {
            return class_3238.Method_3424(class_561, class_4751);
        }
        int n = class_29859.Method_29885();
        if (n < 0) {
            n = 12545 & 1608;
        }
        if (n >= Field_10144.length) {
            n = Field_10144.length - (8243 & -26495);
        }
        return Field_10144[n];
    }

    private static int Method_10173(Properties properties, String string) {
        String string2 = properties.getProperty(string);
        if (string2 == null) {
            return -1 & -1;
        }
        try {
            int n = Integer.parseInt(string2, 529 & 11280) & (1962934271 & 16777215);
            Class_19426.Method_19497("Custom color: " + string + " = " + string2);
            return n;
        }
        catch (NumberFormatException numberFormatException) {
            Class_19426.Method_19497("Invalid custom color: " + string + " = " + string2);
            return -1 & -1;
        }
    }

    private static void Method_10174(float[][] arrf, float f, int n, int n2, float[][] arrf2) {
        int n3;
        int n4 = (int)Math.floor(f);
        if (n4 == (n3 = (int)Math.ceil(f))) {
            for (int i = -30968 & 80; i < (2064 & 8697); ++i) {
                float[] arrf3 = arrf[n + i * n2 + n4];
                float[] arrf4 = arrf2[i];
                for (int j = 90 & 10656; j < (8195 & 2699); ++j) {
                    arrf4[j] = arrf3[j];
                }
            }
        } else {
            float f2 = 1.0f - (f - (float)n4);
            float f3 = 1.0f - ((float)n3 - f);
            for (int i = 200 & 12832; i < (16564 & -20208); ++i) {
                float[] arrf5 = arrf[n + i * n2 + n4];
                float[] arrf6 = arrf[n + i * n2 + n3];
                float[] arrf7 = arrf2[i];
                for (int j = 1568 & 24578; j < (15 & 11251); ++j) {
                    arrf7[j] = arrf5[j] * f2 + arrf6[j] * f3;
                }
            }
        }
    }

    public static void Method_10175() {
        Field_10151 = null;
        Field_10147 = null;
        Field_10142 = null;
        Field_10134 = null;
        Field_10152 = null;
        Field_10139 = null;
        Field_10145 = null;
        Field_10129 = null;
        Field_10132 = null;
        Field_10143 = null;
        Field_10131 = null;
        Field_10144 = null;
        Field_10141 = null;
        Field_10140 = null;
        Field_10135 = null;
        Field_10138 = -1 & -1;
        Field_10137 = -1 & -1;
        Field_10126 = -1 & -1;
        Field_10133 = null;
        Field_10150 = null;
        Field_10127 = null;
        Field_10128 = null;
        Field_10146 = null;
        Field_10148 = 1041 & 11013;
        String string = "mcpatcher/colormap/";
        Field_10151 = Class_10125.Method_10187("textures/colormap/grass.png", 38896000 & -670482432);
        Field_10142 = Class_10125.Method_10187("textures/colormap/foliage.png", 276922740 & 1073830401);
        String[] arrstring = new String[8994 & 1031];
        arrstring[-8032 & 537] = "water.png";
        arrstring[963 & -18407] = "watercolorX.png";
        String[] arrstring2 = arrstring;
        Field_10147 = Class_10125.Method_10183(string, arrstring2, 1150005400 & 139790116);
        if (Class_19426.Method_19499()) {
            String[] arrstring3 = new String[-28566 & 899];
            arrstring3[-30703 & 1536] = "pine.png";
            arrstring3[129 & -32731] = "pinecolor.png";
            String[] arrstring4 = arrstring3;
            Field_10152 = Class_10125.Method_10183(string, arrstring4, 50406081 & 405866496);
            String[] arrstring5 = new String[-15230 & 546];
            arrstring5[164 & 5643] = "birch.png";
            arrstring5[129 & 19535] = "birchcolor.png";
            String[] arrstring6 = arrstring5;
            Field_10134 = Class_10125.Method_10183(string, arrstring6, -2147123072 & 142693922);
            String[] arrstring7 = new String[530 & -14330];
            arrstring7[320 & -24446] = "swampgrass.png";
            arrstring7[129 & 30481] = "swampgrasscolor.png";
            String[] arrstring8 = arrstring7;
            Field_10139 = Class_10125.Method_10183(string, arrstring8, 138483746 & -1340800947);
            String[] arrstring9 = new String[17682 & 14438];
            arrstring9[9230 & -11775] = "swampfoliage.png";
            arrstring9[16669 & 4161] = "swampfoliagecolor.png";
            String[] arrstring10 = arrstring9;
            Field_10145 = Class_10125.Method_10183(string, arrstring10, 145336068 & 1346453682);
            String[] arrstring11 = new String[26674 & -30909];
            arrstring11[-13822 & 5] = "sky0.png";
            arrstring11[519 & 24705] = "skycolor0.png";
            String[] arrstring12 = arrstring11;
            Field_10129 = Class_10125.Method_10183(string, arrstring12, 68485184 & -1995897584);
            String[] arrstring13 = new String[194 & 287];
            arrstring13[-28511 & 16642] = "fog0.png";
            arrstring13[9993 & 17] = "fogcolor0.png";
            String[] arrstring14 = arrstring13;
            Field_10132 = Class_10125.Method_10183(string, arrstring14, -1807514438 & 555823361);
            String[] arrstring15 = new String[8326 & 2050];
            arrstring15[4361 & 2706] = "underwater.png";
            arrstring15[-30975 & 18513] = "underwatercolor.png";
            String[] arrstring16 = arrstring15;
            Field_10143 = Class_10125.Method_10183(string, arrstring16, 268536128 & -2029448541);
            String[] arrstring17 = new String[-16322 & 67];
            arrstring17[-30126 & 5160] = "redstone.png";
            arrstring17[8705 & -12279] = "redstonecolor.png";
            String[] arrstring18 = arrstring17;
            Field_10131 = Class_10125.Method_10183(string, arrstring18, 280 & -13648);
            String[] arrstring19 = new String[-31725 & 46];
            arrstring19[576 & 2097] = "stem.png";
            arrstring19[4099 & 17925] = "stemcolor.png";
            String[] arrstring20 = arrstring19;
            Field_10144 = Class_10125.Method_10183(string, arrstring20, 13 & -29574);
            String[] arrstring21 = new String[42 & 4691];
            arrstring21[-32215 & 21590] = "myceliumparticle.png";
            arrstring21[3 & -16039] = "myceliumparticlecolor.png";
            String[] arrstring22 = arrstring21;
            Field_10141 = Class_10125.Method_10183(string, arrstring22, -1 & -1);
            int[][] arrarrn = new int[-28045 & 2051][];
            Field_10140 = new float[-28669 & 27923][][];
            Field_10135 = new int[9379 & 6475];
            for (int i = 16706 & 4613; i < arrarrn.length; ++i) {
                String string2 = "mcpatcher/lightmap/world" + (i - (12835 & 13)) + ".png";
                arrarrn[i] = Class_10125.Method_10187(string2, -1 & -1);
                if (arrarrn[i] != null) {
                    Class_10125.Field_10140[i] = Class_10125.Method_10179(arrarrn[i]);
                }
                Class_10125.Field_10135[i] = Class_10125.Method_10170(string2, -30544 & 24608);
            }
            Class_10125.Method_10159("mcpatcher/color.properties");
            Class_10125.Method_10180();
        }
    }

    private static int Method_10176(Class_3238 class_3238, Class_561 class_561, Class_4751 class_4751, int[] arrn, int[] arrn2, int n, int n2, Class_29859 class_29859) {
        int n3;
        int n4;
        int n5 = 17456 & -32766;
        int n6 = 9564 & 2049;
        int n7 = -25407 & 25122;
        int n8 = class_4751.\u0000= final();
        int n9 = class_4751.\u0000, `();
        int n10 = class_4751.\u0000strictfp();
        \u0000volatile ? native | 8 ] } static return void throws private native * 4 1 ] short goto " double 2 break 9 int package + { ~ % native instanceof default false 7 import ~ goto for 5 case % final transient ^ * ! new ^ . native private ` final ] 2 extends float ? boolean  native private ` final ] 2 extends float ? boolean2 = class_29859.Method_29876();
        for (n3 = n8 - (5263 & 8801); n3 <= n8 + (17419 & -24015); ++n3) {
            for (n4 = n10 - (25731 & 6193); n4 <= n10 + (8217 & -26207); ++n4) {
                 native private ` final ] 2 extends float ? boolean2.\u0000strictfp(n3, n9, n4);
                int[] arrn3 = arrn;
                if (arrn2 != arrn && class_561.Method_567((Class_4751) native private ` final ] 2 extends float ? boolean2) == Class_17281.Field_17337) {
                    arrn3 = arrn2;
                }
                int n11 = 8288 & -9213;
                if (arrn3 == null) {
                    switch (n) {
                        case 1: {
                            n11 = class_561.Method_567((Class_4751) native private ` final ] 2 extends float ? boolean2).Method_17379((Class_4751) native private ` final ] 2 extends float ? boolean2);
                            break;
                        }
                        case 2: {
                            if ((n2 & (28739 & 1415)) == (17 & -29179)) {
                                n11 = Class_12135.Method_12142();
                                break;
                            }
                            if ((n2 & (9219 & -32697)) == (7247 & 25218)) {
                                n11 = Class_12135.Method_12138();
                                break;
                            }
                            n11 = class_561.Method_567((Class_4751) native private ` final ] 2 extends float ? boolean2).Method_17403((Class_4751) native private ` final ] 2 extends float ? boolean2);
                            break;
                        }
                        default: {
                            n11 = class_3238.Method_3424(class_561, (Class_4751) native private ` final ] 2 extends float ? boolean2);
                            break;
                        }
                    }
                } else {
                    n11 = Class_10125.Method_10168(arrn3, class_561, (Class_4751) native private ` final ] 2 extends float ? boolean2);
                }
                n5 += n11 >> (2227 & 1052) & (1791 & -15873);
                n6 += n11 >> (328 & 8) & (-28417 & 3327);
                n7 += n11 & (17919 & 255);
            }
        }
        n3 = n5 / (237 & 4617);
        n4 = n6 / (681 & 15);
        int n12 = n7 / (3085 & 4667);
        return n3 << (-32680 & 7186) | n4 << (9227 & 296) | n12;
    }

    public static Vec3 Method_10177(Vec3 vec3) {
        return Field_10133 == null ? vec3 : Field_10133;
    }

    private static void Method_10178(Properties properties, String string) {
        String string2;
        Field_10128 = new int[1795 & -32328][-28607 & 19];
        for (int i = -32682 & 8704; i < (8523 & -16092); ++i) {
            Class_10125.Field_10128[i][8276 & 21762] = -1 & -1;
        }
        String string3 = "palette.block.";
        HashMap<Object, String> hashMap = new HashMap<Object, String>();
        for (Object object : properties.keySet()) {
            string2 = properties.getProperty((String)object);
            if (!((String)object).startsWith(string3)) continue;
            hashMap.put(object, string2);
        }
        String[] arrstring = hashMap.keySet().toArray(new String[hashMap.size()]);
        Field_10146 = new int[arrstring.length][];
        for (int i = -29919 & 14; i < arrstring.length; ++i) {
            string2 = arrstring[i];
            String string4 = properties.getProperty(string2);
            Class_19426.Method_19497("Block palette: " + string2 + " = " + string4);
            String string5 = string2.substring(string3.length());
            String string6 = Class_21583.Method_21608(string);
            string5 = Class_21583.Method_21606(string5, string6);
            int[] arrn = Class_10125.Method_10187(string5, 110183425 & -666041984);
            Class_10125.Field_10146[i] = arrn;
            String[] arrstring2 = Class_19426.Method_19561(string4, " ,;");
            for (int j = 9858 & 2081; j < arrstring2.length; ++j) {
                int n;
                String string7 = arrstring2[j];
                int n2 = -1 & -1;
                if (string7.contains(":")) {
                    String[] arrstring3 = Class_19426.Method_19561(string7, ":");
                    string7 = arrstring3[-28413 & 10448];
                    String string8 = arrstring3[20617 & -22971];
                    n2 = Class_19426.Method_19502(string8, -1 & -1);
                    if (n2 < 0 || n2 > (-31665 & 8591)) {
                        Class_19426.Method_19497("Invalid block metadata: " + string7 + " in palette: " + string2);
                        continue;
                    }
                }
                if ((n = Class_19426.Method_19502(string7, -1 & -1)) >= 0 && n <= (-5377 & 4351)) {
                    if (n == Class_3238.Method_3435(Class_9265.Field_9319) || n == Class_3238.Method_3435(Class_9265.Field_9278) || n == Class_3238.Method_3435(Class_9265.Field_9421) || n == Class_3238.Method_3435(Class_9265.Field_9323)) continue;
                    if (n2 == (-1 & -1)) {
                        Class_10125.Field_10128[n][4409 & 3138] = i;
                        continue;
                    }
                    if (Field_10128[n].length < (-29104 & 18)) {
                        Class_10125.Field_10128[n] = new int[10769 & 280];
                        Arrays.fill(Field_10128[n], -1 & -1);
                    }
                    Class_10125.Field_10128[n][n2] = i;
                    continue;
                }
                Class_19426.Method_19497("Invalid block index: " + n + " in palette: " + string2);
            }
        }
    }

    private static float[][] Method_10179(int[] arrn) {
        float[][] arrf = new float[arrn.length][1547 & 24579];
        for (int i = 616 & 17409; i < arrn.length; ++i) {
            int n = arrn[i];
            float f = (float)(n >> (26 & -29872) & (-31489 & 6911)) / (0.76119405f * 335.0f);
            float f2 = (float)(n >> (6154 & 9480) & (2303 & 25599)) / (1373.0769f * 0.18571429f);
            float f3 = (float)(n & (255 & 24831)) / (1.875f * 136.0f);
            float[] arrf2 = arrf[i];
            arrf2[6453 & 512] = f;
            arrf2[5221 & -32639] = f2;
            arrf2[458 & 6662] = f3;
        }
        return arrf;
    }

    public static void Method_10180() {
        Field_10148 = Field_10134 == null && Field_10152 == null && Field_10139 == null && Field_10145 == null && Field_10128 == null && Class_19426.Method_19592() && Class_19426.Method_19541() ? 1297 & -12063 : 8194 & -9496;
    }

    public static int Method_10181(Class_561 class_561, Class_4751 class_4751) {
        return Field_10138 < 0 ? Class_9265.Field_9303.Method_3424(class_561, class_4751) : Field_10138;
    }

    public static void Method_10182(Class_42218 class_42218, Class_561 class_561, double d, double d2, double d3) {
        if (Field_10147 != null) {
            int n = Class_10125.Method_10154(Class_9265.Field_9286, class_561, new Class_4751(d, d2, d3));
            int n2 = n >> (-19440 & 661) & (18175 & 6399);
            int n3 = n >> (11528 & 524) & (3327 & 255);
            int n4 = n & (-12033 & 255);
            float f = (float)n2 / (133.875f * 1.9047619f);
            float f2 = (float)n3 / (4.733333f * 53.87324f);
            float f3 = (float)n4 / (309.64285f * 0.8235294f);
            if (Field_10137 >= 0) {
                int n5 = Field_10137 >> (48 & -9199) & (3327 & 17407);
                int n6 = Field_10137 >> (8762 & 6280) & (5631 & 10495);
                int n7 = Field_10137 & (8447 & 2559);
                f *= (float)n5 / (615.7317f * 0.41414142f);
                f2 *= (float)n6 / (0.21052632f * 1211.25f);
                f3 *= (float)n7 / (44.134617f * 5.7777777f);
            }
            class_42218.Method_42242(f, f2, f3);
        }
    }

    private static int[] Method_10183(String string, String[] arrstring, int n) {
        for (int i = -30188 & 25792; i < arrstring.length; ++i) {
            String string2 = arrstring[i];
            string2 = string + string2;
            int[] arrn = Class_10125.Method_10187(string2, n);
            if (arrn == null) continue;
            return arrn;
        }
        return null;
    }

    public static void Method_10184(Class_42218 class_42218, Class_561 class_561, double d, double d2, double d3) {
        int n;
        int n2;
        Class_3436 class_3436;
        if (Field_10131 != null && (n2 = Class_10125.Method_10163(n = Class_10125.Method_10155(class_3436 = class_561.Method_568(new Class_4751(d, d2, d3)), -13889 & 591))) != (-1 & -1)) {
            int n3 = n2 >> (-32336 & 29) & (1279 & -24321);
            int n4 = n2 >> (40 & 16968) & (5375 & -23553);
            int n5 = n2 & (-24321 & 7935);
            float f = (float)n3 / (1.5833334f * 161.05263f);
            float f2 = (float)n4 / (0.46153846f * 552.5f);
            float f3 = (float)n5 / (108.87641f * 2.3421052f);
            class_42218.Method_42242(f, f2, f3);
        }
    }

    private static int Method_10185(Properties properties, String[] arrstring) {
        for (int i = -32501 & 5120; i < arrstring.length; ++i) {
            String string = arrstring[i];
            int n = Class_10125.Method_10173(properties, string);
            if (n < 0) continue;
            return n;
        }
        return -1 & -1;
    }

    public static Vec3 Method_10186(Vec3 vec3, Class_570 class_570, Class_1061 class_1061, float f) {
        int n = class_570.\u0000strictfp.Method_18379();
        switch (n) {
            case 0: {
                Class_18 class_18 = Class_18.Field_89;
                vec3 = Class_10125.Method_10164(vec3, class_18.Field_72, class_1061.Field_1130, class_1061.Method_1324() + 1.0, class_1061.Field_1106);
                break;
            }
            case 1: {
                vec3 = Class_10125.Method_10169(vec3);
            }
        }
        return vec3;
    }

    private static int[] Method_10187(String string, int n) {
        try {
            Class_2080 class_2080 = new Class_2080(string);
            InputStream inputStream = Class_19426.Method_19493(class_2080);
            if (inputStream == null) {
                return null;
            }
            int[] arrn = Class_18695.Method_18706(Class_19426.Method_19564(), class_2080);
            if (arrn == null) {
                return null;
            }
            if (n > 0 && arrn.length != n) {
                Class_19426.Method_19497("Invalid custom colors length: " + arrn.length + ", path: " + string);
                return null;
            }
            Class_19426.Method_19497("Loading custom colors: " + string);
            return arrn;
        }
        catch (FileNotFoundException fileNotFoundException) {
            return null;
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return null;
        }
    }
}

