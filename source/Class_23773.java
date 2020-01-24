/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Splitter
 *  com.google.common.collect.Iterables
 */
import com.google.common.base.Splitter;
import com.google.common.collect.Iterables;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Class_23773
extends Class_9867 {
    private static final Pattern Field_23774;
    private static final Pattern Field_23775;
    private static final Pattern Field_23776;
    private static final Splitter Field_23777;
    private static final Pattern Field_23778;
    private static final Pattern Field_23779;
    private static final Pattern Field_23780;
    private static final Pattern Field_23781;
    protected String Field_23782;

    static {
        Field_23775 = Pattern.compile(Class_23773.Method_23785("\u0200\u0214\u0212\u0206\u0204\u0200\u0202\u0216\u0208\u020c\u021a\u020e\u021c\u020c\u020a\u020a\u0204\u0210\u0216\u0202\u0210\u0204\u0216\u0206\u021c"));
        Field_23774 = Pattern.compile(Class_23773.Method_23786("\u9201\u9200\u9203\u9202\u9205\u9204\u9206\u9206\u9201\u9200\u9202\u9203\u9204\u9204\u9207\u9207\u9211\u9210\u9213\u9212\u9215\u9215\u9216\u9217\u9211"));
        Field_23779 = Pattern.compile(Class_23773.Method_23784("\uc103\uc101\uc103\uc101\uc107\uc107\uc104\uc105\uc109\uc109\uc10b\uc10b\uc10e\uc10c\uc10e\uc10d"));
        Field_23776 = Pattern.compile(Class_23773.Method_23787("\u8001\u8005\u8001\u8005\u8005\u8001\u8008\u8005\u8009\u800d\u8009\u8009\u800c\u800c\u800c\u800d"));
        Field_23778 = Pattern.compile(Class_23773.Method_23791("h\b\bh\bh\u0000\b\u0000`\u0000`H@h`"));
        Field_23781 = Pattern.compile(Class_23773.Method_23789("\u8008\u801a\u8018\u800a\u8008\u8008\u8003\u801a\u8002\u8002\u8010"));
        Field_23780 = Pattern.compile(Class_23773.Method_23790("\u0830\u0804\u0800\u0834\u0810\u0834\u0814\u0800\u0810\u0834\u0800\u0834\u0800\u0810\u0834\u0814\u0804\u0810\u0834\u0800"));
        Field_23777 = Splitter.on((char)(-31700 & 21102)).omitEmptyStrings();
    }

    private void Method_23783() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_23773(String string, String string2) {
        this.\u0000strictfp = string;
        this.Field_23782 = string2;
    }

    private static String Method_23784(String string) {
        int n = 26552;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_23773.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_23785(String string) {
        int n = 18547;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_23773.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_23786(String string) {
        int n = 22293;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_23773.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_23787(String string) {
        int n = 1868;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_23773.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_1674 Method_23788() {
        try {
            if (Field_23775.matcher(this.Field_23782).matches()) {
                return new Class_44215(Double.parseDouble(this.Field_23782.substring(152 & -3328, this.Field_23782.length() - (-2047 & 265))));
            }
            if (Field_23774.matcher(this.Field_23782).matches()) {
                return new Class_39580(Float.parseFloat(this.Field_23782.substring(-23646 & 7197, this.Field_23782.length() - (4153 & 8321))));
            }
            if (Field_23779.matcher(this.Field_23782).matches()) {
                return new Class_45569(Byte.parseByte(this.Field_23782.substring(544 & 1374, this.Field_23782.length() - (6401 & 8273))));
            }
            if (Field_23776.matcher(this.Field_23782).matches()) {
                return new Class_45819(Long.parseLong(this.Field_23782.substring(-16368 & 9344, this.Field_23782.length() - (10769 & 137))));
            }
            if (Field_23778.matcher(this.Field_23782).matches()) {
                return new Class_39686(Short.parseShort(this.Field_23782.substring(8196 & -9952, this.Field_23782.length() - (4113 & 259))));
            }
            if (Field_23781.matcher(this.Field_23782).matches()) {
                return new Class_45018(Integer.parseInt(this.Field_23782));
            }
            if (Field_23780.matcher(this.Field_23782).matches()) {
                return new Class_44215(Double.parseDouble(this.Field_23782));
            }
            if (this.Field_23782.equalsIgnoreCase("true") || this.Field_23782.equalsIgnoreCase("false")) {
                return new Class_45569((byte)(Boolean.parseBoolean(this.Field_23782) ? -23453 & 2953 : 19632 & 12297));
            }
        }
        catch (NumberFormatException numberFormatException) {
            this.Field_23782 = this.Field_23782.replaceAll("\\\\\"", "\"");
            return new Class_1746(this.Field_23782);
        }
        if (this.Field_23782.startsWith("[") && this.Field_23782.endsWith("]")) {
            String string = this.Field_23782.substring(4185 & -12797, this.Field_23782.length() - (1121 & 12673));
            String[] arrstring = (String[])Iterables.toArray((Iterable)Field_23777.split((CharSequence)string), String.class);
            try {
                int[] arrn = new int[arrstring.length];
                for (int i = 9353 & 4608; i < arrstring.length; ++i) {
                    arrn[i] = Integer.parseInt(arrstring[i].trim());
                }
                return new Class_37367(arrn);
            }
            catch (NumberFormatException numberFormatException) {
                return new Class_1746(this.Field_23782);
            }
        }
        if (this.Field_23782.startsWith("\"") && this.Field_23782.endsWith("\"")) {
            this.Field_23782 = this.Field_23782.substring(8325 & 2593, this.Field_23782.length() - (139 & 2881));
        }
        this.Field_23782 = this.Field_23782.replaceAll("\\\\\"", "\"");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 8242 & 1032; i < this.Field_23782.length(); ++i) {
            if (i < this.Field_23782.length() - (-24511 & 6179) && this.Field_23782.charAt(i) == (-24484 & 93) && this.Field_23782.charAt(i + (6209 & 1313)) == (-23331 & 636)) {
                stringBuilder.append((char)(476 & 8798));
                ++i;
                continue;
            }
            stringBuilder.append(this.Field_23782.charAt(i));
        }
        return new Class_1746(stringBuilder.toString());
    }

    private static String Method_23789(String string) {
        int n = 13606;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_23773.class, 6);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_23790(String string) {
        int n = 7026;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_23773.class, 7);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_23791(String string) {
        int n = 28011;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_23773.class, 5);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }
}

