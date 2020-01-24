/*
 * Decompiled with CFR 0.145.
 */
import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;

public interface Class_44231
extends Class_40444,
Class_43054,
SortedSet {
    default public Iterator Method_44232() {
        return this.Method_44236();
    }

    @Deprecated
    default public Integer Method_44233() {
        return this.Method_44240();
    }

    @Deprecated
    default public Class_44231 Method_44234(Integer n) {
        return this.Method_44238(n);
    }

    public Class_44231 Method_44235(int var1, int var2);

    public Class_25341 Method_44236();

    @Deprecated
    default public Object Method_44237() {
        return this.Method_44233();
    }

    public Class_44231 Method_44238(int var1);

    default public Class_15384 Method_44239() {
        return this.Method_44236();
    }

    public int Method_44240();

    public Class_44231 Method_44241(int var1);

    @Deprecated
    default public Object Method_44242() {
        return this.Method_44245();
    }

    @Deprecated
    default public SortedSet Method_44243(Object object, Object object2) {
        return this.Method_44247((Integer)object, (Integer)object2);
    }

    default public Comparator Method_44244() {
        return this.Method_44246();
    }

    @Deprecated
    default public Integer Method_44245() {
        return this.Method_44248();
    }

    public Class_32291 Method_44246();

    @Deprecated
    default public Class_44231 Method_44247(Integer n, Integer n2) {
        return this.Method_44235(n, n2);
    }

    public int Method_44248();

    @Deprecated
    default public SortedSet Method_44249(Object object) {
        return this.Method_44250((Integer)object);
    }

    @Deprecated
    default public Class_44231 Method_44250(Integer n) {
        return this.Method_44241(n);
    }

    @Deprecated
    default public SortedSet Method_44251(Object object) {
        return this.Method_44234((Integer)object);
    }
}

