/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import net.minecraft.util.Vec3;

public abstract class Class_5164
extends Class_3238 {
    protected final boolean Field_5165;

    public boolean Method_5166() {
        return (1057 & 4124) != 0;
    }

    public void Method_5167(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436) {
        if (!class_283.Field_306) {
            class_3436 = this.Method_5170(class_283, class_4751, class_3436, (-32743 & 12839) != 0);
            if (this.Field_5165) {
                this.Method_5171(class_283, class_4751, class_3436, this);
            }
        }
    }

    public Class_17531 Method_5168() {
        return Class_17531.Field_17538;
    }

    public boolean Method_5169(Class_283 class_283, Class_4751 class_4751) {
        return Class_283.Method_538(class_283, class_4751.Method_4782());
    }

    protected Class_3436 Method_5170(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, boolean bl) {
        return class_283.Field_306 ? class_3436 : new Class_13316(this, class_283, class_4751, class_3436).Method_13330(class_283.Method_414(class_4751), bl).Method_13329();
    }

    public void Method_5171(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Class_3238 class_3238) {
        if (!class_283.Field_306) {
            Class_5183 class_5183 = (Class_5183)((Object)class_3436.Method_3440(this.Method_5176()));
            int n = 1427 & 8192;
            if (!Class_283.Method_538(class_283, class_4751.Method_4782())) {
                n = 5445 & 641;
            }
            if (class_5183 == Class_5183.Field_5190 && !Class_283.Method_538(class_283, class_4751.Method_4770())) {
                n = -28543 & 8505;
            } else if (class_5183 == Class_5183.Field_5189 && !Class_283.Method_538(class_283, class_4751.Method_4771())) {
                n = 17027 & 8521;
            } else if (class_5183 == Class_5183.Field_5196 && !Class_283.Method_538(class_283, class_4751.Method_4778())) {
                n = 12801 & -32767;
            } else if (class_5183 == Class_5183.Field_5192 && !Class_283.Method_538(class_283, class_4751.Method_4784())) {
                n = 10257 & 17543;
            }
            if (n != 0) {
                this.\u0000strictfp(class_283, class_4751, class_3436, 16395 & 480);
                class_283.Method_472(class_4751);
            } else {
                this.Method_5181(class_283, class_4751, class_3436, class_3238);
            }
        }
    }

    public static boolean Method_5172(Class_283 class_283, Class_4751 class_4751) {
        return Class_5164.Method_5178(class_283.Method_375(class_4751));
    }

    private void Method_5173() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_5174(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436) {
        super.Method_3357(class_283, class_4751, class_3436);
        if (((Class_5183)((Object)class_3436.Method_3440(this.Method_5176()))).Method_5219()) {
            class_283.Method_525(class_4751.Method_4769(), this);
        }
        if (this.Field_5165) {
            class_283.Method_525(class_4751, this);
            class_283.Method_525(class_4751.Method_4782(), this);
        }
    }

    public Class_10997 Method_5175(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436) {
        return null;
    }

    public abstract Class_3538 Method_5176();

    protected Class_5164(boolean bl) {
        super(Class_3713.Field_3751);
        this.Field_5165 = bl;
        this.\u0000strictfp(0.0f, 0.0f, 0.0f, 1.0f, 1.6666666f * 0.075f, 1.0f);
        this.\u0000strictfp(Class_3987.Field_3994);
    }

    public Class_37110 Method_5177(Class_283 class_283, Class_4751 class_4751, Vec3 vec3, Vec3 vec32) {
        this.Method_5180(class_283, class_4751);
        return super.Method_3372(class_283, class_4751, vec3, vec32);
    }

    public static boolean Method_5178(Class_3436 class_3436) {
        Class_3238 class_3238 = class_3436.Method_3442();
        return (class_3238 == Class_9265.Field_9401 || class_3238 == Class_9265.Field_9335 || class_3238 == Class_9265.Field_9396 || class_3238 == Class_9265.Field_9375 ? -32611 & 24641 : -26624 & 18244) != 0;
    }

    public int Method_5179() {
        return 2594 & -15075;
    }

    public void Method_5180(Class_561 class_561, Class_4751 class_4751) {
        Class_5183 class_5183;
        Class_3436 class_3436 = class_561.Method_568(class_4751);
        Class_5183 class_51832 = class_5183 = class_3436.Method_3442() == this ? (Class_5183)((Object)class_3436.Method_3440(this.Method_5176())) : null;
        if (class_5183 != null && class_5183.Method_5219()) {
            this.\u0000strictfp(0.0f, 0.0f, 0.0f, 1.0f, 0.17857143f * 3.5f, 1.0f);
        } else {
            this.\u0000strictfp(0.0f, 0.0f, 0.0f, 1.0f, 1.2894737f * 0.09693878f, 1.0f);
        }
    }

    protected void Method_5181(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Class_3238 class_3238) {
    }

    public boolean Method_5182() {
        return (5153 & 8194) != 0;
    }
}

