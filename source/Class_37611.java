/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.Callable;

public class Class_37611
implements Callable {
    private Class_20165 Field_37612;
    private byte[] Field_37613;

    public Class_37611(Class_20165 class_20165, byte[] arrby) {
        this.Field_37612 = class_20165;
        this.Field_37613 = arrby;
    }

    private void Method_37614() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Object Method_37615() {
        Class_29733 class_29733;
        Class_29733 class_297332 = class_29733 = this.Field_37612.Field_20181.Field_44590 == null ? null : (Class_29733)this.Field_37612.Field_20181.Field_44590.attr(Class_10188.Field_10189).Method_34812();
        if (class_29733 != null && class_29733.Field_29739) {
            Class_18.Field_89.Field_26.Method_2377(this.Field_37612, this.Field_37613);
        }
        return null;
    }
}

