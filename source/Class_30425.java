/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  internal.org.lwjgl.input.Keyboard
 */
import internal.org.lwjgl.input.Keyboard;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_30425
extends Class_1490 {
    private Class_7651 Field_30426;
    private Class_43116 Field_30427;
    private Class_43116 Field_30428;
    private Class_30445 Field_30429;
    private Class_7651 Field_30430;
    private Class_43116 Field_30431;
    private Class_45894[] Field_30432;
    private Class_43116 Field_30433;
    private Class_42876 Field_30434;
    private Class_42876 Field_30435;

    private void Method_30436() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_30425(Class_30445 class_30445, Class_7651 class_7651) {
        this(class_30445.Method_30474(), class_7651);
        this.Field_30429 = class_30445;
    }

    public void Method_30437(int n, int n2, float f) {
        int n3 = Class_13337.Method_13371(this.\u0000strictfp.Field_48.\u0000= package);
        int n4 = Class_13337.Method_13371(this.\u0000strictfp.Field_48.\u0000= switch);
        int n5 = Class_13337.Method_13371(this.\u0000strictfp.Field_48.\u0000, for() + 1.0);
        this.Field_30431.Method_43130(n3);
        this.Field_30428.Method_43130(n4);
        this.Field_30427.Method_43130(n5);
        String string = "Waypoint Edit";
        int n6 = this.\u0000strictfp.Method_28715(string);
        int n7 = this.\u0000= final - n6 >> (24609 & -31673);
        int n8 = this.\u0000= final + n6 >> (9 & -23929);
        Class_30425.\u0000, `((int)(n7 - (24582 & 1194)), (int)(this.\u0000, ` / (770 & 16386) - (-32057 & 25719)), (int)(n8 + (5378 & 8258)), (int)(this.\u0000, ` / (19539 & 10) - (8313 & -27463)), (int)(-1442381564 & -1610577759));
        this.\u0000strictfp(this.\u0000strictfp, string, this.\u0000= final / (-32474 & 7194), this.\u0000, ` / (1570 & -32757) - (28910 & 86) + (618 & 9218), -1 & -1);
        Class_30425.\u0000, `((int)((this.\u0000= final - (918 & 150)) / (1814 & 8330) - (-28638 & 9099)), (int)(this.\u0000, ` / (-31934 & 17455) - (20594 & -32197)), (int)((this.\u0000= final + (-32106 & 7318)) / (74 & 2179) + (-20030 & 16387)), (int)(this.\u0000, ` / (27 & 8322) + (572 & 16502)), (int)(-1584788335 & -1570734004));
        String string2 = Integer.toString(n3).equals(this.Field_30431.\u0000strictfp) ? "X: (Current)" : "X:";
        this.\u0000, `(this.\u0000strictfp, string2, (this.\u0000= final - (16542 & 3735)) / (-30585 & 778) + (-24479 & 17429), this.\u0000, ` / (-32638 & 1542) - (-28077 & 16659), -2047759 & -3946304);
        string2 = Integer.toString(n4).equals(this.Field_30428.\u0000strictfp) ? "Z: (Current)" : "Z:";
        this.\u0000, `(this.\u0000strictfp, string2, (this.\u0000= final - (8446 & 1431)) / (706 & -16322) + (-27357 & 9), this.\u0000, ` / (17226 & 4134) - (-13747 & 297), -2964527 & -3619648);
        string2 = Integer.toString(n5).equals(this.Field_30427.\u0000strictfp) ? "Y: (Current)" : "Y:";
        this.\u0000, `(this.\u0000strictfp, string2, (this.\u0000= final - (1238 & -28490)) / (8578 & -30117) + (-31981 & 5157), this.\u0000, ` / (-24541 & 20502) + (-31709 & 4253), -596511 & -4142394);
        this.\u0000strictfp(this.\u0000strictfp, "Waypoint Name", this.\u0000= final >> (27297 & 337), this.\u0000, ` / (-32154 & 7443) - (-13771 & 8563), -4144918 & -3617084);
        this.\u0000strictfp(this.\u0000strictfp, "Coordinate", this.\u0000= final >> (12805 & 2449), this.\u0000, ` / (135 & 28674) - (3229 & 861), -4013632 & -3025727);
        this.\u0000strictfp(this.\u0000strictfp, "Color", this.\u0000= final >> (5139 & 25101), this.\u0000, ` / (1030 & -7678) + (-26341 & 17419), -1580320 & -3095355);
        if (this.Field_30426 != null) {
            this.Field_30426.Field_7662 = this.Field_30432[16517 & -30608].Method_45918() / (0.30882353f * 825.7143f);
            this.Field_30426.Field_7654 = this.Field_30432[-24511 & 411].Method_45918() / (1.0f * 255.0f);
            this.Field_30426.Field_7659 = this.Field_30432[2050 & 1162].Method_45918() / (162.5625f * 1.5686275f);
        }
        int n9 = (int)this.Field_30432[25744 & -28671].Method_45918() & (8447 & 18431);
        int n10 = (int)this.Field_30432[9221 & 2465].Method_45918() & (14335 & 16639);
        int n11 = (int)this.Field_30432[22959 & -24510].Method_45918() & (-30465 & 16639);
        int n12 = -7765632 & -16776648 | n9 << (4272 & 2141) | n10 << (8233 & 4380) | n11;
        Object[] arrobject = new Object[-32727 & 4611];
        arrobject[484 & -31728] = n9;
        this.\u0000strictfp(this.\u0000strictfp, String.format("R: %03d", arrobject), this.\u0000= final / (5154 & -32169) - (-28209 & 8751), this.\u0000, ` / (-30634 & 17546) + (2839 & 16437), -2132244349 & -929853036);
        Object[] arrobject2 = new Object[-30493 & 793];
        arrobject2[10264 & 516] = n10;
        this.\u0000strictfp(this.\u0000strictfp, String.format("G: %03d", arrobject2), this.\u0000= final / (-6525 & 4114) - (5167 & 18511), this.\u0000, ` / (2054 & 8978) + (-20385 & 17183), -2002652944 & -1868660604);
        Object[] arrobject3 = new Object[16901 & -29495];
        arrobject3[1296 & 12288] = n11;
        this.\u0000strictfp(this.\u0000strictfp, String.format("B: %03d", arrobject3), this.\u0000= final / (15682 & 16442) - (10799 & -32561), this.\u0000, ` / (2066 & 25642) + (-22487 & 16431), -2137464439 & -54098782);
        Class_30425.\u0000, `((int)(this.\u0000= final + (4826 & 91) >> (10539 & -28539)), (int)(this.\u0000, ` / (258 & 20679) + (-23530 & 20628)), (int)(this.\u0000= final + (-31594 & 406) >> (1207 & -32191)), (int)(this.\u0000, ` / (8395 & 550) + (25651 & 4146)), (int)n12);
        super.Method_1545(n, n2, f);
    }

    protected void Method_30438(char c, int n) {
        if (n == (2059 & 25601)) {
            this.Method_30440();
        } else if (n == (18462 & 349) && Class_43116.Method_43127() == this.Field_30428) {
            this.Field_30428.Method_43134();
            this.Method_30442();
        } else {
            Class_43116.Method_43131(this.\u0000strictfp, c, n);
        }
    }

    protected void Method_30439(Class_42376 class_42376) {
        if (class_42376 == this.Field_30435) {
            this.Method_30442();
        } else if (class_42376 == this.Field_30434) {
            this.Method_30440();
        }
    }

    private void Method_30440() {
        if (this.Field_30426 != null) {
            this.Field_30426.Method_7664(this.Field_30430);
        }
        this.\u0000strictfp.Method_218(this.Field_30429);
    }

    private static int Method_30441(String string) {
        try {
            return Integer.parseInt(string);
        }
        catch (Exception exception) {
            return -26100 & 25010;
        }
    }

    public Class_30425(Class_18 class_18, Class_7651 class_7651) {
        int n;
        int n2;
        String string;
        int n3;
        this.Field_30426 = class_7651;
        Class_7651 class_76512 = this.Field_30430 = class_7651 == null ? null : new Class_7651(class_7651);
        if (class_7651 == null) {
            string = "";
            Class_1378 class_1378 = class_18.Field_48;
            n2 = Class_13337.Method_13371(class_1378.\u0000= package);
            n3 = Class_13337.Method_13371(class_1378.\u0000= switch);
            n = Class_13337.Method_13371(class_1378.\u0000, for()) + (8713 & -15245);
        } else {
            string = class_7651.Field_7653;
            n2 = class_7651.Field_7655;
            n3 = class_7651.Field_7657;
            n = class_7651.Field_7660;
        }
        this.Field_30433 = new Class_43116(string);
        this.Field_30433.Method_43122(-31976 & 133);
        this.Field_30433.Method_43136();
        this.Field_30431 = new Class_43116(Integer.toString(n2));
        this.Field_30431.Method_43122(-30461 & 16545);
        this.Field_30428 = new Class_43116(Integer.toString(n3));
        this.Field_30428.Method_43122(-32685 & 4621);
        this.Field_30427 = new Class_43116(Integer.toString(n));
        this.Field_30427.Method_43122(22 & 10370);
        this.Field_30433.Method_43135(this.Field_30431);
        this.Field_30433.Method_43137(this.Field_30428);
        this.Field_30431.Method_43135(this.Field_30428);
        this.Field_30431.Method_43137(this.Field_30433);
        this.Field_30428.Method_43135(this.Field_30427);
        this.Field_30428.Method_43137(this.Field_30431);
        this.Field_30427.Method_43135(this.Field_30433);
        this.Field_30427.Method_43137(this.Field_30428);
        this.Field_30432 = new Class_45894[8347 & -12185];
        for (int i = 2177 & 25106; i < (5323 & 519); ++i) {
            Class_45894 class_45894 = new Class_45894(2054 & 4640, 16530 & -24544, 11792 & 141, 17014 & 5502, 10 & 13067);
            class_45894.Method_45925(0.0f);
            class_45894.Method_45929(1.24f * 205.64516f);
            class_45894.Method_45921(0.0f);
            class_45894.Method_45924(1.2f * 8.333333f);
            class_45894.Field_45907 = 3201 & 65;
            this.Field_30432[i] = class_45894;
        }
        this.Field_30432[-19456 & 19360].Method_45916((float)(class_7651 == null ? Math.random() : (double)class_7651.Field_7662) * (122.77777f * 2.0769231f));
        this.Field_30432[-14807 & 8213].Method_45916((float)(class_7651 == null ? Math.random() : (double)class_7651.Field_7654) * (227.87233f * 1.1190476f));
        this.Field_30432[50 & 24650].Method_45916((float)(class_7651 == null ? Math.random() : (double)class_7651.Field_7659) * (6375.0f * 0.04f));
    }

    private void Method_30442() {
        if (this.Field_30426 != null) {
            this.Field_30426.Field_7653 = this.Field_30433.\u0000strictfp;
            this.Field_30426.Field_7655 = Class_30425.Method_30441(this.Field_30431.\u0000strictfp);
            this.Field_30426.Field_7657 = Class_30425.Method_30441(this.Field_30428.\u0000strictfp);
            this.Field_30426.Field_7660 = Class_30425.Method_30441(this.Field_30427.\u0000strictfp);
            this.Field_30426.Field_7662 = this.Field_30432[32 & 15043].Method_45918() / (143.1579f * 1.78125f);
            this.Field_30426.Field_7654 = this.Field_30432[19465 & 8721].Method_45918() / (0.90425533f * 282.0f);
            this.Field_30426.Field_7659 = this.Field_30432[-26550 & 146].Method_45918() / (30.254236f * 8.428572f);
            this.Field_30429.Method_30479(this.Field_30426);
        } else {
            String string = this.Field_30433.\u0000strictfp;
            int n = Class_30425.Method_30441(this.Field_30431.\u0000strictfp);
            int n2 = Class_30425.Method_30441(this.Field_30428.\u0000strictfp);
            int n3 = Class_30425.Method_30441(this.Field_30427.\u0000strictfp);
            float f = this.Field_30432[21032 & -31744].Method_45918() / (0.011764706f * 21675.0f);
            float f2 = this.Field_30432[-24567 & 5].Method_45918() / (0.73195875f * 348.38028f);
            float f3 = this.Field_30432[4162 & 1802].Method_45918() / (1.548387f * 164.6875f);
            this.Field_30426 = new Class_7651(string, n, n3, n2, (-32571 & 2099) != 0, f, f2, f3);
            if (this.Field_30429 == null) {
                Class_38196 class_38196 = Class_38196.Field_38285;
                class_38196.Method_38411().add(this.Field_30426);
                class_38196.Method_38439();
            } else {
                this.Field_30429.Method_30462(this.Field_30426);
            }
        }
        this.\u0000strictfp.Method_218(this.Field_30429);
    }

    public void Method_30443() {
        Keyboard.enableRepeatEvents((10561 & 17413) != 0);
        for (int i = -32768 & 8625; i < (147 & 3343); ++i) {
            this.Field_30432[i].\u0000= final = this.\u0000= final - (-24385 & 4310) >> (-30703 & 10181);
            this.Field_30432[i].\u0000, for = this.\u0000, ` / (-31869 & 90) + (4756 & 2428) + i * (-31446 & 10251);
            this.\u0000strictfp.add(this.Field_30432[i]);
        }
        this.Field_30433.Method_43123(this.\u0000= final - (-28233 & 9878) >> (16901 & 6313), this.\u0000, ` / (-31862 & 18434) - (184 & 558), 18326 & 8351, 13 & 747);
        this.Field_30431.Method_43123(this.\u0000= final - (18443 & -24022) >> (16001 & 85), this.\u0000, ` / (-9153 & 386) - (2708 & 4189), 5202 & 8668, 777 & -8119);
        this.Field_30428.Method_43123(this.\u0000= final - (20590 & -31606) >> (12833 & 1159), this.\u0000, ` / (9322 & -15742) - (-12018 & 8842), 24666 & 3156, 13321 & 25);
        this.Field_30427.Method_43123(this.\u0000= final - (1099 & 2202) >> (353 & -13183), this.\u0000, ` / (4102 & 3722), -32175 & 2140, -32725 & 12361);
        this.\u0000strictfp.add(this.Field_30433);
        this.\u0000strictfp.add(this.Field_30431);
        this.\u0000strictfp.add(this.Field_30428);
        this.\u0000strictfp.add(this.Field_30427);
        this.Field_30435 = new Class_42876(8960 & -16278, this.\u0000= final / (25618 & 902) - (-30495 & 12871), this.\u0000, ` / (2 & -15866) + (12346 & 16442), -16324 & 3198, -30690 & 8335, "OK");
        this.Field_30434 = new Class_42876(25857 & -30639, this.\u0000= final / (-32510 & 18494) + (1039 & 581), this.\u0000, ` / (227 & 8450) + (1082 & 22587), 318 & 23740, 28879 & 2350, "Cancel");
        this.\u0000strictfp.add(this.Field_30435);
        this.\u0000strictfp.add(this.Field_30434);
    }

    public void Method_30444() {
        Keyboard.enableRepeatEvents((2240 & 1043) != 0);
        super.Method_1533();
    }
}

