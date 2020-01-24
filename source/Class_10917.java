/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_10917
implements Class_7380 {
    private final Class_42347 Field_10918;
    private final Class_35605 Field_10919 = new Class_35605(1.3137255f * 0.38059703f);
    private static final Class_2080 Field_10920 = new Class_2080(Class_10917.Method_10921("\u5f19\u5f09\u5f13\u5f1a\u5f1c\u5f1c\u5f0e\u5f1f\u5f00\u5f09\u5f03\u5f1a\u5f04\u5f1c\u5f16\u5f07\u5f18\u5f01\u5f1b\u5f02\u5f0c\u5f1c\u5f06\u5f1f\u5f00\u5f18\u5f03\u5f0b\u5f1d\u5f15\u5f0e\u5f1e\u5f20\u5f21\u5f3b\u5f22\u5f3d\u5f24\u5f2e"));

    public Class_10917(Class_42347 class_42347) {
        this.Field_10918 = class_42347;
    }

    private static String Method_10921(String string) {
        int n = 11959;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_10917.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public boolean Method_10922() {
        return (4644 & 200) != 0;
    }

    private void Method_10923() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_10924(Class_859 class_859, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.Method_10925((Class_42901)class_859, f, f2, f3, f4, f5, f6, f7);
    }

    public void Method_10925(Class_42901 class_42901, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        if (class_42901.Method_42920()) {
            Class_16867.Method_16930((!class_42901.\u0000= ?() ? 259 & 1153 : -23289 & 2600) != 0);
            this.Field_10918.\u0000strictfp(Field_10920);
            Class_16867.Method_16934(-26810 & 5938);
            Class_16867.Method_16962();
            float f8 = (float)class_42901.\u0000= package + f3;
            float f9 = Class_13337.Method_13350(f8 * (0.59090906f * 0.033846155f)) * (0.35365853f * 8.4827585f);
            float f10 = f8 * (0.0013636363f * 7.3333335f);
            Class_16867.Method_16943(f9, f10, 0.0f);
            Class_16867.Method_16934(6048 & 24346);
            Class_16867.Method_16947();
            float f11 = 0.375f * 1.3333334f;
            Class_16867.Method_16924(f11, f11, f11, 1.0f);
            Class_16867.Method_16931();
            Class_16867.Method_16951(-20479 & 3, 7 & 6209);
            this.Field_10919.Method_35608(class_42901, f, f2, f3);
            this.Field_10919.\u0000strictfp(this.Field_10918.\u0000strictfp());
            this.Field_10919.Method_35609(class_42901, f, f2, f4, f5, f6, f7);
            Class_16867.Method_16934(5955 & 6066);
            Class_16867.Method_16962();
            Class_16867.Method_16934(-8441 & 5888);
            Class_16867.Method_16918();
            Class_16867.Method_16952();
        }
    }
}

