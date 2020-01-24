/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.ListenableFuture
 *  com.mojang.authlib.minecraft.MinecraftProfileTexture
 *  com.mojang.authlib.minecraft.MinecraftProfileTexture$Type
 */
import com.google.common.util.concurrent.ListenableFuture;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import java.io.File;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_26054
implements Runnable {
    final MinecraftProfileTexture Field_26055;
    final Class_16234 Field_26056;
    final Class_18945 Field_26057;
    final MinecraftProfileTexture.Type Field_26058;
    final Class_2080 Field_26059;

    public void Method_26060() {
        File file = new File(Class_16234.Method_16246(this.Field_26056), this.Field_26055.getHash().length() > (-28474 & 827) ? this.Field_26055.getHash().substring(-31992 & 4309, -20094 & 2154) : "xx");
        File file2 = new File(file, this.Field_26055.getHash());
        Class_15993 class_15993 = this.Field_26058 == MinecraftProfileTexture.Type.SKIN ? new Class_15993() : null;
        Class_26211 class_26211 = new Class_26211(file2, this.Field_26055.getUrl(), Class_13490.Method_13493(), new Class_7368(this, class_15993));
        Class_16234.Method_16244(this.Field_26056).Method_34705(this.Field_26059, class_26211);
        Class_18.Field_89.Method_229(new Class_41362(this, class_26211));
    }

    Class_26054(Class_16234 class_16234, MinecraftProfileTexture minecraftProfileTexture, MinecraftProfileTexture.Type type, Class_18945 class_18945, Class_2080 class_2080) {
        this.Field_26056 = class_16234;
        this.Field_26055 = minecraftProfileTexture;
        this.Field_26058 = type;
        this.Field_26057 = class_18945;
        this.Field_26059 = class_2080;
    }

    private void Method_26061() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

