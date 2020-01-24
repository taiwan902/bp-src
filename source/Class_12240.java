/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
import com.google.common.base.Predicate;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_12240
implements Predicate {
    final Class_28183 Field_12241;
    final Class_4595 Field_12242;

    Class_12240(Class_28183 class_28183, Class_4595 class_4595) {
        this.Field_12241 = class_28183;
        this.Field_12242 = class_4595;
    }

    private void Method_12243() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_12244(Class_1061 class_1061) {
        return (class_1061 != null && class_1061.Method_1192() == this.Field_12242 ? 13313 & -32383 : 13637 & 16946) != 0;
    }

    public boolean Method_12245(Object object) {
        return this.Method_12244((Class_1061)object);
    }
}

