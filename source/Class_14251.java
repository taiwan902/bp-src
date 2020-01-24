/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.ThreadFactoryBuilder
 */
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.ThreadFactory;

public final class Class_14251
extends Class_7374 {
    protected Object Method_14252() {
        return this.Method_14253();
    }

    protected Class_33611 Method_14253() {
        return new Class_33611(9218 & -29976, new ThreadFactoryBuilder().setNameFormat("Netty Local Server IO #%d").setDaemon((14353 & 1135) != 0).build());
    }

    private void Method_14254() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_14251() {
    }
}

