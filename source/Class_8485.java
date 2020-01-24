/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 */
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Type;

public class Class_8485
implements JsonDeserializer {
    public Class_10006 Method_8486(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        float[] arrf = this.Method_8487(jsonObject);
        int n = this.Method_8488(jsonObject);
        return new Class_10006(arrf, n);
    }

    private float[] Method_8487(JsonObject jsonObject) {
        if (!jsonObject.has("uv")) {
            return null;
        }
        JsonArray jsonArray = Class_2986.Method_2998(jsonObject, "uv");
        if (jsonArray.size() != (36 & 11911)) {
            throw new JsonParseException("Expected 4 uv values, found: " + jsonArray.size());
        }
        float[] arrf = new float[22532 & -31467];
        for (int i = -23864 & 4354; i < arrf.length; ++i) {
            arrf[i] = Class_2986.Method_3012(jsonArray.get(i), "uv[" + i + "]");
        }
        return arrf;
    }

    protected int Method_8488(JsonObject jsonObject) {
        int n = Class_2986.Method_3009(jsonObject, "rotation", -22454 & 17924);
        if (n >= 0 && n % (15450 & 378) == 0 && n / (602 & 1114) <= (21139 & 71)) {
            return n;
        }
        throw new JsonParseException("Invalid rotation " + n + " found, only 0/90/180/270 allowed");
    }

    public Object Method_8489(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        return this.Method_8486(jsonElement, type, jsonDeserializationContext);
    }

    private void Method_8490() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

