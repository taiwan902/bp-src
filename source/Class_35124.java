/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Class_35124
extends Class_27027 {
    private static final Pattern Field_35125 = Pattern.compile(Class_35124.Method_35127("\u295e\u295d\u2973\u292b\u2967\u296a\u296a\u2976\u297c\u2955\u297b\u2923\u296e\u2962\u2963\u2961\u295c\u2972\u292a\u2929\u295f\u2944\u2929\u295f\u2969\u2924\u2972\u2939\u2921\u2934\u2953\u2950\u290b\u2908\u297c\u2952\u290e\u2918\u2978\u2956\u2902\u2901\u295c\u295b\u2959\u2948\u2950\u294b\u2941\u294d\u2953\u2944\u290d\u2979\u2957\u290f\u2913\u2975\u295b\u2903\u2904\u2902\u2903\u2903\u292a\u2928\u293f\u2925"));

    public static Class_18480 Method_35126(String string, String string2) {
        Matcher matcher = Field_35125.matcher(string);
        if (!matcher.matches()) {
            return null;
        }
        String string3 = matcher.group(561 & -30457);
        String string4 = matcher.group(11906 & -32430);
        String string5 = matcher.group(67 & 51);
        if (string3 != null && string3.length() > 0) {
            string2 = Class_35556.Method_35566(string2, "/shaders/");
            Class_35124 class_35124 = new Class_35124(string3, string5, string4, string2);
            class_35124.Method_18494((322 & 6157) != 0);
            return class_35124;
        }
        return null;
    }

    private static String Method_35127(String string) {
        int n = 19930;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_35124.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public boolean Method_35128(String string) {
        Matcher matcher = Field_35125.matcher(string);
        if (!matcher.matches()) {
            return (6192 & 16514) != 0;
        }
        String string2 = matcher.group(18445 & 33);
        return string2.matches(this.\u0000strictfp());
    }

    public Class_35124(String string, String string2, String string3, String string4) {
        super(string, string2, string3, string4);
    }

    private void Method_35129() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_35130() {
        return (384 & 20011) != 0;
    }

    public String Method_35131() {
        return "const bool " + this.\u0000strictfp() + " = " + this.\u0000
        () + "; // Shader option " + this.\u0000
        ();
    }
}

