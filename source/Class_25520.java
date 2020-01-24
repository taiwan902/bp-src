/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.Callable;

public class Class_25520
implements Callable {
    final Class_3238 Field_25521;
    final Class_283 Field_25522;

    private void Method_25523() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_25520(Class_283 class_283, Class_3238 class_3238) {
        this.Field_25522 = class_283;
        this.Field_25521 = class_3238;
    }

    public String Method_25524() {
        try {
            Object[] arrobject = new Object[259 & 26819];
            arrobject[12481 & -31734] = Class_3238.Method_3435(this.Field_25521);
            arrobject[1 & -23903] = this.Field_25521.Method_3408();
            arrobject[16527 & -32398] = this.Field_25521.getClass().getCanonicalName();
            return String.format("ID #%d (%s // %s)", arrobject);
        }
        catch (Throwable throwable) {
            return "ID #" + Class_3238.Method_3435(this.Field_25521);
        }
    }

    public Object Method_25525() {
        return this.Method_25524();
    }
}

