/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ForwardingSet
 *  com.google.common.collect.Sets
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonPrimitive
 */
import com.google.common.collect.ForwardingSet;
import com.google.common.collect.Sets;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class Class_20086
extends ForwardingSet
implements Class_18520 {
    private final Set Field_20087 = Sets.newHashSet();

    protected Object Method_20088() {
        return this.Method_20093();
    }

    protected Collection Method_20089() {
        return this.Method_20093();
    }

    public JsonElement Method_20090() {
        JsonArray jsonArray = new JsonArray();
        Iterator iterator = this.iterator();
        while (iterator.hasNext()) {
            String string = (String)iterator.next();
            jsonArray.add((JsonElement)new JsonPrimitive(string));
        }
        return jsonArray;
    }

    private void Method_20091() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_20092(JsonElement jsonElement) {
        if (jsonElement.isJsonArray()) {
            for (JsonElement jsonElement2 : jsonElement.getAsJsonArray()) {
                this.add((Object)jsonElement2.getAsString());
            }
        }
    }

    protected Set Method_20093() {
        return this.Field_20087;
    }
}

