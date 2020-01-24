/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_47754
extends Class_40019 {
    private static final Class_2080 Field_47755 = new Class_2080(Class_47754.Method_47756("\u9e00\u9e11\u9e04\u9e01\u9e00\u9e05\u9e10\u9e05\u9e18\u9e19\u9e18\u9e09\u9e1c\u9e09\u9e0c\u9e19\u9e04\u9e11\u9e10\u9e01\u9e10\u9e15\u9e10\u9e11\u9e0c\u9e19\u9e18"));

    private static String Method_47756(String string) {
        int n = 10592;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_47754.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_34720 Method_47757() {
        return (Class_34720)super.\u0000strictfp();
    }

    public Class_47754(Class_8491 class_8491) {
        super(class_8491, new Class_34720(), 0.3888889f * 1.2857143f);
        this.\u0000strictfp((Class_7380)new Class_25590(this));
    }

    public Class_33781 Method_47758() {
        return this.Method_47757();
    }

    protected Class_2080 Method_47759(Class_45531 class_45531) {
        return Field_47755;
    }

    protected Class_2080 Method_47760(Class_1061 class_1061) {
        return this.Method_47759((Class_45531)class_1061);
    }

    private void Method_47761() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

