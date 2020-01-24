/*
 * Decompiled with CFR 0.145.
 */
import java.awt.geom.Point2D;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.HashMap;

public class Class_19618
extends Class_1490 {
    public int Field_19619;
    public int Field_19620;
    public ArrayList Field_19621 = new ArrayList();
    public HashMap Field_19622 = new HashMap();
    public boolean Field_19623 = 5129 & -16288;
    public Class_37430 Field_19624;

    public Class_19618() {
        this.\u0000strictfp = Class_18.Field_89;
        this.\u0000strictfp = this.\u0000strictfp.Method_270();
        this.\u0000strictfp = this.\u0000strictfp.Field_27;
        this.Method_19628(new Class_38044());
        this.Method_19628(new Class_43454());
        this.Method_19628(new Class_39153());
        this.Method_19628(Class_38196.Field_38285);
        this.Method_19628(new Class_42651());
        this.Method_19628(new Class_40422());
    }

    private static void Method_19625(Class_37430 class_37430) {
        double d = 2.7142857142857144 * 0.0036842105263157894;
        if (class_37430.Field_37443 < d) {
            class_37430.Field_37443 = 0.0;
        } else if (class_37430.Field_37443 > 1.0 - d) {
            class_37430.Field_37443 = 1.0;
        } else if (class_37430.Field_37443 > 0.9 * 0.5555555555555556 - d / (4.545454545454546 * 0.44) && class_37430.Field_37443 < 0.8533333333333334 * 0.5859375 + d / (0.7916666666666667 * 2.526315789473684)) {
            class_37430.Field_37443 = 0.11363636363636363 * 4.4;
        }
        if (class_37430.Field_37444 < d) {
            class_37430.Field_37444 = 0.0;
        } else if (class_37430.Field_37444 > 1.0 - d) {
            class_37430.Field_37444 = 1.0;
        } else if (class_37430.Field_37444 > 2.411764705882353 * 0.20731707317073172 - d / (5.25 * 0.38095238095238093) && class_37430.Field_37444 < 2.272727272727273 * 0.21999999999999997 + d / (6.827586206896552 * 0.29292929292929293)) {
            class_37430.Field_37444 = 0.703125 * 0.7111111111111111;
        }
    }

    protected void Method_19626(int n, int n2, int n3) {
        if (this.Field_19624 != null) {
            if (this.\u0000= final - this.Field_19624.Field_37437 != 0) {
                this.Field_19624.Field_37443 = (double)(n - this.Field_19620) * 1.0 / (double)(this.\u0000= final - this.Field_19624.Field_37437);
            }
            if (this.\u0000, ` - this.Field_19624.Field_37434 != 0) {
                this.Field_19624.Field_37444 = (double)(n2 - this.Field_19619) * 1.0 / (double)(this.\u0000, ` - this.Field_19624.Field_37434);
            }
            if (this.Field_19624.Field_37443 < 0.0) {
                this.Field_19624.Field_37443 = 0.0;
            }
            if (this.Field_19624.Field_37444 < 0.0) {
                this.Field_19624.Field_37444 = 0.0;
            }
            if (this.Field_19624.Field_37443 > 1.0) {
                this.Field_19624.Field_37443 = 1.0;
            }
            if (this.Field_19624.Field_37444 > 1.0) {
                this.Field_19624.Field_37444 = 1.0;
            }
            Class_19618.Method_19625(this.Field_19624);
            this.Field_19624.Method_37448(this.\u0000= final, this.\u0000, `);
            Class_8838 class_8838 = this.\u0000strictfp.Field_84.Field_39732;
            ((HashMap)class_8838.Field_8849.Method_11230()).put(this.Field_19624.Field_37438, new Class_16755(this.Field_19624.Field_37443, this.Field_19624.Field_37444));
            class_8838.Method_9085();
            this.Field_19624 = null;
            if (!class_8838.Field_8849.Method_11245()) {
                class_8838.Field_8873 = 9472 & 17024;
            } else {
                class_8838.Field_8873 = -32509 & 1613;
                for (Class_11220 class_11220 : class_8838.Field_8868) {
                    if (class_11220.Method_11245()) continue;
                    class_8838.Field_8873 = 27207 & 280;
                    break;
                }
            }
        } else {
            super.Method_1518(n, n2, n3);
        }
    }

    protected void Method_19627(int n, int n2, int n3, long l) {
        if (this.Field_19624 == null) {
            super.Method_1542(n, n2, n3, l);
            return;
        }
        if (this.\u0000= final - this.Field_19624.Field_37437 != 0) {
            this.Field_19624.Field_37443 = (double)(n - this.Field_19620) * 1.0 / (double)(this.\u0000= final - this.Field_19624.Field_37437);
        }
        if (this.\u0000, ` - this.Field_19624.Field_37434 != 0) {
            this.Field_19624.Field_37444 = (double)(n2 - this.Field_19619) * 1.0 / (double)(this.\u0000, ` - this.Field_19624.Field_37434);
        }
        if (this.Field_19624.Field_37443 < 0.0) {
            this.Field_19624.Field_37443 = 0.0;
        }
        if (this.Field_19624.Field_37444 < 0.0) {
            this.Field_19624.Field_37444 = 0.0;
        }
        if (this.Field_19624.Field_37443 > 1.0) {
            this.Field_19624.Field_37443 = 1.0;
        }
        if (this.Field_19624.Field_37444 > 1.0) {
            this.Field_19624.Field_37444 = 1.0;
        }
        Class_19618.Method_19625(this.Field_19624);
        this.Field_19624.Method_37448(this.\u0000= final, this.\u0000, `);
    }

    public void Method_19628(Class_37430 class_37430) {
        this.Field_19621.add(class_37430);
        this.Field_19622.put(class_37430.Field_37438, class_37430);
        class_37430.Field_37432 = this.\u0000strictfp;
        try {
            Point2D.Double double_ = (Point2D.Double)((HashMap)Class_18.Field_89.Field_84.Field_39732.Field_8849.Method_11230()).get(class_37430.Field_37438);
            class_37430.Method_37447(double_.x, double_.y);
        }
        catch (NullPointerException nullPointerException) {
            // empty catch block
        }
        class_37430.Field_37439 = class_37430.Field_37432.Field_27;
        class_37430.Method_37446();
    }

    private static String Method_19629(String string) {
        int n = 19274;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19618.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_19630() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, Class_19618.Method_19629("\u0c42\u0c41\u0c60\u0c43\u0c62\u0c63\u0c62\u0c61\u0c68\u0c69\u0c48\u0c69\u0c68\u0c69"));
    }

    public void Method_19631(int n, int n2, float f) {
        if (this.Field_19623) {
            return;
        }
        this.\u0000strictfp.Field_25.Method_2789(Class_19618.Method_19635("\u0ed2\u0ed1\u0ed0\u0ec3\u0ed4\u0ed7\u0ed6\u0ed7\u0ec8\u0ed9"));
        for (Class_37430 class_37430 : this.Field_19621) {
            this.\u0000strictfp.Field_25.Method_2789(class_37430.Field_37438);
            class_37430.Method_37449(n, n2, f);
            this.\u0000strictfp.Field_25.Method_2790();
        }
        this.\u0000strictfp.Field_25.Method_2790();
    }

    public void Method_19632(int n, int n2, float f) {
        this.Field_19623 = 16389 & 8971;
        this.\u0000, 2();
        this.\u0000, `(this.\u0000= final / (4170 & -24010), 8210 & 23552, this.\u0000, `, -1056964609 & 1694498815);
        this.\u0000strictfp(20528 & -31679, this.\u0000= final, this.\u0000, ` / (-32693 & 658), 1258291199 & -788529153);
        for (Class_37430 class_37430 : this.Field_19621) {
            class_37430.Method_37449(this.\u0000= final, this.\u0000, `, f);
            this.Method_19633(class_37430);
        }
    }

    private void Method_19633(Class_37430 class_37430) {
        if (!class_37430.Field_37442) {
            return;
        }
        this.\u0000strictfp(this.\u0000strictfp.Field_27, class_37430.Field_37438, class_37430.Field_37431 + Math.abs(class_37430.Field_37431 - class_37430.Field_37441) / (-32493 & 162), class_37430.Field_37433 + (-31721 & 3021), -1114557 & -1118720);
        this.\u0000strictfp(class_37430.Field_37431 - (1 & 3169), class_37430.Field_37441, class_37430.Field_37436 - (-32511 & 513), -788463852 & -2147090688);
        this.\u0000strictfp(class_37430.Field_37431 - (-31453 & 10449), class_37430.Field_37441, class_37430.Field_37433, -1039859888 & -1459552382);
        this.\u0000, `(class_37430.Field_37431 - (-32751 & 7563), class_37430.Field_37436 - (-29687 & 16631), class_37430.Field_37433, -1543110877 & -1707540736);
        this.\u0000, `(class_37430.Field_37441, class_37430.Field_37436 - (-15103 & 2721), class_37430.Field_37433, -2145058879 & -2046755050);
        int n = class_37430.Field_37431 + class_37430.Field_37437 / (646 & -24558);
        int n2 = class_37430.Field_37436 + class_37430.Field_37434 / (9259 & 82);
        if (class_37430.Field_37443 == 0.5304878048780488 * 0.9425287356321839) {
            n = this.\u0000= final / (-30973 & 82);
        }
        if (class_37430.Field_37444 == 1.3823529411764706 * 0.3617021276595745) {
            n2 = this.\u0000, ` / (2058 & -15449);
        }
        Class_19618.\u0000, `((int)(class_37430.Field_37431 - (16974 & 131)), (int)(n2 - (145 & -31999)), (int)(class_37430.Field_37431 + (137 & 25665)), (int)(n2 + (82 & -32222)), (int)(-2013069439 & -2099118320));
        Class_19618.\u0000, `((int)(class_37430.Field_37441 - (329 & -14813)), (int)(n2 - (775 & 22537)), (int)(class_37430.Field_37441 + (-31602 & 4626)), (int)(n2 + (5506 & 8267)), (int)(-754909433 & -2144206976));
        Class_19618.\u0000, `((int)(n - (-28539 & 25889)), (int)(class_37430.Field_37436 - (-32734 & 18438)), (int)(n + (24066 & -32762)), (int)(class_37430.Field_37436 + (4105 & 1057)), (int)(-530448510 & -1659961596));
        Class_19618.\u0000, `((int)(n - (17507 & 8209)), (int)(class_37430.Field_37433 - (-15935 & 33)), (int)(n + (1839 & -12270)), (int)(class_37430.Field_37433 + (8323 & -28406)), (int)(-496697568 & -2138964070));
    }

    protected void Method_19634(int n, int n2, int n3) {
        for (int i = this.Field_19621.size() - (-25583 & 8963); i >= 0; --i) {
            Class_37430 class_37430 = (Class_37430)this.Field_19621.get(i);
            if (!class_37430.Field_37442 || n < class_37430.Field_37431 || n2 < class_37430.Field_37436 || n >= class_37430.Field_37441 || n2 >= class_37430.Field_37433) continue;
            this.Field_19620 = n - class_37430.Field_37431;
            this.Field_19619 = n2 - class_37430.Field_37436;
            this.Field_19621.remove(i);
            this.Field_19621.add(class_37430);
            this.Field_19624 = class_37430;
            return;
        }
        super.Method_1537(n, n2, n3);
    }

    private static String Method_19635(String string) {
        int n = 5969;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_19618.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_19636() {
        this.Field_19623 = 704 & -3834;
    }
}

