/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Iterator;

public class Class_28980
extends Class_3238 {
    public static final Class_3957 Field_28981 = Class_3957.Method_3963(Class_28980.Method_28987("\u8908\u8908\u890b\u8902\u8900\u8908"), Class_35930.class);
    public static final Class_4173 Field_28982 = Class_4173.Method_4177(Class_28980.Method_28985("\u6480\u6481\u6483\u6483\u6480\u6481\u6482"));

    public void Method_28983(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436) {
        if (((Boolean)class_3436.Method_3440(Field_28982)).booleanValue()) {
            class_283.Method_525(class_4751, this);
            Class_4595 class_4595 = ((Class_35930)((Object)class_3436.Method_3440(Field_28981))).Method_35954();
            class_283.Method_525(class_4751.Method_4765(class_4595.Method_4660()), this);
        }
        super.Method_3357(class_283, class_4751, class_3436);
    }

    public boolean Method_28984(Class_283 class_283, Class_4751 class_4751, Class_4595 class_4595) {
        return Class_28980.Method_28993(class_283, class_4751, class_4595.Method_4660());
    }

    private static String Method_28985(String string) {
        int n = 31598;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_28980.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_28986(Class_561 class_561, Class_4751 class_4751) {
        float f = 0.2682927f * 0.6988636f;
        switch (Class_6956.Field_6958[((Class_35930)((Object)class_561.Method_568(class_4751).Method_3440(Field_28981))).ordinal()]) {
            case 1: {
                this.\u0000strictfp(0.0f, 0.07356322f * 2.71875f, 0.7894737f * 0.6333333f - f, f * 2.0f, 0.84782606f * 0.9435898f, 0.31034482f * 1.6111112f + f);
                break;
            }
            case 2: {
                this.\u0000strictfp(1.0f - f * 2.0f, 0.03908046f * 5.117647f, 1.0f * 0.5f - f, 1.0f, 0.25747126f * 3.107143f, 3.1111112f * 0.16071428f + f);
                break;
            }
            case 3: {
                this.\u0000strictfp(0.8988764f * 0.55625f - f, 0.35064936f * 0.5703704f, 0.0f, 0.10215054f * 4.894737f + f, 0.4318182f * 1.8526316f, f * 2.0f);
                break;
            }
            case 4: {
                this.\u0000strictfp(0.5588235f * 0.8947368f - f, 0.18285714f * 1.09375f, 1.0f - f * 2.0f, 1.6666666f * 0.3f + f, 8.0f * 0.1f, 1.0f);
                break;
            }
            case 5: 
            case 6: {
                f = 0.21186441f * 1.18f;
                this.\u0000strictfp(0.6630435f * 0.75409836f - f, 0.0f, 0.475f * 1.0526316f - f, 0.2857143f * 1.75f + f, 0.55263156f * 1.0857143f, 0.35714287f * 1.4f + f);
                break;
            }
            case 7: 
            case 8: {
                f = 4.529412f * 0.055194806f;
                this.\u0000strictfp(0.6097561f * 0.82f - f, 0.536f * 0.74626863f, 0.14285715f * 3.4999998f - f, 3.3333333f * 0.15f + f, 1.0f, 3.0384614f * 0.16455697f + f);
            }
        }
    }

    private static String Method_28987(String string) {
        int n = 14084;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_28980.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_10997 Method_28988(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436) {
        return null;
    }

    public boolean Method_28989(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Class_626 class_626, Class_4595 class_4595, float f, float f2, float f3) {
        if (class_283.Field_306) {
            return (17233 & 12425) != 0;
        }
        class_3436 = class_3436.Method_3438(Field_28982);
        class_283.Method_462(class_4751, class_3436, 25219 & -30453);
        class_283.Method_475((double)class_4751.\u0000= final() + 1.7380952380952381 * 0.2876712328767123, (double)class_4751.\u0000, `() + 0.875 * 0.5714285714285714, (double)class_4751.\u0000strictfp() + 0.23369565217391305 * 2.13953488372093, "random.click", 0.26666668f * 1.125f, (Boolean)class_3436.Method_3440(Field_28982) != false ? 4.0f * 0.15f : 0.5858586f * 0.8534483f);
        class_283.Method_525(class_4751, this);
        Class_4595 class_45952 = ((Class_35930)((Object)class_3436.Method_3440(Field_28981))).Method_35954();
        class_283.Method_525(class_4751.Method_4765(class_45952.Method_4660()), this);
        return (17995 & 12309) != 0;
    }

    public int Method_28990(Class_561 class_561, Class_4751 class_4751, Class_3436 class_3436, Class_4595 class_4595) {
        return (Boolean)class_3436.Method_3440(Field_28982) == false ? 2632 & 144 : (((Class_35930)((Object)class_3436.Method_3440(Field_28981))).Method_35954() == class_4595 ? 879 & 10255 : 768 & -11178);
    }

    public Class_3436 Method_28991(Class_283 class_283, Class_4751 class_4751, Class_4595 class_4595, float f, float f2, float f3, int n, Class_859 class_859) {
        Class_3436 class_3436 = this.\u0000strictfp().Method_3685(Field_28982, Boolean.valueOf((16672 & 2055) != 0));
        if (Class_28980.Method_28993(class_283, class_4751, class_4595.Method_4660())) {
            return class_3436.Method_3437(Field_28981, (Comparable)((Object)Class_35930.Method_35956(class_4595, class_859.\u0000, `())));
        }
        Iterator iterator = Class_4662.Field_4663.Method_4672();
        while (iterator.hasNext()) {
            Object e = iterator.next();
            Class_4595 class_45952 = (Class_4595)e;
            if (class_45952 == class_4595 || !Class_28980.Method_28993(class_283, class_4751, class_45952.Method_4660())) continue;
            return class_3436.Method_3437(Field_28981, (Comparable)((Object)Class_35930.Method_35956(class_45952, class_859.\u0000, `())));
        }
        if (Class_283.Method_538(class_283, class_4751.Method_4782())) {
            return class_3436.Method_3437(Field_28981, (Comparable)((Object)Class_35930.Method_35956(Class_4595.Field_4601, class_859.\u0000, `())));
        }
        return class_3436;
    }

    public boolean Method_28992(Class_283 class_283, Class_4751 class_4751) {
        Class_4595[] arrclass_4595 = Class_4595.Method_4630();
        int n = arrclass_4595.length;
        for (int i = -27432 & 8704; i < n; ++i) {
            Class_4595 class_4595 = arrclass_4595[i];
            if (!Class_28980.Method_28993(class_283, class_4751, class_4595)) continue;
            return (5377 & 16903) != 0;
        }
        return (21526 & -32415) != 0;
    }

    protected static boolean Method_28993(Class_283 class_283, Class_4751 class_4751, Class_4595 class_4595) {
        return Class_18047.Method_18062(class_283, class_4751, class_4595);
    }

    protected Class_3855 Method_28994() {
        Class_3538[] arrclass_3538 = new Class_3538[16387 & 14382];
        arrclass_3538[1026 & -16276] = Field_28981;
        arrclass_3538[-23833 & 1297] = Field_28982;
        return new Class_3855(this, arrclass_3538);
    }

    public boolean Method_28995() {
        return (8449 & 1544) != 0;
    }

    public boolean Method_28996() {
        return (-24287 & 2628) != 0;
    }

    protected Class_28980() {
        super(Class_3713.Field_3751);
        this.\u0000strictfp(this.\u0000strictfp.Method_3867().Method_3437(Field_28981, (Comparable)((Object)Class_35930.Field_35937)).Method_3437(Field_28982, Boolean.valueOf((6194 & -16376) != 0)));
        this.\u0000strictfp(Class_3987.Field_3998);
    }

    private boolean Method_28997(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436) {
        if (this.Method_28992(class_283, class_4751)) {
            return (67 & 661) != 0;
        }
        this.\u0000strictfp(class_283, class_4751, class_3436, 41 & 17668);
        class_283.Method_472(class_4751);
        return (29320 & 2049) != 0;
    }

    public Class_3436 Method_28998(int n) {
        return this.\u0000strictfp().Method_3685(Field_28981, (Comparable)((Object)Class_35930.Method_35950(n & (5415 & -32761)))).Method_3437(Field_28982, Boolean.valueOf(((n & (22568 & -24306)) > 0 ? 65 & 1953 : -20388 & 801) != 0));
    }

    public int Method_28999(Class_3436 class_3436) {
        int n = -24504 & 145;
        n |= ((Class_35930)((Object)class_3436.Method_3440(Field_28981))).Method_35959();
        if (((Boolean)class_3436.Method_3440(Field_28982)).booleanValue()) {
            n |= 8268 & 5641;
        }
        return n;
    }

    public void Method_29000(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Class_3238 class_3238) {
        if (this.Method_28997(class_283, class_4751, class_3436) && !Class_28980.Method_28993(class_283, class_4751, ((Class_35930)((Object)class_3436.Method_3440(Field_28981))).Method_35954().Method_4660())) {
            this.\u0000strictfp(class_283, class_4751, class_3436, 1032 & -12016);
            class_283.Method_472(class_4751);
        }
    }

    public int Method_29001(Class_561 class_561, Class_4751 class_4751, Class_3436 class_3436, Class_4595 class_4595) {
        return (Boolean)class_3436.Method_3440(Field_28982) != false ? 17455 & -32497 : 1178 & 64;
    }

    public boolean Method_29002() {
        return (8193 & -27587) != 0;
    }

    public static int Method_29003(Class_4595 class_4595) {
        switch (Class_6956.Field_6957[class_4595.ordinal()]) {
            case 1: {
                return 14340 & 512;
            }
            case 2: {
                return 1047 & 20485;
            }
            case 3: {
                return 717 & 2052;
            }
            case 4: {
                return 1315 & 6667;
            }
            case 5: {
                return -6110 & 779;
            }
            case 6: {
                return -28415 & 3073;
            }
        }
        return -1 & -1;
    }

    private void Method_29004() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

