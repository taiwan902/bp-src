/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Map;

public final class Class_11329
implements Map.Entry {
    final Class_21500 Field_11330;
    final Object Field_11331;
    Object Field_11332;

    public boolean Method_11333(Object object) {
        Object v;
        Object k;
        Map.Entry entry;
        return (!(!(object instanceof Map.Entry) || (k = (entry = (Map.Entry)object).getKey()) == null || (v = entry.getValue()) == null || k != this.Field_11331 && !k.equals(this.Field_11331) || v != this.Field_11332 && !v.equals(this.Field_11332)) ? 3 & 1153 : 520 & 22944) != 0;
    }

    public Object Method_11334() {
        return this.Field_11331;
    }

    public String Method_11335() {
        return this.Field_11331 + "=" + this.Field_11332;
    }

    public int Method_11336() {
        return this.Field_11331.hashCode() ^ this.Field_11332.hashCode();
    }

    public Object Method_11337() {
        return this.Field_11332;
    }

    Class_11329(Object object, Object object2, Class_21500 class_21500) {
        this.Field_11331 = object;
        this.Field_11332 = object2;
        this.Field_11330 = class_21500;
    }

    public Object Method_11338(Object object) {
        if (object == null) {
            throw new NullPointerException();
        }
        Object object2 = this.Field_11332;
        this.Field_11332 = object;
        this.Field_11330.Method_21575(this.Field_11331, object);
        return object2;
    }

    private void Method_11339() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

