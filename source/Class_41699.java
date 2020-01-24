/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_41699
extends Class_40019 {
    private static final Class_2080 Field_41700 = new Class_2080(Class_41699.Method_41703("\u1000\u1010\u1004\u1001\u1005\u1003\u1015\u1002\u1013\u1010\u1012\u1001\u1011\u1005\u1001\u1016\u1017\u1005\u1001\u1000\u1010\u1006\u1013\u1001\u1001\u1000\u1014\u1003\u1010\u1007\u1007"));

    private void Method_41701() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_41699(Class_8491 class_8491, Class_33781 class_33781, float f) {
        super(class_8491, class_33781, f);
        this.\u0000strictfp((Class_7380)new Class_26323(this));
    }

    protected Class_2080 Method_41702(Class_1061 class_1061) {
        return this.Method_41704((Class_46658)class_1061);
    }

    private static String Method_41703(String string) {
        int n = 31534;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_41699.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    protected Class_2080 Method_41704(Class_46658 class_46658) {
        return Field_41700;
    }
}

