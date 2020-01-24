/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  tv.twitch.chat.ChatUserInfo
 *  tv.twitch.chat.ChatUserMode
 *  tv.twitch.chat.ChatUserSubscription
 */
import com.google.common.collect.Lists;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import tv.twitch.chat.ChatUserInfo;
import tv.twitch.chat.ChatUserMode;
import tv.twitch.chat.ChatUserSubscription;

public class Class_45878
extends Class_1490 {
    private final Class_1821 Field_45879;
    private final Class_1782 Field_45880;
    private static final Class_5478 Field_45881 = Class_5478.Field_5482;
    private int Field_45882;
    private static final Class_5478 Field_45883;
    private final ChatUserInfo Field_45884;
    private final List Field_45885 = Lists.newArrayList();
    private static final Class_5478 Field_45886;

    public void Method_45887(int n, int n2, float f) {
        this.\u0000, 2();
        this.\u0000strictfp(this.\u0000strictfp, this.Field_45880.Method_1788(), this.\u0000= final / (8291 & -28018), 21718 & 8294, -2113929217 & 721420287);
        int n3 = 113 & 592;
        for (Class_1782 class_1782 : this.Field_45885) {
            this.\u0000, `(this.\u0000strictfp, class_1782.Method_1783(), this.Field_45882, n3, 369098751 & 16777215);
            n3 += 1165 & -16375;
        }
        super.Method_1545(n, n2, f);
    }

    public void Method_45888() {
        int n = this.\u0000= final / (-32381 & 1039);
        int n2 = n - (-29566 & 17290);
        this.\u0000strictfp.add(new Class_42376(2787 & -3047, n * (321 & -30592) + n2 / (21251 & -30566), this.\u0000, ` - (15174 & -15130), 1155 & 18594, 1045 & 542, Class_9802.Method_9806("stream.userinfo.timeout", new Object[6171 & 576])));
        this.\u0000strictfp.add(new Class_42376(2336 & 68, n * (20501 & -23391) + n2 / (2099 & -32758), this.\u0000, ` - (9959 & -28586), 18818 & 162, 9268 & -30435, Class_9802.Method_9806("stream.userinfo.ban", new Object[384 & 29698])));
        this.\u0000strictfp.add(new Class_42376(4614 & -32750, n * (8990 & 3139) + n2 / (24610 & 3794), this.\u0000, ` - (-30106 & 343), 166 & 12698, 1557 & 8246, Class_9802.Method_9806("stream.userinfo.mod", new Object[904 & -16320])));
        this.\u0000strictfp.add(new Class_42376(4309 & 10245, n * (-28519 & 518) + n2 / (2578 & 9283), this.\u0000, ` - (17005 & 10429), 1218 & 4510, 19988 & 4212, Class_9802.Method_9806("gui.cancel", new Object[6152 & 196])));
        this.\u0000strictfp.add(new Class_42376(12559 & 20131, n * (8283 & 20897) + n2 / (4675 & -5102), this.\u0000, ` - (-32209 & 45), 18562 & 5515, -4076 & 1044, Class_9802.Method_9806("stream.userinfo.unban", new Object[9262 & 81])));
        this.\u0000strictfp.add(new Class_42376(2678 & 9220, n * (9255 & 16706) + n2 / (5187 & -16362), this.\u0000, ` - (-28435 & 25389), 2514 & 1698, 16413 & -23980, Class_9802.Method_9806("stream.userinfo.unmod", new Object[-18207 & 20])));
        int n3 = 516 & -32654;
        for (Class_1782 class_1782 : this.Field_45885) {
            n3 = Math.max(n3, this.\u0000strictfp.Method_28715(class_1782.Method_1783()));
        }
        this.Field_45882 = this.\u0000= final / (26898 & 683) - n3 / (17219 & 30);
    }

    public static Class_1782 Method_45889(ChatUserMode chatUserMode, String string, boolean bl) {
        Class_2849 class_2849 = null;
        if (chatUserMode == ChatUserMode.TTV_CHAT_USERMODE_ADMINSTRATOR) {
            class_2849 = new Class_2849("stream.user.mode.administrator", new Object[2309 & 4144]);
            class_2849.Method_1789().Method_2917(Field_45883);
        } else if (chatUserMode == ChatUserMode.TTV_CHAT_USERMODE_BANNED) {
            if (string == null) {
                class_2849 = new Class_2849("stream.user.mode.banned", new Object[25603 & 6608]);
            } else if (bl) {
                class_2849 = new Class_2849("stream.user.mode.banned.self", new Object[8577 & 2064]);
            } else {
                Object[] arrobject = new Object[177 & -15357];
                arrobject[13472 & -32253] = string;
                class_2849 = new Class_2849("stream.user.mode.banned.other", arrobject);
            }
            class_2849.Method_1789().Method_2917(Field_45886);
        } else if (chatUserMode == ChatUserMode.TTV_CHAT_USERMODE_BROADCASTER) {
            class_2849 = string == null ? new Class_2849("stream.user.mode.broadcaster", new Object[0 & 2121]) : (bl ? new Class_2849("stream.user.mode.broadcaster.self", new Object[34 & 8960]) : new Class_2849("stream.user.mode.broadcaster.other", new Object[3793 & -32508]));
            class_2849.Method_1789().Method_2917(Field_45881);
        } else if (chatUserMode == ChatUserMode.TTV_CHAT_USERMODE_MODERATOR) {
            if (string == null) {
                class_2849 = new Class_2849("stream.user.mode.moderator", new Object[4248 & -23552]);
            } else if (bl) {
                class_2849 = new Class_2849("stream.user.mode.moderator.self", new Object[-16110 & 8321]);
            } else {
                Object[] arrobject = new Object[2505 & 8753];
                arrobject[1833 & -32768] = string;
                class_2849 = new Class_2849("stream.user.mode.moderator.other", arrobject);
            }
            class_2849.Method_1789().Method_2917(Field_45881);
        } else if (chatUserMode == ChatUserMode.TTV_CHAT_USERMODE_STAFF) {
            class_2849 = new Class_2849("stream.user.mode.staff", new Object[1128 & 8336]);
            class_2849.Method_1789().Method_2917(Field_45883);
        }
        return class_2849;
    }

    protected void Method_45890(Class_42376 class_42376) {
        if (class_42376.Field_42388) {
            if (class_42376.Field_42392 == 0) {
                this.Field_45879.Method_1837("/ban " + this.Field_45884.displayName);
            } else if (class_42376.Field_42392 == (9319 & -30325)) {
                this.Field_45879.Method_1837("/unban " + this.Field_45884.displayName);
            } else if (class_42376.Field_42392 == (2202 & 8774)) {
                this.Field_45879.Method_1837("/mod " + this.Field_45884.displayName);
            } else if (class_42376.Field_42392 == (2853 & -20396)) {
                this.Field_45879.Method_1837("/unmod " + this.Field_45884.displayName);
            } else if (class_42376.Field_42392 == (30793 & 1045)) {
                this.Field_45879.Method_1837("/timeout " + this.Field_45884.displayName);
            }
            this.\u0000strictfp.Method_218(null);
        }
    }

    static {
        Field_45886 = Class_5478.Field_5505;
        Field_45883 = Class_5478.Field_5484;
    }

    private void Method_45891() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public static Class_1782 Method_45892(ChatUserSubscription chatUserSubscription, String string, boolean bl) {
        Class_2849 class_2849 = null;
        if (chatUserSubscription == ChatUserSubscription.TTV_CHAT_USERSUB_SUBSCRIBER) {
            if (string == null) {
                class_2849 = new Class_2849("stream.user.subscription.subscriber", new Object[24578 & 1541]);
            } else if (bl) {
                class_2849 = new Class_2849("stream.user.subscription.subscriber.self", new Object[21518 & 2049]);
            } else {
                Object[] arrobject = new Object[17 & 4429];
                arrobject[2072 & -16384] = string;
                class_2849 = new Class_2849("stream.user.subscription.subscriber.other", arrobject);
            }
            class_2849.Method_1789().Method_2917(Field_45881);
        } else if (chatUserSubscription == ChatUserSubscription.TTV_CHAT_USERSUB_TURBO) {
            class_2849 = new Class_2849("stream.user.subscription.turbo", new Object[-22483 & 1154]);
            class_2849.Method_1789().Method_2917(Field_45883);
        }
        return class_2849;
    }

    public static List Method_45893(Set set, Set set2, Class_1821 class_1821) {
        Class_1782 class_1782;
        Class_2840 class_2840;
        String string = class_1821 == null ? null : class_1821.Method_1846();
        int n = class_1821 != null && class_1821.Method_1841() ? 2053 & 203 : 10582 & 5121;
        ArrayList arrayList = Lists.newArrayList();
        for (ChatUserMode chatUserMode : set) {
            class_1782 = Class_45878.Method_45889(chatUserMode, string, n != 0);
            if (class_1782 == null) continue;
            class_2840 = new Class_2840("- ");
            class_2840.Method_1787(class_1782);
            arrayList.add(class_2840);
        }
        for (ChatUserMode chatUserMode : set2) {
            class_1782 = Class_45878.Method_45892((ChatUserSubscription)chatUserMode, string, n != 0);
            if (class_1782 == null) continue;
            class_2840 = new Class_2840("- ");
            class_2840.Method_1787(class_1782);
            arrayList.add(class_2840);
        }
        return arrayList;
    }

    public Class_45878(Class_1821 class_1821, ChatUserInfo chatUserInfo) {
        this.Field_45879 = class_1821;
        this.Field_45884 = chatUserInfo;
        this.Field_45880 = new Class_2840(chatUserInfo.displayName);
        this.Field_45885.addAll(Class_45878.Method_45893(chatUserInfo.modes, chatUserInfo.subscriptions, class_1821));
    }
}

