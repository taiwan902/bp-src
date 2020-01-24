/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_37934
extends Class_1956 {
    public final int Field_37935 = 8312 & 546;
    private int Field_37936;
    private final float Field_37937;
    private boolean Field_37938;
    private final int Field_37939;
    private int Field_37940;
    private final boolean Field_37941;
    private float Field_37942;
    private int Field_37943;

    public int Method_37944(Class_23823 class_23823) {
        return 17524 & 8872;
    }

    public Class_25567 Method_37945(Class_23823 class_23823) {
        return Class_25567.Field_25571;
    }

    public Class_23823 Method_37946(Class_23823 class_23823, Class_283 class_283, Class_626 class_626) {
        if (class_626.Method_754(this.Field_37938)) {
            class_626.Method_848(class_23823, this.Method_37944(class_23823));
        }
        return class_23823;
    }

    public Class_37934(int n, boolean bl) {
        this(n, 1.4250001f * 0.42105263f, bl);
    }

    public Class_37934 Method_37947() {
        this.Field_37938 = -19911 & 19459;
        return this;
    }

    public float Method_37948(Class_23823 class_23823) {
        return this.Field_37937;
    }

    private void Method_37949() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_23823 Method_37950(Class_23823 class_23823, Class_283 class_283, Class_626 class_626) {
        class_23823.Field_23826 -= 12291 & 1537;
        class_626.Method_711().Method_26079(this, class_23823);
        class_283.Method_519(class_626, "random.burp", 1.8214285f * 0.27450982f, class_283.Field_307.nextFloat() * (0.069148935f * 1.4461539f) + 0.42127657f * 2.1363637f);
        this.Method_37954(class_23823, class_283, class_626);
        class_626.Method_750(Class_19863.Field_19917[Class_1956.Method_1986(this)]);
        return class_23823;
    }

    public int Method_37951(Class_23823 class_23823) {
        return this.Field_37939;
    }

    public Class_37934(int n, float f, boolean bl) {
        this.Field_37939 = n;
        this.Field_37941 = bl;
        this.Field_37937 = f;
        this.\u0000strictfp(Class_3987.Field_3988);
    }

    public Class_37934 Method_37952(int n, int n2, int n3, float f) {
        this.Field_37943 = n;
        this.Field_37940 = n2;
        this.Field_37936 = n3;
        this.Field_37942 = f;
        return this;
    }

    public boolean Method_37953() {
        return this.Field_37941;
    }

    protected void Method_37954(Class_23823 class_23823, Class_283 class_283, Class_626 class_626) {
        if (!class_283.Field_306 && this.Field_37943 > 0 && class_283.Field_307.nextFloat() < this.Field_37942) {
            class_626.\u0000, `(new Class_25240(this.Field_37943, this.Field_37940 * (-31147 & 8244), this.Field_37936));
        }
    }
}

