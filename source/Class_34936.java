/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;
import net.minecraft.util.Vec3;

public class Class_34936
extends Class_33077 {
    private double Field_34937;
    private Class_41853 Field_34938;
    private double Field_34939;
    private double Field_34940;
    private double Field_34941;
    private int Field_34942;
    private boolean Field_34943;

    private void Method_34944() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_34945() {
        return (!this.Field_34938.\u0000strictfp().Method_7641() ? -26483 & 35 : 9792 & 18722) != 0;
    }

    public void Method_34946() {
        this.Field_34943 = 4099 & -22067;
    }

    public void Method_34947() {
        this.Field_34938.\u0000strictfp().Method_7638(this.Field_34940, this.Field_34941, this.Field_34937, this.Field_34939);
    }

    public Class_34936(Class_41853 class_41853, double d) {
        this(class_41853, d, 29048 & 1146);
    }

    public Class_34936(Class_41853 class_41853, double d, int n) {
        this.Field_34938 = class_41853;
        this.Field_34939 = d;
        this.Field_34942 = n;
        this.\u0000strictfp(16433 & 4867);
    }

    public void Method_34948(int n) {
        this.Field_34942 = n;
    }

    public boolean Method_34949() {
        Vec3 vec3;
        if (!this.Field_34943) {
            if (this.Field_34938.\u0000= `() >= (-32652 & 1126)) {
                return (4357 & -14232) != 0;
            }
            if (this.Field_34938.\u0000strictfp().nextInt(this.Field_34942) != 0) {
                return (58 & 16897) != 0;
            }
        }
        if ((vec3 = Class_27813.Method_27815(this.Field_34938, 2590 & 5514, 16423 & -31737)) == null) {
            return (28738 & 1664) != 0;
        }
        this.Field_34940 = vec3.\u0000= final;
        this.Field_34941 = vec3.\u0000strictfp;
        this.Field_34937 = vec3.\u0000, `;
        this.Field_34943 = 4400 & 8384;
        return (-15583 & 6277) != 0;
    }
}

