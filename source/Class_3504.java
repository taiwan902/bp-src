/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;
import net.minecraft.util.Vec3;

public class Class_3504
extends Class_3529 {
    public static final Class_5011 Field_3505 = Class_5285.Field_5287;
    public static final Class_3957 Field_3506 = Class_5285.Field_5288;

    public boolean Method_3507(Class_283 class_283, Class_4751 class_4751) {
        return (-28160 & 11) != 0;
    }

    public Class_1956 Method_3508(Class_3436 class_3436, Random random, int n) {
        return null;
    }

    public void Method_3509(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Class_3238 class_3238) {
        if (!class_283.Field_306) {
            class_283.Method_429(class_4751);
        }
    }

    public Class_4879 Method_3510(Class_283 class_283, int n) {
        return null;
    }

    public Class_1956 Method_3511(Class_283 class_283, Class_4751 class_4751) {
        return null;
    }

    public Class_3504() {
        super(Class_3713.Field_3738);
        this.\u0000strictfp(this.\u0000strictfp.Method_3867().Method_3437(Field_3505, (Comparable)((Object)Class_4595.Field_4598)).Method_3437(Field_3506, (Comparable)((Object)Class_5369.Field_5372)));
        this.\u0000= final(-1.4074075f * 0.7105263f);
    }

    public void Method_3512(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436) {
        Class_4879 class_4879 = class_283.Method_429(class_4751);
        if (class_4879 instanceof Class_5568) {
            ((Class_5568)class_4879).Method_5578();
        } else {
            super.Method_3531(class_283, class_4751, class_3436);
        }
    }

    public boolean Method_3513(Class_283 class_283, Class_4751 class_4751, Class_4595 class_4595) {
        return (-31739 & 408) != 0;
    }

    public Class_10997 Method_3514(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436) {
        Class_5568 class_5568 = this.Method_3525(class_283, class_4751);
        if (class_5568 == null) {
            return null;
        }
        float f = class_5568.Method_5581(0.0f);
        if (class_5568.Method_5584()) {
            f = 1.0f - f;
        }
        return this.Method_3528(class_283, class_4751, class_5568.Method_5589(), f, class_5568.Method_5588());
    }

    public void Method_3515(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, float f, int n) {
        Class_5568 class_5568;
        if (!class_283.Field_306 && (class_5568 = this.Method_3525(class_283, class_4751)) != null) {
            Class_3436 class_34362 = class_5568.Method_5589();
            class_34362.Method_3442().Method_3331(class_283, class_4751, class_34362, 0 & 13096);
        }
    }

    public static Class_4879 Method_3516(Class_3436 class_3436, Class_4595 class_4595, boolean bl, boolean bl2) {
        return new Class_5568(class_3436, class_4595, bl, bl2);
    }

    public void Method_3517(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436) {
        Class_4751 class_47512 = class_4751.Method_4765(((Class_4595)((Object)class_3436.Method_3440(Field_3505))).Method_4660());
        Class_3436 class_34362 = class_283.Method_375(class_47512);
        if (class_34362.Method_3442() instanceof Class_5257 && ((Boolean)class_34362.Method_3440(Class_5257.Field_5260)).booleanValue()) {
            class_283.Method_472(class_47512);
        }
    }

    public boolean Method_3518(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Class_626 class_626, Class_4595 class_4595, float f, float f2, float f3) {
        if (!class_283.Field_306 && class_283.Method_429(class_4751) == null) {
            class_283.Method_472(class_4751);
            return (4105 & 2469) != 0;
        }
        return (22040 & 161) != 0;
    }

    public Class_37110 Method_3519(Class_283 class_283, Class_4751 class_4751, Vec3 vec3, Vec3 vec32) {
        return null;
    }

    public boolean Method_3520() {
        return (16648 & 12353) != 0;
    }

    protected Class_3855 Method_3521() {
        Class_3538[] arrclass_3538 = new Class_3538[16418 & 5134];
        arrclass_3538[256 & -24562] = Field_3505;
        arrclass_3538[16405 & -32511] = Field_3506;
        return new Class_3855(this, arrclass_3538);
    }

    public void Method_3522(Class_561 class_561, Class_4751 class_4751) {
        Class_5568 class_5568 = this.Method_3525(class_561, class_4751);
        if (class_5568 != null) {
            Class_3436 class_3436 = class_5568.Method_5589();
            Class_3238 class_3238 = class_3436.Method_3442();
            if (class_3238 == this || class_3238.Method_3373() == Class_3713.Field_3718) {
                return;
            }
            float f = class_5568.Method_5581(0.0f);
            if (class_5568.Method_5584()) {
                f = 1.0f - f;
            }
            class_3238.Method_3382(class_561, class_4751);
            if (class_3238 == Class_9265.Field_9270 || class_3238 == Class_9265.Field_9341) {
                f = 0.0f;
            }
            Class_4595 class_4595 = class_5568.Method_5588();
            this.\u0000% = class_3238.Method_3352() - (double)((float)class_4595.Method_4654() * f);
            this.\u0000, for = class_3238.Method_3324() - (double)((float)class_4595.Method_4633() * f);
            this.\u0000= final = class_3238.Method_3315() - (double)((float)class_4595.Method_4656() * f);
            this.\u0000, ` = class_3238.Method_3379() - (double)((float)class_4595.Method_4654() * f);
            this.\u0000strictfp = class_3238.Method_3337() - (double)((float)class_4595.Method_4633() * f);
            this.\u0000
             = class_3238.Method_3291() - (double)((float)class_4595.Method_4656() * f);
        }
    }

    public boolean Method_3523() {
        return (-10096 & 8192) != 0;
    }

    public int Method_3524(Class_3436 class_3436) {
        int n = 5120 & 8709;
        n |= ((Class_4595)((Object)class_3436.Method_3440(Field_3505))).Method_4648();
        if (class_3436.Method_3440(Field_3506) == Class_5369.Field_5373) {
            n |= 1032 & -26344;
        }
        return n;
    }

    private Class_5568 Method_3525(Class_561 class_561, Class_4751 class_4751) {
        Class_4879 class_4879 = class_561.Method_562(class_4751);
        return class_4879 instanceof Class_5568 ? (Class_5568)class_4879 : null;
    }

    private void Method_3526() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_3436 Method_3527(int n) {
        return this.\u0000strictfp().Method_3685(Field_3505, (Comparable)((Object)Class_5285.Method_5299(n))).Method_3437(Field_3506, (Comparable)((Object)((n & (-15864 & 4153)) > 0 ? Class_5369.Field_5373 : Class_5369.Field_5372)));
    }

    public Class_10997 Method_3528(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, float f, Class_4595 class_4595) {
        if (class_3436.Method_3442() != this && class_3436.Method_3442().Method_3373() != Class_3713.Field_3718) {
            Class_10997 class_10997 = class_3436.Method_3442().Method_3285(class_283, class_4751, class_3436);
            if (class_10997 == null) {
                return null;
            }
            double d = class_10997.Field_10999;
            double d2 = class_10997.Field_11000;
            double d3 = class_10997.Field_11001;
            double d4 = class_10997.Field_11002;
            double d5 = class_10997.Field_10998;
            double d6 = class_10997.Field_11003;
            if (class_4595.Method_4654() < 0) {
                d -= (double)((float)class_4595.Method_4654() * f);
            } else {
                d4 -= (double)((float)class_4595.Method_4654() * f);
            }
            if (class_4595.Method_4633() < 0) {
                d2 -= (double)((float)class_4595.Method_4633() * f);
            } else {
                d5 -= (double)((float)class_4595.Method_4633() * f);
            }
            if (class_4595.Method_4656() < 0) {
                d3 -= (double)((float)class_4595.Method_4656() * f);
            } else {
                d6 -= (double)((float)class_4595.Method_4656() * f);
            }
            return new Class_10997(d, d2, d3, d4, d5, d6);
        }
        return null;
    }
}

