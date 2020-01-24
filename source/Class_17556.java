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

public class Class_17556
implements JsonDeserializer,
JsonSerializer {
    final Class_7905 Field_17557;

    private Class_17556(Class_7905 class_7905) {
        this.Field_17557 = class_7905;
    }

    public JsonElement Method_17558(Object object, Type type, JsonSerializationContext jsonSerializationContext) {
        return this.Method_17559((Class_9848)object, type, jsonSerializationContext);
    }

    public JsonElement Method_17559(Class_9848 class_9848, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject jsonObject = new JsonObject();
        class_9848.Method_9850(jsonObject);
        return jsonObject;
    }

    private void Method_17560() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Object Method_17561(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        return this.Method_17562(jsonElement, type, jsonDeserializationContext);
    }

    public Class_9848 Method_17562(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        if (jsonElement.isJsonObject()) {
            JsonObject jsonObject = jsonElement.getAsJsonObject();
            Class_9848 class_9848 = this.Field_17557.Method_7919(jsonObject);
            return class_9848;
        }
        return null;
    }

    Class_17556(Class_7905 class_7905, Class_14170 class_14170) {
        this(class_7905);
    }
}

