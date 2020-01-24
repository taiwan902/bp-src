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

public class Class_37662
extends Class_36787 {
    public int Method_37663() {
        return 35 & -16125;
    }

    public void Method_37664(Class_1367 class_1367, String[] arrstring) {
        Class_2457 class_2457;
        GameProfile gameProfile;
        if (arrstring.length == (10755 & 16641) && arrstring[24592 & -29502].length() > 0) {
            class_2457 = Class_2457.Method_2530();
            gameProfile = class_2457.Method_2616().Method_3152().Method_20470(arrstring[-12575 & 30]);
            if (gameProfile == null) {
                Object[] arrobject = new Object[-7019 & 4161];
                arrobject[19504 & 201] = arrstring[22722 & 792];
                throw new Class_30034("commands.deop.failed", arrobject);
            }
        } else {
            throw new Class_34974("commands.deop.usage", new Object[0 & 3328]);
        }
        class_2457.Method_2616().Method_3144(gameProfile);
        Object[] arrobject = new Object[-31071 & 14619];
        arrobject[-25561 & 64] = arrstring[8 & 1840];
        Class_37662.\u0000strictfp((Class_1367)class_1367, (Class_26550)this, (String)"commands.deop.success", (Object[])arrobject);
    }

    public String Method_37665(Class_1367 class_1367) {
        return "commands.deop.usage";
    }

    public String Method_37666() {
        return "deop";
    }

    private void Method_37667() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public List Method_37668(Class_1367 class_1367, String[] arrstring, Class_4751 class_4751) {
        return arrstring.length == (-17085 & 25) ? Class_37662.\u0000strictfp((String[])arrstring, (String[])Class_2457.Method_2530().Method_2616().Method_3149()) : null;
    }
}

