/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_29684
extends Class_2651 {
    private Class_2651 Field_29685;

    public Class_283 Method_29686() {
        this.\u0000strictfp = this.Field_29685.\u0000strictfp();
        this.\u0000strictfp = this.Field_29685.\u0000strictfp();
        String string = Class_41901.Method_41907(this.\u0000strictfp);
        Class_41901 class_41901 = (Class_41901)this.\u0000strictfp.Method_35279(Class_41901.class, string);
        if (class_41901 == null) {
            this.\u0000strictfp = new Class_41901(this);
            this.\u0000strictfp.Method_35284(string, this.\u0000strictfp);
        } else {
            this.\u0000strictfp = class_41901;
            this.\u0000strictfp.Method_41924(this);
        }
        return this;
    }

    protected void Method_29687() {
    }

    private void Method_29688() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_29684(Class_2457 class_2457, Class_26655 class_26655, int n, Class_2651 class_2651, Class_2767 class_2767) {
        super(class_2457, class_26655, new Class_34982(class_2651.\u0000strictfp()), n, class_2767);
        this.Field_29685 = class_2651;
        class_2651.\u0000strictfp().Method_31490(new Class_33158(this));
    }
}

