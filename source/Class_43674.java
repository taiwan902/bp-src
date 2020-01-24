/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_43674
extends Class_37934 {
    private final boolean Field_43675;

    protected void Method_43676(Class_23823 class_23823, Class_283 class_283, Class_626 class_626) {
        Class_18525 class_18525 = Class_18525.Method_18545(class_23823);
        if (class_18525 == Class_18525.Field_18527) {
            class_626.\u0000, `(new Class_25240(Class_8338.Field_8367.Field_8364, 9653 & -31568, 131 & 14343));
            class_626.\u0000, `(new Class_25240(Class_8338.Field_8339.Field_8364, 10607 & 16700, 4099 & 25154));
            class_626.\u0000, `(new Class_25240(Class_8338.Field_8372.Field_8364, -28307 & 8636, 8323 & -28615));
        }
        super.Method_37954(class_23823, class_283, class_626);
    }

    private void Method_43677() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public String Method_43678(Class_23823 class_23823) {
        Class_18525 class_18525 = Class_18525.Method_18545(class_23823);
        return this.\u0000strictfp() + "." + class_18525.Method_18539() + "." + (this.Field_43675 && class_18525.Method_18553() ? "cooked" : "raw");
    }

    public String Method_43679(Class_23823 class_23823) {
        return Class_18525.Method_18545(class_23823) == Class_18525.Field_18527 ? "+0-1+2+3+13&4-4" : null;
    }

    public float Method_43680(Class_23823 class_23823) {
        Class_18525 class_18525 = Class_18525.Method_18545(class_23823);
        return this.Field_43675 && class_18525.Method_18553() ? class_18525.Method_18544() : class_18525.Method_18547();
    }

    public Class_43674(boolean bl) {
        super(6210 & 1329, 0.0f, (-32704 & 8486) != 0);
        this.Field_43675 = bl;
    }

    public void Method_43681(Class_1956 class_1956, Class_3987 class_3987, List list) {
        Class_18525[] arrclass_18525 = Class_18525.Method_18540();
        int n = arrclass_18525.length;
        for (int i = 4640 & 10240; i < n; ++i) {
            Class_18525 class_18525 = arrclass_18525[i];
            if (this.Field_43675 && !class_18525.Method_18553()) continue;
            list.add(new Class_23823(this, 8213 & -28405, class_18525.Method_18548()));
        }
    }

    public int Method_43682(Class_23823 class_23823) {
        Class_18525 class_18525 = Class_18525.Method_18545(class_23823);
        return this.Field_43675 && class_18525.Method_18553() ? class_18525.Method_18555() : class_18525.Method_18551();
    }
}

