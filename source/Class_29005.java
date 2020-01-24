/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_29005
implements Class_1486 {
    protected float Field_29006;
    protected double Field_29007;
    protected boolean Field_29008;
    protected boolean Field_29009;
    protected double Field_29010;
    protected boolean Field_29011;
    protected float Field_29012;
    protected double Field_29013;

    public double Method_29014() {
        return this.Field_29013;
    }

    public double Method_29015() {
        return this.Field_29007;
    }

    public boolean Method_29016() {
        return this.Field_29009;
    }

    public boolean Method_29017() {
        return this.Field_29011;
    }

    public double Method_29018() {
        return this.Field_29010;
    }

    public void Method_29019(Class_10930 class_10930) {
        class_10930.Method_10934(this);
    }

    public float Method_29020() {
        return this.Field_29012;
    }

    public Class_29005(boolean bl) {
        this.Field_29009 = bl;
    }

    public void Method_29021(boolean bl) {
        this.Field_29008 = bl;
    }

    private void Method_29022() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public float Method_29023() {
        return this.Field_29006;
    }

    public void Method_29024(Class_29900 class_29900) {
        this.Field_29009 = class_29900.Method_30016() != 0 ? 16385 & -19583 : 17416 & 8193;
    }

    public void Method_29025(Class_29900 class_29900) {
        class_29900.Method_29949(this.Field_29009 ? 167 & 15361 : 20144 & 325);
    }

    public Class_29005() {
    }

    public void Method_29026(Class_10954 class_10954) {
        this.Method_29019((Class_10930)class_10954);
    }

    public boolean Method_29027() {
        return this.Field_29008;
    }
}

