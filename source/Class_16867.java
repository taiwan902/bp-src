/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  internal.org.lwjgl.BufferChecks
 *  internal.org.lwjgl.opengl.ContextCapabilities
 *  internal.org.lwjgl.opengl.GL11
 *  internal.org.lwjgl.opengl.GLContext
 */
import internal.org.lwjgl.BufferChecks;
import internal.org.lwjgl.opengl.ContextCapabilities;
import internal.org.lwjgl.opengl.GL11;
import internal.org.lwjgl.opengl.GLContext;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

public class Class_16867 {
    public static long Field_16868;
    public static long Field_16869;
    private static int Field_16870;
    public static long Field_16871;
    private static Class_13049 Field_16872;
    public static long Field_16873;
    public static long Field_16874;
    public static long Field_16875;
    private static Class_26748 Field_16876;
    private static Class_20505 Field_16877;
    static ContextCapabilities Field_16878;
    public static long Field_16879;
    public static long Field_16880;
    private static Class_28771 Field_16881;
    public static long Field_16882;
    private static Class_8128[] Field_16883;
    private static Class_23671 Field_16884;
    public static long Field_16885;
    public static long Field_16886;
    private static Class_23033 Field_16887;
    private static Class_30494[] Field_16888;
    private static Class_8128 Field_16889;
    private static Class_11879 Field_16890;
    private static Class_14177 Field_16891;
    public static long Field_16892;
    public static long Field_16893;
    private static Class_9718 Field_16894;
    public static long Field_16895;
    private static Class_13989 Field_16896;
    public static boolean Field_16897;
    public static long Field_16898;
    private static Class_8128 Field_16899;
    private static Class_8128 Field_16900;
    private static Class_12246 Field_16901;
    public static long Field_16902;
    private static int Field_16903;
    public static long Field_16904;
    private static Class_14255 Field_16905;
    public static long Field_16906;
    private static Class_18294 Field_16907;

    public static void Method_16908(int n) {
        if (n != Class_16867.Field_16881.Field_28772) {
            Class_16867.Field_16881.Field_28772 = n;
            GL11.glCullFace((int)n);
        }
    }

    public static void Method_16909() {
        Field_16899.Method_8133();
    }

    public static void Method_16910(int n, int n2, int n3, int n4) {
        GL11.glViewport((int)n, (int)n2, (int)n3, (int)n4);
    }

    public static void Method_16911(double d, double d2, double d3, double d4, double d5, double d6) {
        GL11.glOrtho((double)d, (double)d2, (double)d3, (double)d4, (double)d5, (double)d6);
    }

    public static void Method_16912(int n) {
        if (n != Class_16867.Field_16905.Field_14257) {
            Class_16867.Field_16905.Field_14257 = n;
            GL11.glLogicOp((int)n);
        }
    }

    public static void Method_16913() {
        Class_16867.Field_16901.Field_12247.Method_8131();
    }

    public static void Method_16914(float f) {
        if (f != Class_16867.Field_16872.Field_13052) {
            Class_16867.Field_16872.Field_13052 = f;
            GL11.glFogf((int)(2916 & 16245), (float)f);
        }
    }

    public static void Method_16915(int n) {
        Field_16883[n].Method_8131();
    }

    public static void Method_16916(float f) {
        if (f != Class_16867.Field_16872.Field_13050) {
            Class_16867.Field_16872.Field_13050 = f;
            GL11.glFogf((int)(7154 & 11110), (float)f);
        }
    }

    public static void Method_16917(int n, FloatBuffer floatBuffer) {
        GL11.glGetFloat((int)n, (FloatBuffer)floatBuffer);
    }

    public static void Method_16918() {
        Field_16889.Method_8131();
    }

    public static void Method_16919(float f, float f2, float f3) {
        Class_16867.Method_16924(f, f2, f3, 1.0f);
    }

    public static void Method_16920() {
        Field_16899.Method_8131();
    }

    private void Method_16921() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public static void Method_16922() {
        Class_16867.Field_16888[Class_16867.Field_16903].Field_30496.Method_8133();
    }

    public static void Method_16923(boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        if (bl != Class_16867.Field_16884.Field_23675 || bl2 != Class_16867.Field_16884.Field_23672 || bl3 != Class_16867.Field_16884.Field_23674 || bl4 != Class_16867.Field_16884.Field_23673) {
            Class_16867.Field_16884.Field_23675 = bl;
            Class_16867.Field_16884.Field_23672 = bl2;
            Class_16867.Field_16884.Field_23674 = bl3;
            Class_16867.Field_16884.Field_23673 = bl4;
            GL11.glColorMask((boolean)bl, (boolean)bl2, (boolean)bl3, (boolean)bl4);
        }
    }

    public static void Method_16924(float f, float f2, float f3, float f4) {
        if (f != Class_16867.Field_16890.Field_11880 || f2 != Class_16867.Field_16890.Field_11882 || f3 != Class_16867.Field_16890.Field_11881 || f4 != Class_16867.Field_16890.Field_11883) {
            Class_16867.Field_16890.Field_11880 = f;
            Class_16867.Field_16890.Field_11882 = f2;
            Class_16867.Field_16890.Field_11881 = f3;
            Class_16867.Field_16890.Field_11883 = f4;
            GL11.nglColor4f((float)f, (float)f2, (float)f3, (float)f4, (long)Field_16885);
        }
    }

    private static Class_38910 Method_16925(Class_8108 class_8108) {
        switch (Class_11560.Field_11561[class_8108.ordinal()]) {
            case 1: {
                return Class_16867.Field_16894.Field_9721;
            }
            case 2: {
                return Class_16867.Field_16894.Field_9719;
            }
            case 3: {
                return Class_16867.Field_16894.Field_9722;
            }
            case 4: {
                return Class_16867.Field_16894.Field_9720;
            }
        }
        return Class_16867.Field_16894.Field_9721;
    }

    public static void Method_16926() {
        Class_16867.Field_16905.Field_14256.Method_8131();
    }

    public static void Method_16927() {
        Field_16887.Method_23041();
    }

    public static void Method_16928(double d, double d2, double d3) {
        GL11.nglTranslated((double)d, (double)d2, (double)d3, (long)Field_16882);
    }

    public static void Method_16929(int n) {
        GL11.glCallList((int)n);
    }

    public static void Method_16930(boolean bl) {
        if (bl != Class_16867.Field_16887.Field_23034) {
            Class_16867.Field_16887.Field_23034 = bl;
            GL11.glDepthMask((boolean)bl);
        }
    }

    public static void Method_16931() {
        Field_16889.Method_8133();
    }

    public static void Method_16932() {
        Class_16867.Field_16890.Field_11881 = Class_16867.Field_16890.Field_11883 = 0.6438356f * -1.5531915f;
        Class_16867.Field_16890.Field_11882 = Class_16867.Field_16890.Field_11883;
        Class_16867.Field_16890.Field_11880 = Class_16867.Field_16890.Field_11883;
    }

    public static void Method_16933(Class_8108 class_8108) {
        Class_16867.Method_16925((Class_8108)class_8108).Field_38911.Method_8131();
    }

    public static void Method_16934(int n) {
        GL11.glMatrixMode((int)n);
    }

    public static int Method_16935() {
        return GL11.glGenTextures();
    }

    public static void Method_16936(int n) {
        if (n != Class_16867.Field_16887.Field_23036) {
            Class_16867.Field_16887.Field_23036 = n;
            GL11.glDepthFunc((int)n);
        }
    }

    public static void Method_16937(int n) {
        GL11.nglDisableClientState((int)n, (long)Field_16886);
    }

    public static void Method_16938() {
        Class_16867.Field_16896.Field_13992.Method_8133();
    }

    public static void Method_16939(float f, float f2) {
        if (f != Class_16867.Field_16907.Field_18296 || f2 != Class_16867.Field_16907.Field_18298) {
            Class_16867.Field_16907.Field_18296 = f;
            Class_16867.Field_16907.Field_18298 = f2;
            GL11.glPolygonOffset((float)f, (float)f2);
        }
    }

    public static void Method_16940(float f, float f2, float f3, float f4) {
        GL11.nglRotatef((float)f, (float)f2, (float)f3, (float)f4, (long)Field_16869);
    }

    public static void Method_16941(Class_8108 class_8108) {
        Class_16867.Method_16925((Class_8108)class_8108).Field_38911.Method_8133();
    }

    public static void Method_16942() {
        Field_16900.Method_8133();
    }

    public static void Method_16943(float f, float f2, float f3) {
        GL11.nglTranslatef((float)f, (float)f2, (float)f3, (long)Field_16880);
    }

    public static void Method_16944() {
        Field_16887.Method_23040();
    }

    public static void Method_16945() {
        GL11.nglPopMatrix((long)Field_16892);
    }

    public static void Method_16946() {
        Class_16867.Field_16905.Field_14256.Method_8133();
    }

    public static void Method_16947() {
        Class_16867.Field_16891.Field_14182.Method_8131();
    }

    public static void Method_16948(double d) {
        if (d != Class_16867.Field_16876.Field_26751) {
            Class_16867.Field_16876.Field_26751 = d;
            GL11.glClearDepth((double)d);
        }
    }

    public static void Method_16949(float f) {
        if (f != Class_16867.Field_16872.Field_13053) {
            Class_16867.Field_16872.Field_13053 = f;
            GL11.glFogf((int)(2915 & -12445), (float)f);
        }
    }

    public static void Method_16950() {
        Class_16867.Field_16896.Field_13992.Method_8131();
    }

    public static void Method_16951(int n, int n2) {
        if (n != Class_16867.Field_16891.Field_14181 || n2 != Class_16867.Field_16891.Field_14178) {
            Class_16867.Field_16891.Field_14181 = n;
            Class_16867.Field_16891.Field_14178 = n2;
            GL11.glBlendFunc((int)n, (int)n2);
        }
    }

    public static void Method_16952() {
        Class_16867.Field_16891.Field_14182.Method_8133();
    }

    public static void Method_16953(int n, int n2) {
        if (n != Class_16867.Field_16896.Field_13991 || n2 != Class_16867.Field_16896.Field_13990) {
            Class_16867.Field_16896.Field_13991 = n;
            Class_16867.Field_16896.Field_13990 = n2;
            GL11.glColorMaterial((int)n, (int)n2);
        }
    }

    public static void Method_16954() {
        Class_16867.Field_16872.Field_13051.Method_8133();
    }

    public static void Method_16955(int n) {
        GL11.nglEnableClientState((int)n, (long)Field_16875);
    }

    public static void Method_16956(int n) {
        if (n != Class_16867.Field_16872.Field_13054) {
            Class_16867.Field_16872.Field_13054 = n;
            GL11.glFogi((int)(-28827 & 2941), (int)n);
        }
    }

    public static void Method_16957() {
        Field_16900.Method_8131();
    }

    public static void Method_16958(double d, double d2, double d3) {
        GL11.nglScaled((double)d, (double)d2, (double)d3, (long)Field_16868);
    }

    public static int Method_16959() {
        return Class_32876.Field_32931 + Field_16903;
    }

    public static void Method_16960(int n) {
        if (Field_16903 != n - Class_32876.Field_32931) {
            Field_16903 = n - Class_32876.Field_32931;
            Class_32876.Method_32966(n);
        }
    }

    public static void Method_16961() {
        GL11.nglPushMatrix((long)Field_16902);
    }

    public static void Method_16962() {
        GL11.glLoadIdentity();
    }

    public static void Method_16963(int n) {
        if (n != Class_16867.Field_16888[Class_16867.Field_16903].Field_30495) {
            Class_16867.Field_16888[Class_16867.Field_16903].Field_30495 = n;
            GL11.glBindTexture((int)(20449 & 15859), (int)n);
        }
    }

    public static void Method_16964(int n) {
        GL11.glDeleteTextures((int)n);
        Class_30494[] arrclass_30494 = Field_16888;
        int n2 = arrclass_30494.length;
        for (int i = 16960 & -32617; i < n2; ++i) {
            Class_30494 class_30494 = arrclass_30494[i];
            if (class_30494.Field_30495 != n) continue;
            class_30494.Field_30495 = -1 & -1;
        }
    }

    public static void Method_16965() {
        Class_16867.Field_16888[Class_16867.Field_16903].Field_30496.Method_8131();
    }

    public static void Method_16966() {
        GL11.nglPushAttrib((int)(9323 & 31040), (long)Field_16874);
    }

    public static void Method_16967(int n, float f) {
        if (n != Class_16867.Field_16901.Field_12249 || f != Class_16867.Field_16901.Field_12248) {
            Class_16867.Field_16901.Field_12249 = n;
            Class_16867.Field_16901.Field_12248 = f;
            GL11.glAlphaFunc((int)n, (float)f);
        }
    }

    public static void Method_16968(IntBuffer intBuffer) {
        intBuffer.rewind();
        while (intBuffer.position() < intBuffer.limit()) {
            int n = intBuffer.get();
            Class_16867.Method_16964(n);
        }
        intBuffer.rewind();
    }

    public static void Method_16969() {
        Class_16867.Field_16881.Field_28773.Method_8133();
    }

    public static void Method_16970() {
        Class_16867.Field_16907.Field_18297.Method_8131();
    }

    public static void Method_16971() {
        Class_16867.Field_16907.Field_18297.Method_8133();
    }

    public static void Method_16972(int n) {
        if (n != Field_16870) {
            Field_16870 = n;
            GL11.glShadeModel((int)n);
        }
    }

    public static void Method_16973(float f, float f2, float f3) {
        GL11.nglScalef((float)f, (float)f2, (float)f3, (long)Field_16906);
    }

    public static void Method_16974() {
        GL11.nglPopAttrib((long)Field_16873);
    }

    public static void Method_16975() {
        GL11.glBindTexture((int)(24045 & 11745), (int)Class_16867.Field_16888[Class_16867.Field_16903].Field_30495);
    }

    public static void Method_16976(Class_8108 class_8108, int n, FloatBuffer floatBuffer) {
        GL11.glTexGen((int)Class_16867.Method_16925((Class_8108)class_8108).Field_38913, (int)n, (FloatBuffer)floatBuffer);
    }

    static {
        int n;
        Field_16901 = new Class_12246(null);
        Field_16889 = new Class_8128(6993 & 3034);
        Field_16883 = new Class_8128[-15608 & 6184];
        Field_16896 = new Class_13989(null);
        Field_16891 = new Class_14177(null);
        Field_16887 = new Class_23033(null);
        Field_16872 = new Class_13049(null);
        Field_16881 = new Class_28771(null);
        Field_16907 = new Class_18294(null);
        Field_16905 = new Class_14255(null);
        Field_16894 = new Class_9718(null);
        Field_16876 = new Class_26748(null);
        Field_16877 = new Class_20505(null);
        Field_16899 = new Class_8128(-29783 & 4001);
        Field_16903 = 515 & 1368;
        Field_16888 = new Class_30494[9248 & 944];
        Field_16870 = 15617 & -8893;
        Field_16900 = new Class_8128(1611694142 & -1843297989);
        Field_16884 = new Class_23671(null);
        Field_16890 = new Class_11879();
        Field_16897 = 8233 & 16451;
        Field_16878 = GLContext.getCapabilities();
        Field_16895 = Class_16867.Field_16878.glBegin;
        BufferChecks.checkFunctionAddress((long)Field_16895);
        Field_16879 = Class_16867.Field_16878.glTexCoord2f;
        BufferChecks.checkFunctionAddress((long)Field_16879);
        Field_16898 = Class_16867.Field_16878.glVertex3f;
        BufferChecks.checkFunctionAddress((long)Field_16898);
        Field_16904 = Class_16867.Field_16878.glEnd;
        BufferChecks.checkFunctionAddress((long)Field_16904);
        Field_16902 = Class_16867.Field_16878.glPushMatrix;
        BufferChecks.checkFunctionAddress((long)Field_16902);
        Field_16892 = Class_16867.Field_16878.glPopMatrix;
        BufferChecks.checkFunctionAddress((long)Field_16892);
        Field_16869 = Class_16867.Field_16878.glRotatef;
        BufferChecks.checkFunctionAddress((long)Field_16869);
        Field_16906 = Class_16867.Field_16878.glScalef;
        BufferChecks.checkFunctionAddress((long)Field_16906);
        Field_16868 = Class_16867.Field_16878.glScaled;
        BufferChecks.checkFunctionAddress((long)Field_16868);
        Field_16880 = Class_16867.Field_16878.glTranslatef;
        BufferChecks.checkFunctionAddress((long)Field_16880);
        Field_16882 = Class_16867.Field_16878.glTranslated;
        BufferChecks.checkFunctionAddress((long)Field_16882);
        Field_16885 = Class_16867.Field_16878.glColor4f;
        BufferChecks.checkFunctionAddress((long)Field_16885);
        Field_16874 = Class_16867.Field_16878.glPushAttrib;
        BufferChecks.checkFunctionAddress((long)Field_16874);
        Field_16873 = Class_16867.Field_16878.glPopAttrib;
        BufferChecks.checkFunctionAddress((long)Field_16873);
        Field_16893 = Class_16867.Field_16878.glEnable;
        BufferChecks.checkFunctionAddress((long)Field_16893);
        Field_16871 = Class_16867.Field_16878.glDisable;
        BufferChecks.checkFunctionAddress((long)Field_16871);
        Field_16875 = Class_16867.Field_16878.glEnableClientState;
        BufferChecks.checkFunctionAddress((long)Field_16875);
        Field_16886 = Class_16867.Field_16878.glDisableClientState;
        BufferChecks.checkFunctionAddress((long)Field_16886);
        for (n = 2336 & 711; n < (2588 & 20552); ++n) {
            Class_16867.Field_16883[n] = new Class_8128((-13968 & 16904) + n);
        }
        for (n = 68 & 1537; n < Field_16888.length; ++n) {
            Class_16867.Field_16888[n] = new Class_30494(null);
        }
    }

    public static void Method_16977(int n) {
        Field_16883[n].Method_8133();
    }

    public static void Method_16978() {
        Class_16867.Field_16872.Field_13051.Method_8131();
    }

    public static void Method_16979() {
        Class_16867.Field_16881.Field_28773.Method_8131();
    }

    public static void Method_16980(Class_8108 class_8108, int n) {
        Class_38910 class_38910 = Class_16867.Method_16925(class_8108);
        if (n != class_38910.Field_38912) {
            class_38910.Field_38912 = n;
            GL11.glTexGeni((int)class_38910.Field_38913, (int)(26408 & -23296), (int)n);
        }
    }

    public static void Method_16981(float f, float f2, float f3, float f4) {
        if (f != Class_16867.Field_16876.Field_26749.Field_11880 || f2 != Class_16867.Field_16876.Field_26749.Field_11882 || f3 != Class_16867.Field_16876.Field_26749.Field_11881 || f4 != Class_16867.Field_16876.Field_26749.Field_11883) {
            Class_16867.Field_16876.Field_26749.Field_11880 = f;
            Class_16867.Field_16876.Field_26749.Field_11882 = f2;
            Class_16867.Field_16876.Field_26749.Field_11881 = f3;
            Class_16867.Field_16876.Field_26749.Field_11883 = f4;
            GL11.glClearColor((float)f, (float)f2, (float)f3, (float)f4);
        }
    }

    public static void Method_16982(FloatBuffer floatBuffer) {
        GL11.glMultMatrix((FloatBuffer)floatBuffer);
    }

    public static void Method_16983(int n) {
        if (Field_16897) {
            GL11.glClear((int)n);
        }
    }

    public static void Method_16984(int n, int n2, int n3, int n4) {
        if (n != Class_16867.Field_16891.Field_14181 || n2 != Class_16867.Field_16891.Field_14178 || n3 != Class_16867.Field_16891.Field_14179 || n4 != Class_16867.Field_16891.Field_14180) {
            Class_16867.Field_16891.Field_14181 = n;
            Class_16867.Field_16891.Field_14178 = n2;
            Class_16867.Field_16891.Field_14179 = n3;
            Class_16867.Field_16891.Field_14180 = n4;
            Class_32876.Method_32967(n, n2, n3, n4);
        }
    }

    public static void Method_16985() {
        Class_16867.Field_16901.Field_12247.Method_8133();
    }
}

