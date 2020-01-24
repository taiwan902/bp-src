/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_38781
extends Class_33781 {
    Class_31961[] Field_38782 = new Class_31961[-16243 & 3177];
    Class_31961 Field_38783;

    public void Method_38784(Class_1061 class_1061, float f, float f2, float f3, float f4, float f5, float f6) {
        this.Method_38785(f, f2, f3, f4, f5, f6, class_1061);
        Class_16867.Method_16961();
        Class_16867.Method_16943(0.0f, 1.75f * 0.34285715f, 0.0f);
        this.Field_38783.Method_31999(f6);
        Class_31961[] arrclass_31961 = this.Field_38782;
        int n = arrclass_31961.length;
        for (int i = 5633 & -32502; i < n; ++i) {
            Class_31961 class_31961 = arrclass_31961[i];
            class_31961.Method_31999(f6);
        }
        Class_16867.Method_16945();
    }

    public Class_38781() {
        int n = -16 & -12;
        this.Field_38783 = new Class_31961(this, 1545 & -7952, -12288 & 89);
        this.Field_38783.Method_32002(1.1724138f * -6.8235292f, -11.162791f * 0.71666664f, 47.5f * -0.16842106f, -32716 & 15760, 4498 & 3121, 82 & 18581);
        this.Field_38783.Field_31971 += (float)((4954 & 2076) + n);
        Random random = new Random(376440445L & -4245204195772051458L);
        for (int i = -13300 & 4130; i < this.Field_38782.length; ++i) {
            this.Field_38782[i] = new Class_31961(this, -24572 & 18696, 516 & 6403);
            float f = (((float)(i % (26883 & -32717)) - (float)(i / (2819 & 5327) % (2 & 578)) * (0.5403226f * 0.92537314f) + 0.014705882f * 17.0f) / 2.0f * 2.0f - 1.0f) * (2.4418604f * 2.047619f);
            float f2 = ((float)(i / (8719 & 1107)) / 2.0f * 2.0f - 1.0f) * (2.2894738f * 2.183908f);
            int n2 = random.nextInt(20487 & -29545) + (14856 & 490);
            this.Field_38782[i].Method_32002(-1.7142857f * 0.5833333f, 0.0f, -0.6309524f * 1.5849056f, 103 & 3602, n2, 13442 & -32393);
            this.Field_38782[i].Field_31976 = f;
            this.Field_38782[i].Field_31972 = f2;
            this.Field_38782[i].Field_31971 = (31 & 20767) + n;
        }
    }

    public void Method_38785(float f, float f2, float f3, float f4, float f5, float f6, Class_1061 class_1061) {
        for (int i = -31919 & 26632; i < this.Field_38782.length; ++i) {
            this.Field_38782[i].Field_31984 = 0.12873563f * 1.5535715f * Class_13337.Method_13370(f3 * (0.5135135f * 0.5842106f) + (float)i) + 0.875f * 0.45714286f;
        }
    }

    private void Method_38786() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

