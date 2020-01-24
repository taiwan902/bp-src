/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.google.gson.JsonParser
 */
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.net.URL;
import javax.imageio.ImageIO;

public class Class_7667 {
    private String Field_7668 = null;

    public Class_16271 Method_7669(JsonElement jsonElement) {
        if (jsonElement == null) {
            throw new JsonParseException("JSON object is null, player: " + this.Field_7668);
        }
        JsonObject jsonObject = (JsonObject)jsonElement;
        Class_16271 class_16271 = new Class_16271();
        JsonArray jsonArray = (JsonArray)jsonObject.get("items");
        if (jsonArray != null) {
            for (int i = -16383 & 10496; i < jsonArray.size(); ++i) {
                Class_13000 class_13000;
                JsonObject jsonObject2 = (JsonObject)jsonArray.get(i);
                boolean bl = Class_11127.Method_11131(jsonObject2, "active", (5297 & -24063) != 0);
                if (!bl) continue;
                String string = Class_11127.Method_11129(jsonObject2, "type");
                if (string == null) {
                    Class_19426.Method_19610("Item type is null, player: " + this.Field_7668);
                    continue;
                }
                String string2 = Class_11127.Method_11129(jsonObject2, "model");
                if (string2 == null) {
                    string2 = "items/" + string + "/model.cfg";
                }
                if ((class_13000 = this.Method_7670(string2)) == null) continue;
                if (!class_13000.Method_13008()) {
                    BufferedImage bufferedImage;
                    String string3 = Class_11127.Method_11129(jsonObject2, "texture");
                    if (string3 == null) {
                        string3 = "items/" + string + "/users/" + this.Field_7668 + ".png";
                    }
                    if ((bufferedImage = this.Method_7671(string3)) == null) continue;
                    class_13000.Method_13009(bufferedImage);
                    Class_2080 class_2080 = new Class_2080("optifine.net", string3);
                    class_13000.Method_13012(class_2080);
                }
                class_16271.Method_16275(class_13000);
            }
        }
        return class_16271;
    }

    private Class_13000 Method_7670(String string) {
        String string2 = "http://s.optifine.net/" + string;
        try {
            byte[] arrby = Class_15260.Method_15262(string2);
            String string3 = new String(arrby, "ASCII");
            JsonParser jsonParser = new JsonParser();
            JsonObject jsonObject = (JsonObject)jsonParser.parse(string3);
            Class_33414 class_33414 = new Class_33414();
            Class_13000 class_13000 = Class_33414.Method_33420(jsonObject);
            return class_13000;
        }
        catch (Exception exception) {
            Class_19426.Method_19610("Error loading item model " + string + ": " + exception.getClass().getName() + ": " + exception.getMessage());
            return null;
        }
    }

    public Class_7667(String string) {
        this.Field_7668 = string;
    }

    private BufferedImage Method_7671(String string) {
        String string2 = "http://s.optifine.net/" + string;
        try {
            BufferedImage bufferedImage = ImageIO.read(new URL(string2));
            return bufferedImage;
        }
        catch (IOException iOException) {
            Class_19426.Method_19610("Error loading item texture " + string + ": " + iOException.getClass().getName() + ": " + iOException.getMessage());
            return null;
        }
    }

    private void Method_7672() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

