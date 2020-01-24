/*
 * Decompiled with CFR 0.145.
 */
import java.io.IOException;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Arrays;
import java.util.Random;

public class Class_8653 {
    private static Class_18343 Field_8654;
    public final int Field_8655;
    private static Class_17281[] Field_8656;
    private static Class_283 Field_8657;
    protected int[] Field_8658 = new int[8450 & 1804];
    protected boolean Field_8659;
    protected float[] Field_8660 = new float[8629 & 17728];
    protected int[] Field_8661 = new int[-18175 & 256];
    private static Class_31916 Field_8662;
    private static final Class_38196 Field_8663;
    private int Field_8664;
    public final int Field_8665;
    private int Field_8666 = Field_8663.Method_38387();
    protected int[] Field_8667 = new int[2304 & -28362];
    protected int[] Field_8668 = new int[320 & 24854];
    private boolean Field_8669 = 1281 & 2123;
    private Class_17665 Field_8670;
    protected Class_17281[] Field_8671 = Field_8656;
    protected boolean Field_8672;
    private int Field_8673 = Field_8663.Method_38387();
    private static Class_18 Field_8674;
    protected int[] Field_8675 = new int[384 & 11036];
    private static final Class_8653[] Field_8676;
    private static long Field_8677;
    private boolean Field_8678;
    private static Class_12166 Field_8679;
    private int Field_8680 = Field_8663.Method_38387();
    private boolean Field_8681;
    protected int[] Field_8682 = new int[-31868 & 8499];
    private static Class_15769 Field_8683;
    private int Field_8684 = Field_8663.Method_38387();

    protected static void Method_8685() {
        int n = Field_8676.length;
        for (int i = -13312 & 4260; i < n; ++i) {
            Class_8653 class_8653 = Field_8676[i];
            if (class_8653 == null) continue;
            class_8653.Field_8672 = 4129 & -15805;
        }
    }

    private void Method_8686() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private void Method_8687() {
        int n;
        int n2;
        int n3;
        if (this.Field_8670 != null) {
            byte[] arrby = this.Field_8670.Method_17743();
            this.Field_8671 = Arrays.copyOf(this.Field_8671, -24266 & 456);
            for (n2 = -31726 & 4137; n2 < (1290 & -32415); ++n2) {
                n3 = arrby[n2] & (255 & 3327);
                if (n3 == (17919 & 2815)) {
                    this.Field_8672 = -31739 & 1;
                    return;
                }
                Class_17281 class_17281 = Class_17281.Method_17425()[n3];
                this.Field_8671[n2] = class_17281 == null ? Class_17281.Field_17318 : class_17281;
            }
        }
        this.Field_8672 = 4134 & 18048;
        for (n = 4372 & -23357; n < (8576 & 6438); ++n) {
            Class_17281 class_17281 = this.Field_8671[n];
            this.Field_8667[n] = class_17281.Field_17320;
            n3 = this.Field_8665 * (1169 & 4124) + (n & (-32113 & 21519));
            int n4 = this.Field_8655 * (24982 & 601) + (n >> (582 & -13300));
            this.Field_8661[n] = class_17281.Method_17403(new Class_4751(n3, -25522 & 24896, n4));
            this.Field_8658[n] = class_17281.Method_17379(new Class_4751(n3, 18754 & -32184, n4));
        }
        for (n = -1 & -1; n <= (27420 & 1203); ++n) {
            for (n2 = -1 & -1; n2 <= (2366 & -27440); ++n2) {
                this.Method_8694(n2, n);
            }
        }
    }

    private static String Method_8688(String string) {
        int n = 25164;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_8653.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    protected void Method_8689(int n, int n2, float f) {
        this.Field_8660[n2 << (5892 & -32700) | n] = f;
    }

    private static String Method_8690(String string) {
        int n = 1123;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_8653.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static Class_15769 Method_8691(Class_20715 class_20715) {
        return null;
    }

    static {
        Field_8656 = new Class_17281[486 & 26376];
        Arrays.fill(Field_8656, Class_17281.Field_17318);
        if (Class_8653.Method_8688("\u0240").equals(Class_8653.Method_8690("\uae0e"))) {
            Class_8653.Method_8691(null);
        }
        Field_8663 = Class_38196.Field_38285;
        Field_8676 = new Class_8653[17417 & 1280];
    }

    private static int Method_8692(int n, int n2) {
        return (n2 & (-24161 & 4127)) << (-13305 & 5) | n & (4479 & 8223);
    }

    protected static Class_8653 Method_8693(int n, int n2) {
        int n3 = Class_8653.Method_8692(n, n2);
        Class_8653 class_8653 = Field_8676[n3];
        return class_8653 != null && class_8653.Method_8701(n, n2) ? class_8653 : new Class_8653(n, n2);
    }

    private void Method_8694(int n, int n2) {
        int n3 = n & (2383 & -16209) | (n2 & (16751 & 12303)) << (77 & 1028);
        Class_8653 class_8653 = Class_8653.Method_8698((n += this.Field_8665 << (4292 & -32498)) >> (13334 & 16388), (n2 += this.Field_8655 << (4340 & 17413)) >> (21860 & 4));
        if (class_8653 != null) {
            int n4 = -32214 & 4112;
            int n5 = -32734 & 5193;
            int n6 = 240 & 5642;
            int n7 = 8196 & 232;
            int n8 = 416 & 9224;
            int n9 = 1284 & 2560;
            int n10 = -32093 & 10504;
            int n11 = 165 & 12112;
            int n12 = 13923 & 2076;
            int n13 = -32730 & 30721;
            for (int i = n2 - (663 & 7433); i <= n2 + (8193 & 5643); ++i) {
                for (int j = n - (-30079 & 7); j <= n + (28769 & 385); ++j) {
                    Class_8653 class_86532 = Class_8653.Method_8698(j >> (141 & 4420), i >> (17932 & 4196));
                    if (class_86532 == null || class_86532.Field_8671 == null) continue;
                    int n14 = j & (25103 & -26193) | (i & (2063 & -16353)) << (-7932 & 2054);
                    int n15 = class_86532.Field_8661[n14];
                    n5 += n15 >> (13362 & 16404) & (16895 & 10495);
                    n6 += n15 >> (9 & 5400) & (-14081 & 4607);
                    n7 += n15 & (2815 & -6657);
                    int n16 = class_86532.Field_8658[n14];
                    n8 += n16 >> (10513 & 1684) & (255 & 22783);
                    n9 += n16 >> (19337 & -24486) & (7423 & -32513);
                    n10 += n16 & (511 & -23809);
                    int n17 = class_86532.Field_8667[n14];
                    n11 += n17 >> (-30696 & 177) & (17919 & 8447);
                    n12 += n17 >> (7244 & -32328) & (-28161 & 255);
                    n13 += n17 & (13055 & -32513);
                    ++n4;
                }
            }
            class_8653.Field_8675[n3] = (n5 / n4 & (16639 & 767)) << (18450 & 9752) | (n6 / n4 & (255 & 2815)) << (-15542 & 9256) | n7 / n4 & (255 & 4863);
            class_8653.Field_8668[n3] = (n8 / n4 & (20735 & 1023)) << (10256 & 17968) | (n9 / n4 & (4351 & -13825)) << (-32136 & 9612) | n10 / n4 & (2047 & -7937);
            class_8653.Field_8682[n3] = (n11 / n4 & (3839 & -16129)) << (2328 & 8245) | (n12 / n4 & (-15617 & 5631)) << (4120 & 19976) | n13 / n4 & (767 & 8447);
        }
    }

    protected float Method_8695(int n, int n2) {
        return this.Field_8660[n2 << (17476 & -28540) | n];
    }

    protected boolean Method_8696(boolean bl) {
        int n = 376 & 25732;
        int n2 = Field_8663.Method_38387();
        Class_15769 class_15769 = bl ? Field_8683 : null;
        Class_17665 class_17665 = this.Field_8670;
        if (this.Field_8673 - n2 <= 0) {
            this.Field_8673 = n2 + (-31171 & 2366);
            if (Field_8679.Method_12175(this.Field_8665, this.Field_8655)) {
                this.Field_8670 = Field_8679.Method_12174(this.Field_8665, this.Field_8655);
                this.Field_8669 = 10289 & -16119;
            } else if (this.Field_8670 == null && class_15769 != null && this.Field_8669) {
                try {
                    this.Field_8670 = class_15769.Method_15773(Field_8657, this.Field_8665, this.Field_8655);
                }
                catch (IOException iOException) {
                    iOException.printStackTrace();
                }
                this.Field_8669 = this.Field_8670 != null ? 3 & -32543 : 2049 & 28932;
                n = 8965 & 1129;
            } else {
                this.Field_8673 = n2 + (15 & 327);
            }
        }
        if (this.Field_8670 == null) {
            this.Field_8670 = class_17665;
        }
        if (this.Field_8670 != class_17665 || this.Field_8672) {
            this.Method_8687();
            this.Field_8681 = -23249 & 16513;
        }
        if (this.Field_8670 != null) {
            if (this.Field_8670 instanceof Class_16269) {
                Class_16269 class_16269 = (Class_16269)((Object)this.Field_8670);
                if (this.Field_8664 != class_16269.Method_16270()) {
                    this.Field_8664 = class_16269.Method_16270();
                    this.Field_8681 = 301 & -32575;
                }
            } else if (this.Field_8678 != this.Field_8670.Field_17667 || this.Field_8678 && n2 - this.Field_8680 >= (2190 & 21290)) {
                this.Field_8678 = this.Field_8670.Field_17667;
                this.Field_8681 = 2309 & -27007;
            }
        }
        return n != 0;
    }

    public Class_17665 Method_8697() {
        return this.Field_8670;
    }

    public static Class_8653 Method_8698(int n, int n2) {
        int n3 = Class_8653.Method_8692(n, n2);
        Class_8653 class_8653 = Field_8676[n3];
        return class_8653 != null && class_8653.Method_8701(n, n2) ? class_8653 : null;
    }

    public static Class_15769 Method_8699(Class_12166 class_12166) {
        return null;
    }

    protected static void Method_8700() {
        try {
            Class_2651[] arrclass_2651;
            Arrays.fill(Field_8676, null);
            Field_8674 = Field_8663.Method_38402();
            Field_8657 = Field_8663.Method_38438();
            Field_8677 = 444517686518612992L & -444517687167215548L;
            if (Class_18.Field_89.Method_180() != null && (arrclass_2651 = Class_18.Field_89.Method_180().\u0000strictfp) != null && arrclass_2651.length >= (4379 & 18049)) {
                Field_8677 = arrclass_2651[10572 & -32208].\u0000strictfp();
            }
            Field_8654 = Class_8653.Field_8657.Field_284;
            Field_8662 = Field_8657.Method_371();
            Field_8679 = Field_8657.Method_478();
            Field_8683 = Class_8653.Method_8699(Field_8679);
        }
        catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    public final boolean Method_8701(int n, int n2) {
        return (n == this.Field_8665 && n2 == this.Field_8655 ? 17857 & 4123 : 129 & 26368) != 0;
    }

    private Class_8653(int n, int n2) {
        this.Field_8665 = n;
        this.Field_8655 = n2;
        this.Field_8659 = Field_8677 != (370294944L & -1763441564459203063L) && new Random(Field_8677 + (long)(this.Field_8665 * this.Field_8665 * (-1337140906 & 1246567822)) + (long)(this.Field_8665 * (73056731 & 461109979)) + (long)(this.Field_8655 * this.Field_8655) * (4427695L & 1087063991L) + (long)(this.Field_8655 * (247984719 & 3537503)) ^ -4239263993625455905L & 4239263994612680575L).nextInt(16522 & 7503) == 0 ? 1313 & 10383 : 7169 & -15742;
    }
}

