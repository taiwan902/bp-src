/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class Class_16591 {
    private static final Class_6113 Field_16592;
    private static boolean Field_16593;
    private static final Pattern Field_16594;
    private static boolean Field_16595;

    public static String Method_16596(String string, String string2) {
        String string3;
        block5 : {
            if (string == null) {
                throw new NullPointerException("key");
            }
            if (string.isEmpty()) {
                throw new IllegalArgumentException("key must not be empty.");
            }
            string3 = null;
            try {
                string3 = System.getSecurityManager() == null ? System.getProperty(string) : (String)AccessController.doPrivileged(new Class_22015(string));
            }
            catch (Exception exception) {
                if (Field_16595) break block5;
                Class_16591.Method_16597("Unable to retrieve a system property '" + string + "'; default values will be used.", exception);
                Field_16595 = 8545 & 521;
            }
        }
        if (string3 == null) {
            return string2;
        }
        return string3;
    }

    private static void Method_16597(String string, Exception exception) {
        if (Field_16593) {
            Field_16592.Method_6127(string, exception);
        } else {
            Logger.getLogger(Class_16591.class.getName()).log(Level.WARNING, string, exception);
        }
    }

    public static String Method_16598(String string) {
        return Class_16591.Method_16596(string, null);
    }

    public static boolean Method_16599(String string) {
        return (Class_16591.Method_16598(string) != null ? -32723 & 7041 : 16400 & 13417) != 0;
    }

    public static long Method_16600(String string, long l) {
        String string2 = Class_16591.Method_16598(string);
        if (string2 == null) {
            return l;
        }
        if (Field_16594.matcher(string2 = string2.trim().toLowerCase()).matches()) {
            try {
                return Long.parseLong(string2);
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        Class_16591.Method_16602("Unable to parse the long integer system property '" + string + "':" + string2 + " - using the default value: " + l);
        return l;
    }

    public static int Method_16601(String string, int n) {
        String string2 = Class_16591.Method_16598(string);
        if (string2 == null) {
            return n;
        }
        if (Field_16594.matcher(string2 = string2.trim().toLowerCase()).matches()) {
            try {
                return Integer.parseInt(string2);
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        Class_16591.Method_16602("Unable to parse the integer system property '" + string + "':" + string2 + " - using the default value: " + n);
        return n;
    }

    private static void Method_16602(String string) {
        if (Field_16593) {
            Field_16592.Method_6132(string);
        } else {
            Logger.getLogger(Class_16591.class.getName()).log(Level.WARNING, string);
        }
    }

    private void Method_16603() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    static {
        Field_16593 = 15 & -22592;
        Field_16592 = Class_10201.Method_10203(Class_16591.class);
        Field_16593 = -32767 & 18759;
        Field_16594 = Pattern.compile(Class_16591.Method_16605("\ua022\ua021\ua004\ua026\ua022\ua027\ua002\ua025"));
    }

    private Class_16591() {
    }

    public static boolean Method_16604(String string, boolean bl) {
        String string2 = Class_16591.Method_16598(string);
        if (string2 == null) {
            return bl;
        }
        if ((string2 = string2.trim().toLowerCase()).isEmpty()) {
            return (8289 & 5523) != 0;
        }
        if ("true".equals(string2) || "yes".equals(string2) || "1".equals(string2)) {
            return (273 & 26149) != 0;
        }
        if ("false".equals(string2) || "no".equals(string2) || "0".equals(string2)) {
            return (1608 & 10405) != 0;
        }
        Class_16591.Method_16602("Unable to parse the boolean system property '" + string + "':" + string2 + " - using the default value: " + bl);
        return bl;
    }

    private static String Method_16605(String string) {
        int n = 17163;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_16591.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }
}

