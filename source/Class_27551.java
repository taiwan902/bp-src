/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  \u0000" & ? 5 catch 7 { protected while final 3 ] static , ! case byte import static , null 2 3 ^ ` + protected import goto * this char private float 7 ` # boolean 6 byte % public if + super if void abstract super { this while synchronized byte 0 do void true if continue
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.Callable;

public class Class_27551 {
    private Class_16348[] Field_27552 = new Class_16348[896 & -14144];
    private Random Field_27553 = new Random();
    private static final Class_2080 Field_27554 = new Class_2080(Class_27551.Method_27561("\u2a00\u2a00\u2a00\u2a01\u2a05\u2a05\u2a05\u2a04\u2a09\u2a09\u2a09\u2a09\u2a0c\u2a0c\u2a0d\u2a0d\u2a11\u2a10\u2a10\u2a10\u2a14\u2a15\u2a15\u2a14\u2a18\u2a18\u2a19\u2a19\u2a1c\u2a1d\u2a1d"));
    private HashMap Field_27555 = new HashMap();
    ArrayList Field_27556 = new ArrayList();
    protected Class_283 Field_27557;
    private Class_34695 Field_27558;
    private ArrayList Field_27559 = new ArrayList();
    private Class_45674[][] Field_27560 = new Class_45674[277 & -14682][];

    private static String Method_27561(String string) {
        int n = 10131;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_27551.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_27562(int n) {
        for (int i = 18961 & 12; i < (1031 & 20994); ++i) {
            this.Method_27568(this.Field_27560[n][i]);
        }
    }

    public void Method_27563() {
        for (int i = 12288 & 267; i < (6167 & 17036); ++i) {
            this.Method_27562(i);
        }
        ArrayList<Class_47353> arrayList = new ArrayList<Class_47353>();
        for (Object e : this.Field_27559) {
            Class_47353 class_47353 = (Class_47353)e;
            class_47353.Method_47360();
            if (!class_47353.\u0000= float) continue;
            arrayList.add(class_47353);
        }
        this.Field_27559.removeAll(arrayList);
    }

    public void Method_27564(Class_42218 class_42218) {
        if (class_42218 != null && (!(class_42218 instanceof Class_45974) || Class_19426.Method_19468())) {
            int n = class_42218.Method_42256();
            int n2 = class_42218.Method_42248() != 1.0f ? 772 & -26552 : 16835 & 1;
            int n3 = (int)Class_18.Field_89.Field_84.Field_39732.Field_8881.\u0000strictfp();
            if (this.Field_27560[n][n2].Method_45683() >= (20613 & -32735) + n3) {
                this.Field_27560[n][n2].Method_45680();
            }
            this.Field_27560[n][n2].Method_45685(class_42218);
            class_42218.Field_42226 = n;
            class_42218.Field_42230 = n2;
        }
    }

    public void Method_27565(int n, Class_16348 class_16348) {
        this.Field_27555.put(n, class_16348);
        this.Field_27552[n] = class_16348;
    }

    public void Method_27566(Class_283 class_283) {
        this.Field_27557 = class_283;
        for (int i = 10 & 2097; i < (916 & 24580); ++i) {
            for (int j = 35 & 2184; j < (18 & -16890); ++j) {
                this.Field_27560[i][j].Method_45687();
            }
        }
        this.Field_27559.clear();
    }

    public void Method_27567(Class_42218 class_42218) {
        this.Method_27571(class_42218, -32256 & 17508, 359 & 17921);
    }

    private void Method_27568(Class_45674 class_45674) {
        int n;
        ArrayList arrayList = this.Field_27556;
        arrayList.clear();
        for (n = 288 & 8340; n < class_45674.Method_45683(); ++n) {
            Class_42218 class_42218 = (Class_42218)class_45674.Method_45686(n);
            this.Method_27573(class_42218);
            if (class_42218.\u0000= float) continue;
            if (class_42218.Field_42236 == null) {
                arrayList.add(class_42218);
                continue;
            }
            class_42218.Field_42236.Method_45685(class_42218);
            class_42218.Field_42236 = null;
        }
        class_45674.Method_45687();
        for (n = 29744 & -30066; n < arrayList.size(); ++n) {
            class_45674.Method_45685(arrayList.get(n));
        }
    }

    private void Method_27569() {
        this.Method_27565(Class_40274.Field_40288.Method_40336(), new Class_29562());
        this.Method_27565(Class_40274.Field_40280.Method_40336(), new Class_19772());
        this.Method_27565(Class_40274.Field_40313.Method_40336(), new Class_26982());
        this.Method_27565(Class_40274.Field_40277.Method_40336(), new Class_42344());
        this.Method_27565(Class_40274.Field_40282.Method_40336(), new Class_41470());
        this.Method_27565(Class_40274.Field_40281.Method_40336(), new Class_39996());
        this.Method_27565(Class_40274.Field_40287.Method_40336(), new Class_23734());
        this.Method_27565(Class_40274.Field_40319.Method_40336(), new Class_23622());
        this.Method_27565(Class_40274.Field_40320.Method_40336(), new Class_34200());
        this.Method_27565(Class_40274.Field_40283.Method_40336(), new Class_20502());
        this.Method_27565(Class_40274.Field_40279.Method_40336(), new Class_18173());
        this.Method_27565(Class_40274.Field_40314.Method_40336(), new Class_22689());
        this.Method_27565(Class_40274.Field_40310.Method_40336(), new Class_41398());
        this.Method_27565(Class_40274.Field_40316.Method_40336(), new Class_22803());
        this.Method_27565(Class_40274.Field_40291.Method_40336(), new Class_20454());
        this.Method_27565(Class_40274.Field_40323.Method_40336(), new Class_25654());
        this.Method_27565(Class_40274.Field_40322.Method_40336(), new Class_26650());
        this.Method_27565(Class_40274.Field_40289.Method_40336(), new Class_41137());
        this.Method_27565(Class_40274.Field_40306.Method_40336(), new Class_42731());
        this.Method_27565(Class_40274.Field_40302.Method_40336(), new Class_41376());
        this.Method_27565(Class_40274.Field_40309.Method_40336(), new Class_23734());
        this.Method_27565(Class_40274.Field_40295.Method_40336(), new Class_28233());
        this.Method_27565(Class_40274.Field_40307.Method_40336(), new Class_16503());
        this.Method_27565(Class_40274.Field_40275.Method_40336(), new Class_44009());
        this.Method_27565(Class_40274.Field_40318.Method_40336(), new Class_20582());
        this.Method_27565(Class_40274.Field_40294.Method_40336(), new Class_18391());
        this.Method_27565(Class_40274.Field_40303.Method_40336(), new Class_33116());
        this.Method_27565(Class_40274.Field_40304.Method_40336(), new Class_21195());
        this.Method_27565(Class_40274.Field_40297.Method_40336(), new Class_16662());
        this.Method_27565(Class_40274.Field_40298.Method_40336(), new Class_18004());
        this.Method_27565(Class_40274.Field_40317.Method_40336(), new Class_24682());
        this.Method_27565(Class_40274.Field_40312.Method_40336(), new Class_36721());
        this.Method_27565(Class_40274.Field_40278.Method_40336(), new Class_22043());
        this.Method_27565(Class_40274.Field_40284.Method_40336(), new Class_16559());
        this.Method_27565(Class_40274.Field_40290.Method_40336(), new Class_22650());
        this.Method_27565(Class_40274.Field_40315.Method_40336(), new Class_17236());
        this.Method_27565(Class_40274.Field_40311.Method_40336(), new Class_27918());
        this.Method_27565(Class_40274.Field_40286.Method_40336(), new Class_21462());
        this.Method_27565(Class_40274.Field_40321.Method_40336(), new Class_33830());
        this.Method_27565(Class_40274.Field_40296.Method_40336(), new Class_28132());
        this.Method_27565(Class_40274.Field_40285.Method_40336(), new Class_19834());
    }

    private void Method_27570() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private void Method_27571(Class_42218 class_42218, int n, int n2) {
        if (class_42218.Field_42230 == n) {
            class_42218.Field_42236 = this.Field_27560[class_42218.Field_42226][n2];
        }
    }

    public Class_27551(Class_283 class_283, Class_34695 class_34695) {
        this.Field_27557 = class_283;
        this.Field_27558 = class_34695;
        for (int i = -32758 & 644; i < (2572 & -16155); ++i) {
            this.Field_27560[i] = new Class_45674[10434 & 34];
            for (int j = 299 & 1604; j < (-30902 & 28679); ++j) {
                this.Field_27560[i][j] = new Class_45674();
            }
        }
        this.Method_27569();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void Method_27572(Class_4751 var1_1, Class_3436 var2_2) {
        block6 : {
            block5 : {
                if (!Class_14610.Field_14618.Method_13570() || !Class_14610.Field_14627.Method_13570()) break block5;
                var4_3 = var2_2.Method_3442();
                v0 = new Object[16898 & -32766];
                v0[10272 & -16316] = this.Field_27557;
                v0[-14395 & 25] = var1_1;
                Class_14610.Method_14674(var4_3, Class_14610.Field_14627, v0);
                v1 = new Object[66 & 18579];
                v1[14336 & 17938] = this.Field_27557;
                v1[-24535 & 4609] = var1_1;
                if (Class_14610.Method_14674(var4_3, Class_14610.Field_14627, v1)) ** GOTO lbl-1000
                v2 = new Object[-30457 & 4099];
                v2[30752 & 1152] = this.Field_27557;
                v2[-21439 & 159] = var1_1;
                v2[-32506 & 642] = this;
                if (!Class_14610.Method_14674(var4_3, Class_14610.Field_14618, v2)) {
                    v3 = -14331 & 1035;
                } else lbl-1000: // 2 sources:
                {
                    v3 = -29877 & 16416;
                }
                var3_5 = v3;
                break block6;
            }
            var3_5 = var2_2.Method_3442().Method_3373() != Class_3713.Field_3718 ? 4115 & 2113 : 4446 & 1;
        }
        if (var3_5 == 0) return;
        var2_2 = var2_2.Method_3442().Method_3333(var2_2, this.Field_27557, var1_1);
        var4_4 = 25093 & -32570;
        var5_6 = 17608 & 12548;
        while (var5_6 < var4_4) {
            for (var6_7 = 277 & 12392; var6_7 < var4_4; ++var6_7) {
                for (var7_8 = 7248 & 8322; var7_8 < var4_4; ++var7_8) {
                    var8_9 = (double)var1_1.\u0000= final() + ((double)var5_6 + 0.2926829268292683 * 1.7083333333333335) / (double)var4_4;
                    var10_10 = (double)var1_1.\u0000, `() + ((double)var6_7 + 0.671875 * 0.7441860465116279) / (double)var4_4;
                    var12_11 = (double)var1_1.\u0000strictfp() + ((double)var7_8 + 0.2786885245901639 * 1.7941176470588236) / (double)var4_4;
                    this.Method_27564(new Class_42883(this.Field_27557, var8_9, var10_10, var12_11, var8_9 - (double)var1_1.\u0000= final() - 0.2826086956521739 * 1.7692307692307694, var10_10 - (double)var1_1.\u0000, `() - 0.1402439024390244 * 3.5652173913043477, var12_11 - (double)var1_1.\u0000strictfp() - 2.5925925925925926 * 0.19285714285714287, var2_2).Method_42890(var1_1));
                }
            }
            ++var5_6;
        }
    }

    private void Method_27573(Class_42218 class_42218) {
        try {
            class_42218.Method_42246();
        }
        catch (Throwable throwable) {
            Class_13268 class_13268 = Class_13268.Method_13285(throwable, "Ticking Particle");
            Class_13220 class_13220 = class_13268.Method_13280("Particle being ticked");
            int n = class_42218.Method_42256();
            class_13220.Method_13232("Particle", new Class_17868(this, class_42218));
            class_13220.Method_13232("Particle Type", new Class_17959(this, n));
            throw new Class_1809(class_13268);
        }
    }

    public void Method_27574(Class_42218 class_42218) {
        this.Method_27571(class_42218, 16519 & 801, 21536 & 9088);
    }

    public void Method_27575(Class_1061 class_1061, float f) {
        float f2 = Class_41473.Method_41486();
        float f3 = Class_41473.Method_41485();
        float f4 = Class_41473.Method_41493();
        float f5 = Class_41473.Method_41490();
        float f6 = Class_41473.Method_41489();
        Class_42218.Field_42234 = class_1061.Field_1126 + (class_1061.Field_1130 - class_1061.Field_1126) * (double)f;
        Class_42218.Field_42232 = class_1061.Field_1102 + (class_1061.Method_1324() - class_1061.Field_1102) * (double)f;
        Class_42218.Field_42220 = class_1061.Field_1125 + (class_1061.Field_1106 - class_1061.Field_1125) * (double)f;
        Class_16867.Method_16947();
        Class_16867.Method_16951(771 & 922, 25443 & -30949);
        Class_16867.Method_16967(-30195 & 982, 0.2857143f * 0.01372549f);
        for (int i = 346 & 4097; i < (2439 & -32685); ++i) {
            int n = i;
            for (int j = 17232 & -28664; j < (6662 & 25627); ++j) {
                if (this.Field_27560[n][j].\u0000strictfp()) continue;
                switch (j) {
                    case 0: {
                        Class_16867.Method_16930((2312 & 20992) != 0);
                        break;
                    }
                    case 1: {
                        Class_16867.Method_16930((257 & 30895) != 0);
                    }
                }
                switch (n) {
                    default: {
                        this.Field_27558.Method_34707(Field_27554);
                        break;
                    }
                    case 1: {
                        this.Field_27558.Method_34707(Class_24069.Field_24084);
                    }
                }
                Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 1.0f);
                Class_7644 class_7644 = Class_7644.Method_7649();
                Class_22385 class_22385 = class_7644.Method_7648();
                class_22385.Method_22417(-29689 & 391, Class_29585.Field_29605);
                for (int k = -28640 & 25472; k < this.Field_27560[n][j].Method_45683(); ++k) {
                    Class_42218 class_42218 = (Class_42218)this.Field_27560[n][j].Method_45686(k);
                    try {
                        class_42218.Method_42244(class_22385, class_1061, f, f2, f6, f3, f4, f5);
                        continue;
                    }
                    catch (Throwable throwable) {
                        Class_13268 class_13268 = Class_13268.Method_13285(throwable, "Rendering Particle");
                        Class_13220 class_13220 = class_13268.Method_13280("Particle being rendered");
                        class_13220.Method_13232("Particle", new Class_7032(this, class_42218));
                        class_13220.Method_13232("Particle Type", new Class_8713(this, n));
                        throw new Class_1809(class_13268);
                    }
                }
                class_7644.Method_7647();
            }
        }
        Class_16867.Method_16930((745 & 17411) != 0);
        Class_16867.Method_16952();
        Class_16867.Method_16967(25140 & 517, 3.75f * 0.026666667f);
    }

    public void Method_27576(Class_4751 class_4751, Class_4595 class_4595) {
        Class_3436 class_3436 = this.Field_27557.Method_375(class_4751);
        Class_3238 class_3238 = class_3436.Method_3442();
        if (class_3238.Method_3316() != (-1 & -1)) {
            int n = class_4751.\u0000= final();
            int n2 = class_4751.\u0000, `();
            int n3 = class_4751.\u0000strictfp();
            float f = 0.089655176f * 1.1153846f;
            double d = (double)n + this.Field_27553.nextDouble() * (class_3238.Method_3379() - class_3238.Method_3352() - (double)(f * 2.0f)) + (double)f + class_3238.Method_3352();
            double d2 = (double)n2 + this.Field_27553.nextDouble() * (class_3238.Method_3337() - class_3238.Method_3324() - (double)(f * 2.0f)) + (double)f + class_3238.Method_3324();
            double d3 = (double)n3 + this.Field_27553.nextDouble() * (class_3238.Method_3291() - class_3238.Method_3315() - (double)(f * 2.0f)) + (double)f + class_3238.Method_3315();
            if (class_4595 == Class_4595.Field_4615) {
                d2 = (double)n2 + class_3238.Method_3324() - (double)f;
            }
            if (class_4595 == Class_4595.Field_4601) {
                d2 = (double)n2 + class_3238.Method_3337() + (double)f;
            }
            if (class_4595 == Class_4595.Field_4598) {
                d3 = (double)n3 + class_3238.Method_3315() - (double)f;
            }
            if (class_4595 == Class_4595.Field_4613) {
                d3 = (double)n3 + class_3238.Method_3291() + (double)f;
            }
            if (class_4595 == Class_4595.Field_4602) {
                d = (double)n + class_3238.Method_3352() - (double)f;
            }
            if (class_4595 == Class_4595.Field_4603) {
                d = (double)n + class_3238.Method_3379() + (double)f;
            }
            this.Method_27564(new Class_42883(this.Field_27557, d, d2, d3, 0.0, 0.0, 0.0, class_3436).Method_42890(class_4751).\u0000, `(0.24931507f * 0.8021978f).Method_42255(2.5333333f * 0.23684211f));
        }
    }

    public Class_42218 Method_27577(int n, double d, double d2, double d3, double d4, double d5, double d6, int ... arrn) {
        Class_42218 class_42218;
        Class_16348 class_16348 = n >= 0 && n < this.Field_27552.length ? this.Field_27552[n] : (Class_16348)this.Field_27555.get(n);
        if (class_16348 != null && (class_42218 = class_16348.Method_16349(n, this.Field_27557, d, d2, d3, d4, d5, d6, arrn)) != null) {
            this.Method_27564(class_42218);
            return class_42218;
        }
        return null;
    }

    public void Method_27578(Class_1061 class_1061, float f) {
        float f2 = 0.015343553f * 1.1375f;
        float f3 = Class_13337.Method_13350(class_1061.Field_1079 * (0.0026299483f * 6.6363635f));
        float f4 = Class_13337.Method_13370(class_1061.Field_1079 * (0.009020803f * 1.9347826f));
        float f5 = -f4 * Class_13337.Method_13370(class_1061.Field_1093 * (0.71014494f * 0.024577085f));
        float f6 = f3 * Class_13337.Method_13370(class_1061.Field_1093 * (1.6034483f * 0.010884849f));
        float f7 = Class_13337.Method_13350(class_1061.Field_1093 * (0.020362174f * 0.85714287f));
        for (int i = 28800 & -31462; i < (18506 & -19434); ++i) {
            Class_45674 class_45674 = this.Field_27560[2547 & 8199][i];
            if (class_45674.\u0000strictfp()) continue;
            Class_7644 class_7644 = Class_7644.Method_7649();
            Class_22385 class_22385 = class_7644.Method_7648();
            for (int j = 6284 & 16931; j < class_45674.Method_45683(); ++j) {
                Class_42218 class_42218 = (Class_42218)class_45674.Method_45686(j);
                class_42218.Method_42244(class_22385, class_1061, f, f3, f7, f4, f5, f6);
            }
        }
    }

    public void Method_27579(Class_1061 class_1061, Class_40274 class_40274) {
        this.Field_27559.add(new Class_47353(this.Field_27557, class_1061, class_40274));
    }

    public String Method_27580() {
        int n = 4352 & 1568;
        for (int i = 2 & -16799; i < (518 & -15084); ++i) {
            for (int j = 160 & 25365; j < (7 & -22518); ++j) {
                n += this.Field_27560[i][j].Method_45683();
            }
        }
        return "" + n;
    }
}

