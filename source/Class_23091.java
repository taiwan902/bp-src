/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;

public class Class_23091
implements Class_19219 {
    private final List Field_23092;
    private final Class_23823 Field_23093;

    public Class_23823 Method_23094(Class_43010 class_43010) {
        return this.Field_23093.Method_23850();
    }

    private void Method_23095() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_23096(Class_43010 class_43010, Class_283 class_283) {
        ArrayList arrayList = Lists.newArrayList((Iterable)this.Field_23092);
        for (int i = 16970 & 5504; i < class_43010.Method_43027(); ++i) {
            for (int j = 2112 & 9768; j < class_43010.Method_43033(); ++j) {
                Class_23823 class_23823 = class_43010.Method_43034(j, i);
                if (class_23823 == null) continue;
                int n = 8256 & 21138;
                for (Class_23823 class_238232 : arrayList) {
                    if (class_23823.Method_23844() != class_238232.Method_23844() || class_238232.Method_23843() != (-1 & 32767) && class_23823.Method_23843() != class_238232.Method_23843()) continue;
                    n = -32653 & 4233;
                    arrayList.remove(class_238232);
                    break;
                }
                if (n != 0) continue;
                return (3161 & 4608) != 0;
            }
        }
        return arrayList.isEmpty();
    }

    public Class_23823[] Method_23097(Class_43010 class_43010) {
        Class_23823[] arrclass_23823 = new Class_23823[class_43010.Method_43028()];
        for (int i = 18628 & 272; i < arrclass_23823.length; ++i) {
            Class_23823 class_23823 = class_43010.Method_43032(i);
            if (class_23823 == null || !class_23823.Method_23844().Method_2024()) continue;
            arrclass_23823[i] = new Class_23823(class_23823.Method_23844().Method_1991());
        }
        return arrclass_23823;
    }

    public Class_23823 Method_23098() {
        return this.Field_23093;
    }

    public int Method_23099() {
        return this.Field_23092.size();
    }

    public Class_23091(Class_23823 class_23823, List list) {
        this.Field_23093 = class_23823;
        this.Field_23092 = list;
    }
}

