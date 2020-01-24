/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Random;

public class Class_40205
extends Class_37650 {
    public void Method_40206(Class_13400 class_13400, List list, Random random) {
        this.\u0000, `((Class_41963)class_13400, list, random, 17413 & 4673, -32752 & 12812, (11073 & 4103) != 0);
    }

    public boolean Method_40207(Class_283 class_283, Random random, Class_42666 class_42666) {
        int n = this.\u0000strictfp(Class_9265.Field_9438, 17411 & -24190);
        for (int i = 17472 & 388; i <= (4153 & 13); ++i) {
            int n2 = Math.max(17521 & 2945, (-16073 & 12303) - i);
            int n3 = Math.min(Math.max(n2 + (20957 & 1061), (14 & 3102) - i), -29601 & 24717);
            int n4 = i;
            this.\u0000strictfp(class_283, class_42666, -19392 & 16395, 17928 & 4224, i, 772 & 8293, n2, i, (Class_3436)Class_9265.Field_9450.Method_3293(), (Class_3436)Class_9265.Field_9450.Method_3293(), (17168 & 3182) != 0);
            this.\u0000strictfp(class_283, class_42666, 1537 & -32303, n2 + (25677 & 5027), i, 4099 & 3095, n3 - (19209 & 33), i, (Class_3436)Class_9265.Field_9351.Method_3293(), (Class_3436)Class_9265.Field_9351.Method_3293(), (-32632 & 25938) != 0);
            if (i <= (24582 & 4614)) {
                this.\u0000, `(class_283, Class_9265.Field_9438.Method_3342(n), 16689 & 14339, n2 + (-22653 & 117), i, class_42666);
                this.\u0000, `(class_283, Class_9265.Field_9438.Method_3342(n), 8270 & -31869, n2 + (16969 & -30703), i, class_42666);
                this.\u0000, `(class_283, Class_9265.Field_9438.Method_3342(n), 8711 & -30413, n2 + (12293 & -32765), i, class_42666);
            }
            this.\u0000strictfp(class_283, class_42666, 720 & 2048, n3, i, 9902 & 4356, n3, i, (Class_3436)Class_9265.Field_9450.Method_3293(), (Class_3436)Class_9265.Field_9450.Method_3293(), (-23985 & 1168) != 0);
            this.\u0000strictfp(class_283, class_42666, 6784 & 16393, n2 + (14641 & -15735), i, 8843 & 3088, n3 - (1041 & -30463), i, (Class_3436)Class_9265.Field_9450.Method_3293(), (Class_3436)Class_9265.Field_9450.Method_3293(), (-15848 & 1030) != 0);
            this.\u0000strictfp(class_283, class_42666, 390 & 32324, n2 + (3123 & 21065), i, 1540 & -32537, n3 - (1673 & -32507), i, (Class_3436)Class_9265.Field_9450.Method_3293(), (Class_3436)Class_9265.Field_9450.Method_3293(), (-32255 & 12368) != 0);
            if ((i & (537 & 9219)) == 0) {
                this.\u0000strictfp(class_283, class_42666, 100 & -14328, n2 + (258 & 11858), i, 50 & -23351, n2 + (519 & 21571), i, (Class_3436)Class_9265.Field_9428.Method_3293(), (Class_3436)Class_9265.Field_9428.Method_3293(), (128 & -31404) != 0);
                this.\u0000strictfp(class_283, class_42666, 25732 & 5, n2 + (12682 & 18434), i, 268 & -20346, n2 + (-1401 & 1051), i, (Class_3436)Class_9265.Field_9428.Method_3293(), (Class_3436)Class_9265.Field_9428.Method_3293(), (4 & 8217) != 0);
            }
            for (int j = 4309 & -32736; j <= (4741 & 3076); ++j) {
                this.\u0000strictfp(class_283, (Class_3436)Class_9265.Field_9450.Method_3293(), j, -1 & -1, n4, class_42666);
            }
        }
        return (4235 & 9073) != 0;
    }

    public Class_40205() {
    }

    public Class_40205(int n, Random random, Class_42666 class_42666, Class_4595 class_4595) {
        super(n);
        this.\u0000strictfp = class_4595;
        this.\u0000strictfp = class_42666;
    }

    public static Class_40205 Method_40208(List list, Random random, int n, int n2, int n3, Class_4595 class_4595, int n4) {
        Class_42666 class_42666 = Class_42666.Method_42682(n, n2, n3, -1 & -1, -1 & -7, 9250 & 6796, 173 & 27159, 16606 & -28626, -30950 & 22542, class_4595);
        return Class_40205.\u0000strictfp((Class_42666)class_42666) && Class_13400.Method_13426(list, class_42666) == null ? new Class_40205(n4, random, class_42666, class_4595) : null;
    }

    private void Method_40209() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

