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

public class Class_27981
extends Class_9848 {
    private final boolean Field_27982;
    private final int Field_27983;

    protected void Method_27984(JsonObject jsonObject) {
        if (this.\u0000strictfp() != null) {
            jsonObject.addProperty("uuid", ((GameProfile)this.\u0000strictfp()).getId() == null ? "" : ((GameProfile)this.\u0000strictfp()).getId().toString());
            jsonObject.addProperty("name", ((GameProfile)this.\u0000strictfp()).getName());
            super.Method_9850(jsonObject);
            jsonObject.addProperty("level", (Number)this.Field_27983);
            jsonObject.addProperty("bypassesPlayerLimit", Boolean.valueOf(this.Field_27982));
        }
    }

    private static GameProfile Method_27985(JsonObject jsonObject) {
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

    public Class_27981(GameProfile gameProfile, int n, boolean bl) {
        super((Object)gameProfile);
        this.Field_27983 = n;
        this.Field_27982 = bl;
    }

    private void Method_27986() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public int Method_27987() {
        return this.Field_27983;
    }

    public boolean Method_27988() {
        return this.Field_27982;
    }

    public Class_27981(JsonObject jsonObject) {
        super((Object)Class_27981.Method_27985(jsonObject), jsonObject);
        this.Field_27983 = jsonObject.has("level") ? jsonObject.get("level").getAsInt() : 1042 & -32608;
        this.Field_27982 = jsonObject.has("bypassesPlayerLimit") && jsonObject.get("bypassesPlayerLimit").getAsBoolean() ? -14199 & 275 : -24512 & 1300;
    }
}

