/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.NoSuchElementException;

public class Class_44882
implements Class_25366 {
    int Field_44883;
    final int Field_44884;
    static final boolean Field_44885 = !Class_38096.class.desiredAssertionStatus() ? 20873 & -23949 : 9 & -6912;
    final Class_45847 Field_44886;
    int Field_44887;

    private void Method_44888() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public int Method_44889() {
        return this.Field_44887 - (17 & 16965);
    }

    public void Method_44890(Object object) {
        if (this.Field_44883 == (-1 & -1)) {
            throw new IllegalStateException();
        }
        int n = this.Field_44887;
        this.Field_44887 = n + (2689 & -31727);
        this.Field_44886.Method_45857(n, object);
        this.Field_44883 = -1 & -1;
        if (!Field_44885 && !Class_45847.Method_45852(this.Field_44886)) {
            throw new AssertionError();
        }
    }

    public boolean Method_44891() {
        return (this.Field_44887 > 0 ? -30695 & 13155 : -31976 & 19520) != 0;
    }

    public Object Method_44892() {
        if (!this.Method_44891()) {
            throw new NoSuchElementException();
        }
        this.Field_44883 = this.Field_44887 -= 961 & 37;
        return this.Field_44886.Field_45850.get(this.Field_44886.Field_45848 + this.Field_44887);
    }

    public Object Method_44893() {
        if (!this.Method_44896()) {
            throw new NoSuchElementException();
        }
        int n = this.Field_44887;
        this.Field_44887 = n + (3205 & 12905);
        this.Field_44883 = n;
        return this.Field_44886.Field_45850.get(this.Field_44886.Field_45848 + n);
    }

    public void Method_44894() {
        if (this.Field_44883 == (-1 & -1)) {
            throw new IllegalStateException();
        }
        this.Field_44886.Method_45863(this.Field_44883);
        if (this.Field_44883 < this.Field_44887) {
            this.Field_44887 -= 26209 & 265;
        }
        this.Field_44883 = -1 & -1;
        if (!Field_44885 && !Class_45847.Method_45852(this.Field_44886)) {
            throw new AssertionError();
        }
    }

    Class_44882(Class_45847 class_45847, int n) {
        this.Field_44886 = class_45847;
        this.Field_44884 = n;
        this.Field_44887 = this.Field_44884;
        this.Field_44883 = -1 & -1;
    }

    public void Method_44895(Object object) {
        if (this.Field_44883 == (-1 & -1)) {
            throw new IllegalStateException();
        }
        this.Field_44886.Method_45860(this.Field_44883, object);
    }

    public boolean Method_44896() {
        return (this.Field_44887 < this.Field_44886.Method_45855() ? 16523 & 1317 : 26756 & 4610) != 0;
    }

    public int Method_44897() {
        return this.Field_44887;
    }
}

