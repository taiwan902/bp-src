/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_41430
extends Class_21785 {
    public void Method_41431() {
        super.Method_21792();
    }

    private int Method_41432(Class_1061 class_1061, int n, int n2, int n3) {
        Class_4810 class_4810 = new Class_4810();
        for (int i = n; i < n + this.\u0000strictfp; ++i) {
            for (int j = n2; j < n2 + this.\u0000= final; ++j) {
                for (int k = n3; k < n3 + this.\u0000, `; ++k) {
                    Class_3238 class_3238 = this.\u0000strictfp.Method_568(class_4810.Method_4814(i, j, k)).Method_3442();
                    if (class_3238.Method_3373() == Class_3713.Field_3734) continue;
                    return 516 & -12222;
                }
            }
        }
        return -1 & -1;
    }

    private Class_26869 Method_41433(Class_1061 class_1061, int n, int n2, int n3) {
        int n4 = this.Method_41432(class_1061, n, n2, n3);
        return n4 == (-1 & -1) ? this.\u0000strictfp(n, n2, n3) : null;
    }

    public Class_26869 Method_41434(Class_1061 class_1061) {
        return this.\u0000strictfp(Class_13337.Method_13371(class_1061.Method_1315().Field_10999), Class_13337.Method_13371(class_1061.Method_1315().Field_11000 + 1.9090909090909092 * 0.2619047619047619), Class_13337.Method_13371(class_1061.Method_1315().Field_11001));
    }

    private void Method_41435() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_41436(Class_561 class_561, Class_1061 class_1061) {
        super.Method_21795(class_561, class_1061);
    }

    public Class_26869 Method_41437(Class_1061 class_1061, double d, double d2, double d3) {
        return this.\u0000strictfp(Class_13337.Method_13371(d - (double)(class_1061.Method_1266() / 2.0f)), Class_13337.Method_13371(d2 + 0.0234375 * 21.333333333333332), Class_13337.Method_13371(d3 - (double)(class_1061.Method_1266() / 2.0f)));
    }

    public int Method_41438(Class_26869[] arrclass_26869, Class_1061 class_1061, Class_26869 class_26869, Class_26869 class_268692, float f) {
        int n = 5072 & -13280;
        Class_4595[] arrclass_4595 = Class_4595.Method_4630();
        int n2 = arrclass_4595.length;
        for (int i = -24500 & 4368; i < n2; ++i) {
            Class_4595 class_4595 = arrclass_4595[i];
            Class_26869 class_268693 = this.Method_41433(class_1061, class_26869.Field_26870 + class_4595.Method_4654(), class_26869.Field_26871 + class_4595.Method_4633(), class_26869.Field_26873 + class_4595.Method_4656());
            if (class_268693 == null || class_268693.Field_26879 || !(class_268693.Method_26884(class_268692) < f)) continue;
            arrclass_26869[n++] = class_268693;
        }
        return n;
    }
}

