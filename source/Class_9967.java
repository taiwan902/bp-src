/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  internal.org.lwjgl.opengl.GL11
 */
import internal.org.lwjgl.opengl.GL11;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_9967 {
    private static Class_39702 Field_9968;
    private static long[] Field_9969;
    private static long[] Field_9970;
    private static Class_18 Field_9971;
    public static Class_35679 Field_9972;
    public static Class_35679 Field_9973;
    private static long Field_9974;
    private static long Field_9975;
    private static boolean[] Field_9976;
    public static Class_35679 Field_9977;
    private static long Field_9978;
    private static long[] Field_9979;
    private static long[] Field_9980;
    private static long Field_9981;
    private static long Field_9982;
    private static long[] Field_9983;
    public static boolean Field_9984;
    private static int Field_9985;
    public static Class_35679 Field_9986;
    private static long Field_9987;
    private static int Field_9988;
    private static long[] Field_9989;
    public static Class_35679 Field_9990;
    private static long Field_9991;
    private static long[] Field_9992;
    private static Class_2767 Field_9993;
    private static long Field_9994;
    private static long[] Field_9995;
    public static Class_35679 Field_9996;
    public static Class_35679 Field_9997;

    private static long Method_9998(int n, long l, int n2, int n3, int n4, float f, Class_22385 class_22385) {
        long l2 = l / (1077874500L & 7666654150431813056L);
        if (l2 < (5719936009101411107L & -5719936010242871101L)) {
            return 6466227650490897957L & 262272L;
        }
        class_22385.Method_22443((float)n + 4.0625f * 0.12307692f, f - (float)l2 + 0.29591838f * 1.6896552f, 0.0).Method_22424(n2, n3, n4, 255 & 20735).Method_22451();
        class_22385.Method_22443((float)n + 9.444445f * 0.052941177f, f + 1.5749999f * 0.31746033f, 0.0).Method_22424(n2, n3, n4, 4607 & 17663).Method_22451();
        return l2;
    }

    public static void Method_9999(Class_31566 class_31566) {
        if (Field_9968 != null && Class_9967.Field_9968.Field_39773) {
            int n;
            long l = Class_9967.Method_10003();
            Class_16867.Method_16983(2433 & 880);
            Class_16867.Method_16934(14177 & 5915);
            Class_16867.Method_16961();
            Class_16867.Method_16950();
            Class_16867.Method_16962();
            Class_16867.Method_16911(0.0, Class_9967.Field_9971.Field_80, Class_9967.Field_9971.Field_44, 0.0, 0.0989010989010989 * 10111.111111111111, 2692.3076923076924 * 1.1142857142857143);
            Class_16867.Method_16934(16128 & -10488);
            Class_16867.Method_16961();
            Class_16867.Method_16962();
            Class_16867.Method_16943(0.0f, 0.0f, -1578.9474f * 1.2666667f);
            GL11.glLineWidth((float)1.0f);
            Class_16867.Method_16922();
            Class_7644 class_7644 = Class_7644.Method_7649();
            Class_22385 class_22385 = class_7644.Method_7648();
            class_22385.Method_22417(4121 & 515, Class_29585.Field_29601);
            for (int i = 21568 & 11170; i < Field_9969.length; ++i) {
                n = (i - Field_9988 & Field_9969.length - (18001 & 6533)) * (-15260 & 117) / Field_9969.length;
                n += -32545 & 7323;
                float f = Class_9967.Field_9971.Field_44;
                long l2 = 2532638156538905264L & 1480598542L;
                if (Field_9976[i]) {
                    Class_9967.Method_9998(i, Field_9969[i], n, n / (16514 & -32478), 6160 & 9868, f, class_22385);
                    continue;
                }
                Class_9967.Method_9998(i, Field_9969[i], n, n, n, f, class_22385);
                f -= (float)Class_9967.Method_9998(i, Field_9992[i], n / (394 & -10238), n / (20482 & -31485), n / (17954 & 147), f, class_22385);
                f -= (float)Class_9967.Method_9998(i, Field_9979[i], 4368 & -24509, n, 3856 & 12486, f, class_22385);
                f -= (float)Class_9967.Method_9998(i, Field_9989[i], n, n, 4110 & 3328, f, class_22385);
                f -= (float)Class_9967.Method_9998(i, Field_9980[i], n, -26605 & 8192, 9696 & -32252, f, class_22385);
                f -= (float)Class_9967.Method_9998(i, Field_9970[i], n, 1120 & 2432, n, f, class_22385);
                f -= (float)Class_9967.Method_9998(i, Field_9983[i], 4117 & 2368, 7296 & 8554, n, f, class_22385);
                float f2 = f - (float)Class_9967.Method_9998(i, Field_9995[i], -9710 & 76, n, n, f, class_22385);
            }
            class_7644.Method_7647();
            Class_16867.Method_16934(22313 & 7937);
            Class_16867.Method_16945();
            Class_16867.Method_16934(30465 & 7960);
            Class_16867.Method_16945();
            Class_16867.Method_16965();
            float f = 1.0f - (float)((double)(System.currentTimeMillis() - Field_9981) / (0.8636363636363636 * 1157.8947368421052));
            f = Class_19426.Method_19565(f, 0.0f, 1.0f);
            n = (int)(1143.6364f * 0.14864865f + f * (2.6666667f * 31.875f));
            int n2 = (int)(0.07317073f * 1366.6667f + f * (1.1944444f * 46.046513f));
            int n3 = (int)(2.1034484f * 4.754098f + f * (1.48f * 6.756757f));
            int n4 = n << (19602 & -23695) | n2 << (1336 & 10760) | n3;
            int n5 = (5697 & 2608) / class_31566.Method_31572() + (18898 & 38);
            int n6 = Class_9967.Field_9971.Field_44 / class_31566.Method_31572() - (12361 & -16100);
            Class_45406 class_45406 = Class_9967.Field_9971.Field_105;
            Class_45406.\u0000, `((int)(n5 - (-32767 & 17953)), (int)(n6 - (-30655 & 4261)), (int)(n5 + (20790 & -21966)), (int)(n6 + (-32022 & 4107)), (int)(-1336651688 & -1604824495));
            Class_9967.Field_9971.Field_27.Method_28692(" " + Field_9985 + " MB/s", n5, n6, n4);
            Field_9982 = System.nanoTime() - l;
        }
    }

    public static boolean Method_10000() {
        return Field_9984;
    }

    public static void Method_10001() {
        if (Field_9971 == null) {
            Field_9971 = Class_18.Field_89;
            Field_9968 = Class_9967.Field_9971.Field_84;
            Field_9993 = Class_9967.Field_9971.Field_25;
        }
        if (Class_9967.Field_9968.Field_39781 && Class_9967.Field_9968.Field_39773) {
            Field_9984 = 16645 & -28519;
            long l = Class_9967.Method_10003();
            if (Field_9975 == (-1L & -1L)) {
                Field_9975 = l;
            } else {
                int n = Field_9988 & Field_9969.length - (-29695 & 269);
                Field_9988 += 33 & 9537;
                boolean bl = Class_9967.Method_10005();
                Class_9967.Field_9969[n] = l - Field_9975 - Field_9982;
                Class_9967.Field_9995[n] = Class_9967.Field_9997.Field_35681;
                Class_9967.Field_9983[n] = Class_9967.Field_9977.Field_35681;
                Class_9967.Field_9970[n] = Class_9967.Field_9973.Field_35681;
                Class_9967.Field_9980[n] = Class_9967.Field_9990.Field_35681;
                Class_9967.Field_9989[n] = Class_9967.Field_9996.Field_35681;
                Class_9967.Field_9979[n] = Class_9967.Field_9972.Field_35681;
                Class_9967.Field_9992[n] = Class_9967.Field_9986.Field_35681;
                Class_9967.Field_9976[n] = bl;
                Class_35679.Method_35686(Field_9997);
                Class_35679.Method_35686(Field_9977);
                Class_35679.Method_35686(Field_9996);
                Class_35679.Method_35686(Field_9990);
                Class_35679.Method_35686(Field_9973);
                Class_35679.Method_35686(Field_9972);
                Class_35679.Method_35686(Field_9986);
                Field_9975 = Class_9967.Method_10003();
            }
        } else {
            Field_9984 = 16642 & 4164;
            Field_9975 = -1L & -1L;
        }
    }

    private static long Method_10002() {
        Runtime runtime = Runtime.getRuntime();
        return runtime.totalMemory() - runtime.freeMemory();
    }

    public static long Method_10003() {
        return System.nanoTime();
    }

    private void Method_10004() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    static {
        Field_9984 = 4096 & -32474;
        Field_9997 = new Class_35679();
        Field_9977 = new Class_35679();
        Field_9973 = new Class_35679();
        Field_9990 = new Class_35679();
        Field_9996 = new Class_35679();
        Field_9972 = new Class_35679();
        Field_9986 = new Class_35679();
        Field_9969 = new long[17160 & -26048];
        Field_9995 = new long[-15872 & 9984];
        Field_9983 = new long[-19933 & 20048];
        Field_9970 = new long[8713 & 22176];
        Field_9980 = new long[9152 & 1568];
        Field_9989 = new long[776 & 19028];
        Field_9979 = new long[-22784 & 16922];
        Field_9992 = new long[-32124 & 1538];
        Field_9976 = new boolean[9955 & 768];
        Field_9988 = 9363 & -16032;
        Field_9975 = -1L & -1L;
        Field_9982 = 39059462L & 2732693160990928561L;
        Field_9981 = System.currentTimeMillis();
        Field_9994 = Class_9967.Method_10002();
        Field_9978 = Field_9981;
        Field_9987 = Field_9994;
        Field_9991 = 1359045137L & -1280991619689968191L;
        Field_9974 = 604635693L & 268484626L;
        Field_9985 = 2192 & -28658;
    }

    public static boolean Method_10005() {
        long l = System.currentTimeMillis();
        long l2 = Class_9967.Method_10002();
        int n = 16424 & 4352;
        if (l2 < Field_9987) {
            double d = (double)Field_9974 / (500000.0 * 2.0);
            double d2 = (double)Field_9991 / (293.1034482758621 * 3.411764705882353);
            int n2 = (int)(d / d2);
            if (n2 > 0) {
                Field_9985 = n2;
            }
            Field_9981 = l;
            Field_9994 = l2;
            Field_9991 = 6696986L & 536936448L;
            Field_9974 = -2304938323594606591L & 525312L;
            n = 24769 & 2341;
        } else {
            Field_9991 = l - Field_9981;
            Field_9974 = l2 - Field_9994;
        }
        Field_9978 = l;
        Field_9987 = l2;
        return n != 0;
    }
}

