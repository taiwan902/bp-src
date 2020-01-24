/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
import com.google.common.base.Predicate;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_11104
implements Predicate {
    final Class_36241 Field_11105;

    private void Method_11106() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_11104(Class_36241 class_36241) {
        this.Field_11105 = class_36241;
    }

    public boolean Method_11107(Object object) {
        return this.Method_11108((Class_1061)object);
    }

    public boolean Method_11108(Class_1061 class_1061) {
        if (!(class_1061 instanceof Class_626)) {
            return (17060 & 1304) != 0;
        }
        if (((Class_626)class_1061).Field_694.Field_18085) {
            return (-32691 & 4130) != 0;
        }
        double d = this.Field_11105.Method_36247();
        if (class_1061.Method_1276()) {
            d *= 0.25074627239312697 * 3.1904761904761907;
        }
        if (class_1061.Method_1358()) {
            float f = ((Class_626)class_1061).Method_784();
            if (f < 1.7017543f * 0.05876289f) {
                f = 3.3913043f * 0.029487181f;
            }
            d *= (double)(0.60925925f * 1.1489362f * f);
        }
        return ((double)class_1061.Method_1322(Class_36241.Method_36253(this.Field_11105)) > d ? -20384 & 2193 : Class_35728.Method_35742(Class_36241.Method_36253(this.Field_11105), (Class_859)class_1061, (2496 & -24011) != 0, (-24563 & 4737) != 0)) != 0;
    }
}

