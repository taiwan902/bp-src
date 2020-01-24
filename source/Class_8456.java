/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.Callable;

public class Class_8456
implements Callable {
    final Class_570 Field_8457;

    Class_8456(Class_570 class_570) {
        this.Field_8457 = class_570;
    }

    private void Method_8458() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public String Method_8459() {
        return Class_570.Method_596(this.Field_8457).size() + " total; " + Class_570.Method_596(this.Field_8457).toString();
    }

    public Object Method_8460() {
        return this.Method_8459();
    }
}

