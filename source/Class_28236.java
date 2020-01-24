/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_28236
extends Class_1906 {
    private static final Class_2080 Field_28237 = new Class_2080(Class_28236.Method_28238("\uc080\uc091\uc08e\uc082\uc081\uc086\uc093\uc085\uc0db\uc093\uc083\uc09f\uc0db\uc097\uc099\uc098\uc090\uc085\uc08f\uc088\uc081\uc096\uc0c9\uc085\uc096\uc085\uc080\uc092\uc08d\uc08a\uc081\uc0b9\uc0a0\uc0b5\uc0b4\uc0ba\uc0b1\uc0fa\uc0a6\uc0b8\uc0b3"));

    private static String Method_28238(String string) {
        int n = 25548;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_28236.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_28239() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_28236(Class_37781 class_37781, Class_283 class_283, Class_4751 class_4751) {
        super(new Class_15875(class_37781, class_283, class_4751));
    }

    protected void Method_28240(int n, int n2) {
        this.\u0000strictfp.Method_28692(Class_9802.Method_9806("container.crafting", new Object[21136 & 67]), 17118 & -32740, 262 & 26134, 1684065090 & 38298688);
        this.\u0000strictfp.Method_28692(Class_9802.Method_9806("container.inventory", new Object[5632 & 8451]), 9129 & 16396, this.\u0000= int - (4321 & -22408) + (-15742 & 1026), 340019440 & 164156738);
    }

    public Class_28236(Class_37781 class_37781, Class_283 class_283) {
        this(class_37781, class_283, Class_4751.Field_4760);
    }

    protected void Method_28241(float f, int n, int n2) {
        Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 1.0f);
        this.\u0000strictfp.Method_253().Method_34707(Field_28237);
        int n3 = (this.\u0000= final - this.\u0000, for) / (8850 & 19495);
        int n4 = (this.\u0000, ` - this.\u0000= int) / (1542 & 6275);
        this.\u0000strictfp(n3, n4, 2052 & 8259, 5542 & 25112, this.\u0000, for, this.\u0000= int);
    }
}

