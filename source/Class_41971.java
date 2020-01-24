/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_41971
extends Class_40019 {
    private static final Class_2080 Field_41972;
    private static final Class_2080 Field_41973;
    private static final Class_2080 Field_41974;
    private static final Class_2080 Field_41975;
    private static final Class_2080 Field_41976;
    private static final Class_2080 Field_41977;
    private static final Class_2080 Field_41978;
    private static final Class_2080 Field_41979;

    private static String Method_41980(String string) {
        int n = 7923;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_41971.class, 5);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_41971(Class_8491 class_8491, Class_33781 class_33781, float f) {
        super(class_8491, class_33781, f);
    }

    protected Class_2080 Method_41981(Class_1061 class_1061) {
        return this.Method_41983((Class_44525)class_1061);
    }

    private static String Method_41982(String string) {
        int n = 6820;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_41971.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    protected Class_2080 Method_41983(Class_44525 class_44525) {
        String string = Class_5478.Method_5555(class_44525.\u0000, `());
        if (string != null && string.equals("Toast")) {
            return Field_41973;
        }
        switch (class_44525.Method_44545()) {
            default: {
                return Field_41977;
            }
            case 1: {
                return Field_41974;
            }
            case 2: {
                return Field_41976;
            }
            case 3: {
                return Field_41979;
            }
            case 4: {
                return Field_41975;
            }
            case 5: {
                return Field_41972;
            }
            case 99: 
        }
        return Field_41978;
    }

    private static String Method_41984(String string) {
        int n = 25130;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_41971.class, 7);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_41985(String string) {
        int n = 1478;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_41971.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_41986(String string) {
        int n = 14792;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_41971.class, 6);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    static {
        Field_41977 = new Class_2080(Class_41971.Method_41987("\u4645\u4645\u4641\u4644\u4644\u4642\u4644\u4643\u460e\u464d\u464f\u464c\u4648\u464c\u4648\u460f\u4643\u4641\u4643\u4642\u4640\u4644\u4606\u4642\u464b\u464f\u464e\u464e\u460f\u4648\u464f\u464f"));
        Field_41974 = new Class_2080(Class_41971.Method_41982("\u5056\u5046\u5050\u5055\u5053\u5055\u5041\u5056\u5005\u5046\u5046\u5055\u5047\u5053\u5055\u5002\u5040\u5052\u5052\u5053\u5057\u5043\u5013\u5042\u5052\u5052\u5044\u5054\u5010\u5047\u5052\u5052"));
        Field_41976 = new Class_2080(Class_41971.Method_41985("\u020d\u020d\u0201\u020c\u020c\u0208\u020c\u0209\u0204\u020d\u0205\u020c\u0200\u020c\u0200\u0205\u0219\u0219\u0219\u0218\u0210\u021c\u0214\u0218\u0215\u0219\u0218\u0211\u0215\u0218\u0215\u021d"));
        Field_41975 = new Class_2080(Class_41971.Method_41988("\u8073\u8062\u8073\u8073\u8072\u8071\u8062\u8070\u8028\u806a\u8069\u807b\u806a\u807b\u807a\u8028\u8061\u8072\u8071\u8071\u8072\u8063\u8030\u8070\u8078\u807b\u807b\u8039\u806b\u8079\u8078"));
        Field_41972 = new Class_2080(Class_41971.Method_41980("\u3280\u3281\u3288\u3281\u3284\u3285\u3284\u3285\u32c0\u3289\u3280\u3289\u3284\u328d\u3284\u32c5\u3280\u3281\u3280\u3281\u328c\u3285\u32cc\u3285\u3288\u3281\u3288\u32c1\u328c\u3285\u328c"));
        Field_41979 = new Class_2080(Class_41971.Method_41986("\u0a02\u0a02\u0a00\u0a01\u0a07\u0a05\u0a05\u0a06\u0a09\u0a0a\u0a0a\u0a09\u0a0f\u0a0f\u0a0d\u0a0e\u0a10\u0a12\u0a12\u0a13\u0a17\u0a17\u0a17\u0a16\u0a1a\u0a1a\u0a18\u0a18\u0a3d\u0a1c\u0a1c\u0a1d\u0a01\u0a03\u0a03\u0a01\u0a07\u0a07\u0a06\u0a05\u0a08\u0a08"));
        Field_41973 = new Class_2080(Class_41971.Method_41984("\u8c00\u8c10\u8c06\u8c03\u8c05\u8c03\u8c17\u8c00\u8c5b\u8c18\u8c18\u8c0b\u8c19\u8c0d\u8c0b\u8c5c\u8c06\u8c14\u8c14\u8c15\u8c11\u8c05\u8c55\u8c07\u8c1b\u8c1c\u8c0d\u8c0b\u8c5e\u8c09\u8c1c\u8c1c"));
        Field_41978 = new Class_2080(Class_41971.Method_41989("\ucc04\ucc04\ucc02\ucc06\ucc00\ucc06\ucc02\ucc04\ucc4e\ucc0c\ucc0c\ucc0e\ucc0c\ucc08\ucc0e\ucc48\ucc12\ucc10\ucc10\ucc10\ucc14\ucc10\ucc50\ucc14\ucc18\ucc1c\ucc18\ucc18\ucc1c\ucc1a\ucc18\ucc18\ucc26\ucc66\ucc22\ucc24\ucc22"));
    }

    private static String Method_41987(String string) {
        int n = 8441;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_41971.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_41988(String string) {
        int n = 17823;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_41971.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_41989(String string) {
        int n = 6246;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_41971.class, 8);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_41990() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

