/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_5151
extends Class_5164 {
    public static final Class_4173 Field_5152;
    public static final Class_3957 Field_5153;

    public Class_3436 Method_5154(int n) {
        return this.\u0000strictfp().Method_3685(Field_5153, (Comparable)((Object)Class_5183.Method_5210(n & (855 & 8335)))).Method_3437(Field_5152, Boolean.valueOf(((n & (17550 & 10873)) > 0 ? -29645 & 13 : 1120 & -15869) != 0));
    }

    private static String Method_5155(String string) {
        int n = 18913;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_5151.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_5156(String string) {
        int n = 14994;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_5151.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    protected Class_5151() {
        super((401 & -24021) != 0);
        this.\u0000strictfp(this.\u0000strictfp.Method_3867().Method_3437(Field_5153, (Comparable)((Object)Class_5183.Field_5185)).Method_3437(Field_5152, Boolean.valueOf((-32616 & 16992) != 0)));
    }

    protected Class_3855 Method_5157() {
        Class_3538[] arrclass_3538 = new Class_3538[5146 & -30681];
        arrclass_3538[711 & 1280] = Field_5153;
        arrclass_3538[2705 & 24833] = Field_5152;
        return new Class_3855(this, arrclass_3538);
    }

    protected boolean Method_5158(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, boolean bl, int n) {
        if (n >= (15368 & 828)) {
            return (8970 & 16384) != 0;
        }
        int n2 = class_4751.\u0000= final();
        int n3 = class_4751.\u0000, `();
        int n4 = class_4751.\u0000strictfp();
        int n5 = -31711 & 10455;
        Class_5183 class_5183 = (Class_5183)((Object)class_3436.Method_3440(Field_5153));
        switch (Class_39957.Field_39958[class_5183.ordinal()]) {
            case 1: {
                if (bl) {
                    ++n4;
                    break;
                }
                --n4;
                break;
            }
            case 2: {
                if (bl) {
                    --n2;
                    break;
                }
                ++n2;
                break;
            }
            case 3: {
                if (bl) {
                    --n2;
                } else {
                    ++n2;
                    ++n3;
                    n5 = 67 & 1048;
                }
                class_5183 = Class_5183.Field_5195;
                break;
            }
            case 4: {
                if (bl) {
                    --n2;
                    ++n3;
                    n5 = 17414 & 968;
                } else {
                    ++n2;
                }
                class_5183 = Class_5183.Field_5195;
                break;
            }
            case 5: {
                if (bl) {
                    ++n4;
                } else {
                    --n4;
                    ++n3;
                    n5 = -28416 & 24671;
                }
                class_5183 = Class_5183.Field_5185;
                break;
            }
            case 6: {
                if (bl) {
                    ++n4;
                    ++n3;
                    n5 = -26524 & 1035;
                } else {
                    --n4;
                }
                class_5183 = Class_5183.Field_5185;
            }
        }
        return (this.Method_5161(class_283, new Class_4751(n2, n3, n4), bl, n, class_5183) ? 11377 & 1 : (n5 != 0 && this.Method_5161(class_283, new Class_4751(n2, n3 - (-32635 & 17955), n4), bl, n, class_5183) ? 4129 & -23483 : 10369 & 4136)) != 0;
    }

    public Class_3538 Method_5159() {
        return Field_5153;
    }

    private void Method_5160() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    static {
        Field_5153 = Class_3957.Method_3962(Class_5151.Method_5156("\u4424\u4427\u4424\u4425\u4426"), Class_5183.class, new Class_5226());
        Field_5152 = Class_4173.Method_4177(Class_5151.Method_5155("\u0430\u0426\u0434\u0426\u0432\u0424\u0426"));
    }

    protected boolean Method_5161(Class_283 class_283, Class_4751 class_4751, boolean bl, int n, Class_5183 class_5183) {
        Class_3436 class_3436 = class_283.Method_375(class_4751);
        if (class_3436.Method_3442() != this) {
            return (2369 & -6630) != 0;
        }
        Class_5183 class_51832 = (Class_5183)((Object)class_3436.Method_3440(Field_5153));
        return (class_5183 != Class_5183.Field_5195 || class_51832 != Class_5183.Field_5185 && class_51832 != Class_5183.Field_5196 && class_51832 != Class_5183.Field_5192 ? (class_5183 != Class_5183.Field_5185 || class_51832 != Class_5183.Field_5195 && class_51832 != Class_5183.Field_5190 && class_51832 != Class_5183.Field_5189 ? (((Boolean)class_3436.Method_3440(Field_5152)).booleanValue() ? (class_283.Method_414(class_4751) ? 8193 & 353 : (int)(this.Method_5158(class_283, class_4751, class_3436, bl, n + (17545 & -22477)) ? 1 : 0)) : 232 & 4) : 512 & 27962) : -30171 & 21528) != 0;
    }

    public int Method_5162(Class_3436 class_3436) {
        int n = 1152 & 16736;
        n |= ((Class_5183)((Object)class_3436.Method_3440(Field_5153))).Method_5215();
        if (((Boolean)class_3436.Method_3440(Field_5152)).booleanValue()) {
            n |= -32248 & 13678;
        }
        return n;
    }

    protected void Method_5163(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Class_3238 class_3238) {
        int n;
        int n2 = ((Boolean)class_3436.Method_3440(Field_5152)).booleanValue();
        int n3 = n = class_283.Method_414(class_4751) || this.Method_5158(class_283, class_4751, class_3436, (-32361 & 8201) != 0, 5155 & 2576) || this.Method_5158(class_283, class_4751, class_3436, (-23512 & 644) != 0, 832 & -26587) ? 771 & 10241 : 17936 & -32704;
        if (n != n2) {
            class_283.Method_462(class_4751, class_3436.Method_3437(Field_5152, Boolean.valueOf(n != 0)), -22521 & 299);
            class_283.Method_525(class_4751.Method_4782(), this);
            if (((Class_5183)((Object)class_3436.Method_3440(Field_5153))).Method_5219()) {
                class_283.Method_525(class_4751.Method_4769(), this);
            }
        }
    }
}

