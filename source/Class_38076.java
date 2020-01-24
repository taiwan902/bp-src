/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_38076
implements Class_1486 {
    private String Field_38077;

    public Class_38076(String string) {
        if (string.length() > (7532 & 8820)) {
            string = string.substring(24737 & 4096, -15244 & 4204);
        }
        this.Field_38077 = string;
    }

    public void Method_38078(Class_10930 class_10930) {
        class_10930.Method_10943(this);
    }

    public void Method_38079(Class_29900 class_29900) {
        this.Field_38077 = class_29900.Method_29991(-32666 & 3197);
    }

    private void Method_38080() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_38076() {
    }

    public String Method_38081() {
        return this.Field_38077;
    }

    public void Method_38082(Class_29900 class_29900) {
        class_29900.Method_29960(this.Field_38077);
    }

    public void Method_38083(Class_10954 class_10954) {
        this.Method_38078((Class_10930)class_10954);
    }
}

