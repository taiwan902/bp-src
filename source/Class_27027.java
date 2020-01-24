/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Class_27027
extends Class_18480 {
    private static final Pattern Field_27028 = Pattern.compile(Class_27027.Method_27030("\u4282\u4280\u4283\u4282\u4284\u4287\u4287\u4285\u4283\u4280\u4283\u4282\u4287\u4284\u4285\u4286\u4291\u4292\u4291\u4290\u4297\u4297\u4294\u4297\u4291\u4291\u4292\u4291\u4295\u4296\u4294\u4295\u4281\u4283\u4281\u4283\u4285\u4284\u4287\u4286\u4280\u4283\u4283\u4282\u4286\u4285\u4287\u4284"));
    private static final Pattern Field_27029 = Pattern.compile(Class_27027.Method_27035("\u5078\u5078\u5054\u500c\u5000\u5048\u5044\u5008\u5040\u5004\u5010\u5048\u504c\u504c\u5074\u5058\u500c\u500c\u507c\u5064\u500c\u5078\u5040\u500c\u5054\u501c\u5000\u5014\u5074\u5074\u5000\u5000\u500c\u5078\u5054\u500c\u5008\u501c\u5004"));

    private static String Method_27030(String string) {
        int n = 20452;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_27027.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static Class_18480 Method_27031(String string, String string2) {
        Matcher matcher = Field_27028.matcher(string);
        if (!matcher.matches()) {
            return null;
        }
        String string3 = matcher.group(-17677 & 16385);
        String string4 = matcher.group(-32766 & 12034);
        String string5 = matcher.group(-31717 & 291);
        if (string4 != null && string4.length() > 0) {
            boolean bl = Class_19426.Method_19529(string3, "//");
            int n = !bl ? 2079 & 129 : 3132 & 17024;
            string2 = Class_35556.Method_35566(string2, "/shaders/");
            Class_27027 class_27027 = new Class_27027(string4, string5, String.valueOf(n != 0), string2);
            return class_27027;
        }
        return null;
    }

    public static boolean Method_27032(String string) {
        return Boolean.valueOf(string);
    }

    public boolean Method_27033(String string) {
        Matcher matcher = Field_27028.matcher(string);
        if (!matcher.matches()) {
            return (4106 & 2481) != 0;
        }
        String string2 = matcher.group(-31590 & 4610);
        return string2.matches(this.\u0000strictfp());
    }

    public String Method_27034() {
        return Class_27027.Method_27032(this.\u0000
        ()) ? "#define " + this.\u0000strictfp() + " // Shader option ON" : "//#define " + this.\u0000strictfp() + " // Shader option OFF";
    }

    private static String Method_27035(String string) {
        int n = 17650;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_27027.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public boolean Method_27036(String string) {
        String string2;
        Matcher matcher = Field_27029.matcher(string);
        if (matcher.matches() && (string2 = matcher.group(1179 & -30170)).equals(this.\u0000strictfp())) {
            return (5137 & -6141) != 0;
        }
        return (-12063 & 8192) != 0;
    }

    public Class_27027(String string, String string2, String string3, String string4) {
        String[] arrstring = new String[26882 & -32750];
        arrstring[4142 & 256] = "false";
        arrstring[2327 & 20513] = "true";
        super(string, string2, string3, arrstring, string3, string4);
    }

    public boolean Method_27037() {
        return (8395 & 1057) != 0;
    }

    public String Method_27038(String string) {
        return Class_27027.Method_27032(string) ? "\u00a7a" : "\u00a7c";
    }

    public String Method_27039(String string) {
        String string2 = super.Method_18519(string);
        return string2 != string ? string2 : (Class_27027.Method_27032(string) ? Class_14688.Method_14691() : Class_14688.Method_14695());
    }

    private void Method_27040() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

