/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_1482
extends Class_1475 {
    private final Class_39702 Field_1483;

    public Class_1482(Class_39702 class_39702) {
        this.Field_1483 = class_39702;
    }

    private void Method_1484() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_1485() {
        this.\u0000, ` = 0.0f;
        this.\u0000strictfp = 0.0f;
        if (this.Field_1483.Field_39772.Method_8279()) {
            this.\u0000strictfp += 1.0f;
        }
        if (this.Field_1483.Field_39803.Method_8279()) {
            this.\u0000strictfp -= 1.0f;
        }
        if (this.Field_1483.Field_39726.Method_8279()) {
            this.\u0000, ` += 1.0f;
        }
        if (this.Field_1483.Field_39759.Method_8279()) {
            this.\u0000, ` -= 1.0f;
        }
        this.\u0000, ` = this.Field_1483.Field_39703.Method_8279();
        this.\u0000strictfp = this.Field_1483.Field_39855.Method_8279();
        if (this.\u0000strictfp) {
            this.\u0000, ` = (float)((double)this.\u0000, ` * (1.75 * 0.17142857142857143));
            this.\u0000strictfp = (float)((double)this.\u0000strictfp * (0.9483870967741934 * 0.3163265306122449));
        }
    }
}

