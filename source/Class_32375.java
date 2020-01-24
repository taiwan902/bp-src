/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  internal.org.lwjgl.opengl.GL11
 */
import internal.org.lwjgl.opengl.GL11;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_32375 {
    private boolean Field_32376 = 1673 & 14627;
    private int Field_32377;
    private int Field_32378 = 18814 & 8215;
    public boolean Field_32379 = 257 & -14717;
    private int Field_32380;
    private int Field_32381 = 255 & 13055;
    private final Class_18 Field_32382 = Class_18.Field_89;
    private double Field_32383 = 1.0;
    private final Class_8264 Field_32384;
    private long Field_32385 = 143611978971862561L & -143611980880543736L;
    private int Field_32386 = 18614 & 278;

    private void Method_32387() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_32388(int n, int n2, int n3) {
        if (!this.Field_32379) {
            return;
        }
        boolean bl = this.Field_32384.Method_8279();
        int n4 = this.Field_32384.Method_8274();
        String string = Class_39702.Method_39914(n4);
        if (string.equals("SPACE")) {
            string = "\u00a7m                ";
        }
        if (bl != this.Field_32376) {
            this.Field_32376 = bl;
            this.Field_32385 = System.currentTimeMillis();
        }
        if (bl) {
            this.Field_32381 = Math.min(-8961 & 255, (int)((-7089917786045792126L & 288952394L) * (System.currentTimeMillis() - this.Field_32385)));
            this.Field_32383 = Math.max(0.0, 1.0 - (double)(System.currentTimeMillis() - this.Field_32385) / (1.0465116279069768 * 19.11111111111111));
        } else {
            this.Field_32381 = Math.max(8234 & 4100, (255 & 18175) - (int)((-301997021134807022L & 301997019835209766L) * (System.currentTimeMillis() - this.Field_32385)));
            this.Field_32383 = Math.min(1.0, (double)(System.currentTimeMillis() - this.Field_32385) / (0.9078947368421053 * 22.028985507246375));
        }
        Class_1551.Method_1558(n + this.Field_32380, n2 + this.Field_32377, n + this.Field_32380 + this.Field_32378, n2 + this.Field_32377 + this.Field_32386, (2083128426 & 2021998593) + (this.Field_32381 << (-15084 & 8720)) + (this.Field_32381 << (8218 & 2696)) + this.Field_32381);
        int n5 = n3 >> (8219 & 2224) & (16895 & 8447);
        int n6 = n3 >> (2712 & 73) & (26879 & -27905);
        int n7 = n3 & (-31745 & 20735);
        int n8 = this.Field_32382.Field_27.Method_28715(string);
        int n9 = this.Field_32378 / (-28538 & 27650);
        int n10 = this.Field_32386 / (2058 & 470);
        if (n8 < (1274 & 4110)) {
            this.Field_32382.Field_27.Method_28692(string, n + this.Field_32380 + n9 - (-1981 & 1075), n2 + this.Field_32377 + n10 - (163 & 263), (-14417775 & -7101182) + ((int)((double)n5 * this.Field_32383) << (414 & 16432)) + ((int)((double)n6 * this.Field_32383) << (-15352 & 14348)) + (int)((double)n7 * this.Field_32383));
        } else {
            GL11.glScalef((float)(3.0f * 0.16666667f), (float)(7.0f * 0.071428575f), (float)(2.0434783f * 0.24468085f));
            this.Field_32382.Field_27.Method_28692(string, (n + this.Field_32380 + n9) * (146 & 20550) - n8 / (-24542 & 22934), (n2 + this.Field_32377 + n10) * (167 & -21502) - (271 & 195), (-7826803 & -13563792) + ((int)((double)n5 * this.Field_32383) << (400 & -24495)) + ((int)((double)n6 * this.Field_32383) << (18505 & 8202)) + (int)((double)n7 * this.Field_32383));
            GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
        }
    }

    public void Method_32389(int n, int n2) {
        this.Field_32378 = n;
        this.Field_32386 = n2;
    }

    public Class_32375(Class_8264 class_8264, int n, int n2) {
        this.Field_32384 = class_8264;
        this.Field_32380 = n;
        this.Field_32377 = n2;
    }
}

