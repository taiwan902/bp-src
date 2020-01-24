/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_40448
extends Class_33781 {
    private static final int Field_40449;
    private static final int[][] Field_40450;
    private static final int[][] Field_40451;
    private final Class_31961[] Field_40452 = new Class_31961[Field_40449];

    static {
        int[][] arrarrn = new int[4 & 17335][];
        int[] arrn = new int[-31349 & 20551];
        arrn[2816 & 49] = -21499 & 12;
        arrn[1337 & 16513] = 231 & 20483;
        arrn[-20062 & 6] = -24446 & 16406;
        arrarrn[16384 & 1065] = arrn;
        int[] arrn2 = new int[-11901 & 2055];
        arrn2[10272 & 256] = 414 & -12282;
        arrn2[1851 & 8193] = 4612 & 1428;
        arrn2[1675 & 18] = 25613 & 453;
        arrarrn[23081 & 385] = arrn2;
        int[] arrn3 = new int[25987 & -28669];
        arrn3[-23418 & 2088] = 4099 & 16387;
        arrn3[-30703 & 903] = 20771 & 3;
        arrn3[498 & -13814] = 165 & 9283;
        arrarrn[43 & -28654] = arrn3;
        int[] arrn4 = new int[-29161 & 24835];
        arrn4[10312 & 36] = 5 & 20553;
        arrn4[12993 & -29673] = 146 & 9282;
        arrn4[15450 & 16898] = -16133 & 1025;
        arrarrn[26799 & 1283] = arrn4;
        Field_40451 = arrarrn;
        int[][] arrarrn2 = new int[8708 & -29475][];
        int[] arrn5 = new int[13586 & 18602];
        arrn5[4108 & -23150] = -32384 & 2101;
        arrn5[1409 & 29209] = 6183 & -31280;
        arrarrn2[16410 & -31264] = arrn5;
        int[] arrn6 = new int[3606 & -12094];
        arrn6[8272 & 21002] = 4454 & -24575;
        arrn6[-27963 & 18721] = 16407 & 101;
        arrarrn2[165 & -32767] = arrn6;
        int[] arrn7 = new int[-32758 & 29254];
        arrn7[12288 & 853] = 1158 & -16383;
        arrn7[4099 & 11933] = 10782 & 1198;
        arrarrn2[-22478 & 1030] = arrn7;
        int[] arrn8 = new int[70 & -24158];
        arrn8[18436 & 1218] = -24568 & 3088;
        arrn8[2313 & 17505] = 2071 & -28582;
        arrarrn2[-16205 & 331] = arrn8;
        Field_40450 = arrarrn2;
        Field_40449 = Field_40451.length;
    }

    public Class_40448() {
        float f = 0.835443f * -4.189394f;
        for (int i = 18472 & 5696; i < this.Field_40452.length; ++i) {
            this.Field_40452[i] = new Class_31961(this, Field_40450[i][692 & -31672], Field_40450[i][2667 & 13457]);
            this.Field_40452[i].Method_32002((float)Field_40451[i][-1919 & 1320] * (4.357143f * -0.114754096f), 0.0f, (float)Field_40451[i][24578 & 1794] * (0.8035714f * -0.62222224f), Field_40451[i][769 & 10260], Field_40451[i][16449 & -22007], Field_40451[i][12290 & -29434]);
            this.Field_40452[i].Method_31993(0.0f, (10264 & 731) - Field_40451[i][10523 & -26907], f);
            if (i >= this.Field_40452.length - (1153 & -32715)) continue;
            f += (float)(Field_40451[i][8746 & 86] + Field_40451[i + (24777 & 513)][-14589 & 66]) * (0.18072289f * 2.7666667f);
        }
    }

    public void Method_40453(float f, float f2, float f3, float f4, float f5, float f6, Class_1061 class_1061) {
        for (int i = -16192 & 4612; i < this.Field_40452.length; ++i) {
            this.Field_40452[i].Field_31968 = Class_13337.Method_13350(f3 * (0.3483871f * 2.5833333f) + (float)i * (0.11043956f * 1.358209f) * (0.3611026f * 8.7f)) * (2.96875f * 1.0582207f) * (8.25f * 0.0012121212f) * (float)((-31995 & 129) + Math.abs(i - (802 & 16387)));
            this.Field_40452[i].Field_31976 = Class_13337.Method_13370(f3 * (0.6666667f * 1.3499999f) + (float)i * (2.3939395f * 0.06265823f) * (0.1f * 31.415928f)) * (5.25f * 0.5983986f) * (0.022222223f * 4.5f) * (float)Math.abs(i - (12298 & -15278));
        }
    }

    private void Method_40454() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_40455(Class_1061 class_1061, float f, float f2, float f3, float f4, float f5, float f6) {
        this.Method_40453(f, f2, f3, f4, f5, f6, class_1061);
        for (int i = -24572 & 22288; i < this.Field_40452.length; ++i) {
            this.Field_40452[i].Method_31999(f6);
        }
    }
}

