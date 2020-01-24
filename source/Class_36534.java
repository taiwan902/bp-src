/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.Callable;

public class Class_36534
implements Callable {
    final Class_4879 Field_36535;

    public String Method_36536() {
        int n = Class_3238.Method_3435(this.Field_36535.Field_4884.Method_375(this.Field_36535.Field_4886).Method_3442());
        try {
            Object[] arrobject = new Object[7683 & 16651];
            arrobject[-15346 & 97] = n;
            arrobject[9361 & 5] = Class_3238.Method_3323(n).Method_3408();
            arrobject[8274 & 3] = Class_3238.Method_3323(n).getClass().getCanonicalName();
            return String.format("ID #%d (%s // %s)", arrobject);
        }
        catch (Throwable throwable) {
            return "ID #" + n;
        }
    }

    private void Method_36537() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_36534(Class_4879 class_4879) {
        this.Field_36535 = class_4879;
    }

    public Object Method_36538() {
        return this.Method_36536();
    }
}

