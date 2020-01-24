/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.FutureCallback
 */
import com.google.common.util.concurrent.FutureCallback;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_30781
implements FutureCallback {
    final String Field_30782;
    final Class_20165 Field_30783;

    public void Method_30784(Object object) {
        this.Field_30783.Field_20181.Method_44629(new Class_34764(this.Field_30782, Class_11247.Field_11248));
    }

    public void Method_30785(Throwable throwable) {
        this.Field_30783.Field_20181.Method_44629(new Class_34764(this.Field_30782, Class_11247.Field_11251));
    }

    Class_30781(Class_20165 class_20165, String string) {
        this.Field_30783 = class_20165;
        this.Field_30782 = string;
    }

    private void Method_30786() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

