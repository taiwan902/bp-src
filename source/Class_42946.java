/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_42946
extends Class_33077 {
    private float Field_42947;
    private int Field_42948;
    private double Field_42949;
    private int Field_42950;
    private int Field_42951;
    private final Class_34093 Field_42952;
    private int Field_42953 = -1 & -1;
    private final Class_10909 Field_42954;
    private float Field_42955;
    private Class_859 Field_42956;

    public Class_42946(Class_10909 class_10909, double d, int n, int n2, float f) {
        if (!(class_10909 instanceof Class_859)) {
            throw new IllegalArgumentException("ArrowAttackGoal requires Mob implements RangedAttackMob");
        }
        this.Field_42954 = class_10909;
        this.Field_42952 = (Class_34093)((Object)class_10909);
        this.Field_42949 = d;
        this.Field_42948 = n;
        this.Field_42951 = n2;
        this.Field_42947 = f;
        this.Field_42955 = f * f;
        this.\u0000strictfp(-21365 & 371);
    }

    public boolean Method_42957() {
        Class_859 class_859 = this.Field_42952.Method_34127();
        if (class_859 == null) {
            return (1544 & 8195) != 0;
        }
        this.Field_42956 = class_859;
        return (713 & 5413) != 0;
    }

    public void Method_42958() {
        this.Field_42956 = null;
        this.Field_42950 = 19840 & 4140;
        this.Field_42953 = -1 & -1;
    }

    public void Method_42959() {
        double d = this.Field_42952.\u0000strictfp(this.Field_42956.\u0000= package, this.Field_42956.\u0000, `().Field_11000, this.Field_42956.\u0000= switch);
        boolean bl = this.Field_42952.Method_34162().Method_27491(this.Field_42956);
        this.Field_42950 = bl ? (this.Field_42950 += 601 & 8449) : -14334 & 4644;
        if (d <= (double)this.Field_42955 && this.Field_42950 >= (2452 & -31628)) {
            this.Field_42952.Method_34145().Method_7643();
        } else {
            this.Field_42952.Method_34145().Method_7631(this.Field_42956, this.Field_42949);
        }
        this.Field_42952.Method_34147().Method_21479(this.Field_42956, 1.1111112f * 26.999998f, 0.11111111f * 270.0f);
        if ((this.Field_42953 -= 4165 & 257) == 0) {
            if (d > (double)this.Field_42955 || !bl) {
                return;
            }
            float f = Class_13337.Method_13347(d) / this.Field_42947;
            float f2 = Class_13337.Method_13360(f, 0.046511628f * 2.15f, 1.0f);
            this.Field_42954.Method_10910(this.Field_42956, f2);
            this.Field_42953 = Class_13337.Method_13377(f * (float)(this.Field_42951 - this.Field_42948) + (float)this.Field_42948);
        } else if (this.Field_42953 < 0) {
            float f = Class_13337.Method_13347(d) / this.Field_42947;
            this.Field_42953 = Class_13337.Method_13377(f * (float)(this.Field_42951 - this.Field_42948) + (float)this.Field_42948);
        }
    }

    public Class_42946(Class_10909 class_10909, double d, int n, float f) {
        this(class_10909, d, n, n, f);
    }

    private void Method_42960() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_42961() {
        return (this.Method_42957() || !this.Field_42952.Method_34145().Method_7641() ? 69 & 23851 : 9283 & 8) != 0;
    }
}

