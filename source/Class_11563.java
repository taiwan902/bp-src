/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Iterator;
import java.util.Random;

public class Class_11563
extends Class_3238 {
    public static final Class_4173 Field_11564;
    public static final Class_4173[] Field_11565;
    public static final Class_4173 Field_11566;
    public static final Class_4173 Field_11567;
    public static final Class_4173 Field_11568;
    public static final Class_4173 Field_11569;

    private static String Method_11570(String string) {
        int n = 26177;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_11563.class, 5);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_11571(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Random random) {
        if (!class_283.Field_306 && class_283.Field_307.nextInt(-31723 & 292) == 0) {
            int n = -16121 & 2180;
            int n2 = 25101 & 3205;
            int n3 = 26635 & 5584;
            block0 : for (int i = -n; i <= n; ++i) {
                for (int j = -n; j <= n; ++j) {
                    for (int k = -1 & -1; k <= (14849 & 16395); ++k) {
                        if (class_283.Method_375(class_4751.Method_4791(i, k, j)).Method_3442() != this || --n2 > 0) continue;
                        n3 = -32637 & 25697;
                        break block0;
                    }
                }
            }
            Class_4595 class_4595 = Class_4595.Method_4642(random);
            Class_4751 class_47512 = class_4751.Method_4769();
            if (class_4595 == Class_4595.Field_4601 && class_4751.\u0000, `() < (8959 & 1535) && class_283.Method_507(class_47512)) {
                if (n3 == 0) {
                    Class_3436 class_34362 = class_3436;
                    Iterator iterator = Class_4662.Field_4663.Method_4672();
                    while (iterator.hasNext()) {
                        Object e = iterator.next();
                        Class_4595 class_45952 = (Class_4595)e;
                        if (!random.nextBoolean() && this.Method_11597(class_283.Method_375(class_47512.Method_4765(class_45952)).Method_3442())) continue;
                        class_34362 = class_34362.Method_3437(Class_11563.Method_11574(class_45952), Boolean.valueOf((64 & 1944) != 0));
                    }
                    if (((Boolean)class_34362.Method_3440(Field_11569)).booleanValue() || ((Boolean)class_34362.Method_3440(Field_11564)).booleanValue() || ((Boolean)class_34362.Method_3440(Field_11568)).booleanValue() || ((Boolean)class_34362.Method_3440(Field_11566)).booleanValue()) {
                        class_283.Method_462(class_47512, class_34362, 5666 & -24553);
                    }
                }
            } else if (class_4595.Method_4640().Method_4581() && !((Boolean)class_3436.Method_3440(Class_11563.Method_11574(class_4595))).booleanValue()) {
                if (n3 == 0) {
                    Class_4751 class_47513 = class_4751.Method_4765(class_4595);
                    Class_3238 class_3238 = class_283.Method_375(class_47513).Method_3442();
                    if (class_3238.Field_3240 == Class_3713.Field_3718) {
                        Class_4595 class_45953 = class_4595.Method_4620();
                        Class_4595 class_45954 = class_4595.Method_4617();
                        boolean bl = (Boolean)class_3436.Method_3440(Class_11563.Method_11574(class_45953));
                        boolean bl2 = (Boolean)class_3436.Method_3440(Class_11563.Method_11574(class_45954));
                        Class_4751 class_47514 = class_47513.Method_4765(class_45953);
                        Class_4751 class_47515 = class_47513.Method_4765(class_45954);
                        if (bl && this.Method_11597(class_283.Method_375(class_47514).Method_3442())) {
                            class_283.Method_462(class_47513, this.\u0000strictfp().Method_3685(Class_11563.Method_11574(class_45953), Boolean.valueOf((18321 & -28607) != 0)), 6178 & 8286);
                        } else if (bl2 && this.Method_11597(class_283.Method_375(class_47515).Method_3442())) {
                            class_283.Method_462(class_47513, this.\u0000strictfp().Method_3685(Class_11563.Method_11574(class_45954), Boolean.valueOf((5 & -9349) != 0)), 12307 & 2090);
                        } else if (bl && class_283.Method_507(class_47514) && this.Method_11597(class_283.Method_375(class_4751.Method_4765(class_45953)).Method_3442())) {
                            class_283.Method_462(class_47514, this.\u0000strictfp().Method_3685(Class_11563.Method_11574(class_4595.Method_4660()), Boolean.valueOf((4705 & 27665) != 0)), -32766 & 11926);
                        } else if (bl2 && class_283.Method_507(class_47515) && this.Method_11597(class_283.Method_375(class_4751.Method_4765(class_45954)).Method_3442())) {
                            class_283.Method_462(class_47515, this.\u0000strictfp().Method_3685(Class_11563.Method_11574(class_4595.Method_4660()), Boolean.valueOf((-24431 & 2599) != 0)), -32630 & 13078);
                        } else if (this.Method_11597(class_283.Method_375(class_47513.Method_4769()).Method_3442())) {
                            class_283.Method_462(class_47513, this.\u0000strictfp(), 526 & 4370);
                        }
                    } else if (class_3238.Field_3240.Method_3769() && class_3238.Method_3319()) {
                        class_283.Method_462(class_4751, class_3436.Method_3437(Class_11563.Method_11574(class_4595), Boolean.valueOf((-14835 & 4339) != 0)), 30723 & 1510);
                    }
                }
            } else if (class_4751.\u0000, `() > (3 & 61)) {
                Class_4751 class_47516 = class_4751.Method_4782();
                Class_3436 class_34363 = class_283.Method_375(class_47516);
                Class_3238 class_3238 = class_34363.Method_3442();
                if (class_3238.Field_3240 == Class_3713.Field_3718) {
                    Class_3436 class_34364 = class_3436;
                    Iterator iterator = Class_4662.Field_4663.Method_4672();
                    while (iterator.hasNext()) {
                        Object e = iterator.next();
                        Class_4595 class_45955 = (Class_4595)e;
                        if (!random.nextBoolean()) continue;
                        class_34364 = class_34364.Method_3437(Class_11563.Method_11574(class_45955), Boolean.valueOf((4096 & 16778) != 0));
                    }
                    if (((Boolean)class_34364.Method_3440(Field_11569)).booleanValue() || ((Boolean)class_34364.Method_3440(Field_11564)).booleanValue() || ((Boolean)class_34364.Method_3440(Field_11568)).booleanValue() || ((Boolean)class_34364.Method_3440(Field_11566)).booleanValue()) {
                        class_283.Method_462(class_47516, class_34364, 18450 & 8299);
                    }
                } else if (class_3238 == this) {
                    Class_3436 class_34365 = class_34363;
                    Iterator iterator = Class_4662.Field_4663.Method_4672();
                    while (iterator.hasNext()) {
                        Object e = iterator.next();
                        Class_4595 class_45956 = (Class_4595)e;
                        Class_4173 class_4173 = Class_11563.Method_11574(class_45956);
                        if (!random.nextBoolean() || !((Boolean)class_3436.Method_3440(class_4173)).booleanValue()) continue;
                        class_34365 = class_34365.Method_3437(class_4173, Boolean.valueOf((17417 & -32095) != 0));
                    }
                    if (((Boolean)class_34365.Method_3440(Field_11569)).booleanValue() || ((Boolean)class_34365.Method_3440(Field_11564)).booleanValue() || ((Boolean)class_34365.Method_3440(Field_11568)).booleanValue() || ((Boolean)class_34365.Method_3440(Field_11566)).booleanValue()) {
                        class_283.Method_462(class_47516, class_34365, 18483 & -31034);
                    }
                }
            }
        }
    }

    public boolean Method_11572(Class_283 class_283, Class_4751 class_4751, Class_4595 class_4595) {
        switch (Class_10301.Field_10302[class_4595.ordinal()]) {
            case 1: {
                return this.Method_11597(class_283.Method_375(class_4751.Method_4769()).Method_3442());
            }
            case 2: 
            case 3: 
            case 4: 
            case 5: {
                return this.Method_11597(class_283.Method_375(class_4751.Method_4765(class_4595.Method_4660())).Method_3442());
            }
        }
        return (-32696 & 16407) != 0;
    }

    public void Method_11573(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Class_3238 class_3238) {
        if (!class_283.Field_306 && !this.Method_11580(class_283, class_4751, class_3436)) {
            this.\u0000strictfp(class_283, class_4751, class_3436, 16425 & 6406);
            class_283.Method_472(class_4751);
        }
    }

    public static Class_4173 Method_11574(Class_4595 class_4595) {
        switch (Class_10301.Field_10302[class_4595.ordinal()]) {
            case 1: {
                return Field_11567;
            }
            case 2: {
                return Field_11569;
            }
            case 3: {
                return Field_11568;
            }
            case 4: {
                return Field_11564;
            }
            case 5: {
                return Field_11566;
            }
        }
        throw new IllegalArgumentException(class_4595 + " is an invalid choice");
    }

    public Class_17531 Method_11575() {
        return Class_17531.Field_17538;
    }

    public int Method_11576(Class_561 class_561, Class_4751 class_4751, int n) {
        return class_561.Method_567(class_4751).Method_17403(class_4751);
    }

    public boolean Method_11577() {
        return (513 & 202) != 0;
    }

    public Class_3436 Method_11578(Class_283 class_283, Class_4751 class_4751, Class_4595 class_4595, float f, float f2, float f3, int n, Class_859 class_859) {
        Class_3436 class_3436 = this.\u0000strictfp().Method_3685(Field_11567, Boolean.valueOf((8704 & -27632) != 0)).Method_3437(Field_11569, Boolean.valueOf((4300 & 8496) != 0)).Method_3437(Field_11564, Boolean.valueOf((21008 & -21342) != 0)).Method_3437(Field_11568, Boolean.valueOf((2048 & 30100) != 0)).Method_3437(Field_11566, Boolean.valueOf((-30300 & 2) != 0));
        return class_4595.Method_4640().Method_4581() ? class_3436.Method_3437(Class_11563.Method_11574(class_4595.Method_4660()), Boolean.valueOf((-30639 & 289) != 0)) : class_3436;
    }

    public Class_11563() {
        super(Class_3713.Field_3725);
        this.\u0000strictfp(this.\u0000strictfp.Method_3867().Method_3437(Field_11567, Boolean.valueOf((8353 & 592) != 0)).Method_3437(Field_11569, Boolean.valueOf((27522 & 8) != 0)).Method_3437(Field_11564, Boolean.valueOf((-32512 & 2048) != 0)).Method_3437(Field_11568, Boolean.valueOf((4103 & 2368) != 0)).Method_3437(Field_11566, Boolean.valueOf((25089 & 5144) != 0)));
        this.\u0000strictfp((-8127 & 1283) != 0);
        this.\u0000strictfp(Class_3987.Field_3995);
    }

    public static int Method_11579(Class_3436 class_3436) {
        int n = -30432 & 12367;
        Class_4173[] arrclass_4173 = Field_11565;
        int n2 = arrclass_4173.length;
        for (int i = 8228 & -32704; i < n2; ++i) {
            Class_4173 class_4173 = arrclass_4173[i];
            if (!((Boolean)class_3436.Method_3440(class_4173)).booleanValue()) continue;
            ++n;
        }
        return n;
    }

    private boolean Method_11580(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436) {
        Class_3436 class_34362 = class_3436;
        Iterator iterator = Class_4662.Field_4663.Method_4672();
        while (iterator.hasNext()) {
            Class_3436 class_34363;
            Object e = iterator.next();
            Class_4595 class_4595 = (Class_4595)e;
            Class_4173 class_4173 = Class_11563.Method_11574(class_4595);
            if (!((Boolean)class_3436.Method_3440(class_4173)).booleanValue() || this.Method_11597(class_283.Method_375(class_4751.Method_4765(class_4595)).Method_3442()) || (class_34363 = class_283.Method_375(class_4751.Method_4769())).Method_3442() == this && ((Boolean)class_34363.Method_3440(class_4173)).booleanValue()) continue;
            class_3436 = class_3436.Method_3437(class_4173, Boolean.valueOf((-31999 & 3170) != 0));
        }
        if (Class_11563.Method_11579(class_3436) == 0) {
            return (8712 & 7588) != 0;
        }
        if (class_34362 != class_3436) {
            class_283.Method_462(class_4751, class_3436, 322 & 2086);
        }
        return (16385 & 8205) != 0;
    }

    public void Method_11581(Class_561 class_561, Class_4751 class_4751) {
        float f = 0.013157895f * 4.75f;
        float f2 = 1.0f;
        float f3 = 1.0f;
        float f4 = 1.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        int n = 3316 & 28673;
        if (((Boolean)class_561.Method_568(class_4751).Method_3440(Field_11566)).booleanValue()) {
            f5 = Math.max(f5, 0.8681319f * 0.07199367f);
            f2 = 0.0f;
            f3 = 0.0f;
            f6 = 1.0f;
            f4 = 0.0f;
            f7 = 1.0f;
            n = 21817 & -32637;
        }
        if (((Boolean)class_561.Method_568(class_4751).Method_3440(Field_11564)).booleanValue()) {
            f2 = Math.min(f2, 0.39175257f * 2.3930922f);
            f5 = 1.0f;
            f3 = 0.0f;
            f6 = 1.0f;
            f4 = 0.0f;
            f7 = 1.0f;
            n = -26559 & 33;
        }
        if (((Boolean)class_561.Method_568(class_4751).Method_3440(Field_11569)).booleanValue()) {
            f7 = Math.max(f7, 0.1594203f * 0.39204544f);
            f4 = 0.0f;
            f2 = 0.0f;
            f5 = 1.0f;
            f3 = 0.0f;
            f6 = 1.0f;
            n = 17737 & -24447;
        }
        if (((Boolean)class_561.Method_568(class_4751).Method_3440(Field_11568)).booleanValue()) {
            f4 = Math.min(f4, 2.0f * 0.46875f);
            f7 = 1.0f;
            f2 = 0.0f;
            f5 = 1.0f;
            f3 = 0.0f;
            f6 = 1.0f;
            n = 18773 & 5251;
        }
        if (n == 0 && this.Method_11597(class_561.Method_568(class_4751.Method_4769()).Method_3442())) {
            f3 = Math.min(f3, 5.5f * 0.17045455f);
            f6 = 1.0f;
            f2 = 0.0f;
            f5 = 1.0f;
            f4 = 0.0f;
            f7 = 1.0f;
        }
        this.\u0000strictfp(f2, f3, f4, f5, f6, f7);
    }

    private static String Method_11582(String string) {
        int n = 23062;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_11563.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public int Method_11583(Class_3436 class_3436) {
        int n = 74 & -15712;
        if (((Boolean)class_3436.Method_3440(Field_11568)).booleanValue()) {
            n |= 14465 & 1097;
        }
        if (((Boolean)class_3436.Method_3440(Field_11566)).booleanValue()) {
            n |= -30718 & 5766;
        }
        if (((Boolean)class_3436.Method_3440(Field_11569)).booleanValue()) {
            n |= 11269 & 12;
        }
        if (((Boolean)class_3436.Method_3440(Field_11564)).booleanValue()) {
            n |= 1080 & 2379;
        }
        return n;
    }

    public boolean Method_11584(Class_283 class_283, Class_4751 class_4751) {
        return (-32765 & 1281) != 0;
    }

    public Class_3436 Method_11585(int n) {
        return this.\u0000strictfp().Method_3685(Field_11568, Boolean.valueOf(((n & (-32637 & 1537)) > 0 ? -14079 & 4141 : 80 & 8201) != 0)).Method_3437(Field_11566, Boolean.valueOf(((n & (-15358 & 6530)) > 0 ? 2067 & 16645 : 12424 & 4) != 0)).Method_3437(Field_11569, Boolean.valueOf(((n & (-28348 & 8333)) > 0 ? 593 & 35 : 1026 & -29952) != 0)).Method_3437(Field_11564, Boolean.valueOf(((n & (2794 & -12003)) > 0 ? 7185 & -16181 : 1540 & 16424) != 0));
    }

    public int Method_11586() {
        return Class_12135.Method_12139();
    }

    private static String Method_11587(String string) {
        int n = 2520;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_11563.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_11588() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private static String Method_11589(String string) {
        int n = 16624;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_11563.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public int Method_11590(Class_3436 class_3436) {
        return Class_12135.Method_12139();
    }

    protected Class_3855 Method_11591() {
        Class_3538[] arrclass_3538 = new Class_3538[1397 & 7];
        arrclass_3538[12833 & -30456] = Field_11567;
        arrclass_3538[2099 & 8257] = Field_11569;
        arrclass_3538[16426 & 8967] = Field_11564;
        arrclass_3538[4803 & 1043] = Field_11568;
        arrclass_3538[13317 & 16438] = Field_11566;
        return new Class_3855(this, arrclass_3538);
    }

    public void Method_11592(Class_283 class_283, Class_626 class_626, Class_4751 class_4751, Class_3436 class_3436, Class_4879 class_4879) {
        if (!class_283.Field_306 && class_626.Method_792() != null && class_626.Method_792().Method_23844() == Class_10527.Field_10606) {
            class_626.Method_750(Class_19863.Field_19891[Class_3238.Method_3435(this)]);
            Class_11563.\u0000strictfp((Class_283)class_283, (Class_4751)class_4751, (Class_23823)new Class_23823(Class_9265.Field_9323, 105 & 10515, -31167 & 2074));
        } else {
            super.Method_3301(class_283, class_626, class_4751, class_3436, class_4879);
        }
    }

    public boolean Method_11593() {
        return (-32768 & 3074) != 0;
    }

    static {
        Field_11567 = Class_4173.Method_4177(Class_11563.Method_11587("\u41e2\u41e7"));
        Field_11569 = Class_4173.Method_4177(Class_11563.Method_11589("\u3000\u3000\u3012\u3010\u3002"));
        Field_11564 = Class_4173.Method_4177(Class_11563.Method_11582("\u1409\u1408\u1409\u1409"));
        Field_11568 = Class_4173.Method_4177(Class_11563.Method_11598("\u09c8\u09d1\u09ca\u09cb\u09d0"));
        Field_11566 = Class_4173.Method_4177(Class_11563.Method_11570("\u4025\u4037\u4023\u4024"));
        Class_4173[] arrclass_4173 = new Class_4173[5 & -2521];
        arrclass_4173[0 & 11545] = Field_11567;
        arrclass_4173[18497 & 8217] = Field_11569;
        arrclass_4173[12586 & 3222] = Field_11568;
        arrclass_4173[8835 & 4423] = Field_11566;
        arrclass_4173[2181 & 1644] = Field_11564;
        Field_11565 = arrclass_4173;
    }

    public Class_3436 Method_11594(Class_3436 class_3436, Class_561 class_561, Class_4751 class_4751) {
        return class_3436.Method_3437(Field_11567, Boolean.valueOf(class_561.Method_568(class_4751.Method_4769()).Method_3442().Method_3312()));
    }

    public Class_1956 Method_11595(Class_3436 class_3436, Random random, int n) {
        return null;
    }

    public int Method_11596(Random random) {
        return 2465 & -32688;
    }

    private boolean Method_11597(Class_3238 class_3238) {
        return (class_3238.Method_3319() && class_3238.Field_3240.Method_3761() ? -16255 & 537 : 9034 & 180) != 0;
    }

    private static String Method_11598(String string) {
        int n = 17351;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_11563.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_10997 Method_11599(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436) {
        return null;
    }

    public void Method_11600() {
        this.\u0000strictfp(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
    }
}

