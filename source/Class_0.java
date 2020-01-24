/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.net.Authenticator;
import java.net.PasswordAuthentication;

public final class Class_0
extends Authenticator {
    final String Field_1;
    final String Field_2;

    private void Method_3() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_0(String string, String string2) {
        this.Field_2 = string;
        this.Field_1 = string2;
    }

    protected PasswordAuthentication Method_4() {
        return new PasswordAuthentication(this.Field_2, this.Field_1.toCharArray());
    }
}

