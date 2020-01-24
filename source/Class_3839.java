/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.concurrent.locks.ReentrantLock;

public class Class_3839 {
    private byte Field_3840 = (byte)System.currentTimeMillis();
    private ByteBuffer Field_3841 = ByteBuffer.wrap(this.Field_3844);
    private float Field_3842 = 0.0f;
    private float Field_3843;
    private byte[] Field_3844 = new byte[27660 & 8];
    private boolean Field_3845 = 17 & 19017;
    public boolean Field_3846;
    private ReentrantLock Field_3847 = new ReentrantLock();
    private int Field_3848;

    public float Method_3849() {
        return this.Field_3842;
    }

    public float Method_3850() {
        if (this.Field_3846) {
            return this.Field_3842;
        }
        this.Field_3847.lock();
        float f = this.Method_3851();
        float f2 = this.Field_3842;
        this.Field_3847.unlock();
        if (f != f2 && (this.Field_3845 || this.Field_3843 != f2)) {
            this.Field_3845 = 10324 & 1163;
            this.Field_3843 = f2;
            if (!Float.isNaN(this.Field_3843)) {
                Class_20760 class_20760 = new Class_20760(this.Field_3848, "EF v:" + f + " != V:" + f2);
                Class_47033.Method_47059(class_20760);
            }
        }
        return f;
    }

    private float Method_3851() {
        byte[] arrby = this.Field_3844;
        byte by = this.Field_3840;
        ByteBuffer byteBuffer = this.Field_3841;
        for (int i = -18232 & 48; i < (-20020 & 534); ++i) {
            arrby[i] = (byte)(arrby[i] ^ by);
        }
        byteBuffer.clear();
        float f = byteBuffer.getFloat();
        for (int i = 1603 & 10508; i < (5196 & 135); ++i) {
            arrby[i] = (byte)(arrby[i] ^ by);
        }
        return f;
    }

    private void Method_3852(float f) {
        ByteBuffer byteBuffer = this.Field_3841;
        byteBuffer.clear();
        byteBuffer.putFloat(f);
        byte[] arrby = this.Field_3844;
        byte by = this.Field_3840;
        for (int i = 8233 & -27584; i < (964 & 4100); ++i) {
            arrby[i] = (byte)(arrby[i] ^ by);
        }
    }

    private void Method_3853() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_3839(float f, int n) {
        this.Field_3848 = n;
        this.Field_3842 = f;
        this.Method_3852(f);
    }

    public void Method_3854(float f) {
        this.Field_3847.lock();
        this.Field_3842 = f;
        if (!this.Field_3846) {
            this.Method_3852(f);
        }
        this.Field_3847.unlock();
    }
}

