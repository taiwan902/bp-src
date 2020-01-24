/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_29574
implements Class_26653 {
    public Class_33308 Field_29575;
    public Class_1956 Field_29576;

    public void Method_29577(Class_14517 class_14517, Random random) {
        int n = 545 & 2055;
        if (this.Field_29575 != null) {
            n = this.Field_29575.Method_33310(random);
        }
        class_14517.add(new Class_6757(new Class_23823(this.Field_29576, n, -31614 & 8204), Class_10527.Field_10707));
    }

    public Class_29574(Class_1956 class_1956, Class_33308 class_33308) {
        this.Field_29576 = class_1956;
        this.Field_29575 = class_33308;
    }

    private void Method_29578() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

