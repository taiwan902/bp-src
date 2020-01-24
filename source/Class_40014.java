/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;

public class Class_40014
extends Class_38640 {
    private final Class_19169 Field_40015;

    protected void Method_40016(Class_39158 class_39158, Class_22553 class_22553, Class_22553 class_225532) {
        this.Field_40015.Method_19173(class_22553, class_225532);
    }

    protected void Method_40017(Class_39158 class_39158, Object object, Class_22553 class_22553) {
        this.Method_40016(class_39158, (Class_22553)object, class_22553);
    }

    public Class_40014(Cipher cipher) {
        this.Field_40015 = new Class_19169(cipher);
    }

    private void Method_40018() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

