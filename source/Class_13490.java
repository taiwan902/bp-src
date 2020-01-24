/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.UUID;

public class Class_13490 {
    private static final Class_2080 Field_13491 = new Class_2080(Class_13490.Method_13496("\u3950\u3940\u3952\u3953\u3951\u3951\u3943\u3952\u3901\u3940\u3942\u3953\u3941\u3951\u3953\u3902\u3951\u3951\u3943\u3953\u3941\u3901\u3952\u3943\u3941"));
    private static final Class_2080 Field_13492 = new Class_2080(Class_13490.Method_13494("\u6062\u6072\u6062\u6062\u6066\u6064\u6076\u6064\u6038\u607a\u6078\u606a\u607e\u606e\u606e\u603c\u6062\u6062\u6062\u6072\u6024\u6076\u6064\u6064"));

    public static Class_2080 Method_13493() {
        return Field_13491;
    }

    private static String Method_13494(String string) {
        int n = 10570;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_13490.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static String Method_13495(UUID uUID) {
        return Class_13490.Method_13497(uUID) ? "slim" : "default";
    }

    private static String Method_13496(String string) {
        int n = 905;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_13490.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static boolean Method_13497(UUID uUID) {
        return ((uUID.hashCode() & (16473 & 257)) == (8455 & 5281) ? 20769 & 143 : -32735 & 18756) != 0;
    }

    private void Method_13498() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public static Class_2080 Method_13499(UUID uUID) {
        return Class_13490.Method_13497(uUID) ? Field_13492 : Field_13491;
    }
}

