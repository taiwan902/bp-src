/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_6963 {
    private final Class_2080 Field_6964;
    private final Class_35032 Field_6965;
    private final boolean Field_6966;
    private final int Field_6967;

    public Class_35032 Method_6968() {
        return this.Field_6965;
    }

    public int Method_6969() {
        int n = this.Field_6964.Method_2089();
        n = (287 & 9983) * n + (this.Field_6965 != null ? this.Field_6965.hashCode() : 768 & 7228);
        n = (12735 & 31) * n + (this.Field_6966 ? 4633 & -32351 : 25633 & 664);
        return n;
    }

    public boolean Method_6970(Object object) {
        if (this == object) {
            return (1329 & -28663) != 0;
        }
        if (!(object instanceof Class_6963)) {
            return (28162 & 53) != 0;
        }
        Class_6963 class_6963 = (Class_6963)object;
        return (this.Field_6964.Method_2087(class_6963.Field_6964) && this.Field_6965 == class_6963.Field_6965 && this.Field_6966 == class_6963.Field_6966 ? 1153 & 2117 : 8324 & -14336) != 0;
    }

    public boolean Method_6971() {
        return this.Field_6966;
    }

    private void Method_6972() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_6963(Class_2080 class_2080, Class_35032 class_35032, boolean bl, int n) {
        this.Field_6964 = class_2080;
        this.Field_6965 = class_35032;
        this.Field_6966 = bl;
        this.Field_6967 = n;
    }

    public int Method_6973() {
        return this.Field_6967;
    }

    public Class_2080 Method_6974() {
        return this.Field_6964;
    }
}

