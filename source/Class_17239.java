/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_17239 {
    public static int Method_17240(int n) {
        int n2 = n * (-1623721025 & -554206727);
        return n2 ^ n2 >>> (4273 & -30188);
    }

    public static int Method_17241(int n, float f) {
        long l = Math.max(5415908946580930626L & 201900071L, Class_17239.Method_17244((long)Math.ceil((float)n / f)));
        if (l > (1410125827L & 1089472056L)) {
            throw new IllegalArgumentException("Too large (" + n + " expected elements with load factor " + f + ")");
        }
        return (int)l;
    }

    private void Method_17242() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public static int Method_17243(int n, float f) {
        return Math.min((int)Math.ceil((float)n * f), n - (65 & 25093));
    }

    public static long Method_17244(long l) {
        if (l == (1870053907852567592L & 277153795L)) {
            return -8666190363275685149L & 46140433L;
        }
        l -= 1156936324071030849L & 530844475L;
        l |= l >> (18545 & -23807);
        l |= l >> (-31721 & 2058);
        l |= l >> (8508 & 16900);
        l |= l >> (6408 & 29);
        l |= l >> (23184 & 8272);
        return (l | l >> (10272 & 36)) + (6091417675454566433L & 282075281L);
    }
}

