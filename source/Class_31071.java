/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_31071
implements Class_1486 {
    public int Field_31072;

    private static String Method_31073(String string) {
        int n = 19777;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_31071.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_31074(Class_29900 class_29900) {
        new Class_30877(new RuntimeException(Class_31071.Method_31079("\u1113\u1103\u1119\u1102\u110f\u1117\u1105\u110f\u110a\u110a\u111b\u110b\u1104\u1107\u110e\u111e\u111a\u1102\u111b\u1102")));
    }

    private void Method_31075() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, Class_31071.Method_31073("\ud821\ud82a\ud800\ud82b\ud804\ud80c\ud806\ud804\ud80a\ud802\ud820\ud800\ud807\ud80e"));
    }

    public void Method_31076(Class_10954 class_10954) {
        this.Method_31077((Class_19025)class_10954);
    }

    public void Method_31077(Class_19025 class_19025) {
        class_19025.Method_19067(this);
    }

    public void Method_31078(Class_29900 class_29900) {
        this.Field_31072 = class_29900.Method_30004();
    }

    private static String Method_31079(String string) {
        int n = 7711;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_31071.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }
}

