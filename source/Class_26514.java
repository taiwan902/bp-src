/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 */
import com.google.common.base.Charsets;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.nio.charset.Charset;

public class Class_26514
implements Class_1486 {
    private String Field_26515;

    public Class_26514() {
    }

    public void Method_26516(Class_29900 class_29900) {
        new Class_30877(new RuntimeException(Class_26514.Method_26518("\u3000\u3011\u3000\u3010\u3010\u3001\u3010\u3011\u3019\u3018\u3008\u3019\u3019\u3019\u3019\u3008\u3001\u3010\u3000\u3010")));
    }

    public void Method_26517(Class_29900 class_29900) {
        class_29900.Method_29903(this.Field_26515.getBytes(Charsets.UTF_8));
    }

    private static String Method_26518(String string) {
        int n = 678;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_26514.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_26514(String string) {
        this.Field_26515 = string;
    }

    public void Method_26519(Class_19025 class_19025) {
        new Class_30877(new RuntimeException(Class_26514.Method_26521("\u8202\u8202\u8202\u8240\u8206\u8206\u8206\u8204\u8202\u8242\u8200\u8200\u8204\u8206\u8204\u8204\u8202\u8242\u8200\u8200")));
    }

    public void Method_26520(Class_10954 class_10954) {
        this.Method_26519((Class_19025)class_10954);
    }

    private static String Method_26521(String string) {
        int n = 17422;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_26514.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_26522(String string) {
        int n = 14282;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_26514.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_26523() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, Class_26514.Method_26522("\u001c\u0012\f\u0012\u0018\u0014\u000e\u001c\u0016\u001e\b\u0018\u001e\u0016"));
    }
}

