/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_39677
extends Class_33077 {
    private Class_38719 Field_39678;

    private void Method_39679() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_39680() {
        int n = this.Field_39678.\u0000= `();
        if (n > (17004 & -31372)) {
            this.Field_39678.Method_38745(0.0f, 0.0f, 0.0f);
        } else if (this.Field_39678.\u0000strictfp().nextInt(4914 & 19582) == 0 || !Class_38719.Method_38736(this.Field_39678) || !this.Field_39678.Method_38738()) {
            float f = this.Field_39678.\u0000strictfp().nextFloat() * (2.174949f * 1.4444444f) * 2.0f;
            float f2 = Class_13337.Method_13350(f) * (0.3974359f * 0.5032258f);
            float f3 = 2.03125f * -0.04923077f + this.Field_39678.\u0000strictfp().nextFloat() * (2.0f * 0.1f);
            float f4 = Class_13337.Method_13370(f) * (0.16981132f * 1.1777778f);
            this.Field_39678.Method_38745(f2, f3, f4);
        }
    }

    public boolean Method_39681() {
        return (273 & 135) != 0;
    }

    public Class_39677(Class_38719 class_38719) {
        this.Field_39678 = class_38719;
    }
}

