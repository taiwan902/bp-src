/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.collect.Lists;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class_28135
implements Class_2047 {
    private static final Logger Field_28136 = LogManager.getLogger();
    protected final File Field_28137;

    public void Method_28138(String string, String string2) {
        File file;
        File file2 = new File(this.Field_28137, string);
        if (file2.exists() && (file = new File(file2, "level.dat")).exists()) {
            try {
                Class_1699 class_1699 = Class_24711.Method_24721(new FileInputStream(file));
                Class_1699 class_16992 = class_1699.Method_1703("Data");
                class_16992.Method_1702("LevelName", string2);
                Class_24711.Method_24714(class_1699, new FileOutputStream(file));
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    public Class_31717 Method_28139(String string) {
        File file = new File(this.Field_28137, string);
        if (!file.exists()) {
            return null;
        }
        File file2 = new File(file, "level.dat");
        if (file2.exists()) {
            try {
                Class_1699 class_1699 = Class_24711.Method_24721(new FileInputStream(file2));
                Class_1699 class_16992 = class_1699.Method_1703("Data");
                return new Class_31717(class_16992);
            }
            catch (Exception exception) {
                Field_28136.error("Exception reading " + file2, (Throwable)exception);
            }
        }
        if ((file2 = new File(file, "level.dat_old")).exists()) {
            try {
                Class_1699 class_1699 = Class_24711.Method_24721(new FileInputStream(file2));
                Class_1699 class_16993 = class_1699.Method_1703("Data");
                return new Class_31717(class_16993);
            }
            catch (Exception exception) {
                Field_28136.error("Exception reading " + file2, (Throwable)exception);
            }
        }
        return null;
    }

    protected static boolean Method_28140(File[] arrfile) {
        for (int i = 8192 & 2081; i < arrfile.length; ++i) {
            File file = arrfile[i];
            Field_28136.debug("Deleting " + file);
            if (file.isDirectory() && !Class_28135.Method_28140(file.listFiles())) {
                Field_28136.warn("Couldn't delete directory " + file);
                return (4673 & 8204) != 0;
            }
            if (file.delete()) continue;
            Field_28136.warn("Couldn't delete file " + file);
            return (2053 & 17600) != 0;
        }
        return (-32703 & 22789) != 0;
    }

    private void Method_28141() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_26655 Method_28142(String string, boolean bl) {
        return new Class_45196(this.Field_28137, string, bl);
    }

    public boolean Method_28143(String string) {
        return (12872 & 1059) != 0;
    }

    public void Method_28144() {
    }

    public boolean Method_28145(String string, Class_2748 class_2748) {
        return (549 & -15358) != 0;
    }

    public boolean Method_28146(String string) {
        File file = new File(this.Field_28137, string);
        if (!file.exists()) {
            return (17153 & 10249) != 0;
        }
        Field_28136.info("Deleting level " + string);
        for (int i = -28657 & 16513; i <= (423 & -28147); ++i) {
            Field_28136.info("Attempt " + i + "...");
            if (Class_28135.Method_28140(file.listFiles())) break;
            Field_28136.warn("Unsuccessful in deleting contents.");
            if (i >= (6229 & 16645)) continue;
            try {
                Thread.sleep(4982774L & 5192922658277396988L);
                continue;
            }
            catch (InterruptedException interruptedException) {
                // empty catch block
            }
        }
        return file.delete();
    }

    public boolean Method_28147(String string) {
        File file = new File(this.Field_28137, string);
        return file.isDirectory();
    }

    public Class_28135(File file) {
        if (!file.exists()) {
            file.mkdirs();
        }
        this.Field_28137 = file;
    }

    public List Method_28148() {
        ArrayList arrayList = Lists.newArrayList();
        for (int i = 64 & -30206; i < (-13163 & 4167); ++i) {
            String string = "World" + (i + (595 & 2049));
            Class_31717 class_31717 = this.Method_28139(string);
            if (class_31717 == null) continue;
            arrayList.add(new Class_40879(string, "", class_31717.Method_31782(), class_31717.Method_31767(), class_31717.Method_31777(), (3168 & 260) != 0, class_31717.Method_31839(), class_31717.Method_31774()));
        }
        return arrayList;
    }
}

