/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 *  internal.org.lwjgl.opengl.GL11
 *  internal.org.lwjgl.util.vector.Matrix
 *  internal.org.lwjgl.util.vector.Matrix4f
 *  org.apache.commons.io.IOUtils
 */
import com.google.common.base.Charsets;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import internal.org.lwjgl.opengl.GL11;
import internal.org.lwjgl.util.vector.Matrix;
import internal.org.lwjgl.util.vector.Matrix4f;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.apache.commons.io.IOUtils;

public class Class_26345 {
    private Class_279 Field_26346;
    private float Field_26347;
    private int Field_26348;
    private final List Field_26349 = Lists.newArrayList();
    private float Field_26350;
    private int Field_26351;
    private final List Field_26352 = Lists.newArrayList();
    private String Field_26353;
    private final Map Field_26354 = Maps.newHashMap();
    private Class_19135 Field_26355;
    private Matrix4f Field_26356;

    public Class_7016 Method_26357(String string, Class_19135 class_19135, Class_19135 class_191352) {
        Class_7016 class_7016 = new Class_7016(this.Field_26346, string, class_19135, class_191352);
        this.Field_26352.add(this.Field_26352.size(), class_7016);
        return class_7016;
    }

    private Class_19135 Method_26358(String string) {
        return string == null ? null : (string.equals("minecraft:main") ? this.Field_26355 : (Class_19135)this.Field_26354.get(string));
    }

    private void Method_26359(Class_34695 class_34695, JsonElement jsonElement) {
        Object object;
        JsonArray jsonArray;
        JsonObject jsonObject = Class_2986.Method_2996(jsonElement, "pass");
        String string = Class_2986.Method_3001(jsonObject, "name");
        String string2 = Class_2986.Method_3001(jsonObject, "intarget");
        String string3 = Class_2986.Method_3001(jsonObject, "outtarget");
        Class_19135 class_19135 = this.Method_26358(string2);
        Class_19135 class_191352 = this.Method_26358(string3);
        if (class_19135 == null) {
            throw new Class_8254("Input target '" + string2 + "' does not exist");
        }
        if (class_191352 == null) {
            throw new Class_8254("Output target '" + string3 + "' does not exist");
        }
        Class_7016 class_7016 = this.Method_26357(string, class_19135, class_191352);
        JsonArray jsonArray2 = Class_2986.Method_2992(jsonObject, "auxtargets", null);
        if (jsonArray2 != null) {
            int n = 0 & -24576;
            for (Object object2 : jsonArray2) {
                block15 : {
                    Object object3;
                    try {
                        JsonObject jsonObject2 = Class_2986.Method_2996((JsonElement)object2, "auxtarget");
                        object3 = Class_2986.Method_3001(jsonObject2, "name");
                        object = Class_2986.Method_3001(jsonObject2, "id");
                        Class_19135 class_191353 = this.Method_26358((String)object);
                        if (class_191353 == null) {
                            Class_2080 class_2080 = new Class_2080("textures/effect/" + (String)object + ".png");
                            try {
                                this.Field_26346.Method_282(class_2080);
                            }
                            catch (FileNotFoundException fileNotFoundException) {
                                throw new Class_8254("Render target or texture '" + (String)object + "' does not exist");
                            }
                            class_34695.Method_34707(class_2080);
                            Class_2062 class_2062 = class_34695.Method_34709(class_2080);
                            int n2 = Class_2986.Method_3011(jsonObject2, "width");
                            int n3 = Class_2986.Method_3011(jsonObject2, "height");
                            boolean bl = Class_2986.Method_3007(jsonObject2, "bilinear");
                            if (bl) {
                                GL11.glTexParameteri((int)(19959 & -29215), (int)(15179 & -6015), (int)(14113 & 28183));
                                GL11.glTexParameteri((int)(3571 & 3557), (int)(14376 & 26903), (int)(-20855 & 13889));
                            } else {
                                GL11.glTexParameteri((int)(4071 & 32225), (int)(10945 & 15393), (int)(-23000 & 28375));
                                GL11.glTexParameteri((int)(24049 & 11745), (int)(26688 & 10272), (int)(11792 & -18781));
                            }
                            class_7016.Method_7026((String)object3, class_2062.Method_2063(), n2, n3);
                            break block15;
                        }
                        class_7016.Method_7026((String)object3, class_191353, class_191353.Field_19142, class_191353.Field_19141);
                    }
                    catch (Exception exception) {
                        object3 = Class_8254.Method_8257(exception);
                        ((Class_8254)object3).Method_8261("auxtargets[" + n + "]");
                        throw object3;
                    }
                }
                ++n;
            }
        }
        if ((jsonArray = Class_2986.Method_2992(jsonObject, "uniforms", null)) != null) {
            int n = 6664 & -24528;
            for (JsonObject jsonObject2 : jsonArray) {
                try {
                    this.Method_26369((JsonElement)jsonObject2);
                }
                catch (Exception exception) {
                    object = Class_8254.Method_8257(exception);
                    ((Class_8254)object).Method_8261("uniforms[" + n + "]");
                    throw object;
                }
                ++n;
            }
        }
    }

    private void Method_26360(JsonElement jsonElement) {
        if (Class_2986.Method_3008(jsonElement)) {
            this.Method_26361(jsonElement.getAsString(), this.Field_26351, this.Field_26348);
        } else {
            JsonObject jsonObject = Class_2986.Method_2996(jsonElement, "target");
            String string = Class_2986.Method_3001(jsonObject, "name");
            int n = Class_2986.Method_3009(jsonObject, "width", this.Field_26351);
            int n2 = Class_2986.Method_3009(jsonObject, "height", this.Field_26348);
            if (this.Field_26354.containsKey(string)) {
                throw new Class_8254(string + " is already defined");
            }
            this.Method_26361(string, n, n2);
        }
    }

    public void Method_26361(String string, int n, int n2) {
        Class_19135 class_19135 = new Class_19135(n, n2, (4905 & -30697) != 0);
        class_19135.Method_19148(0.0f, 0.0f, 0.0f, 0.0f);
        this.Field_26354.put(string, class_19135);
        if (n == this.Field_26351 && n2 == this.Field_26348) {
            this.Field_26349.add(class_19135);
        }
    }

    public final String Method_26362() {
        return this.Field_26353;
    }

    public Class_19135 Method_26363(String string) {
        return (Class_19135)this.Field_26354.get(string);
    }

    public Class_26345(Class_34695 class_34695, Class_279 class_279, Class_19135 class_19135, Class_2080 class_2080) {
        this.Field_26346 = class_279;
        this.Field_26355 = class_19135;
        this.Field_26347 = 0.0f;
        this.Field_26350 = 0.0f;
        this.Field_26351 = class_19135.Field_19140;
        this.Field_26348 = class_19135.Field_19136;
        this.Field_26353 = class_2080.Method_2086();
        this.Method_26370();
        this.Method_26365(class_34695, class_2080);
    }

    private void Method_26364() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_26365(Class_34695 class_34695, Class_2080 class_2080) {
        InputStream inputStream;
        block11 : {
            JsonParser jsonParser = new JsonParser();
            inputStream = null;
            try {
                int n;
                JsonArray jsonArray;
                Class_9953 class_9953 = this.Field_26346.Method_282(class_2080);
                inputStream = class_9953.Method_9958();
                JsonObject jsonObject = jsonParser.parse(IOUtils.toString((InputStream)inputStream, (Charset)Charsets.UTF_8)).getAsJsonObject();
                if (Class_2986.Method_2997(jsonObject, "targets")) {
                    jsonArray = jsonObject.getAsJsonArray("targets");
                    n = -9656 & 8480;
                    for (JsonElement jsonElement : jsonArray) {
                        try {
                            this.Method_26360(jsonElement);
                        }
                        catch (Exception exception) {
                            Class_8254 class_8254 = Class_8254.Method_8257(exception);
                            class_8254.Method_8261("targets[" + n + "]");
                            throw class_8254;
                        }
                        ++n;
                    }
                }
                if (!Class_2986.Method_2997(jsonObject, "passes")) break block11;
                jsonArray = jsonObject.getAsJsonArray("passes");
                n = 151 & 21088;
                for (JsonElement jsonElement : jsonArray) {
                    try {
                        this.Method_26359(class_34695, jsonElement);
                    }
                    catch (Exception exception) {
                        Class_8254 class_8254 = Class_8254.Method_8257(exception);
                        class_8254.Method_8261("passes[" + n + "]");
                        throw class_8254;
                    }
                    ++n;
                }
            }
            catch (Exception exception) {
                try {
                    Class_8254 class_8254 = Class_8254.Method_8257(exception);
                    class_8254.Method_8258(class_2080.Method_2084());
                    throw class_8254;
                }
                catch (Throwable throwable) {
                    IOUtils.closeQuietly(inputStream);
                    throw throwable;
                }
            }
        }
        IOUtils.closeQuietly((InputStream)inputStream);
    }

    public void Method_26366() {
        for (Object object : this.Field_26354.values()) {
            ((Class_19135)object).Method_19158();
        }
        for (Object object : this.Field_26352) {
            ((Class_7016)object).Method_7027();
        }
        this.Field_26352.clear();
    }

    public void Method_26367(float f) {
        if (f < this.Field_26350) {
            this.Field_26347 += 1.0f - this.Field_26350;
            this.Field_26347 += f;
        } else {
            this.Field_26347 += f - this.Field_26350;
        }
        this.Field_26350 = f;
        while (this.Field_26347 > 344.0f * 0.058139537f) {
            this.Field_26347 -= 26.349207f * 0.7590361f;
        }
        for (Class_7016 class_7016 : this.Field_26352) {
            class_7016.Method_7030(this.Field_26347 / (25.142857f * 0.79545456f));
        }
    }

    public void Method_26368(int n, int n2) {
        this.Field_26351 = this.Field_26355.Field_19142;
        this.Field_26348 = this.Field_26355.Field_19141;
        this.Method_26370();
        for (Object object : this.Field_26352) {
            ((Class_7016)object).Method_7028(this.Field_26356);
        }
        for (Object object : this.Field_26349) {
            ((Class_19135)object).Method_19156(n, n2);
        }
    }

    private void Method_26369(JsonElement jsonElement) {
        JsonObject jsonObject = Class_2986.Method_2996(jsonElement, "uniform");
        String string = Class_2986.Method_3001(jsonObject, "name");
        Class_14316 class_14316 = ((Class_7016)this.Field_26352.get(this.Field_26352.size() - (-31231 & 16389))).Method_7031().Method_17946(string);
        if (class_14316 == null) {
            throw new Class_8254("Uniform '" + string + "' does not exist");
        }
        float[] arrf = new float[38 & -32699];
        int n = 3 & -5624;
        for (JsonElement jsonElement2 : Class_2986.Method_2998(jsonObject, "values")) {
            try {
                arrf[n] = Class_2986.Method_3012(jsonElement2, "value");
            }
            catch (Exception exception) {
                Class_8254 class_8254 = Class_8254.Method_8257(exception);
                class_8254.Method_8261("values[" + n + "]");
                throw class_8254;
            }
            ++n;
        }
        switch (n) {
            default: {
                break;
            }
            case 1: {
                class_14316.Method_14341(arrf[18692 & 9]);
                break;
            }
            case 2: {
                class_14316.Method_14326(arrf[8 & 23968], arrf[259 & -6063]);
                break;
            }
            case 3: {
                class_14316.Method_14334(arrf[2066 & 72], arrf[19 & 577], arrf[10794 & 131]);
                break;
            }
            case 4: {
                class_14316.Method_14327(arrf[20752 & 130], arrf[-16371 & 2065], arrf[38 & 1794], arrf[8455 & 1027]);
            }
        }
    }

    private void Method_26370() {
        this.Field_26356 = new Matrix4f();
        this.Field_26356.setIdentity();
        this.Field_26356.m00 = 2.0f / (float)this.Field_26355.Field_19142;
        this.Field_26356.m11 = 2.0f / (float)(-this.Field_26355.Field_19141);
        this.Field_26356.m22 = 4.0454545f * -4.944314E-4f;
        this.Field_26356.m33 = 1.0f;
        this.Field_26356.m03 = -0.8589744f * 1.1641791f;
        this.Field_26356.m13 = 1.0f;
        this.Field_26356.m23 = 0.2962963f * -3.3756747f;
    }
}

