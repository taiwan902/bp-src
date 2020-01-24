/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public abstract class Class_4981
extends Class_4879
implements Class_4990,
Class_4993 {
    private Class_11641 Field_4982 = Class_11641.Field_11643;

    public Class_1782 Method_4983() {
        return this.\u0000strictfp() ? new Class_2840(this.\u0000, `()) : new Class_2849(this.\u0000, `(), new Object[-14840 & 10304]);
    }

    public void Method_4984(Class_1699 class_1699) {
        super.Method_4911(class_1699);
        this.Field_4982 = Class_11641.Method_11644(class_1699);
    }

    public void Method_4985(Class_11641 class_11641) {
        this.Field_4982 = class_11641;
    }

    private void Method_4986() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_4987() {
        return (this.Field_4982 != null && !this.Field_4982.Method_11648() ? 16391 & -31631 : 16389 & 9352) != 0;
    }

    public Class_11641 Method_4988() {
        return this.Field_4982;
    }

    public void Method_4989(Class_1699 class_1699) {
        super.Method_4929(class_1699);
        if (this.Field_4982 != null) {
            this.Field_4982.Method_11647(class_1699);
        }
    }
}

