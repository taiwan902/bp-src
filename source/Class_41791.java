/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_41791
implements Runnable {
    public Class_10954 Field_41792;
    public Class_1486 Field_41793;

    private void Method_41794() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_41791(Class_1486 class_1486, Class_10954 class_10954) {
        this.Field_41793 = class_1486;
        this.Field_41792 = class_10954;
    }

    public void Method_41795() {
        Class_10954 class_10954 = this.Field_41792;
        if (class_10954 instanceof Class_20165) {
            Class_20165 class_20165 = (Class_20165)class_10954;
            class_20165.Field_20174 += 20639 & 1121;
        }
        this.Field_41793.Method_1489(class_10954);
    }
}

