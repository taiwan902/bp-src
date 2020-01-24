/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.LinkedHashSet;
import java.util.Set;

public final class Class_25349
implements Class_21832 {
    private final Class_37748 Field_25350;
    private Set Field_25351;

    private void Method_25352() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Class_25349 Method_25353(Class_37748 ... arrclass_37748) {
        if (arrclass_37748 == null) {
            throw new NullPointerException("promises");
        }
        if (arrclass_37748.length == 0) {
            return this;
        }
        Class_25349 class_25349 = this;
        synchronized (class_25349) {
            if (this.Field_25351 == null) {
                int n = arrclass_37748.length > (-24573 & 2581) ? arrclass_37748.length : -22526 & 566;
                this.Field_25351 = new LinkedHashSet(n);
            }
            Class_37748[] arrclass_377482 = arrclass_37748;
            int n = arrclass_377482.length;
            for (int i = 144 & 4192; i < n; ++i) {
                Class_37748 class_37748 = arrclass_377482[i];
                if (class_37748 == null) continue;
                this.Field_25351.add(class_37748);
                class_37748.Method_37766(this);
            }
        }
        return this;
    }

    public synchronized void Method_25354(Class_27581 class_27581) {
        if (this.Field_25351 == null) {
            this.Field_25350.Method_37762();
        } else {
            this.Field_25351.remove(class_27581);
            if (!class_27581.isSuccess()) {
                this.Field_25350.Method_37763(class_27581.cause());
                for (Class_37748 class_37748 : this.Field_25351) {
                    class_37748.Method_37763(class_27581.cause());
                }
            } else if (this.Field_25351.isEmpty()) {
                this.Field_25350.Method_37762();
            }
        }
    }

    public void Method_25355(Class_21065 class_21065) {
        this.Method_25354((Class_27581)class_21065);
    }

    public Class_25349(Class_37748 class_37748) {
        if (class_37748 == null) {
            throw new NullPointerException("aggregatePromise");
        }
        this.Field_25350 = class_37748;
    }
}

