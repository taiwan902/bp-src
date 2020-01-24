/*
 * Decompiled with CFR 0.145.
 */
import java.io.BufferedInputStream;
import java.io.File;
import java.io.InputStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;

public class Class_8033 {
    private static ArrayList Field_8034 = new ArrayList();

    static {
        Field_8034.add(new Class_38694());
        Field_8034.add(new Class_24588(new File(Class_8033.Method_8036("\u20e5"))));
    }

    public static InputStream Method_8035(String string) {
        Class_20084 class_20084;
        InputStream inputStream = null;
        for (int i = 10248 & -31726; i < Field_8034.size() && (inputStream = (class_20084 = (Class_20084)Field_8034.get(i)).Method_20085(string)) == null; ++i) {
        }
        if (inputStream == null) {
            throw new RuntimeException("Resource not found: " + string);
        }
        return new BufferedInputStream(inputStream);
    }

    private static String Method_8036(String string) {
        int n = 21491;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_8033.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_8037() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

