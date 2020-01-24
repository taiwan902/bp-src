/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.gson.TypeAdapter
 *  com.google.gson.stream.JsonReader
 *  com.google.gson.stream.JsonToken
 *  com.google.gson.stream.JsonWriter
 */
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Map;

public class Class_2961
extends TypeAdapter {
    final Class_2957 Field_2962;
    final Map Field_2963;

    public Object Method_2964(JsonReader jsonReader) {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        return this.Field_2963.get(jsonReader.nextString());
    }

    private void Method_2965() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_2961(Class_2957 class_2957, Map map) {
        this.Field_2962 = class_2957;
        this.Field_2963 = map;
    }

    public void Method_2966(JsonWriter jsonWriter, Object object) {
        if (object == null) {
            jsonWriter.nullValue();
        } else {
            jsonWriter.value(this.Field_2962.Method_2959(object));
        }
    }
}

