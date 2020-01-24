/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_21119
extends Class_4328 {
    private final Class_3436 Field_21120;
    private final Class_3436 Field_21121;

    public boolean Method_21122(Class_283 class_283, Random random, Class_4751 class_4751) {
        Class_3238 class_3238;
        while (((class_3238 = class_283.Method_375(class_4751).Method_3442()).Method_3373() == Class_3713.Field_3718 || class_3238.Method_3373() == Class_3713.Field_3729) && class_4751.\u0000, `() > 0) {
            class_4751 = class_4751.Method_4782();
        }
        Class_3238 class_32382 = class_283.Method_375(class_4751).Method_3442();
        if (class_32382 == Class_9265.Field_9272 || class_32382 == Class_9265.Field_9319) {
            class_4751 = class_4751.Method_4769();
            this.\u0000strictfp(class_283, class_4751, this.Field_21120);
            for (int i = class_4751.\u0000, `(); i <= class_4751.\u0000, `() + (10 & 9238); ++i) {
                int n = i - class_4751.\u0000, `();
                int n2 = (6242 & 17026) - n;
                for (int j = class_4751.\u0000= final() - n2; j <= class_4751.\u0000= final() + n2; ++j) {
                    int n3 = j - class_4751.\u0000= final();
                    for (int k = class_4751.\u0000strictfp() - n2; k <= class_4751.\u0000strictfp() + n2; ++k) {
                        Class_4751 class_47512;
                        int n4 = k - class_4751.\u0000strictfp();
                        if (Math.abs(n3) == n2 && Math.abs(n4) == n2 && random.nextInt(27722 & -32490) == 0 || class_283.Method_375(class_47512 = new Class_4751(j, i, k)).Method_3442().Method_3381()) continue;
                        this.\u0000strictfp(class_283, class_47512, this.Field_21121);
                    }
                }
            }
        }
        return (-28319 & 1035) != 0;
    }

    public Class_21119(Class_3436 class_3436, Class_3436 class_34362) {
        super((8459 & 2048) != 0);
        this.Field_21120 = class_3436;
        this.Field_21121 = class_34362;
    }

    private void Method_21123() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

