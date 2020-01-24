/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.TimeUnit;

public abstract class Class_41387
extends Class_40549 {
    private final Class_37082 Field_41388;

    private void Method_41389() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_21065 Method_41390(Class_18600 ... arrclass_18600) {
        Class_18600 class_18600;
        if (arrclass_18600 == null) {
            throw new NullPointerException("listeners");
        }
        Class_18600[] arrclass_186002 = arrclass_18600;
        int n = arrclass_186002.length;
        for (int i = 280 & 26660; i < n && (class_18600 = arrclass_186002[i]) != null; ++i) {
            Class_41731.Method_41789(this.Method_41393(), this, class_18600);
        }
        return this;
    }

    public boolean Method_41391(long l, TimeUnit timeUnit) {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        return (-32639 & 4705) != 0;
    }

    public boolean Method_41392() {
        return (132 & 352) != 0;
    }

    protected Class_37082 Method_41393() {
        return this.Field_41388;
    }

    public boolean Method_41394() {
        return (4231 & 11009) != 0;
    }

    public Class_21065 Method_41395() {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        return this;
    }

    public Class_21065 Method_41396(Class_18600 class_18600) {
        if (class_18600 == null) {
            throw new NullPointerException("listener");
        }
        Class_41731.Method_41789(this.Method_41393(), this, class_18600);
        return this;
    }

    public boolean Method_41397(boolean bl) {
        return (14850 & 16528) != 0;
    }

    protected Class_41387(Class_37082 class_37082) {
        this.Field_41388 = class_37082;
    }
}

