/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.apache.commons.lang3.StringUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.collect.Lists;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class_31083
extends Class_28135 {
    private static final Logger Field_31084 = LogManager.getLogger();

    protected int Method_31085() {
        return 19135 & 19197;
    }

    public Class_26655 Method_31086(String string, boolean bl) {
        return new Class_46960(this.\u0000strictfp, string, bl);
    }

    private void Method_31087(File file, Iterable iterable, Class_31916 class_31916, int n, int n2, Class_2748 class_2748) {
        for (File file2 : iterable) {
            this.Method_31094(file, file2, class_31916, n, n2, class_2748);
            int n3 = (int)Math.round(866.6666666666666 * 0.11538461538461539 * (double)(++n) / (double)n2);
            class_2748.Method_2750(n3);
        }
    }

    public Class_31083(File file) {
        super(file);
    }

    public boolean Method_31088(String string, Class_2748 class_2748) {
        class_2748.Method_2750(-15344 & 4108);
        ArrayList arrayList = Lists.newArrayList();
        ArrayList arrayList2 = Lists.newArrayList();
        ArrayList arrayList3 = Lists.newArrayList();
        File file = new File(this.\u0000strictfp, string);
        File file2 = new File(file, "DIM-1");
        File file3 = new File(file, "DIM1");
        Field_31084.info("Scanning folders...");
        this.Method_31095(file, arrayList);
        if (file2.exists()) {
            this.Method_31095(file2, arrayList2);
        }
        if (file3.exists()) {
            this.Method_31095(file3, arrayList3);
        }
        int n = arrayList.size() + arrayList2.size() + arrayList3.size();
        Field_31084.info("Total conversion count is " + n);
        Class_31717 class_31717 = this.\u0000strictfp(string);
        Class_31916 class_31916 = null;
        class_31916 = class_31717.Method_31833() == Class_43755.Field_43769 ? new Class_43191(Class_17281.Field_17318, 0.26027396f * 1.9210527f) : new Class_31916(class_31717.Method_31827(), class_31717.Method_31833(), class_31717.Method_31778());
        this.Method_31087(new File(file, "region"), arrayList, class_31916, 8929 & 1282, n, class_2748);
        this.Method_31087(new File(file2, "region"), arrayList2, new Class_43191(Class_17281.Field_17327, 0.0f), arrayList.size(), n, class_2748);
        this.Method_31087(new File(file3, "region"), arrayList3, new Class_43191(Class_17281.Field_17346, 0.0f), arrayList.size() + arrayList2.size(), n, class_2748);
        class_31717.Method_31760(-13633 & 19389);
        if (class_31717.Method_31833() == Class_43755.Field_43759) {
            class_31717.Method_31779(Class_43755.Field_43765);
        }
        this.Method_31090(string);
        Class_26655 class_26655 = this.Method_31086(string, (18512 & -28634) != 0);
        class_26655.Method_26664(class_31717);
        return (371 & -16891) != 0;
    }

    public boolean Method_31089(String string) {
        Class_31717 class_31717 = this.\u0000strictfp(string);
        return (class_31717 != null && class_31717.Method_31768() != this.Method_31085() ? 1539 & 73 : 22304 & 192) != 0;
    }

    private void Method_31090(String string) {
        File file = new File(this.\u0000strictfp, string);
        if (!file.exists()) {
            Field_31084.warn("Unable to create level.dat_mcr backup");
        } else {
            File file2 = new File(file, "level.dat");
            if (!file2.exists()) {
                Field_31084.warn("Unable to create level.dat_mcr backup");
            } else {
                File file3 = new File(file, "level.dat_mcr");
                if (!file2.renameTo(file3)) {
                    Field_31084.warn("Unable to create level.dat_mcr backup");
                }
            }
        }
    }

    public void Method_31091() {
        Class_27544.Method_27547();
    }

    private void Method_31092() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public List Method_31093() {
        if (this.\u0000strictfp != null && this.\u0000strictfp.exists() && this.\u0000strictfp.isDirectory()) {
            File[] arrfile;
            ArrayList arrayList = Lists.newArrayList();
            File[] arrfile2 = arrfile = this.\u0000strictfp.listFiles();
            int n = arrfile2.length;
            for (int i = 9379 & 328; i < n; ++i) {
                Class_31717 class_31717;
                String string;
                File file = arrfile2[i];
                if (!file.isDirectory() || (class_31717 = this.\u0000strictfp(string = file.getName())) == null || class_31717.Method_31768() != (19132 & 27325) && class_31717.Method_31768() != (19133 & 23295)) continue;
                int n2 = class_31717.Method_31768() != this.Method_31085() ? 16489 & -19439 : 116 & -1664;
                String string2 = class_31717.Method_31831();
                if (StringUtils.isEmpty((CharSequence)string2)) {
                    string2 = string;
                }
                long l = 1115373620L & -5160534193519720887L;
                arrayList.add(new Class_40879(string, string2, class_31717.Method_31782(), l, class_31717.Method_31777(), n2 != 0, class_31717.Method_31839(), class_31717.Method_31774()));
            }
            return arrayList;
        }
        throw new Class_15514("Unable to read or access folder where game worlds are saved!");
    }

    private void Method_31094(File file, File file2, Class_31916 class_31916, int n, int n2, Class_2748 class_2748) {
        try {
            String string = file2.getName();
            Class_9828 class_9828 = new Class_9828(file2);
            Class_9828 class_98282 = new Class_9828(new File(file, string.substring(8198 & 520, string.length() - ".mcr".length()) + ".mca"));
            for (int i = 12454 & -14080; i < (-32728 & 4133); ++i) {
                Object object;
                int n3;
                for (n3 = -2806 & 229; n3 < (8291 & 17452); ++n3) {
                    if (!class_9828.Method_9837(i, n3) || class_98282.Method_9837(i, n3)) continue;
                    object = class_9828.Method_9844(i, n3);
                    if (object == null) {
                        Field_31084.warn("Failed to fetch input stream");
                        continue;
                    }
                    Class_1699 class_1699 = Class_24711.Method_24722(object);
                    object.close();
                    Class_1699 class_16992 = class_1699.Method_1703("Level");
                    Class_17847 class_17847 = Class_15188.Method_15189(class_16992);
                    Class_1699 class_16993 = new Class_1699();
                    Class_1699 class_16994 = new Class_1699();
                    class_16993.Method_1744("Level", class_16994);
                    Class_15188.Method_15190(class_17847, class_16994, class_31916);
                    DataOutputStream dataOutputStream = class_98282.Method_9839(i, n3);
                    Class_24711.Method_24712(class_16993, dataOutputStream);
                    dataOutputStream.close();
                }
                n3 = (int)Math.round(167.9245283018868 * 0.5955056179775281 * (double)(n * (1796 & 7304)) / (double)(n2 * (15490 & 1092)));
                object = (int)Math.round(47.77777777777777 * 2.0930232558139537 * (double)((i + (-14591 & 2095)) * (9964 & -14288) + n * (1575 & 21904)) / (double)(n2 * (-5120 & 1333)));
                if (object <= n3) continue;
                class_2748.Method_2750((int)object);
            }
            class_9828.Method_9840();
            class_98282.Method_9840();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    private void Method_31095(File file, Collection collection) {
        File file2 = new File(file, "region");
        File[] arrfile = file2.listFiles(new Class_25720(this));
        if (arrfile != null) {
            Collections.addAll(collection, arrfile);
        }
    }
}

