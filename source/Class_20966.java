/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_20966
implements Class_14485 {
    private final Class_2457 Field_20967;
    private boolean Field_20968;
    private final Class_44584 Field_20969;
    private static final Class_1782 Field_20970 = new Class_2840(Class_20966.Method_20971("\u2403\u2401\u2411\u2401\u2401\u2402\u2410\u2403\u2419\u2408\u2409\u2418\u240b\u2409\u2418\u2419\u2401\u2412\u2400\u2403\u2401\u2400\u2402\u2401\u2408\u2408\u240a\u2409\u2408\u2408\u2408\u240b"));

    private static String Method_20971(String string) {
        int n = 1018;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_20966.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_20972(Class_34758 class_34758) {
        if (this.Field_20968) {
            this.Field_20969.Method_44622(Field_20970);
        } else {
            this.Field_20968 = -32123 & 25603;
            this.Field_20969.Method_44629(new Class_32003(this.Field_20967.Method_2595()));
        }
    }

    public void Method_20973(Class_30378 class_30378) {
        this.Field_20969.Method_44629(new Class_39383(class_30378.Method_30381()));
        this.Field_20969.Method_44622(Field_20970);
    }

    private void Method_20974() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_20975(Class_1782 class_1782) {
    }

    public Class_20966(Class_2457 class_2457, Class_44584 class_44584) {
        this.Field_20967 = class_2457;
        this.Field_20969 = class_44584;
    }
}

