/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  internal.org.lwjgl.opengl.GL11
 */
import internal.org.lwjgl.opengl.GL11;
import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import javax.imageio.ImageIO;

public class Class_14701 {
    protected static final Class_14701 Field_14702;
    private static ArrayList Field_14703;
    protected static final Class_14701 Field_14704;
    private static Class_14701 Field_14705;
    protected static final Class_14701 Field_14706;
    protected static final Class_14701 Field_14707;
    protected static final Class_14701 Field_14708;
    private static String Field_14709;
    private static String Field_14710;
    private final boolean Field_14711;
    protected static final Class_14701 Field_14712;
    protected static final Class_14701 Field_14713;
    protected static final Class_14701 Field_14714;
    protected static final Class_14701 Field_14715;
    private final String Field_14716;
    private int Field_14717;
    protected static final Class_14701 Field_14718;
    protected static final Class_14701 Field_14719;
    protected static final Class_14701 Field_14720;
    protected static final Class_14701 Field_14721;
    protected static final Class_14701 Field_14722;
    private final boolean Field_14723;
    protected static final Class_14701 Field_14724;
    protected static final Class_14701 Field_14725;
    protected static final Class_14701 Field_14726;
    protected static final Class_14701 Field_14727;

    public void Method_14728() {
        if (this.Field_14717 == 0) {
            BufferedImage bufferedImage = Class_14701.Method_14751(this.Field_14716);
            if (bufferedImage == null) {
                this.Field_14717 = this == Field_14705 ? -1 & -2 : -1 & -1;
            } else {
                this.Field_14717 = GL11.glGenTextures();
                int n = bufferedImage.getWidth();
                int n2 = bufferedImage.getHeight();
                int[] arrn = new int[n * n2];
                bufferedImage.getRGB(12629 & 128, 16770 & 1544, n, n2, arrn, 515 & 0, n);
                Class_37579.Method_37597(arrn, n, n2, this.Field_14717, this.Field_14711, this.Field_14723);
            }
        }
        if (this.Field_14717 == (-2 & -2)) {
            GL11.glBindTexture((int)(-29213 & 3565), (int)(16402 & -31680));
        } else {
            if (this.Field_14717 == (-1 & -1)) {
                Field_14705.Method_14728();
            }
            GL11.glBindTexture((int)(-20501 & 3553), (int)this.Field_14717);
        }
    }

    public void Method_14729() {
        if (this.Field_14717 > 0) {
            GL11.glDeleteTextures((int)this.Field_14717);
        }
        this.Field_14717 = -32768 & 20484;
    }

    private static String Method_14730(String string) {
        int n = 31013;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_14701.class, 10);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_14731(String string) {
        int n = 4957;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_14701.class, 16);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    protected static void Method_14732(String string) {
        if (!string.equals(Field_14709)) {
            for (Class_14701 class_14701 : Field_14703) {
                class_14701.Method_14729();
            }
            Field_14709 = string;
        }
    }

    static {
        Field_14709 = Field_14710 = Class_14701.Method_14738("\u4049\u4002\u4003\u4002\u4007\u4007\u4007\u404e\u4008\u400a\u4001\u400b\u4004\u400c\u4007\u4046\u4002\u4002\u4008\u4001\u4007\u4005\u4005\u4006\u4041\u4002\u4001\u4003\u4007\u4006\u400d\u400d\u4049");
        Field_14703 = new ArrayList();
        Field_14705 = new Class_14701(Class_14701.Method_14746("! ;:%%/g0)#"), (-16349 & 4177) != 0, (-31744 & 136) != 0);
        Field_14715 = new Class_14701(Class_14701.Method_14740("\u0002\u0002\u0000\u0000\u0006\u0004\u0004\u0004\u0002\u0000\u0000B\u0006\u0004\u0006"), (24765 & -32255) != 0, (16929 & 10307) != 0);
        Field_14708 = new Class_14701(Class_14701.Method_14734("\u11c0\u11cd\u11c6\u11c3\u11c8\u11c5\u11ca\u11c7\u118c\u11c1\u11ce\u11c7"), (20065 & 4359) != 0, (2369 & -32231) != 0);
        Field_14719 = new Class_14701(Class_14701.Method_14737("\u0c20\u0c25\u0c24\u0c27\u0c26\u0c27\u0c20\u0c21\u0c2c\u0c2b\u0c2e\u0c2f"), (161 & 12291) != 0, (26731 & 5505) != 0);
        Field_14712 = new Class_14701(Class_14701.Method_14745("\u32f2\u32e3\u32f3\u32e0\u32e4\u32e5\u32e7\u32f6\u32db\u32e9\u32eb\u32f9\u32ef\u32ae\u32fe\u32ec\u32e3"), (16928 & -24170) != 0, (8337 & 4613) != 0);
        Field_14725 = new Class_14701(Class_14701.Method_14741("\u0823\u0820\u0823\u0832\u0822\u0830\u0833\u0832\u0820\u0833\u0822\u0831\u0833"), (30107 & 65) != 0, (5 & -6143) != 0);
        Field_14718 = new Class_14701(Class_14701.Method_14736("\u42a0\u42a3\u42a0\u42b1\u42a4\u42b7\u42bc\u42b5\u42aa\u4281\u42b0\u42b9\u42ac\u42b5\u42f6\u42ad\u42a8\u42a1"), (3425 & 24718) != 0, (2897 & 1033) != 0);
        Field_14721 = new Class_14701(Class_14701.Method_14753("\u0100\u010a\u0101\u010d\u0101\u010d\u010b\u0104\u0103\u010b"), (-32479 & 513) != 0, (6563 & -7615) != 0);
        Field_14724 = new Class_14701(Class_14701.Method_14730("\ue00b\ue001\ue018\ue000\ue01a\ue012\ue05a\ue043\ue012\ue009\ue003"), (35 & -15339) != 0, (16523 & 369) != 0);
        Field_14726 = new Class_14701(Class_14701.Method_14748("\u1925\u1921\u1926\u1922\u1921\u1920\u1926\u1922\u1924\u1924\u1923\u1926\u1920"), (8449 & 5857) != 0, (17027 & 13) != 0);
        Field_14727 = new Class_14701(Class_14701.Method_14749("  :\")"), (10821 & 16385) != 0, (-30975 & 24691) != 0);
        Field_14707 = new Class_14701(Class_14701.Method_14744("\u6c48\u6c00\u6c48\u6c40\u6c48"), (8589 & 35) != 0, (27697 & 387) != 0);
        Field_14706 = new Class_14701(Class_14701.Method_14739("\u4c30\u4c60\u4c33\u4c20\u4c20"), (-31699 & 785) != 0, (3329 & -27987) != 0);
        Field_14714 = new Class_14701(Class_14701.Method_14747("\u4004\u4000\u4006\u4000\u4000"), (-30719 & 21077) != 0, (-32253 & 8481) != 0);
        Field_14702 = new Class_14701(Class_14701.Method_14731("\u0444\u0444\u0440\u0440\u0444\u0440\u0440\u0400\u0448\u044c\u044c"), (17483 & 11025) != 0, (16385 & -30531) != 0);
        Field_14720 = new Class_14701(Class_14701.Method_14743("\u0c41\u0c52\u0c43\u0c43\u0c51\u0c52\u0c50\u0c43\u0c18\u0c4b\u0c58\u0c58"), (-32637 & 24593) != 0, (-16383 & 9221) != 0);
        Field_14704 = new Class_14701(Class_14701.Method_14750("\u5087\u5081\u5081\u5080\u5083\u5085\u5082\u5080\u5082\u5086\u5080\u5086\u5083"), (-32703 & 25351) != 0, (5 & 25619) != 0);
        Field_14713 = new Class_14701(Class_14701.Method_14735("\uc149\uc141\uc142\uc14b\uc141\uc142\uc10a\uc140\uc142\uc14b"), (11311 & 20801) != 0, (-31871 & 1) != 0);
        Field_14722 = new Class_14701(Class_14701.Method_14752("\ud414\ud410\ud401\ud410\ud414\ud401\ud441\ud455\ud409\ud41d\ud41c"), (16385 & 3235) != 0, (1611 & 20753) != 0);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static BufferedImage Method_14733(String string) {
        BufferedImage bufferedImage;
        InputStream inputStream = Class_14701.class.getResourceAsStream(string);
        if (inputStream == null) {
            return null;
        }
        try {
            BufferedImage bufferedImage2;
            BufferedImage bufferedImage3 = bufferedImage2 = ImageIO.read(inputStream);
            return bufferedImage3;
        }
        catch (Exception exception) {
            bufferedImage = null;
        }
        finally {
            try {
                inputStream.close();
            }
            catch (Exception exception) {}
        }
        return bufferedImage;
    }

    private static String Method_14734(String string) {
        int n = 25250;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_14701.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_14735(String string) {
        int n = 706;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_14701.class, 19);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_14736(String string) {
        int n = 2085;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_14701.class, 8);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_14737(String string) {
        int n = 19326;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_14701.class, 5);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_14738(String string) {
        int n = 4749;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_14701.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_14739(String string) {
        int n = 4641;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_14701.class, 14);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_14740(String string) {
        int n = 2202;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_14701.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private Class_14701(String string, boolean bl, boolean bl2) {
        this.Field_14716 = string;
        this.Field_14711 = bl;
        this.Field_14723 = bl2;
        Field_14703.add(this);
    }

    private static String Method_14741(String string) {
        int n = 651;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_14701.class, 7);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_14742() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private static String Method_14743(String string) {
        int n = 7270;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_14701.class, 17);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_14744(String string) {
        int n = 5429;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_14701.class, 13);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_14745(String string) {
        int n = 13265;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_14701.class, 6);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_14746(String string) {
        int n = 3099;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_14701.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_14747(String string) {
        int n = 11798;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_14701.class, 15);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_14748(String string) {
        int n = 896;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_14701.class, 11);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_14749(String string) {
        int n = 18142;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_14701.class, 12);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_14750(String string) {
        int n = 15257;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_14701.class, 18);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static BufferedImage Method_14751(String string) {
        BufferedImage bufferedImage = Class_14701.Method_14733(Field_14709 + string);
        return bufferedImage == null ? Class_14701.Method_14733(Field_14710 + string) : bufferedImage;
    }

    private static String Method_14752(String string) {
        int n = 9094;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_14701.class, 20);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_14753(String string) {
        int n = 15655;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_14701.class, 9);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }
}

