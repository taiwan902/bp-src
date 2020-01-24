/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  internal.org.lwjgl.opengl.GL11
 *  internal.org.lwjgl.util.glu.GLU
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import internal.org.lwjgl.opengl.GL11;
import internal.org.lwjgl.util.glu.GLU;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class_33237
extends Class_23424 {
    public boolean Field_33238;
    private static final Logger Field_33239 = LogManager.getLogger();
    public Class_2080 Field_33240;
    public Class_2080 Field_33241;

    public static int Method_33242() {
        int n = GL11.glGetError();
        if (n != 0) {
            Object[] arrobject = new Object[4443 & -13178];
            arrobject[-29437 & 28] = n;
            arrobject[10377 & 549] = GLU.gluErrorString((int)n);
            Field_33239.error("BPfont GL error 0x%04x: %s\n", arrobject);
        }
        return n;
    }

    public Class_33237(Class_2080 class_2080, Class_2080 class_20802) {
        this.Field_33241 = class_2080;
        this.Field_33240 = class_20802;
    }

    private void Method_33243() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_33244(Class_279 class_279) {
        this.Field_33238 = 2560 & 24681;
        this.\u0000= final();
        BufferedImage bufferedImage = null;
        ArrayList<Class_2080> arrayList = new ArrayList<Class_2080>();
        arrayList.add(Class_35162.Method_35163(this.Field_33241));
        arrayList.add(this.Field_33240);
        Field_33239.info("BP base font: " + ((Class_2080)arrayList.get(13316 & -32502)).Method_2084());
        Field_33239.info("BP acc  font: " + ((Class_2080)arrayList.get(16389 & -31581)).Method_2084());
        try {
            int n = 16512 & 4612;
            int n2 = 2816 & 16416;
            int n3 = -28231 & 17410;
            int n4 = -16123 & 4168;
            int n5 = 151 & -27576;
            int n6 = -30632 & 8741;
            int n7 = 17037 & 8257;
            for (Class_2080 class_2080 : arrayList) {
                if (class_2080 == null) continue;
                InputStream inputStream = class_279.Method_282(class_2080).Method_9958();
                BufferedImage bufferedImage2 = Class_18695.Method_18726(inputStream);
                if (bufferedImage == null) {
                    n = bufferedImage2.getWidth();
                    n2 = bufferedImage2.getHeight();
                    n *= 105 & -27127;
                    n /= -16248 & 8457;
                    n2 *= 3215 & -28356;
                    n2 /= 14538 & -32247;
                    n3 = bufferedImage2.getWidth() * (18953 & 4513);
                    n4 = bufferedImage2.getHeight() * (-28667 & 17537);
                    bufferedImage = new BufferedImage(bufferedImage2.getWidth() * (2180 & 4164), bufferedImage2.getHeight() * (-24444 & 5383), 4226 & 18467);
                }
                if (bufferedImage2.getWidth() != n) {
                    try {
                        BufferedImage bufferedImage3 = bufferedImage2;
                        int n8 = bufferedImage3.getWidth();
                        int n9 = bufferedImage3.getHeight();
                        int n10 = n / n8;
                        if (n10 == 0) {
                            n10 = 7255 & -32095;
                        }
                        BufferedImage bufferedImage4 = new BufferedImage(n8 * n10, n9 * n10, 17426 & -22518);
                        AffineTransform affineTransform = new AffineTransform();
                        affineTransform.scale(n10, n10);
                        AffineTransformOp affineTransformOp = new AffineTransformOp(affineTransform, 12833 & 16787);
                        bufferedImage2 = affineTransformOp.filter(bufferedImage3, bufferedImage4);
                    }
                    catch (Exception exception) {
                        Field_33239.warn("BlazingPack: wrong accented.png texture: " + exception.getMessage());
                    }
                }
                bufferedImage.getGraphics().drawImage(bufferedImage2, n3 * n5, n4 * n6, null);
                if (++n5 <= n7) continue;
                n5 = 1292 & -13696;
                ++n6;
            }
        }
        catch (IOException iOException) {
            Field_33239.error("Couldn't load bp multifont image", (Throwable)iOException);
            return;
        }
        try {
            Path path = Paths.get(this.Field_33241.Method_2084(), new String[525 & 8448]);
            File file = new File("bp_debug_fonts" + path.getFileName());
            if (file.exists()) {
                file.delete();
            }
        }
        catch (Throwable throwable) {
            Field_33239.error("Couldn't delete old BP debug font image", throwable);
        }
        Class_18695.Method_18713(this.\u0000strictfp(), bufferedImage);
        if (Class_33237.Method_33242() == 0) {
            this.Field_33238 = -27903 & 8197;
        }
    }
}

