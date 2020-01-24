/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_5049
extends Class_3238 {
    public static final Class_3957 Field_5050 = Class_3957.Method_3963(Class_5049.Method_5053("\u2082\u208b\u2080\u2091"), Class_5059.class);

    public Class_5049() {
        super(Class_3713.Field_3721);
        this.\u0000strictfp(this.\u0000strictfp.Method_3867().Method_3437(Field_5050, (Comparable)((Object)Class_5059.Field_5064)));
        this.\u0000strictfp(Class_3987.Field_3993);
    }

    public Class_3779 Method_5051(Class_3436 class_3436) {
        return Class_3779.Field_3783;
    }

    public Class_3436 Method_5052(int n) {
        return this.\u0000strictfp().Method_3685(Field_5050, (Comparable)((Object)Class_5059.Method_5072(n)));
    }

    private static String Method_5053(String string) {
        int n = 30413;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_5049.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_5054(Class_1956 class_1956, Class_3987 class_3987, List list) {
        Class_5059[] arrclass_5059 = Class_5059.Method_5080();
        int n = arrclass_5059.length;
        for (int i = 528 & -32509; i < n; ++i) {
            Class_5059 class_5059 = arrclass_5059[i];
            list.add(new Class_23823(class_1956, 403 & 16385, class_5059.Method_5081()));
        }
    }

    private void Method_5055() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public int Method_5056(Class_3436 class_3436) {
        return ((Class_5059)((Object)class_3436.Method_3440(Field_5050))).Method_5081();
    }

    protected Class_3855 Method_5057() {
        Class_3538[] arrclass_3538 = new Class_3538[16645 & 9777];
        arrclass_3538[16528 & -32511] = Field_5050;
        return new Class_3855(this, arrclass_3538);
    }

    public int Method_5058(Class_3436 class_3436) {
        return ((Class_5059)((Object)class_3436.Method_3440(Field_5050))).Method_5081();
    }
}

