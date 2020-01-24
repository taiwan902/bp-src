/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.ProfileLookupCallback
 */
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.ProfileLookupCallback;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public final class Class_10911
implements ProfileLookupCallback {
    final Class_2457 Field_10912;
    final List Field_10913;

    Class_10911(Class_2457 class_2457, List list) {
        this.Field_10912 = class_2457;
        this.Field_10913 = list;
    }

    public void Method_10914(GameProfile gameProfile, Exception exception) {
        Class_24040.Method_24049().warn("Could not lookup user whitelist entry for " + gameProfile.getName(), (Throwable)exception);
    }

    public void Method_10915(GameProfile gameProfile) {
        this.Field_10912.Method_2626().Method_3190(gameProfile);
        this.Field_10913.add(gameProfile);
    }

    private void Method_10916() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

