/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_13715
extends Class_3238 {
    private final Class_3238 Field_13716;
    public static final Class_3957 Field_13717 = Class_3957.Method_3963(Class_13715.Method_13720("\uac40\uac41\uac40\uac41\uac40\uac41\uac40"), Class_47151.class);

    public Class_1956 Method_13718(Class_283 class_283, Class_4751 class_4751) {
        return Class_1956.Method_1981(this.Field_13716);
    }

    protected Class_3855 Method_13719() {
        Class_3538[] arrclass_3538 = new Class_3538[-24539 & 4627];
        arrclass_3538[1318 & 14920] = Field_13717;
        return new Class_3855(this, arrclass_3538);
    }

    private static String Method_13720(String string) {
        int n = 40;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_13715.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_13715(Class_3713 class_3713, Class_3779 class_3779, Class_3238 class_3238) {
        super(class_3713, class_3779);
        this.\u0000strictfp(this.\u0000strictfp.Method_3867().Method_3437(Field_13717, (Comparable)((Object)Class_47151.Field_47158)));
        this.Field_13716 = class_3238;
    }

    public int Method_13721(Class_3436 class_3436) {
        return ((Class_47151)((Object)class_3436.Method_3440(Field_13717))).Method_47187();
    }

    public Class_3436 Method_13722(Class_283 class_283, Class_4751 class_4751, Class_4595 class_4595, float f, float f2, float f3, int n, Class_859 class_859) {
        return this.\u0000strictfp();
    }

    private void Method_13723() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public int Method_13724(Random random) {
        return Math.max(768 & -12042, random.nextInt(16398 & 1050) - (2863 & 5127));
    }

    public Class_3779 Method_13725(Class_3436 class_3436) {
        switch (Class_14025.Field_14026[((Class_47151)((Object)class_3436.Method_3440(Field_13717))).ordinal()]) {
            case 1: {
                return Class_3779.Field_3786;
            }
            case 2: {
                return Class_3779.Field_3783;
            }
            case 3: {
                return Class_3779.Field_3783;
            }
        }
        return super.Method_3306(class_3436);
    }

    public Class_3436 Method_13726(int n) {
        return this.\u0000strictfp().Method_3685(Field_13717, (Comparable)((Object)Class_47151.Method_47189(n)));
    }

    public Class_1956 Method_13727(Class_3436 class_3436, Random random, int n) {
        return Class_1956.Method_1981(this.Field_13716);
    }
}

