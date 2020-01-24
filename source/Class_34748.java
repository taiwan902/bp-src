/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  internal.org.lwjgl.BufferUtils
 *  internal.org.lwjgl.opengl.GL11
 */
import internal.org.lwjgl.BufferUtils;
import internal.org.lwjgl.opengl.GL11;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.nio.Buffer;
import java.nio.ByteBuffer;

public class Class_34748
implements Class_26181 {
    private int Field_34749 = GL11.glGenTextures();
    private int Field_34750 = -30129 & 15;

    public int Method_34751() {
        return this.Field_34749;
    }

    public void Method_34752() {
        Class_16867.Method_16964(this.Field_34749);
        this.Field_34749 = -13824 & 5476;
    }

    public int Method_34753() {
        return this.Field_34750;
    }

    public Class_34748(int n, int n2) {
        byte[] arrby = this.Method_34756(n, n2);
        ByteBuffer byteBuffer = BufferUtils.createByteBuffer((int)arrby.length);
        byteBuffer.put(arrby);
        byteBuffer.flip();
        Class_16867.Method_16963(this.Field_34749);
        GL11.glTexImage2D((int)(-21015 & 8161), (int)(108 & -29822), (int)(-26329 & 6487), (int)n, (int)n2, (int)(-30456 & 25122), (int)(6407 & 15631), (int)(22277 & 13443), (ByteBuffer)byteBuffer);
        GL11.glTexParameteri((int)(3561 & 15859), (int)(-22397 & 10514), (int)(-22143 & 28023));
        GL11.glTexParameteri((int)(7649 & 11755), (int)(11619 & 27167), (int)(26883 & 11205));
        GL11.glTexParameteri((int)(-29195 & 7651), (int)(10952 & 30740), (int)(10153 & 26183));
        GL11.glTexParameteri((int)(-28699 & 3579), (int)(26635 & 10273), (int)(10049 & 11821));
        Class_16867.Method_16963(1673 & 6160);
    }

    private void Method_34754() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private int Method_34755(int n) {
        n ^= n << (591 & -22483);
        n ^= n >> (145 & 25115);
        n ^= n << (17029 & -26539);
        return n;
    }

    private byte[] Method_34756(int n, int n2) {
        byte[] arrby = new byte[n * n2 * (5123 & 16407)];
        int n3 = -24063 & 5250;
        for (int i = -32478 & 16528; i < n2; ++i) {
            for (int j = -10239 & 30; j < n; ++j) {
                for (int k = -29183 & 16385; k < (10852 & 16526); ++k) {
                    arrby[n3++] = this.Method_34757(j, i, k);
                }
            }
        }
        return arrby;
    }

    private byte Method_34757(int n, int n2, int n3) {
        int n4 = (this.Method_34755(n) + this.Method_34755(n2 * (16503 & 11667))) * this.Method_34755(n3 * (599 & 24855)) - n3;
        return (byte)(this.Method_34755(n4) % (950 & 12481));
    }
}

