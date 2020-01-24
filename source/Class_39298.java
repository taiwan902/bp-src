/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.UUID;

public class Class_39298
extends Class_24555 {
    private String Field_39299;

    public Class_39298() {
    }

    private static String Method_39300(String string) {
        int n = 11301;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_39298.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_39301() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, Class_39298.Method_39302("\u1260\u1264\u1252\u1266\u1240\u1244\u1256\u1246\u1240\u1240\u1276\u1246\u1244\u1244"));
    }

    private static String Method_39302(String string) {
        int n = 27208;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_39298.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_39298(UUID uUID, String string) {
        this.\u0000strictfp = uUID;
        this.Field_39299 = string;
    }

    public void Method_39303(Class_29900 class_29900) {
        new Class_30877(new RuntimeException(Class_39298.Method_39300("\u0220\u0220\u0220\u0223\u0224\u0224\u0224\u0226\u0221\u0221\u0222\u0222\u0227\u0224\u0227\u0227\u0231\u0231\u0232\u0233")));
    }

    public void Method_39304(Class_29900 class_29900) {
        class_29900.Method_29949(9360 & -32748);
        class_29900.Method_29997(this.\u0000strictfp);
        class_29900.Method_29960(this.Field_39299);
    }
}

