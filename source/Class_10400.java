/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.apache.commons.io.IOUtils
 */
import java.awt.image.BufferedImage;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import org.apache.commons.io.IOUtils;

public class Class_10400 {
    private final File Field_10401;
    private Class_30227 Field_10402;
    private BufferedImage Field_10403;
    private Class_2035 Field_10404;
    final Class_10502 Field_10405;
    private Class_2080 Field_10406;

    public Class_2035 Method_10407() {
        return this.Field_10404;
    }

    public String Method_10408() {
        Object[] arrobject = new Object[12307 & 1891];
        arrobject[17412 & 2170] = this.Field_10401.getName();
        arrobject[-32223 & 21] = this.Field_10401.isDirectory() ? "folder" : "zip";
        arrobject[17410 & 526] = this.Field_10401.lastModified();
        return String.format("%s:%s:%d", arrobject);
    }

    public boolean Method_10409(Object object) {
        return (this == object ? -14269 & 5937 : (object instanceof Class_10400 ? (int)(this.Method_10408().equals(object.toString()) ? 1 : 0) : 4512 & 3671)) != 0;
    }

    public int Method_10410() {
        return this.Method_10408().hashCode();
    }

    public String Method_10411() {
        return this.Field_10404.Method_2036();
    }

    public void Method_10412() {
        this.Field_10404 = this.Field_10401.isDirectory() ? new Class_26921(this.Field_10401) : new Class_27899(this.Field_10401);
        this.Field_10402 = (Class_30227)this.Field_10404.Method_2040(this.Field_10405.Field_10507, "pack");
        try {
            this.Field_10403 = this.Field_10404.Method_2038();
        }
        catch (IOException iOException) {
            // empty catch block
        }
        if (this.Field_10403 == null) {
            this.Field_10403 = this.Field_10405.Field_10509.Method_2038();
        }
        this.Method_10416();
    }

    private void Method_10413() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public String Method_10414() {
        return this.Field_10402 == null ? (Object)((Object)Class_5478.Field_5505) + "Invalid pack.mcmeta (or missing 'pack' section)" : this.Field_10402.Method_30231().Method_1783();
    }

    Class_10400(Class_10502 class_10502, File file, Class_14373 class_14373) {
        this(class_10502, file);
    }

    public int Method_10415() {
        return this.Field_10402.Method_30230();
    }

    private Class_10400(Class_10502 class_10502, File file) {
        this.Field_10405 = class_10502;
        this.Field_10401 = file;
    }

    public void Method_10416() {
        if (this.Field_10404 instanceof Closeable) {
            IOUtils.closeQuietly((Closeable)((Closeable)((Object)this.Field_10404)));
        }
    }

    public void Method_10417(Class_34695 class_34695) {
        if (this.Field_10406 == null) {
            this.Field_10406 = class_34695.Method_34708("texturepackicon", new Class_47630(this.Field_10403));
        }
        class_34695.Method_34707(this.Field_10406);
    }
}

