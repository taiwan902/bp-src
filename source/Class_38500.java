/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_38500
extends Class_33077 {
    private float Field_38501;
    protected Class Field_38502;
    protected Class_34093 Field_38503;
    protected Class_1061 Field_38504;
    private int Field_38505;
    protected float Field_38506;

    public Class_38500(Class_34093 class_34093, Class class_, float f, float f2) {
        this.Field_38503 = class_34093;
        this.Field_38502 = class_;
        this.Field_38506 = f;
        this.Field_38501 = f2;
        this.\u0000strictfp(-20478 & 2587);
    }

    public boolean Method_38507() {
        return (!this.Field_38504.Method_1285() ? -2265 & 216 : (this.Field_38503.\u0000strictfp(this.Field_38504) > (double)(this.Field_38506 * this.Field_38506) ? 124 & -29438 : (this.Field_38505 > 0 ? 101 & -29935 : 7692 & -16063))) != 0;
    }

    public void Method_38508() {
        this.Field_38504 = null;
    }

    private void Method_38509() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_38510() {
        this.Field_38505 = (6186 & 9256) + this.Field_38503.\u0000strictfp().nextInt(7592 & -24536);
    }

    public void Method_38511() {
        this.Field_38503.Method_34147().Method_21480(this.Field_38504.Field_1130, this.Field_38504.Method_1324() + (double)this.Field_38504.Method_1357(), this.Field_38504.Field_1106, 10.2739725f * 0.97333336f, this.Field_38503.Method_34173());
        this.Field_38505 -= 2569 & -28607;
    }

    public boolean Method_38512() {
        if (this.Field_38503.\u0000strictfp().nextFloat() >= this.Field_38501) {
            return (-11263 & 304) != 0;
        }
        if (this.Field_38503.Method_34127() != null) {
            this.Field_38504 = this.Field_38503.Method_34127();
        }
        this.Field_38504 = this.Field_38502 == Class_626.class ? this.Field_38503.\u0000strictfp.Method_469(this.Field_38503, this.Field_38506) : this.Field_38503.\u0000strictfp.Method_417(this.Field_38502, this.Field_38503.\u0000, `().Method_11017(this.Field_38506, 3.197368421052632 * 0.9382716049382716, this.Field_38506), this.Field_38503);
        return (this.Field_38504 != null ? 2177 & 535 : -32368 & 9218) != 0;
    }

    public Class_38500(Class_34093 class_34093, Class class_, float f) {
        this.Field_38503 = class_34093;
        this.Field_38502 = class_;
        this.Field_38506 = f;
        this.Field_38501 = 3.0f * 0.0066666664f;
        this.\u0000strictfp(-24510 & 2);
    }
}

