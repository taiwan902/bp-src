/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_41379
extends Class_40019 {
    private static final Class_2080 Field_41380 = new Class_2080(Class_41379.Method_41386("\u8056\u8046\u8050\u8055\u8057\u8051\u8045\u8052\u800d\u804e\u804e\u805d\u804b\u805f\u8059\u800e\u8041\u8043\u8051\u8055\u8057\u8041\u8017\u8042\u804a\u805a\u805c\u805c\u8048\u801d\u8048\u805f\u8045"));

    protected float Method_41381(Class_859 class_859) {
        return this.Method_41383((Class_44290)class_859);
    }

    private void Method_41382() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected float Method_41383(Class_44290 class_44290) {
        return 2790.0f * 0.06451613f;
    }

    protected Class_2080 Method_41384(Class_1061 class_1061) {
        return this.Method_41385((Class_44290)class_1061);
    }

    protected Class_2080 Method_41385(Class_44290 class_44290) {
        return Field_41380;
    }

    private static String Method_41386(String string) {
        int n = 3684;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_41379.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_41379(Class_8491 class_8491) {
        super(class_8491, new Class_37342(), 1.0f);
        this.\u0000strictfp((Class_7380)new Class_10193(this));
    }
}

