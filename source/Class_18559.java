/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.BitSet;

public class Class_18559 {
    private final float[] Field_18560 = new float[-3827 & 2180];
    private final int[] Field_18561 = new int[4108 & 8932];

    private int Method_18562(int n, int n2, int n3, int n4) {
        if (n == 0) {
            n = n4;
        }
        if (n2 == 0) {
            n2 = n4;
        }
        if (n3 == 0) {
            n3 = n4;
        }
        return n + n2 + n3 + n4 >> (-32366 & 522) & (620696831 & -1862302977);
    }

    private void Method_18563() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_18564(Class_46187 class_46187, Class_3238 class_3238, Class_4751 class_4751, Class_4595 class_4595, float[] arrf, BitSet bitSet, Class_4810[] arrclass_4810) {
        float f;
        int n;
        float f2;
        int n2;
        int n3;
        float f3;
        int n4;
        float f4;
        Class_4751 class_47512 = bitSet.get(18812 & 129) ? class_4751.Method_4767(class_4595, arrclass_4810[Class_14121.Field_14139.ordinal()]) : class_4751;
        Class_22715 class_22715 = Class_22715.Method_22733(class_4595);
        Class_4751 class_47513 = class_47512.Method_4767(class_22715.Field_22725[5621 & -22528], arrclass_4810[Class_14121.Field_14132.ordinal()]);
        Class_4751 class_47514 = class_47512.Method_4767(class_22715.Field_22725[-7583 & 4115], arrclass_4810[Class_14121.Field_14130.ordinal()]);
        Class_4751 class_47515 = class_47512.Method_4767(class_22715.Field_22725[1027 & 110], arrclass_4810[Class_14121.Field_14137.ordinal()]);
        Class_4751 class_47516 = class_47512.Method_4767(class_22715.Field_22725[8355 & 4099], arrclass_4810[Class_14121.Field_14131.ordinal()]);
        int n5 = class_3238.Method_3378(class_46187, class_47513, arrclass_4810);
        int n6 = class_3238.Method_3378(class_46187, class_47514, arrclass_4810);
        int n7 = class_3238.Method_3378(class_46187, class_47515, arrclass_4810);
        int n8 = class_3238.Method_3378(class_46187, class_47516, arrclass_4810);
        float f5 = Class_36539.Method_36554(class_46187.Method_46198(class_47513).Method_3688().Method_3343());
        float f6 = Class_36539.Method_36554(class_46187.Method_46198(class_47514).Method_3688().Method_3343());
        float f7 = Class_36539.Method_36554(class_46187.Method_46198(class_47515).Method_3688().Method_3343());
        float f8 = Class_36539.Method_36554(class_46187.Method_46198(class_47516).Method_3688().Method_3343());
        boolean bl = class_46187.Method_46198(class_47513.Method_4767(class_4595, arrclass_4810[Class_14121.Field_14136.ordinal()])).Method_3688().Method_3409();
        boolean bl2 = class_46187.Method_46198(class_47514.Method_4767(class_4595, arrclass_4810[Class_14121.Field_14127.ordinal()])).Method_3688().Method_3409();
        boolean bl3 = class_46187.Method_46198(class_47515.Method_4767(class_4595, arrclass_4810[Class_14121.Field_14122.ordinal()])).Method_3688().Method_3409();
        boolean bl4 = class_46187.Method_46198(class_47516.Method_4767(class_4595, arrclass_4810[Class_14121.Field_14124.ordinal()])).Method_3688().Method_3409();
        if (!bl3 && !bl) {
            f2 = f5;
            n2 = n5;
        } else {
            Class_4751 class_47517 = class_47513.Method_4767(class_22715.Field_22725[3154 & -11390], arrclass_4810[Class_14121.Field_14138.ordinal()]);
            f2 = Class_36539.Method_36554(class_46187.Method_46198(class_47517).Method_3688().Method_3343());
            n2 = class_3238.Method_3378(class_46187, class_47517, arrclass_4810);
        }
        if (!bl4 && !bl) {
            f4 = f5;
            n = n5;
        } else {
            Class_4751 class_47518 = class_47513.Method_4767(class_22715.Field_22725[-32733 & 3147], arrclass_4810[Class_14121.Field_14135.ordinal()]);
            f4 = Class_36539.Method_36554(class_46187.Method_46198(class_47518).Method_3688().Method_3343());
            n = class_3238.Method_3378(class_46187, class_47518, arrclass_4810);
        }
        if (!bl3 && !bl2) {
            f3 = f6;
            n3 = n6;
        } else {
            Class_4751 class_47519 = class_47514.Method_4767(class_22715.Field_22725[17986 & 134], arrclass_4810[Class_14121.Field_14126.ordinal()]);
            f3 = Class_36539.Method_36554(class_46187.Method_46198(class_47519).Method_3688().Method_3343());
            n3 = class_3238.Method_3378(class_46187, class_47519, arrclass_4810);
        }
        if (!bl4 && !bl2) {
            f = f6;
            n4 = n6;
        } else {
            Class_4751 class_475110 = class_47514.Method_4767(class_22715.Field_22725[915 & 17455], arrclass_4810[Class_14121.Field_14125.ordinal()]);
            f = Class_36539.Method_36554(class_46187.Method_46198(class_475110).Method_3688().Method_3343());
            n4 = class_3238.Method_3378(class_46187, class_475110, arrclass_4810);
        }
        int n9 = class_3238.Method_3378(class_46187, class_4751, arrclass_4810);
        if (bitSet.get(16384 & -27055) || !class_46187.Method_46198(class_4751.Method_4767(class_4595, arrclass_4810[Class_14121.Field_14133.ordinal()])).Method_3688().Method_3375()) {
            n9 = class_3238.Method_3378(class_46187, class_4751.Method_4767(class_4595, arrclass_4810[Class_14121.Field_14129.ordinal()]), arrclass_4810);
        }
        float f9 = bitSet.get(17412 & 2321) ? class_46187.Method_46198(class_47512).Method_3688().Method_3343() : class_46187.Method_46198(class_4751).Method_3688().Method_3343();
        f9 = Class_36539.Method_36554(f9);
        Class_16988 class_16988 = Class_16988.Method_17006(class_4595);
        float[] arrf2 = this.Field_18560;
        int[] arrn = this.Field_18561;
        Class_22109[] arrclass_22109 = class_22715.Field_22727;
        Class_22109[] arrclass_221092 = class_22715.Field_22728;
        Class_22109[] arrclass_221093 = class_22715.Field_22726;
        Class_22109[] arrclass_221094 = class_22715.Field_22718;
        if (bitSet.get(-29549 & 16717) && class_22715.Field_22731) {
            float f10 = (f8 + f5 + f4 + f9) * (12.25f * 0.020408163f);
            float f11 = (f7 + f5 + f2 + f9) * (27.666666f * 0.009036145f);
            float f12 = (f7 + f6 + f3 + f9) * (0.5263158f * 0.475f);
            float f13 = (f8 + f6 + f + f9) * (7.857143f * 0.03181818f);
            float f14 = arrf[arrclass_22109[5124 & 32].Field_22121] * arrf[arrclass_22109[81 & -30545].Field_22121];
            float f15 = arrf[arrclass_22109[-31669 & 12802].Field_22121] * arrf[arrclass_22109[35 & 523].Field_22121];
            float f16 = arrf[arrclass_22109[13428 & 13].Field_22121] * arrf[arrclass_22109[9997 & 2053].Field_22121];
            float f17 = arrf[arrclass_22109[16398 & 13351].Field_22121] * arrf[arrclass_22109[519 & 25831].Field_22121];
            float f18 = arrf[arrclass_221092[12598 & 2113].Field_22121] * arrf[arrclass_221092[17187 & 193].Field_22121];
            float f19 = arrf[arrclass_221092[1330 & -19901].Field_22121] * arrf[arrclass_221092[8199 & 2435].Field_22121];
            float f20 = arrf[arrclass_221092[590 & 5252].Field_22121] * arrf[arrclass_221092[15365 & 709].Field_22121];
            float f21 = arrf[arrclass_221092[-32242 & 7].Field_22121] * arrf[arrclass_221092[-27641 & 855].Field_22121];
            float f22 = arrf[arrclass_221093[5636 & 16672].Field_22121] * arrf[arrclass_221093[-31935 & 8329].Field_22121];
            float f23 = arrf[arrclass_221093[8195 & 7554].Field_22121] * arrf[arrclass_221093[17423 & 547].Field_22121];
            float f24 = arrf[arrclass_221093[5644 & 10308].Field_22121] * arrf[arrclass_221093[9477 & -10097].Field_22121];
            float f25 = arrf[arrclass_221093[-28401 & 18662].Field_22121] * arrf[arrclass_221093[8775 & 23].Field_22121];
            float f26 = arrf[arrclass_221094[8723 & 17632].Field_22121] * arrf[arrclass_221094[9521 & 16461].Field_22121];
            float f27 = arrf[arrclass_221094[514 & 9478].Field_22121] * arrf[arrclass_221094[24707 & 1087].Field_22121];
            float f28 = arrf[arrclass_221094[5191 & 2308].Field_22121] * arrf[arrclass_221094[-15579 & 4117].Field_22121];
            float f29 = arrf[arrclass_221094[343 & 2574].Field_22121] * arrf[arrclass_221094[-31193 & 2071].Field_22121];
            arrf2[Class_16988.Method_17007((Class_16988)class_16988)] = f10 * f14 + f11 * f15 + f12 * f16 + f13 * f17;
            arrf2[Class_16988.Method_17009((Class_16988)class_16988)] = f10 * f18 + f11 * f19 + f12 * f20 + f13 * f21;
            arrf2[Class_16988.Method_17021((Class_16988)class_16988)] = f10 * f22 + f11 * f23 + f12 * f24 + f13 * f25;
            arrf2[Class_16988.Method_17003((Class_16988)class_16988)] = f10 * f26 + f11 * f27 + f12 * f28 + f13 * f29;
            int n10 = this.Method_18562(n8, n5, n, n9);
            int n11 = this.Method_18562(n7, n5, n2, n9);
            int n12 = this.Method_18562(n7, n6, n3, n9);
            int n13 = this.Method_18562(n8, n6, n4, n9);
            arrn[Class_16988.Method_17007((Class_16988)class_16988)] = this.Method_18567(n10, n11, n12, n13, f14, f15, f16, f17);
            arrn[Class_16988.Method_17009((Class_16988)class_16988)] = this.Method_18567(n10, n11, n12, n13, f18, f19, f20, f21);
            arrn[Class_16988.Method_17021((Class_16988)class_16988)] = this.Method_18567(n10, n11, n12, n13, f22, f23, f24, f25);
            arrn[Class_16988.Method_17003((Class_16988)class_16988)] = this.Method_18567(n10, n11, n12, n13, f26, f27, f28, f29);
        } else {
            float f30 = (f8 + f5 + f4 + f9) * (0.18292683f * 1.3666667f);
            float f31 = (f7 + f5 + f2 + f9) * (0.65909094f * 0.37931034f);
            float f32 = (f7 + f6 + f3 + f9) * (1.5263158f * 0.1637931f);
            float f33 = (f8 + f6 + f + f9) * (1.1754386f * 0.21268655f);
            arrn[Class_16988.Method_17007((Class_16988)class_16988)] = this.Method_18562(n8, n5, n, n9);
            arrn[Class_16988.Method_17009((Class_16988)class_16988)] = this.Method_18562(n7, n5, n2, n9);
            arrn[Class_16988.Method_17021((Class_16988)class_16988)] = this.Method_18562(n7, n6, n3, n9);
            arrn[Class_16988.Method_17003((Class_16988)class_16988)] = this.Method_18562(n8, n6, n4, n9);
            arrf2[Class_16988.Method_17007((Class_16988)class_16988)] = f30;
            arrf2[Class_16988.Method_17009((Class_16988)class_16988)] = f31;
            arrf2[Class_16988.Method_17021((Class_16988)class_16988)] = f32;
            arrf2[Class_16988.Method_17003((Class_16988)class_16988)] = f33;
        }
    }

    public void Method_18565(Class_561 class_561, Class_3238 class_3238, Class_4751 class_4751, Class_4595 class_4595, float[] arrf, BitSet bitSet, Class_4810[] arrclass_4810) {
        float f;
        int n;
        float f2;
        int n2;
        int n3;
        float f3;
        int n4;
        float f4;
        Class_4751 class_47512 = bitSet.get(704 & 6164) ? class_4751.Method_4767(class_4595, arrclass_4810[Class_14121.Field_14139.ordinal()]) : class_4751;
        Class_22715 class_22715 = Class_22715.Method_22733(class_4595);
        Class_4751 class_47513 = class_47512.Method_4767(class_22715.Field_22725[1 & 10630], arrclass_4810[Class_14121.Field_14132.ordinal()]);
        Class_4751 class_47514 = class_47512.Method_4767(class_22715.Field_22725[1033 & -19643], arrclass_4810[Class_14121.Field_14130.ordinal()]);
        Class_4751 class_47515 = class_47512.Method_4767(class_22715.Field_22725[16650 & 8438], arrclass_4810[Class_14121.Field_14137.ordinal()]);
        Class_4751 class_47516 = class_47512.Method_4767(class_22715.Field_22725[8355 & 22595], arrclass_4810[Class_14121.Field_14131.ordinal()]);
        int n5 = class_3238.Method_3432(class_561, class_47513);
        int n6 = class_3238.Method_3432(class_561, class_47514);
        int n7 = class_3238.Method_3432(class_561, class_47515);
        int n8 = class_3238.Method_3432(class_561, class_47516);
        float f5 = Class_36539.Method_36554(class_561.Method_568(class_47513).Method_3442().Method_3343());
        float f6 = Class_36539.Method_36554(class_561.Method_568(class_47514).Method_3442().Method_3343());
        float f7 = Class_36539.Method_36554(class_561.Method_568(class_47515).Method_3442().Method_3343());
        float f8 = Class_36539.Method_36554(class_561.Method_568(class_47516).Method_3442().Method_3343());
        boolean bl = class_561.Method_568(class_47513.Method_4767(class_4595, arrclass_4810[Class_14121.Field_14136.ordinal()])).Method_3442().Method_3409();
        boolean bl2 = class_561.Method_568(class_47514.Method_4767(class_4595, arrclass_4810[Class_14121.Field_14127.ordinal()])).Method_3442().Method_3409();
        boolean bl3 = class_561.Method_568(class_47515.Method_4767(class_4595, arrclass_4810[Class_14121.Field_14122.ordinal()])).Method_3442().Method_3409();
        boolean bl4 = class_561.Method_568(class_47516.Method_4767(class_4595, arrclass_4810[Class_14121.Field_14124.ordinal()])).Method_3442().Method_3409();
        if (!bl3 && !bl) {
            f2 = f5;
            n2 = n5;
        } else {
            Class_4751 class_47517 = class_47513.Method_4767(class_22715.Field_22725[-24574 & 4786], arrclass_4810[Class_14121.Field_14138.ordinal()]);
            f2 = Class_36539.Method_36554(class_561.Method_568(class_47517).Method_3442().Method_3343());
            n2 = class_3238.Method_3432(class_561, class_47517);
        }
        if (!bl4 && !bl) {
            f4 = f5;
            n = n5;
        } else {
            Class_4751 class_47518 = class_47513.Method_4767(class_22715.Field_22725[13639 & -32221], arrclass_4810[Class_14121.Field_14135.ordinal()]);
            f4 = Class_36539.Method_36554(class_561.Method_568(class_47518).Method_3442().Method_3343());
            n = class_3238.Method_3432(class_561, class_47518);
        }
        if (!bl3 && !bl2) {
            f3 = f6;
            n3 = n6;
        } else {
            Class_4751 class_47519 = class_47514.Method_4767(class_22715.Field_22725[-29670 & 13026], arrclass_4810[Class_14121.Field_14126.ordinal()]);
            f3 = Class_36539.Method_36554(class_561.Method_568(class_47519).Method_3442().Method_3343());
            n3 = class_3238.Method_3432(class_561, class_47519);
        }
        if (!bl4 && !bl2) {
            f = f6;
            n4 = n6;
        } else {
            Class_4751 class_475110 = class_47514.Method_4767(class_22715.Field_22725[18179 & 2259], arrclass_4810[Class_14121.Field_14125.ordinal()]);
            f = Class_36539.Method_36554(class_561.Method_569(class_475110).Method_3688().Method_3343());
            n4 = class_3238.Method_3432(class_561, class_475110);
        }
        int n9 = class_3238.Method_3432(class_561, class_4751);
        if (bitSet.get(7299 & -16116) || !class_561.Method_569(class_4751.Method_4767(class_4595, arrclass_4810[Class_14121.Field_14133.ordinal()])).Method_3688().Method_3375()) {
            n9 = class_3238.Method_3432(class_561, class_4751.Method_4767(class_4595, arrclass_4810[Class_14121.Field_14129.ordinal()]));
        }
        float f9 = bitSet.get(2471 & 12880) ? class_561.Method_569(class_47512).Method_3688().Method_3343() : class_561.Method_569(class_4751).Method_3688().Method_3343();
        f9 = Class_36539.Method_36554(f9);
        Class_16988 class_16988 = Class_16988.Method_17006(class_4595);
        float[] arrf2 = this.Field_18560;
        int[] arrn = this.Field_18561;
        Class_22109[] arrclass_22109 = class_22715.Field_22727;
        Class_22109[] arrclass_221092 = class_22715.Field_22728;
        Class_22109[] arrclass_221093 = class_22715.Field_22726;
        Class_22109[] arrclass_221094 = class_22715.Field_22718;
        if (bitSet.get(21013 & 131) && class_22715.Field_22731) {
            float f10 = (f8 + f5 + f4 + f9) * (1.1125f * 0.2247191f);
            float f11 = (f7 + f5 + f2 + f9) * (0.15789473f * 1.5833334f);
            float f12 = (f7 + f6 + f3 + f9) * (0.7746479f * 0.32272726f);
            float f13 = (f8 + f6 + f + f9) * (0.3101852f * 0.80597013f);
            float f14 = arrf[arrclass_22109[6893 & 17426].Field_22121] * arrf[arrclass_22109[853 & -14301].Field_22121];
            float f15 = arrf[arrclass_22109[34 & -24314].Field_22121] * arrf[arrclass_22109[8843 & -16281].Field_22121];
            float f16 = arrf[arrclass_22109[-7980 & 3340].Field_22121] * arrf[arrclass_22109[-32251 & 3079].Field_22121];
            float f17 = arrf[arrclass_22109[-24370 & 16662].Field_22121] * arrf[arrclass_22109[-14329 & 9175].Field_22121];
            float f18 = arrf[arrclass_221092[13317 & 16832].Field_22121] * arrf[arrclass_221092[-28671 & 18903].Field_22121];
            float f19 = arrf[arrclass_221092[19 & 29130].Field_22121] * arrf[arrclass_221092[4875 & -23373].Field_22121];
            float f20 = arrf[arrclass_221092[5965 & 16420].Field_22121] * arrf[arrclass_221092[18087 & 10245].Field_22121];
            float f21 = arrf[arrclass_221092[2062 & 38].Field_22121] * arrf[arrclass_221092[6703 & 17735].Field_22121];
            float f22 = arrf[arrclass_221093[19488 & 12804].Field_22121] * arrf[arrclass_221093[9249 & 4609].Field_22121];
            float f23 = arrf[arrclass_221093[39 & -21246].Field_22121] * arrf[arrclass_221093[4335 & -32765].Field_22121];
            float f24 = arrf[arrclass_221093[8335 & -15612].Field_22121] * arrf[arrclass_221093[25805 & -28651].Field_22121];
            float f25 = arrf[arrclass_221093[22 & -30522].Field_22121] * arrf[arrclass_221093[103 & 14343].Field_22121];
            float f26 = arrf[arrclass_221094[5128 & -32080].Field_22121] * arrf[arrclass_221094[4481 & 621].Field_22121];
            float f27 = arrf[arrclass_221094[-28010 & 16394].Field_22121] * arrf[arrclass_221094[27 & 16387].Field_22121];
            float f28 = arrf[arrclass_221094[1716 & -22266].Field_22121] * arrf[arrclass_221094[477 & 7175].Field_22121];
            float f29 = arrf[arrclass_221094[-12570 & 8199].Field_22121] * arrf[arrclass_221094[16487 & -32489].Field_22121];
            arrf2[Class_16988.Method_17007((Class_16988)class_16988)] = f10 * f14 + f11 * f15 + f12 * f16 + f13 * f17;
            arrf2[Class_16988.Method_17009((Class_16988)class_16988)] = f10 * f18 + f11 * f19 + f12 * f20 + f13 * f21;
            arrf2[Class_16988.Method_17021((Class_16988)class_16988)] = f10 * f22 + f11 * f23 + f12 * f24 + f13 * f25;
            arrf2[Class_16988.Method_17003((Class_16988)class_16988)] = f10 * f26 + f11 * f27 + f12 * f28 + f13 * f29;
            int n10 = this.Method_18562(n8, n5, n, n9);
            int n11 = this.Method_18562(n7, n5, n2, n9);
            int n12 = this.Method_18562(n7, n6, n3, n9);
            int n13 = this.Method_18562(n8, n6, n4, n9);
            arrn[Class_16988.Method_17007((Class_16988)class_16988)] = this.Method_18567(n10, n11, n12, n13, f14, f15, f16, f17);
            arrn[Class_16988.Method_17009((Class_16988)class_16988)] = this.Method_18567(n10, n11, n12, n13, f18, f19, f20, f21);
            arrn[Class_16988.Method_17021((Class_16988)class_16988)] = this.Method_18567(n10, n11, n12, n13, f22, f23, f24, f25);
            arrn[Class_16988.Method_17003((Class_16988)class_16988)] = this.Method_18567(n10, n11, n12, n13, f26, f27, f28, f29);
        } else {
            float f30 = (f8 + f5 + f4 + f9) * (1.4814814f * 0.16875f);
            float f31 = (f7 + f5 + f2 + f9) * (0.6097561f * 0.41f);
            float f32 = (f7 + f6 + f3 + f9) * (0.8271605f * 0.30223882f);
            float f33 = (f8 + f6 + f + f9) * (5.5833335f * 0.04477612f);
            arrn[Class_16988.Method_17007((Class_16988)class_16988)] = this.Method_18562(n8, n5, n, n9);
            arrn[Class_16988.Method_17009((Class_16988)class_16988)] = this.Method_18562(n7, n5, n2, n9);
            arrn[Class_16988.Method_17021((Class_16988)class_16988)] = this.Method_18562(n7, n6, n3, n9);
            arrn[Class_16988.Method_17003((Class_16988)class_16988)] = this.Method_18562(n8, n6, n4, n9);
            arrf2[Class_16988.Method_17007((Class_16988)class_16988)] = f30;
            arrf2[Class_16988.Method_17009((Class_16988)class_16988)] = f31;
            arrf2[Class_16988.Method_17021((Class_16988)class_16988)] = f32;
            arrf2[Class_16988.Method_17003((Class_16988)class_16988)] = f33;
        }
    }

    static int[] Method_18566(Class_18559 class_18559) {
        return class_18559.Field_18561;
    }

    private int Method_18567(int n, int n2, int n3, int n4, float f, float f2, float f3, float f4) {
        int n5 = (int)((float)(n >> (-32144 & 2068) & (8447 & -27649)) * f + (float)(n2 >> (8848 & -30667) & (9215 & 16639)) * f2 + (float)(n3 >> (5648 & -24526) & (4351 & 18943)) * f3 + (float)(n4 >> (5136 & 8979) & (255 & -11777)) * f4) & (-32513 & 12543);
        int n6 = (int)((float)(n & (1535 & 2303)) * f + (float)(n2 & (255 & 2303)) * f2 + (float)(n3 & (1279 & 21247)) * f3 + (float)(n4 & (8447 & 255)) * f4) & (-13825 & 255);
        return n5 << (-13290 & 529) | n6;
    }

    static float[] Method_18568(Class_18559 class_18559) {
        return class_18559.Field_18560;
    }
}

