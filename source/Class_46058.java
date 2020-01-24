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

public class Class_46058
extends Class_36787 {
    public String Method_46059(Class_1367 class_1367) {
        return "commands.unban.usage";
    }

    public void Method_46060(Class_1367 class_1367, String[] arrstring) {
        Class_2457 class_2457;
        GameProfile gameProfile;
        if (arrstring.length == (-23281 & 16513) && arrstring[-22528 & 5804].length() > 0) {
            class_2457 = Class_2457.Method_2530();
            gameProfile = class_2457.Method_2616().Method_3133().Method_27653(arrstring[-24544 & 18432]);
            if (gameProfile == null) {
                Object[] arrobject = new Object[-24461 & 129];
                arrobject[24136 & -32768] = arrstring[-14260 & 13440];
                throw new Class_30034("commands.unban.failed", arrobject);
            }
        } else {
            throw new Class_34974("commands.unban.usage", new Object[6376 & -32766]);
        }
        class_2457.Method_2616().Method_3133().\u0000strictfp((Object)gameProfile);
        Object[] arrobject = new Object[-31473 & 65];
        arrobject[4416 & 18468] = arrstring[16513 & 1286];
        Class_46058.\u0000strictfp((Class_1367)class_1367, (Class_26550)this, (String)"commands.unban.success", (Object[])arrobject);
    }

    public boolean Method_46061(Class_1367 class_1367) {
        return (Class_2457.Method_2530().Method_2616().Method_3133().\u0000strictfp() && super.Method_36796(class_1367) ? 4131 & 17297 : 4880 & 1066) != 0;
    }

    public String Method_46062() {
        return "pardon";
    }

    public List Method_46063(Class_1367 class_1367, String[] arrstring, Class_4751 class_4751) {
        return arrstring.length == (2049 & 4227) ? Class_46058.\u0000strictfp((String[])arrstring, (String[])Class_2457.Method_2530().Method_2616().Method_3133().Method_27655()) : null;
    }

    public int Method_46064() {
        return 8451 & 1031;
    }

    private void Method_46065() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

