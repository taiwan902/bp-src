/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  com.google.common.collect.Maps
 *  com.google.common.io.Files
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.google.gson.JsonParser
 *  org.apache.commons.io.IOUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.base.Charsets;
import com.google.common.collect.Maps;
import com.google.common.io.Files;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Reader;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.Set;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class_2981 {
    private static final Logger Field_2982 = LogManager.getLogger();
    private final Map Field_2983 = Maps.newHashMap();

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Class_2981(File file, String string) {
        if (string != null) {
            File file2 = new File(file, "objects");
            File file3 = new File(file, "indexes/" + string + ".json");
            BufferedReader bufferedReader = null;
            try {
                bufferedReader = Files.newReader((File)file3, (Charset)Charsets.UTF_8);
                JsonObject jsonObject = new JsonParser().parse((Reader)bufferedReader).getAsJsonObject();
                JsonObject jsonObject2 = Class_2986.Method_2990(jsonObject, "objects", null);
                if (jsonObject2 != null) {
                    for (Map.Entry entry : jsonObject2.entrySet()) {
                        JsonObject jsonObject3 = (JsonObject)entry.getValue();
                        String string2 = (String)entry.getKey();
                        String[] arrstring = string2.split("/", 6 & 43);
                        String string3 = arrstring.length == (4307 & -16351) ? arrstring[-18271 & 1600] : arrstring[-30589 & 21256] + ":" + arrstring[16595 & 15873];
                        String string4 = Class_2986.Method_3001(jsonObject3, "hash");
                        File file4 = new File(file2, string4.substring(4944 & 19584, -24442 & 18794) + "/" + string4);
                        this.Field_2983.put(string3, file4);
                    }
                }
            }
            catch (JsonParseException jsonParseException) {
                Field_2982.error("Unable to parse resource index file: " + file3);
            }
            catch (FileNotFoundException fileNotFoundException) {
                Field_2982.error("Can't find the resource index file: " + file3);
            }
            finally {
                IOUtils.closeQuietly((Reader)bufferedReader);
            }
        }
    }

    public Map Method_2984() {
        return this.Field_2983;
    }

    private void Method_2985() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

