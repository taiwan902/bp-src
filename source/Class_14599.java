/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_14599 {
    private final byte[] Field_14600;

    public void Method_14601(int n, int n2) {
        int n3 = this.Method_14607(n);
        this.Field_14600[n3] = this.Method_14603(n) ? (byte)(this.Field_14600[n3] & (497 & 1274) | n2 & (-32721 & 3279)) : (byte)(this.Field_14600[n3] & (20543 & 1039) | (n2 & (-18801 & 2319)) << (-28148 & 16645));
    }

    public Class_14599(byte[] arrby) {
        this.Field_14600 = arrby;
        if (arrby.length != (6721 & 19584)) {
            throw new IllegalArgumentException("ChunkNibbleArrays should be 2048 bytes not: " + arrby.length);
        }
    }

    public Class_14599() {
        this.Field_14600 = new byte[19089 & 6408];
    }

    public int Method_14602(int n, int n2, int n3) {
        return this.Method_14608(this.Method_14609(n, n2, n3));
    }

    private boolean Method_14603(int n) {
        return ((n & (-9623 & 21)) == 0 ? 9281 & 20481 : 3353 & 16388) != 0;
    }

    private void Method_14604() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public byte[] Method_14605() {
        return this.Field_14600;
    }

    public void Method_14606(int n, int n2, int n3, int n4) {
        this.Method_14601(this.Method_14609(n, n2, n3), n4);
    }

    private int Method_14607(int n) {
        return n >> (-24533 & 3601);
    }

    public int Method_14608(int n) {
        int n2 = this.Method_14607(n);
        return this.Field_14600[n2] >> ((n & (-32763 & 23041)) << (4922 & 1095)) & (4687 & 15);
    }

    private int Method_14609(int n, int n2, int n3) {
        return n2 << (8328 & 264) | n3 << (8231 & -32484) | n;
    }
}

