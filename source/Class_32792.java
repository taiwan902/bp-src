/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_32792
extends Class_4291 {
    private int Field_32793;
    private Class_3238 Field_32794 = Class_9265.Field_9297;

    private void Method_32795() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_32796(Class_283 class_283, Random random, Class_4751 class_4751) {
        while (class_283.Method_507(class_4751) && class_4751.\u0000, `() > (258 & 4299)) {
            class_4751 = class_4751.Method_4782();
        }
        if (class_283.Method_375(class_4751).Method_3442() != Class_9265.Field_9413) {
            return (1362 & -20347) != 0;
        }
        int n = random.nextInt(this.Field_32793 - (12322 & 2195)) + (10374 & -31670);
        int n2 = 1601 & 26781;
        for (int i = class_4751.\u0000= final() - n; i <= class_4751.\u0000= final() + n; ++i) {
            for (int j = class_4751.\u0000strictfp() - n; j <= class_4751.\u0000strictfp() + n; ++j) {
                int n3;
                int n4 = i - class_4751.\u0000= final();
                if (n4 * n4 + (n3 = j - class_4751.\u0000strictfp()) * n3 > n * n) continue;
                for (int k = class_4751.\u0000, `() - n2; k <= class_4751.\u0000, `() + n2; ++k) {
                    Class_4751 class_47512 = new Class_4751(i, k, j);
                    Class_3238 class_3238 = class_283.Method_375(class_47512).Method_3442();
                    if (class_3238 != Class_9265.Field_9272 && class_3238 != Class_9265.Field_9413 && class_3238 != Class_9265.Field_9298) continue;
                    class_283.Method_462(class_47512, this.Field_32794.Method_3293(), 8202 & 16390);
                }
            }
        }
        return (1569 & -32699) != 0;
    }

    public Class_32792(int n) {
        this.Field_32793 = n;
    }
}

