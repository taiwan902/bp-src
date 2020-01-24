/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_27278
implements Class_1486 {
    private int Field_27279;
    private int Field_27280;

    public int Method_27281() {
        return this.Field_27280;
    }

    public Class_27278() {
    }

    public void Method_27282(Class_29900 class_29900) {
        this.Field_27280 = class_29900.Method_30004();
        this.Field_27279 = class_29900.Method_30016();
    }

    private void Method_27283() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_27284(Class_10954 class_10954) {
        this.Method_27285((Class_14856)class_10954);
    }

    public Class_27278(Class_1061 class_1061, int n) {
        this.Field_27280 = class_1061.Method_1311();
        this.Field_27279 = n;
    }

    public void Method_27285(Class_14856 class_14856) {
        class_14856.Method_14875(this);
    }

    public void Method_27286(Class_29900 class_29900) {
        class_29900.Method_29982(this.Field_27280);
        class_29900.Method_29949(this.Field_27279);
    }

    public int Method_27287() {
        return this.Field_27279;
    }
}

