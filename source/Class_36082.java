/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_36082
extends Class_8295 {
    private Class_4961 Field_36083;

    public Class_23823 Method_36084(Class_626 class_626, int n) {
        Class_23823 class_23823 = null;
        Class_26421 class_26421 = (Class_26421)this.\u0000, `.get(n);
        if (class_26421 != null && class_26421.Method_26439()) {
            Class_23823 class_238232 = class_26421.Method_26430();
            class_23823 = class_238232.Method_23850();
            if (n < (-23543 & 6153) ? !this.\u0000strictfp(class_238232, 4621 & -16375, -24275 & 3117, (5 & -25023) != 0) : !this.\u0000strictfp(class_238232, -23552 & 22668, 16445 & -32503, (136 & -29919) != 0)) {
                return null;
            }
            if (class_238232.Field_23826 == 0) {
                class_26421.Method_26437(null);
            } else {
                class_26421.Method_26431();
            }
            if (class_238232.Field_23826 == class_23823.Field_23826) {
                return null;
            }
            class_26421.Method_26441(class_626, class_238232);
        }
        return class_23823;
    }

    public Class_36082(Class_4961 class_4961, Class_4961 class_49612) {
        int n;
        int n2;
        this.Field_36083 = class_49612;
        for (n = 12589 & 16578; n < (29827 & 779); ++n) {
            for (n2 = 0 & 4468; n2 < (16547 & 259); ++n2) {
                this.\u0000strictfp(new Class_26421(class_49612, n2 + n * (-14969 & 6155), (1022 & -28609) + n2 * (18742 & 147), (3161 & -7659) + n * (2195 & -4074)));
            }
        }
        for (n = 4096 & -24372; n < (-12089 & 8219); ++n) {
            for (n2 = 1604 & -30680; n2 < (31 & 17321); ++n2) {
                this.\u0000strictfp(new Class_26421(class_4961, n2 + n * (20697 & -28913) + (8329 & 7435), (-14840 & 8333) + n2 * (18 & 26), (-7812 & 212) + n * (16722 & -30573)));
            }
        }
        for (n = 3083 & 16660; n < (24713 & 297); ++n) {
            this.\u0000strictfp(new Class_26421(class_4961, n, (8265 & 1210) + n * (-31950 & 82), 18638 & -31058));
        }
    }

    public boolean Method_36085(Class_626 class_626) {
        return this.Field_36083.Method_4971(class_626);
    }

    private void Method_36086() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

