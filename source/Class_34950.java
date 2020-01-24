/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_34950
extends Class_26026 {
    public int Field_34951;

    public Class_34950(Class_283 class_283, Class_859 class_859, double d, double d2, double d3) {
        super(class_283, class_859, d, d2, d3);
        this.Field_34951 = -31999 & 12427;
    }

    public Class_34950(Class_283 class_283) {
        super(class_283);
        this.Field_34951 = 9393 & 515;
    }

    public void Method_34952(Class_1699 class_1699) {
        super.Method_26043(class_1699);
        class_1699.Method_1739("ExplosionPower", this.Field_34951);
    }

    public void Method_34953(Class_1699 class_1699) {
        super.Method_26042(class_1699);
        if (class_1699.Method_1715("ExplosionPower", -29341 & 16503)) {
            this.Field_34951 = class_1699.Method_1738("ExplosionPower");
        }
    }

    private void Method_34954() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected void Method_34955(Class_37110 class_37110) {
        if (!this.\u0000strictfp.Field_306) {
            if (class_37110.Field_37114 != null) {
                class_37110.Field_37114.Method_1340(Class_32797.Method_32868(this, this.\u0000strictfp), 4.173913f * 1.4375f);
                this.\u0000strictfp(this.\u0000strictfp, class_37110.Field_37114);
            }
            boolean bl = this.\u0000strictfp.Method_522().Method_7529("mobGriefing");
            this.\u0000strictfp.Method_559(null, this.\u0000= package, this.\u0000, for(), this.\u0000= switch, this.Field_34951, bl, bl);
            this.\u0000break();
        }
    }

    public Class_34950(Class_283 class_283, double d, double d2, double d3, double d4, double d5, double d6) {
        super(class_283, d, d2, d3, d4, d5, d6);
        this.Field_34951 = 16427 & -30895;
    }
}

