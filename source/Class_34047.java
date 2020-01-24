/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Class_34047
extends Class_31544 {
    private String Field_34048 = null;
    private static final Pattern Field_34049 = Pattern.compile(Class_34047.Method_34054("\u2028\u2029\u2002\u201b\u2010\u2019\u201a\u2003\u2008\u2021\u200a\u2013\u2010\u2019\u2012\u2013\u2000\u2011\u201a\u200b\u2008\u2011\u200a\u203b\u2018\u2001\u2002\u2033\u2028\u2001\u2032\u200b\u2038\u2029\u2022\u203b\u2028\u2009\u200a\u203b\u2030\u2001\u202a\u2033\u2020\u2001\u202a\u2033\u2028\u2029\u203a\u201b\u2030\u2029\u203a\u201b\u2020\u2011\u2022\u202b\u2030\u2009\u2032\u2023\u2068\u2041\u205a\u204b\u2068\u2041\u205a\u205b\u2050\u2051\u2052\u2053\u2050\u2041\u205a"));

    public String Method_34050() {
        return "const " + this.Field_34048 + " " + this.\u0000strictfp() + " = " + this.\u0000
        () + "; // Shader option " + this.\u0000
        ();
    }

    public Class_34047(String string, String string2, String string3, String string4, String[] arrstring, String string5) {
        super(string, string3, string4, arrstring, string5);
        this.Field_34048 = string2;
    }

    public static Class_18480 Method_34051(String string, String string2) {
        Matcher matcher = Field_34049.matcher(string);
        if (!matcher.matches()) {
            return null;
        }
        String string3 = matcher.group(4129 & 20371);
        String string4 = matcher.group(-23294 & 90);
        String string5 = matcher.group(17411 & -28321);
        String string6 = matcher.group(4628 & 8325);
        String string7 = Class_35556.Method_35564(string6, "[", "]");
        if (string7 != null && string7.length() > 0) {
            string6 = string6.replace(string7, "").trim();
        }
        String[] arrstring = Class_34047.\u0000strictfp((String)string5, (String)string7);
        if (string4 != null && string4.length() > 0) {
            string2 = Class_35556.Method_35566(string2, "/shaders/");
            Class_34047 class_34047 = new Class_34047(string4, string3, string6, string5, arrstring, string2);
            return class_34047;
        }
        return null;
    }

    public boolean Method_34052(String string) {
        Matcher matcher = Field_34049.matcher(string);
        if (!matcher.matches()) {
            return (-32702 & 16388) != 0;
        }
        String string2 = matcher.group(4098 & -15350);
        return string2.matches(this.\u0000strictfp());
    }

    private void Method_34053() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private static String Method_34054(String string) {
        int n = 9074;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_34047.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }
}

