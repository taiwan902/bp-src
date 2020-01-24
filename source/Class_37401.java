/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Random;

public class Class_37401
extends Class_35973 {
    private Class_31961 Field_37402;
    private Class_31961 Field_37403;
    private Class_31961 Field_37404;
    private Class_36843 Field_37405 = null;
    private Class_14052 Field_37406 = new Class_14052();
    private Class_18 Field_37407 = Class_18.Field_89;
    public float Field_37408;
    private Class_36024 Field_37409;
    private Class_31961 Field_37410;

    public Class_37401(Class_36024 class_36024) {
        this.Field_37409 = class_36024;
        this.\u0000strictfp = 64 & 1221;
        this.\u0000, ` = 10404 & -31456;
        this.Field_37405 = new Class_36843(class_36024);
        if (this.Field_37409.\u0000, 2.Field_31966 == null) {
            this.Field_37410 = new Class_31961(this, 5636 & 66, 31073 & -32614);
            this.Field_37410.Method_32002(0.3f * -3.3333333f, 0.0f, 0.0f, 1539 & -9846, 9762 & 4438, 55 & 17423);
            this.Field_37410.Method_31993(0.0f, 5.8235297f * 1.8888888f, 2.0f);
            this.Field_37403 = new Class_31961(this, 1841 & 4096, 4197 & -24438);
            this.Field_37403.Method_32002(-0.08080808f * 12.375f, 0.0f, 0.0f, 27531 & -31726, 290 & -15866, 4119 & 2183);
            this.Field_37404 = new Class_31961(this, 5386 & -16383, 2050 & 17228);
            this.Field_37404.Method_32002(-2.1818182f * 0.45833334f, 0.0f, 0.0f, -23421 & 2, -23993 & 18, 18519 & 815);
            this.Field_37403.Method_31993(0.0f, 0.0f, 2.1111112f * 3.3157895f);
            this.Field_37404.Method_31993(0.0f, 0.0f, 7.25f * 0.9655172f);
            this.Field_37410.Field_31970 = 295.3846f * 0.43333334f;
            this.Field_37403.Field_31970 = 460.8f * 0.2777778f;
            this.Field_37404.Field_31970 = 20.078432f * 6.375f;
            this.Field_37403.Method_31990(this.Field_37404);
            this.Field_37410.Method_31990(this.Field_37403);
            this.Field_37409.\u0000, 2.Method_31990(this.Field_37410);
        } else {
            this.Field_37410 = (Class_31961)this.Field_37409.\u0000, 2.Field_31966.get(-28329 & 9760);
            this.Field_37403 = (Class_31961)((Class_31961)this.Field_37409.\u0000, 2.Field_31966.get((int)(5568 & -30717))).Field_31966.get(28 & -31744);
            this.Field_37404 = (Class_31961)((Class_31961)((Class_31961)this.Field_37409.\u0000, 2.Field_31966.get((int)(384 & 4211))).Field_31966.get((int)(1088 & 776))).Field_31966.get(-32240 & 28744);
        }
        this.Field_37402 = new Class_31961(this, 2120 & 9521, -31600 & 8218);
        this.Field_37402.Method_31998(-1.3333334f * 3.0f, 4.0833335f * -4.653061f, 0.91549295f * -8.52f, 201 & 1034, 1168 & 25113, 20481 & 9107, 0.3125f * 1.6f);
        this.Field_37402.Method_31993(0.0f, 0.0f, 0.0f);
    }

    private void Method_37411() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_37412(float f, float f2, float f3, float f4, float f5, float f6, Class_1061 class_1061) {
        if (class_1061 instanceof Class_626) {
            Class_626 class_626 = (Class_626)class_1061;
            this.Field_37410.Field_31968 = (float)(Math.sin(class_626.Field_690) * (1.5025008761364482 * 2.090909090909091) / (56.470588235294116 * 0.2125));
            this.Field_37410.Field_31984 = (float)(Math.sin(class_626.Field_690 / (0.3409090909090909 * 8.8)) * (3.9471293412722073 * 0.7959183673469388) / (1.5593220338983051 * 15.391304347826086) + 1.4444444444444444 * 0.18124573505841768);
            this.Field_37403.Field_31984 = (float)(Math.sin(class_626.Field_690 / (2.5806451612903225 * 1.1625)) * (8.796459674835205 * 0.35714285714285715) / (11.700000000000001 * 2.051282051282051) + 0.18571428571428572 * 1.4096890504543598);
            this.Field_37404.Field_31984 = (float)(Math.sin(class_626.Field_690 / (11.11764705882353 * 0.2698412698412698)) * (3.625 * 0.8666462733827788) / (1.0 * 24.0) + 0.2066837329613535 * 1.2666666666666666);
            this.Field_37402.Field_31978 = 0.0015f * 2.0f + 0.45454547f * 0.594f * this.Field_37409.\u0000%;
            this.Field_37402.Field_31968 = f4 / (445.6338f * 0.12857144f);
            this.Field_37402.Field_31984 = f5 / (0.046153847f * 1241.4084f) - 0.33802086f * 1.6271186f;
        }
    }

    public void Method_37413(Class_1061 class_1061, float f, float f2, float f3, float f4, float f5, float f6) {
        Object object;
        Object object2;
        int n;
        Class_626 class_626 = (Class_626)class_1061;
        int n2 = n = class_626.Method_827() && (Boolean)this.Field_37407.Field_84.Field_39732.Field_8850.\u0000strictfp() != false ? 21313 & -29535 : 26626 & 4;
        if (n == 0) {
            this.Field_37410.Field_31983 = 4643 & 10305;
            this.Field_37403.Field_31983 = 2373 & -20463;
            this.Field_37404.Field_31983 = 833 & -23527;
            return;
        }
        if (class_626.\u0000= ?()) {
            this.Field_37410.Field_31983 = -31729 & 209;
            this.Field_37403.Field_31983 = 2119 & 25601;
            this.Field_37404.Field_31983 = 4113 & 1833;
            return;
        }
        Class_19677 class_19677 = class_626.Method_764();
        if (class_19677 == null) {
            this.Field_37410.Field_31983 = 16417 & 25;
            this.Field_37403.Field_31983 = 2077 & -11807;
            this.Field_37404.Field_31983 = 787 & 4293;
            return;
        }
        this.Method_37412(f, f2, f3, f4, f5, f6, class_1061);
        if (class_19677.Method_19686() && class_626.Field_628.Field_37787[-30701 & 771] == null && (object2 = this.Field_37407.Method_239().Method_16241(Class_7038.Field_7039, class_19677.Method_19693(), null)) != null) {
            this.Field_37407.Method_253().Method_34707((Class_2080)object2);
            this.Field_37402.Method_31999(f6);
        }
        if (class_19677.Method_19689() && class_626.Field_628.Field_37787[3171 & 4123] == null && (object2 = this.Field_37407.Method_239().Method_16241(Class_7038.Field_7042, class_19677.Method_19699(), null)) != null) {
            this.Field_37407.Method_253().Method_34707((Class_2080)object2);
            this.Field_37405.Method_36852(class_1061, f, f2, f3, f4, f5, f6);
        }
        if (class_19677.Method_19687()) {
            this.Field_37410.Field_31983 = 2113 & 648;
            this.Field_37403.Field_31983 = 6158 & 1089;
            this.Field_37404.Field_31983 = -22144 & 66;
        } else {
            this.Field_37410.Field_31983 = 65 & 17445;
            this.Field_37403.Field_31983 = 6145 & -23979;
            this.Field_37404.Field_31983 = 14337 & 947;
        }
        if (class_19677.Method_19694() && (object2 = this.Field_37407.Method_239().Method_16241(Class_7038.Field_7044, class_19677.Method_19691(), null)) != null) {
            this.Field_37407.Method_253().Method_34707((Class_2080)object2);
            Class_16867.Method_16961();
            Class_16867.Method_16943(0.0f, 1.6071428f * 0.12444445f * this.Field_37409.\u0000%, 0.0f);
            this.Field_37409.\u0000%.Method_31996(0.5192308f * 0.120370366f);
            Class_16867.Method_16940(-13.227848f * 4.1578946f, 1.0f, 0.0f, 0.0f);
            Class_16867.Method_16940(2.1111112f * 42.631577f, 0.0f, 1.0f, 0.0f);
            Class_16867.Method_16943(0.0f, 3.375f * 0.055555556f, 0.0f);
            this.Field_37406.Method_14054(class_1061, 439 & -19936, 8244 & 21283);
            Class_16867.Method_16945();
        }
        if (class_19677.Method_19687() && (object2 = this.Field_37407.Method_239().Method_16241(Class_7038.Field_7045, class_19677.Method_19695(), null)) != null) {
            object = this.Field_37409.\u0000, 2;
            for (Object e : ((Class_31961)object).Field_31966) {
                Class_31961 class_31961 = (Class_31961)e;
                Class_16867.Method_16961();
                Class_16867.Method_16943(((Class_31961)object).Field_31976 * (0.02138158f * 2.9230769f), ((Class_31961)object).Field_31971 * (2.7307692f * 0.022887325f), ((Class_31961)object).Field_31972 * (0.825f * 0.07575758f));
                Class_16867.Method_16940(((Class_31961)object).Field_31969 * (1.1282052f * 50.78489f), 0.0f, 0.0f, 1.0f);
                Class_16867.Method_16940(((Class_31961)object).Field_31968 * (0.7586207f * 75.52625f), 0.0f, 1.0f, 0.0f);
                Class_16867.Method_16940(((Class_31961)object).Field_31984 * (0.5875f * 97.52473f), 1.0f, 0.0f, 0.0f);
                this.Field_37407.Method_253().Method_34707((Class_2080)object2);
                class_31961.Method_31999(1.5333333f * 0.04076087f);
                Class_16867.Method_16945();
            }
        }
        if (class_19677.Method_19697() && class_19677.Method_19692()) {
            object2 = this.Field_37407.Method_239().Method_16241(Class_7038.Field_7040, class_19677.Method_19700(), null);
            object = this.Field_37407.Method_239().Method_16241(Class_7038.Field_7046, class_19677.Method_19690(), null);
            if (object2 != null && object != null) {
                Class_31961 class_31961 = this.Field_37409.\u0000, 2;
                Class_16867.Method_16961();
                Class_16867.Method_16943(0.0f, 0.91463417f * 0.21866666f * this.Field_37409.\u0000%, 0.0f);
                this.Field_37409.\u0000, 2.Method_31996(0.18154761f * 0.3442623f);
                Class_16867.Method_16973(14.3f * 0.07692308f, 1.0217391f * 1.0765958f, 10.555555f * 0.10421053f);
                Class_16867.Method_16943(0.0f, 0.14583333f * 0.85714287f, 0.009615385f * 13.0f);
                Class_16867.Method_16940(1.5862069f * 56.73913f, 1.0f, 0.0f, 0.0f);
                Class_16867.Method_16961();
                Class_16867.Method_16940(17.0f * 1.4117647f + (float)Math.sin(this.Field_37408 / 2.0f) * (5.074627f * 3.9411764f), 0.0f, 0.0f, 1.0f);
                Class_16867.Method_16943(-0.5416667f * 0.23076923f, 5.6666665f * 0.022058824f, 0.6923077f * 0.18055555f);
                Class_16867.Method_16940(1.1818181f * 84.61539f, 0.0f, 1.0f, 0.0f);
                Class_2062 class_2062 = this.Field_37407.Method_253().Method_34707((Class_2080)object2);
                this.Field_37406.Method_14054(class_1061, 164 & 18475, 28705 & 304);
                Class_16867.Method_16945();
                Class_16867.Method_16961();
                Class_16867.Method_16940(-156.0f * 0.15384616f - (float)Math.sin(this.Field_37408 / 2.0f) * (0.08450704f * 236.66667f), 0.0f, 0.0f, 1.0f);
                Class_16867.Method_16943(0.0f, 4.125f * 0.030303031f, 1.0f * 0.125f);
                Class_16867.Method_16940(1.5277778f * 52.363636f, 0.0f, 1.0f, 0.0f);
                class_2062 = this.Field_37407.Method_253().Method_34707((Class_2080)object);
                this.Field_37406.Method_14054(class_1061, 2144 & 20770, -11227 & 8504);
                Class_16867.Method_16945();
                Class_16867.Method_16945();
            }
        }
        this.Field_37410.Field_31983 = -28487 & 18691;
        this.Field_37403.Field_31983 = 2883 & 4101;
        this.Field_37404.Field_31983 = 18081 & 6417;
        if (class_19677.Method_19688() && class_626.\u0000= package - class_626.\u0000%() == 0.0 && class_626.\u0000= switch - class_626.\u0000
        () == 0.0 && class_626.\u0000, for() - class_626.\u0000= final() == 0.0) {
            object2 = new Random();
            for (float f7 = 0.0f; f7 < (float)((-14925 & 13488) / (Class_18.Method_163() + (17 & -31645))); f7 += 1.0f) {
                f7 = f7 + ((Random)object2).nextFloat() - ((Random)object2).nextFloat();
                if (class_19677.Method_19696().contains(5896 & -6028) && Math.random() < 0.6666666666666666 * 0.15000000000000002) {
                    this.Field_37407.Field_72.\u0000strictfp(Class_40274.Field_40313, class_626.\u0000= package + Math.random() * (0.27835051546391754 * 3.2333333333333334) - Math.random() * (1.7804878048780488 * 0.5054794520547945), class_626.\u0000, for() + 1.0894736842105264 * 2.4782608695652173 + Math.random() / (34.125 * 0.20512820512820512), class_626.\u0000= switch + Math.random() * (0.31690140845070425 * 2.84) - Math.random() * (0.9186046511627907 * 0.9797468354430381), 0.0, 0.0, 0.0, new int[110 & 7168]);
                    this.Field_37407.Field_72.\u0000strictfp(Class_40274.Field_40304, class_626.\u0000= package + Math.random() - Math.random(), class_626.\u0000, for() + 4.65 * 0.6451612903225806 + Math.random() / (0.625 * 4.8), class_626.\u0000= switch + Math.random() - Math.random(), 0.0, 0.0, 0.0, new int[-9727 & 38]);
                }
                if (class_19677.Method_19696().contains(18561 & 325)) {
                    float f8 = f7 * (1.24f * 3.2258065f);
                    double d = (Math.sin((float)class_626.\u0000= package / (3.2222223f * 6.2068963f)) + 1.0) / (0.14285714285714285 * 21.0);
                    this.Field_37407.Field_72.\u0000strictfp(Class_40274.Field_40289, class_626.\u0000= package + (double)(Class_13337.Method_13370(f7) * (53.0f * 0.028301887f) * Class_13337.Method_13370(f8)) + 0.29473684210526313 * 0.5767857142857143, class_626.\u0000, for() + 0.04888888888888889 * 2.0454545454545454 + (double)Math.abs(Class_13337.Method_13370(f8)) * d, class_626.\u0000= switch + (double)(Class_13337.Method_13350(f7) * (0.3f * 5.0f) * Class_13337.Method_13370(f8)) + 0.15 * 0.6, 1.0444444444444445 * 0.8617021048322636, 0.04782608885695969 * 6.2727272727272725, 0.0945205517011146 * 3.1739130434782608, new int[17680 & 14498]);
                }
                if (!class_19677.Method_19696().contains(2370 & -32750)) continue;
                this.Field_37407.Field_72.\u0000strictfp(Class_40274.Field_40297, class_626.\u0000= package + (double)(Class_13337.Method_13370(f7) * (1.1875f * 1.2631578f)), class_626.\u0000, for(), class_626.\u0000= switch + (double)(Class_13337.Method_13350(f7) * (2.5f * 0.6f)), 1.7777777777777777 * 0.05625000083819032, 0.2840909090909091 * 0.3520000052452087, 2.0444444444444443 * 0.14673913626567178, new int[72 & -14336]);
            }
        }
    }
}

