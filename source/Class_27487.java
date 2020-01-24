/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_27487 {
    Class_34093 Field_27488;
    List Field_27489 = Lists.newArrayList();
    List Field_27490 = Lists.newArrayList();

    public boolean Method_27491(Class_1061 class_1061) {
        if (this.Field_27490.contains(class_1061)) {
            return (4367 & 26753) != 0;
        }
        if (this.Field_27489.contains(class_1061)) {
            return (2226 & 773) != 0;
        }
        this.Field_27488.\u0000strictfp.Field_310.Method_2789("canSee");
        boolean bl = this.Field_27488.\u0000= final(class_1061);
        this.Field_27488.\u0000strictfp.Field_310.Method_2790();
        if (bl) {
            this.Field_27490.add(class_1061);
        } else {
            this.Field_27489.add(class_1061);
        }
        return bl;
    }

    public void Method_27492() {
        this.Field_27490.clear();
        this.Field_27489.clear();
    }

    public Class_27487(Class_34093 class_34093) {
        this.Field_27488 = class_34093;
    }

    private void Method_27493() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

