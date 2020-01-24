/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import javax.crypto.SecretKey;

public class Class_20060
implements Class_18600 {
    final Class_26487 Field_20061;
    final SecretKey Field_20062;
    final Class_24778 Field_20063;

    private void Method_20064() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_20060(Class_26487 class_26487, Class_24778 class_24778, SecretKey secretKey) {
        this.Field_20061 = class_26487;
        this.Field_20063 = class_24778;
        this.Field_20062 = secretKey;
    }

    public void Method_20065(Class_21065 class_21065) {
        Class_26487.Method_26498((Class_26487)this.Field_20061).Field_44593.Method_6822(8470 & -16306);
        if (!this.Field_20063.Field_24780) {
            Class_26487.Method_26498(this.Field_20061).Method_44603(this.Field_20062);
        }
    }
}

