/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_23464
implements Class_1486 {
    private byte Field_23465;
    private int Field_23466;

    public void Method_23467(Class_10954 class_10954) {
        this.Method_23470((Class_14856)class_10954);
    }

    public void Method_23468(Class_29900 class_29900) {
        class_29900.Method_30010(this.Field_23466);
        class_29900.Method_29949(this.Field_23465);
    }

    public Class_23464() {
    }

    public void Method_23469(Class_29900 class_29900) {
        this.Field_23466 = class_29900.Method_29914();
        this.Field_23465 = class_29900.Method_29944();
    }

    public void Method_23470(Class_14856 class_14856) {
        class_14856.Method_14905(this);
    }

    public Class_1061 Method_23471(Class_283 class_283) {
        return class_283.Method_343(this.Field_23466);
    }

    private void Method_23472() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public byte Method_23473() {
        return this.Field_23465;
    }

    public Class_23464(Class_1061 class_1061, byte by) {
        this.Field_23466 = class_1061.Method_1311();
        this.Field_23465 = by;
    }
}

