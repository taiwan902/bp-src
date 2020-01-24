/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class Class_17281 {
    public static final Class_17281 Field_17282;
    protected static final Class_43999 Field_17283;
    protected static final Class_6335 Field_17284;
    public static final Class_17281 Field_17285;
    protected static final Class_6335 Field_17286;
    protected static final Class_6335 Field_17287;
    protected List Field_17288;
    public static final Class_17281 Field_17289;
    public static final Class_17281 Field_17290;
    public static final Class_17281 Field_17291;
    public float Field_17292;
    public Class_15886 Field_17293;
    public static final Class_17281 Field_17294;
    private static final Logger Field_17295;
    public static final Class_17281 Field_17296;
    protected Class_4297 Field_17297;
    protected List Field_17298;
    public static final Class_17281 Field_17299;
    public float Field_17300;
    public static final Class_17281 Field_17301;
    public float Field_17302;
    public static final Class_17281 Field_17303;
    public static final Class_17281 Field_17304;
    public static final Class_17281 Field_17305;
    protected static final Class_6335 Field_17306;
    public static final Class_17281 Field_17307;
    public static final Class_17281 Field_17308;
    protected static final Class_6335 Field_17309;
    protected static final Class_6335 Field_17310;
    public static final Class_17281 Field_17311;
    public Class_3436 Field_17312 = Class_9265.Field_9319.\u0000strictfp();
    public static final Class_17281 Field_17313;
    protected static final Class_6335 Field_17314;
    public int Field_17315;
    public float Field_17316;
    protected Class_22522 Field_17317;
    public static final Class_17281 Field_17318;
    public static final Class_17281 Field_17319;
    public int Field_17320;
    public static final Class_17281 Field_17321;
    public static final Class_17281 Field_17322;
    private static final Class_17281[] Field_17323;
    public static final Class_17281 Field_17324;
    protected static final Class_6335 Field_17325;
    public static final Class_17281 Field_17326;
    public static final Class_17281 Field_17327;
    public static final Class_17281 Field_17328;
    protected Class_4328 Field_17329;
    public int Field_17330 = -1797265093 & 21948085;
    public static final Class_17281 Field_17331;
    public static final Class_17281 Field_17332;
    public static final Class_17281 Field_17333;
    public static final Class_17281 Field_17334;
    public static final Class_17281 Field_17335;
    public static final Class_17281 Field_17336;
    public static final Class_17281 Field_17337;
    public static final Class_17281 Field_17338;
    protected static final Class_6335 Field_17339;
    protected List Field_17340;
    public static final Set Field_17341;
    public static final Class_17281 Field_17342;
    public final int Field_17343;
    public static final Class_17281 Field_17344;
    protected static final Class_29139 Field_17345;
    public static final Class_17281 Field_17346;
    public static final Class_17281 Field_17347;
    public int Field_17348;
    protected boolean Field_17349;
    public static final Class_17281 Field_17350;
    public static final Class_17281 Field_17351;
    public static final Map Field_17352;
    protected List Field_17353;
    protected static final Class_6335 Field_17354;
    public String Field_17355;
    protected static final Class_6335 Field_17356;
    public static final Class_17281 Field_17357;
    public static final Class_17281 Field_17358;
    protected static final Class_6335 Field_17359;
    protected boolean Field_17360;
    public Class_3436 Field_17361 = Class_9265.Field_9272.Method_3293();
    public static final Class_17281 Field_17362;
    protected static final Class_43999 Field_17363;
    protected static final Class_6335 Field_17364;

    private static String Method_17365(String string) {
        int n = 32483;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_17281.class, 21);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_17366(String string) {
        int n = 29639;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_17281.class, 24);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_17367(String string) {
        int n = 10937;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_17281.class, 12);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_17368(Class_283 class_283, Random random, Class_4751 class_4751) {
        this.Field_17293.Method_15926(class_283, random, this, class_4751);
    }

    public boolean Method_17369() {
        return this.Field_17360;
    }

    private static String Method_17370(String string) {
        int n = 2278;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_17281.class, 41);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public List Method_17371(Class_13693 class_13693) {
        switch (Class_20066.Field_20067[class_13693.ordinal()]) {
            case 1: {
                return this.Field_17353;
            }
            case 2: {
                return this.Field_17340;
            }
            case 3: {
                return this.Field_17298;
            }
            case 4: {
                return this.Field_17288;
            }
        }
        return Collections.emptyList();
    }

    private static String Method_17372(String string) {
        int n = 9177;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_17281.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public final int Method_17373() {
        return (int)(this.Field_17292 * (45771.176f * 1.4318181f));
    }

    private static String Method_17374(String string) {
        int n = 13888;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_17281.class, 26);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_17375(String string) {
        int n = 32043;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_17281.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_5607 Method_17376(Random random, Class_4751 class_4751) {
        return random.nextInt(1091 & 2855) > 0 ? Class_5607.Field_5615 : Class_5607.Field_5613;
    }

    private static String Method_17377(String string) {
        int n = 877;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_17281.class, 30);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class Method_17378() {
        return this.getClass();
    }

    public int Method_17379(Class_4751 class_4751) {
        double d = Class_13337.Method_13360(this.Method_17407(class_4751), 0.0f, 1.0f);
        double d2 = Class_13337.Method_13360(this.Method_17414(), 0.0f, 1.0f);
        return Class_23541.Method_23543(d, d2);
    }

    static {
        Field_17295 = LogManager.getLogger();
        Field_17306 = new Class_6335(1.051282f * 0.09512195f, 0.011320755f * 17.666666f);
        Field_17359 = new Class_6335(0.5714286f * -0.87499994f, 0.0f);
        Field_17339 = new Class_6335(-0.7647059f * 1.3076923f, 1.1891892f * 0.08409091f);
        Field_17364 = new Class_6335(0.6526316f * -2.7580645f, 0.104166664f * 0.96000004f);
        Field_17287 = new Class_6335(57.0f * 0.0021929825f, 0.315f * 0.15873016f);
        Field_17286 = new Class_6335(2.84f * 0.07042254f, 0.31111112f * 0.64285713f);
        Field_17356 = new Class_6335(2.7777777f * 0.162f, 0.21333334f * 1.40625f);
        Field_17284 = new Class_6335(5.6249995f * 0.26666668f, 0.022033898f * 1.1346154f);
        Field_17325 = new Class_6335(1.0f, 0.50980395f * 0.98076916f);
        Field_17309 = new Class_6335(0.0f, 0.006104651f * 4.095238f);
        Field_17310 = new Class_6335(0.47191012f * 0.21190476f, 0.7894737f * 1.0133333f);
        Field_17314 = new Class_6335(0.5f * 0.4f, 20.0f * 0.015000001f);
        Field_17354 = new Class_6335(-3.6000001f * 0.055555556f, 1.2586207f * 0.07945205f);
        Field_17323 = new Class_17281[328 & 11138];
        Field_17341 = Sets.newHashSet();
        Field_17352 = new HashMap();
        Field_17303 = new Class_44576(-31800 & 19456).\u0000%(6385 & -31372).Method_17433(Class_17281.Method_17372("\u0004\u0000\u0004\u0000\u0001")).Method_17409(Field_17339);
        Field_17318 = new Class_24194(-32479 & 17409).\u0000%(1084079076 & 751809379).Method_17433(Class_17281.Method_17444("\u26a0\u2685\u2680\u2681\u2684\u2681"));
        Field_17321 = new Class_39271(16898 & -30713).\u0000%(570088696 & 385594648).Method_17433(Class_17281.Method_17375("\u8480\u84a1\u84a0\u84a3\u84a2\u84a1")).Method_17424().Method_17395(2.0f, 0.0f).Method_17409(Field_17287);
        Field_17299 = new Class_29549(1571 & 16775, (-16231 & 10788) != 0).\u0000%(-1872469144 & 627073138).Method_17433(Class_17281.Method_17401("\ucc72\ucc46\ucc40\ucc46\ucc56\ucc56\ucc54\ucc10\ucc7e\ucc5e\ucc58\ucc58\ucc48")).Method_17409(Field_17325).Method_17395(0.26341462f * 0.7592593f, 0.34864867f * 0.8604651f);
        Field_17351 = new Class_32295(16404 & -22226, -19452 & 16624).\u0000%(1928741 & 1157982121).Method_17433(Class_17281.Method_17422("\u4b88\u4b81\u4b98\u4b8b\u4b9c\u4b9f"));
        Field_17332 = new Class_41349(19477 & 8303, 12288 & 3081).\u0000%(2844415 & 1210021465).Method_17433(Class_17281.Method_17381("\u8001\u8000\u8002\u8000\u8004")).Method_17384(39828019 & 1750007613).Method_17395(0.0952381f * 2.625f, 13.5f * 0.059259262f).Method_17409(Field_17286);
        Field_17337 = new Class_46864(10342 & -10738).\u0000%(541587955 & 17824690).Method_17433(Class_17281.Method_17402("\u2214\u2210\u2204\u2200\u2214\u2200\u2204\u2200\u2208")).Method_17384(42712906 & -2118406327).Method_17409(Field_17354).Method_17395(1.0f * 0.8f, 1.6818181f * 0.53513515f);
        Field_17357 = new Class_26476(8519 & -15865).\u0000%(7423 & -7425).Method_17433(Class_17281.Method_17398("\u0100\u0121\u0122\u0123\u0120")).Method_17409(Field_17359);
        Field_17327 = new Class_26666(8712 & 2186).\u0000%(-1023440884 & 822034480).Method_17433(Class_17281.Method_17386("\u3880\u38a9\u38a0\u38a0")).Method_17424().Method_17395(2.0f, 0.0f);
        Field_17346 = new Class_22545(8969 & 217).\u0000%(-1600028417 & 12620543).Method_17433(Class_17281.Method_17410("\u3912\u3906\u3903\u3946\u3907\u3904\u3906")).Method_17424();
        Field_17304 = new Class_44576(-24326 & 2570).\u0000%(164796847 & -795823968).Method_17433(Class_17281.Method_17411("\u8241\u8241\u8242\u8243\u8246\u8245\u8246\u8246\u824a\u824a\u824b")).Method_17438().Method_17409(Field_17339).Method_17395(0.0f, 3.6153846f * 0.13829787f);
        Field_17342 = new Class_26476(18827 & -31221).\u0000%(2075697407 & 77917695).Method_17433(Class_17281.Method_17367("\u5000\u5004\u5003\u5006\u5001\u5000\u5006\u5007\u5000\u5001\u5006")).Method_17438().Method_17409(Field_17359).Method_17395(0.0f, 1.5416667f * 0.3243243f);
        Field_17308 = new Class_22692(-15857 & 268, (2065 & 1196) != 0).\u0000%(150994943 & 1409286143).Method_17433(Class_17281.Method_17380("\u9079\u9052\u9057\u9013\u9060\u905d\u9053\u905a\u9056\u904a")).Method_17438().Method_17395(0.0f, 10.6f * 0.04716981f).Method_17409(Field_17287);
        Field_17347 = new Class_22692(1309 & -30547, (29697 & -32224) != 0).\u0000%(10526944 & -1061903172).Method_17433(Class_17281.Method_17445("\u80c4\u80e4\u80e0\u80a5\u80c4\u80e4\u80e4\u80e5\u80e9\u80ec\u80ec\u80e9\u80e8")).Method_17438().Method_17409(Field_17356).Method_17395(0.0f, 0.03773585f * 13.25f);
        Field_17301 = new Class_31694(12494 & -30706).\u0000%(-83942657 & 16747775).Method_17433(Class_17281.Method_17443("\u1202\u121b\u1218\u1203\u121c\u1205\u1204\u1207\u1202\u1219\u1202\u120b\u1204\u120f")).Method_17395(0.24179102f * 3.7222223f, 1.0f).Method_17409(Field_17314);
        Field_17313 = new Class_31694(-20401 & 16703).\u0000%(1625438463 & -1851784705).Method_17433(Class_17281.Method_17415("\u0482\u04a2\u04a0\u04a3\u04a5\u04a4\u04a4\u04a6\u048a\u04a8\u04ab\u04aa\u04ad\u04af\u048c\u04af\u04a0\u04a1\u04a2")).Method_17395(2.9333334f * 0.30681816f, 1.0f).Method_17409(Field_17309);
        Field_17336 = new Class_41322(1040 & 20500).\u0000%(16440917 & 1408958173).Method_17433(Class_17281.Method_17439("\u0118\u011e\u011b\u0118\u0116")).Method_17395(3.4583333f * 0.23132531f, 0.29285714f * 1.3658537f).Method_17409(Field_17309);
        Field_17319 = new Class_39271(16789 & 603).\u0000%(80936731 & -2133696750).Method_17433(Class_17281.Method_17405("\u9005\u9025\u9032\u9027\u9035\u9030\u9007\u9027\u9025\u9024\u9032")).Method_17424().Method_17395(2.0f, 0.0f).Method_17409(Field_17356);
        Field_17294 = new Class_32295(6226 & 16402, -14331 & 1584).\u0000%(388125980 & -2011015332).Method_17433(Class_17281.Method_17421("\uaa06\uaa06\uaa00\uaa06\uaa02\uaa04\uaa02\uaa02\uaa04\uaa04\uaa00")).Method_17409(Field_17356);
        Field_17285 = new Class_41349(8211 & -32269, -24412 & 18962).\u0000%(1713274163 & -2137638597).Method_17433(Class_17281.Method_17399("\u2140\u2140\u214a\u2142\u2140\u2148\u214a\u214a\u2140\u2148")).Method_17384(309312053 & -530645391).Method_17395(0.6666667f * 0.375f, 2.25f * 0.35555556f).Method_17409(Field_17356);
        Field_17358 = new Class_29549(2582 & 8276, (-28349 & 17045) != 0).\u0000%(141719962 & -1519191906).Method_17433(Class_17281.Method_17365("\u0892\u08a3\u08a0\u08a3\u08b2\u08b3\u08b0\u08b1\u0892\u08b3\u08b0\u08b1\u08a0\u08b3\u0890\u08b1\u08b0\u08b3")).Method_17409(Field_17325.Method_6338()).Method_17395(0.4347826f * 0.46f, 0.15151516f * 1.98f);
        Field_17335 = new Class_37772(-12267 & 1949, (27156 & 168) != 0).\u0000%(452164361 & 6257501).Method_17433(Class_17281.Method_17412("\u30e9\u30c2\u30cb\u30c2\u30cb\u30c2")).Method_17384(-1873577203 & 1213431769).Method_17395(0.9613095f * 0.9882353f, 1.0304347f * 0.87341774f);
        Field_17289 = new Class_37772(8606 & 6231, (12368 & 17026) != 0).\u0000%(-1938863305 & 3987013).Method_17433(Class_17281.Method_17428("\u1881\u18a4\u18a7\u18a6\u18a1\u18a0\u1887\u18a6\u18ad\u18ad\u18aa")).Method_17384(156465945 & -2131494001).Method_17395(1.6432432f * 0.578125f, 2.05f * 0.4390244f).Method_17409(Field_17356);
        Field_17331 = new Class_37772(11487 & -12265, (-31983 & 15395) != 0).\u0000%(1080728471 & 1064495959).Method_17433(Class_17281.Method_17366("\u0000! ! !\u0000! !")).Method_17384(550731657 & -2124973207).Method_17395(0.39055556f * 2.4324324f, 0.9f * 0.88888896f);
        Field_17338 = new Class_44576(-24552 & 4190).\u0000%(240 & 560).Method_17433(Class_17281.Method_17388("\u6802\u6822\u6821\u6821\u6822\u6808\u6823\u6820\u6823\u6829")).Method_17409(Field_17364);
        Field_17328 = new Class_24413(16665 & 1657).\u0000%(334160605 & 681812612).Method_17433(Class_17281.Method_17374("\u2a10\u2a10\u2a0a\u2a0a\u2a04\u2a44\u2a06\u2a06\u2a08\u2a08\u2a02")).Method_17395(0.20888889f * 0.9574468f, 0.28235295f * 1.0625f).Method_17409(Field_17310);
        Field_17311 = new Class_41322(2078 & -6950).\u0000%(1157296352 & 435879620).Method_17433(Class_17281.Method_17420("\uc300\uc301\uc302\uc303\uc344\uc305\uc306\uc307\uc308\uc309")).Method_17395(0.02317073f * 2.1578948f, 0.12428572f * 2.413793f).Method_17409(Field_17309).Method_17438();
        Field_17334 = new Class_32295(59 & 155, 20518 & 3475).\u0000strictfp(Class_17281.Method_17385("\u404d\u4045\u404f\u404f\u4041\u4008\u404f\u4047\u4045\u4041\u4046\u4042")).Method_17434(540046404 & -726633378);
        Field_17322 = new Class_32295(-32738 & 5501, 3586 & 291).\u0000strictfp(Class_17281.Method_17397("\u1005\u102c\u1025\u1024\u1029\u1021\u1005\u102c\u102d\u1028\u102c\u1029\u1029\u1001\u1020\u1025\u1029\u1024")).Method_17434(50290490 & 1612668722).Method_17409(Field_17356);
        Field_17307 = new Class_32295(-32739 & 14397, 4355 & 1091).\u0000%(423679258 & 541618490).Method_17433(Class_17281.Method_17377("\u90c0\u90e5\u90e4\u90e5\u90e2\u90e3\u90a6\u90c1\u90e4\u90e1\u90e6\u90e1\u90e2"));
        Field_17333 = new Class_41349(159 & 22590, -24392 & 23874).\u0000%(540661083 & 271808330).Method_17433(Class_17281.Method_17390("QPPQ\u0010AQPYX")).Method_17384(7322361 & -1605452239).Method_17438().Method_17395(4.2608695f * -0.11734694f, 4.0f * 0.1f).Method_17409(Field_17286).Method_17436(-1325400065 & 1090519039);
        Field_17290 = new Class_41349(12319 & 159, 4601 & -5116).\u0000%(6569782 & -482426881).Method_17433(Class_17281.Method_17430("\u5011\u5031\u5030\u5030\u5074\u5004\u5035\u5035\u5031\u5031\u5070\u5010\u5035\u5034\u5034\u5025")).Method_17384(-1670398095 & 38730421).Method_17438().Method_17395(3.9375f * -0.12698413f, 0.7113402f * 0.56231886f).Method_17409(Field_17356).Method_17436(-1761607681 & 553648127);
        Field_17326 = new Class_41349(481 & 9276, 5257 & -7929).\u0000%(-2139494831 & 1650425689).Method_17433(Class_17281.Method_17435("\u8020\u8009\u800a\u800b\u8008\u8039\u800a\u8003\u8000\u8001")).Method_17384(72350581 & -908149071).Method_17395(0.34875f * 0.86021507f, 0.51086956f * 1.5659574f).Method_17409(Field_17286);
        Field_17324 = new Class_41349(-6679 & 4131, 4655 & 16385).\u0000%(-925020162 & 21454654).Method_17433(Class_17281.Method_17440("\u0133\u0112\u0111\u0112\u0112\u0123\u0113\u0112\u0119\u011a\u011a\u013b\u011b\u011b\u011a\u0108")).Method_17384(-1353795015 & 7274295).Method_17395(1.073077f * 0.2795699f, 0.8815789f * 0.9074627f).Method_17409(Field_17356);
        Field_17282 = new Class_29549(16418 & 11307, (1801 & 2083) != 0).\u0000%(609775824 & -2133788080).Method_17433(Class_17281.Method_17423("\u8345\u8351\u8354\u8353\u8345\u8344\u8345\u8301\u8340\u8340\u8344\u8345\u8353\u8302")).Method_17409(Field_17325).Method_17395(1.0555556f * 0.18947369f, 0.5f * 0.6f);
        Field_17291 = new Class_30793(-26573 & 99).\u0000%(12448383 & 549305183).Method_17433(Class_17281.Method_17418("\u4012\u4021\u4030\u4023\u402a\u402b\u4022")).Method_17395(0.23225808f * 5.1666665f, 0.0f).Method_17424().Method_17409(Field_17287);
        Field_17350 = new Class_30793(-6364 & 63).\u0000%(1170186086 & 317185388).Method_17433(Class_17281.Method_17404("\u4ccf\u4ccd\u4cc8\u4ccf\u4cc6\u4cc6\u4ccb\u4c8a\u4ccc\u4cc0\u4ccf\u4cca\u4ccd\u4cc9\u4ccf")).Method_17395(1.0f, 0.0f).Method_17424().Method_17409(Field_17284);
        Field_17305 = new Class_22657(17143 & -27347, (5382 & 40) != 0, (10 & 9617) != 0).\u0000%(350176661 & 1123632413).Method_17433(Class_17281.Method_17391("\u8b80\u8ba8\u8baa\u8baa"));
        Field_17362 = new Class_22657(4518 & 1654, (21505 & 2232) != 0, (3291 & 513) != 0).\u0000%(1068619751 & 16422757).Method_17433(Class_17281.Method_17389("\u1006\u1027\u1030\u1023\u1027\u1016\u1023\u1027\u1037\u1027\u1022\u1037\u1027\u1000")).Method_17409(Field_17284);
        Field_17296 = new Class_22657(16431 & 11303, (18691 & 13376) != 0, (10304 & -32384) != 0).\u0000%(13274469 & -1392857985).Method_17433(Class_17281.Method_17408("\u011a\u0132\u0120\u0132\u0176\u0106\u013e\u0136\u012a\u013a\u013a\u012a")).Method_17409(Field_17284);
        Field_17344 = Field_17303;
        Field_17318.Method_17431();
        Field_17321.Method_17431();
        Field_17351.Method_17431();
        Field_17332.Method_17431();
        Field_17337.Method_17431();
        Field_17308.Method_17431();
        Field_17335.Method_17431();
        Field_17331.Method_17431();
        Field_17333.Method_17431();
        Field_17291.Method_17431();
        Field_17350.Method_17431();
        Field_17305.Method_17431();
        Field_17362.Method_17431();
        Field_17296.Method_17431();
        Field_17334.Method_17431();
        Field_17322.Method_17431();
        Field_17307.Method_17431();
        Field_17326.Method_17431();
        Field_17299.Method_17431();
        Field_17282.Method_17431();
        Field_17326.Method_17441(Class_17281.Field_17324.Field_17343 + (233 & 11652)).Method_17433(Class_17281.Method_17370("\u8413\u8405\u8407\u8415\u8406\u8407\u8407\u8402\u841d\u8409\u840a\u840d\u8408\u8408\u840b\u840b\u8415\u8414\u8400\u8412\u8414"));
        Class_17281[] arrclass_17281 = Field_17323;
        int n = arrclass_17281.length;
        for (int i = 4140 & 24641; i < n; ++i) {
            Class_17281 class_17281 = arrclass_17281[i];
            if (class_17281 == null) continue;
            if (Field_17352.containsKey(class_17281.Field_17355)) {
                throw new Error(Class_17281.Method_17406("\ua078\ua050\ua050\ua050\ua058\ua018\ua018") + class_17281.Field_17355 + Class_17281.Method_17417("((ay(hihiha` aq xqhp8QX8") + ((Class_17281)Class_17281.Field_17352.get((Object)class_17281.Field_17355)).Field_17343 + Class_17281.Method_17419("\u2000\u2041\u2046\u2047\u2004") + class_17281.Field_17343);
            }
            Field_17352.put(class_17281.Field_17355, class_17281);
            if (class_17281.Field_17343 >= (13456 & 128)) continue;
            Field_17341.add(class_17281);
        }
        Field_17341.remove(Field_17327);
        Field_17341.remove(Field_17346);
        Field_17341.remove(Field_17304);
        Field_17341.remove(Field_17358);
        Field_17363 = new Class_43999(new Random(2647762L & 139494614L), -32239 & 6435);
        Field_17283 = new Class_43999(new Random(-5475911866397882071L & 276842797L), -32125 & 4113);
        Field_17345 = new Class_29139();
    }

    private static String Method_17380(String string) {
        int n = 21101;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_17281.class, 13);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_17381(String string) {
        int n = 23429;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_17281.class, 6);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static Class_17281 Method_17382(int n, Class_17281 class_17281) {
        if (n >= 0 && n <= Field_17323.length) {
            Class_17281 class_172812 = Field_17323[n];
            return class_172812 == null ? class_17281 : class_172812;
        }
        Field_17295.warn("Biome ID is out of bounds: " + n + ", defaulting to 0 (Ocean)");
        return Field_17303;
    }

    public boolean Method_17383() {
        return this.Method_17369();
    }

    protected Class_17281 Method_17384(int n) {
        this.Field_17330 = n;
        return this;
    }

    private static String Method_17385(String string) {
        int n = 11782;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_17281.class, 28);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_17386(String string) {
        int n = 16974;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_17281.class, 9);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    protected Class_15886 Method_17387() {
        return new Class_15886();
    }

    private static String Method_17388(String string) {
        int n = 32752;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_17281.class, 25);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_17389(String string) {
        int n = 20377;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_17281.class, 39);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_17390(String string) {
        int n = 11965;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_17281.class, 31);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_17391(String string) {
        int n = 23160;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_17281.class, 38);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_7931 Method_17392() {
        return (double)this.Field_17300 < 0.1 * 2.0 ? Class_7931.Field_7933 : ((double)this.Field_17300 < 1.0 ? Class_7931.Field_7935 : Class_7931.Field_7934);
    }

    public void Method_17393(Class_283 class_283, Random random, Class_36425 class_36425, int n, int n2, double d) {
        this.Method_17394(class_283, random, class_36425, n, n2, d);
    }

    public final void Method_17394(Class_283 class_283, Random random, Class_36425 class_36425, int n, int n2, double d) {
        int n3 = class_283.Method_378();
        Class_3436 class_3436 = this.Field_17312;
        Class_3436 class_34362 = this.Field_17361;
        int n4 = -1 & -1;
        int n5 = (int)(d / (156.0 * 0.019230769230769232) + 3.0 * 1.0 + random.nextDouble() * (0.1919191919191919 * 1.3026315789473686));
        int n6 = n & (24655 & -32737);
        int n7 = n2 & (1167 & 63);
        Class_4810 class_4810 = new Class_4810();
        for (int i = 1279 & -21505; i >= 0; --i) {
            if (i <= random.nextInt(1221 & -16089)) {
                class_36425.Method_36430(n7, i, n6, Class_9265.Field_9414.Method_3293());
                continue;
            }
            Class_3436 class_34363 = class_36425.Method_36431(n7, i, n6);
            if (class_34363.Method_3442().Method_3373() == Class_3713.Field_3718) {
                n4 = -1 & -1;
                continue;
            }
            if (class_34363.Method_3442() != Class_9265.Field_9446) continue;
            if (n4 == (-1 & -1)) {
                if (n5 <= 0) {
                    class_3436 = null;
                    class_34362 = Class_9265.Field_9446.Method_3293();
                } else if (i >= n3 - (20774 & 10756) && i <= n3 + (25609 & 775)) {
                    class_3436 = this.Field_17312;
                    class_34362 = this.Field_17361;
                }
                if (i < n3 && (class_3436 == null || class_3436.Method_3442().Method_3373() == Class_3713.Field_3718)) {
                    class_3436 = this.Method_17407(class_4810.Method_4814(n, i, n2)) < 1.060606f * 0.14142859f ? Class_9265.Field_9298.Method_3293() : Class_9265.Field_9286.\u0000strictfp();
                }
                n4 = n5;
                if (i >= n3 - (2081 & 15)) {
                    class_36425.Method_36430(n7, i, n6, class_3436);
                    continue;
                }
                if (i < n3 - (22839 & 135) - n5) {
                    class_3436 = null;
                    class_34362 = Class_9265.Field_9446.Method_3293();
                    class_36425.Method_36430(n7, i, n6, Class_9265.Field_9360.Method_3293());
                    continue;
                }
                class_36425.Method_36430(n7, i, n6, class_34362);
                continue;
            }
            if (n4 <= 0) continue;
            class_36425.Method_36430(n7, i, n6, class_34362);
            if (--n4 != 0 || class_34362.Method_3442() != Class_9265.Field_9394) continue;
            n4 = random.nextInt(1038 & 836) + Math.max(652 & -16032, i - (895 & -31681));
            class_34362 = class_34362.Method_3440(Class_4465.Field_4466) == Class_4508.Field_4512 ? Class_9265.Field_9330.Method_3293() : Class_9265.Field_9366.Method_3293();
        }
    }

    protected Class_17281 Method_17395(float f, float f2) {
        if (f > 0.3882353f * 0.25757575f && f < 0.2f * 1.0f) {
            throw new IllegalArgumentException("Please avoid temperatures in the range 0.1 - 0.2 because of snow");
        }
        this.Field_17300 = f;
        this.Field_17292 = f2;
        return this;
    }

    public static Class_17281 Method_17396(int n) {
        return Class_17281.Method_17382(n, null);
    }

    private static String Method_17397(String string) {
        int n = 12796;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_17281.class, 29);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_17398(String string) {
        int n = 30157;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_17281.class, 8);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_17399(String string) {
        int n = 28918;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_17281.class, 20);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public boolean Method_17400() {
        return (this.Method_17369() ? -24566 & 21268 : this.Field_17349) != 0;
    }

    private static String Method_17401(String string) {
        int n = 17604;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_17281.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_17402(String string) {
        int n = 7568;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_17281.class, 7);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public int Method_17403(Class_4751 class_4751) {
        double d = Class_13337.Method_13360(this.Method_17407(class_4751), 0.0f, 1.0f);
        double d2 = Class_13337.Method_13360(this.Method_17414(), 0.0f, 1.0f);
        return Class_12135.Method_12137(d, d2);
    }

    private static String Method_17404(String string) {
        int n = 13710;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_17281.class, 37);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_17405(String string) {
        int n = 1580;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_17281.class, 18);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_17406(String string) {
        int n = 10489;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_17281.class, 42);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public final float Method_17407(Class_4751 class_4751) {
        if (class_4751.\u0000, `() > (7136 & 8275)) {
            float f = (float)(Field_17363.Method_44005((double)class_4751.\u0000= final() * 1.0 / (0.6020408163265306 * 13.288135593220339), (double)class_4751.\u0000strictfp() * 1.0 / (1.26 * 6.349206349206349)) * (4.810126582278481 * 0.8315789473684211));
            return this.Field_17300 - (f + (float)class_4751.\u0000, `() - 128.0f * 0.5f) * (0.04074074f * 1.2272727f) / (3.2926831f * 9.111111f);
        }
        return this.Field_17300;
    }

    private static String Method_17408(String string) {
        int n = 28888;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_17281.class, 40);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    protected final Class_17281 Method_17409(Class_6335 class_6335) {
        this.Field_17316 = class_6335.Field_6336;
        this.Field_17302 = class_6335.Field_6337;
        return this;
    }

    private static String Method_17410(String string) {
        int n = 11390;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_17281.class, 10);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_17411(String string) {
        int n = 26901;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_17281.class, 11);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_17412(String string) {
        int n = 26589;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_17281.class, 22);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    protected Class_17281 Method_17413(int n, boolean bl) {
        this.Field_17348 = n;
        this.Field_17315 = bl ? (n & (150994686 & 100597503)) >> (449 & -27631) : n;
        return this;
    }

    public final float Method_17414() {
        return this.Field_17292;
    }

    private static String Method_17415(String string) {
        int n = 15130;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_17281.class, 16);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public int Method_17416(float f) {
        f /= 0.20930232f * 14.333334f;
        f = Class_13337.Method_13360(f, 1.5344827f * -0.6516854f, 1.0f);
        return Class_13337.Method_13366(0.1764706f * 3.5259259f - f * (1.6779661f * 0.02979798f), 0.20833333f * 2.4f + f * (0.03561644f * 2.8076923f), 1.0f);
    }

    private static String Method_17417(String string) {
        int n = 9169;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_17281.class, 43);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_17418(String string) {
        int n = 27878;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_17281.class, 36);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_17419(String string) {
        int n = 11989;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_17281.class, 44);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_17420(String string) {
        int n = 11760;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_17281.class, 27);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_17421(String string) {
        int n = 15402;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_17281.class, 19);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_17422(String string) {
        int n = 23737;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_17281.class, 5);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_17423(String string) {
        int n = 5494;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_17281.class, 35);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    protected Class_17281 Method_17424() {
        this.Field_17349 = 398 & 16464;
        return this;
    }

    public static Class_17281[] Method_17425() {
        return Field_17323;
    }

    public boolean Method_17426() {
        return (this.Field_17292 > 0.85294116f * 0.99655175f ? 25873 & 6817 : 1461 & 8) != 0;
    }

    public float Method_17427() {
        return 0.0296875f * 3.368421f;
    }

    private static String Method_17428(String string) {
        int n = 555;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_17281.class, 23);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_4291 Method_17429(Random random) {
        return new Class_41275(Class_5341.Field_5345);
    }

    private static String Method_17430(String string) {
        int n = 22303;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_17281.class, 32);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    protected Class_17281 Method_17431() {
        return this.Method_17441(this.Field_17343 + (-23680 & 1184));
    }

    public boolean Method_17432(Class_17281 class_17281) {
        return (class_17281 == this ? 1189 & -30455 : (class_17281 == null ? 20672 & 534 : (this.Method_17378() == class_17281.Method_17378() ? 9249 & -32247 : 2 & -32572))) != 0;
    }

    protected Class_17281 Method_17433(String string) {
        this.Field_17355 = string;
        return this;
    }

    protected Class_17281 Method_17434(int n) {
        this.Method_17413(n, (-15360 & 6714) != 0);
        return this;
    }

    private static String Method_17435(String string) {
        int n = 5274;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_17281.class, 33);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    protected Class_17281 Method_17436(int n) {
        this.Field_17315 = n;
        return this;
    }

    private void Method_17437() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected Class_17281 Method_17438() {
        this.Field_17360 = -28159 & 19771;
        return this;
    }

    private static String Method_17439(String string) {
        int n = 8674;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_17281.class, 17);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    protected Class_17281(int n) {
        this.Field_17316 = Class_17281.Field_17306.Field_6336;
        this.Field_17302 = Class_17281.Field_17306.Field_6337;
        this.Field_17300 = 0.5729167f * 0.8727273f;
        this.Field_17292 = 3.0f * 0.16666667f;
        this.Field_17320 = -2130706433 & 553648127;
        this.Field_17353 = Lists.newArrayList();
        this.Field_17340 = Lists.newArrayList();
        this.Field_17298 = Lists.newArrayList();
        this.Field_17288 = Lists.newArrayList();
        this.Field_17349 = 67 & 26113;
        this.Field_17329 = new Class_4328((2821 & 12344) != 0);
        this.Field_17297 = new Class_4297((-31616 & 19264) != 0);
        this.Field_17317 = new Class_22522();
        this.Field_17343 = n;
        Class_17281.Field_17323[n] = this;
        this.Field_17293 = this.Method_17387();
        this.Field_17340.add(new Class_31871(Class_46658.class, 16557 & -32178, 2589 & 4, 1093 & -32764));
        this.Field_17340.add(new Class_31871(Class_44525.class, 5258 & -31878, -32181 & 2099, -28605 & 25347));
        this.Field_17340.add(new Class_31871(Class_47600.class, 74 & 1566, 2182 & 1093, -30716 & 21));
        this.Field_17340.add(new Class_31871(Class_46796.class, 9310 & -28022, 676 & 28677, 5380 & 16396));
        this.Field_17340.add(new Class_31871(Class_43539.class, 18763 & 5160, 24614 & 1172, 4740 & -5020));
        this.Field_17353.add(new Class_31871(Class_44290.class, -20124 & 1148, 13316 & 16759, 25735 & 260));
        this.Field_17353.add(new Class_31871(Class_43566.class, 18534 & 4324, 8236 & 17924, 4 & 2309));
        this.Field_17353.add(new Class_31871(Class_43151.class, 2917 & 20710, 7237 & 8844, 8412 & 1029));
        this.Field_17353.add(new Class_31871(Class_43073.class, 1636 & 20582, 4292 & -32756, 16404 & 806));
        this.Field_17353.add(new Class_31871(Class_35570.class, 356 & -15116, 26390 & 4109, 11573 & 4676));
        this.Field_17353.add(new Class_31871(Class_46025.class, 27211 & 4234, -23039 & 343, -13020 & 4628));
        this.Field_17353.add(new Class_31871(Class_44826.class, -4971 & 301, 15443 & 941, 8449 & 17443));
        this.Field_17298.add(new Class_31871(Class_38719.class, 4235 & 17706, 262 & 4116, -32562 & 27413));
        this.Field_17288.add(new Class_31871(Class_47097.class, 586 & 10510, 2424 & 29704, -32114 & 8232));
    }

    private static String Method_17440(String string) {
        int n = 11427;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_17281.class, 34);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    protected Class_17281 Method_17441(int n) {
        return new Class_20941(n, this);
    }

    public Class_4286 Method_17442(Random random) {
        return random.nextInt(16490 & 10378) == 0 ? this.Field_17297 : this.Field_17329;
    }

    private static String Method_17443(String string) {
        int n = 21356;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_17281.class, 15);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_17444(String string) {
        int n = 1713;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_17281.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_17445(String string) {
        int n = 29197;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_17281.class, 14);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }
}

