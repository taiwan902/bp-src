/*
 * Decompiled with CFR 0.145.
 */
import java.io.PrintStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_30877
extends Thread {
    private final Throwable Field_30878;

    private void Method_30879() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_30877(Throwable throwable) {
        this.Field_30878 = throwable;
        this.start();
    }

    public void Method_30880() {
        System.err.println("Blad: " + this.Field_30878.getMessage() + " (" + this.Field_30878.getClass() + ")");
        System.out.flush();
        System.err.flush();
        Runtime.getRuntime().exit(-32431 & 25738);
    }
}

