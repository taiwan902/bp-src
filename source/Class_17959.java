/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.Callable;

public class Class_17959
implements Callable {
    final Class_27551 Field_17960;
    final int Field_17961;

    private void Method_17962() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public String Method_17963() {
        return this.Field_17961 == 0 ? "MISC_TEXTURE" : (this.Field_17961 == (1083 & 10757) ? "TERRAIN_TEXTURE" : (this.Field_17961 == (1443 & 4691) ? "ENTITY_PARTICLE_TEXTURE" : "Unknown - " + this.Field_17961));
    }

    Class_17959(Class_27551 class_27551, int n) {
        this.Field_17960 = class_27551;
        this.Field_17961 = n;
    }

    public Object Method_17964() {
        return this.Method_17963();
    }
}

