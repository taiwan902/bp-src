/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Class_17176
extends Class_3238 {
    public static final Class_3957 Field_17177 = Class_3957.Method_3963(Class_17176.Method_17205("\u5600\u5600\u560c\u5609\u5604"), Class_30881.class);
    private boolean Field_17178 = 12941 & -16383;
    public static final Class_3957 Field_17179;
    public static final Class_3957 Field_17180;
    public static final Class_3957 Field_17181;
    public static final Class_4394 Field_17182;
    private final Set Field_17183 = Sets.newHashSet();

    public int Method_17184(Class_3436 class_3436) {
        return (Integer)class_3436.Method_3440(Field_17182);
    }

    public boolean Method_17185() {
        return this.Field_17178;
    }

    private void Method_17186() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public int Method_17187(Class_561 class_561, Class_4751 class_4751, int n) {
        Class_3436 class_3436 = class_561.Method_568(class_4751);
        return class_3436.Method_3442() != this ? super.Method_3302(class_561, class_4751, n) : this.Method_17193((Integer)class_3436.Method_3440(Field_17182));
    }

    private int Method_17188(Class_283 class_283, Class_4751 class_4751, int n) {
        if (class_283.Method_375(class_4751).Method_3442() != this) {
            return n;
        }
        int n2 = (Integer)class_283.Method_375(class_4751).Method_3440(Field_17182);
        return n2 > n ? n2 : n;
    }

    private static String Method_17189(String string) {
        int n = 11961;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_17176.class, 5);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_17190(String string) {
        int n = 12353;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_17176.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_17191(String string) {
        int n = 253;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_17176.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_17192(String string) {
        int n = 143;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_17176.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private int Method_17193(int n) {
        float f = (float)n / (3.0333333f * 4.945055f);
        float f2 = f * (0.73770493f * 0.81333333f) + 0.06913581f * 5.785714f;
        if (n == 0) {
            f2 = 3.0f * 0.1f;
        }
        float f3 = f * f * (1.1136364f * 0.6285714f) - 1.7142857f * 0.29166666f;
        float f4 = f * f * (1.4444444f * 0.41538465f) - 0.3974359f * 1.7612903f;
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        if (f4 < 0.0f) {
            f4 = 0.0f;
        }
        int n2 = Class_13337.Method_13367((int)(f2 * (11.333333f * 22.5f)), -29427 & 242, 255 & -16129);
        int n3 = Class_13337.Method_13367((int)(f3 * (22.666666f * 11.25f)), 267 & 14336, 8447 & 4351);
        int n4 = Class_13337.Method_13367((int)(f4 * (353.35715f * 0.72164947f)), 10665 & 20, -16129 & 7935);
        return -11930528 & -6288768 | n2 << (20756 & -29637) | n3 << (-32760 & 16904) | n4;
    }

    private Class_30881 Method_17194(Class_561 class_561, Class_4751 class_4751, Class_4595 class_4595) {
        Class_4751 class_47512 = class_4751.Method_4765(class_4595);
        Class_3238 class_3238 = class_561.Method_568(class_4751.Method_4765(class_4595)).Method_3442();
        if (!(Class_17176.Method_17210(class_561.Method_568(class_47512), class_4595) || !class_3238.Method_3312() && Class_17176.Method_17207(class_561.Method_568(class_47512.Method_4782())))) {
            Class_3238 class_32382 = class_561.Method_568(class_4751.Method_4769()).Method_3442();
            return !class_32382.Method_3312() && class_3238.Method_3312() && Class_17176.Method_17207(class_561.Method_568(class_47512.Method_4769())) ? Class_30881.Field_30886 : Class_30881.Field_30883;
        }
        return Class_30881.Field_30885;
    }

    public void Method_17195(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436) {
        super.Method_3357(class_283, class_4751, class_3436);
        if (!class_283.Field_306) {
            Object object = Class_4595.Field_4600;
            int n = ((Class_4595[])object).length;
            for (int i = 3088 & 321; i < n; ++i) {
                Class_4595 class_4595 = object[i];
                class_283.Method_525(class_4751.Method_4765(class_4595), this);
            }
            this.Method_17199(class_283, class_4751, class_3436);
            object = Class_4662.Field_4663.Method_4672();
            while (object.hasNext()) {
                Object e = object.next();
                this.Method_17208(class_283, class_4751.Method_4765((Class_4595)e));
            }
            object = Class_4662.Field_4663.Method_4672();
            while (object.hasNext()) {
                Object e = object.next();
                Class_4751 class_47512 = class_4751.Method_4765((Class_4595)e);
                if (class_283.Method_375(class_47512).Method_3442().Method_3400()) {
                    this.Method_17208(class_283, class_47512.Method_4769());
                    continue;
                }
                this.Method_17208(class_283, class_47512.Method_4782());
            }
        }
    }

    public boolean Method_17196() {
        return (2340 & 9240) != 0;
    }

    public void Method_17197(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Random random) {
        int n = (Integer)class_3436.Method_3440(Field_17182);
        if (n != 0) {
            double d = (double)class_4751.\u0000= final() + 1.265625 * 0.3950617283950617 + ((double)random.nextFloat() - 2.4375 * 0.20512820512820512) * (1.2203389830508475 * 0.1638888888888889);
            double d2 = (float)class_4751.\u0000, `() + 1.34375f * 0.046511628f;
            double d3 = (double)class_4751.\u0000strictfp() + 0.19148936170212766 * 2.611111111111111 + ((double)random.nextFloat() - 0.25 * 2.0) * (1.0444444444444445 * 0.19148936170212766);
            float f = (float)n / (55.384613f * 0.27083334f);
            float f2 = f * (2.9230769f * 0.20526317f) + 0.1015873f * 3.9375f;
            float f3 = Math.max(0.0f, f * f * (11.725f * 0.05970149f) - 0.034246575f * 14.6f);
            float f4 = Math.max(0.0f, f * f * (0.92608696f * 0.64788735f) - 0.4390244f * 1.5944444f);
            class_283.Method_407(Class_40274.Field_40297, d, d2, d3, f2, f3, f4, new int[8651 & 2048]);
        }
    }

    public boolean Method_17198(Class_283 class_283, Class_4751 class_4751) {
        return (Class_283.Method_538(class_283, class_4751.Method_4782()) || class_283.Method_375(class_4751.Method_4782()).Method_3442() == Class_9265.Field_9334 ? 285 & -7167 : 19658 & -31980) != 0;
    }

    private Class_3436 Method_17199(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436) {
        class_3436 = this.Method_17203(class_283, class_4751, class_4751, class_3436);
        ArrayList arrayList = Lists.newArrayList((Iterable)this.Field_17183);
        this.Field_17183.clear();
        for (Class_4751 class_47512 : arrayList) {
            class_283.Method_525(class_47512, this);
        }
        return class_3436;
    }

    public Class_1956 Method_17200(Class_283 class_283, Class_4751 class_4751) {
        return Class_10527.Field_10564;
    }

    public Class_17176() {
        super(Class_3713.Field_3751);
        this.\u0000strictfp(this.\u0000strictfp.Method_3867().Method_3437(Field_17177, (Comparable)((Object)Class_30881.Field_30883)).Method_3437(Field_17181, (Comparable)((Object)Class_30881.Field_30883)).Method_3437(Field_17180, (Comparable)((Object)Class_30881.Field_30883)).Method_3437(Field_17179, (Comparable)((Object)Class_30881.Field_30883)).Method_3437(Field_17182, Integer.valueOf(4619 & -24092)));
        this.\u0000strictfp(0.0f, 0.0f, 0.0f, 1.0f, 1.5f * 0.041666668f, 1.0f);
    }

    public Class_17531 Method_17201() {
        return Class_17531.Field_17538;
    }

    protected static boolean Method_17202(Class_561 class_561, Class_4751 class_4751) {
        return Class_17176.Method_17207(class_561.Method_568(class_4751));
    }

    private Class_3436 Method_17203(Class_283 class_283, Class_4751 class_4751, Class_4751 class_47512, Class_3436 class_3436) {
        Object object;
        Class_3436 class_34362 = class_3436;
        int n = (Integer)class_3436.Method_3440(Field_17182);
        int n2 = 8581 & 16402;
        n2 = this.Method_17188(class_283, class_47512, n2);
        this.Field_17178 = 2112 & 26172;
        int n3 = class_283.Method_494(class_4751);
        this.Field_17178 = 75 & 4741;
        if (n3 > 0 && n3 > n2 - (16613 & 1793)) {
            n2 = n3;
        }
        int n4 = 1028 & 194;
        Class_4595[] arrclass_4595 = Class_4662.Field_4663.Method_4672();
        while (arrclass_4595.hasNext()) {
            int n5;
            Object e = arrclass_4595.next();
            Class_4595 class_4595 = (Class_4595)e;
            object = class_4751.Method_4765(class_4595);
            int n6 = n5 = object.\u0000= final() != class_47512.\u0000= final() || object.\u0000strictfp() != class_47512.\u0000strictfp() ? 9861 & -16365 : 25924 & 2080;
            if (n5 != 0) {
                n4 = this.Method_17188(class_283, (Class_4751)object, n4);
            }
            if (class_283.Method_375((Class_4751)object).Method_3442().Method_3400() && !class_283.Method_375(class_4751.Method_4769()).Method_3442().Method_3400()) {
                if (n5 == 0 || class_4751.\u0000, `() < class_47512.\u0000, `()) continue;
                n4 = this.Method_17188(class_283, ((Class_4751)object).Method_4769(), n4);
                continue;
            }
            if (class_283.Method_375((Class_4751)object).Method_3442().Method_3400() || n5 == 0 || class_4751.\u0000, `() > class_47512.\u0000, `()) continue;
            n4 = this.Method_17188(class_283, ((Class_4751)object).Method_4782(), n4);
        }
        n2 = n4 > n2 ? n4 - (-30461 & 5) : (n2 > 0 ? --n2 : 672 & 343);
        if (n3 > n2 - (69 & 2433)) {
            n2 = n3;
        }
        if (n != n2) {
            class_3436 = class_3436.Method_3437(Field_17182, Integer.valueOf(n2));
            if (class_283.Method_375(class_4751) == class_34362) {
                class_283.Method_462(class_4751, class_3436, 34 & -5686);
            }
            this.Field_17183.add(class_4751);
            arrclass_4595 = Class_4595.Field_4600;
            int n7 = arrclass_4595.length;
            for (int i = 10504 & 17955; i < n7; ++i) {
                object = arrclass_4595[i];
                this.Field_17183.add(class_4751.Method_4765((Class_4595)object));
            }
        }
        return class_3436;
    }

    public Class_1956 Method_17204(Class_3436 class_3436, Random random, int n) {
        return Class_10527.Field_10564;
    }

    private static String Method_17205(String string) {
        int n = 19430;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_17176.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_10997 Method_17206(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436) {
        return null;
    }

    protected static boolean Method_17207(Class_3436 class_3436) {
        return Class_17176.Method_17210(class_3436, null);
    }

    private void Method_17208(Class_283 class_283, Class_4751 class_4751) {
        if (class_283.Method_375(class_4751).Method_3442() == this) {
            class_283.Method_525(class_4751, this);
            Class_4595[] arrclass_4595 = Class_4595.Field_4600;
            int n = arrclass_4595.length;
            for (int i = 8456 & 4611; i < n; ++i) {
                Class_4595 class_4595 = arrclass_4595[i];
                class_283.Method_525(class_4751.Method_4765(class_4595), this);
            }
        }
    }

    protected Class_3855 Method_17209() {
        Class_3538[] arrclass_3538 = new Class_3538[-24249 & 20509];
        arrclass_3538[8481 & 16524] = Field_17177;
        arrclass_3538[-27419 & 267] = Field_17181;
        arrclass_3538[6147 & -22926] = Field_17180;
        arrclass_3538[-16061 & 8211] = Field_17179;
        arrclass_3538[-31852 & 22540] = Field_17182;
        return new Class_3855(this, arrclass_3538);
    }

    protected static boolean Method_17210(Class_3436 class_3436, Class_4595 class_4595) {
        Class_3238 class_3238 = class_3436.Method_3442();
        if (class_3238 == Class_9265.Field_9443) {
            return (-32535 & 513) != 0;
        }
        if (Class_9265.Field_9374.\u0000, `(class_3238)) {
            Class_4595 class_45952 = (Class_4595)((Object)class_3436.Method_3440(Class_23956.\u0000strictfp));
            return (class_45952 == class_4595 || class_45952.Method_4660() == class_4595 ? 4857 & 3075 : 608 & -3833) != 0;
        }
        return (class_3238.Method_3322() && class_4595 != null ? -32143 & 8459 : 968 & 31782) != 0;
    }

    static {
        Field_17181 = Class_3957.Method_3963(Class_17176.Method_17190("\u5c10\u5c10\u5c02\u5c02"), Class_30881.class);
        Field_17180 = Class_3957.Method_3963(Class_17176.Method_17191("\u3355\u3340\u3353\u3353\u3344"), Class_30881.class);
        Field_17179 = Class_3957.Method_3963(Class_17176.Method_17192("\u0000\u0000\u0006\u0003"), Class_30881.class);
        Field_17182 = Class_4394.Method_4401(Class_17176.Method_17189("\u0253\u0241\u0252\u0241\u0255"), 2560 & -23286, 2063 & -27617);
    }

    private boolean Method_17211(Class_561 class_561, Class_4751 class_4751, Class_4595 class_4595) {
        Class_4751 class_47512 = class_4751.Method_4765(class_4595);
        Class_3436 class_3436 = class_561.Method_568(class_47512);
        Class_3238 class_3238 = class_3436.Method_3442();
        boolean bl = class_3238.Method_3400();
        boolean bl2 = class_561.Method_568(class_4751.Method_4769()).Method_3442().Method_3400();
        return (!bl2 && bl && Class_17176.Method_17202(class_561, class_47512.Method_4769()) ? 1489 & -28127 : (Class_17176.Method_17210(class_3436, class_4595) ? 5249 & 8307 : (class_3238 == Class_9265.Field_9391 && class_3436.Method_3440(Class_20678.\u0000strictfp) == class_4595 ? 19715 & 12937 : (!bl && Class_17176.Method_17202(class_561, class_47512.Method_4782()) ? -32491 & 6185 : -12728 & 8467)))) != 0;
    }

    public void Method_17212(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436) {
        if (!class_283.Field_306) {
            Object e;
            Class_4595 class_4595;
            this.Method_17199(class_283, class_4751, class_3436);
            Iterator iterator = Class_4662.Field_4665.Method_4672();
            while (iterator.hasNext()) {
                e = iterator.next();
                class_283.Method_525(class_4751.Method_4765((Class_4595)e), this);
            }
            iterator = Class_4662.Field_4663.Method_4672();
            while (iterator.hasNext()) {
                e = iterator.next();
                class_4595 = (Class_4595)e;
                this.Method_17208(class_283, class_4751.Method_4765(class_4595));
            }
            iterator = Class_4662.Field_4663.Method_4672();
            while (iterator.hasNext()) {
                e = iterator.next();
                class_4595 = (Class_4595)e;
                Class_4751 class_47512 = class_4751.Method_4765(class_4595);
                if (class_283.Method_375(class_47512).Method_3442().Method_3400()) {
                    this.Method_17208(class_283, class_47512.Method_4769());
                    continue;
                }
                this.Method_17208(class_283, class_47512.Method_4782());
            }
        }
    }

    public int Method_17213(Class_561 class_561, Class_4751 class_4751, Class_3436 class_3436, Class_4595 class_4595) {
        if (!this.Field_17178) {
            return 2817 & 1036;
        }
        int n = (Integer)class_3436.Method_3440(Field_17182);
        if (n == 0) {
            return -24488 & 1440;
        }
        if (class_4595 == Class_4595.Field_4601) {
            return n;
        }
        EnumSet<Class_4595> enumSet = EnumSet.noneOf(Class_4595.class);
        Iterator iterator = Class_4662.Field_4663.Method_4672();
        while (iterator.hasNext()) {
            Object e = iterator.next();
            Class_4595 class_45952 = (Class_4595)e;
            if (!this.Method_17211(class_561, class_4751, class_45952)) continue;
            enumSet.add(class_45952);
        }
        if (class_4595.Method_4640().Method_4581() && enumSet.isEmpty()) {
            return n;
        }
        if (enumSet.contains(class_4595) && !enumSet.contains(class_4595.Method_4617()) && !enumSet.contains(class_4595.Method_4620())) {
            return n;
        }
        return -26623 & 292;
    }

    public int Method_17214(Class_561 class_561, Class_4751 class_4751, Class_3436 class_3436, Class_4595 class_4595) {
        return !this.Field_17178 ? 1088 & 24744 : this.Method_17213(class_561, class_4751, class_3436, class_4595);
    }

    public boolean Method_17215() {
        return (-23975 & 3366) != 0;
    }

    public Class_3436 Method_17216(Class_3436 class_3436, Class_561 class_561, Class_4751 class_4751) {
        class_3436 = class_3436.Method_3437(Field_17179, (Comparable)((Object)this.Method_17194(class_561, class_4751, Class_4595.Field_4602)));
        class_3436 = class_3436.Method_3437(Field_17181, (Comparable)((Object)this.Method_17194(class_561, class_4751, Class_4595.Field_4603)));
        class_3436 = class_3436.Method_3437(Field_17177, (Comparable)((Object)this.Method_17194(class_561, class_4751, Class_4595.Field_4598)));
        class_3436 = class_3436.Method_3437(Field_17180, (Comparable)((Object)this.Method_17194(class_561, class_4751, Class_4595.Field_4613)));
        return class_3436;
    }

    public void Method_17217(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Class_3238 class_3238) {
        if (!class_283.Field_306) {
            if (this.Method_17198(class_283, class_4751)) {
                this.Method_17199(class_283, class_4751, class_3436);
            } else {
                this.\u0000strictfp(class_283, class_4751, class_3436, 804 & 1024);
                class_283.Method_472(class_4751);
            }
        }
    }

    public Class_3436 Method_17218(int n) {
        return this.\u0000strictfp().Method_3685(Field_17182, Integer.valueOf(n));
    }
}

