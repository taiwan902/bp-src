/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.nio.ByteOrder;

public final class Class_35333
extends Class_30534 {
    private final Class_34813 Field_35334;
    private final boolean Field_35335;
    private static final boolean Field_35336 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN ? -6013 & 529 : 4120 & 8256;

    public int Method_35337(int n) {
        return this.Method_35352(n) & (704708607 & 524287);
    }

    private void Method_35338(int n, long l) {
        Class_7799.Method_7836(this.Method_35355(n), this.Field_35335 ? l : Long.reverseBytes(l));
    }

    public Class_22553 Method_35339(int n) {
        this.Method_35350(n);
        return this;
    }

    private void Method_35340() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private void Method_35341(int n, int n2) {
        Class_7799.Method_7851(this.Method_35355(n), this.Field_35335 ? (short)n2 : Short.reverseBytes((short)n2));
    }

    public Class_22553 Method_35342(int n) {
        this.Field_35334.Method_34852();
        this.Field_35334.Method_34821(-32764 & 24588);
        this.Method_35347(this.Field_35334.Field_34817, n);
        this.Field_35334.Field_34817 += 24838 & -28619;
        return this;
    }

    public Class_22553 Method_35343(int n, int n2) {
        this.Field_35334.Method_34909(n, 92 & -22394);
        this.Method_35347(n, n2);
        return this;
    }

    public long Method_35344(int n) {
        return (long)this.Method_35349(n) & (0xFFFFFFFFL & 0xFFFFFFFFL);
    }

    public Class_22553 Method_35345(float f) {
        this.Method_35342(Float.floatToRawIntBits(f));
        return this;
    }

    public Class_22553 Method_35346(long l) {
        this.Field_35334.Method_34852();
        this.Field_35334.Method_34821(2312 & 8847);
        this.Method_35338(this.Field_35334.Field_34817, l);
        this.Field_35334.Field_34817 += 6702 & 9497;
        return this;
    }

    private void Method_35347(int n, int n2) {
        Class_7799.Method_7821(this.Method_35355(n), this.Field_35335 ? n2 : Integer.reverseBytes(n2));
    }

    public long Method_35348(int n) {
        this.Field_35334.Method_34909(n, -32756 & 8472);
        long l = Class_7799.Method_7837(this.Method_35355(n));
        return this.Field_35335 ? l : Long.reverseBytes(l);
    }

    public int Method_35349(int n) {
        this.Field_35334.Method_34909(n, 16389 & 1028);
        int n2 = Class_7799.Method_7854(this.Method_35355(n));
        return this.Field_35335 ? n2 : Integer.reverseBytes(n2);
    }

    Class_35333(Class_34813 class_34813) {
        super(class_34813);
        this.Field_35334 = class_34813;
        this.Field_35335 = Field_35336 == (this.order() == ByteOrder.BIG_ENDIAN ? -10111 & 629 : 5 & 13312) ? 2117 & 20753 : -32436 & 8370;
    }

    public Class_22553 Method_35350(int n) {
        this.Field_35334.Method_34852();
        this.Field_35334.Method_34821(-14418 & 14338);
        this.Method_35341(this.Field_35334.Field_34817, n);
        this.Field_35334.Field_34817 += -27629 & 26630;
        return this;
    }

    public Class_22553 Method_35351(double d) {
        this.Method_35346(Double.doubleToRawLongBits(d));
        return this;
    }

    public short Method_35352(int n) {
        this.Field_35334.Method_34909(n, 18406 & 6147);
        short s = Class_7799.Method_7861(this.Method_35355(n));
        return this.Field_35335 ? s : Short.reverseBytes(s);
    }

    public Class_22553 Method_35353(int n, long l) {
        this.Field_35334.Method_34909(n, 6698 & 17421);
        this.Method_35338(n, l);
        return this;
    }

    public Class_22553 Method_35354(int n, int n2) {
        this.Field_35334.Method_34909(n, 5090 & 2);
        this.Method_35341(n, n2);
        return this;
    }

    private long Method_35355(int n) {
        return this.Field_35334.memoryAddress() + (long)n;
    }
}

