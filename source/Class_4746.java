/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_4746
extends Class_3238 {
    protected boolean Field_4747;

    protected Class_4746(Class_3713 class_3713, boolean bl) {
        super(class_3713);
        this.Field_4747 = bl;
    }

    private void Method_4748() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_4749() {
        return (24593 & 4492) != 0;
    }

    public boolean Method_4750(Class_561 class_561, Class_4751 class_4751, Class_4595 class_4595) {
        return (!this.Field_4747 && class_561.Method_568(class_4751).Method_3442() == this ? 8292 & 17920 : super.Method_3356(class_561, class_4751, class_4595)) != 0;
    }
}

