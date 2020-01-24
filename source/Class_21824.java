/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_21824
implements Class_1486 {
    private int[] Field_21825;

    private void Method_21826() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_21827(Class_29900 class_29900) {
        this.Field_21825 = new int[class_29900.Method_30004()];
        for (int i = 4096 & 2688; i < this.Field_21825.length; ++i) {
            this.Field_21825[i] = class_29900.Method_30004();
        }
    }

    public void Method_21828(Class_29900 class_29900) {
        class_29900.Method_29982(this.Field_21825.length);
        for (int i = 16584 & -30974; i < this.Field_21825.length; ++i) {
            class_29900.Method_29982(this.Field_21825[i]);
        }
    }

    public Class_21824(int ... arrn) {
        this.Field_21825 = arrn;
    }

    public void Method_21829(Class_14856 class_14856) {
        class_14856.Method_14907(this);
    }

    public void Method_21830(Class_10954 class_10954) {
        this.Method_21829((Class_14856)class_10954);
    }

    public Class_21824() {
    }

    public int[] Method_21831() {
        return this.Field_21825;
    }
}

