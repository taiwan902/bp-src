/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_29887
extends Class_27380 {
    private Class_38536 Field_29888 = new Class_38536();
    private static final Class_2080 Field_29889 = new Class_2080(Class_29887.Method_29893("\u8c00\u8c00\u8c04\u8c00\u8c00\u8c06\u8c00\u8c06\u8c0a\u8c08\u8c0a\u8c08\u8c0c\u8c08\u8c0c\u8c0a\u8c10\u8c10\u8c14\u8c10\u8c12\u8c16\u8c12\u8c12\u8c18\u8c1a\u8c1c\u8c1a\u8c1a"));

    private void Method_29890() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_29887(Class_8491 class_8491) {
        super(class_8491);
    }

    protected Class_2080 Method_29891(Class_32225 class_32225) {
        return Field_29889;
    }

    protected Class_2080 Method_29892(Class_1061 class_1061) {
        return this.Method_29891((Class_32225)class_1061);
    }

    private static String Method_29893(String string) {
        int n = 29252;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_29887.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_29894(Class_1061 class_1061, double d, double d2, double d3, float f, float f2) {
        this.Method_29895((Class_32225)class_1061, d, d2, d3, f, f2);
    }

    public void Method_29895(Class_32225 class_32225, double d, double d2, double d3, float f, float f2) {
        Class_16867.Method_16961();
        Class_16867.Method_16969();
        Class_16867.Method_16943((float)d, (float)d2, (float)d3);
        float f3 = 0.1640625f * 0.3809524f;
        Class_16867.Method_16957();
        Class_16867.Method_16973(0.4920635f * -2.032258f, 1.0117648f * -0.988372f, 1.0f);
        Class_16867.Method_16913();
        this.\u0000, `((Class_1061)class_32225);
        this.Field_29888.Method_38539(class_32225, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f3);
        Class_16867.Method_16945();
        super.Method_27403(class_32225, d, d2, d3, f, f2);
    }
}

