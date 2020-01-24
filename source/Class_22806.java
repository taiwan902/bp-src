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

public class Class_22806
implements Class_19219 {
    public Class_23823 Method_22807(Class_43010 class_43010) {
        Class_23823 class_23823;
        Object object;
        ArrayList arrayList = Lists.newArrayList();
        for (int i = 219 & 17920; i < class_43010.Method_43028(); ++i) {
            class_23823 = class_43010.Method_43032(i);
            if (class_23823 == null) continue;
            arrayList.add(class_23823);
            if (arrayList.size() <= (193 & -24299)) continue;
            object = (Class_23823)arrayList.get(8192 & 2091);
            if (class_23823.Method_23844() == ((Class_23823)object).Method_23844() && ((Class_23823)object).Field_23826 == (-30459 & 9355) && class_23823.Field_23826 == (17509 & 2073) && ((Class_23823)object).Method_23844().Method_1984()) continue;
            return null;
        }
        if (arrayList.size() == (35 & 1042)) {
            Class_23823 class_238232 = (Class_23823)arrayList.get(-15984 & 5);
            class_23823 = (Class_23823)arrayList.get(521 & 12501);
            if (class_238232.Method_23844() == class_23823.Method_23844() && class_238232.Field_23826 == (1061 & 14337) && class_23823.Field_23826 == (-32511 & 13315) && class_238232.Method_23844().Method_1984()) {
                object = class_238232.Method_23844();
                int n = ((Class_1956)object).Method_2010() - class_238232.Method_23853();
                int n2 = ((Class_1956)object).Method_2010() - class_23823.Method_23853();
                int n3 = n + n2 + ((Class_1956)object).Method_2010() * (10301 & -32635) / (6500 & 630);
                int n4 = ((Class_1956)object).Method_2010() - n3;
                if (n4 < 0) {
                    n4 = 8355 & -9216;
                }
                return new Class_23823(class_238232.Method_23844(), 2241 & -8191, n4);
            }
        }
        return null;
    }

    public Class_23823[] Method_22808(Class_43010 class_43010) {
        Class_23823[] arrclass_23823 = new Class_23823[class_43010.Method_43028()];
        for (int i = 8257 & -12278; i < arrclass_23823.length; ++i) {
            Class_23823 class_23823 = class_43010.Method_43032(i);
            if (class_23823 == null || !class_23823.Method_23844().Method_2024()) continue;
            arrclass_23823[i] = new Class_23823(class_23823.Method_23844().Method_1991());
        }
        return arrclass_23823;
    }

    public boolean Method_22809(Class_43010 class_43010, Class_283 class_283) {
        ArrayList arrayList = Lists.newArrayList();
        for (int i = 12328 & 3476; i < class_43010.Method_43028(); ++i) {
            Class_23823 class_23823 = class_43010.Method_43032(i);
            if (class_23823 == null) continue;
            arrayList.add(class_23823);
            if (arrayList.size() <= (3985 & 8261)) continue;
            Class_23823 class_238232 = (Class_23823)arrayList.get(9670 & -30199);
            if (class_23823.Method_23844() == class_238232.Method_23844() && class_238232.Field_23826 == (-18431 & 17939) && class_23823.Field_23826 == (-31949 & 20613) && class_238232.Method_23844().Method_1984()) continue;
            return (-11892 & 514) != 0;
        }
        return (arrayList.size() == (10275 & 5458) ? 18437 & -32543 : 5642 & 16528) != 0;
    }

    public Class_23823 Method_22810() {
        return null;
    }

    private void Method_22811() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public int Method_22812() {
        return 5317 & 17172;
    }
}

