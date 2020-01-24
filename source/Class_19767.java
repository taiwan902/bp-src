/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_19767
implements Runnable {
    final Class_39158 Field_19768;
    final Class_40426 Field_19769;

    private void Method_19770() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_19771() {
        block2 : {
            try {
                Class_40426.Method_40438(this.Field_19769, this.Field_19768);
            }
            catch (Exception exception) {
                if (!Class_40426.Method_40442().Method_6119()) break block2;
                Class_40426.Method_40442().Method_6127("Unexpected exception while sending chunks.", exception);
            }
        }
    }

    Class_19767(Class_40426 class_40426, Class_39158 class_39158) {
        this.Field_19769 = class_40426;
        this.Field_19768 = class_39158;
    }
}

