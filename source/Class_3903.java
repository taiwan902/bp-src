/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Random;

public class Class_3903
extends Class_3238 {
    public static final Class_3957 Field_3904 = Class_3957.Method_3963(Class_3903.Method_3909("\u4000\u4000\u4000\u4000\u4005\u4005\u4004"), Class_3915.class);

    public void Method_3905(Class_1956 class_1956, Class_3987 class_3987, List list) {
        Class_3915[] arrclass_3915 = Class_3915.Method_3930();
        int n = arrclass_3915.length;
        for (int i = 27272 & -28571; i < n; ++i) {
            Class_3915 class_3915 = arrclass_3915[i];
            list.add(new Class_23823(class_1956, 2625 & 20625, class_3915.Method_3947()));
        }
    }

    public Class_3779 Method_3906(Class_3436 class_3436) {
        return ((Class_3915)((Object)class_3436.Method_3440(Field_3904))).Method_3945();
    }

    public String Method_3907() {
        return Class_7594.Method_7602(this.\u0000strictfp() + "." + Class_3915.Field_3921.Method_3944() + ".name");
    }

    protected Class_3855 Method_3908() {
        Class_3538[] arrclass_3538 = new Class_3538[16643 & 6297];
        arrclass_3538[2308 & 2] = Field_3904;
        return new Class_3855(this, arrclass_3538);
    }

    public Class_3903() {
        super(Class_3713.Field_3721);
        this.\u0000strictfp(this.\u0000strictfp.Method_3867().Method_3437(Field_3904, (Comparable)((Object)Class_3915.Field_3921)));
        this.\u0000strictfp(Class_3987.Field_3993);
    }

    private static String Method_3909(String string) {
        int n = 21024;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_3903.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_3910() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_1956 Method_3911(Class_3436 class_3436, Random random, int n) {
        return class_3436.Method_3440(Field_3904) == Class_3915.Field_3921 ? Class_1956.Method_1981(Class_9265.Field_9373) : Class_1956.Method_1981(Class_9265.Field_9446);
    }

    public int Method_3912(Class_3436 class_3436) {
        return ((Class_3915)((Object)class_3436.Method_3440(Field_3904))).Method_3947();
    }

    public Class_3436 Method_3913(int n) {
        return this.\u0000strictfp().Method_3685(Field_3904, (Comparable)((Object)Class_3915.Method_3936(n)));
    }

    public int Method_3914(Class_3436 class_3436) {
        return ((Class_3915)((Object)class_3436.Method_3440(Field_3904))).Method_3947();
    }
}

