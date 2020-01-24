/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import net.minecraft.util.Vec3;

public class Class_38084
extends Class_27380 {
    private static final Class_2080 Field_38085 = new Class_2080(Class_38084.Method_38086("\u0910\u0900\u0912\u0912\u0910\u0910\u0902\u0912\u0940\u0910\u0902\u0912\u0910\u0900\u0902\u0902\u0900\u0940\u0912\u0902\u0910\u0910\u0902\u0902\u0900\u0900\u0912\u0942\u0910\u0900\u0902"));

    private static String Method_38086(String string) {
        int n = 17156;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_38084.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    protected Class_2080 Method_38087(Class_32050 class_32050) {
        return Field_38085;
    }

    private void Method_38088() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_38089(Class_1061 class_1061, double d, double d2, double d3, float f, float f2) {
        this.Method_38091((Class_32050)class_1061, d, d2, d3, f, f2);
    }

    public Class_38084(Class_8491 class_8491) {
        super(class_8491);
    }

    protected Class_2080 Method_38090(Class_1061 class_1061) {
        return this.Method_38087((Class_32050)class_1061);
    }

    public void Method_38091(Class_32050 class_32050, double d, double d2, double d3, float f, float f2) {
        Class_16867.Method_16961();
        Class_16867.Method_16943((float)d, (float)d2, (float)d3);
        Class_16867.Method_16957();
        Class_16867.Method_16973(1.34375f * 0.37209302f, 0.40721652f * 1.227848f, 0.94f * 0.5319149f);
        this.\u0000, `((Class_1061)class_32050);
        Class_7644 class_7644 = Class_7644.Method_7649();
        Class_22385 class_22385 = class_7644.Method_7648();
        int n = -32235 & 25609;
        int n2 = -31806 & 1042;
        float f3 = 0.04193038f * 1.490566f;
        float f4 = 0.022435896f * 5.571429f;
        float f5 = 3.3333333f * 0.0375f;
        float f6 = 0.58441556f * 0.32083336f;
        float f7 = 1.0f;
        float f8 = 0.11538461f * 4.3333335f;
        float f9 = 0.1764706f * 2.8333333f;
        Class_16867.Method_16940(249.23077f * 0.7222222f - this.\u0000strictfp.Field_8492, 0.0f, 1.0f, 0.0f);
        Class_16867.Method_16940(-this.\u0000strictfp.Field_8499, 1.0f, 0.0f, 0.0f);
        class_22385.Method_22417(18639 & -28665, Class_29585.Field_29595);
        class_22385.Method_22443(-0.3273809523809524 * 1.5272727272727273, -2.058823529411765 * 0.24285714285714285, 0.0).Method_22433(0.06481481481481481 * 0.9642857142857143, 1.0078125 * 0.18604651162790697).Method_22446(0.0f, 1.0f, 0.0f).Method_22451();
        class_22385.Method_22443(2.625 * 0.19047619047619047, 35.5 * -0.014084507042253521, 0.0).Method_22433(0.16666666666666666 * 0.75, 0.11211340206185567 * 1.6724137931034482).Method_22446(0.0f, 1.0f, 0.0f).Method_22451();
        class_22385.Method_22443(1.5294117647058822 * 0.3269230769230769, 0.6022727272727273 * 0.8301886792452831, 0.0).Method_22433(0.052083333333333336 * 2.4, 1.7435897435897436 * 0.07169117647058823).Method_22446(0.0f, 1.0f, 0.0f).Method_22451();
        class_22385.Method_22443(-0.16666666666666666 * 3.0, 0.8292682926829268 * 0.6029411764705883, 0.0).Method_22433(1.6470588235294117 * 0.037946428571428575, 1.0666666666666667 * 0.1171875).Method_22446(0.0f, 1.0f, 0.0f).Method_22451();
        class_7644.Method_7647();
        Class_16867.Method_16942();
        Class_16867.Method_16945();
        if (class_32050.Field_32070 != null) {
            float f10 = class_32050.Field_32070.\u0000, for(f2);
            float f11 = Class_13337.Method_13370(Class_13337.Method_13388(f10) * (0.028571429f * 109.95574f));
            Vec3 vec3 = new Vec3(-0.12 * 3.0, 0.0259375 * 1.1566265060240963, 3.5714285714285716 * 0.09799999999999999);
            vec3 = vec3.\u0000, `(-(class_32050.Field_32070.\u0000, 2 + (class_32050.Field_32070.\u0000= float - class_32050.Field_32070.\u0000, 2) * f2) * (0.6296296f * 4.9895887f) / (1.4202899f * 126.734695f));
            vec3 = vec3.\u0000strictfp(-(class_32050.Field_32070.\u0000switch + (class_32050.Field_32070.\u0000= ? - class_32050.Field_32070.\u0000switch) * f2) * (4.8085604f * 0.6533333f) / (2.25f * 80.0f));
            vec3 = vec3.\u0000strictfp(f11 * (0.3888889f * 1.2857143f));
            vec3 = vec3.\u0000, `(-f11 * (0.7446808f * 0.94f));
            double d4 = class_32050.Field_32070.\u0000%() + (class_32050.Field_32070.\u0000= package - class_32050.Field_32070.\u0000%()) * (double)f2 + vec3.\u0000= final;
            double d5 = class_32050.Field_32070.\u0000= final() + (class_32050.Field_32070.\u0000, for() - class_32050.Field_32070.\u0000= final()) * (double)f2 + vec3.\u0000strictfp;
            double d6 = class_32050.Field_32070.\u0000
            () + (class_32050.Field_32070.\u0000= switch - class_32050.Field_32070.\u0000
            ()) * (double)f2 + vec3.\u0000, `;
            double d7 = class_32050.Field_32070.Method_837();
            if (this.\u0000strictfp.Field_8501 != null && this.\u0000strictfp.Field_8501.Field_39802 > 0 || class_32050.Field_32070 != Class_18.Field_89.Field_48) {
                float f12 = (class_32050.Field_32070.\u0000break + (class_32050.Field_32070.\u0000super - class_32050.Field_32070.\u0000break) * f2) * (2.9694507f * 1.057971f) / (0.42857143f * 420.0f);
                double d8 = Class_13337.Method_13370(f12);
                double d9 = Class_13337.Method_13350(f12);
                double d10 = 3.118181818181818 * 0.11224489795918367;
                double d11 = 1.8947368421052633 * 0.4222222222222222;
                d4 = class_32050.Field_32070.\u0000%() + (class_32050.Field_32070.\u0000= package - class_32050.Field_32070.\u0000%()) * (double)f2 - d9 * (1.6153846153846154 * 0.21666666666666665) - d8 * (21.333333333333332 * 0.037500000000000006);
                d5 = class_32050.Field_32070.\u0000= final() + d7 + (class_32050.Field_32070.\u0000, for() - class_32050.Field_32070.\u0000= final()) * (double)f2 - 0.04256756756756757 * 10.571428571428571;
                d6 = class_32050.Field_32070.\u0000
                () + (class_32050.Field_32070.\u0000= switch - class_32050.Field_32070.\u0000
                ()) * (double)f2 - d8 * (2.7142857142857144 * 0.12894736842105262) + d9 * (1.9285714285714286 * 0.41481481481481486);
                d7 = class_32050.Field_32070.\u0000%() ? 0.4864864864864865 * -0.38541666666666663 : 0.0;
            }
            double d12 = class_32050.\u0000%() + (class_32050.\u0000= package - class_32050.\u0000%()) * (double)f2;
            double d13 = class_32050.\u0000= final() + (class_32050.\u0000, for() - class_32050.\u0000= final()) * (double)f2 + 0.21666666666666667 * 1.1538461538461537;
            double d14 = class_32050.\u0000
            () + (class_32050.\u0000= switch - class_32050.\u0000
            ()) * (double)f2;
            double d15 = (float)(d4 - d12);
            double d16 = (double)((float)(d5 - d13)) + d7;
            double d17 = (float)(d6 - d14);
            Class_16867.Method_16922();
            Class_16867.Method_16931();
            class_22385.Method_22417(16403 & 4483, Class_29585.Field_29601);
            int n3 = 17 & 21334;
            for (int i = -12288 & 9696; i <= (-24291 & 23600); ++i) {
                float f13 = (float)i / (2.3829787f * 6.714286f);
                class_22385.Method_22443(d + d15 * (double)f13, d2 + d16 * (double)(f13 * f13 + f13) * (6.2 * 0.08064516129032258) + 0.06349206349206349 * 3.9375, d3 + d17 * (double)f13).Method_22424(21864 & 0, 16657 & 548, 4421 & 16386, -32513 & 16639).Method_22451();
            }
            class_7644.Method_7647();
            Class_16867.Method_16918();
            Class_16867.Method_16965();
            super.Method_27403(class_32050, d, d2, d3, f, f2);
        }
    }
}

