/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_32448
implements Runnable {
    private Class_16200 Field_32449 = null;
    private String Field_32450 = null;

    private void Method_32451() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_32448(String string, Class_16200 class_16200) {
        this.Field_32450 = string;
        this.Field_32449 = class_16200;
    }

    public void Method_32452() {
        try {
            byte[] arrby = Class_15260.Method_15262(this.Field_32450);
            this.Field_32449.Method_16201(this.Field_32450, arrby, null);
        }
        catch (Exception exception) {
            this.Field_32449.Method_16201(this.Field_32450, null, exception);
        }
    }
}

