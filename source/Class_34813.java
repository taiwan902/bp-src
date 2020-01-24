/*
 * Decompiled with CFR 0.145.
 */
import java.io.OutputStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;
import java.nio.charset.Charset;

public abstract class Class_34813
extends Class_22553 {
    int Field_34814;
    private int Field_34815;
    private Class_30534 Field_34816;
    int Field_34817;
    static final Class_24943 Field_34818 = new Class_24943(Class_22553.class);
    private int Field_34819;
    private int Field_34820;

    public Class_22553 Method_34821(int n) {
        if (n < 0) {
            Object[] arrobject = new Object[-16383 & 2125];
            arrobject[-32766 & 8472] = n;
            throw new IllegalArgumentException(String.format("minWritableBytes: %d (expected: >= 0)", arrobject));
        }
        if (n <= this.Method_34867()) {
            return this;
        }
        if (n > this.Field_34820 - this.Field_34817) {
            Object[] arrobject = new Object[16388 & 15270];
            arrobject[1089 & 8464] = this.Field_34817;
            arrobject[4129 & -16063] = n;
            arrobject[13082 & 38] = this.Field_34820;
            arrobject[27243 & -32765] = this;
            throw new IndexOutOfBoundsException(String.format("writerIndex(%d) + minWritableBytes(%d) exceeds maxCapacity(%d): %s", arrobject));
        }
        int n2 = this.Method_34850(this.Field_34817 + n);
        this.capacity(n2);
        return this;
    }

    public Class_22553 Method_34822(int n) {
        this.Method_34852();
        this.Method_34821(4306 & -32766);
        this.Method_34913(this.Field_34817, n);
        this.Field_34817 += 3 & 514;
        return this;
    }

    public int Method_34823(Class_18115 class_18115) {
        int n = this.Field_34814;
        int n2 = this.Field_34817 - n;
        this.Method_34852();
        return this.Method_34878(n, n2, class_18115);
    }

    public Class_22553 Method_34824(Class_22553 class_22553, int n, int n2) {
        this.Method_34852();
        this.Method_34821(n2);
        this.setBytes(this.Field_34817, class_22553, n, n2);
        this.Field_34817 += n2;
        return this;
    }

    protected final void Method_34825(int n) {
        this.Field_34820 = n;
    }

    public ByteBuffer Method_34826() {
        return this.nioBuffer(this.Field_34814, this.Method_34858());
    }

    public Class_22553 Method_34827(int n) {
        this.Method_34822(n);
        return this;
    }

    protected final void Method_34828(int n) {
        int n2 = this.Field_34815;
        if (n2 <= n) {
            this.Field_34815 = -32760 & 8736;
            int n3 = this.Field_34819;
            this.Field_34819 = n3 <= n ? 6930 & -7959 : n3 - n;
        } else {
            this.Field_34815 = n2 - n;
            this.Field_34819 -= n;
        }
    }

    public Class_22553 Method_34829() {
        this.Field_34814 = this.Field_34817 = 48 & 5889;
        return this;
    }

    public long Method_34830(int n) {
        this.Method_34909(n, -8166 & 2504);
        return this.Method_34898(n);
    }

    public Class_22553 Method_34831(byte[] arrby, int n, int n2) {
        this.Method_34852();
        this.Method_34821(n2);
        this.setBytes(this.Field_34817, arrby, n, n2);
        this.Field_34817 += n2;
        return this;
    }

    public Class_22553 Method_34832(int n, int n2) {
        if (n < 0 || n > n2 || n2 > this.capacity()) {
            Object[] arrobject = new Object[6723 & -31605];
            arrobject[-32764 & 256] = n;
            arrobject[4705 & 135] = n2;
            arrobject[16915 & 8290] = this.capacity();
            throw new IndexOutOfBoundsException(String.format("readerIndex: %d, writerIndex: %d (expected: 0 <= readerIndex <= writerIndex <= capacity(%d))", arrobject));
        }
        this.Field_34814 = n;
        this.Field_34817 = n2;
        return this;
    }

    public Class_22553 Method_34833(long l) {
        this.Method_34852();
        this.Method_34821(541 & -25400);
        this.Method_34883(this.Field_34817, l);
        this.Field_34817 += -32454 & 20104;
        return this;
    }

    public int Method_34834(ScatteringByteChannel scatteringByteChannel, int n) {
        this.Method_34852();
        this.Method_34821(n);
        int n2 = this.setBytes(this.Field_34817, scatteringByteChannel, n);
        if (n2 > 0) {
            this.Field_34817 += n2;
        }
        return n2;
    }

    public Class_22553 Method_34835(Class_22553 class_22553, int n, int n2) {
        this.Method_34840(n2);
        this.getBytes(this.Field_34814, class_22553, n, n2);
        this.Field_34814 += n2;
        return this;
    }

    public int Method_34836(int n) {
        this.Method_34909(n, 5 & 29276);
        return this.Method_34843(n);
    }

    protected abstract byte Method_34837(int var1);

    public boolean Method_34838() {
        return (this.Method_34891() != 0 ? 29733 & 2065 : -15768 & 4100) != 0;
    }

    public long Method_34839(int n) {
        return (long)this.Method_34836(n) & (0xFFFFFFFFL & -8572041779719700481L);
    }

    protected final void Method_34840(int n) {
        this.Method_34852();
        if (n < 0) {
            throw new IllegalArgumentException("minimumReadableBytes: " + n + " (expected: >= 0)");
        }
        if (this.Field_34814 > this.Field_34817 - n) {
            Object[] arrobject = new Object[2052 & 28804];
            arrobject[4096 & 512] = this.Field_34814;
            arrobject[1089 & 14871] = n;
            arrobject[-32634 & 2403] = this.Field_34817;
            arrobject[1043 & 8611] = this;
            throw new IndexOutOfBoundsException(String.format("readerIndex(%d) + length(%d) exceeds writerIndex(%d): %s", arrobject));
        }
    }

    protected Class_30534 Method_34841() {
        return new Class_30534(this);
    }

    public byte Method_34842(int n) {
        this.Method_34870(n);
        return this.Method_34837(n);
    }

    protected abstract int Method_34843(int var1);

    public Class_22553 Method_34844(float f) {
        this.Method_34892(Float.floatToRawIntBits(f));
        return this;
    }

    public Class_22553 Method_34845(ByteOrder byteOrder) {
        if (byteOrder == null) {
            throw new NullPointerException("endianness");
        }
        if (byteOrder == this.order()) {
            return this;
        }
        Class_30534 class_30534 = this.Field_34816;
        if (class_30534 == null) {
            this.Field_34816 = class_30534 = this.Method_34841();
        }
        return class_30534;
    }

    public String Method_34846() {
        Class_22553 class_22553;
        if (this.refCnt() == 0) {
            return Class_22304.Method_22312(this) + "(freed)";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Class_22304.Method_22312(this));
        stringBuilder.append("(ridx: ");
        stringBuilder.append(this.Field_34814);
        stringBuilder.append(", widx: ");
        stringBuilder.append(this.Field_34817);
        stringBuilder.append(", cap: ");
        stringBuilder.append(this.capacity());
        if (this.Field_34820 != (Integer.MAX_VALUE & Integer.MAX_VALUE)) {
            stringBuilder.append((char)(8255 & 20911));
            stringBuilder.append(this.Field_34820);
        }
        if ((class_22553 = this.unwrap()) != null) {
            stringBuilder.append(", unwrapped: ");
            stringBuilder.append(class_22553);
        }
        stringBuilder.append((char)(16425 & 2861));
        return stringBuilder.toString();
    }

    public short Method_34847(int n) {
        this.Method_34909(n, -11438 & 1190);
        return this.Method_34911(n);
    }

    public int Method_34848(Class_22553 class_22553) {
        return Class_10346.Method_10373(this, class_22553);
    }

    public int Method_34849() {
        return this.Method_34902() & (71958527 & 673251327);
    }

    private int Method_34850(int n) {
        int n2;
        int n3 = this.Field_34820;
        if (n == (1203897895 & -2143284976)) {
            return 1111624192 & 15990860;
        }
        if (n > (-2092776439 & 214436480)) {
            int n4 = n / (172099140 & -1587474295) * (71401986 & 703615285);
            n4 = n4 > n3 - (5599380 & 541753697) ? n3 : (n4 += 541067426 & 275591492);
            return n4;
        }
        for (n2 = -23465 & 20576; n2 < n; n2 <<= 12379 & 1) {
        }
        return Math.min(n2, n3);
    }

    public int Method_34851(GatheringByteChannel gatheringByteChannel, int n) {
        this.Method_34840(n);
        int n2 = this.getBytes(this.Field_34814, gatheringByteChannel, n);
        this.Field_34814 += n2;
        return n2;
    }

    protected final void Method_34852() {
        if (this.refCnt() == 0) {
            throw new Class_15873(8208 & 0);
        }
    }

    public float Method_34853() {
        return Float.intBitsToFloat(this.Method_34886());
    }

    public Class_22553 Method_34854(byte[] arrby) {
        this.Method_34873(arrby, 5120 & 2624, arrby.length);
        return this;
    }

    public int Method_34855(int n) {
        return this.Method_34847(n) & (19988479 & 604045311);
    }

    public Class_22553 Method_34856(int n, byte[] arrby) {
        this.getBytes(n, arrby, 112 & 17410, arrby.length);
        return this;
    }

    public Class_22553 Method_34857(boolean bl) {
        this.Method_34860(bl ? 8833 & 4107 : 4097 & -24572);
        return this;
    }

    public int Method_34858() {
        return this.Field_34817 - this.Field_34814;
    }

    public Class_22553 Method_34859(double d) {
        this.Method_34833(Double.doubleToRawLongBits(d));
        return this;
    }

    public Class_22553 Method_34860(int n) {
        this.Method_34852();
        this.Method_34821(-32725 & 17041);
        int n2 = this.Field_34817;
        this.Field_34817 = n2 + (529 & 5157);
        this.Method_34863(n2, n);
        return this;
    }

    public int Method_34861() {
        return Class_10346.Method_10362(this);
    }

    public Class_22553 Method_34862() {
        return this.Method_34875(this.Field_34814, this.Method_34858());
    }

    protected abstract void Method_34863(int var1, int var2);

    public int Method_34864(Object object) {
        return this.Method_34848((Class_22553)object);
    }

    public Class_22553 Method_34865(int n, long l) {
        this.Method_34909(n, 21512 & 10604);
        this.Method_34883(n, l);
        return this;
    }

    public int Method_34866() {
        return this.Field_34814;
    }

    public int Method_34867() {
        return this.capacity() - this.Field_34817;
    }

    public Class_22553 Method_34868(int n) {
        this.Method_34840(n);
        if (n == 0) {
            return Class_16620.Field_16622;
        }
        Class_22553 class_22553 = Class_16620.Method_16625(n, this.Field_34820);
        class_22553.Method_22585(this, this.Field_34814, n);
        this.Field_34814 += n;
        return class_22553;
    }

    public int Method_34869() {
        return this.Field_34820;
    }

    protected final void Method_34870(int n) {
        this.Method_34852();
        if (n < 0 || n >= this.capacity()) {
            Object[] arrobject = new Object[78 & -28413];
            arrobject[-22494 & 21660] = n;
            arrobject[-32703 & 643] = this.capacity();
            throw new IndexOutOfBoundsException(String.format("index: %d (expected: range(0, %d))", arrobject));
        }
    }

    public Class_22553 Method_34871(byte[] arrby) {
        this.Method_34831(arrby, 10369 & 588, arrby.length);
        return this;
    }

    protected final void Method_34872(int n, int n2, int n3, int n4) {
        this.Method_34909(n, n2);
        if (n3 < 0 || n3 > n4 - n2) {
            Object[] arrobject = new Object[17411 & 531];
            arrobject[4 & -30680] = n3;
            arrobject[17413 & -26365] = n2;
            arrobject[322 & 19506] = n4;
            throw new IndexOutOfBoundsException(String.format("dstIndex: %d, length: %d (expected: range(0, %d))", arrobject));
        }
    }

    public Class_22553 Method_34873(byte[] arrby, int n, int n2) {
        this.Method_34840(n2);
        this.getBytes(this.Field_34814, arrby, n, n2);
        this.Field_34814 += n2;
        return this;
    }

    public long Method_34874() {
        this.Method_34840(16520 & -19444);
        long l = this.Method_34898(this.Field_34814);
        this.Field_34814 += -19959 & 2286;
        return l;
    }

    public Class_22553 Method_34875(int n, int n2) {
        if (n2 == 0) {
            return Class_16620.Field_16622;
        }
        return new Class_47789(this, n, n2);
    }

    public short Method_34876() {
        return (short)(this.Method_34891() & (-32513 & 1791));
    }

    public Class_22553 Method_34877(int n, int n2) {
        this.Method_34870(n);
        this.Method_34863(n, n2);
        return this;
    }

    private int Method_34878(int n, int n2, Class_18115 class_18115) {
        if (class_18115 == null) {
            throw new NullPointerException("processor");
        }
        if (n2 == 0) {
            return -1 & -1;
        }
        int n3 = n + n2;
        int n4 = n;
        try {
            do {
                if (class_18115.Method_18126(this.Method_34837(n4))) continue;
                return n4;
            } while (++n4 < n3);
        }
        catch (Exception exception) {
            Class_7799.Method_7834(exception);
        }
        return -1 & -1;
    }

    public Class_22553 Method_34879(ByteBuffer byteBuffer) {
        this.Method_34852();
        int n = byteBuffer.remaining();
        this.Method_34821(n);
        this.setBytes(this.Field_34817, byteBuffer);
        this.Field_34817 += n;
        return this;
    }

    public Class_22553 Method_34880(Class_22553 class_22553) {
        this.Method_34887(class_22553, class_22553.Method_22564());
        return this;
    }

    public Class_22553 Method_34881() {
        return new Class_47840(this);
    }

    public double Method_34882() {
        return Double.longBitsToDouble(this.Method_34874());
    }

    protected abstract void Method_34883(int var1, long var2);

    public boolean Method_34884(Object object) {
        if (this == object) {
            return (4097 & 1253) != 0;
        }
        if (object instanceof Class_22553) {
            return Class_10346.Method_10351(this, (Class_22553)object);
        }
        return (-26480 & 9282) != 0;
    }

    public Class_22553 Method_34885(OutputStream outputStream, int n) {
        this.Method_34840(n);
        this.getBytes(this.Field_34814, outputStream, n);
        this.Field_34814 += n;
        return this;
    }

    public int Method_34886() {
        this.Method_34840(20999 & 11724);
        int n = this.Method_34843(this.Field_34814);
        this.Field_34814 += -27636 & 18454;
        return n;
    }

    public Class_22553 Method_34887(Class_22553 class_22553, int n) {
        if (n > class_22553.Method_22564()) {
            Object[] arrobject = new Object[31923 & -32253];
            arrobject[-26200 & 68] = n;
            arrobject[4097 & 17] = class_22553.Method_22564();
            arrobject[-19193 & 2586] = class_22553;
            throw new IndexOutOfBoundsException(String.format("length(%d) exceeds src.readableBytes(%d) where src is: %s", arrobject));
        }
        this.Method_34824(class_22553, class_22553.Method_22582(), n);
        class_22553.Method_22590(class_22553.Method_22582() + n);
        return this;
    }

    public Class_22553 Method_34888(Class_22553 class_22553, int n) {
        if (n > class_22553.Method_22574()) {
            Object[] arrobject = new Object[1039 & -8093];
            arrobject[6144 & 1008] = n;
            arrobject[16435 & 8705] = class_22553.Method_22574();
            arrobject[5719 & 2] = class_22553;
            throw new IndexOutOfBoundsException(String.format("length(%d) exceeds dst.writableBytes(%d) where dst is: %s", arrobject));
        }
        this.Method_34835(class_22553, class_22553.Method_22620(), n);
        class_22553.Method_22609(class_22553.Method_22620() + n);
        return this;
    }

    public Class_22553 Method_34889(int n, int n2) {
        this.Method_34909(n, 20487 & 8268);
        this.Method_34900(n, n2);
        return this;
    }

    public Class_22553 Method_34890(int n) {
        if (n < this.Field_34814 || n > this.capacity()) {
            Object[] arrobject = new Object[-32093 & 1031];
            arrobject[-18398 & 840] = n;
            arrobject[17413 & 2609] = this.Field_34814;
            arrobject[16422 & 5642] = this.capacity();
            throw new IndexOutOfBoundsException(String.format("writerIndex: %d (expected: readerIndex(%d) <= writerIndex <= capacity(%d))", arrobject));
        }
        this.Field_34817 = n;
        return this;
    }

    protected Class_34813(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("maxCapacity: " + n + " (expected: >= 0)");
        }
        this.Field_34820 = n;
    }

    public byte Method_34891() {
        this.Method_34840(-31677 & 10885);
        int n = this.Field_34814;
        byte by = this.Method_34842(n);
        this.Field_34814 = n + (-18329 & 145);
        return by;
    }

    public Class_22553 Method_34892(int n) {
        this.Method_34852();
        this.Method_34821(10628 & 37);
        this.Method_34900(this.Field_34817, n);
        this.Field_34817 += 4124 & 1029;
        return this;
    }

    public Class_22553 Method_34893() {
        this.Field_34815 = this.Field_34814;
        return this;
    }

    protected final void Method_34894(int n, int n2, int n3, int n4) {
        this.Method_34909(n, n2);
        if (n3 < 0 || n3 > n4 - n2) {
            Object[] arrobject = new Object[24623 & 211];
            arrobject[-30332 & 12329] = n3;
            arrobject[-32703 & 27145] = n2;
            arrobject[-12250 & 706] = n4;
            throw new IndexOutOfBoundsException(String.format("srcIndex: %d, length: %d (expected: range(0, %d))", arrobject));
        }
    }

    public Class_22553 Method_34895(int n, int n2) {
        this.Method_34909(n, -31481 & 20498);
        this.Method_34913(n, n2);
        return this;
    }

    public short Method_34896(int n) {
        return (short)(this.Method_34842(n) & (13567 & 16639));
    }

    public Class_22553 Method_34897() {
        this.Method_34852();
        if (this.Field_34814 == 0) {
            return this;
        }
        if (this.Field_34814 == this.Field_34817) {
            this.Method_34828(this.Field_34814);
            this.Field_34817 = this.Field_34814 = 8 & -16348;
            return this;
        }
        if (this.Field_34814 >= this.capacity() >>> (4239 & 769)) {
            this.setBytes(-13568 & 0, (Class_22553)this, this.Field_34814, this.Field_34817 - this.Field_34814);
            this.Field_34817 -= this.Field_34814;
            this.Method_34828(this.Field_34814);
            this.Field_34814 = 72 & 4133;
        }
        return this;
    }

    protected abstract long Method_34898(int var1);

    private void Method_34899() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected abstract void Method_34900(int var1, int var2);

    public int Method_34901() {
        return this.Field_34817;
    }

    public short Method_34902() {
        this.Method_34840(-32082 & 1026);
        short s = this.Method_34911(this.Field_34814);
        this.Field_34814 += 258 & 27;
        return s;
    }

    public String Method_34903(Charset charset) {
        return this.Method_34912(this.Field_34814, this.Method_34858(), charset);
    }

    public Class_22553 Method_34904(int n) {
        this.Method_34840(n);
        this.Field_34814 += n;
        return this;
    }

    public Class_22553 Method_34905() {
        this.Method_34907(this.Field_34815);
        return this;
    }

    public Class_22553 Method_34906(Class_22553 class_22553) {
        this.Method_34888(class_22553, class_22553.Method_22574());
        return this;
    }

    public Class_22553 Method_34907(int n) {
        if (n < 0 || n > this.Field_34817) {
            Object[] arrobject = new Object[526 & 18803];
            arrobject[4 & -31231] = n;
            arrobject[4903 & 3145] = this.Field_34817;
            throw new IndexOutOfBoundsException(String.format("readerIndex: %d (expected: 0 <= readerIndex <= writerIndex(%d))", arrobject));
        }
        this.Field_34814 = n;
        return this;
    }

    public boolean Method_34908() {
        return (this.Field_34817 > this.Field_34814 ? 10241 & 5399 : 256 & -31639) != 0;
    }

    protected final void Method_34909(int n, int n2) {
        this.Method_34852();
        if (n2 < 0) {
            throw new IllegalArgumentException("length: " + n2 + " (expected: >= 0)");
        }
        if (n < 0 || n > this.capacity() - n2) {
            Object[] arrobject = new Object[-32245 & 2051];
            arrobject[2 & -271] = n;
            arrobject[-32511 & 4181] = n2;
            arrobject[6 & 20498] = this.capacity();
            throw new IndexOutOfBoundsException(String.format("index: %d, length: %d (expected: range(0, %d))", arrobject));
        }
    }

    public ByteBuffer[] Method_34910() {
        return this.nioBuffers(this.Field_34814, this.Method_34858());
    }

    protected abstract short Method_34911(int var1);

    public String Method_34912(int n, int n2, Charset charset) {
        ByteBuffer byteBuffer;
        if (n2 == 0) {
            return "";
        }
        if (this.nioBufferCount() == (25609 & -28671)) {
            byteBuffer = this.nioBuffer(n, n2);
        } else {
            byteBuffer = ByteBuffer.allocate(n2);
            this.getBytes(n, byteBuffer);
            byteBuffer.flip();
        }
        return Class_10346.Method_10367(byteBuffer, charset);
    }

    protected abstract void Method_34913(int var1, int var2);
}

