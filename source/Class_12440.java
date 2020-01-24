/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.ListenableFuture
 *  internal.org.lwjgl.BufferUtils
 *  internal.org.lwjgl.opengl.ARBShaderObjects
 *  internal.org.lwjgl.opengl.ARBVertexShader
 *  internal.org.lwjgl.opengl.ContextCapabilities
 *  internal.org.lwjgl.opengl.EXTFramebufferObject
 *  internal.org.lwjgl.opengl.GL11
 *  internal.org.lwjgl.opengl.GL20
 *  internal.org.lwjgl.opengl.GL30
 *  internal.org.lwjgl.opengl.GLContext
 *  internal.org.lwjgl.util.glu.GLU
 *  org.apache.commons.io.IOUtils
 */
import com.google.common.util.concurrent.ListenableFuture;
import internal.org.lwjgl.BufferUtils;
import internal.org.lwjgl.opengl.ARBShaderObjects;
import internal.org.lwjgl.opengl.ARBVertexShader;
import internal.org.lwjgl.opengl.ContextCapabilities;
import internal.org.lwjgl.opengl.EXTFramebufferObject;
import internal.org.lwjgl.opengl.GL11;
import internal.org.lwjgl.opengl.GL20;
import internal.org.lwjgl.opengl.GL30;
import internal.org.lwjgl.opengl.GLContext;
import internal.org.lwjgl.util.glu.GLU;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.Reader;
import java.io.Writer;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.util.Vec3;
import org.apache.commons.io.IOUtils;

public class Class_12440 {
    public static boolean Field_12441;
    static String Field_12442;
    static int Field_12443;
    public static int Field_12444;
    static Map Field_12445;
    public static int Field_12446;
    public static int Field_12447;
    static float[] Field_12448;
    public static float Field_12449;
    static int Field_12450;
    static final float[] Field_12451;
    static final FloatBuffer Field_12452;
    public static Class_11090 Field_12453;
    public static float Field_12454;
    static int Field_12455;
    public static float Field_12456;
    static float Field_12457;
    public static Properties Field_12458;
    private static String Field_12459;
    static float[] Field_12460;
    public static boolean Field_12461;
    public static int Field_12462;
    public static Class_11090 Field_12463;
    static float Field_12464;
    static boolean Field_12465;
    static double Field_12466;
    public static boolean Field_12467;
    static long Field_12468;
    public static int Field_12469;
    static int Field_12470;
    private static String Field_12471;
    public static byte[] Field_12472;
    static boolean Field_12473;
    static final FloatBuffer Field_12474;
    private static Class_37465[] Field_12475;
    static int Field_12476;
    static float Field_12477;
    public static float Field_12478;
    public static int Field_12479;
    static float[] Field_12480;
    public static String Field_12481;
    static final IntBuffer Field_12482;
    static final FloatBuffer Field_12483;
    private static final Pattern Field_12484;
    static int Field_12485;
    public static int Field_12486;
    public static float Field_12487;
    static float[] Field_12488;
    static boolean Field_12489;
    public static int Field_12490;
    static float Field_12491;
    public static Class_11090 Field_12492;
    public static boolean Field_12493;
    static Map Field_12494;
    private static Class_23042 Field_12495;
    public static Class_15674 Field_12496;
    static float Field_12497;
    public static int Field_12498;
    private static int Field_12499;
    static final int[] Field_12500;
    public static boolean Field_12501;
    public static Class_11090 Field_12502;
    private static Class_26181 Field_12503;
    static int Field_12504;
    static final float[] Field_12505;
    static float Field_12506;
    static long Field_12507;
    static int Field_12508;
    static int Field_12509;
    static int Field_12510;
    public static boolean[] Field_12511;
    static int Field_12512;
    public static float Field_12513;
    public static String Field_12514;
    static float Field_12515;
    public static boolean Field_12516;
    static final float[] Field_12517;
    static Set Field_12518;
    static String Field_12519;
    static final IntBuffer Field_12520;
    private static int Field_12521;
    public static final String[] Field_12522;
    static boolean Field_12523;
    public static float Field_12524;
    public static boolean[] Field_12525;
    public static float Field_12526;
    public static Class_11090 Field_12527;
    static float[] Field_12528;
    static final FloatBuffer Field_12529;
    public static boolean Field_12530;
    private static final int[] Field_12531;
    static final IntBuffer Field_12532;
    static long Field_12533;
    private static String Field_12534;
    public static Class_2062 Field_12535;
    public static boolean Field_12536;
    public static Class_11090 Field_12537;
    static IntBuffer Field_12538;
    static float Field_12539;
    public static float Field_12540;
    public static int Field_12541;
    static int Field_12542;
    public static Class_27375 Field_12543;
    public static Class_11090 Field_12544;
    public static Class_11090 Field_12545;
    public static ContextCapabilities Field_12546;
    public static float Field_12547;
    static int[] Field_12548;
    private static final boolean Field_12549;
    static int Field_12550;
    public static final int[] Field_12551;
    static float Field_12552;
    static float Field_12553;
    public static float Field_12554;
    public static boolean Field_12555;
    static float Field_12556;
    private static Class_37465[] Field_12557;
    static final IntBuffer Field_12558;
    private static final int[] Field_12559;
    static String Field_12560;
    static double Field_12561;
    static int Field_12562;
    public static String Field_12563;
    static float Field_12564;
    static float Field_12565;
    public static boolean[] Field_12566;
    static final float[] Field_12567;
    static int Field_12568;
    static IntBuffer[] Field_12569;
    private static String Field_12570;
    public static int[] Field_12571;
    public static boolean[] Field_12572;
    static final FloatBuffer Field_12573;
    static float Field_12574;
    static final FloatBuffer Field_12575;
    static String Field_12576;
    static final IntBuffer Field_12577;
    private static float[] Field_12578;
    static final IntBuffer Field_12579;
    public static Class_27375 Field_12580;
    static File Field_12581;
    static File Field_12582;
    public static int Field_12583;
    private static int[] Field_12584;
    static final float[] Field_12585;
    public static Class_11090 Field_12586;
    private static boolean Field_12587;
    static float Field_12588;
    public static boolean Field_12589;
    private static Class_283 Field_12590;
    public static final String[] Field_12591;
    static Class_22849 Field_12592;
    private static int Field_12593;
    public static float Field_12594;
    private static final ByteBuffer Field_12595;
    public static boolean Field_12596;
    public static Class_11090 Field_12597;
    public static boolean Field_12598;
    static int Field_12599;
    static File Field_12600;
    public static boolean Field_12601;
    static int Field_12602;
    public static boolean Field_12603;
    public static String[] Field_12604;
    static boolean Field_12605;
    public static boolean Field_12606;
    static float Field_12607;
    private static final char[] Field_12608;
    public static int Field_12609;
    public static float Field_12610;
    static final int[] Field_12611;
    private static Class_37465[] Field_12612;
    static final float[] Field_12613;
    private static final String[] Field_12614;
    static double Field_12615;
    static float[] Field_12616;
    public static int Field_12617;
    static float Field_12618;
    static double Field_12619;
    static double Field_12620;
    public static boolean Field_12621;
    public static Class_11090 Field_12622;
    static float[] Field_12623;
    static final int[] Field_12624;
    private static Map Field_12625;
    public static boolean Field_12626;
    static float Field_12627;
    private static List Field_12628;
    static final FloatBuffer Field_12629;
    public static int Field_12630;
    static final FloatBuffer Field_12631;
    static final float[] Field_12632;
    public static Class_11090 Field_12633;
    static final FloatBuffer Field_12634;
    private static boolean Field_12635;
    static int Field_12636;
    public static final int[] Field_12637;
    public static boolean Field_12638;
    private static final String[] Field_12639;
    private static boolean Field_12640;
    public static boolean Field_12641;
    private static boolean Field_12642;
    public static int Field_12643;
    public static float Field_12644;
    public static Class_31219 Field_12645;
    static final IntBuffer Field_12646;
    public static Class_11090 Field_12647;
    static final FloatBuffer Field_12648;
    private static int Field_12649;
    static double Field_12650;
    static Class_19214 Field_12651;
    public static int Field_12652;
    static boolean Field_12653;
    public static float Field_12654;
    private static String[] Field_12655;
    public static boolean[] Field_12656;
    static long Field_12657;
    static boolean Field_12658;
    static final IntBuffer Field_12659;
    private static int[] Field_12660;
    public static int[] Field_12661;
    public static Properties Field_12662;
    static float Field_12663;
    static float[] Field_12664;
    public static boolean Field_12665;
    static long Field_12666;
    static float Field_12667;
    public static boolean Field_12668;
    public static String Field_12669;
    static final FloatBuffer Field_12670;
    static Class_18480[] Field_12671;
    static int Field_12672;
    public static boolean Field_12673;
    private static int[] Field_12674;
    static int Field_12675;
    public static boolean Field_12676;
    public static int Field_12677;
    public static int Field_12678;
    private static int Field_12679;
    static int Field_12680;
    public static int Field_12681;
    public static boolean Field_12682;
    static Class_18 Field_12683;
    public static Class_11090 Field_12684;
    static final float[] Field_12685;
    static long Field_12686;
    private static final String[] Field_12687;
    static float Field_12688;
    static Class_7985[] Field_12689;
    static final IntBuffer Field_12690;
    static float Field_12691;
    public static boolean Field_12692;
    static final IntBuffer[] Field_12693;
    public static boolean Field_12694;
    public static boolean Field_12695;
    public static boolean Field_12696;
    static boolean Field_12697;
    static float Field_12698;
    static float Field_12699;
    private static int Field_12700;
    static final IntBuffer Field_12701;
    static final boolean[][] Field_12702;
    static final FloatBuffer Field_12703;
    static final IntBuffer Field_12704;
    public static float Field_12705;
    static final IntBuffer Field_12706;
    public static boolean[] Field_12707;

    private static String Method_12708(String string) {
        int n = 20893;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 15);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12709(String string) {
        int n = 7877;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 48);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12710(String string) {
        int n = 31265;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 73);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12711(String string) {
        int n = 10274;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 26);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12712(String string) {
        int n = 19195;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 24);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12713(String string) {
        int n = 17505;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 126);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12714(String string) {
        int n = 14382;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 83);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12715(String string) {
        int n = 27761;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 100);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12716(String string) {
        int n = 15267;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 123);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static void Method_12717() {
        if (Field_12673) {
            Class_12440.Method_12981(Field_12697 ? -11749 & 35 : 4774 & 258);
        }
    }

    public static void Method_12718(Class_4879 class_4879) {
        if (Field_12673) {
            Class_12440.Method_12988("nextBlockEntity");
            Class_12440.Method_12981(13 & 32031);
            Class_12440.Method_12767(class_4879);
        }
    }

    public static void Method_12719() {
        if (Field_12512 >= (16642 & 214)) {
            Class_16867.Method_16960(814778347 & 1073910987);
            Class_12440.Method_12988("pre copy depth");
            GL11.glCopyTexSubImage2D((int)(28147 & 7649), (int)(8228 & 16898), (int)(4104 & -32751), (int)(24673 & 6424), (int)(513 & 66), (int)(33 & -17570), (int)Field_12681, (int)Field_12490);
            Class_12440.Method_12988("copy depth");
            Class_16867.Method_16960(1369800 & -1946116624);
        }
        Class_8049.Method_8074(Field_12535.Method_2064());
    }

    private static String Method_12720(String string) {
        int n = 11115;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 89);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static void Method_12721() {
        Class_12440.Method_12734(Field_12612);
        Class_12440.Method_12734(Field_12557);
        Class_12440.Method_12734(Field_12475);
        Field_12612 = null;
        Field_12557 = null;
        Field_12475 = null;
    }

    private static String Method_12722(String string) {
        int n = 4517;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 11);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static boolean Method_12723(int n, String string) {
        IntBuffer intBuffer = BufferUtils.createIntBuffer((int)(16385 & 6275));
        ARBShaderObjects.glGetObjectParameterARB((int)n, (int)(-2101301307 & 1611307924), (IntBuffer)intBuffer);
        int n2 = intBuffer.get();
        if (n2 > (6577 & 1)) {
            ByteBuffer byteBuffer = BufferUtils.createByteBuffer((int)n2);
            intBuffer.flip();
            ARBShaderObjects.glGetInfoLogARB((int)n, (IntBuffer)intBuffer, (ByteBuffer)byteBuffer);
            byte[] arrby = new byte[n2];
            byteBuffer.get(arrby);
            if (arrby[n2 - (1121 & 2049)] == 0) {
                arrby[n2 - (4355 & 2217)] = 17499 & -32214;
            }
            String string2 = new String(arrby);
            Class_26062.Method_26067("Info log: " + string + "\n" + string2);
            return (7371 & 16656) != 0;
        }
        return (5125 & -21901) != 0;
    }

    private static String Method_12724(String string) {
        int n = 17291;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 44);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static void Method_12725(Class_1061 class_1061) {
        if (Field_12673 && !Field_12441 && Field_12580.\u0000strictfp()) {
            int n = Class_15516.Method_15549(class_1061);
            Field_12580.Method_27377(n);
        }
    }

    private static String Method_12726(String string) {
        int n = 5642;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 98);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static void Method_12727() {
        if (Field_12696) {
            Class_12440.Method_12981(6663 & 8261);
        } else if (Field_12498 == (-22399 & 513)) {
            Class_12440.Method_12981(Field_12697 ? 10283 & 215 : -30077 & 16658);
        }
    }

    private static String Method_12728(String string) {
        int n = 7191;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 109);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static void Method_12729() {
        Field_12696 = -16380 & 11336;
        Class_12440.Method_12977(Field_12482);
        Class_12440.Method_12981(Field_12697 ? 563 & -16245 : 16522 & 12290);
        Class_12440.Method_12997();
    }

    private static void Method_12730() {
        Field_12496.\u0000strictfp();
        Field_12684.\u0000strictfp();
        Field_12597.\u0000strictfp();
        Field_12537.\u0000strictfp();
        Field_12586.\u0000strictfp();
        Field_12544.\u0000strictfp();
        Field_12453.\u0000strictfp();
        Field_12492.\u0000strictfp();
        Field_12545.\u0000strictfp();
        Field_12463.\u0000strictfp();
        Field_12647.\u0000strictfp();
        Field_12502.\u0000strictfp();
        Field_12633.\u0000strictfp();
        Class_33489.Method_33492();
        Field_12495 = null;
        Class_27062.Method_27078();
        if (Field_12651 != null) {
            Class_33489.Method_33496(Field_12651);
            String string = "/shaders/shaders.properties";
            try {
                InputStream inputStream = Field_12651.Method_19218(string);
                if (inputStream == null) {
                    return;
                }
                Class_34319 class_34319 = new Class_34319();
                class_34319.load(inputStream);
                inputStream.close();
                Field_12496.\u0000strictfp((Properties)class_34319);
                Field_12684.\u0000strictfp((Properties)class_34319);
                Field_12597.\u0000strictfp((Properties)class_34319);
                Field_12537.\u0000strictfp((Properties)class_34319);
                Field_12586.\u0000strictfp((Properties)class_34319);
                Field_12544.\u0000strictfp((Properties)class_34319);
                Field_12453.\u0000strictfp((Properties)class_34319);
                Field_12545.\u0000strictfp((Properties)class_34319);
                Field_12492.\u0000strictfp((Properties)class_34319);
                Field_12463.\u0000strictfp((Properties)class_34319);
                Field_12647.\u0000strictfp((Properties)class_34319);
                Field_12502.\u0000strictfp((Properties)class_34319);
                Field_12633.\u0000strictfp((Properties)class_34319);
                Field_12518 = Class_19719.Method_19742(class_34319, Field_12671);
                Field_12689 = Class_19719.Method_19730(class_34319, Field_12671);
                Field_12445 = Class_19719.Method_19735(class_34319, Field_12689, Field_12671);
                Field_12612 = Class_12440.Method_12843(class_34319, 1153 & -11752);
                Field_12557 = Class_12440.Method_12843(class_34319, 17193 & 17);
                Field_12475 = Class_12440.Method_12843(class_34319, -10234 & 99);
                Field_12534 = class_34319.getProperty("texture.noise");
                if (Field_12534 != null) {
                    Field_12587 = 201 & 24577;
                }
                Field_12495 = Class_19719.Method_19728(class_34319);
            }
            catch (IOException iOException) {
                Class_19426.Method_19610("[Shaders] Error reading: " + string);
            }
        }
    }

    private static String Method_12731(String string) {
        int n = 12510;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 79);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12732(String string) {
        int n = 26121;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 27);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static void Method_12733() {
        if (Field_12605) {
            if (!Field_12441) {
                Field_12474.clear();
                GL11.glReadPixels((int)(Field_12681 / (24834 & 2163)), (int)(Field_12490 / (9226 & 6343)), (int)(-30397 & 37), (int)(-14335 & 1985), (int)(7554 & 6518), (int)(5222 & -24818), (FloatBuffer)Field_12474);
                Field_12491 = Field_12474.get(-28412 & 24584);
                float f = (float)Field_12657 * (0.054999996f * 0.18181819f);
                float f2 = (float)Math.exp(Math.log(1.5 * 0.3333333333333333) * (double)f / (double)Field_12556);
                Field_12553 = Field_12553 * f2 + Field_12491 * (1.0f - f2);
            }
        } else {
            Field_12491 = 1.2195122f * 13.12f;
            Field_12553 = 1.3802817f * 11.591837f;
        }
    }

    private static void Method_12734(Class_37465[] arrclass_37465) {
        if (arrclass_37465 != null) {
            for (int i = -16375 & 2052; i < arrclass_37465.length; ++i) {
                Class_37465 class_37465 = arrclass_37465[i];
                class_37465.Method_37472();
            }
        }
    }

    private static String Method_12735(String string) {
        int n = 2011;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 128);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static void Method_12736() {
        if ((double)Field_12454 != 1.0) {
            GL11.glScaled((double)1.0, (double)1.0, (double)Field_12454);
        }
    }

    public static boolean Method_12737() {
        return (!Field_12453.Method_11097() ? 15161 & 71 : 584 & 22576) != 0;
    }

    private static String Method_12738(String string) {
        int n = 7848;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 92);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static void Method_12739() {
        if (Field_12673) {
            if (!Field_12441) {
                Class_12440.Method_12908();
                Class_12440.Method_12981(1037 & -32498);
                Class_16867.Method_16947();
                Class_16867.Method_16930((2267 & 5) != 0);
            } else {
                Class_16867.Method_16930((4615 & 265) != 0);
            }
        }
    }

    private static String Method_12740(String string) {
        int n = 12605;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 122);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12741(String string) {
        int n = 3444;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 21);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static void Method_12742(float f) {
        Class_1061 class_1061 = Field_12683.Method_246();
        double d = class_1061.Field_1126 + (class_1061.Field_1130 - class_1061.Field_1126) * (double)f;
        double d2 = class_1061.Field_1102 + (class_1061.Method_1324() - class_1061.Field_1102) * (double)f;
        double d3 = class_1061.Field_1125 + (class_1061.Field_1106 - class_1061.Field_1125) * (double)f;
        Field_12619 = d;
        Field_12615 = d2;
        Field_12620 = d3;
        GL11.glGetFloat((int)(-29777 & 8103), (FloatBuffer)((FloatBuffer)Field_12629.position(1411 & 16)));
        Class_21899.Method_21901((FloatBuffer)Field_12634.position(2625 & 0), (FloatBuffer)Field_12629.position(-15784 & 8486), Field_12632, Field_12505);
        Field_12629.position(-12284 & 138);
        Field_12634.position(5633 & -16360);
        GL11.glGetFloat((int)(3046 & 11190), (FloatBuffer)((FloatBuffer)Field_12529.position(-30584 & 20562)));
        Class_21899.Method_21901((FloatBuffer)Field_12670.position(-32224 & 6284), (FloatBuffer)Field_12529.position(18513 & -24064), Field_12567, Field_12517);
        Field_12529.position(-32751 & 328);
        Field_12670.position(5633 & 18560);
        Class_12440.Method_12988("setCamera");
    }

    public static void Method_12743() {
        Class_12440.Method_12981(691 & -32501);
    }

    public static void Method_12744() {
        if (!Field_12441) {
            if (Field_12512 >= (3971 & 8219)) {
                Class_16867.Method_16960(33850828 & 419595981);
                GL11.glCopyTexSubImage2D((int)(11749 & 4083), (int)(-23552 & 2177), (int)(-32252 & 14546), (int)(12301 & -29488), (int)(65 & 9368), (int)(1224 & 4660), (int)Field_12681, (int)Field_12490);
                Class_16867.Method_16960(553707200 & 101568);
            }
            Class_16867.Method_16927();
            Class_16867.Method_16947();
            Class_16867.Method_16951(-23806 & 21254, 9987 & 787);
            Class_16867.Method_16913();
            Class_12440.Method_12981(20564 & 1212);
        }
    }

    public static void Method_12745() {
        Class_12440.Method_12810(Field_12671, Field_12651);
    }

    private static void Method_12746() {
        Field_12499 = Class_12440.Field_12683.Field_80;
        Field_12700 = Class_12440.Field_12683.Field_44;
        Field_12681 = Math.round((float)Field_12499 * Field_12554);
        Field_12490 = Math.round((float)Field_12700 * Field_12554);
        Class_12440.Method_12786();
    }

    public static void Method_12747(String string, float f) {
        int n = Field_12548[Field_12498];
        if (n != 0) {
            int n2 = ARBShaderObjects.glGetUniformLocationARB((int)n, (CharSequence)string);
            ARBShaderObjects.glUniform1fARB((int)n2, (float)f);
            if (Class_12440.Method_12998()) {
                Class_27062.Method_27074(string, f);
            }
            Class_12440.Method_12757(Field_12614[Field_12498], string);
        }
    }

    public static void Method_12748() {
        if (Field_12673) {
            Class_12440.Method_12981(-12275 & 8717);
        }
    }

    private static boolean Method_12749(Class_23823 class_23823) {
        if (class_23823 == null) {
            return (17164 & -30592) != 0;
        }
        Class_1956 class_1956 = class_23823.Method_23844();
        if (class_1956 == null) {
            return (18962 & 4204) != 0;
        }
        if (!(class_1956 instanceof Class_41056)) {
            return (2306 & 8913) != 0;
        }
        Class_41056 class_41056 = (Class_41056)class_1956;
        Class_3238 class_3238 = class_41056.Method_41063();
        if (class_3238 == null) {
            return (1172 & -24256) != 0;
        }
        Class_17531 class_17531 = class_3238.Method_3286();
        return (class_17531 == Class_17531.Field_17537 ? -32733 & 2589 : 2048 & 452) != 0;
    }

    private void Method_12750() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public static void Method_12751(String string, int n, int n2) {
        int n3 = Field_12548[Field_12498];
        if (n3 != 0) {
            int n4 = ARBShaderObjects.glGetUniformLocationARB((int)n3, (CharSequence)string);
            ARBShaderObjects.glUniform2iARB((int)n4, (int)n, (int)n2);
            if (Class_12440.Method_12998()) {
                Class_27062.Method_27072(string, n, n2);
            }
            Class_12440.Method_12757(Field_12614[Field_12498], string);
        }
    }

    public static void Method_12752() {
        Field_12653 = 10305 & 9;
        Class_12440.Method_12811("fogMode", Field_12447);
    }

    private static String Method_12753(String string) {
        int n = 8958;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 52);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static void Method_12754(String string, boolean bl, FloatBuffer floatBuffer) {
        int n = Field_12548[Field_12498];
        if (n != 0 && floatBuffer != null) {
            int n2 = ARBShaderObjects.glGetUniformLocationARB((int)n, (CharSequence)string);
            ARBShaderObjects.glUniformMatrix4ARB((int)n2, (boolean)bl, (FloatBuffer)floatBuffer);
            Class_12440.Method_12757(Field_12614[Field_12498], string);
        }
    }

    public static boolean Method_12755() {
        return (!Field_12492.Method_11097() ? 27 & 28737 : 132 & -24256) != 0;
    }

    public static Class_283 Method_12756() {
        return Field_12590;
    }

    public static int Method_12757(String string, String string2) {
        int n = GL11.glGetError();
        if (n != 0) {
            Object[] arrobject = new Object[-11059 & 292];
            arrobject[41 & 8322] = n;
            arrobject[825 & -20415] = GLU.gluErrorString((int)n);
            arrobject[8194 & -32474] = string;
            arrobject[5143 & 9091] = string2;
            System.err.format("GL error 0x%04x: %s at %s %s\n", arrobject);
        }
        return n;
    }

    private static String Method_12758(String string) {
        int n = 9186;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 71);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static void Method_12759() {
        if (Field_12673 && Field_12548[8210 & 1042] != Field_12548[2132 & 13856]) {
            Class_12440.Method_12981(11027 & 17470);
            Class_16867.Method_16913();
            Class_16867.Method_16967(25476 & 525, 0.0f);
            Class_16867.Method_16951(2834 & 1995, 5035 & -23789);
        }
    }

    public static void Method_12760() {
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glBegin((int)(21639 & -21657));
        GL11.glTexCoord2f((float)0.0f, (float)0.0f);
        GL11.glVertex3f((float)0.0f, (float)0.0f, (float)0.0f);
        GL11.glTexCoord2f((float)1.0f, (float)0.0f);
        GL11.glVertex3f((float)1.0f, (float)0.0f, (float)0.0f);
        GL11.glTexCoord2f((float)1.0f, (float)1.0f);
        GL11.glVertex3f((float)1.0f, (float)1.0f, (float)0.0f);
        GL11.glTexCoord2f((float)0.0f, (float)1.0f);
        GL11.glVertex3f((float)0.0f, (float)1.0f, (float)0.0f);
        GL11.glEnd();
    }

    private static String Method_12761(String string) {
        int n = 18933;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 49);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12762(String string) {
        int n = 17119;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 62);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12763(String string) {
        int n = 28750;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 66);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static Class_18480[] Method_12764() {
        try {
            Class_18480[] arrclass_18480 = Class_19719.Method_19734(Field_12651, Field_12614, Field_12628);
            Properties properties = Class_12440.Method_12829(Field_12651);
            for (int i = 8498 & -14207; i < arrclass_18480.length; ++i) {
                Class_18480 class_18480 = arrclass_18480[i];
                String string = properties.getProperty(class_18480.Method_18504());
                if (string == null) continue;
                class_18480.Method_18518();
                if (class_18480.Method_18511(string)) continue;
                Class_19426.Method_19610("[Shaders] Invalid value, option: " + class_18480.Method_18504() + ", value: " + string);
            }
            return arrclass_18480;
        }
        catch (IOException iOException) {
            Class_19426.Method_19610("[Shaders] Error reading configuration for " + Field_12651.Method_19215());
            iOException.printStackTrace();
            return null;
        }
    }

    private static String Method_12765(String string) {
        int n = 13285;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 114);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static void Method_12766() {
        if (Field_12673) {
            Class_12440.Method_12981(118 & -22256);
            Class_12440.Method_12858();
        }
    }

    public static void Method_12767(Class_4879 class_4879) {
        if (Field_12673 && !Field_12441 && Field_12543.\u0000strictfp()) {
            Class_3238 class_3238 = class_4879.Method_4923();
            int n = Class_3238.Method_3435(class_3238);
            Field_12543.Method_27377(n);
        }
    }

    private static String Method_12768(String string) {
        int n = 22804;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 77);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12769(String string) {
        int n = 6795;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 29);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12770(String string) {
        int n = 23890;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 28);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12771(String string) {
        int n = 5073;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 38);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12772(String string) {
        int n = 31312;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 19);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12773(String string) {
        int n = 1660;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 119);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static boolean Method_12774() {
        return (!Field_12586.Method_11097() ? 7561 & 565 : 14338 & 4) != 0;
    }

    private static String Method_12775(String string) {
        int n = 13220;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 16);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12776(String string) {
        int n = 30095;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 8);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static void Method_12777(String string, float f, float f2, float f3) {
        int n = Field_12548[Field_12498];
        if (n != 0) {
            int n2 = ARBShaderObjects.glGetUniformLocationARB((int)n, (CharSequence)string);
            ARBShaderObjects.glUniform3fARB((int)n2, (float)f, (float)f2, (float)f3);
            if (Class_12440.Method_12998()) {
                if (string.endsWith("Color")) {
                    Class_27062.Method_27077(string, f, f2, f3);
                } else {
                    Class_27062.Method_27070(string, f, f2, f3);
                }
            }
            Class_12440.Method_12757(Field_12614[Field_12498], string);
        }
    }

    public static void Method_12778() {
        Field_12696 = 8387 & 2081;
        Field_12653 = 11689 & 16899;
        Class_12440.Method_12977(Field_12482);
        Class_12440.Method_12981(2581 & -28539);
        Class_12440.Method_12985(-2 & -2, 1448 & -32748);
    }

    private static String Method_12779(String string) {
        int n = 23087;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 88);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static boolean Method_12780(Class_39702 class_39702) {
        if (!Field_12467) {
            return (233 & 2561) != 0;
        }
        Class_12440.Method_12988("shouldRenderClouds");
        return (Field_12441 ? Field_12501 : (class_39702.Field_39762 > 0 ? 16465 & -19319 : 18688 & -32237)) != 0;
    }

    public static void Method_12781(float f, float f2, float f3, float f4) {
        if (Field_12673 && !Field_12441) {
            Field_12645.Method_31223(f, f2, f3, f4);
        }
    }

    private static String Method_12782(String string) {
        int n = 496;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 35);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12783(String string) {
        int n = 16343;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 93);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static boolean Method_12784(String string) {
        return (Field_12518 == null ? 8468 & 232 : (int)(Field_12518.contains(string) ? 1 : 0)) != 0;
    }

    public static void Method_12785() {
        if (Field_12673) {
            Class_12440.Method_12988("beginBlockEntities");
            Class_12440.Method_12981(-12257 & 10701);
        }
    }

    private static void Method_12786() {
        int n;
        if (Field_12562 != 0) {
            EXTFramebufferObject.glDeleteFramebuffersEXT((int)Field_12562);
            Class_16867.Method_16968(Field_12558);
            Class_16867.Method_16968(Field_12704);
        }
        Field_12562 = EXTFramebufferObject.glGenFramebuffersEXT();
        GL11.glGenTextures((IntBuffer)((IntBuffer)Field_12558.clear().limit(Field_12512)));
        GL11.glGenTextures((IntBuffer)((IntBuffer)Field_12704.clear().limit(-30184 & 4113)));
        Field_12558.position(-32748 & 296);
        Field_12704.position(160 & 4113);
        Field_12704.get(Field_12624).position(25096 & 5591);
        EXTFramebufferObject.glBindFramebufferEXT((int)(285380416 & -2069844622), (int)Field_12562);
        GL20.glDrawBuffers((int)(276 & -17248));
        GL11.glReadBuffer((int)(288 & 9281));
        for (n = 2101 & 25666; n < Field_12512; ++n) {
            Class_16867.Method_16963(Field_12558.get(n));
            GL11.glTexParameteri((int)(19945 & 11745), (int)(10834 & 10242), (int)(-22256 & 10733));
            GL11.glTexParameteri((int)(12273 & 3563), (int)(11267 & 10367), (int)(14736 & -4351));
            GL11.glTexParameteri((int)(12257 & 3559), (int)(-6015 & 10753), (int)(28167 & -18640));
            GL11.glTexParameteri((int)(-28695 & 7653), (int)(31413 & -21504), (int)(9984 & 28292));
            GL11.glTexParameteri((int)(-29209 & 19937), (int)(471108299 & -2146920369), (int)(6413 & 14777));
            GL11.glTexImage2D((int)(-12817 & 11745), (int)(-24576 & 3076), (int)(-25322 & 22922), (int)Field_12681, (int)Field_12490, (int)(16387 & 2832), (int)(8026 & 14595), (int)(13583 & 22022), (FloatBuffer)null);
        }
        EXTFramebufferObject.glFramebufferTexture2DEXT((int)(-1858953888 & 243314120), (int)(1882123618 & 105942929), (int)(3569 & 32741), (int)Field_12558.get(-20205 & 44), (int)(25748 & 2048));
        GL20.glDrawBuffers((IntBuffer)Field_12482);
        GL11.glReadBuffer((int)(16386 & 2072));
        Class_12440.Method_12988("FT d");
        for (n = -11475 & 2178; n < Field_12508; ++n) {
            Class_16867.Method_16963(Field_12624[n]);
            GL11.glTexParameteri((int)(3555 & -29211), (int)(10279 & -5350), (int)(-22264 & 14736));
            GL11.glTexParameteri((int)(20469 & -25111), (int)(-1789 & 11271), (int)(28033 & 11020));
            GL11.glTexParameteri((int)(11769 & 7653), (int)(-18431 & 10317), (int)(30465 & -22921));
            GL11.glTexParameteri((int)(-29211 & 32737), (int)(10503 & 14864), (int)(28289 & 10077));
            GL11.glTexImage2D((int)(15841 & -12289), (int)(-23440 & 128), (int)Field_12660[n], (int)Field_12681, (int)Field_12490, (int)(-15872 & 4384), (int)(1321765101 & 1475825), (int)(268469223 & -2021555353), (ByteBuffer)null);
            EXTFramebufferObject.glFramebufferTexture2DEXT((int)(545496385 & -801845814), (int)((1678351584 & -2128556309) + n), (int)(32749 & 3569), (int)Field_12624[n], (int)(10280 & -28650));
            Class_12440.Method_12988("FT c");
        }
        for (n = 8706 & -27628; n < Field_12508; ++n) {
            Class_16867.Method_16963(Field_12624[(10 & 8488) + n]);
            GL11.glTexParameteri((int)(3555 & 8161), (int)(27666 & 14946), (int)(-17568 & 10640));
            GL11.glTexParameteri((int)(-12821 & 16353), (int)(-18169 & 10347), (int)(10496 & 15140));
            GL11.glTexParameteri((int)(7665 & 4065), (int)(14353 & -5555), (int)(26113 & 10147));
            GL11.glTexParameteri((int)(3561 & -21007), (int)(15106 & 11273), (int)(9793 & -20985));
            GL11.glTexImage2D((int)(-25115 & 4065), (int)(24 & -990), (int)Field_12660[n], (int)Field_12681, (int)Field_12490, (int)(-29245 & 4144), (int)(436831985 & 541123049), (int)(-536575001 & 240292711), (ByteBuffer)null);
            Class_12440.Method_12988("FT ca");
        }
        n = EXTFramebufferObject.glCheckFramebufferStatusEXT((int)(753200500 & -2129621685));
        if (n == (16944603 & 135057118)) {
            Class_12440.Method_12807("[Shaders] Error: Failed framebuffer incomplete formats");
            for (int i = 2099 & -27008; i < Field_12508; ++i) {
                Class_16867.Method_16963(Field_12704.get(i));
                GL11.glTexImage2D((int)(24561 & 3555), (int)(4370 & 3209), (int)(6542 & 22825), (int)Field_12681, (int)Field_12490, (int)(168 & -11263), (int)(156287465 & 1084398823), (int)(1714218855 & -2146397209), (ByteBuffer)null);
                EXTFramebufferObject.glFramebufferTexture2DEXT((int)(-2011640344 & 2145618), (int)((840994017 & 202161636) + i), (int)(-12831 & 11751), (int)Field_12704.get(i), (int)(5696 & 16401));
                Class_12440.Method_12988("FT c");
            }
            n = EXTFramebufferObject.glCheckFramebufferStatusEXT((int)(207662936 & 1090706759));
            if (n == (537124309 & 72387807)) {
                Class_26062.Method_26067("complete");
            }
        }
        Class_16867.Method_16963(-10110 & 8273);
        if (n != (691047637 & 335654109)) {
            Class_12440.Method_12807("[Shaders] Error: Failed creating framebuffer! (Status " + n + ")");
        } else {
            Class_26062.Method_26067("Framebuffer created.");
        }
    }

    public static void Method_12787(float f, float f2, float f3, float f4) {
        Class_16867.Method_16981(f, f2, f3, f4);
        Field_12457 = f;
        Field_12574 = f2;
        Field_12506 = f3;
    }

    private static String Method_12788(String string) {
        int n = 4990;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 43);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12789(String string) {
        int n = 32021;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 86);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static int Method_12790(int n, String string) {
        if (n == 0) {
            if (string.equals("texture")) {
                return 10364 & 20608;
            }
            if (string.equals("lightmap")) {
                return 10249 & 769;
            }
            if (string.equals("normals")) {
                return 9218 & 546;
            }
            if (string.equals("specular")) {
                return 1091 & 703;
            }
            if (string.equals("shadowtex0") || string.equals("watershadow")) {
                return 29988 & 70;
            }
            if (string.equals("shadow")) {
                return Field_12473 ? 311 & -3451 : -16884 & 4;
            }
            if (string.equals("shadowtex1")) {
                return 9829 & 2053;
            }
            if (string.equals("depthtex0")) {
                return -31594 & 38;
            }
            if (string.equals("gaux1")) {
                return 3111 & 20751;
            }
            if (string.equals("gaux2")) {
                return -30708 & 409;
            }
            if (string.equals("gaux3")) {
                return -30567 & 1293;
            }
            if (string.equals("gaux4")) {
                return 286 & 5834;
            }
            if (string.equals("depthtex1")) {
                return -30708 & 18078;
            }
            if (string.equals("shadowcolor0") || string.equals("shadowcolor")) {
                return -195 & 141;
            }
            if (string.equals("shadowcolor1")) {
                return 17566 & 4366;
            }
            if (string.equals("noisetex")) {
                return 2351 & -23345;
            }
        }
        if (n == (-18943 & 15) || n == (10131 & 2)) {
            if (string.equals("colortex0") || string.equals("colortex0")) {
                return 2048 & -27370;
            }
            if (string.equals("colortex1") || string.equals("gdepth")) {
                return 18945 & -28579;
            }
            if (string.equals("colortex2") || string.equals("gnormal")) {
                return 2186 & 818;
            }
            if (string.equals("colortex3") || string.equals("composite")) {
                return -32765 & 12871;
            }
            if (string.equals("shadowtex0") || string.equals("watershadow")) {
                return 2564 & 24839;
            }
            if (string.equals("shadow")) {
                return Field_12473 ? 1285 & -28635 : 24581 & 3270;
            }
            if (string.equals("shadowtex1")) {
                return 4103 & 2125;
            }
            if (string.equals("depthtex0") || string.equals("gdepthtex")) {
                return 646 & 262;
            }
            if (string.equals("colortex4") || string.equals("gaux1")) {
                return 71 & -28409;
            }
            if (string.equals("colortex5") || string.equals("gaux2")) {
                return 4140 & 11016;
            }
            if (string.equals("colortex6") || string.equals("gaux3")) {
                return 4683 & 3225;
            }
            if (string.equals("colortex7") || string.equals("gaux4")) {
                return 26 & 22698;
            }
            if (string.equals("depthtex1")) {
                return -24485 & 523;
            }
            if (string.equals("depthtex2")) {
                return 1294 & -6004;
            }
            if (string.equals("shadowcolor0") || string.equals("shadowcolor")) {
                return 17469 & -24049;
            }
            if (string.equals("shadowcolor1")) {
                return -7602 & 4254;
            }
            if (string.equals("noisetex")) {
                return 9535 & -30001;
            }
        }
        return -1 & -1;
    }

    public static void Method_12791(Class_18 class_18) {
        Field_12683 = Class_18.Field_89;
        Field_12546 = GLContext.getCapabilities();
        Field_12481 = GL11.glGetString((int)(8071 & 24322));
        Field_12563 = GL11.glGetString((int)(8000 & 16153));
        Field_12669 = GL11.glGetString((int)(7945 & 24389));
        Class_26062.Method_26067("ShadersMod version: 2.4.69BlazingPack69");
        Class_26062.Method_26067("OpenGL Version: " + Field_12481);
        Class_26062.Method_26067("Vendor:  " + Field_12563);
        Class_26062.Method_26067("Renderer: " + Field_12669);
        Class_26062.Method_26067("Capabilities: " + (Class_12440.Field_12546.OpenGL20 ? " 2.0 " : " - ") + (Class_12440.Field_12546.OpenGL21 ? " 2.1 " : " - ") + (Class_12440.Field_12546.OpenGL30 ? " 3.0 " : " - ") + (Class_12440.Field_12546.OpenGL32 ? " 3.2 " : " - ") + (Class_12440.Field_12546.OpenGL40 ? " 4.0 " : " - "));
        Class_26062.Method_26067("GL_MAX_DRAW_BUFFERS: " + GL11.glGetInteger((int)(354715700 & 1108060711)));
        Class_26062.Method_26067("GL_MAX_COLOR_ATTACHMENTS_EXT: " + GL11.glGetInteger((int)(107539679 & 1502650079)));
        Class_26062.Method_26067("GL_MAX_TEXTURE_IMAGE_UNITS: " + GL11.glGetInteger((int)(543283314 & 25333363)));
        Field_12606 = Class_12440.Field_12546.OpenGL30;
        Class_12440.Method_12945();
    }

    public static void Method_12792(Class_23823 class_23823) {
        Field_12694 = Class_12440.Method_12749(class_23823);
    }

    private static String Method_12793(String string) {
        int n = 1713;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 5);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static void Method_12794(Class_283 class_283) {
        if (Field_12590 != class_283) {
            Class_283 class_2832 = Field_12590;
            Field_12590 = class_283;
            if (class_2832 != null && class_283 != null) {
                int n = class_283.Field_284.Method_18379();
                int n2 = class_2832.Field_284.Method_18379();
                boolean bl = Field_12628.contains(n);
                boolean bl2 = Field_12628.contains(n2);
                if (bl || bl2) {
                    Class_12440.Method_12961();
                }
            }
            Class_8290.Method_8293();
        }
    }

    public static Class_18480[] Method_12795(Class_18480[] arrclass_18480) {
        ArrayList<Class_18480> arrayList = new ArrayList<Class_18480>();
        for (int i = 10 & 7168; i < arrclass_18480.length; ++i) {
            Class_18480 class_18480 = arrclass_18480[i];
            if (!class_18480.Method_18508() || !class_18480.Method_18498()) continue;
            arrayList.add(class_18480);
        }
        Class_18480[] arrclass_184802 = arrayList.toArray(new Class_18480[arrayList.size()]);
        return arrclass_184802;
    }

    private static String Method_12796(String string) {
        int n = 778;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 41);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static boolean Method_12797() {
        return Field_12694;
    }

    private static String Method_12798(String string) {
        int n = 10810;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 64);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12799(String string) {
        int n = 13942;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 60);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12800(String string) {
        int n = 23993;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 94);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static void Method_12801(Vec3 vec3) {
        Field_12552 = (float)vec3.\u0000= final;
        Field_12627 = (float)vec3.\u0000strictfp;
        Field_12663 = (float)vec3.\u0000, `;
        Class_12440.Method_12777("skyColor", Field_12552, Field_12627, Field_12663);
    }

    private static Reader Method_12802(String string) {
        Reader reader = Class_42445.Method_42450(string);
        return reader != null ? reader : new InputStreamReader(Field_12651.Method_19218(string));
    }

    public static void Method_12803(Class_1061 class_1061) {
        if (Field_12673) {
            Class_12440.Method_12981(16538 & 4433);
            Class_12440.Method_12725(class_1061);
        }
    }

    private static String Method_12804(String string) {
        int n = 24762;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 55);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    static ArrayList Method_12805() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add(Field_12514);
        arrayList.add(Field_12576);
        try {
            if (!Field_12600.exists()) {
                Field_12600.mkdir();
            }
            File[] arrfile = Field_12600.listFiles();
            for (int i = -31470 & 68; i < arrfile.length; ++i) {
                File file = arrfile[i];
                String string = file.getName();
                if (file.isDirectory()) {
                    File file2;
                    if (!string.equals("debug") && (file2 = new File(file, "shaders")).exists() && !file2.isDirectory()) continue;
                }
                if (!file.isFile() || !string.toLowerCase().endsWith(".zip")) continue;
                arrayList.add(string);
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        return arrayList;
    }

    public static boolean Method_12806(Class_17531 class_17531) {
        switch (Class_8100.Field_8101[class_17531.ordinal()]) {
            case 1: {
                return Field_12463.Method_11103();
            }
            case 2: {
                return Field_12647.Method_11103();
            }
            case 3: {
                return Field_12502.Method_11103();
            }
            case 4: {
                return Field_12633.Method_11103();
            }
        }
        return (256 & 3156) != 0;
    }

    private static void Method_12807(String string) {
        Class_26062.Method_26069(string);
        Class_12440.Field_12683.Field_105.Method_45458().Method_41188(new Class_2840(string));
    }

    private static String Method_12808(String string) {
        int n = 5159;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 33);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12809(String string) {
        int n = 30272;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 102);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static void Method_12810(Class_18480[] arrclass_18480, Class_19214 class_19214) {
        Properties properties = new Properties();
        if (Field_12671 != null) {
            for (int i = -20028 & 16416; i < arrclass_18480.length; ++i) {
                Class_18480 class_18480 = arrclass_18480[i];
                if (!class_18480.Method_18498() || !class_18480.Method_18508()) continue;
                properties.setProperty(class_18480.Method_18504(), class_18480.Method_18493());
            }
        }
        try {
            Class_12440.Method_12918(class_19214, properties);
        }
        catch (IOException iOException) {
            Class_19426.Method_19610("[Shaders] Error saving configuration for " + Field_12651.Method_19215());
            iOException.printStackTrace();
        }
    }

    public static void Method_12811(String string, int n) {
        int n2 = Field_12548[Field_12498];
        if (n2 != 0) {
            int n3 = ARBShaderObjects.glGetUniformLocationARB((int)n2, (CharSequence)string);
            ARBShaderObjects.glUniform1iARB((int)n3, (int)n);
            if (Class_12440.Method_12998()) {
                Class_27062.Method_27076(string, n);
            }
            Class_12440.Method_12757(Field_12614[Field_12498], string);
        }
    }

    public static void Method_12812() {
        if (Field_12441) {
            Class_12440.Method_12988("shadow clear pre");
            EXTFramebufferObject.glFramebufferTexture2DEXT((int)(297049469 & -1979544256), (int)(570986376 & 1354808579), (int)(3565 & 7649), (int)Field_12579.get(-31737 & 20512), (int)(7744 & 8226));
            GL11.glClearColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            GL20.glDrawBuffers((IntBuffer)Field_12569[-27842 & 9439]);
            Class_12440.Method_12923("shadow clear");
            GL11.glClear((int)(16660 & 21760));
            Class_12440.Method_12988("shadow clear");
        } else {
            Class_12440.Method_12988("clear pre");
            if (Field_12572[10756 & 16504]) {
                GL20.glDrawBuffers((int)(18927072 & -1073180959));
                GL11.glClear((int)(20481 & -16384));
            }
            if (Field_12572[17437 & -28127]) {
                GL20.glDrawBuffers((int)(1207996385 & 378129637));
                GL11.glClearColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                GL11.glClear((int)(16528 & 17409));
            }
            for (int i = -21998 & 5191; i < Field_12508; ++i) {
                if (!Field_12572[i]) continue;
                GL20.glDrawBuffers((int)((1325452784 & -1867411738) + i));
                GL11.glClearColor((float)0.0f, (float)0.0f, (float)0.0f, (float)0.0f);
                GL11.glClear((int)(16387 & 27584));
            }
            Class_12440.Method_12977(Field_12482);
            Class_12440.Method_12923("clear");
            Class_12440.Method_12988("clear");
        }
    }

    private static void Method_12813() {
        Field_12625 = new HashMap();
        if (Field_12467) {
            ArrayList<String> arrayList = new ArrayList<String>();
            String string = "/shaders/lang/";
            String string2 = "en_US";
            String string3 = ".lang";
            arrayList.add(string + string2 + string3);
            if (!Class_19426.Method_19571().Field_39826.equals(string2)) {
                arrayList.add(string + Class_19426.Method_19571().Field_39826 + string3);
            }
            try {
                for (String string4 : arrayList) {
                    InputStream inputStream = Field_12651.Method_19218(string4);
                    if (inputStream == null) continue;
                    Properties properties = new Properties();
                    Class_14688.Method_14696(inputStream, properties);
                    inputStream.close();
                    for (String string5 : properties.keySet()) {
                        String string6 = properties.getProperty(string5);
                        Field_12625.put(string5, string6);
                    }
                }
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }
    }

    private static String Method_12814(String string) {
        int n = 11202;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 121);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12815(String string) {
        int n = 6756;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 70);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static boolean Method_12816(int n, String string, List list) {
        IntBuffer intBuffer = BufferUtils.createIntBuffer((int)(17 & 27175));
        int n2 = GL20.glGetShaderi((int)n, (int)(536915879 & -1762620540));
        if (n2 <= (-32765 & 21017)) {
            return (3793 & -24573) != 0;
        }
        for (int i = 97 & -11776; i < list.size(); ++i) {
            String string2 = (String)list.get(i);
            Class_26062.Method_26067("File: " + (i + (16385 & 11459)) + " = " + string2);
        }
        String string3 = GL20.glGetShaderInfoLog((int)n, (int)n2);
        Class_26062.Method_26067("Shader info log: " + string + "\n" + string3);
        return (16 & -31964) != 0;
    }

    public static boolean Method_12817() {
        return Field_12642;
    }

    public static void Method_12818() {
        Class_12440.Field_12683.Field_25.Method_2790();
    }

    public static boolean Method_12819() {
        return (1156 & 4880) != 0;
    }

    private static String Method_12820(String string) {
        int n = 2506;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 67);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12821(String string) {
        int n = 12899;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 99);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12822(String string) {
        int n = 24811;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 53);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static void Method_12823(boolean bl) {
    }

    private static String Method_12824(String string) {
        int n = 20140;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 12);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12825(String string) {
        int n = 10425;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 34);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static Class_18480[] Method_12826(Class_18480[] arrclass_18480) {
        ArrayList<Class_18480> arrayList = new ArrayList<Class_18480>();
        for (int i = -32448 & 513; i < arrclass_18480.length; ++i) {
            Class_18480 class_18480 = arrclass_18480[i];
            if (!class_18480.Method_18512()) continue;
            arrayList.add(class_18480);
        }
        Class_18480[] arrclass_184802 = arrayList.toArray(new Class_18480[arrayList.size()]);
        return arrclass_184802;
    }

    public static Class_18480[] Method_12827() {
        return Field_12671;
    }

    private static String Method_12828(String string) {
        int n = 28758;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static Properties Method_12829(Class_19214 class_19214) {
        Properties properties = new Properties();
        String string = Field_12442 + "/" + class_19214.Method_19215() + ".txt";
        File file = new File(Class_18.Field_89.Field_68, string);
        if (file.exists() && file.isFile() && file.canRead()) {
            FileInputStream fileInputStream = new FileInputStream(file);
            properties.load(fileInputStream);
            fileInputStream.close();
            return properties;
        }
        return properties;
    }

    private static String Method_12830(String string) {
        int n = 30864;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 95);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static void Method_12831(Class_11452 class_11452, String string) {
        if (string == null) {
            string = class_11452.Method_11537();
        }
        switch (Class_8100.Field_8102[class_11452.ordinal()]) {
            case 1: {
                Field_12617 = Class_19426.Method_19502(string, 16512 & 14689);
                break;
            }
            case 2: {
                Field_12461 = Class_19426.Method_19596(string, (18099 & 257) != 0);
                break;
            }
            case 3: {
                Field_12493 = Class_19426.Method_19596(string, (9251 & 16913) != 0);
                break;
            }
            case 4: {
                Field_12554 = Class_19426.Method_19595(string, 1.0f);
                break;
            }
            case 5: {
                Field_12449 = Class_19426.Method_19595(string, 1.0f);
                break;
            }
            case 6: {
                Field_12454 = Class_19426.Method_19595(string, 0.6962025f * 0.17954546f);
                break;
            }
            case 7: {
                Field_12501 = Class_19426.Method_19596(string, (75 & 3077) != 0);
                break;
            }
            case 8: {
                Field_12622.\u0000strictfp(string);
                break;
            }
            case 9: {
                Field_12527.\u0000strictfp(string);
                break;
            }
            case 10: {
                Field_12519 = string;
                break;
            }
            case 11: {
                Field_12621 = Class_19426.Method_19596(string, (-26111 & 16577) != 0);
                break;
            }
            case 12: {
                Field_12638 = Class_19426.Method_19596(string, (-31655 & 2177) != 0);
                break;
            }
            case 13: {
                Field_12486 = Class_19426.Method_19502(string, -14592 & 14337);
                break;
            }
            case 14: {
                Field_12446 = Class_19426.Method_19502(string, -26368 & 9282);
                break;
            }
            case 15: {
                Field_12678 = Class_19426.Method_19502(string, 532 & -30591);
                break;
            }
            case 16: {
                Field_12462 = Class_19426.Method_19502(string, -20466 & 3073);
                break;
            }
            case 17: {
                Field_12462 = Class_19426.Method_19502(string, 12080 & -16256);
                break;
            }
            case 18: {
                Field_12462 = Class_19426.Method_19502(string, 17793 & 14898);
                break;
            }
            default: {
                throw new IllegalArgumentException("Unknown option: " + (Object)((Object)class_11452));
            }
        }
    }

    private static String Method_12832(String string) {
        int n = 17293;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 63);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static void Method_12833(boolean bl) {
        GL11.glMatrixMode((int)(-10480 & 7940));
        GL11.glPushMatrix();
        GL11.glMatrixMode((int)(-24793 & 30601));
        GL11.glPushMatrix();
        GL11.glMatrixMode((int)(-16486 & 5889));
        if (bl) {
            Class_12440.Method_12981(5035 & 11305);
        } else {
            Class_12440.Method_12981(307 & -22957);
        }
        Class_12440.Method_12988("beginHand");
        Class_12440.Method_12923("beginHand");
    }

    private static String Method_12834(String string) {
        int n = 24180;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 84);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static void Method_12835() {
        if (Field_12503 == null && Field_12534 != null) {
            Field_12503 = Class_12440.Method_12877(1167 & -28369, Field_12534);
        }
        if (Field_12503 == null) {
            Field_12503 = new Class_34748(Field_12649, Field_12649);
        }
    }

    private static String Method_12836(String string) {
        int n = 7695;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 115);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12837(String string) {
        int n = 16032;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 117);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12838(String string) {
        int n = 19392;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 130);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12839(String string) {
        int n = 13823;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 105);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12840(String string) {
        int n = 26896;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 25);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static int Method_12841(int n, String string, String string2) {
        Class_12440.Method_12988("pre setupProgram");
        int n2 = ARBShaderObjects.glCreateProgramObjectARB();
        Class_12440.Method_12988("create");
        if (n2 != 0) {
            Field_12589 = 13702 & 0;
            Field_12555 = -24320 & 4272;
            Field_12596 = 4256 & -7152;
            int n3 = Class_12440.Method_12924(string);
            int n4 = Class_12440.Method_12902(string2);
            Class_12440.Method_12988("create");
            if (n3 == 0 && n4 == 0) {
                ARBShaderObjects.glDeleteObjectARB((int)n2);
                n2 = -31674 & 6401;
            } else {
                if (n3 != 0) {
                    ARBShaderObjects.glAttachObjectARB((int)n2, (int)n3);
                    Class_12440.Method_12988("attach");
                }
                if (n4 != 0) {
                    ARBShaderObjects.glAttachObjectARB((int)n2, (int)n4);
                    Class_12440.Method_12988("attach");
                }
                if (Field_12589) {
                    ARBVertexShader.glBindAttribLocationARB((int)n2, (int)Field_12643, (CharSequence)"mc_Entity");
                    Class_12440.Method_12988("mc_Entity");
                }
                if (Field_12555) {
                    ARBVertexShader.glBindAttribLocationARB((int)n2, (int)Field_12652, (CharSequence)"mc_midTexCoord");
                    Class_12440.Method_12988("mc_midTexCoord");
                }
                if (Field_12596) {
                    ARBVertexShader.glBindAttribLocationARB((int)n2, (int)Field_12609, (CharSequence)"at_tangent");
                    Class_12440.Method_12988("at_tangent");
                }
                ARBShaderObjects.glLinkProgramARB((int)n2);
                if (GL20.glGetProgrami((int)n2, (int)(17861522 & -865694833)) != (18889 & 1075)) {
                    Class_26062.Method_26069("Error linking program: " + n2);
                }
                Class_12440.Method_12723(n2, string + ", " + string2);
                if (n3 != 0) {
                    ARBShaderObjects.glDetachObjectARB((int)n2, (int)n3);
                    ARBShaderObjects.glDeleteObjectARB((int)n3);
                }
                if (n4 != 0) {
                    ARBShaderObjects.glDetachObjectARB((int)n2, (int)n4);
                    ARBShaderObjects.glDeleteObjectARB((int)n4);
                }
                Class_12440.Field_12548[n] = n2;
                Class_12440.Method_12981(n);
                ARBShaderObjects.glValidateProgramARB((int)n2);
                Class_12440.Method_12981(1226 & -12288);
                Class_12440.Method_12723(n2, string + ", " + string2);
                int n5 = GL20.glGetProgrami((int)n2, (int)(315394951 & -1946092621));
                if (n5 != (-6047 & 4619)) {
                    String string3 = "\"";
                    Class_12440.Method_12807("[Shaders] Error: Invalid program " + string3 + Field_12614[n] + string3);
                    ARBShaderObjects.glDeleteObjectARB((int)n2);
                    n2 = 667 & -8188;
                }
            }
        }
        return n2;
    }

    private static String Method_12842(String string) {
        int n = 21914;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 59);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static Class_37465[] Method_12843(Properties properties, int n) {
        String string = "texture." + Field_12687[n] + ".";
        Set<Object> set = properties.keySet();
        ArrayList<Class_37465> arrayList = new ArrayList<Class_37465>();
        for (String string2 : set) {
            if (!string2.startsWith(string)) continue;
            String string3 = string2.substring(string.length());
            String string4 = properties.getProperty(string2).trim();
            int n2 = Class_12440.Method_12790(n, string3);
            if (n2 < 0) {
                Class_26062.Method_26066("Invalid texture name: " + string2);
                continue;
            }
            Class_37465 class_37465 = Class_12440.Method_12877(n2, string4);
            if (class_37465 == null) continue;
            arrayList.add(class_37465);
        }
        if (arrayList.size() <= 0) {
            return null;
        }
        Class_37465[] arrclass_37465 = arrayList.toArray(new Class_37465[arrayList.size()]);
        return arrclass_37465;
    }

    private static String Method_12844(String string) {
        int n = 12579;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 56);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static void Method_12845() {
        Field_12653 = 658 & -16096;
        Class_12440.Method_12811("fogMode", 10496 & 756);
    }

    public static void Method_12846() {
        Field_12536 = -23295 & 581;
    }

    private static String Method_12847(String string) {
        int n = 16284;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 65);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static void Method_12848(File file) {
        File[] arrfile;
        if (file.exists() && file.isDirectory() && (arrfile = file.listFiles()) != null) {
            for (int i = 7168 & 16704; i < arrfile.length; ++i) {
                File file2 = arrfile[i];
                if (file2.isDirectory()) {
                    Class_12440.Method_12848(file2);
                }
                file2.delete();
            }
        }
    }

    private static String Method_12849(String string) {
        int n = 28759;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 76);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12850(String string) {
        int n = 20892;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 101);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12851(String string) {
        int n = 31077;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 75);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static Class_18480[] Method_12852(String string) {
        Object[] arrobject = (Class_18480[])Field_12671.clone();
        if (Field_12445 == null) {
            if (Field_12689 != null) {
                Class_24723 class_24723 = new Class_24723(Field_12689, (Class_18480[])arrobject);
                arrobject = (Class_18480[])Class_19426.Method_19528(arrobject, class_24723, 9664 & -32247);
            }
            arrobject = Class_12440.Method_12826((Class_18480[])arrobject);
            return arrobject;
        }
        String string2 = string != null ? "screen." + string : "screen";
        Class_26599 class_26599 = (Class_26599)Field_12445.get(string2);
        if (class_26599 == null) {
            return new Class_18480[4400 & 2567];
        }
        Class_18480[] arrclass_18480 = class_26599.Method_26603();
        ArrayList<Class_18480> arrayList = new ArrayList<Class_18480>();
        for (int i = 4178 & 9609; i < arrclass_18480.length; ++i) {
            Class_18480 class_18480 = arrclass_18480[i];
            if (class_18480 == null) {
                arrayList.add(null);
                continue;
            }
            if (class_18480 instanceof Class_19759) {
                Class_18480[] arrclass_184802 = Class_12440.Method_12881(Field_12445, (Class_18480[])arrobject);
                arrayList.addAll(Arrays.asList(arrclass_184802));
                continue;
            }
            arrayList.add(class_18480);
        }
        Class_18480[] arrclass_184803 = arrayList.toArray(new Class_18480[arrayList.size()]);
        return arrclass_184803;
    }

    private static String Method_12853(String string) {
        int n = 8876;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 104);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12854(String string) {
        int n = 14592;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 129);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static void Method_12855() {
        Class_26062.Method_26067("Save ShadersMod configuration.");
        if (Field_12662 == null) {
            Field_12662 = new Class_34319();
        }
        Class_11452[] arrclass_11452 = Class_11452.Method_11482();
        for (int i = 4296 & 3623; i < arrclass_11452.length; ++i) {
            Class_11452 class_11452 = arrclass_11452[i];
            String string = class_11452.Method_11489();
            String string2 = Class_12440.Method_12936(class_11452);
            Field_12662.setProperty(string, string2);
        }
        try {
            FileWriter fileWriter = new FileWriter(Field_12582);
            Field_12662.store(fileWriter, (String)null);
            fileWriter.close();
        }
        catch (Exception exception) {
            Class_26062.Method_26069("Error saving configuration: " + exception.getClass().getName() + ": " + exception.getMessage());
        }
    }

    private static void Method_12856() {
        Field_12536 = -29684 & 4384;
        Field_12450 = Math.round((float)Field_12485 * Field_12449);
        Field_12568 = Math.round((float)Field_12510 * Field_12449);
        Class_12440.Method_12900();
    }

    private static String Method_12857(String string) {
        int n = 14619;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 45);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static void Method_12858() {
        if (Field_12523) {
            Field_12523 = 22801 & -32762;
            Class_26062.Method_26067("Reset model renderers");
            Collection collection = Field_12683.Method_266().Method_8520().values();
            for (Class_27380 class_27380 : collection) {
                if (!(class_27380 instanceof Class_28538)) continue;
                Class_28538 class_28538 = (Class_28538)class_27380;
                Class_12440.Method_12910(class_28538.Method_28550());
            }
        }
    }

    public static String Method_12859(String string, String string2) {
        String string3 = (String)Field_12625.get(string);
        return string3 == null ? string2 : string3;
    }

    private static String Method_12860(String string) {
        int n = 32152;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 124);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12861(String string) {
        int n = 32601;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 23);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static void Method_12862(Class_31961 class_31961) {
        class_31961.Method_32000();
        if (class_31961.Field_31966 != null) {
            int n = class_31961.Field_31966.size();
            for (int i = 8736 & 18567; i < n; ++i) {
                Class_12440.Method_12862((Class_31961)class_31961.Field_31966.get(i));
            }
        }
    }

    private static void Method_12863() {
        Object object;
        Object object2;
        Field_12494 = new IdentityHashMap(-30276 & 9516);
        if (Field_12494.isEmpty()) {
            for (Object object3 : Class_3238.Field_3271.\u0000strictfp()) {
                object2 = (Class_3238)Class_3238.Field_3271.Method_3639(object3);
                object = Class_3238.Field_3271.\u0000strictfp(object2);
                Field_12494.put(object2, object);
            }
        }
        Object object4 = null;
        try {
            object4 = new BufferedReader(new InputStreamReader(Field_12651.Method_19218("/mc_Entity_x.txt")));
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (object4 != null) {
            try {
                Object object3;
                while ((object3 = ((BufferedReader)object4).readLine()) != null) {
                    object2 = Field_12484.matcher((CharSequence)object3);
                    if (((Matcher)object2).matches()) {
                        object = ((Matcher)object2).group(2857 & 25671);
                        String string = ((Matcher)object2).group(-32154 & 274);
                        int n = Integer.parseInt(string);
                        Class_3238 class_3238 = Class_3238.Method_3341((String)object);
                        if (class_3238 != null) {
                            Field_12494.put(class_3238, n);
                            continue;
                        }
                        Object[] arrobject = new Object[16899 & -25399];
                        arrobject[8253 & 19200] = object;
                        Class_26062.Method_26064("Unknown block name %s", arrobject);
                        continue;
                    }
                    Object[] arrobject = new Object[1447 & -20415];
                    arrobject[-3456 & 3077] = object3;
                    Class_26062.Method_26064("unmatched %s\n", arrobject);
                }
            }
            catch (Exception exception) {
                Class_26062.Method_26066("Error parsing mc_Entity_x.txt");
            }
        }
        if (object4 != null) {
            try {
                ((BufferedReader)object4).close();
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
    }

    private static String Method_12864(String string) {
        int n = 5087;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 118);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static void Method_12865() {
        if (Field_12696) {
            Class_12440.Method_12981(6 & 324);
        } else if (Field_12498 == (27 & 3202) || Field_12498 == (-7805 & 535)) {
            Class_12440.Method_12981(18441 & 1057);
        }
    }

    public static boolean Method_12866(String string) {
        if (string == null) {
            return (25654 & 4680) != 0;
        }
        if (string.length() <= 0) {
            return (6 & 5441) != 0;
        }
        int n = string.lastIndexOf("/");
        if (n >= 0) {
            string = string.substring(n + (69 & -19197));
        }
        return Arrays.asList(Field_12614).contains(string);
    }

    public static void Method_12867() {
        Field_12617 += 5634 & 259;
        if ((Field_12617 = Field_12617 / (74 & 4898) * (-30741 & 8194)) > (-32602 & 6156)) {
            Field_12617 = -19968 & 18441;
        }
        Field_12617 = Class_19426.Method_19606(Field_12617, 16 & 8810, -32756 & 420);
    }

    private static String Method_12868(String string) {
        int n = 11938;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 18);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12869(String string) {
        int n = 14408;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 120);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static void Method_12870(int n, int n2, int n3, int n4) {
        Class_16867.Method_16923((25093 & -32759) != 0, (17569 & 8271) != 0, (487 & 12297) != 0, (16611 & 12309) != 0);
        if (Field_12441) {
            GL11.glViewport((int)(21056 & 42), (int)(18432 & 12324), (int)Field_12450, (int)Field_12568);
        } else {
            GL11.glViewport((int)(2112 & -24576), (int)(-32679 & 28806), (int)Field_12681, (int)Field_12490);
            EXTFramebufferObject.glBindFramebufferEXT((int)(1142988104 & 277523825), (int)Field_12562);
            Field_12598 = 8195 & 23441;
            Class_16867.Method_16979();
            Class_16867.Method_16927();
            Class_12440.Method_12977(Field_12659);
            Class_12440.Method_12981(18946 & 4486);
            Class_12440.Method_12988("beginRenderPass");
        }
    }

    private static String Method_12871(String string) {
        int n = 17078;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 74);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static void Method_12872() {
        Field_12700 = -31324 & 2066;
    }

    public static void Method_12873(boolean bl) {
        Field_12640 = bl;
    }

    private static String Method_12874(String string) {
        int n = 1228;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 90);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12875(String string) {
        int n = 6971;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 7);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12876(String string) {
        int n = 1438;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 13);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static Class_37465 Method_12877(int n, String string) {
        if (string == null) {
            return null;
        }
        if ((string = string.trim()).indexOf(8494 & 2094) < 0) {
            string = string + ".png";
        }
        try {
            String string2 = "shaders/" + Class_35556.Method_35566(string, "/");
            InputStream inputStream = Field_12651.Method_19218(string2);
            if (inputStream == null) {
                Class_26062.Method_26066("Texture not found: " + string);
                return null;
            }
            IOUtils.closeQuietly((InputStream)inputStream);
            Class_28961 class_28961 = new Class_28961(string2);
            class_28961.Method_28967(Field_12683.Method_208());
            Class_37465 class_37465 = new Class_37465(n, string2, class_28961);
            return class_37465;
        }
        catch (IOException iOException) {
            Class_26062.Method_26066("Error loading texture: " + string);
            Class_26062.Method_26066("" + iOException.getClass().getName() + ": " + iOException.getMessage());
            return null;
        }
    }

    public static void Method_12878() {
        Class_12440.Method_12981(-28637 & 1099);
    }

    private static String Method_12879(String string) {
        int n = 31399;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 32);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static IntBuffer Method_12880(int n) {
        ByteBuffer byteBuffer = Field_12595;
        int n2 = byteBuffer.limit();
        byteBuffer.position(n2).limit(n2 + n * (4100 & 19988));
        return byteBuffer.asIntBuffer();
    }

    private static Class_18480[] Method_12881(Map map, Class_18480[] arrclass_18480) {
        Object object;
        Object object2;
        HashSet<String> hashSet = new HashSet<String>();
        for (String string : map.keySet()) {
            object = (Class_26599)map.get(string);
            object2 = ((Class_26599)object).Method_26603();
            for (int i = 6400 & 80; i < ((Class_18480[])object2).length; ++i) {
                Class_18480 class_18480 = object2[i];
                if (class_18480 == null) continue;
                hashSet.add(class_18480.Method_18504());
            }
        }
        ArrayList arrayList = new ArrayList();
        for (int i = -28640 & 3481; i < arrclass_18480.length; ++i) {
            object = arrclass_18480[i];
            if (!((Class_18480)object).Method_18512() || hashSet.contains(object2 = ((Class_18480)object).Method_18504())) continue;
            arrayList.add(object);
        }
        Class_18480[] arrclass_184802 = arrayList.toArray(new Class_18480[arrayList.size()]);
        return arrclass_184802;
    }

    public static void Method_12882() {
        if (Class_12440.Method_12928()) {
            Field_12644 = 0.010204081f * 49.0f;
            Field_12524 = 0.53571427f * 1.1200001f;
            Field_12547 = 1.1728395f * 0.68210524f;
        } else {
            Field_12644 = 1.0f;
            Field_12524 = 1.0f;
            Field_12547 = 1.0f;
        }
    }

    private static void Method_12883(String string, String string2) {
        try {
            File file = new File(Field_12600, "debug/" + string);
            file.getParentFile().mkdirs();
            Class_19426.Method_19550(file, string2);
        }
        catch (IOException iOException) {
            Class_19426.Method_19610("Error saving: " + string);
            iOException.printStackTrace();
        }
    }

    private static String Method_12884(String string) {
        int n = 9520;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 40);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static void Method_12885() {
    }

    private static String Method_12886(String string) {
        int n = 13782;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 36);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12887(String string) {
        int n = 20033;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 81);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static void Method_12888() {
        Field_12598 = 18372 & -30720;
        Field_12683.Method_164().Method_19152((12587 & 1) != 0);
        Class_32876.Method_32984(Class_32876.Field_32910, Class_32876.Field_32887, 12257 & -25107, Class_12440.Field_12683.Method_164().Field_19144, 10805 & 17416);
        GL11.glViewport((int)(6516 & -23552), (int)(1024 & 6160), (int)Class_12440.Field_12683.Field_80, (int)Class_12440.Field_12683.Field_44);
        if (Class_22849.Field_22873) {
            int n = Class_22849.Field_22890 != 0 ? 573 & -12095 : 140 & -3520;
            Class_16867.Method_16923(n != 0, (n == 0 ? 1 & 4507 : 1696 & 16394) != 0, (n == 0 ? 8873 & 257 : 8208 & 2689) != 0, (-29803 & 3) != 0);
        }
        Class_16867.Method_16930((385 & -32669) != 0);
        GL11.glClearColor((float)Field_12457, (float)Field_12574, (float)Field_12506, (float)1.0f);
        GL11.glClear((int)(-12032 & 16771));
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        Class_16867.Method_16965();
        Class_16867.Method_16985();
        Class_16867.Method_16952();
        Class_16867.Method_16927();
        Class_16867.Method_16936(27255 & 4751);
        Class_16867.Method_16930((194 & 17) != 0);
        Class_12440.Method_12988("pre-final");
        Class_12440.Method_12981(8861 & 16479);
        Class_12440.Method_12988("final");
        if (Field_12521 != 0) {
            Class_12440.Method_12927();
        }
        Class_12440.Method_12760();
        Class_12440.Method_12988("renderCompositeFinal");
    }

    private static String Method_12889(String string) {
        int n = 22442;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 17);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12890(String string) {
        int n = 7235;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12891(String string) {
        int n = 28108;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 131);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static void Method_12892(int n) {
        Class_16867.Method_16956(n);
        if (Field_12653) {
            Class_12440.Method_12811("fogMode", n);
        }
    }

    public static String Method_12893() {
        return Field_12651 == null ? null : (Field_12651 instanceof Class_24475 ? null : Field_12651.Method_19215());
    }

    private static String Method_12894(String string) {
        int n = 2675;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 72);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static void Method_12895() {
        Field_12444 += 5 & 28761;
        Field_12523 = 5419 & -32555;
        Class_26062.Method_26067("Reset world renderers");
        Class_12440.Field_12683.Field_33.Method_25110();
    }

    private static String Method_12896(String string) {
        int n = 15430;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 10);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static int Method_12897(String string, int n) {
        String string2;
        String string3 = string2 = string != null ? "screen." + string : "screen";
        if (Field_12445 == null) {
            return n;
        }
        Class_26599 class_26599 = (Class_26599)Field_12445.get(string2);
        return class_26599 == null ? n : class_26599.Method_26605();
    }

    public static boolean Method_12898() {
        return (!Field_12622.Method_11100() ? Field_12622.Method_11103() : (int)((!Field_12684.Method_11100() ? Field_12684.Method_11103() : 16403 & 197) ? 1 : 0)) != 0;
    }

    public static void Method_12899() {
        Class_12440.Method_12981(-23038 & 16519);
    }

    private static void Method_12900() {
        if (Field_12680 != 0) {
            int n;
            int n2;
            if (Field_12470 != 0) {
                EXTFramebufferObject.glDeleteFramebuffersEXT((int)Field_12470);
                Class_16867.Method_16968(Field_12579);
                Class_16867.Method_16968(Field_12532);
            }
            Field_12470 = EXTFramebufferObject.glGenFramebuffersEXT();
            EXTFramebufferObject.glBindFramebufferEXT((int)(621849938 & 134323520), (int)Field_12470);
            GL11.glDrawBuffer((int)(10338 & 257));
            GL11.glReadBuffer((int)(8337 & 256));
            GL11.glGenTextures((IntBuffer)((IntBuffer)Field_12579.clear().limit(Field_12680)));
            GL11.glGenTextures((IntBuffer)((IntBuffer)Field_12532.clear().limit(Field_12542)));
            Field_12579.position(-28158 & 8661);
            Field_12532.position(10254 & -32447);
            for (n2 = 12288 & -16318; n2 < Field_12680; ++n2) {
                Class_16867.Method_16963(Field_12579.get(n2));
                GL11.glTexParameterf((int)(-4637 & 7649), (int)(10530 & 14466), (float)(10697.846f * 0.9811321f));
                GL11.glTexParameterf((int)(-20507 & 19953), (int)(30771 & -21045), (float)(3.0f * 3498.6667f));
                n = Field_12656[n2] ? 16018 & -6656 : -22901 & 15873;
                GL11.glTexParameteri((int)(15859 & -12823), (int)(14533 & 10249), (int)n);
                GL11.glTexParameteri((int)(3561 & 3557), (int)(-21498 & 14921), (int)n);
                if (Field_12566[n2]) {
                    GL11.glTexParameteri((int)(4065 & 11745), (int)(952396 & -301946516), (int)(1076201582 & 961079390));
                }
                GL11.glTexImage2D((int)(15841 & 19937), (int)(12421 & 18538), (int)(14594 & -26285), (int)Field_12450, (int)Field_12568, (int)(-27628 & 18688), (int)(14722 & 6426), (int)(5254 & 24406), (FloatBuffer)null);
            }
            EXTFramebufferObject.glFramebufferTexture2DEXT((int)(1478082 & 822136640), (int)(287362336 & -2147046015), (int)(3569 & 3553), (int)Field_12579.get(-14196 & 8194), (int)(12440 & -28857));
            Class_12440.Method_12988("FT sd");
            for (n2 = 5 & 13888; n2 < Field_12542; ++n2) {
                Class_16867.Method_16963(Field_12532.get(n2));
                GL11.glTexParameterf((int)(12265 & 3559), (int)(-17910 & 10307), (float)(0.03846154f * 272896.0f));
                GL11.glTexParameterf((int)(-8735 & 4067), (int)(10627 & 10275), (float)(0.3488372f * 30088.535f));
                n = Field_12511[n2] ? 26258 & 9801 : 9869 & -18847;
                GL11.glTexParameteri((int)(4065 & 3581), (int)(26713 & 15365), (int)n);
                GL11.glTexParameteri((int)(3567 & -29215), (int)(10408 & 31042), (int)n);
                GL11.glTexImage2D((int)(8161 & 11753), (int)(-24448 & 1088), (int)(6536 & 6490), (int)Field_12450, (int)Field_12568, (int)(-30676 & 14208), (int)(137530597 & 1095549929), (int)(-1878424713 & 797098863), (ByteBuffer)null);
                EXTFramebufferObject.glFramebufferTexture2DEXT((int)(100707649 & 292736962), (int)((318696 & 941723366) + n2), (int)(-21023 & 7673), (int)Field_12532.get(n2), (int)(356 & -22520));
                Class_12440.Method_12988("FT sc");
            }
            Class_16867.Method_16963(7079 & 64);
            if (Field_12542 > 0) {
                GL20.glDrawBuffers((IntBuffer)Field_12577);
            }
            if ((n2 = EXTFramebufferObject.glCheckFramebufferStatusEXT((int)(9555264 & -397894204))) != (340499925 & -2113892617)) {
                Class_12440.Method_12807("[Shaders] Error: Failed creating shadow framebuffer! (Status " + n2 + ")");
            } else {
                Class_26062.Method_26067("Shadow framebuffer created.");
            }
        }
    }

    private static String Method_12901(String string) {
        int n = 7448;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 108);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static int Method_12902(String string) {
        int n = ARBShaderObjects.glCreateShaderObjectARB((int)(46174002 & 70318968));
        if (n == 0) {
            return 8193 & 4632;
        }
        StringBuilder stringBuilder = new StringBuilder(1075774521 & 604138308);
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(Class_12440.Method_12802(string));
        }
        catch (Exception exception) {
            ARBShaderObjects.glDeleteObjectARB((int)n);
            return -29656 & 1;
        }
        Class_18480[] arrclass_18480 = Class_12440.Method_12795(Field_12671);
        ArrayList arrayList = new ArrayList();
        if (bufferedReader != null) {
            try {
                bufferedReader = Class_19719.Method_19725(bufferedReader, string, Field_12651, 14848 & 16517, arrayList, 776 & 3175);
                do {
                    String string2;
                    String string3;
                    int n2;
                    if ((string2 = bufferedReader.readLine()) == null) {
                        bufferedReader.close();
                        break;
                    }
                    string2 = Class_12440.Method_12995(string2, arrclass_18480);
                    stringBuilder.append(string2).append((char)(3083 & -16006));
                    Class_20029 class_20029 = Class_7255.Method_7269(string2);
                    if (class_20029 == null) continue;
                    if (class_20029.Method_20042()) {
                        string3 = class_20029.Method_20049();
                        n2 = Class_7255.Method_7285(string3);
                        if (n2 >= 0) {
                            Field_12680 = Math.max(Field_12680, n2 + (-18799 & 35));
                            continue;
                        }
                        n2 = Class_7255.Method_7267(string3);
                        if (n2 >= 0) {
                            Field_12542 = Math.max(Field_12542, n2 + (8705 & -14335));
                            continue;
                        }
                        n2 = Class_7255.Method_7272(string3);
                        if (n2 >= 0) {
                            Field_12512 = Math.max(Field_12512, n2 + (3 & 17293));
                            continue;
                        }
                        if (string3.equals("gdepth") && Field_12660[4101 & 17673] == (-17592 & 23821)) {
                            Class_12440.Field_12660[8897 & 17] = 4315668 & 4098422;
                            continue;
                        }
                        n2 = Class_7255.Method_7284(string3);
                        if (n2 >= 0) {
                            Field_12508 = Math.max(Field_12508, n2 + (20555 & 145));
                            continue;
                        }
                        if (!string3.equals("centerDepthSmooth")) continue;
                    }
                    if (!class_20029.Method_20041("shadowMapResolution") && !class_20029.Method_20053("SHADOWRES")) {
                        if (!class_20029.Method_20056("shadowMapFov") && !class_20029.Method_20053("SHADOWFOV")) {
                            if (!class_20029.Method_20056("shadowDistance") && !class_20029.Method_20053("SHADOWHPL")) {
                                if (class_20029.Method_20056("shadowDistanceRenderMul")) {
                                    Field_12618 = class_20029.Method_20055();
                                    Class_26062.Method_26067("Shadow distance render mul: " + Field_12618);
                                    continue;
                                }
                                if (class_20029.Method_20056("shadowIntervalSize")) {
                                    Field_12594 = class_20029.Method_20055();
                                    Class_26062.Method_26067("Shadow map interval size: " + Field_12594);
                                    continue;
                                }
                                if (class_20029.Method_20039("generateShadowMipmap", (-3069 & 2625) != 0)) {
                                    Arrays.fill(Field_12707, (9281 & 141) != 0);
                                    Class_26062.Method_26067("Generate shadow mipmap");
                                    continue;
                                }
                                if (class_20029.Method_20039("generateShadowColorMipmap", (25029 & 2577) != 0)) {
                                    Arrays.fill(Field_12525, (-13275 & 4185) != 0);
                                    Class_26062.Method_26067("Generate shadow color mipmap");
                                    continue;
                                }
                                if (class_20029.Method_20039("shadowHardwareFiltering", (-7673 & 5201) != 0)) {
                                    Arrays.fill(Field_12566, (17553 & 265) != 0);
                                    Class_26062.Method_26067("Hardware shadow filtering enabled.");
                                    continue;
                                }
                                if (class_20029.Method_20039("shadowHardwareFiltering0", (4097 & -32077) != 0)) {
                                    Class_12440.Field_12566[-32749 & 12320] = -27583 & 16537;
                                    Class_26062.Method_26067("shadowHardwareFiltering0");
                                    continue;
                                }
                                if (class_20029.Method_20039("shadowHardwareFiltering1", (16421 & 131) != 0)) {
                                    Class_12440.Field_12566[31 & 16481] = 24743 & 5145;
                                    Class_26062.Method_26067("shadowHardwareFiltering1");
                                    continue;
                                }
                                if (class_20029.Method_20052("shadowtex0Mipmap", "shadowtexMipmap", (103 & 10265) != 0)) {
                                    Class_12440.Field_12707[-21843 & 16] = 9233 & -32441;
                                    Class_26062.Method_26067("shadowtex0Mipmap");
                                    continue;
                                }
                                if (class_20029.Method_20039("shadowtex1Mipmap", (4353 & 145) != 0)) {
                                    Class_12440.Field_12707[265 & 193] = 26625 & 4867;
                                    Class_26062.Method_26067("shadowtex1Mipmap");
                                    continue;
                                }
                                if (class_20029.Method_20052("shadowcolor0Mipmap", "shadowColor0Mipmap", (4097 & 2377) != 0)) {
                                    Class_12440.Field_12525[2053 & 21272] = 1033 & -22393;
                                    Class_26062.Method_26067("shadowcolor0Mipmap");
                                    continue;
                                }
                                if (class_20029.Method_20052("shadowcolor1Mipmap", "shadowColor1Mipmap", (-30061 & 5417) != 0)) {
                                    Class_12440.Field_12525[23589 & 201] = -7925 & 17;
                                    Class_26062.Method_26067("shadowcolor1Mipmap");
                                    continue;
                                }
                                if (class_20029.Method_20038("shadowtex0Nearest", "shadowtexNearest", "shadow0MinMagNearest", (19209 & -32767) != 0)) {
                                    Class_12440.Field_12656[-28599 & 8224] = 18465 & 12295;
                                    Class_26062.Method_26067("shadowtex0Nearest");
                                    continue;
                                }
                                if (class_20029.Method_20052("shadowtex1Nearest", "shadow1MinMagNearest", (-26621 & 21) != 0)) {
                                    Class_12440.Field_12656[41 & 1] = 101 & 24579;
                                    Class_26062.Method_26067("shadowtex1Nearest");
                                    continue;
                                }
                                if (class_20029.Method_20038("shadowcolor0Nearest", "shadowColor0Nearest", "shadowColor0MinMagNearest", (1075 & 641) != 0)) {
                                    Class_12440.Field_12511[18843 & -23548] = 605 & 6145;
                                    Class_26062.Method_26067("shadowcolor0Nearest");
                                    continue;
                                }
                                if (class_20029.Method_20038("shadowcolor1Nearest", "shadowColor1Nearest", "shadowColor1MinMagNearest", (69 & 2459) != 0)) {
                                    Class_12440.Field_12511[-32255 & 14341] = 12425 & 2065;
                                    Class_26062.Method_26067("shadowcolor1Nearest");
                                    continue;
                                }
                                if (!class_20029.Method_20056("wetnessHalflife") && !class_20029.Method_20053("WETNESSHL")) {
                                    if (!class_20029.Method_20056("drynessHalflife") && !class_20029.Method_20053("DRYNESSHL")) {
                                        if (class_20029.Method_20056("eyeBrightnessHalflife")) {
                                            Field_12478 = class_20029.Method_20055();
                                            Class_26062.Method_26067("Eye brightness halflife: " + Field_12478);
                                            continue;
                                        }
                                        if (class_20029.Method_20056("centerDepthHalflife")) {
                                            Field_12556 = class_20029.Method_20055();
                                            Class_26062.Method_26067("Center depth halflife: " + Field_12556);
                                            continue;
                                        }
                                        if (class_20029.Method_20056("sunPathRotation")) {
                                            Field_12487 = class_20029.Method_20055();
                                            Class_26062.Method_26067("Sun path rotation: " + Field_12487);
                                            continue;
                                        }
                                        if (class_20029.Method_20056("ambientOcclusionLevel")) {
                                            Field_12654 = Class_19426.Method_19565(class_20029.Method_20055(), 0.0f, 1.0f);
                                            Class_26062.Method_26067("AO Level: " + Field_12654);
                                            continue;
                                        }
                                        if (class_20029.Method_20041("superSamplingLevel")) {
                                            int n3 = class_20029.Method_20054();
                                            if (n3 > (161 & -32491)) {
                                                Class_26062.Method_26067("Super sampling level: " + n3 + "x");
                                                Field_12636 = n3;
                                                continue;
                                            }
                                            Field_12636 = 12825 & -13951;
                                            continue;
                                        }
                                        if (class_20029.Method_20041("noiseTextureResolution")) {
                                            Field_12649 = class_20029.Method_20054();
                                            Field_12587 = 6657 & 16861;
                                            Class_26062.Method_26067("Noise texture enabled");
                                            Class_26062.Method_26067("Noise texture resolution: " + Field_12649);
                                            continue;
                                        }
                                        if (class_20029.Method_20044("Format")) {
                                            string3 = Class_35556.Method_35565(class_20029.Method_20049(), "Format");
                                            String string4 = class_20029.Method_20037();
                                            int n4 = Class_12440.Method_12967(string3);
                                            int n5 = Class_12440.Method_12963(string4);
                                            if (n4 < 0 || n5 == 0) continue;
                                            Class_12440.Field_12660[n4] = n5;
                                            Object[] arrobject = new Object[-20470 & 16690];
                                            arrobject[-32701 & 18560] = string3;
                                            arrobject[9241 & 6211] = string4;
                                            Class_26062.Method_26065("%s format: %s", arrobject);
                                            continue;
                                        }
                                        if (class_20029.Method_20046("Clear", (-6135 & 4388) != 0)) {
                                            if (!Class_7255.Method_7279(string) && !Class_7255.Method_7266(string) || (n2 = Class_12440.Method_12967(string3 = Class_35556.Method_35565(class_20029.Method_20049(), "Clear"))) < 0) continue;
                                            Class_12440.Field_12572[n2] = 17187 & 10432;
                                            Object[] arrobject = new Object[-16223 & 779];
                                            arrobject[2560 & 8584] = string3;
                                            Class_26062.Method_26065("%s clear disabled", arrobject);
                                            continue;
                                        }
                                        if (class_20029.Method_20047("GAUX4FORMAT", "RGBA32F")) {
                                            Class_12440.Field_12660[2071 & 17167] = 353405012 & -2111770828;
                                            Class_26062.Method_26067("gaux4 format : RGB32AF");
                                            continue;
                                        }
                                        if (class_20029.Method_20047("GAUX4FORMAT", "RGB32F")) {
                                            Class_12440.Field_12660[9303 & 18599] = -1606312907 & 19704405;
                                            Class_26062.Method_26067("gaux4 format : RGB32F");
                                            continue;
                                        }
                                        if (class_20029.Method_20047("GAUX4FORMAT", "RGB16")) {
                                            Class_12440.Field_12660[-28633 & 2455] = 184599028 & 1075874900;
                                            Class_26062.Method_26067("gaux4 format : RGB16");
                                            continue;
                                        }
                                        if (class_20029.Method_20046("MipmapEnabled", (133 & 20481) != 0)) {
                                            if (!Class_7255.Method_7279(string) && !Class_7255.Method_7266(string) && !Class_7255.Method_7270(string) || (n2 = Class_12440.Method_12967(string3 = Class_35556.Method_35565(class_20029.Method_20049(), "MipmapEnabled"))) < 0) continue;
                                            Field_12593 |= (2081 & -15483) << n2;
                                            Object[] arrobject = new Object[-32703 & 391];
                                            arrobject[-32728 & 12801] = string3;
                                            Class_26062.Method_26065("%s mipmap enabled", arrobject);
                                            continue;
                                        }
                                        if (!class_20029.Method_20053("DRAWBUFFERS")) continue;
                                        string3 = class_20029.Method_20037();
                                        if (Class_7255.Method_7280(string3)) {
                                            Field_12471 = string3;
                                            continue;
                                        }
                                        Class_26062.Method_26066("Invalid draw buffers: " + string3);
                                        continue;
                                    }
                                    Field_12540 = class_20029.Method_20055();
                                    Class_26062.Method_26067("Dryness halflife: " + Field_12540);
                                    continue;
                                }
                                Field_12513 = class_20029.Method_20055();
                                Class_26062.Method_26067("Wetness halflife: " + Field_12513);
                                continue;
                            }
                            Field_12539 = class_20029.Method_20055();
                            Field_12658 = 29189 & 1115;
                            Class_26062.Method_26067("Shadow map distance: " + Field_12539);
                            continue;
                        }
                        Field_12688 = class_20029.Method_20055();
                        Field_12658 = 2088 & 13328;
                        Class_26062.Method_26067("Shadow map field of view: " + Field_12688);
                        continue;
                    }
                    Field_12485 = Field_12510 = class_20029.Method_20054();
                    Field_12450 = Field_12568 = Math.round((float)Field_12485 * Field_12449);
                    Class_26062.Method_26067("Shadow map resolution: " + Field_12485);
                } while (true);
            }
            catch (Exception exception) {
                Class_26062.Method_26069("Couldn't read " + string + "!");
                exception.printStackTrace();
                ARBShaderObjects.glDeleteObjectARB((int)n);
                return 2322 & 25792;
            }
        }
        if (Field_12549) {
            Class_12440.Method_12883(string, stringBuilder.toString());
        }
        ARBShaderObjects.glShaderSourceARB((int)n, (CharSequence)stringBuilder);
        ARBShaderObjects.glCompileShaderARB((int)n);
        if (GL20.glGetShaderi((int)n, (int)(43158405 & 43907)) != (-16375 & 2085)) {
            Class_26062.Method_26069("Error compiling fragment shader: " + string);
        }
        Class_12440.Method_12816(n, string, arrayList);
        return n;
    }

    public static void Method_12903() {
        Class_22385 class_22385 = Class_7644.Method_7649().Method_7648();
        float f = Class_12440.Field_12683.Field_84.Field_39801 * (1208 & 26645);
        double d = (double)f * (0.047619047619047616 * 19.3998);
        double d2 = (double)f * (1.0405405405405406 * 0.36769350649350646);
        double d3 = -d2;
        double d4 = -d;
        double d5 = 0.6555555555555556 * 24.406779661016948;
        double d6 = -Field_12615;
        class_22385.Method_22417(135 & 327, Class_29585.Field_29602);
        class_22385.Method_22443(d3, d6, d4).Method_22451();
        class_22385.Method_22443(d3, d5, d4).Method_22451();
        class_22385.Method_22443(d4, d5, d3).Method_22451();
        class_22385.Method_22443(d4, d6, d3).Method_22451();
        class_22385.Method_22443(d4, d6, d3).Method_22451();
        class_22385.Method_22443(d4, d5, d3).Method_22451();
        class_22385.Method_22443(d4, d5, d2).Method_22451();
        class_22385.Method_22443(d4, d6, d2).Method_22451();
        class_22385.Method_22443(d4, d6, d2).Method_22451();
        class_22385.Method_22443(d4, d5, d2).Method_22451();
        class_22385.Method_22443(d3, d5, d2).Method_22451();
        class_22385.Method_22443(d3, d6, d2).Method_22451();
        class_22385.Method_22443(d3, d6, d2).Method_22451();
        class_22385.Method_22443(d3, d5, d2).Method_22451();
        class_22385.Method_22443(d2, d5, d).Method_22451();
        class_22385.Method_22443(d2, d6, d).Method_22451();
        class_22385.Method_22443(d2, d6, d).Method_22451();
        class_22385.Method_22443(d2, d5, d).Method_22451();
        class_22385.Method_22443(d, d5, d2).Method_22451();
        class_22385.Method_22443(d, d6, d2).Method_22451();
        class_22385.Method_22443(d, d6, d2).Method_22451();
        class_22385.Method_22443(d, d5, d2).Method_22451();
        class_22385.Method_22443(d, d5, d3).Method_22451();
        class_22385.Method_22443(d, d6, d3).Method_22451();
        class_22385.Method_22443(d, d6, d3).Method_22451();
        class_22385.Method_22443(d, d5, d3).Method_22451();
        class_22385.Method_22443(d2, d5, d4).Method_22451();
        class_22385.Method_22443(d2, d6, d4).Method_22451();
        class_22385.Method_22443(d2, d6, d4).Method_22451();
        class_22385.Method_22443(d2, d5, d4).Method_22451();
        class_22385.Method_22443(d3, d5, d4).Method_22451();
        class_22385.Method_22443(d3, d6, d4).Method_22451();
        Class_7644.Method_7649().Method_7647();
    }

    private static String Method_12904(String string) {
        int n = 2343;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 107);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static void Method_12905() {
        FloatBuffer floatBuffer = Field_12573;
        floatBuffer.clear();
        GL11.glGetFloat((int)(4006 & -1090), (FloatBuffer)floatBuffer);
        floatBuffer.get(Field_12578, -8704 & 8653, 32400 & 344);
        Class_21899.Method_21903(Field_12616, Field_12578, Field_12460);
        Class_12440.Method_12777("upPosition", Field_12616[10240 & -26987], Field_12616[-7627 & 3083], Field_12616[-30206 & 28722]);
    }

    private static String Method_12906(String string) {
        int n = 16084;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 85);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12907(String string) {
        int n = 5582;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 91);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static void Method_12908() {
        if (Field_12635) {
            Class_12440.Method_12988("pre-render Deferred");
            Class_12440.Method_12976(-32205 & 9633, 4104 & 456, (648 & 18768) != 0);
            Field_12683.Method_253().Method_34707(Class_24069.Field_24084);
        }
    }

    private static String Method_12909(String string) {
        int n = 1957;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 96);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static void Method_12910(Class_33781 class_33781) {
        if (class_33781 != null) {
            for (Object e : class_33781.Field_33788) {
                if (!(e instanceof Class_31961)) continue;
                Class_12440.Method_12862((Class_31961)e);
            }
        }
    }

    private static IntBuffer[] Method_12911(int n, int n2) {
        IntBuffer[] arrintBuffer = new IntBuffer[n];
        for (int i = 8304 & -30712; i < n; ++i) {
            arrintBuffer[i] = Class_12440.Method_12880(n2);
        }
        return arrintBuffer;
    }

    private static String Method_12912(String string) {
        int n = 17359;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 22);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12913(String string) {
        int n = 14204;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 103);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static void Method_12914() {
        Field_12697 = 9 & -31339;
        if (Field_12498 == (18182 & 6250)) {
            Class_12440.Method_12981(-8057 & 4211);
        }
    }

    private static String Method_12915(String string) {
        int n = 348;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 9);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12916(String string) {
        int n = 20752;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 97);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12917(String string) {
        int n = 18134;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 69);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static void Method_12918(Class_19214 class_19214, Properties properties) {
        String string = Field_12442 + "/" + class_19214.Method_19215() + ".txt";
        File file = new File(Class_18.Field_89.Field_68, string);
        if (properties.isEmpty()) {
            file.delete();
        } else {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            properties.store(fileOutputStream, (String)null);
            fileOutputStream.flush();
            fileOutputStream.close();
        }
    }

    private static String Method_12919(String string) {
        int n = 31444;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 31);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12920(String string) {
        int n = 14299;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 47);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static boolean Method_12921() {
        return (!Field_12544.Method_11097() ? 287 & 9921 : 9 & -27904) != 0;
    }

    private static String Method_12922(String string) {
        int n = 29297;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 112);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static int Method_12923(String string) {
        int n = EXTFramebufferObject.glCheckFramebufferStatusEXT((int)(-1936339647 & 1073790950));
        if (n != (-2084463147 & 536923351)) {
            Object[] arrobject = new Object[-30430 & 642];
            arrobject[20756 & 1568] = n;
            arrobject[257 & -10595] = string;
            System.err.format("FramebufferStatus 0x%04X at %s\n", arrobject);
        }
        return n;
    }

    private static int Method_12924(String string) {
        int n = ARBShaderObjects.glCreateShaderObjectARB((int)(50387769 & -1408726095));
        if (n == 0) {
            return 10248 & -11726;
        }
        StringBuilder stringBuilder = new StringBuilder(270745768 & 1197343749);
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(Class_12440.Method_12802(string));
        }
        catch (Exception exception) {
            ARBShaderObjects.glDeleteObjectARB((int)n);
            return 26644 & 0;
        }
        Class_18480[] arrclass_18480 = Class_12440.Method_12795(Field_12671);
        ArrayList arrayList = new ArrayList();
        if (bufferedReader != null) {
            try {
                bufferedReader = Class_19719.Method_19725(bufferedReader, string, Field_12651, 17 & -30624, arrayList, 3076 & 8665);
                do {
                    String string2;
                    if ((string2 = bufferedReader.readLine()) == null) {
                        bufferedReader.close();
                        break;
                    }
                    string2 = Class_12440.Method_12995(string2, arrclass_18480);
                    stringBuilder.append(string2).append((char)(-11125 & 2074));
                    Class_20029 class_20029 = Class_7255.Method_7269(string2);
                    if (class_20029 == null) continue;
                    if (class_20029.Method_20040("mc_Entity")) {
                        Field_12692 = 161 & 11525;
                        Field_12589 = 16421 & 2451;
                        continue;
                    }
                    if (class_20029.Method_20040("mc_midTexCoord")) {
                        Field_12695 = 29121 & -32743;
                        Field_12555 = 10317 & 1;
                        continue;
                    }
                    if (string2.contains("gl_MultiTexCoord3")) {
                        Field_12665 = 28683 & 2321;
                        continue;
                    }
                    if (!class_20029.Method_20040("at_tangent")) continue;
                    Field_12668 = 22661 & -32685;
                    Field_12596 = 5121 & 8705;
                } while (true);
            }
            catch (Exception exception) {
                Class_26062.Method_26069("Couldn't read " + string + "!");
                exception.printStackTrace();
                ARBShaderObjects.glDeleteObjectARB((int)n);
                return 28684 & -31854;
            }
        }
        if (Field_12549) {
            Class_12440.Method_12883(string, stringBuilder.toString());
        }
        ARBShaderObjects.glShaderSourceARB((int)n, (CharSequence)stringBuilder);
        ARBShaderObjects.glCompileShaderARB((int)n);
        if (GL20.glGetShaderi((int)n, (int)(1347013507 & 10521569)) != (1025 & 20915)) {
            Class_26062.Method_26069("Error compiling vertex shader: " + string);
        }
        Class_12440.Method_12816(n, string, arrayList);
        return n;
    }

    private static void Method_12925(Class_37465[] arrclass_37465) {
        if (arrclass_37465 != null) {
            for (int i = 36 & -18432; i < arrclass_37465.length; ++i) {
                Class_37465 class_37465 = arrclass_37465[i];
                Class_16867.Method_16960((1681966272 & 168920300) + class_37465.Method_37474());
                Class_2062 class_2062 = class_37465.Method_37471();
                Class_16867.Method_16963(class_2062.Method_2063());
            }
        }
    }

    public static void Method_12926() {
        Class_16867.Method_16952();
        Class_12440.Method_12981(-21337 & 20819);
    }

    public static void Method_12927() {
        if (Field_12606) {
            for (int i = 16 & 17444; i < Field_12508; ++i) {
                if ((Field_12521 & (5913 & 16417) << i) == 0) continue;
                Class_16867.Method_16960((1082842560 & 119907529) + Field_12611[i]);
                GL11.glTexParameteri((int)(19945 & -21005), (int)(10305 & 27169), (int)(26499 & 14183));
                GL30.glGenerateMipmap((int)(3555 & 4069));
            }
            Class_16867.Method_16960(1322425557 & -2147441472);
        }
    }

    public static boolean Method_12928() {
        return (!Field_12527.Method_11100() ? Field_12527.Method_11103() : (int)((!Field_12537.Method_11100() ? Field_12537.Method_11103() : 1025 & 30725) ? 1 : 0)) != 0;
    }

    private static String Method_12929(String string) {
        int n = 24229;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 42);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12930(String string) {
        int n = 24027;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 82);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12931(String string) {
        int n = 11458;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 61);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12932(String string) {
        int n = 2873;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 58);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12933(String string) {
        int n = 10167;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 80);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12934(String string) {
        int n = 4691;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 125);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static Class_4751 Method_12935() {
        return new Class_4751(Field_12619, Field_12615, Field_12620);
    }

    public static String Method_12936(Class_11452 class_11452) {
        switch (Class_8100.Field_8102[class_11452.ordinal()]) {
            case 1: {
                return Integer.toString(Field_12617);
            }
            case 2: {
                return Boolean.toString(Field_12461);
            }
            case 3: {
                return Boolean.toString(Field_12493);
            }
            case 4: {
                return Float.toString(Field_12554);
            }
            case 5: {
                return Float.toString(Field_12449);
            }
            case 6: {
                return Float.toString(Field_12454);
            }
            case 7: {
                return Boolean.toString(Field_12501);
            }
            case 8: {
                return Field_12622.\u0000, `();
            }
            case 9: {
                return Field_12527.\u0000, `();
            }
            case 10: {
                return Field_12519;
            }
            case 11: {
                return Boolean.toString(Field_12621);
            }
            case 12: {
                return Boolean.toString(Field_12638);
            }
            case 13: {
                return Integer.toString(Field_12486);
            }
            case 14: {
                return Integer.toString(Field_12446);
            }
            case 15: {
                return Integer.toString(Field_12678);
            }
            case 16: {
                return Integer.toString(Field_12462);
            }
            case 17: {
                return Integer.toString(Field_12462);
            }
            case 18: {
                return Integer.toString(Field_12462);
            }
        }
        throw new IllegalArgumentException("Unknown option: " + (Object)((Object)class_11452));
    }

    static {
        Field_12516 = 1672 & -28638;
        Field_12601 = 12576 & -14847;
        Field_12606 = 2115 & 4100;
        Field_12603 = -27584 & 18948;
        Field_12444 = 90 & 1536;
        Field_12523 = 6408 & -24544;
        Field_12499 = 2432 & -3072;
        Field_12700 = 30724 & 513;
        Field_12681 = -19302 & 18436;
        Field_12490 = -16189 & 2568;
        Field_12673 = 4160 & -23793;
        Field_12696 = 28842 & 2129;
        Field_12626 = 18568 & 273;
        Field_12598 = -11520 & 2198;
        Field_12441 = 2080 & 25624;
        Field_12676 = 17043 & 40;
        Field_12694 = 2056 & -12240;
        Field_12480 = new float[24932 & -30716];
        Field_12623 = new float[-32188 & 2342];
        Field_12448 = new float[4117 & 17606];
        Field_12616 = new float[-32700 & 15501];
        Field_12488 = new float[2229 & 24836];
        float[] arrf = new float[2052 & 708];
        arrf[9348 & -32720] = 0.0f;
        arrf[4105 & 24593] = 0.8939394f * 111.86441f;
        arrf[4298 & 1026] = 0.0f;
        arrf[1035 & 12807] = 0.0f;
        Field_12460 = arrf;
        float[] arrf2 = new float[-32715 & 2244];
        arrf2[9 & -6704] = 0.0f;
        arrf2[8465 & -32607] = 2.6f * 38.46154f;
        arrf2[4418 & 16934] = 0.0f;
        arrf2[16563 & 13835] = 0.0f;
        Field_12664 = arrf2;
        float[] arrf3 = new float[-32443 & 30740];
        arrf3[17489 & 9120] = 0.0f;
        arrf3[-24371 & 22787] = -205.26315f * 0.4871795f;
        arrf3[1826 & 4098] = 0.0f;
        arrf3[10755 & 20559] = 0.0f;
        Field_12528 = arrf3;
        Field_12578 = new float[1302 & -16199];
        Field_12666 = 7439074321934323776L & 169345429L;
        Field_12686 = -4586865031710109516L & 4586865031079535104L;
        Field_12468 = 552220521840806484L & 1076117666L;
        Field_12564 = 0.0f;
        Field_12699 = 0.0f;
        Field_12565 = 0.0f;
        Field_12504 = 24672 & -28664;
        Field_12507 = 142618672L & 1111573577L;
        Field_12533 = 269189157L & 6738684906479817936L;
        Field_12657 = 2228394L & 4694347387211183360L;
        Field_12443 = 2048 & 17633;
        Field_12464 = 0.0f;
        Field_12477 = 0.0f;
        Field_12602 = 1025 & -10118;
        Field_12667 = 0.0f;
        Field_12691 = 0.0f;
        Field_12513 = 1087.5f * 0.55172414f;
        Field_12540 = 0.36206895f * 552.381f;
        Field_12478 = 0.8045977f * 12.428572f;
        Field_12465 = 132 & 8512;
        Field_12675 = 2114 & 22052;
        Field_12550 = 18505 & -32240;
        Field_12607 = 0.0f;
        Field_12588 = 0.0f;
        Field_12515 = 0.0f;
        Field_12491 = 0.0f;
        Field_12553 = 0.0f;
        Field_12556 = 1.0f;
        Field_12605 = 8192 & 23898;
        Field_12636 = 3329 & 12297;
        Field_12698 = 0.0f;
        Field_12497 = 0.0f;
        Field_12489 = 24756 & 323;
        Field_12697 = 8194 & 16416;
        Field_12653 = 9241 & -27869;
        Field_12643 = -30134 & 24974;
        Field_12652 = -15845 & 9323;
        Field_12609 = 558 & -32756;
        Field_12692 = 10497 & 4120;
        Field_12695 = 4648 & -32446;
        Field_12665 = 16792 & 545;
        Field_12668 = 4146 & 8269;
        Field_12589 = 89 & -31488;
        Field_12555 = 80 & 384;
        Field_12596 = -11518 & 40;
        Field_12630 = 9746 & 4225;
        Field_12541 = 2241 & 4386;
        Field_12645 = new Class_31219(Class_12440.Method_12940("\u4608\u4601\u4619\u4604\u4619\u4614\u462c\u4600\u4601\u4600\u461d"));
        Field_12580 = new Class_27375(Class_12440.Method_12890("\u0c5f\u0c54\u0c4c\u0c51\u0c4a\u0c47\u0c55\u0c58"));
        Field_12543 = new Class_27375(Class_12440.Method_12951("\u546a\u5464\u5464\u5468\u5466\u5448\u5460\u546a\u5460\u546c\u5462\u5442\u5468"));
        Field_12599 = 257 & 14070;
        Field_12536 = 41 & 256;
        Field_12450 = 17428 & -25534;
        Field_12568 = 17412 & 5896;
        Field_12485 = 1952 & 9232;
        Field_12510 = -31612 & 3619;
        Field_12688 = 1.4509804f * 62.027027f;
        Field_12539 = 1.074074f * 148.96553f;
        Field_12658 = 547 & 25793;
        Field_12618 = 1.0847458f * -0.921875f;
        Field_12455 = -28222 & 25601;
        Field_12530 = 14464 & -16276;
        Field_12473 = 9140 & -16375;
        Field_12508 = 16960 & 5146;
        Field_12512 = 392 & 1138;
        Field_12542 = 1194 & 772;
        Field_12680 = -17660 & 17409;
        Field_12476 = -32734 & 20496;
        Field_12672 = -9972 & 8304;
        Field_12562 = 17553 & 8192;
        Field_12470 = 2576 & 8417;
        Field_12660 = new int[16776 & 552];
        Field_12572 = new boolean[282 & 7788];
        Field_12498 = 17155 & -24572;
        String[] arrstring = new String[-16323 & 16236];
        arrstring[6193 & 16642] = "";
        arrstring[10501 & -32621] = Class_12440.Method_12828("\u6432\u6436\u6422\u6430\u6437\u6435\u6421\u6421\u640a\u643e\u643e\u642d\u6438\u643b");
        arrstring[551 & -24566] = Class_12440.Method_12793("\ub480\ub481\ub490\ub481\ub481\ub480\ub491\ub490\ub498\ub491\ub480\ub499\ub491\ub490\ub491\ub480\ub491");
        arrstring[1219 & -4089] = Class_12440.Method_12952("\u0002\u0006\u0002\u0000\u0007\u0005\u0001\u0001\"\u0000\u0002\u0006\u0005\u0005\u0001\u0007\u0001#\u0003\u0007\u0005");
        arrstring[8325 & 20500] = Class_12440.Method_12875("\u2b04\u2b00\u2b16\u2b06\u2b04\u2b04\u2b12\u2b12\u2b1c\u2b18\u2b0a\u2b1a\u2b08\u2b08\u2b1a\u2b0a\u2b00");
        arrstring[15365 & -32689] = Class_12440.Method_12776("\u4005\u4001\u4005\u4005\u4000\u4000\u4004\u4004\u402d\u4008\u4009\u4008\u4008\u4008\u400c\u4009\u4005\u4001\u4005\u4005");
        arrstring[470 & -29682] = Class_12440.Method_12915("\u0a1f\u0a1b\u0a0f\u0a1d\u0a1e\u0a1c\u0a08\u0a08\u0a27\u0a1a\u0a16\u0a14\u0a0d\u0a1d\u0a09");
        arrstring[55 & 8391] = Class_12440.Method_12896("\u4000\u4000\u4002\u4002\u4004\u4004\u4006\u4006\u4000\u4000\u4002\u4002\u4004\u4004\u4006\u4006");
        arrstring[3085 & 24] = Class_12440.Method_12722("\u1821\u1820\u1833\u1822\u1820\u1821\u1832\u1833\u1819\u1830\u1823\u1832\u1830\u1821\u182b\u182a\u1819\u1831\u182b\u182a\u1829\u1820");
        arrstring[14347 & 297] = Class_12440.Method_12824("\u1010\u1015\u1000\u1011\u1010\u1011\u1004\u1005\u1000\u1001\u1010\u1005\u1004\u1015\u1014\u1011\u1010\u1005\u1010\u1011\u1000\u1011\u1010\u1011\u1000\u1005\u1014");
        arrstring[4363 & 1710] = Class_12440.Method_12876("\uc101\uc101\uc103\uc103\uc100\uc100\uc102\uc102\uc101\uc101\uc103\uc103\uc100\uc100\uc103\uc103\uc111\uc110\uc113\uc113\uc111\uc110\uc112");
        arrstring[2331 & -32181] = Class_12440.Method_12942("\u921e\u921b\u920c\u921f\u921f\u921c\u920b\u920a\u9206\u921d\u9218\u9214\u9218\u921e\u921c\u921d\u920b\u9205\u9206\u920a\u9202");
        arrstring[268 & 20029] = Class_12440.Method_12708("\u2c00\u2c00\u2c00\u2c00\u2c00\u2c00\u2c00\u2c00\u2c28\u2c00\u2c00\u2c00\u2c00\u2c00");
        arrstring[18445 & 9261] = Class_12440.Method_12775("\u024c\u0249\u025c\u024d\u024d\u024c\u0259\u0258\u025c\u0241\u024d\u024c\u0240\u0248");
        arrstring[-19378 & 190] = Class_12440.Method_12889("\u7411\u7410\u7401\u7412\u7410\u7413\u7402\u7403\u7409\u7418\u7419\u7419\u7419\u7419\u741a\u741a\u7413\u7413\u7411");
        arrstring[3375 & 12815] = Class_12440.Method_12868("\u21a5\u21a0\u21a7\u21a6\u21a0\u21a1\u21a6\u21a7\u2185\u21a1\u21a6\u21a7\u21a1");
        arrstring[1050 & 4304] = Class_12440.Method_12772("\u208c\u2089\u208c\u208d\u2089\u2088\u208d\u208c\u208c\u2084\u208d\u2085\u208c\u2081\u208c\u2080\u2088");
        arrstring[17945 & 6481] = Class_12440.Method_12962("\u4041\u4040\u4041\u4040\u4040\u4041\u4040\u4041\u4041\u4041\u4040\u4041\u4041\u4040\u4041\u4041\u4040\u4041\u4040\u4040");
        arrstring[-12141 & 2938] = Class_12440.Method_12741("\u5040\u5041\u5050\u5043\u5044\u5047\u5056\u5057\u5078\u5059\u5058\u5049\u504e\u504f\u505e\u504d\u5042\u5053\u5042");
        arrstring[16439 & -21741] = Class_12440.Method_12912("\ue044\ue041\ue054\ue045\ue040\ue041\ue054\ue055\ue05c\ue049\ue048\ue04d\ue048");
        arrstring[1110 & 8884] = Class_12440.Method_12861("\u521e\u521b\u520e\u521d\u521e\u521d\u5208\u5209\u520e\u5207\u5216\u5213\u5204\u5219\u5216\u5201");
        arrstring[-25827 & 1239] = Class_12440.Method_12712("\u4842\u4842\u4840\u4840\u4842\u4842\u4840\u4840\u4840");
        arrstring[27927 & -32618] = Class_12440.Method_12840("\u1631\u1630\u1633\u1623\u1635\u1624\u1637\u1627\u1639\u1628");
        arrstring[151 & 8759] = Class_12440.Method_12711("\u56d5\u56d1\u56d3\u56c6\u56d1\u56c5\u56d7\u56c2\u56d9\u568c");
        arrstring[-32744 & 10904] = Class_12440.Method_12732("\u8244\u8249\u8248\u8244\u8248\u8245\u824c\u8240\u824a\u820d");
        arrstring[281 & 2591] = Class_12440.Method_12770("\u2028\u2024\u2026\u203a\u2024\u2038\u2022\u203e\u2026\u2076");
        arrstring[2106 & 218] = Class_12440.Method_12769("\u4588\u4581\u4582\u458b\u4580\u4589\u4582\u458b\u4588\u4589");
        arrstring[8795 & 1307] = Class_12440.Method_12953("\u1c00\u1c05\u1c06\u1c02\u1c04\u1c01\u1c02\u1c06\u1c0c\u1c0c");
        arrstring[2333 & -32610] = Class_12440.Method_12919("\u8490\u8499\u8498\u8481\u8498\u8481\u8498\u8481\u8490\u8481");
        arrstring[17439 & 861] = Class_12440.Method_12879("\u4f01\u4f01\u4f03\u4f03\u4f05");
        arrstring[2654 & -31457] = Class_12440.Method_12808("\u0000\b\u0000\u0000\b\u0000");
        arrstring[2367 & 1567] = Class_12440.Method_12825("\uac08\uac03\uac08\uac09\uac04\uac0d\uac06\uac0f\uac00\uac03\uac00\uac09");
        arrstring[6707 & -24416] = Class_12440.Method_12782("\u1092\u1081\u1082\u1087\u1082\u1092\u10b0\u1084\u109c\u109d\u108c\u109e\u1099");
        arrstring[231 & 9529] = Class_12440.Method_12886("\u2069\u2068\u2069\u2068\u207d\u207d\u2068\u2069");
        arrstring[1698 & 18742] = Class_12440.Method_12994("\u18a2\u18a3\u18a2\u18a1\u18b4\u18b5\u18a0\u18a1\u18fe");
        arrstring[-31681 & 4643] = Class_12440.Method_12771("\u2008\u2008\u200a\u200a\u2008\u2008\u200e\u200e\u200c");
        arrstring[2412 & 21046] = Class_12440.Method_12975("\u2011\u2011\u2013\u2011\u2003\u2002\u2014\u2014\u200e");
        arrstring[565 & 11495] = Class_12440.Method_12884("\u8010\u8011\u8010\u8011\u8004\u8005\u8014\u8015\u8008");
        arrstring[-31434 & 2094] = Class_12440.Method_12796("\u1a00\u1a01\u1a00\u1a03\u1a06\u1a07\u1a02\u1a03\u1a08");
        arrstring[8495 & 4663] = Class_12440.Method_12929("\ua1d0\ua1d1\ua1d2\ua1d1\ua1c2\ua1c3\ua1d0\ua1d1\ua182");
        arrstring[297 & 3182] = Class_12440.Method_12788("\u5424\u5424\u5424\u5424\u5420\u5421\u5425\u5425\u5425");
        arrstring[2111 & -11415] = Class_12440.Method_12724("\u0c50\u0c50\u0c40\u0c52\u0c50\u0c52\u0c42\u0c42\u0c68\u0c5a\u0c58\u0c5a\u0c5a\u0c68\u0c4a\u0c58\u0c42\u0c52\u0c42");
        arrstring[1578 & -14038] = Class_12440.Method_12857("\ua642\ua642\ua640\ua642\ua644\ua644\ua646\ua646\ua668\ua64a\ua642\ua640\ua646");
        arrstring[1067 & 43] = Class_12440.Method_12968("\u0c2a\u0c23\u0c22\u0c2b\u0c22\u0c2b\u0c22\u0c2b\u0c28\u0c03\u0c22\u0c2b\u0c2a\u0c29");
        Field_12614 = arrstring;
        int[] arrn = new int[16940 & 2413];
        arrn[17826 & 12824] = 24962 & -27632;
        arrn[37 & 16641] = 384 & 2618;
        arrn[18690 & 1094] = -25545 & 16385;
        arrn[691 & 24647] = 18506 & 4098;
        arrn[16532 & -32468] = 513 & 35;
        arrn[-10163 & 9525] = 12866 & 18442;
        arrn[20934 & 2566] = 17666 & 12810;
        arrn[271 & 1047] = 311 & 10371;
        arrn[-14913 & 2632] = 9479 & -9505;
        arrn[-32567 & 2335] = 9991 & -16297;
        arrn[-24262 & 17550] = 3079 & 24895;
        arrn[23563 & 8719] = 655 & -28617;
        arrn[12316 & -32756] = -31961 & 4175;
        arrn[525 & -8115] = 783 & 9239;
        arrn[-16354 & 11022] = 162 & -27886;
        arrn[4239 & -29153] = 17491 & 8455;
        arrn[307 & -31600] = -30693 & 643;
        arrn[16405 & 275] = 34 & -29418;
        arrn[2066 & 4119] = -32614 & 27651;
        arrn[19 & 851] = 18819 & -31701;
        arrn[1044 & 20500] = 20627 & 3683;
        arrn[10325 & 5269] = 17441 & 13066;
        arrn[30 & 1079] = 708 & 4153;
        arrn[-18401 & 17495] = 12408 & 258;
        arrn[19224 & -28646] = 2080 & 652;
        arrn[281 & -23399] = 167 & -18168;
        arrn[3611 & 4186] = -31070 & 1;
        arrn[1563 & 159] = 18560 & -32256;
        arrn[9276 & -30689] = 16512 & -31648;
        arrn[541 & -32643] = 4192 & 2320;
        arrn[4639 & 24734] = 16386 & 256;
        arrn[-8161 & 2591] = 25694 & -25826;
        arrn[2088 & -31072] = 27006 & -32225;
        arrn[549 & -32671] = 37 & -9344;
        arrn[-32094 & 2418] = -32248 & 8341;
        arrn[16443 & -32605] = 3273 & -32720;
        arrn[52 & 16676] = -11903 & 9754;
        arrn[1071 & -24283] = 8197 & 17496;
        arrn[-11225 & 446] = 21829 & 2064;
        arrn[2231 & 30567] = 9216 & -32727;
        arrn[-32600 & 11327] = 2195 & 12296;
        arrn[43 & 14521] = 16723 & -31593;
        arrn[106 & -3782] = -30717 & 1280;
        arrn[-32645 & 28843] = 1024 & 20992;
        Field_12559 = arrn;
        Field_12548 = new int[9391 & -11732];
        Field_12674 = new int[4797 & -24532];
        Field_12679 = 16520 & -32735;
        Field_12635 = 2580 & 1451;
        Field_12604 = new String[-31684 & 12844];
        Field_12471 = null;
        Field_12569 = new IntBuffer[25326 & -27347];
        Field_12538 = null;
        Field_12655 = new String[17533 & -20436];
        Field_12459 = null;
        Field_12570 = null;
        Field_12584 = new int[301 & -6546];
        Field_12593 = 2052 & -32568;
        Field_12521 = 324 & 30848;
        Field_12458 = null;
        Field_12662 = null;
        Field_12535 = null;
        Field_12641 = 16432 & -30709;
        Field_12566 = new boolean[-32525 & 8202];
        Field_12707 = new boolean[10370 & 1890];
        Field_12656 = new boolean[18 & 5418];
        Field_12525 = new boolean[1064 & -26279];
        Field_12511 = new boolean[664 & 4108];
        Field_12621 = -32000 & 10258;
        Field_12501 = 3584 & 24576;
        Field_12454 = 1.0158731f * 0.12304687f;
        Field_12554 = 1.0f;
        Field_12449 = 1.0f;
        Field_12486 = -7680 & 2496;
        Field_12446 = 18452 & 8450;
        Field_12678 = 227 & 9236;
        Field_12462 = 201 & 512;
        Field_12479 = 5889 & 10240;
        Field_12469 = 4121 & 1440;
        Field_12638 = -11517 & 161;
        Field_12461 = 16905 & 8197;
        Field_12493 = -8095 & 257;
        Field_12527 = new Class_11090(Class_12440.Method_12920("\u8814\u8816\u8815\u8834\u8816\u8811\u8815\u8800\u8812\u8814\u8816"), Class_12440.Method_12709("\u08a1\u0888\u0883\u0893\u0891\u0889\u0883\u0882\u08a0\u0881\u088b\u0882\u0898\u0881\u0882\u088b"), -32732 & 16465);
        Field_12622 = new Class_11090(Class_12440.Method_12761("\u400a\u4008\u4002\u402a\u4000\u400a\u4002\u402a\u4000\u400a\u4002\u400a"), Class_12440.Method_12992("\u040b\u0408\u0402\u0402\u0408\u0401\u0408\u0402\u0400\u0408\u040b\u0401\u0408\u0400"), -29568 & 25089);
        Field_12617 = 8200 & 5156;
        String[] arrstring2 = new String[4359 & 91];
        arrstring2[-32768 & 1029] = Class_12440.Method_12991("\u4019\u4011\u4010\u4000\u4010\u4001\u4001");
        arrstring2[24915 & -30591] = Class_12440.Method_12753("\u03b2\u0391\u0394\u0387\u0390\u0387\u0380\u0391\u03b2\u0391\u0394\u0387\u0390\u0387\u0380");
        arrstring2[8330 & 3650] = Class_12440.Method_12822("\u53d1\u53d8\u53da\u53cb\u53dc\u53cc\u53cf\u5396\u53d1\u53d0\u53d3\u53da\u53dc\u53cd");
        Field_12591 = arrstring2;
        String[] arrstring3 = new String[-22310 & 4102];
        arrstring3[-16384 & 8609] = Class_12440.Method_12954("\u1e87\u1eac\u1eaa\u1ea9\u1eac\u1eaa\u1eaf");
        arrstring3[-32511 & 1033] = Class_12440.Method_12804("\u228c\u2289\u228e\u2287\u2280\u2291");
        Field_12522 = arrstring3;
        int[] arrn2 = new int[-30713 & 12435];
        arrn2[3078 & 24872] = 9732 & 9752;
        arrn2[-22263 & 1057] = 14208 & -20721;
        arrn2[-6846 & 650] = -2282 & 12098;
        Field_12637 = arrn2;
        int[] arrn3 = new int[1154 & 26];
        arrn3[10257 & -16352] = -4304 & 13828;
        arrn3[-31271 & 8197] = 9989 & 30259;
        Field_12551 = arrn3;
        Field_12651 = null;
        Field_12467 = 2560 & 12378;
        Field_12514 = Class_12440.Method_12844("\u830a\u8303\u8302");
        Field_12576 = Class_12440.Method_12943("\u0322\u0322\u0324\u0327\u0327\u0321\u0324\u0322\u0326\u0322");
        Field_12442 = Class_12440.Method_12932("\u0a06\u0a04\u0a06\u0a02\u0a00\u0a06\u0a06\u0a06\u0a06\u0a06\u0a04");
        Field_12560 = Class_12440.Method_12842("\ua41f\ua401\ua406\ua41a\ua41b\ua41b\ua405\ua404\ua418\ua410\ua416\ua416\ua406\ua406\ua418\ua403\ua408\ua405");
        Field_12671 = null;
        Field_12518 = null;
        Field_12689 = null;
        Field_12445 = null;
        Field_12496 = new Class_15674(Class_12440.Method_12799("\u1880\u1889\u188a\u1883\u1880\u1881"), Class_12440.Method_12931("\u0c01\u0c22\u0c23\u0c31\u0c26\u0c35"), 64 & 6808);
        Field_12537 = new Class_11090(Class_12440.Method_12762("\uca22\uca21\uca22\uca03\uca24\uca27\uca26\uca27\uca20\uca23\uca20"), Class_12440.Method_12832("\u0337\u0311\u0315\u0306\u0307\u0314\u0317\u0355\u0330\u0314\u0313\u0315\u0300\u0314\u0312\u0312"), 29156 & -32766);
        Field_12684 = new Class_11090(Class_12440.Method_12798("\u00b4\u00b5\u00bf\u0093\u00b8\u00b5\u00bf\u0097\u00b0\u00bc\u00b3\u00af"), Class_12440.Method_12847("\u4880\u4881\u4888\u48c9\u4880\u4889\u4880\u4889\u48c8\u4881\u4880\u4889\u4880\u4889"), 4260 & 3088);
        Field_12597 = new Class_11090(Class_12440.Method_12763("\u2040\u2054\u2042\u2046\u2040\u2044\u2046\u2066\u2044\u2040\u2042\u2062\u2044\u2040\u2046\u2052"), Class_12440.Method_12820("\u0113\u0102\u0111\u0112\u0116\u0116\u0114\u0157\u0113\u0112\u0111\u0113\u0157\u0117\u0116\u0114\u0103\u0113"), 12357 & 3210);
        Field_12586 = new Class_11090(Class_12440.Method_12956("\u0000\u0001\u0000\u0001\u0000\u0000!\u0001\b\t\b\t\b\b\b\t\u0001"), Class_12440.Method_12917("\ua0a0\ua091\ua090\ua091\ua094\ua084\ua0d5\ua0a5\ua089\ua098\ua099\ua088\ua09d\ua08c\ua09c\ua09c\ua081\ua091"), 15108 & 8);
        Field_12544 = new Class_11090(Class_12440.Method_12815("\u1204\u1204\u1204\u1204\u1200\u1204\u1200\u1204\u1204\u1200\u1204\u1204\u1204\u1200\u1204\u1200\u1200"), Class_12440.Method_12758("\u4050\u4040\u4040\u4040\u4050\u4050\u4040\u4050\u4040\u4050\u4000\u4040\u4050\u4040\u4050\u4040\u4040\u4050"), 16419 & 5256);
        Field_12453 = new Class_11090(Class_12440.Method_12894("\uf2a4\uf2a1\uf2a0"), Class_12440.Method_12710("\u5820\u5802\u5812"), 25156 & -27390);
        Field_12492 = new Class_11090(Class_12440.Method_12871("\u5200\u5203\u5200\u5201"), Class_12440.Method_12851("\uaa11\uaa12\uaa11\uaa11"), 28840 & 2644);
        Field_12545 = new Class_11090(Class_12440.Method_12849("\u4098\u4083\u408a\u4083\u408a\u409b\u4098\u4089"), Class_12440.Method_12768("\u01e8\u01d5\u01da\u01d3\u01dc\u01cd\u01ce\u01df"), -8120 & 162);
        Field_12463 = new Class_11090(Class_12440.Method_12989("\u2024\u2024\u2024\u2024\u2004\u2020\u2020\u2024\u2020\u2034\u2020\u2020\u2020\u2024"), Class_12440.Method_12731("\u2024\u2004\u2006\u2006\u2004\u2004\u2002\u2002\u2000\u2004\u2026\u2002\u2004\u2000\u2006"), 8323 & 23104);
        Field_12647 = new Class_11090(Class_12440.Method_12933("\ua324\ua326\ua325\ua32c\ua300\ua326\ua325\ua322\ua320\ua32c\ua32b\ua32b\ua321\ua32a\ua32a"), Class_12440.Method_12887("\u1813\u1811\u1810\u1811\u1814\u1816\u1812\u1811\u1814\u1810\u1810\u1807\u1805\u1817\u1806\u1806"), -32624 & 8193);
        Field_12502 = new Class_11090(Class_12440.Method_12930("\ua200\ua200\ua201\ua200\ua204\ua204\ua205\ua204\ua240\ua200\ua201\ua201\ua205\ua204\ua204\ua204\ua211\ua211\ua210\ua210\ua214"), Class_12440.Method_12714("\u1004\u1005\u1004\u1005\u1000\u1001\u1004\u1005\u1000\u1005\u1004\u1011\u1010\u1001\u1010\u1011\u1004\u1001\u1004\u1015\u1014\u1001\u1000"), -32676 & 8192);
        Field_12633 = new Class_11090(Class_12440.Method_12834("NLMDjLMJ\u0002ILNBNBJOH@K"), Class_12440.Method_12906("\u0224\u0205\u0207\u0207\u0201\u0200\u0207\u0207\u0209\u020c\u023a\u021e\u020d\u0208\u021f\u020a\u0201\u0215\u0213\u0212\u0200"), 10772 & -27488);
        Field_12625 = new HashMap();
        Field_12590 = null;
        Field_12628 = new ArrayList();
        Field_12612 = null;
        Field_12557 = null;
        Field_12475 = null;
        Field_12534 = null;
        Field_12495 = null;
        String[] arrstring4 = new String[-32765 & 3843];
        arrstring4[9795 & -12032] = Class_12440.Method_12789("\u5211\u5215\u5201\u5213\u5210\u5212\u5206\u5206");
        arrstring4[10283 & 4177] = Class_12440.Method_12978("\u2143\u2142\u2141\u2141\u2143\u2142\u2141\u2141\u2141");
        arrstring4[-7918 & 4619] = Class_12440.Method_12779("\u8126\u8127\u8124\u8127\u8120\u8120\u8127\u8126");
        Field_12687 = arrstring4;
        Field_12549 = System.getProperty(Class_12440.Method_12720("\u4102\u4108\u4100\u4100\u4104\u4106\u4106\u410e\u4108\u4108\u410a\u4108\u410e\u4106\u410e\u410c\u4102\u4100"), Class_12440.Method_12874("\u0210\u0210\u021a\u0202\u0214")).equals(Class_12440.Method_12907("\u0301\u0300\u0302\u0303"));
        Field_12644 = 0.054687496f * 9.142858f;
        Field_12524 = 1.6153847f * 0.37142858f;
        Field_12547 = 0.104477614f * 7.6571426f;
        Field_12654 = 1.3636364f * -0.73333335f;
        Field_12487 = 0.0f;
        Field_12610 = 0.0f;
        Field_12447 = -32602 & 5145;
        Field_12594 = 2.0f;
        Field_12677 = 25172 & -32368;
        Field_12571 = new int[24578 & 1058];
        Field_12587 = -7167 & 4352;
        Field_12649 = 1286 & 17280;
        Field_12624 = new int[59 & -32620];
        Field_12500 = new int[5134 & 19272];
        int[] arrn4 = new int[5768 & -32759];
        arrn4[1056 & -28528] = 64 & -29432;
        arrn4[9601 & 20537] = -29145 & 24601;
        arrn4[-15229 & 10858] = 4394 & 518;
        arrn4[26899 & 5259] = 2819 & -16157;
        arrn4[-32762 & 4645] = 16815 & 9223;
        arrn4[909 & 5189] = 16952 & 3272;
        arrn4[30 & 21958] = -21495 & 575;
        arrn4[9607 & 519] = 3214 & 25099;
        Field_12611 = arrn4;
        Field_12702 = new boolean[-31698 & 16748][1544 & 22926];
        Field_12595 = (ByteBuffer)BufferUtils.createByteBuffer((int)(3068 & 7670)).limit(792 & -23487);
        Field_12505 = new float[13008 & 19475];
        Field_12632 = new float[17240 & 2064];
        Field_12517 = new float[-28616 & 1682];
        Field_12567 = new float[9296 & 791];
        Field_12613 = new float[28700 & 3729];
        Field_12451 = new float[-26285 & 16400];
        Field_12685 = new float[18458 & 4497];
        Field_12585 = new float[-14254 & 8849];
        Field_12629 = Class_12440.Method_12950(-27055 & 2330);
        Field_12634 = Class_12440.Method_12950(152 & 16691);
        Field_12529 = Class_12440.Method_12950(-31716 & 464);
        Field_12670 = Class_12440.Method_12950(-28592 & 16921);
        Field_12631 = Class_12440.Method_12950(26745 & -32240);
        Field_12452 = Class_12440.Method_12950(19508 & -19944);
        Field_12648 = Class_12440.Method_12950(19925 & -28648);
        Field_12703 = Class_12440.Method_12950(4112 & 119);
        Field_12483 = Class_12440.Method_12950(9296 & 6194);
        Field_12575 = Class_12440.Method_12950(-1455 & 1078);
        Field_12573 = Class_12440.Method_12950(-32740 & 2320);
        Field_12474 = Class_12440.Method_12950(400 & 5649);
        Field_12704 = Class_12440.Method_12880(528 & 14685);
        Field_12558 = Class_12440.Method_12880(3083 & 4887);
        Field_12532 = Class_12440.Method_12880(8232 & 16409);
        Field_12579 = Class_12440.Method_12880(18435 & 5398);
        Field_12482 = Class_12440.Method_12880(18472 & 269);
        Field_12577 = Class_12440.Method_12880(1544 & 18474);
        Field_12659 = Class_12440.Method_12880(8200 & 19470);
        Field_12520 = Class_12440.Method_12880(2014 & 20489);
        Field_12701 = Class_12440.Method_12880(12938 & 1288);
        Field_12706 = Class_12440.Method_12880(8264 & 16648);
        Field_12646 = Class_12440.Method_12880(8456 & 157);
        Field_12690 = Class_12440.Method_12880(12841 & 1164);
        Field_12693 = Class_12440.Method_12911(-31634 & 4140, 14344 & -31672);
        String[] arrstring5 = new String[39 & 32357];
        arrstring5[6176 & 8393] = Class_12440.Method_12738("\u2d0b\u2d40");
        arrstring5[73 & 25601] = Class_12440.Method_12783("\u9400\u9400\u9400");
        arrstring5[-30714 & 16386] = Class_12440.Method_12800("\u1008\u100d\u1008\u1021");
        arrstring5[355 & -4085] = Class_12440.Method_12830("\u5445\u5441\u5447\u5445\u5407");
        arrstring5[-31994 & 20636] = Class_12440.Method_12909("\u630c\u6305\u6302\u630f\u6310\u6311\u630e\u6313");
        arrstring5[101 & 909] = Class_12440.Method_12916("\u6065\u6070\u6005\u6060\u6060\u6075\u6074\u6061\u6070");
        arrstring5[22 & 6] = Class_12440.Method_12726("\u0011\u0001\u0003\u0010\u0010\u0011\u0003\u0003\u0019\u000b");
        arrstring5[24807 & 7183] = Class_12440.Method_12821("\ub027\ub033\ub035\ub037\ub045\ub023\ub024\ub030\ub032\ub026\ub032");
        arrstring5[-22488 & 17176] = Class_12440.Method_12715("\u0ad8\u0a99\u0a98");
        arrstring5[10253 & -28151] = Class_12440.Method_12850("\u0910\u0901\u0953\u0952");
        arrstring5[17230 & -21446] = Class_12440.Method_12809("\ua100\ua114\ua110\ua122\ua120");
        arrstring5[4155 & -29809] = Class_12440.Method_12913("\u2480\u2481\u2480\u2481\u2484\u2485");
        arrstring5[940 & 28] = Class_12440.Method_12853("\ue031\ue052\ue051\ue030\ue030\ue021\ue020\ue031\ue022");
        arrstring5[191 & -23283] = Class_12440.Method_12839("\u8001\u8001\u8020\u8020\u8004\u8005\u8005\u8005\u8009\u8009");
        arrstring5[-26610 & 1646] = Class_12440.Method_12938("\u4104\u4101\u4106\u4107\u4100\u4109\u4106\u410b\u4100\u410d\u4102");
        arrstring5[4639 & -31601] = Class_12440.Method_12904("\u201a\u200e\u2008\u200a\u201c\u201a\u2010\u201c\u200e\u200e\u2010\u200e");
        arrstring5[-32464 & 3152] = Class_12440.Method_12901("\u00ab\u0088\u0089\u00a9");
        arrstring5[16401 & -23151] = Class_12440.Method_12728("\u02ad\u02a8\u02cc\u02cb\u02a9");
        arrstring5[-31406 & 10774] = Class_12440.Method_12973("\uc082\uc083\uc080\uc0a3\uc0a2\uc082");
        arrstring5[27 & 27411] = Class_12440.Method_12980("\u0426\u0433\u0434\u0437\u0440\u0447\u0434");
        arrstring5[21 & 532] = Class_12440.Method_12922("\u1100\u1160\u1160\u1115");
        arrstring5[-16139 & 6423] = Class_12440.Method_12947("\ue010\ue000\ue071\ue071\ue004");
        arrstring5[-23234 & 6294] = Class_12440.Method_12765("\uc409\uc409\uc409\uc429\uc429\uc408");
        arrstring5[2199 & 1111] = Class_12440.Method_12836("hlhh\r\rh");
        arrstring5[-17192 & 16952] = Class_12440.Method_12996("\u017a\u011a\u011a\u0160");
        arrstring5[11357 & 953] = Class_12440.Method_12837("\u42c2\u42c3\u4282\u4283\u42c4");
        arrstring5[9370 & 19227] = Class_12440.Method_12864("\u8529\u8529\u852b\u850b\u8509\u8521");
        arrstring5[13403 & 18747] = Class_12440.Method_12773("\u0101\u0100\u0103\u0102\u0104\u0105\u0106");
        arrstring5[4124 & 9566] = Class_12440.Method_12869("\u8a04\u8a64\u8a66\u8a00\u8a07");
        arrstring5[4573 & -32739] = Class_12440.Method_12814("\u7084\u7081\u7085\u7084\u7087\u7083");
        arrstring5[-23970 & 3231] = Class_12440.Method_12740("HIH\t\fMD");
        arrstring5[-26593 & 18015] = Class_12440.Method_12716("\u4240\u4240\u4240\u4240\u4204\u4204\u4244\u424c");
        arrstring5[-7132 & 107] = Class_12440.Method_12860("\u8201\u8201\u8202\u8203\u8204\u8205\u8207\u8206");
        arrstring5[801 & -4047] = Class_12440.Method_12934("\ub041\ub044\ub041\ub024\ub040\ub044\ub024");
        arrstring5[9251 & 4458] = Class_12440.Method_12713("\u37dc\u37c9\u37cc\u379f\u379e\u37d1\u37ce\u379d");
        arrstring5[13927 & -32469] = Class_12440.Method_12970("\u8c50\u8c32\u8c30\u8c42\u8c50\u8c40\u8c30\u8c30\u8c48\u8c58\u8c4a\u8c38\u8c3a\u8c48");
        arrstring5[7460 & 25132] = Class_12440.Method_12735("\u1031\u1025\u1021\u1011\u1030\u1021\u1010");
        Field_12639 = arrstring5;
        int[] arrn5 = new int[615 & -24267];
        arrn5[392 & 22609] = -2054651031 & 174103083;
        arrn5[-21183 & 17] = 315597423 & 606112555;
        arrn5[-32222 & 22787] = 1611760251 & 201362901;
        arrn5[-32517 & 8195] = 637832028 & -2147446693;
        arrn5[1420 & 8708] = 201969559 & 1076277172;
        arrn5[2357 & 8197] = -733433955 & 690261973;
        arrn5[4358 & -22449] = 1363193750 & 571006974;
        arrn5[2311 & -28497] = 4493215 & 1119408023;
        arrn5[16489 & 2200] = -1254061522 & 178771498;
        arrn5[11 & 3561] = 3187244 & -2138799428;
        arrn5[16875 & 14] = -972954276 & 559710325;
        arrn5[8491 & 155] = -2042591777 & 1342953595;
        arrn5[25036 & 13] = 1082388378 & 673226684;
        arrn5[1741 & -24563] = 203468697 & -1857253381;
        arrn5[28702 & -32242] = 307098 & 117497818;
        arrn5[11535 & -16241] = 1250344859 & 271683483;
        arrn5[-14798 & 16] = -1054760083 & 350002735;
        arrn5[2137 & 18065] = 1103922751 & 403950127;
        arrn5[20818 & 1202] = 51419 & -1568171717;
        arrn5[6299 & -24045] = 807963418 & -2003588069;
        arrn5[1044 & 6676] = 839942702 & 4306494;
        arrn5[2101 & 9431] = 102019638 & 1883409136;
        arrn5[1246 & -24298] = -453932523 & 269273175;
        arrn5[-32713 & 12695] = 1613531156 & -1665032267;
        arrn5[-24551 & 22680] = 134521397 & 1893372797;
        arrn5[91 & -22759] = -527923525 & 239460987;
        arrn5[927 & -30630] = 1292082595 & 270060931;
        arrn5[4667 & -32485] = 352894850 & -2013229661;
        arrn5[-32740 & 94] = 155222710 & 1151903606;
        arrn5[2077 & -2467] = 27914876 & 843089727;
        arrn5[31326 & 286] = -1602183183 & 1416793465;
        arrn5[5535 & 10335] = -970797710 & 411606512;
        arrn5[13488 & -13982] = 12054 & 10928;
        arrn5[24807 & 4145] = 1147192919 & 580751703;
        arrn5[8295 & 2098] = 3440861 & -2012700327;
        arrn5[4643 & 3391] = -2012967685 & 5353274;
        arrn5[36 & 252] = 143690813 & -2146918467;
        Field_12531 = arrn5;
        Field_12484 = Pattern.compile(Class_12440.Method_12854("\u4340\u434a\u4302\u4300\u4346\u4344\u434e\u4306\u4348\u430a\u4308\u4348\u4346\u430e\u430c\u434c\u434a\u4302\u4300\u4342\u4304\u4344\u4306\u4344\u4340\u430a\u4308\u4348\u4346\u430e"));
        Field_12661 = new int[2786 & -28372];
        Field_12583 = 4416 & 2192;
        Field_12608 = Class_12440.Method_12838("\u5010\u5011\u5012\u5013\u5014\u5015\u5016\u5017\u5010\u5011\u5029\u502a\u502f\u502c\u502d\u502e").toCharArray();
        Field_12472 = new byte[704 & 28];
        Field_12581 = new File(Class_18.Field_89.Field_68, Class_12440.Method_12891("\u1600\u1602\u1600\u1600\u1606\u1604\u1606"));
        Field_12600 = new File(Class_18.Field_89.Field_68, Field_12442);
        Field_12582 = new File(Class_18.Field_89.Field_68, Field_12560);
        Field_12659.limit(1184 & 528);
        Field_12690.put(-2144296990 & 1061326052).position(13360 & 18569).limit(10243 & -11767);
    }

    private static IntBuffer Method_12937(IntBuffer intBuffer) {
        int n = intBuffer.limit();
        for (int i = intBuffer.position(); i < n; ++i) {
            intBuffer.put(i, 20608 & 1038);
        }
        return intBuffer;
    }

    private static String Method_12938(String string) {
        int n = 14956;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 106);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static void Method_12939(float f, float f2, float f3) {
        Field_12456 = f;
        Field_12526 = f2;
        Field_12705 = f3;
        Class_12440.Method_12777("fogColor", Field_12456, Field_12526, Field_12705);
    }

    private static String Method_12940(String string) {
        int n = 9806;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static boolean Method_12941(File file) {
        if (Field_12472.length == 0) {
            for (int i = 26 & -28475; i < (2264 & 17608); ++i) {
                try {
                    Thread.sleep(580196362L & 8181013403752464523L);
                }
                catch (InterruptedException interruptedException) {
                    break;
                }
                if (Field_12472.length > 0) break;
            }
        }
        int n = -32768 & 4100;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] arrby = new byte[5817 & 1286];
            FileInputStream fileInputStream = new FileInputStream(file);
            DigestInputStream digestInputStream = new DigestInputStream(fileInputStream, messageDigest);
            while (digestInputStream.read(arrby) != (-1 & -1)) {
            }
            byte[] arrby2 = messageDigest.digest();
            digestInputStream.close();
            int n2 = -24488 & 672;
            while (n2 * (176 & 341) < Field_12472.length) {
                int n3 = 17 & 21093;
                for (int i = 16960 & 8625; i < (28 & 17459); ++i) {
                    if (arrby2[i] == Field_12472[i + n2 * (18640 & 4625)]) continue;
                    n3 = -32565 & 4128;
                    break;
                }
                if (n3 != 0) {
                    n = 8321 & 18777;
                    break;
                }
                ++n2;
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return n != 0;
    }

    private static String Method_12942(String string) {
        int n = 31161;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 14);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12943(String string) {
        int n = 5288;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 57);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static int Method_12944(String string, String string2, String string3) {
        int n = GL11.glGetError();
        if (n != 0) {
            Object[] arrobject = new Object[741 & 5];
            arrobject[-14200 & 8722] = n;
            arrobject[2705 & 9549] = GLU.gluErrorString((int)n);
            arrobject[1714 & 259] = string;
            arrobject[24847 & 6787] = string2;
            arrobject[-12282 & 8797] = string3;
            System.err.format("GL error 0x%04x: %s at %s %s %s\n", arrobject);
        }
        return n;
    }

    public static void Method_12945() {
        Object object;
        Class_26062.Method_26067("Load ShadersMod configuration.");
        try {
            if (!Field_12600.exists()) {
                Field_12600.mkdir();
            }
        }
        catch (Exception exception) {
            Class_26062.Method_26069("Failed to open the shaderpacks directory: " + Field_12600);
        }
        Field_12662 = new Class_34319();
        Field_12662.setProperty(Class_11452.Field_11454.Method_11489(), "");
        if (Field_12582.exists()) {
            try {
                object = new FileReader(Field_12582);
                Field_12662.load((Reader)object);
                ((InputStreamReader)object).close();
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        if (!Field_12582.exists()) {
            try {
                Class_12440.Method_12855();
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        object = Class_11452.Method_11482();
        for (int i = 1728 & 2068; i < ((Object)object).length; ++i) {
            Object object2 = object[i];
            String string = ((Class_11452)((Object)object2)).Method_11489();
            String string2 = ((Class_11452)((Object)object2)).Method_11537();
            String string3 = Field_12662.getProperty(string, string2);
            Class_12440.Method_12831((Class_11452)((Object)object2), string3);
        }
        Class_12440.Method_12986();
    }

    public static void Method_12946() {
        FloatBuffer floatBuffer = Field_12573;
        floatBuffer.clear();
        GL11.glGetFloat((int)(-17498 & 20390), (FloatBuffer)floatBuffer);
        floatBuffer.get(Field_12578, 1040 & 2569, 272 & -16261);
        Class_21899.Method_21903(Field_12480, Field_12578, Field_12664);
        Class_21899.Method_21903(Field_12623, Field_12578, Field_12528);
        System.arraycopy(Field_12565 == Field_12699 ? Field_12480 : Field_12623, 1282 & 4852, Field_12448, 588 & 4096, 22583 & 1675);
        Class_12440.Method_12777("sunPosition", Field_12480[9250 & 6420], Field_12480[1029 & 14457], Field_12480[-30462 & 12315]);
        Class_12440.Method_12777("moonPosition", Field_12623[17676 & 0], Field_12623[17667 & -32767], Field_12623[12690 & 10]);
        Class_12440.Method_12777("shadowLightPosition", Field_12448[34 & 1025], Field_12448[4645 & 3473], Field_12448[-27873 & 2050]);
        Class_12440.Method_12988("postCelestialRotate");
    }

    private static String Method_12947(String string) {
        int n = 18834;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 113);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static void Method_12948() {
        Field_12628.clear();
        for (int i = -127 & -128; i <= (-28528 & 17288); ++i) {
            String string = "/shaders/world" + i;
            if (!Field_12651.Method_19217(string)) continue;
            Field_12628.add(i);
        }
        if (Field_12628.size() > 0) {
            Integer[] arrinteger = Field_12628.toArray(new Integer[Field_12628.size()]);
            Class_19426.Method_19526("[Shaders] Worlds: " + Class_19426.Method_19555(arrinteger));
        }
    }

    public static void Method_12949() {
        GL11.glRotatef((float)(Field_12487 * 1.0f), (float)0.0f, (float)0.0f, (float)1.0f);
        Class_12440.Method_12988("preCelestialRotate");
    }

    private static FloatBuffer Method_12950(int n) {
        ByteBuffer byteBuffer = Field_12595;
        int n2 = byteBuffer.limit();
        byteBuffer.position(n2).limit(n2 + n * (3943 & -24572));
        return byteBuffer.asFloatBuffer();
    }

    private static String Method_12951(String string) {
        int n = 20794;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12952(String string) {
        int n = 2228;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 6);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12953(String string) {
        int n = 9275;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 30);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12954(String string) {
        int n = 30537;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 54);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static float Method_12955() {
        return Field_12618 < 0.0f ? -0.30769232f * 3.25f : Field_12539 * Field_12618;
    }

    private static String Method_12956(String string) {
        int n = 11716;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 68);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static void Method_12957() {
        if (Field_12673) {
            Class_12440.Method_12981(-32242 & 27678);
        }
    }

    public static void Method_12958() {
        Class_12440.Method_12813();
        if (Field_12467) {
            Class_33489.Method_33493();
        }
    }

    public static boolean Method_12959() {
        return Field_12640;
    }

    public static void Method_12960() {
        Class_12440.Method_12905();
        GL11.glColor3f((float)Field_12456, (float)Field_12526, (float)Field_12705);
        Class_12440.Method_12903();
        GL11.glColor3f((float)Field_12552, (float)Field_12627, (float)Field_12663);
    }

    public static void Method_12961() {
        if (Field_12601) {
            Class_12440.Method_12988("Shaders.uninit pre");
            for (int i = 3075 & -28160; i < (428 & 16958); ++i) {
                if (Field_12674[i] != 0) {
                    ARBShaderObjects.glDeleteObjectARB((int)Field_12674[i]);
                    Class_12440.Method_12988("del programRef");
                }
                Class_12440.Field_12674[i] = -31740 & 20737;
                Class_12440.Field_12548[i] = 1064 & 8784;
                Class_12440.Field_12604[i] = null;
                Class_12440.Field_12569[i] = null;
                Class_12440.Field_12584[i] = 3144 & -16095;
            }
            Field_12635 = 6154 & 17572;
            if (Field_12562 != 0) {
                EXTFramebufferObject.glDeleteFramebuffersEXT((int)Field_12562);
                Field_12562 = 3648 & -12266;
                Class_12440.Method_12988("del dfb");
            }
            if (Field_12470 != 0) {
                EXTFramebufferObject.glDeleteFramebuffersEXT((int)Field_12470);
                Field_12470 = 20682 & 9220;
                Class_12440.Method_12988("del sfb");
            }
            if (Field_12558 != null) {
                Class_16867.Method_16968(Field_12558);
                Class_12440.Method_12937(Field_12558);
                Class_12440.Method_12988("del dfbDepthTextures");
            }
            if (Field_12704 != null) {
                Class_16867.Method_16968(Field_12704);
                Class_12440.Method_12937(Field_12704);
                Class_12440.Method_12988("del dfbTextures");
            }
            if (Field_12579 != null) {
                Class_16867.Method_16968(Field_12579);
                Class_12440.Method_12937(Field_12579);
                Class_12440.Method_12988("del shadow depth");
            }
            if (Field_12532 != null) {
                Class_16867.Method_16968(Field_12532);
                Class_12440.Method_12937(Field_12532);
                Class_12440.Method_12988("del shadow color");
            }
            if (Field_12482 != null) {
                Class_12440.Method_12937(Field_12482);
            }
            if (Field_12503 != null) {
                Field_12503.Method_26182();
                Field_12503 = null;
            }
            Class_26062.Method_26067("Uninit");
            Field_12599 = -22496 & 1608;
            Field_12530 = 568 & 18880;
            Field_12601 = 8 & 8448;
            Class_12440.Method_12988("Shaders.uninit");
        }
    }

    private static String Method_12962(String string) {
        int n = 2186;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 20);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static int Method_12963(String string) {
        string = string.trim();
        for (int i = 9295 & 4384; i < Field_12639.length; ++i) {
            String string2 = Field_12639[i];
            if (!string.equals(string2)) continue;
            return Field_12531[i];
        }
        return 256 & -31603;
    }

    public static void Method_12964() {
        Class_16867.Method_16931();
        Class_16867.Method_16952();
    }

    public static void Method_12965() {
        if (Field_12441) {
            Class_12440.Method_12988("shadow endRender");
        } else {
            if (!Field_12626) {
                Class_12440.Method_12987();
            }
            Field_12673 = 11813 & 146;
            Class_16867.Method_16923((10753 & -31739) != 0, (21865 & 2049) != 0, (-14335 & 1089) != 0, (24619 & -25851) != 0);
            Class_12440.Method_12981(-32765 & 24596);
            Class_39477.Method_39484();
            Class_12440.Method_12988("endRender end");
        }
    }

    public static void Method_12966() {
        Field_12697 = 2147 & 4;
        if (Field_12498 == (10871 & 4099)) {
            Class_12440.Method_12981(9810 & -16350);
        }
    }

    private static int Method_12967(String string) {
        return !string.equals("colortex0") && !string.equals("gcolor") ? (!string.equals("colortex1") && !string.equals("gdepth") ? (!string.equals("colortex2") && !string.equals("gnormal") ? (!string.equals("colortex3") && !string.equals("composite") ? (!string.equals("colortex4") && !string.equals("gaux1") ? (!string.equals("colortex5") && !string.equals("gaux2") ? (!string.equals("colortex6") && !string.equals("gaux3") ? (!string.equals("colortex7") && !string.equals("gaux4") ? -1 & -1 : 263 & 7863) : 543 & -19386) : -31673 & 157) : 2054 & -32060) : 547 & 1035) : 2474 & 4102) : 18569 & -32219) : -24511 & 20752;
    }

    private static String Method_12968(String string) {
        int n = 15740;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 46);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static void Method_12969() {
        Class_12440.Method_12845();
        Class_12440.Method_12997();
        Class_12440.Method_12981(Field_12697 ? -30705 & 131 : 11414 & 20555);
    }

    private static String Method_12970(String string) {
        int n = 3226;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 127);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static void Method_12971() {
        Field_12653 = 20483 & 561;
        Class_12440.Method_12985(-1 & -3, 18462 & -24447);
        Class_12440.Method_12981(-12026 & 1030);
    }

    public static void Method_12972(float f) {
        float f2;
        float f3;
        float f4;
        Class_1061 class_1061 = Field_12683.Method_246();
        double d = class_1061.Field_1126 + (class_1061.Field_1130 - class_1061.Field_1126) * (double)f;
        double d2 = class_1061.Field_1102 + (class_1061.Method_1324() - class_1061.Field_1102) * (double)f;
        double d3 = class_1061.Field_1125 + (class_1061.Field_1106 - class_1061.Field_1125) * (double)f;
        Field_12619 = d;
        Field_12615 = d2;
        Field_12620 = d3;
        GL11.glGetFloat((int)(-25689 & 19439), (FloatBuffer)((FloatBuffer)Field_12629.position(-32742 & 4484)));
        Class_21899.Method_21901((FloatBuffer)Field_12634.position(-17392 & 38), (FloatBuffer)Field_12629.position(1542 & 20512), Field_12632, Field_12505);
        Field_12629.position(-9211 & 8984);
        Field_12634.position(2588 & 26049);
        GL11.glGetFloat((int)(12214 & -29786), (FloatBuffer)((FloatBuffer)Field_12529.position(17056 & 8257)));
        Class_21899.Method_21901((FloatBuffer)Field_12670.position(-22528 & 1776), (FloatBuffer)Field_12529.position(20940 & 544), Field_12567, Field_12517);
        Field_12529.position(5266 & 0);
        Field_12670.position(0 & 4370);
        GL11.glViewport((int)(2224 & 16969), (int)(1289 & 208), (int)Field_12450, (int)Field_12568);
        GL11.glMatrixMode((int)(-26845 & 5897));
        GL11.glLoadIdentity();
        if (Field_12658) {
            GL11.glOrtho((double)(-Field_12539), (double)Field_12539, (double)(-Field_12539), (double)Field_12539, (double)(1.9583333333333333 * 0.0255319152740722), (double)(0.1702127659574468 * 1504.0));
        } else {
            GLU.gluPerspective((float)Field_12688, (float)((float)Field_12450 / (float)Field_12568), (float)(0.8552632f * 0.05846154f), (float)(344.0f * 0.74418604f));
        }
        GL11.glMatrixMode((int)(-26783 & 14096));
        GL11.glLoadIdentity();
        GL11.glTranslatef((float)0.0f, (float)0.0f, (float)(-14.285714f * 7.0f));
        GL11.glRotatef((float)(0.6666667f * 135.0f), (float)1.0f, (float)0.0f, (float)0.0f);
        Field_12564 = Class_12440.Field_12683.Field_72.\u0000
        (f);
        Field_12699 = Field_12564 < 1.3432835f * 0.55833334f ? Field_12564 + 1.1686747f * 0.21391752f : Field_12564 - 1.4666667f * 0.5113636f;
        float f5 = Field_12564 * (0.7692308f * -468.0f);
        float f6 = f3 = Field_12610 > 0.0f ? f5 % Field_12610 - Field_12610 * (0.75f * 0.6666667f) : 0.0f;
        if ((double)Field_12699 <= 8.181818181818182 * 0.06111111111111111) {
            GL11.glRotatef((float)(f5 - f3), (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)Field_12487, (float)1.0f, (float)0.0f, (float)0.0f);
            Field_12565 = Field_12699;
        } else {
            GL11.glRotatef((float)(f5 + 240.0f * 0.75f - f3), (float)0.0f, (float)0.0f, (float)1.0f);
            GL11.glRotatef((float)Field_12487, (float)1.0f, (float)0.0f, (float)0.0f);
            Field_12565 = Field_12699 - 0.5833333f * 0.85714287f;
        }
        if (Field_12658) {
            f2 = Field_12594;
            f4 = f2 / 2.0f;
            GL11.glTranslatef((float)((float)d % f2 - f4), (float)((float)d2 % f2 - f4), (float)((float)d3 % f2 - f4));
        }
        f2 = Field_12699 * (15.707964f * 0.4f);
        f4 = (float)Math.cos(f2);
        float f7 = (float)Math.sin(f2);
        float f8 = Field_12487 * (11.058407f * 0.5681818f);
        float f9 = f4;
        float f10 = f7 * (float)Math.cos(f8);
        float f11 = f7 * (float)Math.sin(f8);
        if ((double)Field_12699 > 0.6153846153846154 * 0.8125) {
            f9 = -f4;
            f10 = -f10;
            f11 = -f11;
        }
        Class_12440.Field_12488[11271 & 768] = f9;
        Class_12440.Field_12488[17029 & -28655] = f10;
        Class_12440.Field_12488[70 & 2987] = f11;
        Class_12440.Field_12488[8211 & 1671] = 0.0f;
        GL11.glGetFloat((int)(-9241 & 2999), (FloatBuffer)((FloatBuffer)Field_12631.position(4097 & 1152)));
        Class_21899.Method_21901((FloatBuffer)Field_12452.position(1280 & -3581), (FloatBuffer)Field_12631.position(25836 & -28158), Field_12451, Field_12613);
        Field_12631.position(4104 & -32206);
        Field_12452.position(-24320 & 156);
        GL11.glGetFloat((int)(19375 & -25626), (FloatBuffer)((FloatBuffer)Field_12648.position(8192 & 23168)));
        Class_21899.Method_21901((FloatBuffer)Field_12703.position(11524 & 608), (FloatBuffer)Field_12648.position(512 & -21437), Field_12585, Field_12685);
        Field_12648.position(-13744 & 4356);
        Field_12703.position(41 & 16898);
        Class_12440.Method_12754("gbufferProjection", (130 & 4616) != 0, Field_12629);
        Class_12440.Method_12754("gbufferProjectionInverse", (4369 & 26632) != 0, Field_12634);
        Class_12440.Method_12754("gbufferPreviousProjection", (4746 & -32751) != 0, Field_12483);
        Class_12440.Method_12754("gbufferModelView", (20544 & -29562) != 0, Field_12529);
        Class_12440.Method_12754("gbufferModelViewInverse", (6177 & 16528) != 0, Field_12670);
        Class_12440.Method_12754("gbufferPreviousModelView", (-30556 & 8194) != 0, Field_12575);
        Class_12440.Method_12754("shadowProjection", (8312 & 257) != 0, Field_12631);
        Class_12440.Method_12754("shadowProjectionInverse", (-28142 & 16389) != 0, Field_12452);
        Class_12440.Method_12754("shadowModelView", (-26099 & 418) != 0, Field_12648);
        Class_12440.Method_12754("shadowModelViewInverse", (2130 & 12417) != 0, Field_12703);
        Class_12440.Field_12683.Field_84.Field_39802 = 17449 & -29949;
        Class_12440.Method_12988("setCamera");
    }

    private static String Method_12973(String string) {
        int n = 28415;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 110);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static void Method_12974() {
        if (Field_12673 && Field_12548[9426 & -27846] != Field_12548[18240 & -30714]) {
            Class_12440.Method_12981(3164 & 8211);
            Class_16867.Method_16985();
        }
    }

    private static String Method_12975(String string) {
        int n = 17080;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 39);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static void Method_12976(int n, int n2, boolean bl) {
        if (!Field_12441) {
            int n3;
            int n4;
            int n5;
            int n6;
            int n7;
            GL11.glPushMatrix();
            GL11.glLoadIdentity();
            GL11.glMatrixMode((int)(6073 & -18623));
            GL11.glPushMatrix();
            GL11.glLoadIdentity();
            GL11.glOrtho((double)0.0, (double)1.0, (double)0.0, (double)1.0, (double)0.0, (double)1.0);
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            Class_16867.Method_16965();
            Class_16867.Method_16985();
            Class_16867.Method_16952();
            Class_16867.Method_16927();
            Class_16867.Method_16936(5911 & 583);
            Class_16867.Method_16930((2050 & -32440) != 0);
            Class_16867.Method_16931();
            if (Field_12680 >= (323 & 16909)) {
                Class_16867.Method_16960(219661548 & -2113886763);
                Class_16867.Method_16963(Field_12579.get(16648 & -31674));
                if (Field_12680 >= (17042 & 8266)) {
                    Class_16867.Method_16960(161514733 & -503278395);
                    Class_16867.Method_16963(Field_12579.get(1545 & 16469));
                }
            }
            for (n4 = 6400 & 16456; n4 < Field_12508; ++n4) {
                Class_16867.Method_16960((536915144 & -2005891851) + Field_12611[n4]);
                Class_16867.Method_16963(Field_12624[n4]);
            }
            Class_16867.Method_16960(-1828661530 & 1760398791);
            Class_16867.Method_16963(Field_12558.get(16849 & 6));
            if (Field_12512 >= (-28666 & 17938)) {
                Class_16867.Method_16960(1621216459 & -1844148529);
                Class_16867.Method_16963(Field_12558.get(17665 & 4113));
                if (Field_12512 >= (-32221 & 16515)) {
                    Class_16867.Method_16960(335774927 & 25199820);
                    Class_16867.Method_16963(Field_12558.get(2 & 4898));
                }
            }
            for (n4 = 4113 & 10026; n4 < Field_12542; ++n4) {
                Class_16867.Method_16960((-2119263027 & 101754317) + n4);
                Class_16867.Method_16963(Field_12532.get(n4));
            }
            if (Field_12587) {
                Class_16867.Method_16960((-2075867712 & 41977549) + Field_12503.Method_26184());
                Class_16867.Method_16963(Field_12503.Method_26183());
            }
            if (bl) {
                Class_12440.Method_12925(Field_12557);
            } else {
                Class_12440.Method_12925(Field_12475);
            }
            Class_16867.Method_16960(1176675558 & -1861642800);
            n4 = 4097 & 1653;
            for (n7 = -32231 & 8352; n7 < Field_12508; ++n7) {
                EXTFramebufferObject.glFramebufferTexture2DEXT((int)(152104275 & -1577021632), (int)((572916 & 839961824) + n7), (int)(-29215 & 8165), (int)Field_12624[(16462 & 10776) + n7], (int)(-31712 & 16392));
            }
            EXTFramebufferObject.glFramebufferTexture2DEXT((int)(-2146906776 & 809741632), (int)(676498724 & -2069066414), (int)(7671 & 19937), (int)Field_12558.get(12576 & 2077), (int)(-16382 & 2632));
            GL20.glDrawBuffers((IntBuffer)Field_12482);
            Class_12440.Method_12988("pre-composite");
            for (n7 = -28671 & 8984; n7 < n2; ++n7) {
                if (Field_12548[n + n7] == 0) continue;
                Class_12440.Method_12981(n + n7);
                Class_12440.Method_12988(Field_12614[n + n7]);
                if (Field_12521 != 0) {
                    Class_12440.Method_12927();
                }
                Class_12440.Method_12760();
                for (n3 = -23388 & 20745; n3 < Field_12508; ++n3) {
                    if (!Field_12702[n + n7][n3]) continue;
                    n5 = Field_12500[n3];
                    n6 = Class_12440.Field_12500[n3] = (-23416 & 266) - n5;
                    Class_16867.Method_16960((1797367524 & 281183680) + Field_12611[n3]);
                    Class_16867.Method_16963(Field_12624[n6 + n3]);
                    EXTFramebufferObject.glFramebufferTexture2DEXT((int)(222875490 & 41979216), (int)((285908211 & 1149545960) + n3), (int)(4065 & 11765), (int)Field_12624[n5 + n3], (int)(2560 & 16848));
                }
                Class_16867.Method_16960(134253780 & 1073780424);
            }
            Class_12440.Method_12988("composite");
            int n8 = n7 = bl ? -16021 & 7227 : 2862 & 42;
            if (Field_12548[n7] != 0) {
                Class_12440.Method_12981(n7);
                Class_12440.Method_12988(Field_12614[n7]);
                if (Field_12521 != 0) {
                    Class_12440.Method_12927();
                }
                Class_12440.Method_12760();
                for (n3 = -28671 & 9736; n3 < Field_12508; ++n3) {
                    if (!Field_12702[n7][n3]) continue;
                    n5 = Field_12500[n3];
                    n6 = Class_12440.Field_12500[n3] = (26746 & 264) - n5;
                    Class_16867.Method_16960((21009601 & -190664752) + Field_12611[n3]);
                    Class_16867.Method_16963(Field_12624[n6 + n3]);
                    EXTFramebufferObject.glFramebufferTexture2DEXT((int)(-2105241752 & 1158843840), (int)((554806496 & 8687336) + n3), (int)(15863 & 3553), (int)Field_12624[n5 + n3], (int)(16448 & -31200));
                }
                Class_16867.Method_16960(16887267 & 810718400);
            }
            if (bl) {
                Class_12440.Method_12888();
            }
            if (bl) {
                Field_12626 = -28135 & 17409;
            }
            if (!bl) {
                for (n3 = 12420 & 2635; n3 < Field_12508; ++n3) {
                    EXTFramebufferObject.glFramebufferTexture2DEXT((int)(1073777988 & 982568778), (int)((304455400 & 1157811700) + n3), (int)(28129 & 4071), (int)Field_12624[n3], (int)(8304 & 2824));
                }
                Class_12440.Method_12977(Field_12569[4141 & 9612]);
            }
            Class_16867.Method_16918();
            Class_16867.Method_16965();
            Class_16867.Method_16913();
            Class_16867.Method_16947();
            Class_16867.Method_16936(20999 & 2859);
            Class_16867.Method_16930((10497 & 35) != 0);
            GL11.glPopMatrix();
            GL11.glMatrixMode((int)(14193 & 7938));
            GL11.glPopMatrix();
            Class_12440.Method_12981(16662 & -25599);
        }
    }

    public static void Method_12977(IntBuffer intBuffer) {
        if (intBuffer == null) {
            intBuffer = Field_12659;
        }
        if (Field_12538 != intBuffer) {
            Field_12538 = intBuffer;
            GL20.glDrawBuffers((IntBuffer)intBuffer);
        }
    }

    private static String Method_12978(String string) {
        int n = 28931;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 87);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static void Method_12979() {
        Class_12440.Method_12988("pre endHand");
        Class_12440.Method_12923("pre endHand");
        GL11.glMatrixMode((int)(-26821 & 22273));
        GL11.glPopMatrix();
        GL11.glMatrixMode((int)(5901 & -24688));
        GL11.glPopMatrix();
        Class_16867.Method_16951(770 & -19581, 4939 & 775);
        Class_12440.Method_12988("endHand");
    }

    private static String Method_12980(String string) {
        int n = 27635;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 111);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static void Method_12981(int n) {
        Class_12440.Method_12988("pre-useProgram");
        if (Field_12441) {
            n = 8350 & 1055;
            if (Field_12548[8286 & -16322] == 0) {
                Field_12641 = 2112 & 1035;
                return;
            }
        }
        if (Field_12498 != n) {
            Field_12498 = n;
            ARBShaderObjects.glUseProgramObjectARB((int)Field_12548[n]);
            if (Field_12548[n] == 0) {
                Field_12641 = 1568 & 65;
            } else {
                if (Class_12440.Method_12757("useProgram ", Field_12614[n]) != 0) {
                    Class_12440.Field_12548[n] = 9536 & -28517;
                }
                IntBuffer intBuffer = Field_12569[n];
                if (Field_12598) {
                    Class_12440.Method_12977(intBuffer);
                    Class_12440.Method_12944(Field_12614[n], " draw buffers = ", Field_12604[n]);
                }
                Field_12521 = Field_12584[n];
                Field_12645.\u0000strictfp(Field_12548[Field_12498]);
                Field_12580.\u0000strictfp(Field_12548[Field_12498]);
                Field_12543.\u0000strictfp(Field_12548[Field_12498]);
                switch (n) {
                    case 1: 
                    case 2: 
                    case 3: 
                    case 4: 
                    case 5: 
                    case 6: 
                    case 7: 
                    case 8: 
                    case 9: 
                    case 10: 
                    case 11: 
                    case 12: 
                    case 13: 
                    case 16: 
                    case 18: 
                    case 19: 
                    case 20: 
                    case 41: {
                        Field_12641 = 1349 & 16385;
                        Class_12440.Method_12811("texture", 16515 & 5924);
                        Class_12440.Method_12811("lightmap", 26049 & 2061);
                        Class_12440.Method_12811("normals", 2 & -15849);
                        Class_12440.Method_12811("specular", -32745 & 16675);
                        Class_12440.Method_12811("shadow", Field_12473 ? 2215 & 21597 : 21518 & -30668);
                        Class_12440.Method_12811("watershadow", 27716 & 263);
                        Class_12440.Method_12811("shadowtex0", 1036 & 135);
                        Class_12440.Method_12811("shadowtex1", 30727 & 1253);
                        Class_12440.Method_12811("depthtex0", 790 & 13414);
                        if (Field_12612 != null || Field_12635) {
                            Class_12440.Method_12811("gaux1", 2383 & 25767);
                            Class_12440.Method_12811("gaux2", -32758 & 76);
                            Class_12440.Method_12811("gaux3", 24585 & 5209);
                            Class_12440.Method_12811("gaux4", 1130 & 2190);
                        }
                        Class_12440.Method_12811("depthtex1", 524 & -16292);
                        Class_12440.Method_12811("shadowcolor", -21491 & 463);
                        Class_12440.Method_12811("shadowcolor0", 5165 & -32179);
                        Class_12440.Method_12811("shadowcolor1", 17455 & 2702);
                        Class_12440.Method_12811("noisetex", -24529 & 143);
                        break;
                    }
                    default: {
                        Field_12641 = 16 & 3852;
                        break;
                    }
                    case 21: 
                    case 22: 
                    case 23: 
                    case 24: 
                    case 25: 
                    case 26: 
                    case 27: 
                    case 28: 
                    case 29: 
                    case 33: 
                    case 34: 
                    case 35: 
                    case 36: 
                    case 37: 
                    case 38: 
                    case 39: 
                    case 40: 
                    case 42: 
                    case 43: {
                        Field_12641 = 2130 & 25728;
                        Class_12440.Method_12811("gcolor", 541 & -32672);
                        Class_12440.Method_12811("gdepth", 13057 & 16451);
                        Class_12440.Method_12811("gnormal", 17442 & 410);
                        Class_12440.Method_12811("composite", -23533 & 131);
                        Class_12440.Method_12811("gaux1", -16113 & 4151);
                        Class_12440.Method_12811("gaux2", 13960 & 18461);
                        Class_12440.Method_12811("gaux3", 9 & 8393);
                        Class_12440.Method_12811("gaux4", 1198 & -32694);
                        Class_12440.Method_12811("colortex0", 16449 & 656);
                        Class_12440.Method_12811("colortex1", 8329 & -15293);
                        Class_12440.Method_12811("colortex2", -15994 & 107);
                        Class_12440.Method_12811("colortex3", 12323 & 2523);
                        Class_12440.Method_12811("colortex4", -24041 & 4207);
                        Class_12440.Method_12811("colortex5", 10 & 2328);
                        Class_12440.Method_12811("colortex6", 9229 & -32231);
                        Class_12440.Method_12811("colortex7", -19633 & 2058);
                        Class_12440.Method_12811("shadow", Field_12473 ? 18437 & -31097 : 9221 & 7044);
                        Class_12440.Method_12811("watershadow", 8260 & 1342);
                        Class_12440.Method_12811("shadowtex0", -31866 & 108);
                        Class_12440.Method_12811("shadowtex1", 28773 & -32763);
                        Class_12440.Method_12811("gdepthtex", 294 & -16234);
                        Class_12440.Method_12811("depthtex0", 6535 & 16974);
                        Class_12440.Method_12811("depthtex1", 14507 & -16053);
                        Class_12440.Method_12811("depthtex2", 28780 & 1053);
                        Class_12440.Method_12811("shadowcolor", 8461 & 141);
                        Class_12440.Method_12811("shadowcolor0", 6221 & -24403);
                        Class_12440.Method_12811("shadowcolor1", 2063 & -31986);
                        Class_12440.Method_12811("noisetex", -32049 & 25919);
                        break;
                    }
                    case 30: 
                    case 31: 
                    case 32: {
                        Class_12440.Method_12811("tex", 30012 & 2754);
                        Class_12440.Method_12811("texture", 5441 & -14302);
                        Class_12440.Method_12811("lightmap", 19715 & -32767);
                        Class_12440.Method_12811("normals", -28574 & 1162);
                        Class_12440.Method_12811("specular", -15869 & 9487);
                        Class_12440.Method_12811("shadow", Field_12473 ? -28411 & 519 : 8718 & 1380);
                        Class_12440.Method_12811("watershadow", -32731 & 31252);
                        Class_12440.Method_12811("shadowtex0", 2446 & -19420);
                        Class_12440.Method_12811("shadowtex1", 2199 & 4165);
                        if (Field_12612 != null) {
                            Class_12440.Method_12811("gaux1", 3079 & 4247);
                            Class_12440.Method_12811("gaux2", 2312 & 9368);
                            Class_12440.Method_12811("gaux3", -31703 & 10379);
                            Class_12440.Method_12811("gaux4", 8603 & 17934);
                        }
                        Class_12440.Method_12811("shadowcolor", 25677 & -30451);
                        Class_12440.Method_12811("shadowcolor0", -32689 & 11037);
                        Class_12440.Method_12811("shadowcolor1", 4190 & 3087);
                        Class_12440.Method_12811("noisetex", 31 & -29425);
                    }
                }
                Class_23823 class_23823 = Class_12440.Field_12683.Field_48 != null ? Class_12440.Field_12683.Field_48.\u0000strictfp() : null;
                Class_1956 class_1956 = class_23823 != null ? class_23823.Method_23844() : null;
                int n2 = -1 & -1;
                Class_3238 class_3238 = null;
                if (class_1956 != null) {
                    n2 = Class_1956.Field_1961.Method_3647(class_1956);
                    class_3238 = (Class_3238)Class_3238.Field_3271.Method_3641(n2);
                }
                int n3 = class_3238 != null ? class_3238.Method_3355() : 4224 & 25136;
                Class_12440.Method_12811("heldItemId", n2);
                Class_12440.Method_12811("heldBlockLightValue", n3);
                Class_12440.Method_12811("fogMode", Field_12653 ? Field_12447 : 8075 & -32768);
                Class_12440.Method_12777("fogColor", Field_12456, Field_12526, Field_12705);
                Class_12440.Method_12777("skyColor", Field_12552, Field_12627, Field_12663);
                Class_12440.Method_12811("worldTime", (int)(Field_12666 % (331382210L & 2121152L)));
                Class_12440.Method_12811("worldDay", (int)(Field_12666 / (84959172L & 7940344818287926761L)));
                Class_12440.Method_12811("moonPhase", Field_12504);
                Class_12440.Method_12811("frameCounter", Field_12443);
                Class_12440.Method_12747("frameTime", Field_12464);
                Class_12440.Method_12747("frameTimeCounter", Field_12477);
                Class_12440.Method_12747("sunAngle", Field_12699);
                Class_12440.Method_12747("shadowAngle", Field_12565);
                Class_12440.Method_12747("rainStrength", Field_12667);
                Class_12440.Method_12747("aspectRatio", (float)Field_12681 / (float)Field_12490);
                Class_12440.Method_12747("viewWidth", Field_12681);
                Class_12440.Method_12747("viewHeight", Field_12490);
                Class_12440.Method_12747("near", 0.13928571f * 0.35897437f);
                Class_12440.Method_12747("far", Class_12440.Field_12683.Field_84.Field_39801 * (-31150 & 10393));
                Class_12440.Method_12777("sunPosition", Field_12480[8643 & -31708], Field_12480[18473 & -27391], Field_12480[8202 & 5890]);
                Class_12440.Method_12777("moonPosition", Field_12623[-28587 & 130], Field_12623[6881 & -8191], Field_12623[-15522 & 3]);
                Class_12440.Method_12777("shadowLightPosition", Field_12448[-28414 & 28184], Field_12448[-21055 & 16411], Field_12448[17426 & -17873]);
                Class_12440.Method_12777("upPosition", Field_12616[-24576 & 648], Field_12616[-32603 & 4931], Field_12616[2 & -20318]);
                Class_12440.Method_12777("previousCameraPosition", (float)Field_12650, (float)Field_12466, (float)Field_12561);
                Class_12440.Method_12777("cameraPosition", (float)Field_12619, (float)Field_12615, (float)Field_12620);
                Class_12440.Method_12754("gbufferModelView", (2080 & 9363) != 0, Field_12529);
                Class_12440.Method_12754("gbufferModelViewInverse", (8832 & -15263) != 0, Field_12670);
                Class_12440.Method_12754("gbufferPreviousProjection", (2049 & 8752) != 0, Field_12483);
                Class_12440.Method_12754("gbufferProjection", (25604 & 259) != 0, Field_12629);
                Class_12440.Method_12754("gbufferProjectionInverse", (-11200 & 384) != 0, Field_12634);
                Class_12440.Method_12754("gbufferPreviousModelView", (-20863 & 4) != 0, Field_12575);
                if (Field_12680 > 0) {
                    Class_12440.Method_12754("shadowProjection", (20632 & -32187) != 0, Field_12631);
                    Class_12440.Method_12754("shadowProjectionInverse", (17410 & -30024) != 0, Field_12452);
                    Class_12440.Method_12754("shadowModelView", (16646 & 3112) != 0, Field_12648);
                    Class_12440.Method_12754("shadowModelViewInverse", (2314 & 20517) != 0, Field_12703);
                }
                Class_12440.Method_12747("wetness", Field_12691);
                Class_12440.Method_12747("eyeAltitude", Field_12515);
                Class_12440.Method_12751("eyeBrightness", Field_12550 & (588447743 & 201654271), Field_12550 >> (8212 & -25520));
                Class_12440.Method_12751("eyeBrightnessSmooth", Math.round(Field_12607), Math.round(Field_12588));
                Class_12440.Method_12751("terrainTextureSize", Field_12571[522 & -27519], Field_12571[2379 & 529]);
                Class_12440.Method_12811("terrainIconSize", Field_12677);
                Class_12440.Method_12811("isEyeInWater", Field_12675);
                Class_12440.Method_12747("nightVision", Field_12698);
                Class_12440.Method_12747("blindness", Field_12497);
                Class_12440.Method_12747("screenBrightness", Class_12440.Field_12683.Field_84.Field_39869);
                Class_12440.Method_12811("hideGUI", Class_12440.Field_12683.Field_84.Field_39731 ? 1795 & -32619 : 88 & 1796);
                Class_12440.Method_12747("centerDepthSmooth", Field_12553);
                Class_12440.Method_12751("atlasSize", Field_12630, Field_12541);
                if (Field_12495 != null) {
                    Field_12495.Method_23045(Field_12548[Field_12498]);
                    Field_12495.Method_23044();
                }
                Class_12440.Method_12757("useProgram ", Field_12614[n]);
            }
        }
    }

    public static void Method_12982() {
        if (Field_12673) {
            if (Field_12441) {
                // empty if block
            }
            Class_12440.Method_12981(Field_12697 ? 147 & -11261 : 18530 & -27902);
        }
    }

    public static void Method_12983(int n, float f, long l) {
        if (!Field_12441) {
            EXTFramebufferObject.glBindFramebufferEXT((int)(34266434 & -1942974527), (int)Field_12562);
            GL11.glViewport((int)(-15584 & 1112), (int)(24620 & 0), (int)Field_12681, (int)Field_12490);
            Field_12538 = null;
            Class_8049.Method_8074(Field_12535.Method_2064());
            Class_12440.Method_12981(-28526 & 10307);
            Class_12440.Method_12988("end beginRenderPass");
        }
    }

    public static void Method_12984(String string) {
        Field_12519 = string;
        Field_12662.setProperty(Class_11452.Field_11454.Method_11489(), string);
        Class_12440.Method_12986();
    }

    public static void Method_12985(int n, int n2) {
        Class_12440.Field_12661[(Class_12440.Field_12583 += 16401 & 4227) * (8706 & -15358)] = n & (1078001663 & -2010447873) | n2 << (10522 & 16912);
        Class_12440.Field_12661[Class_12440.Field_12583 * (74 & -23498) + (18979 & 1169)] = -22462 & 6017;
    }

    public static void Method_12986() {
        int n;
        String string;
        boolean bl = Field_12467;
        boolean bl2 = Class_12440.Method_12928();
        Field_12467 = 9310 & 4608;
        if (Field_12651 != null) {
            Field_12651.Method_19216();
            Field_12651 = null;
            Field_12625.clear();
            Field_12628.clear();
            Field_12671 = null;
            Field_12518 = null;
            Field_12689 = null;
            Field_12445 = null;
            Field_12496.\u0000strictfp();
            Field_12684.\u0000strictfp();
            Field_12597.\u0000strictfp();
            Field_12537.\u0000strictfp();
            Class_12440.Method_12721();
            Field_12534 = null;
        }
        int n2 = 4352 & 17929;
        if (Class_19426.Method_19538()) {
            Class_26062.Method_26067("Shaders can not be loaded, Antialiasing is enabled: " + Class_19426.Method_19481() + "x");
            n2 = -8569 & 65;
        }
        if (Class_19426.Method_19612()) {
            Class_26062.Method_26067("Shaders can not be loaded, Anisotropic Filtering is enabled: " + Class_19426.Method_19575() + "x");
            n2 = -7167 & 2817;
        }
        if (Class_19426.Method_19562()) {
            Class_26062.Method_26067("Shaders can not be loaded, Fast Render is enabled.");
            n2 = 13 & 4897;
        }
        if (!(string = Field_12662.getProperty(Class_11452.Field_11454.Method_11489(), Field_12576)).isEmpty() && !string.equals(Field_12514) && n2 == 0) {
            if (string.equals(Field_12576)) {
                Field_12651 = new Class_31233();
                Field_12467 = -16307 & 385;
            } else {
                try {
                    File file = new File(Field_12600, string);
                    if (!file.isDirectory() && file.isFile() && string.toLowerCase().endsWith(".zip")) {
                        Class_27509 class_27509 = new Class_27509(string, file);
                        if (Class_12440.Method_12941(file)) {
                            Field_12651 = class_27509;
                            Field_12467 = 4161 & 26403;
                        } else {
                            if (Class_18.Field_89.Field_105 != null) {
                                Class_18.Field_89.Field_105.Method_45458().Method_41188(new Class_2840("This shader is not allowed on BlazingPack"));
                            }
                            if (Class_18.Field_89.Field_36 instanceof Class_30498) {
                                boolean bl3 = "pl_PL".equals(Class_9802.Method_9806("language.code", new Object[6177 & -32244]));
                                if (bl3) {
                                    Class_19426.Method_19611("Ta paczka shader\u00f3w nie jest dozwolona.", "Zobacz dost\u0119pn\u0105 list\u0119 paczek na stronie blazingpack.pl");
                                } else {
                                    Class_19426.Method_19611("This shaderpack is not allowed.", "See the list on blazingpack.pl");
                                }
                            }
                        }
                    }
                }
                catch (Exception exception) {
                    // empty catch block
                }
            }
        }
        if (Field_12651 != null) {
            Class_26062.Method_26067("Loaded shaderpack: " + Class_12440.Method_12893());
        } else {
            Class_26062.Method_26067("No shaderpack loaded.");
            Field_12651 = new Class_24475();
        }
        Class_12440.Method_12813();
        Class_12440.Method_12948();
        Field_12671 = Class_12440.Method_12764();
        Class_12440.Method_12730();
        int n3 = Field_12467 != bl ? 307 & 26689 : 20796 & 129;
        int n4 = n = Class_12440.Method_12928() != bl2 ? 65 & -32619 : 8712 & -31737;
        if (n3 != 0 || n != 0) {
            Class_29585.Method_29606();
            Class_12440.Method_12882();
            if (Field_12683.Method_200() != null) {
                Field_12683.Method_235();
            }
        }
    }

    public static void Method_12987() {
        Class_12440.Method_12988("pre-render CompositeFinal");
        Class_12440.Method_12976(8213 & -31715, -19922 & 9, (16445 & 6721) != 0);
    }

    public static int Method_12988(String string) {
        int n;
        int n2 = GL11.glGetError();
        if (n2 != 0 && (n = -28672 & 17424) == 0) {
            if (n2 == (1286 & 3527)) {
                int n3 = EXTFramebufferObject.glCheckFramebufferStatusEXT((int)(116715328 & -1609982624));
                Object[] arrobject = new Object[16388 & 11381];
                arrobject[24593 & 1408] = n2;
                arrobject[-32747 & 17929] = GLU.gluErrorString((int)n2);
                arrobject[3090 & 4619] = n3;
                arrobject[8779 & 6407] = string;
                System.err.format("GL error 0x%04X: %s (Fb status 0x%04X) at %s\n", arrobject);
            } else {
                Object[] arrobject = new Object[3091 & 7];
                arrobject[-28160 & 26659] = n2;
                arrobject[18497 & -32509] = GLU.gluErrorString((int)n2);
                arrobject[17986 & 47] = string;
                System.err.format("GL error 0x%04X: %s at %s\n", arrobject);
            }
        }
        return n2;
    }

    private static String Method_12989(String string) {
        int n = 3809;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 78);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static void Method_12990() {
        int n;
        if (!Field_12516) {
            Field_12516 = 5777 & -16375;
            n = 17409 & 7139;
        } else {
            n = 8192 & 2185;
        }
        if (!Field_12601) {
            int n2;
            int n3;
            Object object;
            int n4;
            String string;
            Class_12440.Method_12988("Shaders.init pre");
            if (Class_12440.Method_12893() != null) {
                // empty if block
            }
            if (!Class_12440.Field_12546.OpenGL20) {
                Class_12440.Method_12807("No OpenGL 2.0");
            }
            if (!Class_12440.Field_12546.GL_EXT_framebuffer_object) {
                Class_12440.Method_12807("No EXT_framebuffer_object");
            }
            Field_12482.position(2656 & 4234).limit(1310 & -8184);
            Field_12704.position(6868 & -32768).limit(-22448 & 62);
            Field_12558.position(25418 & 132).limit(-24573 & 1355);
            Field_12577.position(6658 & 112).limit(-32738 & 24584);
            Field_12579.position(10240 & -31808).limit(-32126 & 1042);
            Field_12532.position(-24496 & 5252).limit(2584 & -4050);
            Field_12508 = -31337 & 2564;
            Field_12512 = 11427 & 65;
            Field_12542 = 9368 & 33;
            Field_12680 = 16768 & -24037;
            Field_12476 = 24609 & -32767;
            Field_12672 = 16645 & 7305;
            Arrays.fill(Field_12660, 7432 & 15148);
            Arrays.fill(Field_12572, (1025 & -30449) != 0);
            Arrays.fill(Field_12566, (-30184 & 8224) != 0);
            Arrays.fill(Field_12707, (9728 & 145) != 0);
            Arrays.fill(Field_12656, (-6909 & 4656) != 0);
            Arrays.fill(Field_12525, (-22440 & 4357) != 0);
            Arrays.fill(Field_12511, (-28544 & 578) != 0);
            Field_12605 = 852 & 16520;
            Field_12587 = -28592 & 2831;
            Field_12487 = 0.0f;
            Field_12594 = 2.0f;
            Field_12450 = -31741 & 7580;
            Field_12568 = -27643 & 17816;
            Field_12485 = 9730 & 17905;
            Field_12510 = -26944 & 1025;
            Field_12688 = 0.41666666f * 216.0f;
            Field_12539 = 0.02631579f * 6080.0f;
            Field_12658 = 2093 & 20563;
            Field_12618 = 0.5f * -2.0f;
            Field_12654 = -0.22727272f * 4.4f;
            Field_12692 = 10252 & -31293;
            Field_12695 = 16389 & 6728;
            Field_12665 = 2122 & 16388;
            Field_12668 = -32415 & 30356;
            Field_12473 = 65 & 12324;
            Field_12489 = -31423 & 8200;
            Class_12440.Method_12882();
            Class_8290.Method_8293();
            Class_27062.Method_27078();
            Class_7985 class_7985 = Class_13434.Method_13435(Field_12689, Field_12671, (385 & -32734) != 0);
            String string2 = "";
            if (Field_12590 != null && Field_12628.contains(n4 = Class_12440.Field_12590.Field_284.Method_18379())) {
                string2 = "world" + n4 + "/";
            }
            if (Field_12549) {
                Class_12440.Method_12848(new File(Field_12600, "debug"));
            }
            for (n4 = -23547 & 256; n4 < (956 & 2094); ++n4) {
                String string3 = Field_12614[n4];
                if (string3.equals("")) {
                    Class_12440.Field_12548[n4] = Class_12440.Field_12674[n4] = -30570 & 32;
                    Class_12440.Field_12604[n4] = null;
                    Class_12440.Field_12655[n4] = null;
                    Class_12440.Field_12584[n4] = 5764 & 16673;
                    continue;
                }
                Field_12471 = null;
                Field_12459 = null;
                Field_12593 = -27112 & 8192;
                string = string2 + string3;
                if (class_7985 != null && class_7985.Method_7990(string)) {
                    Class_26062.Method_26067("Program disabled: " + string);
                    string3 = "<disabled>";
                    string = string2 + string3;
                }
                if ((n2 = Class_12440.Method_12841(n4, (String)(object = "/shaders/" + string) + ".vsh", (String)object + ".fsh")) > 0) {
                    Class_26062.Method_26067("Program loaded: " + string);
                }
                Class_12440.Field_12548[n4] = Class_12440.Field_12674[n4] = n2;
                Class_12440.Field_12604[n4] = n2 != 0 ? Field_12471 : null;
                Class_12440.Field_12655[n4] = n2 != 0 ? Field_12459 : null;
                Class_12440.Field_12584[n4] = n2 != 0 ? Field_12593 : 4224 & -31742;
            }
            n4 = GL11.glGetInteger((int)(-1879012825 & 48270436));
            new HashMap();
            for (n3 = 161 & -30442; n3 < (383 & 2092); ++n3) {
                Arrays.fill(Field_12702[n3], (-28670 & 3584) != 0);
                if (n3 == (6431 & 16413)) {
                    Class_12440.Field_12569[n3] = null;
                    continue;
                }
                if (Field_12548[n3] == 0) {
                    if (n3 == (8478 & 31)) {
                        Class_12440.Field_12569[n3] = Field_12659;
                        continue;
                    }
                    Class_12440.Field_12569[n3] = Field_12690;
                    continue;
                }
                string = Field_12604[n3];
                if (string != null) {
                    object = Field_12693[n3];
                    n2 = string.length();
                    if (n2 > Field_12672) {
                        Field_12672 = n2;
                    }
                    if (n2 > n4) {
                        n2 = n4;
                    }
                    Class_12440.Field_12569[n3] = object;
                    ((IntBuffer)object).limit(n2);
                    for (int i = 1024 & 10432; i < n2; ++i) {
                        int n5 = 9217 & -32252;
                        if (string.length() > i) {
                            int n6 = string.charAt(i) - (16953 & -27338);
                            if (n3 != (31 & 12382)) {
                                if (n6 >= 0 && n6 <= (71 & -28281)) {
                                    Class_12440.Field_12702[n3][n6] = -15343 & 9099;
                                    n5 = n6 + (1078234861 & -1467970336);
                                    if (n6 > Field_12476) {
                                        Field_12476 = n6;
                                    }
                                    if (n6 > Field_12508) {
                                        Field_12508 = n6;
                                    }
                                }
                            } else if (n6 >= 0 && n6 <= (23 & 1473)) {
                                n5 = n6 + (83922144 & 1218707168);
                                if (n6 > Field_12542) {
                                    Field_12542 = n6;
                                }
                            }
                        }
                        ((IntBuffer)object).put(i, n5);
                    }
                    continue;
                }
                if (n3 != (223 & -30690) && n3 != (319 & 2079) && n3 != (34 & -20512)) {
                    Class_12440.Field_12569[n3] = Field_12482;
                    Field_12672 = Field_12508;
                    Arrays.fill(Field_12702[n3], -28587 & 16640, Field_12508, (6531 & 26213) != 0);
                    continue;
                }
                Class_12440.Field_12569[n3] = Field_12577;
            }
            Field_12635 = 3408 & -28127;
            for (n3 = -32718 & 16588; n3 < (6158 & -23223); ++n3) {
                if (Field_12548[(-2909 & 557) + n3] == 0) continue;
                Field_12635 = 13 & 4163;
                break;
            }
            Field_12476 = Field_12508;
            Field_12599 = Field_12680 > 0 ? 13419 & 129 : -32498 & 3072;
            Field_12530 = Field_12680 > 0 ? 1061 & -30719 : 564 & 15368;
            Class_26062.Method_26067("usedColorBuffers: " + Field_12508);
            Class_26062.Method_26067("usedDepthBuffers: " + Field_12512);
            Class_26062.Method_26067("usedShadowColorBuffers: " + Field_12542);
            Class_26062.Method_26067("usedShadowDepthBuffers: " + Field_12680);
            Class_26062.Method_26067("usedColorAttachs: " + Field_12476);
            Class_26062.Method_26067("usedDrawBuffers: " + Field_12672);
            Field_12482.position(2225 & 1036).limit(Field_12672);
            Field_12704.position(2531 & 16900).limit(Field_12508 * (3 & 17666));
            for (n3 = -29695 & 138; n3 < Field_12672; ++n3) {
                Field_12482.put(n3, (36064 & 340368866) + n3);
            }
            if (Field_12672 > n4) {
                Class_12440.Method_12807("[Shaders] Error: Not enough draw buffers, needed: " + Field_12672 + ", available: " + n4);
            }
            Field_12577.position(-19959 & 19712).limit(Field_12542);
            for (n3 = 6336 & 40; n3 < Field_12542; ++n3) {
                Field_12577.put(n3, (841649394 & 16838121) + n3);
            }
            for (n3 = 12418 & 1; n3 < (9967 & -14292); ++n3) {
                int n7 = n3;
                while (Field_12548[n7] == 0 && Field_12559[n7] != n7) {
                    n7 = Field_12559[n7];
                }
                if (n7 == n3 || n3 == (-16290 & 5150)) continue;
                Class_12440.Field_12548[n3] = Field_12548[n7];
                Class_12440.Field_12604[n3] = Field_12604[n7];
                Class_12440.Field_12569[n3] = Field_12569[n7];
            }
            Class_12440.Method_12746();
            Class_12440.Method_12856();
            if (Field_12587) {
                Class_12440.Method_12835();
            }
            if (Field_12535 == null) {
                Field_12535 = Class_8049.Method_8072();
            }
            Class_16867.Method_16961();
            Class_16867.Method_16940(-38.91892f * 2.3125f, 0.0f, 1.0f, 0.0f);
            Class_12440.Method_12949();
            Class_12440.Method_12946();
            Class_16867.Method_16945();
            Field_12601 = -27639 & 2947;
            Class_12440.Method_12863();
            Class_12440.Method_12895();
            if (n == 0) {
                // empty if block
            }
            Class_12440.Method_12988("Shaders.init");
        }
    }

    private static String Method_12991(String string) {
        int n = 31122;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 51);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12992(String string) {
        int n = 433;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 50);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static InputStream Method_12993(String string) {
        return Field_12651 == null ? null : Field_12651.Method_19218(string);
    }

    private static String Method_12994(String string) {
        int n = 9594;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 37);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_12995(String string, Class_18480[] arrclass_18480) {
        if (arrclass_18480 != null && arrclass_18480.length > 0) {
            for (int i = -24572 & 352; i < arrclass_18480.length; ++i) {
                Class_18480 class_18480 = arrclass_18480[i];
                String string2 = class_18480.Method_18504();
                if (!class_18480.Method_18502(string)) continue;
                string = class_18480.Method_18491();
                break;
            }
            return string;
        }
        return string;
    }

    private static String Method_12996(String string) {
        int n = 20411;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_12440.class, 116);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static void Method_12997() {
        Class_12440.Field_12661[Class_12440.Field_12583 * (-24565 & 6530)] = 1153 & -12176;
        Class_12440.Field_12661[Class_12440.Field_12583 * (-30698 & 8707) + (5 & -20087)] = -23380 & 1;
        Field_12583 -= -30719 & 195;
    }

    public static boolean Method_12998() {
        return (Field_12495 != null ? 7937 & 17 : -31488 & 16580) != 0;
    }

    public static void Method_12999(Class_18 class_18, float f, long l) {
        int n;
        block25 : {
            Class_12440.Method_12988("pre beginRender");
            Class_12440.Method_12794(Class_12440.Field_12683.Field_72);
            Field_12683 = class_18;
            Class_12440.Field_12683.Field_25.Method_2789("init");
            Field_12592 = Class_12440.Field_12683.Field_58;
            if (!Field_12601) {
                try {
                    Class_12440.Method_12990();
                }
                catch (IllegalStateException illegalStateException) {
                    if (!Class_19426.Method_19539(illegalStateException.getMessage()).equals("Function is not supported")) break block25;
                    Class_12440.Method_12807("[Shaders] Error: " + illegalStateException.getMessage());
                    illegalStateException.printStackTrace();
                    Class_12440.Method_12984(Field_12514);
                    return;
                }
            }
        }
        if (Class_12440.Field_12683.Field_80 != Field_12499 || Class_12440.Field_12683.Field_44 != Field_12700) {
            Class_12440.Method_12746();
        }
        if (Field_12536) {
            Class_12440.Method_12856();
        }
        if ((Field_12468 = ((Field_12666 = Class_12440.Field_12683.Field_72.\u0000= final()) - Field_12686) % (8420098683839995346L & -8420098684006400063L)) < (-1107948384506846976L & 558370947L)) {
            Field_12468 += 1342397892L & -4619932797960396832L;
        }
        Field_12686 = Field_12666;
        Field_12504 = Class_12440.Field_12683.Field_72.\u0000= final();
        if ((Field_12443 += 24641 & 785) >= (2034958161 & 36372312)) {
            Field_12443 = 24733 & 2050;
        }
        Field_12507 = System.currentTimeMillis();
        if (Field_12533 == (-6946283404724333910L & 6946283404212060432L)) {
            Field_12533 = Field_12507;
        }
        Field_12657 = Field_12507 - Field_12533;
        Field_12533 = Field_12507;
        Field_12464 = (float)Field_12657 / (1250.0f * 0.8f);
        Field_12477 += Field_12464;
        Field_12477 %= 1.7333333f * 2076.923f;
        Field_12667 = class_18.Field_72.\u0000, for(f);
        float f2 = (float)Field_12657 * (0.0058241757f * 1.7169812f);
        float f3 = (float)Math.exp(Math.log(0.13043478260869565 * 3.8333333333333335) * (double)f2 / (double)(Field_12691 < Field_12667 ? Field_12540 : Field_12513));
        Field_12691 = Field_12691 * f3 + Field_12667 * (1.0f - f3);
        Class_1061 class_1061 = Field_12683.Method_246();
        if (class_1061 != null) {
            Field_12682 = class_1061 instanceof Class_859 && ((Class_859)class_1061).Method_1017() ? 16897 & 9421 : 17424 & 72;
            Field_12515 = (float)class_1061.Method_1324() * f + (float)class_1061.Field_1102 * (1.0f - f);
            Field_12550 = class_1061.Method_1272(f);
            f3 = (float)Field_12657 * (0.92727274f * 0.010784313f);
            float f4 = (float)Math.exp(Math.log(0.8795180722891566 * 0.5684931506849316) * (double)f3 / (double)Field_12478);
            Field_12607 = Field_12607 * f4 + (float)(Field_12550 & (154992639 & -1027407873)) * (1.0f - f4);
            Field_12588 = Field_12588 * f4 + (float)(Field_12550 >> (21586 & 8337)) * (1.0f - f4);
            Field_12675 = 12512 & -13312;
            if (Class_12440.Field_12683.Field_84.Field_39802 == 0 && !Field_12682) {
                if (class_1061.Method_1336(Class_3713.Field_3734)) {
                    Field_12675 = 6281 & 10081;
                } else if (class_1061.Method_1336(Class_3713.Field_3750)) {
                    Field_12675 = -10110 & 110;
                }
            }
            if (Class_12440.Field_12683.Field_48 != null) {
                Field_12698 = 0.0f;
                if (Class_12440.Field_12683.Field_48.\u0000strictfp(Class_8338.Field_8356)) {
                    Field_12698 = Class_19426.Method_19519().Field_58.Method_22981(Class_12440.Field_12683.Field_48, f);
                }
                Field_12497 = 0.0f;
                if (Class_12440.Field_12683.Field_48.\u0000strictfp(Class_8338.Field_8346)) {
                    int n2 = Class_12440.Field_12683.Field_48.\u0000strictfp(Class_8338.Field_8346).Method_25251();
                    Field_12497 = Class_19426.Method_19565((float)n2 / (1.7333333f * 11.538462f), 0.0f, 1.0f);
                }
            }
            Vec3 vec3 = Class_12440.Field_12683.Field_72.\u0000strictfp(class_1061, f);
            vec3 = Class_10433.Method_10490(vec3, Field_12590, class_1061, f);
            Field_12552 = (float)vec3.\u0000= final;
            Field_12627 = (float)vec3.\u0000strictfp;
            Field_12663 = (float)vec3.\u0000, `;
        }
        Field_12673 = 8641 & 20481;
        Field_12626 = -16018 & 1664;
        Field_12642 = 257 & -24558;
        if (Field_12680 >= (4877 & 9281)) {
            Class_16867.Method_16960(554738885 & -1872591642);
            Class_16867.Method_16963(Field_12579.get(7233 & 16776));
            if (Field_12680 >= (370 & 4102)) {
                Class_16867.Method_16960(281580757 & 136423143);
                Class_16867.Method_16963(Field_12579.get(833 & 21));
            }
        }
        Class_16867.Method_16960(1148118 & 1076549065);
        for (n = -32640 & 17688; n < Field_12508; ++n) {
            Class_16867.Method_16963(Field_12624[n]);
            GL11.glTexParameteri((int)(4069 & -25119), (int)(10244 & 10896), (int)(9731 & -16591));
            GL11.glTexParameteri((int)(3557 & 15859), (int)(30741 & 10627), (int)(9797 & 32649));
            Class_16867.Method_16963(Field_12624[(1214 & 4105) + n]);
            GL11.glTexParameteri((int)(3555 & 8181), (int)(-6144 & 11792), (int)(-18907 & 11801));
            GL11.glTexParameteri((int)(20465 & -29209), (int)(14625 & -22453), (int)(-23015 & 15905));
        }
        Class_16867.Method_16963(4226 & -32256);
        for (n = 16898 & 8433; n < (7 & 8620) && (5708 & -22267) + n < Field_12508; ++n) {
            Class_16867.Method_16960((413107399 & -2111781657) + n);
            Class_16867.Method_16963(Field_12704.get((869 & 1156) + n));
        }
        Class_16867.Method_16960(553684166 & 1178384334);
        Class_16867.Method_16963(Field_12558.get(19463 & -32256));
        if (Field_12512 >= (2 & 8514)) {
            Class_16867.Method_16960(-2058172721 & 302359787);
            Class_16867.Method_16963(Field_12558.get(20613 & 529));
            if (Field_12512 >= (-28669 & 8455)) {
                Class_16867.Method_16960(-50277156 & 8947404);
                Class_16867.Method_16963(Field_12558.get(12559 & -15870));
            }
        }
        for (n = 17226 & -30591; n < Field_12542; ++n) {
            Class_16867.Method_16960((178554317 & -2076064019) + n);
            Class_16867.Method_16963(Field_12532.get(n));
        }
        if (Field_12587) {
            Class_16867.Method_16960((177249489 & 16884960) + Field_12503.Method_26184());
            Class_16867.Method_16963(Field_12503.Method_26183());
        }
        Class_12440.Method_12925(Field_12612);
        Class_16867.Method_16960(134464708 & 38051568);
        Field_12650 = Field_12619;
        Field_12466 = Field_12615;
        Field_12561 = Field_12620;
        Field_12483.position(-26432 & 2);
        Field_12629.position(9222 & 96);
        Field_12483.put(Field_12629);
        Field_12483.position(-22720 & 6146);
        Field_12629.position(-23869 & 4136);
        Field_12575.position(2114 & 524);
        Field_12529.position(35 & -28136);
        Field_12575.put(Field_12529);
        Field_12575.position(768 & -32633);
        Field_12529.position(-28016 & 2124);
        Class_12440.Method_12988("beginRender");
        Class_25377.Method_25379(Field_12592, 11392 & -32480, f, l);
        Class_12440.Field_12683.Field_25.Method_2790();
        EXTFramebufferObject.glBindFramebufferEXT((int)(1111551812 & 337681867), (int)Field_12562);
        for (n = -15103 & 8774; n < Field_12508; ++n) {
            Class_12440.Field_12500[n] = -31981 & 24576;
            EXTFramebufferObject.glFramebufferTexture2DEXT((int)(12750677 & -1728000576), (int)((34115041 & -1866363164) + n), (int)(32229 & 4083), (int)Field_12624[n], (int)(513 & 160));
        }
        Class_12440.Method_12988("end beginRender");
    }
}

