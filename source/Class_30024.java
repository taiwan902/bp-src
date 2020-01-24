/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public abstract class Class_30024
extends Class_21175 {
    private final Class_22999 Field_30025;

    protected abstract void Method_30026(Class_22999 var1);

    protected Class_30024(Class_22999 class_22999) {
        if (class_22999 == null) {
            throw new NullPointerException("handle");
        }
        this.Field_30025 = class_22999;
    }

    private void Method_30027() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    final void Method_30028() {
        super.Method_21182();
        this.Method_30026(this.Field_30025);
    }
}

