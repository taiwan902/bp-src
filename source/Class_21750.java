/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.ListenableFuture
 */
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_21750
implements Runnable {
    final ListenableFuture Field_21751;
    final Class_19202 Field_21752;

    private void Method_21753() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_21754() {
        this.Field_21751.cancel((34 & 19712) != 0);
    }

    Class_21750(Class_19202 class_19202, ListenableFuture listenableFuture) {
        this.Field_21752 = class_19202;
        this.Field_21751 = listenableFuture;
    }
}

