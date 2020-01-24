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

public class Class_20466
extends Class_7905 {
    protected String Method_20467(Object object) {
        return this.Method_20469((GameProfile)object);
    }

    protected Class_9848 Method_20468(JsonObject jsonObject) {
        return new Class_27981(jsonObject);
    }

    protected String Method_20469(GameProfile gameProfile) {
        return gameProfile.getId().toString();
    }

    public GameProfile Method_20470(String string) {
        for (Class_27981 class_27981 : this.\u0000strictfp().values()) {
            if (!string.equalsIgnoreCase(((GameProfile)class_27981.\u0000strictfp()).getName())) continue;
            return (GameProfile)class_27981.\u0000strictfp();
        }
        return null;
    }

    private void Method_20471() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_20466(File file) {
        super(file);
    }

    public String[] Method_20472() {
        String[] arrstring = new String[this.\u0000strictfp().size()];
        int n = 3200 & 4420;
        for (Class_27981 class_27981 : this.\u0000strictfp().values()) {
            arrstring[n++] = ((GameProfile)class_27981.\u0000strictfp()).getName();
        }
        return arrstring;
    }

    public boolean Method_20473(GameProfile gameProfile) {
        Class_27981 class_27981 = (Class_27981)this.\u0000strictfp((Object)gameProfile);
        return (class_27981 != null ? class_27981.Method_27988() : 16421 & -21118) != 0;
    }
}

