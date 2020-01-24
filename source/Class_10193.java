/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_10193
implements Class_7380 {
    private static final Class_2080 Field_10194 = new Class_2080(Class_10193.Method_10196("\u860c\u860c\u8600\u860d\u860d\u860b\u860d\u860a\u8647\u860c\u8606\u860d\u8601\u860d\u8601\u8646\u860b\u8609\u8601\u860d\u860d\u860b\u8627\u860c\u8601\u860c\u860b\u8647\u8608\u8607\u860f"));
    private final Class_41379 Field_10195;

    public Class_10193(Class_41379 class_41379) {
        this.Field_10195 = class_41379;
    }

    private static String Method_10196(String string) {
        int n = 13842;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_10193.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_10197() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_10198() {
        return (20712 & 6) != 0;
    }

    public void Method_10199(Class_44290 class_44290, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.Field_10195.\u0000strictfp(Field_10194);
        Class_16867.Method_16947();
        Class_16867.Method_16985();
        Class_16867.Method_16951(1029 & -24503, -12287 & 97);
        if (class_44290.\u0000= ?()) {
            Class_16867.Method_16930((1052 & 20513) != 0);
        } else {
            Class_16867.Method_16930((641 & -16019) != 0);
        }
        int n = 1140913392 & 545321201;
        int n2 = n % (-2147360062 & 179896336);
        int n3 = n / (10948737 & -1409185470);
        Class_32876.Method_32943(Class_32876.Field_32911, (float)n2 / 1.0f, (float)n3 / 1.0f);
        Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 1.0f);
        if (Class_19426.Method_19570()) {
            Class_12440.Method_12759();
        }
        this.Field_10195.\u0000strictfp().Method_33794(class_44290, f, f2, f4, f5, f6, f7);
        if (Class_19426.Method_19570()) {
            Class_12440.Method_12974();
        }
        n = class_44290.\u0000strictfp(f3);
        n2 = n % (-2053029880 & 1208057890);
        n3 = n / (-670986111 & 50406666);
        Class_32876.Method_32943(Class_32876.Field_32911, (float)n2 / 1.0f, (float)n3 / 1.0f);
        this.Field_10195.\u0000strictfp((Class_34093)class_44290, f3);
        Class_16867.Method_16952();
        Class_16867.Method_16913();
    }

    public void Method_10200(Class_859 class_859, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.Method_10199((Class_44290)class_859, f, f2, f3, f4, f5, f6, f7);
    }
}

