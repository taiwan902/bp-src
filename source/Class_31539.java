/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_31539
implements Class_26653 {
    public Class_33308 Field_31540;
    public Class_23823 Field_31541;

    public Class_31539(Class_1956 class_1956, Class_33308 class_33308) {
        this.Field_31541 = new Class_23823(class_1956);
        this.Field_31540 = class_33308;
    }

    private void Method_31542() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_31543(Class_14517 class_14517, Random random) {
        int n = 10265 & -27611;
        if (this.Field_31540 != null) {
            n = this.Field_31540.Method_33310(random);
        }
        Class_23823 class_23823 = new Class_23823(Class_10527.Field_10707, n, 8481 & -31232);
        Class_23823 class_238232 = new Class_23823(this.Field_31541.Method_23844(), 13953 & 2057, this.Field_31541.Method_23843());
        class_238232 = Class_29642.Method_29673(random, class_238232, (30725 & 1389) + random.nextInt(12367 & -30161));
        class_14517.add(new Class_6757(class_23823, class_238232));
    }
}

