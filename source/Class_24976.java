/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.gson.stream.JsonWriter
 */
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Class_24976
extends Class_24929 {
    private int Field_24977;
    private String Field_24978;
    private String Field_24979;

    private static String Method_24980(String string) {
        int n = 5597;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_24976.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_24981(String string) {
        int n = 8424;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_24976.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_24982() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, Class_24976.Method_24989("\u2083\u2089\u2080\u208a\u2086\u208f\u2086\u2085\u2088\u2081\u2080\u2081\u2085\u208d"));
    }

    private static String Method_24983(String string) {
        int n = 7151;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_24976.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_24984(Class_29900 class_29900) {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter((Writer)stringWriter);
        try {
            jsonWriter.beginObject();
            jsonWriter.name(Class_24976.Method_24980("\uc08d\uc080"));
            jsonWriter.value((long)this.\u0000strictfp);
            jsonWriter.name(Class_24976.Method_24983("\u2952"));
            jsonWriter.value(this.Field_24979);
            jsonWriter.name(Class_24976.Method_24981("\ud108\ud101"));
            jsonWriter.value(this.Field_24978);
            jsonWriter.name(Class_24976.Method_24991("\ue864"));
            jsonWriter.value(this.Field_24977 + "");
            jsonWriter.endObject();
            jsonWriter.close();
        }
        catch (IOException iOException) {
            new Class_30877(new RuntimeException(Class_24976.Method_24987("\u1540\u1545\u1544\u1541\u1546\u1543\u1544\u1541\u154c\u154b\u1508\u154d\u154c\u150d\u1548\u154f\u1542\u1543\u1546\u1545\u1546\u1543\u1542\u1541\u1508\u144b\u154c\u1549\u154a\u144f\u154a"))).start();
        }
        class_29900.Method_29903(stringWriter.toString().getBytes(StandardCharsets.UTF_8));
    }

    public void Method_24985(Class_19025 class_19025) {
        new Class_30877(new RuntimeException(Class_24976.Method_24988("\ud4f0\ud4e1\ud4f6\ud4a7\ud4e4\ud4f5\ud4e2\ud4e3\ud4e8\ud4ad\ud4fe\ud4ef\ud4e8\ud4e9\ud4ee\ud4ff\ud4e4\ud4b5\ud4e6\ud4f3")));
    }

    public void Method_24986(Class_29900 class_29900) {
        new Class_30877(new RuntimeException(Class_24976.Method_24990("\u1824\u1825\u1820\u1863\u1824\u1825\u1820\u1823\u182c\u1869\u182a\u182b\u182a\u1829\u182e\u182f\u1830\u1871\u1832\u1837")));
    }

    private static String Method_24987(String string) {
        int n = 14982;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_24976.class, 5);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_24988(String string) {
        int n = 7806;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_24976.class, 7);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_24989(String string) {
        int n = 27013;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_24976.class, 8);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_24990(String string) {
        int n = 30156;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_24976.class, 6);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_24976(String string, String string2, int n) {
        this.Field_24979 = string;
        this.Field_24978 = string2;
        this.Field_24977 = n;
    }

    private static String Method_24991(String string) {
        int n = 12577;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_24976.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_24976() {
    }

    public void Method_24992(Class_10954 class_10954) {
        this.Method_24985((Class_19025)class_10954);
    }
}

