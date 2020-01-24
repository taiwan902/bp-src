/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Random;

public abstract class Class_13400 {
    protected Class_42666 Field_13401;
    protected Class_4595 Field_13402;
    protected int Field_13403;

    public Class_13400() {
    }

    protected int Method_13404(int n, int n2) {
        if (this.Field_13402 == null) {
            return n2;
        }
        switch (Class_14060.Field_14061[this.Field_13402.ordinal()]) {
            case 1: {
                return this.Field_13401.Field_42667 - n2;
            }
            case 2: {
                return this.Field_13401.Field_42669 + n2;
            }
            case 3: 
            case 4: {
                return this.Field_13401.Field_42669 + n;
            }
        }
        return n2;
    }

    protected Class_13400(int n) {
        this.Field_13403 = n;
    }

    protected boolean Method_13405(Class_283 class_283, Class_42666 class_42666, Random random, int n, int n2, int n3, int n4, List list, int n5) {
        Class_4751 class_4751 = new Class_4751(this.Method_13416(n, n3), this.Method_13433(n2), this.Method_13404(n, n3));
        if (class_42666.Method_42683(class_4751) && class_283.Method_375(class_4751).Method_3442() != Class_9265.Field_9338) {
            class_283.Method_462(class_4751, Class_9265.Field_9338.Method_3342(this.Method_13413(Class_9265.Field_9338, n4)), 1106 & 14882);
            Class_4879 class_4879 = class_283.Method_429(class_4751);
            if (class_4879 instanceof Class_4933) {
                Class_36948.Method_36954(random, list, (Class_4933)class_4879, n5);
            }
            return (-7259 & 2049) != 0;
        }
        return (17617 & 4364) != 0;
    }

    protected void Method_13406(Class_283 class_283, Class_3436 class_3436, int n, int n2, int n3, Class_42666 class_42666) {
        int n4;
        int n5;
        int n6 = this.Method_13416(n, n3);
        if (class_42666.Method_42683(new Class_4751(n6, n4 = this.Method_13433(n2), n5 = this.Method_13404(n, n3)))) {
            while ((class_283.Method_507(new Class_4751(n6, n4, n5)) || class_283.Method_375(new Class_4751(n6, n4, n5)).Method_3442().Method_3373().Method_3758()) && n4 > (8205 & 18465)) {
                class_283.Method_462(new Class_4751(n6, n4, n5), class_3436, -31726 & 8334);
                --n4;
            }
        }
    }

    private void Method_13407() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected void Method_13408(Class_283 class_283, Class_42666 class_42666, Random random, int n, int n2, int n3, Class_4595 class_4595) {
        Class_4751 class_4751 = new Class_4751(this.Method_13416(n, n3), this.Method_13433(n2), this.Method_13404(n, n3));
        if (class_42666.Method_42683(class_4751)) {
            Class_25751.Method_25753(class_283, class_4751, class_4595.Method_4617(), Class_9265.Field_9451);
        }
    }

    protected boolean Method_13409(Class_283 class_283, Class_42666 class_42666, Random random, int n, int n2, int n3, List list, int n4) {
        Class_4751 class_4751 = new Class_4751(this.Method_13416(n, n3), this.Method_13433(n2), this.Method_13404(n, n3));
        if (class_42666.Method_42683(class_4751) && class_283.Method_375(class_4751).Method_3442() != Class_9265.Field_9420) {
            Class_3677 class_3677 = Class_9265.Field_9420.\u0000strictfp();
            class_283.Method_462(class_4751, Class_9265.Field_9420.Method_4147(class_283, class_4751, class_3677), 5410 & 2699);
            Class_4879 class_4879 = class_283.Method_429(class_4751);
            if (class_4879 instanceof Class_36146) {
                Class_36948.Method_36952(random, list, (Class_36146)class_4879, n4);
            }
            return (10753 & -32509) != 0;
        }
        return (-14302 & 320) != 0;
    }

    public Class_4751 Method_13410() {
        return new Class_4751(this.Field_13401.Method_42681());
    }

    protected void Method_13411(Class_283 class_283, Class_42666 class_42666, int n, int n2, int n3, int n4, int n5, int n6, boolean bl, Random random, Class_18176 class_18176) {
        for (int i = n2; i <= n5; ++i) {
            for (int j = n; j <= n4; ++j) {
                for (int k = n3; k <= n6; ++k) {
                    if (bl && this.Method_13412(class_283, j, i, k, class_42666).Method_3442().Method_3373() == Class_3713.Field_3718) continue;
                    class_18176.Method_18180(random, j, i, k, (i == n2 || i == n5 || j == n || j == n4 || k == n3 || k == n6 ? -30647 & 8197 : 133 & -15552) != 0);
                    this.Method_13428(class_283, class_18176.Method_18178(), j, i, k, class_42666);
                }
            }
        }
    }

    protected Class_3436 Method_13412(Class_283 class_283, int n, int n2, int n3, Class_42666 class_42666) {
        int n4;
        int n5;
        int n6 = this.Method_13416(n, n3);
        Class_4751 class_4751 = new Class_4751(n6, n5 = this.Method_13433(n2), n4 = this.Method_13404(n, n3));
        return !class_42666.Method_42683(class_4751) ? Class_9265.Field_9351.Method_3293() : class_283.Method_375(class_4751);
    }

    protected int Method_13413(Class_3238 class_3238, int n) {
        if (class_3238 == Class_9265.Field_9401) {
            if (this.Field_13402 == Class_4595.Field_4602 || this.Field_13402 == Class_4595.Field_4603) {
                if (n == (-15319 & 131)) {
                    return -32566 & 2049;
                }
                return -14087 & 8963;
            }
        } else if (class_3238 instanceof Class_16100) {
            if (this.Field_13402 == Class_4595.Field_4613) {
                if (n == 0) {
                    return 203 & 9218;
                }
                if (n == (-9978 & 1122)) {
                    return 352 & 28805;
                }
            } else {
                if (this.Field_13402 == Class_4595.Field_4602) {
                    return n + (20483 & 11601) & (1167 & 2403);
                }
                if (this.Field_13402 == Class_4595.Field_4603) {
                    return n + (3 & 31283) & (-28029 & 1403);
                }
            }
        } else if (class_3238 != Class_9265.Field_9390 && class_3238 != Class_9265.Field_9302 && class_3238 != Class_9265.Field_9438 && class_3238 != Class_9265.Field_9307 && class_3238 != Class_9265.Field_9416) {
            if (class_3238 == Class_9265.Field_9350) {
                if (this.Field_13402 == Class_4595.Field_4613) {
                    if (n == Class_4595.Field_4598.Method_4648()) {
                        return Class_4595.Field_4613.Method_4648();
                    }
                    if (n == Class_4595.Field_4613.Method_4648()) {
                        return Class_4595.Field_4598.Method_4648();
                    }
                } else if (this.Field_13402 == Class_4595.Field_4602) {
                    if (n == Class_4595.Field_4598.Method_4648()) {
                        return Class_4595.Field_4602.Method_4648();
                    }
                    if (n == Class_4595.Field_4613.Method_4648()) {
                        return Class_4595.Field_4603.Method_4648();
                    }
                    if (n == Class_4595.Field_4602.Method_4648()) {
                        return Class_4595.Field_4598.Method_4648();
                    }
                    if (n == Class_4595.Field_4603.Method_4648()) {
                        return Class_4595.Field_4613.Method_4648();
                    }
                } else if (this.Field_13402 == Class_4595.Field_4603) {
                    if (n == Class_4595.Field_4598.Method_4648()) {
                        return Class_4595.Field_4603.Method_4648();
                    }
                    if (n == Class_4595.Field_4613.Method_4648()) {
                        return Class_4595.Field_4602.Method_4648();
                    }
                    if (n == Class_4595.Field_4602.Method_4648()) {
                        return Class_4595.Field_4598.Method_4648();
                    }
                    if (n == Class_4595.Field_4603.Method_4648()) {
                        return Class_4595.Field_4613.Method_4648();
                    }
                }
            } else if (class_3238 == Class_9265.Field_9386) {
                if (this.Field_13402 == Class_4595.Field_4613) {
                    if (n == (3587 & 16727)) {
                        return 2949 & -28596;
                    }
                    if (n == (20 & 6692)) {
                        return -16381 & 11235;
                    }
                } else if (this.Field_13402 == Class_4595.Field_4602) {
                    if (n == (24675 & 131)) {
                        return 177 & 4105;
                    }
                    if (n == (4852 & 1030)) {
                        return -11705 & 2314;
                    }
                    if (n == (50 & 1286)) {
                        return 2251 & -24553;
                    }
                    if (n == (1415 & 16985)) {
                        return 14757 & -32748;
                    }
                } else if (this.Field_13402 == Class_4595.Field_4603) {
                    if (n == (4227 & 16403)) {
                        return 98 & -9086;
                    }
                    if (n == (20 & 17958)) {
                        return 30805 & 129;
                    }
                    if (n == (-15358 & 7139)) {
                        return -20457 & 2379;
                    }
                    if (n == (899 & -11195)) {
                        return 548 & 10439;
                    }
                }
            } else if (class_3238 != Class_9265.Field_9266 && !(class_3238 instanceof Class_5133)) {
                if (class_3238 == Class_9265.Field_9270 || class_3238 == Class_9265.Field_9341 || class_3238 == Class_9265.Field_9325 || class_3238 == Class_9265.Field_9338) {
                    if (this.Field_13402 == Class_4595.Field_4613) {
                        if (n == Class_4595.Field_4598.Method_4648() || n == Class_4595.Field_4613.Method_4648()) {
                            return Class_4595.Method_4637(n).Method_4660().Method_4648();
                        }
                    } else if (this.Field_13402 == Class_4595.Field_4602) {
                        if (n == Class_4595.Field_4598.Method_4648()) {
                            return Class_4595.Field_4602.Method_4648();
                        }
                        if (n == Class_4595.Field_4613.Method_4648()) {
                            return Class_4595.Field_4603.Method_4648();
                        }
                        if (n == Class_4595.Field_4602.Method_4648()) {
                            return Class_4595.Field_4598.Method_4648();
                        }
                        if (n == Class_4595.Field_4603.Method_4648()) {
                            return Class_4595.Field_4613.Method_4648();
                        }
                    } else if (this.Field_13402 == Class_4595.Field_4603) {
                        if (n == Class_4595.Field_4598.Method_4648()) {
                            return Class_4595.Field_4603.Method_4648();
                        }
                        if (n == Class_4595.Field_4613.Method_4648()) {
                            return Class_4595.Field_4602.Method_4648();
                        }
                        if (n == Class_4595.Field_4602.Method_4648()) {
                            return Class_4595.Field_4598.Method_4648();
                        }
                        if (n == Class_4595.Field_4603.Method_4648()) {
                            return Class_4595.Field_4613.Method_4648();
                        }
                    }
                }
            } else {
                Class_4595 class_4595 = Class_4595.Method_4628(n);
                if (this.Field_13402 == Class_4595.Field_4613) {
                    if (class_4595 == Class_4595.Field_4613 || class_4595 == Class_4595.Field_4598) {
                        return class_4595.Method_4660().Method_4619();
                    }
                } else if (this.Field_13402 == Class_4595.Field_4602) {
                    if (class_4595 == Class_4595.Field_4598) {
                        return Class_4595.Field_4602.Method_4619();
                    }
                    if (class_4595 == Class_4595.Field_4613) {
                        return Class_4595.Field_4603.Method_4619();
                    }
                    if (class_4595 == Class_4595.Field_4602) {
                        return Class_4595.Field_4598.Method_4619();
                    }
                    if (class_4595 == Class_4595.Field_4603) {
                        return Class_4595.Field_4613.Method_4619();
                    }
                } else if (this.Field_13402 == Class_4595.Field_4603) {
                    if (class_4595 == Class_4595.Field_4598) {
                        return Class_4595.Field_4603.Method_4619();
                    }
                    if (class_4595 == Class_4595.Field_4613) {
                        return Class_4595.Field_4602.Method_4619();
                    }
                    if (class_4595 == Class_4595.Field_4602) {
                        return Class_4595.Field_4598.Method_4619();
                    }
                    if (class_4595 == Class_4595.Field_4603) {
                        return Class_4595.Field_4613.Method_4619();
                    }
                }
            }
        } else if (this.Field_13402 == Class_4595.Field_4613) {
            if (n == (159 & 12802)) {
                return 20515 & -28857;
            }
            if (n == (27659 & 4279)) {
                return 278 & 17954;
            }
        } else if (this.Field_13402 == Class_4595.Field_4602) {
            if (n == 0) {
                return 258 & 17450;
            }
            if (n == (1189 & 6419)) {
                return 27683 & 4679;
            }
            if (n == (-16126 & 66)) {
                return 1568 & -32750;
            }
            if (n == (26895 & 131)) {
                return 2691 & 20497;
            }
        } else if (this.Field_13402 == Class_4595.Field_4603) {
            if (n == 0) {
                return 8231 & 21578;
            }
            if (n == (2243 & 517)) {
                return 20571 & 8327;
            }
            if (n == (2 & -21501)) {
                return 17409 & 4097;
            }
            if (n == (16647 & -32733)) {
                return 16422 & -25535;
            }
        }
        return n;
    }

    public Class_1699 Method_13414() {
        Class_1699 class_1699 = new Class_1699();
        class_1699.Method_1702("id", Class_34391.Method_34398(this));
        class_1699.Method_1744("BB", this.Field_13401.Method_42674());
        class_1699.Method_1739("O", this.Field_13402 == null ? -1 & -1 : this.Field_13402.Method_4619());
        class_1699.Method_1739("GD", this.Field_13403);
        this.Method_13417(class_1699);
        return class_1699;
    }

    public Class_42666 Method_13415() {
        return this.Field_13401;
    }

    protected int Method_13416(int n, int n2) {
        if (this.Field_13402 == null) {
            return n;
        }
        switch (Class_14060.Field_14061[this.Field_13402.ordinal()]) {
            case 1: 
            case 2: {
                return this.Field_13401.Field_42668 + n;
            }
            case 3: {
                return this.Field_13401.Field_42670 - n2;
            }
            case 4: {
                return this.Field_13401.Field_42668 + n2;
            }
        }
        return n;
    }

    protected abstract void Method_13417(Class_1699 var1);

    public void Method_13418(int n, int n2, int n3) {
        this.Field_13401.Method_42677(n, n2, n3);
    }

    protected void Method_13419(Class_283 class_283, int n, int n2, int n3, Class_42666 class_42666) {
        Class_4751 class_4751 = new Class_4751(this.Method_13416(n, n3), this.Method_13433(n2), this.Method_13404(n, n3));
        if (class_42666.Method_42683(class_4751)) {
            while (!class_283.Method_507(class_4751) && class_4751.\u0000, `() < (17151 & 8703)) {
                class_283.Method_462(class_4751, Class_9265.Field_9351.Method_3293(), 2883 & -12250);
                class_4751 = class_4751.Method_4769();
            }
        }
    }

    protected void Method_13420(Class_283 class_283, Class_42666 class_42666, int n, int n2, int n3, int n4, int n5, int n6, Class_3436 class_3436, boolean bl) {
        float f = n4 - n + (18537 & 8193);
        float f2 = n5 - n2 + (-31903 & 8221);
        float f3 = n6 - n3 + (817 & -9207);
        float f4 = (float)n + f / 2.0f;
        float f5 = (float)n3 + f3 / 2.0f;
        for (int i = n2; i <= n5; ++i) {
            float f6 = (float)(i - n2) / f2;
            for (int j = n; j <= n4; ++j) {
                float f7 = ((float)j - f4) / (f * (35.0f * 0.014285714f));
                for (int k = n3; k <= n6; ++k) {
                    float f8;
                    float f9 = ((float)k - f5) / (f3 * (0.23188406f * 2.15625f));
                    if (bl && this.Method_13412(class_283, j, i, k, class_42666).Method_3442().Method_3373() == Class_3713.Field_3718 || !((f8 = f7 * f7 + f6 * f6 + f9 * f9) <= 11.333333f * 0.09264706f)) continue;
                    this.Method_13428(class_283, class_3436, j, i, k, class_42666);
                }
            }
        }
    }

    protected void Method_13421(Class_283 class_283, Class_42666 class_42666, int n, int n2, int n3, int n4, int n5, int n6) {
        for (int i = n2; i <= n5; ++i) {
            for (int j = n; j <= n4; ++j) {
                for (int k = n3; k <= n6; ++k) {
                    this.Method_13428(class_283, Class_9265.Field_9351.Method_3293(), j, i, k, class_42666);
                }
            }
        }
    }

    public void Method_13422(Class_283 class_283, Class_1699 class_1699) {
        int n;
        if (class_1699.Method_1707("BB")) {
            this.Field_13401 = new Class_42666(class_1699.Method_1701("BB"));
        }
        this.Field_13402 = (n = class_1699.Method_1738("O")) == (-1 & -1) ? null : Class_4595.Method_4628(n);
        this.Field_13403 = class_1699.Method_1738("GD");
        this.Method_13424(class_1699);
    }

    protected boolean Method_13423(Class_283 class_283, Class_42666 class_42666) {
        int n;
        int n2;
        int n3 = Math.max(this.Field_13401.Field_42668 - (17059 & -18407), class_42666.Field_42668);
        int n4 = Math.max(this.Field_13401.Field_42672 - (99 & -10211), class_42666.Field_42672);
        int n5 = Math.max(this.Field_13401.Field_42669 - (-19701 & 2101), class_42666.Field_42669);
        int n6 = Math.min(this.Field_13401.Field_42670 + (-31663 & 45), class_42666.Field_42670);
        int n7 = Math.min(this.Field_13401.Field_42671 + (16451 & 5157), class_42666.Field_42671);
        int n8 = Math.min(this.Field_13401.Field_42667 + (17697 & -28471), class_42666.Field_42667);
        Class_4810 class_4810 = new Class_4810();
        for (n2 = n3; n2 <= n6; ++n2) {
            for (n = n5; n <= n8; ++n) {
                if (class_283.Method_375(class_4810.Method_4814(n2, n4, n)).Method_3442().Method_3373().Method_3758()) {
                    return (9483 & 129) != 0;
                }
                if (!class_283.Method_375(class_4810.Method_4814(n2, n7, n)).Method_3442().Method_3373().Method_3758()) continue;
                return (19465 & 4453) != 0;
            }
        }
        for (n2 = n3; n2 <= n6; ++n2) {
            for (n = n4; n <= n7; ++n) {
                if (class_283.Method_375(class_4810.Method_4814(n2, n, n5)).Method_3442().Method_3373().Method_3758()) {
                    return (20737 & 11961) != 0;
                }
                if (!class_283.Method_375(class_4810.Method_4814(n2, n, n8)).Method_3442().Method_3373().Method_3758()) continue;
                return (16423 & -32247) != 0;
            }
        }
        for (n2 = n5; n2 <= n8; ++n2) {
            for (n = n4; n <= n7; ++n) {
                if (class_283.Method_375(class_4810.Method_4814(n3, n, n2)).Method_3442().Method_3373().Method_3758()) {
                    return (24705 & 2089) != 0;
                }
                if (!class_283.Method_375(class_4810.Method_4814(n6, n, n2)).Method_3442().Method_3373().Method_3758()) continue;
                return (-31485 & 4309) != 0;
            }
        }
        return (-14071 & 34) != 0;
    }

    protected abstract void Method_13424(Class_1699 var1);

    protected void Method_13425(Class_283 class_283, Class_42666 class_42666, int n, int n2, int n3, int n4, int n5, int n6, Class_3436 class_3436, Class_3436 class_34362, boolean bl) {
        for (int i = n2; i <= n5; ++i) {
            for (int j = n; j <= n4; ++j) {
                for (int k = n3; k <= n6; ++k) {
                    if (bl && this.Method_13412(class_283, j, i, k, class_42666).Method_3442().Method_3373() == Class_3713.Field_3718) continue;
                    if (i != n2 && i != n5 && j != n && j != n4 && k != n3 && k != n6) {
                        this.Method_13428(class_283, class_34362, j, i, k, class_42666);
                        continue;
                    }
                    this.Method_13428(class_283, class_3436, j, i, k, class_42666);
                }
            }
        }
    }

    public static Class_13400 Method_13426(List list, Class_42666 class_42666) {
        for (Class_13400 class_13400 : list) {
            if (class_13400.Method_13415() == null || !class_13400.Method_13415().Method_42680(class_42666)) continue;
            return class_13400;
        }
        return null;
    }

    public void Method_13427(Class_13400 class_13400, List list, Random random) {
    }

    protected void Method_13428(Class_283 class_283, Class_3436 class_3436, int n, int n2, int n3, Class_42666 class_42666) {
        Class_4751 class_4751 = new Class_4751(this.Method_13416(n, n3), this.Method_13433(n2), this.Method_13404(n, n3));
        if (class_42666.Method_42683(class_4751)) {
            class_283.Method_462(class_4751, class_3436, 3466 & 29282);
        }
    }

    protected void Method_13429(Class_283 class_283, Class_42666 class_42666, Random random, float f, int n, int n2, int n3, int n4, int n5, int n6, Class_3436 class_3436, Class_3436 class_34362, boolean bl) {
        for (int i = n2; i <= n5; ++i) {
            for (int j = n; j <= n4; ++j) {
                for (int k = n3; k <= n6; ++k) {
                    if (!(random.nextFloat() <= f) || bl && this.Method_13412(class_283, j, i, k, class_42666).Method_3442().Method_3373() == Class_3713.Field_3718) continue;
                    if (i != n2 && i != n5 && j != n && j != n4 && k != n3 && k != n6) {
                        this.Method_13428(class_283, class_34362, j, i, k, class_42666);
                        continue;
                    }
                    this.Method_13428(class_283, class_3436, j, i, k, class_42666);
                }
            }
        }
    }

    public abstract boolean Method_13430(Class_283 var1, Random var2, Class_42666 var3);

    public int Method_13431() {
        return this.Field_13403;
    }

    protected void Method_13432(Class_283 class_283, Class_42666 class_42666, Random random, float f, int n, int n2, int n3, Class_3436 class_3436) {
        if (random.nextFloat() < f) {
            this.Method_13428(class_283, class_3436, n, n2, n3, class_42666);
        }
    }

    protected int Method_13433(int n) {
        return this.Field_13402 == null ? n : n + this.Field_13401.Field_42672;
    }
}

