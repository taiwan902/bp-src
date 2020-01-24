/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_29129
implements Class_26653 {
    public Class_23823 Field_29130;
    public Class_33308 Field_29131;

    public Class_29129(Class_23823 class_23823, Class_33308 class_33308) {
        this.Field_29130 = class_23823;
        this.Field_29131 = class_33308;
    }

    public void Method_29132(Class_14517 class_14517, Random random) {
        Class_23823 class_23823;
        Class_23823 class_238232;
        int n = 129 & -24559;
        if (this.Field_29131 != null) {
            n = this.Field_29131.Method_33310(random);
        }
        if (n < 0) {
            class_23823 = new Class_23823(Class_10527.Field_10707, 8205 & 21249, 16394 & 548);
            class_238232 = new Class_23823(this.Field_29130.Method_23844(), -n, this.Field_29130.Method_23843());
        } else {
            class_23823 = new Class_23823(Class_10527.Field_10707, n, 4186 & -8192);
            class_238232 = new Class_23823(this.Field_29130.Method_23844(), 16481 & -30583, this.Field_29130.Method_23843());
        }
        class_14517.add(new Class_6757(class_23823, class_238232));
    }

    public Class_29129(Class_1956 class_1956, Class_33308 class_33308) {
        this.Field_29130 = new Class_23823(class_1956);
        this.Field_29131 = class_33308;
    }

    private void Method_29133() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

