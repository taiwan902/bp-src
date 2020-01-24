/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public abstract class Class_4720
extends Class_4746 {
    int[] Field_4721;
    protected int Field_4722;
    public static final Class_4173 Field_4723 = Class_4173.Method_4177(Class_4720.Method_4735("\u1089\u1088\u1088\u1088\u1090\u1088\u1089\u1081\u1080"));
    protected boolean Field_4724;
    public static final Class_4173 Field_4725 = Class_4173.Method_4177(Class_4720.Method_4744("\uc2da\uc2d1\uc2de\uc2d9\uc2d2\uc2e7\uc2de\uc2df\uc2da\uc2d9\uc2c2"));

    private void Method_4726() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public int Method_4727(Random random) {
        return random.nextInt(244 & 1052) == 0 ? 657 & 4103 : 2506 & -31743;
    }

    protected int Method_4728(Class_3436 class_3436) {
        return -29612 & 9013;
    }

    public void Method_4729(boolean bl) {
        this.Field_4724 = bl;
        this.\u0000= ` = bl;
        this.Field_4722 = bl ? 17922 & 8205 : -27893 & 8417;
        this.\u0000, for = !bl ? -24575 & 4385 : 17920 & -28271;
    }

    public void Method_4730(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, float f, int n) {
        if (!class_283.Field_306) {
            int n2 = this.Method_4728(class_3436);
            if (n > 0 && (n2 -= (-19710 & 166) << n) < (17022 & -31733)) {
                n2 = -6102 & 4106;
            }
            if (class_283.Field_307.nextInt(n2) == 0) {
                Class_1956 class_1956 = this.Method_4732(class_3436, class_283.Field_307, n);
                Class_4720.\u0000strictfp((Class_283)class_283, (Class_4751)class_4751, (Class_23823)new Class_23823(class_1956, 257 & 12309, this.\u0000strictfp(class_3436)));
            }
            n2 = 18922 & 12488;
            if (n > 0 && (n2 -= (78 & 22410) << n) < (20520 & 9512)) {
                n2 = 8936 & 16430;
            }
            this.Method_4733(class_283, class_4751, class_3436, n2);
        }
    }

    private void Method_4731(Class_283 class_283, Class_4751 class_4751) {
        this.\u0000strictfp(class_283, class_4751, class_283.Method_375(class_4751), -15360 & 9012);
        class_283.Method_472(class_4751);
    }

    public Class_1956 Method_4732(Class_3436 class_3436, Random random, int n) {
        return Class_1956.Method_1981(Class_9265.Field_9389);
    }

    protected void Method_4733(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, int n) {
    }

    public Class_4720() {
        super(Class_3713.Field_3729, (8 & 29440) != 0);
        this.\u0000strictfp((23555 & 217) != 0);
        this.\u0000strictfp(Class_3987.Field_3995);
        this.\u0000= final(0.8363636f * 0.23913045f);
        this.\u0000strictfp(32353 & 19);
        this.\u0000strictfp(\u0000strictfp);
    }

    public int Method_4734(Class_3436 class_3436) {
        return Class_12135.Method_12139();
    }

    private static String Method_4735(String string) {
        int n = 16024;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_4720.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_4736(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436) {
        int n;
        int n2;
        int n3 = 33 & 9759;
        int n4 = n3 + (10589 & -32735);
        int n5 = class_4751.\u0000= final();
        if (class_283.Method_365(new Class_4751(n5 - n4, (n2 = class_4751.\u0000, `()) - n4, (n = class_4751.\u0000strictfp()) - n4), new Class_4751(n5 + n4, n2 + n4, n + n4))) {
            for (int i = -n3; i <= n3; ++i) {
                for (int j = -n3; j <= n3; ++j) {
                    for (int k = -n3; k <= n3; ++k) {
                        Class_4751 class_47512 = class_4751.Method_4791(i, j, k);
                        Class_3436 class_34362 = class_283.Method_375(class_47512);
                        if (class_34362.Method_3442().Method_3373() != Class_3713.Field_3729 || ((Boolean)class_34362.Method_3440(Field_4725)).booleanValue()) continue;
                        class_283.Method_462(class_47512, class_34362.Method_3437(Field_4725, Boolean.valueOf((8419 & 4609) != 0)), 196 & 20004);
                    }
                }
            }
        }
    }

    public boolean Method_4737() {
        return (!this.\u0000= ` ? -25535 & 9 : 6 & -3552) != 0;
    }

    public void Method_4738(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Random random) {
        if (class_283.Method_496(class_4751.Method_4769()) && !Class_283.Method_538(class_283, class_4751.Method_4782()) && random.nextInt(607 & 15) == (4105 & -24191)) {
            double d = (float)class_4751.\u0000= final() + random.nextFloat();
            double d2 = (double)class_4751.\u0000, `() - 0.11851851851851852 * 0.421875;
            double d3 = (float)class_4751.\u0000strictfp() + random.nextFloat();
            class_283.Method_407(Class_40274.Field_40322, d, d2, d3, 0.0, 0.0, 0.0, new int[4665 & 2118]);
        }
    }

    public boolean Method_4739() {
        return (42 & 19460) != 0;
    }

    public abstract Class_4231 Method_4740(int var1);

    public int Method_4741(Class_561 class_561, Class_4751 class_4751, int n) {
        return Class_18104.Method_18114(class_561, class_4751);
    }

    public Class_17531 Method_4742() {
        return this.Field_4724 ? Class_17531.Field_17539 : Class_17531.Field_17532;
    }

    public int Method_4743() {
        return Class_12135.Method_12137(13.5 * 0.037037037037037035, 1.0);
    }

    private static String Method_4744(String string) {
        int n = 6744;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_4720.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_4745(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Random random) {
        if (!class_283.Field_306 && ((Boolean)class_3436.Method_3440(Field_4725)).booleanValue() && ((Boolean)class_3436.Method_3440(Field_4723)).booleanValue()) {
            int n;
            int n2 = 21260 & 3140;
            int n3 = n2 + (2053 & 20481);
            int n4 = class_4751.\u0000= final();
            int n5 = class_4751.\u0000, `();
            int n6 = class_4751.\u0000strictfp();
            int n7 = 814 & 25696;
            int n8 = n7 * n7;
            int n9 = n7 / (-31222 & 195);
            if (this.Field_4721 == null) {
                this.Field_4721 = new int[n7 * n7 * n7];
            }
            if (class_283.Method_365(new Class_4751(n4 - n3, n5 - n3, n6 - n3), new Class_4751(n4 + n3, n5 + n3, n6 + n3))) {
                int n12;
                int n10;
                int n11;
                reference var17_18;
                Class_4810 class_4810 = new Class_4810();
                for (n10 = -n2; n10 <= n2; ++n10) {
                    for (n12 = -n2; n12 <= n2; ++n12) {
                        for (n11 = -n2; n11 <= n2; ++n11) {
                            var17_18 = (reference)class_283.Method_375(class_4810.Method_4814(n4 + n10, n5 + n12, n6 + n11)).Method_3442();
                            if (var17_18 != Class_9265.Field_9383 && var17_18 != Class_9265.Field_9447) {
                                if (var17_18.Method_3373() == Class_3713.Field_3729) {
                                    this.Field_4721[(n10 + n9) * n8 + (n12 + n9) * n7 + n11 + n9] = -2 & -2;
                                    continue;
                                }
                                this.Field_4721[(n10 + n9) * n8 + (n12 + n9) * n7 + n11 + n9] = -1 & -1;
                                continue;
                            }
                            this.Field_4721[(n10 + n9) * n8 + (n12 + n9) * n7 + n11 + n9] = -28592 & 11560;
                        }
                    }
                }
                for (n10 = 16385 & -32739; n10 <= (10277 & -31418); ++n10) {
                    for (n12 = -n2; n12 <= n2; ++n12) {
                        for (n11 = -n2; n11 <= n2; ++n11) {
                            for (var17_18 = -n2; var17_18 <= n2; ++var17_18) {
                                if (this.Field_4721[(n12 + n9) * n8 + (n11 + n9) * n7 + var17_18 + n9] != n10 - (-23959 & 2049)) continue;
                                if (this.Field_4721[(n12 + n9 - (8257 & -28669)) * n8 + (n11 + n9) * n7 + var17_18 + n9] == (-2 & -2)) {
                                    this.Field_4721[(n12 + n9 - (28677 & 1747)) * n8 + (n11 + n9) * n7 + var17_18 + n9] = n10;
                                }
                                if (this.Field_4721[(n12 + n9 + (11267 & -32215)) * n8 + (n11 + n9) * n7 + var17_18 + n9] == (-2 & -1)) {
                                    this.Field_4721[(n12 + n9 + (25 & 2597)) * n8 + (n11 + n9) * n7 + var17_18 + n9] = n10;
                                }
                                if (this.Field_4721[(n12 + n9) * n8 + (n11 + n9 - (7275 & 25217)) * n7 + var17_18 + n9] == (-2 & -1)) {
                                    this.Field_4721[(n12 + n9) * n8 + (n11 + n9 - (16387 & 117)) * n7 + var17_18 + n9] = n10;
                                }
                                if (this.Field_4721[(n12 + n9) * n8 + (n11 + n9 + (1057 & 9043)) * n7 + var17_18 + n9] == (-2 & -2)) {
                                    this.Field_4721[(n12 + n9) * n8 + (n11 + n9 + (5 & -23133)) * n7 + var17_18 + n9] = n10;
                                }
                                if (this.Field_4721[(n12 + n9) * n8 + (n11 + n9) * n7 + (var17_18 + n9 - (4161 & 10515))] == (-2 & -2)) {
                                    this.Field_4721[(n12 + n9) * n8 + (n11 + n9) * n7 + (var17_18 + n9 - (-22463 & 1197))] = n10;
                                }
                                if (this.Field_4721[(n12 + n9) * n8 + (n11 + n9) * n7 + var17_18 + n9 + (20567 & 521)] != (-1 & -2)) continue;
                                this.Field_4721[(n12 + n9) * n8 + (n11 + n9) * n7 + var17_18 + n9 + (-14309 & 4193)] = n10;
                            }
                        }
                    }
                }
            }
            if ((n = this.Field_4721[n9 * n8 + n9 * n7 + n9]) >= 0) {
                class_283.Method_462(class_4751, class_3436.Method_3437(Field_4725, Boolean.valueOf((-14335 & 5418) != 0)), 6852 & 260);
            } else {
                this.Method_4731(class_283, class_4751);
            }
        }
    }
}

