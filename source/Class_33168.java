/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.Logger
 */
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import org.apache.logging.log4j.Logger;

public final class Class_33168
extends Class_20457 {
    final Class_15274 Field_33169;
    final boolean Field_33170;
    final Class_24595 Field_33171;

    Class_33168(Class_15274 class_15274, boolean bl, Class_24595 class_24595) {
        this.Field_33169 = class_15274;
        this.Field_33170 = bl;
        this.Field_33171 = class_24595;
    }

    private static void Method_33172(Class_15274 class_15274, Class_19123 class_19123, boolean bl, Class_24595 class_24595) {
        try {
            File file = new File(Class_23299.Field_23304 + "\\" + class_15274.Field_15276);
            file.getParentFile().mkdirs();
            class_19123.Method_19130(new FileOutputStream(file), null);
            Class_23299.Method_23368(bl, class_24595, class_15274);
        }
        catch (IOException iOException) {
            Class_18.Field_19.info("[BrowserDownloader] Nie mozna zaladowac: " + class_15274.Field_15276);
            Class_23299.Method_23316((-17787 & 1057) != 0);
        }
    }

    public void Method_33173(int n) {
        Class_18.Field_19.info("[BrowserDownloader] Nie mozna zaladowac: " + this.Field_33169.Field_15276);
        Class_23299.Method_23316((1549 & -1727) != 0);
    }

    public void Method_33174() {
    }

    private void Method_33175() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_33176(Class_19123 class_19123) {
        Class_23299.Field_23303.execute(() -> Class_33168.Method_33172(this.Field_33169, class_19123, this.Field_33170, this.Field_33171));
    }
}

