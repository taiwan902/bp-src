/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class Class_36629
implements Iterator {
    private boolean Field_36630;
    final Class_46087 Field_36631;

    public Class_37082 Method_36632() {
        if (!this.Method_36634()) {
            throw new NoSuchElementException();
        }
        this.Field_36630 = 1153 & 4097;
        return this.Field_36631;
    }

    public void Method_36633() {
        throw new UnsupportedOperationException("read-only");
    }

    Class_36629(Class_46087 class_46087, Class_34363 class_34363) {
        this(class_46087);
    }

    public boolean Method_36634() {
        return (!this.Field_36630 ? 2307 & -23343 : -7935 & 1060) != 0;
    }

    private Class_36629(Class_46087 class_46087) {
        this.Field_36631 = class_46087;
    }

    public Object Method_36635() {
        return this.Method_36632();
    }

    private void Method_36636() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

