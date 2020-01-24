/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;
import net.minecraft.util.Vec3;

public class Class_36471
extends Class_33077 {
    private Class_38163 Field_36472;
    private int Field_36473 = -1 & -1;
    private Class_41853 Field_36474;
    private int Field_36475 = -1 & -1;

    public Class_36471(Class_41853 class_41853) {
        this.Field_36474 = class_41853;
        this.\u0000strictfp(1041 & -28663);
    }

    public boolean Method_36476() {
        return (!this.Field_36474.\u0000strictfp().Method_7641() ? -32247 & 28673 : 1 & 2418) != 0;
    }

    public boolean Method_36477() {
        Class_4751 class_4751 = new Class_4751(this.Field_36474);
        if ((!this.Field_36474.\u0000strictfp.Method_347() || this.Field_36474.\u0000strictfp.Method_454() && !this.Field_36474.\u0000strictfp.Method_547(class_4751).Method_17400()) && !this.Field_36474.\u0000strictfp.Field_284.Method_18370()) {
            if (this.Field_36474.\u0000strictfp().nextInt(16754 & 4146) != 0) {
                return (19472 & 807) != 0;
            }
            if (this.Field_36473 != (-1 & -1) && this.Field_36474.\u0000strictfp((double)this.Field_36473, this.Field_36474.\u0000, for(), (double)this.Field_36475) < 2.181818181818182 * 1.8333333333333333) {
                return (-32640 & 4) != 0;
            }
            Class_20407 class_20407 = this.Field_36474.\u0000strictfp.Method_558().Method_41910(class_4751, -29457 & 24846);
            if (class_20407 == null) {
                return (544 & -32358) != 0;
            }
            this.Field_36472 = class_20407.Method_20433(class_4751);
            return (this.Field_36472 != null ? 17027 & 341 : -31192 & 14336) != 0;
        }
        return (-21629 & 17416) != 0;
    }

    public void Method_36478() {
        this.Field_36473 = this.Field_36472.Method_38175().\u0000= final();
        this.Field_36475 = this.Field_36472.Method_38175().\u0000strictfp();
        this.Field_36472 = null;
    }

    public void Method_36479() {
        this.Field_36473 = -1 & -1;
        Class_4751 class_4751 = this.Field_36472.Method_38175();
        int n = class_4751.\u0000= final();
        int n2 = class_4751.\u0000, `();
        int n3 = class_4751.\u0000strictfp();
        if (this.Field_36474.\u0000strictfp(class_4751) > 232.72727272727272 * 1.1) {
            Vec3 vec3 = Class_27813.Method_27819(this.Field_36474, 5167 & 142, -31581 & 19, new Vec3((double)n + 1.0 * 0.5, n2, (double)n3 + 0.6517857142857143 * 0.7671232876712328));
            if (vec3 != null) {
                this.Field_36474.\u0000strictfp().Method_7638(vec3.\u0000= final, vec3.\u0000strictfp, vec3.\u0000, `, 1.0);
            }
        } else {
            this.Field_36474.\u0000strictfp().Method_7638((double)n + 0.5967741935483871 * 0.8378378378378378, n2, (double)n3 + 1.1168831168831168 * 0.4476744186046512, 1.0);
        }
    }

    private void Method_36480() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

