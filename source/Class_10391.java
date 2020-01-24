/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_10391
implements Class_2748 {
    final Class_2457 Field_10392;
    private long Field_10393;

    public void Method_10394(String string) {
    }

    public void Method_10395(String string) {
    }

    Class_10391(Class_2457 class_2457) {
        this.Field_10392 = class_2457;
        this.Field_10393 = System.currentTimeMillis();
    }

    public void Method_10396() {
    }

    private void Method_10397() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_10398(String string) {
    }

    public void Method_10399(int n) {
        if (System.currentTimeMillis() - this.Field_10393 >= (343938024L & 572852217L)) {
            this.Field_10393 = System.currentTimeMillis();
            Class_2457.Method_2544().info("Converting... " + n + "%");
        }
    }
}

