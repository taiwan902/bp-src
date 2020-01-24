/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_37357
implements Class_1486 {
    private String Field_37358;
    private String Field_37359;

    public String Method_37360() {
        return this.Field_37358;
    }

    public void Method_37361(Class_14856 class_14856) {
        class_14856.Method_14913(this);
    }

    public String Method_37362() {
        return this.Field_37359;
    }

    public Class_37357(String string, String string2) {
        this.Field_37358 = string;
        this.Field_37359 = string2;
        if (string2.length() > (17578 & -32728)) {
            throw new IllegalArgumentException("Hash is too long (max 40, was " + string2.length() + ")");
        }
    }

    public void Method_37363(Class_10954 class_10954) {
        this.Method_37361((Class_14856)class_10954);
    }

    private void Method_37364() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_37357() {
    }

    public void Method_37365(Class_29900 class_29900) {
        this.Field_37358 = class_29900.Method_29991(32767 & -1);
        this.Field_37359 = class_29900.Method_29991(2216 & -11990);
    }

    public void Method_37366(Class_29900 class_29900) {
        class_29900.Method_29960(this.Field_37358);
        class_29900.Method_29960(this.Field_37359);
    }
}

