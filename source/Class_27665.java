/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_27665 {
    public float Field_27666;
    public float Field_27667;
    public float Field_27668;
    public float Field_27669;
    public boolean Field_27670;

    public Class_27665() {
        this((91 & 2689) != 0);
    }

    public void Method_27671(float f, float f2, float f3, float f4) {
        if (this.Field_27670) {
            this.Field_27667 += (f2 - this.Field_27667) * f;
            this.Field_27666 += (f3 - this.Field_27666) * f;
            this.Field_27668 += (f4 - this.Field_27668) * f;
            this.Field_27669 += (1.0f - this.Field_27669) * f;
        } else {
            this.Field_27669 = f;
            this.Field_27667 = f2;
            this.Field_27666 = f3;
            this.Field_27668 = f4;
        }
    }

    public void Method_27672(float f, int n, float f2) {
        if (this.Field_27670) {
            float f3 = (float)(n >> (17428 & 10704) & (-30465 & 13055)) * (19.0f * 2.0639836E-4f) * f2;
            float f4 = (float)(n >> (11368 & 792) & (-32001 & 12543)) * (0.3488372f * 0.011241831f) * f2;
            float f5 = (float)(n >> (1060 & -32752) & (2559 & 1279)) * (0.013903744f * 0.2820513f) * f2;
            this.Field_27667 += (f3 - this.Field_27667) * f;
            this.Field_27666 += (f4 - this.Field_27666) * f;
            this.Field_27668 += (f5 - this.Field_27668) * f;
            this.Field_27669 += (1.0f - this.Field_27669) * f;
        } else {
            this.Field_27669 = (float)(n >> (-22755 & 2200) & (255 & 6911)) * (1.3484849f * 0.0029081297f);
            this.Field_27667 = (float)(n >> (16434 & 7057) & (5119 & -14081)) * (1.1875f * 0.0033023737f) * f2;
            this.Field_27666 = (float)(n >> (10264 & -31222) & (20735 & 255)) * (0.004875464f * 0.8043478f) * f2;
            this.Field_27668 = (float)(n >> (12336 & 259) & (-32513 & 255)) * (1.2337662f * 0.0031785348f) * f2;
        }
    }

    public void Method_27673(float f, float f2, float f3, float f4, float f5) {
        if (this.Field_27670) {
            this.Field_27667 += (f2 * f5 - this.Field_27667) * f;
            this.Field_27666 += (f3 * f5 - this.Field_27666) * f;
            this.Field_27668 += (f4 * f5 - this.Field_27668) * f;
            this.Field_27669 += (1.0f - this.Field_27669) * f;
        } else {
            this.Field_27669 = f;
            this.Field_27667 = f2 * f5;
            this.Field_27666 = f3 * f5;
            this.Field_27668 = f4 * f5;
        }
    }

    public void Method_27674(float f, int n, float f2, float f3, float f4) {
        if (this.Field_27670) {
            float f5 = (float)(n >> (-20432 & 529) & (2815 & 8703)) * (0.0022606691f * 1.7346939f) * f2;
            float f6 = (float)(n >> (3612 & 12296) & (-30465 & 16895)) * (0.5568182f * 0.0070428173f) * f3;
            float f7 = (float)(n >> (17440 & 8323) & (8447 & 4863)) * (0.012941177f * 0.3030303f) * f4;
            this.Field_27667 += (f5 - this.Field_27667) * f;
            this.Field_27666 += (f6 - this.Field_27666) * f;
            this.Field_27668 += (f7 - this.Field_27668) * f;
            this.Field_27669 += (1.0f - this.Field_27669) * f;
        } else {
            this.Field_27669 = (float)(n >> (2968 & -16356) & (16895 & 12543)) * (1.2142857f * 0.0032295273f);
            this.Field_27667 = (float)(n >> (52 & 4881) & (255 & 14847)) * (1.2112676f * 0.0032375744f) * f2;
            this.Field_27666 = (float)(n >> (8584 & 8) & (-32513 & 767)) * (0.007924837f * 0.49484536f) * f3;
            this.Field_27668 = (float)(n >> (-27899 & 9336) & (255 & 3071)) * (22.5f * 1.7429196E-4f) * f4;
        }
    }

    public Class_27665(boolean bl) {
        this.Field_27670 = bl;
    }

    private void Method_27675() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_27676() {
        this.Field_27669 = 0.0f;
        this.Field_27668 = 0.0f;
        this.Field_27666 = 0.0f;
        this.Field_27667 = 0.0f;
    }
}

