/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  \u0000try break ! char ` do switch 3 ] 
 *  \u0000try break ! char ` do switch 3 ] $ 4 
 *  \u0000try break ! char ` do switch 3 ] $ 4 $ byte switch do continue synchronized % try = { 4 abstract synchronized default double public ? const import ^ long native = 4 + import static const float finally 0 return 1 throws abstract 7 finally 5 private protected
 *  com.google.common.collect.Maps
 *  com.google.common.util.concurrent.FutureCallback
 *  com.google.common.util.concurrent.Futures
 *  com.google.common.util.concurrent.ListenableFuture
 *  com.mojang.authlib.GameProfile
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.collect.Maps;
import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.mojang.authlib.GameProfile;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import net.minecraft.client.ClientBrandRetriever;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class_20165
implements Class_14856 {
    private final Map Field_20166 = Maps.newHashMap();
    private static final Logger Field_20167 = LogManager.getLogger();
    public Class_29733 Field_20168;
    public Class_570 Field_20169;
    private final Random Field_20170 = new Random();
    public int Field_20171 = 9601 & -26548;
    private boolean Field_20172 = 1 & 11746;
    public Class_8585 Field_20173 = new Class_8585();
    public int Field_20174 = -31232 & 12540;
    public boolean Field_20175 = 6697 & 1425;
    private final GameProfile Field_20176;
    public int Field_20177 = 31 & 5332;
    private boolean Field_20178;
    public boolean Field_20179 = 64 & -16080;
    private Class_18 Field_20180;
    public final Class_44584 Field_20181;
    private boolean Field_20182;
    private final Class_1490 Field_20183;

    public void Method_20184(Class_25673 class_25673) {
        Class_34388.Method_34390(class_25673, this, this.Field_20180);
        Class_1061 class_1061 = class_25673.Method_25677(this.Field_20169);
        if (class_1061 != null) {
            class_1061.Method_1211(class_25673.Method_25681());
        }
    }

    public void Method_20185(Class_36853 class_36853) {
        Class_34388.Method_34390(class_36853, this, this.Field_20180);
        if (this.Field_20169 == null) {
            return;
        }
        if (class_36853.Method_36865()) {
            if (class_36853.Method_36862() == 0) {
                this.Field_20169.Method_597(class_36853.Method_36863(), class_36853.Method_36867(), (10577 & 32) != 0);
                return;
            }
            this.Field_20169.Method_597(class_36853.Method_36863(), class_36853.Method_36867(), (1537 & 17) != 0);
        }
        this.Field_20169.Method_612(class_36853.Method_36863() << (13316 & -32634), 4097 & 24772, class_36853.Method_36867() << (-30650 & 16548), (class_36853.Method_36863() << (8980 & 16485)) + (-32353 & 10287), -32448 & 24969, (class_36853.Method_36867() << (1245 & 29188)) + (27151 & -31729));
        Class_17665 class_17665 = this.Field_20169.Method_587(class_36853.Method_36863(), class_36853.Method_36867());
        class_17665.Method_17748(class_36853.Method_36868(), class_36853.Method_36862(), class_36853.Method_36865());
        this.Field_20169.\u0000, `(class_36853.Method_36863() << (16612 & -30460), -15679 & 9220, class_36853.Method_36867() << (16517 & -31660), (class_36853.Method_36863() << (2638 & 8196)) + (-10225 & 655), 6466 & -31968, (class_36853.Method_36867() << (-32058 & 17700)) + (143 & -30193));
        if (!class_36853.Method_36865() || !(this.Field_20169.\u0000strictfp instanceof Class_19777)) {
            class_17665.Method_17756();
        }
    }

    public void Method_20186(Class_42558 class_42558) {
        Class_34388.Method_34390(class_42558, this, this.Field_20180);
        Class_1378 class_1378 = this.Field_20180.Field_48;
        double d = class_42558.Method_42575();
        double d2 = class_42558.Method_42567();
        double d3 = class_42558.Method_42574();
        float f = class_42558.Method_42572();
        float f2 = class_42558.Method_42571();
        if (class_42558.Method_42565().contains((Object)Class_33501.Field_33503)) {
            d += class_1378.\u0000= package;
        } else {
            class_1378.\u0000= ` = 0.0;
        }
        if (class_42558.Method_42565().contains((Object)Class_33501.Field_33508)) {
            d2 += class_1378.\u0000, for();
        } else {
            class_1378.\u0000%(0.0);
        }
        if (class_42558.Method_42565().contains((Object)Class_33501.Field_33505)) {
            d3 += class_1378.\u0000= switch;
        } else {
            class_1378.\u0000switch = 0.0;
        }
        if (class_42558.Method_42565().contains((Object)Class_33501.Field_33504)) {
            f2 += class_1378.\u0000= float;
        }
        if (class_42558.Method_42565().contains((Object)Class_33501.Field_33507)) {
            f += class_1378.\u0000= ?;
        }
        class_1378.\u0000strictfp(d, d2, d3, f, f2);
        this.Field_20181.Method_44629(new Class_45191(class_1378.\u0000= package, class_1378.\u0000, `().Field_11000, class_1378.\u0000= switch, class_1378.\u0000= ?, class_1378.\u0000= float, (-24319 & 18436) != 0));
        this.Field_20180.Field_33.Field_25066 = System.nanoTime();
        if (!class_42558.Method_42565().isEmpty()) {
            this.Field_20180.Field_48.\u0000, for = this.Field_20180.Field_48.\u0000= package;
            this.Field_20180.Field_48.\u0000, 2 = this.Field_20180.Field_48.\u0000, for();
            this.Field_20180.Field_48.\u0000, # = this.Field_20180.Field_48.\u0000= switch;
        }
        if (!this.Field_20178) {
            this.Field_20180.Field_48.\u0000= final(this.Field_20180.Field_48.\u0000= package);
            this.Field_20180.Field_48.\u0000strictfp(this.Field_20180.Field_48.\u0000, for());
            this.Field_20180.Field_48.\u0000
            (this.Field_20180.Field_48.\u0000= switch);
            this.Field_20178 = -31615 & 2889;
            this.Field_20180.Method_218(null);
        }
    }

    public void Method_20187(Class_21351 class_21351) {
        Class_34388.Method_34390(class_21351, this, this.Field_20180);
        class_21351.Method_21358(this.Field_20169).Method_793(class_21351.Method_21360());
    }

    public void Method_20188(Class_37016 class_37016) {
        Class_34388.Method_34390(class_37016, this, this.Field_20180);
        int n = -16384 & 11776;
        for (Map.Entry entry : class_37016.Method_37023().entrySet()) {
            Class_13017 class_13017 = (Class_13017)entry.getKey();
            int n2 = (Integer)entry.getValue();
            if (class_13017.Method_13036() && n2 > 0) {
                if (this.Field_20172 && this.Field_20180.Field_48.Method_1405().Method_25501(class_13017) == 0) {
                    Class_14225 class_14225 = (Class_14225)class_13017;
                    this.Field_20180.Field_93.Method_42429(class_14225);
                    this.Field_20180.Method_242().Method_1823(new Class_38498(class_14225), -5671773413390149483L & 570720288L);
                    if (class_13017 == Class_21905.Field_21936) {
                        this.Field_20180.Field_84.Field_39820 = 769 & -15336;
                        this.Field_20180.Field_84.Method_39903();
                    }
                }
                n = -15743 & 11269;
            }
            this.Field_20180.Field_48.Method_1405().Method_25497(this.Field_20180.Field_48, class_13017, n2);
        }
        if (!this.Field_20172 && n == 0 && this.Field_20180.Field_84.Field_39820) {
            this.Field_20180.Field_93.Method_42428(Class_21905.Field_21936);
        }
        this.Field_20172 = 33 & 7197;
        if (this.Field_20180.Field_36 instanceof Class_6056) {
            ((Class_6056)((Object)this.Field_20180.Field_36)).Method_6058();
        }
    }

    public void Method_20189(Class_24560 class_24560) {
        Class_34388.Method_34390(class_24560, this, this.Field_20180);
        Class_34772[] arrclass_34772 = class_24560.Method_24564();
        int n = arrclass_34772.length;
        for (int i = 16498 & 10253; i < n; ++i) {
            Class_34772 class_34772 = arrclass_34772[i];
            this.Field_20169.Method_604(class_34772.Method_34778(), class_34772.Method_34777());
        }
    }

    public void Method_20190(Class_44126 class_44126) {
        Class_34388.Method_34390(class_44126, this, this.Field_20180);
        Class_1061 class_1061 = class_44126.Method_44130(this.Field_20169);
        if (class_1061 != null) {
            this.Field_20180.Method_228(class_1061);
        }
    }

    public void Method_20191(Class_36134 class_36134) {
        Class_34388.Method_34390(class_36134, this, this.Field_20180);
        this.Field_20180.Field_72.\u0000= final(class_36134.Method_36138(), class_36134.Method_36144(), class_36134.Method_36142());
    }

    public GameProfile Method_20192() {
        return this.Field_20176;
    }

    public void Method_20193(Class_22168 class_22168) {
        Class_34388.Method_34390(class_22168, this, this.Field_20180);
        if (class_22168.Method_22175() == (9298 & 647)) {
            this.Field_20180.Field_105.Method_45456(class_22168.Method_22178(), (9348 & 4097) != 0);
        } else {
            if (class_22168.Field_22169 > 0 && class_22168.Field_22169 < (-14032 & 528)) {
                class_22168.Field_22169 = 16704 & 512;
            }
            this.Field_20180.Field_105.Method_45458().Method_41172(class_22168.Method_22178(), class_22168.Field_22169);
        }
    }

    private static String Method_20194(String string) {
        int n = 21772;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_20165.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_9738 Method_20195(UUID uUID) {
        return (Class_9738)this.Field_20166.get(uUID);
    }

    public void Method_20196(Class_37267 class_37267) {
        Class_859 class_859;
        Class_1061 class_1061;
        Class_34388.Method_34390(class_37267, this, this.Field_20180);
        Class_1061 class_10612 = this.Field_20169.Method_601(class_37267.Field_37271);
        Class_859 class_8592 = class_859 = class_10612 instanceof Class_859 ? (Class_859)class_10612 : null;
        if (class_37267.Field_37270 == Class_41529.Field_41530) {
            long l = (-3090 & 2024) * class_37267.Field_37272 / (-22244 & 21748);
            Class_40258 class_40258 = new Class_40258(this.Field_20180.Field_48, class_859);
            this.Field_20180.Method_242().Method_1832(class_40258, (-1991489044223074046L & 1484915937L) - l, 1185023168L & -6257484142259199744L);
        } else if (class_37267.Field_37270 == Class_41529.Field_41533 && (class_1061 = this.Field_20169.Method_601(class_37267.Field_37269)) instanceof Class_626) {
            Class_38587 class_38587 = new Class_38587((Class_626)class_1061, class_859);
            class_38587.\u0000strictfp(class_37267.Field_37268);
            this.Field_20180.Method_242().Method_1823(class_38587, 77611522L & 138742169L);
        }
    }

    public void Method_20197(Class_24570 class_24570) {
        Class_34388.Method_34390(class_24570, this, this.Field_20180);
        Class_8295 class_8295 = null;
        Class_1378 class_1378 = this.Field_20180.Field_48;
        if (class_24570.Method_24580() == 0) {
            class_8295 = class_1378.Field_681;
        } else if (class_24570.Method_24580() == class_1378.Field_665.Field_8298) {
            class_8295 = class_1378.Field_665;
        }
        if (class_8295 != null && !class_24570.Method_24581()) {
            this.Method_20245(new Class_29048(class_24570.Method_24580(), class_24570.Method_24576(), (6281 & 1) != 0));
        }
    }

    static Class_18 Method_20198(Class_20165 class_20165) {
        return class_20165.Field_20180;
    }

    private static String Method_20199(String string) {
        int n = 29933;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_20165.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_20200(Class_34578 class_34578) {
        Class_34388.Method_34390(class_34578, this, this.Field_20180);
        Class_1061 class_1061 = this.Field_20169.Method_601(class_34578.Method_34589());
        Class_1061 class_10612 = this.Field_20169.Method_601(class_34578.Method_34587());
        if (class_34578.Method_34582() == 0) {
            int n = -30715 & 4376;
            if (class_34578.Method_34589() == this.Field_20180.Field_48.\u0000, `()) {
                class_1061 = this.Field_20180.Field_48;
                if (class_10612 instanceof Class_25683) {
                    ((Class_25683)class_10612).Method_25697((796 & -29632) != 0);
                }
                n = class_1061.Field_1095 == null && class_10612 != null ? -30127 & 8195 : 9413 & 0;
            } else if (class_10612 instanceof Class_25683) {
                ((Class_25683)class_10612).Method_25697((-27959 & 3111) != 0);
            }
            if (class_1061 == null) {
                return;
            }
            class_1061.Method_1163(class_10612);
            if (n != 0) {
                Class_39702 class_39702 = this.Field_20180.Field_84;
                Object[] arrobject = new Object[10355 & 769];
                arrobject[3074 & -15872] = Class_39702.Method_39914(class_39702.Field_39855.Method_8274());
                this.Field_20180.Field_105.Method_45451(Class_9802.Method_9806("mount.onboard", arrobject), (5153 & -15724) != 0);
            }
        } else if (class_34578.Method_34582() == (1313 & 12357) && class_1061 instanceof Class_34093) {
            if (class_10612 != null) {
                ((Class_34093)class_1061).Method_34152(class_10612, (10433 & 20482) != 0);
            } else {
                ((Class_34093)class_1061).Method_34146((16532 & 0) != 0, (-32000 & 21575) != 0);
            }
        }
    }

    public void Method_20201(Class_27146 class_27146) {
        Class_34388.Method_34390(class_27146, this, this.Field_20180);
        Class_1378 class_1378 = this.Field_20180.Field_48;
        int n = class_27146.Method_27156();
        float f = class_27146.Method_27152();
        int n2 = Class_13337.Method_13377(f + 0.61728394f * 0.81f);
        if (n >= 0 && n < Class_27146.Field_27147.length && Class_27146.Field_27147[n] != null) {
            class_1378.Method_854(new Class_2849(Class_27146.Field_27147[n], new Object[649 & 256]));
        }
        if (n == (2049 & -31655)) {
            this.Field_20169.\u0000strictfp().Method_31828((-29151 & 8261) != 0);
            this.Field_20169.\u0000, `(0.0f);
        } else if (n == (21067 & -32762)) {
            this.Field_20169.\u0000strictfp().Method_31828((4116 & -21376) != 0);
            this.Field_20169.\u0000, `(1.0f);
        } else if (n == (-19437 & 2571)) {
            this.Field_20180.Field_61.Method_11752(Class_35650.Method_35659(n2));
        } else if (n == (759 & -4092)) {
            this.Field_20180.Method_218(new Class_22314());
        } else if (n == (-24553 & 17477)) {
            Class_39702 class_39702 = this.Field_20180.Field_84;
            if (f == 0.0f) {
                this.Field_20180.Method_218(new Class_27170());
            } else if (f == 1.15625f * 87.35135f) {
                Object[] arrobject = new Object[17452 & -24572];
                arrobject[21777 & -32092] = Class_39702.Method_39914(class_39702.Field_39772.Method_8274());
                arrobject[-26559 & 8993] = Class_39702.Method_39914(class_39702.Field_39726.Method_8274());
                arrobject[2090 & -24510] = Class_39702.Method_39914(class_39702.Field_39803.Method_8274());
                arrobject[-30669 & 12491] = Class_39702.Method_39914(class_39702.Field_39759.Method_8274());
                this.Field_20180.Field_105.Method_45458().Method_41188(new Class_2849("demo.help.movement", arrobject));
            } else if (f == 0.5192308f * 196.44444f) {
                Object[] arrobject = new Object[-29615 & 259];
                arrobject[14339 & -32176] = Class_39702.Method_39914(class_39702.Field_39703.Method_8274());
                this.Field_20180.Field_105.Method_45458().Method_41188(new Class_2849("demo.help.jump", arrobject));
            } else if (f == 0.22680412f * 454.13635f) {
                Object[] arrobject = new Object[22531 & 37];
                arrobject[2053 & -31454] = Class_39702.Method_39914(class_39702.Field_39818.Method_8274());
                this.Field_20180.Field_105.Method_45458().Method_41188(new Class_2849("demo.help.inventory", arrobject));
            }
        } else if (n == (11270 & 16807)) {
            this.Field_20169.Method_589(class_1378.\u0000= package, class_1378.\u0000, for() + (double)class_1378.Method_837(), class_1378.\u0000= switch, "random.successful_hit", 0.28588238f * 0.6296296f, 3.4285715f * 0.13125f, (4742 & -6080) != 0);
        } else if (n == (5415 & 25239)) {
            this.Field_20169.\u0000, `(f);
        } else if (n == (2574 & 16616)) {
            this.Field_20169.\u0000strictfp(f);
        } else if (n == (8522 & -28150)) {
            this.Field_20169.\u0000strictfp(Class_40274.Field_40285, class_1378.\u0000= package, class_1378.\u0000, for(), class_1378.\u0000= switch, 0.0, 0.0, 0.0, new int[12392 & 3074]);
            this.Field_20169.Method_589(class_1378.\u0000= package, class_1378.\u0000, for(), class_1378.\u0000= switch, "mob.guardian.curse", 1.0f, 1.0f, (800 & 16516) != 0);
        }
    }

    public void Method_20202(Class_27278 class_27278) {
        Class_34388.Method_34390(class_27278, this, this.Field_20180);
        Class_1061 class_1061 = this.Field_20169.Method_601(class_27278.Method_27281());
        if (class_1061 != null) {
            if (class_27278.Method_27287() == 0) {
                Class_859 class_859 = (Class_859)class_1061;
                class_859.Method_975();
            } else if (class_27278.Method_27287() == (-23547 & 16785)) {
                class_1061.Method_1293();
            } else if (class_27278.Method_27287() == (-24570 & 2434)) {
                Class_626 class_626 = (Class_626)class_1061;
                class_626.Method_813((16672 & 7297) != 0, (8328 & -32746) != 0, (-20430 & 324) != 0);
            } else if (class_27278.Method_27287() == (-22364 & 5188)) {
                this.Field_20180.Field_129.Method_27579(class_1061, Class_40274.Field_40319);
            } else if (class_27278.Method_27287() == (21477 & -24561)) {
                this.Field_20180.Field_129.Method_27579(class_1061, Class_40274.Field_40320);
            }
        }
    }

    public void Method_20203(Class_22528 class_22528) {
        Class_34388.Method_34390(class_22528, this, this.Field_20180);
        Class_1061 class_1061 = class_22528.Method_22532(this.Field_20169);
        if (class_1061 != null) {
            float f = (float)(class_22528.Method_22533() * (-22680 & 364)) / (1.375f * 186.18182f);
            class_1061.Method_1200(f);
        }
    }

    public void Method_20204(Class_27591 class_27591) {
        Class_34388.Method_34390(class_27591, this, this.Field_20180);
        Class_1061 class_1061 = this.Field_20169.Method_601(class_27591.Method_27605());
        if (class_1061 != null) {
            class_27591.Field_27594 = (double)class_27591.Field_27599 / Class_27591.Field_27592.Method_2199();
            class_27591.Field_27593 = (double)class_27591.Field_27595 / Class_27591.Field_27592.Method_2199();
            class_27591.Field_27598 = (double)class_27591.Field_27597 / Class_27591.Field_27592.Method_2199();
            class_1061.Method_1305(class_27591.Field_27594, class_27591.Field_27593, class_27591.Field_27598);
        }
    }

    public void Method_20205(Class_30898 class_30898) {
        Class_34388.Method_34390(class_30898, this, this.Field_20180);
        double d = (double)class_30898.Method_30912() / (3.25 * 9.846153846153847) + 0.23046875 * 0.06779661016949153;
        double d2 = (double)class_30898.Method_30911() / (19.692307692307693 * 1.625) + 1.2727272727272727 * 0.012276785714285714;
        double d3 = (double)class_30898.Method_30908() / (9.63855421686747 * 3.32) + 1.875 * 0.008333333333333333;
        Class_27363 class_27363 = null;
        if (class_30898.Method_30904() == (1891 & 24577)) {
            class_27363 = new Class_27363(this.Field_20169, d, d2, d3);
        }
        if (class_27363 != null) {
            class_27363.Field_1112 = class_30898.Method_30912();
            class_27363.Field_1105 = class_30898.Method_30911();
            class_27363.Field_1111 = class_30898.Method_30908();
            class_27363.Field_1079 = 0.0f;
            class_27363.Field_1093 = 0.0f;
            class_27363.Method_1366(class_30898.Method_30906());
            this.Field_20169.\u0000, `((Class_1061)class_27363);
        }
    }

    public void Method_20206(Class_23151 class_23151) {
        Class_34388.Method_34390(class_23151, this, this.Field_20180);
        Class_1061 class_1061 = this.Field_20169.Method_601(class_23151.Method_23160());
        if (class_1061 != null) {
            class_1061.Field_1112 = class_23151.Method_23168();
            class_1061.Field_1105 = class_23151.Method_23164();
            class_1061.Field_1111 = class_23151.Method_23159();
            double d = (double)class_1061.Field_1112 / (16.59259259259259 * 1.9285714285714286) + 3.25 * 0.004807692307692308;
            double d2 = (double)class_1061.Field_1105 / (7.0 * 4.571428571428571) + 0.5373134328358209 * 0.029079861111111112;
            double d3 = (double)class_1061.Field_1111 / (4.0 * 8.0) + 0.01875 * 0.8333333333333334;
            float f = (float)(class_23151.Method_23169() * (-32404 & 4457)) / (286.72f * 0.89285713f);
            float f2 = (float)(class_23151.Method_23163() * (361 & 10616)) / (998.39996f * 0.25641027f);
            if (Math.abs(class_1061.Field_1130 - d) < 0.013117283950617285 * 2.3823529411764706 && Math.abs(class_1061.Method_1324() - d2) < 3.5 * 0.004464285714285714 && Math.abs(class_1061.Field_1106 - d3) < 0.044034090909090905 * 0.7096774193548387) {
                class_1061.Method_1210(class_1061.Field_1130, class_1061.Method_1324(), class_1061.Field_1106, f, f2, this.Method_20237(class_1061), (577 & 2451) != 0);
            } else {
                class_1061.Method_1210(d, d2, d3, f, f2, this.Method_20237(class_1061), (593 & 13) != 0);
            }
            class_1061.Method_1213(class_23151.Method_23170());
        }
    }

    public void Method_20207(Class_37207 class_37207) {
        this.Field_20180.Field_105.Method_45459().Method_47006(class_37207.Method_37210().Method_1783().length() == 0 ? null : class_37207.Method_37210());
        this.Field_20180.Field_105.Method_45459().Method_47007(class_37207.Method_37215().Method_1783().length() == 0 ? null : class_37207.Method_37215());
    }

    public void Method_20208(Class_23680 class_23680) {
        Class_34388.Method_34390(class_23680, this, this.Field_20180);
        if (class_23680.Method_23685()) {
            this.Field_20180.Field_72.\u0000, `(class_23680.Method_23688(), class_23680.Method_23691(), class_23680.Method_23687());
        } else {
            this.Field_20180.Field_72.\u0000strictfp(class_23680.Method_23688(), class_23680.Method_23691(), class_23680.Method_23687());
        }
    }

    public void Method_20209(Class_37357 class_37357) {
        if (!this.Method_20227(class_37357.Method_37360(), class_37357.Method_37362())) {
            return;
        }
        String string = class_37357.Method_37360();
        String string2 = class_37357.Method_37362();
        if (string.startsWith("level://")) {
            File file = new File(this.Field_20180.Field_68, "saves");
            String string3 = string.substring("level://".length());
            File file2 = new File(file, string3);
            if (file2.isFile()) {
                this.Field_20181.Method_44629(new Class_34764(string2, Class_11247.Field_11250));
                Futures.addCallback((ListenableFuture)this.Field_20180.Method_200().Method_10524(file2), (FutureCallback)new Class_9732(this, string2));
            } else {
                this.Field_20181.Method_44629(new Class_34764(string2, Class_11247.Field_11251));
            }
        } else if (this.Field_20180.Method_184() != null && this.Field_20180.Method_184().Method_15502() == Class_17874.Field_17878) {
            this.Field_20181.Method_44629(new Class_34764(string2, Class_11247.Field_11250));
            Futures.addCallback((ListenableFuture)this.Field_20180.Method_200().Method_10522(string, string2), (FutureCallback)new Class_30781(this, string2));
        } else if (this.Field_20180.Method_184() != null && this.Field_20180.Method_184().Method_15502() != Class_17874.Field_17879) {
            this.Field_20181.Method_44629(new Class_34764(string2, Class_11247.Field_11252));
        } else {
            this.Field_20180.Method_229(new Class_33216(this, string2, string));
        }
    }

    public void Method_20210(Class_33398 class_33398) {
        Class_34388.Method_34390(class_33398, this, this.Field_20180);
        this.Field_20180.Field_48.\u0000strictfp(class_33398.Method_33400(), (2213 & 12545) != 0);
        this.Field_20180.Field_72.\u0000strictfp().Method_31785(class_33398.Method_33400());
    }

    public void Method_20211(Class_21755 class_21755) {
        Class_34388.Method_34390(class_21755, this, this.Field_20180);
        double d = (double)class_21755.Method_21774() / (8.2 * 3.9024390243902443) + 1.625 * 0.009615384615384616;
        double d2 = (double)class_21755.Method_21775() / (26.39175257731959 * 1.2125) + 1.7333333333333334 * 0.009014423076923076;
        double d3 = (double)class_21755.Method_21773() / (0.07936507936507936 * 403.20000000000005) + 0.013997395833333334 * 1.1162790697674418;
        float f = (float)(class_21755.Method_21777() * (-31766 & 10601)) / (219.82608f * 1.164557f);
        float f2 = (float)(class_21755.Method_21771() * (3432 & -24200)) / (55.351353f * 4.625f);
        Class_32194 class_32194 = new Class_32194(this.Field_20180.Field_72, this.Method_20195(class_21755.Method_21776()).Method_9758());
        class_32194.\u0000= ? = class_21755.Method_21774();
        class_32194.\u0000, for = class_32194.\u0000= ?;
        class_32194.\u0000= final(class_32194.\u0000, for);
        class_32194.\u0000, # = class_21755.Method_21775();
        class_32194.\u0000, 2 = class_32194.\u0000, #;
        class_32194.\u0000strictfp(class_32194.\u0000, 2);
        class_32194.\u0000abstract = class_21755.Method_21773();
        class_32194.\u0000, # = class_32194.\u0000abstract;
        class_32194.\u0000
        (class_32194.\u0000, #);
        int n = class_21755.Method_21766();
        class_32194.\u0000strictfp.Field_37784[class_32194.\u0000strictfp.Field_37782] = n == 0 ? null : new Class_23823(Class_1956.Method_1978(n), 17187 & -28595, 2084 & 25665);
        class_32194.\u0000strictfp(d, d2, d3, f, f2);
        this.Field_20169.Method_591(class_21755.Method_21768(), class_32194);
        List list = class_21755.Method_21772();
        if (list != null) {
            class_32194.\u0000strictfp().Method_32705(list);
        }
    }

    public void Method_20212(Class_33020 class_33020) {
        this.Method_20245(new Class_34421(class_33020.Method_33022()));
    }

    public void Method_20213(Class_30753 class_30753) {
        Class_34388.Method_34390(class_30753, this, this.Field_20180);
        this.Field_20180.Field_72.\u0000= final(class_30753.Method_30760(), class_30753.Method_30764(), class_30753.Method_30765(), class_30753.Method_30759());
    }

    public void Method_20214(Class_26444 class_26444) {
        this.Field_20182 = 513 & 65;
        this.Field_20181.Method_44622(class_26444.Method_26451());
    }

    public void Method_20215(Class_26115 class_26115) {
        Class_34388.Method_34390(class_26115, this, this.Field_20180);
        Class_1061 class_1061 = this.Field_20169.Method_601(class_26115.Method_26118());
        if (class_1061 != null && class_26115.Method_26122() != null) {
            class_1061.Method_1226().Method_32705(class_26115.Method_26122());
        }
    }

    public void Method_20216(Class_27517 class_27517) {
        Class_34388.Method_34390(class_27517, this, this.Field_20180);
        class_27517.Method_27529(this.Field_20169.\u0000strictfp());
    }

    public void Method_20217(Class_44480 class_44480) {
        Class_34388.Method_34390(class_44480, this, this.Field_20180);
        Class_20976 class_20976 = this.Field_20169.\u0000strictfp();
        Class_7873 class_7873 = class_20976.Method_21003(class_44480.Method_44485());
        if (class_44480.Method_44489() == Class_16202.Field_16204) {
            Class_21696 class_21696 = class_20976.Method_20993(class_44480.Method_44490(), class_7873);
            class_21696.Method_21709(class_44480.Method_44491());
        } else if (class_44480.Method_44489() == Class_16202.Field_16203) {
            if (Class_35310.Method_35315(class_44480.Method_44485())) {
                class_20976.Method_21006(class_44480.Method_44490(), null);
            } else if (class_7873 != null) {
                class_20976.Method_21006(class_44480.Method_44490(), class_7873);
            }
        }
    }

    public void Method_20218() {
        Class_12251.Method_12259(this);
    }

    public void Method_20219(Class_37119 class_37119) {
        Class_34388.Method_34390(class_37119, this, this.Field_20180);
        double d = (double)class_37119.Method_37137() / (101.71428571428572 * 0.3146067415730337) + 0.011814024390243903 * 1.3225806451612903;
        double d2 = (double)class_37119.Method_37148() / (1.1219512195121952 * 28.52173913043478) + 1.6666666666666667 * 0.009375;
        double d3 = (double)class_37119.Method_37146() / (149.33333333333334 * 0.21428571428571427) + 0.017410714285714286 * 0.8974358974358975;
        float f = (float)(class_37119.Method_37149() * (15213 & 360)) / (2.2941177f * 111.589745f);
        float f2 = (float)(class_37119.Method_37141() * (24941 & 488)) / (648.0f * 0.39506173f);
        Class_859 class_859 = (Class_859)Class_15516.Method_15534(class_37119.Method_37136(), this.Field_20180.Field_72);
        class_859.\u0000= ? = class_37119.Method_37137();
        class_859.\u0000, # = class_37119.Method_37148();
        class_859.\u0000abstract = class_37119.Method_37146();
        class_859.Field_898 = class_859.Field_891 = (float)(class_37119.Method_37143() * (4968 & -23192)) / (1.2857143f * 199.11111f);
        Class_1061[] arrclass_1061 = class_859.\u0000strictfp();
        if (arrclass_1061 != null) {
            int n = class_37119.Method_37145() - class_859.\u0000, `();
            for (int i = 64 & -4854; i < arrclass_1061.length; ++i) {
                arrclass_1061[i].Method_1366(arrclass_1061[i].Method_1311() + n);
            }
        }
        class_859.\u0000= switch(class_37119.Method_37145());
        class_859.\u0000strictfp(d, d2, d3, f, f2);
        float f3 = Class_859.Field_917;
        class_859.\u0000= ` = (float)class_37119.Method_37140() / (1500.0f * 26.666666f) / f3;
        class_859.\u0000%((double)((float)class_37119.Method_37135() / (25500.0f * 1.5686275f) / f3));
        class_859.\u0000switch = (float)class_37119.Method_37142() / (0.16666667f * 240000.0f) / f3;
        this.Field_20169.Method_591(class_37119.Method_37145(), class_859);
        List list = class_37119.Method_37144();
        if (list != null) {
            class_859.\u0000strictfp().Method_32705(list);
        }
    }

    public void Method_20220(Class_23064 class_23064) {
        Class_34388.Method_34390(class_23064, this, this.Field_20180);
        Class_20976 class_20976 = this.Field_20169.\u0000strictfp();
        Class_22057 class_22057 = class_23064.Method_23086() == 0 ? class_20976.Method_21008(class_23064.Method_23075()) : class_20976.Method_21018(class_23064.Method_23075());
        if (class_22057 == null) {
            Class_18.Field_19.warn("team named " + class_23064.Method_23075() + " does not exist");
            return;
        }
        if (class_23064.Method_23086() == (642 & 20595)) {
            // empty if block
        }
        if (class_23064.Method_23086() == 0 || class_23064.Method_23086() == (1166 & 28674)) {
            class_22057.Method_22076(class_23064.Method_23079());
            class_22057.Method_22072(class_23064.Method_23078());
            class_22057.Method_22071(class_23064.Method_23085());
            class_22057.Method_22074(Class_5478.Method_5549(class_23064.Method_23074()));
            class_22057.Method_22078(class_23064.Method_23087());
            Class_31355 class_31355 = Class_31355.Method_31373(class_23064.Method_23080());
            if (class_31355 != null) {
                class_22057.Method_22073(class_31355);
            }
        }
        if (class_23064.Method_23086() == 0 || class_23064.Method_23086() == (12551 & -31125)) {
            for (String string : class_23064.Method_23081()) {
                class_20976.Method_20998(string, class_23064.Method_23075());
            }
        }
        if (class_23064.Method_23086() == (12308 & 1486)) {
            for (String string : class_23064.Method_23081()) {
                class_20976.Method_21017(string, class_22057);
            }
        }
        if (class_23064.Method_23086() == (353 & 19601)) {
            class_20976.Method_21012(class_22057);
        }
    }

    public void Method_20221(Class_23546 class_23546) {
        Class_34388.Method_34390(class_23546, this, this.Field_20180);
        Class_1378 class_1378 = this.Field_20180.Field_48;
        if (class_23546.Method_23555() == 0) {
            class_1378.Field_681.Method_8332(class_23546.Method_23549());
        } else if (class_23546.Method_23555() == class_1378.Field_665.Field_8298) {
            class_1378.Field_665.Method_8332(class_23546.Method_23549());
        }
    }

    public void Method_20222(Class_40073 class_40073) {
        Class_34388.Method_34390(class_40073, this, this.Field_20180);
        for (int i = 2244 & 16682; i < class_40073.Method_40084(); ++i) {
            int n = class_40073.Method_40085(i);
            int n2 = class_40073.Method_40083(i);
            this.Field_20169.Method_597(n, n2, (28807 & -32191) != 0);
            this.Field_20169.Method_612(n << (596 & -31706), 77 & 288, n2 << (-16354 & 8196), (n << (2054 & 8660)) + (16399 & 4143), 1931 & -32432, (n2 << (-21467 & 708)) + (2159 & 15));
            Class_17665 class_17665 = this.Field_20169.Method_587(n, n2);
            class_17665.Method_17748(class_40073.Method_40086(i), class_40073.Method_40079(i), (8263 & 1025) != 0);
            this.Field_20169.\u0000, `(n << (9030 & 20492), -12279 & 3376, n2 << (292 & 1613), (n << (12301 & -15098)) + (-24497 & 16415), 16652 & 12640, (n2 << (1188 & 24580)) + (271 & 63));
            if (this.Field_20169.\u0000strictfp instanceof Class_19777) continue;
            class_17665.Method_17756();
        }
    }

    public void Method_20223(Class_21824 class_21824) {
        Class_34388.Method_34390(class_21824, this, this.Field_20180);
        for (int i = 548 & -4024; i < class_21824.Method_21831().length; ++i) {
            this.Field_20169.Method_614(class_21824.Method_21831()[i]);
        }
    }

    public void Method_20224(Class_39461 class_39461) {
        Class_34388.Method_34390(class_39461, this, this.Field_20180);
        Class_32274 class_32274 = class_39461.Method_39474();
        String string = null;
        String string2 = null;
        String string3 = class_39461.Method_39468() != null ? class_39461.Method_39468().Method_1783() : "";
        switch (Class_43523.Field_43524[class_32274.ordinal()]) {
            case 1: {
                string = string3;
                break;
            }
            case 2: {
                string2 = string3;
                break;
            }
            case 3: {
                this.Field_20180.Field_105.Method_45462("", "", -1 & -1, -1 & -1, -1 & -1);
                this.Field_20180.Field_105.Method_45437();
                return;
            }
        }
        this.Field_20180.Field_105.Method_45462(string, string2, class_39461.Method_39473(), class_39461.Method_39469(), class_39461.Method_39472());
    }

    public void Method_20225(Class_36890 class_36890) {
        Class_34388.Method_34390(class_36890, this, this.Field_20180);
        this.Field_20180.Field_48.Method_1453(class_36890.Method_36896());
        this.Field_20180.Field_48.\u0000strictfp().Method_26081(class_36890.Method_36901());
        this.Field_20180.Field_48.\u0000strictfp().Method_26080(class_36890.Method_36894());
    }

    public void Method_20226(Class_31558 class_31558) {
        Class_34388.Method_34390(class_31558, this, this.Field_20180);
        String[] arrstring = class_31558.Method_31565();
        if (this.Field_20180.Field_36 instanceof Class_1864) {
            Class_1864 class_1864 = (Class_1864)this.Field_20180.Field_36;
            class_1864.Method_1885(arrstring);
        }
    }

    private boolean Method_20227(String string, String string2) {
        try {
            URI uRI = new URI(string);
            String string3 = uRI.getScheme();
            boolean bl = "level".equals(string3);
            if (!("http".equals(string3) || "https".equals(string3) || bl)) {
                this.Field_20181.Method_44629(new Class_34764(string2, Class_11247.Field_11251));
                throw new URISyntaxException(string, "Wrong protocol");
            }
            string = URLDecoder.decode(string.substring("level://".length()), StandardCharsets.UTF_8.toString());
            if (bl && (string.contains("..") || !string.endsWith("/resources.zip"))) {
                System.out.println("Malicious server tried to access " + string);
                Class_1378 class_1378 = Class_18.Field_89.Field_48;
                if (class_1378 != null) {
                    class_1378.Method_1412(new Class_2840((Object)((Object)Class_5478.Field_5505) + Class_5478.Field_5486.Method_5540() + "[WARNING] The current server has attempted to be malicious but we have stopped them."));
                }
                throw new URISyntaxException(string, "Invalid levelstorage resourcepack path");
            }
            return (-32699 & 8225) != 0;
        }
        catch (URISyntaxException uRISyntaxException) {
            return (64 & 26130) != 0;
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            unsupportedEncodingException.printStackTrace();
            return (16480 & -30076) != 0;
        }
    }

    public void Method_20228(Class_33311 class_33311) {
        Class_34388.Method_34390(class_33311, this, this.Field_20180);
        Class_1061 class_1061 = this.Field_20169.Method_601(class_33311.Method_33319());
        if (class_1061 instanceof Class_859) {
            ((Class_859)class_1061).Method_1035(class_33311.Method_33316());
        }
    }

    public void Method_20229(Class_27203 class_27203) {
        Class_34388.Method_34390(class_27203, this, this.Field_20180);
        Class_20976 class_20976 = this.Field_20169.\u0000strictfp();
        if (class_27203.Method_27212().length() == 0) {
            class_20976.Method_20999(class_27203.Method_27208(), null);
        } else {
            Class_7873 class_7873 = class_20976.Method_21003(class_27203.Method_27212());
            class_20976.Method_20999(class_27203.Method_27208(), class_7873);
        }
    }

    public Class_44584 Method_20230() {
        return this.Field_20181;
    }

    public void Method_20231(Class_24663 class_24663) {
        Class_34388.Method_34390(class_24663, this, this.Field_20180);
        if (this.Field_20180.Field_72.\u0000
        (class_24663.Method_24669())) {
            Class_4879 class_4879 = this.Field_20180.Field_72.\u0000strictfp(class_24663.Method_24669());
            int n = class_24663.Method_24667();
            if (n == (3153 & 4385) && class_4879 instanceof Class_36325 || n == (4226 & -15870) && class_4879 instanceof Class_43621 || n == (-16317 & 7443) && class_4879 instanceof Class_47216 || n == (-24828 & 8228) && class_4879 instanceof Class_37700 || n == (28813 & 69) && class_4879 instanceof Class_34660 || n == (-15274 & 8750) && class_4879 instanceof Class_39935) {
                class_4879.Method_4911(class_24663.Method_24674());
            }
        }
    }

    public void Method_20232(Class_23698 class_23698) {
        Class_34388.Method_34390(class_23698, this, this.Field_20180);
        this.Field_20180.Field_72.\u0000strictfp().Method_31801(class_23698.Method_23707());
        this.Field_20180.Field_72.\u0000strictfp().Method_31837(class_23698.Method_23706());
    }

    public void Method_20233(Class_21029 class_21029) {
        Class_34388.Method_34390(class_21029, this, this.Field_20180);
        if (class_21029.Method_21049() == 0) {
            double d = class_21029.Method_21046() * class_21029.Method_21055();
            double d2 = class_21029.Method_21046() * class_21029.Method_21048();
            double d3 = class_21029.Method_21046() * class_21029.Method_21047();
            try {
                this.Field_20169.\u0000strictfp(class_21029.Method_21054(), class_21029.Method_21051(), class_21029.Method_21056(), class_21029.Method_21052(), class_21029.Method_21043(), d, d2, d3, class_21029.Method_21053());
            }
            catch (Throwable throwable) {
                Field_20167.warn("Could not spawn particle effect " + (Object)((Object)class_21029.Method_21054()));
            }
        } else {
            for (int i = 2064 & -19861; i < class_21029.Method_21049(); ++i) {
                double d = this.Field_20170.nextGaussian() * (double)class_21029.Method_21055();
                double d4 = this.Field_20170.nextGaussian() * (double)class_21029.Method_21048();
                double d5 = this.Field_20170.nextGaussian() * (double)class_21029.Method_21047();
                double d6 = this.Field_20170.nextGaussian() * (double)class_21029.Method_21046();
                double d7 = this.Field_20170.nextGaussian() * (double)class_21029.Method_21046();
                double d8 = this.Field_20170.nextGaussian() * (double)class_21029.Method_21046();
                try {
                    this.Field_20169.\u0000strictfp(class_21029.Method_21054(), class_21029.Method_21051(), class_21029.Method_21056() + d, class_21029.Method_21052() + d4, class_21029.Method_21043() + d5, d6, d7, d8, class_21029.Method_21053());
                    continue;
                }
                catch (Throwable throwable) {
                    Field_20167.warn("Could not spawn particle effect " + (Object)((Object)class_21029.Method_21054()));
                    return;
                }
            }
        }
    }

    public void Method_20234(Class_44788 class_44788) {
        Class_34388.Method_34390(class_44788, this, this.Field_20180);
        this.Field_20180.Field_72.\u0000, `(class_44788.Method_44791());
        this.Field_20180.Field_72.Method_598(class_44788.Method_44797());
    }

    public void Method_20235(Class_25724 class_25724) {
        Class_34388.Method_34390(class_25724, this, this.Field_20180);
        if (class_25724.Method_25731() != this.Field_20180.Field_48.\u0000= catch) {
            this.Field_20178 = 11264 & -28153;
            Class_20976 class_20976 = this.Field_20169.\u0000strictfp();
            this.Field_20169 = new Class_570(this, new Class_9780(1025149981925017892L & -1025149983285815661L, class_25724.Method_25737(), (8340 & 6401) != 0, this.Field_20180.Field_72.\u0000strictfp().Method_31839(), class_25724.Method_25736()), class_25724.Method_25731(), class_25724.Method_25730(), this.Field_20180.Field_25);
            this.Field_20169.Field_575 = this.Field_20168 != null ? this.Field_20168.Field_29752 : 517 & 6401;
            this.Field_20169.Method_584(class_20976);
            this.Field_20180.Method_199(this.Field_20169);
            this.Field_20180.Field_48.\u0000= catch = class_25724.Method_25731();
        }
        this.Field_20180.Method_182(class_25724.Method_25731());
        this.Field_20180.Field_61.Method_11752(class_25724.Method_25737());
    }

    public void Method_20236(Class_34431 class_34431) {
        Class_34388.Method_34390(class_34431, this, this.Field_20180);
        Class_1061 class_1061 = this.Field_20169.Method_601(class_34431.Method_34434());
        Class_859 class_859 = (Class_859)this.Field_20169.Method_601(class_34431.Method_34436());
        if (class_859 == null) {
            class_859 = this.Field_20180.Field_48;
        }
        if (class_1061 != null) {
            if (class_1061 instanceof Class_3481) {
                this.Field_20169.\u0000strictfp(class_1061, "random.orb", 15.0f * 0.013333334f, ((this.Field_20170.nextFloat() - this.Field_20170.nextFloat()) * (0.6875f * 1.0181818f) + 1.0f) * 2.0f);
            } else {
                this.Field_20169.\u0000strictfp(class_1061, "random.pop", 1.2580645f * 0.15897436f, ((this.Field_20170.nextFloat() - this.Field_20170.nextFloat()) * (0.46753246f * 1.4972222f) + 1.0f) * 2.0f);
            }
            this.Field_20180.Field_129.Method_27564(new Class_44164(this.Field_20169, class_1061, class_859, 0.2826087f * 1.7692308f));
            this.Field_20169.Method_614(class_34431.Method_34434());
        }
    }

    public int Method_20237(Class_1061 class_1061) {
        if (class_1061 instanceof Class_626) {
            return 1027 & 26755;
        }
        return 16659 & 1159;
    }

    public void Method_20238(Class_40151 class_40151) {
        Class_34388.Method_34390(class_40151, this, this.Field_20180);
        Class_1061 class_1061 = this.Field_20169.Method_601(class_40151.Method_40162());
        if (class_1061 instanceof Class_859) {
            Class_25240 class_25240 = new Class_25240(class_40151.Method_40166(), class_40151.Method_40164(), class_40151.Method_40163(), (26688 & -28256) != 0, class_40151.Method_40158());
            class_25240.Method_25262(class_40151.Method_40157());
            ((Class_859)class_1061).Method_995(class_25240);
        }
    }

    public void Method_20239(Class_44732 class_44732) {
        Class_1061[] arrclass_1061;
        Class_34388.Method_34390(class_44732, this, this.Field_20180);
        double d = (double)class_44732.Method_44759() / (7.375 * 4.338983050847458) + 1.3333333333333333 * 0.01171875;
        double d2 = (double)class_44732.Method_44752() / (26.27368421052632 * 1.2179487179487178) + 0.019583333333333335 * 0.7978723404255319;
        double d3 = (double)class_44732.Method_44753() / (0.92 * 34.78260869565217) + 1.1842105263157894 * 0.013194444444444446;
        Class_1061 class_1061 = null;
        if (class_44732.Method_44760() == (5515 & 522)) {
            class_1061 = Class_15933.Method_15952(this.Field_20169, d, d2, d3, Class_15120.Method_15150(class_44732.Method_44766()));
        } else if (class_44732.Method_44760() == (16766 & -22822)) {
            arrclass_1061 = this.Field_20169.Method_601(class_44732.Method_44766());
            if (arrclass_1061 instanceof Class_626) {
                class_1061 = new Class_32050(this.Field_20169, d, d2, d3, (Class_626)arrclass_1061);
            }
            class_44732.Method_44765(1 & 19216);
        } else if (class_44732.Method_44760() == (-23492 & 21308)) {
            class_1061 = new Class_41498(this.Field_20169, d, d2, d3);
        } else if (class_44732.Method_44760() == (-32067 & 21567)) {
            class_1061 = new Class_34918(this.Field_20169, d, d2, d3);
        } else if (class_44732.Method_44760() == (615 & -32425)) {
            class_1061 = new Class_36512(this.Field_20169, new Class_4751(Class_13337.Method_13371(d), Class_13337.Method_13371(d2), Class_13337.Method_13371(d3)), Class_4595.Method_4628(class_44732.Method_44766()));
            class_44732.Method_44765(-32383 & 21506);
        } else if (class_44732.Method_44760() == (-31649 & 8429)) {
            class_1061 = new Class_32225(this.Field_20169, new Class_4751(Class_13337.Method_13371(d), Class_13337.Method_13371(d2), Class_13337.Method_13371(d3)));
            class_44732.Method_44765(14373 & 17408);
        } else if (class_44732.Method_44760() == (2369 & 29893)) {
            class_1061 = new Class_34203(this.Field_20169, d, d2, d3);
        } else if (class_44732.Method_44760() == (1144 & -30645)) {
            class_1061 = new Class_25548(this.Field_20169, d, d2, d3);
        } else if (class_44732.Method_44760() == (2140 & 76)) {
            class_1061 = new Class_41709(this.Field_20169, d, d2, d3, null);
        } else if (class_44732.Method_44760() == (767 & 3391)) {
            class_1061 = new Class_34950(this.Field_20169, d, d2, d3, (double)class_44732.Method_44746() / (5929.411764705882 * 1.3492063492063493), (double)class_44732.Method_44761() / (4.071428571428571 * 1964.9122807017545), (double)class_44732.Method_44762() / (13647.058823529413 * 0.5862068965517241));
            class_44732.Method_44765(2050 & 12848);
        } else if (class_44732.Method_44760() == (-30144 & 1120)) {
            class_1061 = new Class_36739(this.Field_20169, d, d2, d3, (double)class_44732.Method_44746() / (11317.073170731708 * 0.7068965517241379), (double)class_44732.Method_44761() / (10.75 * 744.1860465116279), (double)class_44732.Method_44762() / (13200.0 * 0.6060606060606061));
            class_44732.Method_44765(11335 & 144);
        } else if (class_44732.Method_44760() == (-16185 & 610)) {
            class_1061 = new Class_47728(this.Field_20169, d, d2, d3, (double)class_44732.Method_44746() / (1.1363636363636365 * 7039.999999999999), (double)class_44732.Method_44761() / (12000.0 * 0.6666666666666666), (double)class_44732.Method_44762() / (16533.333333333332 * 0.4838709677419355));
            class_44732.Method_44765(-32364 & 7681);
        } else if (class_44732.Method_44760() == (703 & 8510)) {
            class_1061 = new Class_47588(this.Field_20169, d, d2, d3);
        } else if (class_44732.Method_44760() == (1533 & 2121)) {
            class_1061 = new Class_43663((Class_283)this.Field_20169, d, d2, d3, class_44732.Method_44766());
            class_44732.Method_44765(-28607 & 26624);
        } else if (class_44732.Method_44760() == (8315 & 17611)) {
            class_1061 = new Class_35722(this.Field_20169, d, d2, d3);
            class_44732.Method_44765(9728 & 275);
        } else if (class_44732.Method_44760() == (-31613 & 24577)) {
            class_1061 = new Class_25683(this.Field_20169, d, d2, d3);
        } else if (class_44732.Method_44760() == (51 & 16434)) {
            class_1061 = new Class_5813(this.Field_20169, d, d2, d3, null);
        } else if (class_44732.Method_44760() == (-23954 & 206)) {
            class_1061 = new Class_27288(this.Field_20169, d, d2, d3);
        } else if (class_44732.Method_44760() == (-24269 & 16575)) {
            class_1061 = new Class_14845(this.Field_20169, d, d2, d3);
        } else if (class_44732.Method_44760() == (8643 & 30)) {
            class_1061 = new Class_3443(this.Field_20169, d, d2, d3);
        } else if (class_44732.Method_44760() == (18502 & -32666)) {
            class_1061 = new Class_4486(this.Field_20169, d, d2, d3, Class_3238.Method_3346(class_44732.Method_44766() & (1076363263 & 55115775)));
            class_44732.Method_44765(18690 & 112);
        }
        if (class_1061 != null) {
            class_1061.Field_1112 = class_44732.Method_44759();
            class_1061.Field_1105 = class_44732.Method_44752();
            class_1061.Field_1111 = class_44732.Method_44753();
            class_1061.Field_1093 = (float)(class_44732.Method_44745() * (2408 & 361)) / (10.333333f * 24.774195f);
            class_1061.Field_1079 = (float)(class_44732.Method_44763() * (-32392 & 11624)) / (571.0769f * 0.44827586f);
            arrclass_1061 = class_1061.Method_1275();
            if (arrclass_1061 != null) {
                int n = class_44732.Method_44750() - class_1061.Method_1311();
                for (int i = 4224 & 772; i < arrclass_1061.length; ++i) {
                    arrclass_1061[i].Method_1366(arrclass_1061[i].Method_1311() + n);
                }
            }
            class_1061.Method_1366(class_44732.Method_44750());
            this.Field_20169.Method_591(class_44732.Method_44750(), class_1061);
            if (class_44732.Method_44766() > 0) {
                Class_1061 class_10612;
                if (class_44732.Method_44760() == (28734 & 2620) && (class_10612 = this.Field_20169.Method_601(class_44732.Method_44766())) instanceof Class_859 && class_1061 instanceof Class_41498) {
                    ((Class_41498)class_1061).Field_41501 = class_10612;
                }
                class_1061.Method_1305((double)class_44732.Method_44746() / (16307.692307692309 * 0.49056603773584906), (double)class_44732.Method_44761() / (0.08450704225352113 * 94666.66666666667), (double)class_44732.Method_44762() / (984.6153846153846 * 8.125));
            }
        }
    }

    private void Method_20240() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    static Class_18 Method_20241(Class_20165 class_20165, Class_18 class_18) {
        class_20165.Field_20180 = class_18;
        return class_20165.Field_20180;
    }

    public void Method_20242(Class_22249 class_22249) {
        if (!this.Field_20181.Method_44609()) {
            this.Field_20181.Method_44608(class_22249.Method_22256());
        }
    }

    public void Method_20243(Class_1782 class_1782) {
        this.Field_20180.Method_199(null);
        String string = "disconnect.lost";
        if (this.Field_20182) {
            string = "disconnect.disconnected";
        }
        if (this.Field_20183 != null) {
            if (this.Field_20183 instanceof Class_47972) {
                this.Field_20180.Method_218(new Class_37217(((Class_47972)this.Field_20183).Method_47996(), string, class_1782).\u0000strictfp());
            } else {
                this.Field_20180.Method_218(new Class_20136(this.Field_20183, string, class_1782));
            }
        } else {
            this.Field_20180.Method_218(new Class_20136(new Class_27772(new Class_1578()), string, class_1782));
        }
        Class_12251.Method_12254(this);
    }

    public void Method_20244(Class_32014 class_32014) {
        Class_34388.Method_34390(class_32014, this, this.Field_20180);
        this.Field_20180.Field_72.Method_589(class_32014.Method_32030(), class_32014.Method_32021(), class_32014.Method_32026(), class_32014.Method_32024(), class_32014.Method_32029(), class_32014.Method_32025(), (-15872 & 404) != 0);
    }

    public void Method_20245(Class_1486 class_1486) {
        this.Field_20181.Method_44629(class_1486);
    }

    public Collection Method_20246() {
        return this.Field_20166.values();
    }

    public void Method_20247(Class_35914 class_35914) {
        Class_34388.Method_34390(class_35914, this, this.Field_20180);
        Class_1378 class_1378 = this.Field_20180.Field_48;
        if (class_35914.Method_35924() == (-1 & -1)) {
            class_1378.Field_628.Method_37804(class_35914.Method_35925());
        } else {
            Object object;
            int n = 17185 & 2;
            if (this.Field_20180.Field_36 instanceof Class_33634) {
                object = (Class_33634)this.Field_20180.Field_36;
                int n2 = n = ((Class_33634)object).Method_33656() != Class_3987.Field_4001.Method_4023() ? 1057 & -24375 : 3 & -11252;
            }
            if (class_35914.Method_35924() == 0 && class_35914.Method_35918() >= (10284 & 16437) && class_35914.Method_35918() < (25135 & -30339)) {
                object = class_1378.Field_681.Method_8324(class_35914.Method_35918()).Method_26430();
                if (class_35914.Method_35925() != null && (object == null || ((Class_23823)object).Field_23826 < class_35914.Method_35925().Field_23826)) {
                    class_35914.Method_35925().Field_23824 = 5133 & -5625;
                }
                class_1378.Field_681.Method_8321(class_35914.Method_35918(), class_35914.Method_35925());
            } else if (class_35914.Method_35924() == class_1378.Field_665.Field_8298 && (class_35914.Method_35924() != 0 || n == 0)) {
                class_1378.Field_665.Method_8321(class_35914.Method_35918(), class_35914.Method_35925());
            }
        }
    }

    private static String Method_20248(String string) {
        int n = 14983;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_20165.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_20249(Class_32556 class_32556) {
        Class_34388.Method_34390(class_32556, this, this.Field_20180);
        Class_33760 class_33760 = Class_40864.Method_40870(class_32556.Method_32570(), this.Field_20180.Field_72);
        class_32556.Method_32567(class_33760);
        this.Field_20180.Field_58.Method_22954().Method_10046(class_33760);
    }

    public void Method_20250(Class_21021 class_21021) {
        Class_34388.Method_34390(class_21021, this, this.Field_20180);
        if (class_21021.Method_21023() >= 0 && class_21021.Method_21023() < Class_37781.Method_37807()) {
            this.Field_20180.Field_48.\u0000strictfp.Field_37782 = class_21021.Method_21023();
        }
    }

    public void Method_20251(Class_23448 class_23448) {
        Class_34388.Method_34390(class_23448, this, this.Field_20180);
        Class_1061 class_1061 = this.Field_20169.Method_601(class_23448.Method_23453());
        if (class_1061 != null) {
            class_1061.Method_1341(class_23448.Method_23455(), class_23448.Method_23456());
        }
    }

    public void Method_20252(Class_35754 class_35754) {
        Class_4879 class_4879;
        Class_34388.Method_34390(class_35754, this, this.Field_20180);
        int n = -32237 & 15428;
        if (this.Field_20180.Field_72.\u0000
        (class_35754.Method_35761()) && (class_4879 = this.Field_20180.Field_72.\u0000strictfp(class_35754.Method_35761())) instanceof Class_33614) {
            Class_33614 class_33614 = (Class_33614)class_4879;
            if (class_33614.Method_33623()) {
                System.arraycopy(class_35754.Method_35763(), 24704 & 1536, class_33614.Field_33615, -28660 & 11137, 1068 & 212);
                class_33614.Method_33631();
                class_33614.\u0000, for();
            }
            n = -32559 & 20771;
        }
        if (n == 0 && this.Field_20180.Field_48 != null) {
            this.Field_20180.Field_48.Method_1412(new Class_2840("Unable to locate sign at " + class_35754.Method_35761().\u0000= final() + ", " + class_35754.Method_35761().\u0000, `() + ", " + class_35754.Method_35761().\u0000strictfp()));
        }
    }

    private static String Method_20253(String string) {
        int n = 17962;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_20165.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_20254(Class_23924 class_23924) {
        Class_34388.Method_34390(class_23924, this, this.Field_20180);
        Class_3481 class_3481 = new Class_3481(this.Field_20169, (double)class_23924.Method_23935() / (0.8387096774193549 * 38.15384615384615), (double)class_23924.Method_23937() / (37.333333333333336 * 0.8571428571428571), (double)class_23924.Method_23933() / (150.0 * 0.21333333333333335), class_23924.Method_23939());
        class_3481.Field_1112 = class_23924.Method_23935();
        class_3481.Field_1105 = class_23924.Method_23937();
        class_3481.Field_1111 = class_23924.Method_23933();
        class_3481.Field_1079 = 0.0f;
        class_3481.Field_1093 = 0.0f;
        class_3481.Method_1366(class_23924.Method_23936());
        this.Field_20169.Method_591(class_23924.Method_23936(), class_3481);
    }

    public void Method_20255(Class_34227 class_34227) {
        Class_34388.Method_34390(class_34227, this, this.Field_20180);
        Class_25529 class_25529 = new Class_25529(this.Field_20180.Field_72, null, class_34227.Method_34239(), class_34227.Method_34248(), class_34227.Method_34240(), class_34227.Method_34247(), class_34227.Method_34245());
        class_25529.Method_25544((17745 & 6151) != 0);
        this.Field_20180.Field_48.\u0000= ` += (double)class_34227.Method_34246();
        this.Field_20180.Field_48.\u0000%(this.Field_20180.Field_48.\u0000, #() + (double)class_34227.Method_34242());
        this.Field_20180.Field_48.\u0000switch += (double)class_34227.Method_34241();
    }

    public void Method_20256(Class_30949 class_30949) {
        Class_34388.Method_34390(class_30949, this, this.Field_20180);
        Class_4879 class_4879 = this.Field_20169.\u0000strictfp(class_30949.Method_30951());
        if (!(class_4879 instanceof Class_33614)) {
            class_4879 = new Class_33614();
            class_4879.Method_4910(this.Field_20169);
            class_4879.Method_4901(class_30949.Method_30951());
        }
        this.Field_20180.Field_48.Method_1428((Class_33614)class_4879);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void Method_20257(Class_32319 class_32319) {
        Class_34388.Method_34390(class_32319, this, this.Field_20180);
        if (Class_20165.Method_20194("( \b \u0004,\f\u0004\b").equals(class_32319.Method_32324())) {
            Class_29900 class_29900 = class_32319.Method_32323();
            try {
                int n = class_29900.Method_29914();
                Class_1490 class_1490 = this.Field_20180.Field_36;
                if (class_1490 == null || !(class_1490 instanceof Class_27952) || n != this.Field_20180.Field_48.\u0000, `.Field_8298) return;
                Class_7434 class_7434 = ((Class_27952)class_1490).Method_27960();
                Class_14517 class_14517 = Class_14517.Method_14523(class_29900);
                class_7434.Method_7440(class_14517);
                return;
            }
            catch (IOException iOException) {
                Field_20167.error(Class_20165.Method_20248("\u20e0\u20cd\u20c4\u20cd\u20c0\u20c9\u2080\u20c1\u2088\u20c5\u20c4\u20c9\u20c8\u208d\u20c8\u20cd\u20d0\u20d5\u20d4\u2091\u20dc\u20d9\u20d0\u20d9"), (Throwable)iOException);
                return;
            }
            finally {
                class_29900.Method_29972();
            }
        } else if (Class_20165.Method_20253("\u4a22\u4a2d\u4a00\u4a2f\u4a0c\u4a0f\u4a02\u4a09").equals(class_32319.Method_32324())) {
            try {
                this.Field_20180.Field_48.Method_1406(class_32319.Method_32323().Method_29991(32767 & 32767));
                return;
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
            return;
        } else if (Class_20165.Method_20199("\u59c8\u59c2\u59c9\u59c3\u59ce\u59c5\u59c4\u59cf").equals(class_32319.Method_32324())) {
            Class_23823 class_23823 = this.Field_20180.Field_48.\u0000= final();
            if (class_23823 == null || class_23823.Method_23844() != Class_10527.Field_10671) return;
            this.Field_20180.Method_218(new Class_31239(this.Field_20180.Field_48, class_23823, (6402 & -23540) != 0));
            return;
        } else {
            Class_12251.Method_12258(this, class_32319);
        }
    }

    public void Method_20258(Class_30920 class_30920) {
        Class_34388.Method_34390(class_30920, this, this.Field_20180);
        Class_20976 class_20976 = this.Field_20169.\u0000strictfp();
        if (class_30920.Method_30925() == 0) {
            Class_7873 class_7873 = class_20976.Method_21000(class_30920.Method_30928(), Class_27930.Field_27935);
            class_7873.Method_7879(class_30920.Method_30932());
            class_7873.Method_7882(class_30920.Method_30929());
        } else {
            Class_7873 class_7873 = class_20976.Method_21003(class_30920.Method_30928());
            if (class_30920.Method_30925() == (-32343 & 8705)) {
                class_20976.Method_21013(class_7873);
            } else if (class_30920.Method_30925() == (234 & -7677)) {
                class_7873.Method_7879(class_30920.Method_30932());
                class_7873.Method_7882(class_30920.Method_30929());
            }
        }
    }

    public void Method_20259(Class_22097 class_22097) {
        Class_34388.Method_34390(class_22097, this, this.Field_20180);
        this.Field_20180.Field_48.Method_1451(class_22097.Method_22103(), class_22097.Method_22105(), class_22097.Method_22106());
    }

    public Class_20165(Class_18 class_18, Class_1490 class_1490, Class_44584 class_44584, GameProfile gameProfile) {
        this.Field_20180 = class_18;
        this.Field_20183 = class_1490;
        this.Field_20181 = class_44584;
        this.Field_20176 = gameProfile;
    }

    public void Method_20260() {
        this.Field_20169 = null;
        this.Field_20173.Method_8596();
    }

    public void Method_20261(Class_43947 class_43947) {
        Class_34388.Method_34390(class_43947, this, this.Field_20180);
        Class_1061 class_1061 = this.Field_20169.Method_601(class_43947.Method_43954());
        if (class_1061 != null) {
            if (!(class_1061 instanceof Class_859)) {
                throw new IllegalStateException("Server tried to update attributes of a non-living entity (actually: " + class_1061 + ")");
            }
            \u0000try break ! char ` do switch 3 ] . 4 . byte switch do continue synchronized % try = { 4 abstract synchronized default double public ? const import ^ long native = 4 + import static const float finally 0 return 1 throws abstract 7 finally 5 private protected  byte switch do continue synchronized % try = { 4 abstract synchronized default double public ? const import ^ long native = 4 + import static const float finally 0 return 1 throws abstract 7 finally 5 private protected2 = ((Class_859)class_1061).Method_1044();
            for (Class_8735 class_8735 : class_43947.Method_43956()) {
                Class_16547 class_16547 =  byte switch do continue synchronized % try = { 4 abstract synchronized default double public ? const import ^ long native = 4 + import static const float finally 0 return 1 throws abstract 7 finally 5 private protected2.\u0000strictfp(class_8735.Method_8742());
                if (class_16547 == null) {
                    class_16547 =  byte switch do continue synchronized % try = { 4 abstract synchronized default double public ? const import ^ long native = 4 + import static const float finally 0 return 1 throws abstract 7 finally 5 private protected2.\u0000= final((Class_22368)new Class_38446(null, class_8735.Method_8742(), 0.0, 2.0860067423505E-309 * 10.666666666666666, 86.0 * 2.0903408544910647E306));
                }
                class_16547.Method_16556(class_8735.Method_8743());
                class_16547.Method_16558();
                for (Class_10375 class_10375 : class_8735.Method_8741()) {
                    class_16547.Method_16549(class_10375);
                }
            }
        }
    }

    public void Method_20262(Class_34793 class_34793) {
        Class_34388.Method_34390(class_34793, this, this.Field_20180);
        Class_1378 class_1378 = this.Field_20180.Field_48;
        if ("minecraft:container".equals(class_34793.Method_34800())) {
            class_1378.Method_1418(new Class_43634(class_34793.Method_34808(), class_34793.Method_34804()));
            class_1378.\u0000, `.Field_8298 = class_34793.Method_34805();
        } else if ("minecraft:villager".equals(class_34793.Method_34800())) {
            class_1378.Method_1435(new Class_20953(class_1378, class_34793.Method_34808()));
            class_1378.\u0000, `.Field_8298 = class_34793.Method_34805();
        } else if ("EntityHorse".equals(class_34793.Method_34800())) {
            Class_1061 class_1061 = this.Field_20169.Method_601(class_34793.Method_34799());
            if (class_1061 instanceof Class_46199) {
                class_1378.Method_1447((Class_46199)class_1061, new Class_47091(class_34793.Method_34808(), class_34793.Method_34804()));
                class_1378.\u0000, `.Field_8298 = class_34793.Method_34805();
            }
        } else if (!class_34793.Method_34802()) {
            class_1378.Method_1432(new Class_36312(class_34793.Method_34800(), class_34793.Method_34808()));
            class_1378.\u0000, `.Field_8298 = class_34793.Method_34805();
        } else {
            Class_44767 class_44767 = new Class_44767(class_34793.Method_34800(), class_34793.Method_34808(), class_34793.Method_34804());
            class_1378.Method_1418(class_44767);
            class_1378.\u0000, `.Field_8298 = class_34793.Method_34805();
        }
    }

    public void Method_20263(Class_27970 class_27970) {
        Class_34388.Method_34390(class_27970, this, this.Field_20180);
        for (Class_14932 class_14932 : class_27970.Method_27976()) {
            if (class_27970.Method_27979() == Class_21288.Field_21291) {
                this.Field_20166.remove(class_14932.Method_14943().getId());
                continue;
            }
            Class_9738 class_9738 = (Class_9738)this.Field_20166.get(class_14932.Method_14943().getId());
            if (class_27970.Method_27979() == Class_21288.Field_21293) {
                class_9738 = new Class_9738(class_14932);
                this.Field_20166.put(class_9738.Method_9758().getId(), class_9738);
                if (this.Field_20176.getId().equals(class_9738.Method_9758().getId())) {
                    this.Field_20180.Field_48.\u0000strictfp = class_9738;
                }
            }
            if (class_9738 == null) continue;
            switch (Class_43523.Field_43525[class_27970.Method_27979().ordinal()]) {
                case 1: {
                    class_9738.Method_9767(class_14932.Method_14940());
                    class_9738.Method_9764(class_14932.Method_14939());
                    break;
                }
                case 2: {
                    class_9738.Method_9767(class_14932.Method_14940());
                    break;
                }
                case 3: {
                    class_9738.Method_9764(class_14932.Method_14939());
                    break;
                }
                case 4: {
                    class_9738.Method_9775(class_14932.Method_14941());
                }
            }
        }
    }

    public void Method_20264(Class_21873 class_21873) {
        Class_34388.Method_34390(class_21873, this, this.Field_20180);
        Class_30799 class_30799 = new Class_30799(this.Field_20169, class_21873.Method_21886(), class_21873.Method_21884(), class_21873.Method_21881());
        this.Field_20169.Method_591(class_21873.Method_21885(), class_30799);
    }

    public void Method_20265(Class_23225 class_23225) {
        Class_34388.Method_34390(class_23225, this, this.Field_20180);
        this.Field_20180.Field_48.Method_1433();
    }

    public void Method_20266(Class_21861 class_21861) {
        Class_34388.Method_34390(class_21861, this, this.Field_20180);
        Class_1378 class_1378 = this.Field_20180.Field_48;
        if (class_1378.Field_665 != null && class_1378.Field_665.Field_8298 == class_21861.Method_21869()) {
            class_1378.Field_665.Method_8311(class_21861.Method_21871(), class_21861.Method_21866());
        }
    }

    public void Method_20267(Class_26929 class_26929) {
        Class_34388.Method_34390(class_26929, this, this.Field_20180);
        Class_1061 class_1061 = class_26929.Method_26946(this.Field_20169);
        if (class_1061 != null) {
            class_1061.Field_1112 += class_26929.Method_26938();
            class_1061.Field_1105 += class_26929.Method_26943();
            class_1061.Field_1111 += class_26929.Method_26945();
            double d = (double)class_1061.Field_1112 / (3.3333333333333335 * 9.6) + 0.0449438202247191 * 0.34765625;
            double d2 = (double)class_1061.Field_1105 / (0.9649122807017544 * 33.163636363636364) + 0.28378378378378377 * 0.055059523809523815;
            double d3 = (double)class_1061.Field_1111 / (28.95238095238095 * 1.105263157894737) + 0.09375 * 0.16666666666666666;
            float f = class_26929.Method_26950() ? (float)(class_26929.Method_26941() * (2024 & -13970)) / (1.945946f * 131.55556f) : class_1061.Field_1079;
            float f2 = class_26929.Method_26950() ? (float)(class_26929.Method_26939() * (10734 & 17272)) / (1.5806452f * 161.95918f) : class_1061.Field_1093;
            class_1061.Method_1210(d, d2, d3, f, f2, this.Method_20237(class_1061), (5652 & 393) != 0);
            class_1061.Method_1213(class_26929.Method_26951());
        }
    }

    public Class_9738 Method_20268(String string) {
        for (Class_9738 class_9738 : this.Field_20166.values()) {
            if (!class_9738.Method_9758().getName().equals(string)) continue;
            return class_9738;
        }
        return null;
    }

    public void Method_20269(Class_26773 class_26773) {
        Class_34388.Method_34390(class_26773, this, this.Field_20180);
        Class_1378 class_1378 = this.Field_20180.Field_48;
        class_1378.Field_694.Method_18102(class_26773.Method_26791());
        class_1378.Field_694.Method_18099(class_26773.Method_26784());
        class_1378.Field_694.Field_18085 = class_26773.Method_26781();
        class_1378.Field_694.Method_18098(class_26773.Method_26787());
        class_1378.Field_694.Method_18097(class_26773.Method_26788());
        class_1378.Field_694.Method_18103(class_26773.Method_26795());
    }

    public void Method_20270(Class_26313 class_26313) {
        Class_34388.Method_34390(class_26313, this, this.Field_20180);
        this.Field_20169.Method_604(class_26313.Method_26319(), class_26313.Method_26317());
    }

    public void Method_20271(Class_22751 class_22751) {
        Class_34388.Method_34390(class_22751, this, this.Field_20180);
        this.Field_20181.Field_44593.Method_6822(26425 & 2060);
        this.Field_20180.Field_61 = new Class_11729(this.Field_20180, this);
        this.Field_20169 = new Class_570(this, new Class_9780(1144033284L & 6102083253345280128L, class_22751.Method_22768(), (16 & 264) != 0, class_22751.Method_22767(), class_22751.Method_22772()), class_22751.Method_22771(), class_22751.Method_22763(), this.Field_20180.Field_25);
        this.Field_20180.Field_84.Field_39775 = class_22751.Method_22763();
        this.Field_20180.Method_199(this.Field_20169);
        this.Field_20180.Field_48.\u0000= catch = class_22751.Method_22771();
        this.Field_20180.Field_48.\u0000= switch(class_22751.Method_22762());
        this.Field_20177 = class_22751.Method_22760();
        this.Field_20180.Field_48.\u0000, `(class_22751.Method_22769());
        this.Field_20180.Field_61.Method_11752(class_22751.Method_22768());
        this.Field_20180.Field_84.Method_39900();
        this.Field_20181.Method_44629(new Class_28799("MC|Brand", new Class_29900(Class_16620.Method_16633()).Method_29960(ClientBrandRetriever.\u0000strictfp())));
        Class_12251.Method_12253(this, class_22751);
    }

    public void Method_20272(Class_23464 class_23464) {
        Class_34388.Method_34390(class_23464, this, this.Field_20180);
        Class_1061 class_1061 = class_23464.Method_23471(this.Field_20169);
        if (class_1061 != null) {
            if (class_23464.Method_23473() == (4311 & -12491)) {
                this.Field_20180.Method_245().Method_29119(new Class_41310((Class_44640)class_1061));
            } else {
                class_1061.Method_1214(class_23464.Method_23473());
            }
        }
    }
}

