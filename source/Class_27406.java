/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_27406
extends Class_1490 {
    private Class_1490 Field_27407;
    protected String Field_27408 = "Performance Settings";
    private int Field_27409 = -32240 & 11713;
    private long Field_27410 = -6754543302406548735L & 6754543301614928900L;
    private int Field_27411 = 2048 & 16715;
    private Class_39702 Field_27412;
    private static Class_6340[] Field_27413;

    protected void Method_27414(Class_42376 class_42376) {
        if (class_42376.Field_42388) {
            if (class_42376.Field_42392 < (1788 & -12088) && class_42376 instanceof Class_43202) {
                this.Field_27412.Method_39923(((Class_43202)class_42376).Method_43205(), 18463 & 545);
                class_42376.Field_42381 = this.Field_27412.Method_39885(Class_6340.Method_6715(class_42376.Field_42392));
            }
            if (class_42376.Field_42392 == (9452 & 203)) {
                this.\u0000strictfp.Field_84.Method_39903();
                this.\u0000strictfp.Method_218(this.Field_27407);
            }
            if (class_42376.Field_42392 != Class_6340.Field_6390.ordinal()) {
                Class_31566 class_31566 = new Class_31566(this.\u0000strictfp);
                int n = class_31566.Method_31574();
                int n2 = class_31566.Method_31575();
                this.\u0000strictfp(this.\u0000strictfp, n, n2);
            }
        }
    }

    static {
        Class_6340[] arrclass_6340 = new Class_6340[95 & -28793];
        arrclass_6340[-24560 & 16654] = Class_6340.Field_6388;
        arrclass_6340[9 & 7779] = Class_6340.Field_6347;
        arrclass_6340[-26622 & 603] = Class_6340.Field_6368;
        arrclass_6340[8723 & -14333] = Class_6340.Field_6376;
        arrclass_6340[588 & 132] = Class_6340.Field_6430;
        arrclass_6340[-20427 & 2567] = Class_6340.Field_6393;
        arrclass_6340[-31465 & 19086] = Class_6340.Field_6377;
        Field_27413 = arrclass_6340;
    }

    private Class_42376 Method_27415(int n, int n2) {
        for (int i = 17696 & 656; i < this.\u0000strictfp.size(); ++i) {
            int n3;
            Class_42376 class_42376 = (Class_42376)this.\u0000strictfp.get(i);
            int n4 = Class_28242.Method_28252(class_42376);
            int n5 = Class_28242.Method_28255(class_42376);
            int n6 = n3 = n >= class_42376.Field_42391 && n2 >= class_42376.Field_42390 && n < class_42376.Field_42391 + n4 && n2 < class_42376.Field_42390 + n5 ? 907 & -26607 : 2 & -22267;
            if (n3 == 0) continue;
            return class_42376;
        }
        return null;
    }

    public Class_27406(Class_1490 class_1490, Class_39702 class_39702) {
        this.Field_27407 = class_1490;
        this.Field_27412 = class_39702;
    }

    private String Method_27416(String string) {
        int n = string.indexOf(-15170 & 8315);
        return n < 0 ? string : string.substring(-32508 & 9344, n);
    }

    private void Method_27417() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private String[] Method_27418(String string) {
        String[] arrstring;
        if (string.equals("Smooth FPS")) {
            String[] arrstring2 = new String[37 & 8197];
            arrstring2[64 & 3479] = "Stabilizes FPS by flushing the graphic driver buffers";
            arrstring2[6341 & -32471] = "  OFF - no stabilization, FPS may fluctuate";
            arrstring2[-32721 & 4162] = "  ON - FPS stabilization";
            arrstring2[-15357 & 14899] = "This option is graphics driver dependant and its effect";
            arrstring = arrstring2;
            arrstring2[-20460 & 548] = "is not always visible";
        } else if (string.equals("Smooth World")) {
            String[] arrstring3 = new String[-8121 & 4237];
            arrstring3[20580 & 1033] = "Removes lag spikes caused by the internal server.";
            arrstring3[203 & -20219] = "  OFF - no stabilization, FPS may fluctuate";
            arrstring3[2194 & -16057] = "  ON - FPS stabilization";
            arrstring3[4751 & -24253] = "Stabilizes FPS by distributing the internal server load.";
            arrstring = arrstring3;
            arrstring3[373 & 12300] = "Effective only for local worlds (single player).";
        } else if (string.equals("Load Far")) {
            String[] arrstring4 = new String[-26610 & 8359];
            arrstring4[584 & 8197] = "Loads the world chunks at distance Far.";
            arrstring4[595 & 18693] = "Switching the render distance does not cause all chunks ";
            arrstring4[198 & -14830] = "to be loaded again.";
            arrstring4[1611 & -12285] = "  OFF - world chunks loaded up to render distance";
            arrstring4[2084 & 8469] = "  ON - world chunks loaded at distance Far, allows";
            arrstring = arrstring4;
            arrstring4[10631 & 581] = "       fast render distance switching";
        } else if (string.equals("Preloaded Chunks")) {
            String[] arrstring5 = new String[17422 & -32474];
            arrstring5[21536 & -23996] = "Defines an area in which no chunks will be loaded";
            arrstring5[15377 & -32693] = "  OFF - after 5m new chunks will be loaded";
            arrstring5[-31422 & 8706] = "  2 - after 32m  new chunks will be loaded";
            arrstring5[-4093 & 143] = "  8 - after 128m new chunks will be loaded";
            arrstring5[10332 & 1284] = "Higher values need more time to load all the chunks";
            arrstring = arrstring5;
            arrstring5[12357 & 29] = "and may decrease the FPS.";
        } else if (string.equals("Chunk Updates")) {
            String[] arrstring6 = new String[1422 & -5562];
            arrstring6[13824 & 416] = "Chunk updates";
            arrstring6[18657 & -32239] = " 1 - slower world loading, higher FPS (default)";
            arrstring6[514 & -22166] = " 3 - faster world loading, lower FPS";
            arrstring6[17443 & 4119] = " 5 - fastest world loading, lowest FPS";
            arrstring6[16709 & 10260] = "Number of chunk updates per rendered frame,";
            arrstring = arrstring6;
            arrstring6[6173 & 9831] = "higher values may destabilize the framerate.";
        } else if (string.equals("Dynamic Updates")) {
            String[] arrstring7 = new String[525 & -16251];
            arrstring7[-26496 & 17217] = "Dynamic chunk updates";
            arrstring7[3 & 24793] = " OFF - (default) standard chunk updates per frame";
            arrstring7[4962 & -24445] = " ON - more updates while the player is standing still";
            arrstring7[707 & -16365] = "Dynamic updates force more chunk updates while";
            arrstring = arrstring7;
            arrstring7[743 & -24572] = "the player is standing still to load the world faster.";
        } else if (string.equals("Lazy Chunk Loading")) {
            String[] arrstring8 = new String[15 & 19479];
            arrstring8[16531 & 12800] = "Lazy Chunk Loading";
            arrstring8[10387 & -12247] = " OFF - default server chunk loading";
            arrstring8[-32509 & 16402] = " ON - lazy server chunk loading (smoother)";
            arrstring8[-29373 & 8759] = "Smooths the integrated server chunk loading by";
            arrstring8[14340 & 22] = "distributing the chunks over several ticks.";
            arrstring8[8215 & 19053] = "Turn it OFF if parts of the world do not load correctly.";
            arrstring = arrstring8;
            arrstring8[16678 & 4639] = "Effective only for local worlds and single-core CPU.";
        } else if (string.equals("Fast Math")) {
            String[] arrstring9 = new String[-31513 & 6149];
            arrstring9[26916 & 4168] = "Fast Math";
            arrstring9[1289 & 14371] = " OFF - standard math (default)";
            arrstring9[-24574 & 135] = " ON - faster math";
            arrstring9[-25265 & 515] = "Uses optimized sin() and cos() functions which can";
            arrstring = arrstring9;
            arrstring9[220 & 5926] = "better utilize the CPU cache and increase the FPS.";
        } else if (string.equals("Fast Render")) {
            String[] arrstring10 = new String[17711 & 8197];
            arrstring10[-32510 & 22021] = "Fast Render";
            arrstring10[17429 & 259] = " OFF - standard rendering (default)";
            arrstring10[1098 & 8706] = " ON - optimized rendering (faster)";
            arrstring10[4359 & 18451] = "Uses optimized rendering algorithm which decreases";
            arrstring = arrstring10;
            arrstring10[16646 & 14876] = "the GPU load and may substantionally increase the FPS.";
        } else {
            arrstring = null;
        }
        return arrstring;
    }

    public void Method_27419() {
        int n = 257 & 6;
        Class_6340[] arrclass_6340 = Field_27413;
        int n2 = arrclass_6340.length;
        for (int i = -31648 & 4496; i < n2; ++i) {
            Class_6340 class_6340 = arrclass_6340[i];
            int n3 = this.\u0000= final / (-23421 & 20738) - (-21093 & 20699) + n % (8714 & 21763) * (4260 & 936);
            int n4 = this.\u0000, ` / (-30634 & 558) + (10717 & -32203) * (n / (6339 & 16674)) - (3342 & 4171);
            if (!class_6340.Method_6600()) {
                this.\u0000strictfp.add(new Class_43202(class_6340.Method_6705(), n3, n4, class_6340, this.Field_27412.Method_39885(class_6340)));
            } else {
                this.\u0000strictfp.add(new Class_45706(class_6340.Method_6705(), n3, n4, class_6340));
            }
            ++n;
        }
        this.\u0000strictfp.add(new Class_42376(2250 & -22584, this.\u0000= final / (274 & 1602) - (-16275 & 6628), this.\u0000, ` / (18438 & 278) + (-26456 & 8637) + (523 & 43), Class_9802.Method_9806("gui.done", new Object[1177 & -18400])));
    }

    public void Method_27420(int n, int n2, float f) {
        this.\u0000, 2();
        this.\u0000strictfp(this.\u0000strictfp, this.Field_27408, this.\u0000= final / (10266 & 4422), 3700 & -32490, 352321535 & -1442840577);
        super.Method_1545(n, n2, f);
        if (Math.abs(n - this.Field_27411) <= (9383 & -30139) && Math.abs(n2 - this.Field_27409) <= (16613 & 1301)) {
            int n3 = 1724 & 25532;
            if (System.currentTimeMillis() >= this.Field_27410 + (long)n3) {
                int n4 = this.\u0000= final / (6275 & 8482) - (5302 & 24726);
                int n5 = this.\u0000, ` / (3078 & -11706) - (6103 & 24581);
                if (n2 <= n5 + (107 & 9058)) {
                    n5 += 105;
                }
                int n6 = n4 + (20630 & -24074) + (16566 & 2207);
                int n7 = n5 + (84 & 19036) + (16938 & 330);
                Class_42376 class_42376 = this.Method_27415(n, n2);
                if (class_42376 != null) {
                    String string = this.Method_27416(class_42376.Field_42381);
                    String[] arrstring = this.Method_27418(string);
                    if (arrstring == null) {
                        return;
                    }
                    this.\u0000, `(n4, n5, n6, n7, -494915580 & -469090294, -519831532 & -503106013);
                    for (int i = 1036 & -11391; i < arrstring.length; ++i) {
                        String string2 = arrstring[i];
                        this.\u0000strictfp.Method_28729(string2, n4 + (13573 & 16389), n5 + (2325 & 16903) + i * (16527 & 1035), 1792933885 & 33545693);
                    }
                }
            }
        } else {
            this.Field_27411 = n;
            this.Field_27409 = n2;
            this.Field_27410 = System.currentTimeMillis();
        }
    }
}

