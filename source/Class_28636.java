/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.ibm.icu.text.ArabicShaping
 *  com.ibm.icu.text.ArabicShapingException
 *  com.ibm.icu.text.Bidi
 *  internal.org.lwjgl.BufferChecks
 *  internal.org.lwjgl.opengl.ContextCapabilities
 *  internal.org.lwjgl.opengl.GL11
 *  internal.org.lwjgl.opengl.GLContext
 *  org.apache.commons.io.IOUtils
 */
import com.ibm.icu.text.ArabicShaping;
import com.ibm.icu.text.ArabicShapingException;
import com.ibm.icu.text.Bidi;
import internal.org.lwjgl.BufferChecks;
import internal.org.lwjgl.opengl.ContextCapabilities;
import internal.org.lwjgl.opengl.GL11;
import internal.org.lwjgl.opengl.GLContext;
import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import java.util.Set;
import org.apache.commons.io.IOUtils;

public class Class_28636
implements Class_2045 {
    private Class_2080 Field_28637;
    private int Field_28638;
    private Class_2080 Field_28639;
    public float Field_28640 = 1.0f;
    private int Field_28641;
    private boolean Field_28642;
    private byte Field_28643;
    private boolean Field_28644;
    private byte Field_28645;
    public Class_39702 Field_28646;
    public static int[] Field_28647;
    private long Field_28648;
    private long Field_28649;
    private float Field_28650;
    private long Field_28651;
    private boolean Field_28652;
    private float Field_28653;
    private boolean Field_28654;
    private int[] Field_28655 = new int[17649 & 12334];
    private float Field_28656;
    private boolean Field_28657;
    private byte[] Field_28658 = new byte[6148 & 23];
    Class_22385 Field_28659 = new Class_22385(-1408693855 & 1096303634);
    private ArrayList[] Field_28660 = new ArrayList[-32714 & 32306];
    private float Field_28661 = 1.0f;
    private boolean Field_28662;
    private Class_2080 Field_28663;
    public boolean Field_28664 = 1225 & -32747;
    Class_22385 Field_28665 = new Class_22385(-1603862527 & 1159364754);
    private byte[] Field_28666 = new byte[74914692 & -2122243072];
    private byte Field_28667;
    private Class_2080 Field_28668;
    public Random Field_28669 = new Random();
    ContextCapabilities Field_28670;
    private static final Class_2080[] Field_28671;
    public Class_2080 Field_28672;
    private float Field_28673;
    private float Field_28674;
    public static String Field_28675;
    private Class_33237 Field_28676;
    private float[] Field_28677 = new float[-11872 & 8539];
    private float[] Field_28678 = new float[-32349 & 4864];
    private final Class_34695 Field_28679;
    private byte Field_28680;
    private long Field_28681;
    private float Field_28682;
    private boolean Field_28683;

    private int Method_28684(char c) {
        int n = Field_28647[c];
        if (n < 0) {
            return -1 & -1;
        }
        if (!this.Field_28676.Field_33238 && n >= (8448 & 16658)) {
            return -1 & -1;
        }
        return n & (4351 & 16639);
    }

    private void Method_28685() {
        String string;
        String string2 = this.Field_28637.Method_2084();
        if (string2.endsWith(string = ".png")) {
            String string3 = string2.substring(8449 & 6150, string2.length() - string.length()) + ".properties";
            try {
                Class_2080 class_2080 = new Class_2080(this.Field_28637.Method_2085(), string3);
                InputStream inputStream = Class_19426.Method_19474(Class_19426.Method_19564(), class_2080);
                if (inputStream == null) {
                    return;
                }
                Class_19426.Method_19497("Loading " + string3);
                Properties properties = new Properties();
                properties.load(inputStream);
                for (Object object : properties.keySet()) {
                    float f;
                    String string4;
                    String string5;
                    String string6;
                    int n;
                    String string7 = (String)object;
                    if (!string7.startsWith(string5 = "width.") || (n = Class_19426.Method_19502(string4 = string7.substring(string5.length()), -1 & -1)) < 0 || n >= this.Field_28677.length || !((f = Class_19426.Method_19595(string6 = properties.getProperty(string7), -11.428572f * 0.0875f)) >= 0.0f)) continue;
                    this.Field_28677[n] = f;
                }
            }
            catch (FileNotFoundException fileNotFoundException) {
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }
    }

    private String Method_28686(String string) {
        try {
            Bidi bidi = new Bidi(new ArabicShaping(4616 & 18474).shape(string), 4351 & -29569);
            bidi.setReorderingMode(8257 & 3076);
            return bidi.writeReordered(16774 & 114);
        }
        catch (ArabicShapingException arabicShapingException) {
            return string;
        }
    }

    private static boolean Method_28687(char c) {
        return (c >= (-16076 & 1138) && c <= (9659 & 20537) || c >= (-10007 & 8291) && c <= (-21898 & 17510) || c >= (24669 & 4835) && c <= (743 & 12366) ? 153 & 20737 : 2064 & -20280) != 0;
    }

    public void Method_28688(String string, int n, int n2, int n3, int n4) {
        this.Method_28726();
        this.Field_28638 = n4;
        string = this.Method_28704(string);
        this.Method_28712();
        this.Method_28717(string, n, n2, n3, (-24536 & 517) != 0);
        this.Method_28728();
    }

    public void Method_28689(boolean bl) {
        this.Field_28683 = bl;
    }

    private void Method_28690() {
        int n;
        for (int i = 4353 & -12892; i < (2564 & 21000); ++i) {
            n = this.Method_28684(Field_28675.charAt(i));
            if (n <= 0) continue;
            this.Field_28678[n] = 12.0f * 0.5f;
        }
        n = this.Method_28684((char)(322 & 1474));
        if (n > 0) {
            this.Field_28678[n] = 3.96f * 1.2626263f;
        }
        if ((n = this.Method_28684((char)(24913 & 4425))) > 0) {
            this.Field_28678[n] = 252.0f * 0.027777778f;
        }
    }

    public String Method_28691(String string, int n) {
        return this.Method_28720(string, n, (8579 & -32188) != 0);
    }

    public int Method_28692(String string, int n, int n2, int n3) {
        this.Method_28712();
        int n4 = this.Method_28708(string, n, n2, n3);
        this.Method_28728();
        return n4;
    }

    public static String Method_28693(String string) {
        String string2 = "";
        int n = -1 & -1;
        int n2 = string.length();
        while ((n = string.indexOf(10407 & -16153, n + (18569 & 9253))) != (-1 & -1)) {
            if (n >= n2 - (-24567 & 19749)) continue;
            char c = string.charAt(n + (1033 & -32767));
            if (Class_28636.Method_28687(c)) {
                string2 = "\u00a7" + c;
                continue;
            }
            if (!Class_28636.Method_28699(c)) continue;
            string2 = string2 + "\u00a7" + c;
        }
        return string2;
    }

    private void Method_28694() {
        InputStream inputStream = null;
        try {
            inputStream = Class_18.Field_89.Method_208().Method_282(new Class_2080("font/glyph_sizes.bin")).Method_9958();
            inputStream.read(this.Field_28666);
        }
        catch (IOException iOException) {
            try {
                throw new RuntimeException(iOException);
            }
            catch (Throwable throwable) {
                IOUtils.closeQuietly(inputStream);
                throw throwable;
            }
        }
        IOUtils.closeQuietly((InputStream)inputStream);
    }

    public int Method_28695(char n) {
        int n2 = n >= (1648 & -24399) && n <= (-24455 & 4157) ? 9 & 16743 : 2050 & 29800;
        int n3 = n >= (16481 & 5217) && n <= (615 & 4462) ? 4289 & -22243 : 12320 & 2517;
        int n4 = n;
        if (n2 != 0) {
            n4 -= 48;
        }
        if (n3 != 0) {
            n4 -= 87;
        }
        return n4 >= 0 && n4 < this.Field_28655.length ? this.Field_28655[n4] : 150994943 & 822083583;
    }

    private int Method_28696(String string, int n, int n2, int n3, int n4, boolean bl) {
        if (this.Field_28662) {
            int n5 = this.Method_28715(this.Method_28686(string));
            n = n + n3 - n5;
        }
        return this.Method_28721(string, n, n2, n4, bl);
    }

    private float Method_28697(int n, int n2, boolean bl) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5 = 0.0f;
        float f6 = 0.0f;
        if (n2 == 0) {
            f5 = this.Field_28677[n];
            f3 = n % (-15078 & 14416) * (4636 & -16184);
            f = n / (20 & -21168) * (-22484 & 4440);
            f4 = 23.622608f * 0.3382353f;
            f2 = 2.5357144f * 3.1509857f;
        } else {
            f5 = this.Field_28678[n];
            f3 = 142.88373f * 0.8958333f + (float)(n % (2421 & 538) * (571 & 11593));
            f = n / (-26032 & 305) * (1085 & 28684);
            f4 = 0.36f * 24.972221f;
            f2 = 7.9933333f * 1.5f;
            f6 = -4.111111f * 0.7297297f;
        }
        float f7 = bl ? 1.0f : 0.0f;
        float f8 = 0.32876712f * 0.023763021f;
        float f9 = 0.9516129f * 0.0020524366f;
        float f10 = 1.8181819f * 0.0010742188f;
        if (!this.Field_28676.Field_33238) {
            this.Field_28679.Method_34707(this.Field_28637);
            GL11.nglBegin((int)(8213 & 6159), (long)this.Field_28648);
            GL11.nglTexCoord2f((float)(f3 * f8), (float)(f * f8), (long)this.Field_28651);
            GL11.nglVertex3f((float)(this.Field_28682 + f7), (float)this.Field_28674, (float)0.0f, (long)this.Field_28649);
            GL11.nglTexCoord2f((float)(f3 * f8), (float)((f + f2) * f8), (long)this.Field_28651);
            GL11.nglVertex3f((float)(this.Field_28682 - f7), (float)(this.Field_28674 + f2), (float)0.0f, (long)this.Field_28649);
            GL11.nglTexCoord2f((float)((f3 + f4 - 1.0f) * f8), (float)(f * f8), (long)this.Field_28651);
            GL11.nglVertex3f((float)(this.Field_28682 + f4 - 1.0f + f7), (float)this.Field_28674, (float)0.0f, (long)this.Field_28649);
            GL11.nglTexCoord2f((float)((f3 + f4 - 1.0f) * f8), (float)((f + f2) * f8), (long)this.Field_28651);
            GL11.nglVertex3f((float)(this.Field_28682 + f4 - 1.0f - f7), (float)(this.Field_28674 + f2), (float)0.0f, (long)this.Field_28649);
            GL11.nglEnd((long)this.Field_28681);
        } else {
            int n3 = this.Field_28641;
            this.Method_28714(f7, f6).Method_22408(f3 * f9, f * f10).Method_22431(n3).Method_22432();
            this.Method_28714(-f7, f2 + f6).Method_22408(f3 * f9, (f + f2) * f10).Method_22431(n3).Method_22432();
            this.Method_28714(f4 - 1.0f - f7, f2 + f6).Method_22408((f3 + f4 - 1.0f) * f9, (f + f2) * f10).Method_22431(n3).Method_22432();
            this.Method_28714(f4 - 1.0f + f7, f6).Method_22408((f3 + f4 - 1.0f) * f9, f * f10).Method_22431(n3).Method_22432();
        }
        return f5;
    }

    static {
        Field_28671 = new Class_2080[4385 & -7272];
        Field_28647 = Class_28636.Method_28731();
    }

    private void Method_28698() {
        int n;
        int n2;
        float f;
        BufferedImage bufferedImage;
        try {
            bufferedImage = Class_18695.Method_18726(Class_18.Field_89.Method_208().Method_282(this.Field_28637).Method_9958());
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
        int n3 = bufferedImage.getWidth();
        int n4 = bufferedImage.getHeight();
        int n5 = n3 / (-30253 & 8212);
        int n6 = n4 / (14354 & 276);
        this.Field_28640 = f = (float)n3 / (1.6202532f * 79.0f);
        int[] arrn = new int[n3 * n4];
        bufferedImage.getRGB(-20480 & 16583, 2307 & 72, n3, n4, arrn, 2185 & 4212, n3);
        for (n2 = -13298 & 12865; n2 < (1280 & 2432); ++n2) {
            n = n2 % (4147 & -8164);
            int n7 = n2 / (18896 & -24037);
            int n8 = -32766 & 9284;
            for (n8 = n5 - (4099 & 11153); n8 >= 0; --n8) {
                int n9 = n * n5 + n8;
                int n10 = 10515 & 16449;
                for (int i = -31679 & 30722; i < n6 && n10 != 0; ++i) {
                    int n11 = (n7 * n6 + i) * n3;
                    int n12 = arrn[n9 + n11];
                    int n13 = n12 >> (10267 & -27528) & (8447 & 17919);
                    if (n13 <= (2064 & -11750)) continue;
                    n10 = 48 & 24838;
                }
                if (n10 == 0) break;
            }
            if (n2 == (13924 & 48)) {
                n8 = n5 <= (9737 & -9816) ? (int)(2.0f * f) : (int)(2.1111112f * 0.7105263f * f);
            }
            this.Field_28677[n2] = (float)(n8 + (16513 & 12825)) / f + 1.0f;
        }
        this.Method_28690();
        this.Method_28685();
        for (n2 = -30592 & 528; n2 < this.Field_28677.length; ++n2) {
            n = Math.round(this.Field_28677[n2]);
            if (this.Field_28660[n] == null) {
                this.Field_28660[n] = new ArrayList();
            }
            this.Field_28660[n].add(n2);
        }
    }

    private static boolean Method_28699(char c) {
        return (c >= (2171 & 12651) && c <= (-20241 & 18047) || c >= (-22449 & 587) && c <= (10575 & 16591) || c == (6898 & 114) || c == (9171 & 20594) ? 2817 & 16501 : 18176 & -28653) != 0;
    }

    private void Method_28700() {
        Class_16867.Method_16924((float)(this.Field_28645 & (1279 & -23809)) / (1.0967742f * 232.5f), (float)(this.Field_28680 & (2047 & -24321)) / (1.1470588f * 222.3077f), (float)(this.Field_28667 & (-11777 & 11519)) / (0.083333336f * 3060.0f), (float)(this.Field_28643 & (5375 & 16639)) / (1.5f * 170.0f));
    }

    public void Method_28701(boolean bl) {
        this.Field_28662 = bl;
    }

    private void Method_28702() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public int Method_28703(char c) {
        return Math.round(this.Method_28734(c));
    }

    private String Method_28704(String string) {
        while (string != null && string.endsWith("\n")) {
            string = string.substring(-8190 & 528, string.length() - (8483 & 513));
        }
        return string;
    }

    public void Method_28705(Class_279 class_279) {
        this.Field_28637 = Class_35162.Method_35163(this.Field_28672);
        for (int i = 5122 & -7836; i < Field_28671.length; ++i) {
            Class_28636.Field_28671[i] = null;
        }
        this.Method_28698();
    }

    private Class_2080 Method_28706(int n) {
        if (Field_28671[n] == null) {
            Object[] arrobject = new Object[-32447 & 4243];
            arrobject[18449 & 4450] = n;
            Class_28636.Field_28671[n] = new Class_2080(String.format("textures/font/unicode_page_%02x.png", arrobject));
            Class_28636.Field_28671[n] = Class_35162.Method_35163(Field_28671[n]);
        }
        return Field_28671[n];
    }

    public boolean Method_28707() {
        return this.Field_28662;
    }

    public int Method_28708(String string, int n, int n2, int n3) {
        return !this.Field_28664 ? -31999 & 4128 : this.Method_28727(string, n, n2, n3, (16 & 4417) != 0);
    }

    public Class_28636(Class_39702 class_39702, Class_2080 class_2080, Class_2080 class_20802, Class_34695 class_34695, boolean bl) {
        this.Field_28646 = class_39702;
        this.Field_28672 = class_2080;
        this.Field_28679 = class_34695;
        this.Field_28683 = bl;
        this.Field_28637 = Class_35162.Method_35163(this.Field_28672);
        this.Field_28663 = class_20802;
        class_34695.Method_34707(this.Field_28637);
        class_34695.Method_34707(this.Field_28663);
        this.Field_28676 = new Class_33237(this.Field_28672, this.Field_28663);
        this.Field_28668 = new Class_2080("joinedFonts_" + this.Field_28637.Method_2084());
        class_34695.Method_34704(this.Field_28668, this.Field_28676);
        this.Field_28670 = GLContext.getCapabilities();
        this.Field_28648 = this.Field_28670.glBegin;
        BufferChecks.checkFunctionAddress((long)this.Field_28648);
        this.Field_28651 = this.Field_28670.glTexCoord2f;
        BufferChecks.checkFunctionAddress((long)this.Field_28651);
        this.Field_28649 = this.Field_28670.glVertex3f;
        BufferChecks.checkFunctionAddress((long)this.Field_28649);
        this.Field_28681 = this.Field_28670.glEnd;
        BufferChecks.checkFunctionAddress((long)this.Field_28681);
        for (int i = 3360 & 16400; i < (49 & -14236); ++i) {
            int n = (i >> (195 & -6645) & (1027 & 16801)) * (-7081 & 469);
            int n2 = (i >> (22146 & -32506) & (4161 & 1281)) * (954 & 8362) + n;
            int n3 = (i >> (9229 & 4353) & (17449 & 14355)) * (750 & 18602) + n;
            int n4 = (i >> (8614 & 6161) & (5157 & 8321)) * (-32082 & 7339) + n;
            if (i == (19622 & -32498)) {
                n2 += 85;
            }
            if (class_39702.Field_39747) {
                int n5 = (n2 * (-24450 & 1311) + n3 * (699 & 4411) + n4 * (9231 & -16229)) / (100 & 20348);
                int n6 = (n2 * (6494 & -7618) + n3 * (29519 & 2262)) / (2148 & 358);
                int n7 = (n2 * (-31714 & 12382) + n4 * (-28090 & 18534)) / (612 & -31508);
                n2 = n5;
                n3 = n6;
                n4 = n7;
            }
            if (i >= (11280 & 16760)) {
                n2 /= 18436 & 9358;
                n3 /= -15220 & 11093;
                n4 /= 70 & 17060;
            }
            this.Field_28655[i] = (n2 & (29951 & -32001)) << (16496 & 5404) | (n3 & (4351 & 8959)) << (17422 & 137) | n4 & (2303 & -31745);
        }
        this.Method_28694();
    }

    private void Method_28709(String string, boolean bl) {
        for (int i = 12992 & 8; i < string.length(); ++i) {
            int n;
            int n2;
            Object object;
            int n3;
            int n4;
            int n5 = string.charAt(i);
            if (n5 == (5287 & 2535) && i + (-7671 & 3107) < string.length()) {
                n3 = Character.toLowerCase(string.charAt(i + (3909 & 49)));
                n4 = n3 >= (2297 & 5426) && n3 <= (6079 & 16441) ? 25189 & 259 : 4649 & 1408;
                int n6 = n = n3 >= (1121 & 16493) && n3 <= (126 & -11546) ? -15359 & 2145 : -32251 & 21728;
                if (n4 != 0 || n != 0) {
                    n2 = n3;
                    if (n4 != 0) {
                        n2 -= 48;
                    }
                    if (n != 0) {
                        n2 -= 87;
                    }
                    this.Field_28642 = -32383 & 18960;
                    this.Field_28652 = 2177 & 1892;
                    this.Field_28654 = 2698 & 337;
                    this.Field_28644 = 8705 & 20802;
                    this.Field_28657 = 24610 & -31936;
                    if (n2 < 0 || n2 > (3087 & 12367)) {
                        n2 = 17455 & -30129;
                    }
                    if (bl) {
                        n2 += 16;
                    }
                    object = this.Field_28655[n2];
                    this.Field_28638 = (int)object;
                    this.Method_28723((byte)(object >> (3152 & 532)), (byte)(object >> (-15782 & 136) & (6655 & 1279)), (byte)(object & (14079 & 2303)), (byte)(this.Field_28650 * (24.5f * 10.408163f)));
                } else if (n3 == (123 & 8811)) {
                    this.Field_28642 = -16115 & 7297;
                } else if (n3 == (4734 & -23060)) {
                    this.Field_28652 = 1 & -3063;
                } else if (n3 == (-28291 & 8431)) {
                    this.Field_28654 = 10503 & -27607;
                } else if (n3 == (383 & 10862)) {
                    this.Field_28644 = 6347 & 17441;
                } else if (n3 == (9327 & 16767)) {
                    this.Field_28657 = -32763 & 29721;
                } else if (n3 == (114 & -32389)) {
                    this.Field_28642 = 1409 & 6144;
                    this.Field_28652 = 196 & 10;
                    this.Field_28654 = 1024 & 2756;
                    this.Field_28644 = -28660 & 18720;
                    this.Field_28657 = -22494 & 4688;
                    this.Method_28723((byte)(this.Field_28656 * (0.754717f * 337.875f)), (byte)(this.Field_28653 * (1.0769231f * 236.7857f)), (byte)(this.Field_28673 * (1.1746032f * 217.09459f)), (byte)(this.Field_28650 * (0.8961039f * 284.56522f)));
                }
                ++i;
                continue;
            }
            n3 = this.Method_28684((char)n5);
            if (this.Field_28642 && n3 != (-1 & -1)) {
                ArrayList arrayList;
                n4 = this.Method_28703((char)n5);
                if (this.Field_28683) {
                    while (n4 != this.Method_28703((char)(n = (int)Field_28675.charAt(n3 = this.Field_28669.nextInt(Field_28675.length()))))) {
                    }
                    n5 = n;
                } else if (this.Field_28660[n4] != null && this.Method_28703((char)(n2 = (int)Field_28675.charAt(n3 = (int)((char)((Integer)(arrayList = this.Field_28660[n4]).get(this.Field_28669.nextInt(arrayList.size()))).intValue())))) == n4) {
                    n5 = n2;
                }
            }
            float f = this.Field_28683 ? 0.97979796f * 0.5103093f : 1.0f / this.Field_28640;
            int n7 = n = (n5 == 0 || n3 == (-1 & -1) || this.Field_28683) && bl ? -30607 & 8705 : 4 & 17041;
            if (n != 0) {
                this.Field_28682 -= f;
                this.Field_28674 -= f;
            }
            float f2 = this.Method_28730((char)n5, this.Field_28657);
            if (n != 0) {
                this.Field_28682 += f;
                this.Field_28674 += f;
            }
            if (this.Field_28652) {
                this.Field_28682 += f;
                if (n != 0) {
                    this.Field_28682 -= f;
                    this.Field_28674 -= f;
                }
                this.Method_28730((char)n5, this.Field_28657);
                this.Field_28682 -= f;
                if (n != 0) {
                    this.Field_28682 += f;
                    this.Field_28674 += f;
                }
                f2 += f;
            }
            if (this.Field_28654) {
                Class_22385 class_22385 = this.Field_28665;
                class_22385.Method_22443(this.Field_28682, this.Field_28674 + (float)((429 & -31671) / (-8182 & 6790)), 0.0).Method_22431(this.Field_28641).Method_22432();
                class_22385.Method_22443(this.Field_28682 + f2, this.Field_28674 + (float)((16393 & 5641) / (-24346 & 7178)), 0.0).Method_22431(this.Field_28641).Method_22432();
                class_22385.Method_22443(this.Field_28682 + f2, this.Field_28674 + (float)((11 & 28685) / (17666 & 2083)) - 1.0f, 0.0).Method_22431(this.Field_28641).Method_22432();
                class_22385.Method_22443(this.Field_28682, this.Field_28674 + (float)((16393 & 8521) / (4134 & -16229)) - 1.0f, 0.0).Method_22431(this.Field_28641).Method_22432();
            }
            if (this.Field_28644) {
                object = this.Field_28665;
                int n8 = this.Field_28644 ? -1 & -1 : 778 & 1024;
                ((Class_22385)object).Method_22443(this.Field_28682 + (float)n8, this.Field_28674 + 0.7473684f * 12.0422535f, 0.0).Method_22431(this.Field_28641).Method_22432();
                ((Class_22385)object).Method_22443(this.Field_28682 + f2, this.Field_28674 + 14.673913f * 0.61333334f, 0.0).Method_22431(this.Field_28641).Method_22432();
                ((Class_22385)object).Method_22443(this.Field_28682 + f2, this.Field_28674 + 0.32098764f * 28.038462f - 1.0f, 0.0).Method_22431(this.Field_28641).Method_22432();
                ((Class_22385)object).Method_22443(this.Field_28682 + (float)n8, this.Field_28674 + 1.3055556f * 6.8936167f - 1.0f, 0.0).Method_22431(this.Field_28641).Method_22432();
            }
            this.Field_28682 += f2;
        }
    }

    String Method_28710(String string, int n) {
        int n2 = this.Method_28718(string, n);
        if (string.length() <= n2) {
            return string;
        }
        String string2 = string.substring(18496 & 8458, n2);
        char c = string.charAt(n2);
        int n3 = c == (4704 & -23112) || c == (12382 & -30710) ? 10805 & 16387 : 17408 & 6240;
        String string3 = Class_28636.Method_28693(string2) + string.substring(n2 + (n3 != 0 ? 3605 & 41 : 1216 & -28415));
        return string2 + "\n" + this.Method_28710(string3, n);
    }

    public int Method_28711(String string, float f, float f2, int n) {
        return this.Method_28727(string, f, f2, n, (81 & -32637) != 0);
    }

    public void Method_28712() {
        this.Field_28659.Method_22417(1175 & 14447, Class_29585.Field_29586);
        this.Field_28665.Method_22417(63 & -16121, Class_29585.Field_29601);
    }

    private void Method_28713(Class_2080 class_2080) {
        this.Field_28639 = class_2080;
    }

    private Class_22385 Method_28714(float f, float f2) {
        return this.Field_28659.Method_22452(this.Field_28682 + f, this.Field_28674 + f2, 0.0f);
    }

    public int Method_28715(String string) {
        if (string == null) {
            return 8290 & -30699;
        }
        float f = 0.0f;
        int n = 26844 & 770;
        for (int i = 524 & 4162; i < string.length(); ++i) {
            char c = string.charAt(i);
            float f2 = this.Method_28734(c);
            if (f2 < 0.0f && i < string.length() - (-30175 & 16469)) {
                if ((c = string.charAt(++i)) != (-23444 & 4332) && c != (204 & 95)) {
                    if (c == (-30605 & 12406) || c == (4338 & -31917)) {
                        n = 9664 & -26613;
                    }
                } else {
                    n = 20537 & 1921;
                }
                f2 = 0.0f;
            }
            f += f2;
            if (n == 0 || !(f2 > 0.0f)) continue;
            f += 1.0f;
        }
        return (int)f;
    }

    public boolean Method_28716() {
        return this.Field_28683;
    }

    private void Method_28717(String string, int n, int n2, int n3, boolean bl) {
        for (Object e : this.Method_28733(string, n3)) {
            this.Method_28696((String)e, n, n2, n3, this.Field_28638, bl);
            n2 += 2265 & 1547;
        }
    }

    private int Method_28718(String string, int n) {
        int n2;
        int n3 = string.length();
        float f = 0.0f;
        int n4 = -1 & -1;
        int n5 = 228 & 23552;
        for (n2 = -30462 & 545; n2 < n3; ++n2) {
            char c = string.charAt(n2);
            switch (c) {
                case '\n': {
                    --n2;
                    break;
                }
                case ' ': {
                    n4 = n2;
                }
                default: {
                    f += this.Method_28734(c);
                    if (n5 == 0) break;
                    f += 1.0f;
                    break;
                }
                case '\u00a7': {
                    char c2;
                    if (n2 >= n3 - (3595 & -24319)) break;
                    if ((c2 = string.charAt(++n2)) != (4222 & -5012) && c2 != (11340 & 109)) {
                        if (c2 != (-5774 & 630) && c2 != (5210 & 25042) && !Class_28636.Method_28687(c2)) break;
                        n5 = -29184 & 12740;
                        break;
                    }
                    n5 = 2161 & -32511;
                }
            }
            if (c == (2186 & 25098)) {
                n4 = ++n2;
                break;
            }
            if (f > (float)n) break;
        }
        return n2 != n3 && n4 != (-1 & -1) && n4 < n2 ? n4 : n2;
    }

    private void Method_28719(int n) {
        this.Field_28679.Method_34707(this.Method_28706(n));
    }

    public String Method_28720(String string, int n, boolean bl) {
        StringBuilder stringBuilder = new StringBuilder();
        float f = 0.0f;
        int n2 = bl ? string.length() - (-29359 & 24619) : -15832 & 8272;
        int n3 = bl ? -1 & -1 : 1 & 5925;
        int n4 = 262 & 6153;
        int n5 = 4 & -13056;
        for (int i = n2; i >= 0 && i < string.length() && f < (float)n; i += n3) {
            char c = string.charAt(i);
            float f2 = this.Method_28734(c);
            if (n4 != 0) {
                n4 = 32 & 198;
                if (c != (2156 & 21996) && c != (15070 & 1100)) {
                    if (c == (4210 & -16138) || c == (15443 & -32430)) {
                        n5 = 2235 & 256;
                    }
                } else {
                    n5 = 11409 & -16343;
                }
            } else if (f2 < 0.0f) {
                n4 = 195 & 19477;
            } else {
                f += f2;
                if (n5 != 0) {
                    f += 1.0f;
                }
            }
            if (f > (float)n) break;
            if (bl) {
                stringBuilder.insert(8192 & 34, c);
                continue;
            }
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }

    private int Method_28721(String string, float f, float f2, int n, boolean bl) {
        if (string == null) {
            return -24576 & 20808;
        }
        this.Method_28713(this.Field_28637);
        if (this.Field_28662) {
            string = this.Method_28686(string);
        }
        if ((n & (-50328448 & -64896965)) == 0) {
            n |= -8248756 & -15106046;
        }
        if (bl) {
            n = (n & (-1493238532 & 150863359)) >> (6151 & 1986) | n & (-16512760 & -12058394);
        }
        this.Field_28656 = (float)(n >> (5209 & -22128) & (767 & 8447)) / (0.8105263f * 314.61038f);
        this.Field_28653 = (float)(n >> (-3830 & 2632) & (767 & 22783)) / (1.4545455f * 175.3125f);
        this.Field_28673 = (float)(n & (2303 & -3585)) / (0.82474226f * 309.1875f);
        this.Field_28650 = (float)(n >> (600 & 20632) & (6655 & 9983)) / (0.3773585f * 675.75f);
        this.Method_28723((byte)(this.Field_28656 * (7139.9995f * 0.035714287f)), (byte)(this.Field_28653 * (2.6f * 98.07693f)), (byte)(this.Field_28673 * (1.7037038f * 149.6739f)), (byte)(this.Field_28650 * (398.4375f * 0.64f)));
        this.Field_28682 = f;
        this.Field_28674 = f2;
        this.Field_28640 = 1.0f;
        this.Method_28709(string, bl);
        return (int)this.Field_28682;
    }

    public int Method_28722(String string, int n) {
        return (2089 & -11703) * this.Method_28733(string, n).size();
    }

    private void Method_28723(byte by, byte by2, byte by3, byte by4) {
        this.Field_28645 = by;
        this.Field_28680 = by2;
        this.Field_28667 = by3;
        this.Field_28643 = by4;
        int n = by & (3839 & -32257);
        int n2 = by2 & (8447 & 4607);
        int n3 = by3 & (19711 & 5119);
        int n4 = by4 & (-31489 & 255);
        this.Field_28641 = ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN ? n4 << (2076 & 25048) | n3 << (9304 & 4117) | n2 << (27660 & -32743) | n : n << (-20455 & 17336) | n2 << (5136 & 8217) | n3 << (1544 & 2492) | n4;
        if (!this.Field_28676.Field_33238) {
            this.Method_28700();
        }
    }

    private float Method_28724(char c, boolean bl) {
        if (this.Field_28666[c] == 0) {
            return 0.0f;
        }
        this.Method_28700();
        int n = c / (778 & 18709);
        this.Method_28719(n);
        int n2 = this.Field_28666[c] >>> (-32428 & 3620);
        int n3 = this.Field_28666[c] & (2287 & 17423);
        float f = n2;
        float f2 = n3 + (-24557 & 6401);
        float f3 = (float)(c % (536 & 11317) * (-31728 & 4188)) + f;
        float f4 = (c & (5375 & 511)) / (24852 & 6192) * (-23504 & 601);
        float f5 = f2 - f - 0.3181818f * 0.06285714f;
        float f6 = bl ? 1.0f : 0.0f;
        GL11.glBegin((int)(85 & -28915));
        GL11.glTexCoord2f((float)(f3 / (0.55f * 465.45453f)), (float)(f4 / (0.021505376f * 11904.0f)));
        GL11.glVertex3f((float)(this.Field_28682 + f6), (float)this.Field_28674, (float)0.0f);
        GL11.glTexCoord2f((float)(f3 / (149.0633f * 1.7173913f)), (float)((f4 + 14.112207f * 1.132353f) / (122.880005f * 2.0833333f)));
        GL11.glVertex3f((float)(this.Field_28682 - f6), (float)(this.Field_28674 + 2.6551723f * 3.0092208f), (float)0.0f);
        GL11.glTexCoord2f((float)((f3 + f5) / (438.85715f * 0.5833333f)), (float)(f4 / (256.0f * 1.0f)));
        GL11.glVertex3f((float)(this.Field_28682 + f5 / 2.0f + f6), (float)this.Field_28674, (float)0.0f);
        GL11.glTexCoord2f((float)((f3 + f5) / (0.08695652f * 2944.0f)), (float)((f4 + 13.036315f * 1.2258065f) / (277.33334f * 0.9230769f)));
        GL11.glVertex3f((float)(this.Field_28682 + f5 / 2.0f - f6), (float)(this.Field_28674 + 5.897381f * 1.3548387f), (float)0.0f);
        GL11.glEnd();
        return (f2 - f) / 2.0f + 1.0f;
    }

    public int Method_28725(String string, float f, float f2, int n, boolean bl) {
        this.Method_28712();
        int n2 = this.Method_28727(string, f, f2, n, bl);
        this.Method_28728();
        return n2;
    }

    private void Method_28726() {
        this.Field_28642 = 5170 & -31992;
        this.Field_28652 = -31714 & 2432;
        this.Field_28657 = 8341 & 18698;
        this.Field_28644 = 5 & 274;
        this.Field_28654 = 16432 & 9349;
    }

    public int Method_28727(String string, float f, float f2, int n, boolean bl) {
        int n2;
        Class_16867.Method_16913();
        this.Method_28726();
        if (bl) {
            n2 = this.Method_28721(string, f + 1.0f, f2 + 1.0f, n, (2913 & 7) != 0);
            n2 = Math.max(n2, this.Method_28721(string, f, f2, n, (-32755 & 26400) != 0));
        } else {
            n2 = this.Method_28721(string, f, f2, n, (19168 & 4104) != 0);
        }
        return n2;
    }

    public void Method_28728() {
        Class_22385 class_22385 = this.Field_28659;
        class_22385.Method_22419();
        if (class_22385.Field_22400 > 0) {
            this.Field_28679.Method_34707(this.Field_28668);
            Class_24679.Method_24681(class_22385);
        }
        class_22385 = this.Field_28665;
        class_22385.Method_22419();
        if (class_22385.Field_22400 > 0) {
            Class_16867.Method_16922();
            Class_24679.Method_24681(class_22385);
            Class_16867.Method_16965();
        }
    }

    public int Method_28729(String string, float f, float f2, int n) {
        this.Method_28712();
        int n2 = this.Method_28711(string, f, f2, n);
        this.Method_28728();
        return n2;
    }

    private float Method_28730(char c, boolean bl) {
        if (c == (-28628 & 9378)) {
            return this.Field_28677[c];
        }
        int n = this.Method_28684(c);
        int n2 = this.Method_28732(c);
        return n != (-1 & -1) && !this.Field_28683 ? this.Method_28697(n, n2, bl) : this.Method_28724(c, bl);
    }

    private static int[] Method_28731() {
        Field_28675 = "\u00c0\u00c1\u00c2\u00c8\u00ca\u00cb\u00cd\u00d3\u00d4\u00d5\u00da\u00df\u00e3\u00f5\u011f\u0130\u0131\u0152\u0153\u015e\u015f\u0174\u0175\u017e\u0207\u0000\u0000\u0000\u0000\u0000\u0000\u0000 !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\u0000\u00c7\u00fc\u00e9\u00e2\u00e4\u00e0\u00e5\u00e7\u00ea\u00eb\u00e8\u00ef\u00ee\u00ec\u00c4\u00c5\u00c9\u00e6\u00c6\u00f4\u00f6\u00f2\u00fb\u00f9\u00ff\u00d6\u00dc\u00f8\u00a3\u00d8\u00d7\u0192\u00e1\u00ed\u00f3\u00fa\u00f1\u00d1\u00aa\u00ba\u00bf\u00ae\u00ac\u00bd\u00bc\u00a1\u00ab\u00bb\u2591\u2592\u2593\u2502\u2524\u2561\u2562\u2556\u2555\u2563\u2551\u2557\u255d\u255c\u255b\u2510\u2514\u2534\u252c\u251c\u2500\u253c\u255e\u255f\u255a\u2554\u2569\u2566\u2560\u2550\u256c\u2567\u2568\u2564\u2565\u2559\u2558\u2552\u2553\u256b\u256a\u2518\u250c\u2588\u2584\u258c\u2590\u2580\u03b1\u03b2\u0393\u03c0\u03a3\u03c3\u03bc\u03c4\u03a6\u0398\u03a9\u03b4\u221e\u2205\u2208\u2229\u2261\u00b1\u2265\u2264\u2320\u2321\u00f7\u2248\u00b0\u2219\u00b7\u221a\u207f\u00b2\u25a0\u0000";
        Field_28675 = Field_28675 + "\u00c0\u00c1\u00c2\u00c3\u00c4\u00c5\u00c6\u00c7\u00c8\u00c9\u00ca\u00cb\u00cc\u00cd\u00ce\u00cf";
        Field_28675 = Field_28675 + "\u00d0\u00d1\u00d2\u00d3\u00d4\u00d5\u00d6\u00d9\u00da\u00db\u00dc\u00dd\u00e0\u00e1\u00e2\u00e3";
        Field_28675 = Field_28675 + "\u00e4\u00e5\u00e6\u00e7\u00ec\u00ed\u00ee\u00ef\u00f1\u00f2\u00f3\u00f4\u00f5\u00f6\u00f9\u00fa";
        Field_28675 = Field_28675 + "\u00fb\u00fc\u00fd\u00ff\u0100\u0101\u0102\u0103\u0104\u0105\u0106\u0107\u0108\u0109\u010a\u010b";
        Field_28675 = Field_28675 + "\u010c\u010d\u010e\u010f\u0110\u0111\u0112\u0113\u0114\u0115\u0116\u0117\u0118\u0119\u011a\u011b";
        Field_28675 = Field_28675 + "\u0114\u0115\u0802\u0803\u0114\u0115\u0102\u0103\u0100\u0101\u0106\u0107\u0104\u0105\u0102\u0103";
        Field_28675 = Field_28675 + "\u012a\u012b\u012c\u012d\u012e\u012f\u0130\u0131\u0134\u0135\u0136\u0137\u0139\u013a\u013b\u013c";
        Field_28675 = Field_28675 + "\u013d\u013e\u013f\u0140\u0141\u0142\u0143\u0144\u0145\u0146\u0147\u0148\u014a\u014b\u014c\u014d";
        Field_28675 = Field_28675 + "\u014e\u014f\u0150\u0151\u0152\u0153\u0154\u0155\u0156\u0157\u0158\u0159\u015a\u015b\u015c\u015d";
        Field_28675 = Field_28675 + "\u015e\u015f\u0160\u0161\u0162\u0163\u0164\u0165\u0166\u0167\u0168\u0169\u016a\u016b\u016c\u016d";
        Field_28675 = Field_28675 + "\u0144\u0145\u0152\u0153\u0150\u0151\u0156\u0157\u0154\u0155\u0152\u0153\u0150\u0151\u0156\u0157";
        Field_28675 = Field_28675 + "\u0154\u01d5\u01d6\u01d7\u01d4\u0011\u0012\u0013\u0010\u0185\u0182\u0183\u0180\u0185\u0186\u0187";
        Field_28675 = Field_28675 + "\u0190\u0181\u0182\u0187\u0184\u0185\u0186\u0193\u01c0\u01c1\u01c6\u01c7\u01c4\u0001\u0002\u0003";
        Field_28675 = Field_28675 + "\u0004\u0005\u0006\u0007\u0010\u0011RSPQVSTUVW";
        Field_28675 = Field_28675 + "\u0090\u0091\u0802\u0803\u0800\u0801\u0816\u0817\u0800\u0801\u0812\u0813\u0840\u0841\u0856\u0857";
        Field_28675 = Field_28675 + "\u0840\u0841\u0842\u0843\u0880\u0881\u0882\u0883\u0884\u0885\u08d2\u08d3\u00c0\u00c1\u00c2\u00c3";
        Field_28647 = new int[1535181073 & 598024];
        Arrays.fill(Field_28647, -1 & -1);
        for (int i = Class_28636.Field_28675.length() - (14337 & 1113); i > 0; --i) {
            Class_28636.Field_28647[Class_28636.Field_28675.charAt((int)i)] = i;
        }
        return Field_28647;
    }

    private int Method_28732(char c) {
        return Field_28647[c] >> (9337 & 6414);
    }

    public List Method_28733(String string, int n) {
        return Arrays.asList(this.Method_28710(string, n).split("\n"));
    }

    private float Method_28734(char c) {
        if (c == (3247 & -12057)) {
            return 0.57894737f * -1.7272727f;
        }
        if (c == (1568 & 32)) {
            return this.Field_28677[4131 & -30344];
        }
        int n = this.Method_28684(c);
        int n2 = this.Method_28732(c);
        if (c > '\u0000' && n != (-1 & -1) && !this.Field_28683) {
            if (n2 == 0) {
                return this.Field_28677[n];
            }
            return this.Field_28678[n];
        }
        if (this.Field_28666[c] != 0) {
            int n3 = this.Field_28666[c] >>> (-17371 & 16404);
            int n4 = this.Field_28666[c] & (12719 & 19535);
            if (n4 > (4359 & 10767)) {
                n4 = 16399 & -30193;
                n3 = 4992 & 16387;
            }
            return (++n4 - n3) / (-13821 & 5254) + (1089 & -22511);
        }
        return 0.0f;
    }
}

