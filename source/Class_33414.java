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
import java.awt.Dimension;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Class_33414 {
    private static JsonParser Field_33415 = new JsonParser();

    private static void Method_33416(Object object, String string) {
        if (object == null) {
            throw new JsonParseException(string);
        }
    }

    private static Class_6070 Method_33417(JsonObject jsonObject, Dimension dimension) {
        String string = Class_11127.Method_11129(jsonObject, "type");
        if (!Class_19426.Method_19529(string, "ModelBox")) {
            Class_19426.Method_19610("Unknown model type: " + string);
            return null;
        }
        String string2 = Class_11127.Method_11129(jsonObject, "attachTo");
        int n = Class_33414.Method_33419(string2);
        float f = Class_11127.Method_11135(jsonObject, "scale", 1.0f);
        Class_36423 class_36423 = new Class_36423();
        class_36423.Field_33787 = dimension.width;
        class_36423.Field_33786 = dimension.height;
        Class_31961 class_31961 = Class_33414.Method_33418(jsonObject, class_36423);
        Class_6070 class_6070 = new Class_6070(n, f, class_31961);
        return class_6070;
    }

    private static Class_31961 Method_33418(JsonObject jsonObject, Class_33781 class_33781) {
        JsonArray jsonArray;
        JsonObject jsonObject2;
        JsonObject jsonObject3;
        JsonArray jsonArray2;
        int[] arrn;
        Class_31961 class_31961 = new Class_31961(class_33781);
        String string = Class_11127.Method_11134(jsonObject, "invertAxis", "").toLowerCase();
        boolean bl = string.contains("x");
        boolean bl2 = string.contains("y");
        boolean bl3 = string.contains("z");
        float[] arrf = Class_11127.Method_11130(jsonObject.get("translate"), -27233 & 3, new float[3331 & 75]);
        if (bl) {
            arrf[545 & 8192] = -arrf[18 & 1057];
        }
        if (bl2) {
            arrf[-6143 & 67] = -arrf[291 & 12809];
        }
        if (bl3) {
            arrf[18434 & 9742] = -arrf[8354 & -12774];
        }
        float[] arrf2 = Class_11127.Method_11130(jsonObject.get("rotate"), 611 & -25593, new float[11 & 51]);
        for (int i = 4402 & 16385; i < arrf2.length; ++i) {
            arrf2[i] = arrf2[i] / (1597.5f * 0.112676054f) * (1.8920956f * 1.6603774f);
        }
        if (bl) {
            arrf2[-32736 & 20] = -arrf2[-24444 & 19769];
        }
        if (bl2) {
            arrf2[7185 & 8455] = -arrf2[10817 & -32629];
        }
        if (bl3) {
            arrf2[4130 & 1302] = -arrf2[4118 & 2114];
        }
        class_31961.Method_31993(arrf[448 & 4150], arrf[-27447 & 295], arrf[226 & 10254]);
        class_31961.Field_31984 = arrf2[8736 & 16469];
        class_31961.Field_31968 = arrf2[2585 & 97];
        class_31961.Field_31969 = arrf2[5506 & 8259];
        String string2 = Class_11127.Method_11134(jsonObject, "mirrorTexture", "").toLowerCase();
        boolean bl4 = string2.contains("u");
        boolean bl5 = string2.contains("v");
        if (bl4) {
            class_31961.Field_31965 = -26367 & 8337;
        }
        if (bl5) {
            class_31961.Field_31963 = 7429 & -16359;
        }
        if ((jsonArray2 = jsonObject.getAsJsonArray("boxes")) != null) {
            for (int i = -32732 & 1411; i < jsonArray2.size(); ++i) {
                JsonObject jsonObject4 = jsonArray2.get(i).getAsJsonObject();
                jsonObject3 = Class_11127.Method_11133(jsonObject4.get("textureOffset"), 326 & 2050);
                if (jsonObject3 == null) {
                    throw new JsonParseException("Texture offset not specified");
                }
                arrn = Class_11127.Method_11136(jsonObject4.get("coordinates"), 774 & 16518);
                if (arrn == null) {
                    throw new JsonParseException("Coordinates not specified");
                }
                if (bl) {
                    arrn[536 & 17633] = -arrn[-32159 & 16] - arrn[67 & 10387];
                }
                if (bl2) {
                    arrn[5657 & 2371] = -arrn[9 & 10339] - arrn[10756 & 30];
                }
                if (bl3) {
                    arrn[17414 & 690] = -arrn[5171 & 25026] - arrn[21 & -24467];
                }
                float f = Class_11127.Method_11135(jsonObject4, "sizeAdd", 0.0f);
                class_31961.Method_31988(jsonObject3[4490 & 3584], jsonObject3[1057 & 19287]);
                class_31961.Method_31998(arrn[18432 & 8714], arrn[-30583 & 1029], arrn[8194 & 17635], arrn[22647 & 771], arrn[-30452 & 1637], arrn[-31723 & 26629], f);
            }
        }
        if ((jsonArray = jsonObject.getAsJsonArray("sprites")) != null) {
            for (int i = 17032 & 1285; i < jsonArray.size(); ++i) {
                jsonObject3 = jsonArray.get(i).getAsJsonObject();
                arrn = Class_11127.Method_11133(jsonObject3.get("textureOffset"), -32154 & 2203);
                if (arrn == null) {
                    throw new JsonParseException("Texture offset not specified");
                }
                float[] arrf3 = Class_11127.Method_11136(jsonObject3.get("coordinates"), 18967 & 9254);
                if (arrf3 == null) {
                    throw new JsonParseException("Coordinates not specified");
                }
                if (bl) {
                    arrf3[20640 & 6] = -arrf3[58 & 16128] - arrf3[3 & 6803];
                }
                if (bl2) {
                    arrf3[5 & 15377] = -arrf3[65 & 4117] - arrf3[4396 & 2566];
                }
                if (bl3) {
                    arrf3[-11705 & 9402] = -arrf3[25714 & 6] - arrf3[-19771 & 1317];
                }
                float f = Class_11127.Method_11135(jsonObject3, "sizeAdd", 0.0f);
                class_31961.Method_31988(arrn[15496 & 274], arrn[569 & 7171]);
                class_31961.Method_31989(arrf3[-31952 & 8390], arrf3[23381 & 1153], arrf3[18482 & -27633], (int)arrf3[2083 & -27045], (int)arrf3[-24380 & 278], (int)arrf3[5 & 5893], f);
            }
        }
        if ((jsonObject2 = (JsonObject)jsonObject.get("submodel")) != null) {
            jsonObject3 = Class_33414.Method_33418(jsonObject2, class_33781);
            class_31961.Method_31990((Class_31961)jsonObject3);
        }
        if ((jsonObject3 = (JsonArray)jsonObject.get("submodels")) != null) {
            for (int i = 16470 & 5152; i < jsonObject3.size(); ++i) {
                JsonObject jsonObject5 = (JsonObject)jsonObject3.get(i);
                Class_31961 class_319612 = Class_33414.Method_33418(jsonObject5, class_33781);
                class_31961.Method_31990(class_319612);
            }
        }
        return class_31961;
    }

    private static int Method_33419(String string) {
        if (string == null) {
            return 16388 & 4609;
        }
        if (string.equals("body")) {
            return 19585 & 0;
        }
        if (string.equals("head")) {
            return -15871 & 12459;
        }
        if (string.equals("leftArm")) {
            return 2 & 17806;
        }
        if (string.equals("rightArm")) {
            return 8275 & 3331;
        }
        if (string.equals("leftLeg")) {
            return 8262 & -32244;
        }
        if (string.equals("rightLeg")) {
            return 517 & 2119;
        }
        if (string.equals("cape")) {
            return 28678 & 391;
        }
        Class_19426.Method_19610("Unknown attachModel: " + string);
        return -24367 & 0;
    }

    public static Class_13000 Method_33420(JsonObject jsonObject) {
        String string = Class_11127.Method_11129(jsonObject, "type");
        if (!Class_19426.Method_19529(string, "PlayerItem")) {
            throw new JsonParseException("Unknown model type: " + string);
        }
        int[] arrn = Class_11127.Method_11133(jsonObject.get("textureSize"), 9443 & -27874);
        Class_33414.Method_33416(arrn, "Missing texture size");
        Dimension dimension = new Dimension(arrn[655 & 31840], arrn[17687 & 553]);
        boolean bl = Class_11127.Method_11131(jsonObject, "usePlayerTexture", (260 & 26128) != 0);
        JsonArray jsonArray = (JsonArray)jsonObject.get("models");
        Class_33414.Method_33416((Object)jsonArray, "Missing elements");
        HashMap<String, JsonObject> hashMap = new HashMap<String, JsonObject>();
        ArrayList<Object> arrayList = new ArrayList<Object>();
        new ArrayList();
        for (int i = 7936 & 8273; i < jsonArray.size(); ++i) {
            Object object;
            String string2;
            JsonObject jsonObject2 = (JsonObject)jsonArray.get(i);
            String string3 = Class_11127.Method_11129(jsonObject2, "baseId");
            if (string3 != null) {
                string2 = (JsonObject)hashMap.get(string3);
                if (string2 == null) {
                    Class_19426.Method_19610("BaseID not found: " + string3);
                    continue;
                }
                object = string2.entrySet().iterator();
                while (object.hasNext()) {
                    Map.Entry entry = (Map.Entry)object.next();
                    if (jsonObject2.has((String)entry.getKey())) continue;
                    jsonObject2.add((String)entry.getKey(), (JsonElement)entry.getValue());
                }
            }
            if ((string2 = Class_11127.Method_11129(jsonObject2, "id")) != null) {
                if (!hashMap.containsKey(string2)) {
                    hashMap.put(string2, jsonObject2);
                } else {
                    Class_19426.Method_19610("Duplicate model ID: " + string2);
                }
            }
            if ((object = Class_33414.Method_33417(jsonObject2, dimension)) == null) continue;
            arrayList.add(object);
        }
        Class_6070[] arrclass_6070 = arrayList.toArray(new Class_6070[arrayList.size()]);
        return new Class_13000(dimension, bl, arrclass_6070);
    }

    private void Method_33421() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

