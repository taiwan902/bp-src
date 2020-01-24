/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
import com.google.common.base.Predicate;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public final class Class_8637
implements Predicate {
    final int Field_8638;
    final int Field_8639;

    private void Method_8640() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_8637(int n, int n2) {
        this.Field_8639 = n;
        this.Field_8638 = n2;
    }

    public boolean Method_8641(Object object) {
        return this.Method_8642((Class_1061)object);
    }

    public boolean Method_8642(Class_1061 class_1061) {
        int n = Class_16350.Method_16364((int)Math.floor(class_1061.Field_1093));
        return (this.Field_8639 > this.Field_8638 ? (n >= this.Field_8639 || n <= this.Field_8638 ? 8261 & -31463 : 2152 & -23146) : (n >= this.Field_8639 && n <= this.Field_8638 ? 3233 & 793 : 8195 & 21052)) != 0;
    }
}

