/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_29849
extends Class_2651 {
    public static final Class_9780 Field_29850;
    private static final long Field_29851;

    private void Method_29852() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    static {
        Field_29851 = Class_29849.Method_29853("\u150a\u150a\u1506\u1500\u1508\u1500\u1502\u1500\u1506\u150a\u1508\u150c\u150e\u1500").hashCode();
        Field_29850 = new Class_9780(Field_29851, Class_35650.Field_35653, (25731 & -30655) != 0, (26112 & 16) != 0, Class_43755.Field_43765).Method_9796();
    }

    public Class_29849(Class_2457 class_2457, Class_26655 class_26655, Class_31717 class_31717, int n, Class_2767 class_2767) {
        super(class_2457, class_26655, class_31717, n, class_2767);
        this.\u0000strictfp.Method_31761(Field_29850);
    }

    private static String Method_29853(String string) {
        int n = 28874;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_29849.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }
}

