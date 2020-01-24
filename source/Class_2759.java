/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_2759 {
    private int Field_2760;
    private int Field_2761;
    private final long[] Field_2762 = new long[1520 & -24323];
    private int Field_2763;

    public void Method_2764(long l) {
        this.Field_2762[this.Field_2763] = l;
        this.Field_2763 += 873 & -32765;
        if (this.Field_2763 == (-30989 & 18928)) {
            this.Field_2763 = 18 & -11360;
        }
        if (this.Field_2760 < (-31494 & 25076)) {
            this.Field_2761 = 9225 & -26430;
            this.Field_2760 += 321 & 22537;
        } else {
            this.Field_2761 = this.Method_2765(this.Field_2763 + (12291 & 153));
        }
    }

    public int Method_2765(int n) {
        return n % (504 & 4337);
    }

    private void Method_2766() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

