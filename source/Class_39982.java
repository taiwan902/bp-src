/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Random;

public class Class_39982
extends Class_37650 {
    private int Field_39983;

    public Class_39982() {
    }

    public boolean Method_39984(Class_283 class_283, Random random, Class_42666 class_42666) {
        int n;
        int n2;
        int n3;
        Random random2 = new Random(this.Field_39983);
        for (n = 4 & -12287; n <= (1029 & 10380); ++n) {
            for (n2 = -28141 & 8199; n2 <= (292 & 3724); ++n2) {
                n3 = random2.nextInt(12296 & 3231);
                this.\u0000strictfp(class_283, class_42666, n, n2, 12304 & -13952, n, n2, n3, (Class_3436)Class_9265.Field_9450.Method_3293(), (Class_3436)Class_9265.Field_9450.Method_3293(), (8597 & 3650) != 0);
            }
        }
        n = random2.nextInt(30732 & 1176);
        this.\u0000strictfp(class_283, class_42666, 10546 & 513, 8317 & 2695, -28651 & 640, 280 & 28674, 12293 & 517, n, (Class_3436)Class_9265.Field_9450.Method_3293(), (Class_3436)Class_9265.Field_9450.Method_3293(), (49 & -31606) != 0);
        n = random2.nextInt(20488 & -30950);
        this.\u0000strictfp(class_283, class_42666, 516 & -13227, -24537 & 17941, -30439 & 6, -27898 & 2101, 26711 & -32635, n, (Class_3436)Class_9265.Field_9450.Method_3293(), (Class_3436)Class_9265.Field_9450.Method_3293(), (257 & 3200) != 0);
        for (n = 2600 & 5440; n <= (-24316 & 2572); ++n) {
            n2 = random2.nextInt(-31723 & 6725);
            this.\u0000strictfp(class_283, class_42666, n, 17686 & -17853, 1168 & 8238, n, 11394 & 4354, n2, (Class_3436)Class_9265.Field_9450.Method_3293(), (Class_3436)Class_9265.Field_9450.Method_3293(), (32 & 8337) != 0);
        }
        for (n = -32200 & 71; n <= (4110 & 133); ++n) {
            for (n2 = -24512 & 21634; n2 <= (13389 & -30303); ++n2) {
                n3 = random2.nextInt(-22521 & 771);
                this.\u0000strictfp(class_283, class_42666, n, n2, 2049 & 256, n, n2, n3, (Class_3436)Class_9265.Field_9450.Method_3293(), (Class_3436)Class_9265.Field_9450.Method_3293(), (121 & -32512) != 0);
            }
        }
        return (525 & 14753) != 0;
    }

    protected void Method_39985(Class_1699 class_1699) {
        super.Method_37658(class_1699);
        class_1699.Method_1739("Seed", this.Field_39983);
    }

    public static Class_39982 Method_39986(List list, Random random, int n, int n2, int n3, Class_4595 class_4595, int n4) {
        Class_42666 class_42666 = Class_42666.Method_42682(n, n2, n3, -1 & -1, -3 & -3, 2691 & 16396, 557 & 6485, 30 & 2058, 16924 & 1193, class_4595);
        return Class_39982.\u0000strictfp((Class_42666)class_42666) && Class_13400.Method_13426(list, class_42666) == null ? new Class_39982(n4, random, class_42666, class_4595) : null;
    }

    private void Method_39987() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected void Method_39988(Class_1699 class_1699) {
        super.Method_37660(class_1699);
        this.Field_39983 = class_1699.Method_1738("Seed");
    }

    public Class_39982(int n, Random random, Class_42666 class_42666, Class_4595 class_4595) {
        super(n);
        this.\u0000strictfp = class_4595;
        this.\u0000strictfp = class_42666;
        this.Field_39983 = random.nextInt();
    }
}

