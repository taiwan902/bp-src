/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.atomic.AtomicInteger;

public final class Class_39125
extends Class_34677 {
    final Class_39208 Field_39126;
    private final AtomicInteger Field_39127;

    protected Object Method_39128() {
        return this.Method_39131();
    }

    Class_39125(Class_39208 class_39208) {
        this.Field_39126 = class_39208;
        this.Field_39127 = new AtomicInteger();
    }

    protected void Method_39129(Class_15420 class_15420) {
        class_15420.Method_15443();
    }

    private void Method_39130() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected Class_15420 Method_39131() {
        int n = this.Field_39127.getAndIncrement();
        Class_14963 class_14963 = Class_39208.Method_39244(this.Field_39126) != null ? Class_39208.Method_39244(this.Field_39126)[Math.abs(n % Class_39208.Method_39244(this.Field_39126).length)] : null;
        Class_14963 class_149632 = Class_39208.Method_39232(this.Field_39126) != null ? Class_39208.Method_39232(this.Field_39126)[Math.abs(n % Class_39208.Method_39232(this.Field_39126).length)] : null;
        return new Class_15420(class_14963, class_149632, Class_39208.Method_39239(this.Field_39126), Class_39208.Method_39230(this.Field_39126), Class_39208.Method_39246(this.Field_39126), Class_39208.Method_39249(), Class_39208.Method_39260());
    }

    protected void Method_39132(Object object) {
        this.Method_39129((Class_15420)object);
    }
}

