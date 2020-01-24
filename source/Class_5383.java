/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_5383
extends Class_3238 {
    public static final Class_3957 Field_5384 = Class_3957.Method_3963(Class_5383.Method_5390("\u0a71\u0a70\u0a70\u0a70\u0a64"), Class_5393.class);

    protected Class_3855 Method_5385() {
        Class_3538[] arrclass_3538 = new Class_3538[4099 & 8741];
        arrclass_3538[-29532 & 576] = Field_5384;
        return new Class_3855(this, arrclass_3538);
    }

    public Class_5383(Class_3713 class_3713) {
        super(class_3713);
        this.\u0000strictfp(this.\u0000strictfp.Method_3867().Method_3437(Field_5384, (Comparable)((Object)Class_5393.Field_5398)));
        this.\u0000strictfp(Class_3987.Field_3993);
    }

    private void Method_5386() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_3779 Method_5387(Class_3436 class_3436) {
        return ((Class_5393)((Object)class_3436.Method_3440(Field_5384))).Method_5426();
    }

    public int Method_5388(Class_3436 class_3436) {
        return ((Class_5393)((Object)class_3436.Method_3440(Field_5384))).Method_5419();
    }

    public int Method_5389(Class_3436 class_3436) {
        return ((Class_5393)((Object)class_3436.Method_3440(Field_5384))).Method_5419();
    }

    private static String Method_5390(String string) {
        int n = 1861;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_5383.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_3436 Method_5391(int n) {
        return this.\u0000strictfp().Method_3685(Field_5384, (Comparable)((Object)Class_5393.Method_5446(n)));
    }

    public void Method_5392(Class_1956 class_1956, Class_3987 class_3987, List list) {
        Class_5393[] arrclass_5393 = Class_5393.Method_5464();
        int n = arrclass_5393.length;
        for (int i = 4240 & -6816; i < n; ++i) {
            Class_5393 class_5393 = arrclass_5393[i];
            list.add(new Class_23823(class_1956, 16643 & 4609, class_5393.Method_5419()));
        }
    }
}

