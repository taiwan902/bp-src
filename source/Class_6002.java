/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_6002 {
    private final boolean Field_6003;
    private double Field_6004;
    private double Field_6005;
    private final Class_2080 Field_6006;

    public void Method_6007(double d) {
        this.Field_6005 = d;
    }

    public Class_2080 Method_6008() {
        return this.Field_6006;
    }

    public double Method_6009() {
        return this.Field_6005;
    }

    private void Method_6010() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_6002(Class_2080 class_2080, double d, double d2, boolean bl) {
        this.Field_6006 = class_2080;
        this.Field_6005 = d;
        this.Field_6004 = d2;
        this.Field_6003 = bl;
    }

    public Class_6002(Class_6002 class_6002) {
        this.Field_6006 = class_6002.Field_6006;
        this.Field_6005 = class_6002.Field_6005;
        this.Field_6004 = class_6002.Field_6004;
        this.Field_6003 = class_6002.Field_6003;
    }

    public void Method_6011(double d) {
        this.Field_6004 = d;
    }

    public boolean Method_6012() {
        return this.Field_6003;
    }

    public double Method_6013() {
        return this.Field_6004;
    }
}

