/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_14461 {
    protected int[] Field_14462;
    protected Class_4595 Field_14463;
    private Class_11372 Field_14464 = null;
    private int[] Field_14465 = null;
    protected final int Field_14466;

    public int Method_14467() {
        return this.Field_14466;
    }

    private static int[] Method_14468(int[] arrn) {
        int n = arrn.length / (-8059 & 46);
        int n2 = n * (651 & -24490);
        int[] arrn2 = new int[n2 * (-26619 & 24804)];
        for (int i = 11 & -32736; i < (-15740 & 12374); ++i) {
            System.arraycopy(arrn, i * n, arrn2, i * n2, n);
        }
        return arrn2;
    }

    private static int[] Method_14469(int[] arrn, Class_11372 class_11372) {
        int[] arrn2 = (int[])arrn.clone();
        int n = class_11372.Field_11382 / class_11372.Method_11431();
        int n2 = class_11372.Field_11373 / class_11372.Method_11424();
        int n3 = arrn2.length / (13423 & -30716);
        for (int i = 8480 & 4696; i < (-27116 & 18436); ++i) {
            int n4 = i * n3;
            float f = Float.intBitsToFloat(arrn2[n4 + (-32660 & 10260)]);
            float f2 = Float.intBitsToFloat(arrn2[n4 + (10260 & 4) + (-23511 & 257)]);
            float f3 = class_11372.Method_11432(f);
            float f4 = class_11372.Method_11430(f2);
            arrn2[n4 + (1684 & -32476)] = Float.floatToRawIntBits(f3);
            arrn2[n4 + (5 & 24708) + (53 & 6601)] = Float.floatToRawIntBits(f4);
        }
        return arrn2;
    }

    public String Method_14470() {
        return "vertex: " + this.Field_14462.length / (10359 & -16241) + ", tint: " + this.Field_14466 + ", facing: " + this.Field_14463 + ", sprite: " + this.Field_14464;
    }

    private void Method_14471() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_14461(int[] arrn, int n, Class_4595 class_4595, Class_11372 class_11372) {
        this.Field_14462 = arrn;
        this.Field_14466 = n;
        this.Field_14463 = class_4595;
        this.Field_14464 = class_11372;
        this.Method_14473();
    }

    public Class_14461(int[] arrn, int n, Class_4595 class_4595) {
        this.Field_14462 = arrn;
        this.Field_14466 = n;
        this.Field_14463 = class_4595;
        this.Method_14473();
    }

    private static Class_11372 Method_14472(int[] arrn) {
        float f = 1.0f;
        float f2 = 1.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        int n = arrn.length / (8406 & 4108);
        for (int i = 480 & 9; i < (28972 & -32764); ++i) {
            int n2 = i * n;
            float f5 = Float.intBitsToFloat(arrn[n2 + (6469 & 20)]);
            float f6 = Float.intBitsToFloat(arrn[n2 + (16484 & 14476) + (10659 & 16913)]);
            f = Math.min(f, f5);
            f2 = Math.min(f2, f6);
            f3 = Math.max(f3, f5);
            f4 = Math.max(f4, f6);
        }
        float f7 = (f + f3) / 2.0f;
        float f8 = (f2 + f4) / 2.0f;
        Class_11372 class_11372 = Class_18.Field_89.Method_189().Method_24096(f7, f8);
        return class_11372;
    }

    public void Method_14473() {
        if (Class_19426.Method_19570()) {
            if (this.Field_14462.length == (-21476 & 285)) {
                this.Field_14462 = Class_14461.Method_14468(this.Field_14462);
            }
        } else if (this.Field_14462.length == (25208 & 185)) {
            this.Field_14462 = Class_14461.Method_14477(this.Field_14462);
        }
    }

    public boolean Method_14474() {
        return (this.Field_14466 != (-1 & -1) ? 16385 & -28601 : 16976 & -32758) != 0;
    }

    public Class_4595 Method_14475() {
        if (this.Field_14463 == null) {
            this.Field_14463 = Class_9892.Method_9895(this.Method_14478());
        }
        return this.Field_14463;
    }

    public Class_11372 Method_14476() {
        if (this.Field_14464 == null) {
            this.Field_14464 = Class_14461.Method_14472(this.Method_14478());
        }
        return this.Field_14464;
    }

    private static int[] Method_14477(int[] arrn) {
        int n = arrn.length / (2119 & 20);
        int n2 = n / (2 & 338);
        int[] arrn2 = new int[n2 * (1476 & -5620)];
        for (int i = 32 & 7042; i < (4132 & 2334); ++i) {
            System.arraycopy(arrn, i * n, arrn2, i * n2, n2);
        }
        return arrn2;
    }

    public int[] Method_14478() {
        this.Method_14473();
        return this.Field_14462;
    }

    public int[] Method_14479() {
        if (this.Field_14465 == null) {
            this.Field_14465 = Class_14461.Method_14469(this.Method_14478(), this.Method_14476());
        }
        return this.Field_14465;
    }
}

