/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.NoSuchElementException;

public class Class_34921
implements Class_25366 {
    int Field_34922;
    final int Field_34923;
    final Class_38096 Field_34924;
    int Field_34925;

    public void Method_34926() {
        if (this.Field_34922 == (-1 & -1)) {
            throw new IllegalStateException();
        }
        this.Field_34924.Method_38118(this.Field_34922);
        if (this.Field_34922 < this.Field_34925) {
            this.Field_34925 -= -15613 & 29;
        }
        this.Field_34922 = -1 & -1;
    }

    public int Method_34927() {
        return this.Field_34925;
    }

    public Object Method_34928() {
        if (!this.Method_34929()) {
            throw new NoSuchElementException();
        }
        this.Field_34922 = this.Field_34925 -= 21 & 10315;
        return this.Field_34924.get(this.Field_34925);
    }

    public boolean Method_34929() {
        return (this.Field_34925 > 0 ? -31531 & 2081 : 521 & 17446) != 0;
    }

    public void Method_34930(Object object) {
        int n = this.Field_34925;
        this.Field_34925 = n + (-30703 & 16385);
        this.Field_34924.Method_38105(n, object);
        this.Field_34922 = -1 & -1;
    }

    public int Method_34931() {
        return this.Field_34925 - (11353 & 16513);
    }

    private void Method_34932() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_34933(Object object) {
        if (this.Field_34922 == (-1 & -1)) {
            throw new IllegalStateException();
        }
        this.Field_34924.Method_38112(this.Field_34922, object);
    }

    Class_34921(Class_38096 class_38096, int n) {
        this.Field_34924 = class_38096;
        this.Field_34923 = n;
        this.Field_34925 = this.Field_34923;
        this.Field_34922 = -1 & -1;
    }

    public boolean Method_34934() {
        return (this.Field_34925 < this.Field_34924.size() ? 9345 & 4361 : -27644 & 10275) != 0;
    }

    public Object Method_34935() {
        if (!this.Method_34934()) {
            throw new NoSuchElementException();
        }
        int n = this.Field_34925;
        this.Field_34925 = n + (-11871 & 8705);
        this.Field_34922 = n;
        return this.Field_34924.get(n);
    }
}

