/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_21230 {
    private final Class_17245 Field_21231;
    private final String Field_21232;

    public int Method_21233() {
        int n = this.Field_21231.hashCode();
        n = (28767 & 575) * n + (this.Field_21232 != null ? this.Field_21232.hashCode() : -32732 & 11328);
        return n;
    }

    public Class_21230(Class_17245 class_17245, String string) {
        this.Field_21231 = class_17245;
        this.Field_21232 = string;
    }

    public boolean Method_21234(Object object) {
        if (this == object) {
            return (-30655 & 19) != 0;
        }
        if (object != null && this.getClass() == object.getClass()) {
            Class_21230 class_21230 = (Class_21230)object;
            if (this.Field_21231 != class_21230.Field_21231) {
                return (8195 & 4736) != 0;
            }
            if (this.Field_21232 != null) {
                if (!this.Field_21232.equals(class_21230.Field_21232)) {
                    return (18444 & 4256) != 0;
                }
            } else if (class_21230.Field_21232 != null) {
                return (26628 & 4440) != 0;
            }
            return (-30303 & 19) != 0;
        }
        return (10688 & 16418) != 0;
    }

    private void Method_21235() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_17245 Method_21236() {
        return this.Field_21231;
    }

    public String Method_21237() {
        return this.Field_21232;
    }

    public String Method_21238() {
        return "ClickEvent{action=" + (Object)((Object)this.Field_21231) + ", value='" + this.Field_21232 + (char)(-19033 & 18487) + (char)(3325 & -24451);
    }
}

