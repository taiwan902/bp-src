/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_27162
extends Class_26535 {
    private final Class_23823 Field_27163;
    private float Field_27164;
    private boolean Field_27165;

    private void Method_27166() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_27162 Method_27167(float f) {
        this.Field_27164 = f;
        return this;
    }

    public Class_27162(Class_23823 class_23823, int n) {
        super(n);
        this.Field_27163 = class_23823;
    }

    public Class_27162 Method_27168() {
        this.Field_27165 = -24477 & 5641;
        return this;
    }

    public Class_23823 Method_27169(Random random) {
        Class_23823 class_23823 = this.Field_27163.Method_23850();
        if (this.Field_27164 > 0.0f) {
            int n = (int)(this.Field_27164 * (float)this.Field_27163.Method_23859());
            int n2 = class_23823.Method_23859() - random.nextInt(random.nextInt(n) + (16905 & 8229));
            if (n2 > n) {
                n2 = n;
            }
            if (n2 < (-24443 & 6683)) {
                n2 = 13313 & -16255;
            }
            class_23823.Method_23849(n2);
        }
        if (this.Field_27165) {
            Class_29642.Method_29673(random, class_23823, 30 & -27873);
        }
        return class_23823;
    }
}

