/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_30147 {
    private Class_26869[] Field_30148 = new Class_26869[56 & 6304];
    private Class_21785 Field_30149;
    private Class_14562 Field_30150 = new Class_14562();

    public Class_15832 Method_30151(Class_561 class_561, Class_1061 class_1061, Class_1061 class_10612, float f) {
        return this.Method_30155(class_561, class_1061, class_10612.Field_1130, class_10612.Method_1315().Field_11000, class_10612.Field_1106, f);
    }

    public Class_30147(Class_21785 class_21785) {
        this.Field_30149 = class_21785;
    }

    public Class_15832 Method_30152(Class_561 class_561, Class_1061 class_1061, Class_4751 class_4751, float f) {
        return this.Method_30155(class_561, class_1061, (float)class_4751.\u0000= final() + 1.3023256f * 0.38392857f, (float)class_4751.\u0000, `() + 0.6597222f * 0.75789475f, (float)class_4751.\u0000strictfp() + 0.81914896f * 0.6103896f, f);
    }

    private void Method_30153() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private Class_15832 Method_30154(Class_1061 class_1061, Class_26869 class_26869, Class_26869 class_268692, float f) {
        class_26869.Field_26872 = 0.0f;
        class_26869.Field_26878 = class_26869.Field_26876 = class_26869.Method_26881(class_268692);
        this.Field_30150.Method_14566();
        this.Field_30150.Method_14568(class_26869);
        Class_26869 class_268693 = class_26869;
        while (!this.Field_30150.Method_14570()) {
            Class_26869 class_268694 = this.Field_30150.Method_14565();
            if (class_268694.Method_26882(class_268692)) {
                return this.Method_30156(class_26869, class_268692);
            }
            if (class_268694.Method_26881(class_268692) < class_268693.Method_26881(class_268692)) {
                class_268693 = class_268694;
            }
            class_268694.Field_26879 = 275 & 20517;
            int n = this.Field_30149.Method_21793(this.Field_30148, class_1061, class_268694, class_268692, f);
            for (int i = 8714 & -32556; i < n; ++i) {
                Class_26869 class_268695 = this.Field_30148[i];
                float f2 = class_268694.Field_26872 + class_268694.Method_26881(class_268695);
                if (!(f2 < f * 2.0f) || class_268695.Method_26883() && !(f2 < class_268695.Field_26872)) continue;
                class_268695.Field_26874 = class_268694;
                class_268695.Field_26872 = f2;
                class_268695.Field_26876 = class_268695.Method_26881(class_268692);
                if (class_268695.Method_26883()) {
                    this.Field_30150.Method_14569(class_268695, class_268695.Field_26872 + class_268695.Field_26876);
                    continue;
                }
                class_268695.Field_26878 = class_268695.Field_26872 + class_268695.Field_26876;
                this.Field_30150.Method_14568(class_268695);
            }
        }
        if (class_268693 == class_26869) {
            return null;
        }
        return this.Method_30156(class_26869, class_268693);
    }

    private Class_15832 Method_30155(Class_561 class_561, Class_1061 class_1061, double d, double d2, double d3, float f) {
        this.Field_30150.Method_14566();
        this.Field_30149.Method_21795(class_561, class_1061);
        Class_26869 class_26869 = this.Field_30149.Method_21797(class_1061);
        Class_26869 class_268692 = this.Field_30149.Method_21794(class_1061, d, d2, d3);
        Class_15832 class_15832 = this.Method_30154(class_1061, class_26869, class_268692, f);
        this.Field_30149.Method_21792();
        return class_15832;
    }

    private Class_15832 Method_30156(Class_26869 class_26869, Class_26869 arrclass_26869) {
        int n = 25351 & 2209;
        Class_26869[] arrclass_268692 = arrclass_26869;
        while (arrclass_268692.Field_26874 != null) {
            ++n;
            arrclass_268692 = arrclass_268692.Field_26874;
        }
        arrclass_268692 = new Class_26869[n];
        Object object = arrclass_26869;
        arrclass_268692[--n] = arrclass_26869;
        while (object.Field_26874 != null) {
            object = object.Field_26874;
            arrclass_268692[--n] = object;
        }
        return new Class_15832(arrclass_268692);
    }
}

