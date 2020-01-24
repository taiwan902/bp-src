/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_35556 {
    public static boolean Method_35557(String string, String[] arrstring) {
        if (string == null) {
            return (17539 & 4356) != 0;
        }
        if (arrstring == null) {
            return (2630 & 9504) != 0;
        }
        for (int i = 11 & -5824; i < arrstring.length; ++i) {
            String string2 = arrstring[i];
            if (!string.startsWith(string2)) continue;
            return (-32735 & 2249) != 0;
        }
        return (161 & 9744) != 0;
    }

    public static String Method_35558(String string, String[] arrstring) {
        if (string != null && arrstring != null) {
            String string2;
            int n = string.length();
            for (int i = 0 & 20685; i < arrstring.length && (string = Class_35556.Method_35565(string, string2 = arrstring[i])).length() == n; ++i) {
            }
            return string;
        }
        return string;
    }

    public static String Method_35559(String string, String[] arrstring) {
        if (string != null && arrstring != null) {
            String string2;
            int n = string.length();
            for (int i = 8448 & -28440; i < arrstring.length && (string = Class_35556.Method_35566(string, string2 = arrstring[i])).length() == n; ++i) {
            }
            return string;
        }
        return string;
    }

    public static String Method_35560(String string, String string2, String string3) {
        String[] arrstring = new String[-24485 & 16773];
        arrstring[11796 & -11958] = string2;
        String[] arrstring2 = new String[45 & 22787];
        arrstring2[-30515 & 530] = string3;
        return Class_35556.Method_35562(string, arrstring, arrstring2);
    }

    public static boolean Method_35561(String string, String[] arrstring) {
        if (string == null) {
            return (25793 & -30448) != 0;
        }
        if (arrstring == null) {
            return (132 & 11089) != 0;
        }
        for (int i = 24976 & 2113; i < arrstring.length; ++i) {
            String string2 = arrstring[i];
            if (!string.endsWith(string2)) continue;
            return (-20463 & 1507) != 0;
        }
        return (5220 & 18) != 0;
    }

    public static String Method_35562(String string, String[] arrstring, String[] arrstring2) {
        string = Class_35556.Method_35559(string, arrstring);
        string = Class_35556.Method_35558(string, arrstring2);
        return string;
    }

    private void Method_35563() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public static String Method_35564(String string, String string2, String string3) {
        if (string != null && string2 != null && string3 != null) {
            int n = string.indexOf(string2);
            if (n < 0) {
                return null;
            }
            int n2 = string.indexOf(string3, n);
            return n2 < 0 ? null : string.substring(n, n2 + string3.length());
        }
        return null;
    }

    public static String Method_35565(String string, String string2) {
        if (string != null && string2 != null) {
            if (string.endsWith(string2)) {
                string = string.substring(-32752 & 132, string.length() - string2.length());
            }
            return string;
        }
        return string;
    }

    public static String Method_35566(String string, String string2) {
        if (string != null && string2 != null) {
            if (string.startsWith(string2)) {
                string = string.substring(string2.length());
            }
            return string;
        }
        return string;
    }
}

