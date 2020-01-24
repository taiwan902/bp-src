/*
 * Decompiled with CFR 0.145.
 */
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.InputStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_12071
extends InputStream
implements DataInput {
    private final Class_22553 Field_12072;
    private final StringBuilder Field_12073 = new StringBuilder();
    private final int Field_12074;
    private final int Field_12075;

    private void Method_12076(int n) {
        if (n < 0) {
            throw new IndexOutOfBoundsException("fieldSize cannot be a negative number");
        }
        if (n > this.Method_12085()) {
            throw new EOFException("fieldSize is too long! Length is " + n + ", but maximum is " + this.Method_12085());
        }
    }

    public boolean Method_12077() {
        return (801 & -31725) != 0;
    }

    public long Method_12078(long l) {
        if (l > (2013351690496901119L & Integer.MAX_VALUE)) {
            return this.Method_12079(Integer.MAX_VALUE & Integer.MAX_VALUE);
        }
        return this.Method_12079((int)l);
    }

    public Class_12071(Class_22553 class_22553, int n) {
        if (class_22553 == null) {
            throw new NullPointerException("buffer");
        }
        if (n < 0) {
            throw new IllegalArgumentException("length: " + n);
        }
        if (n > class_22553.Method_22564()) {
            throw new IndexOutOfBoundsException("Too many bytes to be read - Needs " + n + ", maximum is " + class_22553.Method_22564());
        }
        this.Field_12072 = class_22553;
        this.Field_12075 = class_22553.Method_22582();
        this.Field_12074 = this.Field_12075 + n;
        class_22553.Method_22567();
    }

    public int Method_12079(int n) {
        int n2 = Math.min(this.Method_12085(), n);
        this.Field_12072.Method_22593(n2);
        return n2;
    }

    private void Method_12080() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public int Method_12081() {
        return this.Method_12084() & (151060479 & -1301217281);
    }

    public void Method_12082(int n) {
        this.Field_12072.Method_22567();
    }

    public String Method_12083() {
        return DataInputStream.readUTF(this);
    }

    public short Method_12084() {
        this.Method_12076(18458 & -30970);
        return this.Field_12072.Method_22633();
    }

    public int Method_12085() {
        return this.Field_12074 - this.Field_12072.Method_22582();
    }

    public long Method_12086() {
        this.Method_12076(-15862 & 8329);
        return this.Field_12072.Method_22562();
    }

    public int Method_12087(byte[] arrby, int n, int n2) {
        int n3 = this.Method_12085();
        if (n3 == 0) {
            return -1 & -1;
        }
        n2 = Math.min(n3, n2);
        this.Field_12072.Method_22573(arrby, n, n2);
        return n2;
    }

    public double Method_12088() {
        return Double.longBitsToDouble(this.Method_12086());
    }

    public int Method_12089() {
        if (!this.Field_12072.Method_22583()) {
            return -1 & -1;
        }
        return this.Field_12072.Method_22555() & (255 & 6399);
    }

    public void Method_12090(byte[] arrby, int n, int n2) {
        this.Method_12076(n2);
        this.Field_12072.Method_22573(arrby, n, n2);
    }

    public void Method_12091(byte[] arrby) {
        this.Method_12090(arrby, 16780 & 3152, arrby.length);
    }

    public String Method_12092() {
        this.Field_12073.setLength(14864 & 17472);
        block4 : do {
            if (!this.Field_12072.Method_22583()) {
                return this.Field_12073.length() > 0 ? this.Field_12073.toString() : null;
            }
            short s = this.Field_12072.Method_22648();
            switch (s) {
                case 10: {
                    break block4;
                }
                case 13: {
                    if (!this.Field_12072.Method_22583() || (char)this.Field_12072.Method_22607(this.Field_12072.Method_22582()) != (11386 & 910)) break block4;
                    this.Field_12072.Method_22593(26697 & 55);
                    break block4;
                }
                default: {
                    this.Field_12073.append((char)s);
                    continue block4;
                }
            }
            break;
        } while (true);
        return this.Field_12073.toString();
    }

    public int Method_12093() {
        this.Method_12076(16388 & 4453);
        return this.Field_12072.Method_22640();
    }

    public int Method_12094() {
        return this.Method_12098() & (1535 & 16639);
    }

    public boolean Method_12095() {
        this.Method_12076(1 & 20865);
        return (this.Method_12089() != 0 ? 12961 & -16053 : 652 & -32767) != 0;
    }

    public Class_12071(Class_22553 class_22553) {
        this(class_22553, class_22553.Method_22564());
    }

    public float Method_12096() {
        return Float.intBitsToFloat(this.Method_12093());
    }

    public char Method_12097() {
        return (char)this.Method_12084();
    }

    public byte Method_12098() {
        if (!this.Field_12072.Method_22583()) {
            throw new EOFException();
        }
        return this.Field_12072.Method_22555();
    }

    public void Method_12099() {
        this.Field_12072.Method_22608();
    }
}

