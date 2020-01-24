/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_38126
implements Class_11915 {
    private Class_20385 Field_38127 = Class_20385.Field_20388;

    public void Method_38128(Class_20385 class_20385) {
        if (class_20385 == null) {
            throw new NullPointerException("decoderResult");
        }
        this.Field_38127 = class_20385;
    }

    public Class_20385 Method_38129() {
        return this.Field_38127;
    }

    private void Method_38130() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected Class_38126() {
    }
}

