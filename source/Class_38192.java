/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.security.SecureRandom;
import java.util.concurrent.BlockingQueue;

public final class Class_38192
extends Thread {
    final BlockingQueue Field_38193;

    private void Method_38194() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_38192(String string, BlockingQueue blockingQueue) {
        this.Field_38193 = blockingQueue;
        super(string);
    }

    public void Method_38195() {
        SecureRandom secureRandom = new SecureRandom();
        this.Field_38193.add(secureRandom.generateSeed(9273 & -9848));
    }
}

