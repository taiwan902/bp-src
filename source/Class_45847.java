/*
 * Decompiled with CFR 0.145.
 */
import java.io.Serializable;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Class_45847
extends Class_38096
implements Serializable {
    protected final int Field_45848;
    protected int Field_45849;
    protected final Class_36269 Field_45850;
    static final boolean Field_45851 = !Class_38096.class.desiredAssertionStatus() ? 8995 & 2053 : -30368 & 534;

    static boolean Method_45852(Class_45847 class_45847) {
        return class_45847.Method_45858();
    }

    public Class_45847(Class_36269 class_36269, int n, int n2) {
        this.Field_45850 = class_36269;
        this.Field_45848 = n;
        this.Field_45849 = n2;
    }

    public void Method_45853(int n, int n2) {
        this.\u0000strictfp(n);
        this.\u0000strictfp(n2);
        this.Field_45850.Method_36277(this.Field_45848 + n, this.Field_45848 + n2);
        this.Field_45849 -= n2 - n;
        if (!Field_45851 && !this.Method_45858()) {
            throw new AssertionError();
        }
    }

    public Object Method_45854(int n) {
        this.\u0000, `(n);
        return this.Field_45850.get(this.Field_45848 + n);
    }

    public int Method_45855() {
        return this.Field_45849 - this.Field_45848;
    }

    public int Method_45856(Object object) {
        return super.Method_38124((List)object);
    }

    public void Method_45857(int n, Object object) {
        this.\u0000strictfp(n);
        this.Field_45850.add(this.Field_45848 + n, object);
        this.Field_45849 += -15707 & 9297;
        if (!Field_45851 && !this.Method_45858()) {
            throw new AssertionError();
        }
    }

    private boolean Method_45858() {
        if (!Field_45851 && this.Field_45848 > this.Field_45850.size()) {
            throw new AssertionError();
        }
        if (!Field_45851 && this.Field_45849 > this.Field_45850.size()) {
            throw new AssertionError();
        }
        if (!Field_45851 && this.Field_45849 < this.Field_45848) {
            throw new AssertionError();
        }
        return (2817 & -20327) != 0;
    }

    public Class_36269 Method_45859(int n, int n2) {
        this.\u0000strictfp(n);
        this.\u0000strictfp(n2);
        if (n > n2) {
            throw new IllegalArgumentException("Start index (" + n + ") is greater than end index (" + n2 + ")");
        }
        return new Class_45847(this, n, n2);
    }

    public Object Method_45860(int n, Object object) {
        this.\u0000, `(n);
        return this.Field_45850.set(this.Field_45848 + n, object);
    }

    public Class_20759 Method_45861() {
        return super.Method_38123();
    }

    private void Method_45862() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Object Method_45863(int n) {
        this.\u0000, `(n);
        this.Field_45849 -= -15359 & 2629;
        return this.Field_45850.remove(this.Field_45848 + n);
    }

    public boolean Method_45864(Object object) {
        this.Field_45850.add(this.Field_45849, object);
        this.Field_45849 += 1 & 4365;
        if (!Field_45851 && !this.Method_45858()) {
            throw new AssertionError();
        }
        return (3859 & 12357) != 0;
    }

    public boolean Method_45865(int n, Collection collection) {
        this.\u0000strictfp(n);
        this.Field_45849 += collection.size();
        return this.Field_45850.addAll(this.Field_45848 + n, collection);
    }

    public Iterator Method_45866() {
        return super.Method_38123();
    }

    public ListIterator Method_45867() {
        return super.Method_38115();
    }

    public Class_25366 Method_45868(int n) {
        this.\u0000strictfp(n);
        return new Class_44882(this, n);
    }

    public ListIterator Method_45869(int n) {
        return this.Method_45868(n);
    }

    public List Method_45870(int n, int n2) {
        return this.Method_45859(n, n2);
    }
}

