/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_44788
implements Class_1486 {
    private long Field_44789;
    private long Field_44790;

    public long Method_44791() {
        return this.Field_44789;
    }

    public void Method_44792(Class_29900 class_29900) {
        this.Field_44789 = class_29900.Method_30001();
        this.Field_44790 = class_29900.Method_30001();
    }

    public void Method_44793(Class_14856 class_14856) {
        class_14856.Method_14892(this);
    }

    public Class_44788(long l, long l2, boolean bl) {
        this.Field_44789 = l;
        this.Field_44790 = l2;
        if (!bl) {
            this.Field_44790 = -this.Field_44790;
            if (this.Field_44790 == (-4074685845761552379L & 4074685845159026816L)) {
                this.Field_44790 = -1L & -1L;
            }
        }
    }

    public void Method_44794(Class_29900 class_29900) {
        class_29900.Method_29957(this.Field_44789);
        class_29900.Method_29957(this.Field_44790);
    }

    public Class_44788() {
    }

    public void Method_44795(Class_10954 class_10954) {
        this.Method_44793((Class_14856)class_10954);
    }

    private void Method_44796() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public long Method_44797() {
        return this.Field_44790;
    }
}

