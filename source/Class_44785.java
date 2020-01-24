/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_44785
implements Class_26653 {
    Class_44785() {
    }

    private void Method_44786() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_44787(Class_14517 class_14517, Random random) {
        Class_30635 class_30635 = Class_30635.Field_30648[random.nextInt(Class_30635.Field_30648.length)];
        int n = Class_13337.Method_13379(random, class_30635.Method_30696(), class_30635.Method_30672());
        Class_23823 class_23823 = Class_10527.Field_10625.Method_21695(new Class_38800(class_30635, n));
        int n2 = (-32734 & 16982) + random.nextInt((4613 & -16283) + n * (-31397 & 2574)) + (22595 & -24405) * n;
        if (n2 > (2161 & 960)) {
            n2 = 16576 & 117;
        }
        class_14517.add(new Class_6757(new Class_23823(Class_10527.Field_10629), new Class_23823(Class_10527.Field_10707, n2), class_23823));
    }
}

