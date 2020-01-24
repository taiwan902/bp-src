/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonParser
 */
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_35907
implements Class_16200 {
    private String Field_35908 = null;

    private void Method_35909() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_35910(String string, byte[] arrby, Throwable throwable) {
        if (arrby != null) {
            try {
                String string2 = new String(arrby, "ASCII");
                JsonParser jsonParser = new JsonParser();
                JsonElement jsonElement = jsonParser.parse(string2);
                Class_7667 class_7667 = new Class_7667(this.Field_35908);
                Class_16271 class_16271 = class_7667.Method_7669(jsonElement);
                if (class_16271 != null) {
                    class_16271.Method_16274((323 & 1717) != 0);
                    Class_20842.Method_20845(this.Field_35908, class_16271);
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    public Class_35907(String string) {
        this.Field_35908 = string;
    }
}

