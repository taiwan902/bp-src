/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_2840
extends Class_2824 {
    private final String Field_2841;

    public boolean Method_2842(Object object) {
        if (this == object) {
            return (10513 & 16515) != 0;
        }
        if (!(object instanceof Class_2840)) {
            return (28225 & -32484) != 0;
        }
        Class_2840 class_2840 = (Class_2840)object;
        return (this.Field_2841.equals(class_2840.Method_2848()) && super.Method_2837(object) ? -32635 & 257 : 2377 & 8196) != 0;
    }

    public Class_1782 Method_2843() {
        return this.Method_2844();
    }

    public Class_2840 Method_2844() {
        Class_2840 class_2840 = new Class_2840(this.Field_2841);
        class_2840.\u0000strictfp(this.\u0000strictfp().Method_2947());
        for (Class_1782 class_1782 : this.\u0000strictfp()) {
            class_2840.\u0000strictfp(class_1782.Method_1790());
        }
        return class_2840;
    }

    public Class_2840(String string) {
        this.Field_2841 = string;
    }

    public String Method_2845() {
        return this.Field_2841;
    }

    private void Method_2846() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public String Method_2847() {
        return "TextComponent{text='" + this.Field_2841 + (char)(3111 & -32025) + ", siblings=" + this.\u0000strictfp + ", style=" + this.\u0000strictfp() + (char)(637 & -31361);
    }

    public String Method_2848() {
        return this.Field_2841;
    }
}

