/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public final class Class_36010
extends Class_14963 {
    protected void Method_36011(Class_8772 class_8772) {
    }

    protected void Method_36012(Object object, int n, Object object2, int n2, int n3) {
        this.Method_36016((byte[])object, n, (byte[])object2, n2, n3);
    }

    Class_36010(Class_39208 class_39208, int n, int n2, int n3, int n4) {
        super(class_39208, n, n2, n3, n4);
    }

    protected Class_43430 Method_36013(int n) {
        return Class_43474.Method_43476(n);
    }

    protected Class_8772 Method_36014(int n) {
        return new Class_8772(this, new byte[n], n);
    }

    protected Class_8772 Method_36015(int n, int n2, int n3, int n4) {
        return new Class_8772(this, new byte[n4], n, n2, n3, n4);
    }

    protected void Method_36016(byte[] arrby, int n, byte[] arrby2, int n2, int n3) {
        if (n3 == 0) {
            return;
        }
        System.arraycopy(arrby, n, arrby2, n2, n3);
    }

    private void Method_36017() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    boolean Method_36018() {
        return (24608 & 1421) != 0;
    }
}

