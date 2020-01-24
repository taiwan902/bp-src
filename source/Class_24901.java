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
import java.security.SecureRandom;
import java.util.Random;

public class Class_24901
implements Class_1486 {
    public String Field_24902;
    public static byte[] Field_24903 = new byte[2448 & -32710];
    public String Field_24904;

    private static String Method_24905(String string) {
        int n = 19842;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_24901.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_24906(String string) {
        int n = 28723;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_24901.class, 6);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_24907(Class_19025 class_19025) {
        new Class_30877(new RuntimeException(Class_24901.Method_24908("\u42c2\u42c5\u4284\u42c5\u42c2\u42c3")));
    }

    private static String Method_24908(String string) {
        int n = 28465;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_24901.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_24909(String string) {
        int n = 24713;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_24901.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_24901() {
    }

    public void Method_24910(Class_29900 class_29900) {
        new Class_30877(new RuntimeException(Class_24901.Method_24905("\u0404\u0400\u0402\u0402\u0400\u0400")));
    }

    private void Method_24911() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, Class_24901.Method_24906("\u0520\u052b\u0510\u052b\u0504\u050d\u0516\u0505\u0502\u050b\u0538\u0509\u050e\u0507"));
    }

    public void Method_24912(Class_29900 class_29900) {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter((Writer)stringWriter);
        try {
            jsonWriter.beginObject();
            jsonWriter.name(Class_24901.Method_24909("\u8008"));
            jsonWriter.value(this.Field_24904);
            jsonWriter.name(Class_24901.Method_24915("\u00ad"));
            jsonWriter.value(this.Field_24902);
            jsonWriter.endObject();
            jsonWriter.close();
        }
        catch (IOException iOException) {
            new Class_30877(new RuntimeException(Class_24901.Method_24913("\u0011\u0011\u0013\u0013\u0010\u0011\u0003\u0002\u0018\b\u001b\u001b\u0018\u0018\n\u000b\u0011\u0001\u0002\u0002\u0011\u0001\u0003\u0003\t\u0119\n\u000b\b\u0108\n"))).start();
        }
        class_29900.Method_29903(Field_24903);
        class_29900.Method_29903(stringWriter.toString().getBytes(StandardCharsets.UTF_8));
    }

    static {
        try {
            new SecureRandom().nextBytes(Field_24903);
        }
        catch (Throwable throwable) {
            new Random().nextBytes(Field_24903);
        }
    }

    private static String Method_24913(String string) {
        int n = 3084;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_24901.class, 5);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_24914(Class_10954 class_10954) {
        this.Method_24907((Class_19025)class_10954);
    }

    public Class_24901(String string, String string2) {
        this.Field_24904 = string;
        this.Field_24902 = string2;
    }

    private static String Method_24915(String string) {
        int n = 15289;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_24901.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }
}

