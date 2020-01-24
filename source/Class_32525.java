/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_32525 {
    private long Field_32526;
    private String Field_32527;
    private String Field_32528;

    public String Method_32529() {
        return this.Field_32528;
    }

    private void Method_32530() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_32531() {
        this.Field_32526 = Class_18.Method_207();
    }

    public Class_32525(String string, String string2) {
        this.Field_32528 = string;
        this.Field_32527 = string2;
        this.Field_32526 = Class_18.Method_207();
    }

    public String Method_32532() {
        return this.Field_32527;
    }
}

