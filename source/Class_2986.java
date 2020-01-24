/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonPrimitive
 *  com.google.gson.JsonSyntaxException
 *  org.apache.commons.lang3.StringUtils
 */
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import org.apache.commons.lang3.StringUtils;

public class Class_2986 {
    public static boolean Method_2987(JsonObject jsonObject, String string) {
        return (!Class_2986.Method_3003(jsonObject, string) ? 18 & -18423 : (int)(jsonObject.get(string).isJsonPrimitive() ? 1 : 0)) != 0;
    }

    public static boolean Method_2988(JsonElement jsonElement, String string) {
        if (jsonElement.isJsonPrimitive()) {
            return jsonElement.getAsBoolean();
        }
        throw new JsonSyntaxException("Expected " + string + " to be a Boolean, was " + Class_2986.Method_3002(jsonElement));
    }

    public static float Method_2989(JsonObject jsonObject, String string) {
        if (jsonObject.has(string)) {
            return Class_2986.Method_3012(jsonObject.get(string), string);
        }
        throw new JsonSyntaxException("Missing " + string + ", expected to find a Float");
    }

    public static JsonObject Method_2990(JsonObject jsonObject, String string, JsonObject jsonObject2) {
        return jsonObject.has(string) ? Class_2986.Method_2996(jsonObject.get(string), string) : jsonObject2;
    }

    public static JsonObject Method_2991(JsonObject jsonObject, String string) {
        if (jsonObject.has(string)) {
            return Class_2986.Method_2996(jsonObject.get(string), string);
        }
        throw new JsonSyntaxException("Missing " + string + ", expected to find a JsonObject");
    }

    public static JsonArray Method_2992(JsonObject jsonObject, String string, JsonArray jsonArray) {
        return jsonObject.has(string) ? Class_2986.Method_3005(jsonObject.get(string), string) : jsonArray;
    }

    public static boolean Method_2993(JsonObject jsonObject, String string) {
        return (!Class_2986.Method_2987(jsonObject, string) ? -26612 & 16994 : (int)(jsonObject.getAsJsonPrimitive(string).isString() ? 1 : 0)) != 0;
    }

    public static String Method_2994(JsonObject jsonObject, String string, String string2) {
        return jsonObject.has(string) ? Class_2986.Method_3000(jsonObject.get(string), string) : string2;
    }

    public static float Method_2995(JsonObject jsonObject, String string, float f) {
        return jsonObject.has(string) ? Class_2986.Method_3012(jsonObject.get(string), string) : f;
    }

    public static JsonObject Method_2996(JsonElement jsonElement, String string) {
        if (jsonElement.isJsonObject()) {
            return jsonElement.getAsJsonObject();
        }
        throw new JsonSyntaxException("Expected " + string + " to be a JsonObject, was " + Class_2986.Method_3002(jsonElement));
    }

    public static boolean Method_2997(JsonObject jsonObject, String string) {
        return (!Class_2986.Method_3003(jsonObject, string) ? 2053 & 8218 : (int)(jsonObject.get(string).isJsonArray() ? 1 : 0)) != 0;
    }

    public static JsonArray Method_2998(JsonObject jsonObject, String string) {
        if (jsonObject.has(string)) {
            return Class_2986.Method_3005(jsonObject.get(string), string);
        }
        throw new JsonSyntaxException("Missing " + string + ", expected to find a JsonArray");
    }

    public static int Method_2999(JsonElement jsonElement, String string) {
        if (jsonElement.isJsonPrimitive() && jsonElement.getAsJsonPrimitive().isNumber()) {
            return jsonElement.getAsInt();
        }
        throw new JsonSyntaxException("Expected " + string + " to be a Int, was " + Class_2986.Method_3002(jsonElement));
    }

    public static String Method_3000(JsonElement jsonElement, String string) {
        if (jsonElement.isJsonPrimitive()) {
            return jsonElement.getAsString();
        }
        throw new JsonSyntaxException("Expected " + string + " to be a string, was " + Class_2986.Method_3002(jsonElement));
    }

    public static String Method_3001(JsonObject jsonObject, String string) {
        if (jsonObject.has(string)) {
            return Class_2986.Method_3000(jsonObject.get(string), string);
        }
        throw new JsonSyntaxException("Missing " + string + ", expected to find a string");
    }

    public static String Method_3002(JsonElement jsonElement) {
        String string = StringUtils.abbreviateMiddle((String)String.valueOf((Object)jsonElement), (String)"...", (int)(9514 & 16463));
        if (jsonElement == null) {
            return "null (missing)";
        }
        if (jsonElement.isJsonNull()) {
            return "null (json)";
        }
        if (jsonElement.isJsonArray()) {
            return "an array (" + string + ")";
        }
        if (jsonElement.isJsonObject()) {
            return "an object (" + string + ")";
        }
        if (jsonElement.isJsonPrimitive()) {
            JsonPrimitive jsonPrimitive = jsonElement.getAsJsonPrimitive();
            if (jsonPrimitive.isNumber()) {
                return "a number (" + string + ")";
            }
            if (jsonPrimitive.isBoolean()) {
                return "a boolean (" + string + ")";
            }
        }
        return string;
    }

    public static boolean Method_3003(JsonObject jsonObject, String string) {
        return (jsonObject == null ? 9508 & 16384 : (jsonObject.get(string) != null ? -32735 & 10499 : -32000 & 9280)) != 0;
    }

    private void Method_3004() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public static JsonArray Method_3005(JsonElement jsonElement, String string) {
        if (jsonElement.isJsonArray()) {
            return jsonElement.getAsJsonArray();
        }
        throw new JsonSyntaxException("Expected " + string + " to be a JsonArray, was " + Class_2986.Method_3002(jsonElement));
    }

    public static boolean Method_3006(JsonObject jsonObject, String string, boolean bl) {
        return jsonObject.has(string) ? Class_2986.Method_2988(jsonObject.get(string), string) : bl;
    }

    public static boolean Method_3007(JsonObject jsonObject, String string) {
        if (jsonObject.has(string)) {
            return Class_2986.Method_2988(jsonObject.get(string), string);
        }
        throw new JsonSyntaxException("Missing " + string + ", expected to find a Boolean");
    }

    public static boolean Method_3008(JsonElement jsonElement) {
        return (!jsonElement.isJsonPrimitive() ? -30459 & 1584 : (int)(jsonElement.getAsJsonPrimitive().isString() ? 1 : 0)) != 0;
    }

    public static int Method_3009(JsonObject jsonObject, String string, int n) {
        return jsonObject.has(string) ? Class_2986.Method_2999(jsonObject.get(string), string) : n;
    }

    public static boolean Method_3010(JsonObject jsonObject, String string) {
        return (!Class_2986.Method_2987(jsonObject, string) ? 88 & 8356 : (int)(jsonObject.getAsJsonPrimitive(string).isBoolean() ? 1 : 0)) != 0;
    }

    public static int Method_3011(JsonObject jsonObject, String string) {
        if (jsonObject.has(string)) {
            return Class_2986.Method_2999(jsonObject.get(string), string);
        }
        throw new JsonSyntaxException("Missing " + string + ", expected to find a Int");
    }

    public static float Method_3012(JsonElement jsonElement, String string) {
        if (jsonElement.isJsonPrimitive() && jsonElement.getAsJsonPrimitive().isNumber()) {
            return jsonElement.getAsFloat();
        }
        throw new JsonSyntaxException("Expected " + string + " to be a Float, was " + Class_2986.Method_3002(jsonElement));
    }
}

