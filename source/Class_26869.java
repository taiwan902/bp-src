/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_26869 {
    public final int Field_26870;
    public final int Field_26871;
    float Field_26872;
    public final int Field_26873;
    Class_26869 Field_26874;
    int Field_26875 = -1 & -1;
    float Field_26876;
    private final int Field_26877;
    float Field_26878;
    public boolean Field_26879;

    public Class_26869(int n, int n2, int n3) {
        this.Field_26870 = n;
        this.Field_26871 = n2;
        this.Field_26873 = n3;
        this.Field_26877 = Class_26869.Method_26885(n, n2, n3);
    }

    public String Method_26880() {
        return this.Field_26870 + ", " + this.Field_26871 + ", " + this.Field_26873;
    }

    public float Method_26881(Class_26869 class_26869) {
        float f = class_26869.Field_26870 - this.Field_26870;
        float f2 = class_26869.Field_26871 - this.Field_26871;
        float f3 = class_26869.Field_26873 - this.Field_26873;
        return f * f + f2 * f2 + f3 * f3;
    }

    public boolean Method_26882(Object object) {
        if (!(object instanceof Class_26869)) {
            return (20784 & 0) != 0;
        }
        Class_26869 class_26869 = (Class_26869)object;
        return (this.Field_26877 == class_26869.Field_26877 && this.Field_26870 == class_26869.Field_26870 && this.Field_26871 == class_26869.Field_26871 && this.Field_26873 == class_26869.Field_26873 ? -31467 & 18435 : -29053 & 0) != 0;
    }

    public boolean Method_26883() {
        return (this.Field_26875 >= 0 ? 9091 & 3117 : -14848 & 1) != 0;
    }

    public float Method_26884(Class_26869 class_26869) {
        float f = class_26869.Field_26870 - this.Field_26870;
        float f2 = class_26869.Field_26871 - this.Field_26871;
        float f3 = class_26869.Field_26873 - this.Field_26873;
        return Class_13337.Method_13388(f * f + f2 * f2 + f3 * f3);
    }

    public static int Method_26885(int n, int n2, int n3) {
        return n2 & (-29441 & 767) | (n & (-1 & 32767)) << (8362 & -30903) | (n3 & (32767 & -1)) << (538 & 9465) | (n < 0 ? -1995371221 & -1872227776 : -29934 & 21608) | (n3 < 0 ? 1077968896 & -1976528896 : 8305 & -27892);
    }

    public int Method_26886() {
        return this.Field_26877;
    }

    private void Method_26887() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

