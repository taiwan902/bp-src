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

public class Class_15192 {
    static final int[] Field_15193 = new int[MinecraftProfileTexture.Type.values().length];

    private void Method_15194() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    static {
        try {
            Class_15192.Field_15193[MinecraftProfileTexture.Type.SKIN.ordinal()] = 5139 & 8257;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            Class_15192.Field_15193[MinecraftProfileTexture.Type.CAPE.ordinal()] = 17978 & 4102;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

