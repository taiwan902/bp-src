/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public abstract class Class_43430
extends Class_40553 {
    protected int Field_43431;
    static final boolean Field_43432 = !Class_43430.class.desiredAssertionStatus() ? 1 & 505 : -23420 & 587;
    protected int Field_43433;
    int Field_43434;
    private final Class_22999 Field_43435;
    protected Class_8772 Field_43436;
    protected Object Field_43437;
    private ByteBuffer Field_43438;
    protected long Field_43439;

    void Method_43440(Class_8772 class_8772, int n) {
        if (!Field_43432 && class_8772 == null) {
            throw new AssertionError();
        }
        this.Field_43436 = class_8772;
        this.Field_43439 = 1527926292459282049L & -1527926293738029024L;
        this.Field_43437 = class_8772.Field_8778;
        this.Field_43431 = 5120 & 874;
        this.Field_43433 = this.Field_43434 = n;
        this.setIndex(18472 & -18798, 1072 & 17033);
        this.Field_43438 = null;
    }

    protected final int Method_43441(int n) {
        return this.Field_43431 + n;
    }

    protected final ByteBuffer Method_43442() {
        ByteBuffer byteBuffer = this.Field_43438;
        if (byteBuffer == null) {
            this.Field_43438 = byteBuffer = this.Method_43451(this.Field_43437);
        }
        return byteBuffer;
    }

    public final ByteOrder Method_43443() {
        return ByteOrder.BIG_ENDIAN;
    }

    public final Class_22553 Method_43444() {
        return null;
    }

    public final Class_22837 Method_43445() {
        return this.Field_43436.Field_8789.Field_14966;
    }

    protected Class_43430(Class_22999 class_22999, int n) {
        super(n);
        this.Field_43435 = class_22999;
    }

    void Method_43446(Class_8772 class_8772, long l, int n, int n2, int n3) {
        if (!Field_43432 && l < (202939392L & 268894262L)) {
            throw new AssertionError();
        }
        if (!Field_43432 && class_8772 == null) {
            throw new AssertionError();
        }
        this.Field_43436 = class_8772;
        this.Field_43439 = l;
        this.Field_43437 = class_8772.Field_8778;
        this.Field_43431 = n;
        this.Field_43433 = n2;
        this.Field_43434 = n3;
        this.setIndex(-18176 & 1676, 10786 & 20609);
        this.Field_43438 = null;
    }

    private void Method_43447() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Class_22553 Method_43448(int n) {
        this.ensureAccessible();
        if (this.Field_43436.Field_8784) {
            if (n == this.Field_43433) {
                return this;
            }
        } else if (n > this.Field_43433) {
            if (n <= this.Field_43434) {
                this.Field_43433 = n;
                return this;
            }
        } else {
            if (n >= this.Field_43433) return this;
            if (n > this.Field_43434 >>> (-31533 & 4609)) {
                if (this.Field_43434 <= (536 & 16897)) {
                    if (n > this.Field_43434 - (-32752 & 88)) {
                        this.Field_43433 = n;
                        this.setIndex(Math.min(this.readerIndex(), n), Math.min(this.writerIndex(), n));
                        return this;
                    }
                } else {
                    this.Field_43433 = n;
                    this.setIndex(Math.min(this.readerIndex(), n), Math.min(this.writerIndex(), n));
                    return this;
                }
            }
        }
        this.Field_43436.Field_8789.Method_14996(this, n, (11353 & -28025) != 0);
        return this;
    }

    protected final void Method_43449() {
        if (this.Field_43439 >= (172720432L & -2640268269025475072L)) {
            long l = this.Field_43439;
            this.Field_43439 = -1L & -1L;
            this.Field_43437 = null;
            this.Field_43436.Field_8789.Method_14995(this.Field_43436, l, this.Field_43434);
            this.Method_43453();
        }
    }

    public final int Method_43450() {
        return this.Field_43433;
    }

    protected abstract ByteBuffer Method_43451(Object var1);

    protected abstract Class_32390 Method_43452();

    private void Method_43453() {
        Class_22999 class_22999 = this.Field_43435;
        if (class_22999 != null) {
            this.Method_43452().Method_32402(this, class_22999);
        }
    }
}

