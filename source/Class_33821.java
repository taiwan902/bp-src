/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
import com.google.common.base.Predicate;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public final class Class_33821
implements Predicate {
    final int Field_33822;
    final int Field_33823;
    final int Field_33824;
    final int Field_33825;
    final Class_4751 Field_33826;

    public boolean Method_33827(Class_1061 class_1061) {
        int n = (int)class_1061.Method_1207(this.Field_33826);
        return (!(this.Field_33822 >= 0 && n < this.Field_33825 || this.Field_33824 >= 0 && n > this.Field_33823) ? 161 & 17413 : 8192 & 11) != 0;
    }

    Class_33821(Class_4751 class_4751, int n, int n2, int n3, int n4) {
        this.Field_33826 = class_4751;
        this.Field_33822 = n;
        this.Field_33825 = n2;
        this.Field_33824 = n3;
        this.Field_33823 = n4;
    }

    private void Method_33828() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_33829(Object object) {
        return this.Method_33827((Class_1061)object);
    }
}

