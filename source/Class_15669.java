/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.TimeUnit;

public final class Class_15669
implements Runnable {
    final Class_45604 Field_15670;
    private final Class_39158 Field_15671;

    Class_15669(Class_45604 class_45604, Class_39158 class_39158) {
        this.Field_15670 = class_45604;
        this.Field_15671 = class_39158;
    }

    private void Method_15672() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_15673() {
        if (!this.Field_15671.Method_39175().Method_26114()) {
            return;
        }
        long l = System.nanoTime();
        long l2 = Class_45604.Method_45613(this.Field_15670) - (l - Class_45604.Method_45611(this.Field_15670));
        if (l2 <= (1880899840L & 8559635L)) {
            Class_45604.Method_45615(this.Field_15670, this.Field_15671.Method_39160().schedule((Runnable)this, Class_45604.Method_45613(this.Field_15670), TimeUnit.NANOSECONDS));
            try {
                this.Field_15670.Method_45622(this.Field_15671);
            }
            catch (Throwable throwable) {
                this.Field_15671.Method_39162(throwable);
            }
        } else {
            Class_45604.Method_45615(this.Field_15670, this.Field_15671.Method_39160().schedule((Runnable)this, l2, TimeUnit.NANOSECONDS));
        }
    }
}

