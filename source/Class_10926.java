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

public class Class_10926
implements Runnable {
    final Class_7368 Field_10927;

    private void Method_10928() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_10929() {
        if (this.Field_10927.Field_7369 != null) {
            this.Field_10927.Field_7369.Method_7058();
        }
        if (this.Field_10927.Field_7370.Field_26057 != null) {
            this.Field_10927.Field_7370.Field_26057.Method_18946(this.Field_10927.Field_7370.Field_26058, this.Field_10927.Field_7370.Field_26059, this.Field_10927.Field_7370.Field_26055);
        }
    }

    Class_10926(Class_7368 class_7368) {
        this.Field_10927 = class_7368;
    }
}

