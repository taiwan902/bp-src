/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.FutureCallback
 *  com.google.common.util.concurrent.ListenableFuture
 *  com.google.common.util.concurrent.SettableFuture
 */
import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.io.File;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_17890
implements FutureCallback {
    final File Field_17891;
    final SettableFuture Field_17892;
    final Class_10502 Field_17893;

    private void Method_17894() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_17895(Object object) {
        this.Field_17893.Method_10524(this.Field_17891);
        this.Field_17892.set(null);
    }

    public void Method_17896(Throwable throwable) {
        this.Field_17892.setException(throwable);
    }

    Class_17890(Class_10502 class_10502, File file, SettableFuture settableFuture) {
        this.Field_17893 = class_10502;
        this.Field_17891 = file;
        this.Field_17892 = settableFuture;
    }
}

