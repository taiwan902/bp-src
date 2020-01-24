/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.collect.Iterators
 *  com.google.common.collect.Lists
 *  com.mojang.authlib.Agent
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.GameProfileRepository
 *  com.mojang.authlib.ProfileLookupCallback
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.base.Predicate;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.mojang.authlib.Agent;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.GameProfileRepository;
import com.mojang.authlib.ProfileLookupCallback;
import java.io.File;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class_24040 {
    public static final File Field_24041;
    public static final File Field_24042;
    public static final File Field_24043;
    public static final File Field_24044;
    private static final Logger Field_24045;

    private static String Method_24046(String string) {
        int n = 11250;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_24040.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static String Method_24047(String string) {
        if (!Class_35310.Method_35315(string) && string.length() <= (26 & 5044)) {
            Class_2457 class_2457 = Class_2457.Method_2530();
            GameProfile gameProfile = class_2457.Method_2626().Method_3198(string);
            if (gameProfile != null && gameProfile.getId() != null) {
                return gameProfile.getId().toString();
            }
            if (!class_2457.Method_2538() && class_2457.Method_2600()) {
                ArrayList arrayList = Lists.newArrayList();
                Class_10911 class_10911 = new Class_10911(class_2457, arrayList);
                Object[] arrobject = new String[241 & -15611];
                arrobject[-8099 & 640] = string;
                Class_24040.Method_24050(class_2457, Lists.newArrayList((Object[])arrobject), class_10911);
                return arrayList.size() > 0 && ((GameProfile)arrayList.get(13 & 5408)).getId() != null ? ((GameProfile)arrayList.get(17440 & 6156)).getId().toString() : "";
            }
            return Class_626.Method_851(new GameProfile((UUID)null, string)).toString();
        }
        return string;
    }

    private void Method_24048() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    static Logger Method_24049() {
        return Field_24045;
    }

    private static void Method_24050(Class_2457 class_2457, Collection collection, ProfileLookupCallback profileLookupCallback) {
        String[] arrstring = (String[])Iterators.toArray((Iterator)Iterators.filter(collection.iterator(), (Predicate)new Class_15730()), String.class);
        if (class_2457.Method_2600()) {
            class_2457.Method_2603().findProfilesByNames(arrstring, Agent.MINECRAFT, profileLookupCallback);
        } else {
            String[] arrstring2 = arrstring;
            int n = arrstring2.length;
            for (int i = 134 & 2304; i < n; ++i) {
                String string = arrstring2[i];
                UUID uUID = Class_626.Method_851(new GameProfile((UUID)null, string));
                GameProfile gameProfile = new GameProfile(uUID, string);
                profileLookupCallback.onProfileLookupSucceeded(gameProfile);
            }
        }
    }

    private static String Method_24051(String string) {
        int n = 25472;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_24040.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    static {
        Field_24045 = LogManager.getLogger();
        Field_24044 = new File(Class_24040.Method_24053("\u6210\u6210\u6212\u6213\u6215\u6215\u6217\u6216\u6200\u6200\u6212\u6203\u6204\u6205"));
        Field_24043 = new File(Class_24040.Method_24046("\u2040\u2042\u2040\u2040\u2046\u2046\u2006\u2046\u2042\u2042\u2042\u2042\u2044\u2044\u2004\u2046\u2042\u2042"));
        Field_24042 = new File(Class_24040.Method_24052("\u0a81\u0a82\u0a83\u0ac2\u0a86\u0a86\u0a84"));
        Field_24041 = new File(Class_24040.Method_24051("\u4501\u4508\u450b\u4502\u4501\u4509\u450a\u450b\u4501\u4500\u450a\u4502\u4508\u4500"));
    }

    private static String Method_24052(String string) {
        int n = 32100;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_24040.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_24053(String string) {
        int n = 24045;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_24040.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }
}

