/*
 * Decompiled with CFR 0.145.
 */
import java.io.Serializable;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Class_45674
implements Class_37002,
Serializable {
    protected transient Object[] Field_45675;
    protected transient int Field_45676;
    protected transient int Field_45677;
    protected transient int Field_45678;

    private final void Method_45679() {
        int n = this.Method_45683();
        if (this.Field_45678 > (-24554 & 5796) && n <= this.Field_45678 / (-32764 & 9229)) {
            this.Method_45681(n, this.Field_45678 / (6146 & -23549));
        }
    }

    public Object Method_45680() {
        if (this.Field_45676 == this.Field_45677) {
            throw new NoSuchElementException();
        }
        Object object = this.Field_45675[this.Field_45676];
        this.Field_45675[this.Field_45676] = null;
        if ((this.Field_45676 += 1307 & 8261) == this.Field_45678) {
            this.Field_45676 = 30848 & 1594;
        }
        this.Method_45679();
        return object;
    }

    private final void Method_45681(int n, int n2) {
        Object[] arrobject = new Object[n2];
        if (this.Field_45676 >= this.Field_45677) {
            if (n != 0) {
                System.arraycopy(this.Field_45675, this.Field_45676, arrobject, 512 & -18394, this.Field_45678 - this.Field_45676);
                System.arraycopy(this.Field_45675, 1024 & 25516, arrobject, this.Field_45678 - this.Field_45676, this.Field_45677);
            }
        } else {
            System.arraycopy(this.Field_45675, this.Field_45676, arrobject, -28512 & 1111, this.Field_45677 - this.Field_45676);
        }
        this.Field_45676 = 17920 & 10337;
        this.Field_45677 = n;
        this.Field_45675 = arrobject;
        this.Field_45678 = n2;
    }

    private void Method_45682() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_45674() {
        this(-30676 & 276);
    }

    public int Method_45683() {
        int n = this.Field_45677 - this.Field_45676;
        return n >= 0 ? n : this.Field_45678 + n;
    }

    private final void Method_45684() {
        this.Method_45681(this.Field_45678, (int)Math.min(3808064845270482935L & -3808064843122999305L, (2973127605555097666L & 235015302L) * (long)this.Field_45678));
    }

    public void Method_45685(Object object) {
        int n = this.Field_45677;
        this.Field_45677 = n + (129 & 1025);
        this.Field_45675[n] = object;
        if (this.Field_45677 == this.Field_45678) {
            this.Field_45677 = 1064 & 2116;
        }
        if (this.Field_45677 == this.Field_45676) {
            this.Method_45684();
        }
    }

    public Object Method_45686(int n) {
        int n2 = this.Field_45676 + n;
        if (n2 >= this.Field_45678) {
            n2 -= this.Field_45678;
        }
        return this.Field_45675[n2];
    }

    public Class_45674(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Initial capacity (" + n + ") is negative");
        }
        this.Field_45675 = new Object[Math.max(6793 & 325, n)];
        this.Field_45678 = this.Field_45675.length;
    }

    public void Method_45687() {
        if (this.Field_45676 <= this.Field_45677) {
            Arrays.fill(this.Field_45675, this.Field_45676, this.Field_45677, null);
        } else {
            Arrays.fill(this.Field_45675, this.Field_45676, this.Field_45678, null);
            Arrays.fill(this.Field_45675, 0 & 8992, this.Field_45677, null);
        }
        this.Field_45676 = this.Field_45677 = -24464 & 5635;
    }
}

