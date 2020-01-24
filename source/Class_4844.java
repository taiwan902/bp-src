/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_4844
extends Class_3238 {
    Class_4452 Field_4845 = new Class_4452();
    private boolean Field_4846;

    protected Class_4844(Class_3713 class_3713, boolean bl) {
        this(class_3713, bl, class_3713.Method_3760());
    }

    public boolean Method_4847(Class_561 class_561, Class_4751 class_4751, Class_4595 class_4595) {
        Class_3677 class_3677 = class_561.Method_569(class_4751);
        Class_3238 class_3238 = class_3677.Method_3688();
        if (this == Class_9265.Field_9345 || this == Class_9265.Field_9344) {
            if (class_561.Method_569(class_4751.Method_4767(class_4595.Method_4660(), (Class_4810)this.Field_4845.get())) != class_3677) {
                return (1697 & -14329) != 0;
            }
            if (class_3238 == this) {
                return (17488 & 296) != 0;
            }
        }
        return (!this.Field_4846 && class_3238 == this ? 3136 & -28639 : super.Method_3356(class_561, class_4751, class_4595)) != 0;
    }

    private void Method_4848() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected Class_4844(Class_3713 class_3713, boolean bl, Class_3779 class_3779) {
        super(class_3713, class_3779);
        this.Field_4846 = bl;
    }

    public boolean Method_4849() {
        return (20551 & 9520) != 0;
    }
}

