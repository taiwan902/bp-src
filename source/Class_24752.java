/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class_24752
extends Class_23424 {
    private Class_9953 Field_24753;
    protected final Class_2080 Field_24754;
    private BufferedImage Field_24755;
    private static final Logger Field_24756 = LogManager.getLogger();

    private void Method_24757() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_24758(Class_279 class_279) {
        this.Method_24759();
        this.Method_24760(class_279);
        boolean bl = 16 & 9103;
        boolean bl2 = 3078 & 16896;
        if (this.Field_24753.Method_9957()) {
            try {
                Class_26185 class_26185 = (Class_26185)this.Field_24753.Method_9956("texture");
                if (class_26185 != null) {
                    bl = class_26185.Method_26192();
                    bl2 = class_26185.Method_26191();
                }
            }
            catch (RuntimeException runtimeException) {
                Field_24756.warn("Failed reading metadata of: " + this.Field_24754, (Throwable)runtimeException);
            }
        }
        if (Class_19426.Method_19570()) {
            Class_8049.Method_8071(this.\u0000strictfp(), this.Field_24755, bl, bl2, class_279, this.Field_24754, this.\u0000strictfp());
        } else {
            Class_18695.Method_18703(this.\u0000strictfp(), this.Field_24755, bl, bl2);
        }
    }

    public void Method_24759() {
        super.Method_23437();
    }

    public Class_24752(Class_2080 class_2080) {
        this.Field_24754 = class_2080;
    }

    public void Method_24760(Class_279 class_279) {
        try (InputStream inputStream = null;){
            this.Field_24753 = class_279.Method_282(this.Field_24754);
            inputStream = this.Field_24753.Method_9958();
            this.Field_24755 = Class_18695.Method_18726(inputStream);
        }
    }
}

