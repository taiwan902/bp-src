/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Maps;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Map;

public class Class_42301
extends Class_40019 {
    private static final Class_2080 Field_42302;
    private static final Class_2080 Field_42303;
    private static final Class_2080 Field_42304;
    private static final Class_2080 Field_42305;
    private static final Map Field_42306;
    private static final Class_2080 Field_42307;

    protected void Method_42308(Class_46199 class_46199, float f) {
        float f2 = 1.0f;
        int n = class_46199.Method_46286();
        if (n == (21009 & 3393)) {
            f2 *= 0.25454545f * 3.4178572f;
        } else if (n == (-12266 & 9219)) {
            f2 *= 0.8218667f * 1.119403f;
        }
        Class_16867.Method_16973(f2, f2, f2);
        super.\u0000strictfp((Class_859)class_46199, f);
    }

    private static String Method_42309(String string) {
        int n = 26766;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_42301.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_42310(String string) {
        int n = 29507;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_42301.class, 5);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_42311() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private static String Method_42312(String string) {
        int n = 27206;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_42301.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_42301(Class_8491 class_8491, Class_40710 class_40710, float f) {
        super(class_8491, class_40710, f);
    }

    static {
        Field_42306 = Maps.newHashMap();
        Field_42302 = new Class_2080(Class_42301.Method_42316("\u1018\u1008\u1012\u101a\u101c\u101c\u100e\u101e\u1008\u1000\u100a\u1012\u100c\u1014\u101e\u100e\u1010\u1010\u100a\u100a\u101c\u1014\u1016\u1016\u1000\u1000\u1012\u102a\u1004\u101c\u101e\u1006\u1008\u1000\u101a\u1002\u100c"));
        Field_42305 = new Class_2080(Class_42301.Method_42312("\u8328\u8328\u8324\u8329\u8329\u832f\u8329\u832e\u8363\u8328\u8322\u8329\u8325\u8329\u8325\u8362\u8324\u8322\u832e\u832e\u8329\u8362\u8321\u8328\u8320\u8328\u8362\u832d\u8322\u832a"));
        Field_42304 = new Class_2080(Class_42301.Method_42314("\u9903\u9912\u9903\u9903\u9902\u9901\u9912\u9900\u9950\u9912\u9911\u9903\u9912\u9903\u9902\u9950\u9913\u9910\u9901\u9900\u9912\u9950\u9913\u9910\u9911\u9910\u9912\u9902\u9951\u9903\u9911\u9910"));
        Field_42307 = new Class_2080(Class_42301.Method_42309("$%\"' %\"',-./,).+ %\"# !&#().\u000f,)*/\u0000\u0005\u0006\u0003\u0000\u0001"));
        Field_42303 = new Class_2080(Class_42301.Method_42310("\u5018\u5008\u5010\u5019\u5019\u5019\u5009\u5018\u5049\u5000\u5008\u5011\u5009\u5011\u5019\u5048\u5000\u5000\u5018\u5018\u5009\u5040\u5000\u5000\u5010\u5010\u5001\u5038\u5011\u5008\u5001\u5009\u5009\u5019\u5001\u5001\u5040\u5019\u5000\u5008"));
    }

    protected Class_2080 Method_42313(Class_46199 class_46199) {
        if (!class_46199.Method_46342()) {
            switch (class_46199.Method_46286()) {
                default: {
                    return Field_42302;
                }
                case 1: {
                    return Field_42304;
                }
                case 2: {
                    return Field_42305;
                }
                case 3: {
                    return Field_42307;
                }
                case 4: 
            }
            return Field_42303;
        }
        return this.Method_42315(class_46199);
    }

    private static String Method_42314(String string) {
        int n = 10130;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_42301.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private Class_2080 Method_42315(Class_46199 class_46199) {
        String string = class_46199.Method_46295();
        if (!class_46199.Method_46310()) {
            return null;
        }
        Class_2080 class_2080 = (Class_2080)Field_42306.get(string);
        if (class_2080 == null) {
            class_2080 = new Class_2080(string);
            Class_18.Field_89.Method_253().Method_34704(class_2080, new Class_32754(class_46199.Method_46350()));
            Field_42306.put(string, class_2080);
        }
        return class_2080;
    }

    private static String Method_42316(String string) {
        int n = 26686;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_42301.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    protected Class_2080 Method_42317(Class_1061 class_1061) {
        return this.Method_42313((Class_46199)class_1061);
    }

    protected void Method_42318(Class_859 class_859, float f) {
        this.Method_42308((Class_46199)class_859, f);
    }
}

