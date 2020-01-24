/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_32132
extends Class_28538 {
    public static final Class_2080 Field_32133 = new Class_2080(Class_32132.Method_32135("\u5680\u5681\u5680\u5680\u5685\u5684\u5685\u5685\u5689\u5689\u5688\u5688\u568d\u568c\u568d\u568d\u5681\u5680\u5681\u5681\u5684\u5685\u5684\u5685\u5688\u5688\u5689\u5689\u568d\u568d\u568c\u568c\u5680\u5680\u5681"));

    protected void Method_32134(Class_859 class_859, float f, float f2, float f3) {
        this.Method_32141((Class_27288)class_859, f, f2, f3);
    }

    private static String Method_32135(String string) {
        int n = 30070;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_32132.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    protected boolean Method_32136(Class_27288 class_27288) {
        return class_27288.\u0000= catch();
    }

    public Class_46951 Method_32137() {
        return (Class_46951)super.Method_28550();
    }

    protected boolean Method_32138(Class_859 class_859) {
        return this.Method_32136((Class_27288)class_859);
    }

    public Class_32132(Class_8491 class_8491) {
        super(class_8491, new Class_46951(), 0.0f);
        Class_26716 class_26716 = new Class_26716(this, this);
        this.\u0000strictfp((Class_7380)class_26716);
        this.\u0000strictfp((Class_7380)new Class_19353(this));
        this.\u0000strictfp((Class_7380)new Class_23129(this.Method_32137()));
    }

    public Class_33781 Method_32139() {
        return this.Method_32137();
    }

    private void Method_32140() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected void Method_32141(Class_27288 class_27288, float f, float f2, float f3) {
        Class_16867.Method_16940(0.5326087f * 337.9592f - f2, 0.0f, 1.0f, 0.0f);
    }

    protected Class_2080 Method_32142(Class_1061 class_1061) {
        return this.Method_32144((Class_27288)class_1061);
    }

    protected boolean Method_32143(Class_1061 class_1061) {
        return this.Method_32136((Class_27288)class_1061);
    }

    protected Class_2080 Method_32144(Class_27288 class_27288) {
        return Field_32133;
    }
}

