/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Collection;

public class Class_8735 {
    private final Collection Field_8736;
    private final String Field_8737;
    private final double Field_8738;
    final Class_43947 Field_8739;

    public Class_8735(Class_43947 class_43947, String string, double d, Collection collection) {
        this.Field_8739 = class_43947;
        this.Field_8737 = string;
        this.Field_8738 = d;
        this.Field_8736 = collection;
    }

    private void Method_8740() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Collection Method_8741() {
        return this.Field_8736;
    }

    public String Method_8742() {
        return this.Field_8737;
    }

    public double Method_8743() {
        return this.Field_8738;
    }
}

