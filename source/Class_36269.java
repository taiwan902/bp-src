/*
 * Decompiled with CFR 0.145.
 */
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public interface Class_36269
extends Class_33455,
Comparable,
List {
    public Class_36269 Method_36270(int var1, int var2);

    default public Class_20759 Method_36271() {
        return this.Method_36278();
    }

    default public ListIterator Method_36272() {
        return this.Method_36275();
    }

    default public List Method_36273(int n, int n2) {
        return this.Method_36270(n, n2);
    }

    public Class_25366 Method_36274(int var1);

    public Class_25366 Method_36275();

    default public Iterator Method_36276() {
        return this.Method_36278();
    }

    public void Method_36277(int var1, int var2);

    public Class_25366 Method_36278();

    default public ListIterator Method_36279(int n) {
        return this.Method_36274(n);
    }
}

