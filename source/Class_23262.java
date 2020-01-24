/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  internal.org.lwjgl.input.Mouse
 */
import internal.org.lwjgl.input.Mouse;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Random;

public class Class_23262
extends Class_1490
implements Class_6056 {
    private static final int Field_23263;
    protected int Field_23264;
    private static final Class_2080 Field_23265;
    private static final int Field_23266;
    protected Class_1490 Field_23267;
    private int Field_23268;
    private static final int Field_23269;
    protected int Field_23270 = 16586 & 458;
    protected double Field_23271;
    protected double Field_23272;
    protected double Field_23273;
    private boolean Field_23274 = 16419 & -23547;
    private static final int Field_23275;
    protected float Field_23276 = 1.0f;
    private Class_25493 Field_23277;
    protected double Field_23278;
    protected double Field_23279;
    protected int Field_23280 = 8456 & 19732;
    protected double Field_23281;
    protected int Field_23282;

    public void Method_23283() {
        if (!this.Field_23274) {
            this.Field_23278 = this.Field_23279;
            this.Field_23281 = this.Field_23272;
            double d = this.Field_23273 - this.Field_23279;
            double d2 = this.Field_23271 - this.Field_23272;
            if (d * d + d2 * d2 < 6.8 * 0.5882352941176471) {
                this.Field_23279 += d;
                this.Field_23272 += d2;
            } else {
                this.Field_23279 += d * (0.4393939393939394 * 1.9344827586206896);
                this.Field_23272 += d2 * (0.95 * 0.8947368421052632);
            }
        }
    }

    protected void Method_23284(int n, int n2, float f) {
        int n3;
        int n4;
        int n5;
        Object object;
        int n6;
        int n7;
        int n8;
        float f2;
        int n9 = Class_13337.Method_13371(this.Field_23278 + (this.Field_23279 - this.Field_23278) * (double)f);
        int n10 = Class_13337.Method_13371(this.Field_23281 + (this.Field_23272 - this.Field_23281) * (double)f);
        if (n9 < Field_23266) {
            n9 = Field_23266;
        }
        if (n10 < Field_23269) {
            n10 = Field_23269;
        }
        if (n9 >= Field_23263) {
            n9 = Field_23263 - (2689 & -32761);
        }
        if (n10 >= Field_23275) {
            n10 = Field_23275 - (3747 & -24551);
        }
        int n11 = (this.\u0000= final - this.Field_23280) / (-24554 & 4994);
        int n12 = (this.\u0000, ` - this.Field_23270) / (16515 & 6498);
        int n13 = n11 + (8210 & 464);
        int n14 = n12 + (1041 & -14287);
        this.\u0000strictfp = 0.0f;
        Class_16867.Method_16936(-11769 & 1542);
        Class_16867.Method_16961();
        Class_16867.Method_16943(n13, n14, 1.2098765f * -165.30612f);
        Class_16867.Method_16973(1.0f / this.Field_23276, 1.0f / this.Field_23276, 0.0f);
        Class_16867.Method_16965();
        Class_16867.Method_16931();
        Class_16867.Method_16957();
        Class_16867.Method_16950();
        int n15 = n9 + (3424 & -15968) >> (6 & 25028);
        int n16 = n10 + (10548 & 810) >> (8198 & 1580);
        int n17 = (n9 + (290 & 1332)) % (-25964 & 25723);
        int n18 = (n10 + (10022 & 16672)) % (19472 & 208);
        int n19 = 38 & -23804;
        int n20 = -31224 & 4440;
        int n21 = -32629 & 21066;
        int n22 = 607 & 4118;
        int n23 = 4517 & 55;
        Random random = new Random();
        float f3 = 16.163265f * 0.989899f / this.Field_23276;
        float f4 = 2.6666667f * 6.0f / this.Field_23276;
        int n24 = -8190 & 5441;
        while ((float)n24 * f3 - (float)n18 < 1.0645162f * 145.60605f) {
            f2 = 0.49230772f * 1.21875f - (float)(n16 + n24) / (2.1666667f * 11.538461f) * (1.9302325f * 0.15542169f);
            Class_16867.Method_16924(f2, f2, f2, 1.0f);
            n5 = 2305 & -23418;
            while ((float)n5 * f4 - (float)n17 < 319.0303f * 0.70212764f) {
                random.setSeed(this.\u0000strictfp.Method_265().Method_2115().hashCode() + n15 + n5 + (n16 + n24) * (20794 & 8209));
                n7 = random.nextInt((8225 & -12927) + n16 + n24) + (n16 + n24) / (16994 & 3079);
                Class_11372 class_11372 = this.Method_23294(Class_9265.Field_9394);
                if (n7 <= (-20249 & 20005) && n16 + n24 != (2147 & 20535)) {
                    if (n7 == (278 & 4662)) {
                        class_11372 = random.nextInt(214 & 12298) == 0 ? this.Method_23294(Class_9265.Field_9287) : this.Method_23294(Class_9265.Field_9305);
                    } else if (n7 == (4110 & -22182)) {
                        class_11372 = this.Method_23294(Class_9265.Field_9333);
                    } else if (n7 == (136 & 12299)) {
                        class_11372 = this.Method_23294(Class_9265.Field_9268);
                    } else if (n7 > (-8156 & 5)) {
                        class_11372 = this.Method_23294(Class_9265.Field_9446);
                    } else if (n7 > 0) {
                        class_11372 = this.Method_23294(Class_9265.Field_9272);
                    }
                } else {
                    object = Class_9265.Field_9414;
                    class_11372 = this.Method_23294((Class_3238)object);
                }
                this.\u0000strictfp.Method_253().Method_34707(Class_24069.Field_24084);
                this.\u0000strictfp(n5 * (1105 & 16924) - n17, n24 * (-23568 & 16401) - n18, class_11372, -32296 & 14353, 10352 & 21648);
                ++n5;
            }
            ++n24;
        }
        Class_16867.Method_16927();
        Class_16867.Method_16936(4627 & 1647);
        this.\u0000strictfp.Method_253().Method_34707(Field_23265);
        for (n24 = 4130 & -5935; n24 < Class_21905.Field_21929.size(); ++n24) {
            Class_14225 class_14225 = (Class_14225)Class_21905.Field_21929.get(n24);
            if (class_14225.Field_14231 == null) continue;
            n5 = class_14225.Field_14232 * (12312 & 1531) - n9 + (267 & 4235);
            n7 = class_14225.Field_14227 * (-32200 & 155) - n10 + (18523 & -24017);
            int n25 = class_14225.Field_14231.Field_14232 * (-7944 & 26) - n9 + (2203 & 1803);
            object = class_14225.Field_14231.Field_14227 * (4124 & 1369) - n10 + (16523 & 13631);
            n6 = this.Field_23277.Method_25502(class_14225) ? 1 : 0;
            n3 = this.Field_23277.Method_25499(class_14225);
            n8 = this.Field_23277.Method_25503(class_14225);
            if (n8 > (17444 & -32226)) continue;
            n4 = -16515067 & -14117030;
            if (n6 != 0) {
                n4 = -6231884 & -5201759;
            } else if (n3 != 0) {
                n4 = -16056511 & -14549238;
            }
            this.\u0000strictfp(n5, n25, n7, n4);
            this.\u0000, `(n25, n7, object, n4);
            if (n5 > n25) {
                this.\u0000strictfp(n5 - (30731 & -32085) - (21135 & -29689), n7 - (-24283 & 135), 8314 & -29322, -21269 & 20718, -31673 & 4159, 21899 & -32725);
                continue;
            }
            if (n5 < n25) {
                this.\u0000strictfp(n5 + (287 & 2603), n7 - (9253 & 4549), 14571 & 619, -16134 & 3566, 1687 & -22489, 4111 & 17179);
                continue;
            }
            if (n7 > object) {
                this.\u0000strictfp(n5 - (2101 & -28593), n7 - (4619 & -32741) - (639 & 17671), -12190 & 3304, 254 & 6890, -20209 & 1563, 17447 & -30697);
                continue;
            }
            if (n7 >= object) continue;
            this.\u0000strictfp(n5 - (-32763 & 1165), n7 + (10283 & 5407), 19560 & -32415, 241 & -18697, 20715 & -31717, 22047 & 231);
        }
        Class_14225 class_14225 = null;
        f2 = (float)(n - n13) * this.Field_23276;
        float f5 = (float)(n2 - n14) * this.Field_23276;
        Class_39477.Method_39485();
        Class_16867.Method_16931();
        Class_16867.Method_16957();
        Class_16867.Method_16950();
        for (n7 = 16425 & 8704; n7 < Class_21905.Field_21929.size(); ++n7) {
            float f6;
            Class_14225 class_142252 = (Class_14225)Class_21905.Field_21929.get(n7);
            object = class_142252.Field_14232 * (2489 & 21528) - n9;
            n6 = class_142252.Field_14227 * (-32580 & 17947) - n10;
            if (object < (-24 & -18) || n6 < (-24 & -18) || !((float)object <= 99.147545f * 2.2592592f * this.Field_23276) || !((float)n6 <= 34.875f * 4.4444447f * this.Field_23276)) continue;
            n3 = this.Field_23277.Method_25503(class_142252);
            if (this.Field_23277.Method_25502(class_142252)) {
                f6 = 0.495f * 1.5151515f;
                Class_16867.Method_16924(f6, f6, f6, 1.0f);
            } else if (this.Field_23277.Method_25499(class_142252)) {
                f6 = 1.0f;
                Class_16867.Method_16924(f6, f6, f6, 1.0f);
            } else if (n3 < (3 & 12355)) {
                f6 = 0.5833333f * 0.51428574f;
                Class_16867.Method_16924(f6, f6, f6, 1.0f);
            } else if (n3 == (19987 & 8207)) {
                f6 = 8.0f * 0.025f;
                Class_16867.Method_16924(f6, f6, f6, 1.0f);
            } else {
                if (n3 != (-15450 & 2060)) continue;
                f6 = 0.021276595f * 4.7000003f;
                Class_16867.Method_16924(f6, f6, f6, 1.0f);
            }
            this.\u0000strictfp.Method_253().Method_34707(Field_23265);
            if (class_142252.Method_14234()) {
                this.\u0000strictfp(object - (1026 & 4130), n6 - (12290 & 170), -28134 & 8350, 9198 & -15158, -30694 & 319, 14047 & 18458);
            } else {
                this.\u0000strictfp(object - (2 & 16474), n6 - (16386 & -32053), 2064 & -28668, 714 & 4314, -24421 & 346, 2074 & -27878);
            }
            if (!this.Field_23277.Method_25499(class_142252)) {
                f6 = 0.050649352f * 1.9743589f;
                Class_16867.Method_16924(f6, f6, f6, 1.0f);
                this.\u0000strictfp.Method_44261((24684 & 4624) != 0);
            }
            Class_16867.Method_16918();
            Class_16867.Method_16979();
            this.\u0000strictfp.Method_44287(class_142252.Field_14229, object + (20547 & 3119), n6 + (27139 & 1415));
            Class_16867.Method_16951(2834 & -15613, -26829 & 2827);
            Class_16867.Method_16931();
            if (!this.Field_23277.Method_25499(class_142252)) {
                this.\u0000strictfp.Method_44261((25601 & -32461) != 0);
            }
            Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 1.0f);
            if (!(f2 >= (float)object) || !(f2 <= (float)(object + (-27626 & 2070))) || !(f5 >= (float)n6) || !(f5 <= (float)(n6 + (-31977 & 17470)))) continue;
            class_14225 = class_142252;
        }
        Class_16867.Method_16944();
        Class_16867.Method_16947();
        Class_16867.Method_16945();
        Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 1.0f);
        this.\u0000strictfp.Method_253().Method_34707(Field_23265);
        this.\u0000strictfp(n11, n12, 9254 & 408, 9226 & 260, this.Field_23280, this.Field_23270);
        this.\u0000strictfp = 0.0f;
        Class_16867.Method_16936(10803 & 17927);
        Class_16867.Method_16944();
        Class_16867.Method_16965();
        super.Method_1545(n, n2, f);
        if (class_14225 != null) {
            String string = class_14225.Method_14242().Method_1788();
            String string2 = class_14225.Method_14241();
            object = n + (2188 & 13071);
            n6 = n2 - (532 & -15290);
            n3 = this.Field_23277.Method_25503(class_14225);
            if (this.Field_23277.Method_25499(class_14225)) {
                n8 = Math.max(this.\u0000strictfp.Method_28715(string), 10490 & 16505);
                n4 = this.\u0000strictfp.Method_28722(string2, n8);
                if (this.Field_23277.Method_25502(class_14225)) {
                    n4 += 12;
                }
                this.\u0000, `(object - (139 & 3), n6 - (-32753 & 16611), object + n8 + (2627 & 1059), n6 + n4 + (16467 & 6791) + (17516 & 270), -922738616 & -1065331965, -469679816 & -667516411);
                this.\u0000strictfp.Method_28688(string2, (int)object, n6 + (172 & -31988), n8, -5332828 & -6231880);
                if (this.Field_23277.Method_25502(class_14225)) {
                    this.\u0000strictfp.Method_28729(Class_9802.Method_9806("achievement.taken", new Object[552 & -15936]), (float)object, n6 + n4 + (16404 & -28154), -6712577 & -3100417);
                }
            } else if (n3 == (8715 & 7507)) {
                string = Class_9802.Method_9806("achievement.unknown", new Object[-23472 & 33]);
                n8 = Math.max(this.\u0000strictfp.Method_28715(string), -11142 & 760);
                Object[] arrobject = new Object[321 & 9];
                arrobject[-14268 & 4137] = class_14225.Field_14231.Method_14242();
                String string3 = new Class_2849("achievement.requires", arrobject).\u0000%();
                int n26 = this.\u0000strictfp.Method_28722(string3, n8);
                this.\u0000, `(object - (-14845 & 399), n6 - (17415 & 12707), object + n8 + (15 & 28707), n6 + n26 + (8493 & 604) + (14723 & -16377), -1073217432 & -1069405692, -399998938 & -1073650560);
                this.\u0000strictfp.Method_28688(string3, (int)object, n6 + (-16340 & 6286), n8, -336936 & -9415565);
            } else if (n3 < (207 & 19)) {
                n8 = Math.max(this.\u0000strictfp.Method_28715(string), 17144 & 127);
                Object[] arrobject = new Object[257 & -26099];
                arrobject[7 & 16704] = class_14225.Field_14231.Method_14242();
                String string4 = new Class_2849("achievement.requires", arrobject).\u0000%();
                int n27 = this.\u0000strictfp.Method_28722(string4, n8);
                this.\u0000, `(object - (17411 & 135), n6 - (-31345 & 16483), object + n8 + (4627 & 25067), n6 + n27 + (526 & 23692) + (4499 & -30653), -1031528380 & -646948728, -918265856 & -1064140018);
                this.\u0000strictfp.Method_28688(string4, (int)object, n6 + (14428 & -31601), n8, -9283120 & -724400);
            } else {
                string = null;
            }
            if (string != null) {
                this.\u0000strictfp.Method_28729(string, (float)object, n6, this.Field_23277.Method_25499(class_14225) ? (class_14225.Method_14234() ? -126 & -103 : -1 & -1) : (class_14225.Method_14234() ? -8355736 & -2846256 : -5209984 & -8335136));
            }
        }
        Class_16867.Method_16927();
        Class_16867.Method_16918();
        Class_39477.Method_39484();
    }

    protected void Method_23285(char c, int n) {
        if (n == this.\u0000strictfp.Field_84.Field_39818.Method_8274()) {
            this.\u0000strictfp.Method_218(null);
            this.\u0000strictfp.Method_269();
        } else {
            super.Method_1525(c, n);
        }
    }

    public boolean Method_23286() {
        return (!this.Field_23274 ? -32635 & 14345 : 969 & -16382) != 0;
    }

    private static String Method_23287(String string) {
        int n = 17575;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_23262.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    protected void Method_23288(Class_42376 class_42376) {
        if (!this.Field_23274 && class_42376.Field_42392 == (-28667 & 19561)) {
            this.\u0000strictfp.Method_218(this.Field_23267);
        }
    }

    public void Method_23289() {
        if (this.Field_23274) {
            this.Field_23274 = 18720 & 9818;
        }
    }

    public void Method_23290() {
        this.\u0000strictfp.Method_271().Method_20245(new Class_25900(Class_8752.Field_8754));
        this.\u0000strictfp.clear();
        this.\u0000strictfp.add(new Class_43202(15361 & 977, this.\u0000= final / (1086 & -4030) + (5818 & 16665), this.\u0000, ` / (9226 & 6550) + (3658 & -16289), 598 & 9297, -30188 & 5557, Class_9802.Method_9806("gui.done", new Object[14636 & 128])));
    }

    public Class_23262(Class_1490 class_1490, Class_25493 class_25493) {
        this.Field_23267 = class_1490;
        this.Field_23277 = class_25493;
        int n = -29283 & 205;
        int n2 = -14947 & 8431;
        this.Field_23279 = this.Field_23273 = (double)(Class_21905.Field_21936.Field_14232 * (216 & 16920) - n / (4630 & 1218) - (-32756 & 6559));
        this.Field_23278 = this.Field_23273;
        this.Field_23272 = this.Field_23271 = (double)(Class_21905.Field_21936.Field_14227 * (8473 & 19518) - n2 / (-31733 & 12818));
        this.Field_23281 = this.Field_23271;
    }

    private void Method_23291() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_23292(int n, int n2, float f) {
        if (this.Field_23274) {
            this.\u0000, 2();
            this.\u0000strictfp(this.\u0000strictfp, Class_9802.Method_9806("multiplayer.downloadingStats", new Object[13 & -13934]), this.\u0000= final / (-31230 & 24662), this.\u0000, ` / (-31309 & 2), 620756991 & 1509949439);
            this.\u0000strictfp(this.\u0000strictfp, \u0000strictfp[(int)(Class_18.Method_207() / (-5458174948771955298L & 1091371222L) % (long)\u0000strictfp.length)], this.\u0000= final / (546 & 8594), this.\u0000, ` / (2391 & 4106) + (11 & 9229) * (24747 & 5702), 1392508927 & 16777215);
        } else {
            int n3;
            if (Mouse.isButtonDown((int)(533 & -14336))) {
                n3 = (this.\u0000= final - this.Field_23280) / (14402 & 898);
                int n4 = (this.\u0000, ` - this.Field_23270) / (23558 & 8450);
                int n5 = n3 + (2568 & -12136);
                int n6 = n4 + (25273 & 4373);
                if ((this.Field_23268 == 0 || this.Field_23268 == (4361 & 18433)) && n >= n5 && n < n5 + (9696 & -28434) && n2 >= n6 && n2 < n6 + (-32101 & 12475)) {
                    if (this.Field_23268 == 0) {
                        this.Field_23268 = 2343 & -31727;
                    } else {
                        this.Field_23279 -= (double)((float)(n - this.Field_23282) * this.Field_23276);
                        this.Field_23272 -= (double)((float)(n2 - this.Field_23264) * this.Field_23276);
                        this.Field_23273 = this.Field_23278 = this.Field_23279;
                        this.Field_23271 = this.Field_23281 = this.Field_23272;
                    }
                    this.Field_23282 = n;
                    this.Field_23264 = n2;
                }
            } else {
                this.Field_23268 = -32504 & 12306;
            }
            n3 = Mouse.getDWheel();
            float f2 = this.Field_23276;
            if (n3 < 0) {
                this.Field_23276 += 0.25872093f * 0.96629214f;
            } else if (n3 > 0) {
                this.Field_23276 -= 0.5555556f * 0.45f;
            }
            this.Field_23276 = Class_13337.Method_13360(this.Field_23276, 1.0f, 2.0f);
            if (this.Field_23276 != f2) {
                float f3 = f2 - this.Field_23276;
                float f4 = f2 * (float)this.Field_23280;
                float f5 = f2 * (float)this.Field_23270;
                float f6 = this.Field_23276 * (float)this.Field_23280;
                float f7 = this.Field_23276 * (float)this.Field_23270;
                this.Field_23279 -= (double)((f6 - f4) * (0.7777778f * 0.64285713f));
                this.Field_23272 -= (double)((f7 - f5) * (0.27173913f * 1.84f));
                this.Field_23273 = this.Field_23278 = this.Field_23279;
                this.Field_23271 = this.Field_23281 = this.Field_23272;
            }
            if (this.Field_23273 < (double)Field_23266) {
                this.Field_23273 = Field_23266;
            }
            if (this.Field_23271 < (double)Field_23269) {
                this.Field_23271 = Field_23269;
            }
            if (this.Field_23273 >= (double)Field_23263) {
                this.Field_23273 = Field_23263 - (20641 & 1055);
            }
            if (this.Field_23271 >= (double)Field_23275) {
                this.Field_23271 = Field_23275 - (16385 & 11745);
            }
            this.\u0000, 2();
            this.Method_23284(n, n2, f);
            Class_16867.Method_16931();
            Class_16867.Method_16944();
            this.Method_23293();
            Class_16867.Method_16918();
            Class_16867.Method_16927();
        }
    }

    static {
        Field_23266 = Class_21905.Field_21908 * (156 & 5144) - (-6535 & 4212);
        Field_23269 = Class_21905.Field_21932 * (733 & 6200) - (888 & -27403);
        Field_23263 = Class_21905.Field_21931 * (93 & 21688) - (-15283 & 12909);
        Field_23275 = Class_21905.Field_21923 * (2072 & -24452) - (10573 & 5741);
        Field_23265 = new Class_2080(Class_23262.Method_23287("\ua5ae\ua5af\ua5a2\ua5ae\ua5ab\ua5ac\ua5ab\ua5ad\ua5e5\ua5ad\ua5af\ua5a3\ua5e1\ua5af\ua5ad\ua5a6\ua5a3\ua5af\ua5ac\ua5af\ua5a3\ua5ab\ua5a0\ua5aa\ua5e5\ua5ab\ua5a9\ua5a2\ua5a7\ua5ab\ua5a8\ua5ab\ua587\ua58f\ua584\ua58e\ua5a1\ua58c\ua58f\ua58d\ua581\ua58d\ua588\ua585\ua58b\ua580\ua58a\ua5c0\ua58a\ua584\ua58d"));
    }

    protected void Method_23293() {
        int n = (this.\u0000= final - this.Field_23280) / (-32421 & 8322);
        int n2 = (this.\u0000, ` - this.Field_23270) / (24578 & 1070);
        this.\u0000strictfp.Method_28692(Class_9802.Method_9806("gui.achievements", new Object[2 & -32592]), n + (5135 & 17199), n2 + (1045 & 24589), 5428289 & 56648282);
    }

    private Class_11372 Method_23294(Class_3238 class_3238) {
        return Class_18.Field_89.Method_214().Method_36716().Method_36437(class_3238.Method_3293());
    }
}

