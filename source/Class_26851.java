/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Map;

public class Class_26851
implements Map.Entry {
    final int Field_26852;
    Object Field_26853;
    Class_26851 Field_26854;
    final Object Field_26855;

    public final Object Method_26856() {
        return this.Field_26853;
    }

    Class_26851(int n, Object object, Object object2, Class_26851 class_26851) {
        this.Field_26852 = n;
        this.Field_26855 = object;
        this.Field_26853 = object2;
        this.Field_26854 = class_26851;
    }

    private void Method_26857() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public final int Method_26858() {
        return this.Field_26855.hashCode() ^ this.Field_26853.hashCode();
    }

    public final String Method_26859() {
        return this.Field_26855 + "=" + this.Field_26853;
    }

    Class_26851 Method_26860(int n, Object object) {
        Class_26851 class_26851 = this;
        if (object != null) {
            do {
                Object object2;
                if (class_26851.Field_26852 != n || (object2 = class_26851.Field_26855) != object && (object2 == null || !object.equals(object2))) continue;
                return class_26851;
            } while ((class_26851 = class_26851.Field_26854) != null);
        }
        return null;
    }

    public final Object Method_26861(Object object) {
        throw new UnsupportedOperationException();
    }

    public final boolean Method_26862(Object object) {
        Map.Entry entry;
        Object v;
        Object k;
        Object object2;
        return (!(!(object instanceof Map.Entry) || (k = (entry = (Map.Entry)object).getKey()) == null || (v = entry.getValue()) == null || k != this.Field_26855 && !k.equals(this.Field_26855) || v != (object2 = this.Field_26853) && !v.equals(object2)) ? 9217 & 23297 : 2816 & 1221) != 0;
    }

    public final Object Method_26863() {
        return this.Field_26855;
    }
}

