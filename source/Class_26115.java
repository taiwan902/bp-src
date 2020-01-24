/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_26115
implements Class_1486 {
    private int Field_26116;
    private List Field_26117;

    public int Method_26118() {
        return this.Field_26116;
    }

    public Class_26115(int n, Class_32695 class_32695, boolean bl) {
        this.Field_26116 = n;
        this.Field_26117 = bl ? class_32695.Method_32707() : class_32695.Method_32726();
    }

    public void Method_26119(Class_29900 class_29900) {
        class_29900.Method_29982(this.Field_26116);
        Class_32695.Method_32702(this.Field_26117, class_29900);
    }

    private void Method_26120() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_26121(Class_10954 class_10954) {
        this.Method_26124((Class_14856)class_10954);
    }

    public List Method_26122() {
        return this.Field_26117;
    }

    public void Method_26123(Class_29900 class_29900) {
        this.Field_26116 = class_29900.Method_30004();
        this.Field_26117 = Class_32695.Method_32717(class_29900);
    }

    public Class_26115() {
    }

    public void Method_26124(Class_14856 class_14856) {
        class_14856.Method_14908(this);
    }
}

