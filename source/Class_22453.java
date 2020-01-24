/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_22453
extends Class_3238 {
    private final boolean Field_22454;

    public boolean Method_22455(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Class_626 class_626, Class_4595 class_4595, float f, float f2, float f3) {
        this.Method_22462(class_283, class_4751);
        return super.Method_3289(class_283, class_4751, class_3436, class_626, class_4595, f, f2, f3);
    }

    public int Method_22456(int n, Random random) {
        return this.Method_22467(random) + random.nextInt(n + (3419 & 25217));
    }

    protected Class_23823 Method_22457(Class_3436 class_3436) {
        return new Class_23823(Class_9265.Field_9305);
    }

    private void Method_22458() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_1956 Method_22459(Class_3436 class_3436, Random random, int n) {
        return Class_10527.Field_10564;
    }

    public Class_22453(boolean bl) {
        super(Class_3713.Field_3721);
        if (bl) {
            this.\u0000strictfp((16673 & -30637) != 0);
        }
        this.Field_22454 = bl;
    }

    public void Method_22460(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Random random) {
        if (this == Class_9265.Field_9452) {
            class_283.Method_435(class_4751, Class_9265.Field_9305.Method_3293());
        }
    }

    public void Method_22461(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, float f, int n) {
        super.Method_3361(class_283, class_4751, class_3436, f, n);
        if (this.Method_22459(class_3436, class_283.Field_307, n) != Class_1956.Method_1981(this)) {
            int n2 = (-28645 & 10465) + class_283.Field_307.nextInt(18437 & 1285);
            this.\u0000strictfp(class_283, class_4751, n2);
        }
    }

    private void Method_22462(Class_283 class_283, Class_4751 class_4751) {
        this.Method_22465(class_283, class_4751);
        if (this == Class_9265.Field_9305) {
            class_283.Method_435(class_4751, Class_9265.Field_9452.Method_3293());
        }
    }

    public int Method_22463(Class_283 class_283) {
        return 11870 & 4414;
    }

    public void Method_22464(Class_283 class_283, Class_4751 class_4751, Class_1061 class_1061) {
        this.Method_22462(class_283, class_4751);
        super.Method_3387(class_283, class_4751, class_1061);
    }

    private void Method_22465(Class_283 class_283, Class_4751 class_4751) {
        Random random = class_283.Field_307;
        double d = 0.04807692307692307 * 1.3;
        for (int i = 4098 & -13008; i < (2054 & -24506); ++i) {
            double d2 = (float)class_4751.\u0000= final() + random.nextFloat();
            double d3 = (float)class_4751.\u0000, `() + random.nextFloat();
            double d4 = (float)class_4751.\u0000strictfp() + random.nextFloat();
            if (i == 0 && !class_283.Method_375(class_4751.Method_4769()).Method_3442().Method_3375()) {
                d3 = (double)class_4751.\u0000, `() + d + 1.0;
            }
            if (i == (5003 & 24577) && !class_283.Method_375(class_4751.Method_4782()).Method_3442().Method_3375()) {
                d3 = (double)class_4751.\u0000, `() - d;
            }
            if (i == (-32670 & 262) && !class_283.Method_375(class_4751.Method_4784()).Method_3442().Method_3375()) {
                d4 = (double)class_4751.\u0000strictfp() + d + 1.0;
            }
            if (i == (8239 & 18515) && !class_283.Method_375(class_4751.Method_4778()).Method_3442().Method_3375()) {
                d4 = (double)class_4751.\u0000strictfp() - d;
            }
            if (i == (2692 & 29005) && !class_283.Method_375(class_4751.Method_4770()).Method_3442().Method_3375()) {
                d2 = (double)class_4751.\u0000= final() + d + 1.0;
            }
            if (i == (5031 & -31739) && !class_283.Method_375(class_4751.Method_4771()).Method_3442().Method_3375()) {
                d2 = (double)class_4751.\u0000= final() - d;
            }
            if (!(d2 < (double)class_4751.\u0000= final() || d2 > (double)(class_4751.\u0000= final() + (8193 & -13757)) || d3 < 0.0 || d3 > (double)(class_4751.\u0000, `() + (1035 & -28667)) || d4 < (double)class_4751.\u0000strictfp()) && !(d4 > (double)(class_4751.\u0000strictfp() + (9351 & -12023)))) continue;
            class_283.Method_407(Class_40274.Field_40297, d2, d3, d4, 0.0, 0.0, 0.0, new int[16920 & -22394]);
        }
    }

    public void Method_22466(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Random random) {
        if (this.Field_22454) {
            this.Method_22465(class_283, class_4751);
        }
    }

    public int Method_22467(Random random) {
        return (10382 & -31931) + random.nextInt(12331 & -31726);
    }

    public void Method_22468(Class_283 class_283, Class_4751 class_4751, Class_626 class_626) {
        this.Method_22462(class_283, class_4751);
        super.Method_3308(class_283, class_4751, class_626);
    }
}

