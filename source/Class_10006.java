/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_10006 {
    public final int Field_10007;
    public float[] Field_10008;

    public int Method_10009(int n) {
        return (n + ((1156 & 8524) - this.Field_10007 / (5466 & 8286))) % (263 & 644);
    }

    public void Method_10010(float[] arrf) {
        if (this.Field_10008 == null) {
            this.Field_10008 = arrf;
        }
    }

    public float Method_10011(int n) {
        if (this.Field_10008 == null) {
            throw new NullPointerException("uvs");
        }
        int n2 = this.Method_10014(n);
        return n2 != 0 && n2 != (10275 & 145) ? this.Field_10008[-7958 & 6167] : this.Field_10008[7040 & 50];
    }

    private void Method_10012() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public float Method_10013(int n) {
        if (this.Field_10008 == null) {
            throw new NullPointerException("uvs");
        }
        int n2 = this.Method_10014(n);
        return n2 != 0 && n2 != (6675 & -24477) ? this.Field_10008[21027 & 1091] : this.Field_10008[18601 & 81];
    }

    public Class_10006(float[] arrf, int n) {
        this.Field_10008 = arrf;
        this.Field_10007 = n;
    }

    private int Method_10014(int n) {
        return (n + this.Field_10007 / (1402 & -15782)) % (261 & 3078);
    }
}

