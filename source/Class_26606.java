/*
 * Decompiled with CFR 0.145.
 */
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Properties;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import javax.imageio.ImageIO;

public class Class_26606 {
    private static Class_6158[] Field_26607 = null;

    public static Class_6158 Method_26608(Properties properties, Class_2080 class_2080) {
        String string = properties.getProperty("from");
        String string2 = properties.getProperty("to");
        int n = Class_19426.Method_19502(properties.getProperty("x"), -1 & -1);
        int n2 = Class_19426.Method_19502(properties.getProperty("y"), -1 & -1);
        int n3 = Class_19426.Method_19502(properties.getProperty("w"), -1 & -1);
        int n4 = Class_19426.Method_19502(properties.getProperty("h"), -1 & -1);
        if (string != null && string2 != null) {
            if (n >= 0 && n2 >= 0 && n3 >= 0 && n4 >= 0) {
                String string3 = Class_21583.Method_21608(class_2080.Method_2084());
                string = Class_21583.Method_21606(string, string3);
                string2 = Class_21583.Method_21606(string2, string3);
                byte[] arrby = Class_26606.Method_26615(string, n3);
                if (arrby == null) {
                    Class_19426.Method_19610("TextureAnimation: Source texture not found: " + string2);
                    return null;
                }
                Class_2080 class_20802 = new Class_2080(string2);
                if (!Class_19426.Method_19594(class_20802)) {
                    Class_19426.Method_19610("TextureAnimation: Target texture not found: " + string2);
                    return null;
                }
                Class_6158 class_6158 = new Class_6158(string, arrby, string2, class_20802, n, n2, n3, n4, properties, -7625 & 1289);
                return class_6158;
            }
            Class_19426.Method_19610("TextureAnimation: Invalid coordinates");
            return null;
        }
        Class_19426.Method_19610("TextureAnimation: Source or target texture not specified");
        return null;
    }

    public static void Method_26609() {
        Field_26607 = null;
        Class_2035[] arrclass_2035 = Class_19426.Method_19487();
        Field_26607 = Class_26606.Method_26621(arrclass_2035);
        if (Class_19426.Method_19523()) {
            Class_26606.Method_26614();
        }
    }

    public static BufferedImage Method_26610(BufferedImage bufferedImage, int n, int n2) {
        BufferedImage bufferedImage2 = new BufferedImage(n, n2, 1026 & 18);
        Graphics2D graphics2D = bufferedImage2.createGraphics();
        graphics2D.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        graphics2D.drawImage(bufferedImage, -31227 & 16802, 2048 & 16608, n, n2, null);
        return bufferedImage2;
    }

    private void Method_26611() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private static byte[] Method_26612(String string, int n) {
        Class_39702 class_39702 = Class_19426.Method_19571();
        try {
            Class_2080 class_2080 = new Class_2080(string);
            InputStream inputStream = Class_19426.Method_19493(class_2080);
            if (inputStream == null) {
                return null;
            }
            BufferedImage bufferedImage = Class_26606.Method_26617(inputStream);
            if (bufferedImage == null) {
                return null;
            }
            if (n > 0 && bufferedImage.getWidth() != n) {
                double d = bufferedImage.getHeight() / bufferedImage.getWidth();
                int n2 = (int)((double)n * d);
                bufferedImage = Class_26606.Method_26610(bufferedImage, n, n2);
            }
            int n3 = bufferedImage.getWidth();
            int n4 = bufferedImage.getHeight();
            int[] arrn = new int[n3 * n4];
            byte[] arrby = new byte[n3 * n4 * (-32764 & 15407)];
            bufferedImage.getRGB(16932 & 11282, 272 & -26622, n3, n4, arrn, 280 & 22598, n3);
            for (int i = 28080 & -32702; i < arrn.length; ++i) {
                int n5 = arrn[i] >> (12444 & 17465) & (2303 & -24321);
                int n6 = arrn[i] >> (-21991 & 1040) & (-24321 & 21759);
                int n7 = arrn[i] >> (73 & -32374) & (6399 & -15873);
                int n8 = arrn[i] & (-15105 & 255);
                if (class_39702 != null && class_39702.Field_39747) {
                    int n9 = (n6 * (-25826 & 17438) + n7 * (4219 & 2111) + n8 * (-28613 & 8203)) / (7780 & 16485);
                    int n10 = (n6 * (13662 & -32226) + n7 * (4294 & 78)) / (-28572 & 8292);
                    int n11 = (n6 * (21790 & 8862) + n8 * (17014 & 6215)) / (4454 & -30108);
                    n6 = n9;
                    n7 = n10;
                    n8 = n11;
                }
                arrby[i * (3406 & 16549) + (2162 & 9)] = (byte)n6;
                arrby[i * (4236 & -7660) + (17 & 20589)] = (byte)n7;
                arrby[i * (-16092 & 4628) + (2563 & -16318)] = (byte)n8;
                arrby[i * (-22010 & 245) + (8239 & -30397)] = (byte)n5;
            }
            return arrby;
        }
        catch (FileNotFoundException fileNotFoundException) {
            return null;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    public static String[] Method_26613(File file) {
        File file2 = new File(file, "anim");
        if (!file2.exists()) {
            return null;
        }
        if (!file2.isDirectory()) {
            return null;
        }
        File[] arrfile = file2.listFiles();
        if (arrfile == null) {
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<String>();
        for (int i = 2 & 15384; i < arrfile.length; ++i) {
            File file3 = arrfile[i];
            String string = file3.getName();
            if (string.startsWith("custom_") || !string.endsWith(".properties") || !file3.isFile() || !file3.canRead()) continue;
            Class_19426.Method_19526("TextureAnimation: anim/" + file3.getName());
            arrayList.add("/anim/" + string);
        }
        String[] arrstring = arrayList.toArray(new String[arrayList.size()]);
        return arrstring;
    }

    public static void Method_26614() {
        if (Field_26607 != null) {
            for (int i = 1160 & 4390; i < Field_26607.length; ++i) {
                Class_6158 class_6158 = Field_26607[i];
                class_6158.Method_6171();
            }
        }
    }

    public static byte[] Method_26615(String string, int n) {
        byte[] arrby = Class_26606.Method_26612(string, n);
        if (arrby == null) {
            arrby = Class_26606.Method_26612("/anim" + string, n);
        }
        return arrby;
    }

    public static Class_6158[] Method_26616(Class_2035 class_2035) {
        if (!(class_2035 instanceof Class_23171)) {
            return null;
        }
        Class_23171 class_23171 = (Class_23171)class_2035;
        File file = Class_17861.Method_17865(class_23171);
        if (file == null) {
            return null;
        }
        if (!file.exists()) {
            return null;
        }
        String[] arrstring = null;
        arrstring = file.isFile() ? Class_26606.Method_26620(file) : Class_26606.Method_26613(file);
        if (arrstring == null) {
            return null;
        }
        ArrayList<Class_6158> arrayList = new ArrayList<Class_6158>();
        for (int i = 20500 & -24480; i < arrstring.length; ++i) {
            String string = arrstring[i];
            Class_19426.Method_19526("Texture animation: " + string);
            try {
                Class_2080 class_2080 = new Class_2080(string);
                InputStream inputStream = class_2035.Method_2039(class_2080);
                Properties properties = new Properties();
                properties.load(inputStream);
                Class_6158 class_6158 = Class_26606.Method_26608(properties, class_2080);
                if (class_6158 == null) continue;
                Class_2080 class_20802 = new Class_2080(class_6158.Method_6174());
                if (Class_19426.Method_19525(class_20802) != class_2035) {
                    Class_19426.Method_19526("Skipped: " + string + ", target texture not loaded from same resource pack");
                    continue;
                }
                arrayList.add(class_6158);
                continue;
            }
            catch (FileNotFoundException fileNotFoundException) {
                Class_19426.Method_19610("File not found: " + fileNotFoundException.getMessage());
                continue;
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }
        Class_6158[] arrclass_6158 = arrayList.toArray(new Class_6158[arrayList.size()]);
        return arrclass_6158;
    }

    private static BufferedImage Method_26617(InputStream inputStream) {
        BufferedImage bufferedImage = ImageIO.read(inputStream);
        inputStream.close();
        return bufferedImage;
    }

    public static void Method_26618() {
        Field_26607 = null;
    }

    public static void Method_26619() {
        if (Field_26607 != null && Class_19426.Method_19523()) {
            Class_26606.Method_26614();
        }
    }

    public static String[] Method_26620(File file) {
        try {
            String[] arrstring;
            ZipFile zipFile = new ZipFile(file);
            Enumeration<? extends ZipEntry> enumeration = zipFile.entries();
            ArrayList<String> arrayList = new ArrayList<String>();
            while (enumeration.hasMoreElements()) {
                arrstring = enumeration.nextElement();
                String string = arrstring.getName();
                if (!string.startsWith("assets/minecraft/mcpatcher/anim/") || string.startsWith("assets/minecraft/mcpatcher/anim/custom_") || !string.endsWith(".properties")) continue;
                String string2 = "assets/minecraft/";
                string = string.substring(string2.length());
                arrayList.add(string);
            }
            arrstring = arrayList.toArray(new String[arrayList.size()]);
            return arrstring;
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return null;
        }
    }

    public static Class_6158[] Method_26621(Class_2035[] arrclass_2035) {
        ArrayList<Class_6158> arrayList = new ArrayList<Class_6158>();
        for (int i = 19012 & -28672; i < arrclass_2035.length; ++i) {
            Class_2035 class_2035 = arrclass_2035[i];
            Class_6158[] arrclass_6158 = Class_26606.Method_26616(class_2035);
            if (arrclass_6158 == null) continue;
            arrayList.addAll(Arrays.asList(arrclass_6158));
        }
        Class_6158[] arrclass_6158 = arrayList.toArray(new Class_6158[arrayList.size()]);
        return arrclass_6158;
    }
}

