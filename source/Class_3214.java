/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSerializationContext
 *  com.google.gson.JsonSerializer
 *  com.mojang.authlib.GameProfile
 */
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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class Class_3214
implements JsonDeserializer,
JsonSerializer {
    final Class_3180 Field_3215;

    private void Method_3216() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private Class_3214(Class_3180 class_3180) {
        this.Field_3215 = class_3180;
    }

    public JsonElement Method_3217(Object object, Type type, JsonSerializationContext jsonSerializationContext) {
        return this.Method_3218((Class_3206)object, type, jsonSerializationContext);
    }

    public JsonElement Method_3218(Class_3206 class_3206, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("name", class_3206.Method_3212().getName());
        UUID uUID = class_3206.Method_3212().getId();
        jsonObject.addProperty("uuid", uUID == null ? "" : uUID.toString());
        jsonObject.addProperty("expiresOn", Class_3180.Field_3183.format(class_3206.Method_3213()));
        return jsonObject;
    }

    public Object Method_3219(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        return this.Method_3220(jsonElement, type, jsonDeserializationContext);
    }

    public Class_3206 Method_3220(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        if (jsonElement.isJsonObject()) {
            JsonObject jsonObject = jsonElement.getAsJsonObject();
            JsonElement jsonElement2 = jsonObject.get("name");
            JsonElement jsonElement3 = jsonObject.get("uuid");
            JsonElement jsonElement4 = jsonObject.get("expiresOn");
            if (jsonElement2 != null && jsonElement3 != null) {
                String string = jsonElement3.getAsString();
                String string2 = jsonElement2.getAsString();
                Date date = null;
                if (jsonElement4 != null) {
                    try {
                        date = Class_3180.Field_3183.parse(jsonElement4.getAsString());
                    }
                    catch (ParseException parseException) {
                        date = null;
                    }
                }
                if (string2 != null && string != null) {
                    UUID uUID;
                    try {
                        uUID = UUID.fromString(string);
                    }
                    catch (Throwable throwable) {
                        return null;
                    }
                    Class_3180 class_3180 = this.Field_3215;
                    class_3180.getClass();
                    Class_3206 class_3206 = new Class_3206(class_3180, new GameProfile(uUID, string2), date, null);
                    return class_3206;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    Class_3214(Class_3180 class_3180, Class_3201 class_3201) {
        this(class_3180);
    }
}

