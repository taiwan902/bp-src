/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_24570
implements Class_1486 {
    private int Field_24571;
    private short Field_24572;
    private boolean Field_24573;

    public void Method_24574(Class_14856 class_14856) {
        class_14856.Method_14867(this);
    }

    private void Method_24575() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_24570(int n, short s, boolean bl) {
        this.Field_24571 = n;
        this.Field_24572 = s;
        this.Field_24573 = bl;
    }

    public short Method_24576() {
        return this.Field_24572;
    }

    public void Method_24577(Class_10954 class_10954) {
        this.Method_24574((Class_14856)class_10954);
    }

    public void Method_24578(Class_29900 class_29900) {
        this.Field_24571 = class_29900.Method_30016();
        this.Field_24572 = class_29900.Method_30008();
        this.Field_24573 = class_29900.Method_29962();
    }

    public void Method_24579(Class_29900 class_29900) {
        class_29900.Method_29949(this.Field_24571);
        class_29900.Method_29922(this.Field_24572);
        class_29900.Method_29980(this.Field_24573);
    }

    public Class_24570() {
    }

    public int Method_24580() {
        return this.Field_24571;
    }

    public boolean Method_24581() {
        return this.Field_24573;
    }
}

