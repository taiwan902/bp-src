/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_41448
extends Class_40019 {
    private static final Class_2080 Field_41449 = new Class_2080(Class_41448.Method_41459("\u1080\u1081\u1082\u1082\u1081\u1080\u1083\u1083\u10c9\u1089\u108a\u108a\u1089\u1088\u108b\u10cb\u1091\u1091\u1092\u10d3\u1090\u1090\u1093\u1093\u1099\u10d8\u109a\u109a\u1099"));
    private static final Class_2080 Field_41450;
    private static final Class_2080 Field_41451;
    private static final Class_2080 Field_41452;

    public Class_41448(Class_8491 class_8491, Class_33781 class_33781, float f) {
        super(class_8491, class_33781, f);
    }

    protected Class_2080 Method_41453(Class_1061 class_1061) {
        return this.Method_41455((Class_47883)class_1061);
    }

    static {
        Field_41452 = new Class_2080(Class_41448.Method_41454("\u5080\u5091\u5082\u5082\u5085\u5086\u5097\u5085\u5093\u5091\u5090\u5082\u5095\u5084\u5087\u5095\u5083\u5081\u5092\u5081\u5087\u5087\u5087\u5086\u5083\u5090\u5080\u5092\u5086\u5087"));
        Field_41451 = new Class_2080(Class_41448.Method_41457("\u8466\u8467\u8460\u8465\u8462\u8465\u8460\u8467\u842c\u846f\u846e\u846d\u846e\u846b\u846c\u842b\u8460\u8463\u8464\u8427\u8464\u8463\u8460\u8423\u846a\u846d\u846e"));
        Field_41450 = new Class_2080(Class_41448.Method_41460("\u2109\u2108\u2103\u210b\u210c\u210d\u210e\u210e\u2148\u2100\u210b\u2103\u210c\u2105\u210e\u214e\u2108\u2108\u210b\u2142\u210c\u2104\u210e\u2106\u2100\u2100\u2102\u214b\u2105\u210d\u2106"));
    }

    private static String Method_41454(String string) {
        int n = 29597;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_41448.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    protected Class_2080 Method_41455(Class_47883 class_47883) {
        switch (class_47883.Method_47910()) {
            default: {
                return Field_41452;
            }
            case 1: {
                return Field_41449;
            }
            case 2: {
                return Field_41451;
            }
            case 3: 
        }
        return Field_41450;
    }

    protected void Method_41456(Class_859 class_859, float f) {
        this.Method_41461((Class_47883)class_859, f);
    }

    private static String Method_41457(String string) {
        int n = 23595;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_41448.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_41458() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private static String Method_41459(String string) {
        int n = 14196;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_41448.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_41460(String string) {
        int n = 5297;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_41448.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    protected void Method_41461(Class_47883 class_47883, float f) {
        super.\u0000strictfp((Class_859)class_47883, f);
        if (class_47883.\u0000= +()) {
            Class_16867.Method_16973(7.4166665f * 0.10786517f, 0.45901638f * 1.7428572f, 0.45373136f * 1.7631578f);
        }
    }
}

