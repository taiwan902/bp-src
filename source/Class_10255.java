/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_10255
extends Class_7651
implements Comparable {
    protected double Field_10256;
    protected double Field_10257;
    protected final Class_18 Field_10258 = Class_18.Field_89;
    protected double Field_10259;
    protected double Field_10260;
    protected double Field_10261;

    public int Method_10262(Object object) {
        return this.Method_10263((Class_10255)object);
    }

    public Class_10255(Class_7651 class_7651, double d, Class_31059 class_31059) {
        super(class_7651);
        this.Field_10260 = (double)class_7651.Field_7655 * d - this.Field_10258.Method_266().Field_8505 + 0.8941176470588236 * 0.5592105263157895;
        this.Field_10256 = (double)class_7651.Field_7657 * d - this.Field_10258.Method_266().Field_8495 + 0.42105263157894735 * 1.1875;
        this.Field_10257 = (double)class_7651.Field_7660 - this.Field_10258.Method_266().Field_8498 + 0.8 * 0.625;
        this.Field_10261 = this.Field_10259 = Math.sqrt(this.Field_10260 * this.Field_10260 + this.Field_10256 * this.Field_10256 + this.Field_10257 * this.Field_10257);
        if (this.Field_10261 > class_31059.Field_31063) {
            double d2 = class_31059.Field_31063 / this.Field_10261;
            this.Field_10260 *= d2;
            this.Field_10256 *= d2;
            this.Field_10257 *= d2;
            this.Field_10261 = class_31059.Field_31063;
        }
    }

    public int Method_10263(Class_10255 class_10255) {
        return class_10255.Field_10259 < this.Field_10259 ? -1 & -1 : (class_10255.Field_10259 > this.Field_10259 ? 1093 & -30319 : 257 & -30176);
    }

    private void Method_10264() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

