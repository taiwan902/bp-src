/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_24146
extends Class_3238 {
    public static final Class_3957 Field_24147 = Class_3957.Method_3963(Class_24146.Method_24150("\u504b\u505c\u504d\u5056\u505c\u5053\u504b"), Class_33895.class);

    protected Class_3855 Method_24148() {
        Class_3538[] arrclass_3538 = new Class_3538[41 & 4929];
        arrclass_3538[80 & 24582] = Field_24147;
        return new Class_3855(this, arrclass_3538);
    }

    public void Method_24149(Class_1956 class_1956, Class_3987 class_3987, List list) {
        list.add(new Class_23823(class_1956, 19 & 28845, Class_33895.Field_33899.Method_33913()));
        list.add(new Class_23823(class_1956, 3 & 2561, Class_33895.Field_33898.Method_33913()));
        list.add(new Class_23823(class_1956, 17969 & -30385, Class_33895.Field_33902.Method_33913()));
    }

    private static String Method_24150(String string) {
        int n = 25525;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_24146.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public int Method_24151(Class_3436 class_3436) {
        Class_33895 class_33895 = (Class_33895)((Object)class_3436.Method_3440(Field_24147));
        return class_33895 != Class_33895.Field_33905 && class_33895 != Class_33895.Field_33904 ? class_33895.Method_33913() : Class_33895.Field_33902.Method_33913();
    }

    public Class_3779 Method_24152(Class_3436 class_3436) {
        return Class_3779.Field_3796;
    }

    public Class_3436 Method_24153(int n) {
        return this.\u0000strictfp().Method_3685(Field_24147, (Comparable)((Object)Class_33895.Method_33926(n)));
    }

    private void Method_24154() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_24146() {
        super(Class_3713.Field_3721);
        this.\u0000strictfp(this.\u0000strictfp.Method_3867().Method_3437(Field_24147, (Comparable)((Object)Class_33895.Field_33899)));
        this.\u0000strictfp(Class_3987.Field_3993);
    }

    public int Method_24155(Class_3436 class_3436) {
        return ((Class_33895)((Object)class_3436.Method_3440(Field_24147))).Method_33913();
    }

    public Class_3436 Method_24156(Class_283 class_283, Class_4751 class_4751, Class_4595 class_4595, float f, float f2, float f3, int n, Class_859 class_859) {
        if (n == Class_33895.Field_33902.Method_33913()) {
            switch (Class_14428.Field_14429[class_4595.Method_4640().ordinal()]) {
                case 1: {
                    return this.\u0000strictfp().Method_3685(Field_24147, (Comparable)((Object)Class_33895.Field_33904));
                }
                case 2: {
                    return this.\u0000strictfp().Method_3685(Field_24147, (Comparable)((Object)Class_33895.Field_33905));
                }
            }
            return this.\u0000strictfp().Method_3685(Field_24147, (Comparable)((Object)Class_33895.Field_33902));
        }
        return n == Class_33895.Field_33898.Method_33913() ? this.\u0000strictfp().Method_3685(Field_24147, (Comparable)((Object)Class_33895.Field_33898)) : this.\u0000strictfp().Method_3685(Field_24147, (Comparable)((Object)Class_33895.Field_33899));
    }

    protected Class_23823 Method_24157(Class_3436 class_3436) {
        Class_33895 class_33895 = (Class_33895)((Object)class_3436.Method_3440(Field_24147));
        return class_33895 != Class_33895.Field_33905 && class_33895 != Class_33895.Field_33904 ? super.Method_3398(class_3436) : new Class_23823(Class_1956.Method_1981(this), -24549 & 2689, Class_33895.Field_33902.Method_33913());
    }
}

