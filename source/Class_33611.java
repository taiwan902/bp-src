/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.ThreadFactory;

public class Class_33611
extends Class_31013 {
    public Class_33611(int n) {
        this(n, null);
    }

    protected Class_37082 Method_33612(ThreadFactory threadFactory, Object ... arrobject) {
        return new Class_47934(this, threadFactory);
    }

    public Class_33611() {
        this(561 & 16388);
    }

    private void Method_33613() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_33611(int n, ThreadFactory threadFactory) {
        super(n, threadFactory, new Object[9349 & 4608]);
    }
}

