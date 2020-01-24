/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_18381 {
    private Class_11372[] Field_18382;
    private final Class_11885 Field_18383;
    private final int[] Field_18384;
    final Class_22385 Field_18385;

    public int[] Method_18386() {
        return this.Field_18384;
    }

    static Class_11372[] Method_18387(Class_18381 class_18381) {
        return class_18381.Field_18382;
    }

    public Class_11885 Method_18388() {
        return this.Field_18383;
    }

    public int Method_18389() {
        return this.Field_18384.length / this.Field_18383.Method_11914();
    }

    private void Method_18390() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_18381(Class_22385 class_22385, int[] arrn, Class_11885 class_11885, Class_11372[] arrclass_11372) {
        this.Field_18385 = class_22385;
        this.Field_18384 = arrn;
        this.Field_18383 = class_11885;
        this.Field_18382 = arrclass_11372;
    }
}

