/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Collection;

public class Class_39153
extends Class_37430 {
    protected static final Class_2080 Field_39154 = new Class_2080(Class_39153.Method_39156("\u0001\u0001\u0007\u0002\u0004\u0002\u0006\u0001\n\u000b\n\u000f\u000e\u000b\f\f\u0001\u0005\u0006\u0000\u0004\u0002\u0004\u0003\u000b\n\n\b\r\u000f\t\u000b\u0003\u0004\u0001\u0001"));

    private void Method_39155() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private static String Method_39156(String string) {
        int n = 15187;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_39153.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_39153() {
        super("Active Effects", -26569 & 18047, -24142 & 599);
    }

    public void Method_39157(int n, int n2, float f) {
        this.\u0000, ` = (Boolean)this.\u0000strictfp.Field_84.Field_39732.Field_8889.\u0000strictfp();
        if (!this.\u0000, `) {
            return;
        }
        Collection collection = this.\u0000strictfp.Field_48.\u0000strictfp();
        if (!collection.isEmpty()) {
            this.\u0000, `(-24009 & 55, (4122 & -5806) * collection.size());
            int n3 = this.\u0000, for;
            int n4 = this.\u0000, 2;
            Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 1.0f);
            Class_16867.Method_16931();
            for (Class_25240 class_25240 : this.\u0000strictfp.Field_48.\u0000strictfp()) {
                Class_8338 class_8338 = Class_8338.Field_8341[class_25240.Method_25253()];
                Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 1.0f);
                this.\u0000strictfp.Method_253().Method_34707(Field_39154);
                if (class_8338.Method_8446()) {
                    int n5 = class_8338.Method_8425();
                    this.\u0000strictfp(n3 + (2 & -30126), n4, n5 % (8217 & 6218) * (28978 & 2270), (18663 & 9414) + n5 / (17464 & -18424) * (786 & 6290), -20458 & 602, 658 & 2098);
                }
                String string = "";
                this.\u0000strictfp.Field_27.Method_28729(string, n3 + (1039 & -16362) + (16594 & 3355), n4 + (4103 & 2048), 67108863 & 16777215);
                String string2 = Class_8338.Method_8416(class_25240);
                this.\u0000strictfp.Field_27.Method_28729(string2, n3 + (19470 & 8742) + (-29998 & 5138), n4 + (93 & -15355), 14086612 & 618190584);
                n4 += 18;
            }
        }
    }
}

