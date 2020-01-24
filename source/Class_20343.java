/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Arrays;

public final class Class_20343 {
    private int Field_20344;
    private int Field_20345;
    private Class_18600[] Field_20346 = new Class_18600[-31742 & 24970];

    Class_20343(Class_18600 class_18600, Class_18600 class_186002) {
        this.Field_20346[8192 & 5397] = class_18600;
        this.Field_20346[1217 & 4131] = class_186002;
        this.Field_20344 = 17507 & 12806;
        if (class_18600 instanceof Class_26981) {
            this.Field_20345 += 2961 & 1;
        }
        if (class_186002 instanceof Class_26981) {
            this.Field_20345 += 8489 & -16191;
        }
    }

    private void Method_20347() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_20348(Class_18600 class_18600) {
        int n = this.Field_20344;
        Class_18600[] arrclass_18600 = this.Field_20346;
        if (n == arrclass_18600.length) {
            this.Field_20346 = arrclass_18600 = Arrays.copyOf(arrclass_18600, n << (16773 & 1027));
        }
        arrclass_18600[n] = class_18600;
        this.Field_20344 = n + (4097 & 17171);
        if (class_18600 instanceof Class_26981) {
            this.Field_20345 += 10337 & -32763;
        }
    }

    public int Method_20349() {
        return this.Field_20344;
    }

    public Class_18600[] Method_20350() {
        return this.Field_20346;
    }
}

