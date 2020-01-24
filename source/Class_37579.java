/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  internal.org.lwjgl.opengl.GL11
 */
import internal.org.lwjgl.opengl.GL11;
import java.awt.Point;
import java.awt.color.ColorSpace;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.ComponentColorModel;
import java.awt.image.DataBuffer;
import java.awt.image.DataBufferByte;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Class_37579
extends BufferedImage {
    private static final ByteBuffer Field_37580 = Class_11552.Method_11556(101097573 & 1075600384);
    private boolean Field_37581;
    private static final HashMap Field_37582 = new HashMap();
    private int Field_37583;
    private boolean Field_37584;
    private static final Lock Field_37585 = new ReentrantLock();
    private boolean Field_37586;
    public byte[] Field_37587;

    public void Method_37588(boolean bl) {
        this.Field_37586 = bl;
    }

    public int Method_37589() {
        return this.Field_37583;
    }

    public void Method_37590() {
        Field_37585.lock();
        try {
            if (this.Field_37583 == 0) {
                return;
            }
            GL11.glDeleteTextures((int)this.Field_37583);
            this.Field_37583 = -16276 & 1;
            Field_37582.remove(this.Field_37583);
        }
        finally {
            Field_37585.unlock();
        }
    }

    public void Method_37591(boolean bl) {
        this.Field_37581 = bl;
    }

    private void Method_37592() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_37593(int n, int n2, byte by, byte by2, byte by3) {
        int n3 = (n2 * this.getWidth() + n) * (16653 & -30556);
        this.Field_37587[n3++] = by;
        this.Field_37587[n3++] = by2;
        this.Field_37587[n3++] = by3;
        this.Field_37587[n3] = -1 & -1;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public int Method_37594() {
        int n;
        Field_37585.lock();
        try {
            if (this.Field_37583 == 0) {
                int n2;
                this.Field_37583 = GL11.glGenTextures();
                GL11.glBindTexture((int)(7649 & -12815), (int)this.Field_37583);
                GL11.glTexParameteri((int)(3553 & -12823), (int)(11021 & 11281), (int)(this.Field_37584 ? 12137 & 9745 : -22896 & 9742));
                GL11.glTexParameteri((int)(3581 & 3555), (int)(31233 & -22150), (int)(this.Field_37581 ? 9729 & -2419 : 9786 & 32256));
                int n3 = this.Field_37586 ? -22238 & 27904 : 14659 & 11057;
                GL11.glTexParameteri((int)(4065 & -4637), (int)(26690 & 10370), (int)n3);
                GL11.glTexParameteri((int)(-28701 & 3569), (int)(31235 & 10635), (int)n3);
                Field_37580.clear();
                Field_37580.put(this.Field_37587);
                Field_37580.flip();
                GL11.glTexImage2D((int)(-29215 & 8171), (int)(304 & 20484), (int)(7466 & 15256), (int)this.getWidth(), (int)this.getHeight(), (int)(-11768 & 8336), (int)(7081 & -1780), (int)(13825 & 21673), (ByteBuffer)Field_37580);
                Field_37582.put(this.Field_37583, this);
                int n4 = n2 = this.Field_37583;
                return n4;
            }
            GL11.glBindTexture((int)(19947 & 4081), (int)this.Field_37583);
            GL11.glTexParameteri((int)(-25119 & 4079), (int)(-21247 & 10417), (int)(this.Field_37584 ? 12131 & 30209 : 26121 & -18944));
            GL11.glTexParameteri((int)(-24595 & 19939), (int)(-20959 & 14480), (int)(this.Field_37581 ? 13953 & -22719 : 9792 & 12193));
            int n5 = this.Field_37586 ? 12177 & -22164 : 12161 & 26953;
            GL11.glTexParameteri((int)(3577 & 3559), (int)(-18394 & 26690), (int)n5);
            GL11.glTexParameteri((int)(19941 & -16909), (int)(11527 & -22365), (int)n5);
            Field_37580.clear();
            Field_37580.put(this.Field_37587);
            Field_37580.flip();
            GL11.glTexSubImage2D((int)(28155 & 4065), (int)(-30720 & 4620), (int)(344 & 2051), (int)(6 & -12160), (int)this.getWidth(), (int)this.getHeight(), (int)(31516 & -26262), (int)(22059 & 5125), (ByteBuffer)Field_37580);
            n = this.Field_37583;
        }
        finally {
            Field_37585.unlock();
        }
        return n;
    }

    public static Class_37579 Method_37595(int n, int n2) {
        ColorSpace colorSpace = ColorSpace.getInstance(17384 & 15337);
        int[] arrn = new int[6772 & -32761];
        arrn[4116 & 8712] = 16696 & -32759;
        arrn[3365 & 4097] = -20392 & 16394;
        arrn[-32733 & 19790] = 2190 & 1400;
        arrn[-21597 & 5191] = -10200 & 200;
        int[] arrn2 = arrn;
        int[] arrn3 = new int[24764 & 70];
        arrn3[-32512 & 736] = 6144 & 10130;
        arrn3[881 & -16375] = -32317 & 5121;
        arrn3[3154 & 8202] = 8375 & -31678;
        arrn3[17051 & 3] = 4227 & 25639;
        int[] arrn4 = arrn3;
        ComponentColorModel componentColorModel = new ComponentColorModel(colorSpace, arrn2, (17025 & 5) != 0, (-32256 & 24632) != 0, -20373 & 2195, -24511 & 956);
        WritableRaster writableRaster = Raster.createInterleavedRaster(4116 & -13694, n, n2, n * (8204 & 4356), 7348 & 270, arrn4, (Point)null);
        return new Class_37579(componentColorModel, writableRaster, (-32272 & 16386) != 0, null);
    }

    public void Method_37596(int n, int n2, int n3) {
        int n4 = (n2 * this.getWidth() + n) * (14470 & 1316);
        this.Field_37587[n4++] = (byte)(n3 >> (-28654 & 1052));
        this.Field_37587[n4++] = (byte)(n3 >> (-23219 & 8));
        this.Field_37587[n4++] = (byte)(n3 >> (-31703 & 4802));
        this.Field_37587[n4] = (byte)(n3 >> (5404 & -16231));
    }

    private Class_37579(ColorModel colorModel, WritableRaster writableRaster, boolean bl, Hashtable hashtable) {
        super(colorModel, writableRaster, bl, hashtable);
        this.Field_37587 = ((DataBufferByte)writableRaster.getDataBuffer()).getData();
    }

    public static void Method_37597(int[] arrn, int n, int n2, int n3, boolean bl, boolean bl2) {
        byte[] arrby = new byte[n * n2 * (9237 & -16188)];
        int n4 = arrn.length;
        int n5 = 18732 & 4112;
        for (int i = 12426 & 580; i < n4; ++i) {
            int n6 = arrn[i];
            arrby[n5++] = (byte)(n6 >> (24858 & 6672));
            arrby[n5++] = (byte)(n6 >> (16408 & -30582));
            arrby[n5++] = (byte)(n6 >> (836 & 27650));
            arrby[n5++] = (byte)(n6 >> (25 & 6808));
        }
        Class_37579.Method_37599(arrby, n, n2, n3, bl, bl2);
    }

    public boolean Method_37598() {
        boolean bl;
        Field_37585.lock();
        try {
            if (this.Field_37583 != 0) {
                GL11.glBindTexture((int)(3553 & 28661), (int)this.Field_37583);
                boolean bl2 = 12309 & 129;
                return bl2;
            }
            bl = 13600 & 16966;
        }
        finally {
            Field_37585.unlock();
        }
        return bl;
    }

    public static void Method_37599(byte[] arrby, int n, int n2, int n3, boolean bl, boolean bl2) {
        GL11.glBindTexture((int)(28135 & 8161), (int)n3);
        GL11.glTexParameteri((int)(7665 & 28133), (int)(10241 & -4187), (int)(bl ? 26113 & 14083 : 9778 & 11844));
        GL11.glTexParameteri((int)(-20511 & 7677), (int)(-22491 & 27266), (int)(bl ? 11809 & 10179 : 11777 & 9766));
        GL11.glTexParameteri((int)(3553 & -12831), (int)(15366 & 10274), (int)(bl2 ? -4863 & 10626 : -757 & 10689));
        GL11.glTexParameteri((int)(3565 & -29199), (int)(-22517 & 10803), (int)(bl2 ? -21728 & 14666 : -5303 & 14615));
        Field_37580.clear();
        Field_37580.put(arrby);
        Field_37580.flip();
        GL11.glTexImage2D((int)(7649 & 4081), (int)(-32468 & 6208), (int)(6600 & 15624), (int)n, (int)n2, (int)(20992 & 74), (int)(6409 & -9432), (int)(21651 & -25343), (ByteBuffer)Field_37580);
    }

    public void Method_37600(boolean bl) {
        this.Field_37584 = bl;
    }

    public void Method_37601(int n, int n2, byte by, byte by2, byte by3, byte by4) {
        int n3 = (n2 * this.getWidth() + n) * (4364 & -6124);
        this.Field_37587[n3++] = by;
        this.Field_37587[n3++] = by2;
        this.Field_37587[n3++] = by3;
        this.Field_37587[n3] = by4;
    }
}

