/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_5981
implements Runnable {
    final Class_41731 Field_5982;
    final Class_18600 Field_5983;

    private void Method_5984() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_5985() {
        Class_41731.Method_41744(this.Field_5982, this.Field_5983);
        Class_41731.Method_41781(this.Field_5982, null);
    }

    Class_5981(Class_41731 class_41731, Class_18600 class_18600) {
        this.Field_5982 = class_41731;
        this.Field_5983 = class_18600;
    }
}

