/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;
import net.minecraft.util.Vec3;

public class Class_36956
extends Class_33077 {
    private double Field_36957;
    private double Field_36958;
    private Class_46199 Field_36959;
    private double Field_36960;
    private double Field_36961;

    public void Method_36962() {
        if (this.Field_36959.\u0000strictfp().nextInt(5883 & -14282) == 0) {
            if (this.Field_36959.\u0000strictfp instanceof Class_626) {
                int n = this.Field_36959.Method_46294();
                int n2 = this.Field_36959.Method_46355();
                if (n2 > 0 && this.Field_36959.\u0000strictfp().nextInt(n2) < n) {
                    this.Field_36959.Method_46365((Class_626)this.Field_36959.\u0000strictfp);
                    this.Field_36959.\u0000strictfp.Method_483(this.Field_36959, (byte)(-23761 & 4183));
                    return;
                }
                this.Field_36959.Method_46359(17669 & 8237);
            }
            this.Field_36959.\u0000strictfp.Method_1163(null);
            this.Field_36959.\u0000strictfp = null;
            this.Field_36959.Method_46354();
            this.Field_36959.\u0000strictfp.Method_483(this.Field_36959, (byte)(-8121 & 1190));
        }
    }

    public boolean Method_36963() {
        return (!this.Field_36959.\u0000strictfp().Method_7641() && this.Field_36959.\u0000strictfp != null ? 4741 & 1393 : 20057 & -24574) != 0;
    }

    public void Method_36964() {
        this.Field_36959.\u0000strictfp().Method_7638(this.Field_36958, this.Field_36961, this.Field_36960, this.Field_36957);
    }

    public Class_36956(Class_46199 class_46199, double d) {
        this.Field_36959 = class_46199;
        this.Field_36957 = d;
        this.\u0000strictfp(1 & 13393);
    }

    private void Method_36965() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_36966() {
        if (!this.Field_36959.Method_46292() && this.Field_36959.\u0000strictfp != null) {
            Vec3 vec3 = Class_27813.Method_27815(this.Field_36959, 30965 & 13, 21526 & 261);
            if (vec3 == null) {
                return (8213 & -10912) != 0;
            }
            this.Field_36958 = vec3.\u0000= final;
            this.Field_36961 = vec3.\u0000strictfp;
            this.Field_36960 = vec3.\u0000, `;
            return (4101 & 2513) != 0;
        }
        return (-16384 & 10351) != 0;
    }
}

