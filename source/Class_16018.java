/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
import com.google.common.base.Predicate;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_16018
implements Predicate {
    final Class_34560 Field_16019;

    private void Method_16020() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_16018(Class_34560 class_34560) {
        this.Field_16019 = class_34560;
    }

    public boolean Method_16021(Class_859 class_859) {
        double d = this.Field_16019.Method_34569();
        if (class_859.\u0000%()) {
            d *= 0.360000005364418 * 2.2222222222222223;
        }
        return (class_859.\u0000= ?() ? 16896 & 12580 : ((double)class_859.\u0000strictfp((Class_1061)Class_34560.Method_34570(this.Field_16019)) > d ? 4180 & 8961 : (int)(Class_35728.Method_35742(Class_34560.Method_34570(this.Field_16019), class_859, (-15328 & 10830) != 0, (3093 & 17033) != 0) ? 1 : 0))) != 0;
    }

    public boolean Method_16022(Object object) {
        return this.Method_16021((Class_859)object);
    }
}

