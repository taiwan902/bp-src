/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_42293
extends Class_40019 {
    private static final Class_2080 Field_42294 = new Class_2080(Class_42293.Method_42295("P@ZRTTFV\u0000HBZD\\V\u0006@XZBTDV^HP\u0012JT\\"));

    private static String Method_42295(String string) {
        int n = 7870;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_42293.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    protected float Method_42296(Class_859 class_859) {
        return this.Method_42298((Class_45373)class_859);
    }

    protected Class_2080 Method_42297(Class_45373 class_45373) {
        return Field_42294;
    }

    public Class_42293(Class_8491 class_8491) {
        super(class_8491, new Class_39187(), 10.5f * 0.02857143f);
    }

    protected float Method_42298(Class_45373 class_45373) {
        return 2.5384614f * 70.909096f;
    }

    protected Class_2080 Method_42299(Class_1061 class_1061) {
        return this.Method_42297((Class_45373)class_1061);
    }

    private void Method_42300() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

