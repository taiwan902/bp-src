/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_45843
extends Class_43634 {
    final Class_9871 Field_45844;

    private void Method_45845() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_45843(Class_9871 class_9871, String string, boolean bl, int n) {
        this.Field_45844 = class_9871;
        super(string, bl, n);
    }

    public void Method_45846() {
        super.Method_43643();
        this.Field_45844.Method_9889(this);
    }
}

