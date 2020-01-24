/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_41295
extends Class_1956 {
    private final Class Field_41296;

    private void Method_41297() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_41298(Class_23823 class_23823, Class_626 class_626, Class_283 class_283, Class_4751 class_4751, Class_4595 class_4595, float f, float f2, float f3) {
        if (class_4595 == Class_4595.Field_4615) {
            return (18497 & -32708) != 0;
        }
        if (class_4595 == Class_4595.Field_4601) {
            return (272 & 2626) != 0;
        }
        Class_4751 class_47512 = class_4751.Method_4765(class_4595);
        if (!class_626.Method_794(class_47512, class_4595, class_23823)) {
            return (13317 & -16256) != 0;
        }
        Class_25768 class_25768 = this.Method_41299(class_283, class_47512, class_4595);
        if (class_25768 != null && class_25768.Method_25780()) {
            if (!class_283.Field_306) {
                class_283.Method_350(class_25768);
            }
            class_23823.Field_23826 -= 5713 & -5983;
        }
        return (1153 & 97) != 0;
    }

    public Class_41295(Class class_) {
        this.Field_41296 = class_;
        this.\u0000strictfp(Class_3987.Field_3995);
    }

    private Class_25768 Method_41299(Class_283 class_283, Class_4751 class_4751, Class_4595 class_4595) {
        return this.Field_41296 == Class_30799.class ? new Class_30799(class_283, class_4751, class_4595) : (this.Field_41296 == Class_36512.class ? new Class_36512(class_283, class_4751, class_4595) : null);
    }
}

