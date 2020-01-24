/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_18443
implements Class_5591 {
    private final Random Field_18444 = new Random();
    private Class_23763 Field_18445;
    private final Class_18 Field_18446;
    private int Field_18447 = -7964 & 612;

    public void Method_18448() {
        Class_13603 class_13603 = this.Field_18446.Method_154();
        if (this.Field_18445 != null) {
            if (!class_13603.Method_13629().Method_2087(this.Field_18445.Method_23765())) {
                this.Field_18446.Method_245().Method_29115(this.Field_18445);
                this.Field_18447 = Class_13337.Method_13379(this.Field_18444, 2688 & -15323, class_13603.Method_13622() / (21050 & 8194));
            }
            if (!this.Field_18446.Method_245().Method_29121(this.Field_18445)) {
                this.Field_18445 = null;
                this.Field_18447 = Math.min(Class_13337.Method_13379(this.Field_18444, class_13603.Method_13622(), class_13603.Method_13628()), this.Field_18447);
            }
        }
        if (this.Field_18445 == null) {
            int n = this.Field_18447;
            this.Field_18447 = n - (273 & 2053);
            if (n <= 0) {
                this.Method_18450(class_13603);
            }
        }
    }

    public Class_18443(Class_18 class_18) {
        this.Field_18446 = class_18;
    }

    public void Method_18449() {
        if (this.Field_18445 != null) {
            this.Field_18446.Method_245().Method_29115(this.Field_18445);
            this.Field_18445 = null;
            this.Field_18447 = 12294 & -14951;
        }
    }

    public void Method_18450(Class_13603 class_13603) {
        this.Field_18445 = Class_29471.Method_29472(class_13603.Method_13629());
        this.Field_18446.Method_245().Method_29119(this.Field_18445);
        this.Field_18447 = Integer.MAX_VALUE & Integer.MAX_VALUE;
    }

    private void Method_18451() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

