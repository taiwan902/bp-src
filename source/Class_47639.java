/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_47639
extends Class_47591 {
    private static final Class_2080 Field_47640 = new Class_2080(Class_47639.Method_47644("\u1020\u1030\u1026\u1023\u1025\u1023\u1037\u1020\u1033\u1030\u1030\u1023\u1031\u1025\u1023\u1034\u1037\u1026\u1023\u1023\u1025\u1035\u1025\u1025\u1023\u1036\u1025\u1022\u1024\u1024\u1036\u1024\u1032\u1033\u1026\u1031\u1037"));
    private static final Class_2080 Field_47641 = new Class_2080(Class_47639.Method_47643("\u1231\u1221\u1231\u1230\u1234\u1234\u1224\u1235\u1220\u1221\u1221\u1230\u1224\u1234\u1234\u1225\u1220\u1231\u1230\u1230\u1234\u1224\u1234\u1234\u1230\u1221\u1230\u1220\u1235\u1235\u1225\u1205\u1230\u1221\u1220\u1220\u1224\u1234\u1224\u1224\u1221\u1230\u1221\u1221"));

    private void Method_47642() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private static String Method_47643(String string) {
        int n = 15804;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_47639.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_47644(String string) {
        int n = 27092;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_47639.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_47645() {
        Class_16867.Method_16943(0.11965461f * 0.78350514f, 2.6111112f * 0.07180851f, 0.0f);
    }

    protected Class_2080 Method_47646(Class_1061 class_1061) {
        return this.Method_47647((Class_43151)class_1061);
    }

    protected Class_2080 Method_47647(Class_43151 class_43151) {
        return class_43151.Method_43168() == (9057 & -15343) ? Field_47641 : Field_47640;
    }

    protected void Method_47648(Class_859 class_859, float f) {
        this.Method_47649((Class_43151)class_859, f);
    }

    protected void Method_47649(Class_43151 class_43151, float f) {
        if (class_43151.Method_43168() == (4815 & 25617)) {
            Class_16867.Method_16973(5.2222223f * 0.22978725f, 1.8913044f * 0.6344828f, 15.0f * 0.080000006f);
        }
    }

    public Class_47639(Class_8491 class_8491) {
        super(class_8491, new Class_41367(), 1.2307693f * 0.40625f);
        this.\u0000strictfp((Class_7380)new Class_19353(this));
        this.\u0000strictfp((Class_7380)new Class_33458(this, this));
    }

    protected Class_2080 Method_47650(Class_34093 class_34093) {
        return this.Method_47647((Class_43151)class_34093);
    }
}

