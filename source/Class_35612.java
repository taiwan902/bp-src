/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_35612
extends Class_33077 {
    Class_34093 Field_35613;
    Class_859 Field_35614;
    float Field_35615;

    public boolean Method_35616() {
        this.Field_35614 = this.Field_35613.Method_34127();
        if (this.Field_35614 == null) {
            return (12612 & 17033) != 0;
        }
        double d = this.Field_35613.\u0000strictfp((Class_1061)this.Field_35614);
        return (d >= 7.461538461538462 * 0.5360824742268041 && d <= 32.96969696969697 * 0.4852941176470588 ? (!this.Field_35613.\u0000super() ? 26160 & 72 : (this.Field_35613.\u0000strictfp().nextInt(26837 & -32731) == 0 ? 25803 & 37 : 9411 & 556)) : -30464 & 548) != 0;
    }

    public Class_35612(Class_34093 class_34093, float f) {
        this.Field_35613 = class_34093;
        this.Field_35615 = f;
        this.\u0000strictfp(19719 & 653);
    }

    public boolean Method_35617() {
        return (!this.Field_35613.\u0000super() ? 17035 & -30719 : -31150 & 28672) != 0;
    }

    public void Method_35618() {
        double d = this.Field_35614.\u0000= package - this.Field_35613.\u0000= package;
        double d2 = this.Field_35614.\u0000= switch - this.Field_35613.\u0000= switch;
        float f = Class_13337.Method_13347(d * d + d2 * d2);
        this.Field_35613.\u0000= ` += d / (double)f * (0.21818181818181817 * 2.291666666666667) * (0.8585365981590457 * 0.9318181818181818) + this.Field_35613.\u0000= ` * (0.8076923076923077 * 0.24761905130885895);
        this.Field_35613.\u0000switch += d2 / (double)f * (0.09090909090909091 * 5.5) * (1.3333333532015483 * 0.6) + this.Field_35613.\u0000switch * (0.5878787966388644 * 0.3402061855670103);
        this.Field_35613.\u0000%((double)this.Field_35615);
    }

    private void Method_35619() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

