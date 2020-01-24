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

public class Class_47789
extends Class_47742 {
    private final Class_22553 Field_47790;
    private final int Field_47791;
    private final int Field_47792;

    protected byte Method_47793(int n) {
        return this.Field_47790.Method_22558(n + this.Field_47791);
    }

    public Class_22553 Method_47794(int n, byte[] arrby, int n2, int n3) {
        this.checkIndex(n, n3);
        this.Field_47790.Method_22626(n + this.Field_47791, arrby, n2, n3);
        return this;
    }

    public Class_22553 Method_47795(int n, ByteBuffer byteBuffer) {
        this.checkIndex(n, byteBuffer.remaining());
        this.Field_47790.Method_22617(n + this.Field_47791, byteBuffer);
        return this;
    }

    public Class_22553 Method_47796() {
        Class_22553 class_22553 = this.Field_47790.Method_22623(this.Field_47791, this.Field_47792);
        class_22553.Method_22621(this.readerIndex(), this.writerIndex());
        return class_22553;
    }

    public boolean Method_47797() {
        return this.Field_47790.Method_22579();
    }

    protected void Method_47798(int n, int n2) {
        this.Field_47790.Method_22561(n + this.Field_47791, n2);
    }

    protected void Method_47799(int n, long l) {
        this.Field_47790.Method_22559(n + this.Field_47791, l);
    }

    public ByteBuffer Method_47800(int n, int n2) {
        this.checkIndex(n, n2);
        return this.Field_47790.Method_22614(n + this.Field_47791, n2);
    }

    public int Method_47801() {
        return this.Field_47790.Method_22634();
    }

    public int Method_47802() {
        return this.Field_47790.Method_22569() + this.Field_47791;
    }

    public Class_47789(Class_22553 class_22553, int n, int n2) {
        super(n2);
        if (n < 0 || n > class_22553.Method_22630() - n2) {
            throw new IndexOutOfBoundsException(class_22553 + ".slice(" + n + ", " + n2 + (char)(8365 & -16085));
        }
        if (class_22553 instanceof Class_47789) {
            this.Field_47790 = ((Class_47789)class_22553).Field_47790;
            this.Field_47791 = ((Class_47789)class_22553).Field_47791 + n;
        } else if (class_22553 instanceof Class_47840) {
            this.Field_47790 = class_22553.Method_22602();
            this.Field_47791 = n;
        } else {
            this.Field_47790 = class_22553;
            this.Field_47791 = n;
        }
        this.Field_47792 = n2;
        this.writerIndex(n2);
    }

    public Class_22553 Method_47803(int n, byte[] arrby, int n2, int n3) {
        this.checkIndex(n, n3);
        this.Field_47790.Method_22622(n + this.Field_47791, arrby, n2, n3);
        return this;
    }

    protected void Method_47804(int n, int n2) {
        this.Field_47790.Method_22568(n + this.Field_47791, n2);
    }

    public int Method_47805(int n, GatheringByteChannel gatheringByteChannel, int n2) {
        this.checkIndex(n, n2);
        return this.Field_47790.Method_22557(n + this.Field_47791, gatheringByteChannel, n2);
    }

    public int Method_47806() {
        return this.Field_47792;
    }

    public Class_22553 Method_47807(int n, Class_22553 class_22553, int n2, int n3) {
        this.checkIndex(n, n3);
        this.Field_47790.Method_22624(n + this.Field_47791, class_22553, n2, n3);
        return this;
    }

    public ByteBuffer[] Method_47808(int n, int n2) {
        this.checkIndex(n, n2);
        return this.Field_47790.Method_22627(n + this.Field_47791, n2);
    }

    public boolean Method_47809() {
        return this.Field_47790.Method_22560();
    }

    public boolean Method_47810() {
        return this.Field_47790.Method_22611();
    }

    public Class_22553 Method_47811(int n, Class_22553 class_22553, int n2, int n3) {
        this.checkIndex(n, n3);
        this.Field_47790.Method_22589(n + this.Field_47791, class_22553, n2, n3);
        return this;
    }

    private void Method_47812() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected void Method_47813(int n, int n2) {
        this.Field_47790.Method_22643(n + this.Field_47791, n2);
    }

    public Class_22553 Method_47814(int n) {
        throw new UnsupportedOperationException("sliced buffer");
    }

    public Class_22553 Method_47815() {
        return this.Field_47790;
    }

    protected long Method_47816(int n) {
        return this.Field_47790.Method_22571(n + this.Field_47791);
    }

    public Class_22553 Method_47817(int n, ByteBuffer byteBuffer) {
        this.checkIndex(n, byteBuffer.remaining());
        this.Field_47790.Method_22604(n + this.Field_47791, byteBuffer);
        return this;
    }

    protected int Method_47818(int n) {
        return this.Field_47790.Method_22581(n + this.Field_47791);
    }

    public Class_22553 Method_47819(int n, OutputStream outputStream, int n2) {
        this.checkIndex(n, n2);
        this.Field_47790.Method_22632(n + this.Field_47791, outputStream, n2);
        return this;
    }

    public byte[] Method_47820() {
        return this.Field_47790.Method_22599();
    }

    public long Method_47821() {
        return this.Field_47790.Method_22616() + (long)this.Field_47791;
    }

    public int Method_47822(int n, ScatteringByteChannel scatteringByteChannel, int n2) {
        this.checkIndex(n, n2);
        return this.Field_47790.Method_22642(n + this.Field_47791, scatteringByteChannel, n2);
    }

    public ByteOrder Method_47823() {
        return this.Field_47790.Method_22649();
    }

    public Class_22553 Method_47824(int n, int n2) {
        this.checkIndex(n, n2);
        if (n2 == 0) {
            return Class_16620.Field_16622;
        }
        return this.Field_47790.Method_22623(n + this.Field_47791, n2);
    }

    public ByteBuffer Method_47825(int n, int n2) {
        this.checkIndex(n, n2);
        return this.Method_47800(n, n2);
    }

    public Class_22837 Method_47826() {
        return this.Field_47790.Method_22639();
    }

    protected short Method_47827(int n) {
        return this.Field_47790.Method_22578(n + this.Field_47791);
    }
}

