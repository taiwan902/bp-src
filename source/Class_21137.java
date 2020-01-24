/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_21137
implements Class_1486 {
    private int Field_21138;
    private Class_23823 Field_21139;

    public Class_21137() {
    }

    public Class_21137(int n, Class_23823 class_23823) {
        this.Field_21138 = n;
        this.Field_21139 = class_23823 != null ? class_23823.Method_23850() : null;
    }

    public int Method_21140() {
        return this.Field_21138;
    }

    public Class_23823 Method_21141() {
        return this.Field_21139;
    }

    public void Method_21142(Class_10930 class_10930) {
        class_10930.Method_10933(this);
    }

    private void Method_21143() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_21144(Class_29900 class_29900) {
        this.Field_21138 = class_29900.Method_30008();
        this.Field_21139 = class_29900.Method_30002();
    }

    public void Method_21145(Class_10954 class_10954) {
        this.Method_21142((Class_10930)class_10954);
    }

    public void Method_21146(Class_29900 class_29900) {
        class_29900.Method_29922(this.Field_21138);
        class_29900.Method_29984(this.Field_21139);
    }
}

