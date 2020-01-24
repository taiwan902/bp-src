/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.security.PrivateKey;
import java.security.PublicKey;
import javax.crypto.SecretKey;

public class Class_32180
implements Class_1486 {
    private byte[] Field_32181;
    private byte[] Field_32182;

    public void Method_32183(Class_12050 class_12050) {
        class_12050.Method_12052(this);
    }

    private void Method_32184() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_32185(Class_29900 class_29900) {
        class_29900.Method_29946(this.Field_32182);
        class_29900.Method_29946(this.Field_32181);
    }

    public SecretKey Method_32186(PrivateKey privateKey) {
        return Class_31852.Method_31864(privateKey, this.Field_32182);
    }

    public void Method_32187(Class_29900 class_29900) {
        this.Field_32182 = class_29900.Method_29950();
        this.Field_32181 = class_29900.Method_29950();
    }

    public void Method_32188(Class_10954 class_10954) {
        this.Method_32183((Class_12050)class_10954);
    }

    public byte[] Method_32189(PrivateKey privateKey) {
        return privateKey == null ? this.Field_32181 : Class_31852.Method_31862(privateKey, this.Field_32181);
    }

    public Class_32180(SecretKey secretKey, PublicKey publicKey, byte[] arrby) {
        this.Field_32182 = new byte[17410 & 8709];
        this.Field_32181 = new byte[6664 & -16350];
        this.Field_32182 = Class_31852.Method_31855(publicKey, secretKey.getEncoded());
        this.Field_32181 = Class_31852.Method_31855(publicKey, arrby);
    }

    public Class_32180() {
        this.Field_32182 = new byte[1559 & -5920];
        this.Field_32181 = new byte[16400 & -24440];
    }
}

