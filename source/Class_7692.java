/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
import com.google.common.base.Predicate;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_7692 {
    private boolean Field_7693;
    private Class_3436 Field_7694;
    private Class_4879 Field_7695;
    private final Class_4751 Field_7696;
    private final Class_283 Field_7697;
    private final boolean Field_7698;

    public Class_3436 Method_7699() {
        if (this.Field_7694 == null && (this.Field_7698 || this.Field_7697.Method_368(this.Field_7696))) {
            this.Field_7694 = this.Field_7697.Method_375(this.Field_7696);
        }
        return this.Field_7694;
    }

    private void Method_7700() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public static Predicate Method_7701(Predicate predicate) {
        return new Class_14187(predicate);
    }

    public Class_4751 Method_7702() {
        return this.Field_7696;
    }

    public Class_7692(Class_283 class_283, Class_4751 class_4751, boolean bl) {
        this.Field_7697 = class_283;
        this.Field_7696 = class_4751;
        this.Field_7698 = bl;
    }

    public Class_4879 Method_7703() {
        if (this.Field_7695 == null && !this.Field_7693) {
            this.Field_7695 = this.Field_7697.Method_429(this.Field_7696);
            this.Field_7693 = 2401 & 17925;
        }
        return this.Field_7695;
    }
}

