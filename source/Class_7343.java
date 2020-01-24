/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  internal.org.lwjgl.util.vector.Vector
 *  internal.org.lwjgl.util.vector.Vector3f
 */
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import internal.org.lwjgl.util.vector.Vector;
import internal.org.lwjgl.util.vector.Vector3f;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Type;

public class Class_7343
implements JsonDeserializer {
    private static final Vector3f Field_7344 = new Vector3f(0.0f, 0.0f, 0.0f);
    private static final Vector3f Field_7345;
    private static final Vector3f Field_7346;

    private void Method_7347() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private Vector3f Method_7348(JsonObject jsonObject, String string, Vector3f vector3f) {
        if (!jsonObject.has(string)) {
            return vector3f;
        }
        JsonArray jsonArray = Class_2986.Method_2998(jsonObject, string);
        if (jsonArray.size() != (3543 & 16395)) {
            throw new JsonParseException("Expected 3 " + string + " values, found: " + jsonArray.size());
        }
        float[] arrf = new float[17223 & -19437];
        for (int i = 4101 & -32640; i < arrf.length; ++i) {
            arrf[i] = Class_2986.Method_3012(jsonArray.get(i), string + "[" + i + "]");
        }
        return new Vector3f(arrf[5443 & -32728], arrf[-6139 & 129], arrf[38 & 1042]);
    }

    static {
        Field_7346 = new Vector3f(0.0f, 0.0f, 0.0f);
        Field_7345 = new Vector3f(1.0f, 1.0f, 1.0f);
    }

    public Class_12058 Method_7349(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        Vector3f vector3f = this.Method_7348(jsonObject, "rotation", Field_7344);
        Vector3f vector3f2 = this.Method_7348(jsonObject, "translation", Field_7346);
        vector3f2.scale(0.1f * 0.625f);
        vector3f2.x = Class_13337.Method_13360(vector3f2.x, 0.8947368f * -1.6764706f, 3.5357141f * 0.42424244f);
        vector3f2.y = Class_13337.Method_13360(vector3f2.y, 0.24f * -6.25f, 1.3636364f * 1.1f);
        vector3f2.z = Class_13337.Method_13360(vector3f2.z, -1.4387755f * 1.0425532f, 0.85465115f * 1.755102f);
        Vector3f vector3f3 = this.Method_7348(jsonObject, "scale", Field_7345);
        vector3f3.x = Class_13337.Method_13360(vector3f3.x, 1.74f * -2.2988505f, 1.8795182f * 2.128205f);
        vector3f3.y = Class_13337.Method_13360(vector3f3.y, 0.10769231f * -37.142857f, 3.695652f * 1.082353f);
        vector3f3.z = Class_13337.Method_13360(vector3f3.z, -2.7826087f * 1.4375f, 2.9473686f * 1.3571428f);
        return new Class_12058(vector3f, vector3f2, vector3f3);
    }

    public Object Method_7350(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        return this.Method_7349(jsonElement, type, jsonDeserializationContext);
    }
}

