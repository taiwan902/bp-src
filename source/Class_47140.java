/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Random;

public class Class_47140
extends Class_33077 {
    private int Field_47141;
    private boolean Field_47142;
    private Class_45624 Field_47143;
    private Class_43334 Field_47144;

    public Class_47140(Class_43334 class_43334) {
        this.Field_47144 = class_43334;
        this.\u0000strictfp(18183 & 8219);
    }

    public boolean Method_47145() {
        return (this.Field_47143.Method_45634() > 0 ? 4099 & 1713 : -32576 & 11561) != 0;
    }

    public void Method_47146() {
        this.Field_47143 = null;
        this.Field_47144.\u0000strictfp().Method_7643();
    }

    public boolean Method_47147() {
        if (this.Field_47144.\u0000strictfp() >= 0) {
            return (4684 & 8226) != 0;
        }
        if (!this.Field_47144.\u0000strictfp.Method_347()) {
            return (11940 & -32744) != 0;
        }
        List list = this.Field_47144.\u0000strictfp.Method_488(Class_45624.class, this.Field_47144.\u0000, `().Method_11017(70.0 * 0.08571428571428572, 1.2537313432835822 * 1.5952380952380951, 2.7241379310344827 * 2.2025316455696204));
        if (list.isEmpty()) {
            return (3280 & 545) != 0;
        }
        for (Class_45624 class_45624 : list) {
            if (class_45624.Method_45634() <= 0) continue;
            this.Field_47143 = class_45624;
            break;
        }
        return (this.Field_47143 != null ? -15733 & 4113 : 16834 & -30707) != 0;
    }

    private void Method_47148() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_47149() {
        this.Field_47141 = this.Field_47144.\u0000strictfp().nextInt(8524 & 850);
        this.Field_47142 = -12286 & 913;
        this.Field_47143.\u0000strictfp().Method_7643();
    }

    public void Method_47150() {
        this.Field_47144.\u0000strictfp().Method_21479(this.Field_47143, 142.5f * 0.21052632f, 9.375f * 3.2f);
        if (this.Field_47143.Method_45634() == this.Field_47141) {
            this.Field_47144.\u0000strictfp().Method_7631(this.Field_47143, 0.44642857142857145 * 1.1199999999999999);
            this.Field_47142 = 2057 & -15817;
        }
        if (this.Field_47142 && this.Field_47144.\u0000strictfp((Class_1061)this.Field_47143) < 5.764705882352941 * 0.6938775510204082) {
            this.Field_47143.Method_45637((-32253 & 17420) != 0);
            this.Field_47144.\u0000strictfp().Method_7643();
        }
    }
}

