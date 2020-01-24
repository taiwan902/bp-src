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

public class Class_13146
implements JsonDeserializer {
    public Object Method_13147(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        return this.Method_13149(jsonElement, type, jsonDeserializationContext);
    }

    private Class_12058 Method_13148(JsonDeserializationContext jsonDeserializationContext, JsonObject jsonObject, String string) {
        return jsonObject.has(string) ? (Class_12058)jsonDeserializationContext.deserialize(jsonObject.get(string), Class_12058.class) : Class_12058.Field_12061;
    }

    public Class_15852 Method_13149(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        Class_12058 class_12058 = this.Method_13148(jsonDeserializationContext, jsonObject, "thirdperson");
        Class_12058 class_120582 = this.Method_13148(jsonDeserializationContext, jsonObject, "firstperson");
        Class_12058 class_120583 = this.Method_13148(jsonDeserializationContext, jsonObject, "head");
        Class_12058 class_120584 = this.Method_13148(jsonDeserializationContext, jsonObject, "gui");
        Class_12058 class_120585 = this.Method_13148(jsonDeserializationContext, jsonObject, "ground");
        Class_12058 class_120586 = this.Method_13148(jsonDeserializationContext, jsonObject, "fixed");
        return new Class_15852(class_12058, class_120582, class_120583, class_120584, class_120585, class_120586);
    }

    private void Method_13150() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

