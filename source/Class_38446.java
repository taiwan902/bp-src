/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_38446
extends Class_24430 {
    private String Field_38447;
    private final Class_2190 Field_38448;
    private final Class_2190 Field_38449;

    public String Method_38450() {
        return this.Field_38447;
    }

    public double Method_38451(double d) {
        d = Class_13337.Method_13385(d, this.Field_38448.Method_2199(), this.Field_38449.Method_2199());
        return d;
    }

    private void Method_38452() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_38446 Method_38453(String string) {
        this.Field_38447 = string;
        return this;
    }

    public Class_38446(Class_22368 class_22368, String string, double d, double d2, double d3) {
        super(class_22368, string, d);
        this.Field_38448 = new Class_2190(d2, Class_2205.Field_2234);
        this.Field_38449 = new Class_2190(d3, Class_2205.Field_2234);
        if (d2 > d3) {
            throw new IllegalArgumentException("Minimum value cannot be bigger than maximum value!");
        }
        if (d < d2) {
            throw new IllegalArgumentException("Default value cannot be lower than minimum value!");
        }
        if (d > d3) {
            throw new IllegalArgumentException("Default value cannot be bigger than maximum value!");
        }
    }
}

