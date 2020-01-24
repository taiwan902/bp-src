/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import net.minecraft.util.Vec3;

public class Class_37110 {
    public Class_4595 Field_37111;
    public Class_7192 Field_37112;
    private Class_4751 Field_37113;
    public Class_1061 Field_37114;
    public Vec3 Field_37115;

    public Class_37110(Class_1061 class_1061) {
        this(class_1061, new Vec3(class_1061.Field_1130, class_1061.Method_1324(), class_1061.Field_1106));
    }

    private void Method_37116() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_37110(Vec3 vec3, Class_4595 class_4595, Class_4751 class_4751) {
        this(Class_7192.Field_7193, vec3, class_4595, class_4751);
    }

    public Class_37110(Class_1061 class_1061, Vec3 vec3) {
        this.Field_37112 = Class_7192.Field_7195;
        this.Field_37114 = class_1061;
        this.Field_37115 = vec3;
    }

    public String Method_37117() {
        return "HitResult{type=" + (Object)((Object)this.Field_37112) + ", blockpos=" + this.Field_37113 + ", f=" + this.Field_37111 + ", pos=" + this.Field_37115 + ", entity=" + this.Field_37114 + (char)(8317 & 22525);
    }

    public Class_37110(Class_7192 class_7192, Vec3 vec3, Class_4595 class_4595, Class_4751 class_4751) {
        this.Field_37112 = class_7192;
        this.Field_37113 = class_4751;
        this.Field_37111 = class_4595;
        this.Field_37115 = new Vec3(vec3.\u0000= final, vec3.\u0000strictfp, vec3.\u0000, `);
    }

    public Class_37110(Vec3 vec3, Class_4595 class_4595) {
        this(Class_7192.Field_7193, vec3, class_4595, Class_4751.Field_4760);
    }

    public Class_4751 Method_37118() {
        return this.Field_37113;
    }
}

