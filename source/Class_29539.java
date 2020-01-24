/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;

public class Class_29539
implements Class_1486 {
    public static ArrayList Field_29540 = new ArrayList();

    public void Method_29541(Class_29900 class_29900) {
        new Class_30877(new RuntimeException(Class_29539.Method_29543("\u2340\u2341\u2342\u2303\u2344\u2345\u2346\u2347\u2340\u2301\u2342\u2343\u2344\u2345\u2346\u2347\u2350\u2311\u2352\u2353")));
    }

    public void Method_29542(Class_19025 class_19025) {
        class_19025.Method_19040(this);
    }

    private static String Method_29543(String string) {
        int n = 22294;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_29539.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_29544(Class_29900 class_29900) {
        ArrayList<Class_15321> arrayList = new ArrayList<Class_15321>();
        int n = class_29900.Method_30008();
        while (n-- > 0) {
            String string = class_29900.Method_29991(32767 & 32767);
            byte by = class_29900.Method_29944();
            if (by == 0) continue;
            arrayList.add(new Class_15321(string, by));
        }
        Field_29540 = arrayList;
    }

    private void Method_29545() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, Class_29539.Method_29548("\ub000\ub003\ub032\ub001\ub024\ub025\ub034\ub027\ub022\ub023\ub012\ub023\ub026\ub027"));
    }

    public void Method_29546(Class_10954 class_10954) {
        this.Method_29542((Class_19025)class_10954);
    }

    public static boolean Method_29547(String string) {
        for (Class_15321 class_15321 : Field_29540) {
            if (!class_15321.Method_15329() || !class_15321.Method_15326(string)) continue;
            return (-24571 & 4427) != 0;
        }
        return (-14592 & 195) != 0;
    }

    private static String Method_29548(String string) {
        int n = 11887;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_29539.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }
}

