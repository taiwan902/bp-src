/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Random;

public class Class_30799
extends Class_25768 {
    public Class_13056 Field_30800;

    public Class_30799(Class_283 class_283) {
        super(class_283);
    }

    private void Method_30801() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_30802(double d, double d2, double d3, float f, float f2, int n, boolean bl) {
        Class_4751 class_4751 = this.\u0000, `.Method_4774(d - this.\u0000= package, d2 - this.\u0000, for(), d3 - this.\u0000= switch);
        this.\u0000%((double)class_4751.\u0000= final(), (double)class_4751.\u0000, `(), (double)class_4751.\u0000strictfp());
    }

    public int Method_30803() {
        return this.Field_30800.Field_13087;
    }

    public void Method_30804(Class_1699 class_1699) {
        class_1699.Method_1702("Motive", this.Field_30800.Field_13068);
        super.Method_25775(class_1699);
    }

    public void Method_30805(Class_1699 class_1699) {
        String string = class_1699.Method_1708("Motive");
        Class_13056[] arrclass_13056 = Class_13056.Method_13115();
        int n = arrclass_13056.length;
        for (int i = 16784 & 8194; i < n; ++i) {
            Class_13056 class_13056 = arrclass_13056[i];
            if (!class_13056.Field_13068.equals(string)) continue;
            this.Field_30800 = class_13056;
        }
        if (this.Field_30800 == null) {
            this.Field_30800 = Class_13056.Field_13088;
        }
        super.Method_25774(class_1699);
    }

    public Class_30799(Class_283 class_283, Class_4751 class_4751, Class_4595 class_4595, String string) {
        this(class_283, class_4751, class_4595);
        Class_13056[] arrclass_13056 = Class_13056.Method_13115();
        int n = arrclass_13056.length;
        for (int i = -31614 & 8564; i < n; ++i) {
            Class_13056 class_13056 = arrclass_13056[i];
            if (!class_13056.Field_13068.equals(string)) continue;
            this.Field_30800 = class_13056;
            break;
        }
        this.\u0000strictfp(class_4595);
    }

    public void Method_30806(Class_1061 class_1061) {
        if (this.\u0000strictfp.Method_522().Method_7529("doEntityDrops")) {
            if (class_1061 instanceof Class_626) {
                Class_626 class_626 = (Class_626)class_1061;
                if (class_626.Field_694.Method_18094()) {
                    return;
                }
            }
            this.\u0000strictfp(new Class_23823(Class_10527.Field_10531), 0.0f);
        }
    }

    public void Method_30807(double d, double d2, double d3, float f, float f2) {
        Class_4751 class_4751 = this.\u0000, `.Method_4774(d - this.\u0000= package, d2 - this.\u0000, for(), d3 - this.\u0000= switch);
        this.\u0000%((double)class_4751.\u0000= final(), (double)class_4751.\u0000, `(), (double)class_4751.\u0000strictfp());
    }

    public Class_30799(Class_283 class_283, Class_4751 class_4751, Class_4595 class_4595) {
        super(class_283, class_4751);
        ArrayList arrayList = Lists.newArrayList();
        Class_13056[] arrclass_13056 = Class_13056.Method_13115();
        int n = arrclass_13056.length;
        for (int i = -27008 & 10312; i < n; ++i) {
            Class_13056 class_13056;
            this.Field_30800 = class_13056 = arrclass_13056[i];
            this.\u0000strictfp(class_4595);
            if (!this.\u0000, for()) continue;
            arrayList.add(class_13056);
        }
        if (!arrayList.isEmpty()) {
            this.Field_30800 = (Class_13056)((Object)arrayList.get(this.\u0000strictfp.nextInt(arrayList.size())));
        }
        this.\u0000strictfp(class_4595);
    }

    public int Method_30808() {
        return this.Field_30800.Field_13060;
    }
}

