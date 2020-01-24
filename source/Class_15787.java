/*
 * Decompiled with CFR 0.145.
 */
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;

public class Class_15787 {
    private static Class_10310[] Field_15788 = new Class_10310[0 & 3376];

    private void Method_15789() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public static Class_14461 Method_15790(Class_4751 class_4751, Class_14461 class_14461) {
        Class_11372 class_11372 = class_14461.Method_14476();
        if (class_11372 == null) {
            return class_14461;
        }
        Class_10310 class_10310 = Class_15787.Method_15791(class_11372);
        if (class_10310 == null) {
            return class_14461;
        }
        int n = Class_25918.Method_25956(class_14461.Method_14475());
        int n2 = Class_19426.Method_19566(class_4751, n);
        int n3 = 12963 & 18760;
        int n4 = 5219 & 10380;
        if (class_10310.Field_10312 > (1027 & 18657)) {
            n3 = n2 & (323 & 4647);
        }
        if (class_10310.Field_10312 == (2 & 275)) {
            n3 = n3 / (8230 & 17434) * (8979 & 1090);
        }
        if (class_10310.Field_10313) {
            n4 = (n2 & (1317 & -30716)) != 0 ? 2257 & -16383 : 283 & -19328;
        }
        return class_10310.Method_10316(class_14461, n3, n4 != 0);
    }

    public static Class_10310 Method_15791(Class_11372 class_11372) {
        if (!(class_11372 instanceof Class_11372)) {
            return null;
        }
        int n = class_11372.Method_11426();
        if (n >= 0 && n < Field_15788.length) {
            Class_10310 class_10310 = Field_15788[n];
            return class_10310;
        }
        return null;
    }

    private static void Method_15792(List list, String string, String string2) {
        Class_24069 class_24069 = Class_21583.Method_21616();
        Class_11372 class_11372 = class_24069.Method_24107("minecraft:blocks/" + string);
        if (class_11372 == null) {
            Class_19426.Method_19610("*** NaturalProperties: Icon not found: " + string + " ***");
        } else if (!(class_11372 instanceof Class_11372)) {
            Class_19426.Method_19610("*** NaturalProperties: Icon is not IconStitched: " + string + ": " + class_11372.getClass().getName() + " ***");
        } else {
            int n = class_11372.Method_11426();
            if (n < 0) {
                Class_19426.Method_19610("*** NaturalProperties: Invalid index for icon: " + string + ": " + n + " ***");
            } else if (Class_19426.Method_19501(new Class_2080("textures/blocks/" + string + ".png"))) {
                while (n >= list.size()) {
                    list.add(null);
                }
                Class_10310 class_10310 = new Class_10310(string2);
                list.set(n, class_10310);
                Class_19426.Method_19526("NaturalTextures: " + string + " = " + string2);
            }
        }
    }

    public static void Method_15793() {
        Field_15788 = new Class_10310[5200 & -30720];
        if (Class_19426.Method_19477()) {
            String string = "optifine/natural.properties";
            try {
                Class_2080 class_2080 = new Class_2080(string);
                if (!Class_19426.Method_19594(class_2080)) {
                    Class_19426.Method_19526("NaturalTextures: configuration \"" + string + "\" not found");
                    Field_15788 = Class_15787.Method_15794();
                    return;
                }
                InputStream inputStream = Class_19426.Method_19493(class_2080);
                ArrayList<Class_10310> arrayList = new ArrayList<Class_10310>(6434 & 26396);
                String string2 = Class_19426.Method_19586(inputStream);
                inputStream.close();
                String[] arrstring = Class_19426.Method_19561(string2, "\n\r");
                Class_19426.Method_19526("Natural Textures: Parsing configuration \"" + string + "\"");
                Class_24069 class_24069 = Class_21583.Method_21616();
                for (int i = 1283 & -32768; i < arrstring.length; ++i) {
                    String string3 = arrstring[i].trim();
                    if (string3.startsWith("#")) continue;
                    String[] arrstring2 = Class_19426.Method_19561(string3, "=");
                    if (arrstring2.length != (530 & -30586)) {
                        Class_19426.Method_19610("Natural Textures: Invalid \"" + string + "\" line: " + string3);
                        continue;
                    }
                    String string4 = arrstring2[1201 & -21946].trim();
                    String string5 = arrstring2[-30583 & 16385].trim();
                    Class_11372 class_11372 = class_24069.Method_24107("minecraft:blocks/" + string4);
                    if (class_11372 == null) {
                        Class_19426.Method_19610("Natural Textures: Texture not found: \"" + string + "\" line: " + string3);
                        continue;
                    }
                    int n = class_11372.Method_11426();
                    if (n < 0) {
                        Class_19426.Method_19610("Natural Textures: Invalid \"" + string + "\" line: " + string3);
                        continue;
                    }
                    Class_10310 class_10310 = new Class_10310(string5);
                    if (!class_10310.Method_10317()) continue;
                    while (arrayList.size() <= n) {
                        arrayList.add(null);
                    }
                    arrayList.set(n, class_10310);
                }
                Field_15788 = arrayList.toArray(new Class_10310[arrayList.size()]);
            }
            catch (FileNotFoundException fileNotFoundException) {
                Class_19426.Method_19610("NaturalTextures: configuration \"" + string + "\" not found");
                Field_15788 = Class_15787.Method_15794();
                return;
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    private static Class_10310[] Method_15794() {
        Class_19426.Method_19526("NaturalTextures: Creating default configuration.");
        ArrayList arrayList = new ArrayList();
        Class_15787.Method_15792(arrayList, "coarse_dirt", "4F");
        Class_15787.Method_15792(arrayList, "grass_side", "F");
        Class_15787.Method_15792(arrayList, "grass_side_overlay", "F");
        Class_15787.Method_15792(arrayList, "stone_slab_top", "F");
        Class_15787.Method_15792(arrayList, "gravel", "2");
        Class_15787.Method_15792(arrayList, "log_oak", "2F");
        Class_15787.Method_15792(arrayList, "log_spruce", "2F");
        Class_15787.Method_15792(arrayList, "log_birch", "F");
        Class_15787.Method_15792(arrayList, "log_jungle", "2F");
        Class_15787.Method_15792(arrayList, "log_acacia", "2F");
        Class_15787.Method_15792(arrayList, "log_big_oak", "2F");
        Class_15787.Method_15792(arrayList, "log_oak_top", "4F");
        Class_15787.Method_15792(arrayList, "log_spruce_top", "4F");
        Class_15787.Method_15792(arrayList, "log_birch_top", "4F");
        Class_15787.Method_15792(arrayList, "log_jungle_top", "4F");
        Class_15787.Method_15792(arrayList, "log_acacia_top", "4F");
        Class_15787.Method_15792(arrayList, "log_big_oak_top", "4F");
        Class_15787.Method_15792(arrayList, "leaves_oak", "2F");
        Class_15787.Method_15792(arrayList, "leaves_spruce", "2F");
        Class_15787.Method_15792(arrayList, "leaves_birch", "2F");
        Class_15787.Method_15792(arrayList, "leaves_jungle", "2");
        Class_15787.Method_15792(arrayList, "leaves_big_oak", "2F");
        Class_15787.Method_15792(arrayList, "leaves_acacia", "2F");
        Class_15787.Method_15792(arrayList, "gold_ore", "2F");
        Class_15787.Method_15792(arrayList, "iron_ore", "2F");
        Class_15787.Method_15792(arrayList, "coal_ore", "2F");
        Class_15787.Method_15792(arrayList, "diamond_ore", "2F");
        Class_15787.Method_15792(arrayList, "redstone_ore", "2F");
        Class_15787.Method_15792(arrayList, "lapis_ore", "2F");
        Class_15787.Method_15792(arrayList, "obsidian", "4F");
        Class_15787.Method_15792(arrayList, "snow", "4F");
        Class_15787.Method_15792(arrayList, "grass_side_snowed", "F");
        Class_15787.Method_15792(arrayList, "cactus_side", "2F");
        Class_15787.Method_15792(arrayList, "clay", "4F");
        Class_15787.Method_15792(arrayList, "mycelium_side", "F");
        Class_15787.Method_15792(arrayList, "mycelium_top", "4F");
        Class_15787.Method_15792(arrayList, "farmland_wet", "2F");
        Class_15787.Method_15792(arrayList, "farmland_dry", "2F");
        Class_15787.Method_15792(arrayList, "netherrack", "4F");
        Class_15787.Method_15792(arrayList, "soul_sand", "4F");
        Class_15787.Method_15792(arrayList, "glowstone", "4");
        Class_15787.Method_15792(arrayList, "end_stone", "4");
        Class_15787.Method_15792(arrayList, "sandstone_top", "4");
        Class_15787.Method_15792(arrayList, "sandstone_bottom", "4F");
        Class_15787.Method_15792(arrayList, "redstone_lamp_on", "4F");
        Class_15787.Method_15792(arrayList, "redstone_lamp_off", "4F");
        Class_10310[] arrclass_10310 = arrayList.toArray(new Class_10310[arrayList.size()]);
        return arrclass_10310;
    }
}

