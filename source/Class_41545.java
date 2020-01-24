/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_41545
extends Class_40019 {
    private static final Class_2080 Field_41546 = new Class_2080(Class_41545.Method_41549("\u424d\u425d\u4241\u424c\u424c\u4248\u425c\u4249\u4214\u425d\u4255\u424c\u4250\u424c\u4240\u4215\u4258\u4255\u424c\u4215\u4254\u4255\u4254\u4249\u4251\u4248\u4254\u4255\u4254\u4214\u4249\u4254\u427c"));

    private void Method_41547() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected Class_2080 Method_41548(Class_1061 class_1061) {
        return this.Method_41550((Class_46942)class_1061);
    }

    private static String Method_41549(String string) {
        int n = 29141;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_41545.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    protected Class_2080 Method_41550(Class_46942 class_46942) {
        return Field_41546;
    }

    public Class_41545(Class_8491 class_8491, Class_33781 class_33781, float f) {
        super(class_8491, class_33781, f);
        this.\u0000strictfp((Class_7380)new Class_10304(this));
    }
}

