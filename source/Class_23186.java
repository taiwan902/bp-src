/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_23186
implements Class_1486 {
    private boolean Field_23187;
    private boolean Field_23188;
    private boolean Field_23189;
    private float Field_23190;
    private float Field_23191;
    private boolean Field_23192;

    public void Method_23193(Class_10930 class_10930) {
        class_10930.Method_10939(this);
    }

    public void Method_23194(boolean bl) {
        this.Field_23189 = bl;
    }

    public Class_23186(Class_18080 class_18080) {
        this.Method_23200(class_18080.Field_18085);
        this.Method_23206(class_18080.Method_18090());
        this.Method_23201(class_18080.Method_18095());
        this.Method_23194(class_18080.Method_18094());
        this.Method_23202(class_18080.Method_18093());
        this.Method_23205(class_18080.Method_18101());
    }

    public boolean Method_23195() {
        return this.Field_23188;
    }

    public boolean Method_23196() {
        return this.Field_23189;
    }

    public boolean Method_23197() {
        return this.Field_23192;
    }

    public Class_23186() {
    }

    private void Method_23198() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_23199(Class_29900 class_29900) {
        int n = 26900 & -28510;
        if (this.Method_23197()) {
            n = (byte)(n | 1 & 20621);
        }
        if (this.Method_23195()) {
            n = (byte)(n | -32594 & 26883);
        }
        if (this.Method_23203()) {
            n = (byte)(n | 8364 & -32762);
        }
        if (this.Method_23196()) {
            n = (byte)(n | 650 & 9517);
        }
        class_29900.Method_29949(n);
        class_29900.Method_29939(this.Field_23191);
        class_29900.Method_29939(this.Field_23190);
    }

    public void Method_23200(boolean bl) {
        this.Field_23192 = bl;
    }

    public void Method_23201(boolean bl) {
        this.Field_23187 = bl;
    }

    public void Method_23202(float f) {
        this.Field_23191 = f;
    }

    public boolean Method_23203() {
        return this.Field_23187;
    }

    public void Method_23204(Class_10954 class_10954) {
        this.Method_23193((Class_10930)class_10954);
    }

    public void Method_23205(float f) {
        this.Field_23190 = f;
    }

    public void Method_23206(boolean bl) {
        this.Field_23188 = bl;
    }

    public void Method_23207(Class_29900 class_29900) {
        byte by = class_29900.Method_29944();
        this.Method_23200(((by & (2315 & -6495)) > 0 ? 16641 & 2087 : -30634 & 16640) != 0);
        this.Method_23206(((by & (-30682 & 4122)) > 0 ? 293 & 8841 : -32496 & 9280) != 0);
        this.Method_23201(((by & (9350 & 23396)) > 0 ? 22147 & 93 : -28288 & 9268) != 0);
        this.Method_23194(((by & (88 & 2056)) > 0 ? -30459 & 8745 : 1536 & -24576) != 0);
        this.Method_23202(class_29900.Method_29966());
        this.Method_23205(class_29900.Method_29966());
    }
}

