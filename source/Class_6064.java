/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSerializationContext
 *  com.google.gson.JsonSerializer
 */
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Type;

public class Class_6064
implements JsonDeserializer,
JsonSerializer {
    public JsonElement Method_6065(Class_25402 class_25402, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("coordinateScale", (Number)Float.valueOf(class_25402.Field_25466));
        jsonObject.addProperty("heightScale", (Number)Float.valueOf(class_25402.Field_25407));
        jsonObject.addProperty("lowerLimitScale", (Number)Float.valueOf(class_25402.Field_25439));
        jsonObject.addProperty("upperLimitScale", (Number)Float.valueOf(class_25402.Field_25438));
        jsonObject.addProperty("depthNoiseScaleX", (Number)Float.valueOf(class_25402.Field_25467));
        jsonObject.addProperty("depthNoiseScaleZ", (Number)Float.valueOf(class_25402.Field_25456));
        jsonObject.addProperty("depthNoiseScaleExponent", (Number)Float.valueOf(class_25402.Field_25419));
        jsonObject.addProperty("mainNoiseScaleX", (Number)Float.valueOf(class_25402.Field_25448));
        jsonObject.addProperty("mainNoiseScaleY", (Number)Float.valueOf(class_25402.Field_25472));
        jsonObject.addProperty("mainNoiseScaleZ", (Number)Float.valueOf(class_25402.Field_25474));
        jsonObject.addProperty("baseSize", (Number)Float.valueOf(class_25402.Field_25481));
        jsonObject.addProperty("stretchY", (Number)Float.valueOf(class_25402.Field_25404));
        jsonObject.addProperty("biomeDepthWeight", (Number)Float.valueOf(class_25402.Field_25455));
        jsonObject.addProperty("biomeDepthOffset", (Number)Float.valueOf(class_25402.Field_25446));
        jsonObject.addProperty("biomeScaleWeight", (Number)Float.valueOf(class_25402.Field_25413));
        jsonObject.addProperty("biomeScaleOffset", (Number)Float.valueOf(class_25402.Field_25437));
        jsonObject.addProperty("seaLevel", (Number)class_25402.Field_25409);
        jsonObject.addProperty("useCaves", Boolean.valueOf(class_25402.Field_25418));
        jsonObject.addProperty("useDungeons", Boolean.valueOf(class_25402.Field_25453));
        jsonObject.addProperty("dungeonChance", (Number)class_25402.Field_25451);
        jsonObject.addProperty("useStrongholds", Boolean.valueOf(class_25402.Field_25420));
        jsonObject.addProperty("useVillages", Boolean.valueOf(class_25402.Field_25457));
        jsonObject.addProperty("useMineShafts", Boolean.valueOf(class_25402.Field_25460));
        jsonObject.addProperty("useTemples", Boolean.valueOf(class_25402.Field_25477));
        jsonObject.addProperty("useMonuments", Boolean.valueOf(class_25402.Field_25406));
        jsonObject.addProperty("useRavines", Boolean.valueOf(class_25402.Field_25403));
        jsonObject.addProperty("useWaterLakes", Boolean.valueOf(class_25402.Field_25444));
        jsonObject.addProperty("waterLakeChance", (Number)class_25402.Field_25462);
        jsonObject.addProperty("useLavaLakes", Boolean.valueOf(class_25402.Field_25452));
        jsonObject.addProperty("lavaLakeChance", (Number)class_25402.Field_25440);
        jsonObject.addProperty("useLavaOceans", Boolean.valueOf(class_25402.Field_25447));
        jsonObject.addProperty("fixedBiome", (Number)class_25402.Field_25426);
        jsonObject.addProperty("biomeSize", (Number)class_25402.Field_25473);
        jsonObject.addProperty("riverSize", (Number)class_25402.Field_25422);
        jsonObject.addProperty("dirtSize", (Number)class_25402.Field_25445);
        jsonObject.addProperty("dirtCount", (Number)class_25402.Field_25454);
        jsonObject.addProperty("dirtMinHeight", (Number)class_25402.Field_25476);
        jsonObject.addProperty("dirtMaxHeight", (Number)class_25402.Field_25471);
        jsonObject.addProperty("gravelSize", (Number)class_25402.Field_25443);
        jsonObject.addProperty("gravelCount", (Number)class_25402.Field_25411);
        jsonObject.addProperty("gravelMinHeight", (Number)class_25402.Field_25464);
        jsonObject.addProperty("gravelMaxHeight", (Number)class_25402.Field_25428);
        jsonObject.addProperty("graniteSize", (Number)class_25402.Field_25427);
        jsonObject.addProperty("graniteCount", (Number)class_25402.Field_25478);
        jsonObject.addProperty("graniteMinHeight", (Number)class_25402.Field_25465);
        jsonObject.addProperty("graniteMaxHeight", (Number)class_25402.Field_25469);
        jsonObject.addProperty("dioriteSize", (Number)class_25402.Field_25430);
        jsonObject.addProperty("dioriteCount", (Number)class_25402.Field_25405);
        jsonObject.addProperty("dioriteMinHeight", (Number)class_25402.Field_25410);
        jsonObject.addProperty("dioriteMaxHeight", (Number)class_25402.Field_25431);
        jsonObject.addProperty("andesiteSize", (Number)class_25402.Field_25458);
        jsonObject.addProperty("andesiteCount", (Number)class_25402.Field_25435);
        jsonObject.addProperty("andesiteMinHeight", (Number)class_25402.Field_25408);
        jsonObject.addProperty("andesiteMaxHeight", (Number)class_25402.Field_25416);
        jsonObject.addProperty("coalSize", (Number)class_25402.Field_25480);
        jsonObject.addProperty("coalCount", (Number)class_25402.Field_25463);
        jsonObject.addProperty("coalMinHeight", (Number)class_25402.Field_25424);
        jsonObject.addProperty("coalMaxHeight", (Number)class_25402.Field_25421);
        jsonObject.addProperty("ironSize", (Number)class_25402.Field_25450);
        jsonObject.addProperty("ironCount", (Number)class_25402.Field_25414);
        jsonObject.addProperty("ironMinHeight", (Number)class_25402.Field_25441);
        jsonObject.addProperty("ironMaxHeight", (Number)class_25402.Field_25436);
        jsonObject.addProperty("goldSize", (Number)class_25402.Field_25432);
        jsonObject.addProperty("goldCount", (Number)class_25402.Field_25429);
        jsonObject.addProperty("goldMinHeight", (Number)class_25402.Field_25423);
        jsonObject.addProperty("goldMaxHeight", (Number)class_25402.Field_25442);
        jsonObject.addProperty("redstoneSize", (Number)class_25402.Field_25468);
        jsonObject.addProperty("redstoneCount", (Number)class_25402.Field_25449);
        jsonObject.addProperty("redstoneMinHeight", (Number)class_25402.Field_25470);
        jsonObject.addProperty("redstoneMaxHeight", (Number)class_25402.Field_25433);
        jsonObject.addProperty("diamondSize", (Number)class_25402.Field_25459);
        jsonObject.addProperty("diamondCount", (Number)class_25402.Field_25412);
        jsonObject.addProperty("diamondMinHeight", (Number)class_25402.Field_25415);
        jsonObject.addProperty("diamondMaxHeight", (Number)class_25402.Field_25461);
        jsonObject.addProperty("lapisSize", (Number)class_25402.Field_25425);
        jsonObject.addProperty("lapisCount", (Number)class_25402.Field_25434);
        jsonObject.addProperty("lapisCenterHeight", (Number)class_25402.Field_25479);
        jsonObject.addProperty("lapisSpread", (Number)class_25402.Field_25417);
        return jsonObject;
    }

    public JsonElement Method_6066(Object object, Type type, JsonSerializationContext jsonSerializationContext) {
        return this.Method_6065((Class_25402)object, type, jsonSerializationContext);
    }

    public Object Method_6067(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        return this.Method_6069(jsonElement, type, jsonDeserializationContext);
    }

    private void Method_6068() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_25402 Method_6069(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        Class_25402 class_25402 = new Class_25402();
        try {
            class_25402.Field_25466 = Class_2986.Method_2995(jsonObject, "coordinateScale", class_25402.Field_25466);
            class_25402.Field_25407 = Class_2986.Method_2995(jsonObject, "heightScale", class_25402.Field_25407);
            class_25402.Field_25439 = Class_2986.Method_2995(jsonObject, "lowerLimitScale", class_25402.Field_25439);
            class_25402.Field_25438 = Class_2986.Method_2995(jsonObject, "upperLimitScale", class_25402.Field_25438);
            class_25402.Field_25467 = Class_2986.Method_2995(jsonObject, "depthNoiseScaleX", class_25402.Field_25467);
            class_25402.Field_25456 = Class_2986.Method_2995(jsonObject, "depthNoiseScaleZ", class_25402.Field_25456);
            class_25402.Field_25419 = Class_2986.Method_2995(jsonObject, "depthNoiseScaleExponent", class_25402.Field_25419);
            class_25402.Field_25448 = Class_2986.Method_2995(jsonObject, "mainNoiseScaleX", class_25402.Field_25448);
            class_25402.Field_25472 = Class_2986.Method_2995(jsonObject, "mainNoiseScaleY", class_25402.Field_25472);
            class_25402.Field_25474 = Class_2986.Method_2995(jsonObject, "mainNoiseScaleZ", class_25402.Field_25474);
            class_25402.Field_25481 = Class_2986.Method_2995(jsonObject, "baseSize", class_25402.Field_25481);
            class_25402.Field_25404 = Class_2986.Method_2995(jsonObject, "stretchY", class_25402.Field_25404);
            class_25402.Field_25455 = Class_2986.Method_2995(jsonObject, "biomeDepthWeight", class_25402.Field_25455);
            class_25402.Field_25446 = Class_2986.Method_2995(jsonObject, "biomeDepthOffset", class_25402.Field_25446);
            class_25402.Field_25413 = Class_2986.Method_2995(jsonObject, "biomeScaleWeight", class_25402.Field_25413);
            class_25402.Field_25437 = Class_2986.Method_2995(jsonObject, "biomeScaleOffset", class_25402.Field_25437);
            class_25402.Field_25409 = Class_2986.Method_3009(jsonObject, "seaLevel", class_25402.Field_25409);
            class_25402.Field_25418 = Class_2986.Method_3006(jsonObject, "useCaves", class_25402.Field_25418);
            class_25402.Field_25453 = Class_2986.Method_3006(jsonObject, "useDungeons", class_25402.Field_25453);
            class_25402.Field_25451 = Class_2986.Method_3009(jsonObject, "dungeonChance", class_25402.Field_25451);
            class_25402.Field_25420 = Class_2986.Method_3006(jsonObject, "useStrongholds", class_25402.Field_25420);
            class_25402.Field_25457 = Class_2986.Method_3006(jsonObject, "useVillages", class_25402.Field_25457);
            class_25402.Field_25460 = Class_2986.Method_3006(jsonObject, "useMineShafts", class_25402.Field_25460);
            class_25402.Field_25477 = Class_2986.Method_3006(jsonObject, "useTemples", class_25402.Field_25477);
            class_25402.Field_25406 = Class_2986.Method_3006(jsonObject, "useMonuments", class_25402.Field_25406);
            class_25402.Field_25403 = Class_2986.Method_3006(jsonObject, "useRavines", class_25402.Field_25403);
            class_25402.Field_25444 = Class_2986.Method_3006(jsonObject, "useWaterLakes", class_25402.Field_25444);
            class_25402.Field_25462 = Class_2986.Method_3009(jsonObject, "waterLakeChance", class_25402.Field_25462);
            class_25402.Field_25452 = Class_2986.Method_3006(jsonObject, "useLavaLakes", class_25402.Field_25452);
            class_25402.Field_25440 = Class_2986.Method_3009(jsonObject, "lavaLakeChance", class_25402.Field_25440);
            class_25402.Field_25447 = Class_2986.Method_3006(jsonObject, "useLavaOceans", class_25402.Field_25447);
            class_25402.Field_25426 = Class_2986.Method_3009(jsonObject, "fixedBiome", class_25402.Field_25426);
            if (class_25402.Field_25426 < (2790 & -32465) && class_25402.Field_25426 >= (-1 & -1)) {
                if (class_25402.Field_25426 >= Class_17281.Field_17327.Field_17343) {
                    class_25402.Field_25426 += -28382 & 18438;
                }
            } else {
                class_25402.Field_25426 = -1 & -1;
            }
            class_25402.Field_25473 = Class_2986.Method_3009(jsonObject, "biomeSize", class_25402.Field_25473);
            class_25402.Field_25422 = Class_2986.Method_3009(jsonObject, "riverSize", class_25402.Field_25422);
            class_25402.Field_25445 = Class_2986.Method_3009(jsonObject, "dirtSize", class_25402.Field_25445);
            class_25402.Field_25454 = Class_2986.Method_3009(jsonObject, "dirtCount", class_25402.Field_25454);
            class_25402.Field_25476 = Class_2986.Method_3009(jsonObject, "dirtMinHeight", class_25402.Field_25476);
            class_25402.Field_25471 = Class_2986.Method_3009(jsonObject, "dirtMaxHeight", class_25402.Field_25471);
            class_25402.Field_25443 = Class_2986.Method_3009(jsonObject, "gravelSize", class_25402.Field_25443);
            class_25402.Field_25411 = Class_2986.Method_3009(jsonObject, "gravelCount", class_25402.Field_25411);
            class_25402.Field_25464 = Class_2986.Method_3009(jsonObject, "gravelMinHeight", class_25402.Field_25464);
            class_25402.Field_25428 = Class_2986.Method_3009(jsonObject, "gravelMaxHeight", class_25402.Field_25428);
            class_25402.Field_25427 = Class_2986.Method_3009(jsonObject, "graniteSize", class_25402.Field_25427);
            class_25402.Field_25478 = Class_2986.Method_3009(jsonObject, "graniteCount", class_25402.Field_25478);
            class_25402.Field_25465 = Class_2986.Method_3009(jsonObject, "graniteMinHeight", class_25402.Field_25465);
            class_25402.Field_25469 = Class_2986.Method_3009(jsonObject, "graniteMaxHeight", class_25402.Field_25469);
            class_25402.Field_25430 = Class_2986.Method_3009(jsonObject, "dioriteSize", class_25402.Field_25430);
            class_25402.Field_25405 = Class_2986.Method_3009(jsonObject, "dioriteCount", class_25402.Field_25405);
            class_25402.Field_25410 = Class_2986.Method_3009(jsonObject, "dioriteMinHeight", class_25402.Field_25410);
            class_25402.Field_25431 = Class_2986.Method_3009(jsonObject, "dioriteMaxHeight", class_25402.Field_25431);
            class_25402.Field_25458 = Class_2986.Method_3009(jsonObject, "andesiteSize", class_25402.Field_25458);
            class_25402.Field_25435 = Class_2986.Method_3009(jsonObject, "andesiteCount", class_25402.Field_25435);
            class_25402.Field_25408 = Class_2986.Method_3009(jsonObject, "andesiteMinHeight", class_25402.Field_25408);
            class_25402.Field_25416 = Class_2986.Method_3009(jsonObject, "andesiteMaxHeight", class_25402.Field_25416);
            class_25402.Field_25480 = Class_2986.Method_3009(jsonObject, "coalSize", class_25402.Field_25480);
            class_25402.Field_25463 = Class_2986.Method_3009(jsonObject, "coalCount", class_25402.Field_25463);
            class_25402.Field_25424 = Class_2986.Method_3009(jsonObject, "coalMinHeight", class_25402.Field_25424);
            class_25402.Field_25421 = Class_2986.Method_3009(jsonObject, "coalMaxHeight", class_25402.Field_25421);
            class_25402.Field_25450 = Class_2986.Method_3009(jsonObject, "ironSize", class_25402.Field_25450);
            class_25402.Field_25414 = Class_2986.Method_3009(jsonObject, "ironCount", class_25402.Field_25414);
            class_25402.Field_25441 = Class_2986.Method_3009(jsonObject, "ironMinHeight", class_25402.Field_25441);
            class_25402.Field_25436 = Class_2986.Method_3009(jsonObject, "ironMaxHeight", class_25402.Field_25436);
            class_25402.Field_25432 = Class_2986.Method_3009(jsonObject, "goldSize", class_25402.Field_25432);
            class_25402.Field_25429 = Class_2986.Method_3009(jsonObject, "goldCount", class_25402.Field_25429);
            class_25402.Field_25423 = Class_2986.Method_3009(jsonObject, "goldMinHeight", class_25402.Field_25423);
            class_25402.Field_25442 = Class_2986.Method_3009(jsonObject, "goldMaxHeight", class_25402.Field_25442);
            class_25402.Field_25468 = Class_2986.Method_3009(jsonObject, "redstoneSize", class_25402.Field_25468);
            class_25402.Field_25449 = Class_2986.Method_3009(jsonObject, "redstoneCount", class_25402.Field_25449);
            class_25402.Field_25470 = Class_2986.Method_3009(jsonObject, "redstoneMinHeight", class_25402.Field_25470);
            class_25402.Field_25433 = Class_2986.Method_3009(jsonObject, "redstoneMaxHeight", class_25402.Field_25433);
            class_25402.Field_25459 = Class_2986.Method_3009(jsonObject, "diamondSize", class_25402.Field_25459);
            class_25402.Field_25412 = Class_2986.Method_3009(jsonObject, "diamondCount", class_25402.Field_25412);
            class_25402.Field_25415 = Class_2986.Method_3009(jsonObject, "diamondMinHeight", class_25402.Field_25415);
            class_25402.Field_25461 = Class_2986.Method_3009(jsonObject, "diamondMaxHeight", class_25402.Field_25461);
            class_25402.Field_25425 = Class_2986.Method_3009(jsonObject, "lapisSize", class_25402.Field_25425);
            class_25402.Field_25434 = Class_2986.Method_3009(jsonObject, "lapisCount", class_25402.Field_25434);
            class_25402.Field_25479 = Class_2986.Method_3009(jsonObject, "lapisCenterHeight", class_25402.Field_25479);
            class_25402.Field_25417 = Class_2986.Method_3009(jsonObject, "lapisSpread", class_25402.Field_25417);
        }
        catch (Exception exception) {
            // empty catch block
        }
        return class_25402;
    }
}

