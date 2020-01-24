/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class Class_32390 {
    private static final int Field_32391;
    private static final AtomicInteger Field_32392;
    private static final int Field_32393;
    private static final Class_6113 Field_32394;
    private static final Class_34677 Field_32395;
    private final Class_34677 Field_32396 = new Class_37669(this);
    private static final int Field_32397;
    private final int Field_32398;

    protected Class_32390() {
        this(Field_32393);
    }

    private static String Method_32399(String string) {
        int n = 30130;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_32390.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    static Class_34677 Method_32400() {
        return Field_32395;
    }

    static int Method_32401() {
        return Field_32397;
    }

    public final boolean Method_32402(Object object, Class_22999 class_22999) {
        Class_28917 class_28917 = (Class_28917)class_22999;
        if (Class_28917.Method_28923((Class_28917)class_28917).Field_11656 != this) {
            return (-9200 & 8320) != 0;
        }
        if (object != Class_28917.Method_28924(class_28917)) {
            throw new IllegalArgumentException("o does not belong to handle");
        }
        class_28917.Method_28928();
        return (12417 & 3161) != 0;
    }

    protected Class_32390(int n) {
        this.Field_32398 = Math.max(312 & 16514, n);
    }

    private void Method_32403() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    static int Method_32404(Class_32390 class_32390) {
        return class_32390.Field_32398;
    }

    static {
        Field_32394 = Class_10201.Method_10203(Class_32390.class);
        Field_32392 = new AtomicInteger(-2130630908 & -1937614831);
        Field_32397 = Field_32392.getAndIncrement();
        int n = Class_16591.Method_16601(Class_32390.Method_32405("\u2014\u2010\u2000\u2010\u2000\u2014\u2010\u2014\u2058\u201c\u2018\u2058\u201c\u201c\u200c\u200c\u2014\u2040\u2014\u2000\u2000\u2010\u2000\u2004\u2008\u201c\u2048\u2008\u2008\u2018\u2028\u2008\u2024\u2034\u2034\u2034\u2024\u2020\u2074\u2034\u2038\u2038\u203c\u2028\u203c\u202c"), 513 & 16548);
        if (n <= 0) {
            n = 67454496 & 8651012;
        }
        Field_32393 = n;
        if (Field_32394.Method_6131()) {
            Field_32394.Method_6114(Class_32390.Method_32399("\u1098\u1091\u109a\u109b\u1080\u1091\u1082\u109b\u1098\u1091\u1092\u1093\u1090\u1091\u1092\u109b\u1090\u1091\u109a\u108b\u1090\u1081\u1082\u109b\u1088\u1081\u108a\u109b\u1080\u1081\u108a\u1093\u10b0\u10b1\u10a2\u10b3\u10b0\u10b9\u10a2\u10ab\u10b0\u10b9\u10ba\u10bb\u10b8\u10a9\u10b2\u10ab\u10b8\u10a1\u10ba\u10bb"), Field_32393);
        }
        Field_32391 = Math.min(Field_32393, -29439 & 4876);
        Field_32395 = new Class_37285();
    }

    private static String Method_32405(String string) {
        int n = 830;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_32390.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    protected abstract Object Method_32406(Class_22999 var1);

    static AtomicInteger Method_32407() {
        return Field_32392;
    }

    public final Object Method_32408() {
        Class_11651 class_11651 = (Class_11651)this.Field_32396.Method_34684();
        Class_28917 class_28917 = class_11651.Method_11662();
        if (class_28917 == null) {
            class_28917 = class_11651.Method_11660();
            Class_28917.Method_28922(class_28917, this.Method_32406(class_28917));
        }
        return Class_28917.Method_28924(class_28917);
    }

    static int Method_32409() {
        return Field_32391;
    }
}

