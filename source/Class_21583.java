/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  internal.org.lwjgl.opengl.ContextCapabilities
 *  internal.org.lwjgl.opengl.GL11
 *  internal.org.lwjgl.opengl.GLContext
 */
import internal.org.lwjgl.opengl.ContextCapabilities;
import internal.org.lwjgl.opengl.GL11;
import internal.org.lwjgl.opengl.GLContext;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.nio.IntBuffer;
import java.util.Iterator;
import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;

public class Class_21583 {
    public static Class_11372 Field_21584;
    public static Class_11372 Field_21585;
    public static Class_11372 Field_21586;
    public static Class_11372 Field_21587;
    public static Class_11372 Field_21588;
    public static Class_11372 Field_21589;
    public static Class_11372 Field_21590;
    public static Class_11372 Field_21591;
    public static Class_11372 Field_21592;
    public static Class_11372 Field_21593;
    public static Class_11372 Field_21594;
    public static Class_11372 Field_21595;
    private static IntBuffer Field_21596;
    public static Class_11372 Field_21597;
    public static Class_11372 Field_21598;
    public static Class_11372 Field_21599;
    public static Class_11372 Field_21600;
    public static Class_11372 Field_21601;
    public static Class_11372 Field_21602;

    public static void Method_21603() {
        Class_24069 class_24069 = Class_21583.Method_21616();
        if (class_24069 != null) {
            String string = "minecraft:blocks/";
            Field_21586 = class_24069.Method_24107(string + "grass_top");
            Field_21590 = class_24069.Method_24107(string + "grass_side");
            Field_21585 = class_24069.Method_24107(string + "grass_side_overlay");
            Field_21598 = class_24069.Method_24107(string + "snow");
            Field_21584 = class_24069.Method_24107(string + "grass_side_snowed");
            Field_21593 = class_24069.Method_24107(string + "mycelium_side");
            Field_21601 = class_24069.Method_24107(string + "mycelium_top");
            Field_21589 = class_24069.Method_24107(string + "water_still");
            Field_21594 = class_24069.Method_24107(string + "water_flow");
            Field_21602 = class_24069.Method_24107(string + "lava_still");
            Field_21600 = class_24069.Method_24107(string + "lava_flow");
            Field_21588 = class_24069.Method_24107(string + "fire_layer_0");
            Field_21587 = class_24069.Method_24107(string + "fire_layer_1");
            Field_21592 = class_24069.Method_24107(string + "portal");
            Field_21595 = class_24069.Method_24107(string + "glass");
            Field_21599 = class_24069.Method_24107(string + "glass_pane_top");
        }
    }

    private void Method_21604() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public static BufferedImage Method_21605(BufferedImage bufferedImage, int n) {
        if (bufferedImage == null) {
            return bufferedImage;
        }
        int n2 = bufferedImage.getWidth();
        int n3 = bufferedImage.getHeight();
        int n4 = Math.max(n2, n);
        if ((n4 = Class_13337.Method_13380(n4)) == n2) {
            return bufferedImage;
        }
        int n5 = n3 * n4 / n2;
        BufferedImage bufferedImage2 = new BufferedImage(n4, n5, 26114 & -30313);
        Graphics2D graphics2D = bufferedImage2.createGraphics();
        Object object = RenderingHints.VALUE_INTERPOLATION_NEAREST_NEIGHBOR;
        if (n4 % n2 != 0) {
            object = RenderingHints.VALUE_INTERPOLATION_BILINEAR;
        }
        graphics2D.setRenderingHint(RenderingHints.KEY_INTERPOLATION, object);
        graphics2D.drawImage(bufferedImage, 9892 & 74, 19 & 21280, n4, n5, null);
        return bufferedImage2;
    }

    static {
        Field_21596 = Class_11552.Method_11558(-28376 & 24849);
    }

    public static String Method_21606(String string, String string2) {
        String string3 = "assets/minecraft/";
        if (string.startsWith(string3)) {
            string = string.substring(string3.length());
            return string;
        }
        if (string.startsWith("./")) {
            string = string.substring(11651 & -32654);
            if (!string2.endsWith("/")) {
                string2 = string2 + "/";
            }
            string = string2 + string;
            return string;
        }
        String string4 = "mcpatcher/";
        if (string.startsWith("~/")) {
            string = string.substring(-7910 & 3074);
            string = string4 + string;
            return string;
        }
        if (string.startsWith("/")) {
            string = string4 + string.substring(-32725 & 14465);
            return string;
        }
        return string;
    }

    public static void Method_21607() {
        Object object;
        Object object2;
        Class_279 class_279 = Class_19426.Method_19564();
        if (class_279 instanceof Class_2042) {
            object = (Class_2042)class_279;
            object2 = new Class_27055();
            object.Method_2044((Class_2045)object2);
        }
        object = new Class_34215();
        object2 = new Class_2080("optifine/TickableTextures");
        Class_19426.Method_19532().Method_34706((Class_2080)object2, (Class_2059)object);
    }

    public static String Method_21608(String string) {
        int n = string.lastIndexOf(5167 & -32641);
        return n < 0 ? "" : string.substring(24640 & 641, n);
    }

    public static void Method_21609(int n) {
        Class_16867.Method_16963(n);
    }

    public static void Method_21610() {
        if (GLContext.getCapabilities().GL_EXT_texture_filter_anisotropic) {
            float f = GL11.glGetFloat((int)(335977727 & -939481089));
            float f2 = Class_19426.Method_19575();
            f2 = Math.min(f2, f);
            GL11.glTexParameterf((int)(3559 & 15849), (int)(1779484414 & 67144958), (float)f2);
        }
    }

    public static void Method_21611(Class_279 class_279) {
        if (Class_21583.Method_21616() != null) {
            Class_19426.Method_19526("*** Reloading custom textures ***");
            Class_18011.Method_18013();
            Class_26606.Method_26618();
            Class_21583.Method_21603();
            Class_15787.Method_15793();
            Class_24204.Method_24225();
            Class_32544.Method_32548();
            Class_26606.Method_26609();
            Class_10125.Method_10175();
            Class_18011.Method_18017();
            Class_24158.Method_24184();
            Class_12440.Method_12958();
            Class_14688.Method_14699();
            Class_19426.Method_19560();
            Class_19426.Method_19532().Method_34703();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static Dimension Method_21612(InputStream inputStream, String string) {
        Iterator<ImageReader> iterator = ImageIO.getImageReadersBySuffix(string);
        while (iterator.hasNext()) {
            Dimension dimension;
            block6 : {
                ImageReader imageReader = iterator.next();
                try {
                    ImageInputStream imageInputStream = ImageIO.createImageInputStream(inputStream);
                    imageReader.setInput(imageInputStream);
                    int n = imageReader.getWidth(imageReader.getMinIndex());
                    int n2 = imageReader.getHeight(imageReader.getMinIndex());
                    dimension = new Dimension(n, n2);
                    break block6;
                }
                catch (IOException iOException) {}
                continue;
                finally {
                    imageReader.dispose();
                    continue;
                }
            }
            return dimension;
        }
        return null;
    }

    public static BufferedImage Method_21613(BufferedImage bufferedImage, int n) {
        int n2 = bufferedImage.getWidth();
        int n3 = bufferedImage.getHeight();
        int n4 = n3 * n / n2;
        BufferedImage bufferedImage2 = new BufferedImage(n, n4, 530 & -24565);
        Graphics2D graphics2D = bufferedImage2.createGraphics();
        Object object = RenderingHints.VALUE_INTERPOLATION_NEAREST_NEIGHBOR;
        if (n < n2 || n % n2 != 0) {
            object = RenderingHints.VALUE_INTERPOLATION_BILINEAR;
        }
        graphics2D.setRenderingHint(RenderingHints.KEY_INTERPOLATION, object);
        graphics2D.drawImage(bufferedImage, 4100 & 714, -32250 & 4352, n, n4, null);
        return bufferedImage2;
    }

    public static Class_2062 Method_21614(Class_2080 class_2080) {
        Class_2062 class_2062 = Class_19426.Method_19532().Method_34709(class_2080);
        if (class_2062 != null) {
            return class_2062;
        }
        if (!Class_19426.Method_19594(class_2080)) {
            return null;
        }
        Class_24752 class_24752 = new Class_24752(class_2080);
        Class_19426.Method_19532().Method_34704(class_2080, class_24752);
        return class_24752;
    }

    public static boolean Method_21615(int n) {
        int n2 = Class_13337.Method_13380(n);
        return (n2 == n ? -32761 & 18601 : -7787 & 7232) != 0;
    }

    public static Class_24069 Method_21616() {
        return Class_18.Field_89.Method_189();
    }
}

