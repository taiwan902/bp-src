/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_8135 {
    private final float Field_8136;
    private float Field_8137;
    private final float Field_8138;
    private final float Field_8139;

    public float Method_8140() {
        return this.Field_8139;
    }

    public float Method_8141() {
        return this.Field_8137;
    }

    public Class_8135(float f, float f2, float f3) {
        this.Field_8136 = f;
        this.Field_8138 = f2;
        this.Field_8139 = f3;
        this.Field_8137 = this.Field_8138;
    }

    public void Method_8142() {
        this.Field_8137 = (float)((double)this.Field_8137 + (double)this.Field_8136 * Class_18.Field_89.Method_248().Field_2180);
        if (this.Field_8137 > this.Field_8139) {
            this.Field_8137 = this.Field_8139;
        }
    }

    public void Method_8143() {
        this.Field_8137 = (float)((double)this.Field_8137 - (double)this.Field_8136 * Class_18.Field_89.Method_248().Field_2180);
        if (this.Field_8137 < this.Field_8138) {
            this.Field_8137 = this.Field_8138;
        }
    }

    private void Method_8144() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public float Method_8145() {
        return this.Field_8138;
    }
}

