/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.cef.callback.CefCallback
 */
import java.io.IOException;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import org.cef.callback.CefCallback;

public class Class_45218
extends Class_20457 {
    final Class_38454 Field_45219;
    final CefCallback Field_45220;

    public void Method_45221(Class_19123 class_19123) {
        Class_23299.Field_23303.execute(() -> this.Method_45224(class_19123, this.Field_45220));
    }

    private void Method_45222() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_45223(int n) {
        this.Field_45219.Field_38456 = n;
        this.Field_45220.Continue();
    }

    private void Method_45224(Class_19123 class_19123, CefCallback cefCallback) {
        try {
            this.Field_45219.Field_38457 = class_19123.Method_19134();
            this.Field_45219.Field_38455 = class_19123.Method_19133();
        }
        catch (IOException iOException) {
            this.Field_45219.Field_38456 = -2 & -2;
        }
        cefCallback.Continue();
    }

    Class_45218(Class_38454 class_38454, CefCallback cefCallback) {
        this.Field_45219 = class_38454;
        this.Field_45220 = cefCallback;
    }
}

