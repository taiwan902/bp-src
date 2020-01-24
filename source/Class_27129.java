/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 */
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Date;

public class Class_27129
extends Class_14287 {
    public Class_27129(String string, Date date, String string2, Date date2, String string3) {
        super(string, date, string2, date2, string3);
    }

    private static String Method_27130(JsonObject jsonObject) {
        return jsonObject.has("ip") ? jsonObject.get("ip").getAsString() : null;
    }

    protected void Method_27131(JsonObject jsonObject) {
        if (this.\u0000strictfp() != null) {
            jsonObject.addProperty("ip", (String)this.\u0000strictfp());
            super.Method_14297(jsonObject);
        }
    }

    private void Method_27132() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_27129(JsonObject jsonObject) {
        super(Class_27129.Method_27130(jsonObject), jsonObject);
    }
}

