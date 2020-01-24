/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_46965
extends Class_40019 {
    private static final Class_2080 Field_46966 = new Class_2080(Class_46965.Method_46969("\u8d24\u8d34\u8d22\u8d26\u8d24\u8d20\u8d36\u8d22\u8d3c\u8d3c\u8d3e\u8d2e\u8d38\u8d2c\u8d2a\u8d3e\u8d30\u8d34\u8d26\u8d36\u8d30\u8d34\u8d26\u8d36\u8d28\u8d3c\u8d3e"));

    private void Method_46967() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected Class_2080 Method_46968(Class_1061 class_1061) {
        return this.Method_46970((Class_43539)class_1061);
    }

    private static String Method_46969(String string) {
        int n = 12189;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_46965.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_46965(Class_8491 class_8491, Class_33781 class_33781, float f) {
        super(class_8491, class_33781, f);
    }

    protected Class_2080 Method_46970(Class_43539 class_43539) {
        return Field_46966;
    }
}

