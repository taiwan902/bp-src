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

public final class Class_25489
extends Class_7374 {
    Class_25489() {
    }

    protected Object Method_25490() {
        return this.Method_25492();
    }

    private void Method_25491() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected Class_36973 Method_25492() {
        return new Class_36973(26708 & -32767, new ThreadFactoryBuilder().setNameFormat("Netty Server IO #%d").setDaemon((8193 & 1541) != 0).build());
    }
}

