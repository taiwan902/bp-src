/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_40854
extends Class_40019 {
    private float Field_40855;
    private static final Class_2080 Field_40856 = new Class_2080(Class_40854.Method_40858("\u4840\u4850\u4846\u4842\u4840\u4844\u4852\u4846\u4810\u4850\u4852\u4842\u4854\u4840\u4846\u4812\u4844\u4850\u4852\u4856\u4854\u4850\u4812\u4846\u4850\u4850\u4856\u4856\u4850\u4810\u4846\u4852\u4870"));

    private void Method_40857() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private static String Method_40858(String string) {
        int n = 2277;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_40854.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    protected Class_2080 Method_40859(Class_1061 class_1061) {
        return this.Method_40861((Class_43146)class_1061);
    }

    protected void Method_40860(Class_43146 class_43146, float f) {
        Class_16867.Method_16973(this.Field_40855, this.Field_40855, this.Field_40855);
    }

    public Class_40854(Class_8491 class_8491, Class_33781 class_33781, float f, float f2) {
        super(class_8491, class_33781, f * f2);
        this.Field_40855 = f2;
        this.\u0000strictfp((Class_7380)new Class_19353(this));
        this.\u0000strictfp((Class_7380)new Class_25228(this, this));
    }

    protected Class_2080 Method_40861(Class_43146 class_43146) {
        return Field_40856;
    }

    protected void Method_40862(Class_859 class_859, float f) {
        this.Method_40860((Class_43146)class_859, f);
    }

    public void Method_40863() {
        Class_16867.Method_16943(0.0f, 0.59090906f * 0.3173077f, 0.0f);
    }
}

