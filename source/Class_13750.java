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

public class Class_13750
extends Class_7905 {
    public GameProfile Method_13751(String string) {
        for (Class_30192 class_30192 : this.\u0000strictfp().values()) {
            if (!string.equalsIgnoreCase(((GameProfile)class_30192.\u0000strictfp()).getName())) continue;
            return (GameProfile)class_30192.\u0000strictfp();
        }
        return null;
    }

    protected String Method_13752(Object object) {
        return this.Method_13755((GameProfile)object);
    }

    private void Method_13753() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected Class_9848 Method_13754(JsonObject jsonObject) {
        return new Class_30192(jsonObject);
    }

    protected String Method_13755(GameProfile gameProfile) {
        return gameProfile.getId().toString();
    }

    public Class_13750(File file) {
        super(file);
    }

    public String[] Method_13756() {
        String[] arrstring = new String[this.\u0000strictfp().size()];
        int n = 5940 & 16579;
        for (Class_30192 class_30192 : this.\u0000strictfp().values()) {
            arrstring[n++] = ((GameProfile)class_30192.\u0000strictfp()).getName();
        }
        return arrstring;
    }
}

