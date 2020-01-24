/*
 * Decompiled with CFR 0.145.
 */
import java.io.OutputStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;

public final class Class_46609
extends Class_43430 {
    private static final Class_32390 Field_46610 = new Class_43402();

    public Class_22553 Method_46611(int n, byte[] arrby, int n2, int n3) {
        this.Method_46626(n, arrby, n2, n3, (20709 & 8456) != 0);
        return this;
    }

    protected void Method_46612(int n, int n2) {
        ((ByteBuffer)this.memory).putShort(this.idx(n), (short)n2);
    }

    protected void Method_46613(int n, int n2) {
        ((ByteBuffer)this.memory).putInt(this.idx(n), n2);
    }

    protected byte Method_46614(int n) {
        return ((ByteBuffer)this.memory).get(this.idx(n));
    }

    static Class_46609 Method_46615(int n) {
        Class_46609 class_46609 = (Class_46609)Field_46610.Method_32408();
        class_46609.setRefCnt(-13431 & 5137);
        class_46609.maxCapacity(n);
        return class_46609;
    }

    public int Method_46616() {
        return 4145 & 8193;
    }

    protected ByteBuffer Method_46617(ByteBuffer byteBuffer) {
        return byteBuffer.duplicate();
    }

    public int Method_46618() {
        throw new UnsupportedOperationException("direct buffer");
    }

    public ByteBuffer Method_46619(int n, int n2) {
        this.checkIndex(n, n2);
        n = this.idx(n);
        return (ByteBuffer)this.internalNioBuffer().clear().position(n).limit(n + n2);
    }

    public int Method_46620(GatheringByteChannel gatheringByteChannel, int n) {
        this.checkReadableBytes(n);
        int n2 = this.Method_46622(this.readerIndex, gatheringByteChannel, n, (-32639 & 18757) != 0);
        this.readerIndex += n2;
        return n2;
    }

    protected int Method_46621(int n) {
        return ((ByteBuffer)this.memory).getInt(this.idx(n));
    }

    private int Method_46622(int n, GatheringByteChannel gatheringByteChannel, int n2, boolean bl) {
        this.checkIndex(n, n2);
        if (n2 == 0) {
            return 16385 & 4170;
        }
        ByteBuffer byteBuffer = bl ? this.internalNioBuffer() : ((ByteBuffer)this.memory).duplicate();
        n = this.idx(n);
        byteBuffer.clear().position(n).limit(n + n2);
        return gatheringByteChannel.write(byteBuffer);
    }

    public ByteBuffer[] Method_46623(int n, int n2) {
        ByteBuffer[] arrbyteBuffer = new ByteBuffer[185 & 19717];
        arrbyteBuffer[2050 & 16437] = this.Method_46643(n, n2);
        return arrbyteBuffer;
    }

    public Class_22553 Method_46624(int n, ByteBuffer byteBuffer) {
        this.checkIndex(n, byteBuffer.remaining());
        ByteBuffer byteBuffer2 = this.internalNioBuffer();
        if (byteBuffer == byteBuffer2) {
            byteBuffer = byteBuffer.duplicate();
        }
        n = this.idx(n);
        byteBuffer2.clear().position(n).limit(n + byteBuffer.remaining());
        byteBuffer2.put(byteBuffer);
        return this;
    }

    protected Class_32390 Method_46625() {
        return Field_46610;
    }

    private void Method_46626(int n, byte[] arrby, int n2, int n3, boolean bl) {
        this.checkDstIndex(n, n3, n2, arrby.length);
        ByteBuffer byteBuffer = bl ? this.internalNioBuffer() : ((ByteBuffer)this.memory).duplicate();
        n = this.idx(n);
        byteBuffer.clear().position(n).limit(n + n3);
        byteBuffer.get(arrby, n2, n3);
    }

    public long Method_46627() {
        throw new UnsupportedOperationException();
    }

    protected void Method_46628(int n, int n2) {
        ((ByteBuffer)this.memory).put(this.idx(n), (byte)n2);
    }

    public Class_22553 Method_46629(int n, Class_22553 class_22553, int n2, int n3) {
        this.checkDstIndex(n, n3, n2, class_22553.Method_22630());
        if (class_22553.Method_22579()) {
            this.Method_46611(n, class_22553.Method_22599(), class_22553.Method_22569() + n2, n3);
        } else if (class_22553.Method_22634() > 0) {
            ByteBuffer[] arrbyteBuffer = class_22553.Method_22627(n2, n3);
            int n4 = arrbyteBuffer.length;
            for (int i = -32488 & 17056; i < n4; ++i) {
                ByteBuffer byteBuffer = arrbyteBuffer[i];
                int n5 = byteBuffer.remaining();
                this.Method_46645(n, byteBuffer);
                n += n5;
            }
        } else {
            class_22553.Method_22589(n2, this, n, n3);
        }
        return this;
    }

    private void Method_46630(int n, ByteBuffer byteBuffer, boolean bl) {
        this.checkIndex(n);
        int n2 = Math.min(this.capacity() - n, byteBuffer.remaining());
        ByteBuffer byteBuffer2 = bl ? this.internalNioBuffer() : ((ByteBuffer)this.memory).duplicate();
        n = this.idx(n);
        byteBuffer2.clear().position(n).limit(n + n2);
        byteBuffer.put(byteBuffer2);
    }

    public Class_22553 Method_46631(OutputStream outputStream, int n) {
        this.checkReadableBytes(n);
        this.Method_46641(this.readerIndex, outputStream, n, (6469 & 16937) != 0);
        this.readerIndex += n;
        return this;
    }

    public Class_22553 Method_46632(int n, byte[] arrby, int n2, int n3) {
        this.checkSrcIndex(n, n3, n2, arrby.length);
        ByteBuffer byteBuffer = this.internalNioBuffer();
        n = this.idx(n);
        byteBuffer.clear().position(n).limit(n + n3);
        byteBuffer.put(arrby, n2, n3);
        return this;
    }

    protected long Method_46633(int n) {
        return ((ByteBuffer)this.memory).getLong(this.idx(n));
    }

    Class_46609(Class_22999 class_22999, int n, Class_43402 class_43402) {
        this(class_22999, n);
    }

    public Class_22553 Method_46634(int n, Class_22553 class_22553, int n2, int n3) {
        this.checkSrcIndex(n, n3, n2, class_22553.Method_22630());
        if (class_22553.Method_22579()) {
            this.Method_46632(n, class_22553.Method_22599(), class_22553.Method_22569() + n2, n3);
        } else if (class_22553.Method_22634() > 0) {
            ByteBuffer[] arrbyteBuffer = class_22553.Method_22627(n2, n3);
            int n4 = arrbyteBuffer.length;
            for (int i = 5184 & 389; i < n4; ++i) {
                ByteBuffer byteBuffer = arrbyteBuffer[i];
                int n5 = byteBuffer.remaining();
                this.Method_46624(n, byteBuffer);
                n += n5;
            }
        } else {
            class_22553.Method_22624(n2, this, n, n3);
        }
        return this;
    }

    private void Method_46635() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public int Method_46636(int n, ScatteringByteChannel scatteringByteChannel, int n2) {
        this.checkIndex(n, n2);
        ByteBuffer byteBuffer = this.internalNioBuffer();
        n = this.idx(n);
        byteBuffer.clear().position(n).limit(n + n2);
        try {
            return scatteringByteChannel.read(byteBuffer);
        }
        catch (ClosedChannelException closedChannelException) {
            return -1 & -1;
        }
    }

    protected short Method_46637(int n) {
        return ((ByteBuffer)this.memory).getShort(this.idx(n));
    }

    private Class_46609(Class_22999 class_22999, int n) {
        super(class_22999, n);
    }

    public Class_22553 Method_46638(byte[] arrby, int n, int n2) {
        this.checkReadableBytes(n2);
        this.Method_46626(this.readerIndex, arrby, n, n2, (17157 & 5161) != 0);
        this.readerIndex += n2;
        return this;
    }

    protected void Method_46639(int n, long l) {
        ((ByteBuffer)this.memory).putLong(this.idx(n), l);
    }

    public Class_22553 Method_46640(int n, OutputStream outputStream, int n2) {
        this.Method_46641(n, outputStream, n2, (403 & -22528) != 0);
        return this;
    }

    private void Method_46641(int n, OutputStream outputStream, int n2, boolean bl) {
        this.checkIndex(n, n2);
        if (n2 == 0) {
            return;
        }
        byte[] arrby = new byte[n2];
        ByteBuffer byteBuffer = bl ? this.internalNioBuffer() : ((ByteBuffer)this.memory).duplicate();
        byteBuffer.clear().position(this.idx(n));
        byteBuffer.get(arrby);
        outputStream.write(arrby);
    }

    public int Method_46642(int n, GatheringByteChannel gatheringByteChannel, int n2) {
        return this.Method_46622(n, gatheringByteChannel, n2, (-31623 & 27392) != 0);
    }

    public ByteBuffer Method_46643(int n, int n2) {
        this.checkIndex(n, n2);
        n = this.idx(n);
        return ((ByteBuffer)((ByteBuffer)this.memory).duplicate().position(n).limit(n + n2)).slice();
    }

    public boolean Method_46644() {
        return (-32767 & 9097) != 0;
    }

    public Class_22553 Method_46645(int n, ByteBuffer byteBuffer) {
        this.Method_46630(n, byteBuffer, (-32256 & 18662) != 0);
        return this;
    }

    public boolean Method_46646() {
        return (16404 & 10505) != 0;
    }

    public boolean Method_46647() {
        return (5833 & -16096) != 0;
    }

    public byte[] Method_46648() {
        throw new UnsupportedOperationException("direct buffer");
    }

    protected ByteBuffer Method_46649(Object object) {
        return this.Method_46617((ByteBuffer)object);
    }
}

