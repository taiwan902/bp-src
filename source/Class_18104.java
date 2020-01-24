/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_18104 {
    private static final Class_24776 Field_18105;
    private static final Class_24776 Field_18106;
    static Class_4452 Field_18107;
    static Class_4452 Field_18108;
    private static final Class_24776 Field_18109;

    public static int Method_18110(Class_561 class_561, Class_4751 class_4751) {
        return Class_18104.Method_18113(class_561, class_4751, Field_18109);
    }

    public static int Method_18111(Class_561 class_561, Class_4751 class_4751) {
        return Class_18104.Method_18113(class_561, class_4751, Field_18106);
    }

    static {
        Field_18109 = new Class_45757();
        Field_18105 = new Class_35624();
        Field_18106 = new Class_25913();
        Field_18107 = new Class_4452();
        Field_18108 = new Class_4452();
    }

    private void Method_18112() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private static int Method_18113(Class_561 class_561, Class_4751 class_4751, Class_24776 class_24776) {
        int n = 10254 & 1296;
        int n2 = 576 & -32352;
        int n3 = 8192 & 6539;
        Class_4810 class_4810 = (Class_4810)Field_18107.get();
        Class_4810 class_48102 = (Class_4810)Field_18108.get();
        class_4751.Method_4775(-1 & -1, 266 & 10240, -1 & -1, class_4810);
        class_4751.Method_4775(1319 & -32231, 8192 & -30257, -32241 & 4225, class_48102);
        for (Class_4810 class_48103 : Class_4751.Method_4789(class_4810, class_48102)) {
            int n4 = class_24776.Method_24777(class_561.Method_567(class_48103), class_48103);
            n += (n4 & (83854784 & -1560344531)) >> (9148 & 21523);
            n2 += (n4 & (-1851719932 & 1107361730)) >> (-6646 & 296);
            n3 += n4 & (8447 & 4351);
        }
        return (n / (12329 & -30199) & (15615 & 16639)) << (-14256 & 5652) | (n2 / (2349 & 17993) & (255 & 17151)) << (3724 & 8267) | n3 / (-30675 & 8265) & (16639 & 11007);
    }

    public static int Method_18114(Class_561 class_561, Class_4751 class_4751) {
        return Class_18104.Method_18113(class_561, class_4751, Field_18105);
    }
}

