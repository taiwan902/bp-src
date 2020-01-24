/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_9854
implements Runnable {
    final Class_17594 Field_9855;
    final Class_22205 Field_9856;

    Class_9854(Class_22205 class_22205, Class_17594 class_17594) {
        this.Field_9856 = class_22205;
        this.Field_9855 = class_17594;
    }

    public void Method_9857() {
        Class_22205.Method_22220(this.Field_9856).remove(this.Field_9855);
    }

    private void Method_9858() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

