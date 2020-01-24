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

public class Class_27058
implements Class_18945 {
    final Class_9738 Field_27059;

    private void Method_27060() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_27058(Class_9738 class_9738) {
        this.Field_27059 = class_9738;
    }

    public void Method_27061(MinecraftProfileTexture.Type type, Class_2080 class_2080, MinecraftProfileTexture minecraftProfileTexture) {
        switch (Class_15192.Field_15193[type.ordinal()]) {
            case 1: {
                Class_9738.Method_9753(this.Field_27059, class_2080);
                Class_9738.Method_9765(this.Field_27059, minecraftProfileTexture.getMetadata("model"));
                if (Class_9738.Method_9757(this.Field_27059) != null) break;
                Class_9738.Method_9765(this.Field_27059, "default");
                break;
            }
            case 2: {
                Class_9738.Method_9763(this.Field_27059, class_2080);
            }
        }
    }
}

