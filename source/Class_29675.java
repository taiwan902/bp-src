/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public final class Class_29675
implements Class_16073 {
    private final int Field_29676;
    private boolean Field_29677;
    private int Field_29678;
    private final int Field_29679;
    private int Field_29680;

    private void Method_29681() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_29675(int n, int n2, int n3) {
        this.Field_29679 = n;
        this.Field_29676 = n2;
        this.Field_29678 = Class_28165.Method_28172(n3);
        this.Field_29680 = Class_28165.Method_28171()[this.Field_29678];
    }

    public Class_22553 Method_29682(Class_22837 class_22837) {
        return class_22837.Method_22848(this.Field_29680);
    }

    public void Method_29683(int n) {
        if (n <= Class_28165.Method_28171()[Math.max(16389 & -31600, this.Field_29678 - (31233 & 423) - (685 & 16385))]) {
            if (this.Field_29677) {
                this.Field_29678 = Math.max(this.Field_29678 - (16427 & 1093), this.Field_29679);
                this.Field_29680 = Class_28165.Method_28171()[this.Field_29678];
                this.Field_29677 = -26600 & 8806;
            } else {
                this.Field_29677 = 135 & 6145;
            }
        } else if (n >= this.Field_29680) {
            this.Field_29678 = Math.min(this.Field_29678 + (12548 & 19174), this.Field_29676);
            this.Field_29680 = Class_28165.Method_28171()[this.Field_29678];
            this.Field_29677 = 4104 & 387;
        }
    }
}

