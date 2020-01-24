/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
import com.google.common.base.Predicate;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_33484
implements Predicate {
    final Class_34269 Field_33485;

    public boolean Method_33486(Object object) {
        return this.Method_33487((Class_1061)object);
    }

    public boolean Method_33487(Class_1061 class_1061) {
        return (class_1061.Method_1285() && this.Field_33485.Field_34271.\u0000strictfp().Method_27491(class_1061) ? -31483 & 21193 : 1088 & 24752) != 0;
    }

    private void Method_33488() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_33484(Class_34269 class_34269) {
        this.Field_33485 = class_34269;
    }
}

