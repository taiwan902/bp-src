/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.AbstractSet;
import java.util.Iterator;

public class Class_6804
extends AbstractSet {
    final Class_27450 Field_6805;

    private void Method_6806() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_6807(Object object) {
        return (this.Field_6805.Method_27466((Long)object) != null ? 101 & 8457 : -32688 & 16554) != 0;
    }

    public int Method_6808() {
        return this.Field_6805.Method_27462();
    }

    public void Method_6809() {
        this.Field_6805.Method_27464();
    }

    public Iterator Method_6810() {
        return new Class_21057(this.Field_6805);
    }

    Class_6804(Class_27450 class_27450, Class_30205 class_30205) {
        this(class_27450);
    }

    public boolean Method_6811(Object object) {
        return (object instanceof Long && this.Field_6805.Method_27461((Long)object) ? 6185 & 17671 : 4096 & -31606) != 0;
    }

    private Class_6804(Class_27450 class_27450) {
        this.Field_6805 = class_27450;
    }
}

