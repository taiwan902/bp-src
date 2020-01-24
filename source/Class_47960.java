/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public final class Class_47960
extends Class_5038 {
    private final Class_5038 Field_47961 = new Class_5038();

    private void Method_47962() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_47960() {
    }

    public Class_23823 Method_47963(Class_5001 class_5001, Class_23823 class_23823) {
        Class_4751 class_4751;
        Class_1956 class_1956;
        Class_283 class_283 = class_5001.\u0000strictfp();
        Class_3436 class_3436 = class_283.Method_375(class_4751 = class_5001.Method_5003().Method_4765(Class_4850.Method_4869(class_5001.Method_5007())));
        Class_3238 class_3238 = class_3436.Method_3442();
        Class_3713 class_3713 = class_3238.Method_3373();
        if (Class_3713.Field_3734.equals(class_3713) && class_3238 instanceof Class_4415 && (Integer)class_3436.Method_3440(Class_4415.Field_4417) == 0) {
            class_1956 = Class_10527.Field_10695;
        } else {
            if (!Class_3713.Field_3750.equals(class_3713) || !(class_3238 instanceof Class_4415) || (Integer)class_3436.Method_3440(Class_4415.Field_4417) != 0) {
                return super.Method_5040(class_5001, class_23823);
            }
            class_1956 = Class_10527.Field_10572;
        }
        class_283.Method_472(class_4751);
        if ((class_23823.Field_23826 -= -15871 & 3209) == 0) {
            class_23823.Method_23882(class_1956);
            class_23823.Field_23826 = -32383 & 8201;
        } else if (((Class_4933)class_5001.Method_5006()).Method_4960(new Class_23823(class_1956)) < 0) {
            this.Field_47961.Method_5045(class_5001, new Class_23823(class_1956));
        }
        return class_23823;
    }
}

