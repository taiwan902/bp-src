/*
 * Decompiled with CFR 0.145.
 */
import java.io.OutputStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;
import java.nio.charset.Charset;

public final class Class_32584
extends Class_22553 {
    private static final long Field_32585;
    private static final ByteBuffer Field_32586;
    private Class_32584 Field_32587;
    private final String Field_32588;
    private final ByteOrder Field_32589;
    private final Class_22837 Field_32590;

    public int Method_32591() {
        return -31232 & 32;
    }

    public int Method_32592() {
        return -31673 & 6688;
    }

    public int Method_32593() {
        return 4611 & 18833;
    }

    public ByteOrder Method_32594() {
        return this.Field_32589;
    }

    public Class_22553 Method_32595(Class_22553 class_22553, int n, int n2) {
        return this.Method_32602(n2);
    }

    public Class_22553 Method_32596(double d) {
        throw new IndexOutOfBoundsException();
    }

    public int Method_32597() {
        throw new IndexOutOfBoundsException();
    }

    public ByteBuffer Method_32598() {
        return Field_32586;
    }

    public long Method_32599() {
        if (this.Method_32682()) {
            return Field_32585;
        }
        throw new UnsupportedOperationException();
    }

    public Class_22553 Method_32600(int n) {
        throw new IndexOutOfBoundsException();
    }

    public Class_22553 Method_32601() {
        return this;
    }

    static {
        Field_32586 = ByteBuffer.allocateDirect(36 & -15864);
        long l = 7672813031470138370L & 68755472L;
        try {
            if (Class_7799.Method_7858()) {
                l = Class_7799.Method_7826(Field_32586);
            }
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        Field_32585 = l;
    }

    private Class_22553 Method_32602(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("length: " + n + " (expected: >= 0)");
        }
        if (n != 0) {
            throw new IndexOutOfBoundsException();
        }
        return this;
    }

    public int Method_32603() {
        return -32576 & 1294;
    }

    public int Method_32604(ScatteringByteChannel scatteringByteChannel, int n) {
        this.Method_32602(n);
        return 1120 & 8448;
    }

    public int Method_32605(Class_18115 class_18115) {
        return -1 & -1;
    }

    public Class_21482 Method_32606() {
        return this.Method_32609();
    }

    public short Method_32607(int n) {
        throw new IndexOutOfBoundsException();
    }

    public Class_22553 Method_32608(OutputStream outputStream, int n) {
        return this.Method_32602(n);
    }

    public Class_22553 Method_32609() {
        return this;
    }

    public int Method_32610() {
        return 17683 & -22400;
    }

    public Class_22553 Method_32611(int n, long l) {
        throw new IndexOutOfBoundsException();
    }

    public Class_22553 Method_32612() {
        return this;
    }

    public byte[] Method_32613() {
        return Class_23808.Field_23818;
    }

    public Class_32584(Class_22837 class_22837) {
        this(class_22837, ByteOrder.BIG_ENDIAN);
    }

    public int Method_32614() {
        return 15572 & 546;
    }

    public boolean Method_32615() {
        throw new IndexOutOfBoundsException();
    }

    public boolean Method_32616() {
        return (4240 & 9760) != 0;
    }

    public boolean Method_32617() {
        return (4116 & -30808) != 0;
    }

    public Class_22553 Method_32618(int n) {
        throw new ReadOnlyBufferException();
    }

    public Class_22553 Method_32619(int n, int n2) {
        throw new IndexOutOfBoundsException();
    }

    public int Method_32620() {
        throw new IndexOutOfBoundsException();
    }

    public Class_22553 Method_32621(int n) {
        return this.Method_32602(n);
    }

    public Class_22553 Method_32622(int n) {
        throw new IndexOutOfBoundsException();
    }

    public Class_22553 Method_32623(Class_22553 class_22553) {
        throw new IndexOutOfBoundsException();
    }

    public Class_22553 Method_32624(int n) {
        return this.Method_32602(n);
    }

    public long Method_32625(int n) {
        throw new IndexOutOfBoundsException();
    }

    public int Method_32626() {
        return 27136 & -31484;
    }

    public Class_22553 Method_32627(int n, byte[] arrby, int n2, int n3) {
        return this.Method_32684(n, n3);
    }

    public boolean Method_32628() {
        return (-22171 & 17) != 0;
    }

    public int Method_32629(int n) {
        throw new IndexOutOfBoundsException();
    }

    public ByteBuffer[] Method_32630() {
        ByteBuffer[] arrbyteBuffer = new ByteBuffer[555 & 20497];
        arrbyteBuffer[17413 & -32118] = Field_32586;
        return arrbyteBuffer;
    }

    public Class_22553 Method_32631(byte[] arrby) {
        return this.Method_32602(arrby.length);
    }

    public Class_22553 Method_32632(int n, Class_22553 class_22553, int n2, int n3) {
        return this.Method_32684(n, n3);
    }

    public Class_22553 Method_32633(byte[] arrby, int n, int n2) {
        return this.Method_32602(n2);
    }

    public Class_22553 Method_32634(int n, int n2) {
        this.Method_32688(n);
        this.Method_32688(n2);
        return this;
    }

    public int Method_32635(int n, GatheringByteChannel gatheringByteChannel, int n2) {
        this.Method_32684(n, n2);
        return 1420 & 20994;
    }

    public Class_22553 Method_32636(int n, Class_22553 class_22553, int n2, int n3) {
        return this.Method_32684(n, n3);
    }

    public Class_22553 Method_32637(byte[] arrby, int n, int n2) {
        return this.Method_32602(n2);
    }

    public long Method_32638() {
        throw new IndexOutOfBoundsException();
    }

    public Class_22553 Method_32639(int n, byte[] arrby, int n2, int n3) {
        return this.Method_32684(n, n3);
    }

    public int Method_32640() {
        return 29509 & 1057;
    }

    public short Method_32641() {
        throw new IndexOutOfBoundsException();
    }

    public int Method_32642(int n) {
        throw new IndexOutOfBoundsException();
    }

    public Class_22553 Method_32643(ByteBuffer byteBuffer) {
        return this.Method_32602(byteBuffer.remaining());
    }

    public Class_22553 Method_32644(int n) {
        return this.Method_32688(n);
    }

    public Class_22553 Method_32645() {
        return this;
    }

    public byte Method_32646() {
        throw new IndexOutOfBoundsException();
    }

    public Class_22553 Method_32647(int n, OutputStream outputStream, int n2) {
        return this.Method_32684(n, n2);
    }

    public short Method_32648() {
        throw new IndexOutOfBoundsException();
    }

    public int Method_32649(GatheringByteChannel gatheringByteChannel, int n) {
        this.Method_32602(n);
        return -32448 & 5144;
    }

    public Class_22553 Method_32650(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("minWritableBytes: " + n + " (expected: >= 0)");
        }
        if (n != 0) {
            throw new IndexOutOfBoundsException();
        }
        return this;
    }

    public Class_22553 Method_32651(ByteOrder byteOrder) {
        if (byteOrder == null) {
            throw new NullPointerException("endianness");
        }
        if (byteOrder == this.Method_32594()) {
            return this;
        }
        Class_32584 class_32584 = this.Field_32587;
        if (class_32584 != null) {
            return class_32584;
        }
        this.Field_32587 = class_32584 = new Class_32584(this.Method_32660(), byteOrder);
        return class_32584;
    }

    private Class_32584(Class_22837 class_22837, ByteOrder byteOrder) {
        if (class_22837 == null) {
            throw new NullPointerException("alloc");
        }
        this.Field_32590 = class_22837;
        this.Field_32589 = byteOrder;
        this.Field_32588 = Class_22304.Method_22312(this) + (byteOrder == ByteOrder.BIG_ENDIAN ? "BE" : "LE");
    }

    public Class_22553 Method_32652(int n, ByteBuffer byteBuffer) {
        return this.Method_32684(n, byteBuffer.remaining());
    }

    public Class_22553 Method_32653(int n) {
        return this.Method_32688(n);
    }

    public Class_22553 Method_32654(int n, byte[] arrby) {
        return this.Method_32684(n, arrby.length);
    }

    public Class_22553 Method_32655(boolean bl) {
        throw new IndexOutOfBoundsException();
    }

    public Class_22553 Method_32656(Class_22553 class_22553) {
        return this.Method_32602(class_22553.Method_22574());
    }

    public Class_22553 Method_32657() {
        return null;
    }

    public short Method_32658(int n) {
        throw new IndexOutOfBoundsException();
    }

    public int Method_32659(Object object) {
        return this.Method_32673((Class_22553)object);
    }

    public Class_22837 Method_32660() {
        return this.Field_32590;
    }

    public Class_22553 Method_32661(int n, int n2) {
        return this.Method_32684(n, n2);
    }

    public int Method_32662() {
        return 24802 & 4629;
    }

    public Class_22553 Method_32663(int n) {
        throw new IndexOutOfBoundsException();
    }

    public Class_22553 Method_32664(byte[] arrby) {
        return this.Method_32602(arrby.length);
    }

    public int Method_32665() {
        return 14469 & 18176;
    }

    public Class_22553 Method_32666() {
        return this;
    }

    public int Method_32667(int n, ScatteringByteChannel scatteringByteChannel, int n2) {
        this.Method_32684(n, n2);
        return 4672 & 256;
    }

    public ByteBuffer Method_32668(int n, int n2) {
        return Field_32586;
    }

    private void Method_32669() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_22553 Method_32670(int n, int n2) {
        throw new IndexOutOfBoundsException();
    }

    public Class_22553 Method_32671(int n) {
        throw new IndexOutOfBoundsException();
    }

    public Class_22553 Method_32672(int n, ByteBuffer byteBuffer) {
        return this.Method_32684(n, byteBuffer.remaining());
    }

    public int Method_32673(Class_22553 class_22553) {
        return class_22553.Method_22583() ? -1 & -1 : 36 & -26351;
    }

    public double Method_32674() {
        throw new IndexOutOfBoundsException();
    }

    public ByteBuffer Method_32675(int n, int n2) {
        this.Method_32684(n, n2);
        return this.Method_32598();
    }

    public float Method_32676() {
        throw new IndexOutOfBoundsException();
    }

    public Class_22553 Method_32677() {
        return this;
    }

    public String Method_32678() {
        return this.Field_32588;
    }

    public Class_22553 Method_32679(int n, int n2) {
        throw new IndexOutOfBoundsException();
    }

    public boolean Method_32680() {
        return (5781 & 26881) != 0;
    }

    public Class_22553 Method_32681(long l) {
        throw new IndexOutOfBoundsException();
    }

    public boolean Method_32682() {
        return (Field_32585 != (67158928L & 6420953622158508102L) ? 20769 & 2057 : 1346 & 4100) != 0;
    }

    public long Method_32683(int n) {
        throw new IndexOutOfBoundsException();
    }

    private Class_22553 Method_32684(int n, int n2) {
        if (n2 < 0) {
            throw new IllegalArgumentException("length: " + n2);
        }
        if (n != 0 || n2 != 0) {
            throw new IndexOutOfBoundsException();
        }
        return this;
    }

    public Class_22553 Method_32685(float f) {
        throw new IndexOutOfBoundsException();
    }

    public boolean Method_32686(Object object) {
        return (object instanceof Class_22553 && !((Class_22553)object).Method_22583() ? -14415 & 4097 : 13056 & 1113) != 0;
    }

    public String Method_32687(Charset charset) {
        return "";
    }

    private Class_22553 Method_32688(int n) {
        if (n != 0) {
            throw new IndexOutOfBoundsException();
        }
        return this;
    }

    public ByteBuffer[] Method_32689(int n, int n2) {
        this.Method_32684(n, n2);
        return this.Method_32630();
    }

    public Class_22553 Method_32690() {
        return this;
    }

    public byte Method_32691(int n) {
        throw new IndexOutOfBoundsException();
    }
}

