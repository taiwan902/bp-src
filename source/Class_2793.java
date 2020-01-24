/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.TypeAdapterFactory
 */
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapterFactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Type;

public class Class_2793 {
    private final GsonBuilder Field_2794 = new GsonBuilder();
    private final Class_2801 Field_2795 = new Class_2804();
    private Gson Field_2796;

    public Class_2793() {
        this.Field_2794.registerTypeHierarchyAdapter(Class_1782.class, (Object)new Class_2814());
        this.Field_2794.registerTypeHierarchyAdapter(Class_2893.class, (Object)new Class_2951());
        this.Field_2794.registerTypeAdapterFactory((TypeAdapterFactory)new Class_2957());
    }

    private void Method_2797() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_25993 Method_2798(String string, JsonObject jsonObject) {
        if (string == null) {
            throw new IllegalArgumentException("Metadata section name cannot be null");
        }
        if (!jsonObject.has(string)) {
            return null;
        }
        if (!jsonObject.get(string).isJsonObject()) {
            throw new IllegalArgumentException("Invalid metadata for '" + string + "' - expected object, found " + (Object)jsonObject.get(string));
        }
        Class_10294 class_10294 = (Class_10294)this.Field_2795.Method_2802(string);
        if (class_10294 == null) {
            throw new IllegalArgumentException("Don't know how to handle metadata section '" + string + "'");
        }
        return (Class_25993)this.Method_2800().fromJson((JsonElement)jsonObject.getAsJsonObject(string), class_10294.Field_10296);
    }

    public void Method_2799(Class_2078 class_2078, Class class_) {
        this.Field_2795.Method_2803(class_2078.Method_2079(), new Class_10294(this, class_2078, class_, null));
        this.Field_2794.registerTypeAdapter((Type)class_, (Object)class_2078);
        this.Field_2796 = null;
    }

    private Gson Method_2800() {
        if (this.Field_2796 == null) {
            this.Field_2796 = this.Field_2794.create();
        }
        return this.Field_2796;
    }
}

