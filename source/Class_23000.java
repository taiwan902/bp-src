/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.UUID;

public class Class_23000
implements Class_1486 {
    public int Field_23001;
    public Class_22180 Field_23002;
    public UUID Field_23003;

    private static String Method_23004(String string) {
        int n = 29979;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_23000.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_23005(Class_10954 class_10954) {
        this.Method_23006((Class_19025)class_10954);
    }

    public void Method_23006(Class_19025 class_19025) {
        class_19025.Method_19075(this);
    }

    public void Method_23007(Class_29900 class_29900) {
        this.Field_23001 = class_29900.Method_30004();
        this.Field_23003 = new UUID(class_29900.Method_30001(), class_29900.Method_30001());
        short s = class_29900.Method_30016();
        this.Field_23002 = new Class_22180();
        this.Field_23002.Field_22181 = (s & (97 & -7915)) != 0 ? -32699 & 21561 : 12322 & 18432;
        this.Field_23002.Field_22182 = (s & (18018 & 6283)) != 0 ? 14345 & 37 : 5120 & -15808;
        this.Field_23002.Field_22183 = (s & (-7642 & 5397)) != 0 ? 9235 & 16425 : 19458 & 4884;
        this.Field_23002.Field_22184 = (s & (-25304 & 24)) != 0 ? 10257 & 385 : 2560 & 5254;
    }

    private void Method_23008() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, Class_23000.Method_23004("\u4002\u4005\u4001\u4006\u4007\u4003\u4003\u4001\u4001\u4001\u4005\u4005\u4000\u4001"));
    }

    public void Method_23009(Class_29900 class_29900) {
    }
}

