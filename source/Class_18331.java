/*
 * Decompiled with CFR 0.145.
 */
import java.awt.image.BufferedImage;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.atomic.AtomicBoolean;

public class Class_18331
implements Class_7057 {
    Class_15993 Field_18332 = new Class_15993();
    private AtomicBoolean Field_18333;
    private Class_2080 Field_18334;

    public BufferedImage Method_18335(BufferedImage bufferedImage) {
        return Class_1456.Method_1466(bufferedImage);
    }

    private void Method_18336() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_18331(Class_2080 class_2080, AtomicBoolean atomicBoolean) {
        this.Field_18334 = class_2080;
        this.Field_18333 = atomicBoolean;
    }

    public void Method_18337() {
        this.Field_18333.set((9985 & -12239) != 0);
    }
}

