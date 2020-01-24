/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.ListenableFuture
 */
import com.google.common.util.concurrent.ListenableFuture;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class Class_22257
extends Class_20457 {
    final Class_26458 Field_22258;
    final Class_16234 Field_22259;
    final Class_2080 Field_22260;

    private void Method_22261(Class_2080 class_2080, Class_19123 class_19123, Class_26458 class_26458) {
        long l = System.currentTimeMillis();
        try {
            Class_18.Field_89.Method_253().Method_34704(class_2080, new Class_47630(ImageIO.read(new ByteArrayInputStream(class_19123.Method_19133()))));
        }
        catch (IOException iOException) {
            // empty catch block
        }
        Class_16234.Method_16242(this.Field_22259).remove(class_26458.Field_26460);
    }

    private void Method_22262() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_22263(int n) {
        Logger.getLogger(Class_16234.class.getName()).warning("Cannot load wings: " + n);
        Class_18.Field_89.Method_229(() -> this.Method_22265(this.Field_22258));
    }

    public void Method_22264(Class_19123 class_19123) {
        Class_18.Field_89.Method_229(() -> this.Method_22261(this.Field_22260, class_19123, this.Field_22258));
    }

    Class_22257(Class_16234 class_16234, Class_2080 class_2080, Class_26458 class_26458) {
        this.Field_22259 = class_16234;
        this.Field_22260 = class_2080;
        this.Field_22258 = class_26458;
    }

    private void Method_22265(Class_26458 class_26458) {
        Class_16234.Method_16242(this.Field_22259).remove(class_26458.Field_26460);
    }
}

