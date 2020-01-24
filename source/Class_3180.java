/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  com.google.common.collect.Iterators
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.io.Files
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonParseException
 *  com.mojang.authlib.Agent
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.GameProfileRepository
 *  com.mojang.authlib.ProfileLookupCallback
 *  org.apache.commons.io.IOUtils
 */
import com.google.common.base.Charsets;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.io.Files;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.mojang.authlib.Agent;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.GameProfileRepository;
import com.mojang.authlib.ProfileLookupCallback;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.apache.commons.io.IOUtils;

public class Class_3180 {
    private final Map Field_3181 = Maps.newHashMap();
    private final Class_2457 Field_3182;
    public static final SimpleDateFormat Field_3183 = new SimpleDateFormat(Class_3180.Method_3196("\u6080\u6080\u6080\u6080\u6080\u60a0\u60a0\u6080\u6085\u6085\u6081\u60a1\u60a5\u6085\u6080\u6080\u6091\u6090\u6090\u6091\u60b5"));
    private static final ParameterizedType Field_3184 = new Class_3201();
    private final Map Field_3185 = Maps.newHashMap();
    private final File Field_3186;
    protected final Gson Field_3187;
    private final LinkedList Field_3188 = Lists.newLinkedList();

    public String[] Method_3189() {
        ArrayList arrayList = Lists.newArrayList(this.Field_3185.keySet());
        return arrayList.toArray(new String[arrayList.size()]);
    }

    public void Method_3190(GameProfile gameProfile) {
        this.Method_3195(gameProfile, null);
    }

    private static GameProfile Method_3191(Class_2457 class_2457, String string) {
        GameProfile[] arrgameProfile = new GameProfile[16507 & 4609];
        Class_7514 class_7514 = new Class_7514(arrgameProfile);
        String[] arrstring = new String[3593 & 16419];
        arrstring[8304 & 1036] = string;
        class_2457.Method_2603().findProfilesByNames(arrstring, Agent.MINECRAFT, (ProfileLookupCallback)class_7514);
        if (!class_2457.Method_2600() && arrgameProfile[-31672 & 8212] == null) {
            UUID uUID = Class_626.Method_851(new GameProfile((UUID)null, string));
            GameProfile gameProfile = new GameProfile(uUID, string);
            class_7514.onProfileLookupSucceeded(gameProfile);
        }
        return arrgameProfile[545 & -29690];
    }

    private void Method_3192() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public GameProfile Method_3193(UUID uUID) {
        Class_3206 class_3206 = (Class_3206)this.Field_3181.get(uUID);
        return class_3206 == null ? null : class_3206.Method_3212();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void Method_3194() {
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = Files.newReader((File)this.Field_3186, (Charset)Charsets.UTF_8);
            List list = (List)this.Field_3187.fromJson((Reader)bufferedReader, (Type)Field_3184);
            this.Field_3185.clear();
            this.Field_3181.clear();
            this.Field_3188.clear();
            for (Class_3206 class_3206 : Lists.reverse((List)list)) {
                if (class_3206 == null) continue;
                this.Method_3195(class_3206.Method_3212(), class_3206.Method_3213());
            }
        }
        catch (FileNotFoundException fileNotFoundException) {
            IOUtils.closeQuietly(bufferedReader);
        }
        catch (JsonParseException jsonParseException) {
            IOUtils.closeQuietly(bufferedReader);
        }
        catch (Throwable throwable) {
            IOUtils.closeQuietly(bufferedReader);
            throw throwable;
        }
        IOUtils.closeQuietly((Reader)bufferedReader);
    }

    private void Method_3195(GameProfile gameProfile, Date date) {
        Object object;
        UUID uUID = gameProfile.getId();
        if (date == null) {
            object = Calendar.getInstance();
            ((Calendar)object).setTime(new Date());
            ((Calendar)object).add(330 & 28802, 8513 & 563);
            date = ((Calendar)object).getTime();
        }
        object = gameProfile.getName().toLowerCase(Locale.ROOT);
        Class_3206 class_3206 = new Class_3206(this, gameProfile, date, null);
        if (this.Field_3181.containsKey(uUID)) {
            Class_3206 class_32062 = (Class_3206)this.Field_3181.get(uUID);
            this.Field_3185.remove(class_32062.Method_3212().getName().toLowerCase(Locale.ROOT));
            this.Field_3188.remove((Object)gameProfile);
        }
        this.Field_3185.put(gameProfile.getName().toLowerCase(Locale.ROOT), class_3206);
        this.Field_3181.put(uUID, class_3206);
        this.Field_3188.addFirst(gameProfile);
        this.Method_3197();
    }

    private static String Method_3196(String string) {
        int n = 21321;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_3180.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void Method_3197() {
        String string = this.Field_3187.toJson((Object)this.Method_3199(-19479 & 1006));
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = Files.newWriter((File)this.Field_3186, (Charset)Charsets.UTF_8);
            bufferedWriter.write(string);
        }
        catch (FileNotFoundException fileNotFoundException) {
            IOUtils.closeQuietly(bufferedWriter);
        }
        catch (IOException iOException) {
            IOUtils.closeQuietly(bufferedWriter);
            return;
        }
        catch (Throwable throwable) {
            IOUtils.closeQuietly(bufferedWriter);
            throw throwable;
        }
        IOUtils.closeQuietly((Writer)bufferedWriter);
        return;
    }

    public GameProfile Method_3198(String string) {
        String string2 = string.toLowerCase(Locale.ROOT);
        Class_3206 class_3206 = (Class_3206)this.Field_3185.get(string2);
        if (class_3206 != null && new Date().getTime() >= Class_3206.Method_3210(class_3206).getTime()) {
            this.Field_3181.remove(class_3206.Method_3212().getId());
            this.Field_3185.remove(class_3206.Method_3212().getName().toLowerCase(Locale.ROOT));
            this.Field_3188.remove((Object)class_3206.Method_3212());
            class_3206 = null;
        }
        if (class_3206 != null) {
            GameProfile gameProfile = class_3206.Method_3212();
            this.Field_3188.remove((Object)gameProfile);
            this.Field_3188.addFirst(gameProfile);
        } else {
            GameProfile gameProfile = Class_3180.Method_3191(this.Field_3182, string2);
            if (gameProfile != null) {
                this.Method_3190(gameProfile);
                class_3206 = (Class_3206)this.Field_3185.get(string2);
            }
        }
        this.Method_3197();
        return class_3206 == null ? null : class_3206.Method_3212();
    }

    private List Method_3199(int n) {
        ArrayList arrayList = Lists.newArrayList();
        for (GameProfile gameProfile : Lists.newArrayList((Iterator)Iterators.limit(this.Field_3188.iterator(), (int)n))) {
            Class_3206 class_3206 = this.Method_3200(gameProfile.getId());
            if (class_3206 == null) continue;
            arrayList.add(class_3206);
        }
        return arrayList;
    }

    public Class_3180(Class_2457 class_2457, File file) {
        this.Field_3182 = class_2457;
        this.Field_3186 = file;
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeHierarchyAdapter(Class_3206.class, (Object)new Class_3214(this, null));
        this.Field_3187 = gsonBuilder.create();
        this.Method_3194();
    }

    private Class_3206 Method_3200(UUID uUID) {
        Class_3206 class_3206 = (Class_3206)this.Field_3181.get(uUID);
        if (class_3206 != null) {
            GameProfile gameProfile = class_3206.Method_3212();
            this.Field_3188.remove((Object)gameProfile);
            this.Field_3188.addFirst(gameProfile);
        }
        return class_3206;
    }
}

