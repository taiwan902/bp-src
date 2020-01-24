/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.ThreadFactory;

public abstract class Class_31013
extends Class_30282
implements Class_18163 {
    private static final int Field_31014;
    private static final Class_6113 Field_31015;

    public Class_37082 Method_31016() {
        return this.Method_31017();
    }

    public Class_38541 Method_31017() {
        return (Class_38541)super.Method_30301();
    }

    static {
        Field_31015 = Class_10201.Method_10203(Class_31013.class);
        Field_31014 = Math.max(-31999 & 16393, Class_16591.Method_16601(Class_31013.Method_31020("\u02a4\u02a3\u02a2\u02a3\u02a6\u02a3\u02a6\u02a3\u02ea\u02ad\u02a8\u02e9\u02aa\u02a9\u02aa\u02ab\u02a4\u02e3\u02a2\u02a1\u02a0\u02a3\u02a2\u0283\u02aa\u02ab\u02ae\u028b\u02ac\u02af\u02aa\u02af\u0280\u0287"), Runtime.getRuntime().availableProcessors() * (16898 & -23401)));
        if (Field_31015.Method_6131()) {
            Field_31015.Method_6114(Class_31013.Method_31018("\u2350\u2310\u2314\u2312\u2301\u2311\u2307\u2312\u2314\u2310\u2353\u2315\u2312\u2352\u2313\u2311\u2311\u2310\u2314\u2342\u2300\u2312\u2300\u2302\u2311\u2300\u2302\u2303\u2315\u2310\u2305\u2316\u2310\u2315\u2311\u2307\u2347\u2354\u2306\u2301"), Field_31014);
        }
    }

    private static String Method_31018(String string) {
        int n = 12417;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_31013.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_27581 Method_31019(Class_26095 class_26095) {
        return this.Method_31017().register(class_26095);
    }

    protected Class_31013(int n, ThreadFactory threadFactory, Object ... arrobject) {
        super(n == 0 ? Field_31014 : n, threadFactory, arrobject);
    }

    private static String Method_31020(String string) {
        int n = 13489;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_31013.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_31021() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected ThreadFactory Method_31022() {
        return new Class_15627(this.getClass(), 20555 & 8458);
    }
}

