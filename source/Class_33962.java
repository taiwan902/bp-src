/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_33962
extends Class_4879
implements Class_4990,
Class_5591 {
    public float Field_33963;
    public float Field_33964;
    public float Field_33965;
    public float Field_33966;
    private static Random Field_33967 = new Random();
    public float Field_33968;
    private String Field_33969;
    public float Field_33970;
    public float Field_33971;
    public float Field_33972;
    public int Field_33973;
    public float Field_33974;

    public Class_1782 Method_33975() {
        return this.Method_33983() ? new Class_2840(this.Method_33982()) : new Class_2849(this.Method_33982(), new Object[16906 & -32732]);
    }

    public void Method_33976() {
        float f;
        this.Field_33972 = this.Field_33965;
        this.Field_33963 = this.Field_33968;
        Class_626 class_626 = this.\u0000strictfp.Method_491((float)this.\u0000strictfp.\u0000= final() + 1.6111112f * 0.31034482f, (float)this.\u0000strictfp.\u0000, `() + 0.07777778f * 6.428571f, (float)this.\u0000strictfp.\u0000strictfp() + 0.17948717f * 2.7857144f, 0.25263157894736843 * 11.875);
        if (class_626 != null) {
            double d = class_626.\u0000= package - (double)((float)this.\u0000strictfp.\u0000= final() + 92.0f * 0.0054347827f);
            double d2 = class_626.\u0000= switch - (double)((float)this.\u0000strictfp.\u0000strictfp() + 0.23529412f * 2.125f);
            this.Field_33964 = (float)Class_13337.Method_13391(d2, d);
            this.Field_33965 += 0.09166667f * 1.0909091f;
            if (this.Field_33965 < 0.30612245f * 1.6333333f || Field_33967.nextInt(-18004 & 104) == 0) {
                float f2 = this.Field_33966;
                do {
                    this.Field_33966 += (float)(Field_33967.nextInt(6 & 24660) - Field_33967.nextInt(8357 & 6148));
                } while (f2 == this.Field_33966);
            }
        } else {
            this.Field_33964 += 3.0833333f * 0.0064864866f;
            this.Field_33965 -= 3.909091f * 0.025581395f;
        }
        while (this.Field_33968 >= 0.5473684f * 5.7394485f) {
            this.Field_33968 -= 0.49019608f * 12.8176985f;
        }
        while (this.Field_33968 < 1.2539682f * -2.5053208f) {
            this.Field_33968 += 0.82673496f * 7.6f;
        }
        while (this.Field_33964 >= 17.503159f * 0.17948718f) {
            this.Field_33964 -= 0.16666667f * 37.699112f;
        }
        while (this.Field_33964 < 0.18421052f * -17.054361f) {
            this.Field_33964 += 1.1960784f * 5.253155f;
        }
        for (f = this.Field_33964 - this.Field_33968; f >= 1.0263158f * 3.061039f; f -= 2.5294118f * 2.48405f) {
        }
        while (f < -1.4898274f * 2.1086957f) {
            f += 3.926991f * 1.6f;
        }
        this.Field_33968 += f * (0.6742857f * 0.59322035f);
        this.Field_33965 = Class_13337.Method_13360(this.Field_33965, 0.0f, 1.0f);
        this.Field_33973 += 129 & 3603;
        this.Field_33971 = this.Field_33970;
        float f3 = (this.Field_33966 - this.Field_33970) * (3.7916667f * 0.10549451f);
        float f4 = 0.121276595f * 1.6491228f;
        f3 = Class_13337.Method_13360(f3, -f4, f4);
        this.Field_33974 += (f3 - this.Field_33974) * (0.05487805f * 16.4f);
        this.Field_33970 += this.Field_33974;
    }

    public String Method_33977() {
        return "minecraft:enchanting_table";
    }

    public Class_8295 Method_33978(Class_37781 class_37781, Class_626 class_626) {
        return new Class_15363(class_37781, this.\u0000strictfp, this.\u0000strictfp);
    }

    private void Method_33979() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_33980(Class_1699 class_1699) {
        super.Method_4911(class_1699);
        if (class_1699.Method_1715("CustomName", 648 & -30454)) {
            this.Field_33969 = class_1699.Method_1708("CustomName");
        }
    }

    public void Method_33981(Class_1699 class_1699) {
        super.Method_4929(class_1699);
        if (this.Method_33983()) {
            class_1699.Method_1702("CustomName", this.Field_33969);
        }
    }

    public String Method_33982() {
        return this.Method_33983() ? this.Field_33969 : "container.enchant";
    }

    public boolean Method_33983() {
        return (this.Field_33969 != null && this.Field_33969.length() > 0 ? 4105 & 24673 : 5280 & -24483) != 0;
    }

    public void Method_33984(String string) {
        this.Field_33969 = string;
    }
}

