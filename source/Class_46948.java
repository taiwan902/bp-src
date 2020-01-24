/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public final class Class_46948
extends Class_45721 {
    void Method_46949(CharSequence charSequence) {
        super.Method_45745(charSequence);
        if (Class_17103.Method_17159("Content-Length", charSequence) || Class_17103.Method_17159("Transfer-Encoding", charSequence) || Class_17103.Method_17159("Trailer", charSequence)) {
            throw new IllegalArgumentException("prohibited trailing header: " + charSequence);
        }
    }

    private void Method_46950() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_46948(boolean bl) {
        super(bl);
    }
}

