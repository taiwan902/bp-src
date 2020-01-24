/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_41608
extends Class_40019 {
    private static final Class_2080 Field_41609 = new Class_2080(Class_41608.Method_41613("\u02d2\u02c3\u02d8\u02d1\u02d6\u02d5\u02c4\u02d7\u0288\u02c3\u02ca\u02d1\u02ce\u02d7\u02dc\u028f\u02d0\u02db\u02d0\u02cb\u02d6\u029d\u02c4\u02df\u02d0"));

    private void Method_41610() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected Class_2080 Method_41611(Class_42260 class_42260) {
        return Field_41609;
    }

    protected Class_2080 Method_41612(Class_1061 class_1061) {
        return this.Method_41611((Class_42260)class_1061);
    }

    private static String Method_41613(String string) {
        int n = 4607;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_41608.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_41608(Class_8491 class_8491) {
        super(class_8491, new Class_34976(), 0.7037037f * 0.71052635f);
    }
}

