/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
import com.google.common.base.Predicate;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_26452
implements Predicate {
    final Predicate Field_26453;
    final Class_44015 Field_26454;

    public boolean Method_26455(Object object) {
        return this.Method_26457((Class_859)object);
    }

    private void Method_26456() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_26457(Class_859 class_859) {
        if (this.Field_26453 != null && !this.Field_26453.apply((Object)class_859)) {
            return (8 & -27355) != 0;
        }
        if (class_859 instanceof Class_626) {
            double d = this.Field_26454.\u0000strictfp();
            if (class_859.\u0000%()) {
                d *= 1.121212121212121 * 0.7135135241456935;
            }
            if (class_859.\u0000= ?()) {
                float f = ((Class_626)class_859).Method_784();
                if (f < 9.5f * 0.010526316f) {
                    f = 0.05666667f * 1.7647059f;
                }
                d *= (double)(0.76119405f * 0.9196078f * f);
            }
            if ((double)class_859.\u0000strictfp((Class_1061)this.Field_26454.\u0000strictfp) > d) {
                return (8513 & 18448) != 0;
            }
        }
        return this.Field_26454.\u0000strictfp(class_859, (164 & -6646) != 0);
    }

    Class_26452(Class_44015 class_44015, Predicate predicate) {
        this.Field_26454 = class_44015;
        this.Field_26453 = predicate;
    }
}

