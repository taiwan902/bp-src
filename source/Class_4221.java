/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_4221
extends Class_3238 {
    public static final Class_3957 Field_4222 = Class_3957.Method_3963(Class_4221.Method_4223("\u0541\u0541\u0543\u0543\u0544\u0544\u0547"), Class_4231.class);

    private static String Method_4223(String string) {
        int n = 30546;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_4221.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public int Method_4224(Class_3436 class_3436) {
        return ((Class_4231)((Object)class_3436.Method_3440(Field_4222))).Method_4247();
    }

    protected Class_3855 Method_4225() {
        Class_3538[] arrclass_3538 = new Class_3538[-15065 & 4113];
        arrclass_3538[-32764 & 1601] = Field_4222;
        return new Class_3855(this, arrclass_3538);
    }

    public int Method_4226(Class_3436 class_3436) {
        return ((Class_4231)((Object)class_3436.Method_3440(Field_4222))).Method_4247();
    }

    public Class_3436 Method_4227(int n) {
        return this.\u0000strictfp().Method_3685(Field_4222, (Comparable)((Object)Class_4231.Method_4259(n)));
    }

    public Class_4221() {
        super(Class_3713.Field_3723);
        this.\u0000strictfp(this.\u0000strictfp.Method_3867().Method_3437(Field_4222, (Comparable)((Object)Class_4231.Field_4238)));
        this.\u0000strictfp(Class_3987.Field_3993);
    }

    private void Method_4228() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_3779 Method_4229(Class_3436 class_3436) {
        return ((Class_4231)((Object)class_3436.Method_3440(Field_4222))).Method_4265();
    }

    public void Method_4230(Class_1956 class_1956, Class_3987 class_3987, List list) {
        Class_4231[] arrclass_4231 = Class_4231.Method_4250();
        int n = arrclass_4231.length;
        for (int i = 6274 & 17669; i < n; ++i) {
            Class_4231 class_4231 = arrclass_4231[i];
            list.add(new Class_23823(class_1956, 17 & -29137, class_4231.Method_4247()));
        }
    }
}

