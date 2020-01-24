/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonPrimitive
 *  com.google.gson.JsonSerializationContext
 *  com.google.gson.JsonSerializer
 */
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Type;

public class Class_2951
implements JsonDeserializer,
JsonSerializer {
    public Class_2893 Method_2952(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        if (jsonElement.isJsonObject()) {
            Class_17245 class_17245;
            Object object;
            JsonPrimitive jsonPrimitive;
            JsonObject jsonObject;
            Class_2893 class_2893 = new Class_2893();
            JsonObject jsonObject2 = jsonElement.getAsJsonObject();
            if (jsonObject2 == null) {
                return null;
            }
            if (jsonObject2.has("bold")) {
                Class_2893.Method_2908(class_2893, jsonObject2.get("bold").getAsBoolean());
            }
            if (jsonObject2.has("italic")) {
                Class_2893.Method_2909(class_2893, jsonObject2.get("italic").getAsBoolean());
            }
            if (jsonObject2.has("underlined")) {
                Class_2893.Method_2939(class_2893, jsonObject2.get("underlined").getAsBoolean());
            }
            if (jsonObject2.has("strikethrough")) {
                Class_2893.Method_2927(class_2893, jsonObject2.get("strikethrough").getAsBoolean());
            }
            if (jsonObject2.has("obfuscated")) {
                Class_2893.Method_2919(class_2893, jsonObject2.get("obfuscated").getAsBoolean());
            }
            if (jsonObject2.has("color")) {
                Class_2893.Method_2938(class_2893, (Class_5478)((Object)jsonDeserializationContext.deserialize(jsonObject2.get("color"), Class_5478.class)));
            }
            if (jsonObject2.has("insertion")) {
                Class_2893.Method_2943(class_2893, jsonObject2.get("insertion").getAsString());
            }
            if (jsonObject2.has("clickEvent") && (jsonObject = jsonObject2.getAsJsonObject("clickEvent")) != null) {
                String string;
                jsonPrimitive = jsonObject.getAsJsonPrimitive("action");
                class_17245 = jsonPrimitive == null ? null : Class_17245.Method_17266(jsonPrimitive.getAsString());
                object = jsonObject.getAsJsonPrimitive("value");
                String string2 = string = object == null ? null : object.getAsString();
                if (class_17245 != null && string != null && class_17245.Method_17267()) {
                    Class_2893.Method_2937(class_2893, new Class_21230(class_17245, string));
                }
            }
            if (jsonObject2.has("hoverEvent") && (jsonObject = jsonObject2.getAsJsonObject("hoverEvent")) != null) {
                jsonPrimitive = jsonObject.getAsJsonPrimitive("action");
                class_17245 = jsonPrimitive == null ? null : Class_14202.Method_14211(jsonPrimitive.getAsString());
                object = (Class_1782)jsonDeserializationContext.deserialize(jsonObject.get("value"), Class_1782.class);
                if (class_17245 != null && object != null && ((Class_14202)((Object)class_17245)).Method_14219()) {
                    Class_2893.Method_2914(class_2893, new Class_44868((Class_14202)((Object)class_17245), (Class_1782)object));
                }
            }
            return class_2893;
        }
        return null;
    }

    private void Method_2953() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public JsonElement Method_2954(Object object, Type type, JsonSerializationContext jsonSerializationContext) {
        return this.Method_2956((Class_2893)object, type, jsonSerializationContext);
    }

    public Object Method_2955(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        return this.Method_2952(jsonElement, type, jsonDeserializationContext);
    }

    public JsonElement Method_2956(Class_2893 class_2893, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject jsonObject;
        if (class_2893.Method_2916()) {
            return null;
        }
        JsonObject jsonObject2 = new JsonObject();
        if (Class_2893.Method_2944(class_2893) != null) {
            jsonObject2.addProperty("bold", Class_2893.Method_2944(class_2893));
        }
        if (Class_2893.Method_2935(class_2893) != null) {
            jsonObject2.addProperty("italic", Class_2893.Method_2935(class_2893));
        }
        if (Class_2893.Method_2920(class_2893) != null) {
            jsonObject2.addProperty("underlined", Class_2893.Method_2920(class_2893));
        }
        if (Class_2893.Method_2930(class_2893) != null) {
            jsonObject2.addProperty("strikethrough", Class_2893.Method_2930(class_2893));
        }
        if (Class_2893.Method_2905(class_2893) != null) {
            jsonObject2.addProperty("obfuscated", Class_2893.Method_2905(class_2893));
        }
        if (Class_2893.Method_2940(class_2893) != null) {
            jsonObject2.add("color", jsonSerializationContext.serialize((Object)Class_2893.Method_2940(class_2893)));
        }
        if (Class_2893.Method_2924(class_2893) != null) {
            jsonObject2.add("insertion", jsonSerializationContext.serialize((Object)Class_2893.Method_2924(class_2893)));
        }
        if (Class_2893.Method_2950(class_2893) != null) {
            jsonObject = new JsonObject();
            jsonObject.addProperty("action", Class_2893.Method_2950(class_2893).Method_21236().Method_17271());
            jsonObject.addProperty("value", Class_2893.Method_2950(class_2893).Method_21237());
            jsonObject2.add("clickEvent", (JsonElement)jsonObject);
        }
        if (Class_2893.Method_2918(class_2893) != null) {
            jsonObject = new JsonObject();
            jsonObject.addProperty("action", Class_2893.Method_2918(class_2893).Method_44873().Method_14222());
            jsonObject.add("value", jsonSerializationContext.serialize((Object)Class_2893.Method_2918(class_2893).Method_44874()));
            jsonObject2.add("hoverEvent", (JsonElement)jsonObject);
        }
        return jsonObject2;
    }
}

