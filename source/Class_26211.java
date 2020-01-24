/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.awt.image.BufferedImage;
import java.io.File;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class_26211
extends Class_24752 {
    private final Class_7057 Field_26212;
    private final File Field_26213;
    private boolean Field_26214;
    private static final AtomicInteger Field_26215;
    private final String Field_26216;
    private static final Logger Field_26217;
    private boolean Field_26218;
    private boolean Field_26219;
    private BufferedImage Field_26220;
    public Boolean Field_26221 = null;
    private byte[] Field_26222 = null;

    static {
        Field_26217 = LogManager.getLogger();
        Field_26215 = new AtomicInteger(8306 & 640);
    }

    public void Method_26223() {
        Class_26472 class_26472 = new Class_26472(this, "Texture Downloader #" + Field_26215.incrementAndGet());
        class_26472.setDaemon((16417 & 2181) != 0);
        class_26472.start();
    }

    public void Method_26224(BufferedImage bufferedImage) {
        this.Field_26220 = bufferedImage;
        if (this.Field_26212 != null) {
            this.Field_26212.Method_7058();
        }
        this.Field_26221 = (this.Field_26220 != null ? -14845 & 8577 : -26077 & 24836) != 0;
    }

    public byte[] Method_26225() {
        return this.Field_26222;
    }

    public Class_26211(File file, String string, Class_2080 class_2080, Class_7057 class_7057, boolean bl) {
        super(class_2080);
        this.Field_26213 = file;
        this.Field_26216 = string;
        this.Field_26212 = class_7057;
        this.Field_26218 = bl;
    }

    public int Method_26226() {
        this.Method_26233();
        return super.\u0000strictfp();
    }

    static BufferedImage Method_26227(Class_26211 class_26211, BufferedImage bufferedImage) {
        class_26211.Field_26220 = bufferedImage;
        return class_26211.Field_26220;
    }

    static Class_7057 Method_26228(Class_26211 class_26211) {
        return class_26211.Field_26212;
    }

    static boolean Method_26229(Class_26211 class_26211) {
        return class_26211.Field_26218;
    }

    static String Method_26230(Class_26211 class_26211) {
        return class_26211.Field_26216;
    }

    static BufferedImage Method_26231(Class_26211 class_26211) {
        return class_26211.Field_26220;
    }

    static File Method_26232(Class_26211 class_26211) {
        return class_26211.Field_26213;
    }

    private void Method_26233() {
        if (!this.Field_26219 && this.Field_26220 != null) {
            if (this.\u0000strictfp != null) {
                this.\u0000= final();
            }
            Class_18695.Method_18713(super.\u0000strictfp(), this.Field_26220);
            this.Field_26219 = -30623 & 4749;
        }
    }

    public void Method_26234(Class_279 class_279) {
        if (this.Field_26220 == null && this.\u0000strictfp != null && this.Field_26218) {
            super.Method_24758(class_279);
        }
        if (!this.Field_26214) {
            this.Field_26214 = 12353 & -14559;
            Class_16234.Field_16239.submit(new Class_16616(this));
        }
    }

    static Logger Method_26235() {
        return Field_26217;
    }

    public Class_26211(File file, String string, Class_2080 class_2080, Class_7057 class_7057) {
        this(file, string, class_2080, class_7057, (20579 & 3597) != 0);
    }

    private void Method_26236() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

