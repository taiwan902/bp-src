/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_35327
extends Class_33781 {
    Class_31961 Field_35328;
    Class_31961[] Field_35329 = new Class_31961[-16182 & 5932];

    public void Method_35330(Class_1061 class_1061, float f, float f2, float f3, float f4, float f5, float f6) {
        this.Method_35331(f, f2, f3, f4, f5, f6, class_1061);
        this.Field_35328.Method_31999(f6);
        for (int i = 17546 & -32512; i < this.Field_35329.length; ++i) {
            this.Field_35329[i].Method_31999(f6);
        }
    }

    public Class_35327() {
        int n = -12 & -16;
        this.Field_35328 = new Class_31961(this, 917 & -30720, 2596 & 25);
        this.Field_35328.Method_32002(0.25773194f * -23.28f, 0.086021505f * -93.0f, 1.9318181f * -3.1058824f, -31204 & 4332, 2129 & 16688, 4364 & 16428);
        this.Field_35328.Field_31971 += (float)((120 & 16924) + n);
        for (int i = 2210 & 21324; i < this.Field_35329.length; ++i) {
            this.Field_35329[i] = new Class_31961(this, -29640 & 12724, 258 & 18504);
            double d = (double)i * (0.19230769230769232 * 16.336281798666924) * (0.4642857142857143 * 4.3076923076923075) / (double)this.Field_35329.length;
            float f = (float)Math.cos(d) * (0.21978022f * 22.75f);
            float f2 = (float)Math.sin(d) * (0.114285715f * 43.75f);
            this.Field_35329[i].Method_32002(0.4814815f * -2.0769231f, 0.0f, -2.5555556f * 0.39130434f, 10274 & 4163, 11282 & 4827, -26453 & 8194);
            this.Field_35329[i].Field_31976 = f;
            this.Field_35329[i].Field_31972 = f2;
            this.Field_35329[i].Field_31971 = (2847 & 8351) + n;
            d = (double)i * (1.0212765957446808 * 3.076142806640006) * (3.9285714285714284 * -0.5090909090909091) / (double)this.Field_35329.length + 0.11428571428571428 * 13.744467859455344;
            this.Field_35329[i].Field_31968 = (float)d;
        }
    }

    public void Method_35331(float f, float f2, float f3, float f4, float f5, float f6, Class_1061 class_1061) {
        Class_31961[] arrclass_31961 = this.Field_35329;
        int n = arrclass_31961.length;
        for (int i = 174 & 576; i < n; ++i) {
            Class_31961 class_31961 = arrclass_31961[i];
            class_31961.Field_31984 = f3;
        }
    }

    private void Method_35332() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

