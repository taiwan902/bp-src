/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_42801
extends Class_37934 {
    public void Method_42802(Class_1956 class_1956, Class_3987 class_3987, List list) {
        list.add(new Class_23823(class_1956, 16417 & -29691, 4400 & -32630));
        list.add(new Class_23823(class_1956, 4483 & -8131, 16425 & -26351));
    }

    public boolean Method_42803(Class_23823 class_23823) {
        return (class_23823.Method_23843() > 0 ? 24595 & -28287 : -24572 & 16456) != 0;
    }

    protected void Method_42804(Class_23823 class_23823, Class_283 class_283, Class_626 class_626) {
        if (!class_283.Field_306) {
            class_626.\u0000, `(new Class_25240(Class_8338.Field_8343.Field_8364, 3557 & -13462, 17632 & 10262));
        }
        if (class_23823.Method_23843() > 0) {
            if (!class_283.Field_306) {
                class_626.\u0000, `(new Class_25240(Class_8338.Field_8348.Field_8364, -31877 & 19032, 19220 & 4302));
                class_626.\u0000, `(new Class_25240(Class_8338.Field_8358.Field_8364, 6005 & -10256, -13091 & 8450));
                class_626.\u0000, `(new Class_25240(Class_8338.Field_8366.Field_8364, 24560 & -18572, 9217 & 138));
            }
        } else {
            super.Method_37954(class_23823, class_283, class_626);
        }
    }

    public Class_41140 Method_42805(Class_23823 class_23823) {
        return class_23823.Method_23843() == 0 ? Class_41140.Field_41141 : Class_41140.Field_41142;
    }

    public Class_42801(int n, float f, boolean bl) {
        super(n, f, bl);
        this.\u0000strictfp((-16277 & 1553) != 0);
    }

    private void Method_42806() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

