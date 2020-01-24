/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;
import java.util.UUID;

public class Class_43334
extends Class_42629
implements Class_7434,
Class_31502 {
    Class_20407 Field_43335;
    private int Field_43336;
    private boolean Field_43337;
    private int Field_43338;
    private boolean Field_43339;
    private int Field_43340;
    private Class_14517 Field_43341;
    private String Field_43342;
    private Class_43634 Field_43343 = new Class_43634("Items", (24136 & -24157) != 0, 76 & 29320);
    private Class_626 Field_43344;
    private int Field_43345;
    private boolean Field_43346;
    private int Field_43347;
    private static final Class_26653[][][][] Field_43348;
    private boolean Field_43349;
    private boolean Field_43350;
    private boolean Field_43351;

    public Class_14517 Method_43352(Class_626 class_626) {
        if (this.Field_43341 == null) {
            this.Method_43362();
        }
        return this.Field_43341;
    }

    public void Method_43353(Class_27363 class_27363) {
        if (!this.\u0000strictfp.Field_306 && !this.\u0000= float) {
            Class_44826 class_44826 = new Class_44826(this.\u0000strictfp);
            class_44826.\u0000, `(this.\u0000= package, this.\u0000, for(), this.\u0000= switch, this.\u0000= ?, this.\u0000= float);
            class_44826.\u0000strictfp(this.\u0000strictfp.Method_364(new Class_4751(class_44826)), (Class_26405)null);
            class_44826.\u0000= final(this.\u0000= ,());
            if (this.\u0000strictfp()) {
                class_44826.\u0000= final(this.\u0000= int());
                class_44826.\u0000= switch(this.\u0000= catch());
            }
            this.\u0000strictfp.Method_350(class_44826);
            this.\u0000break();
        }
    }

    public void Method_43354(Class_32797 class_32797) {
        if (this.Field_43335 != null) {
            Class_1061 class_1061 = class_32797.Method_32856();
            if (class_1061 != null) {
                if (class_1061 instanceof Class_626) {
                    this.Field_43335.Method_20450(class_1061.Method_1202(), -1 & -2);
                } else if (class_1061 instanceof Class_32423) {
                    this.Field_43335.Method_20422();
                }
            } else {
                Class_626 class_626 = this.\u0000strictfp.Method_469(this, 12.571428571428571 * 1.2727272727272727);
                if (class_626 != null) {
                    this.Field_43335.Method_20422();
                }
            }
        }
        super.\u0000strictfp(class_32797);
    }

    public int Method_43355() {
        return Math.max(this.\u0000strictfp.Method_32710(2192 & 30) % (4109 & 16901), 3714 & 368);
    }

    protected void Method_43356() {
        super.Method_42639();
        this.\u0000strictfp.Method_32719(20822 & 3088, -16128 & 570);
    }

    public void Method_43357(Class_1699 class_1699) {
        Class_1674 class_1674;
        super.Method_42650(class_1699);
        this.Method_43382(class_1699.Method_1738("Profession"));
        this.Field_43347 = class_1699.Method_1738("Riches");
        this.Field_43345 = class_1699.Method_1738("Career");
        this.Field_43340 = class_1699.Method_1738("CareerLevel");
        this.Field_43346 = class_1699.Method_1733("Willing");
        if (class_1699.Method_1715("Offers", 2442 & 1550)) {
            class_1674 = class_1699.Method_1703("Offers");
            this.Field_43341 = new Class_14517((Class_1699)class_1674);
        }
        class_1674 = class_1699.Method_1735("Inventory", 1210 & 24842);
        for (int i = 816 & 10432; i < ((Class_1758)class_1674).Method_1772(); ++i) {
            Class_23823 class_23823 = Class_23823.Method_23840(((Class_1758)class_1674).Method_1768(i));
            if (class_23823 == null) continue;
            this.Field_43343.Method_43650(class_23823);
        }
        this.\u0000= `((-10703 & 2313) != 0);
        this.Method_43395();
    }

    public boolean Method_43358() {
        return (2308 & 17418) != 0;
    }

    private void Method_43359(Class_40274 class_40274) {
        for (int i = 10250 & 4609; i < (3629 & 133); ++i) {
            double d = this.\u0000strictfp.nextGaussian() * (4.5 * 0.0044444444444444444);
            double d2 = this.\u0000strictfp.nextGaussian() * (0.48314606741573035 * 0.0413953488372093);
            double d3 = this.\u0000strictfp.nextGaussian() * (0.007246376811594204 * 2.76);
            this.\u0000strictfp.Method_407(class_40274, this.\u0000= package + (double)(this.\u0000strictfp.nextFloat() * this.\u0000= int() * 2.0f) - (double)this.\u0000= int(), this.\u0000, for() + 1.0 + (double)(this.\u0000strictfp.nextFloat() * this.\u0000= switch()), this.\u0000= switch + (double)(this.\u0000strictfp.nextFloat() * this.\u0000= int() * 2.0f) - (double)this.\u0000= int(), d, d2, d3, new int[17701 & -32184]);
        }
    }

    protected void Method_43360() {
        if (this.Method_43355() == 0) {
            this.\u0000strictfp.Method_16858(7212 & 17242, new Class_43272(this, 0.03529411764705882 * 17.0));
        }
        super.Method_42636();
    }

    protected String Method_43361() {
        return this.Method_43379() ? "mob.villager.haggle" : "mob.villager.idle";
    }

    private void Method_43362() {
        Class_26653[][][] arrclass_26653 = Field_43348[this.Method_43355()];
        if (this.Field_43345 != 0 && this.Field_43340 != 0) {
            this.Field_43340 += 24577 & 5191;
        } else {
            this.Field_43345 = this.\u0000strictfp.nextInt(arrclass_26653.length) + (-20415 & 163);
            this.Field_43340 = 2177 & -16359;
        }
        if (this.Field_43341 == null) {
            this.Field_43341 = new Class_14517();
        }
        int n = this.Field_43345 - (4369 & 8261);
        int n2 = this.Field_43340 - (6913 & 1189);
        Class_26653[][] arrclass_266532 = arrclass_26653[n];
        if (n2 >= 0 && n2 < arrclass_266532.length) {
            Class_26653[] arrclass_266533;
            Class_26653[] arrclass_266534 = arrclass_266533 = arrclass_266532[n2];
            int n3 = arrclass_266534.length;
            for (int i = -12261 & 1796; i < n3; ++i) {
                Class_26653 class_26653 = arrclass_266534[i];
                class_26653.Method_26654(this.Field_43341, this.\u0000strictfp);
            }
        }
    }

    public void Method_43363(Class_23823 class_23823) {
        if (!this.\u0000strictfp.Field_306 && this.\u0000% > -this.\u0000, #() + (5206 & 308)) {
            this.\u0000% = -this.\u0000, #();
            if (class_23823 != null) {
                this.\u0000strictfp("mob.villager.yes", this.\u0000= float(), this.\u0000= package());
            } else {
                this.\u0000strictfp("mob.villager.no", this.\u0000= float(), this.\u0000= package());
            }
        }
    }

    public float Method_43364() {
        float f = 1.7187805f * 0.9425287f;
        if (this.\u0000, for()) {
            f = (float)((double)f - 0.5050588235294118 * 1.6037735849056605);
        }
        return f;
    }

    public boolean Method_43365() {
        return this.Method_43392(16386 & 9250);
    }

    public boolean Method_43366() {
        return this.Field_43337;
    }

    public Class_43334(Class_283 class_283) {
        this(class_283, -2784 & 139);
    }

    public void Method_43367(Class_859 class_859) {
        super.\u0000= final(class_859);
        if (this.Field_43335 != null && class_859 != null) {
            this.Field_43335.Method_20440(class_859);
            if (class_859 instanceof Class_626) {
                int n = -1 & -1;
                if (this.\u0000, for()) {
                    n = -1 & -3;
                }
                this.Field_43335.Method_20450(class_859.\u0000, `(), n);
                if (this.\u0000volatile()) {
                    this.\u0000strictfp.Method_483(this, (byte)(-31089 & 30813));
                }
            }
        }
    }

    public Class_1782 Method_43368(boolean bl) {
        String string = this.\u0000= int();
        if (string != null && string.length() > 0) {
            Class_2840 class_2840 = new Class_2840(string);
            class_2840.\u0000strictfp().Method_2936(this.\u0000strictfp());
            class_2840.\u0000strictfp().Method_2926(this.\u0000strictfp().toString());
            return class_2840;
        }
        if (this.Field_43341 == null) {
            this.Method_43362();
        }
        String string2 = null;
        switch (this.Method_43355()) {
            case 0: {
                if (this.Field_43345 == (41 & 24661)) {
                    string2 = "farmer";
                    break;
                }
                if (this.Field_43345 == (342 & -24566)) {
                    string2 = "fisherman";
                    break;
                }
                if (this.Field_43345 == (10771 & -28597)) {
                    string2 = "shepherd";
                    break;
                }
                if (this.Field_43345 != (3124 & -3827)) break;
                string2 = "fletcher";
                break;
            }
            case 1: {
                string2 = "librarian";
                break;
            }
            case 2: {
                string2 = "cleric";
                break;
            }
            case 3: {
                if (this.Field_43345 == (-3035 & 259)) {
                    string2 = "armor";
                    break;
                }
                if (this.Field_43345 == (418 & -32230)) {
                    string2 = "weapon";
                    break;
                }
                if (this.Field_43345 != (-30681 & 20611)) break;
                string2 = "tool";
                break;
            }
            case 4: {
                if (this.Field_43345 == (-10063 & 263)) {
                    string2 = "butcher";
                    break;
                }
                if (this.Field_43345 != (-11577 & 2)) break;
                string2 = "leather";
            }
        }
        if (string2 != null) {
            Class_2849 class_2849 = new Class_2849("entity.Villager." + string2, new Object[-6016 & 355]);
            class_2849.\u0000strictfp().Method_2936(this.\u0000strictfp());
            class_2849.\u0000strictfp().Method_2926(this.\u0000strictfp().toString());
            return class_2849;
        }
        return super.\u0000strictfp();
    }

    public boolean Method_43369() {
        for (int i = 0 & -26620; i < this.Field_43343.Method_43652(); ++i) {
            Class_23823 class_23823 = this.Field_43343.Method_43642(i);
            if (class_23823 == null || class_23823.Method_23844() != Class_10527.Field_10622 && class_23823.Method_23844() != Class_10527.Field_10584 && class_23823.Method_23844() != Class_10527.Field_10713) continue;
            return (-16295 & 4641) != 0;
        }
        return (6188 & 130) != 0;
    }

    public void Method_43370(Class_1699 class_1699) {
        super.Method_42645(class_1699);
        class_1699.Method_1739("Profession", this.Method_43355());
        class_1699.Method_1739("Riches", this.Field_43347);
        class_1699.Method_1739("Career", this.Field_43345);
        class_1699.Method_1739("CareerLevel", this.Field_43340);
        class_1699.Method_1706("Willing", this.Field_43346);
        if (this.Field_43341 != null) {
            class_1699.Method_1744("Offers", this.Field_43341.Method_14524());
        }
        Class_1758 class_1758 = new Class_1758();
        for (int i = 217 & 2048; i < this.Field_43343.Method_43652(); ++i) {
            Class_23823 class_23823 = this.Field_43343.Method_43642(i);
            if (class_23823 == null) continue;
            class_1758.Method_1781(class_23823.Method_23841(new Class_1699()));
        }
        class_1699.Method_1744("Inventory", class_1758);
    }

    public void Method_43371(byte by) {
        if (by == (1421 & 4108)) {
            this.Method_43359(Class_40274.Field_40278);
        } else if (by == (16783 & -32211)) {
            this.Method_43359(Class_40274.Field_40306);
        } else if (by == (6254 & -23010)) {
            this.Method_43359(Class_40274.Field_40302);
        } else {
            super.\u0000strictfp(by);
        }
    }

    public void Method_43372(boolean bl) {
        this.Field_43349 = bl;
    }

    public void Method_43373(boolean bl) {
        this.Field_43346 = bl;
    }

    public boolean Method_43374() {
        int n;
        int n2 = n = this.Method_43355() == 0 ? 1153 & -32685 : 6304 & 72;
        return (n != 0 ? (!this.Method_43392(16551 & 9293) ? 293 & -1535 : 16900 & 12385) : (!this.Method_43392(1155 & -32463) ? -23519 & 22849 : 3080 & 8770)) != 0;
    }

    protected void Method_43375() {
        super.\u0000= 3();
        this.\u0000strictfp(Class_21716.Field_21722).Method_16556(0.7974683544303798 * 0.626984126984127);
    }

    protected String Method_43376() {
        return "mob.villager.death";
    }

    public void Method_43377(Class_14517 class_14517) {
    }

    public Class_626 Method_43378() {
        return this.Field_43344;
    }

    public boolean Method_43379() {
        return (this.Field_43344 != null ? 1395 & -14327 : -24544 & 16463) != 0;
    }

    static {
        Class_26653[][][][] arrarrclass_26653 = new Class_26653[13653 & 47][][][];
        Class_26653[][][] arrarrclass_266532 = new Class_26653[3431 & 21140][][];
        Class_26653[][] arrarrclass_266533 = new Class_26653[-27132 & 332][];
        Class_26653[] arrclass_26653 = new Class_26653[8340 & -27636];
        arrclass_26653[136 & 2819] = new Class_29574(Class_10527.Field_10621, new Class_33308(17426 & 82, 4118 & -7369));
        arrclass_26653[4097 & -30715] = new Class_29574(Class_10527.Field_10584, new Class_33308(4399 & 17999, 1459 & 24607));
        arrclass_26653[4642 & 8282] = new Class_29574(Class_10527.Field_10713, new Class_33308(2063 & 5279, 1171 & 30739));
        arrclass_26653[-11645 & 1043] = new Class_29129(Class_10527.Field_10630, new Class_33308(-2 & -4, -2 & -1));
        arrarrclass_266533[20784 & 192] = arrclass_26653;
        Class_26653[] arrclass_266532 = new Class_26653[2083 & 2];
        arrclass_266532[-32622 & 1033] = new Class_29574(Class_1956.Method_1981(Class_9265.Field_9337), new Class_33308(3404 & 4106, 25135 & -25571));
        arrclass_266532[12843 & 145] = new Class_29129(Class_10527.Field_10546, new Class_33308(-3 & -1, -2 & -2));
        arrarrclass_266533[4355 & -5975] = arrclass_266532;
        Class_26653[] arrclass_266533 = new Class_26653[8450 & 702];
        arrclass_266533[16682 & 4609] = new Class_29574(Class_1956.Method_1981(Class_9265.Field_9459), new Class_33308(8303 & 2071, 172 & 1356));
        arrclass_266533[-32635 & 26635] = new Class_29129(Class_10527.Field_10676, new Class_33308(-1 & -5, -7 & -1));
        arrarrclass_266533[8426 & 279] = arrclass_266533;
        Class_26653[] arrclass_266534 = new Class_26653[2 & 78];
        arrclass_266534[-25579 & 17344] = new Class_29129(Class_10527.Field_10688, new Class_33308(-2 & -5, -10 & -10));
        arrclass_266534[2593 & -15219] = new Class_29129(Class_10527.Field_10679, new Class_33308(-23997 & 1297, 4609 & -15263));
        arrarrclass_266533[131 & 30759] = arrclass_266534;
        arrarrclass_266532[20996 & 160] = arrarrclass_266533;
        Class_26653[][] arrarrclass_266534 = new Class_26653[17474 & -29950][];
        Class_26653[] arrclass_266535 = new Class_26653[-31541 & 17155];
        arrclass_266535[-32731 & 24770] = new Class_29574(Class_10527.Field_10624, new Class_33308(19023 & 399, -24297 & 19644));
        arrclass_266535[129 & 261] = new Class_29574(Class_10527.Field_10698, new Class_33308(179 & 17428, 6328 & 8731));
        arrclass_266535[9234 & -11517] = new Class_32334(Class_10527.Field_10689, new Class_33308(1806 & 10263, 782 & 4183), Class_10527.Field_10614, new Class_33308(14 & -32458, 775 & -28458));
        arrarrclass_266534[6784 & 16672] = arrclass_266535;
        Class_26653[] arrclass_266536 = new Class_26653[24897 & 6305];
        arrclass_266536[772 & -8000] = new Class_31539(Class_10527.Field_10609, new Class_33308(-14121 & 295, -28024 & 19464));
        arrarrclass_266534[2057 & -24319] = arrclass_266536;
        arrarrclass_266532[3 & -13055] = arrarrclass_266534;
        Class_26653[][] arrarrclass_266535 = new Class_26653[8234 & 21250][];
        Class_26653[] arrclass_266537 = new Class_26653[27211 & 386];
        arrclass_266537[21512 & -23772] = new Class_29574(Class_1956.Method_1981(Class_9265.Field_9326), new Class_33308(16921 & 368, 3222 & 8790));
        arrclass_266537[5393 & -30583] = new Class_29129(Class_10527.Field_10606, new Class_33308(10567 & 163, -16234 & 1028));
        arrarrclass_266535[17409 & 4682] = arrclass_266537;
        Class_26653[] arrclass_266538 = new Class_26653[8342 & -32400];
        arrclass_266538[10306 & 1573] = new Class_29129(new Class_23823(Class_1956.Method_1981(Class_9265.Field_9326), -32701 & 2049, 1062 & 4160), new Class_33308(4353 & 17557, 6150 & 9226));
        arrclass_266538[-32255 & 5121] = new Class_29129(new Class_23823(Class_1956.Method_1981(Class_9265.Field_9326), 3755 & -32687, -7423 & 55), new Class_33308(149 & 20521, 9367 & 106));
        arrclass_266538[18954 & 12386] = new Class_29129(new Class_23823(Class_1956.Method_1981(Class_9265.Field_9326), -21757 & 4209, -28633 & 16962), new Class_33308(-30555 & 28931, 594 & 7178));
        arrclass_266538[4099 & 16539] = new Class_29129(new Class_23823(Class_1956.Method_1981(Class_9265.Field_9326), 1033 & -16317, 9299 & 2059), new Class_33308(1 & 4225, 1166 & 8194));
        arrclass_266538[8780 & -29404] = new Class_29129(new Class_23823(Class_1956.Method_1981(Class_9265.Field_9326), 16385 & 10757, 284 & -13692), new Class_33308(4225 & 17155, 2211 & 22298));
        arrclass_266538[-32699 & 29189] = new Class_29129(new Class_23823(Class_1956.Method_1981(Class_9265.Field_9326), 3217 & -3551, 5 & 11413), new Class_33308(-29663 & 16397, 2 & -28646));
        arrclass_266538[366 & 1543] = new Class_29129(new Class_23823(Class_1956.Method_1981(Class_9265.Field_9326), -16127 & 673, -14777 & 390), new Class_33308(-23931 & 21523, -30718 & 26535));
        arrclass_266538[16943 & 151] = new Class_29129(new Class_23823(Class_1956.Method_1981(Class_9265.Field_9326), 545 & -24491, 20535 & 7), new Class_33308(1545 & 4563, 20814 & -30686));
        arrclass_266538[8 & 18636] = new Class_29129(new Class_23823(Class_1956.Method_1981(Class_9265.Field_9326), 20629 & 3, 10312 & 188), new Class_33308(2099 & -23031, 1538 & 2334));
        arrclass_266538[4361 & -30631] = new Class_29129(new Class_23823(Class_1956.Method_1981(Class_9265.Field_9326), -24575 & 161, 41 & -6887), new Class_33308(6529 & 8725, -32634 & 11090));
        arrclass_266538[24154 & 139] = new Class_29129(new Class_23823(Class_1956.Method_1981(Class_9265.Field_9326), 8709 & -32381, -28401 & 2058), new Class_33308(-29687 & 12353, 30275 & 2050));
        arrclass_266538[-24401 & 523] = new Class_29129(new Class_23823(Class_1956.Method_1981(Class_9265.Field_9326), 22595 & -24315, 31 & -29141), new Class_33308(5 & 1065, 446 & 23554));
        arrclass_266538[-31348 & 30812] = new Class_29129(new Class_23823(Class_1956.Method_1981(Class_9265.Field_9326), 1089 & 30729, -24564 & 4684), new Class_33308(-7551 & 5457, -15470 & 4138));
        arrclass_266538[16655 & -32579] = new Class_29129(new Class_23823(Class_1956.Method_1981(Class_9265.Field_9326), 5645 & -30703, 24719 & 4621), new Class_33308(8289 & 1041, 10262 & -31350));
        arrclass_266538[9230 & 4190] = new Class_29129(new Class_23823(Class_1956.Method_1981(Class_9265.Field_9326), 29 & -20575, 6159 & 16494), new Class_33308(-30471 & 1, 4098 & 19726));
        arrclass_266538[-31985 & 79] = new Class_29129(new Class_23823(Class_1956.Method_1981(Class_9265.Field_9326), 641 & -17149, 287 & 16559), new Class_33308(4113 & -31737, 2 & -32766));
        arrarrclass_266535[-16383 & 243] = arrclass_266538;
        arrarrclass_266532[16399 & -28654] = arrarrclass_266535;
        Class_26653[][] arrarrclass_266536 = new Class_26653[4098 & -29665][];
        Class_26653[] arrclass_266539 = new Class_26653[-20262 & 16898];
        arrclass_266539[-31736 & 24577] = new Class_29574(Class_10527.Field_10624, new Class_33308(47 & 2639, 20 & -23593));
        arrclass_266539[35 & 18561] = new Class_29129(Class_10527.Field_10568, new Class_33308(-12 & -12, -4 & -8));
        arrarrclass_266536[-32446 & 12416] = arrclass_266539;
        Class_26653[] arrclass_2665310 = new Class_26653[16390 & -18781];
        arrclass_2665310[8386 & 44] = new Class_29129(Class_10527.Field_10690, new Class_33308(-29690 & 20498, 11 & 17667));
        arrclass_2665310[3585 & 193] = new Class_32334(Class_1956.Method_1981(Class_9265.Field_9360), new Class_33308(-24550 & 2794, 266 & 8366), Class_10527.Field_10567, new Class_33308(27687 & 470, -32082 & 26890));
        arrarrclass_266536[2193 & 5733] = arrclass_2665310;
        arrarrclass_266532[28675 & 1679] = arrarrclass_266536;
        arrarrclass_26653[-32748 & 27073] = arrarrclass_266532;
        Class_26653[][][] arrarrclass_266537 = new Class_26653[-30831 & 9][][];
        Class_26653[][] arrarrclass_266538 = new Class_26653[1550 & -32601][];
        Class_26653[] arrclass_2665311 = new Class_26653[1818 & 34];
        arrclass_2665311[-12784 & 32] = new Class_29574(Class_10527.Field_10703, new Class_33308(-32168 & 31130, 292 & -13724));
        arrclass_2665311[-24411 & 1099] = new Class_44785();
        arrarrclass_266538[6144 & 8456] = arrclass_2665311;
        Class_26653[] arrclass_2665312 = new Class_26653[4107 & -15997];
        arrclass_2665312[274 & 10437] = new Class_29574(Class_10527.Field_10629, new Class_33308(16395 & 10252, -29890 & 8330));
        arrclass_2665312[411 & 25601] = new Class_29129(Class_10527.Field_10633, new Class_33308(9866 & -28646, 396 & 2636));
        arrclass_2665312[8202 & 2470] = new Class_29129(Class_1956.Method_1981(Class_9265.Field_9339), new Class_33308(-30461 & 17543, 7 & 1332));
        arrarrclass_266538[8233 & 1217] = arrclass_2665312;
        Class_26653[] arrclass_2665313 = new Class_26653[26243 & 299];
        arrclass_2665313[18568 & 12624] = new Class_29574(Class_10527.Field_10671, new Class_33308(11298 & 643, 14086 & 16435));
        arrclass_2665313[16385 & -30639] = new Class_29129(Class_10527.Field_10534, new Class_33308(7694 & -32726, 16972 & 12316));
        arrclass_2665313[21826 & 8194] = new Class_29129(Class_1956.Method_1981(Class_9265.Field_9345), new Class_33308(-5 & -5, -3 & -3));
        arrarrclass_266538[16427 & 10374] = arrclass_2665313;
        Class_26653[] arrclass_2665314 = new Class_26653[-22269 & 22049];
        arrclass_2665314[-31738 & 2640] = new Class_44785();
        arrarrclass_266538[-28645 & 17187] = arrclass_2665314;
        Class_26653[] arrclass_2665315 = new Class_26653[-28591 & 19107];
        arrclass_2665315[-27579 & 18824] = new Class_44785();
        arrarrclass_266538[-9300 & 9284] = arrclass_2665315;
        Class_26653[] arrclass_2665316 = new Class_26653[7709 & -32383];
        arrclass_2665316[21512 & 2] = new Class_29129(Class_10527.Field_10668, new Class_33308(16852 & 4118, -32138 & 4254));
        arrarrclass_266538[-21363 & 341] = arrclass_2665316;
        arrarrclass_266537[17410 & -32740] = arrarrclass_266538;
        arrarrclass_26653[-27967 & 2057] = arrarrclass_266537;
        Class_26653[][][] arrarrclass_266539 = new Class_26653[12435 & -13247][][];
        Class_26653[][] arrarrclass_2665310 = new Class_26653[-32243 & 1156][];
        Class_26653[] arrclass_2665317 = new Class_26653[3107 & 730];
        arrclass_2665317[-32252 & 18432] = new Class_29574(Class_10527.Field_10574, new Class_33308(7732 & -32412, 24616 & 2872));
        arrclass_2665317[-28149 & 2049] = new Class_29574(Class_10527.Field_10705, new Class_33308(-32568 & 13321, 9242 & 495));
        arrarrclass_2665310[2 & 28372] = arrclass_2665317;
        Class_26653[] arrclass_2665318 = new Class_26653[30738 & 271];
        arrclass_2665318[1602 & 8224] = new Class_29129(Class_10527.Field_10564, new Class_33308(-4 & -3, -1 & -1));
        arrclass_2665318[1793 & 55] = new Class_29129(new Class_23823(Class_10527.Field_10623, 9473 & -32221, Class_5393.Field_5406.Method_5436()), new Class_33308(-1 & -2, -1 & -1));
        arrarrclass_2665310[-19029 & 2053] = arrclass_2665318;
        Class_26653[] arrclass_2665319 = new Class_26653[16806 & 8706];
        arrclass_2665319[6192 & 132] = new Class_29129(Class_10527.Field_10660, new Class_33308(1303 & -24529, -32689 & 25355));
        arrclass_2665319[-16319 & 8455] = new Class_29129(Class_1956.Method_1981(Class_9265.Field_9334), new Class_33308(-3 & -1, -1 & -1));
        arrarrclass_2665310[17106 & 4098] = arrclass_2665319;
        Class_26653[] arrclass_2665320 = new Class_26653[1 & 8995];
        arrclass_2665320[14872 & 256] = new Class_29129(Class_10527.Field_10643, new Class_33308(1043 & 12835, 2587 & 17547));
        arrarrclass_2665310[1427 & 4099] = arrclass_2665320;
        arrarrclass_266539[2177 & -12028] = arrarrclass_2665310;
        arrarrclass_26653[4170 & 19] = arrarrclass_266539;
        Class_26653[][][] arrarrclass_2665311 = new Class_26653[5707 & -32765][][];
        Class_26653[][] arrarrclass_2665312 = new Class_26653[11540 & -32250][];
        Class_26653[] arrclass_2665321 = new Class_26653[1795 & 24670];
        arrclass_2665321[-16160 & 265] = new Class_29574(Class_10527.Field_10698, new Class_33308(-32750 & 6449, 20730 & 8988));
        arrclass_2665321[8321 & -30207] = new Class_29129(Class_10527.Field_10667, new Class_33308(516 & -32315, 2103 & 29254));
        arrarrclass_2665312[12288 & -30026] = arrclass_2665321;
        Class_26653[] arrclass_2665322 = new Class_26653[50 & -22522];
        arrclass_2665322[8192 & -27888] = new Class_29574(Class_10527.Field_10565, new Class_33308(16999 & 5127, -28631 & 17417));
        arrclass_2665322[10507 & -32639] = new Class_29129(Class_10527.Field_10600, new Class_33308(14410 & 43, 23982 & 94));
        arrarrclass_2665312[1029 & 307] = arrclass_2665322;
        Class_26653[] arrclass_2665323 = new Class_26653[-28346 & 27138];
        arrclass_2665323[-30656 & 136] = new Class_29574(Class_10527.Field_10673, new Class_33308(6279 & -31173, 17781 & -30068));
        arrclass_2665323[4113 & -22931] = new Class_31539(Class_10527.Field_10714, new Class_33308(16466 & 2228, -27873 & 25715));
        arrarrclass_2665312[19478 & -32381] = arrclass_2665323;
        Class_26653[] arrclass_2665324 = new Class_26653[30510 & 212];
        arrclass_2665324[25 & 34] = new Class_29129(Class_10527.Field_10613, new Class_33308(1287 & 93, 1031 & 16431));
        arrclass_2665324[-31487 & 23173] = new Class_29129(Class_10527.Field_10601, new Class_33308(8201 & 16559, 4315 & -7377));
        arrclass_2665324[-16341 & 2690] = new Class_29129(Class_10527.Field_10544, new Class_33308(-32475 & 3285, 20623 & 3079));
        arrclass_2665324[25347 & 1107] = new Class_29129(Class_10527.Field_10693, new Class_33308(2763 & 1039, 2063 & 8463));
        arrarrclass_2665312[-16345 & 6659] = arrclass_2665324;
        arrarrclass_2665311[13697 & -13764] = arrarrclass_2665312;
        Class_26653[][] arrarrclass_2665313 = new Class_26653[19 & 6787][];
        Class_26653[] arrclass_2665325 = new Class_26653[-3962 & 586];
        arrclass_2665325[20784 & 1100] = new Class_29574(Class_10527.Field_10698, new Class_33308(8473 & -27600, 4505 & 24632));
        arrclass_2665325[-13687 & 13381] = new Class_29129(Class_10527.Field_10555, new Class_33308(4182 & 8462, 88 & -12152));
        arrarrclass_2665313[12420 & -29168] = arrclass_2665325;
        Class_26653[] arrclass_2665326 = new Class_26653[-32734 & 17102];
        arrclass_2665326[-30591 & 24578] = new Class_29574(Class_10527.Field_10565, new Class_33308(18479 & 8855, 2569 & 297));
        arrclass_2665326[8193 & 401] = new Class_31539(Class_10527.Field_10708, new Class_33308(57 & 19529, 522 & 16810));
        arrarrclass_2665313[3609 & 421] = arrclass_2665326;
        Class_26653[] arrclass_2665327 = new Class_26653[-14113 & 1027];
        arrclass_2665327[720 & -16375] = new Class_29574(Class_10527.Field_10673, new Class_33308(587 & -28649, -8060 & 2140));
        arrclass_2665327[21073 & -30583] = new Class_31539(Class_10527.Field_10618, new Class_33308(-11748 & 140, 6287 & 271));
        arrclass_2665327[534 & 2050] = new Class_31539(Class_10527.Field_10674, new Class_33308(-31155 & 9, 24652 & 2334));
        arrarrclass_2665313[9022 & 4098] = arrclass_2665327;
        arrarrclass_2665311[23333 & 1027] = arrarrclass_2665313;
        Class_26653[][] arrarrclass_2665314 = new Class_26653[-15853 & 11495][];
        Class_26653[] arrclass_2665328 = new Class_26653[-29693 & 258];
        arrclass_2665328[6658 & -23416] = new Class_29574(Class_10527.Field_10698, new Class_33308(25296 & 3088, 5656 & 8542));
        arrclass_2665328[521 & 9301] = new Class_31539(Class_10527.Field_10591, new Class_33308(13 & -32505, 8751 & -11241));
        arrarrclass_2665314[12544 & 44] = arrclass_2665328;
        Class_26653[] arrclass_2665329 = new Class_26653[4610 & -24190];
        arrclass_2665329[20608 & -32509] = new Class_29574(Class_10527.Field_10565, new Class_33308(16423 & -29689, 19033 & -32501));
        arrclass_2665329[8451 & 2657] = new Class_31539(Class_10527.Field_10552, new Class_33308(12841 & -15015, 17931 & 127));
        arrarrclass_2665314[193 & -27613] = arrclass_2665329;
        Class_26653[] arrclass_2665330 = new Class_26653[18562 & -24310];
        arrclass_2665330[4704 & -6119] = new Class_29574(Class_10527.Field_10673, new Class_33308(11 & 12007, -26090 & 17540));
        arrclass_2665330[5701 & 2305] = new Class_31539(Class_10527.Field_10710, new Class_33308(25740 & 348, 8351 & 2063));
        arrarrclass_2665314[-8190 & 4231] = arrclass_2665330;
        arrarrclass_2665311[8227 & 16522] = arrarrclass_2665314;
        arrarrclass_26653[2087 & 1155] = arrarrclass_2665311;
        Class_26653[][][] arrarrclass_2665315 = new Class_26653[4098 & 16919][][];
        Class_26653[][] arrarrclass_2665316 = new Class_26653[1667 & 4366][];
        Class_26653[] arrclass_2665331 = new Class_26653[274 & 1734];
        arrclass_2665331[8480 & -12800] = new Class_29574(Class_10527.Field_10587, new Class_33308(14671 & -16370, 2326 & 18));
        arrclass_2665331[26185 & 4103] = new Class_29574(Class_10527.Field_10551, new Class_33308(2702 & -23217, -32686 & 18));
        arrarrclass_2665316[-30112 & 13313] = arrclass_2665331;
        Class_26653[] arrclass_2665332 = new Class_26653[2147 & 19];
        arrclass_2665332[5 & 9112] = new Class_29574(Class_10527.Field_10698, new Class_33308(30104 & -32207, -7586 & 57));
        arrclass_2665332[-32635 & 12571] = new Class_29129(Class_10527.Field_10598, new Class_33308(-7 & -7, -1 & -5));
        arrclass_2665332[74 & 14002] = new Class_29129(Class_10527.Field_10646, new Class_33308(-4 & -8, -6 & -6));
        arrarrclass_2665316[2049 & -27611] = arrclass_2665332;
        arrarrclass_2665315[531 & 8556] = arrarrclass_2665316;
        Class_26653[][] arrarrclass_2665317 = new Class_26653[4151 & -16381][];
        Class_26653[] arrclass_2665333 = new Class_26653[16918 & -30390];
        arrclass_2665333[29724 & -32415] = new Class_29574(Class_10527.Field_10620, new Class_33308(537 & 20937, 19484 & -23985));
        arrclass_2665333[4867 & 9] = new Class_29129(Class_10527.Field_10549, new Class_33308(9250 & -28542, 25124 & -31676));
        arrarrclass_2665317[8225 & 18816] = arrclass_2665333;
        Class_26653[] arrclass_2665334 = new Class_26653[-15841 & 2049];
        arrclass_2665334[2148 & 5120] = new Class_31539(Class_10527.Field_10619, new Class_33308(-23033 & 2439, 5132 & 2764));
        arrarrclass_2665317[579 & 425] = arrclass_2665334;
        Class_26653[] arrclass_2665335 = new Class_26653[1419 & -18399];
        arrclass_2665335[2594 & -20476] = new Class_29129(Class_10527.Field_10594, new Class_33308(10 & -32739, -22486 & 4254));
        arrarrclass_2665317[-11674 & 10643] = arrclass_2665335;
        arrarrclass_2665315[23 & -7967] = arrarrclass_2665317;
        arrarrclass_26653[16541 & 4134] = arrarrclass_2665315;
        Field_43348 = arrarrclass_26653;
    }

    protected boolean Method_43380() {
        return (-12284 & 3560) != 0;
    }

    private void Method_43381() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_43382(int n) {
        this.\u0000strictfp.Method_32704(16410 & 8340, n);
    }

    public void Method_43383(Class_6757 class_6757) {
        class_6757.Method_6771();
        this.\u0000% = -this.\u0000, #();
        this.\u0000strictfp("mob.villager.yes", this.\u0000= float(), this.\u0000= package());
        int n = (2631 & 8579) + this.\u0000strictfp.nextInt(24676 & 2828);
        if (class_6757.Method_6774() == (12305 & -30705) || this.\u0000strictfp.nextInt(4757 & -23281) == 0) {
            this.Field_43338 = 8296 & -32469;
            this.Field_43351 = 401 & 1;
            this.Field_43346 = -16067 & 3075;
            this.Field_43342 = this.Field_43344 != null ? this.Field_43344.Method_825() : null;
            n += 5;
        }
        if (class_6757.Method_6770().Method_23844() == Class_10527.Field_10707) {
            this.Field_43347 += class_6757.Method_6770().Field_23826;
        }
        if (class_6757.Method_6777()) {
            this.\u0000strictfp.Method_350(new Class_3481(this.\u0000strictfp, this.\u0000= package, this.\u0000, for() + 0.6808510638297872 * 0.734375, this.\u0000= switch, n));
        }
    }

    public Class_43634 Method_43384() {
        return this.Field_43343;
    }

    public void Method_43385(boolean bl) {
        this.Field_43337 = bl;
    }

    public Class_42629 Method_43386(Class_42629 class_42629) {
        return this.Method_43393(class_42629);
    }

    public boolean Method_43387(Class_626 class_626) {
        int n;
        Class_23823 class_23823 = class_626.Field_628.Method_37821();
        int n2 = n = class_23823 != null && class_23823.Method_23844() == Class_10527.Field_10573 ? 229 & -9983 : -28093 & 17424;
        if (n == 0 && this.\u0000volatile() && !this.Method_43379() && !this.\u0000, for()) {
            if (!(this.\u0000strictfp.Field_306 || this.Field_43341 != null && this.Field_43341.size() <= 0)) {
                this.Method_43394(class_626);
                class_626.Method_741(this);
            }
            class_626.Method_750(Class_19863.Field_19865);
            return (145 & 14337) != 0;
        }
        return super.Method_42641(class_626);
    }

    public boolean Method_43388() {
        return this.Method_43392(16425 & 11793);
    }

    public boolean Method_43389() {
        return this.Field_43349;
    }

    public boolean Method_43390(boolean bl) {
        if (!this.Field_43346 && bl && this.Method_43388()) {
            int n = -13696 & 4431;
            for (int i = 8200 & 6306; i < this.Field_43343.Method_43652(); ++i) {
                Class_23823 class_23823 = this.Field_43343.Method_43642(i);
                if (class_23823 != null) {
                    if (class_23823.Method_23844() == Class_10527.Field_10630 && class_23823.Field_23826 >= (18979 & 1039)) {
                        n = -24575 & 3585;
                        this.Field_43343.Method_43658(i, -30137 & 27);
                    } else if ((class_23823.Method_23844() == Class_10527.Field_10584 || class_23823.Method_23844() == Class_10527.Field_10713) && class_23823.Field_23826 >= (6156 & 24703)) {
                        n = 2305 & -28107;
                        this.Field_43343.Method_43658(i, -32482 & 4236);
                    }
                }
                if (n == 0) continue;
                this.\u0000strictfp.Method_483(this, (byte)(406 & -14285));
                this.Field_43346 = 73 & -24415;
                break;
            }
        }
        return this.Field_43346;
    }

    protected String Method_43391() {
        return "mob.villager.hit";
    }

    private boolean Method_43392(int n) {
        int n2 = this.Method_43355() == 0 ? 1043 & 13 : 24713 & 4352;
        for (int i = 5728 & 2192; i < this.Field_43343.Method_43652(); ++i) {
            Class_23823 class_23823 = this.Field_43343.Method_43642(i);
            if (class_23823 == null) continue;
            if (class_23823.Method_23844() == Class_10527.Field_10630 && class_23823.Field_23826 >= (-30073 & 9283) * n || class_23823.Method_23844() == Class_10527.Field_10584 && class_23823.Field_23826 >= (5356 & -24563) * n || class_23823.Method_23844() == Class_10527.Field_10713 && class_23823.Field_23826 >= (13068 & 16413) * n) {
                return (1 & 129) != 0;
            }
            if (n2 == 0 || class_23823.Method_23844() != Class_10527.Field_10621 || class_23823.Field_23826 < (141 & -12277) * n) continue;
            return (17955 & 10497) != 0;
        }
        return (48 & 256) != 0;
    }

    public Class_43334 Method_43393(Class_42629 class_42629) {
        Class_43334 class_43334 = new Class_43334(this.\u0000strictfp);
        class_43334.Method_43401(this.\u0000strictfp.Method_364(new Class_4751(class_43334)), null);
        return class_43334;
    }

    public void Method_43394(Class_626 class_626) {
        this.Field_43344 = class_626;
    }

    private void Method_43395() {
        if (!this.Field_43339) {
            this.Field_43339 = 12327 & -32567;
            if (this.\u0000, for()) {
                this.\u0000strictfp.Method_16858(-16248 & 1101, new Class_41682(this, 2.7345454545454544 * 0.11702127659574468));
            } else if (this.Method_43355() == 0) {
                this.\u0000strictfp.Method_16858(18630 & -32706, new Class_43272(this, 1.7538461538461538 * 0.34210526315789475));
            }
        }
    }

    private boolean Method_43396(Class_1956 class_1956) {
        return (class_1956 == Class_10527.Field_10630 || class_1956 == Class_10527.Field_10584 || class_1956 == Class_10527.Field_10713 || class_1956 == Class_10527.Field_10621 || class_1956 == Class_10527.Field_10622 ? 49 & 25737 : 1068 & -28672) != 0;
    }

    public Class_43334(Class_283 class_283, int n) {
        super(class_283);
        this.Method_43382(n);
        this.\u0000= final(1.1315789f * 0.5302326f, 1.1123595f * 1.6181818f);
        ((Class_25797)this.\u0000strictfp()).Method_25807((10253 & 1745) != 0);
        ((Class_25797)this.\u0000strictfp()).Method_25808((4233 & 5) != 0);
        this.\u0000strictfp.Method_16858(-21440 & 5001, new Class_40128(this));
        this.\u0000strictfp.Method_16858(3137 & 547, new Class_34269(this, Class_43566.class, 4.0f * 2.0f, 0.011494252873563218 * 52.199999999999996, 0.01935483870967742 * 31.0));
        this.\u0000strictfp.Method_16858(-28535 & 17953, new Class_33326(this));
        this.\u0000strictfp.Method_16858(4237 & 1043, new Class_39978(this));
        this.\u0000strictfp.Method_16858(-14110 & 1030, new Class_36471(this));
        this.\u0000strictfp.Method_16858(355 & 10375, new Class_33751(this));
        this.\u0000strictfp.Method_16858(2084 & 8775, new Class_35370(this, (65 & -22123) != 0));
        this.\u0000strictfp.Method_16858(28951 & -32123, new Class_35640(this, 4.8545454545454545 * 0.12359550561797752));
        this.\u0000strictfp.Method_16858(1798 & 20662, new Class_33093(this));
        this.\u0000strictfp.Method_16858(135 & 2855, new Class_47140(this));
        this.\u0000strictfp.Method_16858(41 & -21991, new Class_46516(this, Class_626.class, 3.7636364f * 0.79710144f, 1.0f));
        this.\u0000strictfp.Method_16858(1049 & 16525, new Class_46650(this));
        this.\u0000strictfp.Method_16858(269 & 5643, new Class_34936(this, 1.55 * 0.3870967741935484));
        this.\u0000strictfp.Method_16858(2314 & 8395, new Class_38500(this, Class_34093.class, 0.18292683f * 43.733334f));
        this.\u0000= `((17665 & 12293) != 0);
    }

    public void Method_43397() {
        this.Field_43350 = -31229 & 9;
    }

    public boolean Method_43398(int n, Class_23823 class_23823) {
        if (super.\u0000strictfp(n, class_23823)) {
            return (1 & 2187) != 0;
        }
        int n2 = n - (-19076 & 2860);
        if (n2 >= 0 && n2 < this.Field_43343.Method_43652()) {
            this.Field_43343.Method_43662(n2, class_23823);
            return (-32411 & 18953) != 0;
        }
        return (8196 & 800) != 0;
    }

    protected void Method_43399(Class_3443 class_3443) {
        Class_23823 class_23823 = class_3443.Method_3478();
        Class_1956 class_1956 = class_23823.Method_23844();
        if (this.Method_43396(class_1956)) {
            Class_23823 class_238232 = this.Field_43343.Method_43650(class_23823);
            if (class_238232 == null) {
                class_3443.\u0000break();
            } else {
                class_23823.Field_23826 = class_238232.Field_23826;
            }
        }
    }

    protected void Method_43400() {
        if ((this.Field_43336 -= -15871 & 5389) <= 0) {
            Class_4751 class_4751 = new Class_4751(this);
            this.\u0000strictfp.Method_558().Method_41922(class_4751);
            this.Field_43336 = (19542 & 879) + this.\u0000strictfp.nextInt(6202 & -32330);
            this.Field_43335 = this.\u0000strictfp.Method_558().Method_41910(class_4751, 12960 & 1062);
            if (this.Field_43335 == null) {
                this.\u0000
                ();
            } else {
                Object object = this.Field_43335.Method_20452();
                this.\u0000strictfp((Class_4751)object, (int)((float)this.Field_43335.Method_20435() * 1.0f));
                if (this.Field_43350) {
                    this.Field_43350 = 1032 & -16350;
                    this.Field_43335.Method_20426(773 & 24613);
                }
            }
        }
        if (!this.Method_43379() && this.Field_43338 > 0) {
            this.Field_43338 -= 2689 & 1105;
            if (this.Field_43338 <= 0) {
                if (this.Field_43351) {
                    for (Object object : this.Field_43341) {
                        if (!((Class_6757)object).Method_6776()) continue;
                        ((Class_6757)object).Method_6766(this.\u0000strictfp.nextInt(807 & -5946) + this.\u0000strictfp.nextInt(-31962 & 16470) + (6186 & -24573));
                    }
                    this.Method_43362();
                    this.Field_43351 = -32224 & 23554;
                    if (this.Field_43335 != null && this.Field_43342 != null) {
                        this.\u0000strictfp.Method_483(this, (byte)(2126 & -3826));
                        this.Field_43335.Method_20450(this.Field_43342, -32765 & 7277);
                    }
                }
                this.\u0000, `(new Class_25240(Class_8338.Field_8348.Field_8364, 200 & -9508, -31872 & 5153));
            }
        }
        super.\u0000, if();
    }

    public Class_26405 Method_43401(Class_33888 class_33888, Class_26405 class_26405) {
        class_26405 = super.\u0000strictfp(class_33888, class_26405);
        this.Method_43382(this.\u0000strictfp.Field_307.nextInt(-16379 & 517));
        this.Method_43395();
        return class_26405;
    }
}

