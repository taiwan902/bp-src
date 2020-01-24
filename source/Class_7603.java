/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_7603 {
    public final byte[] Field_7604;
    private final int Field_7605;
    private final int Field_7606;

    public int Method_7607(int n, int n2, int n3) {
        int n4 = n << this.Field_7605 | n3 << this.Field_7606 | n2;
        int n5 = n4 >> (-16383 & 1135);
        int n6 = n4 & (-30691 & 4227);
        return n6 == 0 ? this.Field_7604[n5] & (4111 & 527) : this.Field_7604[n5] >> (-25500 & 25094) & (22543 & 1055);
    }

    private void Method_7608() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_7603(byte[] arrby, int n) {
        this.Field_7604 = arrby;
        this.Field_7606 = n;
        this.Field_7605 = n + (-32252 & 10373);
    }
}

