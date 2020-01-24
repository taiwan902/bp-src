/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  internal.org.lwjgl.input.Keyboard
 *  org.apache.commons.lang3.StringUtils
 */
import internal.org.lwjgl.input.Keyboard;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Random;
import org.apache.commons.lang3.StringUtils;

public class Class_38966
extends Class_1490 {
    private boolean Field_38967;
    public String Field_38968 = "";
    private Class_42376 Field_38969;
    private Class_42376 Field_38970;
    private boolean Field_38971;
    private boolean Field_38972 = 37 & 4361;
    private Class_42376 Field_38973;
    private Class_42376 Field_38974;
    private String Field_38975;
    private int Field_38976;
    private String Field_38977 = "survival";
    private String Field_38978;
    private String Field_38979;
    private Class_38813 Field_38980;
    private boolean Field_38981;
    private boolean Field_38982;
    private Class_38813 Field_38983;
    private boolean Field_38984;
    private Class_42376 Field_38985;
    private Class_42376 Field_38986;
    private boolean Field_38987;
    private static final String[] Field_38988;
    private String Field_38989;
    private String Field_38990;
    private Class_42376 Field_38991;
    private Class_1490 Field_38992;
    private String Field_38993;

    private static String Method_38994(String string) {
        int n = 12547;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_38966.class, 6);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_38995(boolean bl) {
        this.Field_38967 = bl;
        if (Class_43755.Field_43757[this.Field_38976] == Class_43755.Field_43756) {
            this.Field_38969.Field_42378 = !this.Field_38967 ? 7 & 18449 : 3392 & -32599;
            this.Field_38969.Field_42388 = 8449 & 23244;
            if (this.Field_38978 == null) {
                this.Field_38978 = this.Field_38977;
            }
            this.Field_38977 = "spectator";
            this.Field_38986.Field_42378 = 1808 & 4103;
            this.Field_38985.Field_42378 = 4292 & -31486;
            this.Field_38973.Field_42378 = this.Field_38967;
            this.Field_38974.Field_42378 = 4097 & -14564;
            this.Field_38991.Field_42378 = 164 & 12313;
        } else {
            this.Field_38969.Field_42378 = !this.Field_38967 ? 2075 & -24319 : 1248 & 18946;
            this.Field_38969.Field_42388 = -32419 & 5153;
            if (this.Field_38978 != null) {
                this.Field_38977 = this.Field_38978;
                this.Field_38978 = null;
            }
            this.Field_38986.Field_42378 = this.Field_38967 && Class_43755.Field_43757[this.Field_38976] != Class_43755.Field_43760 ? -31035 & 8243 : 260 & 20619;
            this.Field_38985.Field_42378 = this.Field_38967;
            this.Field_38973.Field_42378 = this.Field_38967;
            this.Field_38974.Field_42378 = this.Field_38967;
            this.Field_38991.Field_42378 = this.Field_38967 && (Class_43755.Field_43757[this.Field_38976] == Class_43755.Field_43769 || Class_43755.Field_43757[this.Field_38976] == Class_43755.Field_43760) ? 4131 & -22519 : 259 & -31524;
        }
        this.Method_39010();
        this.Field_38970.Field_42381 = this.Field_38967 ? Class_9802.Method_9806("gui.done", new Object[18504 & 12304]) : Class_9802.Method_9806("selectWorld.moreWorldOptions", new Object[4237 & -30462]);
    }

    private boolean Method_38996() {
        Class_43755 class_43755 = Class_43755.Field_43757[this.Field_38976];
        return (class_43755 != null && class_43755.Method_43790() ? (int)((class_43755 == Class_43755.Field_43756 ? Class_38966.\u0000
        () : 24663 & -31199) ? 1 : 0) : 10306 & 4144) != 0;
    }

    public void Method_38997(Class_31717 class_31717) {
        Object[] arrobject = new Object[-28547 & 16643];
        arrobject[1560 & 8452] = class_31717.Method_31831();
        this.Field_38975 = Class_9802.Method_9806("selectWorld.newWorld.copyOf", arrobject);
        this.Field_38979 = class_31717.Method_31827() + "";
        this.Field_38976 = class_31717.Method_31833().Method_43789();
        this.Field_38968 = class_31717.Method_31778();
        this.Field_38972 = class_31717.Method_31835();
        this.Field_38971 = class_31717.Method_31774();
        if (class_31717.Method_31839()) {
            this.Field_38977 = "hardcore";
        } else if (class_31717.Method_31777().Method_35676()) {
            this.Field_38977 = "survival";
        } else if (class_31717.Method_31777().Method_35665()) {
            this.Field_38977 = "creative";
        }
    }

    public void Method_38998() {
        this.Field_38983.Method_38847();
        this.Field_38980.Method_38847();
    }

    private void Method_38999() {
        this.Method_38995((!this.Field_38967 ? -31925 & 8337 : 25105 & 3232) != 0);
    }

    private static String Method_39000(String string) {
        int n = 25246;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_38966.class, 17);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_39001(String string) {
        int n = 32543;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_38966.class, 7);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    protected void Method_39002(int n, int n2, int n3) {
        super.Method_1537(n, n2, n3);
        if (this.Field_38967) {
            this.Field_38980.Method_38855(n, n2, n3);
        } else {
            this.Field_38983.Method_38855(n, n2, n3);
        }
    }

    private void Method_39003() {
        this.Field_38993 = this.Field_38983.Method_38848().trim();
        char[] arrc = Class_12053.Field_12054;
        int n = arrc.length;
        for (int i = -11008 & 2601; i < n; ++i) {
            char c = arrc[i];
            this.Field_38993 = this.Field_38993.replace(c, (char)(95 & -29473));
        }
        if (StringUtils.isEmpty((CharSequence)this.Field_38993)) {
            this.Field_38993 = "World";
        }
        this.Field_38993 = Class_38966.Method_39028(this.\u0000strictfp.Method_172(), this.Field_38993);
    }

    protected void Method_39004(Class_42376 class_42376) {
        if (class_42376.Field_42388) {
            if (class_42376.Field_42392 == (-19455 & 16483)) {
                this.\u0000strictfp.Method_218(this.Field_38992);
            } else if (class_42376.Field_42392 == 0) {
                this.\u0000strictfp.Method_218(null);
                if (this.Field_38982) {
                    return;
                }
                this.Field_38982 = 9377 & 16925;
                long l = new Random().nextLong();
                String string = this.Field_38980.Method_38848();
                if (!StringUtils.isEmpty((CharSequence)string)) {
                    try {
                        long l2 = Long.parseLong(string);
                        if (l2 != (553649208L & 67420672L)) {
                            l = l2;
                        }
                    }
                    catch (NumberFormatException numberFormatException) {
                        l = string.hashCode();
                    }
                }
                Class_35650 class_35650 = Class_35650.Method_35674(this.Field_38977);
                Class_9780 class_9780 = new Class_9780(l, class_35650, this.Field_38972, this.Field_38987, Class_43755.Field_43757[this.Field_38976]);
                class_9780.Method_9789(this.Field_38968);
                if (this.Field_38981 && !this.Field_38987) {
                    class_9780.Method_9796();
                }
                if (this.Field_38971 && !this.Field_38987) {
                    class_9780.Method_9800();
                }
                this.\u0000strictfp.Method_186(this.Field_38993, this.Field_38983.Method_38848().trim(), class_9780);
            } else if (class_42376.Field_42392 == (-32685 & 2091)) {
                this.Method_38999();
            } else if (class_42376.Field_42392 == (146 & 5122)) {
                if (this.Field_38977.equals("survival")) {
                    if (!this.Field_38984) {
                        this.Field_38971 = 13333 & -14262;
                    }
                    this.Field_38987 = -16295 & 2176;
                    this.Field_38977 = "hardcore";
                    this.Field_38987 = 8803 & -28403;
                    this.Field_38974.Field_42388 = 9730 & 16485;
                    this.Field_38985.Field_42388 = 18738 & 8197;
                    this.Method_39010();
                } else if (this.Field_38977.equals("hardcore")) {
                    if (!this.Field_38984) {
                        this.Field_38971 = 8209 & 2819;
                    }
                    this.Field_38987 = -31052 & 66;
                    this.Field_38977 = "creative";
                    this.Method_39010();
                    this.Field_38987 = -16240 & 14600;
                    this.Field_38974.Field_42388 = 18945 & 145;
                    this.Field_38985.Field_42388 = -30453 & 29393;
                } else {
                    if (!this.Field_38984) {
                        this.Field_38971 = 9225 & 6498;
                    }
                    this.Field_38977 = "survival";
                    this.Method_39010();
                    this.Field_38974.Field_42388 = 69 & 24585;
                    this.Field_38985.Field_42388 = -26431 & 8241;
                    this.Field_38987 = 6402 & 18020;
                }
                this.Method_39010();
            } else if (class_42376.Field_42392 == (1100 & 16404)) {
                this.Field_38972 = !this.Field_38972 ? -24319 & 5187 : -28414 & 17508;
                this.Method_39010();
            } else if (class_42376.Field_42392 == (4103 & 19015)) {
                this.Field_38981 = !this.Field_38981 ? 2053 & 9217 : 4098 & -7168;
                this.Method_39010();
            } else if (class_42376.Field_42392 == (2583 & 5)) {
                this.Field_38976 += 899 & 24593;
                if (this.Field_38976 >= Class_43755.Field_43757.length) {
                    this.Field_38976 = 1040 & 685;
                }
                while (!this.Method_38996()) {
                    this.Field_38976 += 2091 & -7807;
                    if (this.Field_38976 < Class_43755.Field_43757.length) continue;
                    this.Field_38976 = -24568 & 17968;
                }
                this.Field_38968 = "";
                this.Method_39010();
                this.Method_38995(this.Field_38967);
            } else if (class_42376.Field_42392 == (2182 & 22)) {
                this.Field_38984 = -28153 & 193;
                this.Field_38971 = !this.Field_38971 ? 7337 & 8257 : -12268 & 8449;
                this.Method_39010();
            } else if (class_42376.Field_42392 == (-16307 & 3594)) {
                if (Class_43755.Field_43757[this.Field_38976] == Class_43755.Field_43769) {
                    this.\u0000strictfp.Method_218(new Class_27720(this, this.Field_38968));
                } else {
                    this.\u0000strictfp.Method_218(new Class_29800(this, this.Field_38968));
                }
            }
        }
    }

    private static String Method_39005(String string) {
        int n = 8440;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_38966.class, 21);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_39006(String string) {
        int n = 5386;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_38966.class, 24);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_39007(String string) {
        int n = 14764;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_38966.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_39008() {
        Keyboard.enableRepeatEvents((16517 & -24509) != 0);
        this.\u0000strictfp.clear();
        this.\u0000strictfp.add(new Class_42376(-23160 & 2576, this.\u0000= final / (2451 & 10) - (1179 & 8379), this.\u0000, ` - (22716 & 9245), 2270 & -23370, 19039 & -32748, Class_9802.Method_9806("selectWorld.create", new Object[10528 & 4229])));
        this.\u0000strictfp.add(new Class_42376(8209 & 1291, this.\u0000= final / (8210 & 22915) + (17165 & -32729), this.\u0000, ` - (-11940 & 1692), 6902 & 159, 16476 & 2868, Class_9802.Method_9806("gui.cancel", new Object[2216 & -32768])));
        this.Field_38969 = new Class_42376(16534 & -30613, this.\u0000= final / (518 & 170) - (3275 & 79), 2419 & 25855, -32585 & 6614, 17557 & 604, Class_9802.Method_9806("selectWorld.gameMode", new Object[1216 & 16396]));
        this.\u0000strictfp.add(this.Field_38969);
        this.Field_38970 = new Class_42376(-20973 & 331, this.\u0000= final / (16563 & -30714) - (2143 & 587), 187 & 5055, -23650 & 6295, 29725 & 2966, Class_9802.Method_9806("selectWorld.moreWorldOptions", new Object[-15199 & 8706]));
        this.\u0000strictfp.add(this.Field_38970);
        this.Field_38986 = new Class_42376(4100 & -30442, this.\u0000= final / (10282 & 20994) - (4255 & 1755), -23964 & 18924, 25054 & -32586, -15212 & 12340, Class_9802.Method_9806("selectWorld.mapFeatures", new Object[0 & 544]));
        this.\u0000strictfp.add(this.Field_38986);
        this.Field_38986.Field_42378 = 20550 & -32512;
        this.Field_38985 = new Class_42376(8199 & -27825, this.\u0000= final / (4106 & 8518) + (29469 & 231), 8375 & -28457, 16606 & -28265, 25365 & 1118, Class_9802.Method_9806("selectWorld.bonusItems", new Object[4356 & 16530]));
        this.\u0000strictfp.add(this.Field_38985);
        this.Field_38985.Field_42378 = 164 & 8528;
        this.Field_38973 = new Class_42376(-31715 & 4357, this.\u0000= final / (-30717 & 9510) + (613 & 269), 1390 & -12188, 150 & 255, -4042 & 413, Class_9802.Method_9806("selectWorld.mapType", new Object[5762 & 2348]));
        this.\u0000strictfp.add(this.Field_38973);
        this.Field_38973.Field_42378 = 1376 & 16392;
        this.Field_38974 = new Class_42376(4102 & 167, this.\u0000= final / (8194 & -24997) - (-32613 & 20927), -32105 & 16567, 5334 & -32618, 13212 & 22, Class_9802.Method_9806("selectWorld.allowCommands", new Object[4635 & -8192]));
        this.\u0000strictfp.add(this.Field_38974);
        this.Field_38974.Field_42378 = -16095 & 8718;
        this.Field_38991 = new Class_42376(-32726 & 520, this.\u0000= final / (4099 & 8530) + (8749 & -11193), 760 & -32388, 22166 & 150, 4276 & -30114, Class_9802.Method_9806("selectWorld.customizeType", new Object[22560 & 523]));
        this.\u0000strictfp.add(this.Field_38991);
        this.Field_38991.Field_42378 = 17600 & -24576;
        this.Field_38983 = new Class_38813(11051 & 9, this.\u0000strictfp, this.\u0000= final / (16647 & 34) - (17517 & 8308), 893 & -32580, 14540 & 1224, -32682 & 25620);
        this.Field_38983.Method_38858((13953 & 11) != 0);
        this.Field_38983.Method_38853(this.Field_38975);
        this.Field_38980 = new Class_38813(20494 & 2203, this.\u0000strictfp, this.\u0000= final / (8419 & 18710) - (740 & 4452), -28356 & 9278, 2249 & 216, 1654 & 20);
        this.Field_38980.Method_38853(this.Field_38979);
        this.Method_38995(this.Field_38967);
        this.Method_39003();
        this.Method_39010();
    }

    private static String Method_39009(String string) {
        int n = 9835;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_38966.class, 12);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_39010() {
        this.Field_38969.Field_42381 = Class_9802.Method_9806("selectWorld.gameMode", new Object[-28760 & 4177]) + ": " + Class_9802.Method_9806("selectWorld.gameMode." + this.Field_38977, new Object[392 & -20480]);
        this.Field_38990 = Class_9802.Method_9806("selectWorld.gameMode." + this.Field_38977 + ".line1", new Object[-27248 & 2562]);
        this.Field_38989 = Class_9802.Method_9806("selectWorld.gameMode." + this.Field_38977 + ".line2", new Object[-28656 & 18436]);
        this.Field_38986.Field_42381 = Class_9802.Method_9806("selectWorld.mapFeatures", new Object[19048 & 0]) + " ";
        this.Field_38986.Field_42381 = this.Field_38972 ? this.Field_38986.Field_42381 + Class_9802.Method_9806("options.on", new Object[21 & 3080]) : this.Field_38986.Field_42381 + Class_9802.Method_9806("options.off", new Object[9 & -32256]);
        this.Field_38985.Field_42381 = Class_9802.Method_9806("selectWorld.bonusItems", new Object[20612 & 800]) + " ";
        this.Field_38985.Field_42381 = this.Field_38981 && !this.Field_38987 ? this.Field_38985.Field_42381 + Class_9802.Method_9806("options.on", new Object[-32188 & 8]) : this.Field_38985.Field_42381 + Class_9802.Method_9806("options.off", new Object[3072 & 16400]);
        this.Field_38973.Field_42381 = Class_9802.Method_9806("selectWorld.mapType", new Object[16665 & 3590]) + " " + Class_9802.Method_9806(Class_43755.Field_43757[this.Field_38976].Method_43777(), new Object[27792 & -32695]);
        this.Field_38974.Field_42381 = Class_9802.Method_9806("selectWorld.allowCommands", new Object[4121 & 24966]) + " ";
        this.Field_38974.Field_42381 = this.Field_38971 && !this.Field_38987 ? this.Field_38974.Field_42381 + Class_9802.Method_9806("options.on", new Object[-12193 & 8704]) : this.Field_38974.Field_42381 + Class_9802.Method_9806("options.off", new Object[-32640 & 348]);
    }

    private static String Method_39011(String string) {
        int n = 30312;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_38966.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_39012(String string) {
        int n = 339;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_38966.class, 5);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_39013(String string) {
        int n = 5934;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_38966.class, 15);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_39014(String string) {
        int n = 14603;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_38966.class, 13);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_39015(String string) {
        int n = 16576;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_38966.class, 10);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_38966(Class_1490 class_1490) {
        this.Field_38992 = class_1490;
        this.Field_38979 = "";
        this.Field_38975 = Class_9802.Method_9806("selectWorld.newWorld", new Object[10661 & 1024]);
    }

    static {
        String[] arrstring = new String[21241 & -32486];
        arrstring[-15871 & 4388] = Class_38966.Method_39007("\u6480\u6485\u6484");
        arrstring[-32639 & 3591] = Class_38966.Method_39011("\u1400\u1404\u1404");
        arrstring[394 & -6061] = Class_38966.Method_39021("\u18a1\u18a1\u18a1");
        arrstring[17455 & 8451] = Class_38966.Method_39018("\u0210\u0204\u020a");
        arrstring[4116 & 3374] = Class_38966.Method_39012("\u0350\u0355\u0356\u0353\u0350\u0315");
        arrstring[5253 & 2077] = Class_38966.Method_38994("\u4263\u4261\u4263");
        arrstring[-24554 & 143] = Class_38966.Method_39001("\u7082\u7087\u7086\u70c3");
        arrstring[-15865 & 4567] = Class_38966.Method_39026("\u0a00\u0a00\u0a02\u0a02");
        arrstring[8490 & -15336] = Class_38966.Method_39017("\ue209\ue200\ue203\ue268");
        arrstring[-14167 & 587] = Class_38966.Method_39015("\u0828\u0821\u0822\u080a");
        arrstring[9547 & -26598] = Class_38966.Method_39030("\ua461\ua468\ua469\ua410");
        arrstring[4111 & 811] = Class_38966.Method_39009("\u1980\u1981\u1982\u19e3");
        arrstring[-29489 & 4108] = Class_38966.Method_39014("\u6580\u6581\u6582\u65c1");
        arrstring[16399 & -22723] = Class_38966.Method_39023("\u1278\u1271\u1270\u1200");
        arrstring[1070 & -22002] = Class_38966.Method_39013("\u3c02\u3c0b\u3c0a\u3c0b");
        arrstring[29295 & -32497] = Class_38966.Method_39027("\u0300\u0301\u0302\u0342");
        arrstring[16528 & 12566] = Class_38966.Method_39000("\u0606\u0603\u0604\u0603");
        arrstring[29201 & -31727] = Class_38966.Method_39031("\u3004\u3000\u3006\u3000");
        arrstring[274 & 26226] = Class_38966.Method_39029("\u0401\u0400\u0401\u0420");
        arrstring[147 & 28727] = Class_38966.Method_39022("\u9000\u9018\u9018\u9038");
        arrstring[24596 & -28004] = Class_38966.Method_39005("\u4824\u4831\u4836\u4817");
        arrstring[597 & 21] = Class_38966.Method_39025("\u00b2\u00a7\u00a0\u00c3");
        arrstring[23614 & 534] = Class_38966.Method_39019("\u0001\u001c\u0019\u0014");
        arrstring[6167 & 8855] = Class_38966.Method_39006("\u1084\u1081\u1084\u1081");
        Field_38988 = arrstring;
    }

    public void Method_39016() {
        Keyboard.enableRepeatEvents((2052 & 4288) != 0);
    }

    private static String Method_39017(String string) {
        int n = 6034;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_38966.class, 9);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_39018(String string) {
        int n = 435;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_38966.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_39019(String string) {
        int n = 16195;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_38966.class, 23);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    protected void Method_39020(char c, int n) {
        if (this.Field_38983.Method_38861() && !this.Field_38967) {
            this.Field_38983.Method_38854(c, n);
            this.Field_38975 = this.Field_38983.Method_38848();
        } else if (this.Field_38980.Method_38861() && this.Field_38967) {
            this.Field_38980.Method_38854(c, n);
            this.Field_38979 = this.Field_38980.Method_38848();
        }
        if (n == (8220 & -31364) || n == (-25444 & 16574)) {
            this.Method_39004((Class_42376)this.\u0000strictfp.get(-32698 & 4352));
        }
        ((Class_42376)this.\u0000strictfp.get((int)(-22224 & 0))).Field_42388 = this.Field_38983.Method_38848().length() > 0 ? 1537 & -16223 : -32688 & 551;
        this.Method_39003();
    }

    private static String Method_39021(String string) {
        int n = 4040;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_38966.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_39022(String string) {
        int n = 4843;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_38966.class, 20);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_39023(String string) {
        int n = 25180;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_38966.class, 14);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_39024() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private static String Method_39025(String string) {
        int n = 3755;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_38966.class, 22);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_39026(String string) {
        int n = 1157;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_38966.class, 8);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_39027(String string) {
        int n = 22852;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_38966.class, 16);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static String Method_39028(Class_2047 class_2047, String string) {
        string = string.replaceAll("[\\./\"]", "_");
        String[] arrstring = Field_38988;
        int n = arrstring.length;
        for (int i = 8 & 644; i < n; ++i) {
            String string2 = arrstring[i];
            if (!string.equalsIgnoreCase(string2)) continue;
            string = "_" + string + "_";
        }
        while (class_2047.Method_2054(string) != null) {
            string = string + "-";
        }
        return string;
    }

    private static String Method_39029(String string) {
        int n = 32558;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_38966.class, 19);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_39030(String string) {
        int n = 2794;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_38966.class, 11);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_39031(String string) {
        int n = 17820;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_38966.class, 18);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_39032(int n, int n2, float f) {
        this.\u0000, 2();
        this.\u0000strictfp(this.\u0000strictfp, Class_9802.Method_9806("selectWorld.create", new Object[-23376 & 2560]), this.\u0000= final / (1059 & 6), -31651 & 16406, -1 & -1);
        if (this.Field_38967) {
            this.\u0000, `(this.\u0000strictfp, Class_9802.Method_9806("selectWorld.enterSeed", new Object[1172 & -24056]), this.\u0000= final / (4711 & 2066) - (22644 & -31387), 4271 & -32721, -5775192 & -5200907);
            this.\u0000, `(this.\u0000strictfp, Class_9802.Method_9806("selectWorld.seedInfo", new Object[8226 & 256]), this.\u0000= final / (-31742 & 458) - (8292 & -27276), 4693 & -24489, -6117712 & -1529624);
            if (this.Field_38986.Field_42378) {
                this.\u0000, `(this.\u0000strictfp, Class_9802.Method_9806("selectWorld.mapFeatures.info", new Object[16449 & 4096]), this.\u0000= final / (2 & 17923) - (-31585 & 24758), 1146 & 12538, -4874014 & -5724768);
            }
            if (this.Field_38974.Field_42378) {
                this.\u0000, `(this.\u0000strictfp, Class_9802.Method_9806("selectWorld.allowCommands.info", new Object[6156 & -32511]), this.\u0000= final / (426 & -16366) - (24982 & 1759), 2492 & 4269, -6116872 & -4857694);
            }
            this.Field_38980.Method_38849();
            if (Class_43755.Field_43757[this.Field_38976].Method_43778()) {
                this.\u0000strictfp.Method_28688(Class_9802.Method_9806(Class_43755.Field_43757[this.Field_38976].Method_43776(), new Object[-28288 & 16410]), this.Field_38973.Field_42391 + (2323 & -23350), this.Field_38973.Field_42390 + (534 & 12502), this.Field_38973.Method_42395(), 283813104 & -1566510685);
            }
        } else {
            this.\u0000, `(this.\u0000strictfp, Class_9802.Method_9806("selectWorld.enterName", new Object[-15772 & 130]), this.\u0000= final / (2726 & -20222) - (1644 & -16267), 11455 & 17263, -1728285 & -5723736);
            this.\u0000, `(this.\u0000strictfp, Class_9802.Method_9806("selectWorld.resultFolder", new Object[-24320 & 1172]) + " " + this.Field_38993, this.\u0000= final / (166 & 26186) - (24676 & 485), 93 & 14807, -5723984 & -6248735);
            this.Field_38983.Method_38849();
            this.\u0000, `(this.\u0000strictfp, this.Field_38990, this.\u0000= final / (28678 & -30142) - (4198 & 10364), 26793 & -28279, -986968 & -5986080);
            this.\u0000, `(this.\u0000strictfp, this.Field_38989, this.\u0000= final / (13515 & 2) - (247 & 3684), 437 & 149, -5183064 & -6118172);
        }
        super.Method_1545(n, n2, f);
    }
}

