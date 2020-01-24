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
import java.util.Date;
import java.util.UUID;

public class Class_14573
extends Class_14287 {
    private static GameProfile Method_14574(JsonObject jsonObject) {
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

    public Class_14573(GameProfile gameProfile, Date date, String string, Date date2, String string2) {
        super((Object)gameProfile, date2, string, date2, string2);
    }

    public Class_14573(JsonObject jsonObject) {
        super((Object)Class_14573.Method_14574(jsonObject), jsonObject);
    }

    private void Method_14575() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected void Method_14576(JsonObject jsonObject) {
        if (this.\u0000strictfp() != null) {
            jsonObject.addProperty("uuid", ((GameProfile)this.\u0000strictfp()).getId() == null ? "" : ((GameProfile)this.\u0000strictfp()).getId().toString());
            jsonObject.addProperty("name", ((GameProfile)this.\u0000strictfp()).getName());
            super.Method_14297(jsonObject);
        }
    }
}

