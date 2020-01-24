/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
import com.mojang.authlib.GameProfile;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.UUID;

public class Class_20646
extends Class_1956 {
    private static final String[] Field_20647;

    private static String Method_20648(String string) {
        int n = 2623;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_20646.class, 5);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_20649(String string) {
        int n = 17516;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_20646.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_20650(String string) {
        int n = 18972;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_20646.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_20651(Class_1956 class_1956, Class_3987 class_3987, List list) {
        for (int i = -24576 & 18177; i < Field_20647.length; ++i) {
            list.add(new Class_23823(class_1956, -28493 & 9025, i));
        }
    }

    static {
        String[] arrstring = new String[1165 & 10263];
        arrstring[8262 & 1552] = Class_20646.Method_20650("\u4502\u4503\u4500\u4500\u4500\u4500\u4502\u4502");
        arrstring[289 & -24063] = Class_20646.Method_20649("\u8001\u8012\u8002\u8013\u8013\u8001");
        arrstring[4242 & 2351] = Class_20646.Method_20653("\u800b\u800b\u8008\u8002\u8008\u8001");
        arrstring[2091 & 22083] = Class_20646.Method_20659("\u0011\u0012\u0013\u0000");
        arrstring[260 & 12878] = Class_20646.Method_20648("\u1000\u1000\u1004\u1005\u1007\u1003\u1007");
        Field_20647 = arrstring;
    }

    private void Method_20652() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private static String Method_20653(String string) {
        int n = 15384;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_20646.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public int Method_20654(int n) {
        return n;
    }

    public String Method_20655(Class_23823 class_23823) {
        if (class_23823.Method_23843() == (8259 & 20763) && class_23823.Method_23842()) {
            Class_1699 class_1699;
            if (class_23823.Method_23845().Method_1715("SkullOwner", 16408 & 12584)) {
                Object[] arrobject = new Object[-16379 & 275];
                arrobject[-32768 & 4696] = class_23823.Method_23845().Method_1708("SkullOwner");
                return Class_7594.Method_7597("item.skull.player.name", arrobject);
            }
            if (class_23823.Method_23845().Method_1715("SkullOwner", 8458 & 6190) && (class_1699 = class_23823.Method_23845().Method_1703("SkullOwner")).Method_1715("Name", 26636 & -31349)) {
                Object[] arrobject = new Object[4137 & -24047];
                arrobject[-24447 & 6444] = class_1699.Method_1708("Name");
                return Class_7594.Method_7597("item.skull.player.name", arrobject);
            }
        }
        return super.Method_2030(class_23823);
    }

    public boolean Method_20656(Class_1699 class_1699) {
        super.Method_1977(class_1699);
        if (class_1699.Method_1715("SkullOwner", 3674 & 12) && class_1699.Method_1708("SkullOwner").length() > 0) {
            GameProfile gameProfile = new GameProfile((UUID)null, class_1699.Method_1708("SkullOwner"));
            gameProfile = Class_37700.Method_37704(gameProfile);
            class_1699.Method_1744("SkullOwner", Class_25852.Method_25855(new Class_1699(), gameProfile));
            return (7177 & 8963) != 0;
        }
        return (10512 & 1028) != 0;
    }

    public String Method_20657(Class_23823 class_23823) {
        int n = class_23823.Method_23843();
        if (n < 0 || n >= Field_20647.length) {
            n = 12432 & 16388;
        }
        return super.Method_2026() + "." + Field_20647[n];
    }

    public Class_20646() {
        this.\u0000strictfp(Class_3987.Field_3995);
        this.\u0000strictfp(-32735 & 18);
        this.\u0000strictfp((1033 & 8193) != 0);
    }

    public boolean Method_20658(Class_23823 class_23823, Class_626 class_626, Class_283 class_283, Class_4751 class_4751, Class_4595 class_4595, float f, float f2, float f3) {
        if (class_4595 == Class_4595.Field_4615) {
            return (25088 & -25215) != 0;
        }
        Class_3436 class_3436 = class_283.Method_375(class_4751);
        Class_3238 class_3238 = class_3436.Method_3442();
        boolean bl = class_3238.Method_3393(class_283, class_4751);
        if (!bl) {
            if (!class_283.Method_375(class_4751).Method_3442().Method_3373().Method_3762()) {
                return (18196 & -18328) != 0;
            }
            class_4751 = class_4751.Method_4765(class_4595);
        }
        if (!class_626.Method_794(class_4751, class_4595, class_23823)) {
            return (4232 & -30637) != 0;
        }
        if (!Class_9265.Field_9314.\u0000, `(class_283, class_4751)) {
            return (24642 & 4776) != 0;
        }
        if (!class_283.Field_306) {
            Class_4879 class_4879;
            class_283.Method_462(class_4751, Class_9265.Field_9314.\u0000strictfp().Method_3685(Class_11917.Field_11920, (Comparable)((Object)class_4595)), 127 & 24835);
            int n = -24447 & 17740;
            if (class_4595 == Class_4595.Field_4601) {
                n = Class_13337.Method_13371((double)(class_626.\u0000= ? * (1.1632653f * 13.754386f) / (322.10526f * 1.117647f)) + 1.2619047619047619 * 0.39622641509433965) & (111 & -24033);
            }
            if ((class_4879 = class_283.Method_429(class_4751)) instanceof Class_37700) {
                Class_37700 class_37700 = (Class_37700)class_4879;
                if (class_23823.Method_23843() == (-31645 & 15107)) {
                    GameProfile gameProfile = null;
                    if (class_23823.Method_23842()) {
                        Class_1699 class_1699 = class_23823.Method_23845();
                        if (class_1699.Method_1715("SkullOwner", 267 & -6086)) {
                            gameProfile = Class_25852.Method_25856(class_1699.Method_1703("SkullOwner"));
                        } else if (class_1699.Method_1715("SkullOwner", 25133 & 7498) && class_1699.Method_1708("SkullOwner").length() > 0) {
                            gameProfile = new GameProfile((UUID)null, class_1699.Method_1708("SkullOwner"));
                        }
                    }
                    class_37700.Method_37711(gameProfile);
                } else {
                    class_37700.Method_37705(class_23823.Method_23843());
                }
                class_37700.Method_37713(n);
                Class_9265.Field_9314.Method_11935(class_283, class_4751, class_37700);
            }
            class_23823.Field_23826 -= 771 & 1045;
        }
        return (4677 & -24189) != 0;
    }

    private static String Method_20659(String string) {
        int n = 9441;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_20646.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }
}

