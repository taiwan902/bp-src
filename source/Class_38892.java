/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_38892
extends Class_34028 {
    public void Method_38893(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Class_3238 class_3238) {
        Class_4595 class_4595 = (Class_4595)((Object)class_3436.Method_3440(\u0000strictfp));
        if (!class_283.Method_375(class_4751.Method_4765(class_4595.Method_4660())).Method_3442().Method_3373().Method_3762()) {
            this.\u0000strictfp(class_283, class_4751, class_3436, 16516 & 4099);
            class_283.Method_472(class_4751);
        }
        super.\u0000strictfp(class_283, class_4751, class_3436, class_3238);
    }

    private void Method_38894() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_3436 Method_38895(int n) {
        Class_4595 class_4595 = Class_4595.Method_4637(n);
        if (class_4595.Method_4640() == Class_4565.Field_4569) {
            class_4595 = Class_4595.Field_4598;
        }
        return this.\u0000strictfp().Method_3685(\u0000strictfp, (Comparable)((Object)class_4595));
    }

    public int Method_38896(Class_3436 class_3436) {
        return ((Class_4595)((Object)class_3436.Method_3440(\u0000strictfp))).Method_4648();
    }

    public void Method_38897(Class_561 class_561, Class_4751 class_4751) {
        Class_4595 class_4595 = (Class_4595)((Object)class_561.Method_568(class_4751).Method_3440(\u0000strictfp));
        float f = 0.0f;
        float f2 = 1.5862069f * 0.49252716f;
        float f3 = 0.0f;
        float f4 = 1.0f;
        float f5 = 0.059523813f * 2.1f;
        this.\u0000strictfp(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        switch (Class_15727.Field_15728[class_4595.ordinal()]) {
            default: {
                this.\u0000strictfp(f3, f, 1.0f - f5, f4, f2, 1.0f);
                break;
            }
            case 2: {
                this.\u0000strictfp(f3, f, 0.0f, f4, f2, f5);
                break;
            }
            case 3: {
                this.\u0000strictfp(1.0f - f5, f, f3, 1.0f, f2, f4);
                break;
            }
            case 4: {
                this.\u0000strictfp(0.0f, f, f3, f5, f2, f4);
            }
        }
    }

    public Class_38892() {
        this.\u0000strictfp(this.\u0000strictfp.Method_3867().Method_3437(\u0000strictfp, (Comparable)((Object)Class_4595.Field_4598)));
    }

    protected Class_3855 Method_38898() {
        Class_3538[] arrclass_3538 = new Class_3538[5649 & 2213];
        arrclass_3538[9236 & 2080] = \u0000strictfp;
        return new Class_3855(this, arrclass_3538);
    }
}

