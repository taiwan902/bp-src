/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Class_33521
extends Class_24555 {
    public Map Field_33522;

    private void Method_33523() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, Class_33521.Method_33526("\u202c\u2021\u201d\u2020\u200d\u2001\u2019\u2009\u2005\u200d\u2039\u2009\u2008\u2001"));
    }

    private static String Method_33524(String string) {
        int n = 15077;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_33521.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_33525(Class_29900 class_29900) {
        this.\u0000strictfp = class_29900.Method_30011();
        this.Field_33522 = new HashMap();
        byte by = class_29900.Method_29944();
        int n = 1186 & -8184;
        while (n < by) {
            String string = class_29900.Method_29991(32767 & 32767);
            String string2 = class_29900.Method_29991(32767 & -1);
            int n2 = class_29900.Method_30004();
            try {
                this.Field_33522.put(Class_7038.Method_7051(string), new Class_26458(string2, n2));
            }
            catch (Exception exception) {
                // empty catch block
            }
            n = (byte)(n + (4121 & 11265));
        }
    }

    private static String Method_33526(String string) {
        int n = 3335;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_33521.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_33527(Class_29900 class_29900) {
        new Class_30877(new RuntimeException(Class_33521.Method_33524("\u8400\u8401\u8402\u8402\u8404\u8405\u8406\u8407\u8409\u8408\u840a\u840b\u840d\u840d\u840f\u840e\u8401\u8400\u8402\u8402")));
    }
}

