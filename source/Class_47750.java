/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public final class Class_47750
extends Class_5038 {
    Class_47750() {
    }

    protected void Method_47751(Class_5001 class_5001) {
        class_5001.\u0000strictfp().Method_502(18421 & 7153, class_5001.Method_5003(), 4369 & -22016);
    }

    public Class_23823 Method_47752(Class_5001 class_5001, Class_23823 class_23823) {
        Class_4595 class_4595 = Class_4850.Method_4869(class_5001.Method_5007());
        Class_4997 class_4997 = Class_4850.Method_4867(class_5001);
        double d = class_4997.Method_5000() + (double)((float)class_4595.Method_4654() * (0.049411766f * 6.071429f));
        double d2 = class_4997.Method_4999() + (double)((float)class_4595.Method_4633() * (0.5882353f * 0.51f));
        double d3 = class_4997.Method_4998() + (double)((float)class_4595.Method_4656() * (1.8666668f * 0.16071428f));
        Class_283 class_283 = class_5001.\u0000strictfp();
        Random random = class_283.Field_307;
        double d4 = random.nextGaussian() * (0.3333333333333333 * 0.15000000000000002) + (double)class_4595.Method_4654();
        double d5 = random.nextGaussian() * (0.5555555555555556 * 0.09) + (double)class_4595.Method_4633();
        double d6 = random.nextGaussian() * (16.25 * 0.003076923076923077) + (double)class_4595.Method_4656();
        class_283.Method_350(new Class_36739(class_283, d, d2, d3, d4, d5, d6));
        class_23823.Method_23857(2433 & -24059);
        return class_23823;
    }

    private void Method_47753() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

