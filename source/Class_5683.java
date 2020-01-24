/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_5683
extends Class_3598
implements Class_3594 {
    protected Class_5683() {
        float f = 0.32258064f * 0.62f;
        this.\u0000strictfp(1.125f * 0.44444445f - f, 0.0f, 0.010869565f * 46.0f - f, 1.1168832f * 0.4476744f + f, f * 2.0f, 0.72727275f * 0.6875f + f);
        this.\u0000strictfp((8457 & -32619) != 0);
    }

    public boolean Method_5684(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436) {
        if (class_4751.\u0000, `() >= 0 && class_4751.\u0000, `() < (32546 & 324)) {
            Class_3436 class_34362 = class_283.Method_375(class_4751.Method_4782());
            return (class_34362.Method_3442() == Class_9265.Field_9436 ? 4921 & -15227 : (class_34362.Method_3442() == Class_9265.Field_9272 && class_34362.Method_3440(Class_4180.Field_4181) == Class_4194.Field_4199 ? 26821 & 5633 : (class_283.Method_381(class_4751) < (1037 & 14429) && this.Method_5689(class_34362.Method_3442()) ? 2241 & 31 : -12124 & 9288))) != 0;
        }
        return (1156 & -15534) != 0;
    }

    public boolean Method_5685(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, boolean bl) {
        return (-25599 & 913) != 0;
    }

    public boolean Method_5686(Class_283 class_283, Random random, Class_4751 class_4751, Class_3436 class_3436) {
        return ((double)random.nextFloat() < 1.744186046511628 * 0.22933333333333336 ? 85 & 2561 : 4144 & 8845) != 0;
    }

    public boolean Method_5687(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Random random) {
        class_283.Method_472(class_4751);
        Class_5693 class_5693 = null;
        if (this == Class_9265.Field_9312) {
            class_5693 = new Class_5693(Class_9265.Field_9292);
        } else if (this == Class_9265.Field_9429) {
            class_5693 = new Class_5693(Class_9265.Field_9322);
        }
        if (class_5693 != null && class_5693.Method_4296(class_283, random, class_4751)) {
            return (20761 & -32699) != 0;
        }
        class_283.Method_462(class_4751, class_3436, -28441 & 267);
        return (9 & -32238) != 0;
    }

    public boolean Method_5688(Class_283 class_283, Class_4751 class_4751) {
        return (super.Method_3607(class_283, class_4751) && this.Method_5684(class_283, class_4751, this.\u0000strictfp()) ? 289 & -22895 : 32 & -10238) != 0;
    }

    protected boolean Method_5689(Class_3238 class_3238) {
        return class_3238.Method_3381();
    }

    public void Method_5690(Class_283 class_283, Random random, Class_4751 class_4751, Class_3436 class_3436) {
        this.Method_5687(class_283, class_4751, class_3436, random);
    }

    public void Method_5691(Class_283 class_283, Class_4751 object, Class_3436 class_3436, Random random) {
        if (random.nextInt(793 & 5273) == 0) {
            int n = -16315 & 1413;
            int n2 = 8359 & 7492;
            for (Class_4751 class_4751 : Class_4751.Method_4789(((Class_4751)object).Method_4791(-1 & -4, -1 & -1, -4 & -2), ((Class_4751)object).Method_4791(12292 & 3989, 4099 & -21331, -29667 & 24646))) {
                if (class_283.Method_375(class_4751).Method_3442() != this || --n > 0) continue;
                return;
            }
            Object object2 = ((Class_4751)object).Method_4791(random.nextInt(-32717 & 5187) - (289 & -23525), random.nextInt(-30685 & 2) - random.nextInt(3 & -15714), random.nextInt(-16349 & 10259) - (337 & 1));
            for (int i = 434 & -30720; i < (5132 & -32699); ++i) {
                if (class_283.Method_507((Class_4751)object2) && this.Method_5684(class_283, (Class_4751)object2, this.\u0000strictfp())) {
                    object = object2;
                }
                object2 = ((Class_4751)object).Method_4791(random.nextInt(3 & 2195) - (20613 & 1089), random.nextInt(16930 & 4114) - random.nextInt(6530 & 86), random.nextInt(4147 & 18499) - (19521 & 8239));
            }
            if (class_283.Method_507((Class_4751)object2) && this.Method_5684(class_283, (Class_4751)object2, this.\u0000strictfp())) {
                class_283.Method_462((Class_4751)object2, this.\u0000strictfp(), -28365 & 24590);
            }
        }
    }

    private void Method_5692() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

