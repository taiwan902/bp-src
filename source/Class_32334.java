/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_32334
implements Class_26653 {
    public Class_23823 Field_32335;
    public Class_33308 Field_32336;
    public Class_33308 Field_32337;
    public Class_23823 Field_32338;

    private void Method_32339() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_32340(Class_14517 class_14517, Random random) {
        int n = 1801 & 6151;
        if (this.Field_32336 != null) {
            n = this.Field_32336.Method_33310(random);
        }
        int n2 = 3 & -16895;
        if (this.Field_32337 != null) {
            n2 = this.Field_32337.Method_33310(random);
        }
        class_14517.add(new Class_6757(new Class_23823(this.Field_32338.Method_23844(), n, this.Field_32338.Method_23843()), new Class_23823(Class_10527.Field_10707), new Class_23823(this.Field_32335.Method_23844(), n2, this.Field_32335.Method_23843())));
    }

    public Class_32334(Class_1956 class_1956, Class_33308 class_33308, Class_1956 class_19562, Class_33308 class_333082) {
        this.Field_32338 = new Class_23823(class_1956);
        this.Field_32336 = class_33308;
        this.Field_32335 = new Class_23823(class_19562);
        this.Field_32337 = class_333082;
    }
}

