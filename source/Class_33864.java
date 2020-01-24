/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_33864
extends Class_33781 {
    Class_31961 Field_33865;
    Class_31961[] Field_33866 = new Class_31961[8729 & 1036];

    public void Method_33867(Class_1061 class_1061, float f, float f2, float f3, float f4, float f5, float f6) {
        this.\u0000strictfp(f, f2, f3, f4, f5, f6, class_1061);
        this.Field_33865.Method_31999(f6);
        for (int i = -32000 & 12538; i < this.Field_33866.length; ++i) {
            this.Field_33866[i].Method_31999(f6);
        }
    }

    public Class_33864() {
        for (int i = 12353 & 0; i < this.Field_33866.length; ++i) {
            int n = 18450 & 72;
            int n2 = i;
            if (i == (21574 & 314)) {
                n = 185 & -32676;
                n2 = 16554 & -24038;
            } else if (i == (4263 & 10243)) {
                n = 1048 & 8286;
                n2 = 10267 & 4979;
            }
            this.Field_33866[i] = new Class_31961(this, n, n2);
            this.Field_33866[i].Method_32002(4.1666665f * -0.96000004f, (18584 & 531) + i, 1.1904762f * -3.3600001f, -30712 & 552, -31407 & 4131, -30200 & 25916);
        }
        this.Field_33865 = new Class_31961(this, 1062 & -30080, 18513 & -24424);
        this.Field_33865.Method_32002(3.2142856f * -0.62222224f, 14.914286f * 1.2068965f, -1.5f * 1.3333334f, -26620 & 8236, -22436 & 677, 28684 & -32569);
    }

    public void Method_33868(Class_859 class_859, float f, float f2, float f3) {
        Class_36060 class_36060 = (Class_36060)class_859;
        float f4 = class_36060.\u0000= final + (class_36060.\u0000strictfp - class_36060.\u0000= final) * f3;
        if (f4 < 0.0f) {
            f4 = 0.0f;
        }
        for (int i = -20475 & 0; i < this.Field_33866.length; ++i) {
            this.Field_33866[i].Field_31971 = (float)(-((18700 & 53) - i)) * f4 * (1.8297873f * 0.92906976f);
        }
    }

    private void Method_33869() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

