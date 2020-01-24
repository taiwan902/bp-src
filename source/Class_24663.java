/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_24663
implements Class_1486 {
    private int Field_24664;
    private Class_4751 Field_24665;
    private Class_1699 Field_24666;

    public int Method_24667() {
        return this.Field_24664;
    }

    private void Method_24668() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_4751 Method_24669() {
        return this.Field_24665;
    }

    public void Method_24670(Class_29900 class_29900) {
        this.Field_24665 = class_29900.Method_29910();
        this.Field_24664 = class_29900.Method_30016();
        this.Field_24666 = class_29900.Method_29970();
    }

    public void Method_24671(Class_29900 class_29900) {
        class_29900.Method_29996(this.Field_24665);
        class_29900.Method_29949((byte)this.Field_24664);
        class_29900.Method_29976(this.Field_24666);
    }

    public void Method_24672(Class_10954 class_10954) {
        this.Method_24673((Class_14856)class_10954);
    }

    public Class_24663(Class_4751 class_4751, int n, Class_1699 class_1699) {
        this.Field_24665 = class_4751;
        this.Field_24664 = n;
        this.Field_24666 = class_1699;
    }

    public void Method_24673(Class_14856 class_14856) {
        class_14856.Method_14882(this);
    }

    public Class_1699 Method_24674() {
        return this.Field_24666;
    }

    public Class_24663() {
    }
}

