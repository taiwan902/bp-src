/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_42695
extends Class_35728 {
    private int Field_42696;
    Class_859 Field_42697;
    Class_45651 Field_42698;

    public void Method_42699() {
        this.\u0000strictfp.\u0000, `(this.Field_42697);
        Class_859 class_859 = this.Field_42698.Method_45662();
        if (class_859 != null) {
            this.Field_42696 = class_859.Method_994();
        }
        super.Method_35741();
    }

    private void Method_42700() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_42701() {
        if (!this.Field_42698.Method_45670()) {
            return (18480 & 12545) != 0;
        }
        Class_859 class_859 = this.Field_42698.Method_45662();
        if (class_859 == null) {
            return (33 & 17430) != 0;
        }
        this.Field_42697 = class_859.Method_1036();
        int n = class_859.Method_994();
        return (n != this.Field_42696 && this.\u0000strictfp(this.Field_42697, (1024 & 16457) != 0) && this.Field_42698.Method_45655(this.Field_42697, class_859) ? 9569 & 20625 : 2050 & 16405) != 0;
    }

    public Class_42695(Class_45651 class_45651) {
        super(class_45651, (-16350 & 1029) != 0);
        this.Field_42698 = class_45651;
        this.\u0000strictfp(16937 & 2321);
    }
}

