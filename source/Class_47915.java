/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public final class Class_47915
extends Class_5038 {
    private boolean Field_47916 = 26627 & -32615;

    private void Method_47917() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected void Method_47918(Class_5001 class_5001) {
        if (this.Field_47916) {
            class_5001.\u0000strictfp().Method_502(-7176 & 5096, class_5001.Method_5003(), 1536 & 395);
        } else {
            class_5001.\u0000strictfp().Method_502(-29701 & 6125, class_5001.Method_5003(), 16386 & 6505);
        }
    }

    Class_47915() {
    }

    protected Class_23823 Method_47919(Class_5001 class_5001, Class_23823 class_23823) {
        if (Class_5393.Field_5398 == Class_5393.Method_5448(class_23823.Method_23843())) {
            Class_4751 class_4751;
            Class_283 class_283 = class_5001.\u0000strictfp();
            if (Class_24451.Method_24453(class_23823, class_283, class_4751 = class_5001.Method_5003().Method_4765(Class_4850.Method_4869(class_5001.Method_5007())))) {
                if (!class_283.Field_306) {
                    class_283.Method_502(2005 & 10237, class_4751, 17414 & 8360);
                }
            } else {
                this.Field_47916 = -15803 & 1064;
            }
            return class_23823;
        }
        return super.Method_5040(class_5001, class_23823);
    }
}

