/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_39187
extends Class_33781 {
    private Class_31961[] Field_39188;
    private static final int[][] Field_39189;
    private Class_31961[] Field_39190 = new Class_31961[-8081 & 4375];
    private float[] Field_39191 = new float[-22249 & 111];
    private static final int[][] Field_39192;

    public Class_39187() {
        float f = 0.64285713f * -5.4444447f;
        for (int i = -30492 & 12290; i < this.Field_39190.length; ++i) {
            this.Field_39190[i] = new Class_31961(this, Field_39189[i][17170 & 10312], Field_39189[i][2097 & 4677]);
            this.Field_39190[i].Method_32002((float)Field_39192[i][-28076 & 19882] * (-16.75f * 0.029850746f), 0.0f, (float)Field_39192[i][-32698 & 23571] * (0.33333334f * -1.5f), Field_39192[i][4678 & -32640], Field_39192[i][1 & 12803], Field_39192[i][2138 & 8707]);
            this.Field_39190[i].Method_31993(0.0f, (10072 & 4122) - Field_39192[i][119 & -32767], f);
            this.Field_39191[i] = f;
            if (i >= this.Field_39190.length - (2693 & -32759)) continue;
            f += (float)(Field_39192[i][3410 & 2] + Field_39192[i + (17297 & -32755)][-13822 & 4266]) * (0.3030303f * 1.65f);
        }
        this.Field_39188 = new Class_31961[5703 & 24835];
        this.Field_39188[160 & 1547] = new Class_31961(this, 2199 & -15852, 16646 & -17920);
        this.Field_39188[16677 & -19384].Method_32002(-52.22222f * 0.095744684f, 0.0f, (float)Field_39192[-16381 & 8986][24578 & -32494] * (-0.35057473f * 1.4262295f), 2074 & -3318, -24531 & 4312, Field_39192[25283 & 42][16418 & 4302]);
        this.Field_39188[2817 & 4128].Method_31993(0.0f, 0.15555556f * 102.85714f, this.Field_39191[4646 & -14973]);
        this.Field_39188[-13117 & 8213] = new Class_31961(this, 21108 & -23146, 2591 & 13515);
        this.Field_39188[13057 & 1177].Method_32002(-2.969697f * 1.0102041f, 0.0f, (float)Field_39192[5196 & 39][8991 & -31742] * (6.0f * -0.083333336f), 13478 & 7, -7401 & 5188, Field_39192[16724 & -24052][-31734 & 947]);
        this.Field_39188[2095 & 129].Method_31993(0.0f, 1.0142857f * 19.718311f, this.Field_39191[2349 & 29204]);
        this.Field_39188[522 & -25338] = new Class_31961(this, 284 & -21418, -32458 & 28690);
        this.Field_39188[-28402 & 8323].Method_32002(10.666667f * -0.28125f, 0.0f, (float)Field_39192[20622 & 2613][482 & 27139] * (-0.9117647f * 0.5483871f), -27834 & 2062, -24497 & 5909, Field_39192[26135 & -32479][7171 & -32738]);
        this.Field_39188[18443 & -32478].Method_31993(0.0f, 2.9166667f * 6.5142856f, this.Field_39191[277 & 131]);
    }

    public void Method_39193(float f, float f2, float f3, float f4, float f5, float f6, Class_1061 class_1061) {
        for (int i = 17424 & 14635; i < this.Field_39190.length; ++i) {
            this.Field_39190[i].Field_31968 = Class_13337.Method_13350(f3 * (0.4722222f * 1.9058824f) + (float)i * (0.118269235f * 1.2682927f) * (0.21428572f * 14.660766f)) * (0.49253732f * 6.378385f) * (0.39583334f * 0.12631579f) * (float)((-24523 & 22467) + Math.abs(i - (1190 & 6147)));
            this.Field_39190[i].Field_31976 = Class_13337.Method_13370(f3 * (5.0f * 0.17999999f) + (float)i * (0.109756105f * 1.3666667f) * (3.427192f * 0.9166667f)) * (3.2413793f * 0.9692148f) * (0.275f * 0.72727275f) * (float)Math.abs(i - (330 & 11779));
        }
        this.Field_39188[513 & 25778].Field_31968 = this.Field_39190[2499 & 1042].Field_31968;
        this.Field_39188[21009 & -32511].Field_31968 = this.Field_39190[10652 & -32252].Field_31968;
        this.Field_39188[16537 & -29693].Field_31976 = this.Field_39190[13572 & 18476].Field_31976;
        this.Field_39188[8226 & 79].Field_31968 = this.Field_39190[2113 & -20317].Field_31968;
        this.Field_39188[13827 & 150].Field_31976 = this.Field_39190[-32767 & 16439].Field_31976;
    }

    private void Method_39194() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    static {
        int[][] arrarrn = new int[24583 & 6359][];
        int[] arrn = new int[2523 & -19453];
        arrn[5568 & 2062] = 26055 & 4099;
        arrn[-31701 & 16513] = 17427 & 12294;
        arrn[12610 & -31230] = 7218 & -16378;
        arrarrn[9220 & 20560] = arrn;
        int[] arrn2 = new int[-30169 & 28827];
        arrn2[2688 & 16449] = 18630 & -32731;
        arrn2[8323 & 5121] = -32253 & 30991;
        arrn2[-19690 & 18435] = 146 & 1582;
        arrarrn[8705 & 20579] = arrn2;
        int[] arrn3 = new int[915 & -27581];
        arrn3[-16127 & 5330] = 1062 & 25094;
        arrn3[2225 & 8513] = 1085 & 9092;
        arrn3[2 & 14610] = -32733 & 8591;
        arrarrn[-14198 & 262] = arrn3;
        int[] arrn4 = new int[17171 & 4099];
        arrn4[-32366 & 15872] = 24587 & 1043;
        arrn4[8337 & -27575] = 3495 & 8259;
        arrn4[8995 & 26] = 12547 & 18535;
        arrarrn[9803 & -32605] = arrn4;
        int[] arrn5 = new int[4611 & -7897];
        arrn5[8648 & 2081] = -32613 & 23906;
        arrn5[-14841 & 6305] = 10530 & 4638;
        arrn5[1539 & 274] = 5123 & -32505;
        arrarrn[-7900 & 5638] = arrn5;
        int[] arrn6 = new int[-16361 & 8395];
        arrn6[8521 & 1078] = 546 & 1031;
        arrn6[24577 & -25343] = 25089 & 5;
        arrn6[-29690 & 8595] = -32733 & 266;
        arrarrn[-32689 & 16661] = arrn6;
        int[] arrn7 = new int[-32629 & 22103];
        arrn7[-12224 & 10256] = 1 & 13;
        arrn7[4613 & -32719] = 8465 & -31583;
        arrn7[-31994 & 8211] = 5035 & -30718;
        arrarrn[-22194 & 1175] = arrn7;
        Field_39192 = arrarrn;
        int[][] arrarrn2 = new int[143 & -12761][];
        int[] arrn8 = new int[16410 & -32670];
        arrn8[8400 & 17964] = -24512 & 23043;
        arrn8[20545 & -22765] = 20482 & 24;
        arrarrn2[-31531 & 288] = arrn8;
        int[] arrn9 = new int[3335 & -32670];
        arrn9[4160 & 19758] = 9221 & 128;
        arrn9[1 & 513] = 260 & 17573;
        arrarrn2[-23013 & 5] = arrn9;
        int[] arrn10 = new int[10866 & -15357];
        arrn10[14595 & -32640] = 324 & 3073;
        arrn10[1 & 2113] = 13609 & 153;
        arrarrn2[16386 & 1474] = arrn10;
        int[] arrn11 = new int[387 & -9150];
        arrn11[256 & 5127] = 512 & 17478;
        arrn11[-15351 & 10501] = 16660 & -24526;
        arrarrn2[6151 & 67] = arrn11;
        int[] arrn12 = new int[1058 & 29058];
        arrn12[96 & -8181] = -15952 & 581;
        arrn12[513 & 213] = 4502 & -32650;
        arrarrn2[8239 & -29676] = arrn12;
        int[] arrn13 = new int[16930 & -30718];
        arrn13[1593 & 2052] = 559 & -13173;
        arrn13[4993 & -16383] = 532 & 8291;
        arrarrn2[917 & 15] = arrn13;
        int[] arrn14 = new int[778 & 70];
        arrn14[16648 & -18431] = 29485 & 2191;
        arrn14[28673 & 329] = 20484 & 134;
        arrarrn2[8710 & 2439] = arrn14;
        Field_39189 = arrarrn2;
    }

    public void Method_39195(Class_1061 class_1061, float f, float f2, float f3, float f4, float f5, float f6) {
        int n;
        this.Method_39193(f, f2, f3, f4, f5, f6, class_1061);
        for (n = 16641 & 5840; n < this.Field_39190.length; ++n) {
            this.Field_39190[n].Method_31999(f6);
        }
        for (n = -24396 & 5121; n < this.Field_39188.length; ++n) {
            this.Field_39188[n].Method_31999(f6);
        }
    }
}

