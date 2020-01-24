/*
 * Decompiled with CFR 0.145.
 */
import java.io.File;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_17861 {
    private static boolean Field_17862;
    private static Class_12232 Field_17863;
    private static Class_21269 Field_17864;

    public static File Method_17865(Class_23171 class_23171) {
        block3 : {
            if (Field_17862) {
                try {
                    return class_23171.Field_23172;
                }
                catch (IllegalAccessError illegalAccessError) {
                    Field_17862 = 8197 & 1160;
                    if (Field_17863.Method_12237()) break block3;
                    throw illegalAccessError;
                }
            }
        }
        return (File)Class_14610.Method_14656(class_23171, Field_17863);
    }

    private void Method_17866() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    static {
        Field_17864 = new Class_21269(Class_23171.class);
        Field_17863 = new Class_12232(Field_17864, Class_17861.Method_17867("\u1384\u1391\u1387\u1393\u1381\u1384\u1397\u1393\u1384\u1395\u1397\u1397\u1390\u1395\u1392\u1393"));
        Field_17862 = -32595 & 2051;
    }

    private static String Method_17867(String string) {
        int n = 15009;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_17861.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }
}

