/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_36134
implements Class_1486 {
    private Class_4751 Field_36135;
    private int Field_36136;
    private int Field_36137;

    public Class_36134(int n, Class_4751 class_4751, int n2) {
        this.Field_36136 = n;
        this.Field_36135 = class_4751;
        this.Field_36137 = n2;
    }

    public Class_36134() {
    }

    public int Method_36138() {
        return this.Field_36136;
    }

    private void Method_36139() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_36140(Class_14856 class_14856) {
        class_14856.Method_14918(this);
    }

    public void Method_36141(Class_29900 class_29900) {
        this.Field_36136 = class_29900.Method_30004();
        this.Field_36135 = class_29900.Method_29910();
        this.Field_36137 = class_29900.Method_30016();
    }

    public int Method_36142() {
        return this.Field_36137;
    }

    public void Method_36143(Class_10954 class_10954) {
        this.Method_36140((Class_14856)class_10954);
    }

    public Class_4751 Method_36144() {
        return this.Field_36135;
    }

    public void Method_36145(Class_29900 class_29900) {
        class_29900.Method_29982(this.Field_36136);
        class_29900.Method_29996(this.Field_36135);
        class_29900.Method_29949(this.Field_36137);
    }
}

