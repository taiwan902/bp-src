/*
 * Decompiled with CFR 0.145.
 */
import java.io.IOException;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_32319
implements Class_1486 {
    private Class_29900 Field_32320;
    private String Field_32321;

    public Class_32319(String string, Class_29900 class_29900) {
        this.Field_32321 = string;
        this.Field_32320 = class_29900;
        if (class_29900.Method_29958() > (1056932 & 691667987)) {
            throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
        }
    }

    public void Method_32322(Class_14856 class_14856) {
        class_14856.Method_14862(this);
    }

    public Class_29900 Method_32323() {
        return this.Field_32320;
    }

    public String Method_32324() {
        return this.Field_32321;
    }

    public Class_32319() {
    }

    public void Method_32325(Class_29900 class_29900) {
        this.Field_32321 = class_29900.Method_29991(9300 & 23446);
        int n = class_29900.Method_30014();
        if (n < 0 || n > (1150304256 & 137962112)) {
            throw new IOException("Payload may not be larger than 1048576 bytes");
        }
        this.Field_32320 = new Class_29900(class_29900.Method_29951(n));
    }

    public void Method_32326(Class_10954 class_10954) {
        this.Method_32322((Class_14856)class_10954);
    }

    public void Method_32327(Class_29900 class_29900) {
        class_29900.Method_29960(this.Field_32321);
        class_29900.Method_29909(this.Field_32320);
    }

    private void Method_32328() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

