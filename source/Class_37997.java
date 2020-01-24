/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Iterator;

public class Class_37997
extends Class_31144 {
    public Class_33358 Field_37998;
    public Class_14246[] Field_37999;
    public static String[] Field_38000;
    public static String[] Field_38001;

    private static String Method_38002(String string) {
        int n = 32756;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_37997.class, 8);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_38003(String string) {
        int n = 2185;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_37997.class, 12);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_38004(String string) {
        int n = 7962;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_37997.class, 14);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_14246 Method_38005(int n) {
        return this.Field_37999[n];
    }

    protected int Method_38006() {
        return super.\u0000strictfp() + (-24561 & 47) + (2170 & 1443);
    }

    private static String Method_38007(String string) {
        int n = 29294;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_37997.class, 17);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_38008(String string) {
        int n = 23494;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_37997.class, 10);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_38009(String string) {
        int n = 28687;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_37997.class, 11);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_38010(String string) {
        int n = 11209;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_37997.class, 9);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_38011(String string) {
        int n = 9684;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_37997.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_37997(Class_33358 class_33358, Class_18 class_18) {
        super(class_18, class_33358.\u0000= final, class_33358.\u0000, `, 5600 & -30168, class_33358.\u0000, ` - (97 & 16432), -20261 & 60);
        this.Field_37998 = class_33358;
        int n = 6455 & -31670;
        ArrayList<Class_14246> arrayList = new ArrayList<Class_14246>();
        Class_19364[] arrclass_19364 = Class_19364.Method_19381();
        int n2 = arrclass_19364.length;
        for (int i = 25134 & 208; i < n2; ++i) {
            Class_19364 class_19364 = arrclass_19364[i];
            arrayList.add(new Class_28217(this, class_19364));
            Iterator iterator = class_33358.\u0000strictfp.Field_84.Field_39732.Field_8868.iterator();
            while (iterator.hasNext()) {
                ArrayList<Class_11220> arrayList2 = new ArrayList<Class_11220>();
                for (int j = 3473 & 32; j < n && iterator.hasNext(); ++j) {
                    Class_11220 class_11220 = (Class_11220)iterator.next();
                    if (class_11220.Method_11241() == class_19364) {
                        arrayList2.add(class_11220);
                        continue;
                    }
                    --j;
                }
                Class_28000 class_28000 = new Class_28000(class_33358, arrayList2.toArray(new Class_11220[-28079 & 17836]));
                arrayList.add(class_28000);
            }
        }
        this.Field_37999 = arrayList.toArray(new Class_14246[-31607 & 10754]);
    }

    private static String Method_38012(String string) {
        int n = 17333;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_37997.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    static Class_18 Method_38013(Class_37997 class_37997) {
        return class_37997.\u0000, `;
    }

    static Class_18 Method_38014(Class_37997 class_37997) {
        return class_37997.\u0000, `;
    }

    private static String Method_38015(String string) {
        int n = 6537;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_37997.class, 15);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_38016() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, Class_37997.Method_38007("\u0000\u0000\"\u0002$$&&  \u0002\"$$"));
    }

    private static String Method_38017(String string) {
        int n = 11570;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_37997.class, 5);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_38018(String string) {
        int n = 14254;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_37997.class, 16);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    protected int Method_38019() {
        return this.Field_37999.length;
    }

    public boolean Method_38020(int n, int n2, int n3) {
        int n4;
        if (this.\u0000, `(n2) && (n4 = this.\u0000strictfp(n, n2)) >= 0) {
            int n5 = this.\u0000= package + this.\u0000, ` / (-15870 & 6410) - this.Method_38026() / (2850 & 16414) + (-32726 & 28866);
            int n6 = this.\u0000% + (-32740 & 518) - this.\u0000= switch() + n4 * this.\u0000= int + this.\u0000, #;
            int n7 = n - n5;
            int n8 = n2 - n6;
            Class_14246 class_14246 = this.Method_38005(n4);
            if (class_14246 instanceof Class_28000 && ((Class_28000)class_14246).Method_28007(n4, n, n2, n3, n7, n8)) {
                this.\u0000, `((128 & -28648) != 0);
                return (513 & 18453) != 0;
            }
        }
        return (16 & -13526) != 0;
    }

    private static String Method_38021(String string) {
        int n = 7709;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_37997.class, 7);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_38022(int n, int n2, float f) {
        this.\u0000
        ();
        if (this.\u0000strictfp) {
            this.\u0000= ` = n;
            this.\u0000switch = n2;
            this.\u0000strictfp();
            int n3 = this.Method_38006();
            int n4 = n3 + (-7313 & 150);
            this.\u0000%();
            Class_16867.Method_16931();
            Class_16867.Method_16954();
            Class_7644 class_7644 = Class_7644.Method_7649();
            Class_22385 class_22385 = class_7644.Method_7648();
            int n5 = this.\u0000= package + this.\u0000, ` / (-8146 & 7810) - this.Method_38026() / (850 & 4138) + (-6894 & 47);
            int n6 = this.\u0000% + (1804 & 4100) - this.\u0000= switch();
            if (this.\u0000%) {
                this.\u0000strictfp(n5, n6, class_7644);
            }
            this.\u0000= final(n5, n6, n, n2);
            Class_16867.Method_16944();
            int n7 = 2398 & 36;
            this.\u0000, `(512 & 2406, this.\u0000%, -9985 & 9215, 8447 & 1279);
            this.\u0000, `(this.\u0000= switch, this.\u0000
            , 767 & -29441, 2303 & 25343);
            Class_16867.Method_16947();
            Class_16867.Method_16984(23395 & 9986, -12413 & 4899, -28416 & 17937, 8365 & -16367);
            Class_16867.Method_16985();
            Class_16867.Method_16972(-25279 & 16129);
            Class_16867.Method_16922();
            class_22385.Method_22417(12679 & -32185, Class_29585.Field_29586);
            class_22385.Method_22443(this.\u0000= package, this.\u0000% + n7, 0.0).Method_22433(0.0, 1.0).Method_22424(8256 & 6944, 17540 & 73, 576 & 19584, 257 & 6184).Method_22451();
            class_22385.Method_22443(this.\u0000= final, this.\u0000% + n7, 0.0).Method_22433(1.0, 1.0).Method_22424(12352 & 16904, 4142 & 1792, -11168 & 411, 2049 & -23520).Method_22451();
            class_22385.Method_22443(this.\u0000= final, this.\u0000%, 0.0).Method_22433(1.0, 0.0).Method_22424(8226 & 16396, 20560 & 420, 8704 & 19652, 511 & -28929).Method_22451();
            class_22385.Method_22443(this.\u0000= package, this.\u0000%, 0.0).Method_22433(0.0, 0.0).Method_22424(796 & 17441, 2128 & 1, 256 & -7627, 3071 & 13567).Method_22451();
            class_7644.Method_7647();
            class_22385.Method_22417(-32761 & 26631, Class_29585.Field_29586);
            class_22385.Method_22443(this.\u0000= package, this.\u0000= switch, 0.0).Method_22433(0.0, 1.0).Method_22424(72 & -13792, 22668 & 8976, 2340 & 29760, 255 & -6401).Method_22451();
            class_22385.Method_22443(this.\u0000= final, this.\u0000= switch, 0.0).Method_22433(1.0, 1.0).Method_22424(128 & 1323, 18688 & 136, -32760 & 24992, 31487 & 255).Method_22451();
            class_22385.Method_22443(this.\u0000= final, this.\u0000= switch - n7, 0.0).Method_22433(1.0, 0.0).Method_22424(8388 & 1, 1024 & 24835, -32636 & 632, 2176 & 8193).Method_22451();
            class_22385.Method_22443(this.\u0000= package, this.\u0000= switch - n7, 0.0).Method_22433(0.0, 0.0).Method_22424(-31616 & 20498, 137 & 560, 5792 & -16320, 16804 & -22462).Method_22451();
            class_7644.Method_7647();
            int n8 = this.\u0000, #();
            if (n8 > 0) {
                int n9 = (this.\u0000= switch - this.\u0000%) * (this.\u0000= switch - this.\u0000%) / this.\u0000
                ();
                n9 = Class_13337.Method_13367(n9, -32608 & 2424, this.\u0000= switch - this.\u0000% - (19054 & 1048));
                int n10 = this.\u0000= switch() * (this.\u0000= switch - this.\u0000% - n9) / n8 + this.\u0000%;
                if (n10 < this.\u0000%) {
                    n10 = this.\u0000%;
                }
                class_22385.Method_22417(-24545 & 71, Class_29585.Field_29586);
                class_22385.Method_22443(n3, this.\u0000= switch, 0.0).Method_22433(0.0, 1.0).Method_22424(18512 & 9220, 10310 & -28536, 8192 & 1030, 2303 & 21503).Method_22451();
                class_22385.Method_22443(n4, this.\u0000= switch, 0.0).Method_22433(1.0, 1.0).Method_22424(1610 & 6288, 2 & -32671, 66 & 9761, 1279 & -5377).Method_22451();
                class_22385.Method_22443(n4, this.\u0000%, 0.0).Method_22433(1.0, 0.0).Method_22424(16 & 4713, 12376 & -32096, 512 & 8344, -32513 & 4351).Method_22451();
                class_22385.Method_22443(n3, this.\u0000%, 0.0).Method_22433(0.0, 0.0).Method_22424(-3563 & 384, 31233 & 36, -24268 & 4097, 2047 & 8447).Method_22451();
                class_7644.Method_7647();
                class_22385.Method_22417(-28641 & 3399, Class_29585.Field_29586);
                class_22385.Method_22443(n3, n10 + n9, 0.0).Method_22433(0.0, 1.0).Method_22424(5256 & 16513, 21650 & -32348, 2177 & 13192, 4863 & -7937).Method_22451();
                class_22385.Method_22443(n4, n10 + n9, 0.0).Method_22433(1.0, 1.0).Method_22424(16612 & -20336, -31576 & 22933, 16530 & -31516, -21249 & 4351).Method_22451();
                class_22385.Method_22443(n4, n10, 0.0).Method_22433(1.0, 0.0).Method_22424(1156 & 393, 18576 & 8578, 6080 & 16528, 8703 & -16129).Method_22451();
                class_22385.Method_22443(n3, n10, 0.0).Method_22433(0.0, 0.0).Method_22424(18593 & 13440, -16254 & 7296, 161 & -14208, -18945 & 2815).Method_22451();
                class_7644.Method_7647();
                class_22385.Method_22417(199 & -24009, Class_29585.Field_29586);
                class_22385.Method_22443(n3, n10 + n9 - (-26607 & 385), 0.0).Method_22433(0.0, 1.0).Method_22424(-30008 & 16593, -11327 & 192, 17376 & 4291, 1535 & 255).Method_22451();
                class_22385.Method_22443(n4 - (33 & 20673), n10 + n9 - (2179 & -31711), 0.0).Method_22433(1.0, 1.0).Method_22424(-32564 & 16608, 192 & 17606, -32272 & 12489, -32513 & 25343).Method_22451();
                class_22385.Method_22443(n4 - (65 & 5545), n10, 0.0).Method_22433(1.0, 0.0).Method_22424(-28992 & 12489, 20673 & 10486, 2252 & 25024, -21249 & 17151).Method_22451();
                class_22385.Method_22443(n3, n10, 0.0).Method_22433(0.0, 0.0).Method_22424(10436 & 216, 10693 & 20704, -7468 & 4577, -30465 & 17151).Method_22451();
                class_7644.Method_7647();
            }
            this.\u0000= final(n, n2);
            Class_16867.Method_16965();
            Class_16867.Method_16972(23840 & 16153);
            Class_16867.Method_16913();
            Class_16867.Method_16952();
        }
    }

    static Class_18 Method_38023(Class_37997 class_37997) {
        return class_37997.\u0000, `;
    }

    static Class_18 Method_38024(Class_37997 class_37997) {
        return class_37997.\u0000, `;
    }

    private static String Method_38025(String string) {
        int n = 16699;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_37997.class, 6);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public int Method_38026() {
        return super.\u0000= final() + (288 & -24416) + (-15292 & 2884);
    }

    private static String Method_38027(String string) {
        int n = 8639;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_37997.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_38028(String string) {
        int n = 7665;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_37997.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_38029(String string) {
        int n = 30512;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_37997.class, 13);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    static {
        String[] arrstring = new String[11530 & 4269];
        arrstring[16404 & 11649] = Class_37997.Method_38011("\u380d\u3821\u382e\u382b\u3824\u3820\u3823\u3907\u390d");
        arrstring[20571 & 8577] = Class_37997.Method_38028("\u0090\u0081\u0090\u0091\u0091\u0090");
        arrstring[2566 & 12291] = Class_37997.Method_38027("\u4984\u49a3\u49a4\u49a1\u49a0\u49a3\u49a2\u49a5\u49ac\u49ad\u49aa\u49ab");
        arrstring[-30397 & 9871] = Class_37997.Method_38012("\u3021\u3006\u3014\u3005\u3006\u3005\u3002\u3013");
        arrstring[4 & 15382] = Class_37997.Method_38017("\u0420\u0407\u0402\u0401\u0402\u0405\u0400\u0405\u040e\u0409");
        arrstring[18823 & 1565] = Class_37997.Method_38025("\u9146\u9143\u9140\u9145\u9140\u9143");
        arrstring[903 & 17430] = Class_37997.Method_38021("\u0010\u0001\u0010\u0001\u0000\u0001\u0010\u0001\b\t\b\t\b\t\b\t\u0000");
        arrstring[23 & -28025] = Class_37997.Method_38002("\u380a\u3808\u3808\u3802");
        Field_38001 = arrstring;
        String[] arrstring2 = new String[-30696 & 8715];
        arrstring2[26156 & 4416] = Class_37997.Method_38010("\u8020\u8002\u8002\u8004\u8002\u8000\u8004\u8006\u8006\u8004");
        arrstring2[1537 & 20639] = Class_37997.Method_38008("\u0700\u0702\u0700\u0702\u0706\u0706");
        arrstring2[-30785 & 16450] = Class_37997.Method_38009("\u1440\u1441\u1440\u1441\u1440\u1441\u1440\u1441\u1448\u1449\u1408\u1409\u1408\u1409");
        arrstring2[4043 & -24521] = Class_37997.Method_38003("\u4490\u44b4\u44a0\u44b5\u44a1\u4488\u44ad\u44b5\u44a0\u44b5\u44a1\u44a4\u44a0\u44a4");
        arrstring2[717 & 5124] = Class_37997.Method_38029("\ua64c\ua642\ua64c\ua646\ua642\ua644\ua64a\ua64e\ua642\ua644");
        arrstring2[1037 & -7737] = Class_37997.Method_38004("\u0380\u0381\u0382\u0383\u0384\u0385\u0386");
        arrstring2[11350 & 17190] = Class_37997.Method_38015("\u9170\u9141\u914b\u9143\u9144\u9154\u914e\u914f\u9141\u9108\u914b\u9143\u9155");
        arrstring2[7 & 17287] = Class_37997.Method_38018("\u44c0\u44c9\u44c0\u44c9\u44cc\u44cd");
        Field_38000 = arrstring2;
    }
}

