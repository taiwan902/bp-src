/*
 * Decompiled with CFR 0.145.
 */
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

@FunctionalInterface
public interface Class_16176
extends Consumer,
IntConsumer {
    @Deprecated
    default public void Method_16177(Object object) {
        this.Method_16178((Integer)object);
    }

    @Deprecated
    default public void Method_16178(Integer n) {
        this.accept(n.intValue());
    }

    private void Method_16179(IntConsumer intConsumer, int n) {
        this.accept(n);
        intConsumer.accept(n);
    }

    @Deprecated
    default public Consumer Method_16180(Consumer consumer) {
        return Consumer.super.andThen(consumer);
    }

    default public Class_16176 Method_16181(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        return arg_0 -> this.Method_16179(intConsumer, arg_0);
    }

    default public IntConsumer Method_16182(IntConsumer intConsumer) {
        return this.Method_16181(intConsumer);
    }
}

