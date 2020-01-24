/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_45185
extends Class_40019 {
    private static final Class_2080 Field_45186 = new Class_2080(Class_45185.Method_45190("\u1120\u1120\u1124\u1121\u1125\u1123\u1125\u1122\u112b\u1128\u112a\u1129\u1129\u112d\u1129\u112e\u1134\u1134\u1133\u1132\u1130\u1130\u1137\u1137\u113c\u113b\u113b"));

    protected Class_2080 Method_45187(Class_1061 class_1061) {
        return this.Method_45188((Class_47600)class_1061);
    }

    public Class_45185(Class_8491 class_8491, Class_33781 class_33781, float f) {
        super(class_8491, class_33781, f);
        this.\u0000strictfp((Class_7380)new Class_21430(this));
    }

    protected Class_2080 Method_45188(Class_47600 class_47600) {
        return Field_45186;
    }

    private void Method_45189() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private static String Method_45190(String string) {
        int n = 11028;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_45185.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }
}

