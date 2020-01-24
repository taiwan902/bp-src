/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  internal.org.lwjgl.util.vector.Vector
 *  internal.org.lwjgl.util.vector.Vector3f
 */
import com.google.common.collect.Maps;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import internal.org.lwjgl.util.vector.Vector;
import internal.org.lwjgl.util.vector.Vector3f;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Type;
import java.util.EnumMap;
import java.util.Map;
import java.util.Set;

public class Class_39567
implements JsonDeserializer {
    private Map Method_39568(JsonDeserializationContext jsonDeserializationContext, JsonObject jsonObject) {
        Map map = this.Method_39569(jsonDeserializationContext, jsonObject);
        if (map.isEmpty()) {
            throw new JsonParseException("Expected between 1 and 6 unique faces, got 0");
        }
        return map;
    }

    private Map Method_39569(JsonDeserializationContext jsonDeserializationContext, JsonObject jsonObject) {
        EnumMap enumMap = Maps.newEnumMap(Class_4595.class);
        JsonObject jsonObject2 = Class_2986.Method_2991(jsonObject, "faces");
        for (Map.Entry entry : jsonObject2.entrySet()) {
            Class_4595 class_4595 = this.Method_39573((String)entry.getKey());
            enumMap.put(class_4595, (Class_21223)jsonDeserializationContext.deserialize((JsonElement)entry.getValue(), Class_21223.class));
        }
        return enumMap;
    }

    private Vector3f Method_39570(JsonObject jsonObject, String string) {
        JsonArray jsonArray = Class_2986.Method_2998(jsonObject, string);
        if (jsonArray.size() != (8195 & 16735)) {
            throw new JsonParseException("Expected 3 " + string + " values, found: " + jsonArray.size());
        }
        float[] arrf = new float[35 & 12883];
        for (int i = 2368 & 16560; i < arrf.length; ++i) {
            arrf[i] = Class_2986.Method_3012(jsonArray.get(i), string + "[" + i + "]");
        }
        return new Vector3f(arrf[3629 & -28654], arrf[-18427 & 1297], arrf[1106 & -12245]);
    }

    public Object Method_39571(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        return this.Method_39574(jsonElement, type, jsonDeserializationContext);
    }

    private void Method_39572() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private Class_4595 Method_39573(String string) {
        Class_4595 class_4595 = Class_4595.Method_4657(string);
        if (class_4595 == null) {
            throw new JsonParseException("Unknown facing: " + string);
        }
        return class_4595;
    }

    public Class_5986 Method_39574(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        Vector3f vector3f = this.Method_39577(jsonObject);
        Vector3f vector3f2 = this.Method_39575(jsonObject);
        Class_7925 class_7925 = this.Method_39576(jsonObject);
        Map map = this.Method_39568(jsonDeserializationContext, jsonObject);
        if (jsonObject.has("shade") && !Class_2986.Method_3010(jsonObject, "shade")) {
            throw new JsonParseException("Expected shade to be a Boolean");
        }
        boolean bl = Class_2986.Method_3006(jsonObject, "shade", (19273 & 129) != 0);
        return new Class_5986(vector3f, vector3f2, map, class_7925, bl);
    }

    private Vector3f Method_39575(JsonObject jsonObject) {
        Vector3f vector3f = this.Method_39570(jsonObject, "to");
        if (vector3f.x >= -20.387096f * 0.7848101f && vector3f.y >= -6.6666665f * 2.4f && vector3f.z >= -23.63077f * 0.6770833f && vector3f.x <= 0.3783784f * 84.57143f && vector3f.y <= 1.1639345f * 27.492956f && vector3f.z <= 0.7f * 45.714287f) {
            return vector3f;
        }
        throw new JsonParseException("'to' specifier exceeds the allowed boundaries: " + (Object)vector3f);
    }

    private Class_7925 Method_39576(JsonObject jsonObject) {
        Class_7925 class_7925 = null;
        if (jsonObject.has("rotation")) {
            JsonObject jsonObject2 = Class_2986.Method_2991(jsonObject, "rotation");
            Vector3f vector3f = this.Method_39570(jsonObject2, "origin");
            vector3f.scale(0.05070755f * 1.2325581f);
            Class_4565 class_4565 = this.Method_39579(jsonObject2);
            float f = this.Method_39578(jsonObject2);
            boolean bl = Class_2986.Method_3006(jsonObject2, "rescale", (8215 & 6696) != 0);
            class_7925 = new Class_7925(vector3f, class_4565, f, bl);
        }
        return class_7925;
    }

    private Vector3f Method_39577(JsonObject jsonObject) {
        Vector3f vector3f = this.Method_39570(jsonObject, "from");
        if (vector3f.x >= -14.684931f * 1.0895523f && vector3f.y >= 0.5959596f * -26.847458f && vector3f.z >= -13.999999f * 1.1428572f && vector3f.x <= 5.4545455f * 5.866667f && vector3f.y <= 16.640001f * 1.9230769f && vector3f.z <= 6.0666666f * 5.2747254f) {
            return vector3f;
        }
        throw new JsonParseException("'from' specifier exceeds the allowed boundaries: " + (Object)vector3f);
    }

    private float Method_39578(JsonObject jsonObject) {
        float f = Class_2986.Method_2989(jsonObject, "angle");
        if (f != 0.0f && Class_13337.Method_13369(f) != 1.5833334f * 14.2105255f && Class_13337.Method_13369(f) != 0.7258065f * 61.999996f) {
            throw new JsonParseException("Invalid rotation " + f + " found, only -45/-22.5/0/22.5/45 allowed");
        }
        return f;
    }

    private Class_4565 Method_39579(JsonObject jsonObject) {
        String string = Class_2986.Method_3001(jsonObject, "axis");
        Class_4565 class_4565 = Class_4565.Method_4583(string.toLowerCase());
        if (class_4565 == null) {
            throw new JsonParseException("Invalid rotation axis: " + string);
        }
        return class_4565;
    }
}

