/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.gson.Gson
 *  com.google.gson.TypeAdapter
 *  com.google.gson.TypeAdapterFactory
 *  com.google.gson.reflect.TypeToken
 */
import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Class_2957
implements TypeAdapterFactory {
    private void Method_2958() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public String Method_2959(Object object) {
        return object instanceof Enum ? ((Enum)object).name().toLowerCase(Locale.US) : object.toString().toLowerCase(Locale.US);
    }

    public TypeAdapter Method_2960(Gson gson, TypeToken typeToken) {
        Class class_ = typeToken.getRawType();
        if (!class_.isEnum()) {
            return null;
        }
        HashMap hashMap = Maps.newHashMap();
        T[] arrT = class_.getEnumConstants();
        int n = arrT.length;
        for (int i = 24737 & -32446; i < n; ++i) {
            Object t = arrT[i];
            hashMap.put(this.Method_2959(t), t);
        }
        return new Class_2961(this, hashMap);
    }
}

