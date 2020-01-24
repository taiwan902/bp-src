/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  internal.org.lwjgl.opengl.GL11
 */
import internal.org.lwjgl.opengl.GL11;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.nio.ByteBuffer;

public class Class_19135 {
    public int Field_19136;
    public float[] Field_19137;
    public int Field_19138;
    public int Field_19139;
    public int Field_19140;
    public int Field_19141;
    public int Field_19142;
    public int Field_19143;
    public int Field_19144;
    public boolean Field_19145;

    public void Method_19146(int n) {
        if (Class_32876.Method_32948()) {
            this.Field_19138 = n;
            Class_16867.Method_16963(this.Field_19144);
            GL11.glTexParameterf((int)(-28695 & 11749), (int)(-5885 & 10305), (float)n);
            GL11.glTexParameterf((int)(3557 & -12829), (int)(10253 & 15568), (float)n);
            GL11.glTexParameterf((int)(4065 & 3559), (int)(10918 & -5806), (float)(0.71276593f * 14725.731f));
            GL11.glTexParameterf((int)(-12831 & 4081), (int)(-21869 & 26667), (float)(15569.066f * 0.6741573f));
            Class_16867.Method_16963(1042 & 12928);
        }
    }

    public void Method_19147() {
        if (Class_32876.Method_32948()) {
            Class_16867.Method_16963(-5440 & 25);
        }
    }

    public Class_19135(int n, int n2, boolean bl) {
        this.Field_19145 = bl;
        this.Field_19139 = -1 & -1;
        this.Field_19144 = -1 & -1;
        this.Field_19143 = -1 & -1;
        this.Field_19137 = new float[12317 & 3620];
        this.Field_19137[8777 & 16516] = 1.0f;
        this.Field_19137[4633 & -32735] = 1.0f;
        this.Field_19137[8707 & -31446] = 1.0f;
        this.Field_19137[4167 & -20861] = 0.0f;
        this.Method_19156(n, n2);
    }

    public void Method_19148(float f, float f2, float f3, float f4) {
        this.Field_19137[-24476 & 769] = f;
        this.Field_19137[17673 & -22527] = f2;
        this.Field_19137[-27070 & 2186] = f3;
        this.Field_19137[16391 & 387] = f4;
    }

    public void Method_19149() {
        int n = Class_32876.Method_32945(Class_32876.Field_32910);
        if (n != Class_32876.Field_32886) {
            if (n == Class_32876.Field_32901) {
                throw new RuntimeException("GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT");
            }
            if (n == Class_32876.Field_32877) {
                throw new RuntimeException("GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT");
            }
            if (n == Class_32876.Field_32895) {
                throw new RuntimeException("GL_FRAMEBUFFER_INCOMPLETE_DRAW_BUFFER");
            }
            if (n == Class_32876.Field_32889) {
                throw new RuntimeException("GL_FRAMEBUFFER_INCOMPLETE_READ_BUFFER");
            }
            throw new RuntimeException("glCheckFramebufferStatus returned unknown status:" + n);
        }
    }

    public void Method_19150() {
        this.Method_19152((-11385 & 33) != 0);
        Class_16867.Method_16981(this.Field_19137[2565 & 4098], this.Field_19137[9 & 2759], this.Field_19137[16974 & -19166], this.Field_19137[21543 & 3]);
        int n = 16478 & 24576;
        if (this.Field_19145) {
            Class_16867.Method_16948(1.0);
            n |= 16776 & -30460;
        }
        Class_16867.Method_16983(n);
        this.Method_19155();
    }

    public void Method_19151(int n, int n2, boolean bl) {
        if (Class_32876.Method_32948()) {
            Class_16867.Method_16923((10001 & -16215) != 0, (-11975 & 7) != 0, (1585 & -24447) != 0, (18 & 4417) != 0);
            Class_16867.Method_16944();
            Class_16867.Method_16930((28954 & -32252) != 0);
            Class_16867.Method_16934(-16501 & 5989);
            Class_16867.Method_16962();
            Class_16867.Method_16911(0.0, n, n2, 0.0, 1137.9310344827586 * 0.8787878787878788, 0.8222222222222222 * 3648.6486486486488);
            Class_16867.Method_16934(30494 & 6017);
            Class_16867.Method_16962();
            Class_16867.Method_16943(0.0f, 0.0f, 1.7692307f * -1130.4348f);
            Class_16867.Method_16910(1344 & 21007, 3104 & 2, n, n2);
            Class_16867.Method_16965();
            Class_16867.Method_16931();
            Class_16867.Method_16985();
            if (bl) {
                Class_16867.Method_16952();
                Class_16867.Method_16950();
            }
            Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 1.0f);
            this.Method_19153();
            float f = n;
            float f2 = n2;
            float f3 = (float)this.Field_19140 / (float)this.Field_19142;
            float f4 = (float)this.Field_19136 / (float)this.Field_19141;
            Class_7644 class_7644 = Class_7644.Method_7649();
            Class_22385 class_22385 = class_7644.Method_7648();
            class_22385.Method_22417(9615 & -16377, Class_29585.Field_29586);
            class_22385.Method_22443(0.0, f2, 0.0).Method_22433(0.0, 0.0).Method_22424(767 & 5631, 5119 & 3327, 255 & 29439, 15103 & 255).Method_22451();
            class_22385.Method_22443(f, f2, 0.0).Method_22433(f3, 0.0).Method_22424(255 & -19969, -27905 & 16639, 22783 & 1535, 1279 & 767).Method_22451();
            class_22385.Method_22443(f, 0.0, 0.0).Method_22433(f3, f4).Method_22424(-7425 & 1279, 767 & -24321, -32001 & 2303, -30465 & 1535).Method_22451();
            class_22385.Method_22443(0.0, 0.0, 0.0).Method_22433(0.0, f4).Method_22424(16639 & 6911, 4351 & 255, 255 & -32001, 18175 & -32257).Method_22451();
            class_7644.Method_7647();
            this.Method_19147();
            Class_16867.Method_16930((-30711 & 4609) != 0);
            Class_16867.Method_16923((6169 & 323) != 0, (4169 & 2721) != 0, (521 & -32557) != 0, (12417 & -16287) != 0);
        }
    }

    public void Method_19152(boolean bl) {
        if (Class_32876.Method_32948()) {
            Class_32876.Method_32968(Class_32876.Field_32910, this.Field_19139);
            if (bl) {
                Class_16867.Method_16910(10244 & -28424, 1163 & 8240, this.Field_19140, this.Field_19136);
            }
        }
    }

    public void Method_19153() {
        if (Class_32876.Method_32948()) {
            Class_16867.Method_16963(this.Field_19144);
        }
    }

    private void Method_19154() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_19155() {
        if (Class_32876.Method_32948()) {
            Class_32876.Method_32968(Class_32876.Field_32910, -31736 & 49);
        }
    }

    public void Method_19156(int n, int n2) {
        if (!Class_32876.Method_32948()) {
            this.Field_19140 = n;
            this.Field_19136 = n2;
        } else {
            Class_16867.Method_16927();
            if (this.Field_19139 >= 0) {
                this.Method_19158();
            }
            this.Method_19157(n, n2);
            this.Method_19149();
            Class_32876.Method_32968(Class_32876.Field_32910, 72 & -12253);
        }
    }

    public void Method_19157(int n, int n2) {
        this.Field_19140 = n;
        this.Field_19136 = n2;
        this.Field_19142 = n;
        this.Field_19141 = n2;
        if (!Class_32876.Method_32948()) {
            this.Method_19150();
        } else {
            this.Field_19139 = Class_32876.Method_32941();
            this.Field_19144 = Class_18695.Method_18705();
            if (this.Field_19145) {
                this.Field_19143 = Class_32876.Method_32980();
            }
            this.Method_19146(11914 & 10049);
            Class_16867.Method_16963(this.Field_19144);
            GL11.glTexImage2D((int)(28647 & 3577), (int)(-10528 & 10247), (int)(1246929112 & -1342144421), (int)this.Field_19142, (int)this.Field_19141, (int)(8456 & -28655), (int)(6600 & 7946), (int)(21515 & 7201), (ByteBuffer)null);
            Class_32876.Method_32968(Class_32876.Field_32910, this.Field_19139);
            Class_32876.Method_32984(Class_32876.Field_32910, Class_32876.Field_32887, -21015 & 3569, this.Field_19144, -20062 & 3080);
            if (this.Field_19145) {
                Class_32876.Method_32963(Class_32876.Field_32925, this.Field_19143);
                Class_32876.Method_32978(Class_32876.Field_32925, 546083830 & 16941478, this.Field_19142, this.Field_19141);
                Class_32876.Method_32947(Class_32876.Field_32910, Class_32876.Field_32914, Class_32876.Field_32925, this.Field_19143);
            }
            this.Method_19150();
            this.Method_19147();
        }
    }

    public void Method_19158() {
        if (Class_32876.Method_32948()) {
            this.Method_19147();
            this.Method_19155();
            if (this.Field_19143 > (-1 & -1)) {
                Class_32876.Method_32956(this.Field_19143);
                this.Field_19143 = -1 & -1;
            }
            if (this.Field_19144 > (-1 & -1)) {
                Class_18695.Method_18720(this.Field_19144);
                this.Field_19144 = -1 & -1;
            }
            if (this.Field_19139 > (-1 & -1)) {
                Class_32876.Method_32968(Class_32876.Field_32910, 20020 & 8192);
                Class_32876.Method_32950(this.Field_19139);
                this.Field_19139 = -1 & -1;
            }
        }
    }

    public void Method_19159(int n, int n2) {
        this.Method_19151(n, n2, (18969 & 9251) != 0);
    }
}

