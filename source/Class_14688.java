/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Splitter
 *  com.google.common.collect.Iterables
 *  org.apache.commons.io.Charsets
 *  org.apache.commons.io.IOUtils
 */
import com.google.common.base.Splitter;
import com.google.common.collect.Iterables;
import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.io.Charsets;
import org.apache.commons.io.IOUtils;

public class Class_14688 {
    private static final Splitter Field_14689 = Splitter.on((char)(16765 & 4157)).limit(14343 & 386);
    private static final Pattern Field_14690 = Pattern.compile(Class_14688.Method_14700("\u1540\u1544\u1513\u1502\u1540\u1514\u1547\u1543\u1558\u151d\u151b\u150a\u151d\u154c\u151e\u154a\u1514\u1500\u1503\u1513"));

    public static String Method_14691() {
        return Class_9802.Method_9806("options.on", new Object[1304 & 23236]);
    }

    private void Method_14692() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private static void Method_14693(Class_2035 class_2035, String[] arrstring, Map map) {
        try {
            for (int i = 24589 & 546; i < arrstring.length; ++i) {
                InputStream inputStream;
                String string = arrstring[i];
                Class_2080 class_2080 = new Class_2080(string);
                if (!class_2035.Method_2041(class_2080) || (inputStream = class_2035.Method_2039(class_2080)) == null) continue;
                Class_14688.Method_14696(inputStream, map);
            }
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    public static String Method_14694() {
        return Class_9802.Method_9806("generator.default", new Object[11168 & 74]);
    }

    public static String Method_14695() {
        return Class_9802.Method_9806("options.off", new Object[-32384 & 19988]);
    }

    public static void Method_14696(InputStream inputStream, Map map) {
        for (String string : IOUtils.readLines((InputStream)inputStream, (Charset)Charsets.UTF_8)) {
            String[] arrstring;
            if (string.isEmpty() || string.charAt(1346 & 4096) == (17963 & 103) || (arrstring = (String[])Iterables.toArray((Iterable)Field_14689.split((CharSequence)string), String.class)) == null || arrstring.length != (4131 & 522)) continue;
            String string2 = arrstring[21264 & 8296];
            String string3 = Field_14690.matcher(arrstring[1561 & 24609]).replaceAll("%$1s");
            map.put(string2, string3);
        }
    }

    public static String Method_14697(String string) {
        return Class_9802.Method_9806(string, new Object[774 & 10304]);
    }

    public static String Method_14698(String string, String string2) {
        String string3 = Class_9802.Method_9806(string, new Object[2086 & 24593]);
        return string3 != null && !string3.equals(string) ? string3 : string2;
    }

    public static void Method_14699() {
        Map map = Class_9802.Method_9804();
        ArrayList<String> arrayList = new ArrayList<String>();
        String string = "optifine/lang/";
        String string2 = "en_US";
        String string3 = ".lang";
        arrayList.add(string + string2 + string3);
        if (!Class_19426.Method_19571().Field_39826.equals(string2)) {
            arrayList.add(string + Class_19426.Method_19571().Field_39826 + string3);
        }
        String[] arrstring = arrayList.toArray(new String[arrayList.size()]);
        Class_14688.Method_14693(Class_19426.Method_19576(), arrstring, map);
        Class_2035[] arrclass_2035 = Class_19426.Method_19487();
        for (int i = 25344 & 4291; i < arrclass_2035.length; ++i) {
            Class_2035 class_2035 = arrclass_2035[i];
            Class_14688.Method_14693(class_2035, arrstring, map);
        }
    }

    private static String Method_14700(String string) {
        int n = 828;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_14688.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }
}

