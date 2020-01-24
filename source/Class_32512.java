/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_32512
extends Class_27380 {
    private static final Class_2080 Field_32513 = new Class_2080(Class_32512.Method_32520("\u2d38\u2d29\u2d32\u2d3b\u2d3c\u2d3d\u2d2e\u2d3f\u2d20\u2d29\u2d22\u2d3b\u2d24\u2d3d\u2d36\u2d27\u2d28\u2d21\u2d2a\u2d3b\u2d24\u2d3d\u2d26\u2d2f"));
    protected Class_33781 Field_32514 = new Class_38034();

    private void Method_32515() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_32516(Class_1061 class_1061, double d, double d2, double d3, float f, float f2) {
        this.Method_32517((Class_25683)class_1061, d, d2, d3, f, f2);
    }

    public void Method_32517(Class_25683 class_25683, double d, double d2, double d3, float f, float f2) {
        Class_16867.Method_16961();
        Class_16867.Method_16943((float)d, (float)d2 + 0.4027778f * 0.62068963f, (float)d3);
        Class_16867.Method_16940(4770.0f * 0.03773585f - f, 0.0f, 1.0f, 0.0f);
        float f3 = (float)class_25683.Method_25707() - f2;
        float f4 = class_25683.Method_25699() - f2;
        if (f4 < 0.0f) {
            f4 = 0.0f;
        }
        if (f3 > 0.0f) {
            Class_16867.Method_16940(Class_13337.Method_13370(f3) * f3 * f4 / (0.49473685f * 20.212765f) * (float)class_25683.Method_25711(), 1.0f, 0.0f, 0.0f);
        }
        float f5 = 1.5326087f * 0.4893617f;
        Class_16867.Method_16973(f5, f5, f5);
        Class_16867.Method_16973(1.0f / f5, 1.0f / f5, 1.0f / f5);
        this.\u0000, `((Class_1061)class_25683);
        Class_16867.Method_16973(1.5384616f * -0.65f, -0.4f * 2.5f, 1.0f);
        this.Field_32514.Method_33794(class_25683, 0.0f, 0.0f, 8.4f * -0.011904763f, 0.0f, 0.0f, 0.030357143f * 2.0588236f);
        Class_16867.Method_16945();
        super.Method_27403(class_25683, d, d2, d3, f, f2);
    }

    protected Class_2080 Method_32518(Class_1061 class_1061) {
        return this.Method_32519((Class_25683)class_1061);
    }

    public Class_32512(Class_8491 class_8491) {
        super(class_8491);
        this.\u0000, ` = 0.5833333f * 0.85714287f;
    }

    protected Class_2080 Method_32519(Class_25683 class_25683) {
        return Field_32513;
    }

    private static String Method_32520(String string) {
        int n = 8262;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_32512.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }
}

