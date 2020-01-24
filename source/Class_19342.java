/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.primitives.Floats
 */
import com.google.common.primitives.Floats;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Comparator;

public class Class_19342
implements Comparator {
    final float[] Field_19343;
    final Class_22385 Field_19344;

    public int Method_19345(Integer n, Integer n2) {
        return Floats.compare((float)this.Field_19343[n2], (float)this.Field_19343[n]);
    }

    public int Method_19346(Object object, Object object2) {
        return this.Method_19345((Integer)object, (Integer)object2);
    }

    Class_19342(Class_22385 class_22385, float[] arrf) {
        this.Field_19344 = class_22385;
        this.Field_19343 = arrf;
    }

    private void Method_19347() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

