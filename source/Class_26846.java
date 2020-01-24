/*
 * Decompiled with CFR 0.145.
 */
import java.io.IOException;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_26846
implements Class_2045 {
    private static final Class_2080 Field_26847 = new Class_2080(Class_26846.Method_26850("\u9085\u9084\u9083\u9087\u9084\u9083\u9086\u9080\u90c6\u9082\u9084\u9087\u9086\u9083\u9086\u9082\u9091\u90d6\u9094\u9091\u9090\u9092\u9090\u90d5\u9091\u9097\u9094"));

    public void Method_26848(Class_279 class_279) {
        try {
            Class_23541.Method_23545(Class_18695.Method_18706(class_279, Field_26847));
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }

    private void Method_26849() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private static String Method_26850(String string) {
        int n = 28361;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_26846.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }
}

