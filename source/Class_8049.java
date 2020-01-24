/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  internal.org.lwjgl.BufferUtils
 *  internal.org.lwjgl.opengl.GL11
 */
import internal.org.lwjgl.BufferUtils;
import internal.org.lwjgl.opengl.GL11;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javax.imageio.ImageIO;

public class Class_8049 {
    public static int[] Field_8050;
    public static Class_24069 Field_8051;
    public static Class_279 Field_8052;
    public static Map Field_8053;
    static Class_2080 Field_8054;
    public static Class_38187 Field_8055;
    public static Class_38187 Field_8056;
    public static int Field_8057;
    public static String Field_8058;
    static int Field_8059;
    public static Class_11372 Field_8060;
    public static ByteBuffer Field_8061;
    public static IntBuffer Field_8062;

    public static int[] Method_8063(int n) {
        if (Field_8050 == null) {
            Field_8050 = new int[154174499 & -2145908200];
        }
        if (Field_8050.length < n) {
            Field_8050 = new int[Class_8049.Method_8078(n)];
        }
        return Field_8050;
    }

    public static void Method_8064(int n, int[] arrn, int n2, int n3, Class_47630 class_47630) {
        Class_38187 class_38187 = class_47630.\u0000strictfp();
        Class_16867.Method_16963(class_38187.Field_38188);
        Class_8049.Method_8082(arrn, n2, n3, 21312 & 2228, 6222 & 8480, -32500 & 5760);
        Class_16867.Method_16963(class_38187.Field_38189);
        Class_8049.Method_8082(arrn, n2, n3, 28753 & 264, 36 & 24136, 1029 & 20673);
        Class_16867.Method_16963(class_38187.Field_38190);
        Class_8049.Method_8082(arrn, n2, n3, 280 & -32703, -32383 & 21586, 25346 & 2087);
        Class_16867.Method_16963(class_38187.Field_38188);
    }

    static {
        Field_8061 = BufferUtils.createByteBuffer((int)(-532676472 & 292651104));
        Field_8062 = Field_8061.asIntBuffer();
        Field_8050 = new int[1146912 & -1904708774];
        Field_8053 = new HashMap();
        Field_8051 = null;
        Field_8060 = null;
        Field_8055 = null;
        Field_8056 = null;
        Field_8057 = 27036 & -32254;
        Field_8058 = null;
        Field_8052 = null;
        Field_8054 = null;
        Field_8059 = 9568 & 16915;
    }

    public static Class_2080 Method_8065(Class_2080 class_2080, String string) {
        String string2 = class_2080.Method_2084();
        String[] arrstring = string2.split(".png");
        String string3 = arrstring[2368 & -14836];
        return new Class_2080(class_2080.Method_2085(), string3 + "_" + string + ".png");
    }

    public static IntBuffer Method_8066(int n) {
        if (Field_8062.capacity() < n) {
            int n2 = Class_8049.Method_8078(n);
            Field_8061 = BufferUtils.createByteBuffer((int)(n2 * (8886 & 1100)));
            Field_8062 = Field_8061.asIntBuffer();
        }
        return Field_8062;
    }

    private void Method_8067() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public static void Method_8068(int n, int n2) {
        if (Class_12440.Field_12673 && Class_16867.Method_16959() == (-1063746368 & 17081595)) {
            Class_16867.Method_16960(-1946102062 & 1114744290);
            Class_16867.Method_16963(n);
            Class_16867.Method_16960(-1719413309 & 67667175);
            Class_16867.Method_16963(n2);
            Class_16867.Method_16960(304832 & 871468225);
        }
    }

    public static Class_38187 Method_8069(Class_23424 class_23424) {
        Class_38187 class_38187 = class_23424.Field_23426;
        if (class_38187 == null) {
            int n = class_23424.Method_23432();
            class_38187 = (Class_38187)Field_8053.get(n);
            if (class_38187 == null) {
                class_38187 = new Class_38187(n, GL11.glGenTextures(), GL11.glGenTextures());
                Field_8053.put(n, class_38187);
            }
            class_23424.Field_23426 = class_38187;
        }
        return class_38187;
    }

    public static void Method_8070(Class_38187 class_38187, int[] arrn, int n, int n2, boolean bl, boolean bl2) {
        int n3 = bl ? 9767 & 9793 : -16756 & 9760;
        int n4 = bl2 ? 10504 & 10641 : 26905 & 10497;
        int n5 = n * n2;
        IntBuffer intBuffer = Class_8049.Method_8066(n5);
        intBuffer.clear();
        intBuffer.put(arrn, 10912 & -31738, n5).position(2096 & 21380).limit(n5);
        Class_16867.Method_16963(class_38187.Field_38188);
        GL11.glTexImage2D((int)(-16411 & 3579), (int)(26629 & -32462), (int)(7658 & -1256), (int)n, (int)n2, (int)(18434 & 12361), (int)(1620496609 & 269058297), (int)(-660565145 & 1091447), (IntBuffer)intBuffer);
        GL11.glTexParameteri((int)(3569 & -16405), (int)(10499 & -21815), (int)n3);
        GL11.glTexParameteri((int)(7665 & -21017), (int)(10260 & 26626), (int)n3);
        GL11.glTexParameteri((int)(24033 & 3567), (int)(14890 & -22506), (int)n4);
        GL11.glTexParameteri((int)(28129 & -29199), (int)(10247 & 30947), (int)n4);
        intBuffer.put(arrn, n5, n5).position(-31736 & 337).limit(n5);
        Class_16867.Method_16963(class_38187.Field_38189);
        GL11.glTexImage2D((int)(12281 & 3557), (int)(8448 & -32706), (int)(22984 & 15627), (int)n, (int)n2, (int)(0 & -23500), (int)(251953377 & 1079235041), (int)(-1070425241 & 822969343), (IntBuffer)intBuffer);
        GL11.glTexParameteri((int)(3553 & -23), (int)(-1843 & 10513), (int)n3);
        GL11.glTexParameteri((int)(-20503 & 24035), (int)(10808 & 27649), (int)n3);
        GL11.glTexParameteri((int)(-24599 & 19955), (int)(11523 & 14426), (int)n4);
        GL11.glTexParameteri((int)(32241 & 4073), (int)(-21885 & 10275), (int)n4);
        intBuffer.put(arrn, n5 * (-31990 & 8214), n5).position(53 & -32758).limit(n5);
        Class_16867.Method_16963(class_38187.Field_38190);
        GL11.glTexImage2D((int)(-29191 & 24033), (int)(16964 & 312), (int)(-8824 & 14684), (int)n, (int)n2, (int)(20482 & -30572), (int)(-2096587039 & 1148289253), (int)(906003303 & 1216779255), (IntBuffer)intBuffer);
        GL11.glTexParameteri((int)(3571 & 19945), (int)(-21405 & 31241), (int)n3);
        GL11.glTexParameteri((int)(4065 & -25117), (int)(10818 & 30724), (int)n3);
        GL11.glTexParameteri((int)(19937 & -25111), (int)(-1534 & 11426), (int)n4);
        GL11.glTexParameteri((int)(-29213 & 4077), (int)(10251 & 28067), (int)n4);
        Class_16867.Method_16963(class_38187.Field_38188);
    }

    public static int Method_8071(int n, BufferedImage bufferedImage, boolean bl, boolean bl2, Class_279 class_279, Class_2080 class_2080, Class_38187 class_38187) {
        int n2 = bufferedImage.getWidth();
        int n3 = bufferedImage.getHeight();
        int n4 = n2 * n3;
        int[] arrn = Class_8049.Method_8063(n4 * (-23069 & 6663));
        bufferedImage.getRGB(10256 & -32732, -30720 & 20646, n2, n3, arrn, -16039 & 8832, n2);
        Class_8049.Method_8076(class_279, class_2080, n2, n3, arrn);
        Class_8049.Method_8070(class_38187, arrn, n2, n3, bl, bl2);
        return n;
    }

    public static Class_2062 Method_8072() {
        Class_47630 class_47630 = new Class_47630(13441 & 531, -32759 & 2257);
        class_47630.Method_47637()[2240 & 1086] = -1 & -1;
        class_47630.Method_47635();
        return class_47630;
    }

    public static void Method_8073(Class_38187 class_38187) {
        Field_8056 = class_38187;
        if (Class_12440.Field_12673 && Class_16867.Method_16959() == (-1555917600 & 8505033)) {
            if (Class_12440.Field_12461) {
                Class_16867.Method_16960(537955522 & 1462273494);
                Class_16867.Method_16963(class_38187.Field_38189);
            }
            if (Class_12440.Field_12493) {
                Class_16867.Method_16960(-1734310461 & 1078124227);
                Class_16867.Method_16963(class_38187.Field_38190);
            }
            Class_16867.Method_16960(139572432 & 67143110);
        }
        Class_16867.Method_16963(class_38187.Field_38188);
    }

    public static void Method_8074(Class_38187 class_38187) {
        Class_8049.Method_8068(class_38187.Field_38189, class_38187.Field_38190);
    }

    public static void Method_8075(Class_279 class_279, Class_2080 class_2080, int n, int n2, int[] arrn, int n3, int n4) {
        int n5 = 0 & 25601;
        try {
            Class_9953 class_9953 = class_279.Method_282(class_2080);
            BufferedImage bufferedImage = ImageIO.read(class_9953.Method_9958());
            if (bufferedImage != null && bufferedImage.getWidth() == n && bufferedImage.getHeight() == n2) {
                bufferedImage.getRGB(456 & -24063, -25440 & 600, n, n2, arrn, n3, n);
                n5 = 4103 & 585;
            }
        }
        catch (IOException iOException) {
            // empty catch block
        }
        if (n5 == 0) {
            Arrays.fill(arrn, n3, n3 + n * n2, n4);
        }
    }

    public static void Method_8076(Class_279 class_279, Class_2080 class_2080, int n, int n2, int[] arrn) {
        if (Class_12440.Field_12461) {
            Class_8049.Method_8075(class_279, Class_8049.Method_8065(class_2080, "n"), n, n2, arrn, n * n2, -32769 & -8421377);
        }
        if (Class_12440.Field_12493) {
            Class_8049.Method_8075(class_279, Class_8049.Method_8065(class_2080, "s"), n, n2, arrn, n * n2 * (651 & -32474), 128 & 25612);
        }
    }

    public static void Method_8077(Class_2062 class_2062) {
        int n = class_2062.Method_2063();
        if (class_2062 instanceof Class_24069) {
            Class_12440.Field_12630 = ((Class_24069)class_2062).Field_24081;
            Class_12440.Field_12541 = ((Class_24069)class_2062).Field_24090;
            Class_8049.Method_8073(class_2062.Method_2064());
        } else {
            Class_12440.Field_12630 = 4128 & -23536;
            Class_12440.Field_12541 = -23424 & 2089;
            Class_8049.Method_8073(class_2062.Method_2064());
        }
    }

    public static int Method_8078(int n) {
        int n2 = n - (9541 & 513);
        n2 |= n2 >> (28673 & -32731);
        n2 |= n2 >> (91 & 22818);
        n2 |= n2 >> (-28620 & 1607);
        n2 |= n2 >> (-30648 & 18109);
        n2 |= n2 >> (1584 & -20336);
        return n2 + (-6073 & 289);
    }

    static void Method_8079() {
        Class_34695 class_34695 = Class_18.Field_89.Method_253();
        Class_2062 class_2062 = class_34695.Method_34709(Class_24069.Field_24084);
        if (class_2062 != null) {
            Class_38187 class_38187 = class_2062.Method_2064();
            Class_16867.Method_16963(class_38187.Field_38188);
            GL11.glTexParameteri((int)(15861 & 19937), (int)(-17909 & 10545), (int)Class_12440.Field_12637[Class_12440.Field_12486]);
            GL11.glTexParameteri((int)(-28695 & 15861), (int)(26694 & 10393), (int)Class_12440.Field_12551[Class_12440.Field_12462]);
            Class_16867.Method_16963(class_38187.Field_38189);
            GL11.glTexParameteri((int)(3571 & 3565), (int)(15409 & 10821), (int)Class_12440.Field_12637[Class_12440.Field_12446]);
            GL11.glTexParameteri((int)(-28703 & 3571), (int)(27658 & -18367), (int)Class_12440.Field_12551[Class_12440.Field_12479]);
            Class_16867.Method_16963(class_38187.Field_38190);
            GL11.glTexParameteri((int)(3561 & 7665), (int)(11275 & -22367), (int)Class_12440.Field_12637[Class_12440.Field_12678]);
            GL11.glTexParameteri((int)(20455 & -29215), (int)(28160 & -18432), (int)Class_12440.Field_12551[Class_12440.Field_12469]);
            Class_16867.Method_16963(258 & -30664);
        }
    }

    public static void Method_8080(Class_34695 class_34695, Class_2080 class_2080) {
        Class_24069 class_24069 = (Class_24069)class_34695.Method_34709(class_2080);
        Class_12440.Field_12630 = class_24069.Field_24081;
        Class_12440.Field_12541 = class_24069.Field_24090;
        Field_8055 = class_24069.\u0000strictfp();
        Class_8049.Method_8073(Field_8055);
    }

    public static void Method_8081(int n, int n2, int n3, Class_47630 class_47630) {
        Class_38187 class_38187 = class_47630.\u0000strictfp();
        int[] arrn = class_47630.Method_47637();
        int n4 = n2 * n3;
        Arrays.fill(arrn, n4, n4 * (519 & 18762), -8421377 & -8421377);
        Arrays.fill(arrn, n4 * (4770 & -8173), n4 * (-7997 & 283), 768 & 1040);
        Class_18695.Method_18715(class_38187.Field_38188, n2, n3);
        Class_18695.Method_18709((1334 & -16384) != 0, (-32736 & 25622) != 0);
        Class_18695.Method_18711((3090 & -12288) != 0);
        Class_18695.Method_18715(class_38187.Field_38189, n2, n3);
        Class_18695.Method_18709((8730 & 5153) != 0, (-32524 & 14345) != 0);
        Class_18695.Method_18711((27264 & 336) != 0);
        Class_18695.Method_18715(class_38187.Field_38190, n2, n3);
        Class_18695.Method_18709((20616 & 2564) != 0, (6912 & 8422) != 0);
        Class_18695.Method_18711((3238 & 13136) != 0);
        Class_16867.Method_16963(class_38187.Field_38188);
    }

    public static void Method_8082(int[] arrn, int n, int n2, int n3, int n4, int n5) {
        int n6 = n * n2;
        IntBuffer intBuffer = Class_8049.Method_8066(n6);
        intBuffer.clear();
        int n7 = n5 * n6;
        if (arrn.length >= n7 + n6) {
            intBuffer.put(arrn, n7, n6).position(4096 & -23805).limit(n6);
            GL11.glTexSubImage2D((int)(3569 & 32229), (int)(26722 & -28543), (int)n3, (int)n4, (int)n, (int)n2, (int)(1652590313 & 422568177), (int)(547521511 & 1145668479), (IntBuffer)intBuffer);
            intBuffer.clear();
        }
    }
}

