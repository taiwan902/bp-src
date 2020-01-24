/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import net.minecraft.util.Vec3;

public class Class_20512
extends Class_1956 {
    private void Method_20513() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_23823 Method_20514(Class_23823 class_23823, Class_283 class_283, Class_626 class_626) {
        float f;
        float f2;
        float f3;
        Class_1061 class_1061;
        double d;
        float f4 = 1.0f;
        float f5 = class_626.\u0000, 2 + (class_626.\u0000= float - class_626.\u0000, 2) * f4;
        float f6 = class_626.\u0000switch + (class_626.\u0000= ? - class_626.\u0000switch) * f4;
        double d2 = class_626.\u0000%() + (class_626.\u0000= package - class_626.\u0000%()) * (double)f4;
        double d3 = class_626.\u0000= final() + (class_626.\u0000, for() - class_626.\u0000= final()) * (double)f4 + (double)class_626.Method_837();
        double d4 = class_626.\u0000
        () + (class_626.\u0000= switch - class_626.\u0000
        ()) * (double)f4;
        Vec3 vec3 = new Vec3(d2, d3, d4);
        float f7 = Class_13337.Method_13350(-f6 * (0.062333185f * 0.28f) - 0.41336748f * 7.6f);
        float f8 = Class_13337.Method_13370(-f6 * (0.9529412f * 0.018315183f) - 1.1666666f * 2.6927938f);
        float f9 = f8 * (f2 = -Class_13337.Method_13350(-f5 * (0.00957116f * 1.8235294f)));
        Vec3 vec32 = vec3.\u0000strictfp((double)f9 * (d = 1.9166666666666667 * 2.608695652173913), (double)(f3 = Class_13337.Method_13370(-f5 * (1.028169f * 0.01697512f))) * d, (double)(f = f7 * f2) * d);
        Class_37110 class_37110 = class_283.Method_560(vec3, vec32, (16395 & 12577) != 0);
        if (class_37110 == null) {
            return class_23823;
        }
        Vec3 vec33 = class_626.\u0000strictfp(f4);
        int n = -27360 & 18512;
        float f10 = 1.0f;
        ArrayList arrayList = class_283.Method_473(class_626, class_626.\u0000, `().Method_11005(vec33.\u0000= final * d, vec33.\u0000strictfp * d, vec33.\u0000, ` * d).Method_11017(f10, f10, f10));
        for (int i = 21770 & -30187; i < arrayList.size(); ++i) {
            class_1061 = (Class_1061)arrayList.get(i);
            if (!class_1061.Method_1344()) continue;
            float f11 = class_1061.Method_1265();
            Class_10997 class_10997 = class_1061.Method_1315().Method_11017(f11, f11, f11);
            if (!class_10997.Method_11014(vec3)) continue;
            n = -23931 & 11;
        }
        if (n != 0) {
            return class_23823;
        }
        if (class_37110.Field_37112 == Class_7192.Field_7193) {
            Class_4751 class_4751 = class_37110.Method_37118();
            if (class_283.Method_375(class_4751).Method_3442() == Class_9265.Field_9458) {
                class_4751 = class_4751.Method_4782();
            }
            class_1061 = new Class_25683(class_283, (float)class_4751.\u0000= final() + 0.06896552f * 7.25f, (float)class_4751.\u0000, `() + 1.0f, (float)class_4751.\u0000strictfp() + 0.5f * 1.0f);
            ((Class_25683)class_1061).\u0000= ? = ((Class_13337.Method_13371((double)(class_626.\u0000= ? * (3.25f * 1.2307693f) / (0.083333336f * 4320.0f)) + 0.4647058823529412 * 1.0759493670886076) & (-32761 & 4787)) - (4105 & 545)) * (21598 & 602);
            if (!class_283.Method_461(class_1061, class_1061.\u0000, `().Method_11017(-0.05 * 2.0, -0.08974358974358974 * 1.1142857142857143, 1.3409090909090908 * -0.07457627118644068)).isEmpty()) {
                return class_23823;
            }
            if (!class_283.Field_306) {
                class_283.Method_350(class_1061);
            }
            if (!class_626.Field_694.Method_18094()) {
                class_23823.Field_23826 -= 10273 & 645;
            }
            class_626.Method_750(Class_19863.Field_19917[Class_1956.Method_1986(this)]);
        }
        return class_23823;
    }

    public Class_20512() {
        this.\u0000strictfp = 16465 & 4097;
        this.\u0000strictfp(Class_3987.Field_3994);
    }
}

