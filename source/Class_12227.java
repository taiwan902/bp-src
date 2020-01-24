/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.minecraft.MinecraftProfileTexture
 *  com.mojang.authlib.minecraft.MinecraftProfileTexture$Type
 */
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Map;

public class Class_12227
implements Runnable {
    final Map Field_12228;
    final Class_34208 Field_12229;

    public void Method_12230() {
        if (this.Field_12228.containsKey((Object)MinecraftProfileTexture.Type.SKIN)) {
            this.Field_12229.Field_34210.Method_16249((MinecraftProfileTexture)this.Field_12228.get((Object)MinecraftProfileTexture.Type.SKIN), MinecraftProfileTexture.Type.SKIN, this.Field_12229.Field_34209);
        }
        if (this.Field_12228.containsKey((Object)MinecraftProfileTexture.Type.CAPE)) {
            this.Field_12229.Field_34210.Method_16249((MinecraftProfileTexture)this.Field_12228.get((Object)MinecraftProfileTexture.Type.CAPE), MinecraftProfileTexture.Type.CAPE, this.Field_12229.Field_34209);
        }
    }

    Class_12227(Class_34208 class_34208, Map map) {
        this.Field_12229 = class_34208;
        this.Field_12228 = map;
    }

    private void Method_12231() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

