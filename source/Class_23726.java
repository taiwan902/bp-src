/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Class_23726
extends Class_1956 {
    private void Method_23727() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_23728(Class_23823 class_23823, Class_626 class_626, Class_283 class_283, Class_4751 class_4751, Class_4595 class_4595, float f, float f2, float f3) {
        Class_4879 class_4879;
        Class_1061 class_1061;
        if (class_283.Field_306) {
            return (65 & -6995) != 0;
        }
        if (!class_626.Method_794(class_4751.Method_4765(class_4595), class_4595, class_23823)) {
            return (8322 & 16449) != 0;
        }
        Class_3436 class_3436 = class_283.Method_375(class_4751);
        if (class_3436.Method_3442() == Class_9265.Field_9279 && (class_4879 = class_283.Method_429(class_4751)) instanceof Class_36325) {
            Class_20870 class_20870 = ((Class_36325)class_4879).Method_36333();
            class_20870.Method_20894(Class_15516.Method_15571(class_23823.Method_23843()));
            class_4879.Method_4922();
            class_283.Method_416(class_4751);
            if (!class_626.Field_694.Method_18094()) {
                class_23823.Field_23826 -= 961 & 28721;
            }
            return (8283 & 1) != 0;
        }
        class_4751 = class_4751.Method_4765(class_4595);
        double d = 0.0;
        if (class_4595 == Class_4595.Field_4601 && class_3436 instanceof Class_27820) {
            d = 1.7105263157894737 * 0.2923076923076923;
        }
        if ((class_1061 = Class_23726.Method_23729(class_283, class_23823.Method_23843(), (double)class_4751.\u0000= final() + 0.4461538461538462 * 1.1206896551724137, (double)class_4751.\u0000, `() + d, (double)class_4751.\u0000strictfp() + 1.03125 * 0.48484848484848486)) != null) {
            if (class_1061 instanceof Class_859 && class_23823.Method_23851()) {
                class_1061.Method_1256(class_23823.Method_23899());
            }
            if (!class_626.Field_694.Method_18094()) {
                class_23823.Field_23826 -= 17 & 261;
            }
        }
        return (137 & 5653) != 0;
    }

    public static Class_1061 Method_23729(Class_283 class_283, int n, double d, double d2, double d3) {
        if (!Class_15516.Field_15520.containsKey(n)) {
            return null;
        }
        Class_1061 class_1061 = null;
        for (int i = 24745 & -27648; i < (18441 & 8199); ++i) {
            class_1061 = Class_15516.Method_15534(n, class_283);
            if (!(class_1061 instanceof Class_859)) continue;
            Class_34093 class_34093 = (Class_34093)class_1061;
            class_1061.Method_1239(d, d2, d3, Class_13337.Method_13354(class_283.Field_307.nextFloat() * (734.4f * 0.49019608f)), 0.0f);
            class_34093.\u0000= # = class_34093.\u0000= ?;
            class_34093.\u0000super = class_34093.\u0000= ?;
            class_34093.Method_34169(class_283.Method_364(new Class_4751(class_34093)), null);
            class_283.Method_350(class_1061);
            class_34093.Method_34134();
        }
        return class_1061;
    }

    public Class_23726() {
        this.\u0000strictfp((2309 & 137) != 0);
        this.\u0000strictfp(Class_3987.Field_4003);
    }

    public String Method_23730(Class_23823 class_23823) {
        String string = ("" + Class_7594.Method_7602(this.\u0000strictfp() + ".name")).trim();
        String string2 = Class_15516.Method_15571(class_23823.Method_23843());
        if (string2 != null) {
            string = string + " " + Class_7594.Method_7602("entity." + string2 + ".name");
        }
        return string;
    }

    public Class_23823 Method_23731(Class_23823 class_23823, Class_283 class_283, Class_626 class_626) {
        if (class_283.Field_306) {
            return class_23823;
        }
        Class_37110 class_37110 = this.\u0000strictfp(class_283, class_626, (-4011 & 257) != 0);
        if (class_37110 == null) {
            return class_23823;
        }
        if (class_37110.Field_37112 == Class_7192.Field_7193) {
            Class_1061 class_1061;
            Class_4751 class_4751 = class_37110.Method_37118();
            if (!class_283.Method_335(class_626, class_4751)) {
                return class_23823;
            }
            if (!class_626.Method_794(class_4751, class_37110.Field_37111, class_23823)) {
                return class_23823;
            }
            if (class_283.Method_375(class_4751).Method_3442() instanceof Class_4415 && (class_1061 = Class_23726.Method_23729(class_283, class_23823.Method_23843(), (double)class_4751.\u0000= final() + 1.25 * 0.4, (double)class_4751.\u0000, `() + 1.2545454545454546 * 0.39855072463768115, (double)class_4751.\u0000strictfp() + 7.833333333333333 * 0.06382978723404256)) != null) {
                if (class_1061 instanceof Class_859 && class_23823.Method_23851()) {
                    ((Class_34093)class_1061).\u0000= final(class_23823.Method_23899());
                }
                if (!class_626.Field_694.Method_18094()) {
                    class_23823.Field_23826 -= 6585 & 515;
                }
                class_626.Method_750(Class_19863.Field_19917[Class_1956.Method_1986(this)]);
            }
        }
        return class_23823;
    }

    public void Method_23732(Class_1956 class_1956, Class_3987 class_3987, List list) {
        for (Class_7898 class_7898 : Class_15516.Field_15520.values()) {
            list.add(new Class_23823(class_1956, -32759 & 3265, class_7898.Field_7899));
        }
    }

    public int Method_23733(Class_23823 class_23823, int n) {
        Class_7898 class_7898 = (Class_7898)Class_15516.Field_15520.get(class_23823.Method_23843());
        return class_7898 != null ? (n == 0 ? class_7898.Field_7900 : class_7898.Field_7902) : 16777215 & -1040187393;
    }
}

