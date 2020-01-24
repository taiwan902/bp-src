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

public final class Class_7514
implements ProfileLookupCallback {
    final GameProfile[] Field_7515;

    public void Method_7516(GameProfile gameProfile) {
        this.Field_7515[-32768 & 68] = gameProfile;
    }

    Class_7514(GameProfile[] arrgameProfile) {
        this.Field_7515 = arrgameProfile;
    }

    public void Method_7517(GameProfile gameProfile, Exception exception) {
        this.Field_7515[3080 & -24250] = null;
    }

    private void Method_7518() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

