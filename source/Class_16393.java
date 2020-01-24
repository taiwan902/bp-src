/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.Logger
 */
import java.io.File;
import java.io.IOException;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.nio.file.Path;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import org.apache.logging.log4j.Logger;

public class Class_16393 {
    public static String Field_16394;
    public static final String[] Field_16395;
    private static int Field_16396;
    private static final Class_15281[] Field_16397;
    private static boolean Field_16398;

    private static String Method_16399(String string) {
        int n = 9314;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_16393.class, 7);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_16400(String string) {
        int n = 18338;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_16393.class, 16);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static void Method_16401(boolean bl, Class_24595 class_24595, Class_15281 class_15281) {
        block5 : {
            File file = new File(Field_16394 + "\\" + class_15281.Field_15283);
            if (file.exists()) {
                try {
                    String string = Class_7749.Method_7754(file.toPath());
                    if (class_15281.Field_15282[(9958 & -30718) + (bl ? -30073 & 21873 : -28623 & 1800)].equals(string)) {
                        Field_16396 += 26889 & 1025;
                        break block5;
                    }
                    file.delete();
                    Class_16393.Method_16415(bl, class_24595, class_15281);
                }
                catch (IOException iOException) {
                    Class_18.Field_19.info("[OpusDownloader] Nie mozna zaladowac: " + class_15281.Field_15283);
                    Field_16398 = -32751 & 18945;
                }
            } else {
                Class_16393.Method_16415(bl, class_24595, class_15281);
            }
        }
    }

    private static String Method_16402(String string) {
        int n = 22539;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_16393.class, 13);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_16403(String string) {
        int n = 4599;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_16393.class, 25);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_16404(String string) {
        int n = 22758;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_16393.class, 12);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_16405(String string) {
        int n = 6931;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_16393.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    static void Method_16406(boolean bl, Class_24595 class_24595, Class_15281 class_15281) {
        Class_16393.Method_16401(bl, class_24595, class_15281);
    }

    private static String Method_16407(String string) {
        int n = 25058;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_16393.class, 18);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    static {
        Field_16395 = new String[1 & 20625];
        Field_16397 = new Class_15281[4105 & -13823];
        Field_16396 = 387 & 28736;
        Field_16398 = -20332 & 3104;
        int n = 2048 & 14017;
        if (Class_18.Field_76 == (2593 & 4289)) {
            int n2 = n++;
            String[] arrstring = new String[8316 & -32252];
            arrstring[-30328 & 6] = Class_16393.Method_16405("\u2241\u2241\u2245\u2240\u2205\u2241\u2205\u2245\u2241\u2200\u2245\u2240\u2240\u2244\u2241\u2245\u2200\u2200\u2201\u2201\u2244\u2245\u2245\u2244\u2244\u2205\u2241\u2240\u2241\u2241\u2245\u2241\u2204\u2240\u2205\u2200\u2244\u2201\u2241\u2205");
            arrstring[257 & 1051] = Class_16393.Method_16413("\u0a00\u0a00\u0a0a\u0a02\u0a04\u0a04\u0a06\u0a06\u0a08\u0a08\u0a0a\u0a0a\u0a0c\u0a0c\u0a0e\u0a0e\u0a10\u0a10\u0a12\u0a12\u0a1c\u0a14\u0a1e\u0a16\u0a18\u0a18\u0a1a\u0a1a\u0a1c\u0a1c\u0a1e\u0a1e\u0a00\u0a00\u0a02\u0a02\u0a0c\u0a04\u0a06\u0a06");
            arrstring[4226 & 1067] = Class_16393.Method_16410("\b\u001a\n\n\u001c\u000e\f\f\n\u0018\b\u0018\u000e\f\u000e\u001e\b\u0018\u001a\n\f\u000e\f\f\u0018\u0010\u001a\u0018\f\u001e\u001c\u001c\u001a\b\b\u001a\u001c\u001e\u0004\f");
            arrstring[227 & 12307] = Class_16393.Method_16416("\u0102\u0151\u0100\u0101\u0156\u0105\u0106\u0107\u0100\u0153\u0102\u0153\u0104\u0107\u0104\u0155\u0152\u0103\u0100\u0151\u0156\u0155\u0156\u0157\u0102\u0103\u0100\u0103\u0156\u0105\u0106\u0107\u0150\u0103\u0102\u0151\u0156\u0155\u0106\u0107");
            Class_16393.Field_16397[n2] = new Class_15281(Class_16393.Method_16409("\ue404\ue41a\ue41e\ue418\ue400\ue402\ue406\ue40c\ue404\ue41a\ue41e\ue418\ue41c\ue41c\ue400\ue40a\ue406\ue406"), -7852079272311656192L & 906350816L, 3892658643583811312L & -3892658644730052719L, arrstring);
        }
        if (Class_18.Field_76 == (4482 & 2154)) {
            int n3 = n++;
            String[] arrstring = new String[4644 & -22393];
            arrstring[29024 & 3100] = Class_16393.Method_16399("\u3715\u3704\u3702\u3713\u3714\u3714\u3717\u3716\u3714\u3714\u371e\u3713\u371c\u3715\u3712\u3713\u3710\u3710\u3713\u371f\u3704\u371d\u371f\u3707\u3700\u371d\u3702\u3713\u3710\u3700\u3702\u371e\u3725\u373d\u3733\u3732\u3734\u3731\u3723\u3737");
            arrstring[-3037 & 2373] = Class_16393.Method_16423("\u0f8a\u0f99\u0f9c\u0f8f\u0f88\u0f89\u0f88\u0f8b\u0f88\u0f89\u0f80\u0f8f\u0f80\u0f8b\u0f8e\u0f8f\u0f8c\u0f8d\u0f8c\u0f81\u0f9a\u0f81\u0f80\u0f9b\u0f9e\u0f81\u0f9e\u0f8d\u0f8c\u0f9d\u0f9c\u0f81\u0fba\u0fa1\u0fac\u0fad\u0fa8\u0fad\u0fbc\u0fa9");
            arrstring[-30190 & 20483] = Class_16393.Method_16421("\uc021\uc020\uc021\uc060\uc020\uc061\uc020\uc060\uc060\uc060\uc061\uc061\uc065\uc024\uc020\uc065\uc074\uc074\uc035\uc035\uc035\uc070\uc074\uc035\uc074\uc070\uc075\uc070\uc075\uc075\uc035\uc074\uc061\uc021\uc025\uc064\uc025\uc020\uc025\uc065");
            arrstring[1027 & 263] = Class_16393.Method_16411("\u0400\u0401\u0402\u0403\u0400\u0401\u0402\u0403\u0408\u0409\u040a\u040b\u0408\u0409\u040a\u040b\u0410\u0411\u0412\u0413\u0410\u0411\u0412\u0413\u0418\u0419\u041a\u041b\u0418\u0419\u041a\u041b\u0400\u0401\u0402\u0403\u0400\u0401\u0402\u0403");
            Class_16393.Field_16397[n3] = new Class_15281(Class_16393.Method_16425("\u6000\u6008\u6008\u6008\u6004\u6004\u6004\u600c\u6008\u6000\u6000\u6000\u6004\u6004\u600c\u6004\u6000"), 6243217317484362430L & -6243217318553261146L, -5340642363917878300L & 136152041L, arrstring);
        }
        if (Class_18.Field_76 == (2182 & -12228)) {
            int n4 = n++;
            String[] arrstring = new String[-30652 & 5159];
            arrstring[16480 & 12314] = Class_16393.Method_16404("\u5a90\u5a95\u5a94\u5a95\u5a84\u5a95\u5a94\u5a95\u5a90\u5a95\u5a94\u5a95\u5a90\u5a95\u5a80\u5a95\u5a90\u5a81\u5a80\u5a85\u5a90\u5a95\u5a80\u5a85\u5a90\u5a95\u5a80\u5a81\u5a84\u5a91\u5a90\u5a95\u5aa0\u5ab1\u5ab4\u5ab5\u5aa4\u5ab1\u5ab0\u5ab1");
            arrstring[4099 & -30391] = Class_16393.Method_16402("\u1012\u1010\u101a\u101a\u1000\u1018\u1010\u1012\u1010\u1018\u1010\u101a\u1010\u1012\u1002\u101a\u1002\u1010\u1012\u1010\u1002\u1008\u1012\u1010\u1002\u1002\u1012\u1010\u1010\u1000\u1002\u100a\u1000\u1012\u1012\u101a\u1000\u1012\u1010\u1010");
            arrstring[2418 & -24445] = Class_16393.Method_16422("\u8844\u8844\u8845\u8805\u8845\u8841\u8805\u8845\u8849\u884d\u884d\u8808\u884c\u8808\u8849\u880d\u8810\u8815\u8854\u8814\u8810\u8854\u8810\u8815\u8858\u881d\u8859\u8858\u885c\u8858\u881d\u8818\u8845\u8804\u8844\u8800\u8841\u8844\u8844\u8841");
            arrstring[-32725 & 195] = Class_16393.Method_16419("\u0641\u0641\u0642\u0602\u0640\u0644\u0600\u0640\u064c\u0648\u064a\u060f\u0649\u060d\u064e\u060a\u0605\u0602\u0641\u0601\u0605\u0641\u0607\u0602\u064f\u0608\u064e\u064f\u0649\u064f\u0608\u060d\u0660\u0623\u0663\u0625\u0664\u0661\u0661\u0664");
            Class_16393.Field_16397[n4] = new Class_15281(Class_16393.Method_16417("\u418e\u4181\u4184\u4183\u418a\u4189\u418c\u4187\u4186\u4189\u418c\u418b\u418a\u4189\u4182\u4189\u419c\u419d"), 2042494129637555034L & -2042494129654661286L, -5043802209925485829L & 5043802208997993972L, arrstring);
        }
        if (Class_18.Field_76 == (8389 & 39)) {
            int n5 = n++;
            String[] arrstring = new String[9252 & 16724];
            arrstring[30248 & -30720] = Class_16393.Method_16430("\u0240\u0240\u0216\u0212\u0210\u0210\u0216\u0246\u0240\u0210\u0246\u0212\u0240\u0210\u0242\u0246\u0250\u0204\u0202\u0256\u0254\u0250\u0256\u0252\u0250\u0200\u0202\u0206\u0200\u0254\u0202\u0256\u0210\u0244\u0212\u0212\u0210\u0240\u0212\u0212");
            arrstring[-30719 & 311] = Class_16393.Method_16407("\u12a4\u12a5\u12b0\u12b5\u12b4\u12b5\u12b0\u12a1\u12ac\u12bd\u12a8\u12bd\u12ac\u12bd\u12ac\u12a9\u12b4\u12a1\u12a4\u12b1\u12b0\u12b5\u12b0\u12b5\u12bc\u12ad\u12ac\u12a9\u12ac\u12b9\u12ac\u12b9\u12b4\u12a1\u12b4\u12b5\u12b4\u12a5\u12b4\u12b5");
            arrstring[-24574 & 17103] = Class_16393.Method_16429("\u9620\u963c\u963c\u9620\u963c\u9634\u9634\u9630\u9620\u963c\u9624\u9634\u9624\u9634\u963c\u9624\u9630\u9620\u9634\u9620\u962c\u9620\u9630\u962c\u9620\u9634\u9624\u9620\u9620\u9620\u9634\u9624\u9620\u9624\u9630\u963c\u9624\u9624\u9634\u9634");
            arrstring[515 & 21891] = Class_16393.Method_16426("\u2000\u2041\u2042\u2003\u2044\u2047\u2046\u2047\u2000\u2041\u2000\u2041\u2006\u2047\u2046\u2007\u2012\u2053\u2010\u2051\u2054\u2057\u2016\u2057\u2050\u2013\u2052\u2053\u2056\u2057\u2014\u2055\u2000\u2003\u2040\u2043\u2006\u2007\u2044\u2047");
            Class_16393.Field_16397[n5] = new Class_15281(Class_16393.Method_16400("\uc851\uc84c\uc849\uc84d\uc815\uc854\uc851\uc858\uc851\uc84c\uc849\uc84d\uc80c\uc80c\uc814\uc849\uc851"), 359734839200210229L & 404159871L, 6310931662363808232L & 17297764L, arrstring);
        }
        if (Class_18.Field_76 == (19550 & 4486)) {
            int n6 = n++;
            String[] arrstring = new String[4252 & -15324];
            arrstring[-30455 & 9284] = Class_16393.Method_16412("\u4400\u4400\u4400\u4409\u4401\u4400\u4400\u4401\u4408\u4400\u4401\u4401\u4408\u4401\u4400\u4401\u4408\u4401\u4401\u4400\u4401\u4400\u4401\u4400\u4409\u4401\u4400\u4401\u4400\u4401\u4400\u4400\u4420\u4420\u4429\u4420\u4421\u4420\u4421\u4421");
            arrstring[1537 & 2231] = Class_16393.Method_16427("\u096c\u0939\u093e\u0937\u096c\u0969\u096e\u096f\u093c\u0935\u0966\u0937\u0938\u0965\u0966\u0937\u0934\u093d\u093a\u096b\u0938\u096d\u096a\u096b\u093c\u0965\u0936\u0967\u0930\u0935\u0932\u0933\u091c\u0919\u0916\u094f\u094c\u0949\u091a\u094b");
            arrstring[18979 & 1294] = Class_16393.Method_16428("\u0909\u090c\u090a\u090f\u0909\u090c\u090e\u090b\u0909\u090c\u090e\u0903\u0909\u0908\u090e\u090f\u0918\u0919\u091a\u091e\u0919\u0919\u091b\u091a\u091d\u091c\u091a\u091e\u0919\u0918\u0916\u091b\u0908\u0909\u090b\u090e\u0909\u0908\u090b\u090b");
            arrstring[2067 & 9731] = Class_16393.Method_16403("\u2020\u2024\u2021\u2025\u2020\u2024\u2025\u2021\u2020\u2024\u2025\u2021\u2020\u2020\u2025\u2025\u2031\u2031\u2031\u2034\u2030\u2031\u2030\u2030\u2034\u2034\u2031\u2034\u2030\u2030\u2035\u2031\u2001\u2001\u2000\u2004\u2000\u2000\u2000\u2001");
            Class_16393.Field_16397[n6] = new Class_15281(Class_16393.Method_16424("\u4241\u4243\u4241\u4242\u4205\u4247\u4245\u4247\u4241\u4243\u4241\u4242\u4204\u4207\u4206\u4245\u4243\u4243\u4241\u4243"), 338025848L & 4716737786919902587L, 278830992L & 136481624L, arrstring);
        }
    }

    static boolean Method_16408(boolean bl) {
        Field_16398 = bl;
        return Field_16398;
    }

    private static String Method_16409(String string) {
        int n = 17748;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_16393.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_16410(String string) {
        int n = 5098;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_16393.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_16411(String string) {
        int n = 24712;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_16393.class, 10);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_16412(String string) {
        int n = 26113;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_16393.class, 22);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_16413(String string) {
        int n = 17009;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_16393.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_16414() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private static void Method_16415(boolean bl, Class_24595 class_24595, Class_15281 class_15281) {
        class_24595.Method_24620(bl ? class_15281.Field_15282[7555 & 8221] : class_15281.Field_15282[1089 & 2048], bl ? class_15281.Field_15284[12305 & 1889] : class_15281.Field_15284[1668 & 1], null, new Class_27656(class_15281, bl, class_24595));
    }

    private static String Method_16416(String string) {
        int n = 8360;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_16393.class, 5);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_16417(String string) {
        int n = 6;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_16393.class, 11);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static void Method_16418(boolean bl, Class_24595 class_24595) {
        Class_15281[] arrclass_15281 = Field_16397;
        int n = arrclass_15281.length;
        for (int i = -11440 & 8234; i < n; ++i) {
            Class_15281 class_15281 = arrclass_15281[i];
            Class_16393.Method_16401(bl, class_24595, class_15281);
        }
    }

    private static String Method_16419(String string) {
        int n = 8176;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_16393.class, 15);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static void Method_16420() {
        Field_16394 = new File(Class_21077.Method_21078(), "audio").getAbsolutePath();
        Class_16393.Field_16395[22032 & 1] = Field_16394 + "\\" + Class_16393.Field_16397[-14323 & 5250].Field_15283;
        int n = Class_18.Field_76 >= (1188 & -8164) ? 2369 & -32761 : -31726 & 2116;
        Class_24595 class_24595 = Class_18.Field_89.Method_247(null);
        Class_23299.Field_23303.execute(() -> Class_16393.Method_16418(n != 0, class_24595));
    }

    private static String Method_16421(String string) {
        int n = 12662;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_16393.class, 9);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_16422(String string) {
        int n = 28261;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_16393.class, 14);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_16423(String string) {
        int n = 17479;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_16393.class, 8);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_16424(String string) {
        int n = 26767;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_16393.class, 21);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_16425(String string) {
        int n = 18320;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_16393.class, 6);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_16426(String string) {
        int n = 23414;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_16393.class, 20);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_16427(String string) {
        int n = 9251;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_16393.class, 23);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_16428(String string) {
        int n = 15709;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_16393.class, 24);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_16429(String string) {
        int n = 19445;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_16393.class, 19);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_16430(String string) {
        int n = 23149;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_16393.class, 17);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }
}

