/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Random;

public class Class_13393
extends Class_13400 {
    public boolean Method_13394(Class_283 class_283, Random random, Class_42666 class_42666) {
        if (this.\u0000strictfp(class_283, class_42666)) {
            return (24640 & -32505) != 0;
        }
        this.\u0000strictfp(class_283, class_42666, 8284 & -15070, 269 & 1095, 2664 & 4099, -31677 & 21262, -8169 & 4487, -16271 & 397, (Class_3436)Class_9265.Field_9351.Method_3293(), (Class_3436)Class_9265.Field_9351.Method_3293(), (15136 & -32615) != 0);
        this.\u0000strictfp(class_283, class_42666, 2112 & 4529, 10754 & 1056, -31577 & 16391, 19266 & 3, 16962 & 11410, 16553 & 14920, (Class_3436)Class_9265.Field_9351.Method_3293(), (Class_3436)Class_9265.Field_9351.Method_3293(), (3264 & 297) != 0);
        for (int i = 65 & -22894; i < (19159 & -27611); ++i) {
            this.\u0000strictfp(class_283, class_42666, 20650 & 1541, (-30459 & 9285) - i - (i < (19524 & 276) ? 65 & 17415 : -15632 & 5126), (66 & 16410) + i, 4098 & 34, (71 & 10927) - i, (6786 & -31645) + i, (Class_3436)Class_9265.Field_9351.Method_3293(), (Class_3436)Class_9265.Field_9351.Method_3293(), (1052 & -16254) != 0);
        }
        return (12289 & 2403) != 0;
    }

    private void Method_13395() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public static Class_42666 Method_13396(List list, Random random, int n, int n2, int n3, Class_4595 class_4595) {
        Class_42666 class_42666 = new Class_42666(n, n2 - (17421 & -32155), n3, n, n2 + (274 & 12418), n3);
        switch (Class_31128.Field_31129[class_4595.ordinal()]) {
            case 1: {
                class_42666.Field_42670 = n + (1570 & -32509);
                class_42666.Field_42669 = n3 - (8712 & 3337);
                break;
            }
            case 2: {
                class_42666.Field_42670 = n + (3842 & 20598);
                class_42666.Field_42667 = n3 + (26 & 18796);
                break;
            }
            case 3: {
                class_42666.Field_42668 = n - (1580 & 6280);
                class_42666.Field_42667 = n3 + (-30442 & 22114);
                break;
            }
            case 4: {
                class_42666.Field_42670 = n + (-14840 & 8344);
                class_42666.Field_42667 = n3 + (8322 & 20578);
            }
        }
        return Class_13400.Method_13426(list, class_42666) != null ? null : class_42666;
    }

    public Class_13393() {
    }

    public Class_13393(int n, Random random, Class_42666 class_42666, Class_4595 class_4595) {
        super(n);
        this.\u0000strictfp = class_4595;
        this.\u0000strictfp = class_42666;
    }

    public void Method_13397(Class_13400 class_13400, List list, Random random) {
        int n = this.\u0000strictfp();
        if (this.\u0000strictfp != null) {
            switch (Class_31128.Field_31129[this.\u0000strictfp.ordinal()]) {
                case 1: {
                    Class_26253.Method_26260(class_13400, list, random, this.\u0000strictfp.Field_42668, this.\u0000strictfp.Field_42672, this.\u0000strictfp.Field_42669 - (8353 & -13563), Class_4595.Field_4598, n);
                    break;
                }
                case 2: {
                    Class_26253.Method_26260(class_13400, list, random, this.\u0000strictfp.Field_42668, this.\u0000strictfp.Field_42672, this.\u0000strictfp.Field_42667 + (787 & 24781), Class_4595.Field_4613, n);
                    break;
                }
                case 3: {
                    Class_26253.Method_26260(class_13400, list, random, this.\u0000strictfp.Field_42668 - (2849 & 24579), this.\u0000strictfp.Field_42672, this.\u0000strictfp.Field_42669, Class_4595.Field_4602, n);
                    break;
                }
                case 4: {
                    Class_26253.Method_26260(class_13400, list, random, this.\u0000strictfp.Field_42670 + (8727 & -15263), this.\u0000strictfp.Field_42672, this.\u0000strictfp.Field_42669, Class_4595.Field_4603, n);
                }
            }
        }
    }

    protected void Method_13398(Class_1699 class_1699) {
    }

    protected void Method_13399(Class_1699 class_1699) {
    }
}

