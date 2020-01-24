/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_26888
extends Class_1490
implements Class_1549 {
    private Class_39702 Field_26889;
    private long Field_26890 = -5733973599522332352L & 5733973598205641393L;
    private Class_1490 Field_26891;
    protected String Field_26892 = "Other Settings";
    private int Field_26893 = 4289 & 10514;
    private int Field_26894 = 200 & 24610;
    private static Class_6340[] Field_26895;

    public void Method_26896(int n, int n2, float f) {
        this.\u0000, 2();
        this.\u0000strictfp(this.\u0000strictfp, this.Field_26892, this.\u0000= final / (3586 & -16314), -9964 & 1597, -2063597569 & 301989887);
        super.Method_1545(n, n2, f);
        if (Math.abs(n - this.Field_26894) <= (17447 & 2309) && Math.abs(n2 - this.Field_26893) <= (269 & 1109)) {
            int n3 = 21436 & 766;
            if (System.currentTimeMillis() >= this.Field_26890 + (long)n3) {
                int n4 = this.\u0000= final / (11290 & -32762) - (22487 & 8374);
                int n5 = this.\u0000, ` / (-24538 & 16727) - (3349 & 12303);
                if (n2 <= n5 + (-1294 & 1127)) {
                    n5 += 105;
                }
                int n6 = n4 + (1462 & 8342) + (-32618 & 159);
                int n7 = n5 + (220 & -2986) + (3114 & -32242);
                Class_42376 class_42376 = this.Method_26900(n, n2);
                if (class_42376 != null) {
                    String string = this.Method_26903(class_42376.Field_42381);
                    String[] arrstring = this.Method_26902(string);
                    if (arrstring == null) {
                        return;
                    }
                    this.\u0000, `(n4, n5, n6, n7, -519544320 & -395109211, -374441843 & -264207840);
                    for (int i = 0 & 144; i < arrstring.length; ++i) {
                        String string2 = arrstring[i];
                        this.\u0000strictfp.Method_28729(string2, n4 + (12869 & -29537), n5 + (-9049 & 285) + i * (25275 & 2123), -2130715171 & 282976253);
                    }
                }
            }
        } else {
            this.Field_26894 = n;
            this.Field_26893 = n2;
            this.Field_26890 = System.currentTimeMillis();
        }
    }

    public Class_26888(Class_1490 class_1490, Class_39702 class_39702) {
        this.Field_26891 = class_1490;
        this.Field_26889 = class_39702;
    }

    public void Method_26897(boolean bl, int n) {
        if (bl) {
            this.\u0000strictfp.Field_84.Method_39911();
        }
        this.\u0000strictfp.Method_218(this);
    }

    protected void Method_26898(Class_42376 class_42376) {
        if (class_42376.Field_42388) {
            Object object;
            if (class_42376.Field_42392 < (2793 & -32564) && class_42376 instanceof Class_43202) {
                this.Field_26889.Method_39923(((Class_43202)class_42376).Method_43205(), -27375 & 10273);
                class_42376.Field_42381 = this.Field_26889.Method_39885(Class_6340.Method_6715(class_42376.Field_42392));
            }
            if (class_42376.Field_42392 == (-19767 & 234)) {
                this.\u0000strictfp.Field_84.Method_39903();
                this.\u0000strictfp.Method_218(this.Field_26891);
            }
            if (class_42376.Field_42392 == (14294 & 218)) {
                this.\u0000strictfp.Field_84.Method_39903();
                object = new Class_1792(this, "Reset all video settings to their default values?", "", 12047 & 10239);
                this.\u0000strictfp.Method_218((Class_1490)object);
            }
            if (class_42376.Field_42392 != Class_6340.Field_6390.ordinal()) {
                object = new Class_31566(this.\u0000strictfp);
                int n = ((Class_31566)object).Method_31574();
                int n2 = ((Class_31566)object).Method_31575();
                this.\u0000strictfp(this.\u0000strictfp, n, n2);
            }
        }
    }

    static {
        Class_6340[] arrclass_6340 = new Class_6340[1342 & -30199];
        arrclass_6340[144 & 20559] = Class_6340.Field_6435;
        arrclass_6340[16903 & 8201] = Class_6340.Field_6394;
        arrclass_6340[17778 & 8198] = Class_6340.Field_6441;
        arrclass_6340[13059 & -15357] = Class_6340.Field_6383;
        arrclass_6340[21525 & 10310] = Class_6340.Field_6401;
        arrclass_6340[517 & -14195] = Class_6340.Field_6411;
        arrclass_6340[4119 & 558] = Class_6340.Field_6344;
        arrclass_6340[4311 & 1031] = Class_6340.Field_6429;
        Field_26895 = arrclass_6340;
    }

    private void Method_26899() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private Class_42376 Method_26900(int n, int n2) {
        for (int i = 16920 & -31417; i < this.\u0000strictfp.size(); ++i) {
            int n3;
            Class_42376 class_42376 = (Class_42376)this.\u0000strictfp.get(i);
            int n4 = Class_28242.Method_28252(class_42376);
            int n5 = Class_28242.Method_28255(class_42376);
            int n6 = n3 = n >= class_42376.Field_42391 && n2 >= class_42376.Field_42390 && n < class_42376.Field_42391 + n4 && n2 < class_42376.Field_42390 + n5 ? 18437 & 14193 : 4160 & 3620;
            if (n3 == 0) continue;
            return class_42376;
        }
        return null;
    }

    public void Method_26901() {
        int n = -28651 & 1792;
        Class_6340[] arrclass_6340 = Field_26895;
        int n2 = arrclass_6340.length;
        for (int i = 28171 & -28448; i < n2; ++i) {
            Class_6340 class_6340 = arrclass_6340[i];
            int n3 = this.\u0000= final / (2998 & -31742) - (-31841 & 23771) + n % (13350 & -15613) * (1251 & 952);
            int n4 = this.\u0000, ` / (2310 & 25126) + (-30955 & 4119) * (n / (16674 & -25594)) - (330 & 10);
            if (!class_6340.Method_6600()) {
                this.\u0000strictfp.add(new Class_43202(class_6340.Method_6705(), n3, n4, class_6340, this.Field_26889.Method_39885(class_6340)));
            } else {
                this.\u0000strictfp.add(new Class_45706(class_6340.Method_6705(), n3, n4, class_6340));
            }
            ++n;
        }
        this.\u0000strictfp.add(new Class_42376(1755 & -24334, this.\u0000= final / (-30266 & 18) - (8422 & -14219), this.\u0000, ` / (-31354 & 39) + (2216 & 184) + (-16369 & 13323) - (4460 & -6980), "Reset Video Settings..."));
        this.\u0000strictfp.add(new Class_42376(12008 & -12087, this.\u0000= final / (-24318 & 16562) - (101 & 18020), this.\u0000, ` / (2062 & -8170) + (6316 & 9912) + (-28657 & 11403), Class_9802.Method_9806("gui.done", new Object[8256 & -26479])));
    }

    private String[] Method_26902(String string) {
        String[] arrstring;
        if (string.equals("Autosave")) {
            String[] arrstring2 = new String[17043 & 10251];
            arrstring2[24 & -14330] = "Autosave interval";
            arrstring2[8605 & 16417] = "Default autosave interval (2s) is NOT RECOMMENDED.";
            arrstring = arrstring2;
            arrstring2[-23509 & 4690] = "Autosave causes the famous Lag Spike of Death.";
        } else if (string.equals("Lagometer")) {
            String[] arrstring3 = new String[109 & -20600];
            arrstring3[-32128 & 2064] = "Shows the lagometer on the debug screen (F3).";
            arrstring3[541 & -30303] = "* Orange - Memory garbage collection";
            arrstring3[-6102 & 279] = "* Cyan - Tick";
            arrstring3[12295 & -13301] = "* Blue - Scheduled executables";
            arrstring3[5381 & 78] = "* Purple - Chunk upload";
            arrstring3[4375 & 26789] = "* Red - Chunk updates";
            arrstring3[23318 & -24569] = "* Yellow - Visibility check";
            arrstring = arrstring3;
            arrstring3[16551 & 4615] = "* Green - Render terrain";
        } else if (string.equals("Debug Profiler")) {
            String[] arrstring4 = new String[2119 & 1301];
            arrstring4[8723 & -32696] = "Debug Profiler";
            arrstring4[-25759 & 1025] = "  ON - debug profiler is active, slower";
            arrstring4[16403 & 170] = "  OFF - debug profiler is not active, faster";
            arrstring4[-24573 & 22143] = "The debug profiler collects and shows debug information";
            arrstring = arrstring4;
            arrstring4[-30892 & 4] = "when the debug screen is open (F3)";
        } else if (string.equals("Time")) {
            String[] arrstring5 = new String[5382 & -23962];
            arrstring5[8480 & -32040] = "Time";
            arrstring5[8193 & 529] = " Default - normal day/night cycles";
            arrstring5[1551 & 2] = " Day Only - day only";
            arrstring5[1063 & -20133] = " Night Only - night only";
            arrstring5[1156 & 10501] = "The time setting is only effective in CREATIVE mode";
            arrstring = arrstring5;
            arrstring5[-32699 & 23175] = "and for local worlds.";
        } else if (string.equals("Weather")) {
            String[] arrstring6 = new String[269 & 10853];
            arrstring6[24 & -32573] = "Weather";
            arrstring6[1041 & 15137] = "  ON - weather is active, slower";
            arrstring6[12355 & 546] = "  OFF - weather is not active, faster";
            arrstring6[6291 & -16345] = "The weather controls rain, snow and thunderstorms.";
            arrstring = arrstring6;
            arrstring6[2174 & -16252] = "Weather control is only possible for local worlds.";
        } else if (string.equals("Fullscreen")) {
            String[] arrstring7 = new String[1605 & -24553];
            arrstring7[-27695 & 3076] = "Fullscreen";
            arrstring7[12305 & -14557] = "  ON - use fullscreen mode";
            arrstring7[-24498 & 291] = "  OFF - use window mode";
            arrstring7[4099 & 651] = "Fullscreen mode may be faster or slower than";
            arrstring = arrstring7;
            arrstring7[4108 & 18790] = "window mode, depending on the graphics card.";
        } else if (string.equals("Fullscreen Mode")) {
            String[] arrstring8 = new String[16533 & -29179];
            arrstring8[-24342 & 21761] = "Fullscreen mode";
            arrstring8[2115 & 8973] = "  Default - use desktop screen resolution, slower";
            arrstring8[2439 & -14822] = "  WxH - use custom screen resolution, may be faster";
            arrstring8[111 & -24301] = "The selected resolution is used in fullscreen mode (F11).";
            arrstring = arrstring8;
            arrstring8[45 & 10004] = "Lower resolutions should generally be faster.";
        } else if (string.equals("3D Anaglyph")) {
            String[] arrstring9 = new String[131 & 3085];
            arrstring = arrstring9;
            arrstring9[2208 & 4882] = "3D mode used with red-cyan 3D glasses.";
        } else if (string.equals("Show FPS")) {
            String[] arrstring10 = new String[12454 & 18967];
            arrstring10[-20096 & 16906] = "Shows compact FPS and render information";
            arrstring10[-32699 & 6201] = "  C: - chunk renderers";
            arrstring10[-24558 & 20135] = "  E: - rendered entities + block entities";
            arrstring10[16583 & 7179] = "  U: - chunk updates";
            arrstring10[9223 & 6300] = "The compact FPS information is only shown when the";
            arrstring = arrstring10;
            arrstring10[20007 & -32619] = "debug screen is not visible.";
        } else {
            arrstring = null;
        }
        return arrstring;
    }

    private String Method_26903(String string) {
        int n = string.indexOf(-22466 & 20794);
        return n < 0 ? string : string.substring(-30336 & 20506, n);
    }
}

