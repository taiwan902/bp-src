/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_34375
implements Class_23708 {
    public float Field_34376;
    private double Field_34377;
    private Class_13481 Field_34378;
    public float Field_34379;
    private double Field_34380;
    private double Field_34381;
    public float Field_34382;

    public boolean Method_34383(double d, double d2, double d3, double d4, double d5, double d6) {
        return this.Field_34378.Method_13489(d - this.Field_34377, d2 - this.Field_34380, d3 - this.Field_34381, d4 - this.Field_34377, d5 - this.Field_34380, d6 - this.Field_34381);
    }

    public boolean Method_34384(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        return this.Field_34378.Method_13486(f - this.Field_34382, f2 - this.Field_34376, f3 - this.Field_34379, f4 - this.Field_34382, f5 - this.Field_34376, f6 - this.Field_34379, f7 - this.Field_34382, f8 - this.Field_34376, f9 - this.Field_34379);
    }

    public boolean Method_34385(Class_10997 class_10997) {
        return this.Method_34383(class_10997.Field_10999, class_10997.Field_11000, class_10997.Field_11001, class_10997.Field_11002, class_10997.Field_10998, class_10997.Field_11003);
    }

    public Class_34375() {
        this(Class_42892.Method_42897());
    }

    private void Method_34386() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_34387(double d, double d2, double d3) {
        this.Field_34377 = d;
        this.Field_34380 = d2;
        this.Field_34381 = d3;
        this.Field_34382 = (float)d;
        this.Field_34376 = (float)d2;
        this.Field_34379 = (float)d3;
    }

    public Class_34375(Class_13481 class_13481) {
        this.Field_34378 = class_13481;
    }
}

