/*
 * Decompiled with CFR 0.145.
 */
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public interface Class_26952
extends Class_25994,
List {
    default public List Method_26953(int n, int n2) {
        return this.Method_26955(n, n2);
    }

    default public Class_20759 Method_26954() {
        return this.Method_26960();
    }

    public Class_26952 Method_26955(int var1, int var2);

    public Class_25366 Method_26956(int var1);

    default public ListIterator Method_26957() {
        return this.Method_26959();
    }

    default public ListIterator Method_26958(int n) {
        return this.Method_26956(n);
    }

    public Class_25366 Method_26959();

    public Class_25366 Method_26960();

    default public Iterator Method_26961() {
        return this.Method_26960();
    }
}

