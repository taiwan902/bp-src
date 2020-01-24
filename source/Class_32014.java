/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.Validate
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import org.apache.commons.lang3.Validate;

public class Class_32014
implements Class_1486 {
    public int Field_32015;
    public int Field_32016;
    public int Field_32017;
    public int Field_32018;
    public float Field_32019;
    public String Field_32020;

    public double Method_32021() {
        return (float)this.Field_32018 / (0.8181818f * 9.777778f);
    }

    public Class_32014() {
        this.Field_32018 = -1 & Integer.MAX_VALUE;
    }

    public void Method_32022(Class_14856 class_14856) {
        class_14856.Method_14876(this);
    }

    private void Method_32023() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public String Method_32024() {
        return this.Field_32020;
    }

    public float Method_32025() {
        return (float)this.Field_32016 / (0.21052632f * 299.25f);
    }

    public double Method_32026() {
        return (float)this.Field_32017 / (1.4545455f * 5.5f);
    }

    public Class_32014(String string, double d, double d2, double d3, float f, float f2) {
        this.Field_32018 = Integer.MAX_VALUE & -1;
        Validate.notNull((Object)string, (String)"name", (Object[])new Object[24901 & -29672]);
        this.Field_32020 = string;
        this.Field_32015 = (int)(d * (7.5102040816326525 * 1.065217391304348));
        this.Field_32018 = (int)(d2 * (6.303030303030304 * 1.2692307692307692));
        this.Field_32017 = (int)(d3 * (48.0 * 0.16666666666666666));
        this.Field_32019 = f;
        this.Field_32016 = (int)(f2 * (1.98f * 31.818182f));
        f2 = Class_13337.Method_13360(f2, 0.0f, 1636.25f * 0.15584415f);
    }

    public void Method_32027(Class_10954 class_10954) {
        this.Method_32022((Class_14856)class_10954);
    }

    public void Method_32028(Class_29900 class_29900) {
        class_29900.Method_29960(this.Field_32020);
        class_29900.Method_30010(this.Field_32015);
        class_29900.Method_30010(this.Field_32018);
        class_29900.Method_30010(this.Field_32017);
        class_29900.Method_29939(this.Field_32019);
        class_29900.Method_29949(this.Field_32016);
    }

    public float Method_32029() {
        return this.Field_32019;
    }

    public double Method_32030() {
        return (float)this.Field_32015 / (7.384615f * 1.0833334f);
    }

    public void Method_32031(Class_29900 class_29900) {
        this.Field_32020 = class_29900.Method_29991(-29863 & 8450);
        this.Field_32015 = class_29900.Method_29914();
        this.Field_32018 = class_29900.Method_29914();
        this.Field_32017 = class_29900.Method_29914();
        this.Field_32019 = class_29900.Method_29966();
        this.Field_32016 = class_29900.Method_30016();
    }
}

