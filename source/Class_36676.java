/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.google.gson.JsonParser
 *  com.google.gson.JsonPrimitive
 *  org.apache.commons.io.FileUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
import java.io.File;
import java.io.IOException;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class_36676
extends Class_25493 {
    private final Class_2457 Field_36677;
    private boolean Field_36678 = 11008 & 4229;
    private final File Field_36679;
    private int Field_36680 = -298 & -260;
    private static final Logger Field_36681 = LogManager.getLogger();
    private final Set Field_36682 = Sets.newHashSet();

    public void Method_36683(Class_626 class_626, Class_13017 class_13017, int n) {
        int n2 = class_13017.Method_13036() ? this.\u0000strictfp(class_13017) : 1 & 4118;
        super.Method_25497(class_626, class_13017, n);
        this.Field_36682.add(class_13017);
        if (class_13017.Method_13036() && n2 == 0 && n > 0) {
            this.Field_36678 = 23937 & -24521;
            if (this.Field_36677.Method_2631()) {
                Object[] arrobject = new Object[18762 & -32765];
                arrobject[-16000 & 63] = class_626.\u0000strictfp();
                arrobject[5065 & 8211] = class_13017.Method_13044();
                this.Field_36677.Method_2616().Method_3157(new Class_2849("chat.type.achievement", arrobject));
            }
        }
        if (class_13017.Method_13036() && n2 > 0 && n == 0) {
            this.Field_36678 = 22817 & -32617;
            if (this.Field_36677.Method_2631()) {
                Object[] arrobject = new Object[4242 & -23025];
                arrobject[16452 & 5128] = class_626.\u0000strictfp();
                arrobject[165 & -16375] = class_13017.Method_13044();
                this.Field_36677.Method_2616().Method_3157(new Class_2849("chat.type.achievement.taken", arrobject));
            }
        }
    }

    public void Method_36684(\u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2) {
        int n = this.Field_36677.Method_2620();
        HashMap hashMap = Maps.newHashMap();
        if (this.Field_36678 || n - this.Field_36680 > (32172 & -32450)) {
            this.Field_36680 = n;
            for (Class_13017 class_13017 : this.Method_36686()) {
                hashMap.put(class_13017, this.\u0000strictfp(class_13017));
            }
        }
        \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2.\u0000strictfp.Method_20821(new Class_37016(hashMap));
    }

    public void Method_36685() {
        if (this.Field_36679.isFile()) {
            try {
                this.\u0000strictfp.clear();
                this.\u0000strictfp.putAll(this.Method_36689(FileUtils.readFileToString((File)this.Field_36679)));
            }
            catch (IOException iOException) {
                Field_36681.error("Couldn't read statistics file " + this.Field_36679, (Throwable)iOException);
            }
            catch (JsonParseException jsonParseException) {
                Field_36681.error("Couldn't parse statistics file " + this.Field_36679, (Throwable)jsonParseException);
            }
        }
    }

    public Set Method_36686() {
        HashSet hashSet = Sets.newHashSet((Iterable)this.Field_36682);
        this.Field_36682.clear();
        this.Field_36678 = 4613 & 9298;
        return hashSet;
    }

    public void Method_36687() {
        try {
            FileUtils.writeStringToFile((File)this.Field_36679, (String)Class_36676.Method_36688(this.\u0000strictfp));
        }
        catch (IOException iOException) {
            Field_36681.error("Couldn't save stats", (Throwable)iOException);
        }
    }

    public static String Method_36688(Map map) {
        JsonObject jsonObject = new JsonObject();
        for (Map.Entry entry : map.entrySet()) {
            if (((Class_15795)entry.getValue()).Method_15801() != null) {
                JsonObject jsonObject2 = new JsonObject();
                jsonObject2.addProperty("value", (Number)((Class_15795)entry.getValue()).Method_15800());
                try {
                    jsonObject2.add("progress", ((Class_15795)entry.getValue()).Method_15801().Method_18521());
                }
                catch (Throwable throwable) {
                    Field_36681.warn("Couldn't save statistic " + ((Class_13017)entry.getKey()).Method_13040() + ": error serializing progress", throwable);
                }
                jsonObject.add(((Class_13017)entry.getKey()).Field_13024, (JsonElement)jsonObject2);
                continue;
            }
            jsonObject.addProperty(((Class_13017)entry.getKey()).Field_13024, (Number)((Class_15795)entry.getValue()).Method_15800());
        }
        return jsonObject.toString();
    }

    public Map Method_36689(String string) {
        JsonElement jsonElement = new JsonParser().parse(string);
        if (!jsonElement.isJsonObject()) {
            return Maps.newHashMap();
        }
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        HashMap hashMap = Maps.newHashMap();
        for (Map.Entry entry : jsonObject.entrySet()) {
            Class_13017 class_13017 = Class_19863.Method_20025((String)entry.getKey());
            if (class_13017 != null) {
                Class_15795 class_15795 = new Class_15795();
                if (((JsonElement)entry.getValue()).isJsonPrimitive() && ((JsonElement)entry.getValue()).getAsJsonPrimitive().isNumber()) {
                    class_15795.Method_15798(((JsonElement)entry.getValue()).getAsInt());
                } else if (((JsonElement)entry.getValue()).isJsonObject()) {
                    JsonObject jsonObject2 = ((JsonElement)entry.getValue()).getAsJsonObject();
                    if (jsonObject2.has("value") && jsonObject2.get("value").isJsonPrimitive() && jsonObject2.get("value").getAsJsonPrimitive().isNumber()) {
                        class_15795.Method_15798(jsonObject2.getAsJsonPrimitive("value").getAsInt());
                    }
                    if (jsonObject2.has("progress") && class_13017.Method_13032() != null) {
                        try {
                            Constructor constructor = class_13017.Method_13032().getConstructor(new Class[-32764 & 14465]);
                            Class_18520 class_18520 = (Class_18520)constructor.newInstance(new Object[2114 & 17588]);
                            class_18520.Method_18522(jsonObject2.get("progress"));
                            class_15795.Method_15799(class_18520);
                        }
                        catch (Throwable throwable) {
                            Field_36681.warn("Invalid statistic progress in " + this.Field_36679, throwable);
                        }
                    }
                }
                hashMap.put(class_13017, class_15795);
                continue;
            }
            Field_36681.warn("Invalid statistic in " + this.Field_36679 + ": Don't know what " + (String)entry.getKey() + " is");
        }
        return hashMap;
    }

    public void Method_36690(\u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2) {
        HashMap hashMap = Maps.newHashMap();
        for (Class_14225 class_14225 : Class_21905.Field_21929) {
            if (!this.\u0000strictfp(class_14225)) continue;
            hashMap.put(class_14225, this.\u0000strictfp((Class_13017)class_14225));
            this.Field_36682.remove(class_14225);
        }
        \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2.\u0000strictfp.Method_20821(new Class_37016(hashMap));
    }

    private void Method_36691() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_36692() {
        for (Class_13017 class_13017 : this.\u0000strictfp.keySet()) {
            this.Field_36682.add(class_13017);
        }
    }

    public Class_36676(Class_2457 class_2457, File file) {
        this.Field_36677 = class_2457;
        this.Field_36679 = file;
    }

    public boolean Method_36693() {
        return this.Field_36678;
    }
}

