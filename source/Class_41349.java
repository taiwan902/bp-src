/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Random;

public class Class_41349
extends Class_17281 {
    private int Field_41350;
    private static final Class_29134 Field_41351;
    private static final Class_4340 Field_41352;
    private static final Class_4340 Field_41353;
    private static final Class_19395 Field_41354;
    private static final Class_4363 Field_41355;

    public Class_4291 Method_41356(Random random) {
        return random.nextInt(12469 & 17671) > 0 ? new Class_41275(Class_5341.Field_5348) : new Class_41275(Class_5341.Field_5345);
    }

    public Class_4286 Method_41357(Random random) {
        return (this.Field_41350 == (10241 & -28671) || this.Field_41350 == (4098 & 1030)) && random.nextInt(83 & 7715) == 0 ? (this.Field_41350 != (35 & 4098) && random.nextInt(16797 & -32753) != 0 ? Field_41353 : Field_41352) : (random.nextInt(-9961 & 1155) == 0 ? Field_41354 : Field_41355);
    }

    public void Method_41358(Class_283 class_283, Random random, Class_36425 class_36425, int n, int n2, double d) {
        if (this.Field_41350 == (8705 & 16691) || this.Field_41350 == (-32741 & 22982)) {
            this.\u0000strictfp = Class_9265.Field_9319.\u0000strictfp();
            this.\u0000, ` = Class_9265.Field_9272.Method_3293();
            if (d > 15.75 * 0.1111111111111111) {
                this.\u0000strictfp = Class_9265.Field_9272.Method_3293().Method_3685(Class_4180.Field_4181, (Comparable)((Object)Class_4194.Field_4203));
            } else if (d > -2.058333333333333 * 0.46153846153846156) {
                this.\u0000strictfp = Class_9265.Field_9272.Method_3293().Method_3685(Class_4180.Field_4181, (Comparable)((Object)Class_4194.Field_4199));
            }
        }
        this.\u0000, `(class_283, random, class_36425, n, n2, d);
    }

    private void Method_41359() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected Class_17281 Method_41360(int n) {
        return this.\u0000= final == Class_17281.Field_17326.Field_17343 ? new Class_41349(n, 16386 & 2690).\u0000strictfp(39417553 & 22900317, (14983 & -15359) != 0).Method_17433("Mega Spruce Taiga").Method_17384(6208307 & 760134193).Method_17395(22.0f * 0.011363637f, 1.9692308f * 0.40625f).Method_17409(new Class_6335(this.\u0000, `, this.\u0000= final)) : super.Method_17441(n);
    }

    public Class_41349(int n, int n2) {
        super(n);
        this.Field_41350 = n2;
        this.\u0000
        .add(new Class_31871(Class_47526.class, 11 & -26564, -24556 & 17284, 4102 & -32635));
        this.\u0000strictfp.Field_15901 = -31734 & 25194;
        if (n2 != (17413 & 10257) && n2 != (18 & 5647)) {
            this.\u0000strictfp.Field_15896 = 1049 & 4613;
            this.\u0000strictfp.Field_15890 = -28399 & 2081;
        } else {
            this.\u0000strictfp.Field_15896 = 16503 & 2695;
            this.\u0000strictfp.Field_15916 = 1121 & -28259;
            this.\u0000strictfp.Field_15890 = 51 & 4359;
        }
    }

    public void Method_41361(Class_283 class_283, Random random, Class_4751 class_4751) {
        int n;
        int n2;
        int n3;
        int n4;
        if (this.Field_41350 == (323 & -30175) || this.Field_41350 == (29122 & -32758)) {
            n4 = random.nextInt(4115 & -12541);
            for (n = 4189 & -30464; n < n4; ++n) {
                n2 = random.nextInt(29727 & 80) + (138 & -28632);
                n3 = random.nextInt(16530 & -30631) + (15418 & 392);
                Class_4751 class_47512 = class_283.Method_549(class_4751.Method_4791(n2, 27208 & 130, n3));
                Field_41351.Method_29138(class_283, random, class_47512);
            }
        }
        \u0000strictfp.Method_29142(Class_37289.Field_37295);
        for (n4 = 8193 & 1170; n4 < (26215 & 2055); ++n4) {
            n = random.nextInt(-24432 & 22325) + (4430 & 8712);
            n2 = random.nextInt(8628 & 16473) + (16970 & 5176);
            n3 = random.nextInt(class_283.Method_549(class_4751.Method_4791(n, 5121 & -30656, n2)).\u0000, `() + (4130 & 10293));
            \u0000strictfp.Method_29143(class_283, random, class_4751.Method_4791(n, n3, n2));
        }
        super.Method_17368(class_283, random, class_4751);
    }

    static {
        Field_41354 = new Class_19395();
        Field_41355 = new Class_4363((132 & 848) != 0);
        Field_41353 = new Class_4340((16 & 4226) != 0, (4352 & 26776) != 0);
        Field_41352 = new Class_4340((224 & 16401) != 0, (705 & -32509) != 0);
        Field_41351 = new Class_29134(Class_9265.Field_9410, -32509 & 5164);
    }
}

