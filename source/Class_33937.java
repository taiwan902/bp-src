/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class Class_33937
extends Class_24555 {
    public static Map Field_33938 = new ConcurrentHashMap();

    private static String Method_33939(String string) {
        int n = 21867;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_33937.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_33940(Class_10954 class_10954) {
        this.Method_33942((Class_19025)class_10954);
    }

    public void Method_33941(Class_29900 class_29900) {
        new Class_30877(new RuntimeException(Class_33937.Method_33943("\u0d66\u0d67\u0d60\u0d23\u0d62\u0d63\u0d64\u0d67\u0d6e\u0d2b\u0d6a\u0d6b\u0d6c\u0d6f\u0d6a\u0d6b\u0d72\u0d33\u0d72\u0d77")));
    }

    public void Method_33942(Class_19025 class_19025) {
        class_19025.Method_19068(this);
    }

    private static String Method_33943(String string) {
        int n = 18536;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_33937.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_33944(Class_29900 class_29900) {
        int n = class_29900.Method_29914();
        while (n-- > 0) {
            UUID uUID = class_29900.Method_30011();
            HashMap<Class_7038, String> hashMap = new HashMap<Class_7038, String>();
            byte by = class_29900.Method_29944();
            int n2 = 1168 & 24866;
            while (n2 < by) {
                String string = class_29900.Method_29991(32767 & 32767);
                String string2 = class_29900.Method_29991(32767 & 32767);
                if (!string2.isEmpty()) {
                    Class_7038 class_7038 = Class_7038.Method_7051(string);
                    hashMap.put(class_7038, string2);
                }
                n2 = (byte)(n2 + (6401 & 9345));
            }
            if (by == 0) {
                Field_33938.remove(uUID);
                continue;
            }
            Field_33938.put(uUID, hashMap);
        }
    }

    private void Method_33945() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, Class_33937.Method_33939("+ \b#\u000e\u0006\u000e\f\u0000\b(\b\r\u0004"));
    }
}

