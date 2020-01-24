/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_8151
extends Class_3529 {
    public static final Class_3957 Field_8152;
    public static final Class_4394 Field_8153;

    static {
        Field_8153 = Class_4394.Method_4401(Class_8151.Method_8162("\u158b\u1582\u1580\u1582\u1584\u159e\u159c\u1587\u1582\u1593\u1582"), 18464 & 1539, 16415 & -32497);
        Field_8152 = Class_3957.Method_3963(Class_8151.Method_8160("\ue820\ue821\ue821\ue830\ue820\ue820\ue831\ue831"), Class_45097.class);
    }

    public int Method_8154() {
        return 4107 & -31533;
    }

    private void Method_8155() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_8156(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Class_626 class_626) {
        Class_34660 class_34660;
        super.\u0000strictfp(class_283, class_4751, class_3436, class_626);
        if (class_626.Field_694.Method_18094() && (class_34660 = this.Method_8178(class_283, class_4751)) != null) {
            class_34660.Method_34663(null, 22784 & -23996);
        }
    }

    public Class_8151() {
        super(Class_3713.Field_3751);
        this.\u0000strictfp(this.\u0000strictfp.Method_3867().Method_3437(Field_8152, (Comparable)((Object)Class_45097.Field_45121)).Method_3437(Field_8153, Integer.valueOf(1280 & 4172)));
        this.Method_8161();
    }

    public void Method_8157(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436) {
        Class_34660 class_34660 = this.Method_8178(class_283, class_4751);
        if (class_34660 != null && class_34660.Method_34667() != null) {
            Class_8151.\u0000strictfp((Class_283)class_283, (Class_4751)class_4751, (Class_23823)new Class_23823(class_34660.Method_34667(), 811 & 8405, class_34660.Method_34664()));
        }
        super.Method_3531(class_283, class_4751, class_3436);
    }

    public Class_1956 Method_8158(Class_3436 class_3436, Random random, int n) {
        return Class_10527.Field_10665;
    }

    public int Method_8159(Class_561 class_561, Class_4751 class_4751, int n) {
        Class_1956 class_1956;
        Class_4879 class_4879 = class_561.Method_562(class_4751);
        if (class_4879 instanceof Class_34660 && (class_1956 = ((Class_34660)class_4879).Method_34667()) instanceof Class_41056) {
            return Class_3238.Method_3345(class_1956).Method_3302(class_561, class_4751, n);
        }
        return -2130706433 & 1342177279;
    }

    private static String Method_8160(String string) {
        int n = 18336;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_8151.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_8161() {
        float f = 1.4081633f * 0.26630434f;
        float f2 = f / 2.0f;
        this.\u0000strictfp(0.38659796f * 1.2933333f - f2, 0.0f, 1.245614f * 0.40140843f - f2, 0.2027027f * 2.4666667f + f2, f, 0.45f * 1.1111112f + f2);
    }

    private static String Method_8162(String string) {
        int n = 12471;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_8151.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_3436 Method_8163(Class_3436 class_3436, Class_561 class_561, Class_4751 class_4751) {
        Class_34660 class_34660;
        Class_1956 class_1956;
        Class_45097 class_45097 = Class_45097.Field_45121;
        Class_4879 class_4879 = class_561.Method_562(class_4751);
        if (class_4879 instanceof Class_34660 && (class_1956 = (class_34660 = (Class_34660)class_4879).Method_34667()) instanceof Class_41056) {
            int n = class_34660.Method_34664();
            Class_3238 class_3238 = Class_3238.Method_3345(class_1956);
            if (class_3238 == Class_9265.Field_9389) {
                switch (Class_29896.Field_29898[Class_4231.Method_4259(n).ordinal()]) {
                    case 1: {
                        class_45097 = Class_45097.Field_45104;
                        break;
                    }
                    case 2: {
                        class_45097 = Class_45097.Field_45118;
                        break;
                    }
                    case 3: {
                        class_45097 = Class_45097.Field_45103;
                        break;
                    }
                    case 4: {
                        class_45097 = Class_45097.Field_45098;
                        break;
                    }
                    case 5: {
                        class_45097 = Class_45097.Field_45109;
                        break;
                    }
                    case 6: {
                        class_45097 = Class_45097.Field_45119;
                        break;
                    }
                    default: {
                        class_45097 = Class_45097.Field_45121;
                        break;
                    }
                }
            } else if (class_3238 == Class_9265.Field_9278) {
                switch (n) {
                    case 0: {
                        class_45097 = Class_45097.Field_45116;
                        break;
                    }
                    case 2: {
                        class_45097 = Class_45097.Field_45105;
                        break;
                    }
                    default: {
                        class_45097 = Class_45097.Field_45121;
                        break;
                    }
                }
            } else if (class_3238 == Class_9265.Field_9353) {
                class_45097 = Class_45097.Field_45102;
            } else if (class_3238 == Class_9265.Field_9402) {
                switch (Class_29896.Field_29897[Class_5607.Method_5642(Class_5665.Field_5666, n).ordinal()]) {
                    case 1: {
                        class_45097 = Class_45097.Field_45108;
                        break;
                    }
                    case 2: {
                        class_45097 = Class_45097.Field_45114;
                        break;
                    }
                    case 3: {
                        class_45097 = Class_45097.Field_45099;
                        break;
                    }
                    case 4: {
                        class_45097 = Class_45097.Field_45106;
                        break;
                    }
                    case 5: {
                        class_45097 = Class_45097.Field_45120;
                        break;
                    }
                    case 6: {
                        class_45097 = Class_45097.Field_45110;
                        break;
                    }
                    case 7: {
                        class_45097 = Class_45097.Field_45112;
                        break;
                    }
                    case 8: {
                        class_45097 = Class_45097.Field_45107;
                        break;
                    }
                    case 9: {
                        class_45097 = Class_45097.Field_45111;
                        break;
                    }
                    default: {
                        class_45097 = Class_45097.Field_45121;
                        break;
                    }
                }
            } else if (class_3238 == Class_9265.Field_9429) {
                class_45097 = Class_45097.Field_45100;
            } else if (class_3238 == Class_9265.Field_9312) {
                class_45097 = Class_45097.Field_45101;
            } else if (class_3238 == Class_9265.Field_9397) {
                class_45097 = Class_45097.Field_45116;
            } else if (class_3238 == Class_9265.Field_9405) {
                class_45097 = Class_45097.Field_45113;
            }
        }
        return class_3436.Method_3437(Field_8152, (Comparable)((Object)class_45097));
    }

    public boolean Method_8164(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Class_626 class_626, Class_4595 class_4595, float f, float f2, float f3) {
        Class_23823 class_23823 = class_626.Field_628.Method_37821();
        if (class_23823 != null && class_23823.Method_23844() instanceof Class_41056) {
            Class_34660 class_34660 = this.Method_8178(class_283, class_4751);
            if (class_34660 == null) {
                return (9290 & -32768) != 0;
            }
            if (class_34660.Method_34667() != null) {
                return (-30720 & 5860) != 0;
            }
            Class_3238 class_3238 = Class_3238.Method_3345(class_23823.Method_23844());
            if (!this.Method_8169(class_3238, class_23823.Method_23843())) {
                return (4135 & -30968) != 0;
            }
            class_34660.Method_34663(class_23823.Method_23844(), class_23823.Method_23843());
            class_34660.\u0000, for();
            class_283.Method_416(class_4751);
            class_626.Method_750(Class_19863.Field_19888);
            if (!class_626.Field_694.Method_18094() && (class_23823.Field_23826 -= -32759 & 5463) <= 0) {
                class_626.Field_628.Method_37796(class_626.Field_628.Field_37782, null);
            }
            return (-30207 & 1299) != 0;
        }
        return (6688 & 1226) != 0;
    }

    public boolean Method_8165() {
        return (-16878 & 128) != 0;
    }

    public boolean Method_8166(Class_283 class_283, Class_4751 class_4751) {
        return (super.\u0000, `(class_283, class_4751) && Class_283.Method_538(class_283, class_4751.Method_4782()) ? 25233 & 2409 : 10256 & 521) != 0;
    }

    public boolean Method_8167() {
        return (-23734 & 5284) != 0;
    }

    public boolean Method_8168() {
        return (3589 & 329) != 0;
    }

    private boolean Method_8169(Class_3238 class_3238, int n) {
        return (class_3238 != Class_9265.Field_9353 && class_3238 != Class_9265.Field_9402 && class_3238 != Class_9265.Field_9405 && class_3238 != Class_9265.Field_9312 && class_3238 != Class_9265.Field_9429 && class_3238 != Class_9265.Field_9389 && class_3238 != Class_9265.Field_9397 ? (class_3238 == Class_9265.Field_9278 && n == Class_5341.Field_5348.Method_5356() ? 21637 & 2561 : 10944 & 12) : 18569 & 1619) != 0;
    }

    public String Method_8170() {
        return Class_7594.Method_7602("item.flowerPot.name");
    }

    public int Method_8171(Class_3436 class_3436) {
        return (Integer)class_3436.Method_3440(Field_8153);
    }

    public Class_4879 Method_8172(Class_283 class_283, int n) {
        Class_3238 class_3238 = null;
        int n2 = -32768 & 26752;
        switch (n) {
            case 1: {
                class_3238 = Class_9265.Field_9402;
                n2 = Class_5607.Field_5613.Method_5652();
                break;
            }
            case 2: {
                class_3238 = Class_9265.Field_9353;
                break;
            }
            case 3: {
                class_3238 = Class_9265.Field_9389;
                n2 = Class_4231.Field_4238.Method_4247();
                break;
            }
            case 4: {
                class_3238 = Class_9265.Field_9389;
                n2 = Class_4231.Field_4236.Method_4247();
                break;
            }
            case 5: {
                class_3238 = Class_9265.Field_9389;
                n2 = Class_4231.Field_4242.Method_4247();
                break;
            }
            case 6: {
                class_3238 = Class_9265.Field_9389;
                n2 = Class_4231.Field_4235.Method_4247();
                break;
            }
            case 7: {
                class_3238 = Class_9265.Field_9429;
                break;
            }
            case 8: {
                class_3238 = Class_9265.Field_9312;
                break;
            }
            case 9: {
                class_3238 = Class_9265.Field_9405;
                break;
            }
            case 10: {
                class_3238 = Class_9265.Field_9397;
                break;
            }
            case 11: {
                class_3238 = Class_9265.Field_9278;
                n2 = Class_5341.Field_5348.Method_5356();
                break;
            }
            case 12: {
                class_3238 = Class_9265.Field_9389;
                n2 = Class_4231.Field_4243.Method_4247();
                break;
            }
            case 13: {
                class_3238 = Class_9265.Field_9389;
                n2 = Class_4231.Field_4233.Method_4247();
            }
        }
        return new Class_34660(Class_1956.Method_1981(class_3238), n2);
    }

    public void Method_8173(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Class_3238 class_3238) {
        if (!Class_283.Method_538(class_283, class_4751.Method_4782())) {
            this.\u0000strictfp(class_283, class_4751, class_3436, 6656 & 64);
            class_283.Method_472(class_4751);
        }
    }

    public int Method_8174(Class_283 class_283, Class_4751 class_4751) {
        Class_34660 class_34660 = this.Method_8178(class_283, class_4751);
        return class_34660 != null && class_34660.Method_34667() != null ? class_34660.Method_34664() : 2059 & -3772;
    }

    public Class_17531 Method_8175() {
        return Class_17531.Field_17538;
    }

    public Class_1956 Method_8176(Class_283 class_283, Class_4751 class_4751) {
        Class_34660 class_34660 = this.Method_8178(class_283, class_4751);
        return class_34660 != null && class_34660.Method_34667() != null ? class_34660.Method_34667() : Class_10527.Field_10665;
    }

    protected Class_3855 Method_8177() {
        Class_3538[] arrclass_3538 = new Class_3538[-28594 & 11395];
        arrclass_3538[72 & -23422] = Field_8152;
        arrclass_3538[13383 & 1] = Field_8153;
        return new Class_3855(this, arrclass_3538);
    }

    private Class_34660 Method_8178(Class_283 class_283, Class_4751 class_4751) {
        Class_4879 class_4879 = class_283.Method_429(class_4751);
        return class_4879 instanceof Class_34660 ? (Class_34660)class_4879 : null;
    }
}

