/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public abstract class Class_4286
extends Class_4291 {
    public Class_4286(boolean bl) {
        super(bl);
    }

    protected boolean Method_4287(Class_3238 class_3238) {
        Class_3713 class_3713 = class_3238.Method_3373();
        return (class_3713 == Class_3713.Field_3718 || class_3713 == Class_3713.Field_3729 || class_3238 == Class_9265.Field_9319 || class_3238 == Class_9265.Field_9272 || class_3238 == Class_9265.Field_9383 || class_3238 == Class_9265.Field_9447 || class_3238 == Class_9265.Field_9389 || class_3238 == Class_9265.Field_9323 ? 16521 & 3105 : 8266 & -15200) != 0;
    }

    private void Method_4288() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_4289(Class_283 class_283, Random random, Class_4751 class_4751) {
    }

    protected void Method_4290(Class_283 class_283, Class_4751 class_4751) {
        if (class_283.Method_375(class_4751).Method_3442() != Class_9265.Field_9272) {
            this.\u0000strictfp(class_283, class_4751, (Class_3436)Class_9265.Field_9272.Method_3293());
        }
    }
}

