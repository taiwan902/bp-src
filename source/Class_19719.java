/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  \u0000~ float { 0 default 7 { short , public int implements public 0 package catch interface volatile + goto static null for 3 0 0 do 9 public float final long short , * ' for % volatile ` if float 0 abstract double byte private throws # true synchronized 6 ~ = ` void long
 */
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Class_19719 {
    private static final Pattern Field_19720 = Pattern.compile(Class_19719.Method_19724("\uc138\uc13a\uc114\uc10c\uc104\uc110\uc102\uc114\uc11c\uc106\uc100\uc100\uc132\uc11c\uc104\uc100\uc11c\uc112"));
    private static final Pattern Field_19721 = Pattern.compile(Class_19719.Method_19740("\u2c02\u2c00\u2c26\u2c26\u2c22\u2c20\u2c26\u2c22\u2c28\u2c28\u2c28\u2c28\u2c0c\u2c2a\u2c2a\u2c2a\u2c34\u2c16\u2c14\u2c30\u2c12\u2c30\u2c34\u2c32\u2c3c\u2c38\u2c3c\u2c1a\u2c3e\u2c1c\u2c3e\u2c1c\u2c26\u2c24\u2c26\u2c22\u2c22\u2c24"));
    private static final Set Field_19722 = Class_19719.Method_19733();

    private static void Method_19723(Class_19214 class_19214, String string, Map map) {
        String[] arrstring = Class_19719.Method_19736(class_19214, string);
        for (int i = 28944 & 516; i < arrstring.length; ++i) {
            String string2 = arrstring[i];
            Class_18480 class_18480 = Class_19719.Method_19726(string2, string);
            if (class_18480 == null || class_18480.Method_18504().startsWith(Class_47266.Method_47274()) || class_18480.Method_18517() && !Class_19719.Method_19739(class_18480, arrstring)) continue;
            String string3 = class_18480.Method_18504();
            Class_18480 class_184802 = (Class_18480)map.get(string3);
            if (class_184802 != null) {
                if (!Class_19426.Method_19529(class_184802.Method_18514(), class_18480.Method_18514())) {
                    Class_19426.Method_19610("Ambiguous shader option: " + class_18480.Method_18504());
                    Class_19426.Method_19610(" - in " + Class_19426.Method_19555(class_184802.Method_18516()) + ": " + class_184802.Method_18514());
                    Class_19426.Method_19610(" - in " + Class_19426.Method_19555(class_18480.Method_18516()) + ": " + class_18480.Method_18514());
                    class_184802.Method_18515((21504 & -32476) != 0);
                }
                if (class_184802.Method_18492() == null || class_184802.Method_18492().length() <= 0) {
                    class_184802.Method_18490(class_18480.Method_18492());
                }
                class_184802.Method_18500(class_18480.Method_18516());
                continue;
            }
            map.put(string3, class_18480);
        }
    }

    private static String Method_19724(String string) {
        int n = 18537;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19719.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static BufferedReader Method_19725(BufferedReader bufferedReader, String string, Class_19214 class_19214, int n, List list, int n2) {
        String string2 = "/";
        int n3 = string.lastIndexOf("/");
        if (n3 >= 0) {
            string2 = string.substring(64 & -30716, n3);
        }
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        int n4 = -1 & -1;
        LinkedHashSet<CharSequence> linkedHashSet = new LinkedHashSet<CharSequence>();
        int n5 = 323 & -24571;
        do {
            Object object;
            String string3;
            Object object2;
            Object object3;
            CharSequence charSequence2;
            if ((string3 = bufferedReader.readLine()) == null) {
                object = charArrayWriter.toCharArray();
                if (n4 >= 0 && linkedHashSet.size() > 0) {
                    object2 = new StringBuilder();
                    for (CharSequence charSequence2 : linkedHashSet) {
                        object2.append("#define ");
                        object2.append((String)charSequence2);
                        object2.append("\n");
                    }
                    object3 = object2.toString();
                    charSequence2 = new StringBuilder(new String((char[])object));
                    ((StringBuilder)charSequence2).insert(n4, (String)object3);
                    String string4 = ((StringBuilder)charSequence2).toString();
                    object = string4.toCharArray();
                }
                object2 = new CharArrayReader((char[])object);
                return new BufferedReader((Reader)object2);
            }
            if (n4 < 0 && ((Matcher)(object = Field_19720.matcher(string3))).matches()) {
                object2 = Class_47266.Method_47271();
                object3 = string3 + "\n" + (String)object2;
                charSequence2 = "#line " + (n5 + (49 & 9281)) + " " + n;
                string3 = (String)object3 + (String)charSequence2;
                n4 = charArrayWriter.size() + ((String)object3).length();
            }
            if (((Matcher)(object = Field_19721.matcher(string3))).matches()) {
                int n6;
                object2 = ((Matcher)object).group(7 & -14175);
                boolean bl = object2.startsWith("/");
                CharSequence charSequence3 = charSequence2 = bl ? "/shaders" + (String)object2 : string2 + "/" + (String)object2;
                if (!list.contains(charSequence2)) {
                    list.add(charSequence2);
                }
                if ((string3 = Class_19719.Method_19732((String)charSequence2, class_19214, n6 = list.indexOf(charSequence2) + (81 & 7557), list, n2)) == null) {
                    throw new IOException("Included file not found: " + string);
                }
                if (string3.endsWith("\n")) {
                    string3 = string3.substring(3080 & -16266, string3.length() - (26129 & 2307));
                }
                string3 = "#line 1 " + n6 + "\n" + string3 + "\n#line " + (n5 + (-32507 & 9353)) + " " + n;
            }
            if (n4 >= 0 && string3.contains(Class_47266.Method_47274())) {
                object2 = Class_19719.Method_19737(string3, Class_47266.Method_47270());
                for (int i = 18520 & -31738; i < ((String[])object2).length; ++i) {
                    charSequence2 = object2[i];
                    linkedHashSet.add(charSequence2);
                }
            }
            charArrayWriter.write(string3);
            charArrayWriter.write("\n");
            ++n5;
        } while (true);
    }

    private static Class_18480 Method_19726(String string, String string2) {
        Class_18480 class_18480 = null;
        if (class_18480 == null) {
            class_18480 = Class_27027.Method_27031(string, string2);
        }
        if (class_18480 == null) {
            class_18480 = Class_31544.Method_31546(string, string2);
        }
        if (class_18480 != null) {
            return class_18480;
        }
        if (class_18480 == null) {
            class_18480 = Class_35124.Method_35126(string, string2);
        }
        if (class_18480 == null) {
            class_18480 = Class_34047.Method_34051(string, string2);
        }
        return class_18480 != null && Field_19722.contains(class_18480.Method_18504()) ? class_18480 : null;
    }

    private static Class_15342 Method_19727(String string, String string2, String string3, String string4, Map map) {
        try {
            Class_17976 class_17976 = Class_17976.Method_17981(string3);
            if (class_17976 == null) {
                Class_26062.Method_26066("Unknown " + string + " type: " + (Object)((Object)class_17976));
                return null;
            }
            Class_33931 class_33931 = new Class_33931(map);
            Class_20660 class_20660 = new Class_20660(class_33931);
            Class_13745 class_13745 = class_20660.Method_20669(string4);
            Class_18434 class_18434 = class_13745.Method_13746();
            if (!class_17976.Method_17992(class_18434)) {
                Class_26062.Method_26066("Expression type does not match " + string + " type, expression: " + (Object)((Object)class_18434) + ", " + string + ": " + (Object)((Object)class_17976) + " " + string2);
                return null;
            }
            Class_15342 class_15342 = new Class_15342(string2, class_17976, class_13745);
            return class_15342;
        }
        catch (\u0000~ float { 0 default 7 { short , public int implements public 0 package catch interface volatile + goto static null for 3 0 0 do 9 public float final long short , * ' for % volatile ` if float 0 abstract double byte private throws # true synchronized 6 ~ = ` void long \u0000~ float { 0 default 7 { short , public int implements public 0 package catch interface volatile + goto static null for 3 0 0 do 9 public float final long short , * ' for % volatile ` if float 0 abstract double byte private throws # true synchronized 6 ~ = ` void long2) {
            Class_26062.Method_26066(((Object)((Object)\u0000~ float { 0 default 7 { short , public int implements public 0 package catch interface volatile + goto static null for 3 0 0 do 9 public float final long short , * ' for % volatile ` if float 0 abstract double byte private throws # true synchronized 6 ~ = ` void long2)).getClass().getName() + ": " + \u0000~ float { 0 default 7 { short , public int implements public 0 package catch interface volatile + goto static null for 3 0 0 do 9 public float final long short , * ' for % volatile ` if float 0 abstract double byte private throws # true synchronized 6 ~ = ` void long2.getMessage());
            return null;
        }
    }

    public static Class_23042 Method_19728(Properties properties) {
        Object object2;
        String string = "uniform";
        String string2 = "variable";
        String string3 = string + ".";
        String string4 = string2 + ".";
        HashMap<String, Class_13745> hashMap = new HashMap<String, Class_13745>();
        ArrayList<Class_15342> arrayList = new ArrayList<Class_15342>();
        for (Object object2 : properties.keySet()) {
            String[] arrstring = Class_19426.Method_19561((String)object2, ".");
            if (arrstring.length != (523 & 8275)) continue;
            String string5 = arrstring[4098 & 1280];
            String string6 = arrstring[27953 & 641];
            String string7 = arrstring[-21742 & 1034];
            String string8 = properties.getProperty((String)object2).trim();
            if (hashMap.containsKey(string7)) {
                Class_26062.Method_26066("Expression already defined: " + string7);
                continue;
            }
            if (!string5.equals(string) && !string5.equals(string2)) continue;
            Class_26062.Method_26067("Custom " + string5 + ": " + string7);
            Class_15342 class_15342 = Class_19719.Method_19727(string5, string7, string6, string8, hashMap);
            if (class_15342 == null) continue;
            hashMap.put(string7, class_15342.Method_15348());
            if (string5.equals(string2)) continue;
            arrayList.add(class_15342);
        }
        if (arrayList.size() <= 0) {
            return null;
        }
        Class_15342[] arrclass_15342 = arrayList.toArray(new Class_15342[arrayList.size()]);
        object2 = new Class_23042(arrclass_15342);
        return object2;
    }

    private void Method_19729() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public static Class_7985[] Method_19730(Properties properties, Class_18480[] arrclass_18480) {
        String string = "profile.";
        ArrayList<Class_7985> arrayList = new ArrayList<Class_7985>();
        for (String string2 : properties.keySet()) {
            if (!string2.startsWith(string)) continue;
            String string3 = string2.substring(string.length());
            properties.getProperty(string2);
            HashSet hashSet = new HashSet();
            Class_7985 class_7985 = Class_19719.Method_19731(string3, properties, hashSet, arrclass_18480);
            if (class_7985 == null) continue;
            arrayList.add(class_7985);
        }
        if (arrayList.size() <= 0) {
            return null;
        }
        Class_7985[] arrclass_7985 = arrayList.toArray(new Class_7985[arrayList.size()]);
        return arrclass_7985;
    }

    private static Class_7985 Method_19731(String string, Properties properties, Set set, Class_18480[] arrclass_18480) {
        String string2 = "profile.";
        String string3 = string2 + string;
        if (set.contains(string3)) {
            Class_19426.Method_19610("[Shaders] Profile already parsed: " + string);
            return null;
        }
        set.add(string);
        Class_7985 class_7985 = new Class_7985(string);
        String string4 = properties.getProperty(string3);
        String[] arrstring = Class_19426.Method_19561(string4, " ");
        for (int i = -16250 & 9265; i < arrstring.length; ++i) {
            Object object;
            Object object2;
            Object object3;
            String string5 = arrstring[i];
            if (string5.startsWith(string2)) {
                object2 = string5.substring(string2.length());
                object = Class_19719.Method_19731((String)object2, properties, set, arrclass_18480);
                if (class_7985 == null) continue;
                class_7985.Method_7999((Class_7985)object);
                class_7985.Method_7997(((Class_7985)object).Method_7992());
                continue;
            }
            object2 = Class_19426.Method_19561(string5, ":=");
            if (((String[])object2).length == (8531 & -27603)) {
                Object object4;
                object = object2[9344 & 261];
                boolean bl = 4465 & 16523;
                if (((String)object).startsWith("!")) {
                    bl = 328 & 9265;
                    object = ((String)object).substring(16407 & 73);
                }
                if (((String)object).startsWith((String)(object3 = "program."))) {
                    object4 = ((String)object).substring(((String)object3).length());
                    if (!Class_12440.Method_12866((String)object4)) {
                        Class_19426.Method_19610("Invalid program: " + (String)object4 + " in profile: " + class_7985.Method_7994());
                        continue;
                    }
                    if (bl) {
                        class_7985.Method_7993((String)object4);
                        continue;
                    }
                    class_7985.Method_7996((String)object4);
                    continue;
                }
                object4 = Class_13434.Method_13437((String)object, arrclass_18480);
                if (!(object4 instanceof Class_27027)) {
                    Class_19426.Method_19610("[Shaders] Invalid option: " + (String)object);
                    continue;
                }
                class_7985.Method_7991((String)object, String.valueOf(bl));
                ((Class_18480)object4).Method_18494((161 & 16387) != 0);
                continue;
            }
            if (((String[])object2).length != (554 & -3754)) {
                Class_19426.Method_19610("[Shaders] Invalid option value: " + string5);
                continue;
            }
            object = object2[290 & 32392];
            String string6 = object2[25089 & 1025];
            object3 = Class_13434.Method_13437((String)object, arrclass_18480);
            if (object3 == null) {
                Class_19426.Method_19610("[Shaders] Invalid option: " + string5);
                continue;
            }
            if (!((Class_18480)object3).Method_18510(string6)) {
                Class_19426.Method_19610("[Shaders] Invalid value: " + string5);
                continue;
            }
            ((Class_18480)object3).Method_18494((4167 & -32599) != 0);
            class_7985.Method_7991((String)object, string6);
        }
        return class_7985;
    }

    private static String Method_19732(String string, Class_19214 class_19214, int n, List list, int n2) {
        if (n2 >= (1034 & 20490)) {
            throw new IOException("#include depth exceeded: " + n2 + ", file: " + string);
        }
        ++n2;
        InputStream inputStream = class_19214.Method_19218(string);
        if (inputStream == null) {
            return null;
        }
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "ASCII");
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        bufferedReader = Class_19719.Method_19725(bufferedReader, string, class_19214, n, list, n2);
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        String string2;
        while ((string2 = bufferedReader.readLine()) != null) {
            charArrayWriter.write(string2);
            charArrayWriter.write("\n");
        }
        return charArrayWriter.toString();
    }

    private static Set Method_19733() {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("shadowMapResolution");
        hashSet.add("shadowMapFov");
        hashSet.add("shadowDistance");
        hashSet.add("shadowDistanceRenderMul");
        hashSet.add("shadowIntervalSize");
        hashSet.add("generateShadowMipmap");
        hashSet.add("generateShadowColorMipmap");
        hashSet.add("shadowHardwareFiltering");
        hashSet.add("shadowHardwareFiltering0");
        hashSet.add("shadowHardwareFiltering1");
        hashSet.add("shadowtex0Mipmap");
        hashSet.add("shadowtexMipmap");
        hashSet.add("shadowtex1Mipmap");
        hashSet.add("shadowcolor0Mipmap");
        hashSet.add("shadowColor0Mipmap");
        hashSet.add("shadowcolor1Mipmap");
        hashSet.add("shadowColor1Mipmap");
        hashSet.add("shadowtex0Nearest");
        hashSet.add("shadowtexNearest");
        hashSet.add("shadow0MinMagNearest");
        hashSet.add("shadowtex1Nearest");
        hashSet.add("shadow1MinMagNearest");
        hashSet.add("shadowcolor0Nearest");
        hashSet.add("shadowColor0Nearest");
        hashSet.add("shadowColor0MinMagNearest");
        hashSet.add("shadowcolor1Nearest");
        hashSet.add("shadowColor1Nearest");
        hashSet.add("shadowColor1MinMagNearest");
        hashSet.add("wetnessHalflife");
        hashSet.add("drynessHalflife");
        hashSet.add("eyeBrightnessHalflife");
        hashSet.add("centerDepthHalflife");
        hashSet.add("sunPathRotation");
        hashSet.add("ambientOcclusionLevel");
        hashSet.add("superSamplingLevel");
        hashSet.add("noiseTextureResolution");
        return hashSet;
    }

    public static Class_18480[] Method_19734(Class_19214 class_19214, String[] arrstring, List list) {
        Class_18480[] arrclass_18480;
        if (class_19214 == null) {
            return new Class_18480[-32752 & 16448];
        }
        HashMap hashMap = new HashMap();
        Class_19719.Method_19738(class_19214, "/shaders", arrstring, hashMap);
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            int n = (Integer)iterator.next();
            arrclass_18480 = "/shaders/world" + n;
            Class_19719.Method_19738(class_19214, (String)arrclass_18480, arrstring, hashMap);
        }
        Collection collection = hashMap.values();
        arrclass_18480 = collection.toArray(new Class_18480[collection.size()]);
        Class_20619 class_20619 = new Class_20619();
        Arrays.sort(arrclass_18480, class_20619);
        return arrclass_18480;
    }

    public static Map Method_19735(Properties properties, Class_7985[] arrclass_7985, Class_18480[] arrclass_18480) {
        HashMap hashMap = new HashMap();
        Class_19719.Method_19741("screen", properties, hashMap, arrclass_7985, arrclass_18480);
        return hashMap.isEmpty() ? null : hashMap;
    }

    private static String[] Method_19736(Class_19214 class_19214, String string) {
        try {
            ArrayList arrayList = new ArrayList();
            String string2 = Class_19719.Method_19732(string, class_19214, 1345 & -2016, arrayList, 564 & 2114);
            if (string2 == null) {
                return new String[221 & 16416];
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(string2.getBytes());
            String[] arrstring = Class_19426.Method_19515(byteArrayInputStream);
            return arrstring;
        }
        catch (IOException iOException) {
            Class_19426.Method_19526(iOException.getClass().getName() + ": " + iOException.getMessage());
            return new String[2048 & 385];
        }
    }

    private static String[] Method_19737(String string, String[] arrstring) {
        ArrayList<String> arrayList = new ArrayList<String>();
        for (int i = 8896 & 3077; i < arrstring.length; ++i) {
            String string2 = arrstring[i];
            if (!string.contains(string2)) continue;
            arrayList.add(string2);
        }
        String[] arrstring2 = arrayList.toArray(new String[arrayList.size()]);
        return arrstring2;
    }

    private static void Method_19738(Class_19214 class_19214, String string, String[] arrstring, Map map) {
        for (int i = 4804 & 1; i < arrstring.length; ++i) {
            String string2 = arrstring[i];
            if (string2.equals("")) continue;
            String string3 = string + "/" + string2 + ".vsh";
            String string4 = string + "/" + string2 + ".fsh";
            Class_19719.Method_19723(class_19214, string3, map);
            Class_19719.Method_19723(class_19214, string4, map);
        }
    }

    private static boolean Method_19739(Class_18480 class_18480, String[] arrstring) {
        for (int i = 1218 & -28371; i < arrstring.length; ++i) {
            String string = arrstring[i];
            if (!class_18480.Method_18496(string)) continue;
            return (2357 & -7997) != 0;
        }
        return (6160 & 1024) != 0;
    }

    private static String Method_19740(String string) {
        int n = 12679;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19719.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static boolean Method_19741(String string, Properties properties, Map map, Class_7985[] arrclass_7985, Class_18480[] arrclass_18480) {
        Object object;
        String string2;
        String string3 = properties.getProperty(string);
        if (string3 == null) {
            return (4104 & 24898) != 0;
        }
        ArrayList<Object> arrayList = new ArrayList<Object>();
        HashSet<String> hashSet = new HashSet<String>();
        String[] arrstring = Class_19426.Method_19561(string3, " ");
        for (int i = 1043 & 16448; i < arrstring.length; ++i) {
            Object object2;
            string2 = arrstring[i];
            if (string2.equals("<empty>")) {
                arrayList.add(null);
                continue;
            }
            if (hashSet.contains(string2)) {
                Class_19426.Method_19610("[Shaders] Duplicate option: " + string2 + ", key: " + string);
                continue;
            }
            hashSet.add(string2);
            if (string2.equals("<profile>")) {
                if (arrclass_7985 == null) {
                    Class_19426.Method_19610("[Shaders] Option profile can not be used, no profiles defined: " + string2 + ", key: " + string);
                    continue;
                }
                object2 = new Class_24723(arrclass_7985, arrclass_18480);
                arrayList.add(object2);
                continue;
            }
            if (string2.equals("*")) {
                object2 = new Class_19759("<rest>");
                arrayList.add(object2);
                continue;
            }
            if (string2.startsWith("[") && string2.endsWith("]")) {
                object2 = Class_35556.Method_35560(string2, "[", "]");
                if (!((String)object2).matches("^[a-zA-Z0-9_]+$")) {
                    Class_19426.Method_19610("[Shaders] Invalid screen: " + string2 + ", key: " + string);
                    continue;
                }
                if (!Class_19719.Method_19741("screen." + (String)object2, properties, map, arrclass_7985, arrclass_18480)) {
                    Class_19426.Method_19610("[Shaders] Invalid screen: " + string2 + ", key: " + string);
                    continue;
                }
                object = new Class_26376((String)object2);
                arrayList.add(object);
                continue;
            }
            object2 = Class_13434.Method_13437(string2, arrclass_18480);
            if (object2 == null) {
                Class_19426.Method_19610("[Shaders] Invalid option: " + string2 + ", key: " + string);
                arrayList.add(null);
                continue;
            }
            ((Class_18480)object2).Method_18494((65 & 257) != 0);
            arrayList.add(object2);
        }
        Class_18480[] arrclass_184802 = arrayList.toArray(new Class_18480[arrayList.size()]);
        string2 = properties.getProperty(string + ".columns");
        int n = Class_19426.Method_19502(string2, -30590 & 8263);
        object = new Class_26599(string, arrclass_184802, n);
        map.put(string, object);
        return (12309 & -12343) != 0;
    }

    public static Set Method_19742(Properties properties, Class_18480[] arrclass_18480) {
        HashSet<String> hashSet = new HashSet<String>();
        String string = properties.getProperty("sliders");
        if (string == null) {
            return hashSet;
        }
        String[] arrstring = Class_19426.Method_19561(string, " ");
        for (int i = 520 & 21910; i < arrstring.length; ++i) {
            String string2 = arrstring[i];
            Class_18480 class_18480 = Class_13434.Method_13437(string2, arrclass_18480);
            if (class_18480 == null) {
                Class_19426.Method_19610("Invalid shader option: " + string2);
                continue;
            }
            hashSet.add(string2);
        }
        return hashSet;
    }
}

