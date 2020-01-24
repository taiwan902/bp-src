/*
 * Decompiled with CFR 0.145.
 */
import java.io.OutputStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;
import java.nio.charset.Charset;

public class Class_30534
extends Class_22553 {
    private final Class_22553 Field_30535;
    private final ByteOrder Field_30536;

    public int Method_30537() {
        return this.Field_30535.refCnt();
    }

    public long Method_30538() {
        return Class_10346.Method_10358(this.Field_30535.Method_22562());
    }

    public Class_22553 Method_30539(Class_22553 class_22553) {
        this.Field_30535.Method_22631(class_22553);
        return this;
    }

    public int Method_30540(Class_18115 class_18115) {
        return this.Field_30535.Method_22647(class_18115);
    }

    public Class_22553 Method_30541(Class_22553 class_22553) {
        this.Field_30535.Method_22605(class_22553);
        return this;
    }

    public Class_22553 Method_30542(int n) {
        return this.Field_30535.Method_22601(n).Method_22586(this.Method_30555());
    }

    public Class_22553 Method_30543() {
        return this.Field_30535.Method_22636().Method_22586(this.Field_30536);
    }

    public Class_22553 Method_30544(ByteBuffer byteBuffer) {
        this.Field_30535.Method_22577(byteBuffer);
        return this;
    }

    public Class_22553 Method_30545(int n) {
        this.Field_30535.Method_22645(n);
        return this;
    }

    public double Method_30546() {
        return Double.longBitsToDouble(this.Method_30538());
    }

    public short Method_30547() {
        return Class_10346.Method_10360(this.Field_30535.Method_22633());
    }

    public Class_22553 Method_30548(float f) {
        this.Method_30604(Float.floatToRawIntBits(f));
        return this;
    }

    public int Method_30549(ScatteringByteChannel scatteringByteChannel, int n) {
        return this.Field_30535.Method_22566(scatteringByteChannel, n);
    }

    public Class_22553 Method_30550() {
        this.Field_30535.Method_22608();
        return this;
    }

    private void Method_30551() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public int Method_30552(int n, ScatteringByteChannel scatteringByteChannel, int n2) {
        return this.Field_30535.Method_22642(n, scatteringByteChannel, n2);
    }

    public Class_22553 Method_30553() {
        this.Field_30535.Method_22600();
        return this;
    }

    public Class_22553 Method_30554(int n, int n2) {
        this.Field_30535.Method_22568(n, Class_10346.Method_10359(n2));
        return this;
    }

    public ByteOrder Method_30555() {
        return this.Field_30536;
    }

    public Class_22553 Method_30556(int n, Class_22553 class_22553, int n2, int n3) {
        this.Field_30535.Method_22624(n, class_22553, n2, n3);
        return this;
    }

    public Class_22553 Method_30557() {
        return this.Field_30535.Method_22598().Method_22586(this.Field_30536);
    }

    public Class_22553 Method_30558(int n, byte[] arrby, int n2, int n3) {
        this.Field_30535.Method_22622(n, arrby, n2, n3);
        return this;
    }

    public Class_22553 Method_30559(double d) {
        this.Method_30597(Double.doubleToRawLongBits(d));
        return this;
    }

    public boolean Method_30560() {
        return this.Field_30535.Method_22560();
    }

    public Class_22553 Method_30561() {
        this.Field_30535.Method_22637();
        return this;
    }

    public ByteBuffer Method_30562(int n, int n2) {
        return this.Field_30535.Method_22614(n, n2).order(this.Field_30536);
    }

    public short Method_30563() {
        return this.Field_30535.Method_22648();
    }

    public boolean Method_30564() {
        return this.Field_30535.Method_22572();
    }

    public int Method_30565() {
        return this.Field_30535.Method_22638();
    }

    public boolean Method_30566(Object object) {
        if (this == object) {
            return (25133 & 2113) != 0;
        }
        if (object instanceof Class_22553) {
            return Class_10346.Method_10351(this, (Class_22553)object);
        }
        return (6208 & -15104) != 0;
    }

    public Class_22553 Method_30567(byte[] arrby) {
        this.Field_30535.Method_22610(arrby);
        return this;
    }

    public Class_22553 Method_30568(OutputStream outputStream, int n) {
        this.Field_30535.Method_22597(outputStream, n);
        return this;
    }

    public byte Method_30569(int n) {
        return this.Field_30535.Method_22558(n);
    }

    public long Method_30570() {
        return this.Field_30535.Method_22616();
    }

    public Class_30534(Class_22553 class_22553) {
        if (class_22553 == null) {
            throw new NullPointerException("buf");
        }
        this.Field_30535 = class_22553;
        this.Field_30536 = class_22553.Method_22649() == ByteOrder.BIG_ENDIAN ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
    }

    public Class_22553 Method_30571(Class_22553 class_22553, int n, int n2) {
        this.Field_30535.Method_22585(class_22553, n, n2);
        return this;
    }

    public short Method_30572(int n) {
        return Class_10346.Method_10360(this.Field_30535.Method_22578(n));
    }

    public boolean Method_30573() {
        return this.Field_30535.release();
    }

    public int Method_30574(int n) {
        return this.Method_30572(n) & (18284543 & -1876885505);
    }

    public Class_22553 Method_30575() {
        return this.Field_30535.Method_22602();
    }

    public Class_21482 Method_30576() {
        return this.Method_30561();
    }

    public Class_22553 Method_30577(int n, ByteBuffer byteBuffer) {
        this.Field_30535.Method_22604(n, byteBuffer);
        return this;
    }

    public Class_22553 Method_30578(boolean bl) {
        this.Field_30535.Method_22592(bl);
        return this;
    }

    public byte[] Method_30579() {
        return this.Field_30535.Method_22599();
    }

    public Class_22553 Method_30580() {
        this.Field_30535.Method_22567();
        return this;
    }

    public String Method_30581(Charset charset) {
        return this.Field_30535.Method_22554(charset);
    }

    public Class_22553 Method_30582(ByteOrder byteOrder) {
        if (byteOrder == null) {
            throw new NullPointerException("endianness");
        }
        if (byteOrder == this.Field_30536) {
            return this;
        }
        return this.Field_30535;
    }

    public int Method_30583() {
        return this.Field_30535.Method_22582();
    }

    public int Method_30584(GatheringByteChannel gatheringByteChannel, int n) {
        return this.Field_30535.Method_22591(gatheringByteChannel, n);
    }

    public int Method_30585() {
        return this.Field_30535.Method_22574();
    }

    public int Method_30586(Object object) {
        return this.Method_30599((Class_22553)object);
    }

    public int Method_30587() {
        return this.Field_30535.Method_22634();
    }

    public Class_22553 Method_30588(int n, long l) {
        this.Field_30535.Method_22559(n, Class_10346.Method_10358(l));
        return this;
    }

    public int Method_30589() {
        return Class_10346.Method_10359(this.Field_30535.Method_22640());
    }

    public long Method_30590(int n) {
        return (long)this.Method_30623(n) & (0xFFFFFFFFL & 0xFFFFFFFFL);
    }

    public ByteBuffer[] Method_30591(int n, int n2) {
        ByteBuffer[] arrbyteBuffer = this.Field_30535.Method_22627(n, n2);
        for (int i = 21395 & 2084; i < arrbyteBuffer.length; ++i) {
            arrbyteBuffer[i] = arrbyteBuffer[i].order(this.Field_30536);
        }
        return arrbyteBuffer;
    }

    public int Method_30592(int n, GatheringByteChannel gatheringByteChannel, int n2) {
        return this.Field_30535.Method_22557(n, gatheringByteChannel, n2);
    }

    public int Method_30593() {
        return this.Field_30535.Method_22630();
    }

    public int Method_30594() {
        return this.Field_30535.Method_22564();
    }

    public Class_22553 Method_30595(int n, int n2) {
        this.Field_30535.Method_22643(n, n2);
        return this;
    }

    public Class_22553 Method_30596(byte[] arrby, int n, int n2) {
        this.Field_30535.Method_22573(arrby, n, n2);
        return this;
    }

    public Class_22553 Method_30597(long l) {
        this.Field_30535.Method_22584(Class_10346.Method_10358(l));
        return this;
    }

    public ByteBuffer Method_30598(int n, int n2) {
        return this.Method_30562(n, n2);
    }

    public int Method_30599(Class_22553 class_22553) {
        return Class_10346.Method_10373(this, class_22553);
    }

    public Class_22553 Method_30600(int n) {
        this.Method_30630(n);
        return this;
    }

    public byte Method_30601() {
        return this.Field_30535.Method_22555();
    }

    public Class_22553 Method_30602(int n, ByteBuffer byteBuffer) {
        this.Field_30535.Method_22617(n, byteBuffer);
        return this;
    }

    public Class_22553 Method_30603(int n, int n2) {
        this.Field_30535.Method_22561(n, Class_10346.Method_10360((short)n2));
        return this;
    }

    public Class_22553 Method_30604(int n) {
        this.Field_30535.Method_22565(Class_10346.Method_10359(n));
        return this;
    }

    public int Method_30605() {
        return this.Field_30535.Method_22620();
    }

    public int Method_30606() {
        return this.Field_30535.Method_22569();
    }

    public Class_22553 Method_30607(int n) {
        this.Field_30535.Method_22593(n);
        return this;
    }

    public float Method_30608() {
        return Float.intBitsToFloat(this.Method_30589());
    }

    public int Method_30609() {
        return this.Field_30535.Method_22612();
    }

    public Class_22553 Method_30610() {
        this.Field_30535.Method_22635();
        return this;
    }

    public short Method_30611(int n) {
        return this.Field_30535.Method_22607(n);
    }

    public Class_22553 Method_30612(int n) {
        this.Field_30535.Method_22563(n);
        return this;
    }

    public Class_22553 Method_30613(byte[] arrby) {
        this.Field_30535.Method_22618(arrby);
        return this;
    }

    public Class_22837 Method_30614() {
        return this.Field_30535.Method_22639();
    }

    public boolean Method_30615() {
        return this.Field_30535.Method_22579();
    }

    public int Method_30616() {
        return this.Method_30547() & (1074331647 & -1113325569);
    }

    public Class_22553 Method_30617(int n, int n2) {
        this.Field_30535.Method_22621(n, n2);
        return this;
    }

    public ByteBuffer[] Method_30618() {
        ByteBuffer[] arrbyteBuffer = this.Field_30535.Method_22629();
        for (int i = 4099 & 8248; i < arrbyteBuffer.length; ++i) {
            arrbyteBuffer[i] = arrbyteBuffer[i].order(this.Field_30536);
        }
        return arrbyteBuffer;
    }

    public boolean Method_30619() {
        return this.Field_30535.Method_22611();
    }

    public Class_22553 Method_30620(int n, byte[] arrby, int n2, int n3) {
        this.Field_30535.Method_22626(n, arrby, n2, n3);
        return this;
    }

    public Class_22553 Method_30621(int n, OutputStream outputStream, int n2) {
        this.Field_30535.Method_22632(n, outputStream, n2);
        return this;
    }

    public long Method_30622(int n) {
        return Class_10346.Method_10358(this.Field_30535.Method_22571(n));
    }

    public int Method_30623(int n) {
        return Class_10346.Method_10359(this.Field_30535.Method_22581(n));
    }

    public Class_22553 Method_30624(int n) {
        this.Field_30535.Method_22606(n);
        return this;
    }

    public Class_22553 Method_30625(byte[] arrby, int n, int n2) {
        this.Field_30535.Method_22570(arrby, n, n2);
        return this;
    }

    public Class_22553 Method_30626(int n, byte[] arrby) {
        this.Field_30535.Method_22596(n, arrby);
        return this;
    }

    public Class_22553 Method_30627(int n) {
        this.Field_30535.Method_22609(n);
        return this;
    }

    public String Method_30628() {
        return "Swapped(" + this.Field_30535.Method_22556() + (char)(-29123 & 8619);
    }

    public ByteBuffer Method_30629() {
        return this.Field_30535.Method_22644().order(this.Field_30536);
    }

    public Class_22553 Method_30630(int n) {
        this.Field_30535.Method_22575(Class_10346.Method_10360((short)n));
        return this;
    }

    public Class_22553 Method_30631(int n, int n2) {
        return this.Field_30535.Method_22623(n, n2).Method_22586(this.Field_30536);
    }

    public Class_22553 Method_30632(int n) {
        this.Field_30535.Method_22590(n);
        return this;
    }

    public Class_22553 Method_30633(int n, Class_22553 class_22553, int n2, int n3) {
        this.Field_30535.Method_22589(n, class_22553, n2, n3);
        return this;
    }

    public boolean Method_30634() {
        return this.Field_30535.Method_22583();
    }
}

