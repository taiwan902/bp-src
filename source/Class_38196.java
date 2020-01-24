/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  internal.org.lwjgl.Sys
 *  internal.org.lwjgl.opengl.GL11
 */
import internal.org.lwjgl.Sys;
import internal.org.lwjgl.opengl.GL11;
import java.awt.Point;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Writer;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.net.SocketAddress;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Class_38196
extends Class_37430
implements Class_2045,
Runnable {
    private int Field_38197 = -31712 & 6672;
    private boolean Field_38198 = -20415 & 19466;
    private boolean Field_38199;
    private float Field_38200;
    private boolean Field_38201 = 16449 & -32607;
    private int Field_38202 = 1472 & -28141;
    private long Field_38203;
    private double Field_38204;
    private int Field_38205;
    private float Field_38206 = 1.7894737f * 0.27941176f;
    private int Field_38207;
    private double Field_38208 = 0.038461538461538464 * 2.6E7;
    private boolean Field_38209;
    private int Field_38210;
    private int Field_38211;
    private boolean Field_38212 = -32701 & 16516;
    private long Field_38213;
    private boolean Field_38214 = 1163 & 12805;
    private boolean Field_38215;
    private double Field_38216 = 1.0;
    private double Field_38217;
    private int Field_38218;
    private int Field_38219 = -31744 & 660;
    private static Class_43180 Field_38220;
    private boolean Field_38221;
    private Class_31566 Field_38222;
    private int Field_38223;
    private boolean Field_38224 = -28031 & 1283;
    private float Field_38225;
    private Condition Field_38226 = this.Field_38332.newCondition();
    private Class_45406 Field_38227;
    private boolean Field_38228 = -22655 & 4121;
    private boolean Field_38229 = 9249 & -16249;
    private static Class_43180 Field_38230;
    private String Field_38231;
    private int Field_38232;
    protected boolean Field_38233;
    private boolean Field_38234;
    private long Field_38235;
    private int Field_38236 = 193 & 17461;
    private float Field_38237 = 1.0f;
    private int Field_38238 = 178 & -22200;
    private TreeMap Field_38239 = new TreeMap();
    private int[] Field_38240;
    private boolean Field_38241 = 8465 & 3617;
    private static float[] Field_38242;
    private float Field_38243 = 0.6551724f * 1.2210526f;
    private static final double[] Field_38244;
    protected final Thread Field_38245;
    private int Field_38246 = -29358 & 130;
    private int Field_38247 = -7805 & 1617;
    private String Field_38248;
    private boolean Field_38249 = 17 & 9609;
    private long Field_38250;
    private Thread Field_38251;
    private Class_15106 Field_38252;
    private boolean Field_38253;
    private boolean Field_38254;
    private ArrayList Field_38255;
    private int Field_38256;
    private boolean Field_38257;
    protected long Field_38258;
    private double Field_38259;
    private boolean Field_38260;
    private boolean Field_38261;
    private int Field_38262 = 5393 & -16181;
    private static Class_18740[] Field_38263;
    private double Field_38264 = 1.0;
    private ArrayList Field_38265 = new ArrayList();
    private HashMap Field_38266 = new HashMap();
    protected static final File Field_38267;
    private boolean Field_38268;
    private int Field_38269;
    private boolean Field_38270 = 14400 & 1550;
    private boolean Field_38271;
    private boolean Field_38272;
    private int Field_38273;
    private int Field_38274 = 767 & 8703;
    private int Field_38275;
    private boolean Field_38276 = 16547 & 12117;
    private Class_7644 Field_38277 = Class_7644.Field_7646;
    private float[] Field_38278;
    private boolean Field_38279;
    private int Field_38280 = 189 & 1088;
    private int Field_38281;
    private int Field_38282 = -31487 & 163;
    private Class_37579 Field_38283 = Class_37579.Method_37595(11539 & 4416, -32472 & 12544);
    private boolean Field_38284;
    public static final Class_38196 Field_38285;
    private boolean Field_38286;
    private long Field_38287;
    private Class_626 Field_38288;
    private int Field_38289 = 1154020670 & 675987224;
    private boolean Field_38290 = -28347 & 1025;
    private int Field_38291;
    private int Field_38292;
    private Class_283 Field_38293;
    private boolean Field_38294;
    private boolean Field_38295;
    private int Field_38296 = 16387 & 785;
    private int Field_38297;
    private float Field_38298;
    private double Field_38299;
    private int Field_38300;
    private int Field_38301 = -1597919371 & 159967189;
    private boolean Field_38302;
    private boolean Field_38303 = 16384 & 4720;
    private Class_14163 Field_38304 = new Class_14163(4387 & 1897);
    private int Field_38305 = -28408 & 80;
    private int Field_38306 = -16192 & 13620;
    private boolean Field_38307;
    private static final int[] Field_38308;
    private float[] Field_38309 = this.Method_38403(1.3770492f * 0.090773806f);
    private List[] Field_38310;
    private int Field_38311 = -2005821343 & 81836384;
    private int Field_38312;
    private List Field_38313;
    private boolean Field_38314;
    private boolean Field_38315;
    private boolean Field_38316;
    private boolean Field_38317;
    private long Field_38318;
    private float Field_38319 = 1.0f;
    private boolean Field_38320;
    private boolean Field_38321;
    private boolean Field_38322;
    private float Field_38323;
    private static boolean Field_38324;
    private float Field_38325;
    private boolean Field_38326 = 8195 & -10231;
    private float[] Field_38327;
    private boolean Field_38328 = 5768 & -30669;
    private float Field_38329;
    private boolean Field_38330;
    private boolean Field_38331;
    private Lock Field_38332 = new ReentrantLock();
    private boolean Field_38333 = -19183 & 608;
    private double Field_38334 = 4883.720930232558 * 2.0476190476190474;
    private boolean Field_38335 = 9776 & 22530;
    private boolean Field_38336 = -12765 & 8269;
    private Class_1490 Field_38337;
    private int Field_38338 = -32148 & 0;
    private float[] Field_38339;
    private float Field_38340;
    private HashMap Field_38341 = new HashMap();
    private int Field_38342 = 545 & -9087;
    private boolean Field_38343 = 7521 & 518;
    private int Field_38344;
    private SocketAddress Field_38345;
    protected static final File Field_38346;
    private int Field_38347 = 4616 & 1026;
    private boolean Field_38348;
    private boolean Field_38349;
    private int Field_38350;
    private int Field_38351 = 773 & 24769;
    private float Field_38352 = 1.0f;
    private boolean Field_38353 = 19152 & -24570;
    private boolean Field_38354;
    private int Field_38355 = -32691 & 11809;
    private boolean Field_38356 = 24853 & -29184;
    private boolean Field_38357 = 8201 & 18308;
    private boolean Field_38358 = -30139 & 1337;
    private long Field_38359;
    private boolean Field_38360 = -8152 & 3395;
    public static final String Field_38361;
    private boolean Field_38362 = 4610 & 172;
    private int Field_38363 = 16560 & 15371;
    private int Field_38364 = 386 & 28742;
    private boolean Field_38365 = 129 & 5134;
    private boolean Field_38366 = 7172 & 594;

    private void Method_38367(Class_8653 class_8653, int n, int n2, int n3, Class_27665 class_27665, Class_26134 class_26134, boolean bl, Thread thread) {
        Class_17665 class_17665 = class_8653.Method_8697();
        Class_3238 class_3238 = class_17665.Method_17749(n, n2, n3);
        int n4 = Class_3238.Method_3435(class_3238);
        if (!(class_3238.Method_3373() == Class_3713.Field_3718 || this.Field_38356 && class_3238 == Class_3238.Method_3341("snow_layer"))) {
            Class_3238 class_32382;
            int n5 = class_17665.Method_17745(n, n2, n3);
            Class_43180 class_43180 = Class_20273.Field_20278[n4 << (8756 & -32690) | n5];
            int n6 = 225 & 20758;
            if (class_3238.Method_3373() == Class_3713.Field_3750) {
                class_43180 = Field_38230;
            }
            if (class_3238.Method_3373() == Class_3713.Field_3734) {
                class_43180 = Field_38220;
            }
            if (class_3238.Method_3373() == Class_3713.Field_3752 && class_3238 instanceof Class_30264) {
                class_32382 = (Class_30264)class_3238;
                class_43180 = new Class_43180(((Class_30264)class_32382).Method_30267(n5), Class_26134.Field_26141);
            }
            if (class_3238 instanceof Class_32985) {
                class_32382 = (Class_32985)class_3238;
                class_43180 = new Class_43180(Class_38196.Method_38379(8959 & -32257, 8955 & 4336, 24816 & -32526, 10388 & -31741), Class_26134.Field_26144);
            }
            if (class_3238.Method_3373() == Class_3713.Field_3726) {
                class_43180 = new Class_43180(this.Field_38205, Class_26134.Field_26150);
            }
            if (class_3238.Method_3373() == Class_3713.Field_3729) {
                class_43180 = new Class_43180(this.Field_38273, Class_26134.Field_26136);
            }
            if (class_3238.Method_3373() == Class_3713.Field_3723) {
                class_43180 = new Class_43180(Class_3779.Field_3804.Field_3812, Class_26134.Field_26144);
            }
            if (class_43180 == null) {
                class_43180 = new Class_43180(class_3238.Method_3306((Class_3436)class_3238.Method_3360().Method_3867()).Field_3812, Class_26134.Field_26144);
            }
            if (class_43180 == null) {
                if (n2 > 0) {
                    this.Method_38367(class_8653, n, n2 - (10385 & 16423), n3, class_27665, Class_26134.Field_26148, bl, thread);
                }
            } else {
                if (!(this.Field_38336 && class_3238.Method_3373() != Class_3713.Field_3734 || this.Field_38229 && class_3238.Method_3373() == Class_3713.Field_3734)) {
                    if (class_43180.Field_43184 == 0.0f && n2 > 0) {
                        this.Method_38367(class_8653, n, n2 - (16535 & 4713), n3, class_27665, class_43180.Field_43182, bl, thread);
                        return;
                    }
                } else if (class_43180.Field_43184 < 1.0f && n2 > 0) {
                    this.Method_38367(class_8653, n, n2 - (-32699 & 30099), n3, class_27665, class_43180.Field_43182, bl, thread);
                    if (class_43180.Field_43184 == 0.0f) {
                        return;
                    }
                }
                if (this.Field_38363 == 0) {
                    int n7;
                    int n8 = 24609 & 2961;
                    switch (this.Field_38306) {
                        case 3: {
                            n7 = -31633 & 16927;
                            break;
                        }
                        default: {
                            this.Field_38306 = -26614 & 1840;
                        }
                        case 0: 
                        case 1: 
                        case 2: {
                            n7 = n2 < this.Field_38274 ? class_17665.Method_17727(Class_6778.Field_6781, n, n2 + (17473 & 1), n3) : 18207 & 15;
                        }
                    }
                    int n9 = Math.max(class_3238.Method_3355(), class_17665.Method_17727(Class_6778.Field_6780, n, Math.min(this.Field_38274, n2 + (1041 & -30199)), n3));
                    n6 = n7 << (1068 & -32492) | n9;
                    float f = this.Field_38327[n6];
                    float f2 = this.Field_38339[n6];
                    float f3 = this.Field_38278[n6];
                    if (class_43180.Field_43182.Field_26146 && class_26134.Field_26146) {
                        return;
                    }
                    if (bl) {
                        f3 = 0.0f;
                        f2 = 0.0f;
                        f = 0.0f;
                    }
                    if (this.Field_38214) {
                        switch (Class_6913.Field_6915[class_43180.Field_43182.ordinal()]) {
                            case 1: {
                                int n10 = class_8653.Field_8668[n3 << (22815 & 516) | n];
                                class_27665.Method_27674(class_43180.Field_43184, n10, f * class_43180.Field_43181, f2 * class_43180.Field_43183, f3 * class_43180.Field_43185);
                                return;
                            }
                            case 2: {
                                int n11 = class_8653.Field_8658[n3 << (17438 & 8709) | n];
                                class_27665.Method_27674(class_43180.Field_43184, n11, f * class_43180.Field_43181, f2 * class_43180.Field_43183, f3 * class_43180.Field_43185);
                                return;
                            }
                            case 3: {
                                int n12 = class_8653.Field_8675[n3 << (8220 & 133) | n];
                                class_27665.Method_27674(class_43180.Field_43184, n12, f * class_43180.Field_43181, f2 * class_43180.Field_43183, f3 * class_43180.Field_43185);
                                return;
                            }
                            case 4: {
                                int n13 = class_8653.Field_8682[n3 << (292 & 8213) | n];
                                class_27665.Method_27674(class_43180.Field_43184, n13, f * class_43180.Field_43181, f2 * class_43180.Field_43183, f3 * class_43180.Field_43185);
                                return;
                            }
                        }
                    } else {
                        switch (Class_6913.Field_6915[class_43180.Field_43182.ordinal()]) {
                            case 1: {
                                class_27665.Method_27674(class_43180.Field_43184, this.Field_38205, f * class_43180.Field_43181, f2 * class_43180.Field_43183, f3 * class_43180.Field_43185);
                                return;
                            }
                            case 2: {
                                class_27665.Method_27674(class_43180.Field_43184, this.Field_38205, f * class_43180.Field_43181 * (20.75f * 0.04337349f), f2 * class_43180.Field_43183 * (46.0f * 0.019565217f), f3 * class_43180.Field_43185 * (1.1716981f * 0.76811594f));
                                return;
                            }
                            case 3: {
                                class_27665.Method_27674(class_43180.Field_43184, this.Field_38273, f * class_43180.Field_43181, f2 * class_43180.Field_43183, f3 * class_43180.Field_43185);
                                return;
                            }
                        }
                    }
                    if (class_43180.Field_43182 == Class_26134.Field_26143) {
                        class_27665.Method_27674(class_43180.Field_43184, this.Field_38297, f * class_43180.Field_43181, f2 * class_43180.Field_43183, f3 * class_43180.Field_43185);
                        return;
                    }
                    if (class_43180.Field_43182 == Class_26134.Field_26142) {
                        class_27665.Method_27674(class_43180.Field_43184, this.Field_38232, f * class_43180.Field_43181, f2 * class_43180.Field_43183, f3 * class_43180.Field_43185);
                        return;
                    }
                    if (class_43180.Field_43182 == Class_26134.Field_26141 && class_26134 == Class_26134.Field_26141) {
                        return;
                    }
                    int n14 = class_3238.Method_3366(class_3238.Method_3293());
                    if (n14 == (167772159 & 117440511)) {
                        class_27665.Method_27671(class_43180.Field_43184, class_43180.Field_43181 * f, class_43180.Field_43183 * f2, class_43180.Field_43185 * f3);
                    } else {
                        class_27665.Method_27674(class_43180.Field_43184, n14, class_43180.Field_43181 * f, class_43180.Field_43183 * f2, class_43180.Field_43185 * f3);
                    }
                } else {
                    int n15;
                    switch (this.Field_38306) {
                        case 1: {
                            n15 = n2 < this.Field_38274 ? class_17665.Method_17738(n, n2 + (133 & -28919), n3, 10914 & 16720) : 12943 & 3135;
                            break;
                        }
                        case 2: {
                            n15 = n2 < this.Field_38274 ? class_17665.Method_17738(n, n2 + (583 & 30089), n3, 331 & 16399) : -16364 & 8780;
                            break;
                        }
                        case 3: {
                            n15 = 5183 & -24561;
                            break;
                        }
                        default: {
                            this.Field_38306 = 5698 & 16540;
                        }
                        case 0: {
                            n15 = n2 < this.Field_38274 ? class_17665.Method_17738(n, n2 + (17605 & 8755), n3, this.Field_38300) : (20815 & 2063) - this.Field_38300;
                        }
                    }
                    float f = this.Field_38309[n15];
                    if (class_43180.Field_43182.Field_26146 && class_26134.Field_26146) {
                        return;
                    }
                    if (bl) {
                        f = 0.0f;
                    }
                    if (this.Field_38214) {
                        switch (Class_6913.Field_6915[class_43180.Field_43182.ordinal()]) {
                            case 1: {
                                n6 = class_8653.Field_8668[n3 << (2604 & 24596) | n];
                                class_27665.Method_27672(class_43180.Field_43184, n6, f * (1.2045455f * 0.49811321f));
                                return;
                            }
                            case 2: {
                                n6 = class_8653.Field_8668[n3 << (3140 & -32756) | n];
                                class_27665.Method_27672(class_43180.Field_43184, n6, f * (3.6666667f * 0.13636364f));
                                return;
                            }
                            case 3: {
                                n6 = class_8653.Field_8675[n3 << (-18356 & 16772) | n];
                                class_27665.Method_27672(class_43180.Field_43184, n6, f * (0.6865672f * 0.7282609f));
                                return;
                            }
                            case 4: {
                                n6 = class_8653.Field_8682[n3 << (5125 & -31828) | n];
                                float f4 = (float)(n6 >> (-27212 & 16400) & (16895 & 8447)) * (0.0010620916f * 3.6923077f);
                                float f5 = (float)(n6 >> (8346 & -15348) & (511 & 2815)) * (0.8181818f * 0.004793029f);
                                float f6 = (float)(n6 >> (-28159 & 278) & (19711 & -24321)) * (0.45f * 0.008714598f);
                                class_27665.Method_27673(class_43180.Field_43184, class_43180.Field_43181 * f4, class_43180.Field_43183 * f5, class_43180.Field_43185 * f6, f);
                                return;
                            }
                        }
                    } else {
                        switch (Class_6913.Field_6915[class_43180.Field_43182.ordinal()]) {
                            case 1: {
                                class_27665.Method_27674(class_43180.Field_43184, this.Field_38205, f * class_43180.Field_43181, f * class_43180.Field_43183, f * class_43180.Field_43185);
                                return;
                            }
                            case 2: {
                                class_27665.Method_27674(class_43180.Field_43184, this.Field_38205, f * class_43180.Field_43181 * (0.597561f * 1.5061224f), f * class_43180.Field_43183 * (0.14999999f * 6.0f), f * class_43180.Field_43185 * (0.4186046f * 2.15f));
                                return;
                            }
                            case 3: {
                                class_27665.Method_27674(class_43180.Field_43184, this.Field_38273, f * class_43180.Field_43181, f * class_43180.Field_43183, f * class_43180.Field_43185);
                                return;
                            }
                        }
                    }
                    if (class_43180.Field_43182 == Class_26134.Field_26143) {
                        class_27665.Method_27674(class_43180.Field_43184, this.Field_38297, f * class_43180.Field_43181, f * class_43180.Field_43183, f * class_43180.Field_43185);
                        return;
                    }
                    if (class_43180.Field_43182 == Class_26134.Field_26142) {
                        class_27665.Method_27674(class_43180.Field_43184, this.Field_38232, f * class_43180.Field_43181, f * class_43180.Field_43183, f * class_43180.Field_43185);
                        return;
                    }
                    if (class_43180.Field_43182 == Class_26134.Field_26141 && class_26134 == Class_26134.Field_26141) {
                        return;
                    }
                    n6 = class_3238.Method_3366(class_3238.Method_3293());
                    if (n6 == (1124073471 & 704643071)) {
                        class_27665.Method_27673(class_43180.Field_43184, class_43180.Field_43181, class_43180.Field_43183, class_43180.Field_43185, f);
                    } else {
                        class_27665.Method_27674(class_43180.Field_43184, n6, class_43180.Field_43181 * f, class_43180.Field_43183 * f, class_43180.Field_43185 * f);
                    }
                }
            }
        } else if (n2 > 0) {
            Class_3238 class_32383;
            while (n2 > 0 && (class_32383 = class_17665.Method_17749(n, --n2, n3)).Method_3373() == Class_3713.Field_3718) {
            }
            this.Method_38367(class_8653, n, n2, n3, class_27665, Class_26134.Field_26148, bl, thread);
        }
    }

    private void Method_38368(Thread thread) {
        int n = Math.max(this.Field_38347, this.Field_38338);
        int n2 = Field_38308[this.Field_38364];
        for (int i = 16400 & 8227; i < n2 && this.Field_38304.Method_14168() < n; ++i) {
            Point point = this.Field_38304.Method_14166();
            Class_8653 class_8653 = Class_8653.Method_8698(this.Field_38256 + point.x, this.Field_38350 + point.y);
            this.Method_38376(class_8653, thread);
        }
        this.Field_38295 = this.Field_38304.Method_14168() >= this.Field_38347 ? -8127 & 533 : 26697 & 4992;
        this.Field_38253 = this.Field_38295 && this.Field_38304.Method_14168() >= this.Field_38338 ? 771 & 9393 : 4112 & 18464;
    }

    private void Method_38369() {
        int n = Math.max(this.Field_38347, this.Field_38338);
        while (this.Field_38304.Method_14168() < n) {
            Point point = this.Field_38304.Method_14166();
            Class_8653 class_8653 = Class_8653.Method_8698(this.Field_38256 + point.x, this.Field_38350 + point.y);
            this.Method_38393(class_8653);
        }
        this.Field_38295 = this.Field_38304.Method_14168() >= this.Field_38347 ? 1171 & 18433 : 18705 & -24530;
        this.Field_38253 = this.Field_38295 && this.Field_38304.Method_14168() >= this.Field_38338 ? -31231 & 10251 : -7014 & 2560;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static final void Method_38370(String string, Exception exception) {
        File file = new File(Field_38346, "error.txt");
        try (PrintWriter printWriter = null;){
            FileOutputStream fileOutputStream = new FileOutputStream(file, (17 & 16519) != 0);
            printWriter = new PrintWriter(new OutputStreamWriter((OutputStream)fileOutputStream, "UTF-8"));
            Class_38196.Method_38420(printWriter);
            printWriter.println(string);
            exception.printStackTrace(printWriter);
            printWriter.println();
            printWriter.flush();
        }
    }

    private void Method_38371(double d, double d2, double d3, double d4, double d5) {
        this.Field_38277.Method_7648().Method_22417(8359 & -11769, Class_29585.Field_29598);
        this.Field_38277.Method_7648().Method_22443(d - (d4 *= 0.4375 * 1.1428571428571428), d2 + (d5 *= 0.5294117647058824 * 0.9444444444444444), d3).Method_22433(0.0, 1.0).Method_22451();
        this.Field_38277.Method_7648().Method_22443(d + d4, d2 + d5, d3).Method_22433(1.0, 1.0).Method_22451();
        this.Field_38277.Method_7648().Method_22443(d + d4, d2 - d5, d3).Method_22433(1.0, 0.0).Method_22451();
        this.Field_38277.Method_7648().Method_22443(d - d4, d2 - d5, d3).Method_22433(0.0, 0.0).Method_22451();
        this.Field_38277.Method_7647();
    }

    protected boolean Method_38372() {
        return this.Field_38201;
    }

    private void Method_38373() {
        int n = Math.max(this.Field_38347, this.Field_38338);
        int n2 = Field_38308[this.Field_38364];
        for (int i = 24576 & 3601; i < n2 && this.Field_38304.Method_14168() < n; ++i) {
            Point point = this.Field_38304.Method_14166();
            Class_8653 class_8653 = Class_8653.Method_8698(this.Field_38256 + point.x, this.Field_38350 + point.y);
            this.Method_38393(class_8653);
        }
        this.Field_38295 = this.Field_38304.Method_14168() >= this.Field_38347 ? 5 & 19497 : -32613 & 1280;
        this.Field_38253 = this.Field_38295 && this.Field_38304.Method_14168() >= this.Field_38338 ? 10257 & -31735 : 3588 & 12338;
    }

    protected double Method_38374() {
        return this.Field_38208 < 33.333333333333336 * 3.0 ? 7.640195823164841E307 * 2.3529411764705883 : this.Field_38208;
    }

    private boolean Method_38375() {
        return (this.Field_38281 == (-1 & -1) || this.Field_38224 && this.Field_38320 && this.Method_38383(this.Field_38218, this.Field_38292, this.Field_38291) ? -30523 & 4353 : 26688 & 23) != 0;
    }

    private void Method_38376(Class_8653 class_8653, Thread thread) {
        if (class_8653 != null) {
            int n = (4224 & 9667) + class_8653.Field_8665 * (6196 & 17752) - this.Field_38218;
            int n2 = (977 & -10104) + class_8653.Field_8655 * (4115 & 8316) - this.Field_38291;
            block0 : for (int i = -20847 & 16712; i < (82 & -21104); ++i) {
                int n3 = i + n2;
                if (n3 < 0) continue;
                if (n3 >= (17688 & 5062)) break;
                for (int j = -31860 & 3139; j < (5648 & -14154); ++j) {
                    int n4;
                    int n5 = j + n;
                    if (n5 < 0) continue;
                    if (n5 >= (11680 & 21250)) continue block0;
                    Class_17281 class_17281 = class_8653.Field_8671[i << (17831 & -32188) | j];
                    int n6 = n4 = class_17281 != null ? Class_18740.Method_18822(class_17281.Field_17343) : Class_18740.Method_18822(10245 & 769);
                    if (n4 < 0) {
                        n4 = Class_18740.Method_18822(12741 & 11);
                    }
                    byte by = (byte)(n4 >> (7259 & 688));
                    byte by2 = (byte)(n4 >> (16713 & 4760));
                    byte by3 = (byte)(n4 >> (-24568 & 96));
                    this.Field_38283.Method_37593(n5, n3, by, by2, by3);
                }
            }
        }
    }

    private int Method_38377(Class_1061 class_1061) {
        return class_1061 instanceof Class_859 ? (class_1061 == this.Field_38288 ? -1 & -1 : (class_1061 instanceof Class_626 ? (this.Field_38317 ? 18 & -31251 : -1 & -1) : (class_1061 instanceof Class_38719 ? (this.Field_38307 ? 24755 & 5635 : -1 & -1) : (class_1061 instanceof Class_43406 ? (this.Field_38268 ? 8550 & 5139 : -1 & -1) : (class_1061 instanceof Class_35570 ? (this.Field_38254 ? -28251 & 9300 : -1 & -1) : (!(class_1061 instanceof Class_41880) && !(class_1061 instanceof Class_46703) ? (class_1061 instanceof Class_40109 ? (this.Field_38302 ? 10638 & -28618 : -1 & -1) : (this.Field_38315 ? -11577 & 2077 : -1 & -1)) : (this.Field_38234 ? 261 & 11313 : -1 & -1))))))) : -1 & -1;
    }

    public void Method_38378(Class_279 class_279) {
        Class_20273.Method_20280();
    }

    public static int Method_38379(int n, int n2, int n3, int n4) {
        return (n & (-15105 & 2303)) << (666 & -30696) | (n2 & (511 & 20735)) << (3089 & 276) | (n3 & (255 & 3071)) << (10443 & -11988) | n4 & (24319 & 8703);
    }

    private static String Method_38380(String string) {
        int n = 18246;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_38196.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_38381(Class_8653 class_8653, Thread thread) {
        Class_17665 class_17665;
        if (class_8653 != null && (class_17665 = class_8653.Method_8697()) != null && !(class_17665 instanceof Class_44969)) {
            int n = (-20096 & 18562) + class_17665.Field_17666 * (-29353 & 528) - this.Field_38218;
            int n2 = (12422 & 4033) + class_17665.Field_17668 * (-14056 & 9232) - this.Field_38291;
            int n3 = this.Field_38365 && this.Field_38281 == 0 && class_8653.Field_8659 ? -24543 & 20993 : 16456 & 11265;
            Class_27665 class_27665 = new Class_27665(this.Field_38336);
            Class_8653 class_86532 = null;
            Class_8653 class_86533 = null;
            Class_8653 class_86534 = null;
            Class_8653 class_86535 = null;
            Class_8653 class_86536 = null;
            Class_8653 class_86537 = null;
            Class_8653 class_86538 = null;
            Class_8653 class_86539 = null;
            Class_8653 class_865310 = null;
            if (this.Field_38219 < (-20070 & 1122)) {
                class_86534 = Class_8653.Method_8698(class_17665.Field_17666, class_17665.Field_17668 - (-25839 & 131));
                class_86535 = Class_8653.Method_8698(class_17665.Field_17666, class_17665.Field_17668 + (3149 & 24593));
                class_86532 = Class_8653.Method_8698(class_17665.Field_17666 - (8737 & 4109), class_17665.Field_17668);
                class_86533 = Class_8653.Method_8698(class_17665.Field_17666 + (8257 & 641), class_17665.Field_17668);
                if (this.Field_38219 == 0) {
                    switch (this.Field_38247) {
                        case 0: {
                            if (class_17665.Method_17708().Field_284.Method_18370()) {
                                class_86536 = Class_8653.Method_8698(class_17665.Field_17666 + (19561 & 257), class_17665.Field_17668 - (257 & 133));
                                break;
                            }
                            if (this.Field_38340 >= 4.0f * -22.5f && this.Field_38340 <= 0.0f) {
                                class_86536 = Class_8653.Method_8698(class_17665.Field_17666 - (25601 & 4705), class_17665.Field_17668 + (59 & 11265));
                                break;
                            }
                            class_86536 = Class_8653.Method_8698(class_17665.Field_17666 + (-12287 & 515), class_17665.Field_17668 + (6349 & -32205));
                            break;
                        }
                        case 1: {
                            class_86536 = Class_8653.Method_8698(class_17665.Field_17666 - (-28411 & 11913), class_17665.Field_17668 - (1037 & 8609));
                            break;
                        }
                        case 2: {
                            class_86536 = Class_8653.Method_8698(class_17665.Field_17666 + (-16127 & 4167), class_17665.Field_17668 - (1 & 13573));
                            break;
                        }
                        default: {
                            class_86536 = Class_8653.Method_8698(class_17665.Field_17666 + (17673 & 8337), class_17665.Field_17668 + (9371 & 321));
                            break;
                        }
                        case 4: {
                            class_86536 = Class_8653.Method_8698(class_17665.Field_17666 - (2409 & 659), class_17665.Field_17668 + (21025 & 1089));
                        }
                    }
                }
            }
            block12 : for (int i = 32 & 134; i < (2192 & 21296); ++i) {
                int n4 = n2 + i;
                if (n4 < 0) continue;
                if (n4 >= (21316 & 3369)) break;
                for (int j = -13816 & 9474; j < (5392 & 2578); ++j) {
                    float f;
                    float f2;
                    int n5;
                    int n6 = n + j;
                    if (n6 < 0) continue;
                    if (n6 >= (12544 & 17672)) continue block12;
                    class_27665.Method_27676();
                    boolean bl = 11 & -28608;
                    int n7 = n5 = !this.Field_38358 && !this.Field_38290 && this.Field_38219 == (21626 & 3) ? this.Field_38274 : Math.min(this.Field_38274, this.Method_38442(class_17665, j, i));
                    if (n5 == (-1 & -1)) {
                        n5 = this.Field_38292 - (12293 & 3203);
                        bl = 2049 & 5065;
                    }
                    int n8 = !this.Field_38358 && !this.Method_38375() ? this.Field_38274 : Math.min(this.Field_38274, n5);
                    class_8653.Method_8689(j, i, n5);
                    if (n8 < 0) {
                        if (this.Field_38336) {
                            this.Field_38283.Method_37596(n6, n4, -1728117249 & 16759039);
                            continue;
                        }
                        this.Field_38283.Method_37596(n6, n4, -16447478 & -14667727);
                        continue;
                    }
                    class_27665.Field_27670 = n5 > 0 && class_17665.Method_17749(j, n5 - (-30685 & 157), i).Method_3373() == Class_3713.Field_3734 ? 4417 & 1075 : this.Field_38336;
                    this.Method_38367(class_8653, j, n8, i, class_27665, Class_26134.Field_26148, bl, thread);
                    if (this.Field_38290) {
                        f = this.Field_38219 < (4482 & 16922) ? 0.010563381f * 14.2f : 0.21276596f * 2.8200002f;
                        double d = (double)n5 - this.Field_38204;
                        f2 = (float)Math.log10(Math.abs(d) * (0.125 * 1.0) + 1.0) * f;
                        if (d >= 0.0) {
                            class_27665.Field_27667 += f2 * (1.0f - class_27665.Field_27667);
                            class_27665.Field_27666 += f2 * (1.0f - class_27665.Field_27666);
                            class_27665.Field_27668 += f2 * (1.0f - class_27665.Field_27668);
                        } else {
                            f2 = Math.abs(f2);
                            class_27665.Field_27667 -= f2 * class_27665.Field_27667;
                            class_27665.Field_27666 -= f2 * class_27665.Field_27666;
                            class_27665.Field_27668 -= f2 * class_27665.Field_27668;
                        }
                    }
                    f = 1.0f;
                    if (this.Field_38219 == (16969 & -24191)) {
                        class_86537 = j == 0 ? class_86532 : class_8653;
                        class_86538 = j == (463 & 3615) ? class_86533 : class_8653;
                        class_86539 = i == 0 ? class_86534 : class_8653;
                        class_865310 = i == (8751 & -16353) ? class_86535 : class_8653;
                        float f3 = class_86537 == null ? 0.0f : class_86537.Method_8695(j - (161 & -14843) & (4495 & 16415), i);
                        float f4 = class_86538 == null ? 0.0f : class_86538.Method_8695(j + (24329 & 197) & (2783 & 15), i);
                        f2 = class_86539 == null ? 0.0f : class_86539.Method_8695(j, i - (18689 & 3) & (16911 & 11535));
                        float f5 = class_865310 == null ? 0.0f : class_865310.Method_8695(j, i + (531 & -32727) & (-30705 & 9135));
                        f += Math.max(2.4358974f * -1.6421053f, Math.min(0.6987952f * 4.293103f, (f3 - f4) * this.Field_38323 + (f2 - f5) * this.Field_38298)) * (0.10334638f * 1.3684211f) * this.Field_38243;
                    } else if (this.Field_38219 == 0) {
                        switch (this.Field_38247) {
                            case 0: {
                                if (class_17665.Method_17708().Field_284.Method_18370()) {
                                    class_865310 = j == (-28609 & 8271) && i == 0 ? class_86536 : (j == (-7889 & 4127) ? class_86533 : (i == 0 ? class_86534 : class_8653));
                                    float f6 = class_865310 == null ? 0.0f : class_865310.Method_8695(j + (65 & -19683) & (5727 & 431), i - (-24703 & 107) & (18703 & 4623));
                                    f += Math.max(-6.0f * 0.6666667f, Math.min(1.4130435f * 2.123077f, ((float)n5 - f6) * this.Field_38323 + (f6 - (float)n5) * this.Field_38298)) * (0.30851063f * 0.45840028f) * this.Field_38243;
                                    break;
                                }
                                if (this.Field_38340 >= -438.75f * 0.6666667f && this.Field_38340 < 0.6666667f * -337.5f) {
                                    class_865310 = j == (-32049 & 15) ? class_86533 : class_8653;
                                    float f7 = class_865310 == null ? 0.0f : class_865310.Method_8695(j + (24641 & -31359) & (1103 & 9103), i);
                                    f += Math.max(2.652174f * -1.5081967f, Math.min(2.1891892f * 1.3703704f, ((float)n5 - f7) * this.Field_38323)) * (0.24827306f * 0.56962025f) * this.Field_38243;
                                    break;
                                }
                                if (this.Field_38340 >= -402.02206f * 0.83950615f && this.Field_38340 < -409.5f * 0.71428573f) {
                                    class_865310 = j == (7311 & 24623) && i == (3599 & 16431) ? class_86536 : (j == (1311 & -28529) ? class_86533 : (i == (-22513 & 5967) ? class_86535 : class_8653));
                                    float f8 = class_865310 == null ? 0.0f : class_865310.Method_8695(j + (373 & 16513) & (17215 & 79), i + (5249 & -23979) & (-32433 & 31));
                                    f += Math.max(2.35f * -1.7021277f, Math.min(1.0340909f * 2.901099f, ((float)n5 - f8) * this.Field_38323 + ((float)n5 - f8) * this.Field_38298)) * (0.525641f * 0.26904553f) * this.Field_38243;
                                    break;
                                }
                                if (this.Field_38340 < 0.90140843f * -24.960938f && this.Field_38340 >= -150.0f * 2.25f) {
                                    if (this.Field_38340 >= -202.5f * 0.33333334f && this.Field_38340 < -180.0f * 0.125f) {
                                        class_865310 = j == 0 && i == (4127 & -23921) ? class_86536 : (j == 0 ? class_86532 : (i == (-23921 & 18447) ? class_86535 : class_8653));
                                        float f9 = class_865310 == null ? 0.0f : class_865310.Method_8695(j - (-25759 & 1041) & (-32369 & 6703), i + (16389 & -32735) & (79 & 2095));
                                        f += Math.max(-5.642857f * 0.70886075f, Math.min(13.8f * 0.2173913f, (f9 - (float)n5) * this.Field_38323 + ((float)n5 - f9) * this.Field_38298)) * (0.044997707f * 3.142857f) * this.Field_38243;
                                        break;
                                    }
                                    class_865310 = j == 0 ? class_86532 : class_8653;
                                    float f10 = class_865310 == null ? 0.0f : class_865310.Method_8695(j - (1611 & -32731) & (8463 & -16369), i);
                                    f += Math.max(1.2678572f * -3.1549294f, Math.min(11.333333f * 0.2647059f, (f10 - (float)n5) * this.Field_38323)) * (1.2727273f * 0.11111679f) * this.Field_38243;
                                    break;
                                }
                                class_865310 = i == (623 & -14065) ? class_86535 : class_8653;
                                float f11 = class_865310 == null ? 0.0f : class_865310.Method_8695(j, i + (5157 & -30567) & (27151 & 4159));
                                f += Math.max(4.4736843f * -0.89411765f, Math.min(3.375f * 0.8888889f, ((float)n5 - f11) * this.Field_38298)) * (0.9756098f * 0.14495689f) * this.Field_38243;
                                break;
                            }
                            case 1: {
                                class_865310 = j == 0 && i == 0 ? class_86536 : (j == 0 ? class_86532 : (i == 0 ? class_86534 : class_8653));
                                float f12 = class_865310 == null ? 0.0f : class_865310.Method_8695(j - (-13757 & 9229) & (8271 & 2623), i - (-21759 & 16485) & (847 & 4111));
                                f += Math.max(0.8181818f * -4.888889f, Math.min(22.499998f * 0.13333334f, (f12 - (float)n5) * this.Field_38323 + (f12 - (float)n5) * this.Field_38298)) * (2.6176472f * 0.054026138f) * this.Field_38243;
                                break;
                            }
                            case 2: {
                                class_865310 = j == (19599 & -32721) && i == 0 ? class_86536 : (j == (-30705 & 8847) ? class_86533 : (i == 0 ? class_86534 : class_8653));
                                float f13 = class_865310 == null ? 0.0f : class_865310.Method_8695(j + (-32467 & 1553) & (2079 & 4623), i - (4901 & 17409) & (8495 & 16463));
                                f += Math.max(0.44615385f * -8.965517f, Math.min(0.33333334f * 9.0f, ((float)n5 - f13) * this.Field_38323 + (f13 - (float)n5) * this.Field_38298)) * (0.6617647f * 0.2137034f) * this.Field_38243;
                                break;
                            }
                            default: {
                                class_865310 = j == (4159 & 16399) && i == (30223 & 271) ? class_86536 : (j == (16911 & 8239) ? class_86533 : (i == (31887 & 367) ? class_86535 : class_8653));
                                float f14 = class_865310 == null ? 0.0f : class_865310.Method_8695(j + (-27599 & 17167) & (15 & -22369), i + (9089 & -12255) & (4639 & 16783));
                                f += Math.max(5.0588236f * -0.7906977f, Math.min(5.5f * 0.54545456f, ((float)n5 - f14) * this.Field_38323 + ((float)n5 - f14) * this.Field_38298)) * (0.12142238f * 1.1647059f) * this.Field_38243;
                                break;
                            }
                            case 4: {
                                class_865310 = j == 0 && i == (-21489 & 21199) ? class_86536 : (j == 0 ? class_86532 : (i == (223 & 303) ? class_86535 : class_8653));
                                float f15 = class_865310 == null ? 0.0f : class_865310.Method_8695(j - (1155 & -28671) & (1311 & -32657), i + (14401 & -32587) & (2063 & 17551));
                                f += Math.max(-19.0f * 0.21052632f, Math.min(0.08510638f * 35.25f, (f15 - (float)n5) * this.Field_38323 + ((float)n5 - f15) * this.Field_38298)) * (0.21875f * 0.64649767f) * this.Field_38243;
                            }
                        }
                    }
                    if (n3 != 0) {
                        class_27665.Field_27667 = (float)((double)class_27665.Field_27667 * (0.5872340425531914 * 2.0434782608695654));
                        class_27665.Field_27666 = (float)((double)class_27665.Field_27666 * (1.25 * 0.4));
                        class_27665.Field_27668 = (float)((double)class_27665.Field_27668 * (0.5 * 1.0));
                    }
                    if (this.Field_38362 && (j == 0 || i == 0)) {
                        if (this.Method_38375()) {
                            class_27665.Field_27667 = (float)((double)(class_27665.Field_27667 + 0.83076924f * 0.962963f) * (1.302325581395349 * 0.3839285714285714));
                            class_27665.Field_27666 = (float)((double)(class_27665.Field_27666 + 0.5268817f * 1.5183674f) * (0.7321428571428571 * 0.6829268292682927));
                            class_27665.Field_27668 = (float)((double)(class_27665.Field_27668 + 2.78125f * 0.28764045f) * (0.5 * 1.0));
                        } else {
                            class_27665.Field_27667 = (float)((double)class_27665.Field_27667 * (38.5 * 0.012987012987012988));
                            class_27665.Field_27666 = (float)((double)class_27665.Field_27666 * (1.0476190476190477 * 0.47727272727272724));
                            class_27665.Field_27668 = (float)((double)class_27665.Field_27668 * (0.2457627118644068 * 2.0344827586206895));
                        }
                    }
                    byte by = Class_38196.Method_38423(class_27665.Field_27667 * f);
                    byte by2 = Class_38196.Method_38423(class_27665.Field_27666 * f);
                    byte by3 = Class_38196.Method_38423(class_27665.Field_27668 * f);
                    if (n5 > 0 && (this.Field_38336 && class_17665.Method_17749(j, n5 - (8473 & -27647), i).Method_3373() != Class_3713.Field_3734 || this.Field_38229 && class_17665.Method_17749(j, n5 - (-16379 & 4137), i).Method_3373() == Class_3713.Field_3734)) {
                        this.Field_38283.Method_37601(n6, n4, by, by2, by3, Class_38196.Method_38423(class_27665.Field_27669));
                        continue;
                    }
                    this.Field_38283.Method_37593(n6, n4, by, by2, by3);
                }
            }
        }
    }

    protected void Method_38382() {
        Map.Entry entry = this.Field_38239.higherEntry(this.Field_38312);
        if (entry == null) {
            entry = this.Field_38239.higherEntry(-2138787712 & -1040170640);
        }
        if (entry != null) {
            this.Field_38312 = entry.getKey();
            this.Field_38265 = (ArrayList)entry.getValue();
        }
    }

    private boolean Method_38383(int n, int n2, int n3) {
        int n4;
        Class_3238 class_3238 = this.Field_38293.Method_375(new Class_4751(n, n2, n3)).Method_3442();
        for (n4 = n2; (class_3238.Method_3373() == Class_3713.Field_3734 || class_3238.Method_3373() == Class_3713.Field_3750 || class_3238.Method_3373() == Class_3713.Field_3729) && n4 < (-4865 & 767); ++n4) {
            class_3238 = this.Field_38293.Method_375(new Class_4751(n, n4 + (441 & 20545), n3)).Method_3442();
        }
        return (this.Field_38293.Method_385(new Class_4751(n, 16677 & -32565, n3)).Method_17705(Class_6778.Field_6781, new Class_4751(n & (17167 & -30545), Math.max(Math.min(n4, -32513 & 13055), -22718 & 6273), n3 & (4127 & 28079))) <= 0 ? 12833 & 147 : 8320 & -31397) != 0;
    }

    public void Method_38384(Class_13769 class_13769, Class_24246 class_24246) {
        switch (Class_6913.Field_6916[class_13769.ordinal()]) {
            case 1: {
                this.Field_38303 = Class_24246.Method_24328(class_24246);
                break;
            }
            case 2: {
                this.Field_38335 = Class_24246.Method_24328(class_24246);
                break;
            }
            case 3: {
                this.Field_38333 = class_24246 == Class_24246.Field_24282 ? 33 & -17471 : 17473 & 898;
                break;
            }
            case 4: {
                this.Field_38343 = class_24246 == Class_24246.Field_24277 ? 8709 & 20841 : 144 & 20992;
                break;
            }
            case 5: {
                this.Field_38238 = Math.max(16448 & 564, class_13769.Method_13893(class_24246));
                switch (this.Field_38238) {
                    case 0: {
                        Class_14701.Method_14732("/assets/reifnsk/textures/minimap/");
                        return;
                    }
                }
                return;
            }
            case 6: {
                this.Field_38246 = Math.max(-26815 & 24604, class_13769.Method_13893(class_24246));
                break;
            }
            case 7: {
                this.Field_38282 = class_13769.Method_13893(class_24246);
                break;
            }
            case 8: {
                switch (Class_6913.Field_6914[class_24246.ordinal()]) {
                    default: {
                        this.Field_38319 = 1.0f;
                        return;
                    }
                    case 2: {
                        this.Field_38319 = 1.7068965f * 0.43939394f;
                        return;
                    }
                    case 3: {
                        this.Field_38319 = 0.53614455f * 0.9325843f;
                        return;
                    }
                    case 4: 
                }
                this.Field_38319 = 18.0f * 0.013888889f;
                return;
            }
            case 9: {
                this.Field_38351 = class_13769.Method_13893(class_24246);
                break;
            }
            case 10: {
                switch (Class_6913.Field_6914[class_24246.ordinal()]) {
                    default: {
                        this.Field_38237 = 1.0f;
                        return;
                    }
                    case 2: {
                        this.Field_38237 = 0.47727272f * 1.5714287f;
                        return;
                    }
                    case 3: {
                        this.Field_38237 = 0.24242425f * 2.0625f;
                        return;
                    }
                    case 4: 
                }
                this.Field_38237 = 17.0f * 0.014705882f;
                return;
            }
            case 11: {
                this.Field_38270 = Class_24246.Method_24328(class_24246);
                break;
            }
            case 12: {
                this.Field_38198 = Class_24246.Method_24328(class_24246);
                break;
            }
            case 13: {
                this.Field_38360 = Class_24246.Method_24328(class_24246);
                break;
            }
            case 14: {
                this.Field_38280 = Math.max(25856 & 48, class_13769.Method_13893(class_24246));
                break;
            }
            case 15: {
                this.Field_38342 = Math.max(-14311 & 8352, class_13769.Method_13893(class_24246));
                this.Field_38228 = class_24246 != Class_24246.Field_24293 ? 2053 & 145 : 276 & -27511;
                break;
            }
            case 16: {
                this.Field_38241 = Class_24246.Method_24328(class_24246);
                break;
            }
            case 17: {
                this.Field_38296 = Math.max(16 & 23848, class_13769.Method_13893(class_24246));
                break;
            }
            case 18: {
                this.Field_38364 = Math.max(6088 & -24555, class_13769.Method_13893(class_24246));
                break;
            }
            case 19: {
                this.Field_38357 = Class_24246.Method_24328(class_24246);
                break;
            }
            case 20: {
                this.Field_38262 = Math.max(1580 & -22528, class_13769.Method_13893(class_24246));
                if (this.Field_38251 == null || !this.Field_38251.isAlive()) break;
                this.Field_38251.setPriority((-30517 & 21763) + this.Field_38262);
                break;
            }
            case 21: {
                this.Field_38353 = Class_24246.Method_24328(class_24246);
                break;
            }
            case 22: {
                this.Field_38306 = Math.max(16385 & 6956, class_13769.Method_13893(class_24246));
                break;
            }
            case 23: {
                this.Field_38363 = Math.max(1044 & 17154, class_13769.Method_13893(class_24246));
                break;
            }
            case 24: {
                this.Field_38219 = Math.max(2689 & -7120, class_13769.Method_13893(class_24246));
                break;
            }
            case 25: {
                this.Field_38247 = Math.max(4 & 10753, class_13769.Method_13893(class_24246));
                break;
            }
            case 26: {
                this.Field_38290 = Class_24246.Method_24328(class_24246);
                break;
            }
            case 27: {
                this.Field_38336 = Class_24246.Method_24328(class_24246);
                break;
            }
            case 28: {
                this.Field_38229 = Class_24246.Method_24328(class_24246);
                break;
            }
            case 29: {
                this.Field_38214 = Class_24246.Method_24328(class_24246);
                break;
            }
            case 30: {
                this.Field_38358 = Class_24246.Method_24328(class_24246);
                break;
            }
            case 31: {
                this.Field_38356 = Class_24246.Method_24328(class_24246);
                break;
            }
            case 32: {
                this.Field_38362 = Class_24246.Method_24328(class_24246);
                break;
            }
            case 33: {
                this.Field_38365 = Class_24246.Method_24328(class_24246);
                break;
            }
            case 34: {
                this.Field_38202 = Math.max(4370 & 2560, class_13769.Method_13893(class_24246));
                break;
            }
            case 35: {
                this.Field_38221 = Class_24246.Method_24328(class_24246);
                break;
            }
            case 36: {
                this.\u0000strictfp.Method_218(new Class_24388(-3959 & 85));
                break;
            }
            case 37: {
                this.\u0000strictfp.Method_218(new Class_24388(-30589 & 9514));
                break;
            }
            case 38: {
                this.\u0000strictfp.Method_218(new Class_24388(6239 & 1155));
                break;
            }
            case 39: {
                this.\u0000strictfp.Method_218(new Class_24388(9734 & 18566));
                break;
            }
            case 40: {
                this.\u0000strictfp.Method_218(new Class_24388(2324 & 9412));
                break;
            }
            case 41: {
                this.Field_38212 = Class_24246.Method_24328(class_24246);
                break;
            }
            case 42: {
                this.Field_38224 = Class_24246.Method_24328(class_24246);
                break;
            }
            case 43: {
                this.Field_38348 = Class_24246.Method_24328(class_24246);
                break;
            }
            case 44: {
                this.Field_38272 = Class_24246.Method_24328(class_24246);
                break;
            }
            case 45: {
                this.Field_38314 = Class_24246.Method_24328(class_24246);
                break;
            }
            case 46: {
                this.Field_38321 = Class_24246.Method_24328(class_24246);
                break;
            }
            case 47: {
                this.Field_38261 = Class_24246.Method_24328(class_24246);
                break;
            }
            case 48: {
                this.Field_38349 = Class_24246.Method_24328(class_24246);
                break;
            }
            case 49: {
                this.Field_38257 = Class_24246.Method_24328(class_24246);
                break;
            }
            case 50: {
                this.Field_38284 = Class_24246.Method_24328(class_24246);
                break;
            }
            case 51: {
                this.Field_38316 = Class_24246.Method_24328(class_24246);
                break;
            }
            case 52: {
                this.Field_38331 = Class_24246.Method_24328(class_24246);
                break;
            }
            case 53: {
                this.\u0000strictfp.Method_218(new Class_24388(15 & -16283));
                break;
            }
            case 54: {
                this.Field_38326 = Class_24246.Method_24328(class_24246);
                break;
            }
            case 55: {
                this.Field_38201 = Class_24246.Method_24328(class_24246);
                break;
            }
            case 56: {
                this.Field_38305 = Math.max(272 & -24570, class_13769.Method_13893(class_24246));
                break;
            }
            case 57: {
                this.Field_38366 = Class_24246.Method_24328(class_24246);
                break;
            }
            case 58: {
                this.Field_38276 = Class_24246.Method_24328(class_24246);
                break;
            }
            case 59: {
                switch (Class_6913.Field_6914[class_24246.ordinal()]) {
                    default: {
                        this.Field_38206 = 1.0f;
                        return;
                    }
                    case 2: {
                        this.Field_38206 = 2.71875f * 0.27586207f;
                        return;
                    }
                    case 3: {
                        this.Field_38206 = 0.6034483f * 0.82857144f;
                        return;
                    }
                    case 4: 
                }
                this.Field_38206 = 0.24152543f * 1.0350877f;
                return;
            }
            case 60: {
                this.Field_38355 = Math.max(1225 & 2564, class_13769.Method_13893(class_24246));
                break;
            }
            case 61: {
                this.Field_38352 = class_24246 == Class_24246.Field_24288 ? 1.2619047f * 0.39622644f : 1.0f;
            }
        }
    }

    private static String Method_38385(String string) {
        int n = 14035;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_38196.class, 7);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public String Method_38386(Class_13769 class_13769) {
        switch (Class_6913.Field_6916[class_13769.ordinal()]) {
            case 62: {
                return String.valueOf(this.Field_38243);
            }
            case 63: {
                return String.valueOf(this.Field_38236);
            }
            case 64: {
                return String.valueOf(this.Field_38208);
            }
            case 65: {
                return String.valueOf(this.Field_38334);
            }
        }
        return String.valueOf(20889 & 6);
    }

    protected int Method_38387() {
        return this.Field_38223;
    }

    public static String Method_38388(String string) {
        if (string == null) {
            return null;
        }
        int n = -28665 & 8801;
        char[] arrc = string.toCharArray();
        int n2 = arrc.length;
        for (int i = 268 & -28526; i < n2; ++i) {
            char c = arrc[i];
            if (c == (479 & 11359)) {
                c = -26264 & 8868;
            }
            arrc[i] = n != 0 ? Character.toTitleCase(c) : Character.toLowerCase(c);
            n = Character.isWhitespace(c) ? 1 : 0;
        }
        return new String(arrc);
    }

    protected int Method_38389() {
        return this.Field_38312;
    }

    private void Method_38390(Thread thread) {
        int n = Math.max(this.Field_38347, this.Field_38338);
        while (this.Field_38304.Method_14168() < n) {
            Point point = this.Field_38304.Method_14166();
            Class_8653 class_8653 = Class_8653.Method_8698(this.Field_38256 + point.x, this.Field_38350 + point.y);
            this.Method_38376(class_8653, thread);
        }
        this.Field_38295 = this.Field_38304.Method_14168() >= this.Field_38347 ? -30527 & 5409 : -13815 & 132;
        this.Field_38253 = this.Field_38295 && this.Field_38304.Method_14168() >= this.Field_38338 ? -24523 & 7297 : 2657 & 158;
    }

    private static String Method_38391(String string) {
        int n = 20620;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_38196.class, 8);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_38392(boolean bl) {
        if (this.Field_38293 != null && this.Field_38288 != null) {
            double d;
            Thread thread = Thread.currentThread();
            if (this.Field_38304.Method_14168() == 0) {
                double d2;
                this.Field_38218 = Class_13337.Method_13371(this.Field_38259);
                this.Field_38291 = Class_13337.Method_13371(this.Field_38299);
                this.Field_38292 = Class_13337.Method_13371(this.Field_38217);
                this.Field_38204 = this.Field_38217;
                this.Field_38256 = this.Field_38288.\u0000= `;
                this.Field_38350 = this.Field_38288.\u0000switch;
                this.Field_38300 = this.Method_38434(this.Field_38293.Method_511(), 0.0f);
                if (this.Field_38363 == 0) {
                    switch (this.Field_38306) {
                        case 0: {
                            this.Method_38408(this.Field_38293.Method_511(), 0.0f);
                            break;
                        }
                        case 1: {
                            this.Method_38408(1889964134049929075L & 691058544L, 0.0f);
                            break;
                        }
                        case 2: {
                            this.Method_38408(18302L & 813747792L, 0.0f);
                            break;
                        }
                        case 3: {
                            this.Method_38408(9207792L & 5277957391756826480L, 0.0f);
                        }
                    }
                }
                if (this.Field_38247 == (-15039 & 12457)) {
                    d2 = 0.014285714285714285 * 15750.0;
                } else if (this.Field_38247 == (1538 & 375)) {
                    d2 = 20.593220338983052 * 6.555555555555555;
                } else if (this.Field_38247 == (4415 & 11907)) {
                    d2 = 0.8095238095238095 * 55.588235294117645;
                } else if (this.Field_38247 == (8340 & 5132)) {
                    d2 = 0.525 * -85.71428571428571;
                } else if (this.Field_38247 == 0) {
                    this.Field_38340 = this.Method_38404();
                    d2 = this.Field_38340;
                } else {
                    d2 = 0.0;
                }
                d = Math.toRadians(d2);
                if (this.Field_38293.Field_284.Method_18370()) {
                    d = Math.toRadians(1.2093023255813953 * 111.63461538461539);
                }
                this.Field_38323 = (float)Math.sin(d);
                this.Field_38298 = (float)Math.cos(d);
                this.Field_38205 = Class_23541.Method_23543(1.0 * 0.5, 1.0);
                this.Field_38273 = Class_12135.Method_12137(0.16923076923076924 * 2.9545454545454546, 1.0);
                this.Field_38297 = Class_12135.Method_12142();
                this.Field_38232 = Class_12135.Method_12138();
            }
            if (this.Field_38328) {
                this.Field_38347 = -11471 & 353;
                this.Field_38338 = -21655 & 1313;
            } else if (this.Field_38264 < this.Field_38216) {
                d = Math.ceil(2.5172413793103448 * 1.589041095890411 / this.Field_38264) * (13.2 * 0.15151515151515152) + 1.0;
                this.Field_38347 = (int)(d * d);
                d = Math.ceil(0.13157894736842105 * 30.400000000000002 / this.Field_38216) * (1.959183673469388 * 1.0208333333333333) + 1.0;
                this.Field_38338 = (int)(d * d);
            } else {
                d = Math.ceil(12.32 * 0.3246753246753247 / this.Field_38216) * (1.4736842105263157 * 1.3571428571428572) + 1.0;
                this.Field_38347 = this.Field_38338 = (int)(d * d);
            }
            if (this.Field_38202 == (10347 & -27391)) {
                if (!this.Field_38209 && bl) {
                    this.Method_38368(thread);
                } else {
                    this.Method_38390(thread);
                }
            } else if (this.Field_38202 == (-30077 & 4150) && this.Field_38320) {
                if (!this.Field_38209 && bl) {
                    this.Method_38373();
                } else {
                    this.Method_38369();
                }
            } else if (!this.Field_38209 && bl) {
                this.Method_38410(thread);
            } else {
                this.Method_38409(thread);
            }
            if (this.Field_38253) {
                this.Field_38209 = -19200 & 2048;
                this.Field_38253 = -16375 & 3842;
                this.Field_38304.Method_14169();
                this.Field_38275 = this.Field_38218;
                this.Field_38207 = this.Field_38291;
                this.Field_38269 = this.Field_38292;
            }
        }
    }

    private void Method_38393(Class_8653 class_8653) {
        Class_17665 class_17665;
        if (class_8653 != null && (class_17665 = class_8653.Method_8697()) != null && !(class_17665 instanceof Class_44969)) {
            int n = (16548 & -18296) + class_17665.Field_17666 * (-28047 & 3098) - this.Field_38218;
            int n2 = (385 & 24704) + class_17665.Field_17668 * (12696 & 17015) - this.Field_38291;
            block4 : for (int i = -16372 & 4736; i < (-11204 & 8211); ++i) {
                int n3 = n2 + i;
                if (n3 < 0) continue;
                if (n3 >= (-30240 & 9490)) break;
                for (int j = 8226 & 21520; j < (2256 & -32239); ++j) {
                    int n4 = n + j;
                    if (n4 < 0) continue;
                    if (n4 >= (2327 & -16024)) continue block4;
                    float f = 0.0f;
                    switch (this.Field_38281) {
                        case -1: {
                            int n5;
                            int n6;
                            for (n6 = -15663 & 268; n6 < Field_38242.length; ++n6) {
                                n5 = this.Field_38292 - n6;
                                if (n5 >= 0 && n5 <= this.Field_38274 && class_17665.Method_17774(j, n5, i) == 0 && class_17665.Method_17738(j, n5, i, -11538 & 9244) != 0) {
                                    f += Field_38242[n6];
                                }
                                if ((n5 = this.Field_38292 + n6 + (16481 & 1793)) < 0 || n5 > this.Field_38274 || class_17665.Method_17774(j, n5, i) != 0 || class_17665.Method_17738(j, n5, i, -30644 & 157) == 0) continue;
                                f += Field_38242[n6];
                            }
                            break;
                        }
                        case 0: {
                            int n5;
                            int n6;
                            for (n6 = -24576 & 6705; n6 < Field_38242.length; ++n6) {
                                n5 = this.Field_38292 - n6;
                                if (n5 > this.Field_38274 || n5 >= 0 && class_17665.Method_17774(j, n5, i) == 0 && class_17665.Method_17738(j, n5, i, -15860 & 12510) != 0) {
                                    f += Field_38242[n6];
                                }
                                if ((n5 = this.Field_38292 + n6 + (229 & 7171)) <= this.Field_38274 && (n5 < 0 || class_17665.Method_17774(j, n5, i) != 0 || class_17665.Method_17738(j, n5, i, 12 & -8179) == 0)) continue;
                                f += Field_38242[n6];
                            }
                            break;
                        }
                    }
                    f = 1.8387097f * 0.4350877f - f;
                    this.Field_38283.Method_37593(n4, n3, Class_38196.Method_38423(0.0f), Class_38196.Method_38423(f), Class_38196.Method_38423(0.0f));
                }
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void Method_38394() {
        double d;
        Object object4;
        double d2;
        Object object2;
        Object object3;
        double d3;
        int n;
        int n2;
        double d4;
        String string;
        int n3;
        float f;
        Class_859 class_859;
        float f2;
        int n4 = 21057 & 8593;
        if (this.Field_38282 == 0) {
            n4 = this.Field_38222.Method_31572();
        } else if (this.Field_38282 == (11 & 6913)) {
            while (this.Field_38211 >= (n4 + (-24575 & 3331)) * (3044 & -16062) && this.Field_38344 >= (n4 + (-31613 & 10253)) * (501 & -24848)) {
                ++n4;
            }
        } else {
            n4 = this.Field_38282 - (1667 & 1);
        }
        int n5 = this.Field_38296 - (4321 & 10499);
        if (this.Field_38296 == 0) {
            n5 = this.Field_38222.Method_31572() + (-32755 & 2049) >> (28929 & 657);
        } else if (this.Field_38296 == (6409 & -16285)) {
            n5 = n4 + (4193 & -32249) >> (2049 & -24569);
        }
        int n6 = (this.Field_38246 & (12419 & 2078)) == 0 ? (4149 & -32211) * n4 : this.Field_38211 - (-32603 & 15725) * n4;
        int n7 = n3 = (this.Field_38246 & (8235 & -15983)) == 0 ? (2613 & 4455) * n4 : this.Field_38344 - (-15579 & 47) * n4;
        if ((this.Field_38246 & (12357 & 1043)) == (4097 & -32195)) {
            n3 -= ((this.Field_38335 | this.Field_38228 ? 2562 & 20890 : 553 & 16388) + (this.Field_38335 ? 2443 & 26169 : -28672 & 2452) + (this.Field_38228 ? -31726 & 4247 : 0 & -10072)) * n5;
        }
        int n8 = this.\u0000, for * this.Field_38222.Method_31572();
        int n9 = this.\u0000, 2 * this.Field_38222.Method_31572();
        int n10 = (-32048 & 30028) * n4 / this.Field_38222.Method_31572();
        this.\u0000, `(n10, n10);
        n6 = (-10175 & 1114) * n4 / (-30142 & 16438) + n8;
        n3 = (7136 & 8268) * n4 / (34 & 29698) + n9;
        GL11.glTranslated((double)n6, (double)n3, (double)0.0);
        GL11.glScalef((float)n4, (float)n4, (float)1.0f);
        GL11.glDisable((int)(7138 & 19443));
        GL11.glColorMask((128 & 4379) != 0, (21100 & 146) != 0, (17634 & 6404) != 0, (-31424 & 8232) != 0);
        GL11.glEnable((int)(-12423 & 2929));
        if (this.Field_38333) {
            GL11.glAlphaFunc((int)(8739 & -15541), (float)(0.09245283f * 1.0816326f));
            GL11.glClearStencil((int)(1 & -1788));
            GL11.glClear((int)(-31744 & 29712));
            GL11.glEnable((int)(-9295 & 3024));
            GL11.glStencilFunc((int)(1591 & -17713), (int)(2113 & -24031), (int)(-1 & -1));
            GL11.glStencilOp((int)(-25080 & 7936), (int)(7681 & -8575), (int)(15911 & -24823));
            GL11.glDepthMask((-30714 & 1600) != 0);
        } else {
            GL11.glAlphaFunc((int)(2580 & -11386), (float)0.0f);
            GL11.glDepthMask((2049 & 4399) != 0);
        }
        Class_14701.Field_14718.Method_14728();
        this.Method_38371(0.0, 0.0, 1.3441999999999998 * 0.7446808510638298, 15.589743589743588 * 4.105263157894737, 1.7272727272727273 * 37.05263157894737);
        if (this.Field_38333) {
            GL11.glStencilOp((int)(7680 & -24684), (int)(8128 & -16871), (int)(-24952 & 24336));
            GL11.glStencilFunc((int)(6850 & 8718), (int)(16531 & 3585), (int)(-1 & -1));
        }
        GL11.glEnable((int)(7139 & 20450));
        GL11.glAlphaFunc((int)(2820 & 26141), (float)0.0f);
        GL11.glBlendFunc((int)(22338 & -29926), (int)(4995 & 3875));
        GL11.glColorMask((19011 & 4389) != 0, (8197 & 4353) != 0, (-24573 & 2457) != 0, (18049 & -32507) != 0);
        GL11.glDepthMask((-30655 & 4229) != 0);
        double d5 = 0.875 * 0.2857142857142857 / this.Field_38264;
        double d6 = (this.Field_38259 - (double)this.Field_38275) * (1.1666666666666667 * 0.0033482142857142855);
        double d7 = (this.Field_38299 - (double)this.Field_38207) * (0.0067708333333333336 * 0.5769230769230769);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)this.Field_38319);
        this.Field_38283.Method_37598();
        this.Field_38277.Method_7648().Method_22417(2071 & 16495, Class_29585.Field_29598);
        this.Field_38277.Method_7648().Method_22443(1.0 * 32.0, 37.0 * 0.8648648648648649, 1.0).Method_22433(0.75 * 0.6666666666666666 + d5 + d6, 0.06875 * 7.2727272727272725 + d5 + d7).Method_22451();
        this.Field_38277.Method_7648().Method_22443(33.523809523809526 * 0.9545454545454546, 26.333333333333332 * -1.2151898734177216, 1.0).Method_22433(1.017857142857143 * 0.49122807017543857 + d5 + d6, 0.6086956521739131 * 0.8214285714285714 - d5 + d7).Method_22451();
        this.Field_38277.Method_7648().Method_22443(1.2328767123287672 * -25.955555555555556, -10.666666666666666 * 3.0, 1.0).Method_22433(1.0441176470588236 * 0.4788732394366197 - d5 + d6, 0.28888888888888886 * 1.7307692307692308 - d5 + d7).Method_22451();
        this.Field_38277.Method_7648().Method_22443(-16.0 * 2.0, 14.147368421052631 * 2.261904761904762, 1.0).Method_22433(0.26851851851851855 * 1.8620689655172413 - d5 + d6, 0.07575757575757576 * 6.6 + d5 + d7).Method_22451();
        this.Field_38277.Method_7647();
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        if (this.Field_38215) {
            float f3;
            f2 = this.Field_38333 ? 0.86538464f * 39.288887f : 1.862069f * 16.648148f;
            (this.Field_38316 ? Class_14701.Field_14724 : Class_14701.Field_14721).Method_14728();
            for (n2 = this.Field_38310.length - (-26107 & 8513); n2 >= 0; --n2) {
                object2 = this.Field_38240[n2];
                object4 = this.Field_38310[n2];
                object3 = object4.iterator();
                while (object3.hasNext()) {
                    class_859 = (Class_859)object3.next();
                    n = class_859.Method_1033() ? object2 : (object2 & (16580094 & 66977020)) >> (-24054 & 3410) | -15679086 & -16772544;
                    d2 = class_859.\u0000%() + (class_859.\u0000= package - class_859.\u0000%()) * (double)this.Field_38325;
                    d = class_859.\u0000
                    () + (class_859.\u0000= switch - class_859.\u0000
                    ()) * (double)this.Field_38325;
                    d4 = class_859.\u0000= final() + (class_859.\u0000, for() - class_859.\u0000= final()) * (double)this.Field_38325;
                    if (this.Field_38331 && !(class_859.\u0000, for() >= this.Field_38217 - 1.911764705882353 * 2.0923076923076924) && !this.Method_38383((int)this.Field_38259, (int)this.Field_38217, (int)this.Field_38299) && this.Method_38383((int)class_859.\u0000= package, (int)class_859.\u0000, for(), (int)class_859.\u0000= switch)) continue;
                    d3 = this.Field_38259 - d2;
                    double d8 = this.Field_38299 - d;
                    d3 = d3 * this.Field_38264 * (0.06382978723404256 * 7.833333333333333);
                    d8 = d8 * this.Field_38264 * (0.27710843373493976 * 1.8043478260869565);
                    double d9 = Math.max(Math.abs(d3), Math.abs(d8));
                    try {
                        GL11.glPushMatrix();
                        if (!(d9 < (double)f2)) continue;
                        float f4 = (float)(n >> (820 & 4240) & (255 & -16129)) * (1.0352942f * 0.003787879f);
                        f3 = (float)(n >> (18749 & 9352) & (-31745 & 3327)) * (0.21276596f * 0.018431373f);
                        float f5 = (float)(n & (24831 & -32257)) * (0.02745098f * 0.14285715f);
                        float f6 = (float)Math.max(0.06521739130434782 * 3.066666666666667, 1.0 - Math.abs(this.Field_38217 - class_859.\u0000, for()) * (0.058823529411764705 * 0.68));
                        float f7 = (float)Math.min(1.0, Math.max(0.13636363636363635 * 3.666666666666667, 1.0 - (this.Field_38288.\u0000strictfp.Field_11000 - class_859.\u0000strictfp.Field_11000) * (3.5 * 0.028571428571428574)));
                        GL11.glColor4f((float)(f4 *= f7), (float)(f3 *= f7), (float)(f5 *= f7), (float)f6);
                        float f8 = class_859.\u0000switch + (class_859.\u0000= ? - class_859.\u0000switch) * this.Field_38325;
                        double d10 = -d8;
                        double d11 = -d3;
                        if (!(class_859 instanceof Class_34590)) {
                            f8 += 48.0f * 3.75f;
                        }
                        if (this.Field_38316) {
                            GL11.glTranslated((double)d11, (double)d10, (double)0.0);
                            GL11.glRotatef((float)f8, (float)0.0f, (float)0.0f, (float)1.0f);
                            GL11.glTranslated((double)(-d11), (double)(-d10), (double)0.0);
                        }
                        this.Method_38371(d11, d10, 1.0, 0.5454545454545455 * 14.666666666666666, 1.6666666666666667 * 4.8);
                    }
                    finally {
                        GL11.glPopMatrix();
                    }
                }
            }
            if (this.Field_38284) {
                for (Object object4 : this.Field_38313) {
                    if (!(object4 instanceof Class_27363)) continue;
                    double d12 = this.Field_38259 - ((Class_1061)object4).Field_1130;
                    d4 = this.Field_38299 - ((Class_1061)object4).Field_1106;
                    d12 = d12 * this.Field_38264 * (2.5 * 0.2);
                    d4 = d4 * this.Field_38264 * (0.5185185185185185 * 0.9642857142857143);
                    d2 = Math.max(Math.abs(d12), Math.abs(d4));
                    try {
                        GL11.glPushMatrix();
                        if (!(d2 < (double)f2)) continue;
                        float f9 = (float)Math.max(0.05090909090909092 * 3.9285714285714284, 1.0 - Math.abs(this.Field_38217 - ((Class_1061)object4).Method_1324()) * (1.0 * 0.04));
                        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)f9);
                        double d13 = -d4;
                        double d14 = -d12;
                        f3 = ((Class_1061)object4).Field_1079 + 185.14285f * 0.9722222f;
                        Class_14701.Field_14726.Method_14728();
                        this.Method_38371(d14, d13, 1.0, 0.3333333333333333 * 24.0, 3.0 * 2.6666666666666665);
                    }
                    finally {
                        GL11.glPopMatrix();
                    }
                }
            }
        }
        if (this.Field_38333) {
            GL11.glDisable((int)(11216 & 3988));
        }
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glDisable((int)(3059 & -21647));
        GL11.glDepthMask((8224 & 7299) != 0);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)this.Field_38319);
        Class_14701.Field_14725.Method_14728();
        this.Method_38371(0.0, 0.0, 1.0, 233.84615384615384 * 0.2736842105263158, 0.29069767441860467 * 220.16);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        if (this.Field_38249) {
            d2 = this.Method_38425();
            object2 = this.Field_38265.iterator();
            while (object2.hasNext()) {
                object4 = (Class_7651)object2.next();
                if (!((Class_7651)object4).Field_7658) continue;
                double d15 = this.Field_38259 - (double)((Class_7651)object4).Field_7655 * d2 - 0.11875000000000001 * 4.2105263157894735;
                d4 = this.Field_38299 - (double)((Class_7651)object4).Field_7657 * d2 - 0.3389830508474576 * 1.475;
                d15 = d15 * this.Field_38264 * (1.9761904761904763 * 0.25301204819277107);
                d4 = d4 * this.Field_38264 * (0.2448979591836735 * 2.0416666666666665);
                f2 = (float)Math.toDegrees(Math.atan2(d15, d4));
                d = Math.max(Math.abs(d15), Math.abs(d4));
                try {
                    GL11.glPushMatrix();
                    if (d < 14.180851063829788 * 2.186046511627907) {
                        GL11.glColor4f((float)((Class_7651)object4).Field_7662, (float)((Class_7651)object4).Field_7654, (float)((Class_7651)object4).Field_7659, (float)((float)Math.min(1.0, Math.max(0.17534246575342466 * 2.28125, (d - 1.0) * (0.38961038961038963 * 1.2833333333333332)))));
                        Class_7651.Field_7661[((Class_7651)object4).Field_7652].Method_14728();
                        this.Method_38371(-d15, -d4, 1.0, 8.0 * 1.0 * (double)this.Field_38352, 4.981132075471699 * 1.606060606060606 * (double)this.Field_38352);
                        continue;
                    }
                    double d16 = 0.25287356321839083 * 134.45454545454544 / d;
                    d3 = Math.sqrt((d15 *= d16) * d15 + (d4 *= d16) * d4);
                    GL11.glColor3f((float)((Class_7651)object4).Field_7662, (float)((Class_7651)object4).Field_7654, (float)((Class_7651)object4).Field_7659);
                    Class_7651.Field_7656[((Class_7651)object4).Field_7652].Method_14728();
                    GL11.glRotatef((float)(0.0f - f2), (float)0.0f, (float)0.0f, (float)1.0f);
                    GL11.glTranslated((double)0.0, (double)(-d3), (double)0.0);
                    this.Method_38371(0.0, 0.0, 1.0, 0.6153846153846154 * 13.0, 13.75 * 0.5818181818181818);
                }
                finally {
                    GL11.glPopMatrix();
                }
            }
        }
        try {
            GL11.glColor3f((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glPushMatrix();
            Class_14701.Field_14702.Method_14728();
            GL11.glRotatef((float)(this.Field_38329 - 1349.9999f * 0.13333334f), (float)0.0f, (float)0.0f, (float)1.0f);
            this.Method_38371(0.0, 0.0, 1.0, 40.94117647058823 * 0.19540229885057472, 32.0 * 0.25);
        }
        catch (Exception exception) {
        }
        finally {
            GL11.glPopMatrix();
        }
        GL11.glScaled((double)(1.0 / (double)n4), (double)(1.0 / (double)n4), (double)1.0);
        d2 = (double)this.\u0000strictfp.Field_27;
        n2 = (int)(this.Field_38225 * (0.45714286f * 557.8125f));
        if (n2 > 0) {
            Object[] arrobject = new Object[16397 & 11521];
            arrobject[193 & 40] = this.Field_38264;
            string = String.format("%2.2fx", arrobject);
            int n11 = d2.Method_28715(string);
            if (n2 > (1023 & 1279)) {
                n2 = -28161 & 10495;
            }
            int n12 = (-13986 & 1055) * n4 - n11 * n5;
            int n13 = (1182 & 606) * n4 - (9577 & 4618) * n5;
            GL11.glTranslatef((float)n12, (float)n13, (float)0.0f);
            GL11.glScalef((float)n5, (float)n5, (float)1.0f);
            n = n2 << (8280 & -28135) | -2097152001 & 285212671;
            Class_16867.Method_16975();
            d2.Method_28729(string, 0.0f, 0.0f, n);
            GL11.glScaled((double)(1.0 / (double)n5), (double)(1.0 / (double)n5), (double)1.0);
            GL11.glTranslatef((float)(-n12), (float)(-n13), (float)0.0f);
        }
        if (this.Field_38249 && this.Field_38281 != this.Field_38312) {
            float f10;
            GL11.glPushMatrix();
            string = this.Method_38431(this.Field_38312);
            float f11 = (float)d2.Method_28715(string) * (1.1794872f * 0.42391303f) * (float)n5;
            float f12 = f10 = (float)((17453 & 229) * n4) < f11 ? (float)((8365 & 37) * n4) - f11 : 0.0f;
            if ((this.Field_38246 & (8198 & -32757)) == 0) {
                f10 = -f10;
            }
            GL11.glTranslated((double)(f10 - f11), (double)((-18 & -13) * n4 + (25623 & -30463) * n5), (double)0.0);
            GL11.glScaled((double)n5, (double)n5, (double)1.0);
            Class_16867.Method_16975();
            d2.Method_28729(string, 0.0f, 0.0f, 486539263 & 1140850687);
            GL11.glPopMatrix();
        }
        if (this.Field_38241) {
            class_859 = (Class_859)((this.Field_38329 + 24.375f * 7.3846154f) % (4.7647057f * 75.55556f));
            if (class_859 < 0.0f) {
                class_859 += 4.285714f * 84.0f;
            }
            Object[] arrobject = new Object[20737 & 10259];
            arrobject[20546 & -30191] = (int)class_859;
            string = String.format("%03d'", arrobject);
            d2.Method_28715(string);
            object3 = (-14 & -30) * n4 + (385 & 585) * n5;
            n = (-13 & -22) * n4 + (17 & -11061) * n5;
            GL11.glTranslatef((float)((float)object3), (float)n, (float)0.0f);
            GL11.glScalef((float)n5, (float)n5, (float)1.0f);
            Class_16867.Method_16975();
            d2.Method_28729(string, 0.0f, 0.0f, -989855745 & 587202559);
            GL11.glScaled((double)(1.0 / (double)n5), (double)(1.0 / (double)n5), (double)1.0);
            GL11.glTranslatef((float)((float)(-object3)), (float)(-n), (float)0.0f);
        }
        if (this.Field_38280 < (18946 & -23422)) {
            long l;
            if (this.Field_38280 == (-24423 & 8035)) {
                l = this.Field_38293.Method_511();
                object3 = (int)((l + (-9090918562968627336L & 537827187L)) % (939843552L & 1157725636L) / (4406640003429467129L & 17384L));
                n = (int)(l % (-7341727125205932052L & 1180650L) * (537133117L & 1080165692L) / (3954177470636360696L & 541066217L));
                string = new SimpleDateFormat("HH:mm").format(new Date());
            } else {
                l = this.Field_38293.Method_511();
                object3 = (int)((l + (1677735920L & -9198082384382978181L)) % (201711056L & 277372392L) / (537547768L & 305138667L));
                n = (int)(l % (-6343604928086145048L & 6343604926186030077L) * (256165244L & 805315132L) / (1141040104L & 4199407L));
                Object[] arrobject = new Object[26 & 230];
                arrobject[-32764 & 10408] = Integer.valueOf(object3);
                arrobject[2219 & -23295] = n;
                string = String.format("%02d:%02d", arrobject);
            }
            object2 = d2.Method_28715(string);
            object4 = (-28513 & 26654) * n4 - object2 * n5 - (8197 & 1427) * n5;
            object3 = (-26 & -14) * n4 + (-31647 & 26761) * n5;
            GL11.glTranslatef((float)((float)object4), (float)((float)object3), (float)0.0f);
            GL11.glScalef((float)n5, (float)n5, (float)1.0f);
            Class_16867.Method_16975();
            d2.Method_28729(string, 0.0f, 0.0f, 50331647 & -1795162113);
            GL11.glScaled((double)(1.0 / (double)n5), (double)(1.0 / (double)n5), (double)1.0);
            GL11.glTranslatef((float)((float)(-object4)), (float)((float)(-object3)), (float)0.0f);
        }
        object2 = (-16096 & 751) * n4;
        if (this.Field_38228) {
            String string2;
            String string3;
            if (this.Field_38342 == 0) {
                n = Class_13337.Method_13371(this.Field_38259);
                int n14 = Class_13337.Method_13371(this.Field_38288.\u0000strictfp.Field_11000);
                int n15 = Class_13337.Method_13371(this.Field_38299);
                Object[] arrobject = new Object[2766 & 24835];
                arrobject[19498 & 64] = n;
                arrobject[1569 & -7983] = n15;
                string2 = String.format("%+d, %+d", arrobject);
                string3 = Integer.toString(n14);
            } else if (this.Field_38342 == (21059 & -32735)) {
                Object[] arrobject = new Object[2050 & 12494];
                arrobject[4610 & 10320] = this.Field_38259;
                arrobject[4193 & 2453] = this.Field_38299;
                string2 = String.format("%+1.2f, %+1.2f", arrobject);
                Object[] arrobject2 = new Object[131 & 22277];
                arrobject2[4389 & -32678] = this.Field_38288.\u0000strictfp.Field_11000;
                string3 = String.format("%1.2f", arrobject2);
            } else if (this.Field_38342 == (291 & 26758)) {
                Object[] arrobject = new Object[-28285 & 19058];
                arrobject[26965 & 2] = this.Field_38259;
                arrobject[20097 & 12365] = this.Field_38299;
                string2 = String.format("%+1.2f, %+1.2f", arrobject);
                Object[] arrobject3 = new Object[8266 & 1302];
                arrobject3[4099 & -8192] = this.Field_38217;
                arrobject3[-24559 & 777] = (int)this.Field_38288.\u0000strictfp.Field_11000;
                string3 = String.format("%1.2f (%d)", arrobject3);
            } else {
                Object[] arrobject = new Object[4238 & 24852];
                arrobject[16426 & 9280] = this.Field_38299 >= 0.0 ? "S" : "N";
                arrobject[897 & 2159] = this.Field_38299 >= 0.0 ? this.Field_38299 : -this.Field_38299;
                arrobject[2 & -28478] = this.Field_38259 >= 0.0 ? "E" : "W";
                arrobject[16507 & -23677] = this.Field_38259 >= 0.0 ? this.Field_38259 : -this.Field_38259;
                string2 = String.format("%s%1.2f, %s%1.2f", arrobject);
                Object[] arrobject4 = new Object[19477 & 8835];
                arrobject4[12804 & 2200] = this.Field_38288.\u0000strictfp.Field_11000;
                string3 = String.format("%1.2fm", arrobject4);
            }
            f = (float)d2.Method_28715(string2) * (1.4423077f * 0.34666666f) * (float)n5;
            float f13 = (float)d2.Method_28715(string3) * (0.3968254f * 1.26f) * (float)n5;
            float f14 = f2 = (float)((-15947 & 11311) * n4) < f ? (float)((37 & -29529) * n4) - f : 0.0f;
            if ((this.Field_38246 & (1795 & 18514)) == 0) {
                f2 = -f2;
            }
            GL11.glTranslatef((float)(f2 - f), (float)object2, (float)0.0f);
            GL11.glScalef((float)n5, (float)n5, (float)1.0f);
            Class_16867.Method_16975();
            d2.Method_28729(string2, 0.0f, 2.0f, 1627389951 & 285212671);
            GL11.glScaled((double)(1.0 / (double)n5), (double)(1.0 / (double)n5), (double)1.0);
            GL11.glTranslatef((float)(f - f13), (float)0.0f, (float)0.0f);
            GL11.glScalef((float)n5, (float)n5, (float)1.0f);
            Class_16867.Method_16975();
            d2.Method_28729(string3, 0.0f, 1.2531645f * 8.777778f, 1493172223 & -1509949441);
            GL11.glScaled((double)(1.0 / (double)n5), (double)(1.0 / (double)n5), (double)1.0);
            GL11.glTranslatef((float)(f13 - f2), (float)(-object2), (float)0.0f);
            object2 += (11794 & 20627) * n5;
        }
        if (this.Field_38335) {
            Object[] arrobject = new Object[-30567 & 581];
            arrobject[24580 & 6176] = Class_34481.Field_34485.Method_34503();
            String string4 = String.format("Menu: %s key", arrobject);
            float f15 = (float)this.\u0000strictfp.Field_27.Method_28715(string4) * (0.23809525f * 2.1f) * (float)n5;
            f = (float)((288 & 48) * n4) - f15;
            if ((this.Field_38246 & (50 & 12363)) == 0 && (float)((226 & 8485) * n4) < f15) {
                f = (float)((-32 & -22) * n4) + f15;
            }
            GL11.glTranslatef((float)(f - f15), (float)object2, (float)0.0f);
            GL11.glScalef((float)n5, (float)n5, (float)1.0f);
            Class_16867.Method_16975();
            d2.Method_28729(string4, 0.0f, 2.0f, -2113929217 & 16777215);
            GL11.glScaled((double)(1.0 / (double)n5), (double)(1.0 / (double)n5), (double)1.0);
            GL11.glTranslatef((float)(f15 - f), (float)(-object2), (float)0.0f);
        }
        GL11.glDepthMask((6977 & -16213) != 0);
        GL11.glEnable((int)(2929 & -13317));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void Method_38395() {
        if (this.\u0000strictfp != null) {
            Thread thread = Thread.currentThread();
            do {
                if (!this.Field_38303 || thread != this.Field_38251 || !this.Field_38357) {
                    block19 : {
                        try {
                            Thread.sleep(538978280L & -7156160826175351811L);
                        }
                        catch (InterruptedException interruptedException) {
                            return;
                        }
                        this.Field_38332.lock();
                        try {
                            this.Field_38226.await();
                            break block19;
                        }
                        catch (InterruptedException interruptedException) {
                        }
                        finally {
                            this.Field_38332.unlock();
                        }
                        return;
                    }
                    if (thread == this.Field_38251) continue;
                    return;
                }
                try {
                    if (this.Field_38202 == 0) {
                        Thread.sleep(Field_38308[Field_38308.length - this.Field_38364 - (-28031 & 2317)] * (-27998 & 330));
                    } else {
                        Thread.sleep(Field_38308[Field_38308.length - this.Field_38364 - (1105 & 24845)] * (110 & -27001));
                    }
                }
                catch (InterruptedException interruptedException) {
                    return;
                }
                this.Field_38332.lock();
                try {
                    this.Method_38392((16426 & 3856) != 0);
                    if (!this.Field_38253 && !this.Field_38295) continue;
                    this.Field_38226.await();
                    continue;
                }
                catch (InterruptedException interruptedException) {
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                    this.Field_38248 = "[Rei's Minimap] ERROR: " + exception.getMessage();
                    Class_38196.Method_38370("mainloop runtime exception", exception);
                    continue;
                }
                finally {
                    this.Field_38332.unlock();
                    continue;
                }
                break;
            } while (true);
            return;
        }
    }

    protected int Method_38396() {
        return this.Field_38305;
    }

    protected boolean Method_38397() {
        return this.Field_38366;
    }

    public Class_24246 Method_38398(Class_13769 class_13769) {
        switch (Class_6913.Field_6916[class_13769.ordinal()]) {
            case 1: {
                return Class_24246.Method_24314(this.Field_38303);
            }
            case 2: {
                return Class_24246.Method_24314(this.Field_38335);
            }
            case 3: {
                return this.Field_38333 ? Class_24246.Field_24282 : Class_24246.Field_24257;
            }
            case 4: {
                return this.Field_38343 ? Class_24246.Field_24277 : Class_24246.Field_24301;
            }
            case 5: {
                return class_13769.Method_13911(this.Field_38238);
            }
            case 6: {
                return class_13769.Method_13911(this.Field_38246);
            }
            case 7: {
                return class_13769.Method_13911(this.Field_38282);
            }
            case 8: {
                return this.Field_38319 == 3.3f * 0.07575758f ? Class_24246.Field_24291 : (this.Field_38319 == 1.4179105f * 0.35263157f ? Class_24246.Field_24288 : (this.Field_38319 == 0.98876405f * 0.75852275f ? Class_24246.Field_24290 : Class_24246.Field_24298));
            }
            case 9: {
                return class_13769.Method_13911(this.Field_38351);
            }
            case 10: {
                return this.Field_38237 == 0.22395833f * 1.1162791f ? Class_24246.Field_24291 : (this.Field_38237 == 0.41279072f * 1.2112676f ? Class_24246.Field_24288 : (this.Field_38237 == 0.60273975f * 1.2443181f ? Class_24246.Field_24290 : Class_24246.Field_24298));
            }
            case 11: {
                return Class_24246.Method_24314(this.Field_38270);
            }
            case 12: {
                return Class_24246.Method_24314(this.Field_38198);
            }
            case 13: {
                return Class_24246.Method_24314(this.Field_38360);
            }
            case 14: {
                return class_13769.Method_13911(this.Field_38280);
            }
            case 15: {
                return class_13769.Method_13911(this.Field_38342);
            }
            case 16: {
                return Class_24246.Method_24314(this.Field_38241);
            }
            case 17: {
                return class_13769.Method_13911(this.Field_38296);
            }
            case 18: {
                return class_13769.Method_13911(this.Field_38364);
            }
            case 19: {
                return Class_24246.Method_24314(this.Field_38357);
            }
            case 20: {
                return class_13769.Method_13911(this.Field_38262);
            }
            case 21: {
                return Class_24246.Method_24314(this.Field_38353);
            }
            case 22: {
                return class_13769.Method_13911(this.Field_38306);
            }
            case 23: {
                return class_13769.Method_13911(this.Field_38363);
            }
            case 24: {
                return class_13769.Method_13911(this.Field_38219);
            }
            case 25: {
                return class_13769.Method_13911(this.Field_38247);
            }
            case 26: {
                return Class_24246.Method_24314(this.Field_38290);
            }
            case 27: {
                return Class_24246.Method_24314(this.Field_38336);
            }
            case 28: {
                return Class_24246.Method_24314(this.Field_38229);
            }
            case 29: {
                return Class_24246.Method_24314(this.Field_38214);
            }
            case 30: {
                return Class_24246.Method_24314(this.Field_38358);
            }
            case 31: {
                return Class_24246.Method_24314(this.Field_38356);
            }
            case 32: {
                return Class_24246.Method_24314(this.Field_38362);
            }
            case 33: {
                return Class_24246.Method_24314(this.Field_38365);
            }
            case 34: {
                return class_13769.Method_13911(this.Field_38202);
            }
            case 35: {
                return Class_24246.Method_24314(this.Field_38221);
            }
            default: {
                return class_13769.Method_13911(-27584 & 24704);
            }
            case 41: {
                return Class_24246.Method_24314(this.Field_38212);
            }
            case 42: {
                return Class_24246.Method_24314(this.Field_38224);
            }
            case 43: {
                return Class_24246.Method_24314(this.Field_38348);
            }
            case 44: {
                return Class_24246.Method_24314(this.Field_38272);
            }
            case 45: {
                return Class_24246.Method_24314(this.Field_38314);
            }
            case 46: {
                return Class_24246.Method_24314(this.Field_38321);
            }
            case 47: {
                return Class_24246.Method_24314(this.Field_38261);
            }
            case 48: {
                return Class_24246.Method_24314(this.Field_38349);
            }
            case 49: {
                return Class_24246.Method_24314(this.Field_38257);
            }
            case 50: {
                return Class_24246.Method_24314(this.Field_38284);
            }
            case 51: {
                return Class_24246.Method_24314(this.Field_38316);
            }
            case 52: {
                return Class_24246.Method_24314(this.Field_38331);
            }
            case 54: {
                return Class_24246.Method_24314(this.Field_38326);
            }
            case 55: {
                return Class_24246.Method_24314(this.Field_38201);
            }
            case 56: {
                return class_13769.Method_13911(this.Field_38305);
            }
            case 57: {
                return Class_24246.Method_24314(this.Field_38366);
            }
            case 58: {
                return Class_24246.Method_24314(this.Field_38276);
            }
            case 59: {
                return this.Field_38206 == 0.15530303f * 1.6097561f ? Class_24246.Field_24291 : (this.Field_38206 == 0.8072289f * 0.619403f ? Class_24246.Field_24288 : (this.Field_38206 == 0.7311828f * 1.0257353f ? Class_24246.Field_24290 : Class_24246.Field_24298));
            }
            case 60: {
                return class_13769.Method_13911(this.Field_38355);
            }
            case 61: 
        }
        return this.Field_38352 == 0.4456522f * 1.1219512f ? Class_24246.Field_24288 : Class_24246.Field_24298;
    }

    private static String Method_38399(String string) {
        int n = 3876;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_38196.class, 10);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    protected boolean Method_38400() {
        return this.Field_38199;
    }

    private float Method_38401(long l, float f) {
        return this.Field_38293.Field_284.Method_18360(l, f);
    }

    protected Class_18 Method_38402() {
        return this.\u0000strictfp;
    }

    private float[] Method_38403(float f) {
        float[] arrf = new float[9040 & -28514];
        for (int i = -18152 & 160; i <= (9359 & 4111); ++i) {
            float f2 = 1.0f - (float)i / (1.0f * 15.0f);
            arrf[i] = (1.0f - f2) / (f2 * (0.78688526f * 3.8125f) + 1.0f) * (1.0f - f) + f;
        }
        return arrf;
    }

    private float Method_38404() {
        float f = this.Method_38401(this.Field_38293.Method_511(), 0.0f) * (-995.2941f * 0.3617021f);
        return f;
    }

    private static String Method_38405(String string) {
        int n = 1349;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_38196.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private float Method_38406(long l, float f) {
        float f2 = this.Method_38401(l, f);
        float f3 = Math.max(0.0f, Math.min(1.0f, 1.0f - (Class_13337.Method_13350(f2 * (1.7692307f * 1.7756829f) * 2.0f) * 2.0f + 0.30357143f * 0.65882355f)));
        f3 = 1.0f - f3;
        f3 *= 1.0f - this.Field_38293.Method_332(f) * (5.0f * 1.0f) * (0.13235295f * 0.4722222f);
        return (f3 *= 1.0f - this.Field_38293.Method_349(f) * (4.464286f * 1.12f) * (15.0f * 0.004166667f)) * (1.1369863f * 0.7036145f) + 1.88f * 0.10638298f;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected void Method_38407() {
        if (!Field_38324) {
            if (!this.Field_38303) {
                this.Method_38429("\u00a72[Rei's Minimap] Minimapka wylaczona! By wlaczyc kliknij " + Class_34481.Field_34485.Method_34503());
            }
            Field_38324 = 1 & 8269;
        }
        this.Field_38265 = null;
        this.Field_38239.clear();
        Pattern pattern = Pattern.compile(Pattern.quote(this.Field_38231) + "\\.DIM(-?[0-9])\\.points");
        int n = -31995 & 1106;
        int n2 = -28148 & 2209;
        String[] arrstring = Field_38346.list();
        int n3 = arrstring.length;
        for (int i = -16127 & 576; i < n3; ++i) {
            String string = arrstring[i];
            Matcher matcher = pattern.matcher(string);
            if (!matcher.matches()) continue;
            ++n2;
            int n4 = Integer.parseInt(matcher.group(5183 & 8705));
            ArrayList<Class_7651> arrayList = new ArrayList<Class_7651>();
            try (Scanner scanner = null;){
                scanner = new Scanner(new File(Field_38346, string), "UTF-8");
                while (scanner.hasNextLine()) {
                    Class_7651 class_7651 = Class_7651.Method_7665(scanner.nextLine());
                    if (class_7651 == null) continue;
                    arrayList.add(class_7651);
                    ++n;
                }
            }
            this.Field_38239.put(n4, arrayList);
            if (n4 != this.Field_38281) continue;
            this.Field_38265 = arrayList;
        }
        if (this.Field_38265 == null) {
            this.Field_38265 = new ArrayList();
        }
    }

    private void Method_38408(long l, float f) {
        float f2 = this.Method_38406(l, f);
        for (int i = 16900 & -28543; i < (273 & -29948); ++i) {
            float f3 = f2 * (0.24516128f * 3.875f) + 4.0f * 0.0125f;
            float f4 = this.Field_38293.Field_284.Method_18375()[i / (-32072 & 13328)] * f3;
            float f5 = this.Field_38293.Field_284.Method_18375()[i % (21596 & -22382)] * (0.56f * 2.767857f);
            if (this.Field_38293.Method_513() > 0) {
                f4 = this.Field_38293.Field_284.Method_18375()[i / (1040 & 18448)];
            }
            float f6 = f4 * (f2 * (0.7586207f * 0.85681814f) + 1.0476191f * 0.3340909f);
            float f7 = f4 * (f2 * (1.5757576f * 0.41249996f) + 0.35f * 1.0f);
            float f8 = f5 * ((f5 * (0.73333335f * 0.8181818f) + 0.82222223f * 0.4864865f) * (0.13636364f * 4.4f) + 2.5405405f * 0.15744682f);
            float f9 = f5 * (f5 * f5 * (1.3269231f * 0.45217392f) + 0.17727272f * 2.2564104f);
            float f10 = f6 + f5;
            float f11 = f7 + f8;
            float f12 = f4 + f9;
            f10 = Math.min(1.0f, f10 * (0.6666667f * 1.4399999f) + 12.75f * 0.002352941f);
            f11 = Math.min(1.0f, f11 * (0.34408602f * 2.79f) + 0.32954547f * 0.09103448f);
            f12 = Math.min(1.0f, f12 * (0.93650794f * 1.0250847f) + 1.8269231f * 0.016421052f);
            float f13 = this.\u0000strictfp.Field_84.Field_39869;
            float f14 = 1.0f - f10;
            float f15 = 1.0f - f11;
            float f16 = 1.0f - f12;
            f14 = 1.0f - f14 * f14 * f14 * f14;
            f15 = 1.0f - f15 * f15 * f15 * f15;
            f16 = 1.0f - f16 * f16 * f16 * f16;
            f10 = f10 * (1.0f - f13) + f14 * f13;
            f11 = f11 * (1.0f - f13) + f15 * f13;
            f12 = f12 * (1.0f - f13) + f16 * f13;
            this.Field_38327[i] = Math.max(0.0f, Math.min(1.0f, f10 * (2.2222223f * 0.43199998f) + 0.005342466f * 5.6153846f));
            this.Field_38339[i] = Math.max(0.0f, Math.min(1.0f, f11 * (1.6470588f * 0.58285713f) + 2.4615386f * 0.0121875f));
            this.Field_38278[i] = Math.max(0.0f, Math.min(1.0f, f12 * (0.24303797f * 3.95f) + 0.76404494f * 0.039264705f));
        }
    }

    private void Method_38409(Thread thread) {
        int n = Math.max(this.Field_38347, this.Field_38338);
        while (this.Field_38304.Method_14168() < n) {
            Point point = this.Field_38304.Method_14166();
            Class_8653 class_8653 = Class_8653.Method_8698(this.Field_38256 + point.x, this.Field_38350 + point.y);
            this.Method_38381(class_8653, thread);
        }
        this.Field_38295 = this.Field_38304.Method_14168() >= this.Field_38347 ? 24673 & 2061 : 27926 & -32160;
        this.Field_38253 = this.Field_38295 && this.Field_38304.Method_14168() >= this.Field_38338 ? -23807 & 1065 : -2560 & 2227;
    }

    private void Method_38410(Thread thread) {
        int n = Math.max(this.Field_38347, this.Field_38338);
        int n2 = Field_38308[this.Field_38364];
        for (int i = 8768 & -32640; i < n2 && this.Field_38304.Method_14168() < n; ++i) {
            Point point = this.Field_38304.Method_14166();
            Class_8653 class_8653 = Class_8653.Method_8698(this.Field_38256 + point.x, this.Field_38350 + point.y);
            this.Method_38381(class_8653, thread);
        }
        this.Field_38295 = this.Field_38304.Method_14168() >= this.Field_38347 ? 19137 & 273 : 8407 & 17408;
        this.Field_38253 = this.Field_38295 && this.Field_38304.Method_14168() >= this.Field_38338 ? 20481 & 4073 : -32512 & 98;
    }

    public List Method_38411() {
        return this.Field_38265;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void Method_38412() {
        int n;
        double d;
        double d2;
        double d3;
        float f;
        double d4;
        int n2;
        float f2;
        double d5;
        float f3;
        double d6;
        float f4;
        Object object;
        int n3;
        Object object2;
        int n4 = 2069 & 5731;
        if (this.Field_38282 == 0) {
            n4 = this.Field_38222.Method_31572();
        } else if (this.Field_38282 == (11011 & 113)) {
            while (this.Field_38211 >= (n4 + (14933 & -16255)) * (1856 & -32316) && this.Field_38344 >= (n4 + (-11675 & 1163)) * (3313 & -15888)) {
                ++n4;
            }
        } else {
            n4 = this.Field_38282 - (2049 & -23835);
        }
        int n5 = this.Field_38296 - (2599 & 17425);
        if (this.Field_38296 == 0) {
            n5 = this.Field_38222.Method_31572() + (-24459 & 3073) >> (-32375 & 19459);
        } else if (this.Field_38296 == (10817 & 1327)) {
            n5 = n4 + (589 & -28271) >> (20519 & 529);
        }
        int n6 = (this.Field_38246 & (2178 & -32194)) == 0 ? (-16347 & 4277) * n4 : this.Field_38211 - (-24539 & 2621) * n4;
        int n7 = n3 = (this.Field_38246 & (585 & 8325)) == 0 ? (10341 & -32211) * n4 : this.Field_38344 - (557 & -18955) * n4;
        if ((this.Field_38246 & (17 & 25675)) == (6165 & 9921)) {
            n3 -= ((this.Field_38335 | this.Field_38228 ? 10242 & 650 : 6416 & 16584) + (this.Field_38335 ? 169 & 6669 : -24511 & 4352) + (this.Field_38228 ? 18 & 16506 : 825 & 20612)) * n5;
        }
        int n8 = this.\u0000, for * this.Field_38222.Method_31572();
        int n9 = this.\u0000, 2 * this.Field_38222.Method_31572();
        int n10 = (2796 & -31680) * n4 / this.Field_38222.Method_31572();
        this.\u0000, `(n10, n10);
        n6 = (24659 & -32668) * n4 / (22818 & 1090) + n8;
        n3 = (74 & -9248) * n4 / (19490 & 12878) + n9;
        GL11.glTranslated((double)n6, (double)n3, (double)0.0);
        GL11.glScalef((float)n4, (float)n4, (float)1.0f);
        GL11.glDisable((int)(3042 & 20455));
        GL11.glColorMask((5923 & 2048) != 0, (4197 & 17538) != 0, (10268 & 17632) != 0, (18488 & 896) != 0);
        GL11.glEnable((int)(-1167 & 3957));
        if (this.Field_38333) {
            GL11.glAlphaFunc((int)(2567 & 587), (float)(0.024444446f * 4.090909f));
            GL11.glClearStencil((int)(-28158 & 10265));
            GL11.glClear((int)(-27583 & 17936));
            GL11.glEnable((int)(2968 & -29776));
            GL11.glStencilFunc((int)(16919 & -27897), (int)(-31927 & 8227), (int)(-1 & -1));
            GL11.glStencilOp((int)(-16896 & 24452), (int)(24159 & -16511), (int)(24083 & 15873));
            GL11.glDepthMask((1185 & -32696) != 0);
        } else {
            GL11.glAlphaFunc((int)(16933 & -19836), (float)0.0f);
            GL11.glDepthMask((18945 & 143) != 0);
        }
        GL11.glPushMatrix();
        GL11.glRotatef((float)(90.0f * 1.0f - this.Field_38329), (float)0.0f, (float)0.0f, (float)1.0f);
        Class_14701.Field_14712.Method_14728();
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        this.Method_38371(0.0, 0.0, 2.2857142857142856 * 0.441875, 19.06382978723404 * 3.357142857142857, 1.234375 * 51.848101265822784);
        if (this.Field_38333) {
            GL11.glStencilOp((int)(-25083 & 15928), (int)(24269 & 16176), (int)(7860 & 24065));
            GL11.glStencilFunc((int)(2562 & 1754), (int)(317 & 16067), (int)(-1 & -1));
        }
        GL11.glEnable((int)(3059 & -25618));
        GL11.glAlphaFunc((int)(16909 & 2916), (float)0.0f);
        GL11.glBlendFunc((int)(21390 & 12050), (int)(21279 & 2819));
        GL11.glColorMask((4103 & 25121) != 0, (1 & 1217) != 0, (7715 & 8321) != 0, (21199 & -22527) != 0);
        double d7 = 0.10064935064935066 * 2.4838709677419355 / this.Field_38264;
        double d8 = (this.Field_38259 - (double)this.Field_38275) * (0.004856418918918919 * 0.8043478260869565);
        double d9 = (this.Field_38299 - (double)this.Field_38207) * (2.8484848484848486 * 0.001371343085106383);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)this.Field_38319);
        this.Field_38283.Method_37598();
        this.Field_38277.Method_7648().Method_22417(15 & -32313, Class_29585.Field_29598);
        this.Field_38277.Method_7648().Method_22443(-22.736842105263158 * 1.4074074074074074, 60.121212121212125 * 0.532258064516129, 1.0).Method_22433(84.0 * 0.005952380952380952 + d7 + d8, 0.3620689655172414 * 1.380952380952381 + d7 + d9).Method_22451();
        this.Field_38277.Method_7648().Method_22443(2.5833333333333335 * 12.387096774193548, 152.6153846153846 * 0.20967741935483872, 1.0).Method_22433(93.0 * 0.005376344086021506 + d7 + d8, 1.849056603773585 * 0.27040816326530615 - d7 + d9).Method_22451();
        this.Field_38277.Method_7648().Method_22443(394.66666666666663 * 0.08108108108108109, 0.627906976744186 * -50.96296296296296, 1.0).Method_22433(3.1052631578947367 * 0.1610169491525424 - d7 + d8, 0.22727272727272727 * 2.2 - d7 + d9).Method_22451();
        this.Field_38277.Method_7648().Method_22443(-11.71830985915493 * 2.730769230769231, -120.3809523809524 * 0.26582278481012656, 1.0).Method_22433(0.6666666666666666 * 0.75 - d7 + d8, 0.5319148936170213 * 0.9400000000000001 + d7 + d9).Method_22451();
        this.Field_38277.Method_7647();
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glPopMatrix();
        if (this.Field_38215) {
            d4 = this.Field_38333 ? 20.4 * 1.6666666666666667 : 234.63636363636365 * 0.12359550561797752;
            (this.Field_38316 ? Class_14701.Field_14724 : Class_14701.Field_14721).Method_14728();
            for (int i = this.Field_38310.length - (-14759 & 4257); i >= 0; --i) {
                int n11 = this.Field_38240[i];
                object = this.Field_38310[i];
                Iterator iterator = object.iterator();
                while (iterator.hasNext()) {
                    object2 = (Class_859)iterator.next();
                    n2 = ((Class_859)object2).Method_1033() ? n11 : (n11 & (1107229948 & -1896022787)) >> (9158 & 6147) | -16753664 & -10935705;
                    d2 = object2.\u0000%() + (((Class_859)object2).\u0000= package - object2.\u0000%()) * (double)this.Field_38325;
                    d3 = object2.\u0000
                    () + (((Class_859)object2).\u0000= switch - object2.\u0000
                    ()) * (double)this.Field_38325;
                    double d10 = object2.\u0000= final() + (object2.\u0000, for() - object2.\u0000= final()) * (double)this.Field_38325;
                    if (this.Field_38331 && !(object2.\u0000, for() >= this.Field_38217 - 3.230769230769231 * 1.2380952380952381) && !this.Method_38383((int)this.Field_38259, (int)this.Field_38217, (int)this.Field_38299) && this.Method_38383((int)((Class_859)object2).\u0000= package, (int)object2.\u0000, for(), (int)((Class_859)object2).\u0000= switch)) continue;
                    double d11 = this.Field_38259 - d2;
                    double d12 = this.Field_38299 - d3;
                    float f5 = (float)Math.toDegrees(Math.atan2(d11, d12));
                    double d13 = Math.sqrt(d11 * d11 + d12 * d12) * this.Field_38264 * (1.2597402597402598 * 0.39690721649484534);
                    try {
                        GL11.glPushMatrix();
                        if (!(d13 < d4)) continue;
                        float f6 = (float)(n2 >> (9264 & -14056) & (7423 & -32001)) * (0.5f * 0.007843138f);
                        float f7 = (float)(n2 >> (4648 & -15992) & (255 & 8447)) * (3.3f * 0.0011883542f);
                        float f8 = (float)(n2 & (11007 & -32513)) * (1.1911764f * 0.0032921815f);
                        float f9 = (float)Math.max(0.7894736842105263 * 0.25333333333333335, 1.0 - Math.abs(this.Field_38217 - object2.\u0000, for()) * (0.012 * 3.3333333333333335));
                        float f10 = (float)Math.min(1.0, Math.max(0.5287356321839081 * 0.9456521739130435, 1.0 - (this.Field_38288.\u0000strictfp.Field_11000 - object2.\u0000strictfp.Field_11000) * (0.4545454545454546 * 0.22)));
                        GL11.glColor4f((float)(f6 *= f10), (float)(f7 *= f10), (float)(f8 *= f10), (float)f9);
                        GL11.glRotatef((float)(-f5 - this.Field_38329 + 642.8571f * 0.28f), (float)0.0f, (float)0.0f, (float)1.0f);
                        GL11.glTranslated((double)0.0, (double)(-d13), (double)0.0);
                        GL11.glRotatef((float)(-(-f5 - this.Field_38329 + 9.0f * 20.0f)), (float)0.0f, (float)0.0f, (float)1.0f);
                        if (this.Field_38316) {
                            float f11 = ((Class_859)object2).\u0000switch + (((Class_859)object2).\u0000= ? - ((Class_859)object2).\u0000switch) * this.Field_38325;
                            GL11.glRotatef((float)(f11 - this.Field_38329), (float)0.0f, (float)0.0f, (float)1.0f);
                        }
                        this.Method_38371(0.0, 0.0, 1.0, 0.7865168539325843 * 10.17142857142857, 0.14285714285714285 * 56.0);
                    }
                    finally {
                        GL11.glPopMatrix();
                    }
                }
            }
            if (this.Field_38284) {
                for (Class_1061 class_1061 : this.Field_38313) {
                    if (!(class_1061 instanceof Class_27363)) continue;
                    d6 = this.Field_38259 - class_1061.Field_1130;
                    d = this.Field_38299 - class_1061.Field_1106;
                    f2 = (float)Math.toDegrees(Math.atan2(d6, d));
                    d5 = Math.sqrt(d6 * d6 + d * d) * this.Field_38264 * (0.5285714285714286 * 0.9459459459459459);
                    try {
                        GL11.glPushMatrix();
                        if (!(d5 < d4)) continue;
                        f3 = (float)Math.max(8.083333333333334 * 0.024742268041237112, 1.0 - Math.abs(this.Field_38217 - class_1061.Method_1324()) * (1.3673469387755102 * 0.029253731343283584));
                        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)f3);
                        GL11.glRotatef((float)(-f2 - this.Field_38329 + 2.375f * 75.789474f), (float)0.0f, (float)0.0f, (float)1.0f);
                        GL11.glTranslated((double)0.0, (double)(-d5), (double)0.0);
                        GL11.glRotatef((float)(-(-f2 - this.Field_38329 + 567.6923f * 0.31707317f)), (float)0.0f, (float)0.0f, (float)1.0f);
                        Class_14701.Field_14726.Method_14728();
                        this.Method_38371(0.0, 0.0, 1.0, 172.0 * 0.046511627906976744, 0.20454545454545456 * 39.11111111111111);
                    }
                    finally {
                        GL11.glPopMatrix();
                    }
                }
            }
        }
        if (this.Field_38333) {
            GL11.glDisable((int)(-28718 & 11196));
        }
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glDisable((int)(7153 & 19313));
        GL11.glDepthMask((-28640 & 11345) != 0);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)this.Field_38319);
        Class_14701.Field_14719.Method_14728();
        this.Method_38371(0.0, 0.0, 1.0, 38.71604938271605 * 1.653061224489796, 0.35 * 182.85714285714286);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        if (this.Field_38249) {
            d4 = this.Method_38425();
            for (Class_7651 class_7651 : this.Field_38265) {
                if (!class_7651.Field_7658) continue;
                d6 = this.Field_38259 - (double)class_7651.Field_7655 * d4 - 0.24038461538461536 * 2.08;
                d = this.Field_38299 - (double)class_7651.Field_7657 * d4 - 4.6 * 0.10869565217391305;
                f2 = (float)Math.toDegrees(Math.atan2(d6, d));
                d5 = Math.sqrt(d6 * d6 + d * d) * this.Field_38264 * (0.46875 * 1.0666666666666667);
                try {
                    GL11.glPushMatrix();
                    if (d5 < 3.263157894736842 * 9.5) {
                        GL11.glColor4f((float)class_7651.Field_7662, (float)class_7651.Field_7654, (float)class_7651.Field_7659, (float)((float)Math.min(1.0, Math.max(0.09090909090909091 * 4.4, (d5 - 1.0) * (0.3770491803278689 * 1.326086956521739)))));
                        Class_7651.Field_7661[class_7651.Field_7652].Method_14728();
                        GL11.glRotatef((float)(-f2 - this.Field_38329 + 1.0273973f * 175.2f), (float)0.0f, (float)0.0f, (float)1.0f);
                        GL11.glTranslated((double)0.0, (double)(-d5), (double)0.0);
                        GL11.glRotatef((float)(-(-f2 - this.Field_38329 + 0.04347826f * 4140.0f)), (float)0.0f, (float)0.0f, (float)1.0f);
                        this.Method_38371(0.0, 0.0, 1.0, 0.8061224489795918 * 9.924050632911392 * (double)this.Field_38352, 3.3846153846153846 * 2.3636363636363638 * (double)this.Field_38352);
                        continue;
                    }
                    GL11.glColor3f((float)class_7651.Field_7662, (float)class_7651.Field_7654, (float)class_7651.Field_7659);
                    Class_7651.Field_7656[class_7651.Field_7652].Method_14728();
                    GL11.glRotatef((float)(-f2 - this.Field_38329 + 261.2903f * 0.6888889f), (float)0.0f, (float)0.0f, (float)1.0f);
                    GL11.glTranslated((double)0.0, (double)(1.9090909090909092 * -17.80952380952381), (double)0.0);
                    this.Method_38371(0.0, 0.0, 1.0, 0.1388888888888889 * 57.599999999999994, 4.631578947368421 * 1.7272727272727273);
                }
                finally {
                    GL11.glPopMatrix();
                }
            }
        }
        GL11.glColor3f((float)1.0f, (float)1.0f, (float)1.0f);
        d4 = Math.sin(Math.toRadians(this.Field_38329)) * (0.9130434782608695 * 30.666666666666668);
        double d14 = Math.cos(Math.toRadians(this.Field_38329)) * (1.0731707317073171 * 26.09090909090909);
        Class_14701.Field_14706.Method_14728();
        this.Method_38371(d14, -d4, 1.0, 1.3333333333333333 * 6.0, 2.857142857142857 * 2.8);
        Class_14701.Field_14714.Method_14728();
        this.Method_38371(-d4, -d14, 1.0, 0.06 * 133.33333333333334, 0.4166666666666667 * 19.2);
        Class_14701.Field_14707.Method_14728();
        this.Method_38371(-d14, d4, 1.0, 0.21875 * 36.57142857142857, 9.200000000000001 * 0.8695652173913043);
        Class_14701.Field_14727.Method_14728();
        this.Method_38371(d4, d14, 1.0, 148.8 * 0.053763440860215055, 0.425531914893617 * 18.8);
        GL11.glScaled((double)(1.0 / (double)n4), (double)(1.0 / (double)n4), (double)1.0);
        object = this.\u0000strictfp.Field_27;
        int n12 = (int)(this.Field_38225 * (0.072916664f * 3497.143f));
        if (n12 > 0) {
            Object[] arrobject = new Object[16517 & 8737];
            arrobject[-32656 & 16521] = this.Field_38264;
            object2 = String.format("%2.2fx", arrobject);
            n2 = ((Class_28636)object).Method_28715((String)object2);
            if (n12 > (255 & 24831)) {
                n12 = 4351 & -20737;
            }
            int n13 = (542 & 20639) * n4 - n2 * n5;
            n = (-7105 & 2206) * n4 - (-30696 & 333) * n5;
            GL11.glTranslatef((float)n13, (float)n, (float)0.0f);
            GL11.glScalef((float)n5, (float)n5, (float)1.0f);
            int n14 = n12 << (-32744 & 17592) | -1811939329 & 620756991;
            Class_16867.Method_16975();
            ((Class_28636)object).Method_28729((String)object2, 0.0f, 0.0f, n14);
            GL11.glScaled((double)(1.0 / (double)n5), (double)(1.0 / (double)n5), (double)1.0);
            GL11.glTranslatef((float)(-n13), (float)(-n), (float)0.0f);
        }
        if (this.Field_38249 && this.Field_38281 != this.Field_38312) {
            GL11.glPushMatrix();
            object2 = this.Method_38431(this.Field_38312);
            f = (float)((Class_28636)object).Method_28715((String)object2) * (0.40860215f * 1.2236842f) * (float)n5;
            float f12 = f2 = (float)((1077 & 26927) * n4) < f ? (float)((-29651 & 4151) * n4) - f : 0.0f;
            if ((this.Field_38246 & (1442 & 578)) == 0) {
                f2 = -f2;
            }
            Class_16867.Method_16975();
            GL11.glTranslated((double)(f2 - f), (double)((-22 & -29) * n4 - (-12196 & 814) * n5), (double)0.0);
            GL11.glScaled((double)n5, (double)n5, (double)1.0);
            ((Class_28636)object).Method_28729((String)object2, 0.0f, 0.0f, 285212671 & 1207959551);
            GL11.glPopMatrix();
        }
        if (this.Field_38241) {
            f = (this.Field_38329 + 1.4074074f * 127.89474f) % (400.44943f * 0.8989899f);
            if (f < 0.0f) {
                f += 1032.0f * 0.3488372f;
            }
            Object[] arrobject = new Object[24641 & 517];
            arrobject[-31232 & 4257] = (int)f;
            object2 = String.format("%03d'", arrobject);
            ((Class_28636)object).Method_28715((String)object2);
            n = (-22 & -30) * n4 + (1091 & 25) * n5;
            d3 = (-22 & -26) * n4 + (8209 & 265) * n5;
            Class_16867.Method_16975();
            GL11.glTranslatef((float)n, (float)((float)d3), (float)0.0f);
            GL11.glScalef((float)n5, (float)n5, (float)1.0f);
            ((Class_28636)object).Method_28729((String)object2, 0.0f, 0.0f, 285212671 & -2130706433);
            GL11.glScaled((double)(1.0 / (double)n5), (double)(1.0 / (double)n5), (double)1.0);
            GL11.glTranslatef((float)(-n), (float)((float)(-d3)), (float)0.0f);
        }
        if (this.Field_38280 < (2178 & 16470)) {
            long l;
            if (this.Field_38280 == (-31997 & 8389)) {
                l = this.Field_38293.Method_511();
                n = (int)((l + (-4644268076260876304L & 1308841846L)) % (2845705280036036045L & 1344560610L) / (1351574504L & 556827647L));
                d3 = (int)(l % (-353415624057017362L & 953419752L) * (174637630L & -7272278306184820612L) / (1118045160L & 3158895418394911736L));
                object2 = new SimpleDateFormat("HH:mm").format(new Date());
            } else {
                l = this.Field_38293.Method_511();
                n = (int)((l + (2103152L & 1196085762093815800L)) % (-7700145560155562544L & 7700145558278725089L) / (276899822L & 2876966287666842601L));
                d3 = (int)(l % (407110652L & 1628049385L) * (7372365738948084030L & -7372365739554766788L) / (-3093728227115661335L & 13706216L));
                Object[] arrobject = new Object[35 & 8978];
                arrobject[-32350 & 27136] = n;
                arrobject[-7663 & 421] = (int)d3;
                object2 = String.format("%02d:%02d", arrobject);
            }
            n2 = ((Class_28636)object).Method_28715((String)object2);
            d2 = (11422 & -15842) * n4 - n2 * n5 - (5265 & -31995) * n5;
            n = (-6 & -30) * n4 + (-16383 & 5665) * n5;
            Class_16867.Method_16975();
            GL11.glTranslatef((float)((float)d2), (float)n, (float)0.0f);
            GL11.glScalef((float)n5, (float)n5, (float)1.0f);
            ((Class_28636)object).Method_28729((String)object2, 0.0f, 0.0f, 16777215 & 1124073471);
            GL11.glScaled((double)(1.0 / (double)n5), (double)(1.0 / (double)n5), (double)1.0);
            GL11.glTranslatef((float)((float)(-d2)), (float)(-n), (float)0.0f);
        }
        n2 = (13858 & 224) * n4;
        if (this.Field_38228) {
            float f13;
            String string;
            String string2;
            if (this.Field_38342 == 0) {
                d3 = Class_13337.Method_13371(this.Field_38259);
                int n15 = Class_13337.Method_13371(this.Field_38288.\u0000strictfp.Field_11000);
                int n16 = Class_13337.Method_13371(this.Field_38299);
                Object[] arrobject = new Object[4194 & 130];
                arrobject[25128 & -31550] = (int)d3;
                arrobject[2565 & 297] = n16;
                string = String.format("%+d, %+d", arrobject);
                string2 = Integer.toString(n15);
            } else if (this.Field_38342 == (-28029 & 19721)) {
                Object[] arrobject = new Object[29702 & 2187];
                arrobject[-11264 & 11075] = this.Field_38259;
                arrobject[33 & 22161] = this.Field_38299;
                string = String.format("%+1.2f, %+1.2f", arrobject);
                Object[] arrobject2 = new Object[24649 & -31983];
                arrobject2[11316 & 11] = this.Field_38288.\u0000strictfp.Field_11000;
                string2 = String.format("%1.2f", arrobject2);
            } else if (this.Field_38342 == (16442 & 8962)) {
                Object[] arrobject = new Object[390 & -3070];
                arrobject[4368 & 16451] = this.Field_38259;
                arrobject[18945 & -32749] = this.Field_38299;
                string = String.format("%+1.2f, %+1.2f", arrobject);
                Object[] arrobject3 = new Object[-26558 & 63];
                arrobject3[8193 & -32690] = this.Field_38217;
                arrobject3[4097 & 19137] = (int)this.Field_38288.\u0000strictfp.Field_11000;
                string2 = String.format("%1.2f (%d)", arrobject3);
            } else {
                Object[] arrobject = new Object[1030 & 660];
                arrobject[2690 & 32] = this.Field_38299 >= 0.0 ? "S" : "N";
                arrobject[29385 & 33] = this.Field_38299 >= 0.0 ? this.Field_38299 : -this.Field_38299;
                arrobject[34 & -27638] = this.Field_38259 >= 0.0 ? "E" : "W";
                arrobject[3175 & 8451] = this.Field_38259 >= 0.0 ? this.Field_38259 : -this.Field_38259;
                string = String.format("%s%1.2f, %s%1.2f", arrobject);
                Object[] arrobject4 = new Object[20653 & 513];
                arrobject4[81 & -21374] = this.Field_38288.\u0000strictfp.Field_11000;
                string2 = String.format("%1.2fm", arrobject4);
            }
            f4 = (float)((Class_28636)object).Method_28715(string) * (0.32f * 1.5625f) * (float)n5;
            f3 = (float)((Class_28636)object).Method_28715(string2) * (0.9693878f * 0.51578945f) * (float)n5;
            float f14 = f13 = (float)((4589 & 11831) * n4) < f4 ? (float)((421 & 1655) * n4) - f4 : 0.0f;
            if ((this.Field_38246 & (4482 & 2562)) == 0) {
                f13 = -f13;
            }
            GL11.glTranslatef((float)(f13 - f4), (float)n2, (float)0.0f);
            GL11.glScalef((float)n5, (float)n5, (float)1.0f);
            Class_16867.Method_16975();
            ((Class_28636)object).Method_28729(string, 0.0f, 2.0f, 167772159 & 16777215);
            GL11.glScaled((double)(1.0 / (double)n5), (double)(1.0 / (double)n5), (double)1.0);
            GL11.glTranslatef((float)(f4 - f3), (float)0.0f, (float)0.0f);
            GL11.glScalef((float)n5, (float)n5, (float)1.0f);
            ((Class_28636)object).Method_28729(string2, 0.0f, 0.6363636f * 17.285715f, 838860799 & -2097152001);
            GL11.glScaled((double)(1.0 / (double)n5), (double)(1.0 / (double)n5), (double)1.0);
            GL11.glTranslatef((float)(f3 - f13), (float)(-n2), (float)0.0f);
            n2 += (28851 & 18) * n5;
        }
        if (this.Field_38335) {
            Object[] arrobject = new Object[1025 & 6409];
            arrobject[8275 & 16416] = Class_34481.Field_34485.Method_34503();
            String string = String.format("Menu: %s key", arrobject);
            float f15 = (float)this.\u0000strictfp.Field_27.Method_28715(string) * (0.84375f * 0.5925926f) * (float)n5;
            f4 = (float)((16548 & 10347) * n4) - f15;
            if ((this.Field_38246 & (16527 & -29150)) == 0 && (float)((8364 & -29661) * n4) < f15) {
                f4 = (float)((-16 & -28) * n4) + f15;
            }
            GL11.glTranslatef((float)(f4 - f15), (float)n2, (float)0.0f);
            GL11.glScalef((float)n5, (float)n5, (float)1.0f);
            Class_16867.Method_16975();
            ((Class_28636)object).Method_28729(string, 0.0f, 2.0f, 553648127 & -2097152001);
            GL11.glScaled((double)(1.0 / (double)n5), (double)(1.0 / (double)n5), (double)1.0);
            GL11.glTranslatef((float)(f15 - f4), (float)(-n2), (float)0.0f);
        }
        GL11.glDepthMask((-22267 & 17921) != 0);
        GL11.glEnable((int)(2937 & -28683));
    }

    private double Method_38413(int n) {
        Double d = (Double)this.Field_38266.get(n);
        return d == null ? 1.0 : d;
    }

    public static String Method_38414(String string) {
        return string == null ? null : string.replace((char)(-31192 & 8305), (char)(-32545 & 25471)).toUpperCase(Locale.ENGLISH);
    }

    /*
     * Exception decompiling
     */
    public void Method_38415(int var1_1, int var2_2, float var3_3) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [37[DOLOOP]], but top level block is 39[UNCONDITIONALDOLOOP]
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:427)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:479)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:607)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:696)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:184)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:129)
        // org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.Method.analyse(Method.java:397)
        // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:906)
        // org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:797)
        // org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:225)
        // org.benf.cfr.reader.Driver.doJar(Driver.java:109)
        // org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:65)
        // org.benf.cfr.reader.Main.main(Main.java:48)
        throw new IllegalStateException("Decompilation failed");
    }

    protected float Method_38416() {
        return this.Field_38206;
    }

    protected void Method_38417() {
        Map.Entry entry = this.Field_38239.lowerEntry(this.Field_38312);
        if (entry == null) {
            entry = this.Field_38239.lowerEntry(Integer.MAX_VALUE & -1);
        }
        if (entry != null) {
            this.Field_38312 = entry.getKey();
            this.Field_38265 = (ArrayList)entry.getValue();
        }
    }

    private static String Method_38418(String string) {
        int n = 6198;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_38196.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    protected boolean Method_38419() {
        return (this.Field_38326 & (this.Field_38201 | (this.Field_38305 < (17446 & 475) ? -28383 & 18113 : 18 & 456) | this.Field_38276)) != 0;
    }

    private static final void Method_38420(PrintWriter printWriter) {
        Object[] arrobject = new Object[5781 & 16641];
        arrobject[-20701 & 24] = System.currentTimeMillis();
        printWriter.printf("--- %1$tF %1$tT %1$tZ ---%n", arrobject);
        Object[] arrobject2 = new Object[-32190 & 22547];
        arrobject2[3128 & 20738] = "v4.0";
        arrobject2[2049 & -32321] = "1.8.8";
        printWriter.printf("Rei's Minimap %s [%s]%n", arrobject2);
        Object[] arrobject3 = new Object[7303 & -15821];
        arrobject3[9249 & -25716] = System.getProperty("os.name");
        arrobject3[17925 & 4449] = System.getProperty("os.arch");
        arrobject3[9746 & 4163] = System.getProperty("os.version");
        printWriter.printf("OS: %s (%s) version %s%n", arrobject3);
        Object[] arrobject4 = new Object[8706 & 22550];
        arrobject4[-28957 & 20736] = System.getProperty("java.version");
        arrobject4[3329 & 587] = System.getProperty("java.vendor");
        printWriter.printf("Java: %s, %s%n", arrobject4);
        Object[] arrobject5 = new Object[10243 & 1515];
        arrobject5[8210 & 256] = System.getProperty("java.vm.name");
        arrobject5[7681 & -32475] = System.getProperty("java.vm.info");
        arrobject5[130 & 22595] = System.getProperty("java.vm.vendor");
        printWriter.printf("VM: %s (%s), %s%n", arrobject5);
        Object[] arrobject6 = new Object[3 & 13381];
        arrobject6[70 & -13920] = Sys.getVersion();
        printWriter.printf("LWJGL: %s%n", arrobject6);
        Object[] arrobject7 = new Object[2499 & 519];
        arrobject7[8256 & -16242] = GL11.glGetString((int)(16193 & 7939));
        arrobject7[12305 & 2755] = GL11.glGetString((int)(-24830 & 32518));
        arrobject7[-32565 & 11538] = GL11.glGetString((int)(32512 & 7968));
        printWriter.printf("OpenGL: %s version %s, %s%n", arrobject7);
    }

    public void Method_38421(Class_13769 class_13769, String string) {
        switch (Class_6913.Field_6916[class_13769.ordinal()]) {
            case 62: {
                this.Field_38243 = Math.max(0.0f, Math.min(1.2444445f * 0.64285713f, Float.parseFloat(string)));
                break;
            }
            case 63: {
                this.Field_38236 = this.Field_38355 == (11287 & -11994) ? Math.max(-31102 & 4128, Math.min(2109 & 8197, Integer.parseInt(string))) : this.Field_38355;
                break;
            }
            case 64: {
                this.Field_38208 = Math.max(0.0, Double.parseDouble(string));
                break;
            }
            case 65: {
                this.Field_38334 = Math.max(0.0, Double.parseDouble(string));
            }
        }
    }

    protected boolean Method_38422() {
        return this.Field_38276;
    }

    private static final byte Method_38423(float f) {
        return (byte)Math.max(68 & 18600, Math.min(2303 & 16639, (int)(f * (41.576088f * 6.133333f))));
    }

    private static String Method_38424(String string) {
        int n = 9162;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_38196.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    protected double Method_38425() {
        return this.Method_38413(this.Field_38312) / this.Method_38413(this.Field_38281);
    }

    protected double Method_38426() {
        return this.Field_38334 < 233.33333333333334 * 0.42857142857142855 ? 2.75 * 6.537065944953875E307 : this.Field_38334;
    }

    public void Method_38427() {
        File file = new File(Field_38267, "config" + File.separatorChar + "ReiMinimap.cfg");
        try {
            PrintWriter printWriter = new PrintWriter(file, "UTF-8");
            Class_13769[] arrclass_13769 = Class_13769.Method_13900();
            int n = arrclass_13769.length;
            for (int i = 29376 & 2062; i < n; ++i) {
                Class_13769 class_13769 = arrclass_13769[i];
                if (this.Method_38398(class_13769) == Class_24246.Field_24299 || this.Method_38398(class_13769) == Class_24246.Field_24294 || this.Method_38398(class_13769) == Class_24246.Field_24249) continue;
                if (class_13769 != Class_13769.Field_13822 && class_13769 != Class_13769.Field_13799 && class_13769 != Class_13769.Field_13784 && class_13769 != Class_13769.Field_13782) {
                    Object[] arrobject = new Object[22 & -28606];
                    arrobject[-28140 & 8193] = Class_38196.Method_38388(class_13769.toString());
                    arrobject[17977 & -24443] = Class_38196.Method_38388(this.Method_38398(class_13769).toString());
                    printWriter.printf("%s: %s%n", arrobject);
                    continue;
                }
                Object[] arrobject = new Object[2563 & 16498];
                arrobject[643 & -32752] = Class_38196.Method_38388(class_13769.toString());
                arrobject[-31999 & 1175] = this.Method_38386(class_13769);
                printWriter.printf("%s: %s%n", arrobject);
            }
            printWriter.flush();
            printWriter.close();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static final void Method_38428(String string) {
        File file = new File(Field_38346, "error.txt");
        try (PrintWriter printWriter = null;){
            FileOutputStream fileOutputStream = new FileOutputStream(file, (8833 & 16449) != 0);
            printWriter = new PrintWriter(new OutputStreamWriter((OutputStream)fileOutputStream, "UTF-8"));
            Class_38196.Method_38420(printWriter);
            printWriter.println(string);
            printWriter.println();
            printWriter.flush();
        }
    }

    protected void Method_38429(String string) {
        this.Field_38227.Method_45458().Method_41188(new Class_2840(string));
    }

    private static String Method_38430(String string) {
        int n = 20041;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_38196.class, 6);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private Class_38196() {
        super("ReiMinimap", 19025 & -20412, 8288 & 4179);
        this.Field_38341.put(3584 & 12357, "Overworld");
        this.Field_38266.put(-30687 & 12928, 1.0);
        this.Field_38341.put(-1 & -1, "Nether");
        this.Field_38266.put(-1 & -1, 0.5142857142857142 * 15.555555555555557);
        this.Field_38341.put(549 & 24577, "The Ender");
        this.Field_38266.put(21507 & 85, 1.0);
        this.Field_38359 = 134230149L & -7400935209355836344L;
        this.Field_38221 = -31728 & 4868;
        this.Field_38348 = -27341 & 137;
        this.Field_38272 = -5977 & 1281;
        this.Field_38314 = 97 & 12309;
        this.Field_38261 = 65 & 1043;
        this.Field_38321 = 17225 & 12453;
        this.Field_38257 = 805 & 14537;
        this.Field_38349 = 1 & 1061;
        this.Field_38284 = -24293 & 2213;
        this.Field_38316 = 22601 & -31599;
        this.Field_38331 = -30639 & 5128;
        this.Field_38310 = new ArrayList[-14025 & 12495];
        int[] arrn = new int[2639 & 5127];
        arrn[-31936 & 6153] = -12463617 & -13182465;
        arrn[9 & 1575] = -64984 & -56304;
        arrn[16518 & 10563] = -1 & -1;
        arrn[4275 & 2311] = -12564008 & -16333664;
        arrn[5 & 9340] = -1004952 & -10373919;
        arrn[-12131 & 8453] = -4144960 & -12467070;
        arrn[1175 & -30714] = -249 & -128;
        this.Field_38240 = arrn;
        this.Field_38313 = new ArrayList(-32510 & 9509);
        this.Field_38203 = 2267552390612028002L & -2267552392166232064L;
        this.Field_38210 = 16905 & 8640;
        this.Field_38327 = new float[5927 & -30456];
        this.Field_38339 = new float[-32476 & 5394];
        this.Field_38278 = new float[256 & 20976];
        if (!Field_38346.exists()) {
            Field_38346.mkdirs();
        }
        if (!Field_38346.isDirectory()) {
            this.Field_38248 = "[Rei's Minimap] ERROR: Failed to create the rei_minimap folder.";
            Class_38196.Method_38428(this.Field_38248);
        }
        this.Method_38440();
        this.Field_38245 = Thread.currentThread();
        for (int i = -31999 & 42; i < this.Field_38310.length; ++i) {
            this.Field_38310[i] = new ArrayList();
        }
    }

    protected String Method_38431(int n) {
        String string = (String)this.Field_38341.get(n);
        return string == null ? "DIM:" + n : string;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void Method_38432() {
        Object object;
        Object object2;
        int n;
        int n2;
        int n3;
        double d;
        Object object3;
        Object object42;
        int n4;
        double d2;
        double d3;
        double d4;
        double d5;
        double d6;
        int n5;
        Object object5;
        double d7;
        double d8;
        float f;
        float f2;
        float f3;
        if (this.Field_38351 == 0) {
            n2 = this.Field_38222.Method_31572();
        } else {
            int n6 = n4 = this.Field_38351 == (16553 & 2629) ? 5101 & 9192 : this.Field_38351 - (-25759 & 3);
            for (n2 = 2385 & 1549; n2 < n4 && this.Field_38211 >= (n2 + (3073 & 12929)) * (8442 & -11535) && this.Field_38344 >= (n2 + (2627 & 13441)) * (20984 & -23823); ++n2) {
            }
        }
        n4 = this.Field_38296 - (24739 & 1109);
        if (this.Field_38296 == 0) {
            n4 = this.Field_38222.Method_31572() + (-32495 & 8201) >> (33 & -6053);
        } else if (this.Field_38296 == (425 & 14341)) {
            n4 = n2 + (-32221 & 29057) >> (8241 & 16641);
        }
        GL11.glTranslated((double)((double)this.Field_38211 * (1.3095238095238095 * 0.38181818181818183)), (double)((double)this.Field_38344 * (1.4137931034482758 * 0.3536585365853659)), (double)0.0);
        GL11.glScalef((float)n2, (float)n2, (float)0.0f);
        double d9 = 0.49295774647887325 * 0.47544642857142855 / this.Field_38264;
        double d10 = (this.Field_38259 - (double)this.Field_38275) * (0.007031249999999999 * 0.5555555555555556);
        double d11 = (this.Field_38299 - (double)this.Field_38207) * (2.727272727272727 * 0.0014322916666666668);
        GL11.glEnable((int)(-25621 & 3046));
        GL11.glBlendFunc((int)(-13534 & 770), (int)(18383 & -23789));
        GL11.glDepthMask((3144 & 8245) != 0);
        GL11.glDisable((int)(-17551 & 20345));
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        this.Field_38283.Method_37598();
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)this.Field_38237);
        this.Field_38277.Method_7648().Method_22434();
        this.Field_38277.Method_7648().Method_22417(23 & -11929, Class_29585.Field_29598);
        this.Field_38277.Method_7648().Method_22443(168.0 * 0.7142857142857143, 101.81818181818181 * 1.1785714285714286, 1.0).Method_22433(4.2727272727272725 * 0.11702127659574468 + d9 + d10, 1.6808510638297873 * 0.2974683544303797 + d9 + d11).Method_22451();
        this.Field_38277.Method_7648().Method_22443(1.8205128205128205 * 65.91549295774648, 2.6 * -46.15384615384615, 1.0).Method_22433(5.111111111111111 * 0.09782608695652174 + d9 + d10, 0.2230769230769231 * 2.2413793103448274 - d9 + d11).Method_22451();
        this.Field_38277.Method_7648().Method_22443(-206.89655172413794 * 0.58, -69.0 * 1.7391304347826086, 1.0).Method_22433(0.3333333333333333 * 1.5 - d9 + d10, 9.0 * 0.05555555555555555 - d9 + d11).Method_22451();
        this.Field_38277.Method_7648().Method_22443(-47.61904761904762 * 2.52, 130.7865168539326 * 0.9175257731958762, 1.0).Method_22433(0.19444444444444442 * 2.5714285714285716 - d9 + d10, 0.08045977011494253 * 6.214285714285714 + d9 + d11).Method_22451();
        this.Field_38277.Method_7647();
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        if (this.Field_38215) {
            (this.Field_38316 ? Class_14701.Field_14724 : Class_14701.Field_14721).Method_14728();
            for (n5 = this.Field_38310.length - (7505 & -24567); n5 >= 0; --n5) {
                n3 = this.Field_38240[n5];
                object42 = this.Field_38310[n5];
                object2 = object42.iterator();
                while (object2.hasNext()) {
                    object = (Class_859)object2.next();
                    n = object.Method_1033() ? n3 : (n3 & (-889324290 & 83688701)) >> (-22366 & 7) | -6142720 & -15714166;
                    d3 = object.\u0000%() + (object.\u0000= package - object.\u0000%()) * (double)this.Field_38325;
                    object3 = object.\u0000
                    () + (object.\u0000= switch - object.\u0000
                    ()) * (double)this.Field_38325;
                    d = object.\u0000= final() + (object.\u0000, for() - object.\u0000= final()) * (double)this.Field_38325;
                    if (this.Field_38331 && !(object.\u0000, for() >= this.Field_38217 - 16.0 * 0.25) && !this.Method_38383((int)this.Field_38259, (int)this.Field_38217, (int)this.Field_38299) && this.Method_38383((int)object.\u0000= package, (int)object.\u0000, for(), (int)object.\u0000= switch)) continue;
                    double d12 = this.Field_38259 - d3;
                    double d13 = this.Field_38299 - object3;
                    d12 = d12 * this.Field_38264 * (3.3793103448275863 * 0.5918367346938775);
                    d13 = d13 * this.Field_38264 * (2.0210526315789474 * 0.9895833333333334);
                    double d14 = Math.max(Math.abs(d12), Math.abs(d13));
                    try {
                        GL11.glPushMatrix();
                        if (!(d14 < 1.2692307692307692 * 89.81818181818183)) continue;
                        float f4 = (float)(n >> (1400 & 2581) & (4351 & 25087)) * (0.004561825f * 0.8596491f);
                        float f5 = (float)(n >> (41 & -30690) & (767 & 24831)) * (0.9230769f * 0.004248366f);
                        float f6 = (float)(n & (-24321 & 21759)) * (0.0034858389f * 1.125f);
                        float f7 = (float)Math.max(0.4 * 0.5, 1.0 - Math.abs(this.Field_38217 - object.\u0000, for()) * (2.625 * 0.015238095238095238));
                        float f8 = (float)Math.min(1.0, Math.max(1.236842105263158 * 0.40425531914893614, 1.0 - (this.Field_38288.\u0000strictfp.Field_11000 - object.\u0000strictfp.Field_11000) * (0.34782608695652173 * 0.28750000000000003)));
                        GL11.glColor4f((float)(f4 *= f8), (float)(f5 *= f8), (float)(f6 *= f8), (float)f7);
                        float f9 = object.\u0000switch + (object.\u0000= ? - object.\u0000switch) * this.Field_38325;
                        double d15 = -d13;
                        double d16 = -d12;
                        if (!(object instanceof Class_34590)) {
                            f9 += 88.52459f * 2.0333333f;
                        }
                        if (this.Field_38316) {
                            GL11.glTranslated((double)d16, (double)d15, (double)0.0);
                            GL11.glRotatef((float)f9, (float)0.0f, (float)0.0f, (float)1.0f);
                            GL11.glTranslated((double)(-d16), (double)(-d15), (double)0.0);
                        }
                        this.Method_38371(d16, d15, 1.0, 1.5058823529411764 * 5.3125, 3.2280701754385968 * 2.4782608695652173);
                    }
                    finally {
                        GL11.glPopMatrix();
                    }
                }
            }
            if (this.Field_38284) {
                for (Object object42 : this.Field_38313) {
                    if (!(object42 instanceof Class_27363)) continue;
                    d2 = this.Field_38259 - ((Class_1061)object42).Field_1130;
                    d5 = this.Field_38299 - ((Class_1061)object42).Field_1106;
                    d2 = d2 * this.Field_38264 * (1.8775510204081631 * 1.065217391304348);
                    d5 = d5 * this.Field_38264 * (42.0 * 0.047619047619047616);
                    d3 = Math.max(Math.abs(d2), Math.abs(d5));
                    try {
                        GL11.glPushMatrix();
                        if (!(d3 < 41.65384615384615 * 2.736842105263158)) continue;
                        f2 = (float)Math.max(0.13012048192771086 * 1.537037037037037, 1.0 - Math.abs(this.Field_38217 - ((Class_1061)object42).Method_1324()) * (0.053125 * 0.7529411764705882));
                        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)f2);
                        d7 = -d5;
                        d6 = -d2;
                        float f10 = ((Class_1061)object42).Field_1079 + 891.0f * 0.2020202f;
                        Class_14701.Field_14726.Method_14728();
                        this.Method_38371(d6, d7, 1.0, 248.0 * 0.03225806451612903, 0.09333333333333334 * 85.71428571428571);
                    }
                    finally {
                        GL11.glPopMatrix();
                    }
                }
            }
        }
        if (this.Field_38249) {
            for (Object object42 : this.Field_38265) {
                d2 = this.Method_38425();
                if (!((Class_7651)object42).Field_7658) continue;
                d5 = this.Field_38259 - (double)((Class_7651)object42).Field_7655 * d2 - 2.9375 * 0.1702127659574468;
                d3 = this.Field_38299 - (double)((Class_7651)object42).Field_7657 * d2 - 0.19642857142857142 * 2.5454545454545454;
                d5 = d5 * this.Field_38264 * (1.1764705882352942 * 1.7);
                d3 = d3 * this.Field_38264 * (31.0 * 0.06451612903225806);
                f2 = (float)Math.toDegrees(Math.atan2(d5, d3));
                d7 = Math.max(Math.abs(d5), Math.abs(d3));
                try {
                    double d17;
                    GL11.glPushMatrix();
                    if (d7 < 238.13333333333333 * 0.4787234042553192) {
                        GL11.glScalef((float)(1.0f / (float)n2 * (float)n4), (float)(1.0f / (float)n2 * (float)n4), (float)1.0f);
                        GL11.glColor4f((float)((Class_7651)object42).Field_7662, (float)((Class_7651)object42).Field_7654, (float)((Class_7651)object42).Field_7659, (float)((float)Math.min(1.0, Math.max(0.1181818181818182 * 3.3846153846153846, (d7 - 1.0) * (2.0 * 0.25)))));
                        Class_7651.Field_7661[((Class_7651)object42).Field_7652].Method_14728();
                        d6 = -d3 * (double)n2 / (double)n4;
                        d17 = -d5 * (double)n2 / (double)n4;
                        this.Method_38371(d17, d6, 1.0, 2.3333333333333335 * 3.4285714285714284 * (double)n2 / (double)n4, 2.4375 * 3.282051282051282 * (double)n2 / (double)n4);
                        if (this.Field_38270 && ((Class_7651)object42).Field_7653 != null && !((Class_7651)object42).Field_7653.isEmpty()) {
                            GL11.glDisable((int)(-29197 & 32225));
                            GL11.glColor4f((float)0.0f, (float)0.0f, (float)0.0f, (float)(3.2307692f * 0.15476191f));
                            object3 = this.\u0000strictfp.Field_27.Method_28715(((Class_7651)object42).Field_7653);
                            object5 = (int)d17;
                            d = (int)d6;
                            f3 = (float)(object5 - (object3 >> (15 & -16367)));
                            f = f3 + object3;
                            d4 = d - (89 & 2485);
                            d8 = d - (2063 & -32489);
                            this.Field_38277.Method_7648().Method_22417(4615 & -22137, Class_29585.Field_29602);
                            this.Field_38277.Method_7648().Method_22443(f3 - (16529 & -23291), d8, 1.0).Method_22451();
                            this.Field_38277.Method_7648().Method_22443(f + (6369 & 1291), d8, 1.0).Method_22451();
                            this.Field_38277.Method_7648().Method_22443(f + (1027 & 8457), d4, 1.0).Method_22451();
                            this.Field_38277.Method_7648().Method_22443(f3 - (-15199 & 8461), d4, 1.0).Method_22451();
                            this.Field_38277.Method_7647();
                            GL11.glEnable((int)(-4621 & 3561));
                            Class_16867.Method_16975();
                            this.\u0000strictfp.Field_27.Method_28729(((Class_7651)object42).Field_7653, f3, (float)(d4 + (-31791 & 8197)), ((Class_7651)object42).Field_7652 == 0 ? -1 & -1 : -61432 & -63456);
                        }
                        GL11.glScaled((double)((double)n2 / (double)n4), (double)((double)n2 / (double)n4), (double)1.0);
                        continue;
                    }
                    d6 = 106.63291139240505 * 1.0972222222222223 / d7;
                    d17 = Math.sqrt((d5 *= d6) * d5 + (d3 *= d6) * d3);
                    GL11.glColor3f((float)((Class_7651)object42).Field_7662, (float)((Class_7651)object42).Field_7654, (float)((Class_7651)object42).Field_7659);
                    Class_7651.Field_7656[((Class_7651)object42).Field_7652].Method_14728();
                    GL11.glRotatef((float)(0.0f - f2), (float)0.0f, (float)0.0f, (float)1.0f);
                    GL11.glTranslated((double)0.0, (double)(-d17), (double)0.0);
                    this.Method_38371(0.0, 0.0, 1.0, 0.15942028985507245 * 50.18181818181819, 0.8428571428571429 * 9.491525423728813);
                }
                finally {
                    GL11.glPopMatrix();
                }
            }
        }
        try {
            GL11.glColor3f((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glPushMatrix();
            Class_14701.Field_14702.Method_14728();
            GL11.glRotatef((float)(this.Field_38329 - 0.1875f * 960.0f), (float)0.0f, (float)0.0f, (float)1.0f);
            this.Method_38371(0.0, 0.0, 1.0, 3.1666666666666665 * 2.5263157894736845, 1.375 * 5.818181818181818);
        }
        catch (Exception exception) {
        }
        finally {
            GL11.glPopMatrix();
        }
        if (this.Field_38202 == (-32623 & 16651)) {
            GL11.glScaled((double)(1.0 / (double)n2), (double)(1.0 / (double)n2), (double)1.0);
            GL11.glTranslated((double)((double)this.Field_38211 * (0.8157894736842105 * -0.6129032258064516)), (double)((double)this.Field_38344 * (-0.2760416666666667 * 1.8113207547169812)), (double)0.0);
            GL11.glScaled((double)n4, (double)n4, (double)1.0);
            n5 = 24129 & -32462;
            n3 = 21413 & 3094;
            Class_18740[] arrclass_18740 = Field_38263;
            int n7 = arrclass_18740.length;
            for (n = 736 & -28668; n < n7; ++n) {
                object5 = arrclass_18740[n];
                n5 = Math.max(n5, this.\u0000strictfp.Field_27.Method_28715(((Class_18740)object5).Field_18790));
                n3 += 10;
            }
            n = (this.Field_38246 & (3078 & -31957)) == 0 ? 17090 & -21206 : this.Field_38211 / n4 - (8202 & 5126) - (n5 += 16);
            int n8 = (this.Field_38246 & (-28127 & 9357)) == 0 ? 2 & 16711 : this.Field_38344 / n4 - (-29369 & 21138) - n3;
            GL11.glDisable((int)(3575 & -24599));
            GL11.glColor4f((float)0.0f, (float)0.0f, (float)0.0f, (float)(0.33333334f * 1.8000001f));
            this.Field_38277.Method_7648().Method_22417(-23673 & 20559, Class_29585.Field_29602);
            this.Field_38277.Method_7648().Method_22443(n, n8 + n3, 1.0).Method_22451();
            this.Field_38277.Method_7648().Method_22443(n + n5, n8 + n3, 1.0).Method_22451();
            this.Field_38277.Method_7648().Method_22443(n + n5, n8, 1.0).Method_22451();
            this.Field_38277.Method_7648().Method_22443(n, n8, 1.0).Method_22451();
            this.Field_38277.Method_7647();
            n7 = this.Field_38198 ? Class_18740.Field_18764.length : Field_38263.length;
            for (int i = 9256 & -14206; i < n7; ++i) {
                object5 = this.Field_38198 ? Class_18740.Field_18760[Class_18740.Field_18764[i]] : Field_38263[i];
                d = Class_18740.Method_18822(((Class_18740)object5).Field_18775);
                f3 = (float)((Class_18740)object5).Field_18790;
                GL11.glEnable((int)(11751 & -8735));
                Class_16867.Method_16975();
                this.\u0000strictfp.Field_27.Method_28729((String)f3, n + (46 & 8414), n8 + (8539 & 35) + i * (-16118 & 26), -788529153 & 100663295);
                GL11.glDisable((int)(-29189 & 7649));
                f = (float)(d >> (180 & -15784) & (28671 & 255)) * (1.8571428f * 0.002111614f);
                d4 = (float)(d >> (12632 & -32242) & (-20225 & 1279)) * (0.04248366f * 0.092307694f);
                d8 = (float)(d & (16639 & 1279)) * (0.09411765f * 0.041666668f);
                GL11.glColor3f((float)f, (float)d4, (float)d8);
                this.Field_38277.Method_7648().Method_22417(39 & 18447, Class_29585.Field_29602);
                this.Field_38277.Method_7648().Method_22443(n + (20518 & -32446), n8 + i * (16746 & 2698) + (2093 & 542), 1.0).Method_22451();
                this.Field_38277.Method_7648().Method_22443(n + (24908 & 573), n8 + i * (266 & 16490) + (-31700 & 19036), 1.0).Method_22451();
                this.Field_38277.Method_7648().Method_22443(n + (9358 & 16397), n8 + i * (17423 & 11082) + (17571 & 4354), 1.0).Method_22451();
                this.Field_38277.Method_7648().Method_22443(n + (178 & 4110), n8 + i * (16974 & -24310) + (18474 & -31614), 1.0).Method_22451();
                this.Field_38277.Method_7647();
            }
            GL11.glScaled((double)(1.0 / (double)n4), (double)(1.0 / (double)n4), (double)1.0);
            GL11.glTranslated((double)((double)this.Field_38211 * (0.8085106382978723 * 0.618421052631579)), (double)((double)this.Field_38344 * (0.24375000000000002 * 2.051282051282051)), (double)0.0);
            GL11.glScaled((double)n2, (double)n2, (double)1.0);
            GL11.glEnable((int)(-28703 & 3569));
        } else if (this.Field_38202 == (21970 & 2051) || this.Field_38202 == (24715 & 2563)) {
            // empty if block
        }
        GL11.glScalef((float)(1.0f / (float)n2), (float)(1.0f / (float)n2), (float)1.0f);
        n5 = (int)(this.Field_38225 * (327.25f * 0.77922076f));
        object3 = this.\u0000strictfp.Field_27;
        if (n5 > 0) {
            Object[] arrobject = new Object[1025 & 8321];
            arrobject[387 & -27068] = this.Field_38264;
            object5 = String.format("%2.2fx", arrobject);
            object2 = object3.Method_28715((String)object5);
            if (n5 > (8447 & 17407)) {
                n5 = 25343 & 4351;
            }
            d = (376 & 20600) * n2 - (object2 + (378 & 27266)) * n4;
            n = (30968 & -32644) * n2 - (8394 & 6426) * n4;
            GL11.glTranslatef((float)((float)d), (float)n, (float)0.0f);
            GL11.glScalef((float)n4, (float)n4, (float)1.0f);
            object = n5 << (16473 & -22374) | 16777215 & 1811939327;
            Class_16867.Method_16975();
            object3.Method_28729((String)object5, 0.0f, 0.0f, (int)object);
            GL11.glScaled((double)(1.0 / (double)n4), (double)(1.0 / (double)n4), (double)1.0);
            GL11.glTranslatef((float)((float)(-d)), (float)(-n), (float)0.0f);
        }
        if (this.Field_38249 && this.Field_38281 != this.Field_38312) {
            object5 = this.Method_38431(this.Field_38312);
            float f11 = (float)(object3.Method_28715((String)object5) * n4) * (0.061797753f * 8.090909f);
            GL11.glTranslatef((float)(-f11), (float)(-55.272728f * 0.57894737f), (float)0.0f);
            GL11.glScaled((double)n4, (double)n4, (double)1.0);
            Class_16867.Method_16975();
            object3.Method_28729((String)object5, 0.0f, 0.0f, -2080374785 & 553648127);
            GL11.glScaled((double)(1.0 / (double)n4), (double)(1.0 / (double)n4), (double)1.0);
            GL11.glTranslatef((float)f11, (float)(42.057144f * 0.76086956f), (float)0.0f);
        }
        if (this.Field_38241) {
            f3 = (this.Field_38329 + 1.0375f * 173.49397f) % (0.10958904f * 3285.0f);
            if (f3 < 0.0f) {
                f3 += 2.4594595f * 146.37363f;
            }
            Object[] arrobject = new Object[-32191 & 8457];
            arrobject[8256 & -11728] = (int)f3;
            object5 = String.format("%03d'", arrobject);
            int n9 = (1149 & 17144) * n2 - (-30646 & 9739) * n4;
            GL11.glTranslatef((float)0.0f, (float)(0.27118644f * 442.5f * (float)n2 - (float)((270 & 28890) * n4)), (float)0.0f);
            GL11.glScalef((float)n4, (float)n4, (float)1.0f);
            Class_16867.Method_16975();
            object3.Method_28729((String)object5, (int)((float)object3.Method_28715((String)object5) * (0.902439f * -0.5540541f)), 0.0f, 67108863 & 150994943);
            GL11.glScaled((double)(1.0 / (double)n4), (double)(1.0 / (double)n4), (double)1.0);
            GL11.glTranslatef((float)0.0f, (float)(0.08080808f * -1485.0f * (float)n2 + (float)((3710 & 4234) * n4)), (float)0.0f);
        }
        if (this.Field_38228) {
            String string;
            String string2;
            GL11.glTranslatef((float)0.0f, (float)(-135.21127f * 0.8875f * (float)n2 + 2.0f), (float)0.0f);
            GL11.glScalef((float)n4, (float)n4, (float)1.0f);
            if (this.Field_38342 == 0) {
                n = Class_13337.Method_13371(this.Field_38259);
                object = Class_13337.Method_13371(this.Field_38288.\u0000strictfp.Field_11000);
                object42 = Class_13337.Method_13371(this.Field_38299);
                Object[] arrobject = new Object[-17341 & 818];
                arrobject[7717 & 136] = n;
                arrobject[593 & 8449] = (int)object42;
                string = String.format("%+d, %+d", arrobject);
                string2 = Integer.toString((int)object);
            } else if (this.Field_38342 == (12577 & 13)) {
                Object[] arrobject = new Object[1162 & -28350];
                arrobject[4776 & 16] = this.Field_38259;
                arrobject[10941 & 257] = this.Field_38299;
                string = String.format("%+1.2f, %+1.2f", arrobject);
                Object[] arrobject2 = new Object[-32735 & 8449];
                arrobject2[-16344 & 8259] = this.Field_38288.\u0000strictfp.Field_11000;
                string2 = String.format("%1.2f", arrobject2);
            } else if (this.Field_38342 == (1910 & -32766)) {
                Object[] arrobject = new Object[1426 & 2662];
                arrobject[-22519 & 34] = this.Field_38259;
                arrobject[11317 & -32383] = this.Field_38299;
                string = String.format("%+1.2f, %+1.2f", arrobject);
                Object[] arrobject3 = new Object[17174 & 9218];
                arrobject3[-31680 & 21280] = this.Field_38217;
                arrobject3[4613 & 3403] = (int)this.Field_38288.\u0000strictfp.Field_11000;
                string2 = String.format("%1.2f (%d)", arrobject3);
            } else {
                Object[] arrobject = new Object[-31610 & 16436];
                arrobject[22024 & -32448] = this.Field_38299 >= 0.0 ? "S" : "N";
                arrobject[8269 & -32717] = this.Field_38299 >= 0.0 ? this.Field_38299 : -this.Field_38299;
                arrobject[16962 & 1422] = this.Field_38259 >= 0.0 ? "E" : "W";
                arrobject[7 & -31549] = this.Field_38259 >= 0.0 ? this.Field_38259 : -this.Field_38259;
                string = String.format("%s%1.2f, %s%1.2f", arrobject);
                Object[] arrobject4 = new Object[515 & -31419];
                arrobject4[-24000 & 3338] = this.Field_38288.\u0000strictfp.Field_11000;
                string2 = String.format("%1.2fm", arrobject4);
            }
            Class_16867.Method_16975();
            object3.Method_28729(string, (int)((float)object3.Method_28715(string) * (4.428571f * -0.11290323f)), 2.0f, 570425343 & 184549375);
            Class_16867.Method_16975();
            object3.Method_28729(string2, (int)((float)object3.Method_28715(string2) * (5.0f * -0.1f)), 16.0f * 0.75f, -1929379841 & 603979775);
            GL11.glScaled((double)(1.0 / (double)n4), (double)(1.0 / (double)n4), (double)1.0);
            GL11.glTranslatef((float)0.0f, (float)(0.25757575f * 465.88235f * (float)n2 - 2.0f), (float)0.0f);
        }
        GL11.glDepthMask((3395 & -8191) != 0);
        GL11.glEnable((int)(2937 & -12425));
    }

    static {
        int n;
        Object object;
        Object[] arrobject = new Object[24730 & 258];
        arrobject[4096 & -21376] = Class_38196.Method_38405("\u1040\u1042");
        arrobject[-32691 & 31745] = Class_38196.Method_38380("\u60ac\u60a1\u60a5\u60a1\u60a1");
        Field_38361 = String.format(Class_38196.Method_38418("\u024a\u0218\u0249\u0212\u024e\u021c\u0214"), arrobject);
        Field_38267 = Class_18.Field_89.Field_68;
        Field_38346 = new File(Class_18.Field_89.Field_68, Class_38196.Method_38424("\u6605\u6608\u6608\u6601\u660d\u6600") + File.separatorChar + Class_38196.Method_38433("\u0340\u0351\u0352\u0363\u0354\u0355\u0356\u0357\u0350\u0351\u0342"));
        int[] arrn = new int[5895 & 16597];
        arrn[24808 & 535] = -32765 & 24838;
        arrn[16385 & 2647] = 359 & 13461;
        arrn[162 & 15426] = 20718 & 2074;
        arrn[18435 & -28053] = 822 & 4244;
        arrn[16676 & 1028] = -31635 & 40;
        Field_38308 = arrn;
        Field_38285 = new Class_38196();
        Field_38220 = new Class_43180(Class_38196.Method_38379(8397 & 20622, 28824 & 2565, 9340 & 17025, -32049 & 6381), Class_26134.Field_26135);
        Field_38230 = new Class_43180(Class_38196.Method_38379(16895 & 10495, 8447 & -29961, 6828 & 17545, 8231 & -16201), Class_26134.Field_26144);
        Field_38324 = 20514 & 8833;
        LinkedList<Class_18740> linkedList = new LinkedList<Class_18740>();
        Class_18740[] arrclass_18740 = Class_18740.Field_18760;
        int n2 = arrclass_18740.length;
        for (int i = 3200 & -12247; i < n2; ++i) {
            object = arrclass_18740[i];
            if (object == null) continue;
            linkedList.add((Class_18740)object);
        }
        Field_38263 = linkedList.toArray(new Class_18740[2897 & 29696]);
        InputStream inputStream = Class_45406.class.getResourceAsStream(Class_45406.class.getSimpleName() + Class_38196.Method_38430("\u9320\u9320\u9322\u9322\u9324\u9324"));
        if (inputStream != null) {
            try {
                object = new ByteArrayOutputStream();
                byte[] arrby = new byte[4768 & 5394];
                do {
                    int n3;
                    if ((n3 = inputStream.read(arrby)) == (-1 & -1)) {
                        inputStream.close();
                        String string = new String(((ByteArrayOutputStream)object).toByteArray(), Class_38196.Method_38385("\u1000\u1000\u1001\u1029\u1029")).toLowerCase(Locale.ENGLISH);
                        if (string.indexOf(Class_38196.Method_38391("\u1208\u120c\u1208\u120c")) != (-1 & -1) && string.indexOf(Class_38196.Method_38445("\u030c\u038f\u030c\u038d")) != (-1 & -1)) {
                            Class_38196.Field_38285.Field_38248 = Class_38196.Method_38399("\ud381\ud381\ud382\ud383\ud385\ud385\ud387\ud3c6\ud389\ud388\ud38a\ud38b\ud38c");
                            Class_38196.Field_38285.Field_38283.Method_37590();
                            Class_38196.Field_38285.Field_38283 = null;
                        }
                        break;
                    }
                    ((ByteArrayOutputStream)object).write(arrby, 4352 & -32155, n3);
                } while (true);
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        double[] arrd = new double[16718 & 13958];
        arrd[8264 & 20608] = 2.739130434782609 * 0.18253968253968253;
        arrd[129 & 2081] = 1.0;
        arrd[1186 & 2306] = 3.0789473684210527 * 0.48717948717948717;
        arrd[10275 & -31229] = 1.0476190476190477 * 1.909090909090909;
        arrd[292 & 6796] = 4.6875 * 0.8533333333333334;
        arrd[-12811 & 4101] = 24.666666666666664 * 0.32432432432432434;
        Field_38244 = arrd;
        Field_38242 = new float[16398 & 283];
        float f = 0.0f;
        for (n = -30572 & 1282; n < Field_38242.length; ++n) {
            Class_38196.Field_38242[n] = (float)(1.0 / Math.sqrt(n + (-24541 & 18769)));
            f += Field_38242[n];
        }
        f = 0.20156251f * 1.4883721f / f;
        n = 4272 & -16375;
        while (n < Field_38242.length) {
            float[] arrf = Field_38242;
            int n4 = n++;
            arrf[n4] = arrf[n4] * f;
        }
        f = 0.0f;
        for (n = 8257 & 30; n < (16910 & 12442); ++n) {
            f += Field_38242[n];
        }
    }

    private static String Method_38433(String string) {
        int n = 5850;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_38196.class, 5);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private int Method_38434(long l, float f) {
        float f2 = this.Method_38401(l, f);
        float f3 = Math.max(0.0f, Math.min(1.0f, 1.0f - (Class_13337.Method_13350(f2 * (0.27836898f * 11.285714f) * 2.0f) * 2.0f + 0.23333333f * 2.142857f)));
        f3 = 1.0f - f3;
        f3 = (float)((double)f3 * (1.0 - (double)(this.Field_38293.Method_332(1.0f) * (2.5757575f * 1.9411765f)) / (0.8928571428571429 * 17.919999999999998)));
        f3 = (float)((double)f3 * (1.0 - (double)(this.Field_38293.Method_349(1.0f) * (5.2830186f * 0.9464286f)) / (2.4444444444444446 * 6.545454545454545)));
        f3 = 1.0f - f3;
        return (int)(f3 * (139.33334f * 0.078947365f));
    }

    private void Method_38435() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private static SocketAddress Method_38436(Class_626 class_626) {
        Class_20165 class_20165 = ((Class_1378)class_626).Field_1390;
        Class_44584 class_44584 = class_20165.Method_20230();
        return class_44584 == null ? null : class_44584.Method_44612();
    }

    protected boolean Method_38437() {
        return this.Field_38320;
    }

    protected Class_283 Method_38438() {
        return this.Field_38293;
    }

    protected void Method_38439() {
        File file = new File(Field_38346, this.Field_38231 + ".DIM" + this.Field_38312 + ".points");
        if (file.isDirectory()) {
            this.Method_38429("\u00a7e[Rei's Minimap] Error Saving Waypoints");
            Class_38196.Method_38428("[Rei's Minimap] Error Saving Waypoints: (" + file + ") is directory.");
        } else {
            try {
                PrintWriter printWriter = new PrintWriter(file, "UTF-8");
                for (Class_7651 class_7651 : this.Field_38265) {
                    printWriter.println(class_7651);
                }
                printWriter.flush();
                printWriter.close();
            }
            catch (Exception exception) {
                this.Method_38429("\u00a7e[Rei's Minimap] Error Saving Waypoints");
                Class_38196.Method_38370("Error Saving Waypoints", exception);
            }
        }
    }

    private void Method_38440() {
        File file = new File(Field_38267, "config" + File.separatorChar + "ReiMinimap.cfg");
        if (file.exists()) {
            int n = 4 & 1704;
            try {
                Scanner scanner = new Scanner(file, "UTF-8");
                while (scanner.hasNextLine()) {
                    try {
                        String[] arrstring = scanner.nextLine().split(":");
                        Class_13769 class_13769 = Class_13769.Method_13875(Class_38196.Method_38414(arrstring[-30720 & 29956].trim()));
                        if (class_13769 != Class_13769.Field_13822 && class_13769 != Class_13769.Field_13799 && class_13769 != Class_13769.Field_13784 && class_13769 != Class_13769.Field_13782) {
                            this.Method_38384(class_13769, Class_24246.Method_24360(Class_38196.Method_38414(arrstring[19975 & 4513].trim())));
                            continue;
                        }
                        this.Method_38421(class_13769, arrstring[-24061 & 3201].trim());
                    }
                    catch (Exception exception) {
                        System.err.println(exception.getMessage());
                        n = -16375 & 4097;
                    }
                }
                scanner.close();
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
            if (n != 0) {
                this.Method_38427();
            }
        }
    }

    protected int Method_38441() {
        return this.Field_38274;
    }

    private int Method_38442(Class_17665 class_17665, int n, int n2) {
        int n3;
        Class_3238 class_3238;
        int n4 = class_17665.Method_17719(n, n2);
        for (n3 = (n4 >> (16421 & -24508)) * (2070 & 16400) + (10415 & 543); n3 < this.Field_38274; n3 += 16) {
            class_3238 = this.Field_38293.Method_375(new Class_4751((class_17665.Field_17666 << (3604 & 8205)) + n, n3, (class_17665.Field_17668 << (-27515 & 60)) + n2)).Method_3442();
            if (class_3238.Method_3384() <= 0) continue;
            n4 = n3 + (9473 & 6265);
        }
        if (this.Method_38375() && n4 >= this.Field_38292 && this.Field_38292 <= (1790 & 8318)) {
            n3 = this.Field_38292;
            class_3238 = this.Field_38293.Method_375(new Class_4751((class_17665.Field_17666 << (-20450 & 1252)) + n, n3, (class_17665.Field_17668 << (4196 & -30697)) + n2)).Method_3442();
            if (class_3238.Method_3384() == 0 && class_3238.Method_3373() != Class_3713.Field_3750) {
                while (class_3238.Method_3384() == 0 && class_3238.Method_3373() != Class_3713.Field_3750 && n3 >= 0) {
                    if (n3 == 0) {
                        return n3;
                    }
                    class_3238 = this.Field_38293.Method_375(new Class_4751((class_17665.Field_17666 << (4 & -23364)) + n, n3 - (1473 & 14385), (class_17665.Field_17668 << (4644 & 10524)) + n2)).Method_3442();
                    --n3;
                }
                return n3 + (2049 & 8227);
            }
            while (n3 <= this.Field_38292 + (303 & 1050) && n3 < (this.Field_38292 <= (7807 & 382) ? 1663 & 27135 : 4607 & -30465)) {
                if ((class_3238 = this.Field_38293.Method_375(new Class_4751((class_17665.Field_17666 << (17924 & 439)) + n, ++n3, (class_17665.Field_17668 << (2052 & -23964)) + n2)).Method_3442()).Method_3384() != 0 || class_3238.Method_3373() == Class_3713.Field_3750) continue;
                return n3;
            }
            return -1 & -1;
        }
        return n4;
    }

    protected int Method_38443() {
        return this.Field_38281;
    }

    private static boolean Method_38444(Class_1490 class_1490) {
        return (8299 & 277) != 0;
    }

    private static String Method_38445(String string) {
        int n = 32352;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_38196.class, 9);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }
}

