/*
 * Decompiled with CFR 0.145.
 */
import java.io.InputStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_17779 {
    int Field_17780;
    int Field_17781;
    InputStream Field_17782;

    public final int Method_17783(int n) {
        int n2 = 19840 & 4099;
        for (int i = n; i != 0; --i) {
            this.Field_17781 >>>= 16603 & -28639;
            int n3 = this.Field_17780 - this.Field_17781 >>> (24991 & -30657);
            this.Field_17780 -= this.Field_17781 & n3 - (20481 & -32749);
            n2 = n2 << (16945 & 1161) | (4653 & 3) - n3;
            if ((this.Field_17781 & (-16514990 & -16724480)) != 0) continue;
            this.Field_17780 = this.Field_17780 << (11340 & -32455) | this.Field_17782.read();
            this.Field_17781 <<= -20468 & 17546;
        }
        return n2;
    }

    public static void Method_17784(short[] arrs) {
        for (int i = -26834 & 1; i < arrs.length; ++i) {
            arrs[i] = 19456 & -30967;
        }
    }

    public int Method_17785(short[] arrs, int n) {
        short s = arrs[n];
        int n2 = (this.Field_17781 >>> (7183 & 16555)) * s;
        if ((this.Field_17780 ^ -1845124603 & -2128081630) < (n2 ^ -761232382 & -2146356976)) {
            this.Field_17781 = n2;
            arrs[n] = (short)(s + ((10368 & 3604) - s >>> (8549 & -32745)));
            if ((this.Field_17781 & (-12033518 & -13172628)) == 0) {
                this.Field_17780 = this.Field_17780 << (17388 & 6171) | this.Field_17782.read();
                this.Field_17781 <<= 1416 & -12216;
            }
            return -32752 & 5152;
        }
        this.Field_17781 -= n2;
        this.Field_17780 -= n2;
        arrs[n] = (short)(s - (s >>> (133 & 2117)));
        if ((this.Field_17781 & (-7860063 & -15654832)) == 0) {
            this.Field_17780 = this.Field_17780 << (5390 & 8) | this.Field_17782.read();
            this.Field_17781 <<= -32119 & 1324;
        }
        return 309 & -16375;
    }

    public final void Method_17786() {
        this.Field_17782 = null;
    }

    public final void Method_17787(InputStream inputStream) {
        this.Field_17782 = inputStream;
    }

    public final void Method_17788() {
        this.Field_17780 = 16928 & -32620;
        this.Field_17781 = -1 & -1;
        for (int i = 16546 & 14656; i < (1221 & 24615); ++i) {
            this.Field_17780 = this.Field_17780 << (9608 & 554) | this.Field_17782.read();
        }
    }

    private void Method_17789() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

