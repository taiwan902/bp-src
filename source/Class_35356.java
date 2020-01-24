/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_35356 {
    private final Class_32797 Field_35357;
    private final float Field_35358;
    private final int Field_35359;
    private final float Field_35360;
    private final float Field_35361;
    private final String Field_35362;

    public float Method_35363() {
        return this.Field_35357 == Class_32797.Field_32802 ? 1.0164278E38f * 3.347826f : this.Field_35360;
    }

    public Class_1782 Method_35364() {
        return this.Method_35365().Method_32856() == null ? null : this.Method_35365().Method_32856().Method_1232();
    }

    public Class_32797 Method_35365() {
        return this.Field_35357;
    }

    public Class_35356(Class_32797 class_32797, int n, float f, float f2, String string, float f3) {
        this.Field_35357 = class_32797;
        this.Field_35359 = n;
        this.Field_35358 = f2;
        this.Field_35361 = f;
        this.Field_35362 = string;
        this.Field_35360 = f3;
    }

    public String Method_35366() {
        return this.Field_35362;
    }

    private void Method_35367() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public float Method_35368() {
        return this.Field_35358;
    }

    public boolean Method_35369() {
        return this.Field_35357.Method_32856() instanceof Class_859;
    }
}

