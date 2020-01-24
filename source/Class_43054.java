/*
 * Decompiled with CFR 0.145.
 */
import java.util.Iterator;
import java.util.Set;

public interface Class_43054
extends Class_39112,
Set {
    public Class_15384 Method_43055();

    @Deprecated
    default public boolean Method_43056(Object object) {
        return Class_39112.super.Method_39119(object);
    }

    default public Iterator Method_43057() {
        return this.Method_43055();
    }

    public boolean Method_43058(int var1);

    @Deprecated
    default public boolean Method_43059(Integer n) {
        return Class_39112.super.Method_39116(n);
    }

    @Deprecated
    default public boolean Method_43060(Object object) {
        return this.Method_43059((Integer)object);
    }

    @Deprecated
    default public boolean Method_43061(Object object) {
        return Class_39112.super.Method_39120(object);
    }

    @Deprecated
    default public boolean Method_43062(int n) {
        return this.Method_43058(n);
    }
}

