/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_13180 {
    protected int Field_13181;
    protected final Class_283 Field_13182;
    protected final Class_24997 Field_13183;
    protected int Field_13184;
    public Class_6176[] Field_13185;
    protected int Field_13186;

    public void Method_13187() {
        Class_6176[] arrclass_6176 = this.Field_13185;
        int n = arrclass_6176.length;
        for (int i = -32088 & 273; i < n; ++i) {
            Class_6176 class_6176 = arrclass_6176[i];
            class_6176.Method_6222();
        }
    }

    public Class_6176 Method_13188(Class_4751 class_4751) {
        return this.Method_13194(class_4751.\u0000= final(), class_4751.\u0000, `(), class_4751.\u0000strictfp());
    }

    public void Method_13189(int n, int n2, int n3, int n4, int n5, int n6) {
        int n7 = Class_13337.Method_13361(n, -27566 & 8368);
        int n8 = Class_13337.Method_13361(n2, 209 & 2356);
        int n9 = Class_13337.Method_13361(n3, 80 & 17458);
        int n10 = Class_13337.Method_13361(n4, 24723 & 316);
        int n11 = Class_13337.Method_13361(n5, 12441 & 784);
        int n12 = Class_13337.Method_13361(n6, 4188 & -29134);
        for (int i = n7; i <= n10; ++i) {
            int n13 = i % this.Field_13184;
            if (n13 < 0) {
                n13 += this.Field_13184;
            }
            for (int j = n8; j <= n11; ++j) {
                int n14 = j % this.Field_13181;
                if (n14 < 0) {
                    n14 += this.Field_13181;
                }
                for (int k = n9; k <= n12; ++k) {
                    int n15 = k % this.Field_13186;
                    if (n15 < 0) {
                        n15 += this.Field_13186;
                    }
                    int n16 = (n15 * this.Field_13181 + n14) * this.Field_13184 + n13;
                    Class_6176 class_6176 = this.Field_13185[n16];
                    class_6176.Method_6221((4197 & -24063) != 0);
                }
            }
        }
    }

    protected void Method_13190(int n) {
        int n2;
        this.Field_13184 = n2 = n * (24614 & 2050) + (1411 & 69);
        this.Field_13181 = 4116 & -4592;
        this.Field_13186 = n2;
    }

    private void Method_13191() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected void Method_13192(Class_10288 class_10288) {
        int n = this.Field_13184 * this.Field_13181 * this.Field_13186;
        this.Field_13185 = new Class_6176[n];
        int n2 = 1168 & 2058;
        for (int i = 16385 & 420; i < this.Field_13184; ++i) {
            for (int j = -32736 & 18564; j < this.Field_13181; ++j) {
                for (int k = 19728 & 8193; k < this.Field_13186; ++k) {
                    int n3 = (k * this.Field_13181 + j) * this.Field_13184 + i;
                    Class_4751 class_4751 = new Class_4751(i * (-15856 & 2128), j * (4145 & -30184), k * (16664 & -28496));
                    this.Field_13185[n3] = class_10288.Method_10289(this.Field_13182, this.Field_13183, class_4751, n2++);
                }
            }
        }
    }

    public void Method_13193(double d, double d2) {
        int n = Class_13337.Method_13371(d) - (2120 & 21016);
        int n2 = Class_13337.Method_13371(d2) - (74 & 6152);
        int n3 = this.Field_13184 * (210 & -29135);
        Class_4810 class_4810 = new Class_4810();
        for (int i = 12546 & 16404; i < this.Field_13184; ++i) {
            int n4 = this.Method_13195(n, n3, i);
            for (int j = -31616 & 2915; j < this.Field_13186; ++j) {
                int n5 = this.Method_13195(n2, n3, j);
                for (int k = 4096 & -16346; k < this.Field_13181; ++k) {
                    int n6 = k * (8240 & 2775);
                    Class_6176 class_6176 = this.Field_13185[(j * this.Field_13181 + k) * this.Field_13184 + i];
                    class_4810.Method_4816(n4, n6, n5);
                    if (class_4810.equals(class_6176.Method_6226())) continue;
                    class_6176.Method_6228(new Class_4751(n4, n6, n5));
                }
            }
        }
    }

    protected Class_6176 Method_13194(int n, int n2, int n3) {
        int n4 = Class_13337.Method_13361(n, 8277 & -26094);
        int n5 = Class_13337.Method_13361(n2, 120 & -23534);
        int n6 = Class_13337.Method_13361(n3, 4144 & 9363);
        if (n5 >= 0 && n5 < this.Field_13181) {
            if ((n4 %= this.Field_13184) < 0) {
                n4 += this.Field_13184;
            }
            if ((n6 %= this.Field_13186) < 0) {
                n6 += this.Field_13186;
            }
            int n7 = (n6 * this.Field_13181 + n5) * this.Field_13184 + n4;
            return this.Field_13185[n7];
        }
        return null;
    }

    public Class_13180(Class_283 class_283, int n, Class_24997 class_24997, Class_10288 class_10288) {
        this.Field_13183 = class_24997;
        this.Field_13182 = class_283;
        this.Method_13190(n);
        this.Method_13192(class_10288);
    }

    private int Method_13195(int n, int n2, int n3) {
        int n4 = n3 * (16530 & 2832);
        int n5 = n4 - n + n2 / (779 & 9442);
        if (n5 < 0) {
            n5 -= n2 - (5125 & 209);
        }
        return n4 - n5 / n2 * n2;
    }
}

