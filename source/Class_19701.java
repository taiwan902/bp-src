/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.nio.Buffer;
import java.nio.ByteBuffer;

public final class Class_19701
extends Class_14963 {
    private static final boolean Field_19702 = Class_7799.Method_7858();

    protected Class_43430 Method_19703(int n) {
        if (Field_19702) {
            return Class_45760.Method_45774(n);
        }
        return Class_46609.Method_46615(n);
    }

    boolean Method_19704() {
        return (25601 & 2697) != 0;
    }

    protected void Method_19705(Class_8772 class_8772) {
        Class_7799.Method_7848((ByteBuffer)class_8772.Field_8778);
    }

    protected Class_8772 Method_19706(int n, int n2, int n3, int n4) {
        return new Class_8772(this, ByteBuffer.allocateDirect(n4), n, n2, n3, n4);
    }

    protected Class_8772 Method_19707(int n) {
        return new Class_8772(this, ByteBuffer.allocateDirect(n), n);
    }

    Class_19701(Class_39208 class_39208, int n, int n2, int n3, int n4) {
        super(class_39208, n, n2, n3, n4);
    }

    protected void Method_19708(Object object, int n, Object object2, int n2, int n3) {
        this.Method_19709((ByteBuffer)object, n, (ByteBuffer)object2, n2, n3);
    }

    protected void Method_19709(ByteBuffer byteBuffer, int n, ByteBuffer byteBuffer2, int n2, int n3) {
        if (n3 == 0) {
            return;
        }
        if (Field_19702) {
            Class_7799.Method_7855(Class_7799.Method_7826(byteBuffer) + (long)n, Class_7799.Method_7826(byteBuffer2) + (long)n2, n3);
        } else {
            byteBuffer = byteBuffer.duplicate();
            byteBuffer2 = byteBuffer2.duplicate();
            byteBuffer.position(n).limit(n + n3);
            byteBuffer2.position(n2);
            byteBuffer2.put(byteBuffer);
        }
    }

    private void Method_19710() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

