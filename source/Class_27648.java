/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.mojang.authlib.GameProfile
 */
import com.google.gson.JsonObject;
import com.mojang.authlib.GameProfile;
import java.io.File;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Collection;
import java.util.Map;
import java.util.UUID;

public class Class_27648
extends Class_7905 {
    private void Method_27649() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected String Method_27650(Object object) {
        return this.Method_27651((GameProfile)object);
    }

    protected String Method_27651(GameProfile gameProfile) {
        return gameProfile.getId().toString();
    }

    public boolean Method_27652(GameProfile gameProfile) {
        return this.\u0000strictfp((Object)gameProfile);
    }

    public GameProfile Method_27653(String string) {
        for (Class_14573 class_14573 : this.\u0000strictfp().values()) {
            if (!string.equalsIgnoreCase(((GameProfile)class_14573.\u0000strictfp()).getName())) continue;
            return (GameProfile)class_14573.\u0000strictfp();
        }
        return null;
    }

    protected Class_9848 Method_27654(JsonObject jsonObject) {
        return new Class_14573(jsonObject);
    }

    public Class_27648(File file) {
        super(file);
    }

    public String[] Method_27655() {
        String[] arrstring = new String[this.\u0000strictfp().size()];
        int n = 2304 & -23992;
        for (Class_14573 class_14573 : this.\u0000strictfp().values()) {
            arrstring[n++] = ((GameProfile)class_14573.\u0000strictfp()).getName();
        }
        return arrstring;
    }
}

