/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.authlib.GameProfile
 */
import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;

public class Class_37620
extends Class_36787 {
    public int Method_37621() {
        return -28653 & 17955;
    }

    public String Method_37622() {
        return "op";
    }

    private void Method_37623() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_37624(Class_1367 class_1367, String[] arrstring) {
        Class_2457 class_2457;
        GameProfile gameProfile;
        if (arrstring.length == (513 & -24377) && arrstring[9344 & 4619].length() > 0) {
            class_2457 = Class_2457.Method_2530();
            gameProfile = class_2457.Method_2626().Method_3198(arrstring[20640 & 2385]);
            if (gameProfile == null) {
                Object[] arrobject = new Object[-12203 & 1281];
                arrobject[-32512 & 29212] = arrstring[-30720 & 16647];
                throw new Class_30034("commands.op.failed", arrobject);
            }
        } else {
            throw new Class_34974("commands.op.usage", new Object[272 & -30200]);
        }
        class_2457.Method_2616().Method_3120(gameProfile);
        Object[] arrobject = new Object[12315 & 16449];
        arrobject[16900 & 1171] = arrstring[4264 & 19];
        Class_37620.\u0000strictfp((Class_1367)class_1367, (Class_26550)this, (String)"commands.op.success", (Object[])arrobject);
    }

    public String Method_37625(Class_1367 class_1367) {
        return "commands.op.usage";
    }

    public List Method_37626(Class_1367 class_1367, String[] arrstring, Class_4751 class_4751) {
        if (arrstring.length == (2305 & -31083)) {
            String string = arrstring[arrstring.length - (-14301 & 705)];
            ArrayList arrayList = Lists.newArrayList();
            GameProfile[] arrgameProfile = Class_2457.Method_2530().Method_2546();
            int n = arrgameProfile.length;
            for (int i = 10754 & 76; i < n; ++i) {
                GameProfile gameProfile = arrgameProfile[i];
                if (Class_2457.Method_2530().Method_2616().Method_3116(gameProfile) || !Class_37620.\u0000strictfp((String)string, (String)gameProfile.getName())) continue;
                arrayList.add(gameProfile.getName());
            }
            return arrayList;
        }
        return null;
    }
}

