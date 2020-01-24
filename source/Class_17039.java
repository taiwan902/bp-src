/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public final class Class_17039
implements Class_8126 {
    private final Class Field_17040;

    public String Method_17041() {
        return Class_22304.Method_22309(this.Field_17040) + ".class";
    }

    public Class_26095 Method_17042() {
        try {
            return (Class_26095)this.Field_17040.newInstance();
        }
        catch (Throwable throwable) {
            throw new Class_31422("Unable to create Channel from class " + this.Field_17040, throwable);
        }
    }

    Class_17039(Class class_) {
        this.Field_17040 = class_;
    }

    private void Method_17043() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

