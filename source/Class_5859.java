/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Maps;
import java.awt.Toolkit;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.management.ManagementFactory;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class Class_5859
extends Class_3238 {
    private final Map Field_5860 = Maps.newIdentityHashMap();
    public static final Class_4173 Field_5861;
    public static final Class_4173 Field_5862;
    public static final Class_4173 Field_5863;
    public static final Class_4173 Field_5864;
    public static final Class_4173 Field_5865;
    public static final Class_4173 Field_5866;
    private final Map Field_5867 = Maps.newIdentityHashMap();
    public static final Class_4394 Field_5868;
    public static final Class_4394 Field_5869;

    protected boolean Method_5870(Class_283 class_283, Class_4751 class_4751) {
        return (class_283.Method_496(class_4751) || class_283.Method_496(class_4751.Method_4771()) || class_283.Method_496(class_4751.Method_4770()) || class_283.Method_496(class_4751.Method_4778()) || class_283.Method_496(class_4751.Method_4784()) ? 16657 & -18431 : 18497 & -31062) != 0;
    }

    protected Class_3855 Method_5871() {
        Class_3538[] arrclass_3538 = new Class_3538[24652 & -26614];
        arrclass_3538[-12028 & 512] = Field_5869;
        arrclass_3538[24853 & 3] = Field_5862;
        arrclass_3538[22542 & 162] = Field_5865;
        arrclass_3538[-32413 & 31] = Field_5864;
        arrclass_3538[2132 & -15835] = Field_5863;
        arrclass_3538[31413 & 13] = Field_5868;
        arrclass_3538[-14042 & 4750] = Field_5866;
        arrclass_3538[-32745 & 8943] = Field_5861;
        return new Class_3855(this, arrclass_3538);
    }

    private static String Method_5872(String string) {
        int n = 19779;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_5859.class, 19);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private int Method_5873(Class_3238 class_3238) {
        Integer n = (Integer)this.Field_5860.get(class_3238);
        return n == null ? 424 & -24048 : n;
    }

    public boolean Method_5874(Class_561 class_561, Class_4751 class_4751) {
        return (this.Method_5938(class_561.Method_568(class_4751).Method_3442()) > 0 ? 16977 & 10241 : -24575 & 6424) != 0;
    }

    private static String Method_5875(String string) {
        int n = 20846;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_5859.class, 31);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_5876(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Random random) {
        if (class_283.Method_522().Method_7529(Class_5859.Method_5910("\u1289\u1280\u128b\u1282\u128d\u128c\u128f\u1286\u1280\u1288"))) {
            Class_3238 class_3238;
            int n;
            if (!this.Method_5877(class_283, class_4751)) {
                class_283.Method_472(class_4751);
            }
            int n2 = n = (class_3238 = class_283.Method_375(class_4751.Method_4782()).Method_3442()) == Class_9265.Field_9368 ? 6667 & 161 : -24555 & 1384;
            if (class_283.Field_284 instanceof Class_19311 && class_3238 == Class_9265.Field_9414) {
                n = -6843 & 145;
            }
            if (n == 0 && class_283.Method_454() && this.Method_5870(class_283, class_4751)) {
                class_283.Method_472(class_4751);
            } else {
                int n3 = (Integer)class_3436.Method_3440(Field_5869);
                if (n3 < (24847 & 6687)) {
                    class_3436 = class_3436.Method_3437(Field_5869, Integer.valueOf(n3 + random.nextInt(-15865 & 4435) / (3095 & -24574)));
                    class_283.Method_462(class_4751, class_3436, -21410 & 132);
                }
                class_283.Method_441(class_4751, this, this.Method_5909(class_283) + random.nextInt(-32757 & 23706));
                if (n == 0) {
                    if (!this.Method_5887(class_283, class_4751)) {
                        if (!Class_283.Method_538(class_283, class_4751.Method_4782()) || n3 > (7207 & -7909)) {
                            class_283.Method_472(class_4751);
                        }
                        return;
                    }
                    if (!this.Method_5874(class_283, class_4751.Method_4782()) && n3 == (-27761 & 25647) && random.nextInt(-29690 & 389) == 0) {
                        class_283.Method_472(class_4751);
                        return;
                    }
                }
                boolean bl = class_283.Method_336(class_4751);
                int n4 = 16425 & 2368;
                if (bl) {
                    n4 = -50 & -17;
                }
                this.Method_5878(class_283, class_4751.Method_4770(), (-28307 & 1452) + n4, random, n3);
                this.Method_5878(class_283, class_4751.Method_4771(), (16831 & -32404) + n4, random, n3);
                this.Method_5878(class_283, class_4751.Method_4782(), (17662 & -29958) + n4, random, n3);
                this.Method_5878(class_283, class_4751.Method_4769(), (13562 & 16891) + n4, random, n3);
                this.Method_5878(class_283, class_4751.Method_4778(), (9516 & 18926) + n4, random, n3);
                this.Method_5878(class_283, class_4751.Method_4784(), (16687 & -28372) + n4, random, n3);
                for (int i = -1 & -1; i <= (16915 & 10305); ++i) {
                    for (int j = -1 & -1; j <= (26853 & 1025); ++j) {
                        for (int k = -1 & -1; k <= (2077 & 1094); ++k) {
                            int n5;
                            Class_4751 class_47512;
                            if (i == 0 && k == 0 && j == 0) continue;
                            int n6 = 111 & 16740;
                            if (k > (4353 & 1077)) {
                                n6 += (k - (-14327 & 13601)) * (2788 & 25966);
                            }
                            if ((n5 = this.Method_5922(class_283, class_47512 = class_4751.Method_4791(i, k, j))) <= 0) continue;
                            int n7 = (n5 + (-19907 & 2154) + class_283.Method_487().Method_26822() * (-28409 & 71)) / (n3 + (13662 & 30));
                            if (bl) {
                                n7 /= 8262 & 4242;
                            }
                            if (n7 <= 0 || random.nextInt(n6) > n7 || class_283.Method_454() && this.Method_5870(class_283, class_47512)) continue;
                            int n8 = n3 + random.nextInt(-21499 & 903) / (-6100 & 4103);
                            if (n8 > (-22513 & 623)) {
                                n8 = 1295 & 18479;
                            }
                            class_283.Method_462(class_47512, class_3436.Method_3437(Field_5869, Integer.valueOf(n8)), -30201 & 8451);
                        }
                    }
                }
            }
        }
    }

    public boolean Method_5877(Class_283 class_283, Class_4751 class_4751) {
        return (Class_283.Method_538(class_283, class_4751.Method_4782()) || this.Method_5887(class_283, class_4751) ? -32431 & 12453 : -32763 & 22688) != 0;
    }

    private void Method_5878(Class_283 class_283, Class_4751 class_4751, int n, Random random, int n2) {
        int n3 = this.Method_5873(class_283.Method_375(class_4751).Method_3442());
        if (random.nextInt(n) < n3) {
            Class_3436 class_3436 = class_283.Method_375(class_4751);
            if (random.nextInt(n2 + (-31862 & 6170)) < (8263 & -13291) && !class_283.Method_496(class_4751)) {
                int n4 = n2 + random.nextInt(4639 & 8197) / (22580 & 9420);
                if (n4 > (23071 & 239)) {
                    n4 = 2415 & 8335;
                }
                class_283.Method_462(class_4751, this.\u0000strictfp().Method_3685(Field_5869, Integer.valueOf(n4)), 18947 & 1351);
            } else {
                class_283.Method_472(class_4751);
            }
            if (class_3436.Method_3442() == Class_9265.Field_9462) {
                Class_9265.Field_9462.Method_3287(class_283, class_4751, class_3436.Method_3437(Class_5798.Field_5799, Boolean.valueOf((-24565 & 4993) != 0)));
            }
        }
    }

    private static String Method_5879(String string) {
        int n = 5502;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_5859.class, 38);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_3779 Method_5880(Class_3436 class_3436) {
        return Class_3779.Field_3789;
    }

    static {
        Field_5869 = Class_4394.Method_4401(Class_5859.Method_5914("\u0001\u0000\u0001"), 8 & -12137, -32625 & 1087);
        Field_5866 = Class_4173.Method_4177(Class_5859.Method_5937("\u4010\u4010\u4014\u4004"));
        Field_5861 = Class_4173.Method_4177(Class_5859.Method_5917("\u1500\u1504\u1506"));
        Field_5862 = Class_4173.Method_4177(Class_5859.Method_5904("\u5c88\u5c89\u5c86\u5c81\u5c8a"));
        Field_5865 = Class_4173.Method_4177(Class_5859.Method_5928("\u0209\u0209\u0219\u0218"));
        Field_5864 = Class_4173.Method_4177(Class_5859.Method_5891("\u80d0\u80c0\u80d2\u80d3\u80c5"));
        Field_5863 = Class_4173.Method_4177(Class_5859.Method_5883("\u9010\u9003\u9016\u9011"));
        Field_5868 = Class_4394.Method_4401(Class_5859.Method_5920("\u0a08\u0a08\u0a09\u0a09\u0a0f"), 16400 & -20952, 8194 & -8566);
        Class_5859.Method_5933();
        if (!Class_18.Field_124) {
            Toolkit.getDefaultToolkit();
        }
        int n = -1 & -1;
        int n2 = -24095 & 516;
        Class_2094 class_2094 = Class_2090.Method_2091();
        if (class_2094 == Class_2094.Field_2097) {
            n = 87 & -32735;
            try {
                System.loadLibrary(Class_5859.Method_5906("\u0508\u0502\u0501\u0503"));
            }
            catch (Throwable throwable) {
                // empty catch block
            }
            n2 = Class_18.Field_89.Method_178() ? 161 & -28415 : -32728 & 0;
        } else if (class_2094 == Class_2094.Field_2099) {
            n = -31098 & 10304;
            try {
                System.loadLibrary(Class_5859.Method_5900("\u3810\u3813\u3802\u3801"));
            }
            catch (Throwable throwable) {
                // empty catch block
            }
            n2 = Class_18.Field_89.Method_178() ? -5109 & 257 : -16128 & 4225;
        } else {
            n = 8726 & 20483;
        }
        if (n < 0) {
            Object[] arrobject;
            new Class_30877(new RuntimeException(String.format(Class_5859.Method_5893("\u4081\u40a2\u40a2\u40a0\u40a1\u40b0\u40a3\u40b2\u40a8\u40aa\u40b8\u40aa\u40a9\u40aa\u40ab\u40bb\u40b3\u40b2\u40a3\u40b1\u40b0\u40a1\u40b2\u40b2\u40a9\u40bb\u40ba\u40a8\u40b9"), arrobject)));
            arrobject = new Object[9733 & 22555];
            arrobject[4354 & -29184] = class_2094;
        } else {
            int n3 = 28931 & -30101;
            boolean[] arrbl = new boolean[n3];
            int n4 = 4421 & -30719;
            int n5 = n * (390 & 4723) + n2;
            int n6 = n5 * n3;
            try {
                int n7;
                Class_5940 class_5940 = new Class_5940(-153623885 & -724176685, new Class_5958(Class_5859.Method_5881("\ua88c\ua888\ua882\ua88b\ua88c\ua88c\ua886\ua88e\ua88d\ua889\ua881\ua880\ua881\ua88c\ua886\ua88f\ua89c\ua897\ua89a\ua892\ua89d\ua89e\ua89c\ua895\ua890\ua898\ua89d\ua891\ua89c\ua899\ua89f\ua895\ua882\ua885\ua88a\ua882\ua88d\ua888\ua881\ua88e\ua880").getBytes()));
                ZipInputStream zipInputStream = new ZipInputStream(class_5940);
                zipInputStream.getNextEntry();
                int[] arrn = new int[18965 & 15];
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] arrby = new byte[12336 & 25344];
                while ((n7 = zipInputStream.read(arrby)) != (-1 & -1)) {
                    byteArrayOutputStream.write(arrby, 1188 & 528, n7);
                }
                byte[] arrby2 = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream = null;
                ByteBuffer byteBuffer = ByteBuffer.wrap(arrby2, arrby2.length - (4125 & 18644), 3092 & 8254);
                byteBuffer.asIntBuffer().get(arrn);
                byte[] arrby3 = arrby2;
                while (n6-- > 0) {
                    zipInputStream.getNextEntry();
                }
                for (int i = 71 & -30208; i < n3; ++i) {
                    zipInputStream.getNextEntry();
                    arrbl[i] = Class_5859.Method_5916(zipInputStream, i, arrn[n5], arrby3);
                    if (arrbl[i]) continue;
                    n4 = -22783 & 2086;
                }
                zipInputStream.close();
                if (n4 == 0) {
                    class_5940 = new Class_5940(-589961325 & -153100073, new Class_5958(Class_5859.Method_5892("\u40c2\u4083\u40d0\u4091\u4092\u4083\u40d0\u4091\u40c2\u40d3\u4092\u40d3\u40d2\u4083\u40d0\u4091\u40d2\u4091\u4090\u40c1\u4082\u40d1\u4082\u40c3\u40c2\u40d3\u4092\u40d3\u4082\u40d3\u40c0\u4083\u40d0\u40d3\u4080\u40d1\u4092\u40c3\u4082\u4081\u40d2").getBytes()));
                    zipInputStream = new ZipInputStream(class_5940);
                    zipInputStream.getNextEntry();
                    ZipEntry zipEntry = zipInputStream.getNextEntry();
                    int n8 = 2084 & 1105;
                    while (zipEntry != null) {
                        n7 = n8 % n3;
                        if (!arrbl[n7]) {
                            arrbl[n8 % n3] = Class_5859.Method_5916(zipInputStream, n7, arrn[n7 / n3], arrby3);
                        }
                        ++n8;
                        zipEntry = zipInputStream.getNextEntry();
                    }
                    zipInputStream.close();
                }
            }
            catch (IOException iOException) {
                iOException.printStackTrace(System.out);
                new Class_30877(iOException);
            }
        }
    }

    private static String Method_5881(String string) {
        int n = 23125;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_5859.class, 13);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_5882(String string) {
        int n = 18192;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_5859.class, 30);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_5883(String string) {
        int n = 19157;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_5859.class, 8);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_5884(String string) {
        int n = 11384;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_5859.class, 29);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_5885(String string) {
        int n = 6463;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_5859.class, 36);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static void Method_5886(File file) {
        file = file.getParentFile();
        try {
            String[] arrstring = new String[18566 & 1046];
            arrstring[1078 & -32255] = Class_5859.Method_5907("\u8426\u8426\u840f\u8426\u8421\u840d");
            arrstring[-30443 & 5313] = Class_5859.Method_5889("\u0840\u0840\u0852\u0842\u0854\u0854\u0846\u0856");
            arrstring[286 & 16930] = Class_5859.Method_5924("\ua090\ua091\ua080\ua091\ua080\ua085\ua080\ua085");
            arrstring[579 & -30557] = Class_5859.Method_5885("  \u0000  \u0002");
            arrstring[17476 & -28540] = Class_5859.Method_5911("\u2604\u2604\u260e\u2606\u260e\u2602\u260e");
            arrstring[5381 & 24637] = Class_5859.Method_5879("\u6250\u6250\u6248\u6240\u6244\u624c");
            String[] arrstring2 = arrstring;
            long l = System.currentTimeMillis();
            File[] arrfile = file.listFiles();
            int n = arrfile.length;
            block2 : for (int i = 392 & 26624; i < n; ++i) {
                File file2 = arrfile[i];
                if (l - file2.lastModified() <= TimeUnit.HOURS.toMillis(-3100623794774728300L & 3100623793270309478L)) continue;
                String[] arrstring3 = arrstring2;
                int n2 = arrstring3.length;
                for (int j = 8272 & 4098; j < n2; ++j) {
                    String string = arrstring3[j];
                    if (!file2.isFile() || !file2.getName().startsWith(string)) continue;
                    file2.delete();
                    file2.deleteOnExit();
                    continue block2;
                }
            }
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }

    private boolean Method_5887(Class_283 class_283, Class_4751 class_4751) {
        Class_4595[] arrclass_4595 = Class_4595.Method_4630();
        int n = arrclass_4595.length;
        for (int i = 1024 & 8197; i < n; ++i) {
            Class_4595 class_4595 = arrclass_4595[i];
            if (!this.Method_5874(class_283, class_4751.Method_4765(class_4595))) continue;
            return (-29679 & 271) != 0;
        }
        return (-24576 & 1453) != 0;
    }

    private static String Method_5888(String string) {
        int n = 31067;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_5859.class, 17);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_5889(String string) {
        int n = 15652;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_5859.class, 34);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_5890() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, Class_5859.Method_5929("\n\u0000\b\u0002\n\u0002\n\b\u0000\b\b\b\b\u0000"));
    }

    private static String Method_5891(String string) {
        int n = 22776;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_5859.class, 7);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_5892(String string) {
        int n = 2720;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_5859.class, 14);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_5893(String string) {
        int n = 12587;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_5859.class, 12);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static void Method_5894() {
        Class_9265.Field_9342.Method_5901(Class_9265.Field_9379, 1605 & 7, 16404 & 4822);
        Class_9265.Field_9342.Method_5901(Class_9265.Field_9301, -15705 & 8221, -7108 & 148);
        Class_9265.Field_9342.Method_5901(Class_9265.Field_9460, -25577 & 37, 28 & 10582);
        Class_9265.Field_9342.Method_5901(Class_9265.Field_9426, 9221 & -30099, 2004 & 55);
        Class_9265.Field_9342.Method_5901(Class_9265.Field_9371, 8453 & 1725, 2332 & -15339);
        Class_9265.Field_9342.Method_5901(Class_9265.Field_9359, -28513 & 5, 533 & 5334);
        Class_9265.Field_9342.Method_5901(Class_9265.Field_9422, -32763 & 2101, 16821 & 2068);
        Class_9265.Field_9342.Method_5901(Class_9265.Field_9306, -7897 & 541, 10269 & -32682);
        Class_9265.Field_9342.Method_5901(Class_9265.Field_9318, 1237 & 21005, 16660 & 8253);
        Class_9265.Field_9342.Method_5901(Class_9265.Field_9437, 17413 & 141, 87 & 20148);
        Class_9265.Field_9342.Method_5901(Class_9265.Field_9267, -29107 & 4149, 158 & -14795);
        Class_9265.Field_9342.Method_5901(Class_9265.Field_9407, 8485 & 2053, 20 & 4540);
        Class_9265.Field_9342.Method_5901(Class_9265.Field_9317, -15923 & 6677, 1108 & -7778);
        Class_9265.Field_9342.Method_5901(Class_9265.Field_9449, -10171 & 1029, 542 & 30772);
        Class_9265.Field_9342.Method_5901(Class_9265.Field_9340, 30629 & 2053, -32106 & 4124);
        Class_9265.Field_9342.Method_5901(Class_9265.Field_9302, -32747 & 8613, 16407 & 60);
        Class_9265.Field_9342.Method_5901(Class_9265.Field_9369, 71 & 2053, 4181 & -32234);
        Class_9265.Field_9342.Method_5901(Class_9265.Field_9343, 19237 & 5141, 308 & 4116);
        Class_9265.Field_9342.Method_5901(Class_9265.Field_9299, 8599 & -29627, 5436 & 25172);
        Class_9265.Field_9342.Method_5901(Class_9265.Field_9383, 10589 & 16519, -16235 & 517);
        Class_9265.Field_9342.Method_5901(Class_9265.Field_9447, 2341 & 157, 77 & 167);
        Class_9265.Field_9342.Method_5901(Class_9265.Field_9421, -32226 & 5246, -24004 & 383);
        Class_9265.Field_9342.Method_5901(Class_9265.Field_9440, -15842 & 10398, -14787 & 62);
        Class_9265.Field_9342.Method_5901(Class_9265.Field_9339, 13407 & 2366, -24171 & 2140);
        Class_9265.Field_9342.Method_5901(Class_9265.Field_9462, -32209 & 335, -32155 & 18686);
        Class_9265.Field_9342.Method_5901(Class_9265.Field_9278, 4413 & -32066, 6260 & 10092);
        Class_9265.Field_9342.Method_5901(Class_9265.Field_9399, 124 & 63, 103 & -16156);
        Class_9265.Field_9342.Method_5901(Class_9265.Field_9353, 61 & 8254, 7397 & 8292);
        Class_9265.Field_9342.Method_5901(Class_9265.Field_9402, 2111 & -23492, -20121 & 16492);
        Class_9265.Field_9342.Method_5901(Class_9265.Field_9397, 188 & -29315, 622 & 2405);
        Class_9265.Field_9342.Method_5901(Class_9265.Field_9326, 4414 & 8734, 10751 & 60);
        Class_9265.Field_9342.Method_5901(Class_9265.Field_9323, -16305 & 10143, -8068 & 741);
        Class_9265.Field_9342.Method_5901(Class_9265.Field_9387, 1029 & 2655, -24427 & 4101);
        Class_9265.Field_9342.Method_5901(Class_9265.Field_9431, 23612 & -23746, -31585 & 52);
        Class_9265.Field_9342.Method_5901(Class_9265.Field_9357, -23684 & 188, 30 & -23276);
    }

    public Class_10997 Method_5895(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436) {
        return null;
    }

    private static String Method_5896(String string) {
        int n = 30769;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_5859.class, 22);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_5897(String string) {
        int n = 5222;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_5859.class, 15);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_5898(String string) {
        int n = 20096;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_5859.class, 26);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_5899(String string) {
        int n = 28933;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_5859.class, 18);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_5900(String string) {
        int n = 16384;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_5859.class, 11);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_5901(Class_3238 class_3238, int n, int n2) {
        this.Field_5867.put(class_3238, n);
        this.Field_5860.put(class_3238, n2);
    }

    public boolean Method_5902() {
        return (545 & 3420) != 0;
    }

    public Class_3436 Method_5903(Class_3436 class_3436, Class_561 class_561, Class_4751 class_4751) {
        int n = class_4751.\u0000= final();
        int n2 = class_4751.\u0000, `();
        int n3 = class_4751.\u0000strictfp();
        if (!Class_283.Method_538(class_561, class_4751.Method_4782()) && !Class_9265.Field_9342.Method_5874(class_561, class_4751.Method_4782())) {
            int n4 = (n + n2 + n3 & (131 & -9715)) == (29459 & -31615) ? -28471 & 17 : 15640 & -32702;
            int n5 = (n / (-24446 & 2338) + n2 / (4226 & 16914) + n3 / (630 & -32510) & (22669 & 8257)) == (8197 & 4417) ? 2313 & -31689 : 6272 & 24663;
            int n6 = 8 & -14253;
            if (this.Method_5874(class_561, class_4751.Method_4769())) {
                n6 = n4 != 0 ? 20483 & -23775 : 1638 & 20747;
            }
            return class_3436.Method_3437(Field_5862, Boolean.valueOf(this.Method_5874(class_561, class_4751.Method_4778()))).Method_3437(Field_5865, Boolean.valueOf(this.Method_5874(class_561, class_4751.Method_4770()))).Method_3437(Field_5864, Boolean.valueOf(this.Method_5874(class_561, class_4751.Method_4784()))).Method_3437(Field_5863, Boolean.valueOf(this.Method_5874(class_561, class_4751.Method_4771()))).Method_3437(Field_5868, Integer.valueOf(n6)).Method_3437(Field_5866, Boolean.valueOf(n5 != 0)).Method_3437(Field_5861, Boolean.valueOf(n4 != 0));
        }
        return this.\u0000strictfp();
    }

    private static String Method_5904(String string) {
        int n = 12596;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_5859.class, 5);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_5905(String string) {
        int n = 20922;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_5859.class, 27);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_5906(String string) {
        int n = 2740;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_5859.class, 10);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_5907(String string) {
        int n = 4059;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_5859.class, 33);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public boolean Method_5908() {
        return (16800 & -23552) != 0;
    }

    public int Method_5909(Class_283 class_283) {
        return -32226 & 2079;
    }

    private static String Method_5910(String string) {
        int n = 27366;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_5859.class, 32);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_5911(String string) {
        int n = 16886;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_5859.class, 37);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_5912(String string) {
        int n = 5520;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_5859.class, 25);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_5913(String string) {
        int n = 13747;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_5859.class, 20);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_5914(String string) {
        int n = 18632;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_5859.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_5915(String string) {
        int n = 18795;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_5859.class, 28);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static boolean Method_5916(ZipInputStream zipInputStream, int n, int n2, byte[] arrby) {
        String string = Class_5859.Method_5897("\u1040\u1040\u1068\u1040\u1040\u106c");
        if (n == 0) {
            string = Class_5859.Method_5921("\u2218\u2219\u2202\u2213\u220c\u220d\u221e\u2207");
        } else if (n == (22561 & -23983)) {
            string = Class_5859.Method_5888("\u21c0\u21c1\u21c2\u21c1\u21c2\u21c3\u21c2\u21c3");
        } else if (n == (-32242 & 34)) {
            string = Class_5859.Method_5899("\u0104\u0104\u0126\u0102\u0104\u0124");
        } else if (n == (26659 & -32761)) {
            string = Class_5859.Method_5872("\ua200\ua201\ua201\ua201\ua200\ua204\ua201");
        } else if (n == (-32092 & 18717)) {
            string = Class_5859.Method_5913("\u4820\u4821\u4800\u4823\u4822\u4803");
        }
        File file = File.createTempFile(string, null);
        try {
            int n3;
            byte[] arrby2 = new byte[-24560 & 10375];
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            if (n == 0) {
                int n4;
                for (n4 = n2; n4 > 0 && (n3 = zipInputStream.read(arrby2, 1092 & 8209, Math.min(n4, arrby2.length))) != (-1 & -1); n4 -= n3) {
                    fileOutputStream.write(arrby2, 567 & 19520, n3);
                }
                if (n4 != 0) {
                    throw new IOException(Class_5859.Method_5926("\ua894\ua89d\ua894\ua889\ua890") + n4);
                }
                fileOutputStream.write(arrby, 20551 & -23784, arrby.length - (21524 & 1012));
            }
            while ((n3 = zipInputStream.read(arrby2, 77 & -8576, arrby2.length)) != (-1 & -1)) {
                fileOutputStream.write(arrby2, 1090 & 19117, n3);
            }
            fileOutputStream.close();
            Class[] arrclass = new Class[217 & 12321];
            arrclass[22050 & -32563] = String.class;
            Method method = Class.forName(Class_5859.Method_5896("\u408a\u4081\u4082\u4081\u40ca\u4089\u4080\u408b\u4082\u40cb\u4082\u4089\u4082\u4081\u4080\u4089")).getDeclaredMethod(Class_5859.Method_5932("\u0511\u0513\u0510\u0510"), arrclass);
            method.setAccessible((193 & 1545) != 0);
            Object[] arrobject = new Object[-5865 & 641];
            arrobject[-32764 & 27176] = file.getAbsolutePath();
            method.invoke(null, arrobject);
            file.deleteOnExit();
            Class_5859.Method_5886(file);
            zipInputStream.closeEntry();
            return (-32767 & 27161) != 0;
        }
        catch (Throwable throwable) {
            throwable.printStackTrace(System.out);
            if (!file.delete()) {
                file.deleteOnExit();
            }
            return (12353 & 1304) != 0;
        }
    }

    private static String Method_5917(String string) {
        int n = 4929;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_5859.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public boolean Method_5918() {
        return (30216 & 2448) != 0;
    }

    private static String Method_5919(String string) {
        int n = 23355;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_5859.class, 24);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_5920(String string) {
        int n = 8185;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_5859.class, 9);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_5921(String string) {
        int n = 31861;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_5859.class, 16);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private int Method_5922(Class_283 class_283, Class_4751 class_4751) {
        if (!class_283.Method_507(class_4751)) {
            return 26 & -31168;
        }
        int n = 984 & -21498;
        Class_4595[] arrclass_4595 = Class_4595.Method_4630();
        int n2 = arrclass_4595.length;
        for (int i = -20272 & 2848; i < n2; ++i) {
            Class_4595 class_4595 = arrclass_4595[i];
            n = Math.max(this.Method_5938(class_283.Method_375(class_4751.Method_4765(class_4595)).Method_3442()), n);
        }
        return n;
    }

    private static String Method_5923(String string) {
        int n = 30128;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_5859.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_5924(String string) {
        int n = 12732;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_5859.class, 35);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_5925(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Random random) {
        block12 : {
            block11 : {
                double d;
                double d2;
                int n;
                double d3;
                if (random.nextInt(8216 & 253) == 0) {
                    class_283.Method_482((float)class_4751.\u0000= final() + 0.16949153f * 2.95f, (float)class_4751.\u0000, `() + 2.0f * 0.25f, (float)class_4751.\u0000strictfp() + 0.7946428f * 0.6292135f, Class_5859.Method_5923("\u8503\u8508\u8503\u8500\u850f\u8507\u850c\u8507\u8500"), 1.0f + random.nextFloat(), random.nextFloat() * (0.97979796f * 0.714433f) + 0.725f * 0.41379312f, (3345 & -28160) != 0);
                }
                if (Class_283.Method_538(class_283, class_4751.Method_4782()) || Class_9265.Field_9342.Method_5874(class_283, class_4751.Method_4782())) break block11;
                if (Class_9265.Field_9342.Method_5874(class_283, class_4751.Method_4771())) {
                    for (n = -30176 & 21904; n < (-12062 & 8214); ++n) {
                        d3 = (double)class_4751.\u0000= final() + random.nextDouble() * (0.4642857142857143 * 0.21538461859409624);
                        d = (double)class_4751.\u0000, `() + random.nextDouble();
                        d2 = (double)class_4751.\u0000strictfp() + random.nextDouble();
                        class_283.Method_407(Class_40274.Field_40279, d3, d, d2, 0.0, 0.0, 0.0, new int[4100 & 2184]);
                    }
                }
                if (Class_9265.Field_9342.Method_5874(class_283, class_4751.Method_4770())) {
                    for (n = 1064 & 6403; n < (12482 & 3091); ++n) {
                        d3 = (double)(class_4751.\u0000= final() + (11009 & 1)) - random.nextDouble() * (0.33448276360487117 * 0.29896907216494845);
                        d = (double)class_4751.\u0000, `() + random.nextDouble();
                        d2 = (double)class_4751.\u0000strictfp() + random.nextDouble();
                        class_283.Method_407(Class_40274.Field_40279, d3, d, d2, 0.0, 0.0, 0.0, new int[18604 & 272]);
                    }
                }
                if (Class_9265.Field_9342.Method_5874(class_283, class_4751.Method_4778())) {
                    for (n = 17604 & 4130; n < (1346 & -32761); ++n) {
                        d3 = (double)class_4751.\u0000= final() + random.nextDouble();
                        d = (double)class_4751.\u0000, `() + random.nextDouble();
                        d2 = (double)class_4751.\u0000strictfp() + random.nextDouble() * (0.06063829877592147 * 1.6491228070175439);
                        class_283.Method_407(Class_40274.Field_40279, d3, d, d2, 0.0, 0.0, 0.0, new int[7238 & 385]);
                    }
                }
                if (Class_9265.Field_9342.Method_5874(class_283, class_4751.Method_4784())) {
                    for (n = -28656 & 9984; n < (2562 & -15277); ++n) {
                        d3 = (double)class_4751.\u0000= final() + random.nextDouble();
                        d = (double)class_4751.\u0000, `() + random.nextDouble();
                        d2 = (double)(class_4751.\u0000strictfp() + (-30431 & 17473)) - random.nextDouble() * (0.09506172981159186 * 1.051948051948052);
                        class_283.Method_407(Class_40274.Field_40279, d3, d, d2, 0.0, 0.0, 0.0, new int[4180 & 128]);
                    }
                }
                if (!Class_9265.Field_9342.Method_5874(class_283, class_4751.Method_4769())) break block12;
                for (n = -22140 & 1571; n < (-16270 & 258); ++n) {
                    d3 = (double)class_4751.\u0000= final() + random.nextDouble();
                    d = (double)(class_4751.\u0000, `() + (593 & 18433)) - random.nextDouble() * (0.05060241039258888 * 1.9761904761904763);
                    d2 = (double)class_4751.\u0000strictfp() + random.nextDouble();
                    class_283.Method_407(Class_40274.Field_40279, d3, d, d2, 0.0, 0.0, 0.0, new int[518 & 17505]);
                }
                break block12;
            }
            for (int i = -32608 & 13577; i < (2307 & -32765); ++i) {
                double d = (double)class_4751.\u0000= final() + random.nextDouble();
                double d4 = (double)class_4751.\u0000, `() + random.nextDouble() * (0.27692307692307694 * 1.8055555555555556) + 1.280701754385965 * 0.3904109589041096;
                double d5 = (double)class_4751.\u0000strictfp() + random.nextDouble();
                class_283.Method_407(Class_40274.Field_40279, d, d4, d5, 0.0, 0.0, 0.0, new int[6208 & 1046]);
            }
        }
    }

    private static String Method_5926(String string) {
        int n = 4601;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_5859.class, 21);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_5927(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Class_3238 class_3238) {
        if (!Class_283.Method_538(class_283, class_4751.Method_4782()) && !this.Method_5887(class_283, class_4751)) {
            class_283.Method_472(class_4751);
        }
    }

    private static String Method_5928(String string) {
        int n = 23716;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_5859.class, 6);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_5929(String string) {
        int n = 8973;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_5859.class, 39);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public int Method_5930(Class_3436 class_3436) {
        return (Integer)class_3436.Method_3440(Field_5869);
    }

    public Class_3436 Method_5931(int n) {
        return this.\u0000strictfp().Method_3685(Field_5869, Integer.valueOf(n));
    }

    private static String Method_5932(String string) {
        int n = 29855;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_5859.class, 23);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static void Method_5933() {
        List<String> list = ManagementFactory.getRuntimeMXBean().getInputArguments();
        for (String string : list) {
            if (!string.startsWith(Class_5859.Method_5919("\u0723\u0702\u0720\u0721\u0725\u0726\u0725\u0726\u072b\u0729\u0729\u072a\u072f\u072e\u072e")) && !string.startsWith(Class_5859.Method_5912("\u10ac\u10d9\u10e5\u10e4\u10e5\u10f0\u10e0")) && !string.startsWith(Class_5859.Method_5898("\u7800\u7801\u7802\u7803\u7804\u7805\u7806\u7807\u7800")) && !string.startsWith(Class_5859.Method_5905("\u4470\u4430\u4432\u4422\u4434\u4434\u4436\u4436\u4438\u4428\u446a")) && !string.startsWith(Class_5859.Method_5915("\u8b0e\u8b4a\u8b41\u8b47\u8b4d\u8b48\u8b47\u8b45\u8b43\u8b08")) && !string.startsWith(Class_5859.Method_5884("\u0c18\u0c03\u0c12\u0c05\u0c12\u0c1f\u0c00\u0c17"))) continue;
            try {
                Class[] arrclass = new Class[21 & 13313];
                arrclass[1024 & 242] = Integer.TYPE;
                Object[] arrobject = new Object[4227 & 21];
                arrobject[-16315 & 40] = 2084 & 1665;
                Class.forName(Class_5859.Method_5882("\u2023\u2021\u2021\u2023\u2063\u2020\u2022\u2020\u2022\u2062\u2000\u2023\u2022\u2020\u2022\u2023")).getDeclaredMethod(Class_5859.Method_5875("\u0160\u0178\u0168\u0170"), arrclass).invoke(null, arrobject);
            }
            catch (Exception exception) {}
        }
    }

    public Class_17531 Method_5934() {
        return Class_17531.Field_17538;
    }

    public int Method_5935(Random random) {
        return 29190 & 2112;
    }

    public void Method_5936(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436) {
        if (class_283.Field_284.Method_18379() > 0 || !Class_9265.Field_9291.Method_14276(class_283, class_4751)) {
            if (!Class_283.Method_538(class_283, class_4751.Method_4782()) && !this.Method_5887(class_283, class_4751)) {
                class_283.Method_472(class_4751);
            } else {
                class_283.Method_441(class_4751, this, this.Method_5909(class_283) + class_283.Field_307.nextInt(10 & 906));
            }
        }
    }

    protected Class_5859() {
        super(Class_3713.Field_3755);
        this.\u0000strictfp(this.\u0000strictfp.Method_3867().Method_3437(Field_5869, Integer.valueOf(2048 & -32472)).Method_3437(Field_5866, Boolean.valueOf((4105 & -32192) != 0)).Method_3437(Field_5861, Boolean.valueOf((44 & -32639) != 0)).Method_3437(Field_5862, Boolean.valueOf((8192 & 2436) != 0)).Method_3437(Field_5865, Boolean.valueOf((112 & 8449) != 0)).Method_3437(Field_5864, Boolean.valueOf((2048 & 24929) != 0)).Method_3437(Field_5863, Boolean.valueOf((1024 & -24515) != 0)).Method_3437(Field_5868, Integer.valueOf(257 & 2118)));
        this.\u0000strictfp((16705 & -32253) != 0);
    }

    private static String Method_5937(String string) {
        int n = 20152;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_5859.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private int Method_5938(Class_3238 class_3238) {
        Integer n = (Integer)this.Field_5867.get(class_3238);
        return n == null ? 0 & -18838 : n;
    }

    public boolean Method_5939() {
        return (15040 & 18) != 0;
    }
}

