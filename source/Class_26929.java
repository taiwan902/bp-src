/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_26929
implements Class_1486 {
    protected byte Field_26930;
    protected int Field_26931;
    protected byte Field_26932;
    protected byte Field_26933;
    protected byte Field_26934;
    protected byte Field_26935;
    protected boolean Field_26936;
    protected boolean Field_26937;

    public Class_26929(int n) {
        this.Field_26931 = n;
    }

    public byte Method_26938() {
        return this.Field_26933;
    }

    public byte Method_26939() {
        return this.Field_26930;
    }

    private void Method_26940() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public byte Method_26941() {
        return this.Field_26935;
    }

    public void Method_26942(Class_14856 class_14856) {
        class_14856.Method_14894(this);
    }

    public byte Method_26943() {
        return this.Field_26934;
    }

    public void Method_26944(Class_10954 class_10954) {
        this.Method_26942((Class_14856)class_10954);
    }

    public byte Method_26945() {
        return this.Field_26932;
    }

    public Class_1061 Method_26946(Class_283 class_283) {
        return class_283.Method_343(this.Field_26931);
    }

    public void Method_26947(Class_29900 class_29900) {
        this.Field_26931 = class_29900.Method_30004();
    }

    public String Method_26948() {
        return "Entity_" + super.toString();
    }

    public void Method_26949(Class_29900 class_29900) {
        class_29900.Method_29982(this.Field_26931);
    }

    public boolean Method_26950() {
        return this.Field_26936;
    }

    public Class_26929() {
    }

    public boolean Method_26951() {
        return this.Field_26937;
    }
}

