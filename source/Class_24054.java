/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_24054
extends Class_1490 {
    private int Field_24055 = 138 & 27393;
    protected String Field_24056 = "Quality Settings";
    private Class_1490 Field_24057;
    private long Field_24058 = 7505019414069155853L & 393984L;
    private static Class_6340[] Field_24059;
    private int Field_24060 = -23872 & 21780;
    private Class_39702 Field_24061;

    protected void Method_24062(Class_42376 class_42376) {
        if (class_42376.Field_42388) {
            if (class_42376.Field_42392 < (17660 & 8906) && class_42376 instanceof Class_43202) {
                this.Field_24061.Method_39923(((Class_43202)class_42376).Method_43205(), -28319 & 11291);
                class_42376.Field_42381 = this.Field_24061.Method_39885(Class_6340.Method_6715(class_42376.Field_42392));
            }
            if (class_42376.Field_42392 == (458 & 26829)) {
                this.\u0000strictfp.Field_84.Method_39903();
                this.\u0000strictfp.Method_218(this.Field_24057);
            }
            if (class_42376.Field_42392 != Class_6340.Field_6390.ordinal()) {
                Class_31566 class_31566 = new Class_31566(this.\u0000strictfp);
                int n = class_31566.Method_31574();
                int n2 = class_31566.Method_31575();
                this.\u0000strictfp(this.\u0000strictfp, n, n2);
            }
        }
    }

    private Class_42376 Method_24063(int n, int n2) {
        for (int i = -30490 & 16385; i < this.\u0000strictfp.size(); ++i) {
            int n3;
            Class_42376 class_42376 = (Class_42376)this.\u0000strictfp.get(i);
            int n4 = Class_28242.Method_28252(class_42376);
            int n5 = Class_28242.Method_28255(class_42376);
            int n6 = n3 = n >= class_42376.Field_42391 && n2 >= class_42376.Field_42390 && n < class_42376.Field_42391 + n4 && n2 < class_42376.Field_42390 + n5 ? 4675 & 1197 : -14336 & 8612;
            if (n3 == 0) continue;
            return class_42376;
        }
        return null;
    }

    public Class_24054(Class_1490 class_1490, Class_39702 class_39702) {
        this.Field_24057 = class_1490;
        this.Field_24061 = class_39702;
    }

    static {
        Class_6340[] arrclass_6340 = new Class_6340[16527 & 12607];
        arrclass_6340[17421 & 2560] = Class_6340.Field_6365;
        arrclass_6340[-7079 & 4483] = Class_6340.Field_6366;
        arrclass_6340[6178 & 18243] = Class_6340.Field_6426;
        arrclass_6340[-26581 & 259] = Class_6340.Field_6423;
        arrclass_6340[12308 & 16620] = Class_6340.Field_6385;
        arrclass_6340[4101 & -29435] = Class_6340.Field_6415;
        arrclass_6340[9542 & -28154] = Class_6340.Field_6395;
        arrclass_6340[6663 & -7161] = Class_6340.Field_6380;
        arrclass_6340[-18004 & 8] = Class_6340.Field_6425;
        arrclass_6340[1033 & -32499] = Class_6340.Field_6391;
        arrclass_6340[5898 & -32690] = Class_6340.Field_6389;
        arrclass_6340[-32757 & 203] = Class_6340.Field_6436;
        arrclass_6340[78 & -4964] = Class_6340.Field_6412;
        arrclass_6340[18813 & 13] = Class_6340.Field_6392;
        arrclass_6340[831 & 5134] = Class_6340.Field_6396;
        Field_24059 = arrclass_6340;
    }

    private String[] Method_24064(String string) {
        String[] arrstring;
        if (string.equals("Mipmap Levels")) {
            String[] arrstring2 = new String[3078 & 21103];
            arrstring2[8288 & -32108] = "Visual effect which makes distant objects look better";
            arrstring2[21019 & 33] = "by smoothing the texture details";
            arrstring2[-27614 & 2330] = "  OFF - no smoothing";
            arrstring2[20555 & 10275] = "  1 - minimum smoothing";
            arrstring2[5412 & -32548] = "  4 - maximum smoothing";
            arrstring = arrstring2;
            arrstring2[-32147 & 18437] = "This option usually does not affect the performance.";
        } else if (string.equals("Mipmap Type")) {
            String[] arrstring3 = new String[-30705 & 16534];
            arrstring3[26806 & -32768] = "Visual effect which makes distant objects look better";
            arrstring3[2697 & 9235] = "by smoothing the texture details";
            arrstring3[17298 & -32757] = "  Nearest - rough smoothing (fastest)";
            arrstring3[-23157 & 18535] = "  Linear - normal smoothing";
            arrstring3[18453 & 580] = "  Bilinear - fine smoothing";
            arrstring = arrstring3;
            arrstring3[10373 & 853] = "  Trilinear - finest smoothing (slowest)";
        } else if (string.equals("Anisotropic Filtering")) {
            String[] arrstring4 = new String[654 & -16362];
            arrstring4[-32736 & 21004] = "Anisotropic Filtering";
            arrstring4[-28655 & 449] = " OFF - (default) standard texture detail (faster)";
            arrstring4[13830 & -32742] = " 2-16 - finer details in mipmapped textures (slower)";
            arrstring4[18435 & 1099] = "The Anisotropic Filtering restores details in";
            arrstring4[4357 & 566] = "mipmapped textures.";
            arrstring = arrstring4;
            arrstring4[17415 & -26179] = "When enabled it may substantially decrease the FPS.";
        } else if (string.equals("Antialiasing")) {
            String[] arrstring5 = new String[24600 & 5422];
            arrstring5[4132 & -31536] = "Antialiasing";
            arrstring5[8225 & 16411] = " OFF - (default) no antialiasing (faster)";
            arrstring5[17154 & -32638] = " 2-16 - antialiased lines and edges (slower)";
            arrstring5[8195 & -16053] = "The Antialiasing smooths jagged lines and ";
            arrstring5[2117 & -12028] = "sharp color transitions.";
            arrstring5[19511 & -32251] = "When enabled it may substantially decrease the FPS.";
            arrstring5[2102 & -15801] = "Not all levels are supported by all graphics cards.";
            arrstring = arrstring5;
            arrstring5[8711 & -26609] = "Effective after a RESTART!";
        } else if (string.equals("Clear Water")) {
            String[] arrstring6 = new String[1031 & -22005];
            arrstring6[10816 & 1024] = "Clear Water";
            arrstring6[-31719 & 327] = "  ON - clear, transparent water";
            arrstring = arrstring6;
            arrstring6[18434 & -20346] = "  OFF - default water";
        } else if (string.equals("Better Grass")) {
            String[] arrstring7 = new String[16644 & 5685];
            arrstring7[6682 & 24576] = "Better Grass";
            arrstring7[33 & 129] = "  OFF - default side grass texture, fastest";
            arrstring7[10242 & 5315] = "  Fast - full side grass texture, slower";
            arrstring = arrstring7;
            arrstring7[18467 & -32425] = "  Fancy - dynamic side grass texture, slowest";
        } else if (string.equals("Better Snow")) {
            String[] arrstring8 = new String[1349 & 12837];
            arrstring8[0 & 31776] = "Better Snow";
            arrstring8[-31223 & 33] = "  OFF - default snow, faster";
            arrstring8[290 & -14826] = "  ON - better snow, slower";
            arrstring8[2319 & 4611] = "Shows snow under transparent blocks (fence, tall grass)";
            arrstring = arrstring8;
            arrstring8[516 & 19854] = "when bordering with snow blocks";
        } else if (string.equals("Random Mobs")) {
            String[] arrstring9 = new String[2567 & -28283];
            arrstring9[10762 & 16768] = "Random Mobs";
            arrstring9[8267 & 7169] = "  OFF - no random mobs, faster";
            arrstring9[4418 & 17446] = "  ON - random mobs, slower";
            arrstring9[3 & -24053] = "Random mobs uses random textures for the game creatures.";
            arrstring = arrstring9;
            arrstring9[10757 & 4388] = "It needs a texture pack which has multiple mob textures.";
        } else if (string.equals("Swamp Colors")) {
            String[] arrstring10 = new String[15132 & 16453];
            arrstring10[6180 & 1610] = "Swamp Colors";
            arrstring10[8259 & 5409] = "  ON - use swamp colors (default), slower";
            arrstring10[1542 & 14410] = "  OFF - do not use swamp colors, faster";
            arrstring = arrstring10;
            arrstring10[9759 & 4227] = "The swamp colors affect grass, leaves, vines and water.";
        } else if (string.equals("Smooth Biomes")) {
            String[] arrstring11 = new String[2063 & 518];
            arrstring11[-32020 & 16384] = "Smooth Biomes";
            arrstring11[32329 & 389] = "  ON - smoothing of biome borders (default), slower";
            arrstring11[-11770 & 2122] = "  OFF - no smoothing of biome borders, faster";
            arrstring11[-32253 & 8219] = "The smoothing of biome borders is done by sampling and";
            arrstring11[532 & 25069] = "averaging the color of all surrounding blocks.";
            arrstring = arrstring11;
            arrstring11[-24171 & 6693] = "Affected are grass, leaves, vines and water.";
        } else if (string.equals("Custom Fonts")) {
            String[] arrstring12 = new String[4101 & 9189];
            arrstring12[-32768 & 16865] = "Custom Fonts";
            arrstring12[20497 & -32253] = "  ON - uses custom fonts (default), slower";
            arrstring12[-8178 & 2818] = "  OFF - uses default font, faster";
            arrstring12[-14329 & 8707] = "The custom fonts are supplied by the current";
            arrstring = arrstring12;
            arrstring12[-23548 & 293] = "texture pack";
        } else if (string.equals("Custom Colors")) {
            String[] arrstring13 = new String[-23289 & 16453];
            arrstring13[-12248 & 2560] = "Custom Colors";
            arrstring13[-28399 & 15] = "  ON - uses custom colors (default), slower";
            arrstring13[13059 & 3310] = "  OFF - uses default colors, faster";
            arrstring13[-11757 & 2055] = "The custom colors are supplied by the current";
            arrstring = arrstring13;
            arrstring13[-32636 & 4460] = "texture pack";
        } else if (string.equals("Show Capes")) {
            String[] arrstring14 = new String[3 & 11];
            arrstring14[534 & 11560] = "Show Capes";
            arrstring14[4949 & 10379] = "  ON - show player capes (default)";
            arrstring = arrstring14;
            arrstring14[18595 & 8706] = "  OFF - do not show player capes";
        } else if (string.equals("Connected Textures")) {
            String[] arrstring15 = new String[-17624 & 17423];
            arrstring15[20 & 24866] = "Connected Textures";
            arrstring15[20601 & 10247] = "  OFF - no connected textures (default)";
            arrstring15[-24254 & 20615] = "  Fast - fast connected textures";
            arrstring15[-9149 & 283] = "  Fancy - fancy connected textures";
            arrstring15[900 & 24583] = "Connected textures joins the textures of glass,";
            arrstring15[9301 & -10227] = "sandstone and bookshelves when placed next to";
            arrstring15[6151 & -16354] = "each other. The connected textures are supplied";
            arrstring = arrstring15;
            arrstring15[615 & 8199] = "by the current texture pack.";
        } else if (string.equals("Far View")) {
            String[] arrstring16 = new String[-32729 & 31239];
            arrstring16[1024 & 448] = "Far View";
            arrstring16[257 & -30167] = " OFF - (default) standard view distance";
            arrstring16[43 & 3154] = " ON - 3x view distance";
            arrstring16[579 & 1155] = "Far View is very resource demanding!";
            arrstring16[-32475 & 1620] = "3x view distance => 9x chunks to be loaded => FPS / 9";
            arrstring16[9733 & 20503] = "Standard view distances: 32, 64, 128, 256";
            arrstring = arrstring16;
            arrstring16[654 & -14266] = "Far view distances: 96, 192, 384, 512";
        } else if (string.equals("Natural Textures")) {
            String[] arrstring17 = new String[28940 & -31671];
            arrstring17[16608 & 1792] = "Natural Textures";
            arrstring17[20565 & -23519] = "  OFF - no natural textures (default)";
            arrstring17[690 & 7182] = "  ON - use natural textures";
            arrstring17[4379 & 11299] = "Natural textures remove the gridlike pattern";
            arrstring17[86 & 6788] = "created by repeating blocks of the same type.";
            arrstring17[14709 & -31729] = "It uses rotated and flipped variants of the base";
            arrstring17[814 & 6150] = "block texture. The configuration for the natural";
            arrstring = arrstring17;
            arrstring17[-27609 & 2071] = "textures is supplied by the current texture pack";
        } else if (string.equals("Custom Sky")) {
            String[] arrstring18 = new String[-29561 & 357];
            arrstring18[-18368 & 1070] = "Custom Sky";
            arrstring18[593 & 24579] = "  ON - custom sky textures (default), slow";
            arrstring18[3842 & -32574] = "  OFF - default sky, faster";
            arrstring18[10411 & -16365] = "The custom sky textures are supplied by the current";
            arrstring = arrstring18;
            arrstring18[9228 & 16708] = "texture pack";
        } else {
            arrstring = null;
        }
        return arrstring;
    }

    private void Method_24065() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_24066(int n, int n2, float f) {
        this.\u0000, 2();
        this.\u0000strictfp(this.\u0000strictfp, this.Field_24056, this.\u0000= final / (9450 & -32237), -27748 & 84, 83886079 & 1509949439);
        super.Method_1545(n, n2, f);
        if (Math.abs(n - this.Field_24060) <= (5127 & -31995) && Math.abs(n2 - this.Field_24055) <= (85 & 15917)) {
            int n3 = 1725 & 6846;
            if (System.currentTimeMillis() >= this.Field_24058 + (long)n3) {
                int n4 = this.\u0000= final / (17418 & -30270) - (20638 & 2262);
                int n5 = this.\u0000, ` / (4622 & 3398) - (-15249 & 645);
                if (n2 <= n5 + (12518 & -31901)) {
                    n5 += 105;
                }
                int n6 = n4 + (1694 & 20630) + (15511 & -32586);
                int n7 = n5 + (84 & -23467) + (1674 & 4223);
                Class_42376 class_42376 = this.Method_24063(n, n2);
                if (class_42376 != null) {
                    String string = this.Method_24068(class_42376.Field_42381);
                    String[] arrstring = this.Method_24064(string);
                    if (arrstring == null) {
                        return;
                    }
                    this.\u0000, `(n4, n5, n6, n7, -140506938 & -536653784, -501864176 & -117370207);
                    for (int i = -16123 & 2752; i < arrstring.length; ++i) {
                        String string2 = arrstring[i];
                        int n8 = 64871901 & 14671327;
                        if (string2.endsWith("!")) {
                            n8 = 218046516 & -2097208661;
                        }
                        this.\u0000strictfp.Method_28729(string2, n4 + (-23483 & 16527), n5 + (53 & 21575) + i * (1067 & 4187), n8);
                    }
                }
            }
        } else {
            this.Field_24060 = n;
            this.Field_24055 = n2;
            this.Field_24058 = System.currentTimeMillis();
        }
    }

    public void Method_24067() {
        int n = 4 & 1201;
        Class_6340[] arrclass_6340 = Field_24059;
        int n2 = arrclass_6340.length;
        for (int i = 78 & -23519; i < n2; ++i) {
            Class_6340 class_6340 = arrclass_6340[i];
            int n3 = this.\u0000= final / (5387 & -32766) - (2207 & 251) + n % (8998 & 1034) * (2208 & -30733);
            int n4 = this.\u0000, ` / (-28385 & 9798) + (-30499 & 20759) * (n / (10658 & -32758)) - (-16246 & 810);
            if (!class_6340.Method_6600()) {
                Class_43202 class_43202 = new Class_43202(class_6340.Method_6705(), n3, n4, class_6340, this.Field_24061.Method_39885(class_6340));
                if (class_6340 == Class_6340.Field_6412) {
                    class_43202.\u0000strictfp = 16896 & 9646;
                }
                this.\u0000strictfp.add(class_43202);
            } else {
                this.\u0000strictfp.add(new Class_45706(class_6340.Method_6705(), n3, n4, class_6340));
            }
            ++n;
        }
        this.\u0000strictfp.add(new Class_42376(-29752 & 12504, this.\u0000= final / (4619 & 2050) - (12397 & 18550), this.\u0000, ` / (6 & 2583) + (4266 & -32263) + (3083 & 15), Class_9802.Method_9806("gui.done", new Object[6689 & 192])));
    }

    private String Method_24068(String string) {
        int n = string.indexOf(4154 & 8890);
        return n < 0 ? string : string.substring(8837 & 16410, n);
    }
}

