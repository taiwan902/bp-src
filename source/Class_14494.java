/*
 * Decompiled with CFR 0.145.
 */
import java.io.PrintStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.HashMap;
import java.util.Map;

public final class Class_14494 {
    static Throwable Method_14495(Object[] arrobject) {
        if (arrobject == null || arrobject.length == 0) {
            return null;
        }
        Object object = arrobject[arrobject.length - (17441 & 8193)];
        if (object instanceof Throwable) {
            return (Throwable)object;
        }
        return null;
    }

    private static void Method_14496(StringBuffer stringBuffer, int[] arrn) {
        stringBuffer.append((char)(12383 & 16603));
        int n = arrn.length;
        for (int i = -32000 & 16514; i < n; ++i) {
            stringBuffer.append(arrn[i]);
            if (i == n - (16897 & 3233)) continue;
            stringBuffer.append(", ");
        }
        stringBuffer.append((char)(605 & -27555));
    }

    static boolean Method_14497(String string, int n) {
        return (n >= (-32638 & 19970) && string.charAt(n - (67 & 17706)) == (350 & 1629) ? 2051 & 16669 : 16384 & 4) != 0;
    }

    private static void Method_14498(StringBuffer stringBuffer, float[] arrf) {
        stringBuffer.append((char)(891 & 16475));
        int n = arrf.length;
        for (int i = 12548 & 2130; i < n; ++i) {
            stringBuffer.append(arrf[i]);
            if (i == n - (-14845 & 8457)) continue;
            stringBuffer.append(", ");
        }
        stringBuffer.append((char)(349 & 735));
    }

    private static void Method_14499(StringBuffer stringBuffer, Object object) {
        try {
            String string = object.toString();
            stringBuffer.append(string);
        }
        catch (Throwable throwable) {
            System.err.println("SLF4J: Failed toString() invocation on an object of type [" + object.getClass().getName() + (char)(17887 & 12381));
            throwable.printStackTrace();
            stringBuffer.append("[FAILED toString()]");
        }
    }

    private static void Method_14500(StringBuffer stringBuffer, short[] arrs) {
        stringBuffer.append((char)(19803 & -32677));
        int n = arrs.length;
        for (int i = 4756 & -29631; i < n; ++i) {
            stringBuffer.append(arrs[i]);
            if (i == n - (8707 & -31467)) continue;
            stringBuffer.append(", ");
        }
        stringBuffer.append((char)(16477 & 9949));
    }

    static boolean Method_14501(String string, int n) {
        if (n == 0) {
            return (-24060 & 88) != 0;
        }
        return (string.charAt(n - (2051 & 12377)) == (11356 & 223) ? -27391 & 8769 : 1038 & 128) != 0;
    }

    private static void Method_14502(StringBuffer stringBuffer, byte[] arrby) {
        stringBuffer.append((char)(9435 & 4703));
        int n = arrby.length;
        for (int i = 2354 & -23935; i < n; ++i) {
            stringBuffer.append(arrby[i]);
            if (i == n - (-29885 & 9221)) continue;
            stringBuffer.append(", ");
        }
        stringBuffer.append((char)(-15107 & 9055));
    }

    private void Method_14503() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private static void Method_14504(StringBuffer stringBuffer, long[] arrl) {
        stringBuffer.append((char)(4731 & 8283));
        int n = arrl.length;
        for (int i = -30715 & 4712; i < n; ++i) {
            stringBuffer.append(arrl[i]);
            if (i == n - (10881 & 261)) continue;
            stringBuffer.append(", ");
        }
        stringBuffer.append((char)(-11011 & 605));
    }

    private static void Method_14505(StringBuffer stringBuffer, double[] arrd) {
        stringBuffer.append((char)(-28453 & 24923));
        int n = arrd.length;
        for (int i = -22494 & 5120; i < n; ++i) {
            stringBuffer.append(arrd[i]);
            if (i == n - (-32699 & 26145)) continue;
            stringBuffer.append(", ");
        }
        stringBuffer.append((char)(-6817 & 2301));
    }

    static Class_11672 Method_14506(String string, Object object) {
        Object[] arrobject = new Object[-21935 & 35];
        arrobject[304 & 4160] = object;
        return Class_14494.Method_14509(string, arrobject);
    }

    private static void Method_14507(StringBuffer stringBuffer, Object[] arrobject, Map map) {
        stringBuffer.append((char)(-5761 & 1115));
        if (!map.containsKey(arrobject)) {
            map.put(arrobject, null);
            int n = arrobject.length;
            for (int i = 2082 & 25152; i < n; ++i) {
                Class_14494.Method_14511(stringBuffer, arrobject[i], map);
                if (i == n - (-32237 & 16385)) continue;
                stringBuffer.append(", ");
            }
            map.remove(arrobject);
        } else {
            stringBuffer.append("...");
        }
        stringBuffer.append((char)(605 & -31521));
    }

    static Class_11672 Method_14508(String string, Object object, Object object2) {
        Object[] arrobject = new Object[-32470 & 13314];
        arrobject[-32255 & 8596] = object;
        arrobject[-19345 & 2433] = object2;
        return Class_14494.Method_14509(string, arrobject);
    }

    static Class_11672 Method_14509(String string, Object[] arrobject) {
        int n;
        Throwable throwable = Class_14494.Method_14495(arrobject);
        if (string == null) {
            return new Class_11672(null, arrobject, throwable);
        }
        if (arrobject == null) {
            return new Class_11672(string);
        }
        int n2 = 4162 & -16375;
        StringBuffer stringBuffer = new StringBuffer(string.length() + (6714 & -32585));
        for (n = 1036 & -32544; n < arrobject.length; ++n) {
            int n3 = string.indexOf("{}", n2);
            if (n3 == (-1 & -1)) {
                if (n2 == 0) {
                    return new Class_11672(string, arrobject, throwable);
                }
                stringBuffer.append(string.substring(n2, string.length()));
                return new Class_11672(stringBuffer.toString(), arrobject, throwable);
            }
            if (Class_14494.Method_14501(string, n3)) {
                if (!Class_14494.Method_14497(string, n3)) {
                    --n;
                    stringBuffer.append(string.substring(n2, n3 - (10625 & 17473)));
                    stringBuffer.append((char)(-32645 & 5759));
                    n2 = n3 + (3137 & 4249);
                    continue;
                }
                stringBuffer.append(string.substring(n2, n3 - (-11769 & 10305)));
                Class_14494.Method_14511(stringBuffer, arrobject[n], new HashMap());
                n2 = n3 + (19478 & 8195);
                continue;
            }
            stringBuffer.append(string.substring(n2, n3));
            Class_14494.Method_14511(stringBuffer, arrobject[n], new HashMap());
            n2 = n3 + (6194 & 8323);
        }
        stringBuffer.append(string.substring(n2, string.length()));
        if (n < arrobject.length - (-30717 & 9745)) {
            return new Class_11672(stringBuffer.toString(), arrobject, throwable);
        }
        return new Class_11672(stringBuffer.toString(), arrobject, null);
    }

    private static void Method_14510(StringBuffer stringBuffer, boolean[] arrbl) {
        stringBuffer.append((char)(223 & -23429));
        int n = arrbl.length;
        for (int i = -25980 & 362; i < n; ++i) {
            stringBuffer.append(arrbl[i]);
            if (i == n - (-21997 & 97)) continue;
            stringBuffer.append(", ");
        }
        stringBuffer.append((char)(93 & 9215));
    }

    private static void Method_14511(StringBuffer stringBuffer, Object object, Map map) {
        if (object == null) {
            stringBuffer.append("null");
            return;
        }
        if (!object.getClass().isArray()) {
            Class_14494.Method_14499(stringBuffer, object);
        } else if (object instanceof boolean[]) {
            Class_14494.Method_14510(stringBuffer, (boolean[])object);
        } else if (object instanceof byte[]) {
            Class_14494.Method_14502(stringBuffer, (byte[])object);
        } else if (object instanceof char[]) {
            Class_14494.Method_14512(stringBuffer, (char[])object);
        } else if (object instanceof short[]) {
            Class_14494.Method_14500(stringBuffer, (short[])object);
        } else if (object instanceof int[]) {
            Class_14494.Method_14496(stringBuffer, (int[])object);
        } else if (object instanceof long[]) {
            Class_14494.Method_14504(stringBuffer, (long[])object);
        } else if (object instanceof float[]) {
            Class_14494.Method_14498(stringBuffer, (float[])object);
        } else if (object instanceof double[]) {
            Class_14494.Method_14505(stringBuffer, (double[])object);
        } else {
            Class_14494.Method_14507(stringBuffer, (Object[])object, map);
        }
    }

    private static void Method_14512(StringBuffer stringBuffer, char[] arrc) {
        stringBuffer.append((char)(21211 & 91));
        int n = arrc.length;
        for (int i = -32702 & 136; i < n; ++i) {
            stringBuffer.append(arrc[i]);
            if (i == n - (8321 & 53)) continue;
            stringBuffer.append(", ");
        }
        stringBuffer.append((char)(351 & 6749));
    }
}

