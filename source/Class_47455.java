/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_47455
extends Class_46825 {
    private static final Class_7065 Field_47456 = new Class_7065(-28681 & 5103, Class_47455.Method_47461("\u00a2\u0091\u0096\u0093\u0094\u0085\u0096"));

    private void Method_47457() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected Class_32692 Method_47458() {
        return new Class_39148(Class_18300.Field_18302, Field_47456, this.validateHeaders);
    }

    protected Class_32692 Method_47459(String[] arrstring) {
        return new Class_39148(Class_18300.Method_18324(arrstring[20993 & 2048]), new Class_7065(Integer.parseInt(arrstring[18083 & 4177]), arrstring[16398 & 9267]), this.validateHeaders);
    }

    protected boolean Method_47460() {
        return (17856 & -28150) != 0;
    }

    public Class_47455(int n, int n2, int n3, boolean bl) {
        super(n, n2, n3, (-28415 & 8193) != 0, bl);
    }

    private static String Method_47461(String string) {
        int n = 9895;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_47455.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }
}

