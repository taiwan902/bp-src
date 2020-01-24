/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public final class Class_17650
extends Enum {
    public static final /* enum */ Class_17650 Field_17651;
    private static final Class_17650[] Field_17652;
    private static final Class_17650[] Field_17653;
    public static final /* enum */ Class_17650 Field_17654;
    public static final /* enum */ Class_17650 Field_17655;

    private static String Method_17656(String string) {
        int n = 13134;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_17650.class, 6);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_17657(String string) {
        int n = 29193;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_17650.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_17658(String string) {
        int n = 11963;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_17650.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_17659(String string) {
        int n = 129;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_17650.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_17660() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private static String Method_17661(String string) {
        int n = 27743;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_17650.class, 5);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static Class_17650[] Method_17662() {
        return (Class_17650[])Field_17652.clone();
    }

    private static String Method_17663(String string) {
        int n = 7824;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_17650.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static Class_17650 Method_17664(String string) {
        return Enum.valueOf(Class_17650.class, string);
    }

    static {
        Field_17654 = new Class_17650(Class_17650.Method_17657("\u80c2\u80c3\u80c0\u80c0\u80c3\u80c2\u80c2\u80c1\u80c1"), 12288 & 3121, Class_17650.Method_17663("\u80c8\u80c9\u80d8\u80c1\u80d0\u80c9\u80d0\u80c9\u80c0"), -27982 & 24581);
        Field_17651 = new Class_17650(Class_17650.Method_17659("\u0843\u0844\u0847\u0841\u0843\u0840"), 12329 & 17041, Class_17650.Method_17658("\u0440\u0441\u0442\u0443\u0440\u0441"), -32251 & 1049);
        Field_17655 = new Class_17650(Class_17650.Method_17661("\u2844\u2840\u2840\u2848\u2848\u284c\u284c\u2848"), 21522 & -32246, Class_17650.Method_17656("\u0504\u0502\u0502\u050a\u0508\u050c\u050c\u050a"), -29038 & 12358);
        Class_17650[] arrclass_17650 = new Class_17650[16723 & 11];
        arrclass_17650[-31231 & 2122] = Field_17654;
        arrclass_17650[-15343 & 129] = Field_17651;
        arrclass_17650[25346 & 2146] = Field_17655;
        Field_17652 = arrclass_17650;
        Class_17650[] arrclass_176502 = new Class_17650[-16357 & 14471];
        arrclass_176502[10066 & -16220] = Field_17654;
        arrclass_176502[2097 & 323] = Field_17651;
        arrclass_176502[13235 & -31670] = Field_17655;
        Field_17653 = arrclass_176502;
    }
}

