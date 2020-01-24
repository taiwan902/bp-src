/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_5038
implements Class_5046 {
    protected void Method_5039(Class_5001 class_5001) {
        class_5001.\u0000strictfp().Method_502(-25605 & 1000, class_5001.Method_5003(), 6560 & 9740);
    }

    protected Class_23823 Method_5040(Class_5001 class_5001, Class_23823 class_23823) {
        Class_4595 class_4595 = Class_4850.Method_4869(class_5001.Method_5007());
        Class_4997 class_4997 = Class_4850.Method_4867(class_5001);
        Class_23823 class_238232 = class_23823.Method_23857(17043 & -23287);
        Class_5038.Method_5043(class_5001.\u0000strictfp(), class_238232, 142 & -26874, class_4595, class_4997);
        return class_23823;
    }

    protected void Method_5041(Class_5001 class_5001, Class_4595 class_4595) {
        class_5001.\u0000strictfp().Method_502(18416 & 2002, class_5001.Method_5003(), this.Method_5044(class_4595));
    }

    private void Method_5042() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public static void Method_5043(Class_283 class_283, Class_23823 class_23823, int n, Class_4595 class_4595, Class_4997 class_4997) {
        double d = class_4997.Method_5000();
        double d2 = class_4997.Method_4999();
        double d3 = class_4997.Method_4998();
        d2 = class_4595.Method_4640() == Class_4565.Field_4569 ? (d2 -= 0.011904761904761904 * 10.5) : (d2 -= 0.75 * 0.20833333333333334);
        Class_3443 class_3443 = new Class_3443(class_283, d, d2, d3, class_23823);
        double d4 = class_283.Field_307.nextDouble() * (1.1363636363636365 * 0.088) + 0.02891566265060241 * 6.916666666666667;
        class_3443.\u0000= ` = (double)class_4595.Method_4654() * d4;
        class_3443.\u0000%(0.2800000041723251 * 0.7142857142857143);
        class_3443.\u0000switch = (double)class_4595.Method_4656() * d4;
        class_3443.\u0000= ` += class_283.Field_307.nextGaussian() * (0.5121951219512195 * 0.01464285681556378) * (double)n;
        class_3443.\u0000%(class_3443.\u0000, #() + class_283.Field_307.nextGaussian() * (0.07368421052631578 * 0.10178571201062629) * (double)n);
        class_3443.\u0000switch += class_283.Field_307.nextGaussian() * (0.01633928534907422 * 0.45901639344262296) * (double)n;
        class_283.Method_350(class_3443);
    }

    private int Method_5044(Class_4595 class_4595) {
        return class_4595.Method_4654() + (4573 & 33) + (class_4595.Method_4656() + (-31159 & 14753)) * (8711 & -31405);
    }

    public final Class_23823 Method_5045(Class_5001 class_5001, Class_23823 class_23823) {
        Class_23823 class_238232 = this.Method_5040(class_5001, class_23823);
        this.Method_5039(class_5001);
        this.Method_5041(class_5001, Class_4850.Method_4869(class_5001.Method_5007()));
        return class_238232;
    }
}

