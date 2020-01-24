/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_11865
extends Class_3238 {
    public static final Class_3957 Field_11866 = Class_3957.Method_3963(Class_11865.Method_11870("\u7100\u7115\u7106\u711f\u7110\u711d\u7106"), Class_40915.class);
    public static final int Field_11867;
    public static final int Field_11868;
    public static final int Field_11869;

    private static String Method_11870(String string) {
        int n = 21334;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_11865.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    protected Class_3855 Method_11871() {
        Class_3538[] arrclass_3538 = new Class_3538[-31723 & 16393];
        arrclass_3538[16397 & 8320] = Field_11866;
        return new Class_3855(this, arrclass_3538);
    }

    public int Method_11872(Class_3436 class_3436) {
        return ((Class_40915)((Object)class_3436.Method_3440(Field_11866))).Method_40937();
    }

    private void Method_11873() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_11874(Class_1956 class_1956, Class_3987 class_3987, List list) {
        list.add(new Class_23823(class_1956, 1033 & -21759, Field_11869));
        list.add(new Class_23823(class_1956, -3037 & 1, Field_11867));
        list.add(new Class_23823(class_1956, 517 & 28937, Field_11868));
    }

    public String Method_11875() {
        return Class_7594.Method_7602(this.\u0000strictfp() + "." + Class_40915.Field_40922.Method_40927() + ".name");
    }

    public Class_3779 Method_11876(Class_3436 class_3436) {
        return class_3436.Method_3440(Field_11866) == Class_40915.Field_40922 ? Class_3779.Field_3791 : Class_3779.Field_3815;
    }

    static {
        Field_11869 = Class_40915.Field_40922.Method_40937();
        Field_11867 = Class_40915.Field_40921.Method_40937();
        Field_11868 = Class_40915.Field_40920.Method_40937();
    }

    public Class_3436 Method_11877(int n) {
        return this.\u0000strictfp().Method_3685(Field_11866, (Comparable)((Object)Class_40915.Method_40933(n)));
    }

    public Class_11865() {
        super(Class_3713.Field_3721);
        this.\u0000strictfp(this.\u0000strictfp.Method_3867().Method_3437(Field_11866, (Comparable)((Object)Class_40915.Field_40922)));
        this.\u0000strictfp(Class_3987.Field_3993);
    }

    public int Method_11878(Class_3436 class_3436) {
        return ((Class_40915)((Object)class_3436.Method_3440(Field_11866))).Method_40937();
    }
}

