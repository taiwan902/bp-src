/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.mojang.authlib.GameProfile
 */
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.UUID;

public class Class_30192
extends Class_9848 {
    private void Method_30193() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected void Method_30194(JsonObject jsonObject) {
        if (this.\u0000strictfp() != null) {
            jsonObject.addProperty("uuid", ((GameProfile)this.\u0000strictfp()).getId() == null ? "" : ((GameProfile)this.\u0000strictfp()).getId().toString());
            jsonObject.addProperty("name", ((GameProfile)this.\u0000strictfp()).getName());
            super.Method_9850(jsonObject);
        }
    }

    public Class_30192(JsonObject jsonObject) {
        super((Object)Class_30192.Method_30195(jsonObject), jsonObject);
    }

    public Class_30192(GameProfile gameProfile) {
        super((Object)gameProfile);
    }

    private static GameProfile Method_30195(JsonObject jsonObject) {
        if (jsonObject.has("uuid") && jsonObject.has("name")) {
            UUID uUID;
            String string = jsonObject.get("uuid").getAsString();
            try {
                uUID = UUID.fromString(string);
            }
            catch (Throwable throwable) {
                return null;
            }
            return new GameProfile(uUID, jsonObject.get("name").getAsString());
        }
        return null;
    }
}

