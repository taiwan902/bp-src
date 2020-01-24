/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_14754
implements Runnable {
    final Class_39604 Field_14755;
    final Class_19025 Field_14756;

    private void Method_14757() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_14754(Class_19025 class_19025, Class_39604 class_39604) {
        this.Field_14756 = class_19025;
        this.Field_14755 = class_39604;
    }

    public void Method_14758() {
        try {
            Class_18 class_18 = Class_18.Field_89;
            if (this.Field_14755.Field_39605 == (2581 & -32602)) {
                if (((Boolean)class_18.Field_84.Field_39732.Field_8892.\u0000strictfp()).booleanValue()) {
                    class_18.Field_105.Method_45456(this.Field_14755.Field_39606, (17408 & 39) != 0);
                }
            } else if (this.Field_14755.Field_39605 == (3359 & -32253)) {
                if (((Boolean)class_18.Field_84.Field_39732.Field_8892.\u0000strictfp()).booleanValue()) {
                    class_18.Field_105.Method_45458().Method_41188(this.Field_14755.Field_39606);
                }
            } else if (this.Field_14755.Field_39605 == (20894 & -29630)) {
                class_18.Field_105.Method_45456(this.Field_14755.Field_39606, (-21758 & 1184) != 0);
            } else {
                class_18.Field_105.Method_45458().Method_41188(this.Field_14755.Field_39606);
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }
}

