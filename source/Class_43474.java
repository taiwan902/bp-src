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

public final class Class_43474
extends Class_43430 {
    private static final Class_32390 Field_43475 = new Class_47291();

    static Class_43474 Method_43476(int n) {
        Class_43474 class_43474 = (Class_43474)Field_43475.Method_32408();
        class_43474.setRefCnt(147 & -26559);
        class_43474.maxCapacity(n);
        return class_43474;
    }

    public Class_22553 Method_43477(int n, ByteBuffer byteBuffer) {
        this.checkIndex(n);
        byteBuffer.put((byte[])this.memory, this.idx(n), Math.min(this.capacity() - n, byteBuffer.remaining()));
        return this;
    }

    protected long Method_43478(int n) {
        n = this.idx(n);
        return ((long)((byte[])this.memory)[n] & (50334463L & 270927103L)) << (16888 & 2616) | ((long)((byte[])this.memory)[n + (30753 & -31675)] & (876692735L & 1751862830851297535L)) << (184 & -32460) | ((long)((byte[])this.memory)[n + (24646 & -28670)] & (220333055L & 3738697855809880319L)) << (-32151 & 6186) | ((long)((byte[])this.memory)[n + (6275 & 1075)] & (-4340089283639475713L & 4340089282892337407L)) << (352 & 2593) | ((long)((byte[])this.memory)[n + (12 & 12807)] & (605160191L & 5030893791408620031L)) << (8921 & 4152) | ((long)((byte[])this.memory)[n + (-27963 & 3093)] & (9098596034535985407L & 536880127L)) << (-21322 & 16912) | ((long)((byte[])this.memory)[n + (558 & 19719)] & (77080831L & 4104957857869334015L)) << (-3000 & 537) | (long)((byte[])this.memory)[n + (9799 & 4231)] & (411600383L & 1612841215L);
    }

    public boolean Method_43479() {
        return (24705 & 324) != 0;
    }

    private Class_43474(Class_22999 class_22999, int n) {
        super(class_22999, n);
    }

    public int Method_43480(int n, ScatteringByteChannel scatteringByteChannel, int n2) {
        this.checkIndex(n, n2);
        n = this.idx(n);
        try {
            return scatteringByteChannel.read((ByteBuffer)this.internalNioBuffer().clear().position(n).limit(n + n2));
        }
        catch (ClosedChannelException closedChannelException) {
            return -1 & -1;
        }
    }

    public ByteBuffer Method_43481(int n, int n2) {
        this.checkIndex(n, n2);
        n = this.idx(n);
        ByteBuffer byteBuffer = ByteBuffer.wrap((byte[])this.memory, n, n2);
        return byteBuffer.slice();
    }

    public int Method_43482(GatheringByteChannel gatheringByteChannel, int n) {
        this.checkReadableBytes(n);
        int n2 = this.Method_43488(this.readerIndex, gatheringByteChannel, n, (-32765 & 22101) != 0);
        this.readerIndex += n2;
        return n2;
    }

    public Class_22553 Method_43483(int n, byte[] arrby, int n2, int n3) {
        this.checkDstIndex(n, n3, n2, arrby.length);
        System.arraycopy(this.memory, this.idx(n), arrby, n2, n3);
        return this;
    }

    public ByteBuffer[] Method_43484(int n, int n2) {
        ByteBuffer[] arrbyteBuffer = new ByteBuffer[-32633 & 12361];
        arrbyteBuffer[-20468 & 1507] = this.Method_43481(n, n2);
        return arrbyteBuffer;
    }

    public Class_22553 Method_43485(int n, Class_22553 class_22553, int n2, int n3) {
        this.checkDstIndex(n, n3, n2, class_22553.Method_22630());
        if (class_22553.Method_22560()) {
            Class_7799.Method_7832((byte[])this.memory, this.idx(n), class_22553.Method_22616() + (long)n2, n3);
        } else if (class_22553.Method_22579()) {
            this.Method_43483(n, class_22553.Method_22599(), class_22553.Method_22569() + n2, n3);
        } else {
            class_22553.Method_22622(n2, (byte[])this.memory, this.idx(n), n3);
        }
        return this;
    }

    protected void Method_43486(int n, int n2) {
        ((byte[])this.memory)[this.idx((int)n)] = (byte)n2;
    }

    protected ByteBuffer Method_43487(Object object) {
        return this.Method_43508((byte[])object);
    }

    private int Method_43488(int n, GatheringByteChannel gatheringByteChannel, int n2, boolean bl) {
        this.checkIndex(n, n2);
        n = this.idx(n);
        ByteBuffer byteBuffer = bl ? this.internalNioBuffer() : ByteBuffer.wrap((byte[])this.memory);
        return gatheringByteChannel.write((ByteBuffer)byteBuffer.clear().position(n).limit(n + n2));
    }

    public long Method_43489() {
        throw new UnsupportedOperationException();
    }

    public Class_22553 Method_43490(int n, ByteBuffer byteBuffer) {
        int n2 = byteBuffer.remaining();
        this.checkIndex(n, n2);
        byteBuffer.get((byte[])this.memory, this.idx(n), n2);
        return this;
    }

    private void Method_43491() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_43492() {
        return (-22302 & 16) != 0;
    }

    public int Method_43493(int n, GatheringByteChannel gatheringByteChannel, int n2) {
        return this.Method_43488(n, gatheringByteChannel, n2, (2248 & -32768) != 0);
    }

    protected short Method_43494(int n) {
        n = this.idx(n);
        return (short)(((byte[])this.memory)[n] << (16906 & 4344) | ((byte[])this.memory)[n + (3 & 1157)] & (-13569 & 255));
    }

    Class_43474(Class_22999 class_22999, int n, Class_47291 class_47291) {
        this(class_22999, n);
    }

    public int Method_43495() {
        return 2633 & 55;
    }

    public int Method_43496() {
        return this.offset;
    }

    public byte[] Method_43497() {
        return (byte[])this.memory;
    }

    protected void Method_43498(int n, int n2) {
        n = this.idx(n);
        ((byte[])this.memory)[n] = (byte)(n2 >>> (-31336 & 4697));
        ((byte[])this.memory)[n + (2057 & 24615)] = (byte)(n2 >>> (11792 & 4115));
        ((byte[])this.memory)[n + (8346 & -25534)] = (byte)(n2 >>> (4990 & 19464));
        ((byte[])this.memory)[n + (-22521 & 179)] = (byte)n2;
    }

    public Class_22553 Method_43499(int n, byte[] arrby, int n2, int n3) {
        this.checkSrcIndex(n, n3, n2, arrby.length);
        System.arraycopy(arrby, n2, this.memory, this.idx(n), n3);
        return this;
    }

    public Class_22553 Method_43500(int n, Class_22553 class_22553, int n2, int n3) {
        this.checkSrcIndex(n, n3, n2, class_22553.Method_22630());
        if (class_22553.Method_22560()) {
            Class_7799.Method_7841(class_22553.Method_22616() + (long)n2, (byte[])this.memory, this.idx(n), n3);
        } else if (class_22553.Method_22579()) {
            this.Method_43499(n, class_22553.Method_22599(), class_22553.Method_22569() + n2, n3);
        } else {
            class_22553.Method_22626(n2, (byte[])this.memory, this.idx(n), n3);
        }
        return this;
    }

    protected byte Method_43501(int n) {
        return ((byte[])this.memory)[this.idx(n)];
    }

    protected int Method_43502(int n) {
        n = this.idx(n);
        return (((byte[])this.memory)[n] & (1279 & -29953)) << (-28648 & 12250) | (((byte[])this.memory)[n + (89 & -32765)] & (2559 & -7425)) << (-24368 & 2064) | (((byte[])this.memory)[n + (1610 & 10290)] & (-14081 & 4863)) << (-32696 & 25016) | ((byte[])this.memory)[n + (17491 & 6279)] & (17151 & -31489);
    }

    protected void Method_43503(int n, int n2) {
        n = this.idx(n);
        ((byte[])this.memory)[n] = (byte)(n2 >>> (21896 & 44));
        ((byte[])this.memory)[n + (25115 & 353)] = (byte)n2;
    }

    protected Class_32390 Method_43504() {
        return Field_43475;
    }

    public boolean Method_43505() {
        return (35 & -30399) != 0;
    }

    public ByteBuffer Method_43506(int n, int n2) {
        this.checkIndex(n, n2);
        n = this.idx(n);
        return (ByteBuffer)this.internalNioBuffer().clear().position(n).limit(n + n2);
    }

    public Class_22553 Method_43507(int n, OutputStream outputStream, int n2) {
        this.checkIndex(n, n2);
        outputStream.write((byte[])this.memory, this.idx(n), n2);
        return this;
    }

    protected ByteBuffer Method_43508(byte[] arrby) {
        return ByteBuffer.wrap(arrby);
    }

    protected void Method_43509(int n, long l) {
        n = this.idx(n);
        ((byte[])this.memory)[n] = (byte)(l >>> (1400 & 568));
        ((byte[])this.memory)[n + (-32623 & 6177)] = (byte)(l >>> (52 & 177));
        ((byte[])this.memory)[n + (1566 & 4131)] = (byte)(l >>> (13416 & 19000));
        ((byte[])this.memory)[n + (3331 & 131)] = (byte)(l >>> (2343 & 16432));
        ((byte[])this.memory)[n + (-32252 & 5285)] = (byte)(l >>> (4124 & 2296));
        ((byte[])this.memory)[n + (5253 & -32683)] = (byte)(l >>> (20 & 23378));
        ((byte[])this.memory)[n + (519 & 20614)] = (byte)(l >>> (552 & 16794));
        ((byte[])this.memory)[n + (16679 & 10271)] = (byte)l;
    }
}

