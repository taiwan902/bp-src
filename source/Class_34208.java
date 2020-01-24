/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Multimap
 *  com.google.common.util.concurrent.ListenableFuture
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.minecraft.InsecureTextureException
 *  com.mojang.authlib.properties.PropertyMap
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.google.common.util.concurrent.ListenableFuture;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.InsecureTextureException;
import com.mojang.authlib.properties.PropertyMap;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.security.SignatureException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.apache.logging.log4j.Logger;

public class Class_34208
implements Runnable {
    final Class_18945 Field_34209;
    final Class_16234 Field_34210;
    final boolean Field_34211;
    final GameProfile Field_34212;

    public void Method_34213() {
        HashMap hashMap;
        block7 : {
            block6 : {
                hashMap = Maps.newHashMap();
                try {
                    hashMap.putAll(Class_16234.Method_16251(this.Field_34210).getTextures(this.Field_34212, this.Field_34211));
                }
                catch (InsecureTextureException insecureTextureException) {
                }
                catch (Exception exception) {
                    if (!(exception instanceof SignatureException)) break block6;
                    Class_18.Field_19.warn("SignatureException from skin server: " + exception.getLocalizedMessage());
                }
            }
            if (hashMap.isEmpty() && this.Field_34212.getId().equals(Class_18.Field_89.Method_265().Method_2117().getId())) {
                this.Field_34212.getProperties().clear();
                this.Field_34212.getProperties().putAll((Multimap)Class_18.Field_89.Method_254());
                try {
                    hashMap.putAll(Class_16234.Method_16251(this.Field_34210).getTextures(this.Field_34212, (18516 & -32629) != 0));
                }
                catch (Exception exception) {
                    if (!(exception instanceof SignatureException)) break block7;
                    Class_18.Field_19.warn("SignatureException from skin server (unsecure): " + exception.getLocalizedMessage());
                }
            }
        }
        Class_18.Field_89.Method_229(new Class_12227(this, hashMap));
    }

    Class_34208(Class_16234 class_16234, GameProfile gameProfile, boolean bl, Class_18945 class_18945) {
        this.Field_34210 = class_16234;
        this.Field_34212 = gameProfile;
        this.Field_34211 = bl;
        this.Field_34209 = class_18945;
    }

    private void Method_34214() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

