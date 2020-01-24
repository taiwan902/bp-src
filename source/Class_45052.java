/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_45052
extends Class_38126
implements Class_41723 {
    private final Class_22553 Field_45053;

    public Class_23010 Method_45054() {
        return this.Method_45057();
    }

    public Class_22553 Method_45055() {
        return this.Field_45053;
    }

    private void Method_45056() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_41723 Method_45057() {
        this.Field_45053.Method_22637();
        return this;
    }

    public Class_45052(Class_22553 class_22553) {
        if (class_22553 == null) {
            throw new NullPointerException("content");
        }
        this.Field_45053 = class_22553;
    }

    public boolean Method_45058() {
        return this.Field_45053.release();
    }

    public int Method_45059() {
        return this.Field_45053.refCnt();
    }

    public Class_21482 Method_45060() {
        return this.Method_45057();
    }

    public String Method_45061() {
        return Class_22304.Method_22312(this) + "(data: " + this.Method_45055() + ", decoderResult: " + this.getDecoderResult() + (char)(16825 & -30167);
    }
}

