/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.concurrent.locks.ReentrantLock;

public class Class_2190 {
    private byte Field_2191 = (byte)System.currentTimeMillis();
    private double Field_2192;
    public boolean Field_2193 = 329 & 1057;
    private byte[] Field_2194 = new byte[11832 & -16237];
    private ByteBuffer Field_2195 = ByteBuffer.wrap(this.Field_2194);
    private ReentrantLock Field_2196 = new ReentrantLock();
    private double Field_2197 = 0.0;
    private int Field_2198;

    public Class_2190(Double d, int n) {
        this.Field_2198 = n;
        this.Field_2197 = d;
        this.Method_2201(d);
    }

    public double Method_2199() {
        this.Field_2196.lock();
        double d = this.Method_2200();
        double d2 = this.Field_2197;
        this.Field_2196.unlock();
        if (d != d2 && (this.Field_2193 || this.Field_2192 != d2)) {
            this.Field_2193 = 8225 & 532;
            this.Field_2192 = d2;
            if (!Double.isNaN(this.Field_2192)) {
                Class_20760 class_20760 = new Class_20760(this.Field_2198, "ED v:" + d + " != V:" + d2);
                Class_47033.Method_47059(class_20760);
            }
        }
        return d;
    }

    private double Method_2200() {
        byte[] arrby = this.Field_2194;
        byte by = this.Field_2191;
        ByteBuffer byteBuffer = this.Field_2195;
        for (int i = -32458 & 5121; i < (16537 & 5224); ++i) {
            arrby[i] = (byte)(arrby[i] ^ by);
        }
        byteBuffer.clear();
        double d = byteBuffer.getDouble();
        for (int i = 8744 & 1408; i < (9128 & 28); ++i) {
            arrby[i] = (byte)(arrby[i] ^ by);
        }
        return d;
    }

    private void Method_2201(double d) {
        ByteBuffer byteBuffer = this.Field_2195;
        byteBuffer.clear();
        byteBuffer.putDouble(d);
        byte[] arrby = this.Field_2194;
        byte by = this.Field_2191;
        for (int i = 2 & 2088; i < (8264 & 3261); ++i) {
            arrby[i] = (byte)(arrby[i] ^ by);
        }
    }

    public void Method_2202(Double d) {
        this.Field_2196.lock();
        this.Field_2197 = d;
        this.Method_2201(d);
        this.Field_2196.unlock();
    }

    public double Method_2203() {
        return this.Field_2197;
    }

    private void Method_2204() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

