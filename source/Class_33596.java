/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_33596
extends Class_1490 {
    private Class_1490 Field_33597;
    private int Field_33598 = 560 & 6404;
    private long Field_33599 = 545392653L & -8784224472768134576L;
    protected String Field_33600 = "Detail Settings";
    private static Class_6340[] Field_33601;
    private Class_39702 Field_33602;
    private int Field_33603 = 26642 & 132;

    static {
        Class_6340[] arrclass_6340 = new Class_6340[12493 & 1053];
        arrclass_6340[27786 & 625] = Class_6340.Field_6381;
        arrclass_6340[18689 & -31657] = Class_6340.Field_6390;
        arrclass_6340[-30381 & 1026] = Class_6340.Field_6358;
        arrclass_6340[-19245 & 515] = Class_6340.Field_6428;
        arrclass_6340[10270 & 1156] = Class_6340.Field_6405;
        arrclass_6340[143 & 5] = Class_6340.Field_6418;
        arrclass_6340[3223 & 782] = Class_6340.Field_6408;
        arrclass_6340[335 & 18055] = Class_6340.Field_6378;
        arrclass_6340[-28499 & 330] = Class_6340.Field_6452;
        arrclass_6340[18505 & 12329] = Class_6340.Field_6352;
        arrclass_6340[-29430 & 16910] = Class_6340.Field_6372;
        arrclass_6340[-22325 & 1039] = Class_6340.Field_6341;
        arrclass_6340[12 & -948] = Class_6340.Field_6354;
        Field_33601 = arrclass_6340;
    }

    public void Method_33604(int n, int n2, float f) {
        this.\u0000, 2();
        this.\u0000strictfp(this.\u0000strictfp, this.Field_33600, this.\u0000= final / (-22974 & 50), 5684 & -32484, 570425343 & -922746881);
        super.Method_1545(n, n2, f);
        if (Math.abs(n - this.Field_33598) <= (-30715 & 9349) && Math.abs(n2 - this.Field_33603) <= (197 & 17693)) {
            int n3 = 2748 & -32067;
            if (System.currentTimeMillis() >= this.Field_33599 + (long)n3) {
                int n4 = this.\u0000= final / (-30718 & 8487) - (406 & 2198);
                int n5 = this.\u0000, ` / (2598 & 29710) - (12317 & -30267);
                if (n2 <= n5 + (378 & -15769)) {
                    n5 += 105;
                }
                int n6 = n4 + (734 & 4278) + (8414 & -32585);
                int n7 = n5 + (6996 & -16297) + (3614 & 16394);
                Class_42376 class_42376 = this.Method_33610(n, n2);
                if (class_42376 != null) {
                    String string = this.Method_33608(class_42376.Field_42381);
                    String[] arrstring = this.Method_33607(string);
                    if (arrstring == null) {
                        return;
                    }
                    this.\u0000, `(n4, n5, n6, n7, -528449024 & -316599033, -503152376 & -513534751);
                    for (int i = 10242 & 4192; i < arrstring.length; ++i) {
                        String string2 = arrstring[i];
                        this.\u0000strictfp.Method_28729(string2, n4 + (2349 & 1733), n5 + (26021 & -32699) + i * (24603 & 11), -723649057 & 14540765);
                    }
                }
            }
        } else {
            this.Field_33598 = n;
            this.Field_33603 = n2;
            this.Field_33599 = System.currentTimeMillis();
        }
    }

    public void Method_33605() {
        int n = -29632 & 8463;
        Class_6340[] arrclass_6340 = Field_33601;
        int n2 = arrclass_6340.length;
        for (int i = 3077 & 16640; i < n2; ++i) {
            Class_6340 class_6340 = arrclass_6340[i];
            int n3 = this.\u0000= final / (-30701 & 9350) - (16571 & -24097) + n % (9271 & -26430) * (-27414 & 16800);
            int n4 = this.\u0000, ` / (4118 & 166) + (21791 & 149) * (n / (-13738 & 2)) - (16906 & 8511);
            if (!class_6340.Method_6600()) {
                this.\u0000strictfp.add(new Class_43202(class_6340.Method_6705(), n3, n4, class_6340, this.Field_33602.Method_39885(class_6340)));
            } else {
                this.\u0000strictfp.add(new Class_45706(class_6340.Method_6705(), n3, n4, class_6340));
            }
            ++n;
        }
        this.\u0000strictfp.add(new Class_42376(2280 & -15139, this.\u0000= final / (-28670 & 1034) - (-20378 & 1124), this.\u0000, ` / (-22993 & 70) + (8360 & 17064) + (1103 & 2571), Class_9802.Method_9806("gui.done", new Object[84 & 14881])));
    }

    protected void Method_33606(Class_42376 class_42376) {
        if (class_42376.Field_42388) {
            if (class_42376.Field_42392 < (18922 & 220) && class_42376 instanceof Class_43202) {
                this.Field_33602.Method_39923(((Class_43202)class_42376).Method_43205(), 16659 & 2697);
                class_42376.Field_42381 = this.Field_33602.Method_39885(Class_6340.Method_6715(class_42376.Field_42392));
            }
            if (class_42376.Field_42392 == (16616 & -32567)) {
                this.\u0000strictfp.Field_84.Method_39903();
                this.\u0000strictfp.Method_218(this.Field_33597);
            }
            if (class_42376.Field_42392 != Class_6340.Field_6390.ordinal()) {
                Class_31566 class_31566 = new Class_31566(this.\u0000strictfp);
                int n = class_31566.Method_31574();
                int n2 = class_31566.Method_31575();
                this.\u0000strictfp(this.\u0000strictfp, n, n2);
            }
        }
    }

    private String[] Method_33607(String string) {
        String[] arrstring;
        if (string.equals("Clouds")) {
            String[] arrstring2 = new String[3215 & -24553];
            arrstring2[1073 & 25156] = "Clouds";
            arrstring2[257 & -3539] = "  Default - as set by setting Graphics";
            arrstring2[98 & 5270] = "  Fast - lower quality, faster";
            arrstring2[16435 & 771] = "  Fancy - higher quality, slower";
            arrstring2[1028 & -30452] = "  OFF - no clouds, fastest";
            arrstring2[389 & -13731] = "Fast clouds are rendered 2D.";
            arrstring = arrstring2;
            arrstring2[8870 & 1094] = "Fancy clouds are rendered 3D.";
        } else if (string.equals("Cloud Height")) {
            String[] arrstring3 = new String[6275 & -31965];
            arrstring3[10243 & 5184] = "Cloud Height";
            arrstring3[16897 & 9489] = "  OFF - default height";
            arrstring = arrstring3;
            arrstring3[-32254 & 2414] = "  100% - above world height limit";
        } else if (string.equals("Trees")) {
            String[] arrstring4 = new String[9239 & 2190];
            arrstring4[-30125 & 420] = "Trees";
            arrstring4[-16379 & 1283] = "  Default - as set by setting Graphics";
            arrstring4[16394 & 13411] = "  Fast - lower quality, faster";
            arrstring4[2063 & 3] = "  Fancy - higher quality, slower";
            arrstring4[18453 & 13998] = "Fast trees have opaque leaves.";
            arrstring = arrstring4;
            arrstring4[279 & 30733] = "Fancy trees have transparent leaves.";
        } else if (string.equals("Grass")) {
            String[] arrstring5 = new String[16399 & -28922];
            arrstring5[17 & 128] = "Grass";
            arrstring5[-22475 & 21897] = "  Default - as set by setting Graphics";
            arrstring5[-14174 & 70] = "  Fast - lower quality, faster";
            arrstring5[4371 & 2283] = "  Fancy - higher quality, slower";
            arrstring5[-22436 & 548] = "Fast grass uses default side texture.";
            arrstring = arrstring5;
            arrstring5[1029 & 4357] = "Fancy grass uses biome side texture.";
        } else if (string.equals("Dropped Items")) {
            String[] arrstring6 = new String[198 & -25579];
            arrstring6[18688 & 542] = "Dropped Items";
            arrstring6[13381 & 137] = "  Default - as set by setting Graphics";
            arrstring6[1031 & -23958] = "  Fast - 2D dropped items, faster";
            arrstring = arrstring6;
            arrstring6[1027 & -32733] = "  Fancy - 3D dropped items, slower";
        } else if (string.equals("Water")) {
            String[] arrstring7 = new String[8455 & 1102];
            arrstring7[-24444 & 1538] = "Water";
            arrstring7[18579 & 9541] = "  Default - as set by setting Graphics";
            arrstring7[14983 & 1058] = "  Fast  - lower quality, faster";
            arrstring7[1319 & 91] = "  Fancy - higher quality, slower";
            arrstring7[460 & 26630] = "Fast water (1 pass) has some visual artifacts";
            arrstring = arrstring7;
            arrstring7[18375 & 12293] = "Fancy water (2 pass) has no visual artifacts";
        } else if (string.equals("Rain & Snow")) {
            String[] arrstring8 = new String[6407 & 1143];
            arrstring8[-19440 & 18437] = "Rain & Snow";
            arrstring8[16389 & 8033] = "  Default - as set by setting Graphics";
            arrstring8[8386 & -31222] = "  Fast  - light rain/snow, faster";
            arrstring8[-12245 & 2583] = "  Fancy - heavy rain/snow, slower";
            arrstring8[4870 & 69] = "  OFF - no rain/snow, fastest";
            arrstring8[-22907 & 16687] = "When rain is OFF the splashes and rain sounds";
            arrstring = arrstring8;
            arrstring8[-32018 & 9222] = "are still active.";
        } else if (string.equals("Sky")) {
            String[] arrstring9 = new String[436 & 22532];
            arrstring9[261 & -32758] = "Sky";
            arrstring9[3077 & 529] = "  ON - sky is visible, slower";
            arrstring9[16678 & -28142] = "  OFF  - sky is not visible, faster";
            arrstring = arrstring9;
            arrstring9[9303 & 23179] = "When sky is OFF the moon and sun are still visible.";
        } else if (string.equals("Sun & Moon")) {
            String[] arrstring10 = new String[19331 & 3];
            arrstring10[16384 & -30496] = "Sun & Moon";
            arrstring10[4481 & -24571] = "  ON - sun and moon are visible (default)";
            arrstring = arrstring10;
            arrstring10[1062 & 6811] = "  OFF  - sun and moon are not visible (faster)";
        } else if (string.equals("Stars")) {
            String[] arrstring11 = new String[-24245 & 18439];
            arrstring11[18433 & -24552] = "Stars";
            arrstring11[-20475 & 353] = "  ON - stars are visible, slower";
            arrstring = arrstring11;
            arrstring11[16419 & 7362] = "  OFF  - stars are not visible, faster";
        } else if (string.equals("Depth Fog")) {
            String[] arrstring12 = new String[-30613 & 8343];
            arrstring12[2048 & -28671] = "Depth Fog";
            arrstring12[16915 & 3073] = "  ON - fog moves closer at bedrock levels (default)";
            arrstring = arrstring12;
            arrstring12[10819 & 4234] = "  OFF - same fog at all levels";
        } else if (string.equals("Show Capes")) {
            String[] arrstring13 = new String[6147 & 25799];
            arrstring13[18944 & 1056] = "Show Capes";
            arrstring13[2165 & -11767] = "  ON - show player capes (default)";
            arrstring = arrstring13;
            arrstring13[-32250 & 21531] = "  OFF - do not show player capes";
        } else if (string.equals("Held Item Tooltips")) {
            String[] arrstring14 = new String[-20349 & 16907];
            arrstring14[-27571 & 16416] = "Held item tooltips";
            arrstring14[1 & 29065] = "  ON - show tooltips for held items (default)";
            arrstring = arrstring14;
            arrstring14[16402 & -21245] = "  OFF - do not show tooltips for held items";
        } else if (string.equals("Translucent Blocks")) {
            String[] arrstring15 = new String[16502 & -21490];
            arrstring15[116 & 8960] = "Translucent Blocks";
            arrstring15[1281 & 16917] = "  Fancy - correct color blending (default)";
            arrstring15[-22370 & 578] = "  Fast - fast color blending (faster)";
            arrstring15[3 & 2059] = "Controls the color blending of translucent blocks";
            arrstring15[1684 & -24284] = "with different color (stained glass, water, ice)";
            arrstring = arrstring15;
            arrstring15[-32473 & 25109] = "when placed behind each other with air between them.";
        } else if (string.equals("Vignette")) {
            String[] arrstring16 = new String[-28133 & 460];
            arrstring16[-22428 & 1024] = "Visual effect which slightly darkens the screen corners";
            arrstring16[17033 & 11301] = "  Default - as set by the setting Graphics (default)";
            arrstring16[-32634 & 21066] = "  Fast - vignette disabled (faster)";
            arrstring16[419 & -3501] = "  Fancy - vignette enabled (slower)";
            arrstring16[-15291 & 14] = "The vignette may have a significant effect on the FPS,";
            arrstring16[4149 & 773] = "especially when playing fullscreen.";
            arrstring16[-23930 & 6190] = "The vignette effect is very subtle and can safely";
            arrstring = arrstring16;
            arrstring16[16679 & 199] = "be disabled";
        } else {
            arrstring = null;
        }
        return arrstring;
    }

    private String Method_33608(String string) {
        int n = string.indexOf(-24517 & 4282);
        return n < 0 ? string : string.substring(2065 & -32756, n);
    }

    private void Method_33609() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private Class_42376 Method_33610(int n, int n2) {
        for (int i = 4116 & -22136; i < this.\u0000strictfp.size(); ++i) {
            int n3;
            Class_42376 class_42376 = (Class_42376)this.\u0000strictfp.get(i);
            int n4 = Class_28242.Method_28252(class_42376);
            int n5 = Class_28242.Method_28255(class_42376);
            int n6 = n3 = n >= class_42376.Field_42391 && n2 >= class_42376.Field_42390 && n < class_42376.Field_42391 + n4 && n2 < class_42376.Field_42390 + n5 ? -14335 & 4177 : 10240 & -16088;
            if (n3 == 0) continue;
            return class_42376;
        }
        return null;
    }

    public Class_33596(Class_1490 class_1490, Class_39702 class_39702) {
        this.Field_33597 = class_1490;
        this.Field_33602 = class_39702;
    }
}

