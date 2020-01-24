/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_26070 {
    private float Field_26071;
    private int Field_26072;
    private int Field_26073 = -16364 & 6205;
    private float Field_26074 = 9.0f * 0.5555556f;
    private int Field_26075 = 10844 & 276;

    public void Method_26076(float f) {
        this.Field_26071 = Math.min(this.Field_26071 + f, 0.33333334f * 120.0f);
    }

    private void Method_26077() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_26078(Class_626 class_626) {
        Class_26801 class_26801 = class_626.\u0000strictfp.Method_487();
        this.Field_26073 = this.Field_26075;
        if (this.Field_26071 > 1.2368422f * 3.2340424f) {
            this.Field_26071 -= 1.1044776f * 3.6216216f;
            if (this.Field_26074 > 0.0f) {
                this.Field_26074 = Math.max(this.Field_26074 - 1.0f, 0.0f);
            } else if (class_26801 != Class_26801.Field_26803) {
                this.Field_26075 = Math.max(this.Field_26075 - (15635 & -32247), 2 & 1576);
            }
        }
        if (class_626.\u0000strictfp.Method_522().Method_7529("naturalRegeneration") && this.Field_26075 >= (5810 & 22) && class_626.Method_717()) {
            this.Field_26072 += 9363 & -28663;
            if (this.Field_26072 >= (16473 & -31148)) {
                class_626.\u0000, `(1.0f);
                this.Method_26076(10.888889f * 0.2755102f);
                this.Field_26072 = 2330 & 8192;
            }
        } else if (this.Field_26075 <= 0) {
            this.Field_26072 += 81 & -27103;
            if (this.Field_26072 >= (20821 & 8784)) {
                if (class_626.\u0000abstract() > 1.5f * 6.6666665f || class_26801 == Class_26801.Field_26804 || class_626.\u0000abstract() > 1.0f && class_26801 == Class_26801.Field_26802) {
                    class_626.Method_726(Class_32797.Field_32810, 1.0f);
                }
                this.Field_26072 = 4641 & -32748;
            }
        } else {
            this.Field_26072 = 17090 & 5125;
        }
    }

    public void Method_26079(Class_37934 class_37934, Class_23823 class_23823) {
        this.Method_26084(class_37934.Method_37951(class_23823), class_37934.Method_37948(class_23823));
    }

    public void Method_26080(float f) {
        this.Field_26074 = f;
    }

    public void Method_26081(int n) {
        this.Field_26075 = n;
    }

    public void Method_26082(Class_1699 class_1699) {
        if (class_1699.Method_1715("foodLevel", -32137 & 4579)) {
            this.Field_26075 = class_1699.Method_1738("foodLevel");
            this.Field_26072 = class_1699.Method_1738("foodTickTimer");
            this.Field_26074 = class_1699.Method_1745("foodSaturationLevel");
            this.Field_26071 = class_1699.Method_1745("foodExhaustionLevel");
        }
    }

    public int Method_26083() {
        return this.Field_26073;
    }

    public void Method_26084(int n, float f) {
        this.Field_26075 = Math.min(n + this.Field_26075, 28 & 9268);
        this.Field_26074 = Math.min(this.Field_26074 + (float)n * f * 2.0f, (float)this.Field_26075);
    }

    public float Method_26085() {
        return this.Field_26074;
    }

    public int Method_26086() {
        return this.Field_26075;
    }

    public boolean Method_26087() {
        return (this.Field_26075 < (17172 & 54) ? 12609 & 20097 : 14466 & 1088) != 0;
    }

    public void Method_26088(Class_1699 class_1699) {
        class_1699.Method_1739("foodLevel", this.Field_26075);
        class_1699.Method_1739("foodTickTimer", this.Field_26072);
        class_1699.Method_1704("foodSaturationLevel", this.Field_26074);
        class_1699.Method_1704("foodExhaustionLevel", this.Field_26071);
    }
}

