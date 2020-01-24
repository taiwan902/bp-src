/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 */
import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Class_14097
implements JsonDeserializer {
    private void Method_14098() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_7944 Method_14099(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        List list = this.Method_14102(jsonDeserializationContext, jsonObject);
        return new Class_7944((Collection)list);
    }

    public Object Method_14100(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        return this.Method_14099(jsonElement, type, jsonDeserializationContext);
    }

    protected Class_44698 Method_14101(JsonDeserializationContext jsonDeserializationContext, Map.Entry entry) {
        String string = (String)entry.getKey();
        ArrayList arrayList = Lists.newArrayList();
        JsonElement jsonElement = (JsonElement)entry.getValue();
        if (jsonElement.isJsonArray()) {
            for (JsonElement jsonElement2 : jsonElement.getAsJsonArray()) {
                arrayList.add((Class_6963)jsonDeserializationContext.deserialize(jsonElement2, Class_6963.class));
            }
        } else {
            arrayList.add((Class_6963)jsonDeserializationContext.deserialize(jsonElement, Class_6963.class));
        }
        return new Class_44698(string, arrayList);
    }

    protected List Method_14102(JsonDeserializationContext jsonDeserializationContext, JsonObject jsonObject) {
        JsonObject jsonObject2 = Class_2986.Method_2991(jsonObject, "variants");
        ArrayList arrayList = Lists.newArrayList();
        for (Map.Entry entry : jsonObject2.entrySet()) {
            arrayList.add(this.Method_14101(jsonDeserializationContext, entry));
        }
        return arrayList;
    }
}

