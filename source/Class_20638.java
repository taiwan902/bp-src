/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_20638
implements Class_14683 {
    private final boolean Field_20639;
    private final int Field_20640;

    private void Method_20641() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_20642() {
        return this.Field_20639;
    }

    public void Method_20643(Class_10233 class_10233) {
        Class_10233.Method_10244(class_10233, this.Field_20640);
    }

    public Class_20638(int n, boolean bl) {
        this.Field_20640 = n;
        this.Field_20639 = bl;
    }

    public void Method_20644(float f, int n) {
        Class_18.Field_89.Method_253().Method_34707(Class_37026.Field_37030);
        if (this.Field_20640 < 0) {
            Class_1551.Method_1566(21248 & 1080, 524 & -22464, 3.0f * 48.0f, 0.0f, -27087 & 80, 17976 & 2130, 398.22223f * 0.64285713f, 243.51219f * 1.051282f);
        } else {
            Class_1551.Method_1566(-31680 & 545, -28672 & 17004, 0.8405797f * 190.34483f, 0.0f, 348 & 30738, 1469 & 8720, 895.99994f * 0.2857143f, 215.41464f * 1.1884058f);
        }
    }

    public Class_1782 Method_20645() {
        return this.Field_20640 < 0 ? new Class_2840("Previous Page") : new Class_2840("Next Page");
    }
}

