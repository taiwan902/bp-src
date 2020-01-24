/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Comparator;

public final class Class_11345
implements Comparator {
    Class_11345() {
    }

    public int Method_11346(Class_21696 class_21696, Class_21696 class_216962) {
        return class_21696.Method_21706() > class_216962.Method_21706() ? 16421 & -26231 : (class_21696.Method_21706() < class_216962.Method_21706() ? -1 & -1 : class_216962.Method_21715().compareToIgnoreCase(class_21696.Method_21715()));
    }

    public int Method_11347(Object object, Object object2) {
        return this.Method_11346((Class_21696)object, (Class_21696)object2);
    }

    private void Method_11348() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

