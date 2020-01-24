/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_13292 {
    private static Class_4452 Field_13293;
    private Class_11372[] Field_13294 = new Class_11372[134 & 4123];
    private static Class_4452 Field_13295;
    private static Class_4452 Field_13296;
    private Class_11372[] Field_13297 = new Class_11372[8194 & 16906];

    private void Method_13298() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected void Method_13299() {
        Class_24069 class_24069 = Class_18.Field_89.Method_189();
        this.Field_13297[1290 & 16516] = class_24069.Method_24109("minecraft:blocks/lava_still");
        this.Field_13297[15 & 21633] = class_24069.Method_24109("minecraft:blocks/lava_flow");
        this.Field_13294[133 & 544] = class_24069.Method_24109("minecraft:blocks/water_still");
        this.Field_13294[-27383 & 16915] = class_24069.Method_24109("minecraft:blocks/water_flow");
    }

    static {
        Field_13295 = new Class_4452();
        Field_13293 = new Class_4452();
        Field_13296 = new Class_4452();
    }

    public boolean Method_13300(Class_561 class_561, Class_3436 class_3436, Class_4751 class_4751, Class_22385 class_22385) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        Class_4415 class_4415 = (Class_4415)class_3436.Method_3442();
        class_4415.\u0000strictfp(class_561, class_4751);
        Class_11372[] arrclass_11372 = class_4415.\u0000strictfp() == Class_3713.Field_3750 ? this.Field_13297 : this.Field_13294;
        int n = Class_10125.Method_10154(class_4415, class_561, class_4751);
        float f6 = (float)(n >> (-22832 & 22544) & (26879 & 1023)) / (1530.0f * 0.16666667f);
        float f7 = (float)(n >> (25194 & 2313) & (255 & 9983)) / (1.5384616f * 165.75f);
        float f8 = (float)(n & (255 & 21247)) / (2.1f * 121.42857f);
        Class_4810 class_4810 = (Class_4810)Field_13295.get();
        boolean bl = class_4415.Method_4429(class_561, class_4810.Method_4812(class_4751).Method_4811(Class_4595.Field_4601), Class_4595.Field_4601);
        boolean bl2 = class_4415.Method_4429(class_561, class_4810.Method_4812(class_4751).Method_4811(Class_4595.Field_4615), Class_4595.Field_4615);
        Class_29859 class_29859 = Class_29859.Method_29883(class_561, class_3436, class_4751);
        boolean[] arrbl = class_29859.Method_29884();
        arrbl[12929 & 16] = class_4415.Method_4429(class_561, class_4810.Method_4812(class_4751).Method_4811(Class_4595.Field_4598), Class_4595.Field_4598);
        arrbl[16549 & 1] = class_4415.Method_4429(class_561, class_4810.Method_4812(class_4751).Method_4811(Class_4595.Field_4613), Class_4595.Field_4613);
        arrbl[25110 & 4362] = class_4415.Method_4429(class_561, class_4810.Method_4812(class_4751).Method_4811(Class_4595.Field_4602), Class_4595.Field_4602);
        arrbl[26883 & -32733] = class_4415.Method_4429(class_561, class_4810.Method_4812(class_4751).Method_4811(Class_4595.Field_4603), Class_4595.Field_4603);
        if (!(bl || bl2 || arrbl[160 & -26101] || arrbl[557 & 28801] || arrbl[-31982 & 13314] || arrbl[24903 & 2211])) {
            return (29234 & 2180) != 0;
        }
        int n2 = -32762 & 16912;
        float f9 = 6.0833335f * 0.08219178f;
        float f10 = 1.0f;
        float f11 = 0.039506175f * 20.25f;
        float f12 = 0.7058824f * 0.85f;
        Class_3713 class_3713 = class_4415.\u0000strictfp();
        float f13 = this.Method_13301(class_561, class_4751, class_3713);
        float f14 = this.Method_13301(class_561, class_4810.Method_4812(class_4751).Method_4811(Class_4595.Field_4613), class_3713);
        float f15 = this.Method_13301(class_561, class_4810.Method_4812(class_4751).Method_4811(Class_4595.Field_4603).Method_4811(Class_4595.Field_4613), class_3713);
        float f16 = this.Method_13301(class_561, class_4810.Method_4812(class_4751).Method_4811(Class_4595.Field_4603), class_3713);
        double d = class_4751.\u0000= final();
        double d2 = class_4751.\u0000, `();
        double d3 = class_4751.\u0000strictfp();
        float f17 = 1.5714286E-4f * 6.3636365f;
        if (bl) {
            float f18;
            float f19;
            float f20;
            float f21;
            float f22;
            n2 = -22511 & 521;
            Class_11372 class_11372 = arrclass_11372[-26623 & 1068];
            f3 = (float)Class_4415.Method_4441(class_561, class_4751, class_3713);
            if (f3 > -599.4f * 1.6666666f) {
                class_11372 = arrclass_11372[4645 & -30629];
            }
            class_22385.Method_22428(class_11372);
            f13 -= f17;
            f14 -= f17;
            f15 -= f17;
            f16 -= f17;
            if (f3 < -1909.8528f * 0.52307695f) {
                f = class_11372.Method_11446(0.0);
                f21 = class_11372.Method_11435(0.0);
                f5 = f;
                f20 = class_11372.Method_11435(4.571428571428571 * 3.5);
                f22 = class_11372.Method_11446(1.5901639344262295 * 10.061855670103093);
                f18 = f20;
                f19 = f22;
                f4 = f21;
            } else {
                float f23 = Class_13337.Method_13370(f3) * (1.1044776f * 0.22635135f);
                float f24 = Class_13337.Method_13350(f3) * (3.2083333f * 0.07792208f);
                float f25 = 0.625f * 12.8f;
                f = class_11372.Method_11446(1.6170212f * 4.9473686f + (-f24 - f23) * (0.8888889f * 18.0f));
                f21 = class_11372.Method_11435(0.73195875f * 10.929578f + (-f24 + f23) * (0.7619048f * 21.0f));
                f5 = class_11372.Method_11446(17.73913f * 0.4509804f + (-f24 + f23) * (0.2371134f * 67.478264f));
                f20 = class_11372.Method_11435(7.7714286f * 1.0294118f + (f24 + f23) * (0.25714287f * 62.222218f));
                f22 = class_11372.Method_11446(44.36364f * 0.18032786f + (f24 + f23) * (35.04762f * 0.45652175f));
                f18 = class_11372.Method_11435(5.714286f * 1.4f + (f24 - f23) * (1.425f * 11.22807f));
                f19 = class_11372.Method_11446(0.5764706f * 13.87755f + (f24 - f23) * (0.72727275f * 22.0f));
                f4 = class_11372.Method_11435(2.2727273f * 3.52f + (-f24 - f23) * (0.6376812f * 25.090908f));
            }
            int n3 = class_4415.Method_4440(class_561, class_4751);
            int n4 = n3 >> (16688 & 14357) & (-2079260673 & 671940607);
            int n5 = n3 & (3276799 & 705363967);
            float f26 = f10 * f6;
            float f27 = f10 * f7;
            f2 = f10 * f8;
            class_22385.Method_22443(d + 0.0, d2 + (double)f13, d3 + 0.0).Method_22427(f26, f27, f2, 1.0f).Method_22433(f, f21).Method_22418(n4, n5).Method_22451();
            class_22385.Method_22443(d + 0.0, d2 + (double)f14, d3 + 1.0).Method_22427(f26, f27, f2, 1.0f).Method_22433(f5, f20).Method_22418(n4, n5).Method_22451();
            class_22385.Method_22443(d + 1.0, d2 + (double)f15, d3 + 1.0).Method_22427(f26, f27, f2, 1.0f).Method_22433(f22, f18).Method_22418(n4, n5).Method_22451();
            class_22385.Method_22443(d + 1.0, d2 + (double)f16, d3 + 0.0).Method_22427(f26, f27, f2, 1.0f).Method_22433(f19, f4).Method_22418(n4, n5).Method_22451();
            if (class_4415.Method_4442(class_561, class_4810.Method_4812(class_4751).Method_4811(Class_4595.Field_4601))) {
                class_22385.Method_22443(d + 0.0, d2 + (double)f13, d3 + 0.0).Method_22427(f26, f27, f2, 1.0f).Method_22433(f, f21).Method_22418(n4, n5).Method_22451();
                class_22385.Method_22443(d + 1.0, d2 + (double)f16, d3 + 0.0).Method_22427(f26, f27, f2, 1.0f).Method_22433(f19, f4).Method_22418(n4, n5).Method_22451();
                class_22385.Method_22443(d + 1.0, d2 + (double)f15, d3 + 1.0).Method_22427(f26, f27, f2, 1.0f).Method_22433(f22, f18).Method_22418(n4, n5).Method_22451();
                class_22385.Method_22443(d + 0.0, d2 + (double)f14, d3 + 1.0).Method_22427(f26, f27, f2, 1.0f).Method_22433(f5, f20).Method_22418(n4, n5).Method_22451();
            }
        }
        if (bl2) {
            float f28 = arrclass_11372[24715 & 5684].Method_11420();
            f3 = arrclass_11372[16417 & 13448].Method_11444();
            f = arrclass_11372[1056 & 10264].Method_11437();
            f5 = arrclass_11372[-30656 & 9224].Method_11429();
            int n6 = class_4415.Method_4440(class_561, class_4751.Method_4782());
            int n7 = n6 >> (596 & 23834) & (1836384255 & 589823);
            int n8 = n6 & (154730495 & -725549057);
            class_22385.Method_22443(d, d2, d3 + 1.0).Method_22427(f9, f9, f9, 1.0f).Method_22433(f28, f5).Method_22418(n7, n8).Method_22451();
            class_22385.Method_22443(d, d2, d3).Method_22427(f9, f9, f9, 1.0f).Method_22433(f28, f).Method_22418(n7, n8).Method_22451();
            class_22385.Method_22443(d + 1.0, d2, d3).Method_22427(f9, f9, f9, 1.0f).Method_22433(f3, f).Method_22418(n7, n8).Method_22451();
            class_22385.Method_22443(d + 1.0, d2, d3 + 1.0).Method_22427(f9, f9, f9, 1.0f).Method_22433(f3, f5).Method_22418(n7, n8).Method_22451();
            n2 = -16237 & 1133;
        }
        for (int i = 13192 & -14256; i < (10692 & 13); ++i) {
            float f29;
            double d4;
            double d5;
            double d6;
            double d7;
            int n9 = -32352 & 4097;
            int n10 = -32734 & 27524;
            if (i == 0) {
                --n10;
            }
            if (i == (27141 & 4491)) {
                ++n10;
            }
            if (i == (258 & 21678)) {
                --n9;
            }
            if (i == (19475 & -28593)) {
                ++n9;
            }
            Class_4751 class_47512 = class_4751.Method_4791(n9, 8516 & 4096, n10);
            Class_11372 class_11372 = arrclass_11372[-32467 & 8275];
            class_22385.Method_22428(class_11372);
            if (!arrbl[i]) continue;
            if (i == 0) {
                f4 = f13;
                f29 = f16;
                d7 = d;
                d4 = d + 1.0;
                d6 = d3 + (double)f17;
                d5 = d3 + (double)f17;
            } else if (i == (1171 & 4385)) {
                f4 = f15;
                f29 = f14;
                d7 = d + 1.0;
                d4 = d;
                d6 = d3 + 1.0 - (double)f17;
                d5 = d3 + 1.0 - (double)f17;
            } else if (i == (4546 & 25602)) {
                f4 = f14;
                f29 = f13;
                d7 = d + (double)f17;
                d4 = d + (double)f17;
                d6 = d3 + 1.0;
                d5 = d3;
            } else {
                f4 = f16;
                f29 = f15;
                d7 = d + 1.0 - (double)f17;
                d4 = d + 1.0 - (double)f17;
                d6 = d3;
                d5 = d3 + 1.0;
            }
            n2 = 18445 & 9779;
            f2 = class_11372.Method_11446(0.0);
            float f30 = class_11372.Method_11446(43.0 * 0.18604651162790697);
            float f31 = class_11372.Method_11435((1.0f - f4) * (14.328358f * 1.1166667f) * (0.33333334f * 1.5f));
            float f32 = class_11372.Method_11435((1.0f - f29) * (1.25f * 12.8f) * (0.18292683f * 2.7333333f));
            float f33 = class_11372.Method_11435(1.0129870129870129 * 7.897435897435899);
            int n11 = class_4415.Method_4440(class_561, class_47512);
            int n12 = n11 >> (280 & 16564) & (1073807359 & -2140602369);
            int n13 = n11 & (-1877868545 & 1074331647);
            float f34 = i < (674 & -22246) ? f11 : f12;
            float f35 = f10 * f34 * f6;
            float f36 = f10 * f34 * f7;
            float f37 = f10 * f34 * f8;
            class_22385.Method_22443(d7, d2 + (double)f4, d6).Method_22427(f35, f36, f37, 1.0f).Method_22433(f2, f31).Method_22418(n12, n13).Method_22451();
            class_22385.Method_22443(d4, d2 + (double)f29, d5).Method_22427(f35, f36, f37, 1.0f).Method_22433(f30, f32).Method_22418(n12, n13).Method_22451();
            class_22385.Method_22443(d4, d2 + 0.0, d5).Method_22427(f35, f36, f37, 1.0f).Method_22433(f30, f33).Method_22418(n12, n13).Method_22451();
            class_22385.Method_22443(d7, d2 + 0.0, d6).Method_22427(f35, f36, f37, 1.0f).Method_22433(f2, f33).Method_22418(n12, n13).Method_22451();
            class_22385.Method_22443(d7, d2 + 0.0, d6).Method_22427(f35, f36, f37, 1.0f).Method_22433(f2, f33).Method_22418(n12, n13).Method_22451();
            class_22385.Method_22443(d4, d2 + 0.0, d5).Method_22427(f35, f36, f37, 1.0f).Method_22433(f30, f33).Method_22418(n12, n13).Method_22451();
            class_22385.Method_22443(d4, d2 + (double)f29, d5).Method_22427(f35, f36, f37, 1.0f).Method_22433(f30, f32).Method_22418(n12, n13).Method_22451();
            class_22385.Method_22443(d7, d2 + (double)f4, d6).Method_22427(f35, f36, f37, 1.0f).Method_22433(f2, f31).Method_22418(n12, n13).Method_22451();
        }
        class_22385.Method_22428(null);
        return n2 != 0;
    }

    private float Method_13301(Class_561 class_561, Class_4751 class_4751, Class_3713 class_3713) {
        int n = 11409 & -32732;
        float f = 0.0f;
        for (int i = 12432 & 17408; i < (-7412 & 5157); ++i) {
            Class_4810 class_4810 = class_4751.Method_4775(-(i & (25793 & 6161)), -23552 & 78, -(i >> (28811 & -32207) & (22785 & -32759)), (Class_4810)Field_13293.get());
            if (class_561.Method_569(class_4810.Method_4767(Class_4595.Field_4601, (Class_4810)Field_13296.get())).Method_3688().Method_3373() == class_3713) {
                return 1.0f;
            }
            Class_3677 class_3677 = class_561.Method_569(class_4810);
            Class_3713 class_37132 = class_3677.Method_3442().Method_3373();
            if (class_37132 != class_3713) {
                if (class_37132.Method_3762()) continue;
                f += 1.0f;
                ++n;
                continue;
            }
            int n2 = (Integer)class_3677.Method_3440(Class_4415.Field_4417);
            if (n2 >= (25096 & -26344) || n2 == 0) {
                f += Class_4415.Method_4426(n2) * (61.42857f * 0.1627907f);
                n += 10;
            }
            f += Class_4415.Method_4426(n2);
            ++n;
        }
        return 1.0f - f / (float)n;
    }

    public Class_13292() {
        this.Method_13299();
    }
}

