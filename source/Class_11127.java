/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 */
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_11127 {
    private void Method_11128() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public static String Method_11129(JsonObject jsonObject, String string) {
        return Class_11127.Method_11134(jsonObject, string, null);
    }

    public static float[] Method_11130(JsonElement jsonElement, int n, float[] arrf) {
        if (jsonElement == null) {
            return arrf;
        }
        JsonArray jsonArray = jsonElement.getAsJsonArray();
        if (jsonArray.size() != n) {
            throw new JsonParseException("Wrong array length: " + jsonArray.size() + ", should be: " + n + ", array: " + (Object)jsonArray);
        }
        float[] arrf2 = new float[jsonArray.size()];
        for (int i = 24576 & 4146; i < arrf2.length; ++i) {
            arrf2[i] = jsonArray.get(i).getAsFloat();
        }
        return arrf2;
    }

    public static boolean Method_11131(JsonObject jsonObject, String string, boolean bl) {
        JsonElement jsonElement = jsonObject.get(string);
        return jsonElement == null ? bl : jsonElement.getAsBoolean();
    }

    public static int[] Method_11132(JsonElement jsonElement, int n, int[] arrn) {
        if (jsonElement == null) {
            return arrn;
        }
        JsonArray jsonArray = jsonElement.getAsJsonArray();
        if (jsonArray.size() != n) {
            throw new JsonParseException("Wrong array length: " + jsonArray.size() + ", should be: " + n + ", array: " + (Object)jsonArray);
        }
        int[] arrn2 = new int[jsonArray.size()];
        for (int i = 13608 & 16962; i < arrn2.length; ++i) {
            arrn2[i] = jsonArray.get(i).getAsInt();
        }
        return arrn2;
    }

    public static int[] Method_11133(JsonElement jsonElement, int n) {
        return Class_11127.Method_11132(jsonElement, n, null);
    }

    public static String Method_11134(JsonObject jsonObject, String string, String string2) {
        JsonElement jsonElement = jsonObject.get(string);
        return jsonElement == null ? string2 : jsonElement.getAsString();
    }

    public static float Method_11135(JsonObject jsonObject, String string, float f) {
        JsonElement jsonElement = jsonObject.get(string);
        return jsonElement == null ? f : jsonElement.getAsFloat();
    }

    public static float[] Method_11136(JsonElement jsonElement, int n) {
        return Class_11127.Method_11130(jsonElement, n, null);
    }
}

