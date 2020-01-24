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
 */
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Type;

public class Class_18218
implements JsonDeserializer,
JsonSerializer {
    public Object Method_18219(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        return this.Method_18222(jsonElement, type, jsonDeserializationContext);
    }

    public JsonElement Method_18220(Class_3166 class_3166, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject jsonObject = new JsonObject();
        if (class_3166.Method_3175() != null) {
            jsonObject.add("description", jsonSerializationContext.serialize((Object)class_3166.Method_3175()));
        }
        if (class_3166.Method_3174() != null) {
            jsonObject.add("players", jsonSerializationContext.serialize((Object)class_3166.Method_3174()));
        }
        if (class_3166.Method_3176() != null) {
            jsonObject.add("version", jsonSerializationContext.serialize((Object)class_3166.Method_3176()));
        }
        if (class_3166.Method_3172() != null) {
            jsonObject.addProperty("favicon", class_3166.Method_3172());
        }
        return jsonObject;
    }

    private void Method_18221() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_3166 Method_18222(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        JsonObject jsonObject = Class_2986.Method_2996(jsonElement, "status");
        Class_3166 class_3166 = new Class_3166();
        if (jsonObject.has("description")) {
            class_3166.Method_3177((Class_1782)jsonDeserializationContext.deserialize(jsonObject.get("description"), Class_1782.class));
        }
        if (jsonObject.has("players")) {
            class_3166.Method_3179((Class_21330)jsonDeserializationContext.deserialize(jsonObject.get("players"), Class_21330.class));
        }
        if (jsonObject.has("version")) {
            class_3166.Method_3171((Class_13307)jsonDeserializationContext.deserialize(jsonObject.get("version"), Class_13307.class));
        }
        if (jsonObject.has("favicon")) {
            class_3166.Method_3178(Class_2986.Method_3001(jsonObject, "favicon"));
        }
        return class_3166;
    }

    public JsonElement Method_18223(Object object, Type type, JsonSerializationContext jsonSerializationContext) {
        return this.Method_18220((Class_3166)object, type, jsonSerializationContext);
    }
}

