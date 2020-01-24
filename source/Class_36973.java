/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.nio.channels.spi.SelectorProvider;
import java.util.concurrent.ThreadFactory;

public class Class_36973
extends Class_31013 {
    public Class_36973(int n, ThreadFactory threadFactory, SelectorProvider selectorProvider) {
        Object[] arrobject = new Object[-18359 & 145];
        arrobject[8332 & 2816] = selectorProvider;
        super(n, threadFactory, arrobject);
    }

    public Class_36973(int n, ThreadFactory threadFactory) {
        this(n, threadFactory, SelectorProvider.provider());
    }

    public Class_36973() {
        this(-24442 & 17);
    }

    protected Class_37082 Method_36974(ThreadFactory threadFactory, Object ... arrobject) {
        return new Class_47307(this, threadFactory, (SelectorProvider)arrobject[13574 & -32736]);
    }

    public Class_36973(int n) {
        this(n, null);
    }

    private void Method_36975() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

