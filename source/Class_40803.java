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

public class Class_40803
extends Class_40553 {
    private boolean Field_40804;
    private int Field_40805;
    private ByteBuffer Field_40806;
    private ByteBuffer Field_40807;
    private static final boolean Field_40808 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN ? 19537 & 8193 : 7 & -7896;
    private long Field_40809;
    private final Class_22837 Field_40810;

    protected void Method_40811(int n, int n2) {
        Class_7799.Method_7821(this.Method_40848(n), Field_40808 ? n2 : Integer.reverseBytes(n2));
    }

    protected long Method_40812(int n) {
        long l = Class_7799.Method_7837(this.Method_40848(n));
        return Field_40808 ? l : Long.reverseBytes(l);
    }

    protected Class_30534 Method_40813() {
        return new Class_35333(this);
    }

    protected void Method_40814(int n, int n2) {
        Class_7799.Method_7851(this.Method_40848(n), Field_40808 ? (short)n2 : Short.reverseBytes((short)n2));
    }

    public Class_22553 Method_40815(int n, Class_22553 class_22553, int n2, int n3) {
        this.checkIndex(n, n3);
        if (class_22553 == null) {
            throw new NullPointerException("dst");
        }
        if (n2 < 0 || n2 > class_22553.Method_22630() - n3) {
            throw new IndexOutOfBoundsException("dstIndex: " + n2);
        }
        if (class_22553.Method_22560()) {
            Class_7799.Method_7855(this.Method_40848(n), class_22553.Method_22616() + (long)n2, n3);
        } else if (class_22553.Method_22579()) {
            Class_7799.Method_7841(this.Method_40848(n), class_22553.Method_22599(), class_22553.Method_22569() + n2, n3);
        } else {
            class_22553.Method_22589(n2, this, n, n3);
        }
        return this;
    }

    private void Method_40816(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = this.Field_40806;
        if (byteBuffer2 != null) {
            if (this.Field_40804) {
                this.Field_40804 = 1041 & 9124;
            } else {
                this.Method_40827(byteBuffer2);
            }
        }
        this.Field_40806 = byteBuffer;
        this.Field_40809 = Class_7799.Method_7826(byteBuffer);
        this.Field_40807 = null;
        this.Field_40805 = byteBuffer.remaining();
    }

    public Class_22837 Method_40817() {
        return this.Field_40810;
    }

    public Class_22553 Method_40818(int n, byte[] arrby, int n2, int n3) {
        this.checkIndex(n, n3);
        if (n3 != 0) {
            Class_7799.Method_7832(arrby, n2, this.Method_40848(n), n3);
        }
        return this;
    }

    protected void Method_40819(int n, int n2) {
        Class_7799.Method_7827(this.Method_40848(n), (byte)n2);
    }

    public byte[] Method_40820() {
        throw new UnsupportedOperationException("direct buffer");
    }

    protected short Method_40821(int n) {
        short s = Class_7799.Method_7861(this.Method_40848(n));
        return Field_40808 ? s : Short.reverseBytes(s);
    }

    public boolean Method_40822() {
        return (3648 & -8061) != 0;
    }

    public int Method_40823() {
        return this.Field_40805;
    }

    public int Method_40824(int n, GatheringByteChannel gatheringByteChannel, int n2) {
        return this.Method_40828(n, gatheringByteChannel, n2, (18580 & -32766) != 0);
    }

    public Class_22553 Method_40825(int n) {
        this.ensureAccessible();
        if (n < 0 || n > this.maxCapacity()) {
            throw new IllegalArgumentException("newCapacity: " + n);
        }
        int n2 = this.readerIndex();
        int n3 = this.writerIndex();
        int n4 = this.Field_40805;
        if (n > n4) {
            ByteBuffer byteBuffer = this.Field_40806;
            ByteBuffer byteBuffer2 = this.Method_40841(n);
            byteBuffer.position(-32576 & 24594).limit(byteBuffer.capacity());
            byteBuffer2.position(12544 & -30206).limit(byteBuffer.capacity());
            byteBuffer2.put(byteBuffer);
            byteBuffer2.clear();
            this.Method_40816(byteBuffer2);
        } else if (n < n4) {
            ByteBuffer byteBuffer = this.Field_40806;
            ByteBuffer byteBuffer3 = this.Method_40841(n);
            if (n2 < n) {
                if (n3 > n) {
                    n3 = n;
                    this.writerIndex(n3);
                }
                byteBuffer.position(n2).limit(n3);
                byteBuffer3.position(n2).limit(n3);
                byteBuffer3.put(byteBuffer);
                byteBuffer3.clear();
            } else {
                this.setIndex(n, n);
            }
            this.Method_40816(byteBuffer3);
        }
        return this;
    }

    public int Method_40826() {
        return 2089 & -27117;
    }

    protected void Method_40827(ByteBuffer byteBuffer) {
        Class_7799.Method_7848(byteBuffer);
    }

    private int Method_40828(int n, GatheringByteChannel gatheringByteChannel, int n2, boolean bl) {
        this.ensureAccessible();
        if (n2 == 0) {
            return 11809 & -16116;
        }
        ByteBuffer byteBuffer = bl ? this.Method_40838() : this.Field_40806.duplicate();
        byteBuffer.clear().position(n).limit(n + n2);
        return gatheringByteChannel.write(byteBuffer);
    }

    public int Method_40829(GatheringByteChannel gatheringByteChannel, int n) {
        this.checkReadableBytes(n);
        int n2 = this.Method_40828(this.readerIndex, gatheringByteChannel, n, (4161 & 795) != 0);
        this.readerIndex += n2;
        return n2;
    }

    public Class_22553 Method_40830(int n, OutputStream outputStream, int n2) {
        this.ensureAccessible();
        if (n2 != 0) {
            byte[] arrby = new byte[n2];
            Class_7799.Method_7841(this.Method_40848(n), arrby, 2620 & 24706, n2);
            outputStream.write(arrby);
        }
        return this;
    }

    public int Method_40831() {
        throw new UnsupportedOperationException("direct buffer");
    }

    public Class_22553 Method_40832(int n, ByteBuffer byteBuffer) {
        this.ensureAccessible();
        ByteBuffer byteBuffer2 = this.Method_40838();
        if (byteBuffer == byteBuffer2) {
            byteBuffer = byteBuffer.duplicate();
        }
        byteBuffer2.clear().position(n).limit(n + byteBuffer.remaining());
        byteBuffer2.put(byteBuffer);
        return this;
    }

    public int Method_40833(int n, ScatteringByteChannel scatteringByteChannel, int n2) {
        this.ensureAccessible();
        ByteBuffer byteBuffer = this.Method_40838();
        byteBuffer.clear().position(n).limit(n + n2);
        try {
            return scatteringByteChannel.read(byteBuffer);
        }
        catch (ClosedChannelException closedChannelException) {
            return -1 & -1;
        }
    }

    public long Method_40834() {
        return this.Field_40809;
    }

    public boolean Method_40835() {
        return (257 & -23529) != 0;
    }

    protected void Method_40836() {
        ByteBuffer byteBuffer = this.Field_40806;
        if (byteBuffer == null) {
            return;
        }
        this.Field_40806 = null;
        if (!this.Field_40804) {
            this.Method_40827(byteBuffer);
        }
    }

    public Class_22553 Method_40837(int n, Class_22553 class_22553, int n2, int n3) {
        this.checkIndex(n, n3);
        if (class_22553 == null) {
            throw new NullPointerException("src");
        }
        if (n2 < 0 || n2 > class_22553.Method_22630() - n3) {
            throw new IndexOutOfBoundsException("srcIndex: " + n2);
        }
        if (n3 != 0) {
            if (class_22553.Method_22560()) {
                Class_7799.Method_7855(class_22553.Method_22616() + (long)n2, this.Method_40848(n), n3);
            } else if (class_22553.Method_22579()) {
                Class_7799.Method_7832(class_22553.Method_22599(), class_22553.Method_22569() + n2, this.Method_40848(n), n3);
            } else {
                class_22553.Method_22624(n2, this, n, n3);
            }
        }
        return this;
    }

    private ByteBuffer Method_40838() {
        ByteBuffer byteBuffer = this.Field_40807;
        if (byteBuffer == null) {
            this.Field_40807 = byteBuffer = this.Field_40806.duplicate();
        }
        return byteBuffer;
    }

    public ByteBuffer Method_40839(int n, int n2) {
        this.checkIndex(n, n2);
        return ((ByteBuffer)this.Field_40806.duplicate().position(n).limit(n + n2)).slice();
    }

    public ByteOrder Method_40840() {
        return ByteOrder.BIG_ENDIAN;
    }

    protected ByteBuffer Method_40841(int n) {
        return ByteBuffer.allocateDirect(n);
    }

    protected void Method_40842(int n, long l) {
        Class_7799.Method_7836(this.Method_40848(n), Field_40808 ? l : Long.reverseBytes(l));
    }

    public Class_22553 Method_40843(int n, byte[] arrby, int n2, int n3) {
        this.checkIndex(n, n3);
        if (arrby == null) {
            throw new NullPointerException("dst");
        }
        if (n2 < 0 || n2 > arrby.length - n3) {
            Object[] arrobject = new Object[4099 & 9859];
            arrobject[2304 & 4144] = n2;
            arrobject[273 & 39] = n3;
            arrobject[1282 & -30562] = arrby.length;
            throw new IndexOutOfBoundsException(String.format("dstIndex: %d, length: %d (expected: range(0, %d))", arrobject));
        }
        if (n3 != 0) {
            Class_7799.Method_7841(this.Method_40848(n), arrby, n2, n3);
        }
        return this;
    }

    protected Class_40803(Class_22837 class_22837, int n, int n2) {
        super(n2);
        if (class_22837 == null) {
            throw new NullPointerException("alloc");
        }
        if (n < 0) {
            throw new IllegalArgumentException("initialCapacity: " + n);
        }
        if (n2 < 0) {
            throw new IllegalArgumentException("maxCapacity: " + n2);
        }
        if (n > n2) {
            Object[] arrobject = new Object[13314 & 234];
            arrobject[144 & 104] = n;
            arrobject[6147 & -23791] = n2;
            throw new IllegalArgumentException(String.format("initialCapacity(%d) > maxCapacity(%d)", arrobject));
        }
        this.Field_40810 = class_22837;
        this.Method_40816(this.Method_40841(n));
    }

    private void Method_40844(int n, ByteBuffer byteBuffer, boolean bl) {
        this.checkIndex(n);
        if (byteBuffer == null) {
            throw new NullPointerException("dst");
        }
        int n2 = Math.min(this.Method_40823() - n, byteBuffer.remaining());
        ByteBuffer byteBuffer2 = bl ? this.Method_40838() : this.Field_40806.duplicate();
        byteBuffer2.clear().position(n).limit(n + n2);
        byteBuffer.put(byteBuffer2);
    }

    public ByteBuffer[] Method_40845(int n, int n2) {
        ByteBuffer[] arrbyteBuffer = new ByteBuffer[4107 & -15919];
        arrbyteBuffer[2100 & 522] = this.Method_40839(n, n2);
        return arrbyteBuffer;
    }

    public Class_22553 Method_40846() {
        return null;
    }

    public ByteBuffer Method_40847(int n, int n2) {
        this.checkIndex(n, n2);
        return (ByteBuffer)this.Method_40838().clear().position(n).limit(n + n2);
    }

    long Method_40848(int n) {
        return this.Field_40809 + (long)n;
    }

    public boolean Method_40849() {
        return (15667 & 16897) != 0;
    }

    protected int Method_40850(int n) {
        int n2 = Class_7799.Method_7854(this.Method_40848(n));
        return Field_40808 ? n2 : Integer.reverseBytes(n2);
    }

    protected byte Method_40851(int n) {
        return Class_7799.Method_7815(this.Method_40848(n));
    }

    private void Method_40852() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_22553 Method_40853(int n, ByteBuffer byteBuffer) {
        this.Method_40844(n, byteBuffer, (1828 & 14337) != 0);
        return this;
    }
}

