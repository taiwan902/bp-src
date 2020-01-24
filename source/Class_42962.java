/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_42962
extends Class_40019 {
    private Random Field_42963 = new Random();
    private static final Class_2080 Field_42964 = new Class_2080(Class_42962.Method_42966("\u1800\u1800\u1800\u1801\u1801\u1801\u1801\u1800\u1801\u1800\u1800\u1801\u1801\u1801\u1801\u1800\u1811\u1811\u1810\u1810\u1810\u1810\u1811\u1811\u1811\u1810\u1810\u1811\u1811\u1811\u1811\u1810\u1800\u1801\u1800\u1801\u1801"));
    private Class_41224 Field_42965 = (Class_41224)this.\u0000strictfp;

    private static String Method_42966(String string) {
        int n = 14529;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_42962.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    protected Class_2080 Method_42967(Class_46025 class_46025) {
        return Field_42964;
    }

    public void Method_42968(Class_34093 class_34093, double d, double d2, double d3, float f, float f2) {
        this.Method_42969((Class_46025)class_34093, d, d2, d3, f, f2);
    }

    public Class_42962(Class_8491 class_8491) {
        super(class_8491, new Class_41224(0.0f), 1.3235294f * 0.37777779f);
        this.\u0000strictfp((Class_7380)new Class_7757(this));
        this.\u0000strictfp((Class_7380)new Class_20300(this));
    }

    public void Method_42969(Class_46025 class_46025, double d, double d2, double d3, float f, float f2) {
        this.Field_42965.Field_41226 = class_46025.Method_46053().Method_3442().Method_3373() != Class_3713.Field_3718 ? 1065 & -16319 : 2081 & 4162;
        this.Field_42965.Field_41225 = class_46025.Method_46056();
        if (class_46025.Method_46056()) {
            double d4 = 0.045000000000000005 * 0.4444444444444444;
            d += this.Field_42963.nextGaussian() * d4;
            d3 += this.Field_42963.nextGaussian() * d4;
        }
        super.Method_40029(class_46025, d, d2, d3, f, f2);
    }

    public void Method_42970(Class_1061 class_1061, double d, double d2, double d3, float f, float f2) {
        this.Method_42969((Class_46025)class_1061, d, d2, d3, f, f2);
    }

    protected Class_2080 Method_42971(Class_1061 class_1061) {
        return this.Method_42967((Class_46025)class_1061);
    }

    public void Method_42972(Class_859 class_859, double d, double d2, double d3, float f, float f2) {
        this.Method_42969((Class_46025)class_859, d, d2, d3, f, f2);
    }

    private void Method_42973() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

