/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_11109 {
    private final byte[] Field_11110 = new byte[780 & 20739];
    private final int Field_11111;
    private final byte[] Field_11112 = new byte[18760 & -32512];

    public Class_11109(byte[] arrby) {
        int n;
        if (arrby.length < (161 & 11523) || arrby.length > (-32443 & 9488)) {
            throw new IllegalArgumentException("key must be between 1 and 256 bytes");
        }
        this.Field_11111 = arrby.length;
        for (n = 2088 & 772; n < (266 & 9601); ++n) {
            this.Field_11110[n] = (byte)n;
            this.Field_11112[n] = arrby[n % this.Field_11111];
        }
        n = -16384 & 2560;
        for (int i = 16386 & 3853; i < (-24320 & 7452); ++i) {
            n = n + this.Field_11110[i] + this.Field_11112[i] & (-30465 & 1279);
            byte by = this.Field_11110[n];
            this.Field_11110[n] = this.Field_11110[i];
            this.Field_11110[i] = by;
        }
    }

    private void Method_11113() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public byte[] Method_11114(byte[] arrby) {
        byte[] arrby2 = new byte[arrby.length];
        int n = -21458 & 4224;
        int n2 = 2593 & 28890;
        for (int i = 12363 & 16416; i < arrby.length; ++i) {
            n = n + (13 & 16899) & (-29441 & 20991);
            n2 = n2 + this.Field_11110[n] & (17407 & 255);
            byte by = this.Field_11110[n2];
            this.Field_11110[n2] = this.Field_11110[n];
            this.Field_11110[n] = by;
            int n3 = this.Field_11110[n] + this.Field_11110[n2] & (16895 & 6399);
            byte by2 = this.Field_11110[n3];
            arrby2[i] = (byte)(arrby[i] ^ by2);
        }
        return arrby2;
    }

    public byte[] Method_11115(byte[] arrby) {
        return this.Method_11114(arrby);
    }
}

