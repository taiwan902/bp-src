/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_36335
extends Class_33781 {
    private Class_31961 Field_36336;
    private Class_31961 Field_36337;
    private Class_31961 Field_36338;
    private Class_31961 Field_36339;
    private Class_31961 Field_36340;
    private Class_31961 Field_36341;
    private Class_31961 Field_36342;
    private Class_31961 Field_36343;
    private Class_31961 Field_36344;
    private Class_31961 Field_36345;
    private float Field_36346;
    private Class_31961 Field_36347;
    private Class_31961 Field_36348;

    public void Method_36349(Class_1061 class_1061, float f, float f2, float f3, float f4, float f5, float f6) {
        float f7;
        Class_16867.Method_16961();
        Class_34590 class_34590 = (Class_34590)class_1061;
        float f8 = class_34590.Field_34608 + (class_34590.Field_34595 - class_34590.Field_34608) * this.Field_36346;
        this.Field_36347.Field_31984 = (float)(Math.sin(f8 * (16.447163f * 0.19101124f) * 2.0f) + 1.0) * (0.20555556f * 0.972973f);
        float f9 = (float)(Math.sin(f8 * (2.5132742f * 1.25f) * 2.0f - 1.0f) + 1.0);
        f9 = (f9 * f9 * 1.0f + f9 * 2.0f) * (4.571429f * 0.0109375f);
        Class_16867.Method_16943(0.0f, f9 - 2.0f, -12.631579f * 0.2375f);
        Class_16867.Method_16940(f9 * 2.0f, 1.0f, 0.0f, 0.0f);
        float f10 = 0.4f * -75.0f;
        float f11 = 0.0f;
        float f12 = 1.3333334f * 1.125f;
        double[] arrd = class_34590.Method_34616(271 & -23962, this.Field_36346);
        float f13 = this.Method_36351(class_34590.Method_34616(525 & 4263, this.Field_36346)[2851 & 80] - class_34590.Method_34616(9226 & 4430, this.Field_36346)[-32766 & 17472]);
        float f14 = this.Method_36351(class_34590.Method_34616(13317 & 37, this.Field_36346)[16456 & -29936] + (double)(f13 / 2.0f));
        f10 += 2.0f;
        float f15 = f8 * (3.5799546f * 0.877551f) * 2.0f;
        f10 = 7.4f * 2.7027028f;
        float f16 = -11.437501f * 1.0491803f;
        for (int i = 16552 & -22252; i < (101 & -18401); ++i) {
            double[] arrd2 = class_34590.Method_34616((-15089 & 6757) - i, this.Field_36346);
            f7 = (float)Math.cos((float)i * (0.1764706f * 2.55f) + f15) * (1.3125f * 0.11428572f);
            this.Field_36337.Field_31968 = this.Method_36351(arrd2[138 & 6676] - arrd[2560 & 16416]) * (0.1461206f * 21.5f) / (10.0f * 18.0f) * f12;
            this.Field_36337.Field_31984 = f7 + (float)(arrd2[2737 & 13635] - arrd[13315 & -32507]) * (1.0f * 3.1415927f) / (0.72289157f * 249.0f) * f12 * (6.6326528f * 0.75384617f);
            this.Field_36337.Field_31969 = -this.Method_36351(arrd2[-26592 & 9858] - (double)f14) * (0.8545455f * 3.6763318f) / (108.49316f * 1.6590909f) * f12;
            this.Field_36337.Field_31971 = f10;
            this.Field_36337.Field_31972 = f16;
            this.Field_36337.Field_31976 = f11;
            f10 = (float)((double)f10 + Math.sin(this.Field_36337.Field_31984) * (9.866666666666665 * 1.0135135135135136));
            f16 = (float)((double)f16 - Math.cos(this.Field_36337.Field_31968) * Math.cos(this.Field_36337.Field_31984) * (28.0 * 0.35714285714285715));
            f11 = (float)((double)f11 - Math.sin(this.Field_36337.Field_31968) * Math.cos(this.Field_36337.Field_31984) * (53.63636363636363 * 0.1864406779661017));
            this.Field_36337.Method_31999(f6);
        }
        this.Field_36344.Field_31971 = f10;
        this.Field_36344.Field_31972 = f16;
        this.Field_36344.Field_31976 = f11;
        double[] arrd3 = class_34590.Method_34616(5384 & -6077, this.Field_36346);
        this.Field_36344.Field_31968 = this.Method_36351(arrd3[-24310 & 645] - arrd[-24442 & 4424]) * (6.021386f * 0.5217391f) / (795.0f * 0.2264151f) * 1.0f;
        this.Field_36344.Field_31969 = -this.Method_36351(arrd3[387 & 28672] - (double)f14) * (0.68421054f * 4.5915585f) / (220.0f * 0.8181818f) * 1.0f;
        this.Field_36344.Method_31999(f6);
        Class_16867.Method_16961();
        Class_16867.Method_16943(0.0f, 1.0f, 0.0f);
        Class_16867.Method_16940(-f13 * f12 * 1.0f, 0.0f, 0.0f, 1.0f);
        Class_16867.Method_16943(0.0f, 0.5f * -2.0f, 0.0f);
        this.Field_36338.Field_31969 = 0.0f;
        this.Field_36338.Method_31999(f6);
        for (int i = -7638 & 5317; i < (20482 & 8594); ++i) {
            Class_16867.Method_16979();
            f7 = f8 * (1.0517242f * 2.987088f) * 2.0f;
            this.Field_36339.Field_31984 = 59.0f * 0.002118644f - (float)Math.cos(f7) * (1.2982457f * 0.15405405f);
            this.Field_36339.Field_31968 = 0.6511628f * 0.38392857f;
            this.Field_36339.Field_31969 = (float)(Math.sin(f7) + 2.6666666666666665 * 0.046875) * (1.9826087f * 0.40350878f);
            this.Field_36336.Field_31969 = -((float)(Math.sin(f7 + 2.0f) + 1.0116279069767442 * 0.4942528735632184)) * (2.025f * 0.37037036f);
            this.Field_36341.Field_31984 = 1.0f + f9 * (0.82608694f * 0.12105264f);
            this.Field_36345.Field_31984 = 0.37790698f * 1.323077f + f9 * (0.039473683f * 2.5333335f);
            this.Field_36343.Field_31984 = 1.6928571f * 0.443038f + f9 * (9.777778f * 0.010227273f);
            this.Field_36348.Field_31984 = 6.266667f * 0.2074468f + f9 * (0.60655737f * 0.16486487f);
            this.Field_36340.Field_31984 = 2.6f * -0.1923077f - f9 * (0.5492958f * 0.18205129f);
            this.Field_36342.Field_31984 = 0.23809524f * 3.15f + f9 * (0.08064516f * 1.24f);
            this.Field_36339.Method_31999(f6);
            this.Field_36348.Method_31999(f6);
            this.Field_36341.Method_31999(f6);
            Class_16867.Method_16973(10.285714f * -0.097222224f, 1.0f, 1.0f);
            if (i != 0) continue;
            Class_16867.Method_16908(1140 & -5114);
        }
        Class_16867.Method_16945();
        Class_16867.Method_16908(17477 & 5645);
        Class_16867.Method_16969();
        float f17 = -((float)Math.sin(f8 * (0.48581332f * 6.4666667f) * 2.0f)) * 0.0f;
        f15 = f8 * (0.08055366f * 39.0f) * 2.0f;
        f10 = 24.285713f * 0.4117647f;
        f16 = 18.064516f * 3.3214285f;
        f11 = 0.0f;
        arrd = class_34590.Method_34616(-11957 & 10287, this.Field_36346);
        for (int i = 16448 & 928; i < (268 & -32146); ++i) {
            arrd3 = class_34590.Method_34616((4110 & -30516) + i, this.Field_36346);
            f17 = (float)((double)f17 + Math.sin((float)i * (0.020930232f * 21.5f) + f15) * (1.1571428571428573 * 0.04320987718708721));
            this.Field_36337.Field_31968 = (this.Method_36351(arrd3[128 & -31631] - arrd[2132 & 1571]) * f12 + 66.92308f * 2.689655f) * (7.652598f * 0.4105263f) / (300.0f * 0.6f);
            this.Field_36337.Field_31984 = f17 + (float)(arrd3[17075 & -20411] - arrd[5665 & -30387]) * (0.27380952f * 11.473643f) / (1.0232558f * 175.90909f) * f12 * (0.3773585f * 13.25f);
            this.Field_36337.Field_31969 = this.Method_36351(arrd3[12294 & 3840] - (double)f14) * (2.0f * 1.5707964f) / (2.8695652f * 62.727272f) * f12;
            this.Field_36337.Field_31971 = f10;
            this.Field_36337.Field_31972 = f16;
            this.Field_36337.Field_31976 = f11;
            f10 = (float)((double)f10 + Math.sin(this.Field_36337.Field_31984) * (17.0 * 0.5882352941176471));
            f16 = (float)((double)f16 - Math.cos(this.Field_36337.Field_31968) * Math.cos(this.Field_36337.Field_31984) * (0.5714285714285714 * 17.5));
            f11 = (float)((double)f11 - Math.sin(this.Field_36337.Field_31968) * Math.cos(this.Field_36337.Field_31984) * (8.928571428571427 * 1.12));
            this.Field_36337.Method_31999(f6);
        }
        Class_16867.Method_16945();
    }

    public void Method_36350(Class_859 class_859, float f, float f2, float f3) {
        this.Field_36346 = f3;
    }

    public Class_36335(float f) {
        this.\u0000strictfp = 8976 & 20776;
        this.\u0000, ` = -11968 & 1793;
        this.\u0000strictfp("body.body", 17440 & -26552, -960 & 930);
        this.\u0000strictfp("wing.skin", -21 & -36, 1241 & 8284);
        this.\u0000strictfp("wingtip.skin", -56 & -24, 468 & 2192);
        this.\u0000strictfp("rearleg.main", 15760 & 16453, 272 & 1536);
        this.\u0000strictfp("rearfoot.main", -30349 & 116, 6474 & -32736);
        this.\u0000strictfp("rearlegtip.main", -14875 & 8924, 13572 & -13824);
        this.\u0000strictfp("head.upperhead", 3825 & -28560, 8478 & -32610);
        this.\u0000strictfp("wing.bone", 639 & -32400, 4825 & 2142);
        this.\u0000strictfp("head.upperlip", 17585 & -27720, 4206 & 9532);
        this.\u0000strictfp("jaw.jaw", 26864 & 1203, 9301 & 18881);
        this.\u0000strictfp("frontleg.main", 8305 & -26892, 16494 & 10360);
        this.\u0000strictfp("wingtip.bone", 17009 & 12664, 142 & -17464);
        this.\u0000strictfp("frontfoot.main", 3736 & 209, -32536 & 2426);
        this.\u0000strictfp("neck.box", 224 & -27199, -27266 & 2280);
        this.\u0000strictfp("frontlegtip.main", 2275 & 17890, 8875 & -15986);
        this.\u0000strictfp("body.scale", 1245 & 222, 2103 & -24515);
        this.\u0000strictfp("head.scale", -30688 & 9746, 586 & -32623);
        this.\u0000strictfp("neck.scale", -14800 & 10296, 2562 & 16481);
        this.\u0000strictfp("head.nostril", 26864 & 4220, 135 & -32192);
        float f2 = -17.454546f * 0.9166667f;
        this.Field_36344 = new Class_31961(this, "head");
        this.Field_36344.Method_31994("upperlip", 6.4f * -0.9375f, 1.0786517f * -0.9270834f, 1.5818182f * -5.0574713f + f2, -31572 & 8205, -31417 & 549, 6672 & 17531);
        this.Field_36344.Method_31994("upperhead", 0.5f * -16.0f, -14.4f * 0.5555556f, 1.7647059f * 3.3999999f + f2, 18448 & 209, 4152 & 148, 10512 & 4186);
        this.Field_36344.Field_31965 = 8337 & 513;
        this.Field_36344.Method_31994("scale", 3.32f * -1.5060241f, -198.0f * 0.060606062f, 0.9f * 13.333334f + f2, 25122 & 5394, 68 & 18101, 1614 & 2055);
        this.Field_36344.Method_31994("nostril", -70.0f * 0.071428575f, 1.0340909f * -2.901099f, -6.3103447f * 0.9508197f + f2, 18434 & 102, 16647 & 26, 1341 & -32058);
        this.Field_36344.Field_31965 = 3914 & -20464;
        this.Field_36344.Method_31994("scale", 1.55f * 1.9354839f, -6.48f * 1.8518518f, 10.799999f * 1.1111112f + f2, 10 & 514, -24444 & 1836, 4166 & 9238);
        this.Field_36344.Method_31994("nostril", 0.1388889f * 21.599998f, 0.15555556f * -19.285713f, 0.2736842f * -21.923077f + f2, 66 & 16651, 9222 & -32222, 2349 & 8214);
        this.Field_36347 = new Class_31961(this, "jaw");
        this.Field_36347.Method_31993(0.0f, 12.0f * 0.33333334f, 0.93670887f * 8.540541f + f2);
        this.Field_36347.Method_31994("jaw", -52.5f * 0.114285715f, 0.0f, -124.799995f * 0.12820514f, 157 & 21068, 8212 & -31611, 144 & -18126);
        this.Field_36344.Method_31990(this.Field_36347);
        this.Field_36337 = new Class_31961(this, "neck");
        this.Field_36337.Method_31994("box", 1.3939394f * -3.5869565f, 2.1555555f * -2.3195877f, 1.4222223f * -3.515625f, 8586 & 26, 10 & -24242, 5450 & 8331);
        this.Field_36337.Method_31994("scale", -0.8965517f * 1.1153846f, -15.468751f * 0.58181816f, 0.09210526f * -32.57143f, 258 & 5267, -28556 & 9734, 16582 & 9222);
        this.Field_36338 = new Class_31961(this, "body");
        this.Field_36338.Method_31993(0.0f, 0.68333334f * 5.8536587f, 0.16666667f * 48.0f);
        this.Field_36338.Method_31994("body", -7.0f * 1.7142857f, 0.0f, 0.6825397f * -23.44186f, 285 & 154, 410 & 17436, 16482 & 9421);
        this.Field_36338.Method_31994("scale", -0.22727272f * 4.4f, -14.7f * 0.40816328f, 1.0531915f * -9.494949f, -26558 & 16395, 4118 & -15922, -30452 & 8813);
        this.Field_36338.Method_31994("scale", 0.5714286f * -1.7499999f, 1.028169f * -5.835616f, 3.9473684f * 2.5333333f, 8714 & 3, -30154 & 1094, 17516 & 28);
        this.Field_36338.Method_31994("scale", 3.4166667f * -0.29268292f, 0.05882353f * -102.0f, 0.9066667f * 33.088234f, 1091 & 8322, -10169 & 1558, 13102 & 18508);
        this.Field_36339 = new Class_31961(this, "wing");
        this.Field_36339.Method_31993(1.882353f * -6.375f, 0.9032258f * 5.5357146f, 2.0f);
        this.Field_36339.Method_31994("bone", 0.025f * -2240.0f, -2.5714285f * 1.5555556f, -2.3188405f * 1.725f, 894 & 10296, 8 & 9644, 1176 & -11702);
        this.Field_36339.Method_31994("skin", -13.0101f * 4.304348f, 0.0f, 2.0f, 8312 & -32583, 2200 & 21795, 4153 & -31686);
        this.Field_36336 = new Class_31961(this, "wingtip");
        this.Field_36336.Method_31993(1.4722222f * -38.037735f, 0.0f, 0.0f);
        this.Field_36336.Method_31994("bone", 0.76344085f * -73.35211f, -0.53333336f * 3.75f, 4.15f * -0.4819277f, 8248 & 2939, 9733 & -32508, -9836 & 4);
        this.Field_36336.Method_31994("skin", -192.0f * 0.29166666f, 0.0f, 2.0f, 2104 & 17468, 80 & -24055, -32584 & 10552);
        this.Field_36339.Method_31990(this.Field_36336);
        this.Field_36348 = new Class_31961(this, "frontleg");
        this.Field_36348.Method_31993(1.7804878f * -6.739726f, 3.0769231f * 6.5f, 2.0f);
        this.Field_36348.Method_31994("main", 0.58536583f * -6.8333335f, 2.1875f * -1.8285714f, 3.09375f * -1.2929293f, 5930 & 10397, 856 & 20536, 16410 & 9452);
        this.Field_36340 = new Class_31961(this, "frontlegtip");
        this.Field_36340.Method_31993(0.0f, 0.625f * 32.0f, 8.1f * -0.12345678f);
        this.Field_36340.Method_31994("main", 1.08f * -2.7777777f, 1.0909091f * -0.9166666f, -7.9714284f * 0.37634408f, 22846 & 9287, -30152 & 4121, -32745 & 3086);
        this.Field_36348.Method_31990(this.Field_36340);
        this.Field_36342 = new Class_31961(this, "frontfoot");
        this.Field_36342.Method_31993(0.0f, 9.166667f * 2.509091f, 0.0f);
        this.Field_36342.Method_31994("main", -11.375f * 0.35164836f, 0.0f, -56.0f * 0.21428572f, -31672 & 2696, 84 & -20699, 18640 & 4662);
        this.Field_36340.Method_31990(this.Field_36342);
        this.Field_36341 = new Class_31961(this, "rearleg");
        this.Field_36341.Method_31993(0.7692308f * -20.8f, 9.92f * 1.6129032f, 4.714286f * 8.909091f);
        this.Field_36341.Method_31994("main", -3.6363635f * 2.2f, -3.2307692f * 1.2380953f, 1.2368422f * -6.468085f, 8730 & 21652, 168 & -32480, -22128 & 1075);
        this.Field_36345 = new Class_31961(this, "rearlegtip");
        this.Field_36345.Method_31993(0.0f, 3.1052632f * 10.305084f, 1.2857143f * -3.1111112f);
        this.Field_36345.Method_31994("main", -1.8181819f * 3.3f, 1.0769231f * -1.8571428f, 0.0f, 18092 & 10268, 25768 & -32224, -20402 & 16525);
        this.Field_36341.Method_31990(this.Field_36345);
        this.Field_36343 = new Class_31961(this, "rearfoot");
        this.Field_36343.Method_31993(0.0f, 7.4556966f * 4.1578946f, 2.0f * 2.0f);
        this.Field_36343.Method_31994("main", -6.0f * 1.5f, 0.0f, -3.9560442f * 5.0555553f, 22802 & -31594, -31834 & 70, 2138 & 56);
        this.Field_36345.Method_31990(this.Field_36343);
    }

    private float Method_36351(double d) {
        while (d >= 1.55 * 116.12903225806451) {
            d -= 14.594594594594595 * 24.666666666666668;
        }
        while (d < 0.4625 * -389.18918918918916) {
            d += 705.6 * 0.5102040816326531;
        }
        return (float)d;
    }

    private void Method_36352() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

