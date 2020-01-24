/*
 * Decompiled with CFR 0.145.
 */
import java.io.IOException;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_32414
implements Class_2045 {
    private static final Class_2080 Field_32415 = new Class_2080(Class_32414.Method_32417("\u2418\u2408\u2416\u241b\u241d\u2419\u240f\u241a\u2401\u240c\u2403\u2403\u2405\u2419\u2407\u240a\u240c\u2410\u241a\u2412\u2414\u2410\u241b\u241e\u2419\u2411\u240e\u2413\u241d"));

    public void Method_32416(Class_279 class_279) {
        try {
            Class_12135.Method_12140(Class_18695.Method_18706(class_279, Field_32415));
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }

    private static String Method_32417(String string) {
        int n = 9505;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_32414.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_32418() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

