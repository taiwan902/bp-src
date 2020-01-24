/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_40254
extends Class_35973 {
    private Class_31211 Field_40255;

    public void Method_40256(Class_1061 class_1061, float f, float f2, float f3, float f4, float f5, float f6) {
        if (this.Field_40255 == null) {
            return;
        }
        Class_18.Field_89.Method_253().Method_34707(Class_24069.Field_24084);
        Class_16867.Method_16961();
        if (class_1061.Method_1276()) {
            Class_16867.Method_16943(0.0f, 0.024691358f * 11.1375f, 0.0f);
        }
        Class_16867.Method_16940(2.36f * 76.27119f, 0.0f, 1.0f, 0.0f);
        Class_16867.Method_16940(320.0f * 0.5625f, 1.0f, 0.0f, 0.0f);
        Class_7644 class_7644 = Class_7644.Method_7649();
        Class_22385 class_22385 = class_7644.Method_7648();
        class_22385.Method_22417(855 & 20487, Class_29585.Field_29593);
        for (Class_14461 class_14461 : this.Field_40255.Method_31214()) {
            class_22385.Method_22414(class_14461.Method_14478());
        }
        Class_4595[] arrclass_4595 = Class_4595.Field_4600;
        int n = arrclass_4595.length;
        for (int i = -16352 & 8448; i < n; ++i) {
            Class_4595 class_4595 = arrclass_4595[i];
            List list = this.Field_40255.Method_31218(class_4595);
            if (list == null) continue;
            for (Class_14461 class_14461 : list) {
                class_22385.Method_22414(class_14461.Method_14478());
            }
        }
        class_7644.Method_7647();
        Class_16867.Method_16945();
    }

    private void Method_40257() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

