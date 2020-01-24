/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_36402
extends Class_35728 {
    Class_859 Field_36403;
    Class_45651 Field_36404;
    private int Field_36405;

    public boolean Method_36406() {
        if (!this.Field_36404.Method_45670()) {
            return (-25831 & 8196) != 0;
        }
        Class_859 class_859 = this.Field_36404.Method_45662();
        if (class_859 == null) {
            return (-32632 & 16) != 0;
        }
        this.Field_36403 = class_859.Method_1045();
        int n = class_859.Method_1008();
        return (n != this.Field_36405 && this.\u0000strictfp(this.Field_36403, (9411 & -12268) != 0) && this.Field_36404.Method_45655(this.Field_36403, class_859) ? 3 & 2185 : -24416 & 512) != 0;
    }

    private void Method_36407() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_36408() {
        this.\u0000strictfp.\u0000, `(this.Field_36403);
        Class_859 class_859 = this.Field_36404.Method_45662();
        if (class_859 != null) {
            this.Field_36405 = class_859.Method_1008();
        }
        super.Method_35741();
    }

    public Class_36402(Class_45651 class_45651) {
        super(class_45651, (16384 & 2816) != 0);
        this.Field_36404 = class_45651;
        this.\u0000strictfp(10313 & -28523);
    }
}

