/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_19305
implements Runnable {
    final Class_47372 Field_19306;
    final Class_37748 Field_19307;
    final Class_39158 Field_19308;

    private void Method_19309() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_19310() {
        Class_47372.Method_47412().Method_6132(this.Field_19308.Method_39175() + " last write attempt timed out. Force-closing the connection.");
        this.Field_19308.Method_39167(this.Field_19307);
    }

    Class_19305(Class_47372 class_47372, Class_39158 class_39158, Class_37748 class_37748) {
        this.Field_19306 = class_47372;
        this.Field_19308 = class_39158;
        this.Field_19307 = class_37748;
    }
}

