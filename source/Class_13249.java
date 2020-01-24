/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 */
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Type;

public class Class_13249
implements JsonDeserializer {
    private void Method_13250() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Object Method_13251(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        return this.Method_13253(jsonElement, type, jsonDeserializationContext);
    }

    protected int Method_13252(JsonObject jsonObject) {
        return Class_2986.Method_3009(jsonObject, "tintindex", -1 & -1);
    }

    public Class_21223 Method_13253(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        Class_4595 class_4595 = this.Method_13255(jsonObject);
        int n = this.Method_13252(jsonObject);
        String string = this.Method_13254(jsonObject);
        Class_10006 class_10006 = (Class_10006)jsonDeserializationContext.deserialize((JsonElement)jsonObject, Class_10006.class);
        return new Class_21223(class_4595, n, string, class_10006);
    }

    private String Method_13254(JsonObject jsonObject) {
        return Class_2986.Method_3001(jsonObject, "texture");
    }

    private Class_4595 Method_13255(JsonObject jsonObject) {
        String string = Class_2986.Method_2994(jsonObject, "cullface", "");
        return Class_4595.Method_4657(string);
    }
}

