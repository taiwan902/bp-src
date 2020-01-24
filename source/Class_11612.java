/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.ListenableFuture
 */
import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class Class_11612
implements Class_1549,
ListenableFuture {
    public Class_18 Field_11613;
    public Class_1490 Field_11614;
    public ArrayList Field_11615;
    public Throwable Field_11616;
    public File Field_11617;
    public boolean Field_11618;
    public Class_1792 Field_11619;
    public ArrayList Field_11620;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void Method_11621() {
        this.Field_11613.Method_218(this.Field_11614);
        Class_11612 class_11612 = this;
        synchronized (class_11612) {
            for (int i = -11866 & 521; i < this.Field_11620.size(); ++i) {
                ((Executor)this.Field_11615.get(i)).execute((Runnable)this.Field_11620.get(i));
            }
        }
    }

    public Object Method_11622(long l, TimeUnit timeUnit) {
        return null;
    }

    public void Method_11623(boolean bl, int n) {
        this.Field_11619.Method_1805(5276 & 278);
        if (bl) {
            this.Field_11616 = Class_11612.Method_11625(this.Field_11617);
            if (this.Field_11616 == null) {
                this.Method_11621();
            }
        } else {
            this.Method_11621();
        }
    }

    public boolean Method_11624() {
        return (8249 & 7808) != 0;
    }

    public static Throwable Method_11625(File file) {
        try {
            ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(file));
            byte[] arrby = new byte[14850 & 9296];
            ZipEntry zipEntry = zipInputStream.getNextEntry();
            while (zipEntry != null) {
                while (zipInputStream.read(arrby) != (-1 & -1)) {
                }
                zipEntry = zipInputStream.getNextEntry();
            }
            zipInputStream.close();
        }
        catch (Throwable throwable) {
            return throwable;
        }
        return null;
    }

    public boolean Method_11626(boolean bl) {
        return (598 & 2176) != 0;
    }

    private void Method_11627() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_11628() {
        return this.Field_11618;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void Method_11629(Runnable runnable, Executor executor) {
        Class_11612 class_11612 = this;
        synchronized (class_11612) {
            this.Field_11620.add(runnable);
            this.Field_11615.add(executor);
        }
    }

    public static ListenableFuture Method_11630(File file) {
        Class_1792 class_1792;
        Class_18 class_18 = Class_18.Field_89;
        Throwable throwable = Class_11612.Method_11625(file);
        if (throwable == null) {
            return class_18.Method_200().Method_10524(file);
        }
        Class_11612 class_11612 = new Class_11612();
        class_11612.Field_11613 = class_18;
        class_11612.Field_11614 = class_18.Field_36;
        class_11612.Field_11617 = file;
        class_11612.Field_11616 = throwable;
        class_11612.Field_11619 = class_1792 = new Class_1792(class_11612, "Paczka tekstur jest uszkodzona", "Czy chcesz spr\u00f3bowa\u0107 wczyta\u0107 jeszcze raz?", -18426 & 1120);
        class_18.Method_218(class_1792);
        return class_11612;
    }

    public Object Method_11631() {
        if (this.Field_11616 == null) {
            throw new ExecutionException(this.Field_11616);
        }
        return null;
    }
}

