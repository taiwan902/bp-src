/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Queue;

public final class Class_37530
extends Class_34534
implements Queue {
    public boolean Method_37531(Object object) {
        Class_21175 class_21175;
        if (object == null) {
            throw new NullPointerException("value");
        }
        if (object instanceof Class_21175) {
            class_21175 = (Class_21175)object;
            class_21175.Method_21178(null);
        } else {
            class_21175 = new Class_26524(object);
        }
        Class_21175 class_211752 = this.getAndSetTailRef(class_21175);
        class_211752.Method_21178(class_21175);
        return (-31069 & 18433) != 0;
    }

    Class_37530() {
        Class_26524 class_26524 = new Class_26524(null);
        this.setHeadRef((Class_21175)class_26524);
        this.setTailRef((Class_21175)class_26524);
    }

    public void Method_37532() {
        while (this.Method_37547() != null) {
        }
    }

    public Object[] Method_37533() {
        Object[] arrobject = new Object[this.Method_37548()];
        Iterator iterator = this.Method_37545();
        for (int i = 4096 & 9745; i < arrobject.length; ++i) {
            if (!iterator.hasNext()) {
                return Arrays.copyOf(arrobject, i);
            }
            arrobject[i] = iterator.next();
        }
        return arrobject;
    }

    public Object[] Method_37534(Object[] arrobject) {
        int n = this.Method_37548();
        Object[] arrobject2 = arrobject.length >= n ? arrobject : (Object[])Array.newInstance(arrobject.getClass().getComponentType(), n);
        Iterator iterator = this.Method_37545();
        for (int i = -23484 & 16408; i < arrobject2.length; ++i) {
            if (!iterator.hasNext()) {
                if (arrobject == arrobject2) {
                    arrobject2[i] = null;
                    return arrobject2;
                }
                if (arrobject.length < i) {
                    return Arrays.copyOf(arrobject2, i);
                }
                System.arraycopy(arrobject2, 18701 & 4096, arrobject, 1297 & -1536, i);
                if (arrobject.length > i) {
                    arrobject[i] = null;
                }
                return arrobject;
            }
            arrobject2[i] = iterator.next();
        }
        return arrobject2;
    }

    public boolean Method_37535(Object object) {
        for (Class_21175 class_21175 = this.Method_37551(); class_21175 != null; class_21175 = class_21175.Method_21185()) {
            if (class_21175.Method_21179() != object) continue;
            return (8193 & -15995) != 0;
        }
        return (-32728 & 19206) != 0;
    }

    public boolean Method_37536(Collection collection) {
        if (collection == null) {
            throw new NullPointerException("c");
        }
        if (collection == this) {
            throw new IllegalArgumentException("c == this");
        }
        int n = -13823 & 9288;
        for (Object e : collection) {
            this.Method_37544(e);
            n = 21513 & -30139;
        }
        return n != 0;
    }

    public boolean Method_37537(Object object) {
        throw new UnsupportedOperationException();
    }

    public Object Method_37538() {
        Class_21175 class_21175 = this.Method_37551();
        if (class_21175 == null) {
            return null;
        }
        return class_21175.Method_21179();
    }

    public boolean Method_37539() {
        return (this.Method_37551() == null ? 153 & 30977 : 4823 & 10240) != 0;
    }

    public boolean Method_37540(Collection collection) {
        throw new UnsupportedOperationException();
    }

    private void Method_37541() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Object Method_37542() {
        Object object = this.Method_37547();
        if (object != null) {
            return object;
        }
        throw new NoSuchElementException();
    }

    public boolean Method_37543(Collection collection) {
        for (Object e : collection) {
            if (this.Method_37535(e)) continue;
            return (8256 & 3592) != 0;
        }
        return (-24575 & 2089) != 0;
    }

    public boolean Method_37544(Object object) {
        if (this.Method_37531(object)) {
            return (15125 & 1027) != 0;
        }
        throw new IllegalStateException("queue full");
    }

    public Iterator Method_37545() {
        return new Class_18211(this);
    }

    public boolean Method_37546(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public Object Method_37547() {
        Class_21175 class_21175 = this.Method_37551();
        if (class_21175 == null) {
            return null;
        }
        Class_21175 class_211752 = this.headRef();
        this.lazySetHeadRef(class_21175);
        class_211752.Method_21182();
        return class_21175.Method_21184();
    }

    public int Method_37548() {
        int n = -31456 & 594;
        for (Class_21175 class_21175 = this.Method_37551(); class_21175 != null; class_21175 = class_21175.Method_21185()) {
            ++n;
        }
        return n;
    }

    public Object Method_37549() {
        Object object = this.Method_37538();
        if (object != null) {
            return object;
        }
        throw new NoSuchElementException();
    }

    static Class_21175 Method_37550(Class_37530 class_37530) {
        return class_37530.Method_37551();
    }

    private Class_21175 Method_37551() {
        Class_21175 class_21175;
        do {
            Class_21175 class_211752;
            if ((class_211752 = (class_21175 = this.headRef()).Method_21185()) == null) continue;
            return class_211752;
        } while (class_21175 != this.tailRef());
        return null;
    }
}

