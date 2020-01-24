/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_41242
extends Class_26421 {
    private int Field_41243;
    private Class_626 Field_41244;

    protected void Method_41245(Class_23823 class_23823, int n) {
        this.Field_41243 += n;
        this.Method_41249(class_23823);
    }

    public Class_23823 Method_41246(int n) {
        if (this.\u0000strictfp()) {
            this.Field_41243 += Math.min(n, this.\u0000strictfp().Field_23826);
        }
        return super.Method_26427(n);
    }

    public boolean Method_41247(Class_23823 class_23823) {
        return (17920 & -28668) != 0;
    }

    private void Method_41248() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected void Method_41249(Class_23823 class_23823) {
        class_23823.Method_23848(this.Field_41244.\u0000strictfp, this.Field_41244, this.Field_41243);
        if (!this.Field_41244.\u0000strictfp.Field_306) {
            int n;
            int n2 = this.Field_41243;
            float f = Class_30396.Method_30400().Method_30403(class_23823);
            if (f == 0.0f) {
                n2 = 4140 & 2322;
            } else if (f < 1.0f) {
                n = Class_13337.Method_13377((float)n2 * f);
                if (n < Class_13337.Method_13362((float)n2 * f) && Math.random() < (double)((float)n2 * f - (float)n)) {
                    ++n;
                }
                n2 = n;
            }
            while (n2 > 0) {
                n = Class_3481.Method_3491(n2);
                n2 -= n;
                this.Field_41244.\u0000strictfp.Method_350(new Class_3481(this.Field_41244.\u0000strictfp, this.Field_41244.\u0000= package, this.Field_41244.\u0000, for() + 0.19047619047619047 * 2.625, this.Field_41244.\u0000= switch + 0.25 * 2.0, n));
            }
        }
        this.Field_41243 = 4688 & -30455;
        if (class_23823.Method_23844() == Class_10527.Field_10565) {
            this.Field_41244.Method_750(Class_21905.Field_21922);
        }
        if (class_23823.Method_23844() == Class_10527.Field_10614) {
            this.Field_41244.Method_750(Class_21905.Field_21942);
        }
    }

    public Class_41242(Class_626 class_626, Class_4961 class_4961, int n, int n2, int n3) {
        super(class_4961, n, n2, n3);
        this.Field_41244 = class_626;
    }

    public void Method_41250(Class_626 class_626, Class_23823 class_23823) {
        this.Method_41249(class_23823);
        super.Method_26441(class_626, class_23823);
    }
}

