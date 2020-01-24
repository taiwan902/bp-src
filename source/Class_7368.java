/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.ListenableFuture
 */
import com.google.common.util.concurrent.ListenableFuture;
import java.awt.image.BufferedImage;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_7368
implements Class_7057 {
    final Class_7057 Field_7369;
    final Class_26054 Field_7370;

    public BufferedImage Method_7371(BufferedImage bufferedImage) {
        if (this.Field_7369 != null) {
            bufferedImage = this.Field_7369.Method_7059(bufferedImage);
        }
        return bufferedImage;
    }

    public void Method_7372() {
        Class_18.Field_89.Method_229(new Class_10926(this));
    }

    private void Method_7373() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_7368(Class_26054 class_26054, Class_7057 class_7057) {
        this.Field_7370 = class_26054;
        this.Field_7369 = class_7057;
    }
}

