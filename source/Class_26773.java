/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_26773
implements Class_1486 {
    private boolean Field_26774;
    private float Field_26775;
    private boolean Field_26776;
    private boolean Field_26777;
    private float Field_26778;
    private boolean Field_26779;

    public void Method_26780(Class_14856 class_14856) {
        class_14856.Method_14886(this);
    }

    public boolean Method_26781() {
        return this.Field_26776;
    }

    public void Method_26782(boolean bl) {
        this.Field_26777 = bl;
    }

    public void Method_26783(boolean bl) {
        this.Field_26774 = bl;
    }

    public boolean Method_26784() {
        return this.Field_26777;
    }

    private void Method_26785() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_26786(float f) {
        this.Field_26778 = f;
    }

    public boolean Method_26787() {
        return this.Field_26779;
    }

    public float Method_26788() {
        return this.Field_26778;
    }

    public void Method_26789(Class_29900 class_29900) {
        int n = -30328 & 1536;
        if (this.Method_26781()) {
            n = (byte)(n | 4355 & 8909);
        }
        if (this.Method_26791()) {
            n = (byte)(n | 19 & 4006);
        }
        if (this.Method_26787()) {
            n = (byte)(n | -15668 & 2055);
        }
        if (this.Method_26784()) {
            n = (byte)(n | 72 & 11176);
        }
        class_29900.Method_29949(n);
        class_29900.Method_29939(this.Field_26778);
        class_29900.Method_29939(this.Field_26775);
    }

    public void Method_26790(boolean bl) {
        this.Field_26779 = bl;
    }

    public boolean Method_26791() {
        return this.Field_26774;
    }

    public Class_26773() {
    }

    public void Method_26792(boolean bl) {
        this.Field_26776 = bl;
    }

    public void Method_26793(Class_10954 class_10954) {
        this.Method_26780((Class_14856)class_10954);
    }

    public void Method_26794(Class_29900 class_29900) {
        byte by = class_29900.Method_29944();
        this.Method_26792(((by & (25601 & 2217)) > 0 ? 4645 & -31735 : 388 & 0) != 0);
        this.Method_26783(((by & (2818 & 8442)) > 0 ? 10503 & 1609 : 576 & -28390) != 0);
        this.Method_26790(((by & (4244 & -31739)) > 0 ? 9281 & -30207 : 4128 & 8976) != 0);
        this.Method_26782(((by & (3100 & 17288)) > 0 ? 27 & 7365 : 2065 & 9218) != 0);
        this.Method_26786(class_29900.Method_29966());
        this.Method_26796(class_29900.Method_29966());
    }

    public Class_26773(Class_18080 class_18080) {
        this.Method_26792(class_18080.Field_18085);
        this.Method_26783(class_18080.Method_18090());
        this.Method_26790(class_18080.Method_18095());
        this.Method_26782(class_18080.Method_18094());
        this.Method_26786(class_18080.Method_18093());
        this.Method_26796(class_18080.Method_18101());
    }

    public float Method_26795() {
        return this.Field_26775;
    }

    public void Method_26796(float f) {
        this.Field_26775 = f;
    }
}

