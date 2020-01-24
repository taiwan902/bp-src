/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_36312
implements Class_4990 {
    private String Field_36313;
    private Class_1782 Field_36314;

    public boolean Method_36315() {
        return (25809 & 4875) != 0;
    }

    private void Method_36316() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_36312(String string, Class_1782 class_1782) {
        this.Field_36313 = string;
        this.Field_36314 = class_1782;
    }

    public String Method_36317() {
        return this.Field_36313;
    }

    public String Method_36318() {
        return this.Field_36314.Method_1788();
    }

    public Class_8295 Method_36319(Class_37781 class_37781, Class_626 class_626) {
        throw new UnsupportedOperationException();
    }

    public Class_1782 Method_36320() {
        return this.Field_36314;
    }
}

