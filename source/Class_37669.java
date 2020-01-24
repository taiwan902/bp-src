/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_37669
extends Class_34677 {
    final Class_32390 Field_37670;

    protected Object Method_37671() {
        return this.Method_37673();
    }

    private void Method_37672() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected Class_11651 Method_37673() {
        return new Class_11651(this.Field_37670, Thread.currentThread(), Class_32390.Method_32404(this.Field_37670));
    }

    Class_37669(Class_32390 class_32390) {
        this.Field_37670 = class_32390;
    }
}

