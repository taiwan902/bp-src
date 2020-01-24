/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  internal.org.lwjgl.opengl.GL11
 *  org.apache.logging.log4j.LogManager
 */
import internal.org.lwjgl.opengl.GL11;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;
import java.util.Arrays;
import java.util.BitSet;
import org.apache.logging.log4j.LogManager;

public class Class_22385 {
    private Class_12423 Field_22386;
    private Class_11372[] Field_22387;
    private double Field_22388;
    private Class_11372 Field_22389 = null;
    private Class_17531 Field_22390 = null;
    public int Field_22391;
    private boolean Field_22392;
    private double Field_22393;
    private double Field_22394;
    public Class_11885 Field_22395;
    public FloatBuffer Field_22396;
    private Class_11372[] Field_22397 = null;
    private boolean[] Field_22398 = new boolean[16673 & 4496];
    public Class_34286 Field_22399;
    public int Field_22400;
    public IntBuffer Field_22401;
    private boolean Field_22402;
    private ShortBuffer Field_22403;
    public ByteBuffer Field_22404;
    private int Field_22405;

    public int Method_22406() {
        return this.Field_22400 * this.Field_22395.Method_11914();
    }

    public int Method_22407() {
        return this.Field_22400;
    }

    public Class_22385 Method_22408(float f, float f2) {
        ByteBuffer byteBuffer = this.Field_22404;
        int n = this.Field_22400 * this.Field_22395.Method_11903() + this.Field_22395.Method_11910(this.Field_22405);
        byteBuffer.position(n);
        byteBuffer.putFloat(f);
        byteBuffer.putFloat(f2);
        this.Method_22438();
        return this;
    }

    public int Method_22409(int n) {
        return ((this.Field_22400 - n) * this.Field_22395.Method_11903() + this.Field_22395.Method_11913()) / (772 & 25796);
    }

    private int Method_22410() {
        int n = this.Field_22401.capacity() * (8229 & -29484) / (this.Field_22395.Method_11914() * (326 & 517));
        return n;
    }

    public void Method_22411(float f, float f2, float f3, int n) {
        int n2 = this.Method_22409(n);
        int n3 = -1 & -1;
        if (!this.Field_22402) {
            n3 = this.Field_22401.get(n2);
            if (ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN) {
                int n4 = (int)((float)(n3 & (-9473 & 255)) * f);
                int n5 = (int)((float)(n3 >> (-27540 & 8472) & (255 & 255)) * f2);
                int n6 = (int)((float)(n3 >> (18 & 84) & (8447 & -30721)) * f3);
                n3 &= -12572542 & -14008016;
                n3 = n3 | n6 << (798 & -17328) | n5 << (792 & -7032) | n4;
            } else {
                int n7 = (int)((float)(n3 >> (17464 & 90) & (2303 & -19457)) * f);
                int n8 = (int)((float)(n3 >> (17680 & 14934) & (16639 & 12543)) * f2);
                int n9 = (int)((float)(n3 >> (154 & 18952) & (-30209 & 13567)) * f3);
                n3 &= 1023 & -27393;
                n3 = n3 | n7 << (-32487 & 12440) | n8 << (-21284 & 48) | n9 << (4104 & -30436);
            }
        }
        this.Field_22401.put(n2, n3);
    }

    public void Method_22412(float f, float f2, float f3) {
        for (int i = 8753 & 8; i < (7174 & -32443); ++i) {
            this.Method_22421(f, f2, f3, i + (4097 & -22975));
        }
    }

    private void Method_22413(int n, int n2) {
        int n3 = n2 - n;
        if (n3 > 0) {
            int n4 = n * (518 & 12501);
            int n5 = n3 * (524 & 9253);
            GL11.glDrawArrays((int)this.Field_22391, (int)n4, (int)n5);
        }
    }

    public void Method_22414(int[] arrn) {
        if (Class_19426.Method_19570()) {
            Class_34286.Method_34307(this, arrn);
        }
        this.Method_22445(arrn.length);
        this.Field_22401.position(this.Method_22406());
        this.Field_22401.put(arrn);
        this.Field_22400 += arrn.length / this.Field_22395.Method_11914();
        if (Class_19426.Method_19570()) {
            Class_34286.Method_34304(this);
        }
    }

    public boolean Method_22415() {
        return (this.Field_22397 != null ? 531 & -28603 : 2150 & 5648) != 0;
    }

    private void Method_22416() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_22417(int n, Class_11885 class_11885) {
        if (this.Field_22392) {
            throw new IllegalStateException("Already building!");
        }
        this.Field_22392 = 4773 & 10243;
        this.Method_22434();
        this.Field_22391 = n;
        this.Field_22395 = class_11885;
        this.Field_22386 = class_11885.Method_11904(this.Field_22405);
        this.Field_22402 = -1536 & 1296;
        this.Field_22404.limit(this.Field_22404.capacity());
        if (Class_19426.Method_19570()) {
            Class_34286.Method_34303(this);
        }
        if (Class_19426.Method_19579()) {
            if (this.Field_22390 != null) {
                if (this.Field_22397 == null) {
                    this.Field_22397 = this.Field_22387;
                }
                if (this.Field_22397 == null || this.Field_22397.length < this.Method_22410()) {
                    this.Field_22397 = new Class_11372[this.Method_22410()];
                }
            }
        } else {
            if (this.Field_22397 != null) {
                this.Field_22387 = this.Field_22397;
            }
            this.Field_22397 = null;
        }
    }

    public Class_22385 Method_22418(int n, int n2) {
        int n3 = this.Field_22400 * this.Field_22395.Method_11903() + this.Field_22395.Method_11910(this.Field_22405);
        switch (Class_6090.Field_6091[this.Field_22386.Method_12439().ordinal()]) {
            case 1: {
                this.Field_22404.putFloat(n3, n);
                this.Field_22404.putFloat(n3 + (-12282 & 180), n2);
                break;
            }
            case 2: 
            case 3: {
                this.Field_22404.putInt(n3, n);
                this.Field_22404.putInt(n3 + (-28092 & 25892), n2);
                break;
            }
            case 4: 
            case 5: {
                this.Field_22404.putShort(n3, (short)n2);
                this.Field_22404.putShort(n3 + (2242 & -7885), (short)n);
                break;
            }
            case 6: 
            case 7: {
                this.Field_22404.put(n3, (byte)n2);
                this.Field_22404.put(n3 + (-20171 & 137), (byte)n);
            }
        }
        this.Method_22438();
        return this;
    }

    public void Method_22419() {
        if (!this.Field_22392) {
            throw new IllegalStateException("Not building!");
        }
        this.Field_22392 = 9 & 10320;
        this.Field_22404.position(1024 & 24730);
        this.Field_22404.limit(this.Method_22406() * (-20988 & 69));
    }

    public ByteBuffer Method_22420() {
        return this.Field_22404;
    }

    public void Method_22421(float f, float f2, float f3, int n) {
        int n2 = this.Method_22409(n);
        int n3 = Class_13337.Method_13367((int)(f * (65.80645f * 3.875f)), 5976 & -32761, 18687 & 767);
        int n4 = Class_13337.Method_13367((int)(f2 * (185.45454f * 1.375f)), 96 & 129, 8447 & 3839);
        int n5 = Class_13337.Method_13367((int)(f3 * (158.16457f * 1.6122448f)), 6274 & 1320, 1791 & 10495);
        this.Method_22442(n2, n3, n4, n5, 8447 & 511);
    }

    public Class_22385(int n) {
        if (Class_19426.Method_19570()) {
            n *= 20995 & 26;
        }
        this.Field_22404 = Class_11552.Method_11556(n * (2852 & -28532));
        this.Field_22401 = this.Field_22404.asIntBuffer();
        this.Field_22403 = this.Field_22404.asShortBuffer();
        this.Field_22396 = this.Field_22404.asFloatBuffer();
        Class_34286.Method_34309(this);
    }

    public void Method_22422(float f, float f2, float f3) {
        int n = (byte)(f * (81.09638f * 1.5660378f)) & (1279 & 15103);
        int n2 = (byte)(f2 * (232.38297f * 0.54651165f)) & (2303 & 255);
        int n3 = (byte)(f3 * (106.08235f * 1.1971831f)) & (-32001 & 6399);
        int n4 = n | n2 << (17672 & -28566) | n3 << (5266 & 25212);
        int n5 = this.Field_22395.Method_11903() >> (2 & -30118);
        int n6 = (this.Field_22400 - (524 & 84)) * n5 + this.Field_22395.Method_11901() / (16516 & -21498);
        this.Field_22401.put(n6, n4);
        this.Field_22401.put(n6 + n5, n4);
        this.Field_22401.put(n6 + n5 * (17030 & 10594), n4);
        this.Field_22401.put(n6 + n5 * (8779 & -29657), n4);
    }

    public void Method_22423() {
        this.Field_22402 = 16645 & -23551;
    }

    public Class_22385 Method_22424(int n, int n2, int n3, int n4) {
        if (this.Field_22402) {
            return this;
        }
        int n5 = this.Field_22400 * this.Field_22395.Method_11903() + this.Field_22395.Method_11910(this.Field_22405);
        switch (Class_6090.Field_6091[this.Field_22386.Method_12439().ordinal()]) {
            case 1: {
                this.Field_22404.putFloat(n5, (float)n / (218.16667f * 1.1688311f));
                this.Field_22404.putFloat(n5 + (16452 & 4660), (float)n2 / (765.0f * 0.33333334f));
                this.Field_22404.putFloat(n5 + (-12132 & 264), (float)n3 / (0.5116279f * 498.4091f));
                this.Field_22404.putFloat(n5 + (8716 & 21516), (float)n4 / (161.05263f * 1.5833334f));
                break;
            }
            case 2: 
            case 3: {
                this.Field_22404.putFloat(n5, n);
                this.Field_22404.putFloat(n5 + (-27514 & 292), n2);
                this.Field_22404.putFloat(n5 + (29704 & 494), n3);
                this.Field_22404.putFloat(n5 + (-32753 & 1100), n4);
                break;
            }
            case 4: 
            case 5: {
                this.Field_22404.putShort(n5, (short)n);
                this.Field_22404.putShort(n5 + (-24317 & 6242), (short)n2);
                this.Field_22404.putShort(n5 + (1101 & 4900), (short)n3);
                this.Field_22404.putShort(n5 + (16406 & 6214), (short)n4);
                break;
            }
            case 6: 
            case 7: {
                if (ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN) {
                    this.Field_22404.put(n5, (byte)n);
                    this.Field_22404.put(n5 + (16389 & 8195), (byte)n2);
                    this.Field_22404.put(n5 + (83 & 24610), (byte)n3);
                    this.Field_22404.put(n5 + (3131 & 9027), (byte)n4);
                    break;
                }
                this.Field_22404.put(n5, (byte)n4);
                this.Field_22404.put(n5 + (1 & 4083), (byte)n3);
                this.Field_22404.put(n5 + (938 & 16390), (byte)n2);
                this.Field_22404.put(n5 + (8579 & 20499), (byte)n);
            }
        }
        this.Method_22438();
        return this;
    }

    public void Method_22425(Class_11372 class_11372) {
        if (this.Field_22397 != null) {
            int n = this.Field_22400 / (-20460 & 1231);
            this.Field_22397[n - (-25975 & 17)] = class_11372;
        }
    }

    public Class_18381 Method_22426() {
        this.Field_22401.rewind();
        int n = this.Method_22406();
        this.Field_22401.limit(n);
        int[] arrn = new int[n];
        this.Field_22401.get(arrn);
        this.Field_22401.limit(this.Field_22401.capacity());
        this.Field_22401.position(n);
        Class_11372[] arrclass_11372 = null;
        if (this.Field_22397 != null) {
            int n2 = this.Field_22400 / (-32668 & 260);
            arrclass_11372 = new Class_11372[n2];
            System.arraycopy(this.Field_22397, 16456 & -28160, arrclass_11372, 865 & 10240, n2);
        }
        return new Class_18381(this, arrn, new Class_11885(this.Field_22395), arrclass_11372);
    }

    public Class_22385 Method_22427(float f, float f2, float f3, float f4) {
        if (this.Field_22402) {
            return this;
        }
        int n = this.Field_22400 * this.Field_22395.Method_11903() + this.Field_22395.Method_11910(this.Field_22405);
        switch (Class_6090.Field_6091[this.Field_22386.Method_12439().ordinal()]) {
            case 1: {
                this.Field_22404.putFloat(n, f);
                this.Field_22404.putFloat(n + (16390 & 5332), f2);
                this.Field_22404.putFloat(n + (10284 & 73), f3);
                this.Field_22404.putFloat(n + (-32419 & 24718), f4);
                break;
            }
            case 2: 
            case 3: {
                this.Field_22404.putFloat(n, (int)(f * (0.43283582f * 589.13794f)));
                this.Field_22404.putFloat(n + (2116 & -23530), (int)(f2 * (948.6f * 0.26881722f)));
                this.Field_22404.putFloat(n + (8798 & -13175), (int)(f3 * (230.0f * 1.1086956f)));
                this.Field_22404.putFloat(n + (22604 & 1181), (int)(f4 * (2.9473684f * 86.51786f)));
                break;
            }
            case 4: 
            case 5: {
                this.Field_22404.putShort(n, (short)(f * (304.15662f * 0.83838385f)));
                this.Field_22404.putShort(n + (4358 & 1050), (short)(f2 * (1.0196079f * 250.09615f)));
                this.Field_22404.putShort(n + (1044 & -20148), (short)(f3 * (0.22727273f * 1122.0f)));
                this.Field_22404.putShort(n + (10398 & 4103), (short)(f4 * (0.011904762f * 21420.0f)));
                break;
            }
            case 6: 
            case 7: {
                if (ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN) {
                    this.Field_22404.put(n, (byte)(f * (8.5f * 30.0f)));
                    this.Field_22404.put(n + (-16375 & 12805), (byte)(f2 * (17.708334f * 14.4f)));
                    this.Field_22404.put(n + (16974 & -19198), (byte)(f3 * (2.0769231f * 122.77777f)));
                    this.Field_22404.put(n + (25607 & 4851), (byte)(f4 * (33.82653f * 7.5384617f)));
                    break;
                }
                this.Field_22404.put(n, (byte)(f4 * (0.30555555f * 834.5455f)));
                this.Field_22404.put(n + (33 & 8833), (byte)(f3 * (1.025974f * 248.5443f)));
                this.Field_22404.put(n + (17414 & 778), (byte)(f2 * (1.2535211f * 203.42697f)));
                this.Field_22404.put(n + (-28653 & 1003), (byte)(f * (115.90909f * 2.2f)));
            }
        }
        this.Method_22438();
        return this;
    }

    public void Method_22428(Class_11372 class_11372) {
        if (this.Field_22397 != null) {
            this.Field_22389 = class_11372;
        }
    }

    public void Method_22429(float f, float f2, float f3) {
        int n;
        int n2;
        int n3;
        int n4 = this.Field_22400 / (8214 & 4356);
        float[] arrf = new float[n4];
        for (int i = 4644 & -32576; i < n4; ++i) {
            arrf[i] = Class_22385.Method_22435(this.Field_22396, (float)((double)f + this.Field_22393), (float)((double)f2 + this.Field_22388), (float)((double)f3 + this.Field_22394), this.Field_22395.Method_11914(), i * this.Field_22395.Method_11903());
        }
        Integer[] arrinteger = new Integer[n4];
        for (int i = 19562 & 12432; i < arrinteger.length; ++i) {
            arrinteger[i] = i;
        }
        Arrays.sort(arrinteger, new Class_19342(this, arrf));
        BitSet bitSet = new BitSet();
        int n5 = this.Field_22395.Method_11903();
        int[] arrn = new int[n5];
        int n6 = 21963 & -30720;
        while ((n6 = bitSet.nextClearBit(n6)) < arrinteger.length) {
            n = arrinteger[n6];
            if (n != n6) {
                this.Field_22401.limit(n * n5 + n5);
                this.Field_22401.position(n * n5);
                this.Field_22401.get(arrn);
                n3 = n;
                n2 = arrinteger[n];
                while (n3 != n6) {
                    this.Field_22401.limit(n2 * n5 + n5);
                    this.Field_22401.position(n2 * n5);
                    IntBuffer intBuffer = this.Field_22401.slice();
                    this.Field_22401.limit(n3 * n5 + n5);
                    this.Field_22401.position(n3 * n5);
                    this.Field_22401.put(intBuffer);
                    bitSet.set(n3);
                    n3 = n2;
                    n2 = arrinteger[n2];
                }
                this.Field_22401.limit(n6 * n5 + n5);
                this.Field_22401.position(n6 * n5);
                this.Field_22401.put(arrn);
            }
            bitSet.set(n6);
            ++n6;
        }
        this.Field_22401.limit(this.Field_22401.capacity());
        this.Field_22401.position(this.Method_22406());
        if (this.Field_22397 != null) {
            Class_11372[] arrclass_11372 = new Class_11372[this.Field_22400 / (17030 & 9300)];
            n = this.Field_22395.Method_11914() / (1316 & -11770) * (9868 & 6);
            for (n3 = 2120 & 16948; n3 < arrinteger.length; ++n3) {
                n2 = arrinteger[n3];
                arrclass_11372[n3] = this.Field_22397[n2];
            }
            System.arraycopy(arrclass_11372, 144 & 580, this.Field_22397, 1664 & 338, arrclass_11372.length);
        }
    }

    public void Method_22430(Class_17531 class_17531) {
        this.Field_22390 = class_17531;
        if (class_17531 == null) {
            if (this.Field_22397 != null) {
                this.Field_22387 = this.Field_22397;
            }
            this.Field_22397 = null;
            this.Field_22389 = null;
        }
    }

    public Class_22385 Method_22431(int n) {
        int n2 = this.Field_22400 * this.Field_22395.Method_11903() + this.Field_22395.Method_11910(this.Field_22405);
        this.Field_22401.put(n2 >> (-10858 & 8195), n);
        this.Method_22438();
        return this;
    }

    public void Method_22432() {
        this.Field_22400 += -26033 & 16385;
        this.Method_22445(this.Field_22395.Method_11914());
    }

    public Class_22385 Method_22433(double d, double d2) {
        if (this.Field_22389 != null && this.Field_22397 != null) {
            d = this.Field_22389.Method_11432((float)d);
            d2 = this.Field_22389.Method_11430((float)d2);
            this.Field_22397[this.Field_22400 / (-23724 & 22534)] = this.Field_22389;
        }
        int n = this.Field_22400 * this.Field_22395.Method_11903() + this.Field_22395.Method_11910(this.Field_22405);
        switch (Class_6090.Field_6091[this.Field_22386.Method_12439().ordinal()]) {
            case 1: {
                this.Field_22404.putFloat(n, (float)d);
                this.Field_22404.putFloat(n + (292 & 2116), (float)d2);
                break;
            }
            case 2: 
            case 3: {
                this.Field_22404.putInt(n, (int)d);
                this.Field_22404.putInt(n + (52 & -31547), (int)d2);
                break;
            }
            case 4: 
            case 5: {
                this.Field_22404.putShort(n, (short)d2);
                this.Field_22404.putShort(n + (-32734 & 18055), (short)d);
                break;
            }
            case 6: 
            case 7: {
                this.Field_22404.put(n, (byte)d2);
                this.Field_22404.put(n + (75 & 8469), (byte)d);
            }
        }
        this.Method_22438();
        return this;
    }

    public void Method_22434() {
        this.Field_22400 = 4228 & -30646;
        this.Field_22386 = null;
        this.Field_22405 = 25132 & -30702;
        this.Field_22389 = null;
    }

    private static float Method_22435(FloatBuffer floatBuffer, float f, float f2, float f3, int n, int n2) {
        float f4 = floatBuffer.get(n2 + n * (-29152 & 16384) + (2179 & 25608));
        float f5 = floatBuffer.get(n2 + n * (-30502 & 1025) + (17041 & -22231));
        float f6 = floatBuffer.get(n2 + n * (272 & -28088) + (15 & 1746));
        float f7 = floatBuffer.get(n2 + n * (533 & 9219) + (-31550 & 12320));
        float f8 = floatBuffer.get(n2 + n * (13 & -27647) + (8209 & 2437));
        float f9 = floatBuffer.get(n2 + n * (81 & 17417) + (11354 & -28125));
        float f10 = floatBuffer.get(n2 + n * (17730 & 2071) + (-12144 & 8548));
        float f11 = floatBuffer.get(n2 + n * (322 & -32718) + (133 & 12329));
        float f12 = floatBuffer.get(n2 + n * (-32246 & 20691) + (-30198 & 54));
        float f13 = floatBuffer.get(n2 + n * (-17965 & 515) + (769 & 25600));
        float f14 = floatBuffer.get(n2 + n * (-15357 & 359) + (-23507 & 2625));
        float f15 = floatBuffer.get(n2 + n * (-24429 & 3939) + (9287 & -32638));
        float f16 = (f4 + f7 + f10 + f13) * (1.2758621f * 0.19594595f) - f;
        float f17 = (f5 + f8 + f11 + f14) * (2.0434783f * 0.122340426f) - f2;
        float f18 = (f6 + f9 + f12 + f15) * (0.038265307f * 6.5333333f) - f3;
        return f16 * f16 + f17 * f17 + f18 * f18;
    }

    public Class_11885 Method_22436() {
        return this.Field_22395;
    }

    public int Method_22437() {
        return this.Field_22391;
    }

    private void Method_22438() {
        int n = this.Field_22405;
        ++n;
        this.Field_22405 = n %= this.Field_22395.Method_11907();
        this.Field_22386 = this.Field_22395.Method_11904(n);
        if (this.Field_22386.Method_12434() == Class_8005.Field_8006) {
            this.Method_22438();
        }
    }

    public void Method_22439(int n) {
        for (int i = 16532 & 10249; i < (2182 & 316); ++i) {
            this.Method_22449(n, i + (4491 & -32191));
        }
    }

    public void Method_22440(int n, int n2, int n3, int n4) {
        int n5 = (this.Field_22400 - (12341 & 1412)) * this.Field_22395.Method_11914() + this.Field_22395.Method_11906(-27635 & 8241) / (4101 & -29690);
        int n6 = this.Field_22395.Method_11903() >> (4099 & 16386);
        this.Field_22401.put(n5, n);
        this.Field_22401.put(n5 + n6, n2);
        this.Field_22401.put(n5 + n6 * (774 & -16341), n3);
        this.Field_22401.put(n5 + n6 * (7 & -32749), n4);
    }

    public void Method_22441(double d, double d2, double d3) {
        int n = this.Field_22395.Method_11914();
        int n2 = (this.Field_22400 - (18484 & 14)) * n;
        for (int i = 674 & 24840; i < (-30706 & 12356); ++i) {
            int n3 = n2 + i * n;
            int n4 = n3 + (193 & 4625);
            int n5 = n4 + (-32751 & 28995);
            this.Field_22401.put(n3, Float.floatToRawIntBits((float)(d + this.Field_22393) + Float.intBitsToFloat(this.Field_22401.get(n3))));
            this.Field_22401.put(n4, Float.floatToRawIntBits((float)(d2 + this.Field_22388) + Float.intBitsToFloat(this.Field_22401.get(n4))));
            this.Field_22401.put(n5, Float.floatToRawIntBits((float)(d3 + this.Field_22394) + Float.intBitsToFloat(this.Field_22401.get(n5))));
        }
    }

    public void Method_22442(int n, int n2, int n3, int n4, int n5) {
        if (ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN) {
            this.Field_22401.put(n, n5 << (152 & -32193) | n4 << (54 & 4376) | n3 << (12812 & 18440) | n2);
        } else {
            this.Field_22401.put(n, n2 << (-32616 & 16668) | n3 << (-31887 & 18588) | n4 << (1064 & 20553) | n5);
        }
    }

    public Class_22385 Method_22443(double d, double d2, double d3) {
        if (Class_19426.Method_19570()) {
            Class_34286.Method_34298(this);
        }
        Class_11885 class_11885 = this.Field_22395;
        int n = this.Field_22400 * class_11885.Method_11903() + class_11885.Method_11910(this.Field_22405);
        ByteBuffer byteBuffer = this.Field_22404;
        switch (Class_6090.Field_6091[this.Field_22386.Method_12439().ordinal()]) {
            case 1: {
                byteBuffer.putFloat(n, (float)(d + this.Field_22393));
                byteBuffer.putFloat(n + (1604 & 12708), (float)(d2 + this.Field_22388));
                byteBuffer.putFloat(n + (2600 & 8264), (float)(d3 + this.Field_22394));
                break;
            }
            case 2: 
            case 3: {
                byteBuffer.putInt(n, Float.floatToRawIntBits((float)(d + this.Field_22393)));
                byteBuffer.putInt(n + (12324 & 17415), Float.floatToRawIntBits((float)(d2 + this.Field_22388)));
                byteBuffer.putInt(n + (1421 & 19032), Float.floatToRawIntBits((float)(d3 + this.Field_22394)));
                break;
            }
            case 4: 
            case 5: {
                byteBuffer.putShort(n, (short)(d + this.Field_22393));
                byteBuffer.putShort(n + (4306 & -13821), (short)(d2 + this.Field_22388));
                byteBuffer.putShort(n + (16902 & 10596), (short)(d3 + this.Field_22394));
                break;
            }
            case 6: 
            case 7: {
                byteBuffer.put(n, (byte)(d + this.Field_22393));
                byteBuffer.put(n + (1417 & -6143), (byte)(d2 + this.Field_22388));
                byteBuffer.put(n + (-32761 & 66), (byte)(d3 + this.Field_22394));
            }
        }
        this.Method_22438();
        return this;
    }

    public void Method_22444(double d, double d2, double d3) {
        this.Field_22393 = d;
        this.Field_22388 = d2;
        this.Field_22394 = d3;
    }

    private void Method_22445(int n) {
        n = Class_19426.Method_19570() ? (n *= 21063 & 3093) : (n *= 535 & 43);
        if (n >= this.Field_22401.remaining()) {
            int n2 = this.Field_22404.capacity();
            int n3 = n2 % (86708304 & 36978728);
            int n4 = n3 + (((this.Field_22401.position() + n) * (10764 & 20646) - n3) / (-2009592879 & 337674244) + (519 & -29647)) * (271860416 & 698351888);
            LogManager.getLogger().warn("Needed to grow BufferBuilder buffer: Old size " + n2 + " bytes, new size " + n4 + " bytes.");
            int n5 = this.Field_22401.position();
            ByteBuffer byteBuffer = Class_11552.Method_11556(n4);
            this.Field_22404.position(582 & -24424);
            byteBuffer.put(this.Field_22404);
            byteBuffer.rewind();
            this.Field_22404 = byteBuffer;
            this.Field_22396 = this.Field_22404.asFloatBuffer();
            this.Field_22401 = this.Field_22404.asIntBuffer();
            this.Field_22401.position(n5);
            this.Field_22403 = this.Field_22404.asShortBuffer();
            this.Field_22403.position(n5 << (18523 & 9217));
            if (this.Field_22397 != null) {
                Class_11372[] arrclass_11372 = this.Field_22397;
                int n6 = this.Method_22410();
                this.Field_22397 = new Class_11372[n6];
                System.arraycopy(arrclass_11372, 14946 & -32767, this.Field_22397, 16516 & 2048, Math.min(arrclass_11372.length, this.Field_22397.length));
                this.Field_22387 = null;
            }
        }
    }

    public Class_22385 Method_22446(float f, float f2, float f3) {
        int n = this.Field_22400 * this.Field_22395.Method_11903() + this.Field_22395.Method_11910(this.Field_22405);
        switch (Class_6090.Field_6091[this.Field_22386.Method_12439().ordinal()]) {
            case 1: {
                this.Field_22404.putFloat(n, f);
                this.Field_22404.putFloat(n + (4100 & 278), f2);
                this.Field_22404.putFloat(n + (8250 & -9464), f3);
                break;
            }
            case 2: 
            case 3: {
                this.Field_22404.putInt(n, (int)f);
                this.Field_22404.putInt(n + (12807 & 324), (int)f2);
                this.Field_22404.putInt(n + (18638 & 8472), (int)f3);
                break;
            }
            case 4: 
            case 5: {
                this.Field_22404.putShort(n, (short)((int)(f * (1.4081633f * 23269.318f)) & (1409941503 & 152109055)));
                this.Field_22404.putShort(n + (83 & -28630), (short)((int)(f2 * (174757.33f * 0.1875f)) & (10551295 & -2045444097)));
                this.Field_22404.putShort(n + (13332 & 2127), (short)((int)(f3 * (26868.94f * 1.2195122f)) & (270598143 & 735576063)));
                break;
            }
            case 6: 
            case 7: {
                this.Field_22404.put(n, (byte)((int)(f * (69.0f * 1.8405797f)) & (255 & -19201)));
                this.Field_22404.put(n + (16897 & 5561), (byte)((int)(f2 * (1600.2f * 0.07936508f)) & (511 & 1279)));
                this.Field_22404.put(n + (2698 & -28377), (byte)((int)(f3 * (501.65f * 0.25316456f)) & (3327 & 255)));
            }
        }
        this.Method_22438();
        return this;
    }

    public void Method_22447() {
        if (this.Field_22397 != null) {
            int n = Class_19426.Method_19519().Method_189().Method_24120();
            if (this.Field_22398.length <= n) {
                this.Field_22398 = new boolean[n + (22753 & 8199)];
            }
            Arrays.fill(this.Field_22398, (6721 & 17670) != 0);
            int n2 = 8200 & 4370;
            int n3 = -1 & -1;
            int n4 = this.Field_22400 / (9220 & 2821);
            for (int i = 16786 & 36; i < n4; ++i) {
                int n5;
                Class_11372 class_11372 = this.Field_22397[i];
                if (class_11372 == null || this.Field_22398[n5 = class_11372.Method_11426()]) continue;
                if (class_11372 == Class_21583.Field_21585) {
                    if (n3 >= 0) continue;
                    n3 = i;
                    continue;
                }
                i = this.Method_22450(class_11372, i) - (609 & -32635);
                ++n2;
                if (this.Field_22390 == Class_17531.Field_17537) continue;
                this.Field_22398[n5] = 4691 & -22495;
            }
            if (n3 >= 0) {
                this.Method_22450(Class_21583.Field_21585, n3);
                ++n2;
            }
            if (n2 > 0) {
                // empty if block
            }
        }
    }

    public void Method_22448(Class_18381 class_18381) {
        this.Field_22401.clear();
        this.Method_22445(class_18381.Method_18386().length);
        this.Field_22401.put(class_18381.Method_18386());
        this.Field_22400 = class_18381.Method_18389();
        this.Field_22395 = new Class_11885(class_18381.Method_18388());
        if (Class_18381.Method_18387(class_18381) != null) {
            if (this.Field_22397 == null) {
                this.Field_22397 = this.Field_22387;
            }
            if (this.Field_22397 == null || this.Field_22397.length < this.Method_22410()) {
                this.Field_22397 = new Class_11372[this.Method_22410()];
            }
            Class_11372[] arrclass_11372 = Class_18381.Method_18387(class_18381);
            System.arraycopy(arrclass_11372, 2953 & 1024, this.Field_22397, -30463 & 4164, arrclass_11372.length);
        } else {
            if (this.Field_22397 != null) {
                this.Field_22387 = this.Field_22397;
            }
            this.Field_22397 = null;
        }
    }

    private void Method_22449(int n, int n2) {
        int n3 = this.Method_22409(n2);
        int n4 = n >> (1040 & 19218) & (2559 & 25855);
        int n5 = n >> (16456 & 2472) & (767 & 20991);
        int n6 = n & (-31745 & 3327);
        int n7 = n >> (-17830 & 1308) & (8447 & 21247);
        this.Method_22442(n3, n4, n5, n6, n7);
    }

    private int Method_22450(Class_11372 class_11372, int n) {
        GL11.glBindTexture((int)(24037 & 3553), (int)class_11372.Field_11379);
        int n2 = -1 & -1;
        int n3 = -1 & -1;
        int n4 = this.Field_22400 / (8477 & 2052);
        for (int i = n; i < n4; ++i) {
            Class_11372 class_113722 = this.Field_22397[i];
            if (class_113722 == class_11372) {
                if (n3 >= 0) continue;
                n3 = i;
                continue;
            }
            if (n3 < 0) continue;
            this.Method_22413(n3, i);
            if (this.Field_22390 == Class_17531.Field_17537) {
                return i;
            }
            n3 = -1 & -1;
            if (n2 >= 0) continue;
            n2 = i;
        }
        if (n3 >= 0) {
            this.Method_22413(n3, n4);
        }
        if (n2 < 0) {
            n2 = n4;
        }
        return n2;
    }

    public void Method_22451() {
        this.Field_22400 += 1289 & 10753;
        if (this.Field_22404.position() > this.Field_22401.position() * (276 & -14843)) {
            this.Field_22401.position(this.Field_22404.position() / (16468 & 1924));
        }
        this.Method_22445(this.Field_22395.Method_11914());
        this.Field_22405 = 16 & -5568;
        this.Field_22386 = this.Field_22395.Method_11904(this.Field_22405);
        if (Class_19426.Method_19570()) {
            Class_34286.Method_34308(this);
        }
    }

    public Class_22385 Method_22452(float f, float f2, float f3) {
        int n = this.Field_22400 * this.Field_22395.Method_11903() + this.Field_22395.Method_11910(this.Field_22405);
        ByteBuffer byteBuffer = this.Field_22404;
        byteBuffer.putFloat(n, f);
        byteBuffer.putFloat(n + (8484 & 1102), f2);
        byteBuffer.putFloat(n + (-32104 & 2089), f3);
        this.Method_22438();
        return this;
    }
}

