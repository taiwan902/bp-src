/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  internal.org.lwjgl.BufferUtils
 *  internal.org.lwjgl.opengl.GL11
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import internal.org.lwjgl.BufferUtils;
import internal.org.lwjgl.opengl.GL11;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.nio.Buffer;
import java.nio.IntBuffer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.imageio.ImageIO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class_19743 {
    private static final DateFormat Field_19744;
    private static final Logger Field_19745;
    private static IntBuffer Field_19746;
    private static int[] Field_19747;

    static {
        Field_19745 = LogManager.getLogger();
        Field_19744 = new SimpleDateFormat(Class_19743.Method_19750("\ud025\ud024\ud025\ud024\ud075\ud014\ud015\ud074\ud030\ud031\ud001\ud015\ud010\ud075\ud035\ud034\ud070\ud024\ud025"));
    }

    public static Class_1782 Method_19748(File file, String string, int n, int n2, Class_19135 class_19135) {
        try {
            File file2 = new File(file, "screenshots");
            file2.mkdir();
            if (Class_32876.Method_32948()) {
                n = class_19135.Field_19142;
                n2 = class_19135.Field_19141;
            }
            int n3 = n * n2;
            if (Field_19746 == null || Field_19746.capacity() < n3) {
                Field_19746 = BufferUtils.createIntBuffer((int)n3);
                Field_19747 = new int[n3];
            }
            GL11.glPixelStorei((int)(7943 & 3341), (int)(8369 & 4173));
            GL11.glPixelStorei((int)(15607 & -28683), (int)(1685 & -1949));
            Field_19746.clear();
            if (Class_32876.Method_32948()) {
                Class_16867.Method_16963(class_19135.Field_19144);
                GL11.glGetTexImage((int)(3553 & 8161), (int)(2433 & -28122), (int)(1677820145 & 173855977), (int)(99926887 & 805943167), (IntBuffer)Field_19746);
            } else {
                GL11.glReadPixels((int)(22665 & -32730), (int)(2912 & 8200), (int)n, (int)n2, (int)(77051115 & 140542433), (int)(135431015 & 563055), (IntBuffer)Field_19746);
            }
            Field_19746.get(Field_19747);
            Class_18695.Method_18710(Field_19747, n, n2);
            BufferedImage bufferedImage = null;
            if (Class_32876.Method_32948()) {
                int n4;
                bufferedImage = new BufferedImage(class_19135.Field_19140, class_19135.Field_19136, -20179 & 18625);
                for (int i = n4 = class_19135.Field_19141 - class_19135.Field_19136; i < class_19135.Field_19141; ++i) {
                    for (int j = 2181 & -28672; j < class_19135.Field_19140; ++j) {
                        bufferedImage.setRGB(j, i - n4, Field_19747[i * class_19135.Field_19142 + j]);
                    }
                }
            } else {
                bufferedImage = new BufferedImage(n, n2, 20497 & -32181);
                bufferedImage.setRGB(528 & -24415, 16384 & 8903, n, n2, Field_19747, 5384 & 16900, n);
            }
            File file3 = string == null ? Class_19743.Method_19751(file2) : new File(file2, string);
            ImageIO.write((RenderedImage)bufferedImage, "png", file3);
            Class_2840 class_2840 = new Class_2840(file3.getName());
            class_2840.Method_1789().Method_2915(new Class_21230(Class_17245.Field_17255, file3.getAbsolutePath()));
            class_2840.Method_1789().Method_2945((515 & -28467) != 0);
            Object[] arrobject = new Object[16563 & -27327];
            arrobject[2100 & 4491] = class_2840;
            return new Class_2849("screenshot.success", arrobject);
        }
        catch (Exception exception) {
            Field_19745.warn("Couldn't save screenshot", (Throwable)exception);
            Object[] arrobject = new Object[18561 & 5121];
            arrobject[208 & 9984] = exception.getMessage();
            return new Class_2849("screenshot.failure", arrobject);
        }
    }

    private void Method_19749() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private static String Method_19750(String string) {
        int n = 16431;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19743.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static File Method_19751(File file) {
        String string = Field_19744.format(new Date()).toString();
        int n = 5633 & 8257;
        File file2;
        while ((file2 = new File(file, string + (n == (2437 & -19909) ? "" : "_" + n) + ".png")).exists()) {
            ++n;
        }
        return file2;
    }

    public static Class_1782 Method_19752(File file, int n, int n2, Class_19135 class_19135) {
        return Class_19743.Method_19748(file, null, n, n2, class_19135);
    }
}

