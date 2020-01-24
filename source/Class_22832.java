/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Queue;

public class Class_22832
implements Runnable {
    final Class_45231 Field_22833;
    final Class_46724 Field_22834;

    Class_22832(Class_46724 class_46724, Class_45231 class_45231) {
        this.Field_22834 = class_46724;
        this.Field_22833 = class_45231;
    }

    public void Method_22835() {
        this.Field_22834.Field_46734.add(this.Field_22833);
    }

    private void Method_22836() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

