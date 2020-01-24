/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_16839
extends Class_8295 {
    private final Class_4961 Field_16840;

    public Class_16839(Class_37781 class_37781, Class_4961 class_4961, Class_626 class_626) {
        int n;
        this.Field_16840 = class_4961;
        class_4961.Method_4967(class_626);
        int n2 = -20361 & 3123;
        for (n = 5 & 22274; n < class_4961.Method_4968(); ++n) {
            this.\u0000strictfp(new Class_26421(class_4961, n, (-20436 & 3118) + n * (18551 & 9490), -16044 & 4639));
        }
        for (n = -20124 & 2184; n < (15 & 6659); ++n) {
            for (int i = 68 & 6400; i < (-32487 & 29711); ++i) {
                this.\u0000strictfp(new Class_26421(class_37781, i + n * (-14311 & 1071) + (61 & 11531), (8204 & -31223) + i * (54 & 22226), n * (20698 & 8210) + n2));
            }
        }
        for (n = 8 & 18576; n < (-32243 & 10313); ++n) {
            this.\u0000strictfp(new Class_26421(class_37781, n, (-24312 & 18634) + n * (23 & -9414), (28734 & 3066) + n2));
        }
    }

    public boolean Method_16841(Class_626 class_626) {
        return this.Field_16840.Method_4971(class_626);
    }

    public Class_23823 Method_16842(Class_626 class_626, int n) {
        Class_23823 class_23823 = null;
        Class_26421 class_26421 = (Class_26421)this.\u0000, `.get(n);
        if (class_26421 != null && class_26421.Method_26439()) {
            Class_23823 class_238232 = class_26421.Method_26430();
            class_23823 = class_238232.Method_23850();
            if (n < this.Field_16840.Method_4968() ? !this.\u0000strictfp(class_238232, this.Field_16840.Method_4968(), this.\u0000, `.size(), (-32251 & 2105) != 0) : !this.\u0000strictfp(class_238232, 129 & 13084, this.Field_16840.Method_4968(), (9382 & 513) != 0)) {
                return null;
            }
            if (class_238232.Field_23826 == 0) {
                class_26421.Method_26437(null);
            } else {
                class_26421.Method_26431();
            }
        }
        return class_23823;
    }

    private void Method_16843() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_16844(Class_626 class_626) {
        super.Method_8320(class_626);
        this.Field_16840.Method_4962(class_626);
    }
}

