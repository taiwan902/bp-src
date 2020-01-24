/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.primitives.Floats
 */
import com.google.common.base.Predicate;
import com.google.common.primitives.Floats;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_14525
implements Predicate {
    final Class_29800 Field_14526;

    Class_14525(Class_29800 class_29800) {
        this.Field_14526 = class_29800;
    }

    public boolean Method_14527(Object object) {
        return this.Method_14529((String)object);
    }

    private void Method_14528() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_14529(String string) {
        Float f = Floats.tryParse((String)string);
        return (string.length() == 0 || f != null && Floats.isFinite((float)f.floatValue()) && f.floatValue() >= 0.0f ? 10241 & 4109 : -24320 & 2568) != 0;
    }
}

