/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Random;

public class Class_2031
extends Class_1956 {
    private void Method_2032(Class_27288 class_27288, Random random) {
        Class_13635 class_13635 = class_27288.Method_27324();
        float f = random.nextFloat() * (6.333333f * 0.7894737f);
        float f2 = random.nextFloat() * (0.33333334f * 60.0f) - 0.8695652f * 11.5f;
        Class_13635 class_136352 = new Class_13635(class_13635.Method_13644() + f, class_13635.Method_13643() + f2, class_13635.Method_13640());
        class_27288.Method_27325(class_136352);
        class_13635 = class_27288.Method_27344();
        f = random.nextFloat() * (4.3333335f * 2.3076923f) - 0.2542373f * 19.666666f;
        class_136352 = new Class_13635(class_13635.Method_13644(), class_13635.Method_13643() + f, class_13635.Method_13640());
        class_27288.Method_27329(class_136352);
    }

    private void Method_2033() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_2031() {
        this.\u0000strictfp(Class_3987.Field_3995);
    }

    public boolean Method_2034(Class_23823 class_23823, Class_626 class_626, Class_283 class_283, Class_4751 class_4751, Class_4595 class_4595, float f, float f2, float f3) {
        double d;
        Class_4751 class_47512;
        double d2;
        if (class_4595 == Class_4595.Field_4615) {
            return (16916 & -24510) != 0;
        }
        boolean bl = class_283.Method_375(class_4751).Method_3442().Method_3393(class_283, class_4751);
        Class_4751 class_47513 = class_47512 = bl ? class_4751 : class_4751.Method_4765(class_4595);
        if (!class_626.Method_794(class_47512, class_4595, class_23823)) {
            return (20546 & 10384) != 0;
        }
        Class_4751 class_47514 = class_47512.Method_4769();
        int n = !class_283.Method_507(class_47512) && !class_283.Method_375(class_47512).Method_3442().Method_3393(class_283, class_47512) ? 4233 & -30907 : 417 & -28156;
        if ((n |= !class_283.Method_507(class_47514) && !class_283.Method_375(class_47514).Method_3442().Method_3393(class_283, class_47514) ? 13313 & 2203 : -32560 & 11810) != 0) {
            return (422 & 2577) != 0;
        }
        double d3 = class_47512.\u0000= final();
        ArrayList arrayList = class_283.Method_473(null, Class_10997.Method_11019(d3, d = (double)class_47512.\u0000, `(), d2 = (double)class_47512.\u0000strictfp(), d3 + 1.0, d + 2.625 * 0.7619047619047619, d2 + 1.0));
        if (arrayList.size() > 0) {
            return (2082 & -22780) != 0;
        }
        if (!class_283.Field_306) {
            class_283.Method_472(class_47512);
            class_283.Method_472(class_47514);
            Class_27288 class_27288 = new Class_27288(class_283, d3 + 0.7647058823529411 * 0.6538461538461539, d, d2 + 0.7833333333333333 * 0.6382978723404256);
            float f4 = (float)Class_13337.Method_13377((Class_13337.Method_13354(class_626.\u0000= ? - 423.24323f * 0.42528737f) + 1.5f * 15.0f) / (202.5f * 0.22222222f)) * (6.0f * 7.5f);
            class_27288.\u0000, `(d3 + 0.13999999999999999 * 3.5714285714285716, d, d2 + 0.7297297297297297 * 0.6851851851851852, f4, 0.0f);
            this.Method_2032(class_27288, class_283.Field_307);
            Class_1699 class_1699 = class_23823.Method_23845();
            if (class_1699 != null && class_1699.Method_1715("EntityTag", 2154 & 270)) {
                Class_1699 class_16992 = new Class_1699();
                class_27288.\u0000, `(class_16992);
                class_16992.Method_1730(class_1699.Method_1703("EntityTag"));
                class_27288.\u0000%(class_16992);
            }
            class_283.Method_350(class_27288);
        }
        class_23823.Field_23826 -= 881 & -27647;
        return (16777 & 1) != 0;
    }
}

