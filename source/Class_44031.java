/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_44031
extends Class_41056 {
    private final Class_3238 Field_44032;
    private String[] Field_44033;

    private void Method_44034() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public int Method_44035(Class_23823 class_23823, int n) {
        return this.Field_44032.Method_3366(this.Field_44032.Method_3342(class_23823.Method_23843()));
    }

    public Class_44031(Class_3238 class_3238, boolean bl) {
        super(class_3238);
        this.Field_44032 = class_3238;
        if (bl) {
            this.\u0000strictfp(12595 & 2060);
            this.\u0000strictfp((25089 & 7313) != 0);
        }
    }

    public int Method_44036(int n) {
        return n;
    }

    public String Method_44037(Class_23823 class_23823) {
        if (this.Field_44033 == null) {
            return super.Method_41062(class_23823);
        }
        int n = class_23823.Method_23843();
        return n >= 0 && n < this.Field_44033.length ? super.Method_41062(class_23823) + "." + this.Field_44033[n] : super.Method_41062(class_23823);
    }

    public Class_44031 Method_44038(String[] arrstring) {
        this.Field_44033 = arrstring;
        return this;
    }
}

