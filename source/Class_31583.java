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

public class Class_31583
extends Class_22553 {
    protected final Class_22553 Field_31584;

    public ByteBuffer[] Method_31585(int n, int n2) {
        return this.Field_31584.Method_22627(n, n2);
    }

    public int Method_31586() {
        return this.Field_31584.Method_22620();
    }

    public Class_22553 Method_31587(int n, ByteBuffer byteBuffer) {
        this.Field_31584.Method_22604(n, byteBuffer);
        return this;
    }

    public Class_22553 Method_31588(byte[] arrby) {
        this.Field_31584.Method_22610(arrby);
        return this;
    }

    public int Method_31589() {
        return this.Field_31584.Method_22615();
    }

    public Class_22837 Method_31590() {
        return this.Field_31584.Method_22639();
    }

    public Class_22553 Method_31591(int n, int n2) {
        this.Field_31584.Method_22643(n, n2);
        return this;
    }

    public int Method_31592() {
        return this.Field_31584.Method_22582();
    }

    public Class_22553 Method_31593(double d) {
        this.Field_31584.Method_22603(d);
        return this;
    }

    public int Method_31594(ScatteringByteChannel scatteringByteChannel, int n) {
        return this.Field_31584.Method_22566(scatteringByteChannel, n);
    }

    public Class_22553 Method_31595(int n) {
        this.Field_31584.Method_22609(n);
        return this;
    }

    public long Method_31596(int n) {
        return this.Field_31584.Method_22595(n);
    }

    public int Method_31597(GatheringByteChannel gatheringByteChannel, int n) {
        return this.Field_31584.Method_22591(gatheringByteChannel, n);
    }

    public Class_22553 Method_31598(byte[] arrby, int n, int n2) {
        this.Field_31584.Method_22573(arrby, n, n2);
        return this;
    }

    public Class_22553 Method_31599(ByteOrder byteOrder) {
        return this.Field_31584.Method_22586(byteOrder);
    }

    public short Method_31600(int n) {
        return this.Field_31584.Method_22578(n);
    }

    public float Method_31601() {
        return this.Field_31584.Method_22641();
    }

    public int Method_31602() {
        return this.Field_31584.refCnt();
    }

    public Class_22553 Method_31603(int n) {
        this.Field_31584.Method_22593(n);
        return this;
    }

    public ByteBuffer Method_31604(int n, int n2) {
        return this.Field_31584.Method_22614(n, n2);
    }

    public short Method_31605(int n) {
        return this.Field_31584.Method_22607(n);
    }

    public Class_22553 Method_31606(int n, byte[] arrby, int n2, int n3) {
        this.Field_31584.Method_22626(n, arrby, n2, n3);
        return this;
    }

    public int Method_31607() {
        return this.Field_31584.Method_22630();
    }

    public Class_22553 Method_31608() {
        return this.Field_31584.Method_22636();
    }

    public ByteBuffer Method_31609() {
        return this.Field_31584.Method_22644();
    }

    public Class_22553 Method_31610(int n, Class_22553 class_22553, int n2, int n3) {
        this.Field_31584.Method_22589(n, class_22553, n2, n3);
        return this;
    }

    public boolean Method_31611(Object object) {
        return this.Field_31584.Method_22625(object);
    }

    public Class_22553 Method_31612(Class_22553 class_22553, int n, int n2) {
        this.Field_31584.Method_22585(class_22553, n, n2);
        return this;
    }

    public Class_22553 Method_31613(int n) {
        this.Field_31584.Method_22565(n);
        return this;
    }

    public Class_21482 Method_31614() {
        return this.Method_31626();
    }

    public short Method_31615() {
        return this.Field_31584.Method_22633();
    }

    public Class_22553 Method_31616(int n, ByteBuffer byteBuffer) {
        this.Field_31584.Method_22617(n, byteBuffer);
        return this;
    }

    public ByteBuffer[] Method_31617() {
        return this.Field_31584.Method_22629();
    }

    public int Method_31618(int n, GatheringByteChannel gatheringByteChannel, int n2) {
        return this.Field_31584.Method_22557(n, gatheringByteChannel, n2);
    }

    public int Method_31619() {
        return this.Field_31584.Method_22564();
    }

    public Class_22553 Method_31620(byte[] arrby) {
        this.Field_31584.Method_22618(arrby);
        return this;
    }

    protected Class_31583(Class_22553 class_22553) {
        if (class_22553 == null) {
            throw new NullPointerException("buf");
        }
        this.Field_31584 = class_22553;
    }

    public int Method_31621() {
        return this.Field_31584.Method_22612();
    }

    public boolean Method_31622() {
        return this.Field_31584.Method_22572();
    }

    public int Method_31623(int n) {
        return this.Field_31584.Method_22580(n);
    }

    public short Method_31624() {
        return this.Field_31584.Method_22648();
    }

    public Class_22553 Method_31625(int n, OutputStream outputStream, int n2) {
        this.Field_31584.Method_22632(n, outputStream, n2);
        return this;
    }

    public Class_22553 Method_31626() {
        this.Field_31584.Method_22637();
        return this;
    }

    public Class_22553 Method_31627(boolean bl) {
        this.Field_31584.Method_22592(bl);
        return this;
    }

    public boolean Method_31628() {
        return this.Field_31584.Method_22611();
    }

    public long Method_31629(int n) {
        return this.Field_31584.Method_22571(n);
    }

    public Class_22553 Method_31630() {
        this.Field_31584.Method_22635();
        return this;
    }

    public int Method_31631() {
        return this.Field_31584.Method_22634();
    }

    public byte Method_31632(int n) {
        return this.Field_31584.Method_22558(n);
    }

    public int Method_31633(int n) {
        return this.Field_31584.Method_22581(n);
    }

    public Class_22553 Method_31634(Class_22553 class_22553) {
        this.Field_31584.Method_22605(class_22553);
        return this;
    }

    public Class_22553 Method_31635(int n) {
        this.Field_31584.Method_22575(n);
        return this;
    }

    public long Method_31636() {
        return this.Field_31584.Method_22616();
    }

    public byte Method_31637() {
        return this.Field_31584.Method_22555();
    }

    public Class_22553 Method_31638() {
        this.Field_31584.Method_22600();
        return this;
    }

    public Class_22553 Method_31639(Class_22553 class_22553) {
        this.Field_31584.Method_22631(class_22553);
        return this;
    }

    public byte[] Method_31640() {
        return this.Field_31584.Method_22599();
    }

    public Class_22553 Method_31641(int n, byte[] arrby, int n2, int n3) {
        this.Field_31584.Method_22622(n, arrby, n2, n3);
        return this;
    }

    public Class_22553 Method_31642(byte[] arrby, int n, int n2) {
        this.Field_31584.Method_22570(arrby, n, n2);
        return this;
    }

    public Class_22553 Method_31643(int n) {
        this.Field_31584.Method_22590(n);
        return this;
    }

    public boolean Method_31644() {
        return this.Field_31584.release();
    }

    public Class_22553 Method_31645(ByteBuffer byteBuffer) {
        this.Field_31584.Method_22577(byteBuffer);
        return this;
    }

    public Class_22553 Method_31646(int n, long l) {
        this.Field_31584.Method_22559(n, l);
        return this;
    }

    public Class_22553 Method_31647(int n, int n2) {
        this.Field_31584.Method_22561(n, n2);
        return this;
    }

    public Class_22553 Method_31648(int n, int n2) {
        this.Field_31584.Method_22568(n, n2);
        return this;
    }

    public ByteBuffer Method_31649(int n, int n2) {
        return this.Field_31584.Method_22588(n, n2);
    }

    public int Method_31650(Object object) {
        return this.Method_31680((Class_22553)object);
    }

    public boolean Method_31651() {
        return this.Field_31584.Method_22583();
    }

    public boolean Method_31652() {
        return this.Field_31584.Method_22560();
    }

    public Class_22553 Method_31653(int n, int n2) {
        return this.Field_31584.Method_22623(n, n2);
    }

    public ByteOrder Method_31654() {
        return this.Field_31584.Method_22649();
    }

    public Class_22553 Method_31655() {
        return this.Field_31584.Method_22598();
    }

    public Class_22553 Method_31656(int n) {
        this.Field_31584.Method_22563(n);
        return this;
    }

    public Class_22553 Method_31657(long l) {
        this.Field_31584.Method_22584(l);
        return this;
    }

    public int Method_31658() {
        return this.Field_31584.Method_22569();
    }

    public int Method_31659(int n, ScatteringByteChannel scatteringByteChannel, int n2) {
        return this.Field_31584.Method_22642(n, scatteringByteChannel, n2);
    }

    public Class_22553 Method_31660(int n, byte[] arrby) {
        this.Field_31584.Method_22596(n, arrby);
        return this;
    }

    public Class_22553 Method_31661() {
        return this.Field_31584;
    }

    public int Method_31662() {
        return this.Field_31584.Method_22640();
    }

    public Class_22553 Method_31663(float f) {
        this.Field_31584.Method_22619(f);
        return this;
    }

    public Class_22553 Method_31664() {
        this.Field_31584.Method_22608();
        return this;
    }

    public Class_22553 Method_31665(int n, int n2) {
        this.Field_31584.Method_22621(n, n2);
        return this;
    }

    public String Method_31666(Charset charset) {
        return this.Field_31584.Method_22554(charset);
    }

    public Class_22553 Method_31667(int n, Class_22553 class_22553, int n2, int n3) {
        this.Field_31584.Method_22624(n, class_22553, n2, n3);
        return this;
    }

    private void Method_31668() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public int Method_31669(Class_18115 class_18115) {
        return this.Field_31584.Method_22647(class_18115);
    }

    public double Method_31670() {
        return this.Field_31584.Method_22628();
    }

    public int Method_31671() {
        return this.Field_31584.Method_22638();
    }

    public Class_22553 Method_31672(int n) {
        return this.Field_31584.Method_22601(n);
    }

    public Class_22553 Method_31673(int n) {
        this.Field_31584.Method_22606(n);
        return this;
    }

    public boolean Method_31674() {
        return this.Field_31584.Method_22579();
    }

    public Class_22553 Method_31675(int n) {
        this.Field_31584.Method_22576(n);
        return this;
    }

    public Class_22553 Method_31676(OutputStream outputStream, int n) {
        this.Field_31584.Method_22597(outputStream, n);
        return this;
    }

    public Class_22553 Method_31677() {
        this.Field_31584.Method_22567();
        return this;
    }

    public Class_22553 Method_31678(int n) {
        this.Field_31584.Method_22645(n);
        return this;
    }

    public long Method_31679() {
        return this.Field_31584.Method_22562();
    }

    public int Method_31680(Class_22553 class_22553) {
        return this.Field_31584.Method_22594(class_22553);
    }

    public String Method_31681() {
        return Class_22304.Method_22312(this) + (char)(1208 & 2347) + this.Field_31584.Method_22556() + (char)(21611 & 8617);
    }

    public int Method_31682() {
        return this.Field_31584.Method_22574();
    }
}

