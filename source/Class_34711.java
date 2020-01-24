/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public final class Class_34711
extends Class_21175 {
    final Runnable Field_34712;
    final Thread Field_34713;
    final boolean Field_34714;

    private void Method_34715() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_34711 Method_34716() {
        return this;
    }

    public Object Method_34717() {
        return this.Method_34716();
    }

    public int Method_34718() {
        return this.Field_34713.hashCode() ^ this.Field_34712.hashCode();
    }

    public boolean Method_34719(Object object) {
        if (object == this) {
            return (-30431 & 13) != 0;
        }
        if (!(object instanceof Class_34711)) {
            return (2638 & 16) != 0;
        }
        Class_34711 class_34711 = (Class_34711)object;
        return (this.Field_34713 == class_34711.Field_34713 && this.Field_34712 == class_34711.Field_34712 ? 127 & 10497 : 4673 & -29568) != 0;
    }

    Class_34711(Thread thread, Runnable runnable, boolean bl) {
        this.Field_34713 = thread;
        this.Field_34712 = runnable;
        this.Field_34714 = bl;
    }
}

