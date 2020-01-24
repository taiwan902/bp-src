/*
 * Decompiled with CFR 0.145.
 */
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public interface Class_40223
extends Class_39112,
Comparable,
List {
    public boolean Method_40224(int var1);

    public void Method_40225(int var1, int var2);

    @Deprecated
    default public void Method_40226(int n, Integer n2) {
        this.Method_40225(n, n2);
    }

    public Class_40223 Method_40227(int var1, int var2);

    @Deprecated
    default public Object Method_40228(int n) {
        return this.Method_40235(n);
    }

    public int Method_40229(int var1);

    default public List Method_40230(int n, int n2) {
        return this.Method_40227(n, n2);
    }

    @Deprecated
    default public Integer Method_40231(int n, Integer n2) {
        return this.Method_40233(n, n2);
    }

    @Deprecated
    default public void Method_40232(int n, Object object) {
        this.Method_40226(n, (Integer)object);
    }

    public int Method_40233(int var1, int var2);

    @Deprecated
    default public int Method_40234(Object object) {
        return this.Method_40240((Integer)object);
    }

    @Deprecated
    default public Integer Method_40235(int n) {
        return this.Method_40229(n);
    }

    @Deprecated
    default public boolean Method_40236(Object object) {
        return Class_39112.super.Method_39120(object);
    }

    public int Method_40237(int var1);

    @Deprecated
    default public boolean Method_40238(Integer n) {
        return this.Method_40224(n);
    }

    default public ListIterator Method_40239(int n) {
        return this.Method_40248(n);
    }

    public int Method_40240(int var1);

    public Class_32572 Method_40241();

    @Deprecated
    default public int Method_40242(Object object) {
        return this.Method_40251((Integer)object);
    }

    default public ListIterator Method_40243() {
        return this.Method_40241();
    }

    @Deprecated
    default public boolean Method_40244(Object object) {
        return this.Method_40238((Integer)object);
    }

    @Deprecated
    default public Integer Method_40245(int n) {
        return this.Method_40237(n);
    }

    @Deprecated
    default public boolean Method_40246(Object object) {
        return Class_39112.super.Method_39119(object);
    }

    @Deprecated
    default public Object Method_40247(int n, Object object) {
        return this.Method_40231(n, (Integer)object);
    }

    public Class_32572 Method_40248(int var1);

    default public Class_15384 Method_40249() {
        return this.Method_40252();
    }

    @Deprecated
    default public Object Method_40250(int n) {
        return this.Method_40245(n);
    }

    public int Method_40251(int var1);

    public Class_32572 Method_40252();

    default public Iterator Method_40253() {
        return this.Method_40252();
    }
}

