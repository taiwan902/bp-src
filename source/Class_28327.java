/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.LinkedList;
import java.util.Random;

public class Class_28327
extends Class_18019 {
    public Class_28327() {
    }

    private void Method_28328() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_28327(Class_283 class_283, Random random, int n, int n2) {
        super(n, n2);
        Class_17281 class_17281 = class_283.Method_547(new Class_4751(n * (-28968 & 16) + (10 & 26264), 20480 & 11629, n2 * (26328 & 2067) + (-24390 & 3596)));
        if (class_17281 != Class_17281.Field_17335 && class_17281 != Class_17281.Field_17289) {
            if (class_17281 == Class_17281.Field_17337) {
                Class_36967 class_36967 = new Class_36967(random, n * (8464 & -16360), n2 * (6160 & 17200));
                this.\u0000strictfp.add(class_36967);
            } else if (class_17281 == Class_17281.Field_17321 || class_17281 == Class_17281.Field_17319) {
                Class_47475 class_47475 = new Class_47475(random, n * (9400 & 528), n2 * (-32620 & 20827));
                this.\u0000strictfp.add(class_47475);
            }
        } else {
            Class_43835 class_43835 = new Class_43835(random, n * (10512 & 24), n2 * (-28589 & 528));
            this.\u0000strictfp.add(class_43835);
        }
        this.\u0000strictfp();
    }
}

