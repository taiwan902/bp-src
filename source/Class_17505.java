/*
 * Decompiled with CFR 0.145.
 */
import java.io.InputStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.SeekableByteChannel;

public class Class_17505
extends InputStream {
    private int Field_17506 = 8237 & 6082;
    private boolean Field_17507 = 16436 & 8704;
    private byte[] Field_17508 = new byte[-28912 & 676];
    private SeekableByteChannel Field_17509;
    private byte[] Field_17510 = new byte[17960 & -23920];
    private int Field_17511 = 8 & -31436;
    private long Field_17512;
    private Class_5958 Field_17513;
    private Class_31554 Field_17514;

    public int Method_17515() {
        int n = this.Field_17511 - this.Field_17506;
        return n;
    }

    public int Method_17516() {
        if (this.Field_17506 >= this.Field_17511) {
            int n = 4100 & -24416;
            while (n == 0) {
                n = this.Method_17521();
            }
            if (n == (-1 & -1)) {
                return -1 & -1;
            }
        }
        this.Field_17512 += 2761021238062613513L & 79738949L;
        if (this.Field_17514 != null) {
            this.Field_17514.Method_31555(this.Field_17512);
        }
        int n = this.Field_17506;
        this.Field_17506 = n + (129 & 4145);
        return this.Field_17510[n] & (-24321 & 2047);
    }

    private static void Method_17517(ReadableByteChannel readableByteChannel, ByteBuffer byteBuffer) {
        for (int i = byteBuffer.capacity(); readableByteChannel.read(byteBuffer) > 0 && i > 0; --i) {
        }
    }

    public Class_17505(SeekableByteChannel seekableByteChannel, byte[] arrby, Class_31554 class_31554) {
        this.Field_17509 = seekableByteChannel;
        this.Field_17513 = new Class_5958(arrby);
        this.Field_17514 = class_31554;
    }

    public long Method_17518(long l) {
        int n = this.Field_17511 - this.Field_17506;
        if (l > (long)n) {
            l = n;
        }
        if (l < (7578638736431516977L & -7578638737924341116L)) {
            return 1536939898781667405L & -1536939898838843262L;
        }
        this.Field_17506 = (int)((long)this.Field_17506 + l);
        this.Field_17512 += l;
        if (this.Field_17514 != null) {
            this.Field_17514.Method_31555(this.Field_17512);
        }
        return l;
    }

    private void Method_17519() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_17520() {
        return (-31728 & 16896) != 0;
    }

    private int Method_17521() {
        int n;
        if (this.Field_17507) {
            return -1 & -1;
        }
        int n2 = this.Field_17509.read(ByteBuffer.wrap(this.Field_17508));
        if (n2 != (-1 & -1) && (n2 & (15 & -7473)) != 0) {
            n = n2 & (207 & 8239);
            int n3 = (304 & 6876) - n;
            Class_17505.Method_17517(this.Field_17509, ByteBuffer.wrap(this.Field_17508, n2, n3));
            n2 += n3;
        }
        if (n2 == (-1 & -1)) {
            this.Field_17507 = -32191 & 27049;
            return -1 & -1;
        }
        for (n = 10536 & 17621; n < n2; n += 16) {
            this.Field_17513.Method_5976(this.Field_17508, n, this.Field_17510, n);
        }
        this.Field_17506 = -15220 & 8528;
        this.Field_17511 = n2;
        return this.Field_17511;
    }

    public int Method_17522(byte[] arrby, int n, int n2) {
        int n3;
        if (this.Field_17506 >= this.Field_17511) {
            n3 = 9352 & 320;
            while (n3 == 0) {
                n3 = this.Method_17521();
            }
            if (n3 == (-1 & -1)) {
                return -1 & -1;
            }
        }
        if (n2 <= 0) {
            return 2048 & -32686;
        }
        n3 = this.Field_17511 - this.Field_17506;
        if (n2 < n3) {
            n3 = n2;
        }
        if (arrby != null) {
            System.arraycopy(this.Field_17510, this.Field_17506, arrby, n, n3);
        }
        this.Field_17506 += n3;
        this.Field_17512 += (long)n3;
        if (this.Field_17514 != null) {
            this.Field_17514.Method_31555(this.Field_17512);
        }
        return n3;
    }
}

