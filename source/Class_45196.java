/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.UUID;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class_45196
implements Class_42284,
Class_26655 {
    private static final Logger Field_45197 = LogManager.getLogger();
    private final File Field_45198;
    private final long Field_45199 = Class_2457.Method_2513();
    private final File Field_45200;
    private final String Field_45201;
    private final File Field_45202;

    public Class_45196(File file, String string, boolean bl) {
        this.Field_45202 = new File(file, string);
        this.Field_45202.mkdirs();
        this.Field_45200 = new File(this.Field_45202, "playerdata");
        this.Field_45198 = new File(this.Field_45202, "data");
        this.Field_45198.mkdirs();
        this.Field_45201 = string;
        if (bl) {
            this.Field_45200.mkdirs();
        }
        this.Method_45204();
    }

    public void Method_45203(Class_626 class_626) {
        try {
            Class_1699 class_1699 = new Class_1699();
            class_626.\u0000
            (class_1699);
            File file = new File(this.Field_45200, class_626.\u0000strictfp().toString() + ".dat.tmp");
            File file2 = new File(this.Field_45200, class_626.\u0000strictfp().toString() + ".dat");
            Class_24711.Method_24714(class_1699, new FileOutputStream(file));
            if (file2.exists()) {
                file2.delete();
            }
            file.renameTo(file2);
        }
        catch (Exception exception) {
            Field_45197.warn("Failed to save player data for " + class_626.Method_825());
        }
    }

    private void Method_45204() {
        try {
            File file = new File(this.Field_45202, "session.lock");
            try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));){
                dataOutputStream.writeLong(this.Field_45199);
            }
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            throw new RuntimeException("Failed to check session lock, aborting");
        }
    }

    public void Method_45205(Class_31717 class_31717) {
        Class_1699 class_1699 = class_31717.Method_31755();
        Class_1699 class_16992 = new Class_1699();
        class_16992.Method_1744("Data", class_1699);
        try {
            File file = new File(this.Field_45202, "level.dat_new");
            File file2 = new File(this.Field_45202, "level.dat_old");
            File file3 = new File(this.Field_45202, "level.dat");
            Class_24711.Method_24714(class_16992, new FileOutputStream(file));
            if (file2.exists()) {
                file2.delete();
            }
            file3.renameTo(file2);
            if (file3.exists()) {
                file3.delete();
            }
            file.renameTo(file3);
            if (file.exists()) {
                file.delete();
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public Class_15769 Method_45206(Class_18343 class_18343) {
        throw new RuntimeException("Old Chunk Storage is no longer supported.");
    }

    public void Method_45207() {
        try {
            File file = new File(this.Field_45202, "session.lock");
            try (DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));){
                if (dataInputStream.readLong() != this.Field_45199) {
                    throw new Class_2746("The save is being accessed from another location, aborting");
                }
            }
        }
        catch (IOException iOException) {
            throw new Class_2746("Failed to check session lock, aborting");
        }
    }

    public void Method_45208() {
    }

    public void Method_45209(Class_31717 class_31717, Class_1699 class_1699) {
        Class_1699 class_16992 = class_31717.Method_31781(class_1699);
        Class_1699 class_16993 = new Class_1699();
        class_16993.Method_1744("Data", class_16992);
        try {
            File file = new File(this.Field_45202, "level.dat_new");
            File file2 = new File(this.Field_45202, "level.dat_old");
            File file3 = new File(this.Field_45202, "level.dat");
            Class_24711.Method_24714(class_16993, new FileOutputStream(file));
            if (file2.exists()) {
                file2.delete();
            }
            file3.renameTo(file2);
            if (file3.exists()) {
                file3.delete();
            }
            file.renameTo(file3);
            if (file.exists()) {
                file.delete();
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public Class_1699 Method_45210(Class_626 class_626) {
        Class_1699 class_1699 = null;
        try {
            File file = new File(this.Field_45200, class_626.\u0000strictfp().toString() + ".dat");
            if (file.exists() && file.isFile()) {
                class_1699 = Class_24711.Method_24721(new FileInputStream(file));
            }
        }
        catch (Exception exception) {
            Field_45197.warn("Failed to load player data for " + class_626.Method_825());
        }
        if (class_1699 != null) {
            class_626.\u0000%(class_1699);
        }
        return class_1699;
    }

    public Class_31717 Method_45211() {
        File file = new File(this.Field_45202, "level.dat");
        if (file.exists()) {
            try {
                Class_1699 class_1699 = Class_24711.Method_24721(new FileInputStream(file));
                Class_1699 class_16992 = class_1699.Method_1703("Data");
                return new Class_31717(class_16992);
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        if ((file = new File(this.Field_45202, "level.dat_old")).exists()) {
            try {
                Class_1699 class_1699 = Class_24711.Method_24721(new FileInputStream(file));
                Class_1699 class_16993 = class_1699.Method_1703("Data");
                return new Class_31717(class_16993);
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        return null;
    }

    public String Method_45212() {
        return this.Field_45201;
    }

    public Class_42284 Method_45213() {
        return this;
    }

    public String[] Method_45214() {
        String[] arrstring = this.Field_45200.list();
        if (arrstring == null) {
            arrstring = new String[4171 & 8448];
        }
        for (int i = 28882 & 1793; i < arrstring.length; ++i) {
            if (!arrstring[i].endsWith(".dat")) continue;
            arrstring[i] = arrstring[i].substring(5168 & 10631, arrstring[i].length() - (4196 & -8059));
        }
        return arrstring;
    }

    public File Method_45215(String string) {
        return new File(this.Field_45198, string + ".dat");
    }

    private void Method_45216() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public File Method_45217() {
        return this.Field_45202;
    }
}

