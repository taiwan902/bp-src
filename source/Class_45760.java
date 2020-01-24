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

public final class Class_45760
extends Class_43430 {
    private static final Class_32390 Field_45761;
    private static final boolean Field_45762;
    private long Field_45763;

    private long Method_45764(int n) {
        return this.Field_45763 + (long)n;
    }

    public int Method_45765() {
        throw new UnsupportedOperationException("direct buffer");
    }

    protected void Method_45766(int n, long l) {
        Class_7799.Method_7836(this.Method_45764(n), Field_45762 ? l : Long.reverseBytes(l));
    }

    protected int Method_45767(int n) {
        int n2 = Class_7799.Method_7854(this.Method_45764(n));
        return Field_45762 ? n2 : Integer.reverseBytes(n2);
    }

    private void Method_45768() {
        this.Field_45763 = Class_7799.Method_7826((ByteBuffer)this.memory) + (long)this.offset;
    }

    public ByteBuffer[] Method_45769(int n, int n2) {
        ByteBuffer[] arrbyteBuffer = new ByteBuffer[173 & 2817];
        arrbyteBuffer[3192 & -32511] = this.Method_45798(n, n2);
        return arrbyteBuffer;
    }

    public Class_22553 Method_45770(int n, byte[] arrby, int n2, int n3) {
        this.checkIndex(n, n3);
        if (arrby == null) {
            throw new NullPointerException("dst");
        }
        if (n2 < 0 || n2 > arrby.length - n3) {
            throw new IndexOutOfBoundsException("dstIndex: " + n2);
        }
        if (n3 != 0) {
            Class_7799.Method_7841(this.Method_45764(n), arrby, n2, n3);
        }
        return this;
    }

    protected void Method_45771(int n, int n2) {
        Class_7799.Method_7821(this.Method_45764(n), Field_45762 ? n2 : Integer.reverseBytes(n2));
    }

    public Class_22553 Method_45772(int n, byte[] arrby, int n2, int n3) {
        this.checkIndex(n, n3);
        if (n3 != 0) {
            Class_7799.Method_7832(arrby, n2, this.Method_45764(n), n3);
        }
        return this;
    }

    public Class_22553 Method_45773(int n, ByteBuffer byteBuffer) {
        this.Method_45793(n, byteBuffer, (17154 & 7172) != 0);
        return this;
    }

    static Class_45760 Method_45774(int n) {
        Class_45760 class_45760 = (Class_45760)Field_45761.Method_32408();
        class_45760.setRefCnt(12555 & 21);
        class_45760.maxCapacity(n);
        return class_45760;
    }

    Class_45760(Class_22999 class_22999, int n, Class_32869 class_32869) {
        this(class_22999, n);
    }

    public long Method_45775() {
        return this.Field_45763;
    }

    protected ByteBuffer Method_45776(Object object) {
        return this.Method_45784((ByteBuffer)object);
    }

    protected void Method_45777(int n, int n2) {
        Class_7799.Method_7827(this.Method_45764(n), (byte)n2);
    }

    public Class_22553 Method_45778(int n, ByteBuffer byteBuffer) {
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

    static {
        Field_45762 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN ? 381 & -28159 : 320 & 9249;
        Field_45761 = new Class_32869();
    }

    void Method_45779(Class_8772 class_8772, long l, int n, int n2, int n3) {
        super.Method_43446(class_8772, l, n, n2, n3);
        this.Method_45768();
    }

    public boolean Method_45780() {
        return (10315 & 4869) != 0;
    }

    protected void Method_45781(int n, int n2) {
        Class_7799.Method_7851(this.Method_45764(n), Field_45762 ? (short)n2 : Short.reverseBytes((short)n2));
    }

    public byte[] Method_45782() {
        throw new UnsupportedOperationException("direct buffer");
    }

    protected byte Method_45783(int n) {
        return Class_7799.Method_7815(this.Method_45764(n));
    }

    protected ByteBuffer Method_45784(ByteBuffer byteBuffer) {
        return byteBuffer.duplicate();
    }

    public Class_22553 Method_45785(int n, Class_22553 class_22553, int n2, int n3) {
        this.checkIndex(n, n3);
        if (class_22553 == null) {
            throw new NullPointerException("src");
        }
        if (n2 < 0 || n2 > class_22553.Method_22630() - n3) {
            throw new IndexOutOfBoundsException("srcIndex: " + n2);
        }
        if (n3 != 0) {
            if (class_22553.Method_22560()) {
                Class_7799.Method_7855(class_22553.Method_22616() + (long)n2, this.Method_45764(n), n3);
            } else if (class_22553.Method_22579()) {
                Class_7799.Method_7832(class_22553.Method_22599(), class_22553.Method_22569() + n2, this.Method_45764(n), n3);
            } else {
                class_22553.Method_22624(n2, this, n, n3);
            }
        }
        return this;
    }

    private void Method_45786() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_22553 Method_45787(int n, Class_22553 class_22553, int n2, int n3) {
        this.checkIndex(n, n3);
        if (class_22553 == null) {
            throw new NullPointerException("dst");
        }
        if (n2 < 0 || n2 > class_22553.Method_22630() - n3) {
            throw new IndexOutOfBoundsException("dstIndex: " + n2);
        }
        if (n3 != 0) {
            if (class_22553.Method_22560()) {
                Class_7799.Method_7855(this.Method_45764(n), class_22553.Method_22616() + (long)n2, n3);
            } else if (class_22553.Method_22579()) {
                Class_7799.Method_7841(this.Method_45764(n), class_22553.Method_22599(), class_22553.Method_22569() + n2, n3);
            } else {
                class_22553.Method_22589(n2, this, n, n3);
            }
        }
        return this;
    }

    public int Method_45788(GatheringByteChannel gatheringByteChannel, int n) {
        this.checkReadableBytes(n);
        int n2 = this.Method_45799(this.readerIndex, gatheringByteChannel, n, (4141 & 8705) != 0);
        this.readerIndex += n2;
        return n2;
    }

    protected long Method_45789(int n) {
        long l = Class_7799.Method_7837(this.Method_45764(n));
        return Field_45762 ? l : Long.reverseBytes(l);
    }

    public ByteBuffer Method_45790(int n, int n2) {
        this.checkIndex(n, n2);
        n = this.idx(n);
        return (ByteBuffer)this.internalNioBuffer().clear().position(n).limit(n + n2);
    }

    void Method_45791(Class_8772 class_8772, int n) {
        super.Method_43440(class_8772, n);
        this.Method_45768();
    }

    public int Method_45792(int n, ScatteringByteChannel scatteringByteChannel, int n2) {
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

    private Class_45760(Class_22999 class_22999, int n) {
        super(class_22999, n);
    }

    private void Method_45793(int n, ByteBuffer byteBuffer, boolean bl) {
        this.checkIndex(n);
        int n2 = Math.min(this.capacity() - n, byteBuffer.remaining());
        ByteBuffer byteBuffer2 = bl ? this.internalNioBuffer() : ((ByteBuffer)this.memory).duplicate();
        n = this.idx(n);
        byteBuffer2.clear().position(n).limit(n + n2);
        byteBuffer.put(byteBuffer2);
    }

    public Class_22553 Method_45794(int n, OutputStream outputStream, int n2) {
        this.checkIndex(n, n2);
        if (n2 != 0) {
            byte[] arrby = new byte[n2];
            Class_7799.Method_7841(this.Method_45764(n), arrby, 514 & -21500, n2);
            outputStream.write(arrby);
        }
        return this;
    }

    public boolean Method_45795() {
        return (-30460 & 12408) != 0;
    }

    public int Method_45796() {
        return 1 & -31949;
    }

    protected short Method_45797(int n) {
        short s = Class_7799.Method_7861(this.Method_45764(n));
        return Field_45762 ? s : Short.reverseBytes(s);
    }

    public ByteBuffer Method_45798(int n, int n2) {
        this.checkIndex(n, n2);
        n = this.idx(n);
        return ((ByteBuffer)((ByteBuffer)this.memory).duplicate().position(n).limit(n + n2)).slice();
    }

    private int Method_45799(int n, GatheringByteChannel gatheringByteChannel, int n2, boolean bl) {
        this.checkIndex(n, n2);
        if (n2 == 0) {
            return 6793 & 16480;
        }
        ByteBuffer byteBuffer = bl ? this.internalNioBuffer() : ((ByteBuffer)this.memory).duplicate();
        n = this.idx(n);
        byteBuffer.clear().position(n).limit(n + n2);
        return gatheringByteChannel.write(byteBuffer);
    }

    public int Method_45800(int n, GatheringByteChannel gatheringByteChannel, int n2) {
        return this.Method_45799(n, gatheringByteChannel, n2, (-24187 & 20480) != 0);
    }

    protected Class_32390 Method_45801() {
        return Field_45761;
    }

    public boolean Method_45802() {
        return (263 & 513) != 0;
    }

    protected Class_30534 Method_45803() {
        return new Class_35333(this);
    }
}

