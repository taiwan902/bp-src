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

public class Class_22051
implements JsonDeserializer,
JsonSerializer {
    private void Method_22052() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public JsonElement Method_22053(Object object, Type type, JsonSerializationContext jsonSerializationContext) {
        return this.Method_22055((Class_13307)object, type, jsonSerializationContext);
    }

    public Class_13307 Method_22054(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        JsonObject jsonObject = Class_2986.Method_2996(jsonElement, "version");
        return new Class_13307(Class_2986.Method_3001(jsonObject, "name"), Class_2986.Method_3011(jsonObject, "protocol"));
    }

    public JsonElement Method_22055(Class_13307 class_13307, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("name", class_13307.Method_13312());
        jsonObject.addProperty("protocol", (Number)class_13307.Method_13310());
        return jsonObject;
    }

    public Object Method_22056(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        return this.Method_22054(jsonElement, type, jsonDeserializationContext);
    }
}

