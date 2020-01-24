/*
 * Decompiled with CFR 0.145.
 */
import java.lang.annotation.Annotation;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Map;

public abstract class Class_36003
implements Class_31885 {
    boolean Field_36004;

    public void Method_36005(Class_39158 class_39158) {
    }

    public void Method_36006(Class_39158 class_39158) {
    }

    public boolean Method_36007() {
        Class<?> class_ = this.getClass();
        Map map = Class_32728.Method_32743().Method_32740();
        Boolean bl = (Boolean)map.get(class_);
        if (bl == null) {
            bl = class_.isAnnotationPresent(Class_17815.class);
            map.put(class_, bl);
        }
        return bl;
    }

    public void Method_36008(Class_39158 class_39158, Throwable throwable) {
        class_39158.Method_39162(throwable);
    }

    private void Method_36009() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

