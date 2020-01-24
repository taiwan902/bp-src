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

public final class Class_27656
extends Class_20457 {
    final boolean Field_27657;
    final Class_24595 Field_27658;
    final Class_15281 Field_27659;

    public void Method_27660() {
    }

    private static void Method_27661(Class_15281 class_15281, Class_19123 class_19123, boolean bl, Class_24595 class_24595) {
        try {
            File file = new File(Class_16393.Field_16394 + "\\" + class_15281.Field_15283);
            file.getParentFile().mkdirs();
            class_19123.Method_19130(new FileOutputStream(file), null);
            Class_16393.Method_16406(bl, class_24595, class_15281);
        }
        catch (IOException iOException) {
            Class_18.Field_19.info("[OpusDownloader] Nie mozna zaladowac: " + class_15281.Field_15283);
            Class_16393.Method_16408((-30703 & 18273) != 0);
        }
    }

    Class_27656(Class_15281 class_15281, boolean bl, Class_24595 class_24595) {
        this.Field_27659 = class_15281;
        this.Field_27657 = bl;
        this.Field_27658 = class_24595;
    }

    public void Method_27662(Class_19123 class_19123) {
        Class_23299.Field_23303.execute(() -> Class_27656.Method_27661(this.Field_27659, class_19123, this.Field_27657, this.Field_27658));
    }

    private void Method_27663() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_27664(int n) {
        Class_18.Field_19.info("[OpusDownloader] Nie mozna zaladowac: " + this.Field_27659.Field_15283);
        Class_16393.Method_16408((2081 & 5705) != 0);
    }
}

