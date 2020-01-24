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
import java.util.Collection;
import java.util.List;

public class Class_26380
extends Class_1956 {
    public void Method_26381(Class_23823 class_23823, Class_626 class_626, List list, boolean bl) {
        Class_1699 class_1699;
        if (class_23823.Method_23842() && (class_1699 = class_23823.Method_23845().Method_1703("Fireworks")) != null) {
            Class_1758 class_1758;
            if (class_1699.Method_1715("Flight", -31365 & 4323)) {
                list.add(Class_7594.Method_7602("item.fireworks.flight") + " " + class_1699.Method_1716("Flight"));
            }
            if ((class_1758 = class_1699.Method_1735("Explosions", 4106 & 1322)) != null && class_1758.Method_1772() > 0) {
                for (int i = 8256 & 128; i < class_1758.Method_1772(); ++i) {
                    Class_1699 class_16992 = class_1758.Method_1768(i);
                    ArrayList arrayList = Lists.newArrayList();
                    Class_26392.Method_26397(class_16992, arrayList);
                    if (arrayList.size() <= 0) continue;
                    for (int j = 2051 & 1405; j < arrayList.size(); ++j) {
                        arrayList.set(j, "  " + (String)arrayList.get(j));
                    }
                    list.addAll(arrayList);
                }
            }
        }
    }

    private void Method_26382() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_26383(Class_23823 class_23823, Class_626 class_626, Class_283 class_283, Class_4751 class_4751, Class_4595 class_4595, float f, float f2, float f3) {
        if (!class_283.Field_306) {
            Class_41709 class_41709 = new Class_41709(class_283, (float)class_4751.\u0000= final() + f, (float)class_4751.\u0000, `() + f2, (float)class_4751.\u0000strictfp() + f3, class_23823);
            class_283.Method_350(class_41709);
            if (!class_626.Field_694.Method_18094()) {
                class_23823.Field_23826 -= 21763 & 129;
            }
            return (331 & -21983) != 0;
        }
        return (-32768 & 7442) != 0;
    }
}

