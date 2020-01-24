/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.UUID;

public class Class_24135
implements Class_1486 {
    private UUID Field_24136;
    private int Field_24137;

    public void Method_24138(Class_29900 class_29900) {
        new Class_30877(new RuntimeException(Class_24135.Method_24143("\ua850\ua840\ua850\ua801\ua844\ua854\ua844\ua844\ua841\ua801\ua850\ua840\ua845\ua844\ua845\ua855\ua851\ua801\ua850\ua841")));
    }

    private void Method_24139() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, Class_24135.Method_24144("\u7020\u7020\u7003\u7023\u7001\u7000\u7003\u7002\u7009\u7008\u702b\u700a\u7008\u7008"));
    }

    public void Method_24140(Class_10954 class_10954) {
        this.Method_24142((Class_19025)class_10954);
    }

    public void Method_24141(Class_29900 class_29900) {
        class_29900.Method_29982(this.Field_24137);
        class_29900.Method_29957(this.Field_24136.getMostSignificantBits());
        class_29900.Method_29957(this.Field_24136.getLeastSignificantBits());
    }

    public Class_24135(int n, UUID uUID) {
        this.Field_24137 = n;
        this.Field_24136 = uUID;
    }

    public void Method_24142(Class_19025 class_19025) {
        new Class_30877(new RuntimeException(Class_24135.Method_24145("\u2084\u2095\u2080\u2091\u2090\u2081\u2094\u2095\u2094\u2091\u2080\u2091\u2094\u2095\u2090\u2081\u2080\u2091\u2080\u2095")));
    }

    private static String Method_24143(String string) {
        int n = 12792;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_24135.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_24144(String string) {
        int n = 3864;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_24135.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_24145(String string) {
        int n = 8699;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_24135.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_24135() {
    }
}

