/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.TimeUnit;

public final class Class_14453 {
    public static String[] Field_14454;
    public static float Field_14455;
    public static long Field_14456;
    public static boolean Field_14457;

    public static void Method_14458(Class_23125 class_23125, boolean bl, long l) {
        Field_14455 = class_23125.Method_23128() / class_23125.Method_23127();
        Field_14456 = Class_18.Method_207() + l;
        Field_14454 = class_23125.Method_23126().Method_1783().split("\n");
        Field_14457 = bl;
    }

    private void Method_14459() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public static void Method_14460(Class_23125 class_23125, boolean bl) {
        Class_14453.Method_14458(class_23125, bl, TimeUnit.SECONDS.toMillis(-5791976746792189425L & 5791976745821438106L));
    }
}

