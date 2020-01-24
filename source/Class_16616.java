/*
 * Decompiled with CFR 0.145.
 */
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import javax.imageio.ImageIO;

public class Class_16616
implements Runnable {
    final Class_26211 Field_16617;

    private void Method_16618() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_16616(Class_26211 class_26211) {
        this.Field_16617 = class_26211;
    }

    public void Method_16619() {
        File file = Class_26211.Method_26232(this.Field_16617);
        if (file != null && file.isFile()) {
            Object[] arrobject = new Object[18019 & -32511];
            arrobject[2089 & -15744] = file;
            Class_26211.Method_26235().debug("Loading http texture from local cache ({})", arrobject);
            try {
                Class_26211.Method_26227(this.Field_16617, ImageIO.read(file));
                if (Class_26211.Method_26228(this.Field_16617) != null) {
                    if (Class_26211.Method_26229(this.Field_16617)) {
                        this.Field_16617.Method_26224(Class_26211.Method_26228(this.Field_16617).Method_7059(Class_26211.Method_26231(this.Field_16617)));
                    } else {
                        this.Field_16617.Method_26224(Class_26211.Method_26231(this.Field_16617));
                    }
                }
                this.Field_16617.Field_26221 = (Class_26211.Method_26231(this.Field_16617) != null ? 23 & 13953 : 3089 & -28160) != 0;
            }
            catch (IOException iOException) {
                Class_26211.Method_26235().error("Couldn't load skin " + file, (Throwable)iOException);
                this.Field_16617.Method_26223();
            }
        } else {
            this.Field_16617.Method_26223();
        }
    }
}

