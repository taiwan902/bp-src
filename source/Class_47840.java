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

public class Class_47840
extends Class_47742 {
    private final Class_22553 Field_47841;

    public short Method_47842(int n) {
        return this.Method_47843(n);
    }

    protected short Method_47843(int n) {
        return this.Field_47841.Method_22578(n);
    }

    protected int Method_47844(int n) {
        return this.Field_47841.Method_22581(n);
    }

    protected void Method_47845(int n, long l) {
        this.Field_47841.Method_22559(n, l);
    }

    public Class_22553 Method_47846(int n, int n2) {
        this.Method_47861(n, n2);
        return this;
    }

    public Class_22553 Method_47847(int n, int n2) {
        return this.Field_47841.Method_22623(n, n2);
    }

    public int Method_47848(int n, ScatteringByteChannel scatteringByteChannel, int n2) {
        return this.Field_47841.Method_22642(n, scatteringByteChannel, n2);
    }

    public long Method_47849(int n) {
        return this.Method_47850(n);
    }

    protected long Method_47850(int n) {
        return this.Field_47841.Method_22571(n);
    }

    public byte[] Method_47851() {
        return this.Field_47841.Method_22599();
    }

    public boolean Method_47852() {
        return this.Field_47841.Method_22560();
    }

    public Class_22553 Method_47853(int n, int n2) {
        this.Method_47876(n, n2);
        return this;
    }

    public Class_22553 Method_47854(int n, byte[] arrby, int n2, int n3) {
        this.Field_47841.Method_22622(n, arrby, n2, n3);
        return this;
    }

    public byte Method_47855(int n) {
        return this.Method_47873(n);
    }

    private void Method_47856() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public ByteOrder Method_47857() {
        return this.Field_47841.Method_22649();
    }

    public int Method_47858() {
        return this.Field_47841.Method_22630();
    }

    public Class_22837 Method_47859() {
        return this.Field_47841.Method_22639();
    }

    public Class_22553 Method_47860(int n, int n2) {
        this.Method_47869(n, n2);
        return this;
    }

    protected void Method_47861(int n, int n2) {
        this.Field_47841.Method_22643(n, n2);
    }

    public Class_22553 Method_47862(int n, Class_22553 class_22553, int n2, int n3) {
        this.Field_47841.Method_22624(n, class_22553, n2, n3);
        return this;
    }

    public Class_22553 Method_47863(int n, long l) {
        this.Method_47845(n, l);
        return this;
    }

    public Class_22553 Method_47864(int n, byte[] arrby, int n2, int n3) {
        this.Field_47841.Method_22626(n, arrby, n2, n3);
        return this;
    }

    public ByteBuffer Method_47865(int n, int n2) {
        return this.nioBuffer(n, n2);
    }

    public int Method_47866() {
        return this.Field_47841.Method_22569();
    }

    public int Method_47867(int n, GatheringByteChannel gatheringByteChannel, int n2) {
        return this.Field_47841.Method_22557(n, gatheringByteChannel, n2);
    }

    public Class_22553 Method_47868(int n, Class_22553 class_22553, int n2, int n3) {
        this.Field_47841.Method_22589(n, class_22553, n2, n3);
        return this;
    }

    protected void Method_47869(int n, int n2) {
        this.Field_47841.Method_22561(n, n2);
    }

    public Class_22553 Method_47870(int n, OutputStream outputStream, int n2) {
        this.Field_47841.Method_22632(n, outputStream, n2);
        return this;
    }

    public boolean Method_47871() {
        return this.Field_47841.Method_22579();
    }

    public Class_22553 Method_47872() {
        return this.Field_47841;
    }

    protected byte Method_47873(int n) {
        return this.Field_47841.Method_22558(n);
    }

    public Class_47840(Class_22553 class_22553) {
        super(class_22553.Method_22612());
        this.Field_47841 = class_22553 instanceof Class_47840 ? ((Class_47840)class_22553).Field_47841 : class_22553;
        this.setIndex(class_22553.Method_22582(), class_22553.Method_22620());
    }

    public long Method_47874() {
        return this.Field_47841.Method_22616();
    }

    public Class_22553 Method_47875(int n, ByteBuffer byteBuffer) {
        this.Field_47841.Method_22617(n, byteBuffer);
        return this;
    }

    protected void Method_47876(int n, int n2) {
        this.Field_47841.Method_22568(n, n2);
    }

    public Class_22553 Method_47877(int n) {
        this.Field_47841.Method_22563(n);
        return this;
    }

    public Class_22553 Method_47878(int n, ByteBuffer byteBuffer) {
        this.Field_47841.Method_22604(n, byteBuffer);
        return this;
    }

    public boolean Method_47879() {
        return this.Field_47841.Method_22611();
    }

    public int Method_47880(int n) {
        return this.Method_47844(n);
    }

    public int Method_47881() {
        return this.Field_47841.Method_22634();
    }

    public ByteBuffer[] Method_47882(int n, int n2) {
        return this.Field_47841.Method_22627(n, n2);
    }
}

