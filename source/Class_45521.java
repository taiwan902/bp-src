/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_45521
extends Class_40019 {
    private static final Class_2080 Field_45522 = new Class_2080(Class_45521.Method_45527("\u6218\u6208\u6216\u621b\u6219\u621d\u620b\u621e\u6201\u6208\u6202\u621b\u6205\u6219\u6217\u6202\u621d\u620d\u621b\u621a\u620c\u6218\u620e\u6212\u621d\u620d\u621b\u621a\u620c\u6218\u620e\u6213\u621c\u6201\u620b"));

    protected Class_2080 Method_45523(Class_1061 class_1061) {
        return this.Method_45528((Class_43073)class_1061);
    }

    protected int Method_45524(Class_859 class_859, float f, float f2) {
        return this.Method_45530((Class_43073)class_859, f, f2);
    }

    protected void Method_45525(Class_859 class_859, float f) {
        this.Method_45526((Class_43073)class_859, f);
    }

    protected void Method_45526(Class_43073 class_43073, float f) {
        float f2 = class_43073.Method_43085(f);
        float f3 = 1.0f + Class_13337.Method_13370(f2 * (4450.0f * 0.02247191f)) * f2 * (0.57954544f * 0.017254902f);
        f2 = Class_13337.Method_13360(f2, 0.0f, 1.0f);
        f2 *= f2;
        f2 *= f2;
        float f4 = (1.0f + f2 * (2.8333333f * 0.14117648f)) * f3;
        float f5 = (1.0f + f2 * (0.9411765f * 0.10625f)) / f3;
        Class_16867.Method_16973(f4, f5, f4);
    }

    public Class_45521(Class_8491 class_8491) {
        super(class_8491, new Class_35378(), 1.638889f * 0.30508474f);
        this.\u0000strictfp((Class_7380)new Class_34472(this));
    }

    private static String Method_45527(String string) {
        int n = 8733;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_45521.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    protected Class_2080 Method_45528(Class_43073 class_43073) {
        return Field_45522;
    }

    private void Method_45529() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected int Method_45530(Class_43073 class_43073, float f, float f2) {
        float f3 = class_43073.Method_43085(f2);
        if ((int)(f3 * (8.867925f * 1.1276596f)) % (24594 & 1319) == 0) {
            return 163 & -19892;
        }
        int n = (int)(f3 * (6.9166665f * 0.028915664f) * (46.363636f * 5.5f));
        n = Class_13337.Method_13367(n, 18688 & 8336, -14081 & 4607);
        return n << (8698 & 2073) | 318767103 & 218103807;
    }
}

