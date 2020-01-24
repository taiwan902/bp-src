/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Collection;
import java.util.Map;

public class Class_26753 {
    final Class_33760 Field_26754;
    private int Field_26755;
    private int Field_26756;
    private int Field_26757;
    public final Class_626 Field_26758;
    private boolean Field_26759;
    private int Field_26760;
    private int Field_26761;
    public int Field_26762;

    private void Method_26763() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_26753(Class_33760 class_33760, Class_626 class_626) {
        this.Field_26754 = class_33760;
        this.Field_26759 = 1249 & 277;
        this.Field_26756 = 528 & 20485;
        this.Field_26757 = -14335 & 220;
        this.Field_26761 = -32641 & 16383;
        this.Field_26755 = 2175 & -27521;
        this.Field_26758 = class_626;
    }

    public void Method_26764(int n, int n2) {
        if (this.Field_26759) {
            this.Field_26756 = Math.min(this.Field_26756, n);
            this.Field_26757 = Math.min(this.Field_26757, n2);
            this.Field_26761 = Math.max(this.Field_26761, n);
            this.Field_26755 = Math.max(this.Field_26755, n2);
        } else {
            this.Field_26759 = 18577 & -19935;
            this.Field_26756 = n;
            this.Field_26757 = n2;
            this.Field_26761 = n;
            this.Field_26755 = n2;
        }
    }

    public Class_1486 Method_26765(Class_23823 class_23823) {
        if (this.Field_26759) {
            this.Field_26759 = 20912 & -30197;
            return new Class_32556(class_23823.Method_23843(), this.Field_26754.Field_33767, this.Field_26754.Field_33768.values(), this.Field_26754.Field_33761, this.Field_26756, this.Field_26757, this.Field_26761 + (8209 & -11739) - this.Field_26756, this.Field_26755 + (3717 & 12313) - this.Field_26757);
        }
        int n = this.Field_26760;
        this.Field_26760 = n + (387 & 18465);
        return n % (16389 & 2861) == 0 ? new Class_32556(class_23823.Method_23843(), this.Field_26754.Field_33767, this.Field_26754.Field_33768.values(), this.Field_26754.Field_33761, 867 & -7144, 260 & 26194, 12405 & 264, -23903 & 322) : null;
    }
}

