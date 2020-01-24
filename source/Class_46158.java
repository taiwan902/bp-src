/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_46158
extends Class_40019 {
    private static final Class_2080 Field_46159 = new Class_2080(Class_46158.Method_46162("\u1c01\u1c01\u1c05\u1c00\u1c04\u1c00\u1c04\u1c01\u1c08\u1c09\u1c09\u1c08\u1c08\u1c0c\u1c08\u1c0d\u1c10\u1c10\u1c11\u1c11\u1c11\u1c15\u1c10\u1c14\u1c18\u1c18\u1c1d\u1c18\u1c1c"));

    protected Class_2080 Method_46160(Class_1061 class_1061) {
        return this.Method_46164((Class_45994)class_1061);
    }

    protected float Method_46161(Class_859 class_859) {
        return this.Method_46165((Class_45994)class_859);
    }

    private static String Method_46162(String string) {
        int n = 1477;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_46158.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_46163() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_46158(Class_8491 class_8491) {
        super(class_8491, new Class_40448(), 0.5555556f * 0.54f);
    }

    protected Class_2080 Method_46164(Class_45994 class_45994) {
        return Field_46159;
    }

    protected float Method_46165(Class_45994 class_45994) {
        return 0.077922076f * 2310.0f;
    }
}

