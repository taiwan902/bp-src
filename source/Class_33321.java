/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
import com.google.common.base.Predicate;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public final class Class_33321
implements Predicate {
    final Class_10997 Field_33322;

    public boolean Method_33323(Class_1061 class_1061) {
        return (class_1061.Field_1130 >= this.Field_33322.Field_10999 && class_1061.Method_1324() >= this.Field_33322.Field_11000 && class_1061.Field_1106 >= this.Field_33322.Field_11001 ? (class_1061.Field_1130 < this.Field_33322.Field_11002 && class_1061.Method_1324() < this.Field_33322.Field_10998 && class_1061.Field_1106 < this.Field_33322.Field_11003 ? -23375 & 6145 : 2069 & 20736) : -32740 & 10817) != 0;
    }

    private void Method_33324() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_33321(Class_10997 class_10997) {
        this.Field_33322 = class_10997;
    }

    public boolean Method_33325(Object object) {
        return this.Method_33323((Class_1061)object);
    }
}

