/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.Callable;

public class Class_7060
implements Callable {
    final Class_31717 Field_7061;

    public String Method_7062() {
        Object[] arrobject = new Object[7437 & 596];
        arrobject[2688 & 66] = Class_31717.Method_31784(this.Field_7061).Method_35677();
        arrobject[33 & 16477] = Class_31717.Method_31784(this.Field_7061).Method_35660();
        arrobject[17667 & 12874] = Class_31717.Method_31795(this.Field_7061);
        arrobject[-32749 & 16911] = Class_31717.Method_31834(this.Field_7061);
        return String.format("Game mode: %s (ID %d). Hardcore: %b. Cheats: %b", arrobject);
    }

    Class_7060(Class_31717 class_31717) {
        this.Field_7061 = class_31717;
    }

    public Object Method_7063() {
        return this.Method_7062();
    }

    private void Method_7064() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

