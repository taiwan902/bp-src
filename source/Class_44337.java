/*
 * Decompiled with CFR 0.145.
 */
import java.io.OutputStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;

public class Class_44337
extends Class_40553 {
    private ByteBuffer Field_44338;
    private byte[] Field_44339;
    private final Class_22837 Field_44340;

    public int Method_44341() {
        return 27141 & 4099;
    }

    public long Method_44342(int n) {
        this.ensureAccessible();
        return this.Method_44351(n);
    }

    public Class_22553 Method_44343(int n) {
        this.ensureAccessible();
        if (n < 0 || n > this.maxCapacity()) {
            throw new IllegalArgumentException("newCapacity: " + n);
        }
        int n2 = this.Field_44339.length;
        if (n > n2) {
            byte[] arrby = new byte[n];
            System.arraycopy(this.Field_44339, -7552 & 6229, arrby, 5185 & -16368, this.Field_44339.length);
            this.Method_44349(arrby);
        } else if (n < n2) {
            byte[] arrby = new byte[n];
            int n3 = this.readerIndex();
            if (n3 < n) {
                int n4 = this.writerIndex();
                if (n4 > n) {
                    n4 = n;
                    this.writerIndex(n4);
                }
                System.arraycopy(this.Field_44339, n3, arrby, n3, n4 - n3);
            } else {
                this.setIndex(n, n);
            }
            this.Method_44349(arrby);
        }
        return this;
    }

    protected Class_44337(Class_22837 class_22837, int n, int n2) {
        this(class_22837, new byte[n], 517 & 16744, 2180 & 22138, n2);
    }

    public Class_22553 Method_44344(int n, ByteBuffer byteBuffer) {
        this.ensureAccessible();
        byteBuffer.get(this.Field_44339, n, byteBuffer.remaining());
        return this;
    }

    private void Method_44345() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public int Method_44346(int n, ScatteringByteChannel scatteringByteChannel, int n2) {
        this.ensureAccessible();
        try {
            return scatteringByteChannel.read((ByteBuffer)this.Method_44375().clear().position(n).limit(n + n2));
        }
        catch (ClosedChannelException closedChannelException) {
            return -1 & -1;
        }
    }

    public Class_22553 Method_44347(int n, Class_22553 class_22553, int n2, int n3) {
        this.checkDstIndex(n, n3, n2, class_22553.Method_22630());
        if (class_22553.Method_22560()) {
            Class_7799.Method_7832(this.Field_44339, n, class_22553.Method_22616() + (long)n2, n3);
        } else if (class_22553.Method_22579()) {
            this.Method_44370(n, class_22553.Method_22599(), class_22553.Method_22569() + n2, n3);
        } else {
            class_22553.Method_22622(n2, this.Field_44339, n, n3);
        }
        return this;
    }

    public int Method_44348() {
        return -8016 & 6208;
    }

    private void Method_44349(byte[] arrby) {
        this.Field_44339 = arrby;
        this.Field_44338 = null;
    }

    public int Method_44350(GatheringByteChannel gatheringByteChannel, int n) {
        this.checkReadableBytes(n);
        int n2 = this.Method_44368(this.readerIndex, gatheringByteChannel, n, (11521 & -32755) != 0);
        this.readerIndex += n2;
        return n2;
    }

    protected long Method_44351(int n) {
        return ((long)this.Field_44339[n] & (-8747702831486597889L & 340075263L)) << (28088 & -32710) | ((long)this.Field_44339[n + (307 & 16521)] & (12980479L & 1762657023L)) << (9340 & -9294) | ((long)this.Field_44339[n + (-23806 & 5266)] & (35918335L & 134743295L)) << (1578 & -24516) | ((long)this.Field_44339[n + (2115 & 1043)] & (3265918216707817727L & 8600575L)) << (-10718 & 352) | ((long)this.Field_44339[n + (24853 & 110)] & (155226367L & 1152016639L)) << (2236 & 29720) | ((long)this.Field_44339[n + (-31707 & 6157)] & (3539952498720702719L & 137727L)) << (-16102 & 8724) | ((long)this.Field_44339[n + (16566 & 3142)] & (268435967L & 160076031L)) << (12300 & -32600) | (long)this.Field_44339[n + (-32625 & 8263)] & (-1241812586228022529L & 570972415L);
    }

    public Class_22553 Method_44352(int n, long l) {
        this.ensureAccessible();
        this.Method_44356(n, l);
        return this;
    }

    public byte[] Method_44353() {
        this.ensureAccessible();
        return this.Field_44339;
    }

    public Class_22553 Method_44354(int n, byte[] arrby, int n2, int n3) {
        this.checkSrcIndex(n, n3, n2, arrby.length);
        System.arraycopy(arrby, n2, this.Field_44339, n, n3);
        return this;
    }

    public byte Method_44355(int n) {
        this.ensureAccessible();
        return this.Method_44365(n);
    }

    protected void Method_44356(int n, long l) {
        this.Field_44339[n] = (byte)(l >>> (26174 & 4217));
        this.Field_44339[n + (215 & 6409)] = (byte)(l >>> (15546 & 561));
        this.Field_44339[n + (-7894 & 3218)] = (byte)(l >>> (6504 & -32727));
        this.Field_44339[n + (13315 & -32749)] = (byte)(l >>> (8864 & 1333));
        this.Field_44339[n + (324 & 10772)] = (byte)(l >>> (17944 & 4600));
        this.Field_44339[n + (10255 & 1173)] = (byte)(l >>> (3125 & -32686));
        this.Field_44339[n + (1327 & -28154)] = (byte)(l >>> (6473 & -23544));
        this.Field_44339[n + (16775 & 3639)] = (byte)l;
    }

    protected int Method_44357(int n) {
        return (this.Field_44339[n] & (10495 & 1279)) << (4888 & 24604) | (this.Field_44339[n + (-24575 & 1561)] & (1279 & -28161)) << (16 & 24400) | (this.Field_44339[n + (4147 & -30326)] & (4351 & 1535)) << (23148 & 9) | this.Field_44339[n + (3 & -21725)] & (-24833 & 8703);
    }

    protected void Method_44358(int n, int n2) {
        this.Field_44339[n] = (byte)n2;
    }

    public Class_22553 Method_44359(int n, OutputStream outputStream, int n2) {
        this.ensureAccessible();
        outputStream.write(this.Field_44339, n, n2);
        return this;
    }

    public int Method_44360(int n) {
        this.ensureAccessible();
        return this.Method_44357(n);
    }

    public int Method_44361() {
        this.ensureAccessible();
        return this.Field_44339.length;
    }

    public Class_22553 Method_44362(int n, int n2) {
        this.ensureAccessible();
        this.Method_44385(n, n2);
        return this;
    }

    protected Class_44337(Class_22837 class_22837, byte[] arrby, int n) {
        this(class_22837, arrby, 20 & 649, arrby.length, n);
    }

    public short Method_44363(int n) {
        this.ensureAccessible();
        return this.Method_44376(n);
    }

    public int Method_44364(int n, GatheringByteChannel gatheringByteChannel, int n2) {
        this.ensureAccessible();
        return this.Method_44368(n, gatheringByteChannel, n2, (18048 & 2084) != 0);
    }

    protected byte Method_44365(int n) {
        return this.Field_44339[n];
    }

    public Class_22837 Method_44366() {
        return this.Field_44340;
    }

    public Class_22553 Method_44367(int n, ByteBuffer byteBuffer) {
        this.ensureAccessible();
        byteBuffer.put(this.Field_44339, n, Math.min(this.Method_44361() - n, byteBuffer.remaining()));
        return this;
    }

    private Class_44337(Class_22837 class_22837, byte[] arrby, int n, int n2, int n3) {
        super(n3);
        if (class_22837 == null) {
            throw new NullPointerException("alloc");
        }
        if (arrby == null) {
            throw new NullPointerException("initialArray");
        }
        if (arrby.length > n3) {
            Object[] arrobject = new Object[-32702 & 14850];
            arrobject[-12016 & 224] = arrby.length;
            arrobject[1321 & 24769] = n3;
            throw new IllegalArgumentException(String.format("initialCapacity(%d) > maxCapacity(%d)", arrobject));
        }
        this.Field_44340 = class_22837;
        this.Method_44349(arrby);
        this.setIndex(n, n2);
    }

    private int Method_44368(int n, GatheringByteChannel gatheringByteChannel, int n2, boolean bl) {
        this.ensureAccessible();
        ByteBuffer byteBuffer = bl ? this.Method_44375() : ByteBuffer.wrap(this.Field_44339);
        return gatheringByteChannel.write((ByteBuffer)byteBuffer.clear().position(n).limit(n + n2));
    }

    public ByteBuffer[] Method_44369(int n, int n2) {
        ByteBuffer[] arrbyteBuffer = new ByteBuffer[5 & 2091];
        arrbyteBuffer[2185 & 8240] = this.Method_44372(n, n2);
        return arrbyteBuffer;
    }

    public Class_22553 Method_44370(int n, byte[] arrby, int n2, int n3) {
        this.checkDstIndex(n, n3, n2, arrby.length);
        System.arraycopy(this.Field_44339, n, arrby, n2, n3);
        return this;
    }

    protected void Method_44371() {
        this.Field_44339 = null;
    }

    public ByteBuffer Method_44372(int n, int n2) {
        this.ensureAccessible();
        return ByteBuffer.wrap(this.Field_44339, n, n2).slice();
    }

    public boolean Method_44373() {
        return (26753 & -31993) != 0;
    }

    public boolean Method_44374() {
        return (1153 & -32718) != 0;
    }

    private ByteBuffer Method_44375() {
        ByteBuffer byteBuffer = this.Field_44338;
        if (byteBuffer == null) {
            this.Field_44338 = byteBuffer = ByteBuffer.wrap(this.Field_44339);
        }
        return byteBuffer;
    }

    protected short Method_44376(int n) {
        return (short)(this.Field_44339[n] << (204 & 20761) | this.Field_44339[n + (-28511 & 19713)] & (-32513 & 9727));
    }

    public Class_22553 Method_44377(int n, int n2) {
        this.ensureAccessible();
        this.Method_44378(n, n2);
        return this;
    }

    protected void Method_44378(int n, int n2) {
        this.Field_44339[n] = (byte)(n2 >>> (2072 & 12));
        this.Field_44339[n + (235 & 12565)] = (byte)n2;
    }

    public boolean Method_44379() {
        return (-28416 & 8196) != 0;
    }

    public Class_22553 Method_44380(int n, int n2) {
        this.ensureAccessible();
        this.Method_44358(n, n2);
        return this;
    }

    public Class_22553 Method_44381() {
        return null;
    }

    public ByteOrder Method_44382() {
        return ByteOrder.BIG_ENDIAN;
    }

    public Class_22553 Method_44383(int n, Class_22553 class_22553, int n2, int n3) {
        this.checkSrcIndex(n, n3, n2, class_22553.Method_22630());
        if (class_22553.Method_22560()) {
            Class_7799.Method_7841(class_22553.Method_22616() + (long)n2, this.Field_44339, n, n3);
        } else if (class_22553.Method_22579()) {
            this.Method_44354(n, class_22553.Method_22599(), class_22553.Method_22569() + n2, n3);
        } else {
            class_22553.Method_22626(n2, this.Field_44339, n, n3);
        }
        return this;
    }

    public long Method_44384() {
        throw new UnsupportedOperationException();
    }

    protected void Method_44385(int n, int n2) {
        this.Field_44339[n] = (byte)(n2 >>> (154 & -24552));
        this.Field_44339[n + (-26527 & 1429)] = (byte)(n2 >>> (1360 & 145));
        this.Field_44339[n + (16998 & 3074)] = (byte)(n2 >>> (24587 & 296));
        this.Field_44339[n + (131 & 7491)] = (byte)n2;
    }

    public ByteBuffer Method_44386(int n, int n2) {
        this.checkIndex(n, n2);
        return (ByteBuffer)this.Method_44375().clear().position(n).limit(n + n2);
    }
}

