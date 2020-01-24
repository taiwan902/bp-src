/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true
 *  com.mojang.authlib.GameProfile
 */
import com.mojang.authlib.GameProfile;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Date;
import java.util.List;

public class Class_37522
extends Class_36787 {
    public int Method_37523() {
        return 9379 & 16407;
    }

    public List Method_37524(Class_1367 class_1367, String[] arrstring, Class_4751 class_4751) {
        return arrstring.length >= (9859 & 16449) ? Class_37522.\u0000strictfp((String[])arrstring, (String[])Class_2457.Method_2530().Method_2554()) : null;
    }

    public void Method_37525(Class_1367 class_1367, String[] arrstring) {
        if (arrstring.length >= (129 & -24559) && arrstring[16397 & 2592].length() > 0) {
            Class_2457 class_2457 = Class_2457.Method_2530();
            GameProfile gameProfile = class_2457.Method_2626().Method_3198(arrstring[-30560 & 1053]);
            if (gameProfile == null) {
                Object[] arrobject = new Object[-32767 & 1103];
                arrobject[2848 & 79] = arrstring[16776 & -32688];
                throw new Class_30034("commands.ban.failed", arrobject);
            }
            String string = null;
            if (arrstring.length >= (3239 & -15598)) {
                string = Class_37522.\u0000strictfp((Class_1367)class_1367, (String[])arrstring, (int)(-32563 & 8225)).Method_1788();
            }
            Class_14573 class_14573 = new Class_14573(gameProfile, null, class_1367.Method_1368(), null, string);
            class_2457.Method_2616().Method_3133().\u0000strictfp((Class_9848)class_14573);
            \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2 = class_2457.Method_2616().Method_3155(arrstring[19846 & -32687]);
            if (\u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2 != null) {
                \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2.\u0000strictfp.Method_20817("You are banned from this server.");
            }
        } else {
            throw new Class_34974("commands.ban.usage", new Object[-16126 & 144]);
        }
        Object[] arrobject = new Object[18627 & 9233];
        arrobject[4518 & -14336] = arrstring[-12256 & 1161];
        Class_37522.\u0000strictfp((Class_1367)class_1367, (Class_26550)this, (String)"commands.ban.success", (Object[])arrobject);
    }

    private void Method_37526() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public String Method_37527(Class_1367 class_1367) {
        return "commands.ban.usage";
    }

    public boolean Method_37528(Class_1367 class_1367) {
        return (Class_2457.Method_2530().Method_2616().Method_3133().\u0000strictfp() && super.Method_36796(class_1367) ? 9 & -9423 : 2307 & 12296) != 0;
    }

    public String Method_37529() {
        return "ban";
    }
}

