/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.cache.CacheBuilder
 *  com.google.common.cache.CacheLoader
 *  com.google.common.cache.LoadingCache
 *  com.google.common.util.concurrent.ThreadFactoryBuilder
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.minecraft.MinecraftProfileTexture
 *  com.mojang.authlib.minecraft.MinecraftProfileTexture$Type
 *  com.mojang.authlib.minecraft.MinecraftSessionService
 */
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import java.io.File;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Class_16234 {
    private final File Field_16235;
    private final LoadingCache Field_16236;
    private final MinecraftSessionService Field_16237;
    private HashSet Field_16238 = new HashSet();
    public static final ThreadPoolExecutor Field_16239 = new ScheduledThreadPoolExecutor(1202 & 9082, new ThreadFactoryBuilder().setNameFormat(Class_16234.Method_16250("\u6c44\u6c65\u6c64\u6c63\u6c22\u6c65\u6c66\u6c63\u6c6c\u6c6b\u6c6e\u6c2d\u6c28\u6c2f\u6c6c")).setDaemon((4103 & 8809) != 0).build());
    private final Class_34695 Field_16240;

    public Class_2080 Method_16241(Class_7038 class_7038, Class_26458 class_26458, Class_20515 class_20515) {
        if (class_26458 == null || class_26458.Field_26459 == (602385L & 382995976L)) {
            return null;
        }
        Class_2080 class_2080 = new Class_2080("dynamic/wings/" + class_26458.Field_26460);
        if (this.Field_16240.Method_34709(class_2080) != null) {
            return class_2080;
        }
        if (this.Field_16238.contains(class_26458.Field_26460)) {
            return null;
        }
        this.Field_16238.add(class_26458.Field_26460);
        Class_18.Field_89.Method_247(null).Method_24635(class_26458, null, new Class_22257(this, class_2080, class_26458));
        return null;
    }

    public Class_16234(Class_34695 class_34695, File file, MinecraftSessionService minecraftSessionService) {
        this.Field_16240 = class_34695;
        this.Field_16235 = file;
        this.Field_16237 = minecraftSessionService;
        this.Field_16236 = CacheBuilder.newBuilder().expireAfterAccess(4246154467705746319L & 403703839L, TimeUnit.SECONDS).build((CacheLoader)new Class_11860(this));
    }

    static HashSet Method_16242(Class_16234 class_16234) {
        return class_16234.Field_16238;
    }

    private void Method_16243() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    static Class_34695 Method_16244(Class_16234 class_16234) {
        return class_16234.Field_16240;
    }

    public void Method_16245(GameProfile gameProfile, Class_18945 class_18945, boolean bl) {
        Field_16239.submit(new Class_34208(this, gameProfile, bl, class_18945));
    }

    static File Method_16246(Class_16234 class_16234) {
        return class_16234.Field_16235;
    }

    public Map Method_16247(GameProfile gameProfile) {
        return (Map)this.Field_16236.getUnchecked((Object)gameProfile);
    }

    public Class_2080 Method_16248(MinecraftProfileTexture minecraftProfileTexture, MinecraftProfileTexture.Type type) {
        return this.Method_16249(minecraftProfileTexture, type, null);
    }

    public Class_2080 Method_16249(MinecraftProfileTexture minecraftProfileTexture, MinecraftProfileTexture.Type type, Class_18945 class_18945) {
        Class_2080 class_2080 = new Class_2080("skins/" + minecraftProfileTexture.getHash());
        Class_2062 class_2062 = this.Field_16240.Method_34709(class_2080);
        if (class_2062 != null) {
            if (class_18945 != null) {
                class_18945.Method_18946(type, class_2080, minecraftProfileTexture);
            }
        } else {
            Field_16239.submit(new Class_26054(this, minecraftProfileTexture, type, class_18945, class_2080));
        }
        return class_2080;
    }

    private static String Method_16250(String string) {
        int n = 18269;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_16234.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    static MinecraftSessionService Method_16251(Class_16234 class_16234) {
        return class_16234.Field_16237;
    }
}

