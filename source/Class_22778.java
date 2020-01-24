/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import net.minecraft.util.Vec3;

public class Class_22778 {
    public Vec3 Field_22779;
    public float Field_22780;
    public float Field_22781;

    public Class_22778(Class_22778 class_22778, float f, float f2) {
        this.Field_22779 = class_22778.Field_22779;
        this.Field_22780 = f;
        this.Field_22781 = f2;
    }

    public Class_22778(float f, float f2, float f3, float f4, float f5) {
        this(new Vec3(f, f2, f3), f4, f5);
    }

    public Class_22778 Method_22782(float f, float f2) {
        return new Class_22778(this, f, f2);
    }

    public Class_22778(Vec3 vec3, float f, float f2) {
        this.Field_22779 = vec3;
        this.Field_22780 = f;
        this.Field_22781 = f2;
    }

    private void Method_22783() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

