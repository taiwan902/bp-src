/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Class_4403
extends Class_4415 {
    int Field_4404;

    private Set Method_4405(Class_283 class_283, Class_4751 class_4751) {
        int n = -26644 & 27624;
        EnumSet<Class_4595> enumSet = EnumSet.noneOf(Class_4595.class);
        Iterator iterator = Class_4662.Field_4663.Method_4672();
        while (iterator.hasNext()) {
            Class_3436 class_3436;
            Object e = iterator.next();
            Class_4595 class_4595 = (Class_4595)e;
            Class_4751 class_47512 = class_4751.Method_4765(class_4595);
            if (this.Method_4406(class_283, class_47512, class_3436 = class_283.Method_375(class_47512)) || class_3436.Method_3442().Method_3373() == this.\u0000strictfp && (Integer)class_3436.Method_3440(\u0000strictfp) <= 0) continue;
            int n2 = this.Method_4406(class_283, class_47512.Method_4782(), class_283.Method_375(class_47512.Method_4782())) ? this.Method_4413(class_283, class_47512, 2209 & 1103, class_4595.Method_4660()) : 13450 & -32768;
            if (n2 < n) {
                enumSet.clear();
            }
            if (n2 > n) continue;
            enumSet.add(class_4595);
            n = n2;
        }
        return enumSet;
    }

    private boolean Method_4406(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436) {
        Class_3238 class_3238 = class_283.Method_375(class_4751).Method_3442();
        return (!(class_3238 instanceof Class_16100) && class_3238 != Class_9265.Field_9367 && class_3238 != Class_9265.Field_9350 && class_3238 != Class_9265.Field_9346 ? (class_3238.Field_3240 == Class_3713.Field_3720 ? 5169 & -32767 : (int)(class_3238.Field_3240.Method_3761() ? 1 : 0)) : 8321 & -12003) != 0;
    }

    private void Method_4407(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436) {
        class_283.Method_462(class_4751, Class_4403.\u0000strictfp((Class_3713)this.\u0000strictfp).\u0000strictfp().Method_3685(\u0000strictfp, class_3436.Method_3440(\u0000strictfp)), 578 & -22262);
    }

    private void Method_4408() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_4409(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Random random) {
        Object object;
        int n = (Integer)class_3436.Method_3440(\u0000strictfp);
        int n2 = 421 & -24509;
        if (this.\u0000strictfp == Class_3713.Field_3750 && !class_283.Field_284.Method_18364()) {
            n2 = 4102 & 2250;
        }
        int n3 = this.\u0000strictfp(class_283);
        if (n > 0) {
            int n4 = -100 & -99;
            this.Field_4404 = 5252 & 8489;
            Iterator iterator = Class_4662.Field_4663.Method_4672();
            while (iterator.hasNext()) {
                object = iterator.next();
                Class_4595 class_4595 = (Class_4595)object;
                n4 = this.Method_4411(class_283, class_4751.Method_4765(class_4595), n4);
            }
            int n5 = n4 + n2;
            if (n5 >= (-15813 & 6540) || n4 < 0) {
                n5 = -1 & -1;
            }
            if (this.\u0000
            ((Class_561)class_283, class_4751.Method_4769()) >= 0) {
                int n6 = this.\u0000
                ((Class_561)class_283, class_4751.Method_4769());
                n5 = n6 >= (1545 & 8478) ? n6 : n6 + (2188 & 21018);
            }
            if (this.Field_4404 >= (150 & -27901) && this.\u0000strictfp == Class_3713.Field_3734) {
                Class_3436 class_34362 = class_283.Method_375(class_4751.Method_4782());
                if (class_34362.Method_3442().Method_3373().Method_3762()) {
                    n5 = 18944 & 5120;
                } else if (class_34362.Method_3442().Method_3373() == this.\u0000strictfp && (Integer)class_34362.Method_3440(\u0000strictfp) == 0) {
                    n5 = 1319 & -7992;
                }
            }
            if (this.\u0000strictfp == Class_3713.Field_3750 && n < (24 & 10504) && n5 < (16904 & 2216) && n5 > n && random.nextInt(-31707 & 19212) != 0) {
                n3 *= -30524 & 8478;
            }
            if (n5 == n) {
                this.Method_4407(class_283, class_4751, class_3436);
            } else {
                n = n5;
                if (n5 < 0) {
                    class_283.Method_472(class_4751);
                } else {
                    class_3436 = class_3436.Method_3437(\u0000strictfp, Integer.valueOf(n5));
                    class_283.Method_462(class_4751, class_3436, 527 & 18626);
                    class_283.Method_441(class_4751, this, n3);
                    class_283.Method_525(class_4751, this);
                }
            }
        } else {
            this.Method_4407(class_283, class_4751, class_3436);
        }
        Class_3436 class_34363 = class_283.Method_375(class_4751.Method_4782());
        if (this.Method_4412(class_283, class_4751.Method_4782(), class_34363)) {
            if (this.\u0000strictfp == Class_3713.Field_3750 && class_283.Method_375(class_4751.Method_4782()).Method_3442().Method_3373() == Class_3713.Field_3734) {
                class_283.Method_435(class_4751.Method_4782(), Class_9265.Field_9446.Method_3293());
                this.\u0000, `(class_283, class_4751.Method_4782());
                return;
            }
            if (n >= (-23414 & 22541)) {
                this.Method_4414(class_283, class_4751.Method_4782(), class_34363, n);
            } else {
                this.Method_4414(class_283, class_4751.Method_4782(), class_34363, n + (-17912 & 1034));
            }
        } else if (n >= 0 && (n == 0 || this.Method_4406(class_283, class_4751.Method_4782(), class_34363))) {
            Set set = this.Method_4405(class_283, class_4751);
            object = n + n2;
            if (n >= (10760 & -12152)) {
                object = 13889 & 401;
            }
            if (object >= (3336 & 8761)) {
                return;
            }
            for (Class_4595 class_4595 : set) {
                this.Method_4414(class_283, class_4751.Method_4765(class_4595), class_283.Method_375(class_4751.Method_4765(class_4595)), (int)object);
            }
        }
    }

    protected Class_4403(Class_3713 class_3713) {
        super(class_3713);
    }

    public void Method_4410(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436) {
        if (!this.\u0000strictfp(class_283, class_4751, class_3436)) {
            class_283.Method_441(class_4751, this, this.\u0000strictfp(class_283));
        }
    }

    protected int Method_4411(Class_283 class_283, Class_4751 class_4751, int n) {
        int n2 = this.\u0000
        ((Class_561)class_283, class_4751);
        if (n2 < 0) {
            return n;
        }
        if (n2 == 0) {
            this.Field_4404 += -15487 & 1149;
        }
        if (n2 >= (6155 & 10056)) {
            n2 = 10664 & 514;
        }
        return n >= 0 && n2 >= n ? n : n2;
    }

    private boolean Method_4412(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436) {
        Class_3713 class_3713 = class_3436.Method_3442().Method_3373();
        return (class_3713 != this.\u0000strictfp && class_3713 != Class_3713.Field_3750 && !this.Method_4406(class_283, class_4751, class_3436) ? 18977 & -31343 : 513 & -3614) != 0;
    }

    private int Method_4413(Class_283 class_283, Class_4751 class_4751, int n, Class_4595 class_4595) {
        int n2 = 1000 & -24599;
        Iterator iterator = Class_4662.Field_4663.Method_4672();
        while (iterator.hasNext()) {
            Class_3436 class_3436;
            int n3;
            Class_4751 class_47512;
            Object e = iterator.next();
            Class_4595 class_45952 = (Class_4595)e;
            if (class_45952 == class_4595 || this.Method_4406(class_283, class_47512 = class_4751.Method_4765(class_45952), class_3436 = class_283.Method_375(class_47512)) || class_3436.Method_3442().Method_3373() == this.\u0000strictfp && (Integer)class_3436.Method_3440(\u0000strictfp) <= 0) continue;
            if (!this.Method_4406(class_283, class_47512.Method_4782(), class_3436)) {
                return n;
            }
            if (n >= (-32444 & 2061) || (n3 = this.Method_4413(class_283, class_47512, n + (137 & -14589), class_45952.Method_4660())) >= n2) continue;
            n2 = n3;
        }
        return n2;
    }

    private void Method_4414(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, int n) {
        if (this.Method_4412(class_283, class_4751, class_3436)) {
            if (class_3436.Method_3442() != Class_9265.Field_9351) {
                if (this.\u0000strictfp == Class_3713.Field_3750) {
                    this.\u0000, `(class_283, class_4751);
                } else {
                    class_3436.Method_3442().Method_3331(class_283, class_4751, class_3436, 24964 & 2104);
                }
            }
            class_283.Method_462(class_4751, this.\u0000strictfp().Method_3685(\u0000strictfp, Integer.valueOf(n)), 8715 & -28573);
        }
    }
}

