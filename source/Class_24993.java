/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.ListenableFuture
 */
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_24993
implements Class_18600 {
    final Class_9924 Field_24994;

    public void Method_24995(Class_21065 class_21065) {
        if (class_21065.Method_21070()) {
            Class_22553 class_22553;
            this.Field_24994.Field_9927 = class_22553 = (Class_22553)class_21065.get();
            Class_18.Field_89.Method_229(new Class_13560(this));
        } else {
            Throwable throwable = class_21065.Method_21066();
            if (throwable != null) {
                throwable.printStackTrace();
            }
        }
    }

    Class_24993(Class_9924 class_9924) {
        this.Field_24994 = class_9924;
    }

    private void Method_24996() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

