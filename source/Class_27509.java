/*
 * Decompiled with CFR 0.145.
 */
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class Class_27509
implements Class_19214 {
    protected ZipFile Field_27510;
    protected File Field_27511;

    public String Method_27512() {
        return this.Field_27511.getName();
    }

    private void Method_27513() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_27514(String string) {
        try {
            ZipEntry zipEntry;
            String string2;
            if (this.Field_27510 == null) {
                this.Field_27510 = new ZipFile(this.Field_27511);
            }
            return ((zipEntry = this.Field_27510.getEntry(string2 = Class_35556.Method_35566(string, "/"))) != null ? 6993 & -16347 : -27502 & 576) != 0;
        }
        catch (IOException iOException) {
            return (2337 & 8200) != 0;
        }
    }

    public InputStream Method_27515(String string) {
        try {
            ZipEntry zipEntry;
            String string2;
            if (this.Field_27510 == null) {
                this.Field_27510 = new ZipFile(this.Field_27511);
            }
            return (zipEntry = this.Field_27510.getEntry(string2 = Class_35556.Method_35566(string, "/"))) == null ? null : this.Field_27510.getInputStream(zipEntry);
        }
        catch (Exception exception) {
            return null;
        }
    }

    public void Method_27516() {
        if (this.Field_27510 != null) {
            try {
                this.Field_27510.close();
            }
            catch (Exception exception) {
                // empty catch block
            }
            this.Field_27510 = null;
        }
    }

    public Class_27509(String string, File file) {
        this.Field_27511 = file;
        this.Field_27510 = null;
    }
}

