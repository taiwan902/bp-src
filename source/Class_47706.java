/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public final class Class_47706
extends Class_5038 {
    private final Class_5038 Field_47707 = new Class_5038();

    Class_47706() {
    }

    private void Method_47708() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected void Method_47709(Class_5001 class_5001) {
        class_5001.\u0000strictfp().Method_502(-4104 & 1001, class_5001.Method_5003(), 8233 & 19584);
    }

    public Class_23823 Method_47710(Class_5001 class_5001, Class_23823 class_23823) {
        double d;
        Object object;
        Class_5183 class_5183;
        Class_4595 class_4595 = Class_4850.Method_4869(class_5001.Method_5007());
        Class_283 class_283 = class_5001.\u0000strictfp();
        double d2 = class_5001.Method_5005() + (double)class_4595.Method_4654() * (0.925531914893617 * 1.2155172413793105);
        double d3 = Math.floor(class_5001.Method_5002()) + (double)class_4595.Method_4633();
        double d4 = class_5001.Method_5004() + (double)class_4595.Method_4656() * (0.7228915662650602 * 1.55625);
        Class_4751 class_4751 = class_5001.Method_5003().Method_4765(class_4595);
        Class_3436 class_3436 = class_283.Method_375(class_4751);
        Class_5183 class_51832 = class_5183 = class_3436.Method_3442() instanceof Class_5164 ? (Class_5183)((Object)class_3436.Method_3440(((Class_5164)class_3436.Method_3442()).Method_5176())) : Class_5183.Field_5185;
        if (Class_5164.Method_5178(class_3436)) {
            d = class_5183.Method_5219() ? 0.8590909090909091 * 0.6984126984126984 : 0.05641025641025641 * 1.7727272727272727;
        } else {
            if (class_3436.Method_3442().Method_3373() != Class_3713.Field_3718 || !Class_5164.Method_5178(class_283.Method_375(class_4751.Method_4782()))) {
                return this.Field_47707.Method_5045(class_5001, class_23823);
            }
            object = class_283.Method_375(class_4751.Method_4782());
            Class_5183 class_51833 = object.Method_3442() instanceof Class_5164 ? (Class_5183)((Object)object.Method_3440(((Class_5164)object.Method_3442()).Method_5176())) : Class_5183.Field_5185;
            d = class_4595 != Class_4595.Field_4615 && class_51833.Method_5219() ? -0.23076923076923078 * 1.7333333333333334 : 0.6949152542372882 * -1.2951219512195122;
        }
        object = Class_15933.Method_15952(class_283, d2, d3 + d, d4, Class_21085.Method_21089((Class_21085)class_23823.Method_23844()));
        if (class_23823.Method_23851()) {
            ((Class_15933)object).Method_15979(class_23823.Method_23899());
        }
        class_283.Method_350((Class_1061)object);
        class_23823.Method_23857(-11261 & 209);
        return class_23823;
    }
}

