/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.NoSuchElementException;

public class Class_46971
implements Class_25366 {
    final Class_41640 Field_46972;
    int Field_46973;
    int Field_46974;
    final int Field_46975;

    public int Method_46976() {
        return this.Field_46974;
    }

    private void Method_46977() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Object Method_46978() {
        if (!this.Method_46980()) {
            throw new NoSuchElementException();
        }
        this.Field_46973 = this.Field_46974 -= 3617 & 4417;
        return this.Field_46972.Field_41642[this.Field_46974];
    }

    public void Method_46979(Object object) {
        int n = this.Field_46974;
        this.Field_46974 = n + (-15087 & 12905);
        this.Field_46972.Method_41662(n, object);
        this.Field_46973 = -1 & -1;
    }

    public boolean Method_46980() {
        return (this.Field_46974 > 0 ? -9791 & 9249 : 32 & 25861) != 0;
    }

    Class_46971(Class_41640 class_41640, int n) {
        this.Field_46972 = class_41640;
        this.Field_46975 = n;
        this.Field_46974 = this.Field_46975;
        this.Field_46973 = -1 & -1;
    }

    public void Method_46981() {
        if (this.Field_46973 == (-1 & -1)) {
            throw new IllegalStateException();
        }
        this.Field_46972.Method_41656(this.Field_46973);
        if (this.Field_46973 < this.Field_46974) {
            this.Field_46974 -= 2945 & 20513;
        }
        this.Field_46973 = -1 & -1;
    }

    public boolean Method_46982() {
        return (this.Field_46974 < this.Field_46972.Field_41644 ? -27607 & 26625 : 270 & 8337) != 0;
    }

    public int Method_46983() {
        return this.Field_46974 - (-28509 & 24897);
    }

    public void Method_46984(Object object) {
        if (this.Field_46973 == (-1 & -1)) {
            throw new IllegalStateException();
        }
        this.Field_46972.Method_41648(this.Field_46973, object);
    }

    public Object Method_46985() {
        if (!this.Method_46982()) {
            throw new NoSuchElementException();
        }
        int n = this.Field_46974;
        this.Field_46974 = n + (-32615 & 8709);
        this.Field_46973 = n;
        return this.Field_46972.Field_41642[n];
    }
}

