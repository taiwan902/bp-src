/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Class_7255 {
    public static Pattern Field_7256;
    public static Pattern Field_7257;
    public static Pattern Field_7258;
    public static Pattern Field_7259;
    public static Pattern Field_7260;
    public static Pattern Field_7261;
    public static Pattern Field_7262;
    public static Pattern Field_7263;
    public static Pattern Field_7264;
    public static Pattern Field_7265;

    public static boolean Method_7266(String string) {
        return Field_7257.matcher(string).matches();
    }

    public static int Method_7267(String string) {
        return string.equals("shadowcolor") ? 1 & 4226 : Class_7255.Method_7268(string, "shadowcolor", -22972 & 16768, 4097 & 17317);
    }

    public static int Method_7268(String string, String string2, int n, int n2) {
        if (string.length() != string2.length() + (1739 & -14047)) {
            return -1 & -1;
        }
        if (!string.startsWith(string2)) {
            return -1 & -1;
        }
        int n3 = string.charAt(string2.length()) - (316 & -22480);
        return n3 >= n && n3 <= n2 ? n3 : -1 & -1;
    }

    public static Class_20029 Method_7269(String string) {
        Matcher matcher = Field_7264.matcher(string);
        if (matcher.matches()) {
            return new Class_20029(25351 & 1057, matcher.group(261 & 57), "", string);
        }
        Matcher matcher2 = Field_7265.matcher(string);
        if (matcher2.matches()) {
            return new Class_20029(-28413 & 18570, matcher2.group(11945 & -32751), "", string);
        }
        Matcher matcher3 = Field_7261.matcher(string);
        if (matcher3.matches()) {
            return new Class_20029(-15065 & 2054, matcher3.group(166 & 2650), matcher3.group(16519 & -32701), string);
        }
        Matcher matcher4 = Field_7259.matcher(string);
        if (matcher4.matches()) {
            return new Class_20029(10387 & -28661, matcher4.group(33 & -22255), matcher4.group(14466 & -32750), string);
        }
        Matcher matcher5 = Field_7256.matcher(string);
        if (matcher5.matches()) {
            return new Class_20029(-32282 & 1548, matcher5.group(-32495 & 2693), matcher5.group(530 & 11266), string);
        }
        Matcher matcher6 = Field_7263.matcher(string);
        return matcher6.matches() ? new Class_20029(8725 & 5349, matcher6.group(43 & 129), matcher6.group(17867 & -17918), string) : null;
    }

    public static boolean Method_7270(String string) {
        return Field_7258.matcher(string).matches();
    }

    private static String Method_7271(String string) {
        int n = 1269;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_7255.class, 10);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static int Method_7272(String string) {
        return Class_7255.Method_7268(string, "depthtex", -23350 & 6401, -24309 & 16898);
    }

    private static String Method_7273(String string) {
        int n = 406;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_7255.class, 6);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_7274(String string) {
        int n = 2520;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_7255.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_7275(String string) {
        int n = 22869;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_7255.class, 8);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_7276() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    static {
        Field_7264 = Pattern.compile(Class_7255.Method_7278("\u8103\u8104\u8105\u8102\u8101\u8106\u8101\u8100\u810d\u810a\u810b\u810c\u810c\u810b\u8108\u810c\u8103\u8104\u8104\u8107\u8103\u8100\u8104\u8106\u8109\u810d"));
        Field_7265 = Pattern.compile(Class_7255.Method_7281("\u0005\nS\u0018\r\r\u000b\u0010\u001b\f\r\u001c\u0005\nR\u0005\u001eB\u0015\u001aBA\u0015\u001eB@GC"));
        Field_7259 = Pattern.compile(Class_7255.Method_7274("\u040d\u0401\u0419\u0411\u0418\u0418\u0404\u0400\u040d\u0401\u0418\u0419\u0419\u0400\u0409\u0405\u0408\u0408\u041d\u0415\u040c\u040d\u0419\u0415\u0409\u041d\u041d\u0411\u040d\u040c\u041c\u0409\u0418\u041c\u040d\u0405\u0408\u041d\u041c\u0408\u0400\u0418\u0408\u041c\u041d"));
        Field_7256 = Pattern.compile(Class_7255.Method_7282("\u8802\u882d\u8826\u882f\u8824\u8825\u882a\u882d\u880a\u8825\u882e\u8823\u882e\u882d\u8820\u8825\u8812\u883d\u8836\u8835\u8816\u883d\u8832\u8831\u881a\u8835\u883e\u8839\u881e\u8831\u883a\u8839\u8824\u8803\u8806\u8803\u8826\u880d\u8824\u8803\u880e\u882b\u8806\u880f\u8808\u880d\u880a"));
        Field_7263 = Pattern.compile(Class_7255.Method_7286("\u0c00\u0c00\u0c10\u0c10\u0c10\u0c10\u0c00\u0c00\u0c08\u0c08\u0c18\u0c18\u0c18\u0c18\u0c18\u0c08\u0c00\u0c10\u0c10\u0c00\u0c00\u0c10\u0c10\u0c00\u0c08\u0c18\u0c08\u0c08\u0c08\u0c18\u0c18\u0c08\u0c00\u0c10\u0c10\u0c00\u0c00\u0c10\u0c00\u0c10\u0c18"));
        Field_7261 = Pattern.compile(Class_7255.Method_7273("\u600c\u6000\u6018\u6019\u601d\u600d\u6018\u600d\u6015\u6014\u6011\u6004\u6004\u6008\u6010\u6011\u6019\u6000\u600d\u6019\u601d\u6008\u6009\u6019\u6014\u6018\u6000\u6001\u6014\u601c\u6001\u6000\u600c\u6000\u6018\u6019\u600c\u6019\u601d\u601d\u6010\u6005\u6004\u6008\u6010\u6010"));
        Field_7257 = Pattern.compile(Class_7255.Method_7283("\u58d0\u58d5\u5892\u5893\u5890\u5891\u5886\u5887\u5898\u5899\u58ae\u58cf\u58d8\u58cd\u58aa\u58cb\u58a0\u58d1\u5892\u5887\u5894"));
        Field_7262 = Pattern.compile(Class_7255.Method_7275("\u092c\u0928\u0922\u092e\u092c\u0930\u092e\u0932\u0920\u093c\u092e\u0912\u0938\u0924\u0932\u0916\u093c\u091c\u092e\u0926\u0930\u0928"));
        Field_7258 = Pattern.compile(Class_7255.Method_7277("\u1588\u1588\u1582\u158b\u1588\u1581\u158a\u159a\u1588\u1580\u1593\u158a"));
        Field_7260 = Pattern.compile(Class_7255.Method_7271("\u0402\u0449\u0440\u044b\u0402\u0401\u0442"));
    }

    private static String Method_7277(String string) {
        int n = 21662;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_7255.class, 9);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_7278(String string) {
        int n = 27196;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_7255.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static boolean Method_7279(String string) {
        return Field_7262.matcher(string).matches();
    }

    public static boolean Method_7280(String string) {
        return Field_7260.matcher(string).matches();
    }

    private static String Method_7281(String string) {
        int n = 25029;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_7255.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_7282(String string) {
        int n = 31575;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_7255.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_7283(String string) {
        int n = 14561;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_7255.class, 7);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static int Method_7284(String string) {
        int n = Class_7255.Method_7268(string, "gaux", 17427 & 8225, 8468 & -15315);
        return n > 0 ? n + (-32765 & 18579) : Class_7255.Method_7268(string, "colortex", -32716 & 5252, -32713 & 71);
    }

    public static int Method_7285(String string) {
        return string.equals("shadow") ? -16341 & 12560 : (string.equals("watershadow") ? 161 & 16901 : Class_7255.Method_7268(string, "shadowtex", 25702 & -28527, 2137 & 1699));
    }

    private static String Method_7286(String string) {
        int n = 28786;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_7255.class, 5);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }
}

