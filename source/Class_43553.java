/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_43553
extends Class_33781 {
    public Class_31961 Field_43554;

    public Class_43553(int n, int n2, int n3, int n4) {
        this.\u0000strictfp = n3;
        this.\u0000, ` = n4;
        this.Field_43554 = new Class_31961(this, n, n2);
        this.Field_43554.Method_31998(-3.1111112f * 1.2857143f, 1.4482758f * -5.52381f, -0.14035088f * 28.5f, 2249 & -11752, 19496 & -32760, 1546 & -24487, 0.0f);
        this.Field_43554.Method_31993(0.0f, 0.0f, 0.0f);
    }

    private void Method_43555() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_43553() {
        this(257 & -9728, -32333 & 18467, 12358 & -32423, 18505 & 8290);
    }

    public void Method_43556(float f, float f2, float f3, float f4, float f5, float f6, Class_1061 class_1061) {
        super.Method_33797(f, f2, f3, f4, f5, f6, class_1061);
        this.Field_43554.Field_31968 = f4 / (0.036585364f * 1566.0846f);
        this.Field_43554.Field_31984 = f5 / (11.459155f * 5.0f);
    }

    public void Method_43557(Class_1061 class_1061, float f, float f2, float f3, float f4, float f5, float f6) {
        this.Method_43556(f, f2, f3, f4, f5, f6, class_1061);
        this.Field_43554.Method_31999(f6);
    }
}

