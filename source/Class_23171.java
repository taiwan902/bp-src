/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.google.gson.JsonParser
 *  org.apache.commons.io.IOUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.base.Charsets;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.net.URI;
import java.nio.charset.Charset;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class Class_23171
implements Class_2035 {
    public final File Field_23172;
    private static final Logger Field_23173 = LogManager.getLogger();

    public String Method_23174() {
        return this.Field_23172.getName();
    }

    public Class_23171(File file) {
        this.Field_23172 = file;
    }

    protected abstract boolean Method_23175(String var1);

    private void Method_23176() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public BufferedImage Method_23177() {
        return Class_18695.Method_18726(this.Method_23185("pack.png"));
    }

    public boolean Method_23178(Class_2080 class_2080) {
        return this.Method_23175(Class_23171.Method_23183(class_2080));
    }

    public InputStream Method_23179(Class_2080 class_2080) {
        return this.Method_23185(Class_23171.Method_23183(class_2080));
    }

    protected void Method_23180(String string) {
        Object[] arrobject = new Object[-26110 & 274];
        arrobject[26371 & 2260] = string;
        arrobject[5 & 29697] = this.Field_23172;
        Field_23173.warn("ResourcePack: ignored non-lowercase namespace: %s in %s", arrobject);
    }

    static Class_25993 Method_23181(Class_2793 class_2793, InputStream inputStream, String string) {
        JsonObject jsonObject = null;
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream, Charsets.UTF_8));
            jsonObject = new JsonParser().parse((Reader)bufferedReader).getAsJsonObject();
        }
        catch (RuntimeException runtimeException) {
            try {
                throw new JsonParseException((Throwable)runtimeException);
            }
            catch (Throwable throwable) {
                IOUtils.closeQuietly(bufferedReader);
                throw throwable;
            }
        }
        IOUtils.closeQuietly((Reader)bufferedReader);
        return class_2793.Method_2798(string, jsonObject);
    }

    protected static String Method_23182(File file, File file2) {
        return file.toURI().relativize(file2.toURI()).getPath();
    }

    private static String Method_23183(Class_2080 class_2080) {
        Object[] arrobject = new Object[3 & -22453];
        arrobject[13192 & -16384] = "assets";
        arrobject[425 & -15855] = class_2080.Method_2085();
        arrobject[20490 & 3074] = class_2080.Method_2084();
        return String.format("%s/%s/%s", arrobject);
    }

    public Class_25993 Method_23184(Class_2793 class_2793, String string) {
        return Class_23171.Method_23181(class_2793, this.Method_23185("pack.mcmeta"), string);
    }

    protected abstract InputStream Method_23185(String var1);
}

