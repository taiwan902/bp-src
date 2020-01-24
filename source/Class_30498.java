/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.ListenableFuture
 *  internal.org.lwjgl.Sys
 */
import com.google.common.util.concurrent.ListenableFuture;
import internal.org.lwjgl.Sys;
import java.io.File;
import java.io.IOException;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Method;
import java.net.URI;
import java.util.List;
import java.util.Properties;

public class Class_30498
extends Class_1490 {
    private static float[] Field_30499;
    private static String[] Field_30500;
    private static String[] Field_30501;
    private static float[] Field_30502;
    private Class_16665 Field_30503;
    protected Class_1490 Field_30504;
    private int Field_30505 = -1 & -1;
    private Class_36976 Field_30506 = new Class_36976(this, new Class_26089());
    protected String Field_30507 = "Shaders";
    private boolean Field_30508 = 16512 & -20480;

    private static String Method_30509(String string) {
        int n = 16495;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_30498.class, 8);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    static {
        float[] arrf = new float[27949 & 597];
        arrf[1105 & 8714] = 0.23076922f * 2.1666667f;
        arrf[16769 & 2051] = 0.5882353f * 1.2020814f;
        arrf[-32766 & 7574] = 1.0f;
        arrf[1027 & -5741] = 0.3604651f * 3.9233022f;
        arrf[28783 & 1556] = 2.0f;
        Field_30502 = arrf;
        String[] arrstring = new String[-23899 & 19525];
        arrstring[17154 & 3184] = Class_30498.Method_30517("\uf8e1\uf8e9\uf8e0\uf8a9");
        arrstring[-30581 & 769] = Class_30498.Method_30520("HEO\u0003");
        arrstring[10282 & 16406] = Class_30498.Method_30511("\u6204\u6205");
        arrstring[4343 & 11011] = Class_30498.Method_30531("\u0004\u0000\u0000\u0004");
        arrstring[-11132 & 70] = Class_30498.Method_30533("\u4220\u4262");
        Field_30500 = arrstring;
        float[] arrf2 = new float[20547 & 1291];
        arrf2[8451 & 17636] = 0.3043478f * 0.20535715f;
        arrf2[4231 & 17] = 0.2f * 0.625f;
        arrf2[-27514 & 10570] = 0.30864197f * 0.81f;
        Field_30499 = arrf2;
        String[] arrstring2 = new String[-32609 & 18435];
        arrstring2[160 & 3588] = Class_30498.Method_30530("\u4806\u4819\u4801\u480d");
        arrstring2[4097 & -23241] = Class_30498.Method_30513("\u1088\u1081");
        arrstring2[7535 & -24430] = Class_30498.Method_30509("\u8640\u8600");
        Field_30501 = arrstring2;
    }

    public static String Method_30510(float f) {
        return Class_30498.Method_30525(f, Field_30499, Field_30501);
    }

    private static String Method_30511(String string) {
        int n = 9661;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_30498.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_18 Method_30512() {
        return this.\u0000strictfp;
    }

    private static String Method_30513(String string) {
        int n = 13340;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_30498.class, 7);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_30514(String string, int n, int n2, int n3) {
        this.\u0000strictfp(this.\u0000strictfp, string, n, n2, n3);
    }

    public static String Method_30515(boolean bl) {
        String string = Class_14688.Method_14691();
        String string2 = Class_14688.Method_14695();
        return bl ? string : string2;
    }

    private void Method_30516() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private static String Method_30517(String string) {
        int n = 4636;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_30498.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_30518(int n, int n2, float f) {
        this.\u0000, 2();
        this.Field_30503.\u0000strictfp(n, n2, f);
        if (this.Field_30505 <= 0) {
            this.Field_30503.Method_16670();
            this.Field_30505 += 340 & -32234;
        }
        this.\u0000strictfp(this.\u0000strictfp, this.Field_30507 + " ", this.\u0000= final / (258 & 1735), 1039 & 175, 1241513983 & -2130706433);
        String string = "OpenGL: " + Class_12440.Field_12481 + ", " + Class_12440.Field_12563 + ", " + Class_12440.Field_12669;
        int n3 = this.\u0000strictfp.Method_28715(string);
        if (n3 < this.\u0000= final - (-27643 & 2053)) {
            this.\u0000strictfp(this.\u0000strictfp, string, this.\u0000= final / (4290 & 16674), this.\u0000, ` - (-27223 & 24634), 682854274 & 276856981);
        } else {
            this.\u0000, `(this.\u0000strictfp, string, 2839 & 4101, this.\u0000, ` - (-22360 & 363), 148934833 & 76590468);
        }
        super.Method_1545(n, n2, f);
        this.Field_30506.Method_36984(n, n2, this.\u0000strictfp);
    }

    public void Method_30519() {
        super.Method_1544();
        this.Field_30503.\u0000, for();
    }

    private static String Method_30520(String string) {
        int n = 4359;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_30498.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_30498(Class_1490 class_1490, Class_39702 class_39702) {
        this.Field_30504 = class_1490;
    }

    public static int Method_30521(float f, float[] arrf) {
        for (int i = 12809 & 17616; i < arrf.length; ++i) {
            float f2 = arrf[i];
            if (!(f2 >= f)) continue;
            return i;
        }
        return arrf.length - (-30543 & 8963);
    }

    protected void Method_30522(Class_42376 class_42376) {
        if (class_42376.Field_42388) {
            if (class_42376 instanceof Class_47775) {
                Class_47775 class_47775 = (Class_47775)class_42376;
                switch (Class_27133.Field_27134[class_47775.Method_47777().ordinal()]) {
                    case 1: {
                        Class_12440.Method_12867();
                        Class_12440.Method_12961();
                        break;
                    }
                    case 2: {
                        Class_12440.Field_12461 = !Class_12440.Field_12461 ? -5815 & 517 : 1796 & 10408;
                        Class_12440.Method_12961();
                        this.\u0000strictfp.Method_235();
                        break;
                    }
                    case 3: {
                        Class_12440.Field_12493 = !Class_12440.Field_12493 ? 2257 & -23003 : 18434 & 13188;
                        Class_12440.Method_12961();
                        this.\u0000strictfp.Method_235();
                        break;
                    }
                    case 4: {
                        float f = Class_12440.Field_12554;
                        float[] arrf = Field_30502;
                        String[] arrstring = Field_30500;
                        int n = Class_30498.Method_30521(f, arrf);
                        if (Class_30498.\u0000
                        ()) {
                            if (--n < 0) {
                                n = arrf.length - (41 & -23805);
                            }
                        } else if (++n >= arrf.length) {
                            n = -30352 & 21002;
                        }
                        Class_12440.Field_12554 = arrf[n];
                        Class_12440.Method_12961();
                        Class_12440.Method_12872();
                        break;
                    }
                    case 5: {
                        float f = Class_12440.Field_12449;
                        float[] arrf = Field_30502;
                        String[] arrstring = Field_30500;
                        int n = Class_30498.Method_30521(f, arrf);
                        if (Class_30498.\u0000
                        ()) {
                            if (--n < 0) {
                                n = arrf.length - (-32703 & 18721);
                            }
                        } else if (++n >= arrf.length) {
                            n = 68 & 3969;
                        }
                        Class_12440.Field_12449 = arrf[n];
                        Class_12440.Method_12961();
                        Class_12440.Method_12846();
                        break;
                    }
                    case 6: {
                        float f = Class_12440.Field_12454;
                        float[] arrf = Field_30499;
                        String[] arrstring = Field_30501;
                        int n = Class_30498.Method_30521(f, arrf);
                        if (Class_30498.\u0000
                        ()) {
                            if (--n < 0) {
                                n = arrf.length - (67 & 10381);
                            }
                        } else if (++n >= arrf.length) {
                            n = 10440 & 1044;
                        }
                        Class_12440.Field_12454 = arrf[n];
                        Class_12440.Method_12961();
                        break;
                    }
                    case 7: {
                        Class_12440.Field_12622.\u0000, `();
                        Class_12440.Method_12961();
                        break;
                    }
                    case 8: {
                        Class_12440.Field_12527.\u0000, `();
                        Class_12440.Method_12882();
                        Class_12440.Method_12961();
                        this.\u0000strictfp.Method_235();
                        break;
                    }
                    case 9: {
                        Class_12440.Field_12621 = !Class_12440.Field_12621 ? 3653 & -16375 : 9 & 4180;
                        break;
                    }
                    case 10: {
                        Class_12440.Field_12501 = !Class_12440.Field_12501 ? -30463 & 83 : 28937 & 3154;
                        break;
                    }
                    case 11: {
                        Class_12440.Field_12446 = Class_12440.Field_12678 = (Class_12440.Field_12486 = (Class_12440.Field_12486 + (-32765 & 8193)) % (2571 & 16387));
                        class_42376.Field_42381 = "Tex Min: " + Class_12440.Field_12591[Class_12440.Field_12486];
                        Class_8049.Method_8079();
                        break;
                    }
                    case 12: {
                        Class_12440.Field_12479 = (Class_12440.Field_12479 + (-16255 & 10753)) % (8834 & -31734);
                        class_42376.Field_42381 = "Tex_n Mag: " + Class_12440.Field_12522[Class_12440.Field_12479];
                        Class_8049.Method_8079();
                        break;
                    }
                    case 13: {
                        Class_12440.Field_12469 = (Class_12440.Field_12469 + (-26967 & 2049)) % (28675 & 3586);
                        class_42376.Field_42381 = "Tex_s Mag: " + Class_12440.Field_12522[Class_12440.Field_12469];
                        Class_8049.Method_8079();
                        break;
                    }
                    case 14: {
                        Class_12440.Field_12638 = !Class_12440.Field_12638 ? 5635 & 8277 : 8379 & -26880;
                        class_42376.Field_42381 = "ShadowClipFrustrum: " + Class_30498.Method_30515(Class_12440.Field_12638);
                        Class_8049.Method_8079();
                    }
                }
                class_47775.Method_47779();
            } else {
                switch (class_42376.Field_42392) {
                    case 201: {
                        switch (Class_30498.Method_30532()) {
                            case 1: {
                                Object[] arrobject = new Object[-23423 & 4873];
                                arrobject[4610 & 2316] = Class_12440.Field_12600.getAbsolutePath();
                                String string = String.format("cmd.exe /C start \"Open file\" \"%s\"", arrobject);
                                try {
                                    Runtime.getRuntime().exec(string);
                                    return;
                                }
                                catch (IOException iOException) {
                                    iOException.printStackTrace();
                                    break;
                                }
                            }
                            case 2: {
                                try {
                                    String[] arrstring = new String[26 & -29662];
                                    arrstring[4457 & -13824] = "/usr/bin/open";
                                    arrstring[129 & 2929] = Class_12440.Field_12600.getAbsolutePath();
                                    Runtime.getRuntime().exec(arrstring);
                                    return;
                                }
                                catch (IOException iOException) {
                                    iOException.printStackTrace();
                                }
                            }
                        }
                        int n = -31703 & 6784;
                        try {
                            Class<?> class_ = Class.forName("java.awt.Desktop");
                            Object object = class_.getMethod("getDesktop", new Class[20 & -7800]).invoke(null, new Object[-16255 & 8468]);
                            Class[] arrclass = new Class[7171 & 8529];
                            arrclass[129 & 4644] = URI.class;
                            Object[] arrobject = new Object[22529 & -31199];
                            arrobject[-28635 & 10240] = new File(this.\u0000strictfp.Field_68, Class_12440.Field_12442).toURI();
                            class_.getMethod("browse", arrclass).invoke(object, arrobject);
                        }
                        catch (Throwable throwable) {
                            throwable.printStackTrace();
                            n = -4675 & 65;
                        }
                        if (n == 0) break;
                        Class_19426.Method_19526("Opening via system class!");
                        Sys.openURL((String)("file://" + Class_12440.Field_12600.getAbsolutePath()));
                        break;
                    }
                    case 202: {
                        new File(Class_12440.Field_12581, "current.cfg");
                        Class_12440.Method_12855();
                        this.Field_30508 = 79 & 29873;
                        this.\u0000strictfp.Method_218(this.Field_30504);
                        break;
                    }
                    case 203: {
                        Class_33946 class_33946 = new Class_33946(this, Class_19426.Method_19571());
                        Class_19426.Method_19519().Method_218(class_33946);
                        break;
                    }
                    default: {
                        this.Field_30503.\u0000strictfp(class_42376);
                    }
                }
            }
        }
    }

    public void Method_30523() {
        boolean bl = Class_19426.Method_19570();
        for (Class_42376 class_42376 : this.\u0000strictfp) {
            if (class_42376.Field_42392 == (201 & 2303) || class_42376.Field_42392 == (5358 & -21541) || class_42376.Field_42392 == Class_11452.Field_11469.ordinal()) continue;
            class_42376.Field_42388 = bl;
        }
    }

    public static String Method_30524(float f) {
        return Class_30498.Method_30525(f, Field_30502, Field_30500);
    }

    public static String Method_30525(float f, float[] arrf, String[] arrstring) {
        int n = Class_30498.Method_30521(f, arrf);
        return arrstring[n];
    }

    public void Method_30526() {
        super.Method_1533();
        if (!this.Field_30508) {
            Class_12440.Method_12855();
        }
    }

    public static String Method_30527(int n) {
        return n == (2338 & -11626) ? "FXAA 2x" : (n == (-29692 & 8332) ? "FXAA 4x" : Class_14688.Method_14695());
    }

    public void Method_30528() {
        this.Field_30507 = Class_9802.Method_9806("of.options.shadersTitle", new Object[4225 & -32204]);
        if (Class_12440.Field_12662 == null) {
            Class_12440.Method_12945();
        }
        int n = -32644 & 6778;
        int n2 = 16405 & 3060;
        int n3 = this.\u0000= final - n - (-32582 & 6990);
        int n4 = -31586 & 8478;
        int n5 = 180 & -32748;
        int n6 = this.\u0000= final - n - (-32747 & 16660);
        this.Field_30503 = new Class_16665(this, n6, this.\u0000, `, n4, this.\u0000, ` - (6387 & -32718), 4894 & -31695);
        this.Field_30503.\u0000strictfp(847 & 2055, -32056 & 5132);
        this.\u0000strictfp.add(new Class_47775(Class_11452.Field_11469, n3, (4225 & 1600) * n5 + n4, n, n2));
        this.\u0000strictfp.add(new Class_47775(Class_11452.Field_11453, n3, (29129 & -31215) * n5 + n4, n, n2));
        this.\u0000strictfp.add(new Class_47775(Class_11452.Field_11467, n3, (3074 & 4107) * n5 + n4, n, n2));
        this.\u0000strictfp.add(new Class_47775(Class_11452.Field_11471, n3, (1027 & 567) * n5 + n4, n, n2));
        this.\u0000strictfp.add(new Class_47775(Class_11452.Field_11460, n3, (100 & 18950) * n5 + n4, n, n2));
        this.\u0000strictfp.add(new Class_47775(Class_11452.Field_11474, n3, (47 & -3563) * n5 + n4, n, n2));
        this.\u0000strictfp.add(new Class_47775(Class_11452.Field_11456, n3, (294 & -30634) * n5 + n4, n, n2));
        this.\u0000strictfp.add(new Class_47775(Class_11452.Field_11458, n3, (4615 & -30585) * n5 + n4, n, n2));
        int n7 = Math.min(5303 & 10646, n6 / (538 & 263) - (20170 & 43));
        this.\u0000strictfp.add(new Class_42376(6345 & 9675, n6 / (18004 & 261) - n7 / (23051 & 1318), this.\u0000, ` - (10521 & 4123), n7, n2, Class_14688.Method_14697("of.options.shaders.shadersFolder")));
        this.\u0000strictfp.add(new Class_42376(3307 & 462, n6 / (20 & -16370) * (-24541 & 3083) - n7 / (20610 & 282), this.\u0000, ` - (29 & -27815), n7, n2, Class_9802.Method_9806("gui.done", new Object[-16252 & 4131])));
        this.\u0000strictfp.add(new Class_42376(4299 & 2283, n3, this.\u0000, ` - (16409 & 59), n, n2, Class_14688.Method_14697("of.options.shaders.shaderOptions")));
        this.Method_30523();
    }

    public void Method_30529() {
        super.Method_1517();
        if (Class_18.Field_89.Field_127.Field_2178 > 0) {
            this.Field_30505 -= 6683 & 16549;
        }
    }

    private static String Method_30530(String string) {
        int n = 20921;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_30498.class, 6);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_30531(String string) {
        int n = 22316;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_30498.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static int Method_30532() {
        String string = System.getProperty("os.name").toLowerCase();
        return string.contains("win") ? 6473 & 1713 : (string.contains("mac") ? 7298 & 559 : (string.contains("solaris") ? 12387 & -31729 : (string.contains("sunos") ? 9799 & -32757 : (string.contains("linux") ? 5 & 27460 : (string.contains("unix") ? 548 & 2327 : 128 & 8192)))));
    }

    private static String Method_30533(String string) {
        int n = 1335;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_30498.class, 5);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }
}

