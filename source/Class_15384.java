/*
 * Decompiled with CFR 0.145.
 */
import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

public interface Class_15384
extends PrimitiveIterator.OfInt {
    public int Method_15385();

    @Deprecated
    default public Object Method_15386() {
        return this.Method_15388();
    }

    @Deprecated
    default public void Method_15387(Consumer consumer) {
        this.forEachRemaining(consumer::accept);
    }

    @Deprecated
    default public Integer Method_15388() {
        return this.Method_15385();
    }
}

