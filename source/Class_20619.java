/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Comparator;

public final class Class_20619
implements Comparator {
    public int Method_20620(Object object, Object object2) {
        return this.Method_20622((Class_18480)object, (Class_18480)object2);
    }

    private void Method_20621() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public int Method_20622(Class_18480 class_18480, Class_18480 class_184802) {
        return class_18480.Method_18504().compareToIgnoreCase(class_184802.Method_18504());
    }

    Class_20619() {
    }
}

