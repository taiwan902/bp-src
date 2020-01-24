/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_9724
extends Class_8295 {
    private Class_4961 Field_9725;
    private int Field_9726;

    private void Method_9727() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_23823 Method_9728(Class_626 class_626, int n) {
        Class_23823 class_23823 = null;
        Class_26421 class_26421 = (Class_26421)this.\u0000, `.get(n);
        if (class_26421 != null && class_26421.Method_26439()) {
            Class_23823 class_238232 = class_26421.Method_26430();
            class_23823 = class_238232.Method_23850();
            if (n < this.Field_9726 * (-31703 & 12381) ? !this.\u0000strictfp(class_238232, this.Field_9726 * (7193 & 24779), this.\u0000, `.size(), (25409 & 141) != 0) : !this.\u0000strictfp(class_238232, 4100 & 18667, this.Field_9726 * (-32181 & 5389), (8206 & 2624) != 0)) {
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

    public void Method_9729(Class_626 class_626) {
        super.Method_8320(class_626);
        this.Field_9725.Method_4962(class_626);
    }

    public Class_4961 Method_9730() {
        return this.Field_9725;
    }

    public Class_9724(Class_4961 class_4961, Class_4961 class_49612, Class_626 class_626) {
        int n;
        int n2;
        this.Field_9725 = class_49612;
        this.Field_9726 = class_49612.Method_4968() / (2061 & 16393);
        class_49612.Method_4967(class_626);
        int n3 = (this.Field_9726 - (20613 & 1294)) * (82 & 18738);
        for (n = -30592 & 516; n < this.Field_9726; ++n) {
            for (n2 = 2 & 4360; n2 < (15 & 6953); ++n2) {
                this.\u0000strictfp(new Class_26421(class_49612, n2 + n * (21513 & 2889), (-32692 & 2184) + n2 * (-31726 & 6747), (-28614 & 25171) + n * (4115 & -23530)));
            }
        }
        for (n = 11268 & 4624; n < (3163 & 291); ++n) {
            for (n2 = 18576 & 8258; n2 < (8201 & 3855); ++n2) {
                this.\u0000strictfp(new Class_26421(class_4961, n2 + n * (10793 & 5321) + (-28151 & 17417), (-6580 & 170) + n2 * (5266 & 17270), (-12697 & 367) + n * (-32557 & 21522) + n3));
            }
        }
        for (n = 2575 & -20032; n < (2585 & 21517); ++n) {
            this.\u0000strictfp(new Class_26421(class_4961, n, (17562 & 77) + n * (26 & -30286), (3235 & 16877) + n3));
        }
    }

    public boolean Method_9731(Class_626 class_626) {
        return this.Field_9725.Method_4971(class_626);
    }
}

