/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import net.minecraft.util.Vec3;

public class Class_37091
implements Class_1367 {
    final double Field_37092;
    final double Field_37093;
    final Class_1367 Field_37094;
    final Class_46066 Field_37095;
    final Class_1061 Field_37096;
    final double Field_37097;
    final Class_4751 Field_37098;

    public boolean Method_37099(int n, String string) {
        return this.Field_37094.Method_1376(n, string);
    }

    public Vec3 Method_37100() {
        return new Vec3(this.Field_37097, this.Field_37093, this.Field_37092);
    }

    public void Method_37101(Class_26261 class_26261, int n) {
        this.Field_37096.Method_1169(class_26261, n);
    }

    public Class_283 Method_37102() {
        return this.Field_37096.Field_1089;
    }

    public void Method_37103(Class_1782 class_1782) {
        this.Field_37094.Method_1373(class_1782);
    }

    public Class_4751 Method_37104() {
        return this.Field_37098;
    }

    private void Method_37105() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public String Method_37106() {
        return this.Field_37096.Method_1202();
    }

    public Class_1061 Method_37107() {
        return this.Field_37096;
    }

    Class_37091(Class_46066 class_46066, Class_1061 class_1061, Class_1367 class_1367, Class_4751 class_4751, double d, double d2, double d3) {
        this.Field_37095 = class_46066;
        this.Field_37096 = class_1061;
        this.Field_37094 = class_1367;
        this.Field_37098 = class_4751;
        this.Field_37097 = d;
        this.Field_37093 = d2;
        this.Field_37092 = d3;
    }

    public boolean Method_37108() {
        Class_2457 class_2457 = Class_2457.Method_2530();
        return (class_2457 == null || class_2457.Field_2463[513 & 258].\u0000strictfp().Method_7529("commandBlockOutput") ? 1 & 2401 : 12 & -10464) != 0;
    }

    public Class_1782 Method_37109() {
        return this.Field_37096.Method_1232();
    }
}

