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

public class Class_40565
extends Class_40553 {
    private boolean Field_40566;
    private ByteBuffer Field_40567;
    private final Class_22837 Field_40568;
    private ByteBuffer Field_40569;
    private int Field_40570;

    public Class_22553 Method_40571(int n, byte[] arrby, int n2, int n3) {
        this.Method_40606(n, arrby, n2, n3, (-29494 & 4609) != 0);
        return this;
    }

    public Class_22553 Method_40572(int n, int n2) {
        this.ensureAccessible();
        this.Method_40617(n, n2);
        return this;
    }

    public long Method_40573(int n) {
        this.ensureAccessible();
        return this.Method_40611(n);
    }

    protected void Method_40574() {
        ByteBuffer byteBuffer = this.Field_40569;
        if (byteBuffer == null) {
            return;
        }
        this.Field_40569 = null;
        if (!this.Field_40566) {
            this.Method_40608(byteBuffer);
        }
    }

    protected void Method_40575(int n, int n2) {
        this.Field_40569.putShort(n, (short)n2);
    }

    public Class_22553 Method_40576(OutputStream outputStream, int n) {
        this.checkReadableBytes(n);
        this.Method_40619(this.readerIndex, outputStream, n, (16625 & 11009) != 0);
        this.readerIndex += n;
        return this;
    }

    public byte[] Method_40577() {
        throw new UnsupportedOperationException("direct buffer");
    }

    private void Method_40578() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private ByteBuffer Method_40579() {
        ByteBuffer byteBuffer = this.Field_40567;
        if (byteBuffer == null) {
            this.Field_40567 = byteBuffer = this.Field_40569.duplicate();
        }
        return byteBuffer;
    }

    protected short Method_40580(int n) {
        return this.Field_40569.getShort(n);
    }

    public Class_22837 Method_40581() {
        return this.Field_40568;
    }

    public Class_22553 Method_40582(int n, Class_22553 class_22553, int n2, int n3) {
        this.checkDstIndex(n, n3, n2, class_22553.Method_22630());
        if (class_22553.Method_22579()) {
            this.Method_40571(n, class_22553.Method_22599(), class_22553.Method_22569() + n2, n3);
        } else if (class_22553.Method_22634() > 0) {
            ByteBuffer[] arrbyteBuffer = class_22553.Method_22627(n2, n3);
            int n4 = arrbyteBuffer.length;
            for (int i = 24864 & -31663; i < n4; ++i) {
                ByteBuffer byteBuffer = arrbyteBuffer[i];
                int n5 = byteBuffer.remaining();
                this.Method_40620(n, byteBuffer);
                n += n5;
            }
        } else {
            class_22553.Method_22589(n2, this, n, n3);
        }
        return this;
    }

    protected byte Method_40583(int n) {
        return this.Field_40569.get(n);
    }

    public byte Method_40584(int n) {
        this.ensureAccessible();
        return this.Method_40583(n);
    }

    public long Method_40585() {
        throw new UnsupportedOperationException();
    }

    public int Method_40586() {
        throw new UnsupportedOperationException("direct buffer");
    }

    private void Method_40587(int n, ByteBuffer byteBuffer, boolean bl) {
        this.checkIndex(n);
        if (byteBuffer == null) {
            throw new NullPointerException("dst");
        }
        int n2 = Math.min(this.Method_40599() - n, byteBuffer.remaining());
        ByteBuffer byteBuffer2 = bl ? this.Method_40579() : this.Field_40569.duplicate();
        byteBuffer2.clear().position(n).limit(n + n2);
        byteBuffer.put(byteBuffer2);
    }

    public Class_22553 Method_40588(int n, byte[] arrby, int n2, int n3) {
        this.checkSrcIndex(n, n3, n2, arrby.length);
        ByteBuffer byteBuffer = this.Method_40579();
        byteBuffer.clear().position(n).limit(n + n3);
        byteBuffer.put(arrby, n2, n3);
        return this;
    }

    public Class_22553 Method_40589() {
        return null;
    }

    public ByteOrder Method_40590() {
        return ByteOrder.BIG_ENDIAN;
    }

    public Class_22553 Method_40591(int n, long l) {
        this.ensureAccessible();
        this.Method_40592(n, l);
        return this;
    }

    protected void Method_40592(int n, long l) {
        this.Field_40569.putLong(n, l);
    }

    public boolean Method_40593() {
        return (64 & 24611) != 0;
    }

    public int Method_40594(int n, GatheringByteChannel gatheringByteChannel, int n2) {
        return this.Method_40601(n, gatheringByteChannel, n2, (2348 & 8211) != 0);
    }

    private void Method_40595(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = this.Field_40569;
        if (byteBuffer2 != null) {
            if (this.Field_40566) {
                this.Field_40566 = 154 & -4031;
            } else {
                this.Method_40608(byteBuffer2);
            }
        }
        this.Field_40569 = byteBuffer;
        this.Field_40567 = null;
        this.Field_40570 = byteBuffer.remaining();
    }

    protected int Method_40596(int n) {
        return this.Field_40569.getInt(n);
    }

    public Class_22553 Method_40597(int n) {
        this.ensureAccessible();
        if (n < 0 || n > this.maxCapacity()) {
            throw new IllegalArgumentException("newCapacity: " + n);
        }
        int n2 = this.readerIndex();
        int n3 = this.writerIndex();
        int n4 = this.Field_40570;
        if (n > n4) {
            ByteBuffer byteBuffer = this.Field_40569;
            ByteBuffer byteBuffer2 = this.Method_40603(n);
            byteBuffer.position(28886 & 0).limit(byteBuffer.capacity());
            byteBuffer2.position(17154 & 4).limit(byteBuffer.capacity());
            byteBuffer2.put(byteBuffer);
            byteBuffer2.clear();
            this.Method_40595(byteBuffer2);
        } else if (n < n4) {
            ByteBuffer byteBuffer = this.Field_40569;
            ByteBuffer byteBuffer3 = this.Method_40603(n);
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
            this.Method_40595(byteBuffer3);
        }
        return this;
    }

    public ByteBuffer Method_40598(int n, int n2) {
        this.checkIndex(n, n2);
        return (ByteBuffer)this.Method_40579().clear().position(n).limit(n + n2);
    }

    public int Method_40599() {
        return this.Field_40570;
    }

    public ByteBuffer Method_40600(int n, int n2) {
        this.checkIndex(n, n2);
        return ((ByteBuffer)this.Field_40569.duplicate().position(n).limit(n + n2)).slice();
    }

    private int Method_40601(int n, GatheringByteChannel gatheringByteChannel, int n2, boolean bl) {
        this.ensureAccessible();
        if (n2 == 0) {
            return 12 & 25601;
        }
        ByteBuffer byteBuffer = bl ? this.Method_40579() : this.Field_40569.duplicate();
        byteBuffer.clear().position(n).limit(n + n2);
        return gatheringByteChannel.write(byteBuffer);
    }

    public short Method_40602(int n) {
        this.ensureAccessible();
        return this.Method_40580(n);
    }

    protected ByteBuffer Method_40603(int n) {
        return ByteBuffer.allocateDirect(n);
    }

    public Class_22553 Method_40604(int n, OutputStream outputStream, int n2) {
        this.Method_40619(n, outputStream, n2, (-30080 & 4099) != 0);
        return this;
    }

    protected void Method_40605(int n, int n2) {
        this.Field_40569.putInt(n, n2);
    }

    private void Method_40606(int n, byte[] arrby, int n2, int n3, boolean bl) {
        this.checkDstIndex(n, n3, n2, arrby.length);
        if (n2 < 0 || n2 > arrby.length - n3) {
            Object[] arrobject = new Object[4195 & 8195];
            arrobject[99 & -27376] = n2;
            arrobject[12289 & 787] = n3;
            arrobject[-32702 & 12299] = arrby.length;
            throw new IndexOutOfBoundsException(String.format("dstIndex: %d, length: %d (expected: range(0, %d))", arrobject));
        }
        ByteBuffer byteBuffer = bl ? this.Method_40579() : this.Field_40569.duplicate();
        byteBuffer.clear().position(n).limit(n + n3);
        byteBuffer.get(arrby, n2, n3);
    }

    public int Method_40607(int n) {
        this.ensureAccessible();
        return this.Method_40596(n);
    }

    protected void Method_40608(ByteBuffer byteBuffer) {
        Class_7799.Method_7848(byteBuffer);
    }

    public Class_22553 Method_40609(int n, int n2) {
        this.ensureAccessible();
        this.Method_40605(n, n2);
        return this;
    }

    public ByteBuffer[] Method_40610(int n, int n2) {
        ByteBuffer[] arrbyteBuffer = new ByteBuffer[8209 & 16717];
        arrbyteBuffer[23584 & 8714] = this.Method_40600(n, n2);
        return arrbyteBuffer;
    }

    protected long Method_40611(int n) {
        return this.Field_40569.getLong(n);
    }

    public int Method_40612(int n, ScatteringByteChannel scatteringByteChannel, int n2) {
        this.ensureAccessible();
        ByteBuffer byteBuffer = this.Method_40579();
        byteBuffer.clear().position(n).limit(n + n2);
        try {
            return scatteringByteChannel.read(this.Field_40567);
        }
        catch (ClosedChannelException closedChannelException) {
            return -1 & -1;
        }
    }

    public Class_22553 Method_40613(int n, ByteBuffer byteBuffer) {
        this.ensureAccessible();
        ByteBuffer byteBuffer2 = this.Method_40579();
        if (byteBuffer == byteBuffer2) {
            byteBuffer = byteBuffer.duplicate();
        }
        byteBuffer2.clear().position(n).limit(n + byteBuffer.remaining());
        byteBuffer2.put(byteBuffer);
        return this;
    }

    public int Method_40614() {
        return 113 & 4613;
    }

    protected Class_40565(Class_22837 class_22837, int n, int n2) {
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
            Object[] arrobject = new Object[-31609 & 34];
            arrobject[298 & 596] = n;
            arrobject[-17759 & 17417] = n2;
            throw new IllegalArgumentException(String.format("initialCapacity(%d) > maxCapacity(%d)", arrobject));
        }
        this.Field_40568 = class_22837;
        this.Method_40595(ByteBuffer.allocateDirect(n));
    }

    public Class_22553 Method_40615(int n, int n2) {
        this.ensureAccessible();
        this.Method_40575(n, n2);
        return this;
    }

    public boolean Method_40616() {
        return (-28670 & 18532) != 0;
    }

    protected void Method_40617(int n, int n2) {
        this.Field_40569.put(n, (byte)n2);
    }

    public Class_22553 Method_40618(byte[] arrby, int n, int n2) {
        this.checkReadableBytes(n2);
        this.Method_40606(this.readerIndex, arrby, n, n2, (257 & -31545) != 0);
        this.readerIndex += n2;
        return this;
    }

    private void Method_40619(int n, OutputStream outputStream, int n2, boolean bl) {
        this.ensureAccessible();
        if (n2 == 0) {
            return;
        }
        if (this.Field_40569.hasArray()) {
            outputStream.write(this.Field_40569.array(), n + this.Field_40569.arrayOffset(), n2);
        } else {
            byte[] arrby = new byte[n2];
            ByteBuffer byteBuffer = bl ? this.Method_40579() : this.Field_40569.duplicate();
            byteBuffer.clear().position(n);
            byteBuffer.get(arrby);
            outputStream.write(arrby);
        }
    }

    public Class_22553 Method_40620(int n, ByteBuffer byteBuffer) {
        this.Method_40587(n, byteBuffer, (-15360 & 2128) != 0);
        return this;
    }

    public int Method_40621(GatheringByteChannel gatheringByteChannel, int n) {
        this.checkReadableBytes(n);
        int n2 = this.Method_40601(this.readerIndex, gatheringByteChannel, n, (4107 & 17669) != 0);
        this.readerIndex += n2;
        return n2;
    }

    public Class_22553 Method_40622(int n, Class_22553 class_22553, int n2, int n3) {
        this.checkSrcIndex(n, n3, n2, class_22553.Method_22630());
        if (class_22553.Method_22634() > 0) {
            ByteBuffer[] arrbyteBuffer = class_22553.Method_22627(n2, n3);
            int n4 = arrbyteBuffer.length;
            for (int i = -32752 & 3270; i < n4; ++i) {
                ByteBuffer byteBuffer = arrbyteBuffer[i];
                int n5 = byteBuffer.remaining();
                this.Method_40613(n, byteBuffer);
                n += n5;
            }
        } else {
            class_22553.Method_22624(n2, this, n, n3);
        }
        return this;
    }

    public boolean Method_40623() {
        return (4121 & 8709) != 0;
    }
}

