/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  org.apache.commons.lang3.Validate
 */
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Type;
import java.util.List;
import org.apache.commons.lang3.Validate;

public class Class_10329
implements JsonDeserializer {
    public Class_8643 Method_10330(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        JsonObject jsonObject = Class_2986.Method_2996(jsonElement, "entry");
        Class_8643 class_8643 = new Class_8643();
        class_8643.Method_8650(Class_2986.Method_3006(jsonObject, "replace", (8192 & 3715) != 0));
        Class_6295 class_6295 = Class_6295.Method_6313(Class_2986.Method_2994(jsonObject, "category", Class_6295.Field_6300.Method_6334()));
        class_8643.Method_8647(class_6295);
        Validate.notNull((Object)((Object)class_6295), (String)"Invalid category", (Object[])new Object[16409 & 7170]);
        if (jsonObject.has("sounds")) {
            JsonArray jsonArray = Class_2986.Method_2998(jsonObject, "sounds");
            for (int i = 651 & 4180; i < jsonArray.size(); ++i) {
                JsonElement jsonElement2 = jsonArray.get(i);
                Class_40509 class_40509 = new Class_40509();
                if (Class_2986.Method_3008(jsonElement2)) {
                    class_40509.Method_40527(Class_2986.Method_3000(jsonElement2, "sound"));
                } else {
                    JsonObject jsonObject2 = Class_2986.Method_2996(jsonElement2, "sound");
                    class_40509.Method_40527(Class_2986.Method_3001(jsonObject2, "name"));
                    if (jsonObject2.has("type")) {
                        Class_36228 class_36228 = Class_36228.Method_36235(Class_2986.Method_3001(jsonObject2, "type"));
                        Validate.notNull((Object)((Object)class_36228), (String)"Invalid type", (Object[])new Object[-16382 & 5389]);
                        class_40509.Method_40523(class_36228);
                    }
                    if (jsonObject2.has("volume")) {
                        float f = Class_2986.Method_2989(jsonObject2, "volume");
                        Validate.isTrue((f > 0.0f ? 8705 & -32741 : 10306 & -16252) != 0, (String)"Invalid volume", (Object[])new Object[18976 & 5504]);
                        class_40509.Method_40521(f);
                    }
                    if (jsonObject2.has("pitch")) {
                        float f = Class_2986.Method_2989(jsonObject2, "pitch");
                        Validate.isTrue((f > 0.0f ? 2329 & 5703 : 20788 & 2048) != 0, (String)"Invalid pitch", (Object[])new Object[-32256 & 16386]);
                        class_40509.Method_40518(f);
                    }
                    if (jsonObject2.has("weight")) {
                        int n = Class_2986.Method_3011(jsonObject2, "weight");
                        Validate.isTrue((n > 0 ? 20409 & 4097 : 1061 & 2048) != 0, (String)"Invalid weight", (Object[])new Object[850 & -4088]);
                        class_40509.Method_40524(n);
                    }
                    if (jsonObject2.has("stream")) {
                        class_40509.Method_40519(Class_2986.Method_3007(jsonObject2, "stream"));
                    }
                }
                class_8643.Method_8649().add(class_40509);
            }
        }
        return class_8643;
    }

    private void Method_10331() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Object Method_10332(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        return this.Method_10330(jsonElement, type, jsonDeserializationContext);
    }
}

