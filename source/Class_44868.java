/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_44868 {
    private final Class_14202 Field_44869;
    private final Class_1782 Field_44870;

    public boolean Method_44871(Object object) {
        if (this == object) {
            return (2309 & -4015) != 0;
        }
        if (object != null && this.getClass() == object.getClass()) {
            Class_44868 class_44868 = (Class_44868)object;
            if (this.Field_44869 != class_44868.Field_44869) {
                return (24723 & -28160) != 0;
            }
            if (this.Field_44870 != null) {
                if (!this.Field_44870.equals(class_44868.Field_44870)) {
                    return (-4829 & 128) != 0;
                }
            } else if (class_44868.Field_44870 != null) {
                return (-11888 & 1031) != 0;
            }
            return (2113 & -23025) != 0;
        }
        return (9296 & 160) != 0;
    }

    public int Method_44872() {
        int n = this.Field_44869.hashCode();
        n = (2719 & 8287) * n + (this.Field_44870 != null ? this.Field_44870.hashCode() : 3088 & 4393);
        return n;
    }

    public Class_14202 Method_44873() {
        return this.Field_44869;
    }

    public Class_1782 Method_44874() {
        return this.Field_44870;
    }

    private void Method_44875() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_44868(Class_14202 class_14202, Class_1782 class_1782) {
        this.Field_44869 = class_14202;
        this.Field_44870 = class_1782;
    }

    public String Method_44876() {
        return "HoverEvent{action=" + (Object)((Object)this.Field_44869) + ", value='" + this.Field_44870 + (char)(575 & 8231) + (char)(125 & 8317);
    }
}

