/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_44698 {
    private final String Field_44699;
    private final List Field_44700;

    private void Method_44701() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_44698(String string, List list) {
        this.Field_44699 = string;
        this.Field_44700 = list;
    }

    public boolean Method_44702(Object object) {
        if (this == object) {
            return (33 & -17381) != 0;
        }
        if (!(object instanceof Class_44698)) {
            return (81 & 8968) != 0;
        }
        Class_44698 class_44698 = (Class_44698)object;
        return (!this.Field_44699.equals(class_44698.Field_44699) ? 10248 & -32335 : this.Field_44700.equals(class_44698.Field_44700)) != 0;
    }

    public int Method_44703() {
        int n = this.Field_44699.hashCode();
        n = (-29633 & 17055) * n + this.Field_44700.hashCode();
        return n;
    }

    public List Method_44704() {
        return this.Field_44700;
    }

    static String Method_44705(Class_44698 class_44698) {
        return class_44698.Field_44699;
    }
}

