/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Class_31544
extends Class_18480 {
    private static final Pattern Field_31545 = Pattern.compile(Class_31544.Method_31547("\u4aa1\u4aa3\u4a82\u4a93\u4a94\u4a97\u4a94\u4a97\u4a92\u4a91\u4a90\u4aa1\u4a84\u4a94\u4a95\u4aa5\u4a80\u4a90\u4a90\u4aa1\u4a84\u4a94\u4a95\u4a94\u4a80\u4aa0\u4a81\u4a90\u4a86\u4aa7\u4a97\u4ab7\u4a91\u4aa2\u4a92\u4a81\u4aa7\u4a84\u4a96\u4a94\u4aa3\u4a80\u4a93\u4a91\u4a94\u4a94\u4a97\u4a97\u4a92\u4a80\u4a91"));

    public static Class_18480 Method_31546(String string, String string2) {
        Matcher matcher = Field_31545.matcher(string);
        if (!matcher.matches()) {
            return null;
        }
        String string3 = matcher.group(30909 & 323);
        String string4 = matcher.group(-8113 & 4098);
        String string5 = matcher.group(-15933 & 10243);
        String string6 = Class_35556.Method_35564(string5, "[", "]");
        if (string6 != null && string6.length() > 0) {
            string5 = string5.replace(string6, "").trim();
        }
        String[] arrstring = Class_31544.Method_31550(string4, string6);
        if (string3 != null && string3.length() > 0) {
            string2 = Class_35556.Method_35566(string2, "/shaders/");
            Class_31544 class_31544 = new Class_31544(string3, string5, string4, arrstring, string2);
            return class_31544;
        }
        return null;
    }

    private static String Method_31547(String string) {
        int n = 21012;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_31544.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_31548() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_31544(String string, String string2, String string3, String[] arrstring, String string4) {
        super(string, string2, string3, arrstring, string3, string4);
        this.\u0000, `((this.\u0000strictfp().length > (8221 & -12253) ? -19871 & 16409 : 1610 & 8197) != 0);
    }

    public String Method_31549() {
        return "#define " + this.\u0000strictfp() + " " + this.\u0000
        () + " // Shader option " + this.\u0000
        ();
    }

    public static String[] Method_31550(String string, String string2) {
        String[] arrstring = new String[16643 & 5633];
        arrstring[-16255 & 582] = string;
        String[] arrstring2 = arrstring;
        if (string2 == null) {
            return arrstring2;
        }
        string2 = string2.trim();
        string2 = Class_35556.Method_35566(string2, "[");
        string2 = Class_35556.Method_35565(string2, "]");
        if ((string2 = string2.trim()).length() <= 0) {
            return arrstring2;
        }
        Object[] arrobject = Class_19426.Method_19561(string2, " ");
        if (arrobject.length <= 0) {
            return arrstring2;
        }
        if (!Arrays.asList(arrobject).contains(string)) {
            arrobject = (String[])Class_19426.Method_19528(arrobject, string, 64 & -11610);
        }
        return arrobject;
    }

    public String Method_31551(String string) {
        String string2 = string.toLowerCase();
        return !string2.equals("false") && !string2.equals("off") ? "\u00a7a" : "\u00a7c";
    }

    public String Method_31552(String string) {
        String string2 = Class_12440.Method_12859("prefix." + this.\u0000strictfp(), "");
        String string3 = super.Method_18519(string);
        String string4 = Class_12440.Method_12859("suffix." + this.\u0000strictfp(), "");
        String string5 = string2 + string3 + string4;
        return string5;
    }

    public boolean Method_31553(String string) {
        Matcher matcher = Field_31545.matcher(string);
        if (!matcher.matches()) {
            return (4354 & 1728) != 0;
        }
        String string2 = matcher.group(21793 & 2769);
        return string2.matches(this.\u0000strictfp());
    }
}

