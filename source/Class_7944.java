/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 */
import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.Reader;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class Class_7944 {
    static final Gson Field_7945 = new GsonBuilder().registerTypeAdapter(Class_7944.class, (Object)new Class_14097()).registerTypeAdapter(Class_6963.class, (Object)new Class_16091()).create();
    private final Map Field_7946 = Maps.newHashMap();

    public Class_7944(List list) {
        for (Class_7944 class_7944 : list) {
            this.Field_7946.putAll(class_7944.Field_7946);
        }
    }

    public static Class_7944 Method_7947(Reader reader) {
        return (Class_7944)Field_7945.fromJson(reader, Class_7944.class);
    }

    public Class_44698 Method_7948(String string) {
        Class_44698 class_44698 = (Class_44698)this.Field_7946.get(string);
        if (class_44698 == null) {
            throw new Class_19860(this);
        }
        return class_44698;
    }

    public Class_7944(Collection collection) {
        for (Class_44698 class_44698 : collection) {
            this.Field_7946.put(Class_44698.Method_44705(class_44698), class_44698);
        }
    }

    public int Method_7949() {
        return this.Field_7946.hashCode();
    }

    private void Method_7950() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_7951(Object object) {
        if (this == object) {
            return (3337 & 101) != 0;
        }
        if (object instanceof Class_7944) {
            Class_7944 class_7944 = (Class_7944)object;
            return this.Field_7946.equals(class_7944.Field_7946);
        }
        return (268 & 2226) != 0;
    }
}

