/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_47828
extends Class_4879 {
    private int Field_47829;

    public void Method_47830(Class_1699 class_1699) {
        super.Method_4929(class_1699);
        class_1699.Method_1739("OutputSignal", this.Field_47829);
    }

    public int Method_47831() {
        return this.Field_47829;
    }

    public void Method_47832(int n) {
        this.Field_47829 = n;
    }

    public void Method_47833(Class_1699 class_1699) {
        super.Method_4911(class_1699);
        this.Field_47829 = class_1699.Method_1738("OutputSignal");
    }

    private void Method_47834() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

