/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Random;

public class Class_16282
extends Class_13400 {
    private boolean Field_16283;
    private boolean Field_16284;
    private boolean Field_16285;
    private int Field_16286;

    private void Method_16287() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public static Class_42666 Method_16288(List list, Random random, int n, int n2, int n3, Class_4595 class_4595) {
        int n4;
        Class_42666 class_42666 = new Class_42666(n, n2, n3, n, n2 + (5466 & 16551), n3);
        for (n4 = random.nextInt((int)(-26805 & 8231)) + (3074 & 24586); n4 > 0; --n4) {
            int n5 = n4 * (4167 & 2829);
            switch (Class_31128.Field_31129[class_4595.ordinal()]) {
                case 1: {
                    class_42666.Field_42670 = n + (5186 & 271);
                    class_42666.Field_42669 = n3 - (n5 - (1025 & 4259));
                    break;
                }
                case 2: {
                    class_42666.Field_42670 = n + (322 & 9891);
                    class_42666.Field_42667 = n3 + (n5 - (24847 & 1));
                    break;
                }
                case 3: {
                    class_42666.Field_42668 = n - (n5 - (1665 & -7927));
                    class_42666.Field_42667 = n3 + (13443 & -31890);
                    break;
                }
                case 4: {
                    class_42666.Field_42670 = n + (n5 - (323 & 17041));
                    class_42666.Field_42667 = n3 + (18506 & 274);
                }
            }
            if (Class_13400.Method_13426(list, class_42666) == null) break;
        }
        return n4 > 0 ? class_42666 : null;
    }

    public boolean Method_16289(Class_283 class_283, Random random, Class_42666 class_42666) {
        int n;
        int n2;
        int n3;
        int n4;
        if (this.\u0000strictfp(class_283, class_42666)) {
            return (-14192 & 4134) != 0;
        }
        int n5 = 40 & 12817;
        int n6 = -24550 & 3907;
        int n7 = 16456 & 0;
        int n8 = 24834 & 5166;
        int n9 = this.Field_16286 * (-20395 & 5) - (1281 & 12961);
        this.\u0000strictfp(class_283, class_42666, 27653 & 4168, 8512 & 16902, -29440 & 80, -27118 & 3, 17619 & -28159, n9, (Class_3436)Class_9265.Field_9351.Method_3293(), (Class_3436)Class_9265.Field_9351.Method_3293(), (-23549 & 23184) != 0);
        this.\u0000strictfp(class_283, class_42666, random, 0.09090909f * 8.8f, 9472 & -28640, 2443 & 20530, 64 & 25093, 598 & -28382, -12182 & 11783, n9, (Class_3436)Class_9265.Field_9351.Method_3293(), (Class_3436)Class_9265.Field_9351.Method_3293(), (-24576 & 4746) != 0);
        if (this.Field_16284) {
            this.\u0000strictfp(class_283, class_42666, random, 2.152174f * 0.27878788f, 8257 & -30660, -17760 & 1042, 14976 & -32462, 706 & -22262, 17921 & 137, n9, (Class_3436)Class_9265.Field_9415.Method_3293(), (Class_3436)Class_9265.Field_9351.Method_3293(), (9344 & 639) != 0);
        }
        for (n4 = 22 & -18944; n4 < this.Field_16286; ++n4) {
            n2 = (-32498 & 8354) + n4 * (2053 & 1189);
            this.\u0000strictfp(class_283, class_42666, 12419 & -32704, 4176 & 2176, n2, 384 & -31734, -30687 & 28801, n2, (Class_3436)Class_9265.Field_9437.Method_3293(), (Class_3436)Class_9265.Field_9351.Method_3293(), (-29614 & 8576) != 0);
            this.\u0000strictfp(class_283, class_42666, -30666 & 5442, -16119 & 15520, n2, 8210 & 16839, 20739 & 1605, n2, (Class_3436)Class_9265.Field_9437.Method_3293(), (Class_3436)Class_9265.Field_9351.Method_3293(), (0 & 99) != 0);
            if (random.nextInt(-30652 & 5148) == 0) {
                this.\u0000strictfp(class_283, class_42666, -24256 & 40, 42 & -32558, n2, -32704 & 8214, -22494 & 18, n2, (Class_3436)Class_9265.Field_9379.Method_3293(), (Class_3436)Class_9265.Field_9351.Method_3293(), (4146 & 8320) != 0);
                this.\u0000strictfp(class_283, class_42666, 6 & 1170, -16365 & 526, n2, -32714 & 20994, 18563 & 8970, n2, (Class_3436)Class_9265.Field_9379.Method_3293(), (Class_3436)Class_9265.Field_9351.Method_3293(), (192 & 1) != 0);
            } else {
                this.\u0000strictfp(class_283, class_42666, -17728 & 29, -25341 & 8238, n2, 518 & 8290, 550 & 18571, n2, (Class_3436)Class_9265.Field_9379.Method_3293(), (Class_3436)Class_9265.Field_9351.Method_3293(), (16388 & 2049) != 0);
            }
            this.\u0000strictfp(class_283, class_42666, random, 0.82608694f * 0.12105264f, -16382 & 561, 3 & -28522, n2 - (8449 & 16465), (Class_3436)Class_9265.Field_9415.Method_3293());
            this.\u0000strictfp(class_283, class_42666, random, 0.40425533f * 0.24736843f, 5251 & 8978, 258 & 1675, n2 - (-28603 & 18449), (Class_3436)Class_9265.Field_9415.Method_3293());
            this.\u0000strictfp(class_283, class_42666, random, 0.06935484f * 1.4418604f, 136 & -31225, -10154 & 8738, n2 + (17257 & 8193), (Class_3436)Class_9265.Field_9415.Method_3293());
            this.\u0000strictfp(class_283, class_42666, random, 1.0104166f * 0.09896908f, -24282 & 1099, 386 & -8190, n2 + (16929 & -31737), (Class_3436)Class_9265.Field_9415.Method_3293());
            this.\u0000strictfp(class_283, class_42666, random, 1.22f * 0.040983606f, -15486 & 4208, 20538 & 2566, n2 - (8706 & 2050), (Class_3436)Class_9265.Field_9415.Method_3293());
            this.\u0000strictfp(class_283, class_42666, random, 0.1764706f * 0.28333333f, 2119 & 16442, 27 & -23038, n2 - (2563 & -24410), (Class_3436)Class_9265.Field_9415.Method_3293());
            this.\u0000strictfp(class_283, class_42666, random, 0.14583333f * 0.34285715f, 16529 & 11118, 22554 & 578, n2 + (11970 & 294), (Class_3436)Class_9265.Field_9415.Method_3293());
            this.\u0000strictfp(class_283, class_42666, random, 0.026973683f * 1.8536586f, 290 & 522, 342 & -18430, n2 + (16902 & -31694), (Class_3436)Class_9265.Field_9415.Method_3293());
            this.\u0000strictfp(class_283, class_42666, random, 0.8064516f * 0.062f, 4615 & -30639, -29169 & 16546, n2 - (16409 & -18303), Class_9265.Field_9293.Method_3342(Class_4595.Field_4601.Method_4648()));
            this.\u0000strictfp(class_283, class_42666, random, 0.010588235f * 4.7222223f, -12201 & 897, 706 & -8190, n2 + (279 & 2081), Class_9265.Field_9293.Method_3342(Class_4595.Field_4601.Method_4648()));
            if (random.nextInt(-23956 & 4325) == 0) {
                Class_36948[] arrclass_36948 = new Class_36948[3 & -26823];
                arrclass_36948[4136 & 26131] = Class_10527.Field_10625.Method_21687(random);
                this.Method_16293(class_283, class_42666, random, 1411 & 26694, 6144 & 24912, n2 - (8723 & 4193), Class_36948.Method_36955(Class_26253.Method_26258(), arrclass_36948), (24587 & -30057) + random.nextInt(164 & 24925));
            }
            if (random.nextInt(12388 & 17276) == 0) {
                Class_36948[] arrclass_36948 = new Class_36948[-23951 & 4359];
                arrclass_36948[-16320 & 1038] = Class_10527.Field_10625.Method_21687(random);
                this.Method_16293(class_283, class_42666, random, 4384 & -32758, 8704 & 56, n2 + (-29247 & 49), Class_36948.Method_36955(Class_26253.Method_26258(), arrclass_36948), (16419 & -20205) + random.nextInt(31814 & 4));
            }
            if (!this.Field_16284 || this.Field_16285) continue;
            n = this.\u0000strictfp(259 & 16920);
            int n10 = n2 - (-30709 & 4545) + random.nextInt(707 & -5117);
            n3 = this.\u0000strictfp(4097 & -32655, n10);
            Class_4751 class_4751 = new Class_4751(n3, n, n10 = this.\u0000, `(25287 & 3329, n10));
            if (!class_42666.Method_42683(class_4751)) continue;
            this.Field_16285 = 18441 & 12291;
            class_283.Method_462(class_4751, Class_9265.Field_9279.Method_3293(), 8258 & 2087);
            Class_4879 class_4879 = class_283.Method_429(class_4751);
            if (!(class_4879 instanceof Class_36325)) continue;
            ((Class_36325)class_4879).Method_36333().Method_20894("CaveSpider");
        }
        for (n4 = 4144 & 1353; n4 <= (258 & 34); ++n4) {
            for (n2 = 2080 & 9350; n2 <= n9; ++n2) {
                n = -1 & -1;
                Class_3436 class_3436 = this.\u0000strictfp(class_283, n4, n, n2, class_42666);
                if (class_3436.Method_3442().Method_3373() != Class_3713.Field_3718) continue;
                n3 = -1 & -1;
                this.\u0000, `(class_283, (Class_3436)Class_9265.Field_9379.Method_3293(), n4, n3, n2, class_42666);
            }
        }
        if (this.Field_16283) {
            for (n4 = 16512 & 13422; n4 <= n9; ++n4) {
                Class_3436 class_3436 = this.\u0000strictfp(class_283, 18437 & 81, -1 & -1, n4, class_42666);
                if (class_3436.Method_3442().Method_3373() == Class_3713.Field_3718 || !class_3436.Method_3442().Method_3381()) continue;
                this.\u0000strictfp(class_283, class_42666, random, 0.6f * 1.1666666f, 16385 & 15277, 5126 & 19121, n4, Class_9265.Field_9401.Method_3342(this.\u0000strictfp(Class_9265.Field_9401, -19826 & 1312)));
            }
        }
        return (-32243 & 6209) != 0;
    }

    protected void Method_16290(Class_1699 class_1699) {
        this.Field_16283 = class_1699.Method_1733("hr");
        this.Field_16284 = class_1699.Method_1733("sc");
        this.Field_16285 = class_1699.Method_1733("hps");
        this.Field_16286 = class_1699.Method_1738("Num");
    }

    protected void Method_16291(Class_1699 class_1699) {
        class_1699.Method_1706("hr", this.Field_16283);
        class_1699.Method_1706("sc", this.Field_16284);
        class_1699.Method_1706("hps", this.Field_16285);
        class_1699.Method_1739("Num", this.Field_16286);
    }

    public Class_16282(int n, Random random, Class_42666 class_42666, Class_4595 class_4595) {
        super(n);
        this.\u0000strictfp = class_4595;
        this.\u0000strictfp = class_42666;
        this.Field_16283 = random.nextInt(-15397 & 2051) == 0 ? -14125 & 293 : 5633 & -24412;
        this.Field_16284 = !this.Field_16283 && random.nextInt(-21857 & 55) == 0 ? -28669 & 2689 : 4112 & 8294;
        this.Field_16286 = this.\u0000strictfp != Class_4595.Field_4598 && this.\u0000strictfp != Class_4595.Field_4613 ? class_42666.Method_42687() / (13 & 5255) : class_42666.Method_42676() / (1349 & 4245);
    }

    public void Method_16292(Class_13400 class_13400, List list, Random random) {
        block25 : {
            int n = this.\u0000strictfp();
            int n2 = random.nextInt(20861 & 132);
            if (this.\u0000strictfp != null) {
                switch (Class_31128.Field_31129[this.\u0000strictfp.ordinal()]) {
                    case 1: {
                        if (n2 <= (1539 & -30575)) {
                            Class_26253.Method_26260(class_13400, list, random, this.\u0000strictfp.Field_42668, this.\u0000strictfp.Field_42672 - (12289 & 7) + random.nextInt(17731 & -32761), this.\u0000strictfp.Field_42669 - (-28415 & 1123), this.\u0000strictfp, n);
                            break;
                        }
                        if (n2 == (18463 & -27134)) {
                            Class_26253.Method_26260(class_13400, list, random, this.\u0000strictfp.Field_42668 - (-28357 & 1093), this.\u0000strictfp.Field_42672 - (8201 & 833) + random.nextInt(8771 & -12257), this.\u0000strictfp.Field_42669, Class_4595.Field_4602, n);
                            break;
                        }
                        Class_26253.Method_26260(class_13400, list, random, this.\u0000strictfp.Field_42670 + (-16197 & 5633), this.\u0000strictfp.Field_42672 - (-32637 & 17) + random.nextInt(427 & -15869), this.\u0000strictfp.Field_42669, Class_4595.Field_4603, n);
                        break;
                    }
                    case 2: {
                        if (n2 <= (277 & -8607)) {
                            Class_26253.Method_26260(class_13400, list, random, this.\u0000strictfp.Field_42668, this.\u0000strictfp.Field_42672 - (49 & 24705) + random.nextInt(10499 & 4235), this.\u0000strictfp.Field_42667 + (4097 & -13823), this.\u0000strictfp, n);
                            break;
                        }
                        if (n2 == (2418 & -20478)) {
                            Class_26253.Method_26260(class_13400, list, random, this.\u0000strictfp.Field_42668 - (2125 & -18799), this.\u0000strictfp.Field_42672 - (6401 & 17441) + random.nextInt(3139 & 16651), this.\u0000strictfp.Field_42667 - (563 & -30589), Class_4595.Field_4602, n);
                            break;
                        }
                        Class_26253.Method_26260(class_13400, list, random, this.\u0000strictfp.Field_42670 + (2849 & 5139), this.\u0000strictfp.Field_42672 - (9 & -31709) + random.nextInt(267 & 8247), this.\u0000strictfp.Field_42667 - (27 & 7), Class_4595.Field_4603, n);
                        break;
                    }
                    case 3: {
                        if (n2 <= (5129 & 24679)) {
                            Class_26253.Method_26260(class_13400, list, random, this.\u0000strictfp.Field_42668 - (1 & 3363), this.\u0000strictfp.Field_42672 - (17041 & -21183) + random.nextInt(22467 & 43), this.\u0000strictfp.Field_42669, this.\u0000strictfp, n);
                            break;
                        }
                        if (n2 == (19458 & 518)) {
                            Class_26253.Method_26260(class_13400, list, random, this.\u0000strictfp.Field_42668, this.\u0000strictfp.Field_42672 - (24773 & 2617) + random.nextInt(-13261 & 13067), this.\u0000strictfp.Field_42669 - (2065 & 8295), Class_4595.Field_4598, n);
                            break;
                        }
                        Class_26253.Method_26260(class_13400, list, random, this.\u0000strictfp.Field_42668, this.\u0000strictfp.Field_42672 - (33 & -23935) + random.nextInt(731 & 2087), this.\u0000strictfp.Field_42667 + (-24291 & 673), Class_4595.Field_4613, n);
                        break;
                    }
                    case 4: {
                        if (n2 <= (9217 & -13637)) {
                            Class_26253.Method_26260(class_13400, list, random, this.\u0000strictfp.Field_42670 + (769 & 5209), this.\u0000strictfp.Field_42672 - (8497 & -16383) + random.nextInt(6067 & 24643), this.\u0000strictfp.Field_42669, this.\u0000strictfp, n);
                            break;
                        }
                        if (n2 == (16602 & 4131)) {
                            Class_26253.Method_26260(class_13400, list, random, this.\u0000strictfp.Field_42670 - (-4821 & 4103), this.\u0000strictfp.Field_42672 - (2305 & 1113) + random.nextInt(18563 & 12299), this.\u0000strictfp.Field_42669 - (6441 & 17985), Class_4595.Field_4598, n);
                            break;
                        }
                        Class_26253.Method_26260(class_13400, list, random, this.\u0000strictfp.Field_42670 - (103 & -32637), this.\u0000strictfp.Field_42672 - (-28927 & 16387) + random.nextInt(28955 & 67), this.\u0000strictfp.Field_42667 + (7333 & 579), Class_4595.Field_4613, n);
                    }
                }
            }
            if (n >= (6168 & 1708)) break block25;
            if (this.\u0000strictfp != Class_4595.Field_4598 && this.\u0000strictfp != Class_4595.Field_4613) {
                int n3 = this.\u0000strictfp.Field_42668 + (-28505 & 2059);
                while (n3 + (12363 & 18195) <= this.\u0000strictfp.Field_42670) {
                    int n4 = random.nextInt(26903 & 1613);
                    if (n4 == 0) {
                        Class_26253.Method_26260(class_13400, list, random, n3, this.\u0000strictfp.Field_42672, this.\u0000strictfp.Field_42669 - (-30207 & 8261), Class_4595.Field_4598, n + (1793 & -16335));
                    } else if (n4 == (8321 & 19045)) {
                        Class_26253.Method_26260(class_13400, list, random, n3, this.\u0000strictfp.Field_42672, this.\u0000strictfp.Field_42667 + (4113 & 10371), Class_4595.Field_4613, n + (-7407 & 2125));
                    }
                    n3 += 5;
                }
            } else {
                int n5 = this.\u0000strictfp.Field_42669 + (10835 & 16419);
                while (n5 + (-24573 & 2051) <= this.\u0000strictfp.Field_42667) {
                    int n6 = random.nextInt(-32491 & 16391);
                    if (n6 == 0) {
                        Class_26253.Method_26260(class_13400, list, random, this.\u0000strictfp.Field_42668 - (-16383 & 65), this.\u0000strictfp.Field_42672, n5, Class_4595.Field_4602, n + (-14111 & 8977));
                    } else if (n6 == (329 & 24615)) {
                        Class_26253.Method_26260(class_13400, list, random, this.\u0000strictfp.Field_42670 + (25803 & 4097), this.\u0000strictfp.Field_42672, n5, Class_4595.Field_4603, n + (16901 & -24527));
                    }
                    n5 += 5;
                }
            }
        }
    }

    protected boolean Method_16293(Class_283 class_283, Class_42666 class_42666, Random random, int n, int n2, int n3, List list, int n4) {
        Class_4751 class_4751 = new Class_4751(this.\u0000strictfp(n, n3), this.\u0000strictfp(n2), this.\u0000, `(n, n3));
        if (class_42666.Method_42683(class_4751) && class_283.Method_375(class_4751).Method_3442().Method_3373() == Class_3713.Field_3718) {
            int n5 = random.nextBoolean() ? 16641 & 9377 : 2060 & -12032;
            class_283.Method_462(class_4751, Class_9265.Field_9401.Method_3342(this.\u0000strictfp(Class_9265.Field_9401, n5)), 29206 & 74);
            Class_41439 class_41439 = new Class_41439(class_283, (float)class_4751.\u0000= final() + 2.5833333f * 0.1935484f, (float)class_4751.\u0000, `() + 1.0263158f * 0.4871795f, (float)class_4751.\u0000strictfp() + 0.6615385f * 0.75581396f);
            Class_36948.Method_36952(random, list, class_41439, n4);
            class_283.Method_350(class_41439);
            return (1 & 8529) != 0;
        }
        return (-15357 & 2616) != 0;
    }

    public Class_16282() {
    }
}

