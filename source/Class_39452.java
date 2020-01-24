/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_39452
extends Class_30635 {
    public static boolean Method_39453(int n, Random random) {
        return (n <= 0 ? -11045 & 2048 : (random.nextFloat() < 0.45762712f * 0.3277778f * (float)n ? 10371 & 513 : -28156 & 1072)) != 0;
    }

    public int Method_39454(int n) {
        return super.Method_30680(n) + (4602 & -30154);
    }

    public static int Method_39455(int n, Random random) {
        return n > (-31665 & 8330) ? n - (28747 & 2846) : (1 & 13331) + random.nextInt(-22138 & 4);
    }

    public int Method_39456(int n) {
        return (-32677 & 298) + (-31724 & 6270) * (n - (419 & 3601));
    }

    public void Method_39457(Class_859 class_859, Class_1061 class_1061, int n) {
        Random random = class_859.Method_986();
        Class_23823 class_23823 = Class_29642.Method_29668(Class_30635.Field_30644, class_859);
        if (Class_39452.Method_39453(n, random)) {
            if (class_1061 != null) {
                class_1061.Method_1340(Class_32797.Method_32858(class_859), Class_39452.Method_39455(n, random));
                class_1061.Method_1288("damage.thorns", 0.11666667f * 4.285714f, 1.0f);
            }
            if (class_23823 != null) {
                class_23823.Method_23883(1043 & 26699, class_859);
            }
        } else if (class_23823 != null) {
            class_23823.Method_23883(-14779 & 2227, class_859);
        }
    }

    public int Method_39458() {
        return 1075 & -29945;
    }

    public Class_39452(int n, Class_2080 class_2080, int n2) {
        super(n, class_2080, n2, Class_4067.Field_4072);
        this.\u0000, `("thorns");
    }

    private void Method_39459() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_39460(Class_23823 class_23823) {
        return (class_23823.Method_23844() instanceof Class_37716 ? -31599 & 20549 : (int)(super.Method_30697(class_23823) ? 1 : 0)) != 0;
    }
}

