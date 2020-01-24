/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public abstract class Class_20678
extends Class_5133 {
    protected final boolean Field_20679;

    public boolean Method_20680() {
        return (0 & 13782) != 0;
    }

    public boolean Method_20681(Class_283 class_283, Class_4751 class_4751) {
        return (Class_283.Method_538(class_283, class_4751.Method_4782()) ? (int)(super.\u0000, `(class_283, class_4751) ? 1 : 0) : -22396 & 17968) != 0;
    }

    public boolean Method_20682() {
        return (1029 & 19105) != 0;
    }

    public void Method_20683(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Random random) {
        if (!this.Method_20700(class_283, class_4751, class_3436)) {
            boolean bl = this.Method_20690(class_283, class_4751, class_3436);
            if (this.Field_20679 && !bl) {
                class_283.Method_462(class_4751, this.Method_20684(class_3436), 4438 & 16938);
            } else if (!this.Field_20679) {
                class_283.Method_462(class_4751, this.Method_20688(class_3436), 2098 & -2942);
                if (!bl) {
                    class_283.Method_446(class_4751, this.Method_20688(class_3436).Method_3442(), this.Method_20694(class_3436), -1 & -1);
                }
            }
        }
    }

    protected abstract Class_3436 Method_20684(Class_3436 var1);

    public boolean Method_20685(Class_3238 class_3238) {
        return this.Method_20698(class_3238);
    }

    protected int Method_20686(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436) {
        Class_4595 class_4595 = (Class_4595)((Object)class_3436.Method_3440(\u0000strictfp));
        Class_4751 class_47512 = class_4751.Method_4765(class_4595);
        int n = class_283.Method_355(class_47512, class_4595);
        if (n >= (10655 & 16463)) {
            return n;
        }
        Class_3436 class_34362 = class_283.Method_375(class_47512);
        return Math.max(n, class_34362.Method_3442() == Class_9265.Field_9443 ? (Integer)class_34362.Method_3440(Class_17176.Field_17182) : 1412 & 544);
    }

    public boolean Method_20687() {
        return (8262 & 129) != 0;
    }

    protected abstract Class_3436 Method_20688(Class_3436 var1);

    protected void Method_20689(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436) {
        if (!this.Method_20700(class_283, class_4751, class_3436)) {
            boolean bl = this.Method_20690(class_283, class_4751, class_3436);
            if ((this.Field_20679 && !bl || !this.Field_20679 && bl) && !class_283.Method_436(class_4751, this)) {
                int n = -1 & -1;
                if (this.Method_20705(class_283, class_4751, class_3436)) {
                    n = -3 & -3;
                } else if (this.Field_20679) {
                    n = -2 & -2;
                }
                class_283.Method_446(class_4751, this, this.Method_20706(class_3436), n);
            }
        }
    }

    protected boolean Method_20690(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436) {
        return (this.Method_20686(class_283, class_4751, class_3436) > 0 ? 8339 & 5125 : 9496 & 33) != 0;
    }

    public int Method_20691(Class_561 class_561, Class_4751 class_4751, Class_3436 class_3436, Class_4595 class_4595) {
        return this.Method_20709(class_561, class_4751, class_3436, class_4595);
    }

    public void Method_20692(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Class_3238 class_3238) {
        if (this.Method_20703(class_283, class_4751)) {
            this.Method_20689(class_283, class_4751, class_3436);
        } else {
            this.\u0000strictfp(class_283, class_4751, class_3436, -16128 & 129);
            class_283.Method_472(class_4751);
            Class_4595[] arrclass_4595 = Class_4595.Method_4630();
            int n = arrclass_4595.length;
            for (int i = 5120 & -14075; i < n; ++i) {
                Class_4595 class_4595 = arrclass_4595[i];
                class_283.Method_525(class_4751.Method_4765(class_4595), this);
            }
        }
    }

    protected boolean Method_20693(Class_3238 class_3238) {
        return class_3238.Method_3322();
    }

    protected int Method_20694(Class_3436 class_3436) {
        return this.Method_20706(class_3436);
    }

    public void Method_20695(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436) {
        if (this.Field_20679) {
            Class_4595[] arrclass_4595 = Class_4595.Method_4630();
            int n = arrclass_4595.length;
            for (int i = 2200 & -15552; i < n; ++i) {
                Class_4595 class_4595 = arrclass_4595[i];
                class_283.Method_525(class_4751.Method_4765(class_4595), this);
            }
        }
        super.\u0000strictfp(class_283, class_4751, class_3436);
    }

    protected int Method_20696(Class_561 class_561, Class_4751 class_4751, Class_3436 class_3436) {
        Class_4595 class_4595 = (Class_4595)((Object)class_3436.Method_3440(\u0000strictfp));
        Class_4595 class_45952 = class_4595.Method_4620();
        Class_4595 class_45953 = class_4595.Method_4617();
        return Math.max(this.Method_20697(class_561, class_4751.Method_4765(class_45952), class_45952), this.Method_20697(class_561, class_4751.Method_4765(class_45953), class_45953));
    }

    protected int Method_20697(Class_561 class_561, Class_4751 class_4751, Class_4595 class_4595) {
        Class_3436 class_3436 = class_561.Method_568(class_4751);
        Class_3238 class_3238 = class_3436.Method_3442();
        return this.Method_20693(class_3238) ? (class_3238 == Class_9265.Field_9443 ? ((Integer)class_3436.Method_3440(Class_17176.Field_17182)).intValue() : class_561.Method_566(class_4751, class_4595)) : -31944 & 1157;
    }

    public boolean Method_20698(Class_3238 class_3238) {
        return (class_3238 == this.Method_20688(this.\u0000strictfp()).Method_3442() || class_3238 == this.Method_20684(this.\u0000strictfp()).Method_3442() ? -30591 & 12561 : 1 & 468) != 0;
    }

    public Class_3436 Method_20699(Class_283 class_283, Class_4751 class_4751, Class_4595 class_4595, float f, float f2, float f3, int n, Class_859 class_859) {
        return this.\u0000strictfp().Method_3685(\u0000strictfp, (Comparable)((Object)class_859.\u0000, `().Method_4660()));
    }

    public boolean Method_20700(Class_561 class_561, Class_4751 class_4751, Class_3436 class_3436) {
        return (6320 & 26437) != 0;
    }

    public Class_17531 Method_20701() {
        return Class_17531.Field_17538;
    }

    public void Method_20702(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Class_859 class_859, Class_23823 class_23823) {
        if (this.Method_20690(class_283, class_4751, class_3436)) {
            class_283.Method_441(class_4751, this, 17 & -15135);
        }
    }

    public boolean Method_20703(Class_283 class_283, Class_4751 class_4751) {
        return Class_283.Method_538(class_283, class_4751.Method_4782());
    }

    protected boolean Method_20704(Class_3436 class_3436) {
        return this.Field_20679;
    }

    public boolean Method_20705(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436) {
        Class_4595 class_4595 = ((Class_4595)((Object)class_3436.Method_3440(\u0000strictfp))).Method_4660();
        Class_4751 class_47512 = class_4751.Method_4765(class_4595);
        return (Class_20678.Method_20707(class_283.Method_375(class_47512).Method_3442()) ? (class_283.Method_375(class_47512).Method_3440(\u0000strictfp) != class_4595 ? 2097 & 1669 : 398 & 26656) : 22032 & -32768) != 0;
    }

    protected abstract int Method_20706(Class_3436 var1);

    public static boolean Method_20707(Class_3238 class_3238) {
        return (Class_9265.Field_9374.\u0000, `(class_3238) || Class_9265.Field_9435.\u0000, `(class_3238) ? 1553 & -1789 : 19144 & -32490) != 0;
    }

    protected int Method_20708(Class_561 class_561, Class_4751 class_4751, Class_3436 class_3436) {
        return 21839 & -30545;
    }

    public int Method_20709(Class_561 class_561, Class_4751 class_4751, Class_3436 class_3436, Class_4595 class_4595) {
        return !this.Method_20704(class_3436) ? 4128 & 26176 : (class_3436.Method_3440(\u0000strictfp) == class_4595 ? this.Method_20708(class_561, class_4751, class_3436) : 16521 & 70);
    }

    protected Class_20678(boolean bl) {
        super(Class_3713.Field_3751);
        this.Field_20679 = bl;
        this.\u0000strictfp(0.0f, 0.0f, 0.0f, 1.0f, 1.9285715f * 0.06481481f, 1.0f);
    }

    public void Method_20710(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436) {
        this.Method_20712(class_283, class_4751, class_3436);
    }

    public void Method_20711(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Random random) {
    }

    protected void Method_20712(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436) {
        Class_4595 class_4595 = (Class_4595)((Object)class_3436.Method_3440(\u0000strictfp));
        Class_4751 class_47512 = class_4751.Method_4765(class_4595.Method_4660());
        class_283.Method_459(class_47512, this);
        class_283.Method_455(class_47512, this, class_4595);
    }

    private void Method_20713() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_20714(Class_561 class_561, Class_4751 class_4751, Class_4595 class_4595) {
        return (class_4595.Method_4640() != Class_4565.Field_4569 ? 4355 & 19097 : 13712 & 16936) != 0;
    }
}

