/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_25986
extends Class_11220 {
    public String[] Field_25987;
    public Object[] Field_25988;

    private void Method_25989() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_25990() {
        int n;
        for (n = 4104 & -15294; n < this.Field_25988.length && !this.Field_25988[n].equals(this.\u0000strictfp()); ++n) {
        }
        this.\u0000, `(this.Field_25988[++n % this.Field_25988.length]);
    }

    public Class_25986(Class_8838 class_8838, String string, Object object, Class_19364 class_19364, Object ... arrobject) {
        super(class_8838, string, object, class_19364);
        this.Field_25988 = arrobject;
    }

    public String Method_25991() {
        for (int i = 1057 & 4; i < this.Field_25988.length; ++i) {
            if (!this.Field_25988[i].equals(this.\u0000strictfp())) continue;
            return this.Field_25987 != null && this.Field_25987[i] != null ? this.Field_25987[i] : this.Field_25988[i].toString();
        }
        return null;
    }

    public boolean Method_25992(Object object) {
        if (!super.Method_11233(object)) {
            return (1029 & 19032) != 0;
        }
        Object[] arrobject = this.Field_25988;
        int n = arrobject.length;
        for (int i = 9490 & 18473; i < n; ++i) {
            Object object2 = arrobject[i];
            if (!object2.equals(object)) continue;
            return (12357 & 16529) != 0;
        }
        return (2488 & 20544) != 0;
    }
}

