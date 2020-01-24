/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 */
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Type;

public class Class_16091
implements JsonDeserializer {
    protected String Method_16092(JsonObject jsonObject) {
        return Class_2986.Method_3001(jsonObject, "model");
    }

    protected Class_35032 Method_16093(JsonObject jsonObject) {
        int n;
        int n2 = Class_2986.Method_3009(jsonObject, "x", 6144 & 581);
        Class_35032 class_35032 = Class_35032.Method_35070(n2, n = Class_2986.Method_3009(jsonObject, "y", 16394 & 513));
        if (class_35032 == null) {
            throw new JsonParseException("Invalid BlockModelRotation x: " + n2 + ", y: " + n);
        }
        return class_35032;
    }

    public Class_6963 Method_16094(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        String string = this.Method_16092(jsonObject);
        Class_35032 class_35032 = this.Method_16093(jsonObject);
        boolean bl = this.Method_16096(jsonObject);
        int n = this.Method_16099(jsonObject);
        return new Class_6963(this.Method_16095(string), class_35032, bl, n);
    }

    private Class_2080 Method_16095(String string) {
        Class_2080 class_2080 = new Class_2080(string);
        class_2080 = new Class_2080(class_2080.Method_2085(), "block/" + class_2080.Method_2084());
        return class_2080;
    }

    private boolean Method_16096(JsonObject jsonObject) {
        return Class_2986.Method_3006(jsonObject, "uvlock", (6 & 30000) != 0);
    }

    public Object Method_16097(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        return this.Method_16094(jsonElement, type, jsonDeserializationContext);
    }

    private void Method_16098() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected int Method_16099(JsonObject jsonObject) {
        return Class_2986.Method_3009(jsonObject, "weight", 3075 & -24571);
    }
}

