/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_28242
extends Class_1490 {
    protected String Field_28243 = "Video Settings";
    private static Class_6340[] Field_28244;
    private boolean Field_28245;
    private Class_1490 Field_28246;
    private int Field_28247 = 23318 & 1;
    private long Field_28248 = 541205857L & -3601649194839506302L;
    private int Field_28249 = 512 & -30588;
    private Class_39702 Field_28250;

    private String[] Method_28251(String string) {
        String[] arrstring;
        if (string.equals("Graphics")) {
            String[] arrstring2 = new String[-28667 & 375];
            arrstring2[-18200 & 1536] = "Visual quality";
            arrstring2[-31559 & 2053] = "  Fast  - lower quality, faster";
            arrstring2[26131 & 226] = "  Fancy - higher quality, slower";
            arrstring2[-18781 & 2119] = "Changes the appearance of clouds, leaves, water,";
            arrstring = arrstring2;
            arrstring2[16549 & 28] = "shadows and grass sides.";
        } else if (string.equals("Render Distance")) {
            String[] arrstring3 = new String[1880 & -8052];
            arrstring3[44 & -31488] = "Visible distance";
            arrstring3[4129 & -16107] = "  2 Tiny - 32m (fastest)";
            arrstring3[194 & 7171] = "  4 Short - 64m (faster)";
            arrstring3[18443 & 8387] = "  8 Normal - 128m";
            arrstring3[8557 & 21508] = "  16 Far - 256m (slower)";
            arrstring3[725 & 1063] = "  32 Extreme - 512m (slowest!)";
            arrstring3[-13690 & 4111] = "The Extreme view distance is very resource demanding!";
            arrstring = arrstring3;
            arrstring3[14471 & -15593] = "Values over 16 Far are only effective in local worlds.";
        } else if (string.equals("Smooth Lighting")) {
            String[] arrstring4 = new String[788 & -32692];
            arrstring4[8704 & 7269] = "Smooth lighting";
            arrstring4[-8029 & 6409] = "  OFF - no smooth lighting (faster)";
            arrstring4[34 & 12803] = "  Minimum - simple smooth lighting (slower)";
            arrstring = arrstring4;
            arrstring4[20615 & 267] = "  Maximum - complex smooth lighting (slowest)";
        } else if (string.equals("Smooth Lighting Level")) {
            String[] arrstring5 = new String[140 & 2309];
            arrstring5[4929 & 1040] = "Smooth lighting level";
            arrstring5[27241 & 23] = "  OFF - no shadows";
            arrstring5[11018 & 20546] = "  50% - light shadows";
            arrstring = arrstring5;
            arrstring5[295 & -28661] = "  100% - dark shadows";
        } else if (string.equals("Max Framerate")) {
            String[] arrstring6 = new String[774 & 8262];
            arrstring6[8200 & -30972] = "Max framerate";
            arrstring6[-27743 & 9227] = "  VSync - limit to monitor framerate (60, 30, 20)";
            arrstring6[538 & 20582] = "  5-255 - variable";
            arrstring6[8387 & 1063] = "  Unlimited - no limit (fastest)";
            arrstring6[19732 & 8324] = "The framerate limit decreases the FPS even if";
            arrstring = arrstring6;
            arrstring6[6533 & -16347] = "the limit value is not reached.";
        } else if (string.equals("View Bobbing")) {
            String[] arrstring7 = new String[610 & 9346];
            arrstring7[8209 & 586] = "More realistic movement.";
            arrstring = arrstring7;
            arrstring7[-31799 & 21509] = "When using mipmaps set it to OFF for best results.";
        } else if (string.equals("GUI Scale")) {
            String[] arrstring8 = new String[2087 & 8842];
            arrstring8[-24527 & 4736] = "GUI Scale";
            arrstring = arrstring8;
            arrstring8[5225 & 19] = "Smaller GUI might be faster";
        } else if (string.equals("Server Textures")) {
            String[] arrstring9 = new String[4114 & 19786];
            arrstring9[18973 & 4450] = "Server textures";
            arrstring = arrstring9;
            arrstring9[65 & 22033] = "Use the resource pack recommended by the server";
        } else if (string.equals("Advanced OpenGL")) {
            String[] arrstring10 = new String[14 & -31481];
            arrstring10[-15800 & 4113] = "Detect and render only visible geometry";
            arrstring10[16901 & 13729] = "  OFF - all geometry is rendered (slower)";
            arrstring10[-23925 & 114] = "  Fast - only visible geometry is rendered (fastest)";
            arrstring10[-24521 & 515] = "  Fancy - conservative, avoids visual artifacts (faster)";
            arrstring10[-29692 & 100] = "The option is available only if it is supported by the ";
            arrstring = arrstring10;
            arrstring10[16967 & 53] = "graphic card.";
        } else if (string.equals("Fog")) {
            String[] arrstring11 = new String[-24026 & 4231];
            arrstring11[-32715 & 8770] = "Fog type";
            arrstring11[2049 & -32579] = "  Fast - faster fog";
            arrstring11[-27878 & 24610] = "  Fancy - slower fog, looks better";
            arrstring11[10851 & 20483] = "  OFF - no fog, fastest";
            arrstring11[6468 & -16202] = "The fancy fog is available only if it is supported by the ";
            arrstring = arrstring11;
            arrstring11[5 & 17095] = "graphic card.";
        } else if (string.equals("Fog Start")) {
            String[] arrstring12 = new String[4133 & 16662];
            arrstring12[21036 & 1169] = "Fog start";
            arrstring12[8449 & 22065] = "  0.2 - the fog starts near the player";
            arrstring12[27402 & 19] = "  0.8 - the fog starts far from the player";
            arrstring = arrstring12;
            arrstring12[8979 & 3239] = "This option usually does not affect the performance.";
        } else if (string.equals("Brightness")) {
            String[] arrstring13 = new String[25207 & 4109];
            arrstring13[1042 & 8320] = "Increases the brightness of darker objects";
            arrstring13[-31199 & 10259] = "  OFF - standard brightness";
            arrstring13[8450 & -32762] = "  100% - maximum brightness for darker objects";
            arrstring13[3211 & -8077] = "This options does not change the brightness of ";
            arrstring = arrstring13;
            arrstring13[4260 & -15859] = "fully black objects";
        } else if (string.equals("Chunk Loading")) {
            String[] arrstring14 = new String[10296 & -28600];
            arrstring14[1027 & 16700] = "Chunk Loading";
            arrstring14[8329 & 16997] = "  Default - unstable FPS when loading chunks";
            arrstring14[19458 & 483] = "  Smooth - stable FPS";
            arrstring14[-32509 & 5851] = "  Multi-Core - stable FPS, 3x faster world loading";
            arrstring14[132 & 24580] = "Smooth and Multi-Core remove the stuttering and ";
            arrstring14[14389 & -15547] = "freezes caused by chunk loading.";
            arrstring14[1550 & 4230] = "Multi-Core can speed up 3x the world loading and";
            arrstring = arrstring14;
            arrstring14[6151 & 8967] = "increase FPS by using a second CPU core.";
        } else if (string.equals("Alternate Blocks")) {
            String[] arrstring15 = new String[9747 & 6639];
            arrstring15[12870 & -29295] = "Alternate Blocks";
            arrstring15[385 & 8273] = "Uses alternative block models for some blocks.";
            arrstring = arrstring15;
            arrstring15[16423 & 7234] = "Depends on the selected resource pack.";
        } else if (string.equals("Use VBOs")) {
            String[] arrstring16 = new String[27907 & 4619];
            arrstring16[0 & 527] = "Vertex Buffer Objects";
            arrstring16[1057 & -29823] = "Uses an alternative rendering model which is usually";
            arrstring = arrstring16;
            arrstring16[22019 & 2146] = "faster (5-10%) than the default rendering.";
        } else if (string.equals("3D Anaglyph")) {
            String[] arrstring17 = new String[-28284 & 2564];
            arrstring17[19969 & 4464] = "3D Anaglyph";
            arrstring17[11537 & 16463] = "Enables a stereoscopic 3D effect using different colors";
            arrstring17[4354 & 38] = "for each eye.";
            arrstring = arrstring17;
            arrstring17[67 & 16535] = "Requires red-cyan glasses for proper viewing.";
        } else {
            arrstring = null;
        }
        return arrstring;
    }

    static {
        Class_6340[] arrclass_6340 = new Class_6340[6238 & 684];
        arrclass_6340[433 & 4] = Class_6340.Field_6345;
        arrclass_6340[1297 & 24747] = Class_6340.Field_6359;
        arrclass_6340[6275 & 25094] = Class_6340.Field_6437;
        arrclass_6340[16579 & 2051] = Class_6340.Field_6448;
        arrclass_6340[-16380 & 3406] = Class_6340.Field_6367;
        arrclass_6340[2565 & 12295] = Class_6340.Field_6439;
        arrclass_6340[17031 & 11334] = Class_6340.Field_6417;
        arrclass_6340[-25569 & 135] = Class_6340.Field_6346;
        arrclass_6340[8329 & -31734] = Class_6340.Field_6440;
        arrclass_6340[16585 & 8717] = Class_6340.Field_6421;
        arrclass_6340[24586 & 842] = Class_6340.Field_6357;
        arrclass_6340[-15585 & 1195] = Class_6340.Field_6438;
        Field_28244 = arrclass_6340;
    }

    public static int Method_28252(Class_42376 class_42376) {
        return class_42376.Field_42380;
    }

    public void Method_28253() {
        String[] arrstring;
        int n;
        this.Field_28243 = Class_9802.Method_9806("options.videoTitle", new Object[-8192 & 2117]);
        this.\u0000strictfp.clear();
        this.Field_28245 = 19532 & -23663;
        String[] arrstring2 = new String[-23789 & 2219];
        arrstring2[9730 & -32352] = "sun.arch.data.model";
        arrstring2[9361 & 9] = "com.ibm.vm.bitmode";
        arrstring2[2310 & 642] = "os.arch";
        String[] arrstring3 = arrstring = arrstring2;
        int n2 = arrstring3.length;
        for (int i = 8748 & 20817; i < n2; ++i) {
            String string = arrstring3[i];
            String string2 = System.getProperty(string);
            if (string2 == null || !string2.contains("64")) continue;
            this.Field_28245 = -30559 & 1309;
            break;
        }
        int n3 = 8521 & 512;
        n2 = !this.Field_28245 ? 275 & -18271 : 2060 & -27583;
        Class_6340[] arrclass_6340 = Field_28244;
        int n4 = arrclass_6340.length;
        int n5 = 21185 & 1052;
        for (n5 = 8320 & 6414; n5 < n4; ++n5) {
            Class_6340 class_6340 = arrclass_6340[n5];
            if (class_6340 == null) continue;
            n = this.\u0000= final / (10835 & -16378) - (-29541 & 16539) + n5 % (9010 & 202) * (22971 & -24416);
            int n6 = this.\u0000, ` / (-27625 & 16582) + (-26377 & 8213) * (n5 / (4695 & 17418)) - (-25586 & 331);
            if (class_6340.Method_6600()) {
                this.\u0000strictfp.add(new Class_45706(class_6340.Method_6705(), n, n6, class_6340));
                continue;
            }
            this.\u0000strictfp.add(new Class_43202(class_6340.Method_6705(), n, n6, class_6340, this.Field_28250.Method_39885(class_6340)));
        }
        int n7 = this.\u0000, ` / (-32250 & 1063) + (21 & 13023) * (Field_28244.length / (16514 & -30713)) - (1164 & 18766);
        n = -32120 & 11286;
        n = this.\u0000= final / (16387 & -31742) - (1439 & 2235) + (-23506 & 2705);
        this.\u0000strictfp.add(new Class_43202(18159 & 10727, n, n7, Class_14688.Method_14697("of.options.shaders")));
        n = this.\u0000= final / (5010 & 10274) - (-24421 & 2559) + (10656 & 16608);
        this.\u0000strictfp.add(new Class_43202(-32294 & 202, n, n7, Class_14688.Method_14697("of.options.quality")));
        n = this.\u0000= final / (20995 & 9542) - (8411 & 4763) + (-32752 & 898);
        this.\u0000strictfp.add(new Class_43202(3289 & 4589, n, n7 += 565 & 16469, Class_14688.Method_14697("of.options.details")));
        n = this.\u0000= final / (-28654 & 8302) - (20155 & -32613) + (3312 & 16544);
        this.\u0000strictfp.add(new Class_43202(501 & 7382, n, n7, Class_14688.Method_14697("of.options.performance")));
        n = this.\u0000= final / (8450 & 4258) - (22751 & 1179) + (12912 & 0);
        this.\u0000strictfp.add(new Class_43202(-32293 & 8407, n, n7 += 16469 & -31819, Class_14688.Method_14697("of.options.animations")));
        n = this.\u0000= final / (2050 & -32254) - (5563 & 16603) + (162 & -19800);
        this.\u0000strictfp.add(new Class_43202(19679 & -32290, n, n7, Class_14688.Method_14697("of.options.other")));
        n7 += 661 & 8213;
        this.\u0000strictfp.add(new Class_42376(8649 & -28470, this.\u0000= final / (8482 & 18458) - (-2331 & 366), this.\u0000, ` / (-23034 & 22806) + (6648 & 8360) + (139 & 17947), Class_9802.Method_9806("gui.done", new Object[4512 & 2576])));
    }

    private void Method_28254() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public static int Method_28255(Class_42376 class_42376) {
        return class_42376.Field_42389;
    }

    public void Method_28256(int n, int n2, float f) {
        this.\u0000, 2();
        this.\u0000strictfp(this.\u0000strictfp, this.Field_28243, this.\u0000= final / (-31702 & 25027), this.Field_28245 ? 9302 & 28 : -14275 & 1285, -251658241 & 201326591);
        if (this.Field_28245 || this.Field_28250.Field_39801 > (-16248 & 14440)) {
            // empty if block
        }
        super.Method_1545(n, n2, f);
        if (Math.abs(n - this.Field_28247) <= (2341 & 581) && Math.abs(n2 - this.Field_28249) <= (-15867 & 9509)) {
            int n3 = -15618 & 7869;
            if (System.currentTimeMillis() >= this.Field_28248 + (long)n3) {
                int n4 = this.\u0000= final / (4866 & 17567) - (2199 & 9110);
                int n5 = this.\u0000, ` / (22 & 11663) - (1173 & -28411);
                if (n2 <= n5 + (-31646 & 6251)) {
                    n5 += 105;
                }
                int n6 = n4 + (-7490 & 1430) + (-16193 & 726);
                int n7 = n5 + (-5924 & 1140) + (1291 & 18446);
                Class_42376 class_42376 = this.Method_28257(n, n2);
                if (class_42376 != null) {
                    String string = this.Method_28258(class_42376.Field_42381);
                    String[] arrstring = this.Method_28251(string);
                    if (arrstring == null) {
                        return;
                    }
                    this.\u0000, `(n4, n5, n6, n7, -469129214 & -111934972, -531625888 & -503118464);
                    for (int i = 1028 & -24512; i < arrstring.length; ++i) {
                        String string2 = arrstring[i];
                        this.\u0000strictfp.Method_28729(string2, n4 + (-22123 & 4173), n5 + (16423 & -32635) + i * (19467 & 363), -1579295265 & 215875037);
                    }
                }
            }
        } else {
            this.Field_28247 = n;
            this.Field_28249 = n2;
            this.Field_28248 = System.currentTimeMillis();
        }
    }

    public Class_28242(Class_1490 class_1490, Class_39702 class_39702) {
        this.Field_28246 = class_1490;
        this.Field_28250 = class_39702;
    }

    private Class_42376 Method_28257(int n, int n2) {
        for (int i = 2344 & -31727; i < this.\u0000strictfp.size(); ++i) {
            int n3;
            Class_42376 class_42376 = (Class_42376)this.\u0000strictfp.get(i);
            int n4 = n3 = n >= class_42376.Field_42391 && n2 >= class_42376.Field_42390 && n < class_42376.Field_42391 + class_42376.Field_42380 && n2 < class_42376.Field_42390 + class_42376.Field_42389 ? 5669 & 8275 : 16386 & -28215;
            if (n3 == 0) continue;
            return class_42376;
        }
        return null;
    }

    private String Method_28258(String string) {
        int n = string.indexOf(5242 & 187);
        return n < 0 ? string : string.substring(-28542 & 3084, n);
    }

    protected void Method_28259(Class_42376 class_42376) {
        if (class_42376.Field_42388) {
            Object object;
            int n = this.Field_28250.Field_39774;
            if (class_42376.Field_42392 < (7369 & 8940) && class_42376 instanceof Class_43202) {
                this.Field_28250.Method_39923(((Class_43202)class_42376).Method_43205(), 323 & -10211);
                class_42376.Field_42381 = this.Field_28250.Method_39885(Class_6340.Method_6715(class_42376.Field_42392));
            }
            if (class_42376.Field_42392 == (5320 & 16603)) {
                this.\u0000strictfp.Field_84.Method_39903();
                this.\u0000strictfp.Method_218(this.Field_28246);
            }
            if (this.Field_28250.Field_39774 != n) {
                object = new Class_31566(this.\u0000strictfp);
                int n2 = ((Class_31566)object).Method_31574();
                int n3 = ((Class_31566)object).Method_31575();
                this.\u0000strictfp(this.\u0000strictfp, n2, n3);
            }
            if (class_42376.Field_42392 == (24783 & 2761)) {
                this.\u0000strictfp.Field_84.Method_39903();
                object = new Class_33596(this, this.Field_28250);
                this.\u0000strictfp.Method_218((Class_1490)object);
            }
            if (class_42376.Field_42392 == (16586 & 714)) {
                this.\u0000strictfp.Field_84.Method_39903();
                object = new Class_24054(this, this.Field_28250);
                this.\u0000strictfp.Method_218((Class_1490)object);
            }
            if (class_42376.Field_42392 == (6363 & 1235)) {
                this.\u0000strictfp.Field_84.Method_39903();
                object = new Class_24934(this, this.Field_28250);
                this.\u0000strictfp.Method_218((Class_1490)object);
            }
            if (class_42376.Field_42392 == (469 & 17628)) {
                this.\u0000strictfp.Field_84.Method_39903();
                object = new Class_27406(this, this.Field_28250);
                this.\u0000strictfp.Method_218((Class_1490)object);
            }
            if (class_42376.Field_42392 == (-14881 & 222)) {
                this.\u0000strictfp.Field_84.Method_39903();
                object = new Class_26888(this, this.Field_28250);
                this.\u0000strictfp.Method_218((Class_1490)object);
            }
            if (class_42376.Field_42392 == (8439 & 1767)) {
                if (Class_19426.Method_19538() || Class_19426.Method_19556()) {
                    Class_19426.Method_19611(Class_14688.Method_14697("of.message.shaders.aa1"), Class_14688.Method_14697("of.message.shaders.aa2"));
                    return;
                }
                if (Class_19426.Method_19612()) {
                    Class_19426.Method_19611(Class_14688.Method_14697("of.message.shaders.af1"), Class_14688.Method_14697("of.message.shaders.af2"));
                    return;
                }
                if (Class_19426.Method_19562()) {
                    Class_19426.Method_19611(Class_14688.Method_14697("of.message.shaders.fr1"), Class_14688.Method_14697("of.message.shaders.fr2"));
                    return;
                }
                if (Class_19426.Method_19571().Field_39747) {
                    Class_19426.Method_19611(Class_14688.Method_14697("of.message.shaders.an1"), Class_14688.Method_14697("of.message.shaders.an2"));
                    return;
                }
                if (!((Boolean)Class_18.Field_89.Field_84.Field_39732.Field_8846.\u0000strictfp()).booleanValue()) {
                    if (Class_9802.Method_9806("language.code", new Object[35 & 29444]).equals("pl_PL")) {
                        Class_19426.Method_19611("Musisz wlaczyc kalkulacje swiatla aby uzywac shaderow.", "Wejdz w opcje BlazingPack -> Kalkulacja swiatla: Tak");
                    } else {
                        Class_19426.Method_19611("You have to enable light calculation to use shaders.", "Go to BlazingPack options -> Calculate Light: Yes");
                    }
                    return;
                }
                this.\u0000strictfp.Field_84.Method_39918(Class_6340.Field_6365, 0.0f);
                this.\u0000strictfp.Field_84.Method_39903();
                object = new Class_30498(this, this.Field_28250);
                this.\u0000strictfp.Method_218((Class_1490)object);
            }
            if (class_42376.Field_42392 == Class_6340.Field_6367.ordinal()) {
                return;
            }
        }
    }
}

