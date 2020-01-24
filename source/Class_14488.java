/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
import com.google.common.base.Predicate;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public final class Class_14488
implements Predicate {
    final int Field_14489;
    final int Field_14490;

    public boolean Method_14491(Class_1061 class_1061) {
        int n = Class_16350.Method_16364((int)Math.floor(class_1061.Field_1079));
        return (this.Field_14490 > this.Field_14489 ? (n >= this.Field_14490 || n <= this.Field_14489 ? 4933 & 17467 : -30332 & 20496) : (n >= this.Field_14490 && n <= this.Field_14489 ? 1289 & -8125 : 4387 & 2560)) != 0;
    }

    private void Method_14492() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_14493(Object object) {
        return this.Method_14491((Class_1061)object);
    }

    Class_14488(int n, int n2) {
        this.Field_14490 = n;
        this.Field_14489 = n2;
    }
}

