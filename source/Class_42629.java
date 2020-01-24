/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public abstract class Class_42629
extends Class_41853 {
    protected int Field_42630;
    protected int Field_42631;
    private float Field_42632 = 2.3076923f * -0.43333334f;
    private float Field_42633;
    protected int Field_42634;

    public int Method_42635() {
        return this.\u0000strictfp.Field_306 ? (int)this.\u0000strictfp.Method_32708(655 & 30796) : this.Field_42634;
    }

    protected void Method_42636() {
    }

    public void Method_42637() {
        super.\u0000a_();
        if (this.\u0000strictfp.Field_306) {
            if (this.Field_42630 > 0) {
                if (this.Field_42630 % (1028 & 807) == 0) {
                    this.\u0000strictfp.Method_407(Class_40274.Field_40302, this.\u0000= package + (double)(this.\u0000strictfp.nextFloat() * this.\u0000= int() * 2.0f) - (double)this.\u0000= int(), this.\u0000, for() + 1.342857142857143 * 0.3723404255319149 + (double)(this.\u0000strictfp.nextFloat() * this.\u0000= switch()), this.\u0000= switch + (double)(this.\u0000strictfp.nextFloat() * this.\u0000= int() * 2.0f) - (double)this.\u0000= int(), 0.0, 0.0, 0.0, new int[88 & 16518]);
                }
                this.Field_42630 -= 9345 & 18511;
            }
            this.Method_42643(this.Method_42640());
        } else {
            int n = this.Method_42635();
            if (n < 0) {
                this.Method_42642(++n);
                if (n == 0) {
                    this.Method_42636();
                }
            } else if (n > 0) {
                this.Method_42642(--n);
            }
        }
    }

    public void Method_42638(int n) {
        this.Method_42644(n, (24609 & 5634) != 0);
    }

    protected void Method_42639() {
        super.\u0000= final();
        this.\u0000strictfp.Method_32719(-12276 & 3948, (byte)(-12720 & 4108));
    }

    public boolean Method_42640() {
        return (this.Method_42635() < 0 ? -28475 & 26113 : 12320 & -31537) != 0;
    }

    public boolean Method_42641(Class_626 class_626) {
        Class_23823 class_23823 = class_626.Field_628.Method_37821();
        if (class_23823 != null && class_23823.Method_23844() == Class_10527.Field_10573) {
            Class class_;
            Class_42629 class_42629;
            if (!this.\u0000strictfp.Field_306 && (class_ = Class_15516.Method_15590(class_23823.Method_23843())) != null && this.getClass() == class_ && (class_42629 = this.Method_42647(this)) != null) {
                class_42629.Method_42642(-5534 & -18879);
                class_42629.\u0000, `(this.\u0000= package, this.\u0000, for(), this.\u0000= switch, 0.0f, 0.0f);
                this.\u0000strictfp.Method_350(class_42629);
                if (class_23823.Method_23851()) {
                    class_42629.\u0000= final(class_23823.Method_23899());
                }
                if (!class_626.Field_694.Method_18094()) {
                    class_23823.Field_23826 -= 591 & 5249;
                    if (class_23823.Field_23826 <= 0) {
                        class_626.Field_628.Method_37796(class_626.Field_628.Field_37782, null);
                    }
                }
            }
            return (265 & 8375) != 0;
        }
        return (540 & 5312) != 0;
    }

    public void Method_42642(int n) {
        this.\u0000strictfp.Method_32704(30220 & 31, (byte)Class_13337.Method_13367(n, -1 & -1, 8231 & 4681));
        this.Field_42634 = n;
        this.Method_42643(this.Method_42640());
    }

    public void Method_42643(boolean bl) {
        this.Method_42646(bl ? 0.3829787f * 1.3055556f : 1.0f);
    }

    public void Method_42644(int n, boolean bl) {
        int n2;
        int n3 = n2 = this.Method_42635();
        if ((n2 += n * (-32618 & 16508)) > 0) {
            n2 = -24576 & 44;
            if (n3 < 0) {
                this.Method_42636();
            }
        }
        int n4 = n2 - n3;
        this.Method_42642(n2);
        if (bl) {
            this.Field_42631 += n4;
            if (this.Field_42630 == 0) {
                this.Field_42630 = 5292 & 17017;
            }
        }
        if (this.Method_42635() == 0) {
            this.Method_42642(this.Field_42631);
        }
    }

    public Class_42629(Class_283 class_283) {
        super(class_283);
    }

    public void Method_42645(Class_1699 class_1699) {
        super.\u0000strictfp(class_1699);
        class_1699.Method_1739("Age", this.Method_42635());
        class_1699.Method_1739("ForcedAge", this.Field_42631);
    }

    protected final void Method_42646(float f) {
        super.\u0000= final(this.Field_42632 * f, this.Field_42633 * f);
    }

    public abstract Class_42629 Method_42647(Class_42629 var1);

    private void Method_42648() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected final void Method_42649(float f, float f2) {
        int n = this.Field_42632 > 0.0f ? 10753 & 317 : -29696 & 288;
        this.Field_42632 = f;
        this.Field_42633 = f2;
        if (n == 0) {
            this.Method_42646(1.0f);
        }
    }

    public void Method_42650(Class_1699 class_1699) {
        super.\u0000, `(class_1699);
        this.Method_42642(class_1699.Method_1738("Age"));
        this.Field_42631 = class_1699.Method_1738("ForcedAge");
    }
}

