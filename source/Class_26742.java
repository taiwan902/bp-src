/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.Callable;

public final class Class_26742
implements Callable {
    final int Field_26743;
    final Class_3238 Field_26744;

    public Object Method_26745() {
        return this.Method_26746();
    }

    public String Method_26746() {
        try {
            Object[] arrobject = new Object[20743 & 3];
            arrobject[24580 & 5123] = this.Field_26743;
            arrobject[-19453 & 2097] = this.Field_26744.Method_3408();
            arrobject[12610 & 2090] = this.Field_26744.getClass().getCanonicalName();
            return String.format("ID #%d (%s // %s)", arrobject);
        }
        catch (Throwable throwable) {
            return "ID #" + this.Field_26743;
        }
    }

    private void Method_26747() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_26742(int n, Class_3238 class_3238) {
        this.Field_26743 = n;
        this.Field_26744 = class_3238;
    }
}

