/*
 * Decompiled with CFR 0.145.
 */
import java.io.ByteArrayOutputStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_23100
extends ByteArrayOutputStream {
    final Class_9828 Field_23101;
    private int Field_23102;
    private int Field_23103;

    public void Method_23104() {
        this.Field_23101.Method_9842(this.Field_23103, this.Field_23102, this.buf, this.count);
    }

    private void Method_23105() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_23100(Class_9828 class_9828, int n, int n2) {
        this.Field_23101 = class_9828;
        super(24504 & -16415);
        this.Field_23103 = n;
        this.Field_23102 = n2;
    }
}

