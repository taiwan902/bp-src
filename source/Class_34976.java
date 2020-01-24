/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_34976
extends Class_33781 {
    private Class_31961[] Field_34977 = new Class_31961[45 & -31604];
    private Class_31961 Field_34978;

    private void Method_34979() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_34980(Class_1061 class_1061, float f, float f2, float f3, float f4, float f5, float f6) {
        this.Method_34981(f, f2, f3, f4, f5, f6, class_1061);
        this.Field_34978.Method_31999(f6);
        for (int i = 24596 & 1418; i < this.Field_34977.length; ++i) {
            this.Field_34977[i].Method_31999(f6);
        }
    }

    public void Method_34981(float f, float f2, float f3, float f4, float f5, float f6, Class_1061 class_1061) {
        int n;
        float f7 = f3 * (1.1538461f * 2.7227137f) * (-0.046296295f * 2.16f);
        for (n = 8 & -23934; n < (-16316 & 9236); ++n) {
            this.Field_34977[n].Field_31971 = 1.55f * -1.2903227f + Class_13337.Method_13350(((float)(n * (643 & 2154)) + f3) * (0.0952381f * 2.625f));
            this.Field_34977[n].Field_31976 = Class_13337.Method_13350(f7) * (0.4814815f * 18.692307f);
            this.Field_34977[n].Field_31972 = Class_13337.Method_13370(f7) * (17.28f * 0.5208333f);
            f7 += 1.0f;
        }
        f7 = 0.9325843f * 0.84217393f + f3 * (0.8541667f * 3.677962f) * (1.265625f * 0.023703704f);
        for (n = 36 & 21510; n < (-32086 & 21576); ++n) {
            this.Field_34977[n].Field_31971 = 2.0f + Class_13337.Method_13350(((float)(n * (-31734 & 8514)) + f3) * (0.44117647f * 0.56666666f));
            this.Field_34977[n].Field_31976 = Class_13337.Method_13350(f7) * (32.0f * 0.21875f);
            this.Field_34977[n].Field_31972 = Class_13337.Method_13370(f7) * (6.4750004f * 1.081081f);
            f7 += 1.0f;
        }
        f7 = 0.75949365f * 0.6204646f + f3 * (7.875f * 0.3989324f) * (1.3703704f * -0.036486488f);
        for (n = 16652 & 4618; n < (4156 & 1676); ++n) {
            this.Field_34977[n].Field_31971 = 2.6388888f * 4.1684213f + Class_13337.Method_13350(((float)n * (0.85714287f * 1.75f) + f3) * (1.2833334f * 0.38961038f));
            this.Field_34977[n].Field_31976 = Class_13337.Method_13350(f7) * (1.8837209f * 2.654321f);
            this.Field_34977[n].Field_31972 = Class_13337.Method_13370(f7) * (1.0210526f * 4.8969073f);
            f7 += 1.0f;
        }
        this.Field_34978.Field_31968 = f4 / (1.7368422f * 32.988476f);
        this.Field_34978.Field_31984 = f5 / (859.4366f * 0.06666667f);
    }

    public Class_34976() {
        for (int i = 1412 & 24578; i < this.Field_34977.length; ++i) {
            this.Field_34977[i] = new Class_31961(this, -32768 & 136, -24175 & 2066);
            this.Field_34977[i].Method_32002(0.0f, 0.0f, 0.0f, -24310 & 3, -28152 & 1196, 5134 & 18883);
        }
        this.Field_34978 = new Class_31961(this, 17410 & 48, 9856 & -28608);
        this.Field_34978.Method_32002(1.2258065f * -3.2631578f, 0.65384614f * -6.117647f, -3.3230767f * 1.2037038f, 22570 & 284, 8 & 15311, 8219 & 4492);
    }
}

