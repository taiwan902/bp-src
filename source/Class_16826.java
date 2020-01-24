/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_16826 {
    public String Field_16827;
    public final float Field_16828;
    public final float Field_16829;
    public final float Field_16830;
    public final float Field_16831;
    public final float Field_16832;
    private Class_22778[] Field_16833;
    public final float Field_16834;
    private Class_31509[] Field_16835;

    public Class_16826 Method_16836(String string) {
        this.Field_16827 = string;
        return this;
    }

    public Class_16826(Class_31961 class_31961, int n, int n2, float f, float f2, float f3, int n3, int n4, int n5, float f4) {
        this(class_31961, n, n2, f, f2, f3, n3, n4, n5, f4, class_31961.Field_31965);
    }

    public void Method_16837(Class_22385 class_22385, float f) {
        if (Class_19426.Method_19570()) {
            class_22385.Method_22417(16519 & -24009, Class_15698.Field_15699);
        } else {
            class_22385.Method_22417(-27953 & 39, Class_29585.Field_29604);
        }
        for (int i = -24468 & 6914; i < this.Field_16835.length; ++i) {
            this.Field_16835[i].Method_31515(class_22385, f);
        }
        Class_7644.Method_7649().Method_7647();
    }

    public Class_16826(Class_31961 class_31961, int n, int n2, float f, float f2, float f3, int n3, int n4, int n5, float f4, boolean bl) {
        this.Field_16829 = f;
        this.Field_16831 = f2;
        this.Field_16830 = f3;
        this.Field_16834 = f + (float)n3;
        this.Field_16832 = f2 + (float)n4;
        this.Field_16828 = f3 + (float)n5;
        this.Field_16833 = new Class_22778[16520 & -27109];
        this.Field_16835 = new Class_31509[1046 & 16462];
        float f5 = f + (float)n3;
        float f6 = f2 + (float)n4;
        float f7 = f3 + (float)n5;
        f -= f4;
        f2 -= f4;
        f3 -= f4;
        f5 += f4;
        f6 += f4;
        f7 += f4;
        if (bl) {
            float f8 = f5;
            f5 = f;
            f = f8;
        }
        Class_22778 class_22778 = new Class_22778(f, f2, f3, 0.0f, 0.0f);
        Class_22778 class_227782 = new Class_22778(f5, f2, f3, 0.0f, 30.4f * 0.2631579f);
        Class_22778 class_227783 = new Class_22778(f5, f6, f3, 1.6458334f * 4.8607593f, 62.666668f * 0.12765957f);
        Class_22778 class_227784 = new Class_22778(f, f6, f3, 1.9285715f * 4.148148f, 0.0f);
        Class_22778 class_227785 = new Class_22778(f, f2, f7, 0.0f, 0.0f);
        Class_22778 class_227786 = new Class_22778(f5, f2, f7, 0.0f, 0.52040815f * 15.372549f);
        Class_22778 class_227787 = new Class_22778(f5, f6, f7, 67.42857f * 0.118644066f, 2.3142858f * 3.45679f);
        Class_22778 class_227788 = new Class_22778(f, f6, f7, 6.638298f * 1.2051282f, 0.0f);
        this.Field_16833[16705 & 564] = class_22778;
        this.Field_16833[10241 & 771] = class_227782;
        this.Field_16833[-32762 & 99] = class_227783;
        this.Field_16833[19 & 29835] = class_227784;
        this.Field_16833[1284 & -8027] = class_227785;
        this.Field_16833[18693 & 63] = class_227786;
        this.Field_16833[20550 & 2230] = class_227787;
        this.Field_16833[-15225 & 79] = class_227788;
        Class_22778[] arrclass_22778 = new Class_22778[9628 & 16388];
        arrclass_22778[-6668 & 2049] = class_227786;
        arrclass_22778[-32767 & 4673] = class_227782;
        arrclass_22778[24718 & 2082] = class_227783;
        arrclass_22778[-19861 & 18695] = class_227787;
        this.Field_16835[5728 & 258] = new Class_31509(arrclass_22778, n + n5 + n3, n2 + n5, n + n5 + n3 + n5, n2 + n5 + n4, class_31961.Field_31970, class_31961.Field_31962);
        Class_22778[] arrclass_227782 = new Class_22778[29 & 12164];
        arrclass_227782[-28672 & 19222] = class_22778;
        arrclass_227782[41 & 26689] = class_227785;
        arrclass_227782[12887 & 290] = class_227788;
        arrclass_227782[20487 & 8867] = class_227784;
        this.Field_16835[16919 & 1057] = new Class_31509(arrclass_227782, n, n2 + n5, n + n5, n2 + n5 + n4, class_31961.Field_31970, class_31961.Field_31962);
        Class_22778[] arrclass_227783 = new Class_22778[-30683 & 1236];
        arrclass_227783[-30832 & 6158] = class_227786;
        arrclass_227783[24973 & 611] = class_227785;
        arrclass_227783[17118 & 2] = class_22778;
        arrclass_227783[-32477 & 543] = class_227782;
        this.Field_16835[10247 & 10] = new Class_31509(arrclass_227783, n + n5, n2, n + n5 + n3, n2 + n5, class_31961.Field_31970, class_31961.Field_31962);
        Class_22778[] arrclass_227784 = new Class_22778[-24460 & 13];
        arrclass_227784[10528 & -16382] = class_227783;
        arrclass_227784[21551 & -32767] = class_227784;
        arrclass_227784[-28414 & 3090] = class_227788;
        arrclass_227784[2131 & 13195] = class_227787;
        this.Field_16835[8403 & 23591] = new Class_31509(arrclass_227784, n + n5 + n3, n2 + n5, n + n5 + n3 + n3, n2, class_31961.Field_31970, class_31961.Field_31962);
        Class_22778[] arrclass_227785 = new Class_22778[-32659 & 262];
        arrclass_227785[-24560 & 4164] = class_227782;
        arrclass_227785[4673 & 8329] = class_22778;
        arrclass_227785[27010 & -32722] = class_227784;
        arrclass_227785[20515 & 3159] = class_227783;
        this.Field_16835[204 & 2580] = new Class_31509(arrclass_227785, n + n5, n2 + n5, n + n5 + n3, n2 + n5 + n4, class_31961.Field_31970, class_31961.Field_31962);
        Class_22778[] arrclass_227786 = new Class_22778[5 & -32724];
        arrclass_227786[594 & 24577] = class_227785;
        arrclass_227786[3089 & 321] = class_227786;
        arrclass_227786[18434 & 1286] = class_227787;
        arrclass_227786[26239 & -32637] = class_227788;
        this.Field_16835[-32441 & 8341] = new Class_31509(arrclass_227786, n + n5 + n3 + n5, n2 + n5, n + n5 + n3 + n5 + n3, n2 + n5 + n4, class_31961.Field_31970, class_31961.Field_31962);
        if (bl) {
            for (int i = 5186 & 524; i < this.Field_16835.length; ++i) {
                this.Field_16835[i].Method_31514();
            }
        }
    }

    private void Method_16838() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

