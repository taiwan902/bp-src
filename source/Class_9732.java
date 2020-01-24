/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.FutureCallback
 */
import com.google.common.util.concurrent.FutureCallback;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_9732
implements FutureCallback {
    final String Field_9733;
    final Class_20165 Field_9734;

    Class_9732(Class_20165 class_20165, String string) {
        this.Field_9734 = class_20165;
        this.Field_9733 = string;
    }

    private void Method_9735() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_9736(Object object) {
        this.Field_9734.Field_20181.Method_44629(new Class_34764(this.Field_9733, Class_11247.Field_11248));
    }

    public void Method_9737(Throwable throwable) {
        this.Field_9734.Field_20181.Method_44629(new Class_34764(this.Field_9733, Class_11247.Field_11251));
    }
}

