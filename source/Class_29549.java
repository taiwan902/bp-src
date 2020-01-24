/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_29549
extends Class_17281 {
    private int Field_29550 = this.Field_29552;
    private Class_4291 Field_29551 = new Class_37552(Class_9265.Field_9384.Method_3293().Method_3685(Class_25738.Field_25739, (Comparable)((Object)Class_30961.Field_30965)), -30583 & 8201);
    private int Field_29552 = 577 & -20336;
    private int Field_29553 = -32315 & 15379;
    private int Field_29554 = -32246 & 8194;
    private Class_4363 Field_29555 = new Class_4363((8257 & 562) != 0);

    private void Method_29556() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected Class_29549(int n, boolean bl) {
        super(n);
        if (bl) {
            this.\u0000strictfp.Field_15901 = -7913 & 651;
            this.Field_29550 = this.Field_29553;
        }
    }

    public void Method_29557(Class_283 class_283, Random random, Class_4751 class_4751) {
        int n;
        int n2;
        int n3;
        super.Method_17368(class_283, random, class_4751);
        int n4 = (25699 & 2335) + random.nextInt(31110 & -31738);
        for (n = 1236 & -13813; n < n4; ++n) {
            int n5;
            n2 = random.nextInt(1297 & 4154);
            Class_4751 class_47512 = class_4751.Method_4791(n2, n3 = random.nextInt(17469 & -32546) + (532 & -16057), n5 = random.nextInt(177 & 11280));
            if (class_283.Method_375(class_47512).Method_3442() != Class_9265.Field_9446) continue;
            class_283.Method_462(class_47512, Class_9265.Field_9327.Method_3293(), -31602 & 4355);
        }
        for (n4 = -30720 & 4230; n4 < (-19769 & 19479); ++n4) {
            n = random.nextInt(6161 & 17500);
            n2 = random.nextInt(16449 & 13378);
            n3 = random.nextInt(18453 & 9872);
            this.Field_29551.Method_4296(class_283, random, class_4751.Method_4791(n, n2, n3));
        }
    }

    public Class_4286 Method_29558(Random random) {
        return random.nextInt(-16381 & 2211) > 0 ? this.Field_29555 : super.Method_17442(random);
    }

    protected Class_17281 Method_29559(int n) {
        return new Class_29549(n, (12168 & 4100) != 0).Method_29560(this);
    }

    private Class_29549 Method_29560(Class_17281 class_17281) {
        this.Field_29550 = this.Field_29554;
        this.\u0000strictfp(class_17281.Field_17348, (3207 & 8513) != 0);
        this.\u0000strictfp(class_17281.Field_17355 + " M");
        this.\u0000strictfp(new Class_6335(class_17281.Field_17316, class_17281.Field_17302));
        this.\u0000strictfp(class_17281.Field_17300, class_17281.Field_17292);
        return this;
    }

    public void Method_29561(Class_283 class_283, Random random, Class_36425 class_36425, int n, int n2, double d) {
        this.\u0000strictfp = Class_9265.Field_9319.\u0000strictfp();
        this.\u0000, ` = Class_9265.Field_9272.Method_3293();
        if ((d < 0.08695652173913043 * -11.5 || d > 0.4313725490196078 * 4.636363636363637) && this.Field_29550 == this.Field_29554) {
            this.\u0000strictfp = Class_9265.Field_9360.Method_3293();
            this.\u0000, ` = Class_9265.Field_9360.Method_3293();
        } else if (d > 1.0 && this.Field_29550 != this.Field_29553) {
            this.\u0000strictfp = Class_9265.Field_9446.Method_3293();
            this.\u0000, ` = Class_9265.Field_9446.Method_3293();
        }
        this.\u0000, `(class_283, random, class_36425, n, n2, d);
    }
}

