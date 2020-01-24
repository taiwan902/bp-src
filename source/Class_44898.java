/*
 * Decompiled with CFR 0.145.
 */
import java.io.Serializable;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class Class_44898
extends Class_44719
implements Class_12100,
Serializable,
Cloneable {
    protected transient int Field_44899;
    protected final float Field_44900;
    protected transient Object[] Field_44901;
    protected final transient int Field_44902;
    protected transient int Field_44903;
    protected transient int Field_44904;
    protected transient boolean Field_44905;
    protected int Field_44906;

    public boolean Method_44907(Object object) {
        if (object == null) {
            if (this.Field_44905) {
                return this.Method_44917();
            }
            return (8256 & 48) != 0;
        }
        Object[] arrobject = this.Field_44901;
        int n = Class_17239.Method_17240(object.hashCode()) & this.Field_44903;
        Object object2 = arrobject[n];
        if (object2 == null) {
            return (-28672 & 8592) != 0;
        }
        if (object.equals(object2)) {
            return this.Method_44908(n);
        }
        do {
            if ((object2 = arrobject[n = n + (513 & -18135) & this.Field_44903]) != null) continue;
            return (10273 & 1156) != 0;
        } while (!object.equals(object2));
        return this.Method_44908(n);
    }

    private boolean Method_44908(int n) {
        this.Field_44906 -= -32731 & 6659;
        this.Method_44915(n);
        if (this.Field_44899 > this.Field_44902 && this.Field_44906 < this.Field_44904 / (-26620 & 166) && this.Field_44899 > (1083 & 4244)) {
            this.Method_44913(this.Field_44899 / (-28630 & 26007));
        }
        return (-24495 & 5665) != 0;
    }

    public Class_44898 Method_44909() {
        Class_44898 class_44898;
        try {
            class_44898 = (Class_44898)Object.super.clone();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new InternalError();
        }
        class_44898.Field_44901 = (Object[])this.Field_44901.clone();
        class_44898.Field_44905 = this.Field_44905;
        return class_44898;
    }

    private void Method_44910(int n) {
        int n2 = Class_17239.Method_17241(n, this.Field_44900);
        if (n2 > this.Field_44899) {
            this.Method_44913(n2);
        }
    }

    private int Method_44911() {
        return this.Field_44905 ? this.Field_44906 - (-22207 & 561) : this.Field_44906;
    }

    public Object Method_44912() {
        return this.Method_44909();
    }

    protected void Method_44913(int n) {
        Object[] arrobject = this.Field_44901;
        int n2 = n - (8481 & 23753);
        Object[] arrobject2 = new Object[n + (4105 & 241)];
        int n3 = this.Field_44899;
        int n4 = this.Method_44911();
        while (n4-- != 0) {
            while (arrobject[--n3] == null) {
            }
            int n5 = Class_17239.Method_17240(arrobject[n3].hashCode()) & n2;
            if (arrobject2[n5] != null) {
                while (arrobject2[n5 = n5 + (4113 & 2117) & n2] != null) {
                }
            }
            arrobject2[n5] = arrobject[n3];
        }
        this.Field_44899 = n;
        this.Field_44903 = n2;
        this.Field_44904 = Class_17239.Method_17243(this.Field_44899, this.Field_44900);
        this.Field_44901 = arrobject2;
    }

    public int Method_44914() {
        return this.Field_44906;
    }

    public Class_44898() {
        this(3413 & -28528, 2.4f * 0.3125f);
    }

    public Class_44898(int n) {
        this(n, 1.89f * 0.3968254f);
    }

    protected final void Method_44915(int n) {
        Object[] arrobject = this.Field_44901;
        do {
            Object object;
            int n2 = n;
            n = n2 + (65 & -15351) & this.Field_44903;
            do {
                if ((object = arrobject[n]) == null) {
                    arrobject[n2] = null;
                    return;
                }
                int n3 = Class_17239.Method_17240(object.hashCode()) & this.Field_44903;
                if (n2 <= n ? n2 >= n3 || n3 > n : n2 >= n3 && n3 > n) break;
                n = n + (5745 & 26627) & this.Field_44903;
            } while (true);
            arrobject[n2] = object;
        } while (true);
    }

    public Iterator Method_44916() {
        return this.Method_44923();
    }

    private boolean Method_44917() {
        this.Field_44905 = 8198 & 24297;
        this.Field_44901[this.Field_44899] = null;
        this.Field_44906 -= 8225 & -32255;
        if (this.Field_44899 > this.Field_44902 && this.Field_44906 < this.Field_44904 / (197 & 4870) && this.Field_44899 > (18960 & 9521)) {
            this.Method_44913(this.Field_44899 / (-15862 & 10242));
        }
        return (289 & -28151) != 0;
    }

    public boolean Method_44918(Object object) {
        if (object == null) {
            return this.Field_44905;
        }
        Object[] arrobject = this.Field_44901;
        int n = Class_17239.Method_17240(object.hashCode()) & this.Field_44903;
        Object object2 = arrobject[n];
        if (object2 == null) {
            return (320 & 12449) != 0;
        }
        if (object.equals(object2)) {
            return (3777 & -7881) != 0;
        }
        do {
            if ((object2 = arrobject[n = n + (25283 & -28655) & this.Field_44903]) != null) continue;
            return (6193 & -24448) != 0;
        } while (!object.equals(object2));
        return (2053 & 1281) != 0;
    }

    private void Method_44919(long l) {
        int n = (int)Math.min(1231021629723658248L & -1231021628791318844L, Math.max(314082346950475862L & 385943298L, Class_17239.Method_17244((long)Math.ceil((float)l / this.Field_44900))));
        if (n > this.Field_44899) {
            this.Method_44913(n);
        }
    }

    public boolean Method_44920() {
        return (this.Field_44906 == 0 ? 16775 & 2073 : 144 & -6040) != 0;
    }

    public boolean Method_44921(Collection collection) {
        if ((double)this.Field_44900 <= 0.5606060606060607 * 0.8918918918918919) {
            this.Method_44910(collection.size());
        } else {
            this.Method_44919(this.Method_44914() + collection.size());
        }
        return super.addAll(collection);
    }

    private void Method_44922() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_20759 Method_44923() {
        return new Class_22031(this, null);
    }

    public Class_44898(int n, float f) {
        if (f <= 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("Load factor must be greater than 0 and smaller than or equal to 1");
        }
        if (n < 0) {
            throw new IllegalArgumentException("The expected number of elements must be nonnegative");
        }
        this.Field_44900 = f;
        this.Field_44902 = this.Field_44899 = Class_17239.Method_17241(n, f);
        this.Field_44903 = this.Field_44899 - (-11775 & 9241);
        this.Field_44904 = Class_17239.Method_17243(this.Field_44899, f);
        this.Field_44901 = new Object[this.Field_44899 + (8321 & 17929)];
    }

    public void Method_44924() {
        if (this.Field_44906 == 0) {
            return;
        }
        this.Field_44906 = -16126 & 6844;
        this.Field_44905 = 2304 & 513;
        Arrays.fill(this.Field_44901, null);
    }

    public boolean Method_44925(Object object) {
        if (object == null) {
            if (this.Field_44905) {
                return (258 & 32) != 0;
            }
            this.Field_44905 = 24651 & 1537;
        } else {
            Object[] arrobject = this.Field_44901;
            int n = Class_17239.Method_17240(object.hashCode()) & this.Field_44903;
            Object object2 = arrobject[n];
            if (object2 != null) {
                if (object2.equals(object)) {
                    return (-32744 & 20545) != 0;
                }
                while ((object2 = arrobject[n = n + (-11559 & 2339) & this.Field_44903]) != null) {
                    if (!object2.equals(object)) continue;
                    return (0 & -32238) != 0;
                }
            }
            arrobject[n] = object;
        }
        int n = this.Field_44906;
        this.Field_44906 = n + (-27647 & 16601);
        if (n >= this.Field_44904) {
            this.Method_44913(Class_17239.Method_17241(this.Field_44906 + (16385 & 5185), this.Field_44900));
        }
        return (-32757 & 14021) != 0;
    }

    public int Method_44926() {
        int n = -32211 & 8320;
        int n2 = this.Method_44911();
        int n3 = 50 & 3396;
        while (n2-- != 0) {
            while (this.Field_44901[n3] == null) {
                ++n3;
            }
            if (this != this.Field_44901[n3]) {
                n += this.Field_44901[n3].hashCode();
            }
            ++n3;
        }
        return n;
    }
}

