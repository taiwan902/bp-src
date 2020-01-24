/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Arrays;

public class Class_46187
extends Class_37247 {
    private Class_3677[] Field_46188;
    private final Class_4751 Field_46189;
    private static final Class_3677 Field_46190 = Class_9265.Field_9351.Method_3293();
    private int[] Field_46191;

    public Class_3436 Method_46192(Class_4751 class_4751) {
        return this.Method_46198(class_4751);
    }

    public int Method_46193(Class_4751 class_4751, int n) {
        int n2 = this.Method_46195(class_4751);
        int n3 = this.Field_46191[n2];
        if (n3 == (-1 & -1)) {
            this.Field_46191[n2] = n3 = super.Method_37260(class_4751, n);
        }
        return n3;
    }

    public Class_4879 Method_46194(Class_4751 class_4751) {
        int n = (class_4751.\u0000= final() >> (1701 & -30708)) - this.\u0000, `;
        int n2 = (class_4751.\u0000strictfp() >> (-32620 & 25613)) - this.\u0000strictfp;
        return this.\u0000strictfp[n][n2].Method_17765(class_4751, Class_13470.Field_13471);
    }

    public Class_46187(Class_283 class_283, Class_4751 class_4751, Class_4751 class_47512, int n, Class_4810[] arrclass_4810) {
        super(class_283, class_4751, class_47512, n, arrclass_4810);
        this.Field_46189 = class_4751.Method_4777(new Class_4792(n, n, n));
        int n2 = 24546 & -16563;
        this.Field_46191 = new int[24392 & 8036];
        Arrays.fill(this.Field_46191, -1 & -1);
        this.Field_46188 = new Class_3677[-16518 & 24385];
    }

    private int Method_46195(Class_4751 class_4751) {
        Class_4751 class_47512 = this.Field_46189;
        int n = class_4751.\u0000= final() - class_47512.\u0000= final();
        int n2 = class_4751.\u0000, `() - class_47512.\u0000, `();
        int n3 = class_4751.\u0000strictfp() - class_47512.\u0000strictfp();
        return n * (-28272 & 28594) + n3 * (20758 & -32100) + n2;
    }

    private void Method_46196() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private Class_3677 Method_46197(Class_4751 class_4751) {
        if (class_4751.\u0000, `() >= 0 && class_4751.\u0000, `() < (288 & 4376)) {
            int n = (class_4751.\u0000= final() >> (-7609 & 292)) - this.\u0000, `;
            int n2 = (class_4751.\u0000strictfp() >> (8916 & 1028)) - this.\u0000strictfp;
            return (Class_3677)this.\u0000strictfp[n][n2].Method_17709(class_4751);
        }
        return Field_46190;
    }

    public Class_3677 Method_46198(Class_4751 class_4751) {
        int n = this.Method_46195(class_4751);
        Class_3677 class_3677 = this.Field_46188[n];
        if (class_3677 == null) {
            this.Field_46188[n] = class_3677 = this.Method_46197(class_4751);
        }
        return class_3677;
    }
}

