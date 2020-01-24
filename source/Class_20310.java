/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  com.google.common.util.concurrent.ThreadFactoryBuilder
 *  org.apache.commons.lang3.Validate
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.base.Charsets;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import java.awt.image.BufferedImage;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.nio.charset.Charset;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class_20310
implements Class_14246 {
    private static final Class_2080 Field_20311;
    private String Field_20312;
    private static final Logger Field_20313;
    public int Field_20314;
    private static final Class_2080 Field_20315;
    private final Class_18 Field_20316;
    public int Field_20317;
    private static final ThreadPoolExecutor Field_20318;
    private static final Class_2080 Field_20319;
    private final Class_2080 Field_20320;
    private Class_47630 Field_20321;
    private long Field_20322;
    private final Class_27772 Field_20323;
    public final Class_15474 Field_20324;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void Method_20325() {
        if (this.Field_20324.Method_15509() == null) {
            this.Field_20316.Method_253().Method_34702(this.Field_20320);
            this.Field_20321 = null;
        } else {
            BufferedImage bufferedImage;
            block8 : {
                Class_22553 class_22553 = Class_16620.Method_16634(this.Field_20324.Method_15509(), Charsets.UTF_8);
                Class_22553 class_225532 = Class_37686.Method_37693(class_22553);
                try {
                    bufferedImage = Class_18695.Method_18726(new Class_12071(class_225532));
                    Validate.validState((bufferedImage.getWidth() == (-24376 & 1380) ? -24555 & 23587 : 3222 & -28160) != 0, (String)"Must be 64 pixels wide", (Object[])new Object[128 & 24576]);
                    Validate.validState((bufferedImage.getHeight() == (-3776 & 112) ? 3 & 557 : 1740 & 20482) != 0, (String)"Must be 64 pixels high", (Object[])new Object[24 & 10753]);
                    break block8;
                }
                catch (Throwable throwable) {
                    Field_20313.error("Invalid icon for server " + this.Field_20324.Field_15482 + " (" + this.Field_20324.Field_15484 + ")", throwable);
                    this.Field_20324.Method_15501(null);
                }
                finally {
                    class_22553.release();
                    class_225532.release();
                }
                return;
            }
            if (this.Field_20321 == null) {
                this.Field_20321 = new Class_47630(bufferedImage.getWidth(), bufferedImage.getHeight());
                this.Field_20316.Method_253().Method_34704(this.Field_20320, this.Field_20321);
            }
            bufferedImage.getRGB(2048 & 8945, 1077 & 6592, bufferedImage.getWidth(), bufferedImage.getHeight(), this.Field_20321.Method_47637(), 64 & 6289, bufferedImage.getWidth());
            this.Field_20321.Method_47635();
        }
    }

    static {
        Field_20313 = LogManager.getLogger();
        Field_20318 = new ScheduledThreadPoolExecutor(-14811 & 8455, new ThreadFactoryBuilder().setNameFormat(Class_20310.Method_20336("\u20c0\u20f0\u20e1\u20e1\u20f0\u20e1\u20b1\u20c1\u20f0\u20f1\u20f8\u20f8\u20e9\u20b9\u20b8\u20b8\u20e1")).setDaemon((3073 & 8455) != 0).build());
        Field_20319 = new Class_2080(Class_20310.Method_20339("\u2980\u2981\u298e\u2983\u2984\u2981\u2986\u2983\u2980\u298d\u298e\u2983\u2988\u2989\u2986\u2987\u2998\u2991\u2992\u2993\u299c\u2991\u2996\u2993\u2998\u2999\u299e\u2993\u2998\u2995\u299e"));
        Field_20311 = new Class_2080(Class_20310.Method_20329("\u0652\u0642\u0654\u0650\u0652\u0654\u0640\u0656\u0608\u064a\u064c\u065e\u064c\u0608\u0658\u064a\u0654\u0650\u0652\u0642\u0650\u0640\u0646\u0650\u064c\u0648\u0658\u064e\u0618\u064e\u065a\u065a"));
        Field_20315 = new Class_2080(Class_20310.Method_20328("\ua864\ua865\ua862\ua867\ua860\ua867\ua862\ua865\ua826\ua867\ua866\ua863\ua822\ua867\ua862\ua865\ua876\ua875\ua870\ua855\ua876\ua871\ua872\ua873\ua872\ua875\ua872\ua875\ua872\ua833\ua876\ua871\ua846"));
    }

    private boolean Method_20326(boolean bl) {
        try {
            if (this.Field_20324.Method_15510()) {
                return (-29504 & 24837) != 0;
            }
            Class_14246 class_14246 = this.Field_20323.Method_27803().Method_46135(this.Field_20314 + (bl ? -1 & -1 : -30687 & 577));
            if (class_14246 == null || !(class_14246 instanceof Class_20310)) {
                return (7072 & -16304) != 0;
            }
            Class_20310 class_20310 = (Class_20310)class_14246;
            if (class_20310.Field_20324.Method_15510()) {
                return (4640 & -6912) != 0;
            }
            this.Field_20323.Method_27794().Method_22681(this.Field_20317, class_20310.Field_20317);
            this.Field_20323.Method_27794().Method_22686();
            this.Field_20323.Method_27803().Method_46137(this.Field_20323.Method_27794());
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return (16481 & 385) != 0;
    }

    public boolean Method_20327(int n, int n2, int n3, int n4, int n5, int n6) {
        if (n5 <= (1060 & 12905)) {
            if (n5 < (-22496 & 61) && n5 > (-32716 & 17425) && this.Method_20332()) {
                this.Field_20323.Method_27808(n);
                this.Field_20323.Method_27796();
                return (321 & 49) != 0;
            }
            if (n5 < (4112 & 660) && n6 < (22 & 1360) && this.Field_20323.Method_27793(this, n)) {
                this.Method_20326((-32695 & 6183) != 0);
                return (-16095 & 10267) != 0;
            }
            if (n5 < (16432 & 10258) && n6 > (18517 & -32752) && this.Field_20323.Method_27811(this, n)) {
                this.Method_20326((25280 & 2) != 0);
                return (-31931 & 3089) != 0;
            }
        }
        this.Field_20323.Method_27808(n);
        if (Class_18.Method_207() - this.Field_20322 < (-8419487541400415746L & 8419487539522832123L)) {
            this.Field_20323.Method_27796();
        }
        this.Field_20322 = Class_18.Method_207();
        return (8578 & 16389) != 0;
    }

    private static String Method_20328(String string) {
        int n = 4181;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_20310.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_20329(String string) {
        int n = 2874;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_20310.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_20330() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    static Class_27772 Method_20331(Class_20310 class_20310) {
        return class_20310.Field_20323;
    }

    private boolean Method_20332() {
        return (16913 & 10499) != 0;
    }

    protected void Method_20333(int n, int n2, Class_2080 class_2080) {
        this.Field_20316.Method_253().Method_34707(class_2080);
        Class_16867.Method_16947();
        Class_1551.Method_1566(n, n2, 0.0f, 0.0f, 19042 & -32340, 5664 & 39, 46.367348f * 0.69014084f, 0.58208954f * 54.97436f);
        Class_16867.Method_16952();
    }

    public void Method_20334(int n, int n2, int n3) {
    }

    public void Method_20335(int n, int n2, int n3, int n4, int n5, int n6, int n7, boolean bl) {
        String string;
        int n8;
        this.Field_20314 = n;
        if (!this.Field_20324.Field_15477) {
            this.Field_20324.Field_15477 = 2117 & 16425;
            this.Field_20324.Field_15485 = -2L & -2L;
            this.Field_20324.Field_15479 = "";
            this.Field_20324.Field_15483 = "";
            Field_20318.submit(new Class_17588(this));
        }
        int n9 = this.Field_20324.Field_15480 > (7215 & 8239) ? 783 & 16385 : 2048 & -28248;
        int n10 = this.Field_20324.Field_15480 < (191 & 21615) ? -32253 & 28801 : 3074 & -28244;
        int n11 = n9 != 0 || n10 != 0 ? -16381 & 1669 : 4160 & 18180;
        this.Field_20316.Field_27.Method_28692(this.Field_20324.Field_15482, n2 + (3104 & -32736) + (1539 & -26609), n3 + (7297 & 5), 452984831 & 83886079);
        List list = this.Field_20316.Field_27.Method_28733(this.Field_20324.Field_15479, n4 - (14385 & 1508) - (-31662 & 899));
        for (int i = 16 & 10410; i < Math.min(list.size(), -16126 & 8198); ++i) {
            this.Field_20316.Field_27.Method_28692((String)list.get(i), n2 + (16418 & 1380) + (-31673 & 171), n3 + (4364 & 46) + (24905 & 5305) * i, 546998400 & -926902380);
        }
        String string2 = n11 != 0 ? (Object)((Object)Class_5478.Field_5502) + this.Field_20324.Field_15487 : this.Field_20324.Field_15483;
        int n12 = this.Field_20316.Field_27.Method_28715(string2);
        this.Field_20316.Field_27.Method_28692(string2, n2 + n4 - n12 - (527 & 4367) - (22599 & 386), n3 + (18497 & 9345), 1350866869 & 94929088);
        int n13 = 16418 & 12612;
        String string3 = null;
        if (n11 != 0) {
            n8 = 655 & 1317;
            string = n9 != 0 ? "Client out of date!" : "Server out of date!";
            string3 = this.Field_20324.Field_15489;
        } else if (this.Field_20324.Field_15477 && this.Field_20324.Field_15485 != (-2L & -1L)) {
            n8 = this.Field_20324.Field_15485 < (1051692L & 541704272L) ? 23 & 6413 : (this.Field_20324.Field_15485 < (1275601046L & 324082326L) ? 22666 & -24544 : (this.Field_20324.Field_15485 < (6554431L & 8716954360694954284L) ? 16909 & 177 : (this.Field_20324.Field_15485 < (1707086428L & 168101464L) ? 9478 & -28477 : (this.Field_20324.Field_15485 < (1076892648L & 1413314531484273640L) ? 24619 & 519 : 25126 & 6157))));
            if (this.Field_20324.Field_15485 < (-3915555293305239488L & 3915555292737188409L)) {
                string = "(no connection)";
            } else {
                string = this.Field_20324.Field_15485 + "ms";
                string3 = this.Field_20324.Field_15489;
            }
        } else {
            n13 = 83 & -32767;
            n8 = (int)(Class_18.Method_207() / (1087377012L & 17248486L) + (long)(n * (2562 & -28622)) & (269060103L & 1091575879L));
            if (n8 > (2180 & 13126)) {
                n8 = (-32120 & 8204) - n8;
            }
            string = "Pinging...";
        }
        Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 1.0f);
        this.Field_20316.Method_253().Method_34707(Class_1551.Field_1555);
        Class_1551.Method_1566(n2 + n4 - (2079 & -12273), n3, n13 * (10 & 271), (4592 & -32583) + n8 * (23304 & 8), 5258 & -31958, 2184 & 361, 357.51724f * 0.7160494f, 0.1375f * 1861.8181f);
        if (this.Field_20324.Method_15509() != null && !this.Field_20324.Method_15509().equals(this.Field_20312)) {
            this.Field_20312 = this.Field_20324.Method_15509();
            this.Method_20325();
            this.Field_20323.Method_27794().Method_22686();
        }
        if (this.Field_20324.Method_15494()) {
            this.Method_20333(n2 - (25197 & 1320), n3, Field_20319);
        }
        if (this.Field_20321 != null) {
            this.Method_20333(n2, n3, this.Field_20320);
        } else {
            this.Method_20333(n2, n3, Field_20311);
        }
        int n14 = n6 - n2;
        int n15 = n7 - n3;
        if (n14 >= n4 - (-31729 & 21023) && n14 <= n4 - (-32491 & 22085) && n15 >= 0 && n15 <= (8970 & 1129)) {
            this.Field_20323.Method_27802(string);
        } else if (n14 >= n4 - n12 - (5711 & -32593) - (4106 & -21470) && n14 <= n4 - (29295 & -31457) - (8315 & 18438) && n15 >= 0 && n15 <= (3736 & 8488)) {
            this.Field_20323.Method_27802(string3);
        }
        if (this.Field_20316.Field_84.Field_39870 || bl) {
            this.Field_20316.Method_253().Method_34707(Field_20315);
            Class_1551.Method_1558(n2, n3, n2 + (2082 & -15752), n3 + (544 & -29212), -1516990056 & -1566903150);
            Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 1.0f);
            int n16 = n6 - n2;
            int n17 = n7 - n3;
            if (this.Method_20332()) {
                if (n16 < (18084 & -32719) && n16 > (26773 & 880)) {
                    Class_1551.Method_1566(n2, n3, 0.0f, 405.33334f * 0.078947365f, -24544 & 4208, 6440 & 16418, 3.3333333f * 76.8f, 629.62164f * 0.4065934f);
                } else {
                    Class_1551.Method_1566(n2, n3, 0.0f, 0.0f, -10008 & 1313, 40 & 34, 0.5714286f * 447.99997f, 623.5898f * 0.4105263f);
                }
            }
            if (this.Field_20323.Method_27793(this, n)) {
                if (n16 < (9104 & -15344) && n17 < (25660 & 2128)) {
                    Class_1551.Method_1566(n2, n3, 0.2244898f * 427.63638f, 6.886076f * 4.647059f, -14287 & 1062, 16420 & -31837, 1.5f * 170.66667f, 3.72f * 68.81721f);
                } else {
                    Class_1551.Method_1566(n2, n3, 338.08694f * 0.28395063f, 0.0f, 24105 & -24400, -15836 & 35, 270.71265f * 0.9456522f, 1.295082f * 197.67088f);
                }
            }
            if (this.Field_20323.Method_27811(this, n)) {
                if (n16 < (10768 & 5169) && n17 > (16665 & -29514)) {
                    Class_1551.Method_1566(n2, n3, 0.36363637f * 176.0f, 0.6f * 53.333332f, -14736 & 4132, -32671 & 2464, 0.9423077f * 271.67346f, 0.87356323f * 293.05264f);
                } else {
                    Class_1551.Method_1566(n2, n3, 74.14635f * 0.86315787f, 0.0f, 2096 & 8228, 10344 & 800, 1.3661972f * 187.38144f, 704.0f * 0.36363637f);
                }
            }
        }
    }

    private static String Method_20336(String string) {
        int n = 21575;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_20310.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_20337(int n, int n2, int n3, int n4, int n5, int n6) {
    }

    public Class_15474 Method_20338() {
        return this.Field_20324;
    }

    private static String Method_20339(String string) {
        int n = 31813;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_20310.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    protected Class_20310(Class_27772 class_27772, Class_15474 class_15474, int n) {
        this.Field_20323 = class_27772;
        this.Field_20324 = class_15474;
        this.Field_20316 = Class_18.Field_89;
        this.Field_20320 = new Class_2080("servers/" + class_15474.Field_15484 + "/icon");
        this.Field_20321 = (Class_47630)this.Field_20316.Method_253().Method_34709(this.Field_20320);
        this.Field_20317 = n;
    }
}

