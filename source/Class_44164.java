/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_44164
extends Class_42218 {
    private int Field_44165;
    private float Field_44166;
    private Class_1061 Field_44167;
    private Class_8491 Field_44168 = Class_18.Field_89.Method_266();
    private Class_1061 Field_44169;
    private int Field_44170;

    private void Method_44171() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_44164(Class_283 class_283, Class_1061 class_1061, Class_1061 class_10612, float f) {
        super(class_283, class_1061.Field_1130, class_1061.Method_1324(), class_1061.Field_1106, class_1061.Field_1071, class_1061.Method_1224(), class_1061.Field_1072);
        this.Field_44169 = class_1061;
        this.Field_44167 = class_10612;
        this.Field_44170 = 2059 & 20487;
        this.Field_44166 = f;
    }

    public int Method_44172() {
        return 59 & -28857;
    }

    public void Method_44173() {
        this.Field_44165 += 9345 & 2053;
        if (this.Field_44165 == this.Field_44170) {
            this.\u0000break();
        }
    }

    public void Method_44174(Class_22385 class_22385, Class_1061 class_1061, float f, float f2, float f3, float f4, float f5, float f6) {
        int n = 15360 & 16544;
        if (Class_19426.Method_19570()) {
            n = Class_12440.Field_12498;
            Class_12440.Method_12803(this.Field_44169);
        }
        float f7 = ((float)this.Field_44165 + f) / (float)this.Field_44170;
        f7 *= f7;
        double d = this.Field_44169.Field_1130;
        double d2 = this.Field_44169.Method_1324();
        double d3 = this.Field_44169.Field_1106;
        double d4 = this.Field_44167.Field_1126 + (this.Field_44167.Field_1130 - this.Field_44167.Field_1126) * (double)f;
        double d5 = this.Field_44167.Field_1102 + (this.Field_44167.Method_1324() - this.Field_44167.Field_1102) * (double)f + (double)this.Field_44166;
        double d6 = this.Field_44167.Field_1125 + (this.Field_44167.Field_1106 - this.Field_44167.Field_1125) * (double)f;
        double d7 = d + (d4 - d) * (double)f7;
        double d8 = d2 + (d5 - d2) * (double)f7;
        double d9 = d3 + (d6 - d3) * (double)f7;
        int n2 = this.\u0000strictfp(f);
        int n3 = n2 % (177809420 & 872747120);
        int n4 = n2 / (75745795 & 946413568);
        Class_32876.Method_32943(Class_32876.Field_32911, (float)n3 / 1.0f, (float)n4 / 1.0f);
        Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 1.0f);
        this.Field_44168.Method_8524(this.Field_44169, (float)(d7 -= \u0000, `), (float)(d8 -= \u0000= final), (float)(d9 -= \u0000strictfp), this.Field_44169.Field_1079, f);
        if (Class_19426.Method_19570()) {
            Class_12440.Method_12981(n);
        }
    }
}

