/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public abstract class Class_45588
extends Class_41387
implements Class_27581 {
    private final Class_26095 Field_45589;

    public Class_21065 Method_45590(Class_18600[] arrclass_18600) {
        return this.Method_45592(arrclass_18600);
    }

    protected Class_45588(Class_26095 class_26095, Class_37082 class_37082) {
        super(class_37082);
        if (class_26095 == null) {
            throw new NullPointerException("channel");
        }
        this.Field_45589 = class_26095;
    }

    public Class_26095 Method_45591() {
        return this.Field_45589;
    }

    public Class_27581 Method_45592(Class_18600 ... arrclass_18600) {
        super.Method_41390(arrclass_18600);
        return this;
    }

    public Class_27581 Method_45593() {
        return this;
    }

    protected Class_37082 Method_45594() {
        Class_37082 class_37082 = super.Method_41393();
        if (class_37082 == null) {
            return this.Method_45591().Method_26113();
        }
        return class_37082;
    }

    public Void Method_45595() {
        return null;
    }

    public Class_21065 Method_45596(Class_18600 class_18600) {
        return this.Method_45599(class_18600);
    }

    public Class_27581 Method_45597() {
        return this;
    }

    public Class_27581 Method_45598() {
        return this;
    }

    public Class_27581 Method_45599(Class_18600 class_18600) {
        super.Method_41396(class_18600);
        return this;
    }

    public Class_27581 Method_45600() {
        return this;
    }

    private void Method_45601() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Object Method_45602() {
        return this.Method_45595();
    }

    public Class_21065 Method_45603() {
        return this.Method_45598();
    }
}

