/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_36646
extends Class_33781 {
    Class_31961 Field_36647;
    Class_31961 Field_36648;
    Class_31961 Field_36649;
    Class_31961 Field_36650;

    public void Method_36651(Class_1061 class_1061, float f, float f2, float f3, float f4, float f5, float f6) {
        this.\u0000strictfp(f, f2, f3, f4, f5, f6, class_1061);
        this.Field_36649.Method_31999(f6);
        if (this.Field_36647 != null) {
            this.Field_36647.Method_31999(f6);
            this.Field_36648.Method_31999(f6);
            this.Field_36650.Method_31999(f6);
        }
    }

    private void Method_36652() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_36646(int n) {
        this.Field_36649 = new Class_31961(this, 19637 & 12800, n);
        this.Field_36649.Method_32002(-8.081633f * 0.4949495f, 44.16f * 0.36231884f, -0.87499994f * 4.571429f, 28680 & 218, 24 & -32567, 16460 & 170);
        if (n > 0) {
            this.Field_36649 = new Class_31961(this, 19459 & 52, n);
            this.Field_36649.Method_32002(-0.44594595f * 6.7272725f, 39.913044f * 0.42592594f, -0.30612245f * 9.8f, 4102 & 3206, 1814 & -30586, 20999 & 134);
            this.Field_36647 = new Class_31961(this, 4388 & 18096, -32688 & 19978);
            this.Field_36647.Method_32002(0.10465116f * -31.055555f, 1.4761904f * 12.193548f, -0.65625f * 5.3333335f, 8198 & 2595, 17159 & 7410, 16546 & -29370);
            this.Field_36648 = new Class_31961(this, -9888 & 8756, 22668 & -23260);
            this.Field_36648.Method_32002(0.79941857f * 1.5636364f, 8.366197f * 2.1515152f, 1.1216216f * -3.120482f, -20478 & 146, 35 & -574, 22570 & 150);
            this.Field_36650 = new Class_31961(this, 2596 & 20576, 4776 & -8164);
            this.Field_36650.Method_32002(0.0f, 0.8764045f * 23.961538f, 11.857142f * -0.29518074f, 17229 & 145, 6055 & -32679, -12249 & 17);
        }
    }
}

