/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import net.minecraft.util.Vec3;

public class Class_16305
extends Class_3238 {
    public static final Class_5011 Field_16306 = Class_5011.Method_5012(Class_16305.Method_16328("\u1101\u1105\u1106\u1107\u1105\u1105"), Class_4662.Field_4663);
    public static final Class_3957 Field_16307;
    public static final Class_4173 Field_16308;

    public void Method_16309() {
        float f = 0.14705883f * 1.275f;
        this.\u0000strictfp(0.0f, 0.0952381f * 4.265625f, 0.0f, 1.0f, 0.2014509f * 2.9473684f, 1.0f);
    }

    private static String Method_16310(String string) {
        int n = 12097;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_16305.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public boolean Method_16311(Class_561 class_561, Class_4751 class_4751) {
        return ((Boolean)class_561.Method_568(class_4751).Method_3440(Field_16308) == false ? -32751 & 21547 : -32734 & 273) != 0;
    }

    public Class_10997 Method_16312(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436) {
        this.Method_16327(class_283, class_4751);
        return super.Method_3285(class_283, class_4751, class_3436);
    }

    public Class_17531 Method_16313() {
        return Class_17531.Field_17538;
    }

    public Class_10997 Method_16314(Class_283 class_283, Class_4751 class_4751) {
        this.Method_16327(class_283, class_4751);
        return super.Method_3397(class_283, class_4751);
    }

    private static String Method_16315(String string) {
        int n = 21846;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_16305.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_16316(Class_3436 class_3436) {
        if (class_3436.Method_3442() == this) {
            int n = class_3436.Method_3440(Field_16307) == Class_33177.Field_33180 ? 2209 & 13577 : 1674 & 1;
            Boolean bl = (Boolean)class_3436.Method_3440(Field_16308);
            Class_4595 class_4595 = (Class_4595)((Object)class_3436.Method_3440(Field_16306));
            float f = 0.2368421f * 0.7916667f;
            if (n != 0) {
                this.\u0000strictfp(0.0f, 0.66741073f * 1.2173913f, 0.0f, 1.0f, 1.0f, 1.0f);
            } else {
                this.\u0000strictfp(0.0f, 0.0f, 0.0f, 1.0f, 0.65822786f * 0.28485575f, 1.0f);
            }
            if (bl.booleanValue()) {
                if (class_4595 == Class_4595.Field_4598) {
                    this.\u0000strictfp(0.0f, 0.0f, 1.2727273f * 0.63839287f, 1.0f, 1.0f, 1.0f);
                }
                if (class_4595 == Class_4595.Field_4613) {
                    this.\u0000strictfp(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.28125f * 0.14634146f);
                }
                if (class_4595 == Class_4595.Field_4602) {
                    this.\u0000strictfp(1.051282f * 0.77286583f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
                }
                if (class_4595 == Class_4595.Field_4603) {
                    this.\u0000strictfp(0.0f, 0.0f, 0.0f, 0.9594595f * 0.19542253f, 1.0f, 1.0f);
                }
            }
        }
    }

    public Class_3436 Method_16317(Class_283 class_283, Class_4751 class_4751, Class_4595 class_4595, float f, float f2, float f3, int n, Class_859 class_859) {
        Class_3436 class_3436 = this.\u0000strictfp();
        if (class_4595.Method_4640().Method_4581()) {
            class_3436 = class_3436.Method_3437(Field_16306, (Comparable)((Object)class_4595)).Method_3437(Field_16308, Boolean.valueOf((1284 & -28158) != 0));
            class_3436 = class_3436.Method_3437(Field_16307, (Comparable)((Object)(f2 > 1.6818181f * 0.2972973f ? Class_33177.Field_33180 : Class_33177.Field_33179)));
        }
        return class_3436;
    }

    public boolean Method_16318() {
        return (2116 & 22025) != 0;
    }

    protected Class_3855 Method_16319() {
        Class_3538[] arrclass_3538 = new Class_3538[-12253 & 11275];
        arrclass_3538[-28447 & 6] = Field_16306;
        arrclass_3538[17921 & 2187] = Field_16308;
        arrclass_3538[2306 & -27509] = Field_16307;
        return new Class_3855(this, arrclass_3538);
    }

    public boolean Method_16320() {
        return (-32695 & 25106) != 0;
    }

    private void Method_16321() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_37110 Method_16322(Class_283 class_283, Class_4751 class_4751, Vec3 vec3, Vec3 vec32) {
        this.Method_16327(class_283, class_4751);
        return super.Method_3372(class_283, class_4751, vec3, vec32);
    }

    public void Method_16323(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Class_3238 class_3238) {
        if (!class_283.Field_306) {
            Class_4751 class_47512 = class_4751.Method_4765(((Class_4595)((Object)class_3436.Method_3440(Field_16306))).Method_4660());
            if (!Class_16305.Method_16330(class_283.Method_375(class_47512).Method_3442())) {
                class_283.Method_472(class_4751);
                this.\u0000strictfp(class_283, class_4751, class_3436, 96 & -30334);
            } else {
                boolean bl;
                boolean bl2 = class_283.Method_414(class_4751);
                if ((bl2 || class_3238.Method_3322()) && (bl = ((Boolean)class_3436.Method_3440(Field_16308)).booleanValue()) != bl2) {
                    class_283.Method_462(class_4751, class_3436.Method_3437(Field_16308, Boolean.valueOf(bl2)), 4103 & 8962);
                    class_283.Method_358(null, bl2 ? -15381 & 5099 : -13313 & 1006, class_4751, 4233 & 19472);
                }
            }
        }
    }

    protected static int Method_16324(Class_4595 class_4595) {
        switch (Class_15397.Field_15398[class_4595.ordinal()]) {
            case 1: {
                return 529 & 32;
            }
            case 2: {
                return 5151 & 257;
            }
            case 3: {
                return 274 & 514;
            }
        }
        return -30865 & 10243;
    }

    static {
        Field_16308 = Class_4173.Method_4177(Class_16305.Method_16315("\u4061\u4070\u4063\u4062"));
        Field_16307 = Class_3957.Method_3963(Class_16305.Method_16310("\u04d0\u04d1\u04d6\u04d5"), Class_33177.class);
    }

    public Class_3436 Method_16325(int n) {
        return this.\u0000strictfp().Method_3685(Field_16306, (Comparable)((Object)Class_16305.Method_16331(n))).Method_3437(Field_16308, Boolean.valueOf(((n & (550 & -24572)) != 0 ? 17155 & 1 : 1285 & 4672) != 0)).Method_3437(Field_16307, (Comparable)((Object)((n & (-15223 & 2328)) == 0 ? Class_33177.Field_33179 : Class_33177.Field_33180)));
    }

    public int Method_16326(Class_3436 class_3436) {
        int n = 16384 & 458;
        n |= Class_16305.Method_16324((Class_4595)((Object)class_3436.Method_3440(Field_16306)));
        if (((Boolean)class_3436.Method_3440(Field_16308)).booleanValue()) {
            n |= 359 & 8708;
        }
        if (class_3436.Method_3440(Field_16307) == Class_33177.Field_33180) {
            n |= 16904 & -27380;
        }
        return n;
    }

    public void Method_16327(Class_561 class_561, Class_4751 class_4751) {
        this.Method_16316(class_561.Method_568(class_4751));
    }

    private static String Method_16328(String string) {
        int n = 31279;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_16305.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public boolean Method_16329(Class_283 class_283, Class_4751 class_4751, Class_3436 class_3436, Class_626 class_626, Class_4595 class_4595, float f, float f2, float f3) {
        if (this.\u0000strictfp == Class_3713.Field_3748) {
            return (16587 & 11057) != 0;
        }
        class_3436 = class_3436.Method_3438(Field_16308);
        class_283.Method_462(class_4751, class_3436, 518 & 9274);
        class_283.Method_358(class_626, (Boolean)class_3436.Method_3440(Field_16308) != false ? 17387 & 11247 : 3054 & 10222, class_4751, 512 & 6530);
        return (16577 & 259) != 0;
    }

    private static boolean Method_16330(Class_3238 class_3238) {
        return (class_3238.Field_3240.Method_3769() && class_3238.Method_3319() || class_3238 == Class_9265.Field_9334 || class_3238 instanceof Class_5717 || class_3238 instanceof Class_11027 ? 5785 & -16029 : -26109 & 16400) != 0;
    }

    protected static Class_4595 Method_16331(int n) {
        switch (n & (-16237 & 13059)) {
            case 0: {
                return Class_4595.Field_4598;
            }
            case 1: {
                return Class_4595.Field_4613;
            }
            case 2: {
                return Class_4595.Field_4602;
            }
        }
        return Class_4595.Field_4603;
    }

    protected Class_16305(Class_3713 class_3713) {
        super(class_3713);
        this.\u0000strictfp(this.\u0000strictfp.Method_3867().Method_3437(Field_16306, (Comparable)((Object)Class_4595.Field_4598)).Method_3437(Field_16308, Boolean.valueOf((17432 & -20127) != 0)).Method_3437(Field_16307, (Comparable)((Object)Class_33177.Field_33179)));
        float f = 13.0f * 0.03846154f;
        float f2 = 1.0f;
        this.\u0000strictfp(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        this.\u0000strictfp(Class_3987.Field_3998);
    }

    public boolean Method_16332(Class_283 class_283, Class_4751 class_4751, Class_4595 class_4595) {
        return (!class_4595.Method_4640().Method_4589() && Class_16305.Method_16330(class_283.Method_375(class_4751.Method_4765(class_4595.Method_4660())).Method_3442()) ? -32187 & 7299 : -28792 & 2) != 0;
    }
}

