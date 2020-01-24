/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.UUID;

public class Class_33870
implements Runnable {
    final Class_19025 Field_33871;

    private void Method_33872() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_33873() {
        Class_283 class_283;
        Class_1378 class_1378 = Class_18.Field_89.Field_48;
        if (class_1378 != null && (class_283 = class_1378.\u0000strictfp) != null) {
            Class_47033.Method_47059(new Class_24135(class_1378.\u0000, `(), class_1378.\u0000strictfp()));
            ArrayList arrayList = class_283.Field_325;
            for (Class_626 class_626 : arrayList) {
                if (class_626 == class_1378) continue;
                Class_47033.Method_47059(new Class_24135(class_626.\u0000, `(), class_626.\u0000strictfp()));
            }
        }
    }

    Class_33870(Class_19025 class_19025) {
        this.Field_33871 = class_19025;
    }
}

