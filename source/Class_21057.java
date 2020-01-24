/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Iterator;

public class Class_21057
implements Iterator {
    final Class_32499 Field_21058;
    final Class_27450 Field_21059;

    public boolean Method_21060() {
        return this.Field_21058.Method_32508();
    }

    public Object Method_21061() {
        return this.Method_21063();
    }

    private void Method_21062() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Long Method_21063() {
        this.Field_21058.Method_32510();
        return this.Field_21058.Field_32507;
    }

    public Class_21057(Class_27450 class_27450) {
        this.Field_21059 = class_27450;
        this.Field_21058 = new Class_32499(class_27450);
    }

    public void Method_21064() {
        this.Field_21058.Method_32509();
    }
}

