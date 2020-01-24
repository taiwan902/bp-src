/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Collection;
import java.util.List;

public class Class_15152
implements Class_12166 {
    private final Class_283 Field_15153;
    private static final int Field_15154;
    private static final List Field_15155;
    private static final int Field_15156;

    public Class_17665 Method_15157(Class_4751 class_4751) {
        return this.Method_15172(class_4751.\u0000= final() >> (4484 & 17428), class_4751.\u0000strictfp() >> (687 & -31740));
    }

    public boolean Method_15158(Class_12166 class_12166, Class_17665 class_17665, int n, int n2) {
        return (1040 & 20992) != 0;
    }

    public boolean Method_15159() {
        return (-14335 & 147) != 0;
    }

    public Class_15152(Class_283 class_283) {
        this.Field_15153 = class_283;
    }

    public String Method_15160() {
        return "DebugLevelSource";
    }

    public static Class_3436 Method_15161(int n, int n2) {
        int n3;
        Class_3436 class_3436 = null;
        if (n > 0 && n2 > 0 && n % (6722 & 8590) != 0 && n2 % (1066 & -14333) != 0 && (n /= 2183 & -24318) <= Field_15156 && (n2 /= 28754 & 3374) <= Field_15154 && (n3 = Class_13337.Method_13382(n * Field_15156 + n2)) < Field_15155.size()) {
            class_3436 = (Class_3436)Field_15155.get(n3);
        }
        return class_3436;
    }

    public void Method_15162(Class_12166 class_12166, int n, int n2) {
    }

    public void Method_15163(Class_17665 class_17665, int n, int n2) {
    }

    public void Method_15164() {
    }

    static {
        Field_15155 = Lists.newArrayList();
        for (Class_3238 class_3238 : Class_3238.Field_3271) {
            Field_15155.addAll(class_3238.Method_3360().Method_3865());
        }
        Field_15156 = Class_13337.Method_13362(Class_13337.Method_13388(Field_15155.size()));
        Field_15154 = Class_13337.Method_13362((float)Field_15155.size() / (float)Field_15156);
    }

    public Class_4751 Method_15165(Class_283 class_283, String string, Class_4751 class_4751) {
        return null;
    }

    private void Method_15166() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_15167() {
        return (4184 & 2050) != 0;
    }

    public int Method_15168() {
        return -29967 & 12288;
    }

    public boolean Method_15169(int n, int n2) {
        return (1285 & 4707) != 0;
    }

    public boolean Method_15170(boolean bl, Class_2748 class_2748) {
        return (-32549 & 19969) != 0;
    }

    public List Method_15171(Class_13693 class_13693, Class_4751 class_4751) {
        Class_17281 class_17281 = this.Field_15153.Method_547(class_4751);
        return class_17281.Method_17371(class_13693);
    }

    public Class_17665 Method_15172(int n, int n2) {
        int n3;
        Class_36425 class_36425 = new Class_36425();
        for (int i = 8426 & 23568; i < (5908 & 24659); ++i) {
            for (int j = 137 & 4148; j < (1333 & 4696); ++j) {
                int n4 = n * (-32236 & 12304) + i;
                n3 = n2 * (-31696 & 8476) + j;
                class_36425.Method_36430(i, -32708 & 7740, j, Class_9265.Field_9412.Method_3293());
                Class_3436 class_3436 = Class_15152.Method_15161(n4, n3);
                if (class_3436 == null) continue;
                class_36425.Method_36430(i, 4167 & -16178, j, class_3436);
            }
        }
        Class_17665 class_17665 = new Class_17665(this.Field_15153, class_36425, n, n2);
        class_17665.Method_17734();
        Class_17281[] arrclass_17281 = this.Field_15153.Method_371().Method_31930(null, n * (690 & 1113), n2 * (8944 & 1050), 17426 & -23792, -14640 & 2096);
        byte[] arrby = class_17665.Method_17743();
        for (n3 = -27772 & 1032; n3 < arrby.length; ++n3) {
            arrby[n3] = (byte)arrclass_17281[n3].Field_17343;
        }
        class_17665.Method_17734();
        return class_17665;
    }
}

