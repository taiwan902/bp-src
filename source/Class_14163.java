/*
 * Decompiled with CFR 0.145.
 */
import java.awt.Point;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_14163 {
    private Point[] Field_14164;
    private int Field_14165;

    Point Method_14166() {
        int n = this.Field_14165;
        this.Field_14165 = n + (17411 & 6449);
        return this.Field_14164[n];
    }

    private void Method_14167() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    int Method_14168() {
        return this.Field_14165;
    }

    Class_14163(int n) {
        this.Field_14164 = new Point[n];
        int n2 = 2692 & 16411;
        int n3 = 4353 & 24700;
        int n4 = 18176 & 8218;
        int n5 = 4242 & -24312;
        int n6 = 19494 & 512;
        this.Field_14164[4100 & 24864] = new Point(n2, n3);
        for (int i = 25129 & -31661; i < n; ++i) {
            switch (n4) {
                case 0: {
                    --n3;
                    break;
                }
                case 1: {
                    ++n2;
                    break;
                }
                case 2: {
                    ++n3;
                    break;
                }
                case 3: {
                    --n2;
                }
            }
            if (++n5 > n6) {
                n4 = n4 + (-22895 & 1) & (12419 & 18691);
                n5 = 4880 & 3244;
                if (n4 == 0 || n4 == (-4094 & 3203)) {
                    ++n6;
                }
            }
            this.Field_14164[i] = new Point(n2, n3);
        }
    }

    void Method_14169() {
        this.Field_14165 = 24769 & 4868;
    }
}

