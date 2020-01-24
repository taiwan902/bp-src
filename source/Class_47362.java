/*
 * Decompiled with CFR 0.145.
 */
import java.util.Iterator;
import java.util.SortedSet;

public interface Class_47362
extends Class_34543,
Class_46184,
SortedSet {
    default public SortedSet Method_47363(Object object) {
        return this.Method_47366(object);
    }

    public Class_47362 Method_47364(Object var1);

    public Class_24554 Method_47365();

    public Class_47362 Method_47366(Object var1);

    default public Iterator Method_47367() {
        return this.Method_47365();
    }

    default public Class_20759 Method_47368() {
        return this.Method_47365();
    }

    default public SortedSet Method_47369(Object object, Object object2) {
        return this.Method_47371(object, object2);
    }

    default public SortedSet Method_47370(Object object) {
        return this.Method_47364(object);
    }

    public Class_47362 Method_47371(Object var1, Object var2);
}

