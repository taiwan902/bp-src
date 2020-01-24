/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_2884
extends Class_2824 {
    private final String Field_2885;

    public String Method_2886() {
        return this.Field_2885;
    }

    public boolean Method_2887(Object object) {
        if (this == object) {
            return (2563 & 29825) != 0;
        }
        if (!(object instanceof Class_2884)) {
            return (2064 & 8228) != 0;
        }
        Class_2884 class_2884 = (Class_2884)object;
        return (this.Field_2885.equals(class_2884.Field_2885) && super.Method_2837(object) ? 10257 & 4809 : 13956 & 355) != 0;
    }

    public Class_1782 Method_2888() {
        return this.Method_2891();
    }

    private void Method_2889() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public String Method_2890() {
        return "SelectorComponent{pattern='" + this.Field_2885 + (char)(-11673 & 8631) + ", siblings=" + this.\u0000strictfp + ", style=" + this.\u0000strictfp() + (char)(-32643 & 381);
    }

    public Class_2884 Method_2891() {
        Class_2884 class_2884 = new Class_2884(this.Field_2885);
        class_2884.\u0000strictfp(this.\u0000strictfp().Method_2947());
        for (Class_1782 class_1782 : this.\u0000strictfp()) {
            class_2884.\u0000strictfp(class_1782.Method_1790());
        }
        return class_2884;
    }

    public String Method_2892() {
        return this.Field_2885;
    }

    public Class_2884(String string) {
        this.Field_2885 = string;
    }
}

