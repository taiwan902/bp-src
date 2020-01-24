/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_47513
extends Class_40019 {
    private static final Class_2080 Field_47514 = new Class_2080(Class_47513.Method_47521("\ua684\ua695\ua682\ua687\ua684\ua681\ua696\ua683\ua69c\ua69d\ua69e\ua68f\ua698\ua68d\ua68a\ua69f\ua684\ua691\ua686\ua693\ua690\ua695\ua682\ua697\ua69c"));

    public void Method_47515(Class_859 class_859, double d, double d2, double d3, float f, float f2) {
        this.Method_47519((Class_44826)class_859, d, d2, d3, f, f2);
    }

    public void Method_47516() {
        Class_16867.Method_16943(0.0f, 2.4107141f * 0.07777778f, 0.0f);
    }

    public void Method_47517(Class_34093 class_34093, double d, double d2, double d3, float f, float f2) {
        this.Method_47519((Class_44826)class_34093, d, d2, d3, f, f2);
    }

    private void Method_47518() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_47519(Class_44826 class_44826, double d, double d2, double d3, float f, float f2) {
        ((Class_41941)this.\u0000strictfp).Field_41944 = class_44826.\u0000strictfp() != null ? 5121 & 2179 : -10684 & 9;
        super.Method_40029(class_44826, d, d2, d3, f, f2);
    }

    protected Class_2080 Method_47520(Class_44826 class_44826) {
        return Field_47514;
    }

    private static String Method_47521(String string) {
        int n = 3211;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_47513.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_47522(Class_1061 class_1061, double d, double d2, double d3, float f, float f2) {
        this.Method_47519((Class_44826)class_1061, d, d2, d3, f, f2);
    }

    public Class_47513(Class_8491 class_8491) {
        super(class_8491, new Class_41941(0.0f), 4.5625f * 0.10958904f);
        this.\u0000strictfp((Class_7380)new Class_31503(this));
    }

    protected void Method_47523(Class_859 class_859, float f) {
        this.Method_47524((Class_44826)class_859, f);
    }

    protected void Method_47524(Class_44826 class_44826, float f) {
        float f2 = 0.21460843f * 4.368421f;
        Class_16867.Method_16973(f2, f2, f2);
    }

    protected Class_2080 Method_47525(Class_1061 class_1061) {
        return this.Method_47520((Class_44826)class_1061);
    }
}

