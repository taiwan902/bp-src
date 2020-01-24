/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
import com.google.common.base.Predicate;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_5995
implements Predicate {
    final Class_41853 Field_5996;
    final Predicate Field_5997;
    final Class_45930 Field_5998;

    Class_5995(Class_45930 class_45930, Predicate predicate, Class_41853 class_41853) {
        this.Field_5998 = class_45930;
        this.Field_5997 = predicate;
        this.Field_5996 = class_41853;
    }

    private void Method_5999() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_6000(Object object) {
        return this.Method_6001((Class_859)object);
    }

    public boolean Method_6001(Class_859 class_859) {
        if (this.Field_5997 != null && !this.Field_5997.apply((Object)class_859)) {
            return (14342 & 456) != 0;
        }
        if (class_859 instanceof Class_43073) {
            return (80 & -32470) != 0;
        }
        if (class_859 instanceof Class_626) {
            double d = Class_45930.Method_45932(this.Field_5998);
            if (class_859.\u0000%()) {
                d *= 0.8958333333333334 * 0.8930232691210369;
            }
            if (class_859.\u0000= ?()) {
                float f = ((Class_626)class_859).Method_784();
                if (f < 2.125f * 0.047058824f) {
                    f = 0.11875f * 0.84210527f;
                }
                d *= (double)(0.31216216f * 2.2424242f * f);
            }
            if ((double)class_859.\u0000strictfp((Class_1061)this.Field_5996) > d) {
                return (-23802 & 2072) != 0;
            }
        }
        return Class_45930.Method_45933(this.Field_5998, class_859, (5137 & 10562) != 0);
    }
}

