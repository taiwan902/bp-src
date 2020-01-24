/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_40949
implements Class_7380 {
    private static final Class_2080 Field_40950 = new Class_2080(Class_40949.Method_40953("\u9000\u9011\u9000\u9001\u9000\u9001\u9010\u9001\u9050\u9011\u9010\u9001\u9010\u9001\u9000\u9051\u9010\u9001\u9000\u9001\u9040\u9011\u9000\u9001\u9000\u9011\u9000\u9001\u9000\u9001\u9000\u9011\u9070\u9021\u9030\u9031"));
    private final Class_42319 Field_40951;

    public boolean Method_40952() {
        return (-24575 & 525) != 0;
    }

    private static String Method_40953(String string) {
        int n = 3323;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_40949.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_40954() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_40955(Class_47526 class_47526, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        if (class_47526.\u0000= +() && !class_47526.\u0000= ?()) {
            this.Field_40951.\u0000strictfp(Field_40950);
            Class_5393 class_5393 = Class_5393.Method_5446(class_47526.Method_47566().Method_5419());
            float[] arrf = Class_46658.Method_46680(class_5393);
            Class_16867.Method_16919(arrf[144 & -31486], arrf[12825 & 1313], arrf[-30454 & 25251]);
            this.Field_40951.\u0000strictfp().Method_33794(class_47526, f, f2, f4, f5, f6, f7);
        }
    }

    public void Method_40956(Class_859 class_859, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.Method_40955((Class_47526)class_859, f, f2, f3, f4, f5, f6, f7);
    }

    public Class_40949(Class_42319 class_42319) {
        this.Field_40951 = class_42319;
    }
}

