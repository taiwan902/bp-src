/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_41279
extends Class_40019 {
    private static final Class_2080 Field_41280 = new Class_2080(Class_41279.Method_41284("\u0104\u0114\u0100\u0104\u0104\u0102\u0114\u0102\u015e\u011c\u011e\u010c\u0118\u010c\u0108\u015e\u0102\u0100\u0100\u0102\u0102\u0104\u0106\u0146\u0118\u010e\u010e"));

    protected float Method_41281(Class_46796 class_46796, float f) {
        float f2 = class_46796.Field_46798 + (class_46796.Field_46802 - class_46796.Field_46798) * f;
        float f3 = class_46796.Field_46799 + (class_46796.Field_46800 - class_46796.Field_46799) * f;
        return (Class_13337.Method_13370(f2) + 1.0f) * f3;
    }

    private void Method_41282() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_41279(Class_8491 class_8491, Class_33781 class_33781, float f) {
        super(class_8491, class_33781, f);
    }

    protected Class_2080 Method_41283(Class_46796 class_46796) {
        return Field_41280;
    }

    private static String Method_41284(String string) {
        int n = 18514;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_41279.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    protected Class_2080 Method_41285(Class_1061 class_1061) {
        return this.Method_41283((Class_46796)class_1061);
    }

    protected float Method_41286(Class_859 class_859, float f) {
        return this.Method_41281((Class_46796)class_859, f);
    }
}

