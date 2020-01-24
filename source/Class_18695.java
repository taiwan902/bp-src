/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  internal.org.lwjgl.BufferUtils
 *  internal.org.lwjgl.opengl.GL11
 *  org.apache.commons.io.IOUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import internal.org.lwjgl.BufferUtils;
import internal.org.lwjgl.opengl.GL11;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.ComponentColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.RenderedImage;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.InputStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.nio.Buffer;
import java.nio.IntBuffer;
import javax.imageio.ImageIO;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import sun.awt.image.ByteInterleavedRaster;
import sun.awt.image.IntegerInterleavedRaster;

public class Class_18695 {
    static int[] Field_18696;
    private static final IntBuffer Field_18697;
    public static final int[] Field_18698;
    static int Field_18699;
    private static final Logger Field_18700;
    private static final int[] Field_18701;
    public static final Class_47630 Field_18702;

    public static int Method_18703(int n, BufferedImage bufferedImage, boolean bl, boolean bl2) {
        Class_18695.Method_18715(n, bufferedImage.getWidth(), bufferedImage.getHeight());
        return Class_18695.Method_18714(n, bufferedImage, -30718 & 292, 1008 & 5134, bl, bl2);
    }

    public static void Method_18704(int n, int[] arrn, int n2, int n3) {
        Class_18695.Method_18729(n);
        Class_18695.Method_18723(24835 & 1224, arrn, n2, n3, 6676 & 16673, 8 & 24928, (2064 & 12576) != 0, (16584 & -28634) != 0, (12802 & 148) != 0);
    }

    public static int Method_18705() {
        return Class_16867.Method_16935();
    }

    public static int[] Method_18706(Class_279 class_279, Class_2080 class_2080) {
        BufferedImage bufferedImage = Class_18695.Method_18726(class_279.Method_282(class_2080).Method_9958());
        int n = bufferedImage.getWidth();
        int n2 = bufferedImage.getHeight();
        int[] arrn = new int[n * n2];
        bufferedImage.getRGB(2103 & -20480, 1668 & -32734, n, n2, arrn, 3082 & -8000, n);
        return arrn;
    }

    private static int[] Method_18707(ByteInterleavedRaster byteInterleavedRaster, ComponentColorModel componentColorModel, int n, int n2, int n3, int n4, int[] arrn, int n5, int n6) {
        block5 : {
            byte[] arrby;
            int n7;
            int n8;
            block4 : {
                n8 = n5;
                n7 = byteInterleavedRaster.getNumBands();
                arrby = new byte[n7];
                if (n7 != (25091 & 1187)) break block4;
                int n9 = n2;
                while (n9 < n2 + n4) {
                    int n10 = n8;
                    for (int i = n; i < n + n3; ++i) {
                        byteInterleavedRaster.getDataElements(i, n9, arrby);
                        arrn[n10++] = -6282748 & -15794174 | (arrby[53 & -11776] & (2559 & -15617)) << (-16303 & 8240) | (arrby[1 & -17367] & (17663 & -32001)) << (1196 & -28390) | arrby[-15869 & 3274] & (22783 & -24321);
                    }
                    ++n9;
                    n8 += n6;
                }
                break block5;
            }
            if (n7 != (1060 & -9913)) break block5;
            int n11 = n2;
            while (n11 < n2 + n4) {
                int n12 = n8;
                for (int i = n; i < n + n3; ++i) {
                    byteInterleavedRaster.getDataElements(i, n11, arrby);
                    arrn[n12++] = (arrby[439 & 15363] & (-27137 & 2815)) << (26 & -14116) | (arrby[16464 & 8968] & (16895 & 7423)) << (15384 & 18) | (arrby[6221 & 1] & (1279 & 16895)) << (24584 & -30245) | arrby[-32094 & 13318] & (1279 & -31745);
                }
                ++n11;
                n8 += n6;
            }
        }
        return arrn;
    }

    public static int[][] Method_18708(int n, int n2, int[][] arrn) {
        int[][] arrarrn = new int[n + (673 & 85)][];
        arrarrn[11781 & 16640] = arrn[1154 & -20432];
        if (n > 0) {
            int n3;
            boolean bl = 20656 & 9477;
            for (n3 = -31656 & 16676; n3 < arrn.length; ++n3) {
                if (arrn[19992 & 8224][n3] >> (24 & 7964) != 0) continue;
                bl = 20993 & 261;
                break;
            }
            for (n3 = 6145 & -31871; n3 <= n; ++n3) {
                if (arrn[n3] != null) {
                    arrarrn[n3] = arrn[n3];
                    continue;
                }
                int[] arrn2 = arrarrn[n3 - (19075 & 9245)];
                int[] arrn3 = new int[arrn2.length >> (1538 & 4147)];
                int n4 = n2 >> n3;
                int n5 = arrn3.length / n4;
                int n6 = n4 << (-30387 & 8225);
                for (int i = 12875 & -29408; i < n4; ++i) {
                    for (int j = -5120 & 4609; j < n5; ++j) {
                        int n7 = (2199 & -7870) * (i + j * n6);
                        arrn3[i + j * n4] = Class_18695.Method_18721(arrn2[n7 + (-31312 & 512)], arrn2[n7 + (8197 & -30599)], arrn2[n7 + (5432 & -24573) + n6], arrn2[n7 + (16385 & -32507) + n6], bl);
                    }
                }
                arrarrn[n3] = arrn3;
            }
        }
        return arrarrn;
    }

    static {
        Field_18700 = LogManager.getLogger();
        Field_18697 = Class_11552.Method_11558(451986064 & -2142371584);
        Field_18702 = new Class_47630(-32612 & 1138, 2196 & 26202);
        Field_18698 = Field_18702.Method_47637();
        Field_18699 = 559079492 & -801046480;
        Field_18696 = new int[402719494 & -1072460704];
        int n = -12582875 & -6796160;
        int n2 = -219912 & -504840;
        int[] arrn = new int[-22515 & 8];
        arrn[8370 & -32512] = -260360 & -511751;
        arrn[549 & 20483] = -261639 & -382728;
        arrn[17411 & 10278] = -519943 & -507142;
        arrn[-7993 & 3107] = -506632 & -353543;
        arrn[2324 & -28668] = -390914 & -261895;
        arrn[-12107 & 8461] = -515846 & -189192;
        arrn[18830 & 8230] = -228103 & -515332;
        arrn[1591 & -32433] = -524040 & -229128;
        int[] arrn2 = arrn;
        int[] arrn3 = new int[75 & 4620];
        arrn3[1411 & 4616] = -15330688 & -16250600;
        arrn3[-30715 & 9329] = -12576620 & -16710654;
        arrn3[16386 & 10547] = -14270176 & -2553663;
        arrn3[13347 & -29941] = -16708608 & -14417823;
        arrn3[4358 & -8172] = -7042300 & -10283888;
        arrn3[3623 & 133] = -5623661 & -15677944;
        arrn3[4142 & -22265] = -12054512 & -14352310;
        arrn3[-32185 & 8223] = -16378880 & -15613303;
        int[] arrn4 = arrn3;
        int n3 = arrn2.length;
        for (int i = 13601 & -14140; i < (-22286 & 4624); ++i) {
            System.arraycopy(i < n3 ? arrn2 : arrn4, 20513 & 1346, Field_18698, (2360 & 9234) * i, n3);
            System.arraycopy(i < n3 ? arrn4 : arrn2, 12864 & -32736, Field_18698, (27441 & 82) * i + n3, n3);
        }
        Field_18702.Method_47635();
        Field_18701 = new int[38 & 19477];
    }

    public static void Method_18709(boolean bl, boolean bl2) {
        if (bl) {
            GL11.glTexParameteri((int)(11747 & -28699), (int)(-22507 & 14699), (int)(bl2 ? -6237 & 10051 : 26115 & 9877));
            GL11.glTexParameteri((int)(7649 & 4081), (int)(-22421 & 10900), (int)(9769 & -20863));
        } else {
            int n = Class_19426.Method_19513();
            GL11.glTexParameteri((int)(15849 & 19937), (int)(31509 & -22525), (int)(bl2 ? n : 9944 & 28165));
            GL11.glTexParameteri((int)(3557 & 3553), (int)(10410 & 15892), (int)(13972 & -6654));
        }
    }

    public static void Method_18710(int[] arrn, int n, int n2) {
        int[] arrn2 = new int[n];
        int n3 = n2 / (5250 & 8707);
        for (int i = -32000 & 5128; i < n3; ++i) {
            System.arraycopy(arrn, i * n, arrn2, 521 & 4, n);
            System.arraycopy(arrn, (n2 - (17729 & -32631) - i) * n, arrn, i * n, n);
            System.arraycopy(arrn2, 4484 & 16386, arrn, (n2 - (8225 & 2115) - i) * n, n);
        }
    }

    public static void Method_18711(boolean bl) {
        if (bl) {
            GL11.glTexParameteri((int)(-12815 & 12265), (int)(10754 & 14414), (int)(71406527 & 1358998831));
            GL11.glTexParameteri((int)(3553 & 4069), (int)(15367 & -22317), (int)(9999151 & 69706031));
        } else {
            GL11.glTexParameteri((int)(28129 & 7669), (int)(10266 & 10883), (int)(11173 & 10571));
            GL11.glTexParameteri((int)(-29199 & 19937), (int)(14883 & 10387), (int)(11689 & -22205));
        }
    }

    public static void Method_18712(int[][] arrn, int n, int n2, int n3, int n4, boolean bl, boolean bl2) {
        for (int i = -12085 & 11268; i < arrn.length; ++i) {
            int[] arrn2 = arrn[i];
            Class_18695.Method_18723(i, arrn2, n >> i, n2 >> i, n3 >> i, n4 >> i, bl, bl2, (arrn.length > (9281 & 2575) ? 16581 & 2825 : 16544 & -29694) != 0);
        }
    }

    public static int Method_18713(int n, BufferedImage bufferedImage) {
        return Class_18695.Method_18703(n, bufferedImage, (16 & 76) != 0, (28002 & -32768) != 0);
    }

    public static int Method_18714(int n, BufferedImage bufferedImage, int n2, int n3, boolean bl, boolean bl2) {
        Class_18695.Method_18729(n);
        Class_18695.Method_18728(bufferedImage, n2, n3, bl, bl2);
        return n;
    }

    public static void Method_18715(int n, int n2, int n3) {
        Class_18695.Method_18727(n, 24756 & 4361, n2, n3);
    }

    public static int[] Method_18716(int[] arrn) {
        int[] arrn2 = new int[arrn.length];
        for (int i = 264 & 18594; i < arrn.length; ++i) {
            arrn2[i] = Class_18695.Method_18719(arrn[i]);
        }
        return arrn2;
    }

    private static void Method_18717(int[] arrn, int n, int n2) {
        int[] arrn2 = arrn;
        if (Class_18.Field_89.Field_84.Field_39747) {
            arrn2 = Class_18695.Method_18716(arrn);
        }
        Field_18697.clear();
        Field_18697.put(arrn2, n, n2);
        Field_18697.position(1728 & -20462).limit(n2);
    }

    public static void Method_18718(String string, int n, int n2, int n3, int n4) {
        Class_18695.Method_18729(n);
        GL11.glPixelStorei((int)(11551 & 3461), (int)(6457 & 1153));
        GL11.glPixelStorei((int)(31997 & -29451), (int)(2693 & 5169));
        for (int i = 0 & 9560; i <= n2; ++i) {
            File file = new File(string + "_" + i + ".png");
            int n5 = n3 >> i;
            int n6 = n4 >> i;
            int n7 = n5 * n6;
            IntBuffer intBuffer = BufferUtils.createIntBuffer((int)n7);
            int[] arrn = new int[n7];
            GL11.glGetTexImage((int)(3553 & -16911), (int)i, (int)(537102049 & 8698337), (int)(-469138561 & 427996007), (IntBuffer)intBuffer);
            intBuffer.get(arrn);
            BufferedImage bufferedImage = new BufferedImage(n5, n6, -30942 & 16387);
            bufferedImage.setRGB(1062 & -6072, -32240 & 4353, n5, n6, arrn, 616 & -25340, n5);
            try {
                ImageIO.write((RenderedImage)bufferedImage, "png", file);
                Object[] arrobject = new Object[127 & 257];
                arrobject[-16380 & 889] = file.getAbsolutePath();
                Field_18700.debug("Exported png to: {}", arrobject);
                continue;
            }
            catch (Exception exception) {
                Field_18700.debug("Unable to write: ", (Throwable)exception);
            }
        }
    }

    public static int Method_18719(int n) {
        int n2 = n >> (-30664 & 16472) & (9471 & -26369);
        int n3 = n >> (-32752 & 1428) & (24831 & -27137);
        int n4 = n >> (8712 & 17481) & (-31233 & 255);
        int n5 = n & (-24065 & 4351);
        int n6 = (n3 * (-25538 & 16414) + n4 * (1343 & 24763) + n5 * (63 & -16885)) / (-32659 & 8308);
        int n7 = (n3 * (6494 & 8254) + n4 * (16887 & 8270)) / (9327 & -32412);
        int n8 = (n3 * (9310 & 18494) + n5 * (5831 & 350)) / (1380 & 101);
        return n2 << (1084 & 4762) | n6 << (16400 & 8592) | n7 << (3146 & -12135) | n8;
    }

    public static void Method_18720(int n) {
        Class_16867.Method_16964(n);
    }

    private static int Method_18721(int n, int n2, int n3, int n4, boolean bl) {
        return Class_19348.Method_19351(n, n2, n3, n4);
    }

    private static void Method_18722(boolean bl) {
        Class_18695.Method_18709(bl, (1472 & 2059) != 0);
    }

    private static void Method_18723(int n, int[] arrn, int n2, int n3, int n4, int n5, boolean bl, boolean bl2, boolean bl3) {
        int n6;
        int n7 = (542679552 & -1864363769) / n2;
        Class_18695.Method_18709(bl, bl3);
        Class_18695.Method_18711(bl2);
        for (int i = -32744 & 24608; i < n2 * n3; i += n2 * n6) {
            int n8 = i / n2;
            n6 = Math.min(n7, n3 - n8);
            int n9 = n2 * n6;
            Class_18695.Method_18717(arrn, i, n9);
            GL11.glTexSubImage2D((int)(4083 & 7653), (int)n, (int)n4, (int)(n5 + n8), (int)n2, (int)n6, (int)(33604065 & 481137383), (int)(637569895 & -1065307161), (IntBuffer)Field_18697);
        }
    }

    private static int[] Method_18724(IntegerInterleavedRaster integerInterleavedRaster, DirectColorModel directColorModel, int n, int n2, int n3, int n4, int[] arrn, int n5, int n6) {
        block5 : {
            int[] arrn2;
            int n7;
            int n8;
            block4 : {
                n8 = n5;
                n7 = integerInterleavedRaster.getNumBands();
                arrn2 = new int[n7];
                if (n7 != (211 & 17923)) break block4;
                int n9 = n2;
                while (n9 < n2 + n4) {
                    int n10 = n8;
                    for (int i = n; i < n + n3; ++i) {
                        integerInterleavedRaster.getDataElements(i, n9, arrn2);
                        arrn[n10++] = arrn2[8528 & 2565];
                    }
                    ++n9;
                    n8 += n6;
                }
                break block5;
            }
            if (n7 != (16452 & 4615)) break block5;
            int n11 = n2;
            while (n11 < n2 + n4) {
                int n12 = n8;
                for (int i = n; i < n + n3; ++i) {
                    integerInterleavedRaster.getDataElements(i, n11, arrn2);
                    arrn[n12++] = arrn2[4624 & -32345];
                }
                ++n11;
                n8 += n6;
            }
        }
        return arrn;
    }

    private void Method_18725() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public static BufferedImage Method_18726(InputStream inputStream) {
        BufferedImage bufferedImage;
        try {
            bufferedImage = ImageIO.read(inputStream);
        }
        finally {
            IOUtils.closeQuietly((InputStream)inputStream);
        }
        return bufferedImage;
    }

    public static void Method_18727(int n, int n2, int n3, int n4) {
        Class_18695.Method_18720(n);
        Class_18695.Method_18729(n);
        if (n2 >= 0) {
            GL11.glTexParameteri((int)(19939 & 12273), (int)(-2029929603 & 417382719), (int)n2);
            GL11.glTexParameterf((int)(19937 & 11753), (int)(1210754362 & -1610317318), (float)0.0f);
            GL11.glTexParameterf((int)(-25095 & 20449), (int)(335579515 & 1124959547), (float)n2);
            GL11.glTexParameterf((int)(3569 & -20507), (int)(1141146891 & 956941777), (float)0.0f);
        }
        for (int i = -24571 & 4632; i <= n2; ++i) {
            GL11.glTexImage2D((int)(11755 & -12831), (int)i, (int)(7624 & 31002), (int)(n3 >> i), (int)(n4 >> i), (int)(-31708 & 10898), (int)(270303457 & 94421473), (int)(410560375 & -1593801745), (IntBuffer)null);
        }
    }

    private static void Method_18728(BufferedImage bufferedImage, int n, int n2, boolean bl, boolean bl2) {
        int n3;
        int n4 = bufferedImage.getWidth();
        int n5 = bufferedImage.getHeight();
        int n6 = Field_18699 / n4;
        int n7 = n6 * n4;
        for (n3 = Class_18695.Field_18696.length; n3 < n7; n3 *= 18966 & -31734) {
        }
        if (n3 != Field_18696.length) {
            Field_18696 = new int[n3];
        }
        Class_18695.Method_18722(bl);
        Class_18695.Method_18711(bl2);
        for (int i = 7499 & 8224; i < n4 * n5; i += n4 * n6) {
            int n8 = i / n4;
            int n9 = Math.min(n6, n5 - n8);
            int n10 = n4 * n9;
            if (bufferedImage.getRaster() instanceof ByteInterleavedRaster && bufferedImage.getColorModel() instanceof ComponentColorModel) {
                Class_18695.Method_18707((ByteInterleavedRaster)bufferedImage.getRaster(), (ComponentColorModel)bufferedImage.getColorModel(), -32736 & 16392, n8, n4, n9, Field_18696, 2064 & 14025, n4);
            } else if (bufferedImage.getRaster() instanceof IntegerInterleavedRaster && bufferedImage.getColorModel() instanceof DirectColorModel) {
                Class_18695.Method_18724((IntegerInterleavedRaster)bufferedImage.getRaster(), (DirectColorModel)bufferedImage.getColorModel(), 13443 & 2128, n8, n4, n9, Field_18696, 8332 & 2128, n4);
            } else {
                bufferedImage.getRGB(10281 & 16388, n8, n4, n9, Field_18696, 28928 & 1148, n4);
            }
            Class_18695.Method_18730(Field_18696, n10);
            GL11.glTexSubImage2D((int)(15869 & 19937), (int)(1785 & -32764), (int)n, (int)(n2 + n8), (int)n4, (int)n9, (int)(673222113 & 1409909489), (int)(-2011528329 & 1921024879), (IntBuffer)Field_18697);
        }
    }

    static void Method_18729(int n) {
        Class_16867.Method_16963(n);
    }

    private static void Method_18730(int[] arrn, int n) {
        Class_18695.Method_18717(arrn, 8202 & -28016, n);
    }
}

