/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.cache.CacheLoader
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.yggdrasil.YggdrasilMinecraftSessionService
 */
import com.google.common.cache.CacheLoader;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.yggdrasil.YggdrasilMinecraftSessionService;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Map;

public class Class_11860
extends CacheLoader {
    final Class_16234 Field_11861;

    public Object Method_11862(Object object) {
        return this.Method_11864((GameProfile)object);
    }

    private void Method_11863() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Map Method_11864(GameProfile gameProfile) {
        return Class_18.Field_89.Method_141().getTextures(gameProfile, (17674 & 48) != 0);
    }

    Class_11860(Class_16234 class_16234) {
        this.Field_11861 = class_16234;
    }
}

