/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Collection;
import java.util.List;

public class Class_46175
implements Class_14683,
Class_40184 {
    private final List Field_46176 = Lists.newArrayList();

    public Class_1782 Method_46177() {
        return new Class_2840("Teleport to team member");
    }

    public boolean Method_46178() {
        for (Class_14683 class_14683 : this.Field_46176) {
            if (!class_14683.Method_14684()) continue;
            return (769 & -24417) != 0;
        }
        return (260 & -27574) != 0;
    }

    public void Method_46179(float f, int n) {
        Class_18.Field_89.Method_253().Method_34707(Class_37026.Field_37030);
        Class_1551.Method_1566(-15852 & 0, -16188 & 9985, 1.0333333f * 15.483871f, 0.0f, 1104 & 4244, 20754 & 528, 0.1392405f * 1838.5455f, 8.666667f * 29.53846f);
    }

    public Class_46175() {
        Class_18 class_18 = Class_18.Field_89;
        for (Class_22057 class_22057 : class_18.Field_72.\u0000strictfp().Method_20994()) {
            this.Field_46176.add(new Class_41574(this, class_22057));
        }
    }

    public List Method_46180() {
        return this.Field_46176;
    }

    private void Method_46181() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_1782 Method_46182() {
        return new Class_2840("Select a team to teleport to");
    }

    public void Method_46183(Class_10233 class_10233) {
        class_10233.Method_10246(this);
    }
}

