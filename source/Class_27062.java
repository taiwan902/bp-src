/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.HashMap;
import java.util.Map;

public class Class_27062 {
    private static Map Field_27063;
    private static Map Field_27064;
    private static Map Field_27065;
    private static Map Field_27066;
    private static Map Field_27067;
    private static Map Field_27068;
    private static Map Field_27069;

    public static void Method_27070(String string, float f, float f2, float f3) {
        Class_27062.Method_27074(Class_27062.Method_27071(string, "x", Field_27069), f);
        Class_27062.Method_27074(Class_27062.Method_27071(string, "y", Field_27063), f2);
        Class_27062.Method_27074(Class_27062.Method_27071(string, "z", Field_27065), f3);
    }

    private static String Method_27071(String string, String string2, Map map) {
        String string3 = (String)map.get(string);
        if (string3 != null) {
            return string3;
        }
        string3 = string + "." + string2;
        map.put(string, string3);
        return string3;
    }

    public static void Method_27072(String string, int n, int n2) {
        Class_27062.Method_27076(Class_27062.Method_27071(string, "x", Field_27069), n);
        Class_27062.Method_27076(Class_27062.Method_27071(string, "y", Field_27063), n2);
    }

    public static Number Method_27073(String string) {
        return (Number)Field_27068.get(string);
    }

    public static void Method_27074(String string, float f) {
        Field_27068.put(string, Float.valueOf(f));
    }

    private void Method_27075() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public static void Method_27076(String string, int n) {
        Field_27068.put(string, n);
    }

    static {
        Field_27068 = new HashMap();
        Field_27069 = new HashMap();
        Field_27063 = new HashMap();
        Field_27065 = new HashMap();
        Field_27067 = new HashMap();
        Field_27064 = new HashMap();
        Field_27066 = new HashMap();
    }

    public static void Method_27077(String string, float f, float f2, float f3) {
        Class_27062.Method_27074(Class_27062.Method_27071(string, "r", Field_27067), f);
        Class_27062.Method_27074(Class_27062.Method_27071(string, "g", Field_27064), f2);
        Class_27062.Method_27074(Class_27062.Method_27071(string, "b", Field_27066), f3);
    }

    public static void Method_27078() {
        Field_27068.clear();
    }
}

