/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_23485
extends Class_13481 {
    private static Class_23485 Field_23486 = new Class_23485();
    float[] Field_23487 = new float[17478 & 4868];
    float[][] Field_23488 = new float[-25461 & 62][68 & -15339];
    float[] Field_23489 = new float[-32698 & 1943];
    float[] Field_23490 = new float[2071 & 336];
    int Field_23491;

    private void Method_23492(float[] arrf, float[] arrf2) {
        arrf[11561 & -32620] = arrf2[4104 & 10882];
        arrf[24705 & 2057] = arrf2[-30687 & 1409];
        arrf[1046 & 24771] = arrf2[16642 & -32541];
        arrf[-32717 & 12807] = arrf2[-32373 & 16467];
    }

    private void Method_23493(float[] arrf, float[] arrf2, float[] arrf3, float[] arrf4) {
        this.Method_23502(this.Field_23487, arrf2, arrf3);
        this.Method_23502(arrf, this.Field_23487, arrf4);
        this.Method_23499(arrf);
        float f = (float)this.Method_23495(arrf2, arrf3);
        float f2 = (float)this.Method_23495(arrf, arrf3);
        float f3 = this.Method_23494(arrf[3716 & -32727], arrf[33 & 2625], arrf[2 & 16939], arrf3[4104 & 772] * f2, arrf3[16455 & 1065] * f2, arrf3[1283 & -16362] * f2);
        float f4 = this.Method_23494(arrf2[8236 & 4113], arrf2[16389 & 12307], arrf2[20995 & 130], arrf3[7588 & 8192] * f, arrf3[17673 & -17759] * f, arrf3[-29146 & 131] * f);
        float f5 = f3 / f4;
        float f6 = (float)this.Method_23495(arrf, arrf2);
        float f7 = this.Method_23494(arrf[2608 & 20675], arrf[2057 & 55], arrf[16770 & -20477], arrf2[305 & -18932] * f6, arrf2[3721 & 24581] * f6, arrf2[-16062 & 4255] * f6);
        float f8 = this.Method_23494(arrf3[12608 & 1156], arrf3[25347 & -32747], arrf3[13898 & 262], arrf2[16 & 2696] * f, arrf2[12417 & 1889] * f, arrf2[-9010 & 770] * f);
        float f9 = f7 / f8;
        arrf[1347 & -22505] = arrf2[327 & -6141] * f5 + arrf3[-31593 & 28675] * f9;
    }

    private float Method_23494(float f, float f2, float f3, float f4, float f5, float f6) {
        return this.Method_23498(f - f4, f2 - f5, f3 - f6);
    }

    private double Method_23495(float[] arrf, float[] arrf2) {
        return (double)arrf[16912 & 3114] * (double)arrf2[192 & -28404] + (double)arrf[515 & -25343] * (double)arrf2[1281 & 521] + (double)arrf[5655 & -24574] * (double)arrf2[4159 & 18434];
    }

    private void Method_23496() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public static Class_13481 Method_23497() {
        Field_23486.Method_23501();
        return Field_23486;
    }

    private float Method_23498(float f, float f2, float f3) {
        return (float)Math.sqrt(f * f + f2 * f2 + f3 * f3);
    }

    private void Method_23499(float[] arrf) {
        float f = Class_13337.Method_13388(arrf[6305 & 16452] * arrf[-30464 & 12362] + arrf[20485 & 2249] * arrf[135 & 1033] + arrf[-32090 & 29706] * arrf[-28045 & 10246]);
        if (f == 0.0f) {
            f = 1.0f;
        }
        float[] arrf2 = arrf;
        int n = 26124 & 2098;
        arrf2[n] = arrf2[n] / f;
        float[] arrf3 = arrf;
        int n2 = -22143 & 1049;
        arrf3[n2] = arrf3[n2] / f;
        float[] arrf4 = arrf;
        int n3 = -10206 & 323;
        arrf4[n3] = arrf4[n3] / f;
    }

    private void Method_23500(float[] arrf, float f, float f2, float f3, float f4) {
        float f5 = (float)Math.sqrt(f * f + f2 * f2 + f3 * f3);
        arrf[516 & 3104] = f / f5;
        arrf[2347 & 17925] = f2 / f5;
        arrf[4387 & 2630] = f3 / f5;
        arrf[12811 & 2343] = f4 / f5;
    }

    public void Method_23501() {
        float[] arrf = this.\u0000strictfp;
        float[] arrf2 = this.\u0000= final;
        float[] arrf3 = this.\u0000, `;
        System.arraycopy(Class_12440.Field_12505, 40 & 6226, arrf, 423 & -5120, 528 & 16434);
        System.arraycopy(Class_12440.Field_12517, 3334 & 665, arrf2, 10784 & 1416, 18 & -16296);
        Class_21899.Method_21902(arrf3, arrf2, arrf);
        this.Method_23500(this.\u0000strictfp[9216 & -30207], arrf3[16931 & 8395] - arrf3[1186 & 8788], arrf3[-1585 & 551] - arrf3[3276 & -20219], arrf3[15 & -11685] - arrf3[-18280 & 1610], arrf3[17567 & 8719] - arrf3[16909 & 4380]);
        this.Method_23500(this.\u0000strictfp[5173 & 1], arrf3[-6129 & 1091] + arrf3[-24432 & 6212], arrf3[263 & 17927] + arrf3[16389 & 3692], arrf3[16395 & -19061] + arrf3[-21448 & 331], arrf3[575 & 8271] + arrf3[269 & 12428]);
        this.Method_23500(this.\u0000strictfp[330 & -30557], arrf3[8199 & 20811] + arrf3[-32187 & 1083], arrf3[1543 & -32441] + arrf3[-31979 & 16389], arrf3[139 & -23013] + arrf3[4617 & -14323], arrf3[655 & -25585] + arrf3[24591 & 1037]);
        this.Method_23500(this.\u0000strictfp[-30577 & 20771], arrf3[139 & 15363] - arrf3[321 & 4097], arrf3[4375 & 167] - arrf3[37 & 3909], arrf3[1067 & 779] - arrf3[269 & -24375], arrf3[16527 & -31697] - arrf3[-32499 & 12477]);
        this.Method_23500(this.\u0000strictfp[16389 & -32244], arrf3[5779 & 18435] - arrf3[16930 & 6302], arrf3[-16297 & 11527] - arrf3[-28665 & 2062], arrf3[11 & -13937] - arrf3[-28309 & 2202], arrf3[8303 & -12257] - arrf3[9358 & -16305]);
        this.Method_23500(this.\u0000strictfp[45 & -22825], arrf3[-32717 & 16779] + arrf3[4098 & 16898], arrf3[-31705 & 24583] + arrf3[-27625 & 16398], arrf3[-30197 & 5387] + arrf3[26 & 7727], arrf3[9743 & 16447] + arrf3[10318 & 16558]);
        float[] arrf4 = Class_12440.Field_12488;
        float f = (float)this.Method_23495(this.\u0000strictfp[-26559 & 25732], arrf4);
        float f2 = (float)this.Method_23495(this.\u0000strictfp[-28665 & 2177], arrf4);
        float f3 = (float)this.Method_23495(this.\u0000strictfp[723 & 18434], arrf4);
        float f4 = (float)this.Method_23495(this.\u0000strictfp[9255 & -28605], arrf4);
        float f5 = (float)this.Method_23495(this.\u0000strictfp[-32626 & 17220], arrf4);
        float f6 = (float)this.Method_23495(this.\u0000strictfp[-26587 & 9477], arrf4);
        this.Field_23491 = 14856 & 16595;
        if (f >= 0.0f) {
            int n = this.Field_23491;
            this.Field_23491 = n + (33 & 11);
            this.Method_23492(this.Field_23488[n], this.\u0000strictfp[9492 & 4643]);
            if (f > 0.0f) {
                if (f3 < 0.0f) {
                    int n2 = this.Field_23491;
                    this.Field_23491 = n2 + (16657 & 653);
                    this.Method_23493(this.Field_23488[n2], this.\u0000strictfp[968 & 6151], this.\u0000strictfp[12306 & 1034], arrf4);
                }
                if (f4 < 0.0f) {
                    int n3 = this.Field_23491;
                    this.Field_23491 = n3 + (-8191 & 4581);
                    this.Method_23493(this.Field_23488[n3], this.\u0000strictfp[1696 & 2050], this.\u0000strictfp[9219 & 21251], arrf4);
                }
                if (f5 < 0.0f) {
                    int n4 = this.Field_23491;
                    this.Field_23491 = n4 + (-16219 & 2321);
                    this.Method_23493(this.Field_23488[n4], this.\u0000strictfp[16418 & 9040], this.\u0000strictfp[8590 & -16300], arrf4);
                }
                if (f6 < 0.0f) {
                    int n5 = this.Field_23491;
                    this.Field_23491 = n5 + (-14191 & 12321);
                    this.Method_23493(this.Field_23488[n5], this.\u0000strictfp[8744 & -32766], this.\u0000strictfp[2773 & 1029], arrf4);
                }
            }
        }
        if (f2 >= 0.0f) {
            int n = this.Field_23491;
            this.Field_23491 = n + (2065 & 17483);
            this.Method_23492(this.Field_23488[n], this.\u0000strictfp[-32735 & 5073]);
            if (f2 > 0.0f) {
                if (f3 < 0.0f) {
                    int n6 = this.Field_23491;
                    this.Field_23491 = n6 + (-30207 & 263);
                    this.Method_23493(this.Field_23488[n6], this.\u0000strictfp[39 & -3327], this.\u0000strictfp[4163 & -15594], arrf4);
                }
                if (f4 < 0.0f) {
                    int n7 = this.Field_23491;
                    this.Field_23491 = n7 + (5121 & 611);
                    this.Method_23493(this.Field_23488[n7], this.\u0000strictfp[16897 & 3075], this.\u0000strictfp[6419 & 1607], arrf4);
                }
                if (f5 < 0.0f) {
                    int n8 = this.Field_23491;
                    this.Field_23491 = n8 + (20501 & 2219);
                    this.Method_23493(this.Field_23488[n8], this.\u0000strictfp[1 & 1797], this.\u0000strictfp[30853 & 564], arrf4);
                }
                if (f6 < 0.0f) {
                    int n9 = this.Field_23491;
                    this.Field_23491 = n9 + (-31967 & 1167);
                    this.Method_23493(this.Field_23488[n9], this.\u0000strictfp[-14327 & 4385], this.\u0000strictfp[-19161 & 16901], arrf4);
                }
            }
        }
        if (f3 >= 0.0f) {
            int n = this.Field_23491;
            this.Field_23491 = n + (265 & 7847);
            this.Method_23492(this.Field_23488[n], this.\u0000strictfp[8194 & 831]);
            if (f3 > 0.0f) {
                if (f < 0.0f) {
                    int n10 = this.Field_23491;
                    this.Field_23491 = n10 + (537 & 257);
                    this.Method_23493(this.Field_23488[n10], this.\u0000strictfp[12803 & -29310], this.\u0000strictfp[18445 & 4128], arrf4);
                }
                if (f2 < 0.0f) {
                    int n11 = this.Field_23491;
                    this.Field_23491 = n11 + (203 & -12251);
                    this.Method_23493(this.Field_23488[n11], this.\u0000strictfp[8770 & 20506], this.\u0000strictfp[8741 & -10095], arrf4);
                }
                if (f5 < 0.0f) {
                    int n12 = this.Field_23491;
                    this.Field_23491 = n12 + (1793 & -22435);
                    this.Method_23493(this.Field_23488[n12], this.\u0000strictfp[2706 & 4390], this.\u0000strictfp[8716 & 132], arrf4);
                }
                if (f6 < 0.0f) {
                    int n13 = this.Field_23491;
                    this.Field_23491 = n13 + (-15359 & 2407);
                    this.Method_23493(this.Field_23488[n13], this.\u0000strictfp[5266 & 25090], this.\u0000strictfp[7 & 20613], arrf4);
                }
            }
        }
        if (f4 >= 0.0f) {
            int n = this.Field_23491;
            this.Field_23491 = n + (329 & 8369);
            this.Method_23492(this.Field_23488[n], this.\u0000strictfp[1043 & -18425]);
            if (f4 > 0.0f) {
                if (f < 0.0f) {
                    int n14 = this.Field_23491;
                    this.Field_23491 = n14 + (12289 & 18695);
                    this.Method_23493(this.Field_23488[n14], this.\u0000strictfp[16483 & -20473], this.\u0000strictfp[-28352 & 10256], arrf4);
                }
                if (f2 < 0.0f) {
                    int n15 = this.Field_23491;
                    this.Field_23491 = n15 + (259 & 21013);
                    this.Method_23493(this.Field_23488[n15], this.\u0000strictfp[387 & 9787], this.\u0000strictfp[841 & 6275], arrf4);
                }
                if (f5 < 0.0f) {
                    int n16 = this.Field_23491;
                    this.Field_23491 = n16 + (6289 & -15103);
                    this.Method_23493(this.Field_23488[n16], this.\u0000strictfp[131 & 12315], this.\u0000strictfp[-28916 & 198], arrf4);
                }
                if (f6 < 0.0f) {
                    int n17 = this.Field_23491;
                    this.Field_23491 = n17 + (2579 & 13413);
                    this.Method_23493(this.Field_23488[n17], this.\u0000strictfp[443 & -22525], this.\u0000strictfp[17599 & 5], arrf4);
                }
            }
        }
        if (f5 >= 0.0f) {
            int n = this.Field_23491;
            this.Field_23491 = n + (2053 & -24055);
            this.Method_23492(this.Field_23488[n], this.\u0000strictfp[36 & -20154]);
            if (f5 > 0.0f) {
                if (f < 0.0f) {
                    int n18 = this.Field_23491;
                    this.Field_23491 = n18 + (257 & 1029);
                    this.Method_23493(this.Field_23488[n18], this.\u0000strictfp[-30196 & 16646], this.\u0000strictfp[26624 & 5312], arrf4);
                }
                if (f2 < 0.0f) {
                    int n19 = this.Field_23491;
                    this.Field_23491 = n19 + (5475 & 8321);
                    this.Method_23493(this.Field_23488[n19], this.\u0000strictfp[4212 & 16518], this.\u0000strictfp[8779 & 2469], arrf4);
                }
                if (f3 < 0.0f) {
                    int n20 = this.Field_23491;
                    this.Field_23491 = n20 + (-32719 & 1231);
                    this.Method_23493(this.Field_23488[n20], this.\u0000strictfp[8717 & 2452], this.\u0000strictfp[16898 & 9482], arrf4);
                }
                if (f4 < 0.0f) {
                    int n21 = this.Field_23491;
                    this.Field_23491 = n21 + (-29503 & 3);
                    this.Method_23493(this.Field_23488[n21], this.\u0000strictfp[3588 & 412], this.\u0000strictfp[2095 & 16899], arrf4);
                }
            }
        }
        if (f6 >= 0.0f) {
            int n = this.Field_23491;
            this.Field_23491 = n + (8225 & 4633);
            this.Method_23492(this.Field_23488[n], this.\u0000strictfp[5 & 10821]);
            if (f6 > 0.0f) {
                if (f < 0.0f) {
                    int n22 = this.Field_23491;
                    this.Field_23491 = n22 + (4147 & 8705);
                    this.Method_23493(this.Field_23488[n22], this.\u0000strictfp[37 & 839], this.\u0000strictfp[-30687 & 16474], arrf4);
                }
                if (f2 < 0.0f) {
                    int n23 = this.Field_23491;
                    this.Field_23491 = n23 + (-28283 & 11779);
                    this.Method_23493(this.Field_23488[n23], this.\u0000strictfp[-5787 & 7], this.\u0000strictfp[321 & 2737], arrf4);
                }
                if (f3 < 0.0f) {
                    int n24 = this.Field_23491;
                    this.Field_23491 = n24 + (-31099 & 8315);
                    this.Method_23493(this.Field_23488[n24], this.\u0000strictfp[-32091 & 23], this.\u0000strictfp[34 & -27630], arrf4);
                }
                if (f4 < 0.0f) {
                    int n25 = this.Field_23491;
                    this.Field_23491 = n25 + (1793 & 28837);
                    this.Method_23493(this.Field_23488[n25], this.\u0000strictfp[2053 & -23547], this.\u0000strictfp[1403 & -10237], arrf4);
                }
            }
        }
    }

    private void Method_23502(float[] arrf, float[] arrf2, float[] arrf3) {
        arrf[16691 & -32700] = arrf2[10241 & -31471] * arrf3[4722 & 24707] - arrf2[386 & 8242] * arrf3[3137 & 16427];
        arrf[2049 & 16835] = arrf2[34 & 770] * arrf3[12323 & -31600] - arrf2[-30720 & 856] * arrf3[17619 & 11010];
        arrf[6507 & -7678] = arrf2[23072 & 1035] * arrf3[8261 & 1035] - arrf2[4115 & 17029] * arrf3[256 & 20604];
    }
}

