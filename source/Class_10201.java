/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public abstract class Class_10201 {
    private static Class_10201 Field_10202 = Class_10201.Method_10208(Class_10201.class.getName());

    public static Class_6113 Method_10203(Class class_) {
        return Class_10201.Method_10205(class_.getName());
    }

    protected abstract Class_6113 Method_10204(String var1);

    public static Class_6113 Method_10205(String string) {
        return Class_10201.Method_10206().Method_10204(string);
    }

    public static Class_10201 Method_10206() {
        return Field_10202;
    }

    private void Method_10207() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private static Class_10201 Method_10208(String string) {
        Class_23677 class_23677 = new Class_23677();
        class_23677.Method_10204(string).Method_6130("Using java.util.logging as the default logging framework");
        return class_23677;
    }
}

