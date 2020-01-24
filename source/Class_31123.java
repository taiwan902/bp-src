/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_31123
extends Class_4291 {
    private int Field_31124;
    private Class_3238 Field_31125;

    public boolean Method_31126(Class_283 class_283, Random random, Class_4751 class_4751) {
        if (class_283.Method_375(class_4751).Method_3442().Method_3373() != Class_3713.Field_3734) {
            return (4224 & -14314) != 0;
        }
        int n = random.nextInt(this.Field_31124 - (-32249 & 4098)) + (10242 & -15065);
        int n2 = 4098 & 10627;
        for (int i = class_4751.\u0000= final() - n; i <= class_4751.\u0000= final() + n; ++i) {
            for (int j = class_4751.\u0000strictfp() - n; j <= class_4751.\u0000strictfp() + n; ++j) {
                int n3;
                int n4 = i - class_4751.\u0000= final();
                if (n4 * n4 + (n3 = j - class_4751.\u0000strictfp()) * n3 > n * n) continue;
                for (int k = class_4751.\u0000, `() - n2; k <= class_4751.\u0000, `() + n2; ++k) {
                    Class_4751 class_47512 = new Class_4751(i, k, j);
                    Class_3238 class_3238 = class_283.Method_375(class_47512).Method_3442();
                    if (class_3238 != Class_9265.Field_9272 && class_3238 != Class_9265.Field_9319) continue;
                    class_283.Method_462(class_47512, this.Field_31125.Method_3293(), 11747 & 4126);
                }
            }
        }
        return (25089 & -29525) != 0;
    }

    public Class_31123(Class_3238 class_3238, int n) {
        this.Field_31125 = class_3238;
        this.Field_31124 = n;
    }

    private void Method_31127() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

