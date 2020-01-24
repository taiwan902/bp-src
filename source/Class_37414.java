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

public class Class_37414
extends Class_36787 {
    public void Method_37415(Class_1367 class_1367, String[] arrstring) {
        if (arrstring.length < (-24573 & 24101)) {
            throw new Class_34974("commands.whitelist.usage", new Object[20480 & 1949]);
        }
        Class_2457 class_2457 = Class_2457.Method_2530();
        if (arrstring[4 & -23071].equals("on")) {
            class_2457.Method_2616().Method_3134((-15193 & 1) != 0);
            Class_37414.\u0000strictfp((Class_1367)class_1367, (Class_26550)this, (String)"commands.whitelist.enabled", (Object[])new Object[25472 & 2074]);
        } else if (arrstring[2362 & 17605].equals("off")) {
            class_2457.Method_2616().Method_3134((4096 & 25617) != 0);
            Class_37414.\u0000strictfp((Class_1367)class_1367, (Class_26550)this, (String)"commands.whitelist.disabled", (Object[])new Object[31040 & 48]);
        } else if (arrstring[-29434 & 8913].equals("list")) {
            Object[] arrobject = new Object[659 & 8522];
            arrobject[17 & -26488] = class_2457.Method_2616().Method_3129().length;
            arrobject[5 & -25941] = class_2457.Method_2616().Method_3146().length;
            class_1367.Method_1373(new Class_2849("commands.whitelist.list", arrobject));
            Object[] arrobject2 = class_2457.Method_2616().Method_3129();
            class_1367.Method_1373(new Class_2840(Class_37414.\u0000strictfp((Object[])arrobject2)));
        } else if (arrstring[-32752 & 30788].equals("add")) {
            if (arrstring.length < (9378 & -14069)) {
                throw new Class_34974("commands.whitelist.add.usage", new Object[-24432 & 4356]);
            }
            GameProfile gameProfile = class_2457.Method_2626().Method_3198(arrstring[553 & -27199]);
            if (gameProfile == null) {
                Object[] arrobject = new Object[16521 & 10279];
                arrobject[-20440 & 3223] = arrstring[16929 & -30463];
                throw new Class_30034("commands.whitelist.add.failed", arrobject);
            }
            class_2457.Method_2616().Method_3137(gameProfile);
            Object[] arrobject = new Object[-19895 & 1];
            arrobject[-8184 & 4738] = arrstring[-32053 & 4129];
            Class_37414.\u0000strictfp((Class_1367)class_1367, (Class_26550)this, (String)"commands.whitelist.add.success", (Object[])arrobject);
        } else if (arrstring[18952 & 288].equals("remove")) {
            if (arrstring.length < (16406 & 12939)) {
                throw new Class_34974("commands.whitelist.remove.usage", new Object[-28464 & 512]);
            }
            GameProfile gameProfile = class_2457.Method_2616().Method_3131().Method_13751(arrstring[10499 & 16405]);
            if (gameProfile == null) {
                Object[] arrobject = new Object[-27131 & 297];
                arrobject[2818 & 24728] = arrstring[8773 & -31727];
                throw new Class_30034("commands.whitelist.remove.failed", arrobject);
            }
            class_2457.Method_2616().Method_3135(gameProfile);
            Object[] arrobject = new Object[16641 & 9295];
            arrobject[9257 & -28416] = arrstring[24723 & 2057];
            Class_37414.\u0000strictfp((Class_1367)class_1367, (Class_26550)this, (String)"commands.whitelist.remove.success", (Object[])arrobject);
        } else if (arrstring[261 & 1096].equals("reload")) {
            class_2457.Method_2616().Method_3107();
            Class_37414.\u0000strictfp((Class_1367)class_1367, (Class_26550)this, (String)"commands.whitelist.reloaded", (Object[])new Object[16648 & 34]);
        }
    }

    public int Method_37416() {
        return 395 & 8215;
    }

    public List Method_37417(Class_1367 class_1367, String[] arrstring, Class_4751 class_4751) {
        if (arrstring.length == (10245 & 5219)) {
            String[] arrstring2 = new String[22 & 2086];
            arrstring2[440 & 1027] = "on";
            arrstring2[-31727 & 6793] = "off";
            arrstring2[-27374 & 2186] = "list";
            arrstring2[1155 & -32765] = "add";
            arrstring2[8388 & 17694] = "remove";
            arrstring2[1813 & 16391] = "reload";
            return Class_37414.\u0000strictfp((String[])arrstring, (String[])arrstring2);
        }
        if (arrstring.length == (2602 & 8194)) {
            if (arrstring[288 & 2066].equals("remove")) {
                return Class_37414.\u0000strictfp((String[])arrstring, (String[])Class_2457.Method_2530().Method_2616().Method_3129());
            }
            if (arrstring[-16121 & 0].equals("add")) {
                return Class_37414.\u0000strictfp((String[])arrstring, (String[])Class_2457.Method_2530().Method_2626().Method_3189());
            }
        }
        return null;
    }

    public String Method_37418() {
        return "whitelist";
    }

    public String Method_37419(Class_1367 class_1367) {
        return "commands.whitelist.usage";
    }

    private void Method_37420() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

