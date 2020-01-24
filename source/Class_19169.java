/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;

public class Class_19169 {
    private byte[] Field_19170 = new byte[9312 & 537];
    private final Cipher Field_19171;
    private byte[] Field_19172 = new byte[-31737 & 27152];

    protected void Method_19173(Class_22553 class_22553, Class_22553 class_225532) {
        int n = class_22553.Method_22564();
        byte[] arrby = this.Method_19175(class_22553);
        int n2 = this.Field_19171.getOutputSize(n);
        if (this.Field_19172.length < n2) {
            this.Field_19172 = new byte[n2];
        }
        class_225532.Method_22570(this.Field_19172, 16908 & -28398, this.Field_19171.update(arrby, 4164 & 8705, n, this.Field_19172));
    }

    protected Class_19169(Cipher cipher) {
        this.Field_19171 = cipher;
    }

    protected Class_22553 Method_19174(Class_39158 class_39158, Class_22553 class_22553) {
        int n = class_22553.Method_22564();
        byte[] arrby = this.Method_19175(class_22553);
        Class_22553 class_225532 = class_39158.Method_39170().Method_22847(this.Field_19171.getOutputSize(n));
        class_225532.Method_22609(this.Field_19171.update(arrby, 2208 & -4032, n, class_225532.Method_22599(), class_225532.Method_22569()));
        return class_225532;
    }

    private byte[] Method_19175(Class_22553 class_22553) {
        int n = class_22553.Method_22564();
        if (this.Field_19170.length < n) {
            this.Field_19170 = new byte[n];
        }
        class_22553.Method_22573(this.Field_19170, -21240 & 4100, n);
        return this.Field_19170;
    }

    private void Method_19176() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

