/*
 * Decompiled with CFR 0.145.
 */
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import javax.imageio.ImageIO;

public class Class_20273 {
    static final boolean Field_20274 = Class_20273.class.desiredAssertionStatus() == false ? 9233 & 17281 : 25364 & 34;
    protected static Class_9931[] Field_20275;
    protected static Class_9931[] Field_20276;
    protected static float[] Field_20277;
    public static Class_43180[] Field_20278;
    private static AtomicReference Field_20279;

    protected static synchronized void Method_20280() {
        Class_29854 class_29854 = new Class_29854();
        class_29854.setDaemon((-32621 & 4193) != 0);
        class_29854.setPriority(1025 & 9009);
        Field_20279.set(class_29854);
        class_29854.start();
    }

    private static String Method_20281(String string) {
        int n = 4581;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_20273.class, 11);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_20282(String string) {
        int n = 19226;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_20273.class, 7);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_20283(String string) {
        int n = 32414;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_20273.class, 5);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static int Method_20284(int n, int n2, int n3) {
        return n > n3 ? n3 : (n < n2 ? n2 : n);
    }

    private static String Method_20285(String string) {
        int n = 24019;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_20273.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_20286(String string) {
        int n = 9515;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_20273.class, 6);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static int Method_20287(int[] arrn, int n, int n2, float f, float f2, float f3, float f4) {
        if (f != f3 && f2 != f4) {
            int n3 = (int)Math.floor((float)n * Math.max(0.0f, f < f3 ? f : f3));
            int n4 = (int)Math.floor((float)n2 * Math.max(0.0f, f2 < f4 ? f2 : f4));
            int n5 = (int)Math.floor((float)n * Math.min(1.0f, f < f3 ? f3 : f));
            int n6 = (int)Math.floor((float)n2 * Math.min(1.0f, f2 < f4 ? f4 : f2));
            long l = 6434469593820126573L & 33587202L;
            long l2 = 554244648L & 73400517L;
            long l3 = 1090787506L & 80888840L;
            long l4 = -8898415495176608229L & 8898415494541936640L;
            for (int i = n4; i < n6; ++i) {
                for (int j = n3; j < n5; ++j) {
                    int n7 = arrn[i * n + j];
                    int n8 = n7 >> (6394 & -23523) & (1023 & 18687);
                    l += (long)n8;
                    l2 += (long)((n7 >> (592 & 10389) & (-25857 & 1279)) * n8);
                    l3 += (long)((n7 >> (536 & -31538) & (10495 & 511)) * n8);
                    l4 += (long)((n7 >> (2846 & 0) & (20735 & -30721)) * n8);
                }
            }
            if (l == (1260650542L & 8629249L)) {
                return -1593892609 & 1509918975;
            }
            double d = 1.0 / (double)l;
            l2 = Math.min(9471 & -26369, Math.max(1801 & -32768, (int)((double)l2 * d)));
            l3 = Math.min(17663 & 2303, Math.max(-24445 & 17940, (int)((double)l3 * d)));
            l4 = Math.min(-32513 & 2303, Math.max(3704 & 4, (int)((double)l4 * d)));
            return (int)((l /= (long)arrn.length) << (1048 & 31386) | l2 << (29208 & -32654) | l3 << (21769 & -32712) | l4);
        }
        return -1661009665 & 1124022783;
    }

    private static Class_43180[] Method_20288() {
        int n;
        Class_4403 class_4403 = (Class_4403)Class_3238.Method_3341("flowing_water");
        Class_4458 class_4458 = (Class_4458)Class_3238.Method_3341("water_still");
        Thread thread = Thread.currentThread();
        Class_279 class_279 = Class_18.Field_89.Method_208();
        Class_43180[] arrclass_43180 = Field_20278 != null ? Arrays.copyOf(Field_20278, 271688325 & -2013181886) : new Class_43180[-1942412224 & 1074069537];
        int n2 = -32256 & 3366;
        String string = null;
        BufferedImage bufferedImage = null;
        int[] arrn = null;
        int n3 = 24712 & 2673;
        int n4 = 128 & -32668;
        int n5 = 10560 & -14824;
        int n6 = 4 & 9888;
        HashMap<Class_9931, Object> hashMap = new HashMap<Class_9931, Object>();
        Class_9931[] arrclass_9931 = Field_20275;
        int n7 = arrclass_9931.length;
        for (n = 4364 & 2065; n < n7; ++n) {
            Object object;
            Class_9931 class_9931;
            Object object2;
            block42 : {
                class_9931 = arrclass_9931[n];
                if (Field_20279.get() != thread) break;
                if (!class_9931.Field_9939.equals(string)) {
                    string = class_9931.Field_9939;
                    object2 = Class_20273.Method_20289("textures/blocks/", string) + ".png";
                    try {
                        object = new Class_2080((String)object2);
                        Class_9953 class_9953 = class_279.Method_282((Class_2080)object);
                        bufferedImage = ImageIO.read(class_9953.Method_9958());
                        n2 = 8326 & -32256;
                        n3 = bufferedImage.getWidth();
                        n4 = bufferedImage.getHeight();
                        n5 = n3;
                        n6 = n3;
                        arrn = Class_20273.Method_20291(bufferedImage, class_9931.Field_9935, null);
                        break block42;
                    }
                    catch (IOException iOException) {
                        n2 = 1157 & -6111;
                        continue;
                    }
                }
                if (n2 != 0) continue;
            }
            object2 = null;
            switch (class_9931.Field_9938) {
                default: {
                    object = class_9931.Field_9942 instanceof Class_26134 ? (Class_26134)((Object)class_9931.Field_9942) : Class_26134.Field_26144;
                    int n8 = Class_20273.Method_20287(arrn, n5, n6, class_9931.Field_9941, class_9931.Field_9937, class_9931.Field_9936, class_9931.Field_9943);
                    object2 = new Class_43180(n8, (Class_26134)((Object)object));
                    break;
                }
                case 1: {
                    int n9 = Class_20273.Method_20287(arrn, n5, n6, class_9931.Field_9941, class_9931.Field_9937, class_9931.Field_9936, class_9931.Field_9943);
                    if ((n9 & (-14642240 & -11646952)) == 0) break;
                    int n10 = Math.max(n9 >>> (16440 & 9502), 8246 & -12623) << (-32742 & 572);
                    n9 = n9 & (587202559 & -2130706433) | n10;
                    object2 = new Class_43180(n9, class_9931.Field_9942 instanceof Class_26134 ? (Class_26134)((Object)class_9931.Field_9942) : Class_26134.Field_26144);
                    break;
                }
                case 2: {
                    int n11;
                    int n12;
                    int n13;
                    int n14 = Class_20273.Method_20287(arrn, n5, n6, 4.6666665f * 0.09375f, 0.8556701f * 0.5112952f, 0.09677419f * 5.8125f, 0.90217394f * 0.62349397f);
                    int n15 = Class_20273.Method_20287(arrn, n5, n6, 0.0625f * 6.0f, 5.5f * 0.06818182f, 2.9473684f * 0.21205357f, 0.37878788f * 1.65f);
                    int n16 = n14 >> (24 & -27940) & (6655 & -16129);
                    int n17 = n15 >> (7192 & 344) & (4351 & 3583);
                    int n10 = n16 + n17;
                    if (n10 != 0) {
                        n12 = (n14 * n16 + (n15 >> (-16291 & 690) & (-16129 & 6655)) * n17) / n10;
                        n13 = ((n14 >> (9004 & 21577) & (4351 & 8447)) * n16 + (n15 >> (-28100 & 1288) & (1279 & 8447)) * n17) / n10;
                        n11 = ((n14 >> (2368 & 30220) & (2303 & -28417)) * n16 + (n15 >> (600 & 16384) & (767 & 6655)) * n17) / n10;
                        object2 = new Class_43180(-2138826728 & -1323301568 | n12 << (8208 & -25192) | n13 << (-4950 & 4617) | n11, Class_26134.Field_26144);
                        break;
                    }
                    n14 = Class_20273.Method_20287(arrn, n5, n6, 0.7311828f * 0.34191176f, 0.70370376f * 0.35526314f, 1.2615385f * 0.59451216f, 0.72761196f * 1.0307692f);
                    n16 = n14 >> (153 & -21956) & (1279 & -7681);
                    n10 = n16 + (n17 = (n15 = Class_20273.Method_20287(arrn, n5, n6, 0.0f, 0.0f, 1.0f, 1.0f)) >> (121 & 16408) & (2303 & 22271));
                    if (n10 == 0) break;
                    n12 = ((n14 >> (-5351 & 1142) & (16639 & -27905)) * n16 + (n15 >> (14106 & 2129) & (3071 & 255)) * n17) / n10;
                    n13 = ((n14 >> (11 & 4456) & (17151 & 511)) * n16 + (n15 >> (-30680 & 16733) & (1535 & 255)) * n17) / n10;
                    n11 = ((n14 >> (9504 & 4616) & (12543 & -30465)) * n16 + (n15 >> (144 & 18688) & (-32513 & 2815)) * n17) / n10;
                    object2 = new Class_43180(-1871593983 & -2080374768 | n12 << (-30700 & 18043) | n13 << (9323 & 2072) | n11, Class_26134.Field_26144);
                    break;
                }
                case 3: {
                    object2 = new Class_43180(Class_20273.Method_20287(arrn, n5, n6, class_9931.Field_9941, class_9931.Field_9937, class_9931.Field_9936, class_9931.Field_9943), Class_26134.Field_26144);
                    break;
                }
                case 4: {
                    object = class_9931.Field_9942 != class_4458 && class_9931.Field_9942 != class_4403 ? Class_26134.Field_26144 : Class_26134.Field_26135;
                    object2 = new Class_43180(Class_20273.Method_20287(arrn, n5, n6, class_9931.Field_9941, class_9931.Field_9937, class_9931.Field_9936, class_9931.Field_9943), (Class_26134)((Object)object));
                    break;
                }
                case 5: {
                    int n18 = class_9931.Field_9942 instanceof Integer ? (Integer)class_9931.Field_9942 : 168 & 4098;
                    float f = (float)n18 / (14.142858f * 1.060606f);
                    int n19 = Class_20273.Method_20287(arrn, n5, n6, class_9931.Field_9941, class_9931.Field_9937, class_9931.Field_9936, class_9931.Field_9943);
                    if ((n19 & (-16575232 & -6282701)) == 0) break;
                    int n10 = Math.max(n19 >> (2105 & 9624) & (17151 & 5375), 4204 & -31250);
                    int n12 = (int)((float)(n19 >> (5904 & 18454) & (17663 & 255)) * Math.max(0.21958762f * 1.3661972f, f * (0.33f * 1.8181819f) + 2.3846154f * 0.16774194f));
                    int n13 = (int)((float)(n19 >> (-27972 & 11337) & (-7425 & 2559)) * Math.max(0.0f, f * f * (1.117647f * 0.6263158f) - 3.1052632f * 0.16101694f));
                    object2 = new Class_43180(n10 << (2076 & 8344) | n12 << (-18319 & 28) | n13 << (-20456 & 18057), Class_26134.Field_26144);
                    break;
                }
                case 6: {
                    int n20 = Class_20273.Method_20287(arrn, n5, n6, class_9931.Field_9941, class_9931.Field_9937, class_9931.Field_9936, class_9931.Field_9943);
                    if ((n20 & (-12352416 & -6524904)) == 0) break;
                    int n10 = Math.max(n20 >>> (-15335 & 6300), -7646 & 160) << (792 & -24550);
                    object2 = new Class_43180(n20 & (822083583 & 167772159) | n10, Class_26134.Field_26144);
                    break;
                }
                case 7: {
                    object2 = new Class_43180(Class_20273.Method_20287(arrn, n5, n6, class_9931.Field_9941, class_9931.Field_9937, class_9931.Field_9936, class_9931.Field_9943), Class_26134.Field_26144);
                    break;
                }
                case 8: {
                    int n21 = Class_20273.Method_20287(arrn, n5, n6, class_9931.Field_9941, class_9931.Field_9937, class_9931.Field_9936, class_9931.Field_9943);
                    if ((n21 & (-8116224 & -16756540)) == 0) break;
                    int n10 = Math.min(n21 >>> (89 & 20760), 13480 & 568) << (12316 & 3866);
                    object2 = new Class_43180(n21 & (1627389951 & 167772159) | n10, Class_26134.Field_26144);
                    break;
                }
                case 9: {
                    object2 = new Class_43180(Class_20273.Method_20287(arrn, n5, n6, class_9931.Field_9941, class_9931.Field_9937, class_9931.Field_9936, class_9931.Field_9943), Class_26134.Field_26144);
                    break;
                }
                case 10: {
                    object2 = new Class_43180(Class_20273.Method_20287(arrn, n5, n6, class_9931.Field_9941, class_9931.Field_9937, class_9931.Field_9936, class_9931.Field_9943), Class_26134.Field_26144);
                    break;
                }
                case 11: {
                    int n22 = Class_20273.Method_20287(arrn, n5, n6, class_9931.Field_9941, class_9931.Field_9937, class_9931.Field_9936, class_9931.Field_9943);
                    if ((n22 & (-16777216 & -11118378)) == 0) break;
                    int n10 = Math.min(n22 >>> (1628 & -28392), 4328 & 2150) << (2072 & 12830);
                    object2 = new Class_43180(n22 & (822083583 & -1056964609) | n10, Class_26134.Field_26144);
                    break;
                }
                case 12: {
                    object2 = new Class_43180(Class_20273.Method_20287(arrn, n5, n6, class_9931.Field_9941, class_9931.Field_9937, class_9931.Field_9936, class_9931.Field_9943), Class_26134.Field_26144);
                    break;
                }
                case 13: {
                    object2 = new Class_43180(Class_20273.Method_20287(arrn, n5, n6, class_9931.Field_9941, class_9931.Field_9937, class_9931.Field_9936, class_9931.Field_9943), Class_26134.Field_26144);
                    break;
                }
                case 14: {
                    object2 = new Class_43180(Class_20273.Method_20287(arrn, n5, n6, class_9931.Field_9941, class_9931.Field_9937, class_9931.Field_9936, class_9931.Field_9943), Class_26134.Field_26144);
                    break;
                }
                case 15: {
                    object2 = new Class_43180(Class_20273.Method_20287(arrn, n5, n6, class_9931.Field_9941, class_9931.Field_9937, class_9931.Field_9936, class_9931.Field_9943), Class_26134.Field_26144);
                    break;
                }
                case 16: {
                    int n18;
                    if (class_9931.Field_9942 instanceof Integer && (n18 = ((Integer)class_9931.Field_9942).intValue()) >= (330 & -20470) && n18 <= (2383 & 9229)) {
                        object2 = new Class_43180(Class_20273.Method_20287(arrn, n5, n6, 0.0f, 0.35f * 0.71428573f, 1.0f, 1.0f), Class_26134.Field_26144);
                        break;
                    }
                    object2 = new Class_43180(Class_20273.Method_20287(arrn, n5, n6, class_9931.Field_9941, class_9931.Field_9937, class_9931.Field_9936, class_9931.Field_9943), Class_26134.Field_26144);
                    break;
                }
                case 17: {
                    int n18;
                    if (class_9931.Field_9942 instanceof Integer && (((n18 = ((Integer)class_9931.Field_9942).intValue()) & (7 & -30697)) == 0 || (n18 & (-31673 & 8855)) == (-5879 & 5185))) {
                        object2 = new Class_43180(Class_20273.Method_20287(arrn, n5, n6, class_9931.Field_9941, class_9931.Field_9937, class_9931.Field_9936, class_9931.Field_9943), Class_26134.Field_26144);
                        break;
                    }
                    object2 = new Class_43180(Class_20273.Method_20287(arrn, n5, n6, 0.0f, 0.0f, 1.0f, 0.55f * 0.45454547f) & (16777215 & -889192449) | -1706024928 & -2071719528, Class_26134.Field_26144);
                    break;
                }
                case 18: {
                    int n23 = Class_20273.Method_20287(arrn, n5, n6, class_9931.Field_9941, class_9931.Field_9937, class_9931.Field_9936, class_9931.Field_9943);
                    if ((n23 & (-16252895 & -15663016)) == 0) break;
                    int n24 = Math.min(n23 >>> (1372 & -22376), 235 & 16952) << (-30632 & 8505);
                    object2 = new Class_43180(n23 & (-1962934273 & 1627389951) | n24, Class_26134.Field_26144);
                    break;
                }
                case 19: {
                    int n18 = class_9931.Field_9942 instanceof Integer ? (Integer)class_9931.Field_9942 : 4496 & 1633;
                    int n25 = Class_20273.Method_20287(arrn, n5, n6, 0.0f, 0.0f, 1.0f, class_9931.Field_9940);
                    if ((n25 & (-7928526 & -9957180)) == 0) break;
                    int n10 = Math.max(8560 & 57, n25 >> (1052 & 10904) & (10239 & 2303));
                    int n12 = (n25 >> (56 & -15852) & (8447 & 2815)) * n18 * (-27548 & 416) / (-30209 & 8959);
                    int n13 = (n25 >> (-30454 & 104) & (11519 & -16129)) * ((18943 & -31489) - n18 * (12299 & -31160)) / (4863 & -22273);
                    int n11 = (n25 >> (-32733 & 4364) & (2303 & 14079)) * n18 * (30852 & 1580) / (-29441 & 5119);
                    object2 = new Class_43180(n10 << (5663 & 18520) | n12 << (-32752 & 923) | n13 << (8 & 520) | n11 << (-26752 & 88), Class_26134.Field_26144);
                    break;
                }
                case 20: {
                    int n26 = Class_20273.Method_20287(arrn, n5, n6, 0.0f, 0.0f, 1.0f, 1.0f);
                    if ((n26 & (-16580468 & -16768765)) == 0) break;
                    int n10 = Math.min(n26 >>> (4696 & -29411), 189 & 29024) << (19480 & -32423);
                    object2 = new Class_43180(n26 & (1090519039 & -2063597569) | n10, Class_26134.Field_26138);
                    break;
                }
                case 21: {
                    int n27 = Class_20273.Method_20287(arrn, n5, n6, 0.0f, 0.0f, 1.0f, 1.0f);
                    if ((n27 & (-14678389 & -3923968)) == 0) break;
                    int n10 = Math.min(n27 >>> (16408 & -19716), 4801 & -16256) << (538 & 18456);
                    object2 = new Class_43180(n27 & (-1996488705 & 50331647) | n10, Class_26134.Field_26144);
                    break;
                }
                case 22: {
                    object2 = new Class_43180(Class_20273.Method_20287(arrn, n5, n6, class_9931.Field_9941, class_9931.Field_9937, class_9931.Field_9936, class_9931.Field_9943), Class_26134.Field_26144);
                    break;
                }
                case 23: {
                    int n28 = Class_20273.Method_20287(arrn, n5, n6, class_9931.Field_9941, class_9931.Field_9937, class_9931.Field_9936, class_9931.Field_9943);
                    if ((n28 & (-16400384 & -8253936)) == 0) break;
                    int n10 = n28 & (-16772032 & -11493246);
                    int n12 = (n28 >> (8721 & 1490) & (29695 & -32513)) * (1197 & 17184) / (17151 & 1279);
                    int n13 = (n28 >> (16872 & 6169) & (4351 & -32513)) * (-30840 & 128) / (10495 & 16639);
                    int n11 = (n28 >> (2088 & 704) & (4351 & 2559)) * (6256 & -31308) / (12799 & -32513);
                    object2 = new Class_43180(n10 | n12 << (8212 & 22992) | n13 << (651 & -28648) | n11 << (164 & 23048), Class_26134.Field_26144);
                    break;
                }
                case 24: {
                    int n11;
                    int n18;
                    int n12;
                    int n13;
                    int n29 = Class_20273.Method_20287(arrn, n5, n6, class_9931.Field_9941, class_9931.Field_9937, class_9931.Field_9936, class_9931.Field_9943);
                    int n30 = Class_20273.Method_20287(arrn, n5, n6, class_9931.Field_9941, class_9931.Field_9937, class_9931.Field_9936, class_9931.Field_9943);
                    if (class_9931.Field_9942 instanceof Integer && (n18 = ((Integer)class_9931.Field_9942).intValue()) > 0) {
                        n12 = ((n29 >> (17328 & -32677) & (-32513 & 17151)) * (4710 & -32410) + (-16506 & 5509)) / (8959 & -27393);
                        n13 = ((n29 >> (31 & -10136) & (14591 & 1023)) * (-14218 & 8430) + (-23741 & 9027)) / (4863 & 511);
                        n11 = ((n29 >> (12832 & 1154) & (3839 & 20991)) * (631 & 9318) + (609287015 & 34052327)) / (511 & 17663);
                        n29 = -12549564 & -5504864 | n12 << (2194 & 4113) | n13 << (-29048 & 4105) | n11 << (5378 & -30648);
                    }
                    int n10 = n30 >> (2104 & 9241);
                    int n31 = (-31233 & 11007) - n10;
                    n12 = ((n29 >> (-32460 & 16) & (7423 & 8703)) * n31 + (n30 >> (-32624 & 4372) & (-32001 & 22783)) * n10) / (29439 & -31489);
                    n13 = ((n29 >> (-31987 & 56) & (-31233 & 8959)) * n31 + (n30 >> (-20466 & 73) & (25855 & 511)) * n10) / (6399 & 2047);
                    n11 = ((n29 >> (2112 & 29099) & (1023 & 255)) * n31 + (n30 >> (328 & 132) & (1791 & 6655)) * n10) / (17663 & -19713);
                    object2 = new Class_43180(-16641103 & -15448058 | n12 << (4120 & -24076) | n13 << (2315 & -31128) | n11 << (-32766 & 4200), Class_26134.Field_26144);
                    break;
                }
                case 25: {
                    int n24 = Class_20273.Method_20287(arrn, n5, n6, 0.49821427f * 1.1290323f, 0.8238636f * 0.37931034f, 0.4522059f * 2.0731707f, 0.9035714f * 0.76086956f);
                    int n32 = Class_20273.Method_20287(arrn, n5, n6, 2.8125f * 0.044444446f, 0.11029412f * 0.56666666f, 0.8032787f * 0.622449f, 1.3125f * 0.33333334f);
                    int n33 = Class_20273.Method_20287(arrn, n5, n6, 1.84375f * 0.06779661f, 0.7346939f * 0.765625f, 0.5192308f * 0.962963f, 1.5689656f * 0.59752744f);
                    int n12 = (n24 >> (-24046 & 2524) & (18687 & 511)) + (n32 >> (11537 & -28620) & (255 & 9471)) + (n33 >> (1138 & -24556) & (-31489 & 767));
                    int n13 = (n24 >> (3113 & -28532) & (21247 & -32257)) + (n32 >> (25132 & 456) & (24831 & -29441)) + (n33 >> (-28580 & 522) & (5375 & 767));
                    int n11 = (n24 >> (5184 & 16517) & (1791 & -32513)) + (n32 >> (6400 & 9364) & (12543 & -16129)) + (n33 >> (8832 & -28667) & (18687 & -32513));
                    int n18 = class_9931.Field_9942 instanceof Integer ? (Integer)class_9931.Field_9942 : 6320 & -32446;
                    int n34 = Class_20273.Method_20287(arrn, n5, n6, 0.39215687f * 1.275f, 0.0f, 1.0f, 1.0f);
                    int n35 = Class_20273.Method_20287(arrn, n5, n6, 0.0f, 0.0f, 0.10958904f * 4.5625f, 1.0f);
                    switch (n18) {
                        case 0: {
                            n12 += (n34 >> (5178 & 596) & (9727 & 255)) * (-8061 & 6179);
                            n13 += (n34 >> (8 & 12698) & (4607 & 767)) * (-28197 & 8707);
                            n11 += (n34 >> (4960 & 3206) & (22783 & -22785)) * (771 & -32693);
                            break;
                        }
                        case 1: 
                        case 2: 
                        case 4: {
                            n12 += (n34 >> (8272 & 20024) & (255 & 3327)) * (2 & 27430) + (n35 >> (1813 & 24594) & (1535 & 16639));
                            n13 += (n34 >> (21034 & -24568) & (255 & 4607)) * (8355 & 4430) + (n35 >> (14364 & 1481) & (16639 & -30209));
                            n11 += (n34 >> (10320 & -32767) & (17663 & 511)) * (2 & -28509) + (n35 >> (648 & 2048) & (23295 & -31489));
                            break;
                        }
                        case 3: 
                        case 5: 
                        case 6: {
                            n12 += (n34 >> (2066 & 16784) & (-24065 & 16639)) + (n35 >> (-16294 & 11537) & (5119 & 18687)) * (130 & 5402);
                            n13 += (n34 >> (-14967 & 8204) & (-27393 & 255)) + (n35 >> (2072 & -7377) & (1791 & 2559)) * (202 & 14882);
                            n11 += (n34 >> (4096 & 2758) & (2303 & 4607)) + (n35 >> (4145 & 2048) & (12543 & 17407)) * (4170 & 162);
                            break;
                        }
                        case 7: {
                            n12 += (n35 >> (10576 & 22168) & (2047 & -12033)) * (-13293 & 519);
                            n13 += (n35 >> (-32696 & 2586) & (8447 & 6143)) * (3 & 2115);
                            n11 += (n35 >> (6272 & 8309) & (-27137 & 255)) * (-32685 & 20483);
                        }
                    }
                    object2 = new Class_43180(-1946087420 & -1303378941 | (n12 /= -32746 & 39) << (16627 & -29936) | (n13 /= -31713 & 8486) << (330 & -30040) | (n11 /= 38 & -11953) << (9376 & 576), Class_26134.Field_26144);
                }
            }
            hashMap.put(class_9931, object2);
        }
        for (n = 6470 & 24616; n < (348225671 & 92224); ++n) {
            arrclass_43180[n] = (Class_43180)hashMap.get(Field_20276[n]);
        }
        Field_20279.compareAndSet(thread, null);
        Class_38196.Field_38285.Field_38233 = 28969 & 209;
        return arrclass_43180;
    }

    private static String Method_20289(String string, String string2) {
        int n = string2.indexOf(4798 & 8506);
        if (n == (-1 & -1)) {
            return string + string2;
        }
        String string3 = string2.substring(n + (5121 & 49), string2.length());
        if (n > (-30099 & 9491)) {
            String string4 = string2.substring(18496 & 8590, n);
            return string4 + (char)(-31429 & 2810) + string + string3;
        }
        return string + string3;
    }

    private static String Method_20290(String string) {
        int n = 14348;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_20273.class, 8);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static int[] Method_20291(BufferedImage bufferedImage, int n, List list) {
        int n2;
        int n3;
        int n4;
        int n5 = n == (18629 & -24573) ? 4113 & 1089 : -27648 & 792;
        int n6 = bufferedImage.getWidth();
        int n7 = bufferedImage.getHeight();
        int n8 = n6 * n6;
        int[] arrn = new int[n8];
        if (n6 == n7) {
            bufferedImage.getRGB(-28656 & 25352, 1 & 13500, n6, n7, arrn, 1 & -11004, n6);
            return arrn;
        }
        int[] arrn2 = bufferedImage.getRGB(582 & -23528, 18472 & 4166, n6, n7, new int[n6 * n7], 19459 & -28288, n6);
        int[] arrn3 = new int[n7 / n6];
        int n9 = -27376 & 8202;
        if (list == null) {
            Arrays.fill(arrn3, 577 & 27917);
            n9 = arrn3.length;
        } else {
            for (Integer n10 : list) {
                if (n10 == null) continue;
                n4 = n10;
                n2 = n4 >>> (369 & 12310);
                n3 = n4 & (554106879 & 415301631);
                if (n2 >= arrn3.length) continue;
                int[] arrn4 = arrn3;
                int n11 = n2;
                arrn4[n11] = arrn4[n11] + n3;
                n9 += n3;
            }
        }
        for (int i = 801 & 4104; i < n8; ++i) {
            int n12;
            int n13;
            int n14 = -16324 & 768;
            n4 = 2048 & 1162;
            n2 = 5184 & 24612;
            n3 = 16672 & 4624;
            for (n12 = -32636 & 17481; n12 < arrn3.length; ++n12) {
                n13 = arrn2[n12 * n8 + i];
                n14 += (n13 >> (32021 & 178) & (511 & 21759)) * arrn3[n12];
                n4 += (n13 >> (8746 & 23560) & (-31233 & 6911)) * arrn3[n12];
                n2 += (n13 >> (391 & 2064) & (-24065 & 767)) * arrn3[n12];
                n3 += (n13 >> (10904 & 4377) & (8447 & -29185)) * arrn3[n12];
            }
            n12 = Class_20273.Method_20284(n14 / n9, -28281 & 2112, 4351 & 2815);
            n13 = Class_20273.Method_20284(n4 / n9, -28599 & 8966, 5119 & 1279);
            int n15 = Class_20273.Method_20284(n2 / n9, 16467 & -23808, 29183 & 767);
            int n16 = Class_20273.Method_20284(n3 / n9, -23424 & 16461, -31489 & 511);
            if (n5 == 0) {
                n16 = n16 <= (1561 & -16071) ? 2088 & -32764 : -29953 & 8447;
            }
            arrn[i] = n16 << (16472 & -29544) | n12 << (565 & 9488) | n13 << (716 & -30455) | n15 << (16417 & 1222);
        }
        return arrn;
    }

    private static String Method_20292(String string) {
        int n = 11958;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_20273.class, 10);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_20293(String string) {
        int n = 17217;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_20273.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    protected static final int Method_20294(int n, int n2) {
        if (!(Field_20274 || n >= 0 && n < (4134 & -28544))) {
            throw new AssertionError();
        }
        if (!(Field_20274 || n2 >= 0 && n2 < (-30703 & 400))) {
            throw new AssertionError();
        }
        return n << (838 & -16195) | n2;
    }

    private static String Method_20295(String string) {
        int n = 7642;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_20273.class, 9);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    static Class_43180[] Method_20296() {
        return Class_20273.Method_20288();
    }

    private static String Method_20297(String string) {
        int n = 16656;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_20273.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    static {
        Class_20273.Field_20277 = new float[586270760 & -1929313278];
        Class_20273.Field_20276 = new Class_9931[16847938 & -2112536420];
        Class_20273.Field_20278 = null;
        Class_20273.Field_20279 = new AtomicReference<V>();
        var0 = new HashMap<Class_9931, Class_9931>();
        var1_1 = new Class_26198();
        var2_2 = (Class_3705)Class_3238.Method_3341(Class_20273.Method_20293("\u60c1\u60c9\u60d2"));
        var3_3 = (Class_4720)Class_3238.Method_3341(Class_20273.Method_20285("\u0928\u0920\u0922\u0922\u0924\u0924"));
        var4_4 = (Class_5285)Class_3238.Method_3341(Class_20273.Method_20299("\u16a1\u16b0\u16a0\u16a1\u16b4\u16b5\u1684\u16b5\u16b8\u16b8\u16b9"));
        var5_5 = (Class_37502)Class_3238.Method_3341(Class_20273.Method_20297("\u582c\u5821\u582c\u5829\u582c"));
        var6_6 = (Class_4157)Class_3238.Method_3341(Class_20273.Method_20283("\ufd30\ufd24\ufd36\ufd24\ufd20"));
        var7_7 = (Class_5320)Class_3238.Method_3341(Class_20273.Method_20286("\u2032\u2022\u2020\u2020\u2020\u2030\u2020\u2032\u2038"));
        var8_8 = (Class_20400)Class_3238.Method_3341(Class_20273.Method_20282("\u840a\u8401\u8406"));
        var3_3.Method_4729((boolean)(-4607 & 125));
        var9_9 = 1024 & -30568;
        try {
            var9_9 = 24649 & 1;
            for (var10_10 = 18834 & -32764; var10_10 < (-25575 & 13248); ++var10_10) {
                var11_16 = Class_3238.Method_3323(var10_10);
                if (var11_16 == null || var11_16 == var2_2) continue;
                var1_1.Field_26199 = var11_16;
                var12_17 = var11_16.Method_3316();
                var13_18 = var11_16.Method_3375() != false ? 31392 & 1029 : 16657 & 8813;
                try {
                    for (var14_19 = 16432 & 5637; var14_19 < (8496 & 2261); ++var14_19) {
                        var15_22 = null;
                        var16_40 = var14_19;
                        if (var11_16 == var4_4) {
                            v0 = var16_40 = (var14_19 & (-16377 & 14895)) >= (686 & -10986) ? 4206 & 18812 : var14_19;
                        }
                        if (var11_16 == var5_5 && var14_19 >= (24586 & 2568)) {
                            var17_41 = Class_20273.Method_20294(var10_10, var14_19);
                            Class_20273.Field_20276[var17_41] = Class_20273.Field_20276[var17_41 & (-1 & -1)];
                            continue;
                        }
                        var1_1.Field_26201 = var14_19;
                        var17_41 = Class_20273.Method_20294(var10_10, var14_19);
                        try {
                            var11_16.Method_3382(var1_1, new Class_4751(-27839 & 19456, 4760 & 2304, -23421 & 4132));
                        }
                        catch (Exception var18_43) {
                            // empty catch block
                        }
                        Class_20273.Field_20277[var17_41] = (float)var11_16.Method_3337();
                        var18_42 = var11_16 instanceof Class_36871;
                        var19_44 = (Class_2080)Class_3238.Field_3271.\u0000, `((Object)var11_16);
                        var20_45 = var19_44.Method_2084();
                        if (var20_45 == null) continue;
                        if (var11_16 == var6_6) {
                            var15_23 = Class_26134.Field_26150;
                        } else if (var11_16 == var3_3) {
                            switch (var14_19 & (12563 & 16395)) {
                                default: {
                                    var15_24 = Class_26134.Field_26136;
                                    ** break;
                                }
                                case 1: {
                                    var15_25 = Class_26134.Field_26143;
                                    ** break;
                                }
                                case 2: 
                            }
                            var15_26 = Class_26134.Field_26142;
                            ** break;
lbl62: // 3 sources:
                        } else if (var11_16 == var7_7 && var14_19 != 0) {
                            var15_27 = Class_26134.Field_26137;
                        } else if (var11_16 == var8_8) {
                            var15_28 = Class_26134.Field_26139;
                        }
                        var21_46 = (float)var11_16.Method_3352();
                        var22_47 = (float)var11_16.Method_3324();
                        var23_48 = (float)var11_16.Method_3315();
                        var24_49 = (float)var11_16.Method_3379();
                        var25_50 = (float)var11_16.Method_3337();
                        var26_51 = (float)var11_16.Method_3291();
                        switch (var12_17) {
                            case -1: {
                                var15_30 = var11_16;
                            }
                            default: {
                                ** break;
                            }
                            case 4: {
                                Class_20273.Field_20277[var17_41] = Math.max(0.0f, 1.0f - (float)(var14_19 + (-32363 & 1027)) / (20.73913f * 0.43396226f));
                                var15_32 = var11_16;
                                ** break;
                            }
                            case 5: {
                                var15_33 = var14_19;
                                ** break;
                            }
                            case 10: {
                                Class_20273.Field_20277[var17_41] = (var14_19 & (1030 & -32540)) == 0 ? 0.8534483f * 0.8787879f : 1.0f;
                                ** break;
                            }
                            case 16: {
                                var15_34 = var14_19;
                                ** break;
                            }
                            case 17: {
                                var15_35 = var14_19;
                                ** break;
                            }
                            case 19: {
                                var15_36 = Math.min(-22833 & 18439, var14_19);
                                ** break;
                            }
                            case 24: {
                                Class_20273.Field_20277[var17_41] = (float)((6752 & -30086) + (432 & 434) * Math.min(-27837 & 3099, var14_19)) / (64.0f * 4.0f);
                                var15_37 = Math.min(-32669 & 17439, var14_19);
                                ** break;
                            }
                            case 25: {
                                Class_20273.Field_20277[var17_41] = 0.09756098f * 2.05f;
                                var15_38 = var14_19 & (71 & 28479);
                                ** break;
                            }
                            case 26: 
                        }
                        var27_53 = 3 & 3617;
                        if (var27_53) {
                            Class_20273.Field_20277[var17_41] = 0.859375f * 1.0f;
                        }
                        var15_39 = var27_53;
lbl111: // 10 sources:
                        var27_52 = new Class_9931(var12_17, var13_18, var20_45, var21_46, var22_47, var23_48, var24_49, var25_50, var26_51, var15_21);
                        var28_54 = (Class_9931)var0.get(var27_52);
                        if (var28_54 == null) {
                            var28_54 = var27_52;
                            var0.put(var28_54, var28_54);
                        }
                        Class_20273.Field_20276[var17_41] = var28_54;
                    }
                    continue;
                }
                catch (ArrayIndexOutOfBoundsException var14_20) {
                    continue;
                }
            }
            var9_9 = 226 & 22036;
            if (var9_9 != 0) {
                try {
                    var10_11 = (Class_4720)Class_3238.Method_3341(Class_20273.Method_20290("\u008a\u0083\u0081\u0082\u0087\u0085"));
                    var10_11.Method_4729(Class_18.Field_89.Field_84.Field_39788);
                }
                catch (Exception var10_12) {
                    // empty catch block
                }
            }
            try {
                var10_13 = (Class_4720)Class_3238.Method_3341(Class_20273.Method_20295("\u5810\u5810\u5813\u5801\u5811\u5802"));
                var10_13.Method_4729(Class_18.Field_89.Field_84.Field_39788);
            }
            catch (Exception var10_14) {
                // empty catch block
            }
            ** if (var9_9 == 0) goto lbl-1000
        }
        catch (Throwable var30_56) {
            if (var9_9 == 0) throw var30_56;
            try {
                var31_57 = (Class_4720)Class_3238.Method_3341(Class_20273.Method_20281("\u4920\u4920\u4924\u4932\u4924\u4932"));
                var31_57.Method_4729(Class_18.Field_89.Field_84.Field_39788);
                throw var30_56;
            }
            catch (Exception var31_58) {
                // empty catch block
            }
            throw var30_56;
        }
lbl-1000: // 1 sources:
        {
            try {
                var10_13 = (Class_4720)Class_3238.Method_3341(Class_20273.Method_20292("\u020c\u0204\u0200\u0214\u0204\u0210"));
                var10_13.Method_4729(Class_18.Field_89.Field_84.Field_39788);
            }
            catch (Exception var10_15) {}
        }
lbl-1000: // 2 sources:
        {
        }
        Class_20273.Field_20275 = var0.keySet().toArray(new Class_9931[var0.size()]);
        Arrays.sort(Class_20273.Field_20275);
    }

    private void Method_20298() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private static String Method_20299(String string) {
        int n = 28487;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_20273.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }
}

