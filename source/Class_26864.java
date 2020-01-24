/*
 * Decompiled with CFR 0.145.
 */
import java.util.Iterator;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

public interface Class_26864
extends Iterable {
    default public void Method_26865(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        Class_15384 class_15384 = this.Method_26867();
        while (class_15384.hasNext()) {
            intConsumer.accept(class_15384.Method_15385());
        }
    }

    default public Iterator Method_26866() {
        return this.Method_26867();
    }

    public Class_15384 Method_26867();

    @Deprecated
    default public void Method_26868(Consumer consumer) {
        this.Method_26865(consumer::accept);
    }
}

