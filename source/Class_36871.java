/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Class_36871
extends Class_5834 {
    private final boolean Field_36872;
    private static Map Field_36873 = Maps.newHashMap();

    public void Method_36874(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Random random) {
    }

    public Class_1956 Method_36875(Class_3436 class_3436, Random random, int n) {
        return Class_1956.Method_1981(Class_9265.Field_9273);
    }

    public void Method_36876(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Random random) {
        boolean bl = this.Method_36886(class_283, class_4751, class_3436);
        List list = (List)Field_36873.get(class_283);
        while (list != null && !list.isEmpty() && class_283.Method_363() - ((Class_16499)list.get((int)(-25964 & 8201))).Field_16501 > (9124734443165723324L & -9124734443372609476L)) {
            list.remove(66 & -8184);
        }
        if (this.Field_36872) {
            if (bl) {
                class_283.Method_462(class_4751, Class_9265.Field_9461.Method_3293().Method_3685(\u0000strictfp, class_3436.Method_3440(\u0000strictfp)), -8189 & 5023);
                if (this.Method_36883(class_283, class_4751, (2753 & 16399) != 0)) {
                    class_283.Method_475((float)class_4751.\u0000= final() + 7.0f * 0.071428575f, (float)class_4751.\u0000, `() + 0.7934783f * 0.63013697f, (float)class_4751.\u0000strictfp() + 1.375f * 0.36363637f, "random.fizz", 1.32f * 0.37878788f, 0.9423077f * 2.7591834f + (class_283.Field_307.nextFloat() - class_283.Field_307.nextFloat()) * (2.8f * 0.2857143f));
                    for (int i = 3077 & 522; i < (4871 & -6003); ++i) {
                        double d = (double)class_4751.\u0000= final() + random.nextDouble() * (0.4769230769230769 * 1.2580645161290323) + 4.235294117647059 * 0.04722222222222222;
                        double d2 = (double)class_4751.\u0000, `() + random.nextDouble() * (0.06947368421052631 * 8.636363636363637) + 1.0804597701149425 * 0.18510638297872342;
                        double d3 = (double)class_4751.\u0000strictfp() + random.nextDouble() * (1.0909090909090908 * 0.55) + 0.37727272727272726 * 0.5301204819277109;
                        class_283.Method_407(Class_40274.Field_40283, d, d2, d3, 0.0, 0.0, 0.0, new int[2834 & 8200]);
                    }
                    class_283.Method_441(class_4751, class_283.Method_375(class_4751).Method_3442(), 3234 & -27928);
                }
            }
        } else if (!bl && !this.Method_36883(class_283, class_4751, (3712 & -32461) != 0)) {
            class_283.Method_462(class_4751, Class_9265.Field_9273.Method_3293().Method_3685(\u0000strictfp, class_3436.Method_3440(\u0000strictfp)), 5443 & -32749);
        }
    }

    public Class_1956 Method_36877(Class_283 class_283, Class_4751 class_4751) {
        return Class_1956.Method_1981(Class_9265.Field_9273);
    }

    public boolean Method_36878(Class_3238 class_3238) {
        return (class_3238 == Class_9265.Field_9461 || class_3238 == Class_9265.Field_9273 ? 19 & -3579 : 773 & -31608) != 0;
    }

    public void Method_36879(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436) {
        if (this.Field_36872) {
            Class_4595[] arrclass_4595 = Class_4595.Field_4600;
            int n = arrclass_4595.length;
            for (int i = -29689 & 20528; i < n; ++i) {
                Class_4595 class_4595 = arrclass_4595[i];
                class_283.Method_525(class_4751.Method_4765(class_4595), this);
            }
        }
    }

    public boolean Method_36880() {
        return (-32671 & 16415) != 0;
    }

    public void Method_36881(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436) {
        if (this.Field_36872) {
            Class_4595[] arrclass_4595 = Class_4595.Field_4600;
            int n = arrclass_4595.length;
            for (int i = 4232 & 2307; i < n; ++i) {
                Class_4595 class_4595 = arrclass_4595[i];
                class_283.Method_525(class_4751.Method_4765(class_4595), this);
            }
        }
    }

    public void Method_36882(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Random random) {
        if (this.Field_36872) {
            double d = (double)class_4751.\u0000= final() + 0.8200000000000001 * 0.6097560975609756 + (random.nextDouble() - 2.0384615384615383 * 0.24528301886792456) * (1.6 * 0.125);
            double d2 = (double)class_4751.\u0000, `() + 1.65 * 0.42424242424242425 + (random.nextDouble() - 1.3658536585365855 * 0.36607142857142855) * (1.1904761904761905 * 0.168);
            double d3 = (double)class_4751.\u0000strictfp() + 0.8571428571428571 * 0.5833333333333334 + (random.nextDouble() - 0.851063829787234 * 0.5875) * (0.24307692307692308 * 0.8227848101265823);
            Class_4595 class_4595 = (Class_4595)((Object)class_3436.Method_3440(\u0000strictfp));
            if (class_4595.Method_4640().Method_4581()) {
                Class_4595 class_45952 = class_4595.Method_4660();
                double d4 = 0.36900000000000005 * 0.7317073170731707;
                d += 0.2413793103448276 * 1.1185714285714285 * (double)class_45952.Method_4654();
                d2 += 0.21633333333333335 * 1.0169491525423728;
                d3 += 0.8072289156626506 * 0.3344776119402985 * (double)class_45952.Method_4656();
            }
            class_283.Method_407(Class_40274.Field_40297, d, d2, d3, 0.0, 0.0, 0.0, new int[24599 & 776]);
        }
    }

    protected Class_36871(boolean bl) {
        this.Field_36872 = bl;
        this.\u0000strictfp((25153 & 7181) != 0);
        this.\u0000strictfp((Class_3987)null);
    }

    private boolean Method_36883(Class_283 class_283, Class_4751 class_4751, boolean bl) {
        if (!Field_36873.containsKey(class_283)) {
            Field_36873.put(class_283, Lists.newArrayList());
        }
        List list = (List)Field_36873.get(class_283);
        if (bl) {
            list.add(new Class_16499(class_4751, class_283.Method_363()));
        }
        int n = -26510 & 8192;
        for (int i = 386 & 24077; i < list.size(); ++i) {
            Class_16499 class_16499 = (Class_16499)list.get(i);
            if (!class_16499.Field_16500.equals(class_4751) || ++n < (26522 & -30712)) continue;
            return (17441 & 133) != 0;
        }
        return (20874 & 49) != 0;
    }

    public int Method_36884(Class_283 class_283) {
        return 8710 & -16214;
    }

    public void Method_36885(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Class_3238 class_3238) {
        if (!this.\u0000, `(class_283, class_4751, class_3436) && this.Field_36872 == this.Method_36886(class_283, class_4751, class_3436)) {
            class_283.Method_441(class_4751, this, this.Method_36884(class_283));
        }
    }

    private boolean Method_36886(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436) {
        Class_4595 class_4595 = ((Class_4595)((Object)class_3436.Method_3440(\u0000strictfp))).Method_4660();
        return class_283.Method_420(class_4751.Method_4765(class_4595), class_4595);
    }

    public int Method_36887(Class_561 class_561, Class_4751 class_4751, Class_3436 class_3436, Class_4595 class_4595) {
        return class_4595 == Class_4595.Field_4615 ? this.Method_36888(class_561, class_4751, class_3436, class_4595) : -15868 & 12296;
    }

    public int Method_36888(Class_561 class_561, Class_4751 class_4751, Class_3436 class_3436, Class_4595 class_4595) {
        return this.Field_36872 && class_3436.Method_3440(\u0000strictfp) != class_4595 ? 2447 & 4111 : 24848 & -31738;
    }

    private void Method_36889() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

