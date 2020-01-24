/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_18149
extends Thread {
    private Class_32728 Field_18150;

    public final Class_32728 Method_18151() {
        return this.Field_18150;
    }

    public Class_18149(Runnable runnable, String string) {
        super(runnable, string);
    }

    private void Method_18152() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_18149() {
    }

    public final void Method_18153(Class_32728 class_32728) {
        this.Field_18150 = class_32728;
    }
}

