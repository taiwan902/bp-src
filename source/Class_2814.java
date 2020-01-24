/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.google.gson.JsonPrimitive
 *  com.google.gson.JsonSerializationContext
 *  com.google.gson.JsonSerializer
 *  com.google.gson.TypeAdapterFactory
 */
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.TypeAdapterFactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Class_2814
implements JsonDeserializer,
JsonSerializer {
    private static final Gson Field_2815;

    private void Method_2816() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public JsonElement Method_2817(Class_1782 class_1782, Type type, JsonSerializationContext jsonSerializationContext) {
        Object object;
        JsonObject jsonObject;
        if (class_1782 instanceof Class_2840 && class_1782.Method_1789().Method_2916() && class_1782.Method_1791().isEmpty()) {
            return new JsonPrimitive(((Class_2840)class_1782).Method_2848());
        }
        JsonObject jsonObject2 = new JsonObject();
        if (!class_1782.Method_1789().Method_2916()) {
            this.Method_2823(class_1782.Method_1789(), jsonObject2, jsonSerializationContext);
        }
        if (!class_1782.Method_1791().isEmpty()) {
            object = new JsonArray();
            for (Object[] arrobject : class_1782.Method_1791()) {
                object.add(this.Method_2817((Class_1782)arrobject, arrobject.getClass(), jsonSerializationContext));
            }
            jsonObject2.add("extra", (JsonElement)object);
        }
        if (class_1782 instanceof Class_2840) {
            jsonObject2.addProperty("text", ((Class_2840)class_1782).Method_2848());
        } else if (class_1782 instanceof Class_2849) {
            object = (Class_2849)class_1782;
            jsonObject2.addProperty("translate", ((Class_2849)object).Method_2866());
            if (((Class_2849)object).Method_2864() != null && ((Class_2849)object).Method_2864().length > 0) {
                Object[] arrobject;
                jsonObject = new JsonArray();
                arrobject = ((Class_2849)object).Method_2864();
                int n = arrobject.length;
                for (int i = -29630 & 256; i < n; ++i) {
                    Object object2 = arrobject[i];
                    if (object2 instanceof Class_1782) {
                        jsonObject.add(this.Method_2817((Class_1782)object2, object2.getClass(), jsonSerializationContext));
                        continue;
                    }
                    jsonObject.add((JsonElement)new JsonPrimitive(String.valueOf(object2)));
                }
                jsonObject2.add("with", (JsonElement)jsonObject);
            }
        } else if (class_1782 instanceof Class_2871) {
            object = (Class_2871)class_1782;
            jsonObject = new JsonObject();
            jsonObject.addProperty("name", ((Class_2871)object).Method_2883());
            jsonObject.addProperty("objective", ((Class_2871)object).Method_2878());
            jsonObject.addProperty("value", ((Class_2871)object).Method_2876());
            jsonObject2.add("score", (JsonElement)jsonObject);
        } else {
            if (!(class_1782 instanceof Class_2884)) {
                throw new IllegalArgumentException("Don't know how to serialize " + class_1782 + " as a Component");
            }
            object = (Class_2884)class_1782;
            jsonObject2.addProperty("selector", ((Class_2884)object).Method_2886());
        }
        return jsonObject2;
    }

    public Class_1782 Method_2818(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        Class_2824 class_2824;
        String string;
        if (jsonElement.isJsonPrimitive()) {
            return new Class_2840(jsonElement.getAsString());
        }
        if (!jsonElement.isJsonObject()) {
            if (jsonElement.isJsonArray()) {
                JsonArray jsonArray = jsonElement.getAsJsonArray();
                Class_1782 class_1782 = null;
                for (JsonElement jsonElement2 : jsonArray) {
                    Class_1782 class_17822 = this.Method_2818(jsonElement2, jsonElement2.getClass(), jsonDeserializationContext);
                    if (class_1782 == null) {
                        class_1782 = class_17822;
                        continue;
                    }
                    class_1782.Method_1787(class_17822);
                }
                return class_1782;
            }
            throw new JsonParseException("Don't know how to turn " + jsonElement.toString() + " into a Component");
        }
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        if (jsonObject.has("text")) {
            class_2824 = new Class_2840(jsonObject.get("text").getAsString());
        } else if (jsonObject.has("translate")) {
            string = jsonObject.get("translate").getAsString();
            if (jsonObject.has("with")) {
                JsonArray jsonArray = jsonObject.getAsJsonArray("with");
                Object[] arrobject = new Object[jsonArray.size()];
                for (int i = 19978 & -24091; i < arrobject.length; ++i) {
                    Class_2840 class_2840;
                    arrobject[i] = this.Method_2818(jsonArray.get(i), type, jsonDeserializationContext);
                    if (!(arrobject[i] instanceof Class_2840) || !(class_2840 = (Class_2840)arrobject[i]).\u0000strictfp().Method_2916() || !class_2840.\u0000strictfp().isEmpty()) continue;
                    arrobject[i] = class_2840.Method_2848();
                }
                class_2824 = new Class_2849(string, arrobject);
            } else {
                class_2824 = new Class_2849(string, new Object[-27835 & 10408]);
            }
        } else if (jsonObject.has("score")) {
            string = jsonObject.getAsJsonObject("score");
            if (!string.has("name") || !string.has("objective")) {
                throw new JsonParseException("A score component needs a least a name and an objective");
            }
            class_2824 = new Class_2871(Class_2986.Method_3001((JsonObject)string, "name"), Class_2986.Method_3001((JsonObject)string, "objective"));
            if (string.has("value")) {
                ((Class_2871)class_2824).Method_2881(Class_2986.Method_3001((JsonObject)string, "value"));
            }
        } else {
            if (!jsonObject.has("selector")) {
                throw new JsonParseException("Don't know how to turn " + jsonElement.toString() + " into a Component");
            }
            class_2824 = new Class_2884(Class_2986.Method_3001(jsonObject, "selector"));
        }
        if (jsonObject.has("extra")) {
            string = jsonObject.getAsJsonArray("extra");
            if (string.size() <= 0) {
                throw new JsonParseException("Unexpected empty array of components");
            }
            for (int i = 69 & 5410; i < string.size(); ++i) {
                class_2824.Method_1787(this.Method_2818(string.get(i), type, jsonDeserializationContext));
            }
        }
        class_2824.Method_1786((Class_2893)jsonDeserializationContext.deserialize(jsonElement, Class_2893.class));
        return class_2824;
    }

    public static Class_1782 Method_2819(String string) {
        return (Class_1782)Field_2815.fromJson(string, Class_1782.class);
    }

    public JsonElement Method_2820(Object object, Type type, JsonSerializationContext jsonSerializationContext) {
        return this.Method_2817((Class_1782)object, type, jsonSerializationContext);
    }

    public static String Method_2821(Class_1782 class_1782) {
        return Field_2815.toJson((Object)class_1782);
    }

    public Object Method_2822(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        return this.Method_2818(jsonElement, type, jsonDeserializationContext);
    }

    static {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeHierarchyAdapter(Class_1782.class, (Object)new Class_2814());
        gsonBuilder.registerTypeHierarchyAdapter(Class_2893.class, (Object)new Class_2951());
        gsonBuilder.registerTypeAdapterFactory((TypeAdapterFactory)new Class_2957());
        Field_2815 = gsonBuilder.create();
    }

    private void Method_2823(Class_2893 class_2893, JsonObject jsonObject, JsonSerializationContext jsonSerializationContext) {
        JsonElement jsonElement = jsonSerializationContext.serialize((Object)class_2893);
        if (jsonElement.isJsonObject()) {
            JsonObject jsonObject2 = (JsonObject)jsonElement;
            for (Map.Entry entry : jsonObject2.entrySet()) {
                jsonObject.add((String)entry.getKey(), (JsonElement)entry.getValue());
            }
        }
    }
}

