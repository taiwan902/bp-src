/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_30060
extends Class_26421 {
    private final Class_43918 Field_30061;
    private Class_626 Field_30062;
    private int Field_30063;
    private final Class_7434 Field_30064;

    public void Method_30065(Class_626 class_626, Class_23823 class_23823) {
        Class_23823 class_238232;
        Class_23823 class_238233;
        this.Method_30069(class_23823);
        Class_6757 class_6757 = this.Field_30061.Method_43936();
        if (class_6757 != null && (this.Method_30070(class_6757, class_238232 = this.Field_30061.Method_43932(-32428 & 17408), class_238233 = this.Field_30061.Method_43932(-10431 & 29)) || this.Method_30070(class_6757, class_238233, class_238232))) {
            this.Field_30064.Method_7439(class_6757);
            class_626.Method_750(Class_19863.Field_19868);
            if (class_238232 != null && class_238232.Field_23826 <= 0) {
                class_238232 = null;
            }
            if (class_238233 != null && class_238233.Field_23826 <= 0) {
                class_238233 = null;
            }
            this.Field_30061.Method_43927(9221 & 22610, class_238232);
            this.Field_30061.Method_43927(21797 & 8769, class_238233);
        }
    }

    private void Method_30066() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_30060(Class_626 class_626, Class_7434 class_7434, Class_43918 class_43918, int n, int n2, int n3) {
        super(class_43918, n, n2, n3);
        this.Field_30062 = class_626;
        this.Field_30064 = class_7434;
        this.Field_30061 = class_43918;
    }

    public Class_23823 Method_30067(int n) {
        if (this.\u0000strictfp()) {
            this.Field_30063 += Math.min(n, this.\u0000strictfp().Field_23826);
        }
        return super.Method_26427(n);
    }

    public boolean Method_30068(Class_23823 class_23823) {
        return (6272 & -24288) != 0;
    }

    protected void Method_30069(Class_23823 class_23823) {
        class_23823.Method_23848(this.Field_30062.\u0000strictfp, this.Field_30062, this.Field_30063);
        this.Field_30063 = 20544 & -32360;
    }

    private boolean Method_30070(Class_6757 class_6757, Class_23823 class_23823, Class_23823 class_238232) {
        Class_23823 class_238233 = class_6757.Method_6770();
        Class_23823 class_238234 = class_6757.Method_6765();
        if (class_23823 != null && class_23823.Method_23844() == class_238233.Method_23844()) {
            if (class_238234 != null && class_238232 != null && class_238234.Method_23844() == class_238232.Method_23844()) {
                class_23823.Field_23826 -= class_238233.Field_23826;
                class_238232.Field_23826 -= class_238234.Field_23826;
                return (10361 & -16383) != 0;
            }
            if (class_238234 == null && class_238232 == null) {
                class_23823.Field_23826 -= class_238233.Field_23826;
                return (16385 & 773) != 0;
            }
        }
        return (7296 & -32745) != 0;
    }

    protected void Method_30071(Class_23823 class_23823, int n) {
        this.Field_30063 += n;
        this.Method_30069(class_23823);
    }
}

