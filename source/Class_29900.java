/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 */
import com.google.common.base.Charsets;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;
import java.nio.charset.Charset;
import java.util.UUID;

public class Class_29900
extends Class_22553 {
    private final Class_22553 Field_29901;

    public ByteBuffer Method_29902() {
        return this.Field_29901.Method_22644();
    }

    public Class_22553 Method_29903(byte[] arrby) {
        return this.Field_29901.Method_22610(arrby);
    }

    public Class_22553 Method_29904(byte[] arrby) {
        return this.Field_29901.Method_22618(arrby);
    }

    public Class_22553 Method_29905(byte[] arrby, int n, int n2) {
        return this.Field_29901.Method_22573(arrby, n, n2);
    }

    public Class_22553 Method_29906(int n, Class_22553 class_22553, int n2, int n3) {
        return this.Field_29901.Method_22589(n, class_22553, n2, n3);
    }

    public Class_22553 Method_29907(int n, byte[] arrby, int n2, int n3) {
        return this.Field_29901.Method_22626(n, arrby, n2, n3);
    }

    public int Method_29908(ScatteringByteChannel scatteringByteChannel, int n) {
        return this.Field_29901.Method_22566(scatteringByteChannel, n);
    }

    public Class_22553 Method_29909(Class_22553 class_22553) {
        return this.Field_29901.Method_22631(class_22553);
    }

    public Class_4751 Method_29910() {
        return Class_4751.Method_4773(this.Method_30001());
    }

    public int Method_29911() {
        return this.Field_29901.Method_22634();
    }

    public int Method_29912() {
        return this.Field_29901.Method_22638();
    }

    public void Method_29913(long l) {
        while ((l & (-96L & -63L)) != (849412256L & 4577472313377185810L)) {
            this.Method_29949((int)(l & (-5448219673996590465L & 537395327L)) | 10968 & 21632);
            l >>>= 26831 & 4103;
        }
        this.Method_29949((int)l);
    }

    public int Method_29914() {
        return this.Field_29901.Method_22640();
    }

    public Class_22553 Method_29915() {
        return this.Field_29901.Method_22600();
    }

    public Class_22553 Method_29916(int n, int n2) {
        return this.Field_29901.Method_22561(n, n2);
    }

    public Class_22553 Method_29917(OutputStream outputStream, int n) {
        return this.Field_29901.Method_22597(outputStream, n);
    }

    public short Method_29918(int n) {
        return this.Field_29901.Method_22607(n);
    }

    public Class_22553 Method_29919(int n, byte[] arrby) {
        return this.Field_29901.Method_22596(n, arrby);
    }

    public int Method_29920(GatheringByteChannel gatheringByteChannel, int n) {
        return this.Field_29901.Method_22591(gatheringByteChannel, n);
    }

    public Class_22553 Method_29921(int n, byte[] arrby, int n2, int n3) {
        return this.Field_29901.Method_22622(n, arrby, n2, n3);
    }

    public Class_22553 Method_29922(int n) {
        return this.Field_29901.Method_22575(n);
    }

    public Class_22553 Method_29923(int n, int n2) {
        return this.Field_29901.Method_22621(n, n2);
    }

    public short Method_29924(int n) {
        return this.Field_29901.Method_22578(n);
    }

    public Class_22553 Method_29925(int n) {
        return this.Field_29901.Method_22563(n);
    }

    public static int Method_29926(int n) {
        for (int i = -15351 & 2437; i < (2069 & -15379); ++i) {
            if ((n & (-1 & -1) << i * (1879 & 10375)) != 0) continue;
            return i;
        }
        return 8197 & -29563;
    }

    public int Method_29927(int n) {
        return this.Field_29901.Method_22580(n);
    }

    public Class_22553 Method_29928() {
        return this.Field_29901.Method_22635();
    }

    public boolean Method_29929() {
        return this.Field_29901.Method_22579();
    }

    public void Method_29930(Class_1782 class_1782) {
        this.Method_29960(Class_2814.Method_2821(class_1782));
    }

    public int Method_29931() {
        return this.Field_29901.refCnt();
    }

    public ByteBuffer Method_29932(int n, int n2) {
        return this.Field_29901.Method_22588(n, n2);
    }

    public Class_22553 Method_29933(int n) {
        return this.Field_29901.Method_22576(n);
    }

    public Class_22553 Method_29934(int n) {
        return this.Field_29901.Method_22645(n);
    }

    public int Method_29935(int n) {
        return this.Field_29901.Method_22581(n);
    }

    public int Method_29936(Class_22553 class_22553) {
        return this.Field_29901.Method_22594(class_22553);
    }

    public Class_22553 Method_29937() {
        return this.Field_29901.Method_22608();
    }

    public Class_22553 Method_29938(int n, ByteBuffer byteBuffer) {
        return this.Field_29901.Method_22604(n, byteBuffer);
    }

    public Class_22553 Method_29939(float f) {
        return this.Field_29901.Method_22619(f);
    }

    public Class_22553 Method_29940(Class_22553 class_22553) {
        return this.Field_29901.Method_22605(class_22553);
    }

    public Class_22553 Method_29941(double d) {
        return this.Field_29901.Method_22603(d);
    }

    public ByteOrder Method_29942() {
        return this.Field_29901.Method_22649();
    }

    public Class_22553 Method_29943(int n, long l) {
        return this.Field_29901.Method_22559(n, l);
    }

    public byte Method_29944() {
        return this.Field_29901.Method_22555();
    }

    public Class_22553 Method_29945() {
        return this.Field_29901.Method_22567();
    }

    public void Method_29946(byte[] arrby) {
        this.Method_29982(arrby.length);
        this.Method_29903(arrby);
    }

    public int Method_29947(int n, GatheringByteChannel gatheringByteChannel, int n2) {
        return this.Field_29901.Method_22557(n, gatheringByteChannel, n2);
    }

    public double Method_29948() {
        return this.Field_29901.Method_22628();
    }

    public Class_22553 Method_29949(int n) {
        return this.Field_29901.Method_22606(n);
    }

    public byte[] Method_29950() {
        byte[] arrby = new byte[this.Method_30004()];
        this.Method_29904(arrby);
        return arrby;
    }

    public Class_22553 Method_29951(int n) {
        return this.Field_29901.Method_22601(n);
    }

    public Class_22553 Method_29952(int n) {
        return this.Field_29901.Method_22609(n);
    }

    public Class_21482 Method_29953() {
        return this.Method_30012();
    }

    public ByteBuffer[] Method_29954() {
        return this.Field_29901.Method_22629();
    }

    public Class_22553 Method_29955(int n, ByteBuffer byteBuffer) {
        return this.Field_29901.Method_22617(n, byteBuffer);
    }

    public Class_22553 Method_29956(Class_22553 class_22553, int n, int n2) {
        return this.Field_29901.Method_22585(class_22553, n, n2);
    }

    public Class_22553 Method_29957(long l) {
        return this.Field_29901.Method_22584(l);
    }

    public int Method_29958() {
        return this.Field_29901.Method_22620();
    }

    public byte[] Method_29959() {
        return this.Field_29901.Method_22599();
    }

    public Class_29900 Method_29960(String string) {
        byte[] arrby = string.getBytes(Charsets.UTF_8);
        if (arrby.length > (32767 & 32767) && !Class_18.Field_60) {
            throw new Class_47970("String too big (was " + string.length() + " bytes encoded, max " + (32767 & -1) + ")");
        }
        this.Method_29982(arrby.length);
        this.Method_29903(arrby);
        return this;
    }

    public int Method_29961() {
        return this.Field_29901.Method_22569();
    }

    public boolean Method_29962() {
        return this.Field_29901.Method_22572();
    }

    public Class_22553 Method_29963(int n) {
        return this.Field_29901.Method_22590(n);
    }

    public void Method_29964(Enum enum_) {
        this.Method_29982(enum_.ordinal());
    }

    public Class_22553 Method_29965(int n, int n2) {
        return this.Field_29901.Method_22643(n, n2);
    }

    public float Method_29966() {
        return this.Field_29901.Method_22641();
    }

    public Class_22837 Method_29967() {
        return this.Field_29901.Method_22639();
    }

    public boolean Method_29968() {
        return this.Field_29901.Method_22611();
    }

    public long Method_29969() {
        return this.Field_29901.Method_22616();
    }

    public Class_1699 Method_29970() {
        int n = this.Method_30005();
        byte by = this.Method_29944();
        if (by == 0) {
            return null;
        }
        this.Method_29963(n);
        return Class_24711.Method_24715(new Class_12071(this), new Class_19804(1345721608L & 2022674559196520966L));
    }

    public ByteBuffer Method_29971(int n, int n2) {
        return this.Field_29901.Method_22614(n, n2);
    }

    public boolean Method_29972() {
        return this.Field_29901.release();
    }

    public Class_22553 Method_29973(ByteBuffer byteBuffer) {
        return this.Field_29901.Method_22577(byteBuffer);
    }

    public int Method_29974() {
        return this.Field_29901.Method_22574();
    }

    public Class_22553 Method_29975() {
        return this.Field_29901.Method_22636();
    }

    public void Method_29976(Class_1699 class_1699) {
        if (class_1699 == null) {
            this.Method_29949(-32123 & 1072);
        } else {
            try {
                Class_24711.Method_24712(class_1699, new Class_2727(this));
            }
            catch (IOException iOException) {
                throw new Class_47970(iOException);
            }
        }
    }

    public int Method_29977(Class_18115 class_18115) {
        return this.Field_29901.Method_22647(class_18115);
    }

    public Class_22553 Method_29978(int n) {
        return this.Field_29901.Method_22593(n);
    }

    public ByteBuffer[] Method_29979(int n, int n2) {
        return this.Field_29901.Method_22627(n, n2);
    }

    public Class_22553 Method_29980(boolean bl) {
        return this.Field_29901.Method_22592(bl);
    }

    public int Method_29981() {
        return this.Field_29901.Method_22615();
    }

    public void Method_29982(int n) {
        while ((n & (-119 & -12)) != 0) {
            this.Method_29949(n & (-30209 & 4735) | 13504 & 144);
            n >>>= 17031 & 6503;
        }
        this.Method_29949(n);
    }

    public String Method_29983(Charset charset) {
        return this.Field_29901.Method_22554(charset);
    }

    public void Method_29984(Class_23823 class_23823) {
        if (class_23823 == null) {
            this.Method_29922(-1 & -1);
        } else {
            this.Method_29922(Class_1956.Method_1986(class_23823.Method_23844()));
            this.Method_29949(class_23823.Field_23826);
            this.Method_29922(class_23823.Method_23843());
            Class_1699 class_1699 = null;
            if (class_23823.Method_23844().Method_1984() || class_23823.Method_23844().Method_1996()) {
                class_1699 = class_23823.Method_23845();
            }
            this.Method_29976(class_1699);
        }
    }

    public long Method_29985(int n) {
        return this.Field_29901.Method_22571(n);
    }

    public byte Method_29986(int n) {
        return this.Field_29901.Method_22558(n);
    }

    public Class_22553 Method_29987() {
        return this.Field_29901.Method_22598();
    }

    public long Method_29988(int n) {
        return this.Field_29901.Method_22595(n);
    }

    public int Method_29989(Object object) {
        return this.Method_29936((Class_22553)object);
    }

    public Class_22553 Method_29990(int n, int n2) {
        return this.Field_29901.Method_22623(n, n2);
    }

    public String Method_29991(int n) {
        int n2 = this.Method_30004();
        if (n2 > n * (-32252 & 4526) && !Class_18.Field_60) {
            throw new Class_32043("The received encoded string buffer length is longer than maximum allowed (" + n2 + " > " + n * (4244 & 25356) + ")");
        }
        if (n2 < 0) {
            throw new Class_32043("The received encoded string buffer length is less than zero! Weird string!");
        }
        String string = new String(this.Method_29951(n2).Method_22599(), Charsets.UTF_8);
        if (string.length() > n && !Class_18.Field_60) {
            throw new Class_32043("The received string length is longer than maximum allowed (" + n2 + " > " + n + ")");
        }
        return string;
    }

    public boolean Method_29992() {
        return this.Field_29901.Method_22583();
    }

    public boolean Method_29993() {
        return this.Field_29901.Method_22560();
    }

    public Class_22553 Method_29994() {
        return this.Field_29901.Method_22602();
    }

    public Class_22553 Method_29995(int n, int n2) {
        return this.Field_29901.Method_22568(n, n2);
    }

    public void Method_29996(Class_4751 class_4751) {
        this.Method_29957(class_4751.Method_4787());
    }

    public void Method_29997(UUID uUID) {
        this.Method_29957(uUID.getMostSignificantBits());
        this.Method_29957(uUID.getLeastSignificantBits());
    }

    public Class_22553 Method_29998(byte[] arrby, int n, int n2) {
        return this.Field_29901.Method_22570(arrby, n, n2);
    }

    public String Method_29999() {
        return this.Field_29901.Method_22556();
    }

    public Class_22553 Method_30000(ByteOrder byteOrder) {
        return this.Field_29901.Method_22586(byteOrder);
    }

    public long Method_30001() {
        return this.Field_29901.Method_22562();
    }

    public Class_23823 Method_30002() {
        Class_23823 class_23823 = null;
        short s = this.Method_30008();
        if (s >= 0) {
            byte by = this.Method_29944();
            short s2 = this.Method_30008();
            class_23823 = new Class_23823(Class_1956.Method_1978(s), (int)by, (int)s2);
            class_23823.Method_23869(this.Method_29970());
        }
        return class_23823;
    }

    public int Method_30003() {
        return this.Field_29901.Method_22630();
    }

    public int Method_30004() {
        byte by;
        int n = 1328 & -7680;
        int n2 = 3212 & 16978;
        do {
            by = this.Method_29944();
            n |= (by & (24959 & -32129)) << n2++ * (-22297 & 799);
            if (n2 <= (8215 & 141)) continue;
            throw new RuntimeException("VarInt too big");
        } while ((by & (4736 & 1432)) == (-24176 & 23714));
        return n;
    }

    public int Method_30005() {
        return this.Field_29901.Method_22582();
    }

    public int Method_30006(int n, ScatteringByteChannel scatteringByteChannel, int n2) {
        return this.Field_29901.Method_22642(n, scatteringByteChannel, n2);
    }

    public int Method_30007() {
        return this.Field_29901.Method_22612();
    }

    public short Method_30008() {
        return this.Field_29901.Method_22633();
    }

    public Enum Method_30009(Class class_) {
        return ((Enum[])class_.getEnumConstants())[this.Method_30004()];
    }

    public Class_22553 Method_30010(int n) {
        return this.Field_29901.Method_22565(n);
    }

    public UUID Method_30011() {
        return new UUID(this.Method_30001(), this.Method_30001());
    }

    public Class_22553 Method_30012() {
        return this.Field_29901.Method_22637();
    }

    private void Method_30013() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public int Method_30014() {
        return this.Field_29901.Method_22564();
    }

    public Class_22553 Method_30015(int n, Class_22553 class_22553, int n2, int n3) {
        return this.Field_29901.Method_22624(n, class_22553, n2, n3);
    }

    public short Method_30016() {
        return this.Field_29901.Method_22648();
    }

    public boolean Method_30017(Object object) {
        return this.Field_29901.Method_22625(object);
    }

    public Class_29900(Class_22553 class_22553) {
        this.Field_29901 = class_22553;
    }

    public Class_22553 Method_30018(int n, OutputStream outputStream, int n2) {
        return this.Field_29901.Method_22632(n, outputStream, n2);
    }

    public long Method_30019() {
        byte by;
        long l = -7300055958367950846L & 7300055956241650256L;
        int n = -14336 & 4697;
        do {
            by = this.Method_29944();
            l |= (long)(by & (383 & -20225)) << n++ * (2063 & -31721);
            if (n <= (1098 & -32758)) continue;
            throw new RuntimeException("VarLong too big");
        } while ((by & (12673 & 19126)) == (-15964 & 1240));
        return l;
    }

    public Class_1782 Method_30020() {
        return Class_2814.Method_2819(this.Method_29991(32767 & 32767));
    }
}

