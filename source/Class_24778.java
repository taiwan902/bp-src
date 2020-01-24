/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.security.PublicKey;

public class Class_24778
implements Class_1486 {
    private byte[] Field_24779;
    public boolean Field_24780;
    private PublicKey Field_24781;
    private String Field_24782;

    public String Method_24783() {
        return this.Field_24782;
    }

    public Class_24778(String string, PublicKey publicKey, byte[] arrby) {
        this.Field_24782 = string;
        this.Field_24781 = publicKey;
        this.Field_24779 = arrby;
    }

    private void Method_24784() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_24785(Class_29900 class_29900) {
        this.Field_24782 = class_29900.Method_29991(-28524 & 1054);
        this.Field_24781 = Class_31852.Method_31865(class_29900.Method_29950());
        this.Field_24779 = class_29900.Method_29950();
    }

    public byte[] Method_24786() {
        return this.Field_24779;
    }

    public void Method_24787(Class_29900 class_29900) {
        class_29900.Method_29960(this.Field_24782);
        class_29900.Method_29946(this.Field_24781.getEncoded());
        class_29900.Method_29946(this.Field_24779);
        if (class_29900.Method_30014() == (7169 & 16413)) {
            this.Field_24780 = class_29900.Method_29962();
        }
    }

    public void Method_24788(Class_17034 class_17034) {
        class_17034.Method_17035(this);
    }

    public PublicKey Method_24789() {
        return this.Field_24781;
    }

    public void Method_24790(Class_10954 class_10954) {
        this.Method_24788((Class_17034)class_10954);
    }

    public Class_24778() {
    }
}

