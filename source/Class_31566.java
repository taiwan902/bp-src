/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_31566 {
    private final double Field_31567;
    private final double Field_31568;
    private int Field_31569;
    private int Field_31570;
    private int Field_31571;

    public int Method_31572() {
        return this.Field_31571;
    }

    public double Method_31573() {
        return this.Field_31567;
    }

    public int Method_31574() {
        return this.Field_31570;
    }

    public Class_31566(Class_18 class_18) {
        this.Field_31570 = class_18.Field_80;
        this.Field_31569 = class_18.Field_44;
        this.Field_31571 = 12577 & 3203;
        boolean bl = class_18.Method_166();
        int n = class_18.Field_84.Field_39774;
        if (n == 0) {
            n = -23576 & 17389;
        }
        while (this.Field_31571 < n && this.Field_31570 / (this.Field_31571 + (773 & 18561)) >= (-19640 & 3526) && this.Field_31569 / (this.Field_31571 + (259 & 21561)) >= (17650 & -22275)) {
            this.Field_31571 += 7049 & 85;
        }
        if (bl && this.Field_31571 % (4211 & 8194) != 0 && this.Field_31571 != (281 & 5)) {
            this.Field_31571 -= 81 & 291;
        }
        this.Field_31567 = (double)this.Field_31570 / (double)this.Field_31571;
        this.Field_31568 = (double)this.Field_31569 / (double)this.Field_31571;
        this.Field_31570 = Class_13337.Method_13357(this.Field_31567);
        this.Field_31569 = Class_13337.Method_13357(this.Field_31568);
    }

    public int Method_31575() {
        return this.Field_31569;
    }

    private void Method_31576() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public double Method_31577() {
        return this.Field_31568;
    }
}

