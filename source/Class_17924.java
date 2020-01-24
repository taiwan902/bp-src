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
 *  org.apache.commons.io.IOUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.base.Charsets;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.InputStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class_17924 {
    private final List Field_17925;
    private final String Field_17926;
    private static Class_17924 Field_17927;
    private final Class_11260 Field_17928;
    private final List Field_17929 = Lists.newArrayList();
    private boolean Field_17930;
    private final Class_8083 Field_17931;
    private static boolean Field_17932;
    private final Map Field_17933 = Maps.newHashMap();
    private static int Field_17934;
    private final Class_11260 Field_17935;
    private static final Logger Field_17936;
    private final List Field_17937 = Lists.newArrayList();
    private final List Field_17938;
    private final List Field_17939 = Lists.newArrayList();
    private final Map Field_17940 = Maps.newHashMap();
    private final List Field_17941 = Lists.newArrayList();
    private final int Field_17942;
    private final boolean Field_17943;
    private static final Class_23977 Field_17944;

    public void Method_17945() {
        this.Field_17930 = 22917 & 1633;
    }

    public Class_14316 Method_17946(String string) {
        return this.Field_17933.containsKey(string) ? (Class_14316)this.Field_17933.get(string) : null;
    }

    public Class_11260 Method_17947() {
        return this.Field_17935;
    }

    public int Method_17948() {
        return this.Field_17942;
    }

    public Class_11260 Method_17949() {
        return this.Field_17928;
    }

    public Class_14316 Method_17950(String string) {
        return this.Field_17933.containsKey(string) ? (Class_14316)this.Field_17933.get(string) : Field_17944;
    }

    private void Method_17951(JsonElement jsonElement) {
        Object object2;
        JsonObject jsonObject = Class_2986.Method_2996(jsonElement, "uniform");
        String string = Class_2986.Method_3001(jsonObject, "name");
        int n = Class_14316.Method_14337(Class_2986.Method_3001(jsonObject, "type"));
        int n2 = Class_2986.Method_3011(jsonObject, "count");
        float[] arrf = new float[Math.max(n2, 2196 & -7600)];
        JsonArray jsonArray = Class_2986.Method_2998(jsonObject, "values");
        if (jsonArray.size() != n2 && jsonArray.size() > (17985 & 2305)) {
            throw new Class_8254("Invalid amount of values specified (expected " + n2 + ", found " + jsonArray.size() + ")");
        }
        int n3 = -29518 & 520;
        for (Object object2 : jsonArray) {
            try {
                arrf[n3] = Class_2986.Method_3012((JsonElement)object2, "value");
            }
            catch (Exception exception) {
                Class_8254 class_8254 = Class_8254.Method_8257(exception);
                class_8254.Method_8261("values[" + n3 + "]");
                throw class_8254;
            }
            ++n3;
        }
        if (n2 > (675 & -17403) && jsonArray.size() == (21121 & 8295)) {
            while (n3 < n2) {
                arrf[n3] = arrf[16687 & 13824];
                ++n3;
            }
        }
        int n4 = n2 > (1089 & -24167) && n2 <= (-30716 & 5829) && n < (2575 & 4104) ? n2 - (21127 & 2049) : -24512 & 4106;
        object2 = new Class_14316(string, n + n4, n2, this);
        if (n <= (8723 & 4103)) {
            ((Class_14316)object2).Method_14343((int)arrf[22372 & -24566], (int)arrf[4193 & 18435], (int)arrf[8194 & -32502], (int)arrf[12295 & -15837]);
        } else if (n <= (8751 & 16455)) {
            ((Class_14316)object2).Method_14332(arrf[0 & 25456], arrf[25859 & 6669], arrf[1226 & 6435], arrf[535 & 28803]);
        } else {
            ((Class_14316)object2).Method_14329(arrf);
        }
        this.Field_17939.add(object2);
    }

    private void Method_17952() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_17924(Class_279 class_279, String string) {
        JsonParser jsonParser = new JsonParser();
        Class_2080 class_2080 = new Class_2080("shaders/program/" + string + ".json");
        this.Field_17926 = string;
        InputStream inputStream = null;
        try {
            Object object;
            JsonArray jsonArray;
            JsonArray jsonArray2;
            inputStream = class_279.Method_282(class_2080).Method_9958();
            JsonObject jsonObject = jsonParser.parse(IOUtils.toString((InputStream)inputStream, (Charset)Charsets.UTF_8)).getAsJsonObject();
            String string2 = Class_2986.Method_3001(jsonObject, "vertex");
            String string3 = Class_2986.Method_3001(jsonObject, "fragment");
            JsonArray jsonArray3 = Class_2986.Method_2992(jsonObject, "samplers", null);
            if (jsonArray3 != null) {
                int n = -32766 & 18800;
                for (Object object2 : jsonArray3) {
                    try {
                        this.Method_17956((JsonElement)object2);
                    }
                    catch (Exception exception) {
                        object = Class_8254.Method_8257(exception);
                        object.Method_8261("samplers[" + n + "]");
                        throw object;
                    }
                    ++n;
                }
            }
            if ((jsonArray2 = Class_2986.Method_2992(jsonObject, "attributes", null)) != null) {
                int n = 12308 & 2113;
                this.Field_17925 = Lists.newArrayListWithCapacity((int)jsonArray2.size());
                this.Field_17938 = Lists.newArrayListWithCapacity((int)jsonArray2.size());
                for (Object object3 : jsonArray2) {
                    try {
                        this.Field_17938.add(Class_2986.Method_3000((JsonElement)object3, "attribute"));
                    }
                    catch (Exception exception) {
                        Class_8254 class_8254 = Class_8254.Method_8257(exception);
                        class_8254.Method_8261("attributes[" + n + "]");
                        throw class_8254;
                    }
                    ++n;
                }
            } else {
                this.Field_17925 = null;
                this.Field_17938 = null;
            }
            if ((jsonArray = Class_2986.Method_2992(jsonObject, "uniforms", null)) != null) {
                int n = 13677 & 2048;
                for (JsonElement jsonElement : jsonArray) {
                    try {
                        this.Method_17951(jsonElement);
                    }
                    catch (Exception exception) {
                        Class_8254 class_8254 = Class_8254.Method_8257(exception);
                        class_8254.Method_8261("uniforms[" + n + "]");
                        throw class_8254;
                    }
                    ++n;
                }
            }
            this.Field_17931 = Class_8083.Method_8098(Class_2986.Method_2990(jsonObject, "blend", null));
            this.Field_17943 = Class_2986.Method_3006(jsonObject, "cull", (5667 & 2385) != 0);
            this.Field_17935 = Class_11260.Method_11270(class_279, Class_12379.Field_12385, string2);
            this.Field_17928 = Class_11260.Method_11270(class_279, Class_12379.Field_12386, string3);
            this.Field_17942 = Class_7359.Method_7363().Method_7364();
            Class_7359.Method_7363().Method_7366(this);
            this.Method_17953();
            if (this.Field_17938 != null) {
                for (Object object3 : this.Field_17938) {
                    object = Class_32876.Method_32949(this.Field_17942, (CharSequence)object3);
                    this.Field_17925.add((int)object);
                }
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
        IOUtils.closeQuietly((InputStream)inputStream);
        this.Method_17945();
    }

    private void Method_17953() {
        int n = 144 & -20381;
        int n2 = -28496 & 10316;
        while (n < this.Field_17941.size()) {
            Object object = (String)this.Field_17941.get(n);
            int n3 = Class_32876.Method_32960(this.Field_17942, (CharSequence)object);
            if (n3 == (-1 & -1)) {
                Field_17936.warn("Shader " + this.Field_17926 + "could not find sampler named " + (String)object + " in the specified shader program.");
                this.Field_17940.remove(object);
                this.Field_17941.remove(n2);
                --n2;
            } else {
                this.Field_17929.add(n3);
            }
            ++n;
            ++n2;
        }
        for (Object object : this.Field_17939) {
            String string = ((Class_14316)object).Method_14335();
            int n4 = Class_32876.Method_32960(this.Field_17942, string);
            if (n4 == (-1 & -1)) {
                Field_17936.warn("Could not find uniform named " + string + " in the specified shader program.");
                continue;
            }
            this.Field_17937.add(n4);
            ((Class_14316)object).Method_14330(n4);
            this.Field_17933.put(string, object);
        }
    }

    public void Method_17954() {
        this.Field_17930 = 3168 & -24575;
        Field_17927 = this;
        this.Field_17931.Method_8097();
        if (this.Field_17942 != Field_17934) {
            Class_32876.Method_32952(this.Field_17942);
            Field_17934 = this.Field_17942;
        }
        if (this.Field_17943) {
            Class_16867.Method_16979();
        } else {
            Class_16867.Method_16969();
        }
        for (int i = -14074 & 128; i < this.Field_17929.size(); ++i) {
            if (this.Field_17940.get(this.Field_17941.get(i)) == null) continue;
            Class_16867.Method_16960(Class_32876.Field_32931 + i);
            Class_16867.Method_16965();
            Class_14316 class_14316 = this.Field_17940.get(this.Field_17941.get(i));
            int n = -1 & -1;
            if (class_14316 instanceof Class_19135) {
                n = ((Class_19135)class_14316).Field_19144;
            } else if (class_14316 instanceof Class_2062) {
                n = ((Class_2062)((Object)class_14316)).Method_2063();
            } else if (class_14316 instanceof Integer) {
                n = (Integer)((Object)class_14316);
            }
            if (n == (-1 & -1)) continue;
            Class_16867.Method_16963(n);
            Class_32876.Method_32935(Class_32876.Method_32960(this.Field_17942, (CharSequence)this.Field_17941.get(i)), i);
        }
        for (Class_14316 class_14316 : this.Field_17939) {
            class_14316.Method_14328();
        }
    }

    public void Method_17955(String string, Object object) {
        if (this.Field_17940.containsKey(string)) {
            this.Field_17940.remove(string);
        }
        this.Field_17940.put(string, object);
        this.Method_17945();
    }

    static {
        Field_17936 = LogManager.getLogger();
        Field_17944 = new Class_23977();
        Field_17927 = null;
        Field_17934 = -1 & -1;
        Field_17932 = 6209 & -32705;
    }

    private void Method_17956(JsonElement jsonElement) {
        JsonObject jsonObject = Class_2986.Method_2996(jsonElement, "sampler");
        String string = Class_2986.Method_3001(jsonObject, "name");
        if (!Class_2986.Method_2993(jsonObject, "file")) {
            this.Field_17940.put(string, null);
            this.Field_17941.add(string);
        } else {
            this.Field_17941.add(string);
        }
    }

    public void Method_17957() {
        Class_32876.Method_32952(3088 & 544);
        Field_17934 = -1 & -1;
        Field_17927 = null;
        Field_17932 = 65 & -30715;
        for (int i = 1025 & 22882; i < this.Field_17929.size(); ++i) {
            if (this.Field_17940.get(this.Field_17941.get(i)) == null) continue;
            Class_16867.Method_16960(Class_32876.Field_32931 + i);
            Class_16867.Method_16963(-15856 & 1248);
        }
    }

    public void Method_17958() {
        Class_7359.Method_7363().Method_7365(this);
    }
}

