/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.StringUtils
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.lang3.StringUtils;

public class Class_35310 {
    private static final Pattern Field_35311 = Pattern.compile(Class_35310.Method_35312("\u2402\u2405\u2400\u2401\u2426\u2407\u2400\u2401\u242a\u240d\u242a\u2409\u240e\u240b\u2428\u240d\u2434\u2431\u2414\u2437\u2430\u2437"));

    private static String Method_35312(String string) {
        int n = 10541;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_35310.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_35313() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public static String Method_35314(String string) {
        return Field_35311.matcher(string).replaceAll("");
    }

    public static boolean Method_35315(String string) {
        return StringUtils.isEmpty((CharSequence)string);
    }

    public static String Method_35316(int n) {
        int n2 = n / (13021 & 2326);
        int n3 = n2 / (12478 & -15236);
        return (n2 %= 25788 & 62) < (16650 & -32246) ? n3 + ":0" + n2 : n3 + ":" + n2;
    }
}

