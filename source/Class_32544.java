/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_32544 {
    private static Class_31211 Field_32545 = null;

    private static boolean Method_32546(Class_3238 class_3238, Class_3436 class_3436) {
        if (class_3238.Method_3401()) {
            return (11564 & 81) != 0;
        }
        if (class_3238.Method_3375()) {
            return (8448 & 17056) != 0;
        }
        if (class_3238 instanceof Class_16211) {
            return (8 & 7383) != 0;
        }
        if (!(class_3238 instanceof Class_3598 && (class_3238 instanceof Class_3563 || class_3238 instanceof Class_5596 || class_3238 instanceof Class_5683 || class_3238 instanceof Class_4266 || class_3238 instanceof Class_5320))) {
            if (!(class_3238 instanceof Class_27820 || class_3238 instanceof Class_20919 || class_3238 instanceof Class_8151 || class_3238 instanceof Class_13196 || class_3238 instanceof Class_17448 || class_3238 instanceof Class_33671)) {
                Comparable comparable;
                if (class_3238 instanceof Class_36871 && class_3436.Method_3440(Class_5834.Field_5835) == Class_4595.Field_4601) {
                    return (-30715 & 8481) != 0;
                }
                if (class_3238 instanceof Class_28980 && ((comparable = class_3436.Method_3440(Class_28980.Field_28981)) == Class_35930.Field_35938 || comparable == Class_35930.Field_35939)) {
                    return (-20477 & 333) != 0;
                }
                return (-22016 & 16458) != 0;
            }
            return (-7161 & 265) != 0;
        }
        return (6149 & -14919) != 0;
    }

    public static Class_3436 Method_32547() {
        return Class_9265.Field_9458.Method_3293();
    }

    public static void Method_32548() {
        Field_32545 = Class_19426.Method_19519().Method_214().Method_36716().Method_36444(Class_9265.Field_9458.Method_3293());
    }

    private static boolean Method_32549(Class_561 class_561, Class_4751 class_4751) {
        Class_3238 class_3238 = Class_9265.Field_9458;
        return (class_561.Method_568(class_4751.Method_4778()).Method_3442() != class_3238 && class_561.Method_568(class_4751.Method_4784()).Method_3442() != class_3238 && class_561.Method_568(class_4751.Method_4771()).Method_3442() != class_3238 && class_561.Method_568(class_4751.Method_4770()).Method_3442() != class_3238 ? 10336 & 6 : class_561.Method_568(class_4751.Method_4782()).Method_3442().Method_3375()) != 0;
    }

    public static Class_31211 Method_32550() {
        return Field_32545;
    }

    public static boolean Method_32551(Class_561 class_561, Class_3238 class_3238, Class_3436 class_3436, Class_4751 class_4751) {
        return (!Class_32544.Method_32546(class_3238, class_3436) ? -20216 & 20117 : (int)(Class_32544.Method_32549(class_561, class_4751) ? 1 : 0)) != 0;
    }

    private void Method_32552() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

