/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  org.apache.commons.lang3.StringUtils
 */
package net.minecraft.client.renderer.block.model;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.minecraft.client.renderer.block.model.ModelBlock;
import org.apache.commons.lang3.StringUtils;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ModelBlock$Deserializer
implements JsonDeserializer {
    public ModelBlock \u0000strictfp(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        List list = this.\u0000strictfp(jsonDeserializationContext, jsonObject);
        String string = this.\u0000strictfp(jsonObject);
        boolean bl = StringUtils.isEmpty((CharSequence)string);
        boolean bl2 = list.isEmpty();
        if (bl2 && bl) {
            throw new JsonParseException("BlockModel requires either elements or parent, found neither");
        }
        if (!bl && !bl2) {
            throw new JsonParseException("BlockModel requires either elements or parent, found both");
        }
        Map map = this.\u0000strictfp(jsonObject);
        boolean bl3 = this.\u0000strictfp(jsonObject);
        Class_15852 class_15852 = Class_15852.Field_15866;
        if (jsonObject.has("display")) {
            JsonObject jsonObject2 = Class_2986.Method_2991(jsonObject, "display");
            class_15852 = (Class_15852)jsonDeserializationContext.deserialize((JsonElement)jsonObject2, Class_15852.class);
        }
        return bl2 ? new ModelBlock(new Class_2080(string), map, bl3, (8269 & 275) != 0, class_15852) : new ModelBlock(list, map, bl3, (30729 & 1411) != 0, class_15852);
    }

    public Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        return this.\u0000strictfp(jsonElement, type, jsonDeserializationContext);
    }

    private String \u0000strictfp(JsonObject jsonObject) {
        return Class_2986.Method_2994(jsonObject, "parent", "");
    }

    private Map \u0000strictfp(JsonObject jsonObject) {
        HashMap hashMap = Maps.newHashMap();
        if (jsonObject.has("textures")) {
            JsonObject jsonObject2 = jsonObject.getAsJsonObject("textures");
            for (Map.Entry entry : jsonObject2.entrySet()) {
                hashMap.put(entry.getKey(), ((JsonElement)entry.getValue()).getAsString());
            }
        }
        return hashMap;
    }

    protected List \u0000strictfp(JsonDeserializationContext jsonDeserializationContext, JsonObject jsonObject) {
        ArrayList arrayList = Lists.newArrayList();
        if (jsonObject.has("elements")) {
            for (JsonElement jsonElement : Class_2986.Method_2998(jsonObject, "elements")) {
                arrayList.add((Class_5986)jsonDeserializationContext.deserialize(jsonElement, Class_5986.class));
            }
        }
        return arrayList;
    }

    private void \u0000] \u000a volatile ? ^ void , \u000a extends null class 8 do float case int 8 - this | 1 $ + ^ this float \u000a } boolean finally ' 6 abstract void synchronized + \u000a final " catch ^ # byte abstract break goto 7 class abstract \u000a do abstract void null new package false char() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected boolean \u0000strictfp(JsonObject jsonObject) {
        return Class_2986.Method_3006(jsonObject, "ambientocclusion", (16757 & -21885) != 0);
    }
}

