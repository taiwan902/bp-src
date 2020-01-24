/*
 * Decompiled with CFR 0.145.
 */
package pl.blazingpack.fastutils;

import java.io.PrintStream;
import java.io.Serializable;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.management.ManagementFactory;
import java.nio.ByteBuffer;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 * Duplicate member names - consider using --renamedupmembers true
 */
public class FastRandom
implements Serializable {
    private int \u0000%;
    private static int \u0000= final;
    private int \u0000strictfp;
    private int \u0000;
    private boolean \u0000, `;
    private int \u0000, for;
    static final boolean \u0000strictfp;
    private final byte[] \u0000strictfp;
    private int \u0000, ` = -32436 & 4608;

    public FastRandom(long l) {
        this(FastRandom.\u0000strictfp("happyinteger" + l));
    }

    public FastRandom() {
        this(FastRandom.\u0000strictfp());
    }

    static {
        \u0000strictfp = !FastRandom.class.desiredAssertionStatus() ? 2177 & 25427 : -26476 & 18216;
        \u0000= final = 33 & 3082;
    }

    static byte[] \u0000strictfp(String string) {
        ByteBuffer byteBuffer = ByteBuffer.allocate(4117 & -16362);
        byteBuffer.putInt((string + "1").hashCode());
        byteBuffer.putInt((string + "2").hashCode());
        byteBuffer.putInt((string + "3").hashCode());
        byteBuffer.putInt((string + "4").hashCode());
        byteBuffer.putInt((string + "5").hashCode());
        return byteBuffer.array();
    }

    public FastRandom(byte[] arrby) {
        if (arrby == null || arrby.length != (25748 & 4190)) {
            throw new IllegalArgumentException("XOR shift RNG requires 160 bits of seed data.");
        }
        this.\u0000strictfp = (byte[])arrby.clone();
        int[] arrn = FastRandom.\u0000strictfp(arrby);
        this.\u0000, ` = arrn[-31588 & 64];
        this.\u0000
         = arrn[25097 & 4485];
        this.\u0000% = arrn[515 & 16694];
        this.\u0000strictfp = arrn[8739 & 4115];
        this.\u0000, for = arrn[103 & 4];
    }

    public static int[] \u0000strictfp(byte[] arrby) {
        if (arrby.length % (9492 & 4133) != 0) {
            throw new IllegalArgumentException("Number of input bytes must be a multiple of 4.");
        }
        int[] arrn = new int[arrby.length / (8452 & 7)];
        for (int i = 24 & 32; i < arrn.length; ++i) {
            arrn[i] = FastRandom.\u0000strictfp(arrby, i * (38 & 21333));
        }
        return arrn;
    }

    static byte[] \u0000strictfp() {
        long l = System.nanoTime();
        String string = l + " " + (\u0000= final += 21377 & 2053) + " " + ManagementFactory.getRuntimeMXBean().getName();
        return FastRandom.\u0000strictfp(string);
    }

    public int \u0000, `(int n) {
        int n2;
        int n3;
        if (n <= 0) {
            throw new IllegalArgumentException("n must be positive");
        }
        if ((n & -n) == n) {
            return (int)((long)n * (long)this.\u0000strictfp(-32609 & 20543) >> (4127 & 17087));
        }
        while ((n3 = this.\u0000strictfp(8319 & -31585)) - (n2 = n3 % n) + (n - (169 & 19971)) < 0) {
        }
        return n2;
    }

    private void \u0000- break # private int char 3 volatile 5 \u000a synchronized const super for 4 % ? transient 2 private $ return final void 6 \u000a short 2 ] { for $ + continue 9 8 byte 8 return % 6 try ^ const while native \u000a instanceof do + abstract native instanceof case case & boolean() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected int \u0000strictfp(int n) {
        int n2 = this.\u0000, ` ^ this.\u0000, ` >> (2071 & -32753);
        this.\u0000, ` = this.\u0000;
        this.\u0000
         = this.\u0000%;
        this.\u0000% = this.\u0000strictfp;
        this.\u0000strictfp = this.\u0000, for;
        this.\u0000, for = this.\u0000, for ^ this.\u0000, for << (10519 & 16390) ^ (n2 ^ n2 << (-26321 & 525));
        int n3 = (this.\u0000
         + this.\u0000
         + (-32255 & 16677)) * this.\u0000, for;
        return n3 >>> (-28123 & 24634) - n;
    }

    public double \u0000strictfp() {
        long l = ((long)this.\u0000strictfp(-32710 & 4122) << (26779 & -27873)) + (long)this.\u0000strictfp(2587 & 9243);
        return (double)l / (1.3 * 6.928614811339224E15);
    }

    public static void main(String[] arrstring) {
        FastRandom fastRandom = new FastRandom();
        int n = -1076004878 & 502228232;
        int n2 = 2352 & -31124;
        double d = System.nanoTime();
        for (int i = -31536 & 8192; i < n; ++i) {
            double d2 = fastRandom.\u0000strictfp();
        }
        double d3 = (double)System.nanoTime() - d;
        Object[] arrobject = new Object[17491 & -32090];
        arrobject[7832 & 0] = d3 / (2.2E9 * 0.45454545454545453);
        arrobject[7857 & 8257] = d3 / (double)n;
        System.out.printf("%g s total, %g ns/iter\n", arrobject);
    }

    public static int \u0000strictfp(byte[] arrby, int n) {
        return 767 & 8447 & arrby[n + (-32125 & 5155)] | (10495 & 20735 & arrby[n + (4482 & 18962)]) << (18136 & 4106) | (17407 & -21249 & arrby[n + (1173 & 26689)]) << (-22890 & 16) | (10495 & 511 & arrby[n]) << (10365 & -15464);
    }
}

