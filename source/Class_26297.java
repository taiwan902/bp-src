/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_26297
implements Class_1486 {
    private int Field_26298;
    private int Field_26299;

    public void Method_26300(Class_29900 class_29900) {
        this.Field_26298 = class_29900.Method_29944();
        this.Field_26299 = class_29900.Method_29944();
    }

    public void Method_26301(Class_10954 class_10954) {
        this.Method_26304((Class_10930)class_10954);
    }

    public Class_26297() {
    }

    private void Method_26302() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public int Method_26303() {
        return this.Field_26298;
    }

    public void Method_26304(Class_10930 class_10930) {
        class_10930.Method_10944(this);
    }

    public void Method_26305(Class_29900 class_29900) {
        class_29900.Method_29949(this.Field_26298);
        class_29900.Method_29949(this.Field_26299);
    }

    public Class_26297(int n, int n2) {
        this.Field_26298 = n;
        this.Field_26299 = n2;
    }

    public int Method_26306() {
        return this.Field_26299;
    }
}

