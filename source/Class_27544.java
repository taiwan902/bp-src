/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Maps;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Collection;
import java.util.Map;

public class Class_27544 {
    private static final Map Field_27545 = Maps.newHashMap();

    public static synchronized Class_9828 Method_27546(File file, int n, int n2) {
        File file2 = new File(file, "region");
        File file3 = new File(file2, "r." + (n >> (16455 & 4485)) + "." + (n2 >> (17013 & -22267)) + ".mca");
        Class_9828 class_9828 = (Class_9828)Field_27545.get(file3);
        if (class_9828 != null) {
            return class_9828;
        }
        if (!file2.exists()) {
            file2.mkdirs();
        }
        if (Field_27545.size() >= (17904 & 13056)) {
            Class_27544.Method_27547();
        }
        Class_9828 class_98282 = new Class_9828(file3);
        Field_27545.put(file3, class_98282);
        return class_98282;
    }

    public static synchronized void Method_27547() {
        for (Class_9828 class_9828 : Field_27545.values()) {
            try {
                if (class_9828 == null) continue;
                class_9828.Method_9840();
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }
        Field_27545.clear();
    }

    private void Method_27548() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public static DataInputStream Method_27549(File file, int n, int n2) {
        Class_9828 class_9828 = Class_27544.Method_27546(file, n, n2);
        return class_9828.Method_9844(n & (8479 & 127), n2 & (4127 & 17599));
    }

    public static DataOutputStream Method_27550(File file, int n, int n2) {
        Class_9828 class_9828 = Class_27544.Method_27546(file, n, n2);
        return class_9828.Method_9839(n & (1055 & -24385), n2 & (415 & 95));
    }
}

