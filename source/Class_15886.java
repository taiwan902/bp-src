/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_15886 {
    protected Class_4291 Field_15887 = new Class_5693();
    protected Class_4291 Field_15888;
    protected Class_4291 Field_15889 = new Class_31123(Class_9265.Field_9360, -32746 & 1478);
    protected int Field_15890;
    protected int Field_15891 = 19587 & 8818;
    protected int Field_15892 = 51 & 28617;
    protected Class_4291 Field_15893;
    protected int Field_15894;
    protected int Field_15895 = 5 & 20643;
    protected int Field_15896 = 595 & -31743;
    protected int Field_15897;
    protected Class_4751 Field_15898;
    protected Class_4291 Field_15899 = new Class_37616(Class_9265.Field_9429);
    protected Class_4291 Field_15900;
    protected int Field_15901;
    protected Class_4291 Field_15902;
    protected int Field_15903 = 16451 & 8255;
    protected Class_4291 Field_15904;
    protected Class_4291 Field_15905 = new Class_37616(Class_9265.Field_9312);
    protected Class_4291 Field_15906;
    protected Class_4291 Field_15907 = new Class_33533(19220 & 13);
    protected Class_4291 Field_15908 = new Class_46143();
    protected int Field_15909;
    protected Random Field_15910;
    protected Class_19225 Field_15911;
    protected Class_4291 Field_15912;
    protected Class_4291 Field_15913;
    protected Class_4291 Field_15914 = new Class_29427();
    protected Class_4291 Field_15915 = new Class_44334();
    protected int Field_15916;
    protected Class_4291 Field_15917;
    protected Class_283 Field_15918;
    protected Class_4291 Field_15919 = new Class_31123(Class_9265.Field_9394, -16121 & 647);
    public boolean Field_15920 = 137 & 11111;
    protected Class_4291 Field_15921;
    protected Class_29123 Field_15922 = new Class_29123(Class_9265.Field_9353, Class_5607.Field_5615);
    protected int Field_15923;
    protected Class_4291 Field_15924;

    protected void Method_15925(int n, Class_4291 class_4291, int n2, int n3) {
        for (int i = 1024 & 2826; i < n; ++i) {
            Class_4751 class_4751 = this.Field_15898.Method_4791(this.Field_15910.nextInt(1044 & -25799), this.Field_15910.nextInt(n3) + this.Field_15910.nextInt(n3) + n2 - n3, this.Field_15910.nextInt(20764 & 530));
            class_4291.Method_4296(this.Field_15918, this.Field_15910, class_4751);
        }
    }

    public void Method_15926(Class_283 class_283, Random random, Class_17281 class_17281, Class_4751 class_4751) {
        if (this.Field_15918 != null) {
            throw new RuntimeException("Already decorating");
        }
        this.Field_15918 = class_283;
        String string = class_283.Method_386().Method_31778();
        this.Field_15911 = string != null ? Class_25402.Method_25487(string).Method_25488() : Class_25402.Method_25487("").Method_25488();
        this.Field_15910 = random;
        this.Field_15898 = class_4751;
        this.Field_15924 = new Class_37552(Class_9265.Field_9272.Method_3293(), this.Field_15911.Field_19274);
        this.Field_15912 = new Class_37552(Class_9265.Field_9360.Method_3293(), this.Field_15911.Field_19295);
        this.Field_15893 = new Class_37552(Class_9265.Field_9446.Method_3293().Method_3685(Class_3903.Field_3904, (Comparable)((Object)Class_3915.Field_3925)), this.Field_15911.Field_19236);
        this.Field_15904 = new Class_37552(Class_9265.Field_9446.Method_3293().Method_3685(Class_3903.Field_3904, (Comparable)((Object)Class_3915.Field_3916)), this.Field_15911.Field_19280);
        this.Field_15902 = new Class_37552(Class_9265.Field_9446.Method_3293().Method_3685(Class_3903.Field_3904, (Comparable)((Object)Class_3915.Field_3924)), this.Field_15911.Field_19298);
        this.Field_15900 = new Class_37552(Class_9265.Field_9268.Method_3293(), this.Field_15911.Field_19278);
        this.Field_15906 = new Class_37552(Class_9265.Field_9333.Method_3293(), this.Field_15911.Field_19231);
        this.Field_15913 = new Class_37552(Class_9265.Field_9444.Method_3293(), this.Field_15911.Field_19275);
        this.Field_15888 = new Class_37552(Class_9265.Field_9305.Method_3293(), this.Field_15911.Field_19256);
        this.Field_15921 = new Class_37552(Class_9265.Field_9287.Method_3293(), this.Field_15911.Field_19254);
        this.Field_15917 = new Class_37552(Class_9265.Field_9332.Method_3293(), this.Field_15911.Field_19227);
        this.Method_15929(class_17281);
        this.Field_15918 = null;
        this.Field_15910 = null;
    }

    protected void Method_15927() {
        this.Method_15928(this.Field_15911.Field_19232, this.Field_15924, this.Field_15911.Field_19250, this.Field_15911.Field_19234);
        this.Method_15928(this.Field_15911.Field_19291, this.Field_15912, this.Field_15911.Field_19229, this.Field_15911.Field_19282);
        this.Method_15928(this.Field_15911.Field_19288, this.Field_15904, this.Field_15911.Field_19271, this.Field_15911.Field_19279);
        this.Method_15928(this.Field_15911.Field_19293, this.Field_15893, this.Field_15911.Field_19245, this.Field_15911.Field_19244);
        this.Method_15928(this.Field_15911.Field_19239, this.Field_15902, this.Field_15911.Field_19281, this.Field_15911.Field_19302);
        this.Method_15928(this.Field_15911.Field_19247, this.Field_15900, this.Field_15911.Field_19230, this.Field_15911.Field_19296);
        this.Method_15928(this.Field_15911.Field_19259, this.Field_15906, this.Field_15911.Field_19289, this.Field_15911.Field_19253);
        this.Method_15928(this.Field_15911.Field_19260, this.Field_15913, this.Field_15911.Field_19233, this.Field_15911.Field_19287);
        this.Method_15928(this.Field_15911.Field_19297, this.Field_15888, this.Field_15911.Field_19267, this.Field_15911.Field_19283);
        this.Method_15928(this.Field_15911.Field_19299, this.Field_15921, this.Field_15911.Field_19292, this.Field_15911.Field_19290);
        this.Method_15925(this.Field_15911.Field_19262, this.Field_15917, this.Field_15911.Field_19269, this.Field_15911.Field_19294);
    }

    protected void Method_15928(int n, Class_4291 class_4291, int n2, int n3) {
        int n4;
        if (n3 < n2) {
            n4 = n2;
            n2 = n3;
            n3 = n4;
        } else if (n3 == n2) {
            if (n2 < (-31489 & 10495)) {
                ++n3;
            } else {
                --n2;
            }
        }
        for (n4 = -23248 & 18570; n4 < n; ++n4) {
            Class_4751 class_4751 = this.Field_15898.Method_4791(this.Field_15910.nextInt(-32744 & 18455), this.Field_15910.nextInt(n3 - n2) + n2, this.Field_15910.nextInt(-24528 & 16468));
            class_4291.Method_4296(this.Field_15918, this.Field_15910, class_4751);
        }
    }

    protected void Method_15929(Class_17281 class_17281) {
        Object object;
        Object object2;
        Object object3;
        int n;
        int n2;
        int n3;
        int n4;
        Class_4751 class_4751;
        this.Method_15927();
        for (n4 = 32334 & 288; n4 < this.Field_15903; ++n4) {
            n3 = this.Field_15910.nextInt(-32746 & 11353) + (1048 & 24584);
            n = this.Field_15910.nextInt(9246 & 2096) + (16396 & 8264);
            this.Field_15919.Method_4296(this.Field_15918, this.Field_15910, this.Field_15918.Method_406(this.Field_15898.Method_4791(n3, 1122 & -22371, n)));
        }
        for (n4 = 2120 & 16423; n4 < this.Field_15892; ++n4) {
            n3 = this.Field_15910.nextInt(7315 & -31976) + (-30692 & 12297);
            n = this.Field_15910.nextInt(30812 & 1586) + (-32184 & 13593);
            this.Field_15907.Method_4296(this.Field_15918, this.Field_15910, this.Field_15918.Method_406(this.Field_15898.Method_4791(n3, -16254 & 5184, n)));
        }
        for (n4 = -15680 & 48; n4 < this.Field_15895; ++n4) {
            n3 = this.Field_15910.nextInt(5777 & 2096) + (8713 & 8);
            n = this.Field_15910.nextInt(91 & 23188) + (520 & 6411);
            this.Field_15889.Method_4296(this.Field_15918, this.Field_15910, this.Field_15918.Method_406(this.Field_15898.Method_4791(n3, -32624 & 11009, n)));
        }
        n4 = this.Field_15901;
        if (this.Field_15910.nextInt(-32630 & 18730) == 0) {
            ++n4;
        }
        for (n3 = 17029 & 5392; n3 < n4; ++n3) {
            n = this.Field_15910.nextInt(-32680 & 20880) + (16409 & 1324);
            n2 = this.Field_15910.nextInt(23985 & 24) + (12315 & -16376);
            object2 = class_17281.Method_17442(this.Field_15910);
            object2.\u0000, `();
            class_4751 = this.Field_15918.Method_549(this.Field_15898.Method_4791(n, 3153 & 8324, n2));
            if (!object2.\u0000strictfp(this.Field_15918, this.Field_15910, class_4751)) continue;
            ((Class_4286)object2).Method_4289(this.Field_15918, this.Field_15910, class_4751);
        }
        for (n3 = 8192 & 19202; n3 < this.Field_15923; ++n3) {
            n = this.Field_15910.nextInt(1296 & 20496) + (28680 & 29);
            n2 = this.Field_15910.nextInt(-5998 & 793) + (42 & 21336);
            this.Field_15887.Method_4296(this.Field_15918, this.Field_15910, this.Field_15918.Method_549(this.Field_15898.Method_4791(n, 12370 & 19713, n2)));
        }
        for (n3 = 18060 & -26623; n3 < this.Field_15891; ++n3) {
            Class_5596 class_5596;
            int n5;
            n = this.Field_15910.nextInt(8560 & 16404) + (540 & -20213);
            int n6 = this.Field_15918.Method_549(this.Field_15898.Method_4791(n, 8321 & 23154, n2 = this.Field_15910.nextInt(14578 & 1304) + (653 & 14440))).\u0000, `() + (290 & 24620);
            if (n6 <= 0 || (class_5596 = ((Class_5607)(object3 = class_17281.Method_17376(this.Field_15910, (Class_4751)(object = this.Field_15898.Method_4791(n, n5 = this.Field_15910.nextInt(n6), n2))))).Method_5633().Method_5673()).\u0000strictfp() == Class_3713.Field_3718) continue;
            this.Field_15922.Method_29128(class_5596, (Class_5607)object3);
            this.Field_15922.Method_29127(this.Field_15918, this.Field_15910, (Class_4751)object);
        }
        for (n3 = 1089 & -28390; n3 < this.Field_15896; ++n3) {
            n = this.Field_15910.nextInt(1108 & -19566) + (16557 & -29368);
            int n7 = this.Field_15918.Method_549(this.Field_15898.Method_4791(n, 24656 & -28248, n2 = this.Field_15910.nextInt(12624 & 17461) + (1419 & -23992))).\u0000, `() * (3622 & 4427);
            if (n7 <= 0) continue;
            int n8 = this.Field_15910.nextInt(n7);
            class_17281.Method_17429(this.Field_15910).Method_4296(this.Field_15918, this.Field_15910, this.Field_15898.Method_4791(n, n8, n2));
        }
        for (n3 = 20553 & 640; n3 < this.Field_15916; ++n3) {
            n = this.Field_15910.nextInt(1237 & 8208) + (8296 & -28531);
            int n9 = this.Field_15918.Method_549(this.Field_15898.Method_4791(n, -8000 & 3328, n2 = this.Field_15910.nextInt(5146 & 2292) + (4875 & -24568))).\u0000, `() * (2 & 2450);
            if (n9 <= 0) continue;
            int n10 = this.Field_15910.nextInt(n9);
            new Class_33778().Method_33779(this.Field_15918, this.Field_15910, this.Field_15898.Method_4791(n, n10, n2));
        }
        for (n3 = 21760 & 560; n3 < this.Field_15897; ++n3) {
            n = this.Field_15910.nextInt(16500 & 9104) + (-30706 & 1113);
            int n11 = this.Field_15918.Method_549(this.Field_15898.Method_4791(n, 4617 & 18496, n2 = this.Field_15910.nextInt(9040 & -31716) + (10280 & 12))).\u0000, `() * (266 & 18131);
            if (n11 <= 0) continue;
            int n12 = this.Field_15910.nextInt(n11);
            object = this.Field_15898.Method_4791(n, n12, n2);
            while (object.\u0000, `() > 0 && this.Field_15918.Method_507((Class_4751)(object3 = ((Class_4751)object).Method_4782()))) {
                object = object3;
            }
            this.Field_15908.Method_4296(this.Field_15918, this.Field_15910, (Class_4751)object);
        }
        for (n3 = 21521 & -32760; n3 < this.Field_15890; ++n3) {
            int n13;
            if (this.Field_15910.nextInt(166 & -30700) == 0) {
                n = this.Field_15910.nextInt(1620 & 16792) + (2268 & -15863);
                n2 = this.Field_15910.nextInt(8496 & 3090) + (1304 & -14321);
                object2 = this.Field_15918.Method_549(this.Field_15898.Method_4791(n, 280 & 18944, n2));
                this.Field_15905.Method_4296(this.Field_15918, this.Field_15910, (Class_4751)object2);
            }
            if (this.Field_15910.nextInt(72 & 16668) != 0 || (n13 = this.Field_15918.Method_549(this.Field_15898.Method_4791(n = this.Field_15910.nextInt(6038 & 2129) + (168 & 26136), 23620 & 290, n2 = this.Field_15910.nextInt(12369 & 1040) + (-32232 & 3240))).\u0000, `() * (-32477 & 19162)) <= 0) continue;
            int n14 = this.Field_15910.nextInt(n13);
            object = this.Field_15898.Method_4791(n, n14, n2);
            this.Field_15899.Method_4296(this.Field_15918, this.Field_15910, (Class_4751)object);
        }
        if (this.Field_15910.nextInt(5348 & 261) == 0 && (n2 = this.Field_15918.Method_549(this.Field_15898.Method_4791(n3 = this.Field_15910.nextInt(16528 & 8476) + (6698 & 16728), -31675 & 8, n = this.Field_15910.nextInt(-32752 & 2448) + (-31607 & 12616))).\u0000, `() * (25746 & 2562)) > 0) {
            int n15 = this.Field_15910.nextInt(n2);
            this.Field_15905.Method_4296(this.Field_15918, this.Field_15910, this.Field_15898.Method_4791(n3, n15, n));
        }
        if (this.Field_15910.nextInt(19592 & -20471) == 0 && (n2 = this.Field_15918.Method_549(this.Field_15898.Method_4791(n3 = this.Field_15910.nextInt(1557 & 24752) + (4632 & 17418), 25620 & -28672, n = this.Field_15910.nextInt(-16336 & 1553) + (2218 & 5132))).\u0000, `() * (18238 & -28670)) > 0) {
            object2 = this.Field_15910.nextInt(n2);
            this.Field_15899.Method_4296(this.Field_15918, this.Field_15910, this.Field_15898.Method_4791(n3, (int)object2, n));
        }
        for (n3 = -28219 & 19458; n3 < this.Field_15909; ++n3) {
            n = this.Field_15910.nextInt(2905 & 24624) + (8520 & 8);
            object2 = this.Field_15918.Method_549(this.Field_15898.Method_4791(n, 1104 & 9, n2 = this.Field_15910.nextInt(81 & -7150) + (649 & 8490))).\u0000, `() * (4354 & -30505);
            if (object2 <= 0) continue;
            int n16 = this.Field_15910.nextInt((int)object2);
            this.Field_15915.Method_4296(this.Field_15918, this.Field_15910, this.Field_15898.Method_4791(n, n16, n2));
        }
        for (n3 = 4453 & 24; n3 < (5166 & 27); ++n3) {
            n = this.Field_15910.nextInt(4116 & 16784) + (4680 & 2185);
            object2 = this.Field_15918.Method_549(this.Field_15898.Method_4791(n, 4096 & -31229, n2 = this.Field_15910.nextInt(16658 & 16) + (584 & -6888))).\u0000, `() * (8214 & 17506);
            if (object2 <= 0) continue;
            int n17 = this.Field_15910.nextInt((int)object2);
            this.Field_15915.Method_4296(this.Field_15918, this.Field_15910, this.Field_15898.Method_4791(n, n17, n2));
        }
        if (this.Field_15910.nextInt(16931 & -32652) == 0 && (n2 = this.Field_15918.Method_549(this.Field_15898.Method_4791(n3 = this.Field_15910.nextInt(668 & 28947) + (267 & 11480), 6400 & -31061, n = this.Field_15910.nextInt(-31719 & 54) + (-32760 & 27464))).\u0000, `() * (10262 & 16739)) > 0) {
            object2 = this.Field_15910.nextInt(n2);
            new Class_36990().Method_36992(this.Field_15918, this.Field_15910, this.Field_15898.Method_4791(n3, (int)object2, n));
        }
        for (n3 = 8336 & 21797; n3 < this.Field_15894; ++n3) {
            n = this.Field_15910.nextInt(17020 & 10256) + (-32114 & 18473);
            object2 = this.Field_15918.Method_549(this.Field_15898.Method_4791(n, 944 & 4169, n2 = this.Field_15910.nextInt(8272 & 23060) + (268 & 25240))).\u0000, `() * (3 & 17038);
            if (object2 <= 0) continue;
            int n18 = this.Field_15910.nextInt((int)object2);
            this.Field_15914.Method_4296(this.Field_15918, this.Field_15910, this.Field_15898.Method_4791(n, n18, n2));
        }
        if (this.Field_15920) {
            for (n3 = -26363 & 25154; n3 < (15474 & -32462); ++n3) {
                n = this.Field_15910.nextInt(16400 & 8724) + (1096 & 18600);
                n2 = this.Field_15910.nextInt(27992 & 22) + (2122 & 8344);
                object2 = this.Field_15910.nextInt(-12038 & 3064) + (16398 & 10521);
                if (object2 <= 0) continue;
                int n19 = this.Field_15910.nextInt((int)object2);
                object = this.Field_15898.Method_4791(n, n19, n2);
                new Class_28264(Class_9265.Field_9281).Method_28267(this.Field_15918, this.Field_15910, (Class_4751)object);
            }
            for (n3 = 2848 & -32750; n3 < (2679 & 24724); ++n3) {
                n = this.Field_15910.nextInt(-32716 & 18514) + (2088 & -32120);
                n2 = this.Field_15910.nextInt(402 & -31120) + (264 & 1116);
                object2 = this.Field_15910.nextInt(this.Field_15910.nextInt(this.Field_15910.nextInt(246 & 18424) + (-25814 & 1225)) + (-15428 & 8201));
                class_4751 = this.Field_15898.Method_4791(n, (int)object2, n2);
                new Class_28264(Class_9265.Field_9403).Method_28267(this.Field_15918, this.Field_15910, class_4751);
            }
        }
    }

    private void Method_15930() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

