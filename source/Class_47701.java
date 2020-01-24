/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public final class Class_47701
extends Class_5038 {
    private final Class_5038 Field_47702 = new Class_5038();

    public Class_23823 Method_47703(Class_5001 class_5001, Class_23823 class_23823) {
        double d;
        Class_4595 class_4595 = Class_4850.Method_4869(class_5001.Method_5007());
        Class_283 class_283 = class_5001.\u0000strictfp();
        double d2 = class_5001.Method_5005() + (double)((float)class_4595.Method_4654() * (0.28977275f * 3.8823528f));
        double d3 = class_5001.Method_5002() + (double)((float)class_4595.Method_4633() * (4.178571f * 0.26923078f));
        double d4 = class_5001.Method_5004() + (double)((float)class_4595.Method_4656() * (1.3636364f * 0.825f));
        Class_4751 class_4751 = class_5001.Method_5003().Method_4765(class_4595);
        Class_3713 class_3713 = class_283.Method_375(class_4751).Method_3442().Method_3373();
        if (Class_3713.Field_3734.equals(class_3713)) {
            d = 1.0;
        } else {
            if (!Class_3713.Field_3718.equals(class_3713) || !Class_3713.Field_3734.equals(class_283.Method_375(class_4751.Method_4782()).Method_3442().Method_3373())) {
                return this.Field_47702.Method_5045(class_5001, class_23823);
            }
            d = 0.0;
        }
        Class_25683 class_25683 = new Class_25683(class_283, d2, d3 + d, d4);
        class_283.Method_350(class_25683);
        class_23823.Method_23857(297 & 1155);
        return class_23823;
    }

    private void Method_47704() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected void Method_47705(Class_5001 class_5001) {
        class_5001.\u0000strictfp().Method_502(1000 & 12266, class_5001.Method_5003(), 4136 & -15871);
    }

    Class_47701() {
    }
}

