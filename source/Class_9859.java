/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

public final class Class_9859
implements Iterator {
    final Class_45721 Field_9860;
    private Class_16054 Field_9861;

    private void Method_9862() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_9859(Class_45721 class_45721, Class_29425 class_29425) {
        this(class_45721);
    }

    public boolean Method_9863() {
        return (this.Field_9861.Field_16057 != Class_45721.Method_45735(this.Field_9860) ? 545 & 23571 : 18017 & -30454) != 0;
    }

    public Object Method_9864() {
        return this.Method_9866();
    }

    private Class_9859(Class_45721 class_45721) {
        this.Field_9860 = class_45721;
        this.Field_9861 = Class_45721.Method_45735(this.Field_9860);
    }

    public void Method_9865() {
        throw new UnsupportedOperationException();
    }

    public Map.Entry Method_9866() {
        this.Field_9861 = this.Field_9861.Field_16057;
        if (this.Field_9861 == Class_45721.Method_45735(this.Field_9860)) {
            throw new NoSuchElementException();
        }
        return this.Field_9861;
    }
}

