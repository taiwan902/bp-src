/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

public class Class_16725
implements Comparable {
    public static final Class_16725 Field_16726;
    public static final Class_16725 Field_16727;
    public static final Class_16725 Field_16728;
    public static final Class_16725 Field_16729;
    public static final Class_16725 Field_16730;
    public static final Class_16725 Field_16731;
    private static final Map Field_16732;
    private final byte[] Field_16733;
    public static final Class_16725 Field_16734;
    public static final Class_16725 Field_16735;
    public static final Class_16725 Field_16736;
    private final String Field_16737;

    public int Method_16738(Class_16725 class_16725) {
        return this.Method_16749().compareTo(class_16725.Method_16749());
    }

    void Method_16739(Class_22553 class_22553) {
        if (this.Field_16733 == null) {
            Class_17103.Method_17124(this.Field_16737, class_22553);
        } else {
            class_22553.Method_22610(this.Field_16733);
        }
    }

    private static String Method_16740(String string) {
        int n = 10633;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_16725.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public int Method_16741() {
        return this.Method_16749().hashCode();
    }

    private static String Method_16742(String string) {
        int n = 3079;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_16725.class, 8);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_16743(String string) {
        int n = 17674;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_16725.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public boolean Method_16744(Object object) {
        if (!(object instanceof Class_16725)) {
            return (739 & 8196) != 0;
        }
        Class_16725 class_16725 = (Class_16725)object;
        return this.Method_16749().equals(class_16725.Method_16749());
    }

    public String Method_16745() {
        return this.Method_16749();
    }

    private static String Method_16746(String string) {
        int n = 19853;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_16725.class, 5);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public int Method_16747(Object object) {
        return this.Method_16738((Class_16725)object);
    }

    private static String Method_16748(String string) {
        int n = 29496;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_16725.class, 7);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public String Method_16749() {
        return this.Field_16737;
    }

    private void Method_16750() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private static String Method_16751(String string) {
        int n = 6375;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_16725.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_16752(String string) {
        int n = 30083;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_16725.class, 6);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    static {
        Field_16735 = new Class_16725(Class_16725.Method_16751("\u0000\u0012\u0012\u0002\u0004\u0004\u0014"), (-25599 & 8253) != 0);
        Field_16730 = new Class_16725(Class_16725.Method_16753("\u8700\u8701\u8713"), (89 & 19077) != 0);
        Field_16734 = new Class_16725(Class_16725.Method_16743("FBEA"), (9 & -3211) != 0);
        Field_16736 = new Class_16725(Class_16725.Method_16740("\u0984\u0981\u0986\u0983"), (8717 & 289) != 0);
        Field_16726 = new Class_16725(Class_16725.Method_16746("\u0851\u0855\u0855"), (265 & -26911) != 0);
        Field_16731 = new Class_16725(Class_16725.Method_16752("\u9511\u9500\u9513\u9502\u9501"), (-20479 & 545) != 0);
        Field_16728 = new Class_16725(Class_16725.Method_16748("\u8402\u8402\u8400\u8400\u8402\u8402"), (227 & -30463) != 0);
        Field_16727 = new Class_16725(Class_16725.Method_16742("\u7408\u740c\u741d\u741d\u7419"), (-31615 & 8453) != 0);
        Field_16729 = new Class_16725(Class_16725.Method_16754("\u79ac\u79a0\u79a3\u79a3\u79ac\u79a8\u79bf"), (1 & 25833) != 0);
        Field_16732 = new HashMap();
        Field_16732.put(Field_16735.Method_16745(), Field_16735);
        Field_16732.put(Field_16730.Method_16745(), Field_16730);
        Field_16732.put(Field_16734.Method_16745(), Field_16734);
        Field_16732.put(Field_16736.Method_16745(), Field_16736);
        Field_16732.put(Field_16726.Method_16745(), Field_16726);
        Field_16732.put(Field_16731.Method_16745(), Field_16731);
        Field_16732.put(Field_16728.Method_16745(), Field_16728);
        Field_16732.put(Field_16727.Method_16745(), Field_16727);
        Field_16732.put(Field_16729.Method_16745(), Field_16729);
    }

    private Class_16725(String string, boolean bl) {
        if (string == null) {
            throw new NullPointerException("name");
        }
        if ((string = string.trim()).isEmpty()) {
            throw new IllegalArgumentException("empty name");
        }
        for (int i = 20738 & 1036; i < string.length(); ++i) {
            if (!Character.isISOControl(string.charAt(i)) && !Character.isWhitespace(string.charAt(i))) continue;
            throw new IllegalArgumentException("invalid character in name");
        }
        this.Field_16737 = string;
        this.Field_16733 = bl ? string.getBytes(Class_7203.Field_7204) : null;
    }

    private static String Method_16753(String string) {
        int n = 7815;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_16725.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_16754(String string) {
        int n = 10513;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_16725.class, 9);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }
}

