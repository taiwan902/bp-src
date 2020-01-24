/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSerializationContext
 *  com.google.gson.JsonSerializer
 *  com.mojang.authlib.GameProfile
 */
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.mojang.authlib.GameProfile;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Type;
import java.util.UUID;

public class Class_7722
implements JsonDeserializer,
JsonSerializer {
    public Object Method_7723(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        return this.Method_7724(jsonElement, type, jsonDeserializationContext);
    }

    public Class_21330 Method_7724(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        JsonArray jsonArray;
        JsonObject jsonObject = Class_2986.Method_2996(jsonElement, "players");
        Class_21330 class_21330 = new Class_21330(Class_2986.Method_3011(jsonObject, "max"), Class_2986.Method_3011(jsonObject, "online"));
        if (Class_2986.Method_2997(jsonObject, "sample") && (jsonArray = Class_2986.Method_2998(jsonObject, "sample")).size() > 0) {
            GameProfile[] arrgameProfile = new GameProfile[jsonArray.size()];
            for (int i = 8192 & -15253; i < arrgameProfile.length; ++i) {
                JsonObject jsonObject2 = Class_2986.Method_2996(jsonArray.get(i), "player[" + i + "]");
                String string = Class_2986.Method_3001(jsonObject2, "id");
                arrgameProfile[i] = new GameProfile(UUID.fromString(string), Class_2986.Method_3001(jsonObject2, "name"));
            }
            class_21330.Method_21335(arrgameProfile);
        }
        return class_21330;
    }

    private void Method_7725() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public JsonElement Method_7726(Class_21330 class_21330, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("max", (Number)class_21330.Method_21338());
        jsonObject.addProperty("online", (Number)class_21330.Method_21336());
        if (class_21330.Method_21337() != null && class_21330.Method_21337().length > 0) {
            JsonArray jsonArray = new JsonArray();
            for (int i = 25738 & 288; i < class_21330.Method_21337().length; ++i) {
                JsonObject jsonObject2 = new JsonObject();
                UUID uUID = class_21330.Method_21337()[i].getId();
                jsonObject2.addProperty("id", uUID == null ? "" : uUID.toString());
                jsonObject2.addProperty("name", class_21330.Method_21337()[i].getName());
                jsonArray.add((JsonElement)jsonObject2);
            }
            jsonObject.add("sample", (JsonElement)jsonArray);
        }
        return jsonObject;
    }

    public JsonElement Method_7727(Object object, Type type, JsonSerializationContext jsonSerializationContext) {
        return this.Method_7726((Class_21330)object, type, jsonSerializationContext);
    }
}

