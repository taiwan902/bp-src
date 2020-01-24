/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_47687
extends Class_47591 {
    private static final Class_2080 Field_47688 = new Class_2080(Class_47687.Method_47692("\u0111\u0100\u0115\u0111\u0114\u0113\u0104\u0112\u0102\u0100\u0103\u0111\u0100\u0115\u0110\u0106\u0117\u0102\u0100\u0107\u0100\u0104\u0136\u0111\u0104\u0102\u0100\u0104\u0107\u0107\u0111\u0107\u0122"));

    protected Class_2080 Method_47689(Class_1061 class_1061) {
        return this.Method_47691((Class_46429)class_1061);
    }

    private void Method_47690() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected Class_2080 Method_47691(Class_46429 class_46429) {
        return Field_47688;
    }

    private static String Method_47692(String string) {
        int n = 7346;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_47687.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    protected Class_2080 Method_47693(Class_34093 class_34093) {
        return this.Method_47691((Class_46429)class_34093);
    }

    public Class_47687(Class_8491 class_8491) {
        super(class_8491, new Class_38131(), 0.57843137f * 0.86440676f, 1.0f);
        this.\u0000strictfp((Class_7380)new Class_19353(this));
        this.\u0000strictfp((Class_7380)new Class_28229(this, this));
    }
}

