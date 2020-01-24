/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public abstract class Class_35106
extends Class_33077 {
    protected Class_4751 Field_35107 = Class_4751.Field_4760;
    private final Class_41853 Field_35108;
    private int Field_35109;
    private int Field_35110;
    private boolean Field_35111;
    protected int Field_35112;
    private final double Field_35113;
    private int Field_35114;

    public boolean Method_35115() {
        return (this.Field_35114 >= -this.Field_35109 && this.Field_35114 <= (3257 & -23312) && this.Method_35119(this.Field_35108.\u0000strictfp, this.Field_35107) ? -31847 & 2053 : -15840 & 6156) != 0;
    }

    public void Method_35116() {
        if (this.Field_35108.\u0000, `(this.Field_35107.Method_4769()) > 1.0) {
            this.Field_35111 = -32414 & 4608;
            this.Field_35114 += -24053 & 22869;
            if (this.Field_35114 % (40 & 12844) == 0) {
                this.Field_35108.\u0000strictfp().Method_7638((double)this.Field_35107.\u0000= final() + 1.6071428571428572 * 0.3111111111111111, this.Field_35107.\u0000, `() + (16433 & 135), (double)this.Field_35107.\u0000strictfp() + 1.5 * 0.3333333333333333, this.Field_35113);
            }
        } else {
            this.Field_35111 = 16449 & 2613;
            this.Field_35114 -= 30797 & 1795;
        }
    }

    protected boolean Method_35117() {
        return this.Field_35111;
    }

    private boolean Method_35118() {
        int n = this.Field_35110;
        int n2 = -19707 & 16497;
        Class_4751 class_4751 = new Class_4751(this.Field_35108);
        int n3 = 2605 & -11840;
        while (n3 <= (-22207 & 1201)) {
            for (int i = -16240 & 2624; i < n; ++i) {
                int n4 = -32252 & 21915;
                while (n4 <= i) {
                    int n5;
                    int n6 = n5 = n4 < i && n4 > -i ? i : 544 & 64;
                    while (n5 <= i) {
                        Class_4751 class_47512 = class_4751.Method_4791(n4, n3 - (10245 & 4707), n5);
                        if (this.Field_35108.Method_41865(class_47512) && this.Method_35119(this.Field_35108.\u0000strictfp, class_47512)) {
                            this.Field_35107 = class_47512;
                            return (5475 & 24577) != 0;
                        }
                        n5 = n5 > 0 ? -n5 : (17955 & -28591) - n5;
                    }
                    n4 = n4 > 0 ? -n4 : (73 & 23169) - n4;
                }
            }
            n3 = n3 > 0 ? -n3 : (25729 & -32255) - n3;
        }
        return (-32756 & 28769) != 0;
    }

    protected abstract boolean Method_35119(Class_283 var1, Class_4751 var2);

    private void Method_35120() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_35121() {
    }

    public boolean Method_35122() {
        if (this.Field_35112 > 0) {
            this.Field_35112 -= -32703 & 37;
            return (-19192 & 16980) != 0;
        }
        this.Field_35112 = (200 & 21740) + this.Field_35108.\u0000strictfp().nextInt(9464 & 718);
        return this.Method_35118();
    }

    public void Method_35123() {
        this.Field_35108.\u0000strictfp().Method_7638((double)this.Field_35107.\u0000= final() + 0.9767441860465116 * 0.511904761904762, this.Field_35107.\u0000, `() + (1061 & 4161), (double)this.Field_35107.\u0000strictfp() + 0.05263157894736842 * 9.5, this.Field_35113);
        this.Field_35114 = 16384 & 53;
        this.Field_35109 = this.Field_35108.\u0000strictfp().nextInt(this.Field_35108.\u0000strictfp().nextInt(9904 & -27468) + (1266 & -21328)) + (9394 & 1456);
    }

    public Class_35106(Class_41853 class_41853, double d, int n) {
        this.Field_35108 = class_41853;
        this.Field_35113 = d;
        this.Field_35110 = n;
        this.\u0000strictfp(4629 & 24719);
    }
}

