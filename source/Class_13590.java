/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_13590 {
    private static final Class_2080 Field_13591 = new Class_2080(Class_13590.Method_13596("\u9499\u9488\u9491\u9499\u949c\u949f\u948c\u949e\u9482\u948a\u9498\u9480\u9486\u949e\u949d\u949f\u9498\u9498\u9490\u94a2\u9494\u9497\u949d\u9494\u949a\u9498\u9489\u9492\u948f\u9497\u948d\u9497\u948a"));
    private float Field_13592 = 1.0f;
    private final Class_18 Field_13593;
    private int Field_13594 = 1025 & -16347;

    public void Method_13595() {
        if (this.Field_13593.Method_242().Method_1827()) {
            this.Field_13592 += 0.031690143f * 0.7888889f * (float)this.Field_13594;
            if (this.Field_13592 < 0.0f) {
                this.Field_13594 *= -1 & -1;
                this.Field_13592 = 0.0f;
            } else if (this.Field_13592 > 1.0f) {
                this.Field_13594 *= -1 & -1;
                this.Field_13592 = 1.0f;
            }
        } else {
            this.Field_13592 = 1.0f;
            this.Field_13594 = -28655 & 11947;
        }
    }

    private static String Method_13596(String string) {
        int n = 2280;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_13590.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_13590(Class_18 class_18) {
        this.Field_13593 = class_18;
    }

    private void Method_13597() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

