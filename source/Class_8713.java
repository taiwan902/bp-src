/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.Callable;

public class Class_8713
implements Callable {
    final Class_27551 Field_8714;
    final int Field_8715;

    public Object Method_8716() {
        return this.Method_8717();
    }

    public String Method_8717() {
        return this.Field_8715 == 0 ? "MISC_TEXTURE" : (this.Field_8715 == (12033 & 16545) ? "TERRAIN_TEXTURE" : (this.Field_8715 == (4359 & 1131) ? "ENTITY_PARTICLE_TEXTURE" : "Unknown - " + this.Field_8715));
    }

    private void Method_8718() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_8713(Class_27551 class_27551, int n) {
        this.Field_8714 = class_27551;
        this.Field_8715 = n;
    }
}

