/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_38536
extends Class_33781 {
    public Class_31961 Field_38537;

    public void Method_38538(float f, float f2, float f3, float f4, float f5, float f6, Class_1061 class_1061) {
        super.Method_33797(f, f2, f3, f4, f5, f6, class_1061);
        this.Field_38537.Field_31968 = f4 / (0.48387095f * 118.41128f);
        this.Field_38537.Field_31984 = f5 / (0.6164383f * 92.94649f);
    }

    public Class_38536() {
        this(144 & 22093, 4622 & -16271, 10302 & 21024, -32664 & 10272);
    }

    public void Method_38539(Class_1061 class_1061, float f, float f2, float f3, float f4, float f5, float f6) {
        this.Method_38538(f, f2, f3, f4, f5, f6, class_1061);
        this.Field_38537.Method_31999(f6);
    }

    private void Method_38540() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_38536(int n, int n2, int n3, int n4) {
        this.\u0000strictfp = n3;
        this.\u0000, ` = n4;
        this.Field_38537 = new Class_31961(this, n, n2);
        this.Field_38537.Method_31998(-4.4666667f * 0.67164177f, -10.823529f * 0.5543478f, -4.0f * 0.75f, 2694 & 16399, 25228 & 5384, 28998 & 695, 0.0f);
        this.Field_38537.Method_31993(0.0f, 0.0f, 0.0f);
    }
}

