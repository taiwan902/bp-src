/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.TypeAdapterFactory
 */
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapterFactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Type;

public class Class_32003
implements Class_1486 {
    private static final Gson Field_32004 = new GsonBuilder().registerTypeAdapter(Class_13307.class, (Object)new Class_22051()).registerTypeAdapter(Class_21330.class, (Object)new Class_7722()).registerTypeAdapter(Class_3166.class, (Object)new Class_18218()).registerTypeHierarchyAdapter(Class_1782.class, (Object)new Class_2814()).registerTypeHierarchyAdapter(Class_2893.class, (Object)new Class_2951()).registerTypeAdapterFactory((TypeAdapterFactory)new Class_2957()).create();
    private Class_3166 Field_32005;

    private void Method_32006() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_32003(Class_3166 class_3166) {
        this.Field_32005 = class_3166;
    }

    public void Method_32007(Class_29900 class_29900) {
        class_29900.Method_29960(Field_32004.toJson((Object)this.Field_32005));
    }

    public Class_3166 Method_32008() {
        return this.Field_32005;
    }

    public void Method_32009(Class_29900 class_29900) {
        this.Field_32005 = (Class_3166)Field_32004.fromJson(class_29900.Method_29991(32767 & -1), Class_3166.class);
    }

    public void Method_32010(Class_12113 class_12113) {
        class_12113.Method_12115(this);
    }

    public void Method_32011(Class_10954 class_10954) {
        this.Method_32010((Class_12113)class_10954);
    }

    public Class_32003() {
    }
}

