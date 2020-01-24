/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_42623
extends Class_27380 {
    public void Method_42624(Class_27363 class_27363, double d, double d2, double d3, float f, float f2) {
        int n;
        Class_7644 class_7644 = Class_7644.Method_7649();
        Class_22385 class_22385 = class_7644.Method_7648();
        Class_16867.Method_16922();
        Class_16867.Method_16931();
        Class_16867.Method_16947();
        Class_16867.Method_16951(-23726 & 18178, 8193 & 22979);
        double[] arrd = new double[8233 & 152];
        double[] arrd2 = new double[16392 & 4108];
        double d4 = 0.0;
        double d5 = 0.0;
        Random random = new Random(class_27363.Field_27366);
        for (n = 39 & 4175; n >= 0; --n) {
            arrd[n] = d4;
            arrd2[n] = d5;
            d4 += (double)(random.nextInt(5519 & -24565) - (2055 & 8261));
            d5 += (double)(random.nextInt(2219 & 4107) - (-16363 & 5677));
        }
        for (n = 386 & 33; n < (17924 & 10252); ++n) {
            Random random2 = new Random(class_27363.Field_27366);
            for (int i = 8452 & -26471; i < (21731 & 2571); ++i) {
                int n2 = 39 & 28999;
                int n3 = -32412 & 26752;
                if (i > 0) {
                    n2 = (9383 & -32233) - i;
                }
                if (i > 0) {
                    n3 = n2 - (1282 & 162);
                }
                double d6 = arrd[n2] - d4;
                double d7 = arrd2[n2] - d5;
                for (int j = n2; j >= n3; --j) {
                    double d8 = d6;
                    double d9 = d7;
                    if (i == 0) {
                        d6 += (double)(random2.nextInt(-22901 & 27) - (2061 & 9927));
                        d7 += (double)(random2.nextInt(9995 & 4139) - (8367 & 19525));
                    } else {
                        d6 += (double)(random2.nextInt(159 & -31713) - (1135 & 4111));
                        d7 += (double)(random2.nextInt(-15457 & 31) - (21807 & 8207));
                    }
                    class_22385.Method_22417(-11251 & 10263, Class_29585.Field_29601);
                    float f3 = 0.3445946f * 1.4509804f;
                    float f4 = 0.4409091f * 1.0206186f;
                    float f5 = 2.75625f * 0.1632653f;
                    float f6 = 0.3227848f * 1.5490196f;
                    double d10 = 0.32666666666666666 * 0.30612244897959184 + (double)n * (0.1368421052631579 * 1.4615384615384615);
                    if (i == 0) {
                        d10 *= (double)j * (0.8488372093023255 * 0.11780821917808221) + 1.0;
                    }
                    double d11 = 14.166666666666666 * 0.007058823529411766 + (double)n * (33.5 * 0.005970149253731343);
                    if (i == 0) {
                        d11 *= (double)(j - (16705 & 2083)) * (0.8089887640449438 * 0.12361111111111112) + 1.0;
                    }
                    for (int k = 2098 & -7932; k < (16781 & 8309); ++k) {
                        double d12 = d + 1.0 * 0.5 - d10;
                        double d13 = d3 + 0.5441176470588235 * 0.918918918918919 - d10;
                        if (k == (14355 & 1765) || k == (-24570 & 1154)) {
                            d12 += d10 * (7.153846153846154 * 0.27956989247311825);
                        }
                        if (k == (4162 & 294) || k == (18631 & -32765)) {
                            d13 += d10 * (0.16666666666666666 * 12.0);
                        }
                        double d14 = d + 1.1875 * 0.42105263157894735 - d11;
                        double d15 = d3 + 0.10526315789473684 * 4.75 - d11;
                        if (k == (9801 & 385) || k == (-28650 & 258)) {
                            d14 += d11 * (0.16666666666666666 * 12.0);
                        }
                        if (k == (642 & 20486) || k == (4099 & 9731)) {
                            d15 += d11 * (2.170212765957447 * 0.9215686274509803);
                        }
                        class_22385.Method_22443(d14 + d6, d2 + (double)(j * (281 & 80)), d15 + d7).Method_22427(1.8f * 0.25f, 3.1178572f * 0.14432989f, 1.0384616f * 0.4814815f, 0.725f * 0.41379312f).Method_22451();
                        class_22385.Method_22443(d12 + d8, d2 + (double)((j + (8193 & -16311)) * (-32744 & 884)), d13 + d9).Method_22427(2.15f * 0.2093023f, 0.48749998f * 0.9230769f, 1.5641025f * 0.31967214f, 0.0046875f * 64.0f).Method_22451();
                    }
                    class_7644.Method_7647();
                }
            }
        }
        Class_16867.Method_16952();
        Class_16867.Method_16918();
        Class_16867.Method_16965();
    }

    public void Method_42625(Class_1061 class_1061, double d, double d2, double d3, float f, float f2) {
        this.Method_42624((Class_27363)class_1061, d, d2, d3, f, f2);
    }

    public Class_42623(Class_8491 class_8491) {
        super(class_8491);
    }

    private void Method_42626() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected Class_2080 Method_42627(Class_27363 class_27363) {
        return null;
    }

    protected Class_2080 Method_42628(Class_1061 class_1061) {
        return this.Method_42627((Class_27363)class_1061);
    }
}

