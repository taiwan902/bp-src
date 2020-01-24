/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_43755 {
    public static final Class_43755 Field_43756;
    public static final Class_43755[] Field_43757;
    private boolean Field_43758;
    public static final Class_43755 Field_43759;
    public static final Class_43755 Field_43760;
    private boolean Field_43761;
    public static final Class_43755 Field_43762;
    private boolean Field_43763;
    public static final Class_43755 Field_43764;
    public static final Class_43755 Field_43765;
    private final int Field_43766;
    private final int Field_43767;
    private final String Field_43768;
    public static final Class_43755 Field_43769;

    public boolean Method_43770() {
        return this.Field_43758;
    }

    private static String Method_43771(String string) {
        int n = 31713;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_43755.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private Class_43755(int n, String string, int n2) {
        this.Field_43768 = string;
        this.Field_43766 = n2;
        this.Field_43761 = 21059 & -24303;
        this.Field_43767 = n;
        Class_43755.Field_43757[n] = this;
    }

    private static String Method_43772(String string) {
        int n = 3506;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_43755.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_43773() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private Class_43755 Method_43774() {
        this.Field_43763 = 26669 & -27327;
        return this;
    }

    private static String Method_43775(String string) {
        int n = 25592;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_43755.class, 7);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public String Method_43776() {
        return this.Method_43777() + ".info";
    }

    public String Method_43777() {
        return "generator." + this.Field_43768;
    }

    public boolean Method_43778() {
        return this.Field_43763;
    }

    private static String Method_43779(String string) {
        int n = 27221;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_43755.class, 6);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private Class_43755 Method_43780(boolean bl) {
        this.Field_43761 = bl;
        return this;
    }

    private static String Method_43781(String string) {
        int n = 19998;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_43755.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_43755 Method_43782(int n) {
        return this == Field_43765 && n == 0 ? Field_43759 : this;
    }

    private static String Method_43783(String string) {
        int n = 4686;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_43755.class, 5);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static Class_43755 Method_43784(String string) {
        for (int i = 21008 & -32730; i < Field_43757.length; ++i) {
            if (Field_43757[i] == null || !Class_43755.Field_43757[i].Field_43768.equalsIgnoreCase(string)) continue;
            return Field_43757[i];
        }
        return null;
    }

    public String Method_43785() {
        return this.Field_43768;
    }

    public int Method_43786() {
        return this.Field_43766;
    }

    private Class_43755 Method_43787() {
        this.Field_43758 = 2337 & 8197;
        return this;
    }

    private static String Method_43788(String string) {
        int n = 4088;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_43755.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private Class_43755(int n, String string) {
        this(n, string, 53 & 9474);
    }

    static {
        Field_43757 = new Class_43755[49 & 730];
        Field_43765 = new Class_43755(523 & 8244, Class_43755.Method_43781("\u0100\u0101\u0102\u0103\u0114\u0105\u0116"), 1317 & -32255).Method_43787();
        Field_43769 = new Class_43755(2253 & -19423, Class_43755.Method_43772("\ud001\ud000\ud004\ud000"));
        Field_43764 = new Class_43755(20611 & 8302, Class_43755.Method_43788("\u0204\u0208\u0208\u020c\u020c\u0228\u0200\u0204\u020c\u0204\u0200"));
        Field_43762 = new Class_43755(-28541 & 331, Class_43755.Method_43771("\u5820\u5824\u5830\u5824\u5824\u5820\u5824\u5820\u582c")).Method_43774();
        Field_43760 = new Class_43755(-30716 & 5126, Class_43755.Method_43783("\u2093\u2081\u2081\u2082\u209b\u2099\u209b\u2088\u2091\u2090"));
        Field_43756 = new Class_43755(519 & 9341, Class_43755.Method_43779("\u2484\u2485\u2480\u2495\u2485\u249d\u2481\u248c\u248c\u249d\u2480\u248c\u248d\u2481\u2489\u249d\u2481\u2484\u2491\u2484\u2495\u2481"));
        Field_43759 = new Class_43755(14570 & -32755, Class_43755.Method_43775("\ua6a0\ua6a1\ua6a0\ua6a7\ua6b1\ua6a8\ua6b2\ua699\ua6b5\ua69b\ua6b7"), 16940 & 1024).Method_43780((-27588 & 320) != 0);
    }

    public int Method_43789() {
        return this.Field_43767;
    }

    public boolean Method_43790() {
        return this.Field_43761;
    }
}

