/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.nio.ByteBuffer;

public class Class_13574 {
    private Class_6996 Field_13575;
    private int Field_13576;
    private final Class_11885 Field_13577;

    public void Method_13578() {
        this.Field_13575.Method_7012();
    }

    public void Method_13579() {
        this.Field_13575.Method_7005();
    }

    public Class_13574(Class_11885 class_11885) {
        this.Field_13577 = class_11885;
        this.Field_13575 = Class_6996.Method_7008();
    }

    public int Method_13580() {
        return this.Field_13576;
    }

    private void Method_13581() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_13582() {
        this.Field_13575.Method_7013();
    }

    public void Method_13583(ByteBuffer byteBuffer) {
        this.Field_13575.Method_7014(byteBuffer);
        this.Field_13576 = byteBuffer.limit() / this.Field_13577.Method_11903();
    }

    public void Method_13584(int n) {
        this.Field_13575.Method_7011(n, this.Field_13576);
    }
}

