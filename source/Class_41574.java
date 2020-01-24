/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.authlib.GameProfile
 */
import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Collection;
import java.util.List;
import java.util.Random;

public class Class_41574
implements Class_14683 {
    final Class_46175 Field_41575;
    private final Class_22057 Field_41576;
    private final List Field_41577;
    private final Class_2080 Field_41578;

    public Class_41574(Class_46175 class_46175, Class_22057 class_22057) {
        this.Field_41575 = class_46175;
        this.Field_41576 = class_22057;
        this.Field_41577 = Lists.newArrayList();
        for (String string : class_22057.Method_22087()) {
            Class_9738 class_9738 = Class_18.Field_89.Method_271().Method_20268(string);
            if (class_9738 == null) continue;
            this.Field_41577.add(class_9738);
        }
        if (!this.Field_41577.isEmpty()) {
            String string = ((Class_9738)this.Field_41577.get(new Random().nextInt(this.Field_41577.size()))).Method_9758().getName();
            this.Field_41578 = Class_1456.Method_1465(string);
            Class_1456.Method_1469(this.Field_41578, string);
        } else {
            this.Field_41578 = Class_13490.Method_13493();
        }
    }

    public void Method_41579(float f, int n) {
        int n2 = -1 & -1;
        String string = Class_28636.Method_28693(this.Field_41576.Method_22083());
        if (string.length() >= (3202 & 4114)) {
            n2 = Class_18.Field_89.Field_27.Method_28695(string.charAt(-16383 & 8883));
        }
        if (n2 >= 0) {
            float f2 = (float)(n2 >> (-32464 & 18463) & (-17665 & 255)) / (0.6818182f * 374.0f);
            float f3 = (float)(n2 >> (2061 & 20728) & (-2305 & 511)) / (0.21428572f * 1190.0f);
            float f4 = (float)(n2 & (767 & 511)) / (1.7777778f * 143.4375f);
            Class_1551.Method_1558(-28415 & 17041, 1 & 489, 18447 & 14063, 2079 & 5903, Class_13337.Method_13363(f2 * f, f3 * f, f4 * f) | n << (1084 & 21016));
        }
        Class_18.Field_89.Method_253().Method_34707(this.Field_41578);
        Class_16867.Method_16924(f, f, f, (float)n / (1.0196079f * 250.09615f));
        Class_1551.Method_1560(3075 & 21190, -30462 & 29718, 1.6f * 5.0f, 15.351352f * 0.52112675f, 2184 & 12296, 6958 & 1033, 76 & 16909, -28660 & 17901, 4.266667f * 15.0f, 3.0f * 21.333334f);
        Class_1551.Method_1560(10498 & -32253, 30758 & 130, 1.5609756f * 25.625002f, 1.7843137f * 4.4835167f, 9752 & 16616, -30967 & 8220, 16398 & -30420, 62 & 24908, 39.91398f * 1.6034483f, 0.2777778f * 230.4f);
    }

    private void Method_41580() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_1782 Method_41581() {
        return new Class_2840(this.Field_41576.Method_22080());
    }

    public boolean Method_41582() {
        return (!this.Field_41577.isEmpty() ? 25 & -1597 : -31738 & 320) != 0;
    }

    public void Method_41583(Class_10233 class_10233) {
        class_10233.Method_10246(new Class_47441(this.Field_41577));
    }
}

