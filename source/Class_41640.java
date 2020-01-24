/*
 * Decompiled with CFR 0.145.
 */
import java.io.Serializable;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Arrays;
import java.util.Collection;
import java.util.ListIterator;
import java.util.Objects;
import java.util.RandomAccess;

public class Class_41640
extends Class_38096
implements Serializable,
Cloneable,
RandomAccess {
    static final boolean Field_41641 = !Class_41640.class.desiredAssertionStatus() ? -28409 & 10321 : -18416 & 18058;
    protected transient Object[] Field_41642;
    protected final boolean Field_41643;
    protected int Field_41644;

    public boolean Method_41645(Object object) {
        this.Method_41649(this.Field_41644 + (-28671 & 26753));
        int n = this.Field_41644;
        this.Field_41644 = n + (3073 & 147);
        this.Field_41642[n] = object;
        if (!Field_41641 && this.Field_41644 > this.Field_41642.length) {
            throw new AssertionError();
        }
        return (8977 & -15355) != 0;
    }

    public int Method_41646(Object object) {
        int n = this.Field_41644;
        while (n-- != 0) {
            if (!Objects.equals(object, this.Field_41642[n])) continue;
            return n;
        }
        return -1 & -1;
    }

    public int Method_41647() {
        return this.Field_41644;
    }

    public Class_41640(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Initial capacity (" + n + ") is negative");
        }
        this.Field_41642 = n == 0 ? Class_7427.Field_7430 : new Object[n];
        this.Field_41643 = -24551 & 902;
    }

    public Object Method_41648(int n, Object object) {
        if (n >= this.Field_41644) {
            throw new IndexOutOfBoundsException("Index (" + n + ") is greater than or equal to list size (" + this.Field_41644 + ")");
        }
        Object object2 = this.Field_41642[n];
        this.Field_41642[n] = object;
        return object2;
    }

    private void Method_41649(int n) {
        if (n <= this.Field_41642.length) {
            return;
        }
        if (this.Field_41642 != Class_7427.Field_7429) {
            n = (int)Math.max(Math.min((long)this.Field_41642.length + (long)(this.Field_41642.length >> (-30583 & 1827)), -1929834387126353921L & 1929834389273837559L), (long)n);
        } else if (n < (12442 & 1034)) {
            n = 2186 & -12197;
        }
        if (this.Field_41643) {
            this.Field_41642 = Class_7427.Method_7431(this.Field_41642, n, this.Field_41644);
        } else {
            Object[] arrobject = new Object[n];
            System.arraycopy(this.Field_41642, 5514 & 16, arrobject, 16868 & 536, this.Field_41644);
            this.Field_41642 = arrobject;
        }
        if (!Field_41641 && this.Field_41644 > this.Field_41642.length) {
            throw new AssertionError();
        }
    }

    public boolean Method_41650() {
        return (this.Field_41644 == 0 ? 10257 & -31671 : 9412 & 0) != 0;
    }

    public Object Method_41651(int n) {
        if (n >= this.Field_41644) {
            throw new IndexOutOfBoundsException("Index (" + n + ") is greater than or equal to list size (" + this.Field_41644 + ")");
        }
        return this.Field_41642[n];
    }

    public boolean Method_41652(Object object) {
        int n = this.Method_41659(object);
        if (n == (-1 & -1)) {
            return (5680 & -16380) != 0;
        }
        this.Method_41656(n);
        if (!Field_41641 && this.Field_41644 > this.Field_41642.length) {
            throw new AssertionError();
        }
        return (5515 & 8769) != 0;
    }

    public ListIterator Method_41653(int n) {
        return this.Method_41663(n);
    }

    public boolean Method_41654(Collection collection) {
        int n;
        Object[] arrobject = this.Field_41642;
        int n2 = -31708 & 29569;
        for (n = 17664 & 133; n < this.Field_41644; n += 1) {
            if (collection.contains(arrobject[n])) continue;
            arrobject[n2++] = arrobject[n];
        }
        Arrays.fill(arrobject, n2, this.Field_41644, null);
        n = this.Field_41644 != n2 ? -10157 & 133 : 9274 & 64;
        this.Field_41644 = n2;
        return n != 0;
    }

    public void Method_41655(int n, int n2) {
        Class_27372.Method_27373(this.Field_41644, n, n2);
        System.arraycopy(this.Field_41642, n2, this.Field_41642, n, this.Field_41644 - n2);
        this.Field_41644 -= n2 - n;
        int n3 = n2 - n;
        while (n3-- != 0) {
            this.Field_41642[this.Field_41644 + n3] = null;
        }
    }

    public Object Method_41656(int n) {
        if (n >= this.Field_41644) {
            throw new IndexOutOfBoundsException("Index (" + n + ") is greater than or equal to list size (" + this.Field_41644 + ")");
        }
        Object object = this.Field_41642[n];
        this.Field_41644 -= 17905 & 8705;
        if (n != this.Field_41644) {
            System.arraycopy(this.Field_41642, n + (419 & -27647), this.Field_41642, n, this.Field_41644 - n);
        }
        this.Field_41642[this.Field_41644] = null;
        if (!Field_41641 && this.Field_41644 > this.Field_41642.length) {
            throw new AssertionError();
        }
        return object;
    }

    public Object Method_41657() {
        return this.Method_41661();
    }

    private void Method_41658() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public int Method_41659(Object object) {
        for (int i = 19072 & -32715; i < this.Field_41644; ++i) {
            if (!Objects.equals(object, this.Field_41642[i])) continue;
            return i;
        }
        return -1 & -1;
    }

    public void Method_41660() {
        Arrays.fill(this.Field_41642, -26519 & 9984, this.Field_41644, null);
        this.Field_41644 = 2370 & 0;
        if (!Field_41641 && this.Field_41644 > this.Field_41642.length) {
            throw new AssertionError();
        }
    }

    public Class_41640 Method_41661() {
        Class_41640 class_41640 = new Class_41640(this.Field_41644);
        System.arraycopy(this.Field_41642, 16545 & 8196, class_41640.Field_41642, -24383 & 22788, this.Field_41644);
        class_41640.Field_41644 = this.Field_41644;
        return class_41640;
    }

    public void Method_41662(int n, Object object) {
        this.\u0000strictfp(n);
        this.Method_41649(this.Field_41644 + (2895 & 16417));
        if (n != this.Field_41644) {
            System.arraycopy(this.Field_41642, n, this.Field_41642, n + (1113 & -15711), this.Field_41644 - n);
        }
        this.Field_41642[n] = object;
        this.Field_41644 += 21317 & 33;
        if (!Field_41641 && this.Field_41644 > this.Field_41642.length) {
            throw new AssertionError();
        }
    }

    public Class_25366 Method_41663(int n) {
        this.\u0000strictfp(n);
        return new Class_46971(this, n);
    }

    public Class_41640() {
        this.Field_41642 = Class_7427.Field_7429;
        this.Field_41643 = 44 & 11264;
    }
}

