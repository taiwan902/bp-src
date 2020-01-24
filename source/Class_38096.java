/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

public abstract class Class_38096
extends Class_36920
implements Class_36269 {
    public Class_25366 Method_38097(int n) {
        this.Method_38101(n);
        return new Class_34921(this, n);
    }

    public boolean Method_38098(int n, Collection collection) {
        this.Method_38101(n);
        Iterator iterator = collection.iterator();
        boolean bl = iterator.hasNext();
        while (iterator.hasNext()) {
            this.Method_38105(n++, iterator.next());
        }
        return bl;
    }

    public int Method_38099(Object object) {
        Class_25366 class_25366 = this.Method_38115();
        while (class_25366.hasNext()) {
            Object e = class_25366.next();
            if (!Objects.equals(object, e)) continue;
            return class_25366.previousIndex();
        }
        return -1 & -1;
    }

    private void Method_38100() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected void Method_38101(int n) {
        if (n < 0) {
            throw new IndexOutOfBoundsException("Index (" + n + ") is negative");
        }
        if (n > this.size()) {
            throw new IndexOutOfBoundsException("Index (" + n + ") is greater than list size (" + this.size() + ")");
        }
    }

    public List Method_38102(int n, int n2) {
        return this.Method_38122(n, n2);
    }

    public void Method_38103(int n, int n2) {
        this.Method_38101(n2);
        Class_25366 class_25366 = this.Method_38097(n);
        int n3 = n2 - n;
        if (n3 < 0) {
            throw new IllegalArgumentException("Start index (" + n + ") is greater than end index (" + n2 + ")");
        }
        while (n3-- != 0) {
            class_25366.next();
            class_25366.Method_25369();
        }
    }

    public Iterator Method_38104() {
        return this.Method_38123();
    }

    public void Method_38105(int n, Object object) {
        throw new UnsupportedOperationException();
    }

    public void Method_38106() {
        this.Method_38103(129 & 2092, this.size());
    }

    public boolean Method_38107(Object object) {
        if (object == this) {
            return (-26591 & 25233) != 0;
        }
        if (!(object instanceof List)) {
            return (3424 & 17042) != 0;
        }
        List list = (List)object;
        int n = this.size();
        if (n != list.size()) {
            return (-32320 & 514) != 0;
        }
        Class_25366 class_25366 = this.Method_38115();
        ListIterator listIterator = list.listIterator();
        while (n-- != 0) {
            if (this.Method_38117(class_25366.next(), listIterator.next())) continue;
            return (18563 & 12544) != 0;
        }
        return (195 & -27359) != 0;
    }

    public Class_20759 Method_38108() {
        return this.Method_38123();
    }

    public boolean Method_38109(Object object) {
        this.Method_38105(this.size(), object);
        return (6369 & -16381) != 0;
    }

    public int Method_38110(Object object) {
        Class_25366 class_25366 = this.Method_38097(this.size());
        while (class_25366.hasPrevious()) {
            Object e = class_25366.previous();
            if (!Objects.equals(object, e)) continue;
            return class_25366.nextIndex();
        }
        return -1 & -1;
    }

    public int Method_38111(Object object) {
        return this.Method_38124((List)object);
    }

    public Object Method_38112(int n, Object object) {
        throw new UnsupportedOperationException();
    }

    public boolean Method_38113(Collection collection) {
        return this.Method_38098(this.size(), collection);
    }

    protected void Method_38114(int n) {
        if (n < 0) {
            throw new IndexOutOfBoundsException("Index (" + n + ") is negative");
        }
        if (n >= this.size()) {
            throw new IndexOutOfBoundsException("Index (" + n + ") is greater than or equal to list size (" + this.size() + ")");
        }
    }

    public Class_25366 Method_38115() {
        return this.Method_38097(280 & -12160);
    }

    public ListIterator Method_38116() {
        return this.Method_38115();
    }

    protected Class_38096() {
    }

    private boolean Method_38117(Object object, Object object2) {
        return (object == null ? (object2 == null ? 3153 & 16769 : 4 & -11734) : object.equals(object2)) != 0;
    }

    public Object Method_38118(int n) {
        throw new UnsupportedOperationException();
    }

    public ListIterator Method_38119(int n) {
        return this.Method_38097(n);
    }

    public boolean Method_38120(Object object) {
        return (this.Method_38099(object) >= 0 ? 32261 & 435 : 4224 & -14028) != 0;
    }

    public int Method_38121() {
        Class_25366 class_25366 = this.Method_38123();
        int n = 16457 & -29563;
        int n2 = this.size();
        while (n2-- != 0) {
            Object e = class_25366.next();
            n = (18271 & -30529) * n + (e == null ? 16 & 2152 : e.hashCode());
        }
        return n;
    }

    public Class_36269 Method_38122(int n, int n2) {
        this.Method_38101(n);
        this.Method_38101(n2);
        if (n > n2) {
            throw new IndexOutOfBoundsException("Start index (" + n + ") is greater than end index (" + n2 + ")");
        }
        return new Class_45847(this, n, n2);
    }

    public Class_25366 Method_38123() {
        return this.Method_38115();
    }

    public int Method_38124(List list) {
        if (list == this) {
            return -32152 & 0;
        }
        if (list instanceof Class_36269) {
            Class_25366 class_25366 = this.Method_38115();
            Class_25366 class_253662 = ((Class_36269)list).Method_36275();
            while (class_25366.hasNext() && class_253662.hasNext()) {
                Object e;
                Object e2 = class_25366.next();
                int n = ((Comparable)e2).compareTo(e = class_253662.next());
                if (n == 0) continue;
                return n;
            }
            return class_253662.hasNext() ? -1 & -1 : (class_25366.hasNext() ? 2817 & -32541 : 1074 & 20552);
        }
        Class_25366 class_25366 = this.Method_38115();
        ListIterator listIterator = list.listIterator();
        while (class_25366.hasNext() && listIterator.hasNext()) {
            int n = ((Comparable)class_25366.next()).compareTo(listIterator.next());
            if (n == 0) continue;
            return n;
        }
        return listIterator.hasNext() ? -1 & -1 : (class_25366.hasNext() ? 6147 & -31871 : -31527 & 0);
    }

    public String Method_38125() {
        StringBuilder stringBuilder = new StringBuilder();
        Class_25366 class_25366 = this.Method_38123();
        int n = this.size();
        int n2 = -32703 & 14869;
        stringBuilder.append("[");
        while (n-- != 0) {
            if (n2 != 0) {
                n2 = 6144 & 8870;
            } else {
                stringBuilder.append(", ");
            }
            Object e = class_25366.next();
            if (this == e) {
                stringBuilder.append("(this list)");
                continue;
            }
            stringBuilder.append(String.valueOf(e));
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

