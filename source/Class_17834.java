/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_17834
extends Class_3238 {
    public static final Class_3957 Field_17835 = Class_3957.Method_3963(Class_17834.Method_17843("\u952b\u952d\u952f\u9525\u9528\u9526\u952d"), Class_39537.class);
    public static final int Field_17836 = Class_39537.Field_39546.Method_39554();
    public static final int Field_17837;
    public static final int Field_17838;
    public static final int Field_17839;

    public Class_3436 Method_17840(int n) {
        return this.\u0000strictfp().Method_3685(Field_17835, (Comparable)((Object)Class_39537.Method_39557(n)));
    }

    public Class_17834() {
        super(Class_3713.Field_3721);
        this.\u0000strictfp(this.\u0000strictfp.Method_3867().Method_3437(Field_17835, (Comparable)((Object)Class_39537.Field_39546)));
        this.\u0000strictfp(Class_3987.Field_3993);
    }

    protected Class_3855 Method_17841() {
        Class_3538[] arrclass_3538 = new Class_3538[2157 & 1681];
        arrclass_3538[3140 & 392] = Field_17835;
        return new Class_3855(this, arrclass_3538);
    }

    public int Method_17842(Class_3436 class_3436) {
        return ((Class_39537)((Object)class_3436.Method_3440(Field_17835))).Method_39554();
    }

    static {
        Field_17839 = Class_39537.Field_39541.Method_39554();
        Field_17838 = Class_39537.Field_39545.Method_39554();
        Field_17837 = Class_39537.Field_39539.Method_39554();
    }

    private static String Method_17843(String string) {
        int n = 18402;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_17834.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_17844() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public int Method_17845(Class_3436 class_3436) {
        return ((Class_39537)((Object)class_3436.Method_3440(Field_17835))).Method_39554();
    }

    public void Method_17846(Class_1956 class_1956, Class_3987 class_3987, List list) {
        Class_39537[] arrclass_39537 = Class_39537.Method_39555();
        int n = arrclass_39537.length;
        for (int i = 1408 & 8257; i < n; ++i) {
            Class_39537 class_39537 = arrclass_39537[i];
            list.add(new Class_23823(class_1956, 577 & -32745, class_39537.Method_39554()));
        }
    }
}

